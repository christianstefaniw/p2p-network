package com.messaging.peerNode;

import java.util.Map;

import com.messaging.peerNode.stubs.*;

import io.grpc.stub.StreamObserver;

public class PeerNodeServiceImpl extends PeerNodeServiceGrpc.PeerNodeServiceImplBase {
    Map<String, Boolean> peers;

    @Override
    public void sendMessage(MessageRequest request, StreamObserver<MessageResponse> responseObserver) {
        MessageResponse response = MessageResponse.newBuilder().setSent(true).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
