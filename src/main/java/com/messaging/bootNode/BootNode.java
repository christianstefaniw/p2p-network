package com.messaging.bootNode;

import com.messaging.node.*;
import com.messaging.peerToPeer.*;

public class BootNode extends BootNodeServiceImpl implements Node {
    final int port;

    public BootNode(int port) {
        this.port = port;
    }

    @Override
    public NodeType whichNode() {
        return NodeType.BOOT;
    }

    public void run() {
        GrpcServer server = ServerFactory.getServer(NodeType.BOOT, this.port);
        server.run();
    }

}
