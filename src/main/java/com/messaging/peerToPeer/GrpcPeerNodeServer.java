package com.messaging.peerToPeer;

import com.messaging.peerNode.BootstrappedPeerNode;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcPeerNodeServer extends GrpcServer {
    public GrpcPeerNodeServer(int port) {
        super(port);
    }

    @Override
    protected Server getServer() {
        return ServerBuilder.forPort(super.port).addService(new BootstrappedPeerNode(super.port)).build();
    }
}
