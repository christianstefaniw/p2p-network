package com.messaging.peerNode;

import com.messaging.node.*;

public class PeerNode implements Node {

    @Override
    public NodeType whichNode() {
        return NodeType.PEER;
    }
    
}
