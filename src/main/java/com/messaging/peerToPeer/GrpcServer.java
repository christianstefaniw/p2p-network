package com.messaging.peerToPeer;

import java.io.IOException;

import com.messaging.bootNode.BootNodeServiceImpl;

import com.messaging.peerNode.PeerNodeServiceImpl;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public abstract class GrpcServer {
    final int port;

    public GrpcServer(int port) {
        this.port = port;
    }

    public void run() {
        Server server = ServerBuilder.forPort(this.port).addService(new BootNodeServiceImpl()).addService(new PeerNodeServiceImpl())
                .build();
        try {
            server.start();
            System.out.printf("started the server succesfully on port: %s\n", this.port);
        } catch (IOException e) {
            System.out.printf("failed to start server: %s\n", e);
            return;
        }

        try {
            server.awaitTermination();
        } catch (InterruptedException e) {
            System.out.printf("server closed badly: %s\n", e);
        }
    }
}
