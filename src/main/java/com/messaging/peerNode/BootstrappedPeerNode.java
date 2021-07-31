package com.messaging.peerNode;

import java.util.ArrayList;
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
    private ArrayList<Integer> routingArray;

    public BootstrappedPeerNode(int port) {
        this.port = port;
        this.routingArray = this.getRoutingArray();
        super.connectedPeerNodes = this.dialPeerNodes(5);
    }

    private ArrayList<Integer> getRoutingArray() {
        ManagedChannel channel = BootNodeHelpers.getRandomBootNodeChannel();
        BootNodeServiceBlockingStub bootNodeStub = BootNodeHelpers.newBlockingStub(channel);
        BootstrapPeerNodeRequest request = BootstrapPeerNodeRequest.newBuilder().setPort(this.port).build();
        BootstrapPeerNodeResponse response = bootNodeStub.bootstrapPeerNode(request);
        channel.shutdown();

        return new ArrayList<Integer>(response.getRoutingArrayList());
    }

    private ArrayList<ManagedChannel> dialPeerNodes(int numOfNodes) {
        ArrayList<ManagedChannel> connectedPeerNodes = new ArrayList<ManagedChannel>();

        if (this.routingArray.size() == 0)
            return connectedPeerNodes;

        for (int i = 0; i < numOfNodes; i++) {
            int port = this.getRandomPortFromRoutingArray();
            if (!this.portIsValid(port))
                continue;
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build();
            this.registerToConnectedPeerNode(channel);
            connectedPeerNodes.add(channel);
        }

        return connectedPeerNodes;
    }

    private int getRandomPortFromRoutingArray() {
        Random rand = new Random();
        int port = routingArray.get(rand.nextInt(this.routingArray.size()));
        if (this.randomPortIsThisNodePort(port))
            return -1;
        return port;
    }

    private boolean randomPortIsThisNodePort(int port) {
        return port == this.port;
    }

    private boolean portIsValid(int port) {
        return port != -1;
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
