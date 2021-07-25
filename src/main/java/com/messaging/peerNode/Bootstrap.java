package com.messaging.peerNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import com.messaging.bootNode.BootNode;
import com.messaging.bootNode.stubs.*;
import com.messaging.bootNode.stubs.BootNodeServiceGrpc.BootNodeServiceBlockingStub;
import com.messaging.peerNode.stubs.PeerNodeServiceGrpc;
import com.messaging.peerNode.stubs.PeerNodeServiceGrpc.PeerNodeServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Bootstrap extends PeerNodeServiceImpl {
    protected void bootstrap(int port) {
        ManagedChannel channel = BootNode.getRandomBootNodeChannel();
        BootNodeServiceBlockingStub bootNode = BootNodeServiceGrpc.newBlockingStub(channel);

        BootstrapPeerNodeRequest request = BootstrapPeerNodeRequest.newBuilder().setPort(port).build();
        BootstrapPeerNodeResponse response = bootNode.bootstrapPeerNode(request);

        channel.shutdown();

        this.connectedPeerNodes = this.dialPeerNodes(new ArrayList<Integer>(response.getRoutingArrayList()), 5);
    }

    private HashMap<PeerNodeServiceBlockingStub, ManagedChannel> dialPeerNodes(ArrayList<Integer> routingArray,
            int numOfNodes) {
        HashMap<PeerNodeServiceBlockingStub, ManagedChannel> peerNodesAndChannels = new HashMap<PeerNodeServiceBlockingStub, ManagedChannel>();
        Random rand = new Random();

        for (int i = 0; i < numOfNodes; i++) {
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", routingArray.get(rand.nextInt()))
                    .usePlaintext().build();

            PeerNodeServiceBlockingStub peerNode = PeerNodeServiceGrpc.newBlockingStub(channel);

            peerNodesAndChannels.put(peerNode, channel);
        }

        return peerNodesAndChannels;
    }
}
