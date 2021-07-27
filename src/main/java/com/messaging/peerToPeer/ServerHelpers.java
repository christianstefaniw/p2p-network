package com.messaging.peerToPeer;

import io.grpc.*;

public class ServerHelpers {
    public static ManagedChannel getManagedChannel(int port) {
        return ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build();
    }
}
