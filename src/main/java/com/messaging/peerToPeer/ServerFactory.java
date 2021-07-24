package com.messaging.peerToPeer;

import com.messaging.node.NodeType;

public class ServerFactory {
    static public GrpcServer getServer(NodeType type, int port) {
        switch (type) {
            case BOOT:
                return new GrpcBootNodeServer(port);
            case PEER:
                return new GrpcPeerNodeServer(port);
            default:
                return null;

        }
    }
}
