package com.messaging.peerNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.messaging.bootNode.BootNode;
import com.messaging.bootNode.stubs.*;
import com.messaging.bootNode.stubs.BootNodeServiceGrpc.BootNodeServiceBlockingStub;
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
        this.bootstrap(port);
    }

    @Override
    public NodeType whichNode() {
        return NodeType.PEER;
    }

    public boolean sendMessage(String message, int sendToPort) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", sendToPort).usePlaintext().build();

        PeerNodeServiceGrpc.PeerNodeServiceBlockingStub peerNode = PeerNodeServiceGrpc.newBlockingStub(channel);

        MessageResponse response = peerNode.sendMessage(MessageRequest.newBuilder().setMessage(message).build());
        channel.shutdown();

        return response.getSent();
    }

    public void run() {
        GrpcServer server = ServerFactory.getServer(NodeType.PEER, this.port);
        server.run();
    }
}
