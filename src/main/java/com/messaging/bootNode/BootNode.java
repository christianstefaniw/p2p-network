package com.messaging.bootNode;

import java.util.*;

import com.messaging.bootNode.stubs.*;
import com.messaging.node.*;

import io.grpc.stub.StreamObserver;

public class BootNode extends BootNodeServiceGrpc.BootNodeServiceImplBase implements Node {
    Map<String, Boolean> routingTable;

    @Override
    public NodeType whichNode() {
        return NodeType.BOOT;
    }

    @Override
    public void bootstrapBootNode(BootstrapBootNodeRequest request,
            StreamObserver<BootstrapBootNodeResponse> responseObserver) {
        BootstrapBootNodeResponse response = BootstrapBootNodeResponse.newBuilder()
                .putAllRoutingTable(this.routingTable).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void bootstrapPeerNode(BootstrapPeerNodeRequest request,
            StreamObserver<BootstrapPeerNodeResponse> responseObserver) {
        Map<String, Boolean> randomPeerAddresses = this.getRandomPeerAddresses(5);

        BootstrapPeerNodeResponse response = BootstrapPeerNodeResponse.newBuilder()
                .putAllRoutingTable(randomPeerAddresses).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    private Map<String, Boolean> getRandomPeerAddresses(int numValues) {
        List<String> keysAsArray = new ArrayList<String>(this.routingTable.keySet());
        Map<String, Boolean> mapWithRandValues = new HashMap<String, Boolean>();
        Random rand = new Random();

        for (int i = 0; i < numValues; i++) {
            if (i > keysAsArray.size())
                break;
            mapWithRandValues.put(keysAsArray.get(rand.nextInt(keysAsArray.size())), true);
        }
        return mapWithRandValues;
    }
}
