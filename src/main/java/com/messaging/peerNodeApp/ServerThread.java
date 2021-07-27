package com.messaging.peerNodeApp;

import com.messaging.node.NodeType;
import com.messaging.peerToPeer.*;

public class ServerThread extends Thread {
    final int port;

    public ServerThread(int port) {
        this.port = port;
    }

    public void run() {
        GrpcServer peerNodeServer = ServerFactory.getServer(NodeType.PEER, this.port);
        peerNodeServer.run();
    }
}
