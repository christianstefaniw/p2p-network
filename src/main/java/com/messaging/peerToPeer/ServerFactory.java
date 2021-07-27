package com.messaging.peerToPeer;

public class ServerFactory {
    static public GrpcServer getServer(ServerType type, int port) {
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
