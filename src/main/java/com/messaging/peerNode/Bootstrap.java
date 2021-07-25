package com.messaging.peerNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import com.messaging.bootNode.BootNode;
import com.messaging.bootNode.stubs.*;
import com.messaging.bootNode.stubs.BootNodeServiceGrpc.BootNodeServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Bootstrap extends PeerNodeServiceImpl {
    protected void bootstrap(int port) {
        ManagedChannel channel = BootNode.getRandomBootNodeChannel();
        BootNodeServiceBlockingStub bootNode = BootNode.blockingStubFromManagedChannel(channel);
        BootstrapPeerNodeRequest request = BootstrapPeerNodeRequest.newBuilder().setPort(port).build();
        BootstrapPeerNodeResponse response = bootNode.bootstrapPeerNode(request);

        channel.shutdown();

        this.connectedPeerNodes = this.dialPeerNodes(new ArrayList<Integer>(response.getRoutingArrayList()), 5);
    }

    private HashMap<Integer, ManagedChannel> dialPeerNodes(ArrayList<Integer> routingArray, int numOfNodes) {
        HashMap<Integer, ManagedChannel> connectedPeerNodes = new HashMap<Integer, ManagedChannel>();
        Random rand = new Random();

        for (int i = 0; i < numOfNodes; i++) {
            int port = routingArray.get(rand.nextInt());
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build();
            connectedPeerNodes.put(port, channel);
        }

        return connectedPeerNodes;
    }
}
