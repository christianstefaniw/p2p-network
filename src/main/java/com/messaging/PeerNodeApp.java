package com.messaging;

import com.messaging.node.*;
import com.messaging.peerToPeer.GrpcServer;
import com.messaging.peerToPeer.ServerFactory;

public class PeerNodeApp {
    public static void main(String[] args) {
        GrpcServer peerNodeServer = ServerFactory.getServer(NodeType.PEER, 8081);
        peerNodeServer.run();
    }

}
