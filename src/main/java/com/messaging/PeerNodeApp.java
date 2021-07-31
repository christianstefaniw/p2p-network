package com.messaging;

import com.messaging.messagingService.MessagingService;
import com.messaging.peerToPeer.*;

public class PeerNodeApp {
    public static void main(String[] args) {
        final int port = 8082;
        GrpcServer peerNodeServer = ServerFactory.getServer(ServerType.PEER, port);
        MessagingService messagingService = new MessagingService(port);
        messagingService.start();

        peerNodeServer.run();

    }
}
