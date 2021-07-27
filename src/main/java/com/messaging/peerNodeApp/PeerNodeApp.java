package com.messaging.peerNodeApp;

public class PeerNodeApp {
    public static void main(String[] args) {
        final int port = 8081;

        ServerThread serverThread = new ServerThread(port);
        MessagingThread messagingThread = new MessagingThread(port);

        serverThread.run();
        messagingThread.run();
    }
}
