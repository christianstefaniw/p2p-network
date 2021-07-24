// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: boot_node.proto

package com.messaging.bootNode.stubs;

/**
 * Protobuf type {@code com.messaging.bootNode.stubs.BootstrapPeerNodeResponse}
 */
public  final class BootstrapPeerNodeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.messaging.bootNode.stubs.BootstrapPeerNodeResponse)
    BootstrapPeerNodeResponseOrBuilder {
  // Use BootstrapPeerNodeResponse.newBuilder() to construct.
  private BootstrapPeerNodeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BootstrapPeerNodeResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private BootstrapPeerNodeResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              routingTable_ = com.google.protobuf.MapField.newMapField(
                  RoutingTableDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.Boolean>
            routingTable__ = input.readMessage(
                RoutingTableDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            routingTable_.getMutableMap().put(
                routingTable__.getKey(), routingTable__.getValue());
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
    return com.messaging.bootNode.stubs.BootNode.internal_static_com_messaging_bootNode_stubs_BootstrapPeerNodeResponse_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetRoutingTable();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.messaging.bootNode.stubs.BootNode.internal_static_com_messaging_bootNode_stubs_BootstrapPeerNodeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.messaging.bootNode.stubs.BootstrapPeerNodeResponse.class, com.messaging.bootNode.stubs.BootstrapPeerNodeResponse.Builder.class);
  }

  public static final int ROUTINGTABLE_FIELD_NUMBER = 1;
  private static final class RoutingTableDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Boolean> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Boolean>newDefaultInstance(
                com.messaging.bootNode.stubs.BootNode.internal_static_com_messaging_bootNode_stubs_BootstrapPeerNodeResponse_RoutingTableEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.BOOL,
                false);
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.Boolean> routingTable_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.Boolean>
  internalGetRoutingTable() {
    if (routingTable_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          RoutingTableDefaultEntryHolder.defaultEntry);
    }
    return routingTable_;
  }

  public int getRoutingTableCount() {
    return internalGetRoutingTable().getMap().size();
  }
  /**
   * <code>map&lt;string, bool&gt; routingTable = 1;</code>
   */

  public boolean containsRoutingTable(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetRoutingTable().getMap().containsKey(key);
  }
  /**
   * Use {@link #getRoutingTableMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Boolean> getRoutingTable() {
    return getRoutingTableMap();
  }
  /**
   * <code>map&lt;string, bool&gt; routingTable = 1;</code>
   */

  public java.util.Map<java.lang.String, java.lang.Boolean> getRoutingTableMap() {
    return internalGetRoutingTable().getMap();
  }
  /**
   * <code>map&lt;string, bool&gt; routingTable = 1;</code>
   */

  public boolean getRoutingTableOrDefault(
      java.lang.String key,
      boolean defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.Boolean> map =
        internalGetRoutingTable().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, bool&gt; routingTable = 1;</code>
   */

  public boolean getRoutingTableOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.Boolean> map =
        internalGetRoutingTable().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetRoutingTable(),
        RoutingTableDefaultEntryHolder.defaultEntry,
        1);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.Boolean> entry
         : internalGetRoutingTable().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Boolean>
      routingTable__ = RoutingTableDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, routingTable__);
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
    if (!(obj instanceof com.messaging.bootNode.stubs.BootstrapPeerNodeResponse)) {
      return super.equals(obj);
    }
    com.messaging.bootNode.stubs.BootstrapPeerNodeResponse other = (com.messaging.bootNode.stubs.BootstrapPeerNodeResponse) obj;

    boolean result = true;
    result = result && internalGetRoutingTable().equals(
        other.internalGetRoutingTable());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetRoutingTable().getMap().isEmpty()) {
      hash = (37 * hash) + ROUTINGTABLE_FIELD_NUMBER;
      hash = (53 * hash) + internalGetRoutingTable().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.messaging.bootNode.stubs.BootstrapPeerNodeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.messaging.bootNode.stubs.BootstrapPeerNodeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.messaging.bootNode.stubs.BootstrapPeerNodeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.messaging.bootNode.stubs.BootstrapPeerNodeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.messaging.bootNode.stubs.BootstrapPeerNodeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.messaging.bootNode.stubs.BootstrapPeerNodeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.messaging.bootNode.stubs.BootstrapPeerNodeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.messaging.bootNode.stubs.BootstrapPeerNodeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.messaging.bootNode.stubs.BootstrapPeerNodeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.messaging.bootNode.stubs.BootstrapPeerNodeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.messaging.bootNode.stubs.BootstrapPeerNodeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.messaging.bootNode.stubs.BootstrapPeerNodeResponse parseFrom(
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
  public static Builder newBuilder(com.messaging.bootNode.stubs.BootstrapPeerNodeResponse prototype) {
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
   * Protobuf type {@code com.messaging.bootNode.stubs.BootstrapPeerNodeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.messaging.bootNode.stubs.BootstrapPeerNodeResponse)
      com.messaging.bootNode.stubs.BootstrapPeerNodeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.messaging.bootNode.stubs.BootNode.internal_static_com_messaging_bootNode_stubs_BootstrapPeerNodeResponse_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetRoutingTable();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableRoutingTable();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.messaging.bootNode.stubs.BootNode.internal_static_com_messaging_bootNode_stubs_BootstrapPeerNodeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.messaging.bootNode.stubs.BootstrapPeerNodeResponse.class, com.messaging.bootNode.stubs.BootstrapPeerNodeResponse.Builder.class);
    }

    // Construct using com.messaging.bootNode.stubs.BootstrapPeerNodeResponse.newBuilder()
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
      internalGetMutableRoutingTable().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.messaging.bootNode.stubs.BootNode.internal_static_com_messaging_bootNode_stubs_BootstrapPeerNodeResponse_descriptor;
    }

    public com.messaging.bootNode.stubs.BootstrapPeerNodeResponse getDefaultInstanceForType() {
      return com.messaging.bootNode.stubs.BootstrapPeerNodeResponse.getDefaultInstance();
    }

    public com.messaging.bootNode.stubs.BootstrapPeerNodeResponse build() {
      com.messaging.bootNode.stubs.BootstrapPeerNodeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.messaging.bootNode.stubs.BootstrapPeerNodeResponse buildPartial() {
      com.messaging.bootNode.stubs.BootstrapPeerNodeResponse result = new com.messaging.bootNode.stubs.BootstrapPeerNodeResponse(this);
      int from_bitField0_ = bitField0_;
      result.routingTable_ = internalGetRoutingTable();
      result.routingTable_.makeImmutable();
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
      if (other instanceof com.messaging.bootNode.stubs.BootstrapPeerNodeResponse) {
        return mergeFrom((com.messaging.bootNode.stubs.BootstrapPeerNodeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.messaging.bootNode.stubs.BootstrapPeerNodeResponse other) {
      if (other == com.messaging.bootNode.stubs.BootstrapPeerNodeResponse.getDefaultInstance()) return this;
      internalGetMutableRoutingTable().mergeFrom(
          other.internalGetRoutingTable());
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
      com.messaging.bootNode.stubs.BootstrapPeerNodeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.messaging.bootNode.stubs.BootstrapPeerNodeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Boolean> routingTable_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Boolean>
    internalGetRoutingTable() {
      if (routingTable_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            RoutingTableDefaultEntryHolder.defaultEntry);
      }
      return routingTable_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.Boolean>
    internalGetMutableRoutingTable() {
      onChanged();;
      if (routingTable_ == null) {
        routingTable_ = com.google.protobuf.MapField.newMapField(
            RoutingTableDefaultEntryHolder.defaultEntry);
      }
      if (!routingTable_.isMutable()) {
        routingTable_ = routingTable_.copy();
      }
      return routingTable_;
    }

    public int getRoutingTableCount() {
      return internalGetRoutingTable().getMap().size();
    }
    /**
     * <code>map&lt;string, bool&gt; routingTable = 1;</code>
     */

    public boolean containsRoutingTable(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetRoutingTable().getMap().containsKey(key);
    }
    /**
     * Use {@link #getRoutingTableMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Boolean> getRoutingTable() {
      return getRoutingTableMap();
    }
    /**
     * <code>map&lt;string, bool&gt; routingTable = 1;</code>
     */

    public java.util.Map<java.lang.String, java.lang.Boolean> getRoutingTableMap() {
      return internalGetRoutingTable().getMap();
    }
    /**
     * <code>map&lt;string, bool&gt; routingTable = 1;</code>
     */

    public boolean getRoutingTableOrDefault(
        java.lang.String key,
        boolean defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Boolean> map =
          internalGetRoutingTable().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, bool&gt; routingTable = 1;</code>
     */

    public boolean getRoutingTableOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Boolean> map =
          internalGetRoutingTable().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearRoutingTable() {
      internalGetMutableRoutingTable().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, bool&gt; routingTable = 1;</code>
     */

    public Builder removeRoutingTable(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableRoutingTable().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Boolean>
    getMutableRoutingTable() {
      return internalGetMutableRoutingTable().getMutableMap();
    }
    /**
     * <code>map&lt;string, bool&gt; routingTable = 1;</code>
     */
    public Builder putRoutingTable(
        java.lang.String key,
        boolean value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      
      internalGetMutableRoutingTable().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, bool&gt; routingTable = 1;</code>
     */

    public Builder putAllRoutingTable(
        java.util.Map<java.lang.String, java.lang.Boolean> values) {
      internalGetMutableRoutingTable().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:com.messaging.bootNode.stubs.BootstrapPeerNodeResponse)
  }

  // @@protoc_insertion_point(class_scope:com.messaging.bootNode.stubs.BootstrapPeerNodeResponse)
  private static final com.messaging.bootNode.stubs.BootstrapPeerNodeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.messaging.bootNode.stubs.BootstrapPeerNodeResponse();
  }

  public static com.messaging.bootNode.stubs.BootstrapPeerNodeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BootstrapPeerNodeResponse>
      PARSER = new com.google.protobuf.AbstractParser<BootstrapPeerNodeResponse>() {
    public BootstrapPeerNodeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new BootstrapPeerNodeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BootstrapPeerNodeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BootstrapPeerNodeResponse> getParserForType() {
    return PARSER;
  }

  public com.messaging.bootNode.stubs.BootstrapPeerNodeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
