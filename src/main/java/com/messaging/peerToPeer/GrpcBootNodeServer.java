package com.messaging.peerToPeer;

import com.messaging.bootNode.BootstrappedBootNode;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcBootNodeServer extends GrpcServer {
    public GrpcBootNodeServer(int port) {
        super(port);
    }

    @Override
    protected Server getServer() {
        return ServerBuilder.forPort(super.port).addService(new BootstrappedBootNode(super.port)).build();
    }
}
