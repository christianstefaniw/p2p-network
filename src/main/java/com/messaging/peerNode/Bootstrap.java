package com.messaging.peerNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import com.messaging.bootNode.BootNode;
import com.messaging.bootNode.stubs.*;
import com.messaging.bootNode.stubs.BootNodeServiceGrpc.BootNodeServiceBlockingStub;
import com.messaging.peerNode.stubs.RegisterPeerNodeRequest;
import com.messaging.peerNode.stubs.PeerNodeServiceGrpc.PeerNodeServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Bootstrap extends PeerNodeServiceImpl {
    private int port;

    protected void bootstrap(int port) {
        this.port = port;

        ManagedChannel channel = BootNode.getRandomBootNodeChannel();
        BootNodeServiceBlockingStub bootNodeStub = BootNode.newBlockingStub(channel);
        BootstrapPeerNodeRequest request = BootstrapPeerNodeRequest.newBuilder().setPort(port).build();
        BootstrapPeerNodeResponse response = bootNodeStub.bootstrapPeerNode(request);
        channel.shutdown();

        System.out.println(response.getRoutingArrayList());
        if (response.getRoutingArrayList().size() > 0)
            super.connectedPeerNodes = this.dialPeerNodes(new ArrayList<Integer>(response.getRoutingArrayList()), 5);
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

        PeerNodeServiceBlockingStub peerNodeStub = PeerNode.newBlockingStub(channel);
        peerNodeStub.registerPeerNode(request);
    }
}
