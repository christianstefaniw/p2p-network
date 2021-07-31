package com.messaging;

import com.messaging.messagingService.MessagingService;
import com.messaging.peerToPeer.*;

public class PeerNodeApp {
    public static void main(String[] args) {
        final int port = 8085;
        GrpcServer peerNodeServer = ServerFactory.getServer(ServerType.PEER, port);
        MessagingService messagingService = new MessagingService(port);

        peerNodeServer.start();

        while (true)
            messagingService.run();
    }
}
