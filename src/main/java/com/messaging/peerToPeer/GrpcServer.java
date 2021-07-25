package com.messaging.peerToPeer;

import java.io.IOException;

import io.grpc.Server;

public abstract class GrpcServer {
    final int port;

    public GrpcServer(int port) {
        this.port = port;
    }

    abstract protected Server getServer();

    public void run() {
        Server server = this.getServer();

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
