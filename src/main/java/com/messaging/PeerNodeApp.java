package com.messaging;

import com.messaging.node.*;

public class PeerNodeApp {
    public static void main(String[] args) {
        Node peerNode = NodeFactory.getNode(NodeType.PEER, 8081);
        peerNode.run();
    }

}
