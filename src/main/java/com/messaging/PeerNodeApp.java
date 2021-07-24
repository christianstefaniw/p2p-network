package com.messaging;

import com.messaging.peerNode.stubs.*;

import io.grpc.*;

public class PeerNodeApp {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();

        PeerNodeServiceGrpc.PeerNodeServiceBlockingStub peerNode = PeerNodeServiceGrpc.newBlockingStub(channel);

        MessageResponse response = peerNode.sendMessage(MessageRequest.newBuilder().setMessage("mmm").build());
        System.out.println(response.toString());
        channel.shutdown();
    }
}
