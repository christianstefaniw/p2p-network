package com.messaging;

import com.messaging.peerToPeer.*;

public class BootNodeApp {
    public static void main(String[] args) {
        GrpcServer bootNodeServer = ServerFactory.getServer(ServerType.BOOT, 8080);
        bootNodeServer.run();
    }
}
