package com.messaging;

import com.messaging.node.*;
import com.messaging.peerToPeer.GrpcServer;
import com.messaging.peerToPeer.ServerFactory;

public class BootNodeApp {
    public static void main(String[] args) {
        GrpcServer bootNodeServer = ServerFactory.getServer(NodeType.BOOT, 8080);
        bootNodeServer.run();
    }
}
