// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: boot_node.proto

package com.messaging.bootNode.stubs;

/**
 * Protobuf type {@code com.messaging.bootNode.stubs.PropogateRoutingArrayResponse}
 */
public  final class PropogateRoutingArrayResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.messaging.bootNode.stubs.PropogateRoutingArrayResponse)
    PropogateRoutingArrayResponseOrBuilder {
  // Use PropogateRoutingArrayResponse.newBuilder() to construct.
  private PropogateRoutingArrayResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PropogateRoutingArrayResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PropogateRoutingArrayResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.messaging.bootNode.stubs.BootNode.internal_static_com_messaging_bootNode_stubs_PropogateRoutingArrayResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.messaging.bootNode.stubs.BootNode.internal_static_com_messaging_bootNode_stubs_PropogateRoutingArrayResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.messaging.bootNode.stubs.PropogateRoutingArrayResponse.class, com.messaging.bootNode.stubs.PropogateRoutingArrayResponse.Builder.class);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.messaging.bootNode.stubs.PropogateRoutingArrayResponse)) {
      return super.equals(obj);
    }
    com.messaging.bootNode.stubs.PropogateRoutingArrayResponse other = (com.messaging.bootNode.stubs.PropogateRoutingArrayResponse) obj;

    boolean result = true;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.messaging.bootNode.stubs.PropogateRoutingArrayResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.messaging.bootNode.stubs.PropogateRoutingArrayResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.messaging.bootNode.stubs.PropogateRoutingArrayResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.messaging.bootNode.stubs.PropogateRoutingArrayResponse)
      com.messaging.bootNode.stubs.PropogateRoutingArrayResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.messaging.bootNode.stubs.BootNode.internal_static_com_messaging_bootNode_stubs_PropogateRoutingArrayResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.messaging.bootNode.stubs.BootNode.internal_static_com_messaging_bootNode_stubs_PropogateRoutingArrayResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.messaging.bootNode.stubs.PropogateRoutingArrayResponse.class, com.messaging.bootNode.stubs.PropogateRoutingArrayResponse.Builder.class);
    }

    // Construct using com.messaging.bootNode.stubs.PropogateRoutingArrayResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.messaging.bootNode.stubs.BootNode.internal_static_com_messaging_bootNode_stubs_PropogateRoutingArrayResponse_descriptor;
    }

    public com.messaging.bootNode.stubs.PropogateRoutingArrayResponse getDefaultInstanceForType() {
      return com.messaging.bootNode.stubs.PropogateRoutingArrayResponse.getDefaultInstance();
    }

    public com.messaging.bootNode.stubs.PropogateRoutingArrayResponse build() {
      com.messaging.bootNode.stubs.PropogateRoutingArrayResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.messaging.bootNode.stubs.PropogateRoutingArrayResponse buildPartial() {
      com.messaging.bootNode.stubs.PropogateRoutingArrayResponse result = new com.messaging.bootNode.stubs.PropogateRoutingArrayResponse(this);
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.messaging.bootNode.stubs.PropogateRoutingArrayResponse) {
        return mergeFrom((com.messaging.bootNode.stubs.PropogateRoutingArrayResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.messaging.bootNode.stubs.PropogateRoutingArrayResponse other) {
      if (other == com.messaging.bootNode.stubs.PropogateRoutingArrayResponse.getDefaultInstance()) return this;
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.messaging.bootNode.stubs.PropogateRoutingArrayResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.messaging.bootNode.stubs.PropogateRoutingArrayResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.messaging.bootNode.stubs.PropogateRoutingArrayResponse)
  }

  // @@protoc_insertion_point(class_scope:com.messaging.bootNode.stubs.PropogateRoutingArrayResponse)
  private static final com.messaging.bootNode.stubs.PropogateRoutingArrayResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.messaging.bootNode.stubs.PropogateRoutingArrayResponse();
  }

  public static com.messaging.bootNode.stubs.PropogateRoutingArrayResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PropogateRoutingArrayResponse>
      PARSER = new com.google.protobuf.AbstractParser<PropogateRoutingArrayResponse>() {
    public PropogateRoutingArrayResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PropogateRoutingArrayResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PropogateRoutingArrayResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PropogateRoutingArrayResponse> getParserForType() {
    return PARSER;
  }

  public com.messaging.bootNode.stubs.PropogateRoutingArrayResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

