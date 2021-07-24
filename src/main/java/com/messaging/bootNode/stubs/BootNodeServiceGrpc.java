package com.messaging.bootNode.stubs;

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
    comments = "Source: boot_node.proto")
public final class BootNodeServiceGrpc {

  private BootNodeServiceGrpc() {}

  public static final String SERVICE_NAME = "com.messaging.bootNode.stubs.BootNodeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.messaging.bootNode.stubs.BootstrapBootNodeRequest,
      com.messaging.bootNode.stubs.BootstrapBootNodeResponse> METHOD_BOOTSTRAP_BOOT_NODE =
      io.grpc.MethodDescriptor.<com.messaging.bootNode.stubs.BootstrapBootNodeRequest, com.messaging.bootNode.stubs.BootstrapBootNodeResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.messaging.bootNode.stubs.BootNodeService", "bootstrapBootNode"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.messaging.bootNode.stubs.BootstrapBootNodeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.messaging.bootNode.stubs.BootstrapBootNodeResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.messaging.bootNode.stubs.BootstrapPeerNodeRequest,
      com.messaging.bootNode.stubs.BootstrapPeerNodeResponse> METHOD_BOOTSTRAP_PEER_NODE =
      io.grpc.MethodDescriptor.<com.messaging.bootNode.stubs.BootstrapPeerNodeRequest, com.messaging.bootNode.stubs.BootstrapPeerNodeResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.messaging.bootNode.stubs.BootNodeService", "bootstrapPeerNode"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.messaging.bootNode.stubs.BootstrapPeerNodeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.messaging.bootNode.stubs.BootstrapPeerNodeResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BootNodeServiceStub newStub(io.grpc.Channel channel) {
    return new BootNodeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BootNodeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BootNodeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BootNodeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BootNodeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BootNodeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void bootstrapBootNode(com.messaging.bootNode.stubs.BootstrapBootNodeRequest request,
        io.grpc.stub.StreamObserver<com.messaging.bootNode.stubs.BootstrapBootNodeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BOOTSTRAP_BOOT_NODE, responseObserver);
    }

    /**
     */
    public void bootstrapPeerNode(com.messaging.bootNode.stubs.BootstrapPeerNodeRequest request,
        io.grpc.stub.StreamObserver<com.messaging.bootNode.stubs.BootstrapPeerNodeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BOOTSTRAP_PEER_NODE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_BOOTSTRAP_BOOT_NODE,
            asyncUnaryCall(
              new MethodHandlers<
                com.messaging.bootNode.stubs.BootstrapBootNodeRequest,
                com.messaging.bootNode.stubs.BootstrapBootNodeResponse>(
                  this, METHODID_BOOTSTRAP_BOOT_NODE)))
          .addMethod(
            METHOD_BOOTSTRAP_PEER_NODE,
            asyncUnaryCall(
              new MethodHandlers<
                com.messaging.bootNode.stubs.BootstrapPeerNodeRequest,
                com.messaging.bootNode.stubs.BootstrapPeerNodeResponse>(
                  this, METHODID_BOOTSTRAP_PEER_NODE)))
          .build();
    }
  }

  /**
   */
  public static final class BootNodeServiceStub extends io.grpc.stub.AbstractStub<BootNodeServiceStub> {
    private BootNodeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BootNodeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BootNodeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BootNodeServiceStub(channel, callOptions);
    }

    /**
     */
    public void bootstrapBootNode(com.messaging.bootNode.stubs.BootstrapBootNodeRequest request,
        io.grpc.stub.StreamObserver<com.messaging.bootNode.stubs.BootstrapBootNodeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BOOTSTRAP_BOOT_NODE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bootstrapPeerNode(com.messaging.bootNode.stubs.BootstrapPeerNodeRequest request,
        io.grpc.stub.StreamObserver<com.messaging.bootNode.stubs.BootstrapPeerNodeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BOOTSTRAP_PEER_NODE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BootNodeServiceBlockingStub extends io.grpc.stub.AbstractStub<BootNodeServiceBlockingStub> {
    private BootNodeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BootNodeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BootNodeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BootNodeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.messaging.bootNode.stubs.BootstrapBootNodeResponse bootstrapBootNode(com.messaging.bootNode.stubs.BootstrapBootNodeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BOOTSTRAP_BOOT_NODE, getCallOptions(), request);
    }

    /**
     */
    public com.messaging.bootNode.stubs.BootstrapPeerNodeResponse bootstrapPeerNode(com.messaging.bootNode.stubs.BootstrapPeerNodeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BOOTSTRAP_PEER_NODE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BootNodeServiceFutureStub extends io.grpc.stub.AbstractStub<BootNodeServiceFutureStub> {
    private BootNodeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BootNodeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BootNodeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BootNodeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.messaging.bootNode.stubs.BootstrapBootNodeResponse> bootstrapBootNode(
        com.messaging.bootNode.stubs.BootstrapBootNodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BOOTSTRAP_BOOT_NODE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.messaging.bootNode.stubs.BootstrapPeerNodeResponse> bootstrapPeerNode(
        com.messaging.bootNode.stubs.BootstrapPeerNodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BOOTSTRAP_PEER_NODE, getCallOptions()), request);
    }
  }

  private static final int METHODID_BOOTSTRAP_BOOT_NODE = 0;
  private static final int METHODID_BOOTSTRAP_PEER_NODE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BootNodeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BootNodeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BOOTSTRAP_BOOT_NODE:
          serviceImpl.bootstrapBootNode((com.messaging.bootNode.stubs.BootstrapBootNodeRequest) request,
              (io.grpc.stub.StreamObserver<com.messaging.bootNode.stubs.BootstrapBootNodeResponse>) responseObserver);
          break;
        case METHODID_BOOTSTRAP_PEER_NODE:
          serviceImpl.bootstrapPeerNode((com.messaging.bootNode.stubs.BootstrapPeerNodeRequest) request,
              (io.grpc.stub.StreamObserver<com.messaging.bootNode.stubs.BootstrapPeerNodeResponse>) responseObserver);
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

  private static final class BootNodeServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.messaging.bootNode.stubs.BootNode.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BootNodeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BootNodeServiceDescriptorSupplier())
              .addMethod(METHOD_BOOTSTRAP_BOOT_NODE)
              .addMethod(METHOD_BOOTSTRAP_PEER_NODE)
              .build();
        }
      }
    }
    return result;
  }
}
