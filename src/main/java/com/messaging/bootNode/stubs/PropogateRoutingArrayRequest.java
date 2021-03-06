// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: boot_node.proto

package com.messaging.bootNode.stubs;

/**
 * Protobuf type {@code com.messaging.bootNode.stubs.PropogateRoutingArrayRequest}
 */
public  final class PropogateRoutingArrayRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.messaging.bootNode.stubs.PropogateRoutingArrayRequest)
    PropogateRoutingArrayRequestOrBuilder {
  // Use PropogateRoutingArrayRequest.newBuilder() to construct.
  private PropogateRoutingArrayRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PropogateRoutingArrayRequest() {
    routingArray_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PropogateRoutingArrayRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
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
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              routingArray_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            routingArray_.add(input.readUInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
              routingArray_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              routingArray_.add(input.readUInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        routingArray_ = java.util.Collections.unmodifiableList(routingArray_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.messaging.bootNode.stubs.BootNode.internal_static_com_messaging_bootNode_stubs_PropogateRoutingArrayRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.messaging.bootNode.stubs.BootNode.internal_static_com_messaging_bootNode_stubs_PropogateRoutingArrayRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.messaging.bootNode.stubs.PropogateRoutingArrayRequest.class, com.messaging.bootNode.stubs.PropogateRoutingArrayRequest.Builder.class);
  }

  public static final int ROUTINGARRAY_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> routingArray_;
  /**
   * <code>repeated uint32 routingArray = 1;</code>
   */
  public java.util.List<java.lang.Integer>
      getRoutingArrayList() {
    return routingArray_;
  }
  /**
   * <code>repeated uint32 routingArray = 1;</code>
   */
  public int getRoutingArrayCount() {
    return routingArray_.size();
  }
  /**
   * <code>repeated uint32 routingArray = 1;</code>
   */
  public int getRoutingArray(int index) {
    return routingArray_.get(index);
  }
  private int routingArrayMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getRoutingArrayList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(routingArrayMemoizedSerializedSize);
    }
    for (int i = 0; i < routingArray_.size(); i++) {
      output.writeUInt32NoTag(routingArray_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < routingArray_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(routingArray_.get(i));
      }
      size += dataSize;
      if (!getRoutingArrayList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      routingArrayMemoizedSerializedSize = dataSize;
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.messaging.bootNode.stubs.PropogateRoutingArrayRequest)) {
      return super.equals(obj);
    }
    com.messaging.bootNode.stubs.PropogateRoutingArrayRequest other = (com.messaging.bootNode.stubs.PropogateRoutingArrayRequest) obj;

    boolean result = true;
    result = result && getRoutingArrayList()
        .equals(other.getRoutingArrayList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getRoutingArrayCount() > 0) {
      hash = (37 * hash) + ROUTINGARRAY_FIELD_NUMBER;
      hash = (53 * hash) + getRoutingArrayList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.messaging.bootNode.stubs.PropogateRoutingArrayRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.messaging.bootNode.stubs.PropogateRoutingArrayRequest parseFrom(
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
  public static Builder newBuilder(com.messaging.bootNode.stubs.PropogateRoutingArrayRequest prototype) {
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
   * Protobuf type {@code com.messaging.bootNode.stubs.PropogateRoutingArrayRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.messaging.bootNode.stubs.PropogateRoutingArrayRequest)
      com.messaging.bootNode.stubs.PropogateRoutingArrayRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.messaging.bootNode.stubs.BootNode.internal_static_com_messaging_bootNode_stubs_PropogateRoutingArrayRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.messaging.bootNode.stubs.BootNode.internal_static_com_messaging_bootNode_stubs_PropogateRoutingArrayRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.messaging.bootNode.stubs.PropogateRoutingArrayRequest.class, com.messaging.bootNode.stubs.PropogateRoutingArrayRequest.Builder.class);
    }

    // Construct using com.messaging.bootNode.stubs.PropogateRoutingArrayRequest.newBuilder()
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
      routingArray_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.messaging.bootNode.stubs.BootNode.internal_static_com_messaging_bootNode_stubs_PropogateRoutingArrayRequest_descriptor;
    }

    public com.messaging.bootNode.stubs.PropogateRoutingArrayRequest getDefaultInstanceForType() {
      return com.messaging.bootNode.stubs.PropogateRoutingArrayRequest.getDefaultInstance();
    }

    public com.messaging.bootNode.stubs.PropogateRoutingArrayRequest build() {
      com.messaging.bootNode.stubs.PropogateRoutingArrayRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.messaging.bootNode.stubs.PropogateRoutingArrayRequest buildPartial() {
      com.messaging.bootNode.stubs.PropogateRoutingArrayRequest result = new com.messaging.bootNode.stubs.PropogateRoutingArrayRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        routingArray_ = java.util.Collections.unmodifiableList(routingArray_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.routingArray_ = routingArray_;
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
      if (other instanceof com.messaging.bootNode.stubs.PropogateRoutingArrayRequest) {
        return mergeFrom((com.messaging.bootNode.stubs.PropogateRoutingArrayRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.messaging.bootNode.stubs.PropogateRoutingArrayRequest other) {
      if (other == com.messaging.bootNode.stubs.PropogateRoutingArrayRequest.getDefaultInstance()) return this;
      if (!other.routingArray_.isEmpty()) {
        if (routingArray_.isEmpty()) {
          routingArray_ = other.routingArray_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureRoutingArrayIsMutable();
          routingArray_.addAll(other.routingArray_);
        }
        onChanged();
      }
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
      com.messaging.bootNode.stubs.PropogateRoutingArrayRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.messaging.bootNode.stubs.PropogateRoutingArrayRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> routingArray_ = java.util.Collections.emptyList();
    private void ensureRoutingArrayIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        routingArray_ = new java.util.ArrayList<java.lang.Integer>(routingArray_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint32 routingArray = 1;</code>
     */
    public java.util.List<java.lang.Integer>
        getRoutingArrayList() {
      return java.util.Collections.unmodifiableList(routingArray_);
    }
    /**
     * <code>repeated uint32 routingArray = 1;</code>
     */
    public int getRoutingArrayCount() {
      return routingArray_.size();
    }
    /**
     * <code>repeated uint32 routingArray = 1;</code>
     */
    public int getRoutingArray(int index) {
      return routingArray_.get(index);
    }
    /**
     * <code>repeated uint32 routingArray = 1;</code>
     */
    public Builder setRoutingArray(
        int index, int value) {
      ensureRoutingArrayIsMutable();
      routingArray_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 routingArray = 1;</code>
     */
    public Builder addRoutingArray(int value) {
      ensureRoutingArrayIsMutable();
      routingArray_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 routingArray = 1;</code>
     */
    public Builder addAllRoutingArray(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureRoutingArrayIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, routingArray_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 routingArray = 1;</code>
     */
    public Builder clearRoutingArray() {
      routingArray_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:com.messaging.bootNode.stubs.PropogateRoutingArrayRequest)
  }

  // @@protoc_insertion_point(class_scope:com.messaging.bootNode.stubs.PropogateRoutingArrayRequest)
  private static final com.messaging.bootNode.stubs.PropogateRoutingArrayRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.messaging.bootNode.stubs.PropogateRoutingArrayRequest();
  }

  public static com.messaging.bootNode.stubs.PropogateRoutingArrayRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PropogateRoutingArrayRequest>
      PARSER = new com.google.protobuf.AbstractParser<PropogateRoutingArrayRequest>() {
    public PropogateRoutingArrayRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PropogateRoutingArrayRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PropogateRoutingArrayRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PropogateRoutingArrayRequest> getParserForType() {
    return PARSER;
  }

  public com.messaging.bootNode.stubs.PropogateRoutingArrayRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

