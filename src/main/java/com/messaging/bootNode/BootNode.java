package com.messaging.bootNode;

import java.util.*;

import com.messaging.node.*;
import com.messaging.peerToPeer.*;
import com.messaging.bootNode.stubs.BootNodeServiceGrpc;
import com.messaging.bootNode.stubs.BootNodeServiceGrpc.BootNodeServiceBlockingStub;
import com.messaging.constants.Constants;

import io.grpc.*;

public class BootNode extends Bootstrap implements Node {
    final int port;

    public BootNode() {
        this.port = 0;
    }

    public BootNode(int port) {
        this.port = port;
        this.bootstrap();
    }

    @Override
    public NodeType whichNode() {
        return NodeType.BOOT;
    }

    public void run() {
        GrpcServer server = ServerFactory.getServer(NodeType.BOOT, this.port);
        server.run();
    }

    public static BootNodeServiceBlockingStub blockingStubFromManagedChannel(ManagedChannel channel) {
        return BootNodeServiceGrpc.newBlockingStub(channel);
    }

    public static ManagedChannel getRandomBootNodeChannel() {
        Random rand = new Random();

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost",
                        Constants.BOOT_NODE_ADDRESSES[rand.nextInt(Constants.BOOT_NODE_ADDRESSES.length)])
                .usePlaintext().build();

        return channel;
    }
}