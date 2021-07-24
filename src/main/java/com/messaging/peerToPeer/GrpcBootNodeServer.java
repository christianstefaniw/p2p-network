package com.messaging.peerToPeer;

import java.util.Map;

import com.messaging.bootNode.stubs.BootNodeServiceGrpc.BootNodeServiceBlockingStub;
import com.messaging.bootNode.stubs.BootNodeServiceGrpc;
import com.messaging.contants.Constants;

import io.grpc.*;

public class GrpcBootNodeServer extends GrpcServer {
    private final BootNodeServiceBlockingStub[] bootNodes;
    Map<String, Boolean> routingTable;

    public GrpcBootNodeServer(int port) {
        super(port);
        this.bootNodes = this.connectToBootNodes();
    }

    private BootNodeServiceBlockingStub[] connectToBootNodes() {
        BootNodeServiceBlockingStub[] bootNodes = new BootNodeServiceBlockingStub[Constants.BOOT_NODE_ADDRESSES.length];

        for (int i = 0; i < bootNodes.length; i++) {
            final int addr = Constants.BOOT_NODE_ADDRESSES[i];
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", addr).usePlaintext().build();
            BootNodeServiceBlockingStub bootNode = BootNodeServiceGrpc.newBlockingStub(channel);
            bootNodes[i] = bootNode;
        }

        return bootNodes;
    }
}
