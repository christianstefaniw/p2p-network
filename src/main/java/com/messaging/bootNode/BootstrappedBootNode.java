package com.messaging.bootNode;

import com.messaging.bootNode.stubs.BootstrapBootNodeRequest;
import com.messaging.bootNode.stubs.BootstrapBootNodeResponse;
import com.messaging.bootNode.stubs.BootNodeServiceGrpc.BootNodeServiceBlockingStub;
import com.messaging.constants.Constants;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.ArrayList;

public class BootstrappedBootNode extends BootNodeServiceImpl {
    final int port;

    public BootstrappedBootNode(int port) {
        this.port = port;
        super.connectedBootNodes = this.connectToBootNodes();
        super.routingArray = this.getRoutingArrayFromBootNode();
    }

    private ArrayList<ManagedChannel> connectToBootNodes() {
        ArrayList<ManagedChannel> connectedBootNodes = new ArrayList<ManagedChannel>();

        for (int i = 0; i < Constants.BOOT_NODE_ADDRESSES.length; i++) {
            int port = Constants.BOOT_NODE_ADDRESSES[i];
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build();
            connectedBootNodes.add(channel);
        }
        return connectedBootNodes;
    }

    private ArrayList<Integer> getRoutingArrayFromBootNode() {
        ArrayList<Integer> routingArray = new ArrayList<Integer>();
        ManagedChannel channel = BootNodeHelpers.getRandomBootNodeChannel();
        BootNodeServiceBlockingStub stub = BootNodeHelpers.newBlockingStub(channel);

        BootstrapBootNodeRequest request = BootstrapBootNodeRequest.newBuilder().setPort(this.port).build();

        try {
            BootstrapBootNodeResponse response = stub.bootstrapBootNode(request);
            routingArray = new ArrayList<Integer>(response.getRoutingArrayList());
        } catch (StatusRuntimeException e) {

        }

        System.out.println(routingArray);

        return routingArray;
    }
}
