package com.messaging;

import com.messaging.peerNode.stubs.*;

import io.grpc.*;

public class MockClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();

        PeerNodeServiceGrpc.PeerNodeServiceBlockingStub stub = PeerNodeServiceGrpc.newBlockingStub(channel);

        MessageResponse response = stub.sendMessage(MessageRequest.newBuilder().setMessage("value").build());
        System.out.println(response.toString());
        channel.shutdown();
    }
}
