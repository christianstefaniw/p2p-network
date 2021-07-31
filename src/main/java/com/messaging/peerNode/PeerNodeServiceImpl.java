package com.messaging.peerNode;

import java.util.ArrayList;

import com.messaging.peerNode.stubs.*;
import com.messaging.peerNode.stubs.PeerNodeServiceGrpc.*;
import com.messaging.peerToPeer.ServerHelpers;

import io.grpc.stub.StreamObserver;
import io.grpc.ManagedChannel;

public class PeerNodeServiceImpl extends PeerNodeServiceImplBase {
    protected ArrayList<ManagedChannel> connectedPeerNodes;

    @Override
    public void sendMessage(SendMessageRequest request, StreamObserver<SendMessageResponse> responseObserver) {

        System.out.println(request.toString());
        SendMessageResponse response = SendMessageResponse.newBuilder().build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void registerPeerNode(RegisterPeerNodeRequest request,
            StreamObserver<RegisterPeerNodeResponse> responseObserver) {
        int newPeerNodePort = request.getPort();
        ManagedChannel channel = ServerHelpers.getManagedChannel(newPeerNodePort);
        this.connectedPeerNodes.add(channel);
    }
}
