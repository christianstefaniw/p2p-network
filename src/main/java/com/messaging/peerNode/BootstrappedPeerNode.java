package com.messaging.peerNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import com.messaging.bootNode.BootNodeHelpers;
import com.messaging.bootNode.stubs.*;
import com.messaging.bootNode.stubs.BootNodeServiceGrpc.BootNodeServiceBlockingStub;
import com.messaging.peerNode.stubs.RegisterPeerNodeRequest;
import com.messaging.peerNode.stubs.PeerNodeServiceGrpc.PeerNodeServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class BootstrappedPeerNode extends PeerNodeServiceImpl {
    private final int port;

    public BootstrappedPeerNode(int port) {
        this.port = port;
        super.connectedPeerNodes = this.dialPeerNodes(this.getRoutingArray(), 5);
    }

    private ArrayList<Integer> getRoutingArray() {
        ManagedChannel channel = BootNodeHelpers.getRandomBootNodeChannel();
        BootNodeServiceBlockingStub bootNodeStub = BootNodeHelpers.newBlockingStub(channel);
        BootstrapPeerNodeRequest request = BootstrapPeerNodeRequest.newBuilder().setPort(this.port).build();
        BootstrapPeerNodeResponse response = bootNodeStub.bootstrapPeerNode(request);
        channel.shutdown();

        return new ArrayList<Integer>(response.getRoutingArrayList());
    }

    private HashMap<Integer, ManagedChannel> dialPeerNodes(ArrayList<Integer> routingArray, int numOfNodes) {
        HashMap<Integer, ManagedChannel> connectedPeerNodes = new HashMap<Integer, ManagedChannel>();
        Random rand = new Random();

        for (int i = 0; i < numOfNodes; i++) {
            int port = routingArray.get(rand.nextInt(routingArray.size()));
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build();
            this.registerToConnectedPeerNode(channel);
            connectedPeerNodes.put(port, channel);
        }

        return connectedPeerNodes;
    }

    /**
     * add the current node to a peer node's connected nodes table
     * 
     * @param channel
     */
    private void registerToConnectedPeerNode(ManagedChannel channel) {
        RegisterPeerNodeRequest request = RegisterPeerNodeRequest.newBuilder().setPort(this.port).build();

        PeerNodeServiceBlockingStub peerNodeStub = PeerNodeHelpers.newBlockingStub(channel);
        peerNodeStub.registerPeerNode(request);
    }
}
