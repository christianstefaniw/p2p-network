package com.messaging.bootNode;

import java.util.*;

import com.messaging.bootNode.stubs.*;
import com.messaging.bootNode.stubs.BootNodeServiceGrpc.BootNodeServiceImplBase;

import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;

public class BootNodeServiceImpl extends BootNodeServiceImplBase {
    protected ArrayList<Integer> routingArray = new ArrayList<Integer>();
    protected HashMap<Integer, ManagedChannel> connectedBootNodes = new HashMap<Integer, ManagedChannel>();

    @Override
    public void getRoutingArray(GetRoutingArrayRequest request,
            StreamObserver<GetRoutingArrayResponse> responseObserver) {
        GetRoutingArrayResponse response = GetRoutingArrayResponse.newBuilder().addAllRoutingArray(this.routingArray)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void bootstrapBootNode(BootstrapBootNodeRequest request,
            StreamObserver<BootstrapBootNodeResponse> responseObserver) {
        BootstrapBootNodeResponse response = BootstrapBootNodeResponse.newBuilder()
                .addAllRoutingArray(this.routingArray).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void bootstrapPeerNode(BootstrapPeerNodeRequest request,
            StreamObserver<BootstrapPeerNodeResponse> responseObserver) {
        ArrayList<Integer> randomPeerPorts = this.getRandomPeerPorts(5);

        this.routingArray.add(request.getPort());

        BootstrapPeerNodeResponse response = BootstrapPeerNodeResponse.newBuilder().addAllRoutingArray(randomPeerPorts)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private ArrayList<Integer> getRandomPeerPorts(int numValues) {
        Random rand = new Random();
        ArrayList<Integer> peerAddresses = new ArrayList<Integer>();

        for (int i = 0; i < numValues; i++) {
            if (i > this.routingArray.size() - 1 || this.routingArray.size() == 0)
                break;
            peerAddresses.add(this.routingArray.get(rand.nextInt(this.routingArray.size())));
        }

        return peerAddresses;
    }
}
