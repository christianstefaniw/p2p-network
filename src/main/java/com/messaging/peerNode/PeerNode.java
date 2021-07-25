package com.messaging.peerNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.messaging.bootNode.BootNode;
import com.messaging.bootNode.stubs.*;
import com.messaging.bootNode.stubs.BootNodeServiceGrpc.BootNodeServiceBlockingStub;
import com.messaging.node.*;
import com.messaging.peerNode.stubs.*;
import com.messaging.peerNode.stubs.PeerNodeServiceGrpc.PeerNodeServiceBlockingStub;
import com.messaging.peerToPeer.*;

import io.grpc.*;
public class PeerNode extends PeerNodeServiceImpl implements Node {
    final int port;

    public PeerNode() {
        this.port = 0;
    }

    public PeerNode(int port) {
        this.port = port;
        this.bootstrap();
    }

    private void bootstrap() {
        ManagedChannel channel = BootNode.getRandomBootNodeChannel();
        BootNodeServiceBlockingStub bootNode = BootNodeServiceGrpc.newBlockingStub(channel);

        BootstrapPeerNodeRequest request = BootstrapPeerNodeRequest.newBuilder().setPort(port).build();
        BootstrapPeerNodeResponse response = bootNode.bootstrapPeerNode(request);

        channel.shutdown();

        this.connectedPeerNodes = this.dialPeerNodes(new ArrayList<Integer>(response.getRoutingArrayList()), 5);
    }

    private Map<PeerNodeServiceBlockingStub, ManagedChannel> dialPeerNodes(ArrayList<Integer> routingArray,
            int numOfNodes) {
        Map<PeerNodeServiceBlockingStub, ManagedChannel> peerNodesAndChannels = new HashMap<PeerNodeServiceBlockingStub, ManagedChannel>();
        Random rand = new Random();

        for (int i = 0; i < numOfNodes; i++) {
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", routingArray.get(rand.nextInt()))
                    .usePlaintext().build();

            PeerNodeServiceBlockingStub peerNode = PeerNodeServiceGrpc.newBlockingStub(channel);

            peerNodesAndChannels.put(peerNode, channel);
        }

        return peerNodesAndChannels;
    }

    @Override
    public NodeType whichNode() {
        return NodeType.PEER;
    }

    public boolean sendMessage(String message, int sendToPort) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", sendToPort).usePlaintext().build();

        PeerNodeServiceGrpc.PeerNodeServiceBlockingStub peerNode = PeerNodeServiceGrpc.newBlockingStub(channel);

        MessageResponse response = peerNode.sendMessage(MessageRequest.newBuilder().setMessage(message).build());
        channel.shutdown();

        return response.getSent();
    }

    public void run() {
        GrpcServer server = ServerFactory.getServer(NodeType.PEER, this.port);
        server.run();
    }
}
