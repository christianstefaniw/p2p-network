package com.messaging;

import com.messaging.node.*;
import com.messaging.peerNode.PeerNode;

public class PeerNodeApp {
    public static void main(String[] args) {
        Node peerNode = NodeFactory.getNode(NodeType.PEER, 8081);
        // System.out.println(((PeerNode) peerNode).sendMessage("test", 8080));
        peerNode.run();
    }

}
