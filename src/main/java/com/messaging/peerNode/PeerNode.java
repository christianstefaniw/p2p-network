package com.messaging.peerNode;

import com.messaging.node.*;
import com.messaging.peerToPeer.*;

public class PeerNode extends PeerNodeServiceImpl implements Node {
    final int port;

    public PeerNode(int port) {
        this.port = port;
    }

    @Override
    public NodeType whichNode() {
        return NodeType.PEER;
    }

    public void run() {
        GrpcServer server = ServerFactory.getServer(NodeType.PEER, this.port);
        server.run();
    }
}
