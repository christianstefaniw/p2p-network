package com.messaging;

import com.messaging.peerToPeer.GrpcServer;

public class App {
    public static void main(String[] args) {
        GrpcServer server = new GrpcServer(8080);
        server.run();
    }
}
