// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: boot_node.proto

package com.messaging.bootNode.stubs;

public final class BootNode {
  private BootNode() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_messaging_bootNode_stubs_BootstrapBootNodeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_messaging_bootNode_stubs_BootstrapBootNodeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_messaging_bootNode_stubs_BootstrapBootNodeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_messaging_bootNode_stubs_BootstrapBootNodeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_messaging_bootNode_stubs_BootstrapPeerNodeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_messaging_bootNode_stubs_BootstrapPeerNodeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_messaging_bootNode_stubs_BootstrapPeerNodeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_messaging_bootNode_stubs_BootstrapPeerNodeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_messaging_bootNode_stubs_GetRoutingArrayRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_messaging_bootNode_stubs_GetRoutingArrayRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_messaging_bootNode_stubs_GetRoutingArrayResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_messaging_bootNode_stubs_GetRoutingArrayResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017boot_node.proto\022\034com.messaging.bootNod" +
      "e.stubs\"(\n\030BootstrapBootNodeRequest\022\014\n\004p" +
      "ort\030\001 \001(\r\"1\n\031BootstrapBootNodeResponse\022\024" +
      "\n\014routingArray\030\001 \003(\r\"(\n\030BootstrapPeerNod" +
      "eRequest\022\014\n\004port\030\001 \001(\r\"1\n\031BootstrapPeerN" +
      "odeResponse\022\024\n\014routingArray\030\001 \003(\r\"\030\n\026Get" +
      "RoutingArrayRequest\"/\n\027GetRoutingArrayRe" +
      "sponse\022\024\n\014routingArray\030\001 \003(\r2\237\003\n\017BootNod" +
      "eService\022\204\001\n\021bootstrapBootNode\0226.com.mes" +
      "saging.bootNode.stubs.BootstrapBootNodeR",
      "equest\0327.com.messaging.bootNode.stubs.Bo" +
      "otstrapBootNodeResponse\022\204\001\n\021bootstrapPee" +
      "rNode\0226.com.messaging.bootNode.stubs.Boo" +
      "tstrapPeerNodeRequest\0327.com.messaging.bo" +
      "otNode.stubs.BootstrapPeerNodeResponse\022~" +
      "\n\017getRoutingArray\0224.com.messaging.bootNo" +
      "de.stubs.GetRoutingArrayRequest\0325.com.me" +
      "ssaging.bootNode.stubs.GetRoutingArrayRe" +
      "sponseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_messaging_bootNode_stubs_BootstrapBootNodeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_messaging_bootNode_stubs_BootstrapBootNodeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_messaging_bootNode_stubs_BootstrapBootNodeRequest_descriptor,
        new java.lang.String[] { "Port", });
    internal_static_com_messaging_bootNode_stubs_BootstrapBootNodeResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_messaging_bootNode_stubs_BootstrapBootNodeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_messaging_bootNode_stubs_BootstrapBootNodeResponse_descriptor,
        new java.lang.String[] { "RoutingArray", });
    internal_static_com_messaging_bootNode_stubs_BootstrapPeerNodeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_messaging_bootNode_stubs_BootstrapPeerNodeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_messaging_bootNode_stubs_BootstrapPeerNodeRequest_descriptor,
        new java.lang.String[] { "Port", });
    internal_static_com_messaging_bootNode_stubs_BootstrapPeerNodeResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_messaging_bootNode_stubs_BootstrapPeerNodeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_messaging_bootNode_stubs_BootstrapPeerNodeResponse_descriptor,
        new java.lang.String[] { "RoutingArray", });
    internal_static_com_messaging_bootNode_stubs_GetRoutingArrayRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_messaging_bootNode_stubs_GetRoutingArrayRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_messaging_bootNode_stubs_GetRoutingArrayRequest_descriptor,
        new java.lang.String[] { });
    internal_static_com_messaging_bootNode_stubs_GetRoutingArrayResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_messaging_bootNode_stubs_GetRoutingArrayResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_messaging_bootNode_stubs_GetRoutingArrayResponse_descriptor,
        new java.lang.String[] { "RoutingArray", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
