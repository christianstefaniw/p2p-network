package com.messaging.peerNode;

import com.messaging.node.*;
import com.messaging.peerNode.stubs.*;
import com.messaging.peerNode.stubs.PeerNodeServiceGrpc.PeerNodeServiceBlockingStub;
import com.messaging.peerToPeer.*;

import io.grpc.*;

public class PeerNode extends Bootstrap implements Node {
    final int port;

    public PeerNode() {
        this.port = 0;
    }

    public PeerNode(int port) {
        this.port = port;
        super.bootstrap(port);
    }

    @Override
    public NodeType whichNode() {
        return NodeType.PEER;
    }

    public boolean sendMessage(String message, int sendToPort) {
        ManagedChannel channel = Helpers.getManagedChannel(sendToPort);

        PeerNodeServiceBlockingStub peerNodeStub = PeerNode.newBlockingStub(channel);

        MessageResponse response = peerNodeStub.sendMessage(MessageRequest.newBuilder().setMessage(message).build());
        channel.shutdown();

        return response.getSent();
    }

    public void run() {
        GrpcServer server = ServerFactory.getServer(NodeType.PEER, this.port);
        server.run();
    }

    public static PeerNodeServiceBlockingStub newBlockingStub(ManagedChannel channel) {
        return PeerNodeServiceGrpc.newBlockingStub(channel);
    }
}
