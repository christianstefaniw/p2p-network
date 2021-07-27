package com.messaging.peerNodeApp;

import java.util.Scanner;

import com.messaging.peerNode.PeerNodeHelpers;
import com.messaging.peerNode.stubs.MessageRequest;
import com.messaging.peerNode.stubs.PeerNodeServiceGrpc.PeerNodeServiceBlockingStub;
import com.messaging.peerToPeer.ServerHelpers;

import io.grpc.ManagedChannel;

public class MessagingThread extends Thread {
    final int serverPort;

    public MessagingThread(int serverPort) {
        this.serverPort = serverPort;
    }

    public void run() {
        String message;
        int sendPort;

        Scanner messageScanner = new Scanner(System.in);
        Scanner sendPortScanner = new Scanner(System.in);

        System.out.println("Enter your message: ");
        message = messageScanner.nextLine();
        sendPort = sendPortScanner.nextInt();

        messageScanner.close();
        sendPortScanner.close();

        this.sendMessage(message, sendPort);
    }

    private void sendMessage(String message, int sendPort) {
        ManagedChannel channel = ServerHelpers.getManagedChannel(this.serverPort);

        PeerNodeServiceBlockingStub stub = PeerNodeHelpers.newBlockingStub(channel);

        MessageRequest request = MessageRequest.newBuilder().setMessage(message).setTargetPort(sendPort).build();

        stub.sendMessage(request);

    }
}