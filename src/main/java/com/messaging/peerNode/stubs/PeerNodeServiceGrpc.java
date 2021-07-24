package com.messaging.peerNode.stubs;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: peer_node.proto")
public final class PeerNodeServiceGrpc {

  private PeerNodeServiceGrpc() {}

  public static final String SERVICE_NAME = "com.messaging.peerNode.stubs.PeerNodeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.messaging.peerNode.stubs.MessageRequest,
      com.messaging.peerNode.stubs.MessageResponse> METHOD_SEND_MESSAGE =
      io.grpc.MethodDescriptor.<com.messaging.peerNode.stubs.MessageRequest, com.messaging.peerNode.stubs.MessageResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.messaging.peerNode.stubs.PeerNodeService", "sendMessage"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.messaging.peerNode.stubs.MessageRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.messaging.peerNode.stubs.MessageResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PeerNodeServiceStub newStub(io.grpc.Channel channel) {
    return new PeerNodeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PeerNodeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PeerNodeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PeerNodeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PeerNodeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PeerNodeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendMessage(com.messaging.peerNode.stubs.MessageRequest request,
        io.grpc.stub.StreamObserver<com.messaging.peerNode.stubs.MessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_MESSAGE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SEND_MESSAGE,
            asyncUnaryCall(
              new MethodHandlers<
                com.messaging.peerNode.stubs.MessageRequest,
                com.messaging.peerNode.stubs.MessageResponse>(
                  this, METHODID_SEND_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class PeerNodeServiceStub extends io.grpc.stub.AbstractStub<PeerNodeServiceStub> {
    private PeerNodeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PeerNodeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeerNodeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PeerNodeServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendMessage(com.messaging.peerNode.stubs.MessageRequest request,
        io.grpc.stub.StreamObserver<com.messaging.peerNode.stubs.MessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_MESSAGE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PeerNodeServiceBlockingStub extends io.grpc.stub.AbstractStub<PeerNodeServiceBlockingStub> {
    private PeerNodeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PeerNodeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeerNodeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PeerNodeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.messaging.peerNode.stubs.MessageResponse sendMessage(com.messaging.peerNode.stubs.MessageRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND_MESSAGE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PeerNodeServiceFutureStub extends io.grpc.stub.AbstractStub<PeerNodeServiceFutureStub> {
    private PeerNodeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PeerNodeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeerNodeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PeerNodeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.messaging.peerNode.stubs.MessageResponse> sendMessage(
        com.messaging.peerNode.stubs.MessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_MESSAGE, getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PeerNodeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PeerNodeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((com.messaging.peerNode.stubs.MessageRequest) request,
              (io.grpc.stub.StreamObserver<com.messaging.peerNode.stubs.MessageResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class PeerNodeServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.messaging.peerNode.stubs.PeerNode.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PeerNodeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PeerNodeServiceDescriptorSupplier())
              .addMethod(METHOD_SEND_MESSAGE)
              .build();
        }
      }
    }
    return result;
  }
}
