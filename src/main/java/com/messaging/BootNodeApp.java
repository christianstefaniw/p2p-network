package com.messaging;

import com.messaging.bootNode.BootNode;

public class BootNodeApp {
    public static void main(String[] args) {
        BootNode bootNode = new BootNode(8085);
        bootNode.run();
    }
}
