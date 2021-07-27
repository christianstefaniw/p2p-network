package com.messaging.bootNode;

import com.messaging.bootNode.stubs.BootstrapBootNodeRequest;
import com.messaging.bootNode.stubs.BootstrapBootNodeResponse;
import com.messaging.bootNode.stubs.BootNodeServiceGrpc.BootNodeServiceBlockingStub;
import com.messaging.constants.Constants;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.ArrayList;
import java.util.HashMap;

public class BootstrappedBootNode extends BootNodeServiceImpl {
    final int port;

    public BootstrappedBootNode(int port) {
        this.port = port;
        super.connectedBootNodes = this.connectToBootNodes();
        super.routingArray = this.getRoutingArrayFromBootNode();
    }

    private HashMap<Integer, ManagedChannel> connectToBootNodes() {
        HashMap<Integer, ManagedChannel> connectedBootNodes = new HashMap<Integer, ManagedChannel>();

        for (int i = 0; i < Constants.BOOT_NODE_ADDRESSES.length; i++) {
            int port = Constants.BOOT_NODE_ADDRESSES[i];
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build();
            connectedBootNodes.put(port, channel);
        }
        return connectedBootNodes;
    }

    private ArrayList<Integer> getRoutingArrayFromBootNode() {
        ManagedChannel channel = BootNodeHelpers.getRandomBootNodeChannel();
        BootNodeServiceBlockingStub stub = BootNodeHelpers.newBlockingStub(channel);

        BootstrapBootNodeRequest request = BootstrapBootNodeRequest.newBuilder().setPort(this.port).build();
        BootstrapBootNodeResponse response = stub.bootstrapBootNode(request);

        return new ArrayList<Integer>(response.getRoutingArrayList());
    }
}
