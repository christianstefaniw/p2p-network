package com.messaging.peerNode;

import java.util.Map;

import com.messaging.node.*;
import com.messaging.peerNode.stubs.*;

import io.grpc.stub.StreamObserver;

public class PeerNode extends PeerNodeServiceGrpc.PeerNodeServiceImplBase implements Node {
    Map<String, Boolean> peers;

    @Override
    public NodeType whichNode() {
        return NodeType.PEER;
    }

    @Override
    public void sendMessage(MessageRequest request, StreamObserver<MessageResponse> responseObserver) {
        MessageResponse response = MessageResponse.newBuilder().setSent(true).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
