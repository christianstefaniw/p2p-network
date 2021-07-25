package com.messaging.peerToPeer;

import com.messaging.peerNode.PeerNode;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcPeerNodeServer extends GrpcServer {
    public GrpcPeerNodeServer(int port) {
        super(port);
    }

    @Override
    protected Server getServer() {
        return ServerBuilder.forPort(this.port).addService(new PeerNode(this.port)).build();
    }
}
