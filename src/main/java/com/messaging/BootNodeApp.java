package com.messaging;

import com.messaging.node.*;

public class BootNodeApp {
    public static void main(String[] args) {
        Node bootNode = NodeFactory.getNode(NodeType.BOOT, 8080);
        bootNode.run();
    }
}
