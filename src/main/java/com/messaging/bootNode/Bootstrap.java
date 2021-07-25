package com.messaging.bootNode;

import com.messaging.bootNode.stubs.BootNodeServiceGrpc.BootNodeServiceBlockingStub;
import com.messaging.constants.Constants;
import com.messaging.bootNode.stubs.*;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.HashMap;
import java.util.Random;

public class Bootstrap extends BootNodeServiceImpl {
    protected void bootstrap() {
        HashMap<BootNodeServiceBlockingStub, ManagedChannel> bootNodes = this.connectToBootNodes();
        this.connectedBootNodes = bootNodes;
    }

    private HashMap<BootNodeServiceBlockingStub, ManagedChannel> connectToBootNodes() {
        Random rand = new Random();

        HashMap<BootNodeServiceBlockingStub, ManagedChannel> bootNodes = new HashMap<BootNodeServiceBlockingStub, ManagedChannel>();

        for (int i = 0; i < Constants.BOOT_NODE_ADDRESSES.length; i++) {
            int addr = Constants.BOOT_NODE_ADDRESSES[rand.nextInt(Constants.BOOT_NODE_ADDRESSES.length)];
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", addr).usePlaintext().build();
            BootNodeServiceBlockingStub bootNode = BootNodeServiceGrpc.newBlockingStub(channel);
            bootNodes.put(bootNode, channel);
        }

        return bootNodes;
    }
}
