package com.messaging.node;

import com.messaging.bootNode.BootNode;
import com.messaging.peerNode.PeerNode;

public class NodeFactory {
    static public Node getNode(NodeType type, int port) {
        switch (type) {
            case BOOT:
                return new BootNode(port);
            case PEER:
                return new PeerNode(port);
            default:
                return null;

        }
    }
}
