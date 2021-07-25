package com.messaging.peerNode;

import com.messaging.peerNode.stubs.*;
import com.messaging.peerNode.stubs.PeerNodeServiceGrpc.PeerNodeServiceBlockingStub;

import io.grpc.*;

public class PeerNodeHelpers {
    public static PeerNodeServiceBlockingStub newBlockingStub(ManagedChannel channel) {
        return PeerNodeServiceGrpc.newBlockingStub(channel);
    }
}
