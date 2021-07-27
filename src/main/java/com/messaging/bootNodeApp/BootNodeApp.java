package com.messaging.bootNodeApp;

import com.messaging.node.*;
import com.messaging.peerToPeer.*;

public class BootNodeApp {
    public static void main(String[] args) {
        GrpcServer bootNodeServer = ServerFactory.getServer(NodeType.BOOT, 8080);
        bootNodeServer.run();
    }
}
