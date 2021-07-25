package com.messaging.bootNode;

import com.messaging.constants.Constants;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.HashMap;
import java.util.Random;

public class Bootstrap extends BootNodeServiceImpl {
    protected void bootstrap() {
        HashMap<Integer, ManagedChannel> bootNodes = this.connectToBootNodes();
        this.connectedBootNodes = bootNodes;
    }

    private HashMap<Integer, ManagedChannel> connectToBootNodes() {
        Random rand = new Random();

        HashMap<Integer, ManagedChannel> connectedBootNodes = new HashMap<Integer, ManagedChannel>();

        for (int i = 0; i < Constants.BOOT_NODE_ADDRESSES.length; i++) {
            int port = Constants.BOOT_NODE_ADDRESSES[rand.nextInt(Constants.BOOT_NODE_ADDRESSES.length)];
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build();
            connectedBootNodes.put(port, channel);
        }

        return connectedBootNodes;
    }
}
