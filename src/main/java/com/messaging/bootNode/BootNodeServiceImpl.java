package com.messaging.bootNode;

import java.util.*;

import com.messaging.bootNode.stubs.*;
import com.messaging.bootNode.stubs.BootNodeServiceGrpc.BootNodeServiceBlockingStub;
import com.messaging.bootNode.stubs.BootNodeServiceGrpc.BootNodeServiceImplBase;

import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;

public class BootNodeServiceImpl extends BootNodeServiceImplBase {
    protected ArrayList<Integer> routingArray = new ArrayList<Integer>();
    protected ArrayList<ManagedChannel> connectedBootNodes = new ArrayList<ManagedChannel>();

    @Override
    public void getRoutingArray(GetRoutingArrayRequest request,
            StreamObserver<GetRoutingArrayResponse> responseObserver) {
        GetRoutingArrayResponse response = GetRoutingArrayResponse.newBuilder().addAllRoutingArray(this.routingArray)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void propogateRoutingArray(PropogateRoutingArrayRequest request,
            StreamObserver<PropogateRoutingArrayResponse> responseObserver) {

        PropogateRoutingArrayResponse response = PropogateRoutingArrayResponse.newBuilder().build();

        this.routingArray = new ArrayList<Integer>(request.getRoutingArrayList());

        System.out.println(routingArray);

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

        if (!this.isInRoutingArray(request.getPort()))
            this.routingArray.add(request.getPort());

        System.out.println(this.routingArray);

        this.propogateNewRoutingArray();

        BootstrapPeerNodeResponse response = BootstrapPeerNodeResponse.newBuilder().addAllRoutingArray(randomPeerPorts)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private void propogateNewRoutingArray() {
        for (ManagedChannel bootNodeChannel : this.connectedBootNodes) {
            BootNodeServiceBlockingStub stub = BootNodeHelpers.newBlockingStub(bootNodeChannel);
            PropogateRoutingArrayRequest request = PropogateRoutingArrayRequest.newBuilder()
                    .addAllRoutingArray(this.routingArray).build();
            stub.propogateRoutingArray(request);
        }
    }

    private boolean isInRoutingArray(int port) {
        return this.routingArray.contains(port);
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
