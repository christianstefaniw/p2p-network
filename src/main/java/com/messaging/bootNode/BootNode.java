package com.messaging.bootNode;

import com.messaging.node.*;

public class BootNode implements Node {

    @Override
    public NodeType whichNode() {
        return NodeType.BOOT;
    }
    
}
