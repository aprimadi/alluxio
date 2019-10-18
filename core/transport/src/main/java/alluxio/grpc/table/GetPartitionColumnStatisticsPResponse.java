// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

/**
 * Protobuf type {@code alluxio.grpc.table.GetPartitionColumnStatisticsPResponse}
 */
public  final class GetPartitionColumnStatisticsPResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.table.GetPartitionColumnStatisticsPResponse)
    GetPartitionColumnStatisticsPResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPartitionColumnStatisticsPResponse.newBuilder() to construct.
  private GetPartitionColumnStatisticsPResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPartitionColumnStatisticsPResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetPartitionColumnStatisticsPResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              partitionStatistics_ = com.google.protobuf.MapField.newMapField(
                  PartitionStatisticsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, alluxio.grpc.table.ColumnStatisticsList>
            partitionStatistics__ = input.readMessage(
                PartitionStatisticsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            partitionStatistics_.getMutableMap().put(
                partitionStatistics__.getKey(), partitionStatistics__.getValue());
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetPartitionColumnStatisticsPResponse_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetPartitionStatistics();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetPartitionColumnStatisticsPResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.table.GetPartitionColumnStatisticsPResponse.class, alluxio.grpc.table.GetPartitionColumnStatisticsPResponse.Builder.class);
  }

  public static final int PARTITIONSTATISTICS_FIELD_NUMBER = 1;
  private static final class PartitionStatisticsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, alluxio.grpc.table.ColumnStatisticsList> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, alluxio.grpc.table.ColumnStatisticsList>newDefaultInstance(
                alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetPartitionColumnStatisticsPResponse_PartitionStatisticsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                alluxio.grpc.table.ColumnStatisticsList.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, alluxio.grpc.table.ColumnStatisticsList> partitionStatistics_;
  private com.google.protobuf.MapField<java.lang.String, alluxio.grpc.table.ColumnStatisticsList>
  internalGetPartitionStatistics() {
    if (partitionStatistics_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          PartitionStatisticsDefaultEntryHolder.defaultEntry);
    }
    return partitionStatistics_;
  }

  public int getPartitionStatisticsCount() {
    return internalGetPartitionStatistics().getMap().size();
  }
  /**
   * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsList&gt; partitionStatistics = 1;</code>
   */

  public boolean containsPartitionStatistics(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetPartitionStatistics().getMap().containsKey(key);
  }
  /**
   * Use {@link #getPartitionStatisticsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, alluxio.grpc.table.ColumnStatisticsList> getPartitionStatistics() {
    return getPartitionStatisticsMap();
  }
  /**
   * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsList&gt; partitionStatistics = 1;</code>
   */

  public java.util.Map<java.lang.String, alluxio.grpc.table.ColumnStatisticsList> getPartitionStatisticsMap() {
    return internalGetPartitionStatistics().getMap();
  }
  /**
   * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsList&gt; partitionStatistics = 1;</code>
   */

  public alluxio.grpc.table.ColumnStatisticsList getPartitionStatisticsOrDefault(
      java.lang.String key,
      alluxio.grpc.table.ColumnStatisticsList defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, alluxio.grpc.table.ColumnStatisticsList> map =
        internalGetPartitionStatistics().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsList&gt; partitionStatistics = 1;</code>
   */

  public alluxio.grpc.table.ColumnStatisticsList getPartitionStatisticsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, alluxio.grpc.table.ColumnStatisticsList> map =
        internalGetPartitionStatistics().getMap();
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

    for (alluxio.grpc.table.ColumnStatisticsList item : getPartitionStatisticsMap().values()) {
      if (!item.isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetPartitionStatistics(),
        PartitionStatisticsDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, alluxio.grpc.table.ColumnStatisticsList> entry
         : internalGetPartitionStatistics().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, alluxio.grpc.table.ColumnStatisticsList>
      partitionStatistics__ = PartitionStatisticsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, partitionStatistics__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof alluxio.grpc.table.GetPartitionColumnStatisticsPResponse)) {
      return super.equals(obj);
    }
    alluxio.grpc.table.GetPartitionColumnStatisticsPResponse other = (alluxio.grpc.table.GetPartitionColumnStatisticsPResponse) obj;

    boolean result = true;
    result = result && internalGetPartitionStatistics().equals(
        other.internalGetPartitionStatistics());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetPartitionStatistics().getMap().isEmpty()) {
      hash = (37 * hash) + PARTITIONSTATISTICS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetPartitionStatistics().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.table.GetPartitionColumnStatisticsPResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.GetPartitionColumnStatisticsPResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.GetPartitionColumnStatisticsPResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.GetPartitionColumnStatisticsPResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.GetPartitionColumnStatisticsPResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.GetPartitionColumnStatisticsPResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.GetPartitionColumnStatisticsPResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.GetPartitionColumnStatisticsPResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.table.GetPartitionColumnStatisticsPResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.GetPartitionColumnStatisticsPResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.table.GetPartitionColumnStatisticsPResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.GetPartitionColumnStatisticsPResponse parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.table.GetPartitionColumnStatisticsPResponse prototype) {
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
   * Protobuf type {@code alluxio.grpc.table.GetPartitionColumnStatisticsPResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.table.GetPartitionColumnStatisticsPResponse)
      alluxio.grpc.table.GetPartitionColumnStatisticsPResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetPartitionColumnStatisticsPResponse_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetPartitionStatistics();
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
          return internalGetMutablePartitionStatistics();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetPartitionColumnStatisticsPResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.table.GetPartitionColumnStatisticsPResponse.class, alluxio.grpc.table.GetPartitionColumnStatisticsPResponse.Builder.class);
    }

    // Construct using alluxio.grpc.table.GetPartitionColumnStatisticsPResponse.newBuilder()
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
      internalGetMutablePartitionStatistics().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetPartitionColumnStatisticsPResponse_descriptor;
    }

    public alluxio.grpc.table.GetPartitionColumnStatisticsPResponse getDefaultInstanceForType() {
      return alluxio.grpc.table.GetPartitionColumnStatisticsPResponse.getDefaultInstance();
    }

    public alluxio.grpc.table.GetPartitionColumnStatisticsPResponse build() {
      alluxio.grpc.table.GetPartitionColumnStatisticsPResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.table.GetPartitionColumnStatisticsPResponse buildPartial() {
      alluxio.grpc.table.GetPartitionColumnStatisticsPResponse result = new alluxio.grpc.table.GetPartitionColumnStatisticsPResponse(this);
      int from_bitField0_ = bitField0_;
      result.partitionStatistics_ = internalGetPartitionStatistics();
      result.partitionStatistics_.makeImmutable();
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof alluxio.grpc.table.GetPartitionColumnStatisticsPResponse) {
        return mergeFrom((alluxio.grpc.table.GetPartitionColumnStatisticsPResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.table.GetPartitionColumnStatisticsPResponse other) {
      if (other == alluxio.grpc.table.GetPartitionColumnStatisticsPResponse.getDefaultInstance()) return this;
      internalGetMutablePartitionStatistics().mergeFrom(
          other.internalGetPartitionStatistics());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      for (alluxio.grpc.table.ColumnStatisticsList item : getPartitionStatisticsMap().values()) {
        if (!item.isInitialized()) {
          return false;
        }
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      alluxio.grpc.table.GetPartitionColumnStatisticsPResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.table.GetPartitionColumnStatisticsPResponse) e.getUnfinishedMessage();
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
        java.lang.String, alluxio.grpc.table.ColumnStatisticsList> partitionStatistics_;
    private com.google.protobuf.MapField<java.lang.String, alluxio.grpc.table.ColumnStatisticsList>
    internalGetPartitionStatistics() {
      if (partitionStatistics_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PartitionStatisticsDefaultEntryHolder.defaultEntry);
      }
      return partitionStatistics_;
    }
    private com.google.protobuf.MapField<java.lang.String, alluxio.grpc.table.ColumnStatisticsList>
    internalGetMutablePartitionStatistics() {
      onChanged();;
      if (partitionStatistics_ == null) {
        partitionStatistics_ = com.google.protobuf.MapField.newMapField(
            PartitionStatisticsDefaultEntryHolder.defaultEntry);
      }
      if (!partitionStatistics_.isMutable()) {
        partitionStatistics_ = partitionStatistics_.copy();
      }
      return partitionStatistics_;
    }

    public int getPartitionStatisticsCount() {
      return internalGetPartitionStatistics().getMap().size();
    }
    /**
     * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsList&gt; partitionStatistics = 1;</code>
     */

    public boolean containsPartitionStatistics(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetPartitionStatistics().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPartitionStatisticsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, alluxio.grpc.table.ColumnStatisticsList> getPartitionStatistics() {
      return getPartitionStatisticsMap();
    }
    /**
     * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsList&gt; partitionStatistics = 1;</code>
     */

    public java.util.Map<java.lang.String, alluxio.grpc.table.ColumnStatisticsList> getPartitionStatisticsMap() {
      return internalGetPartitionStatistics().getMap();
    }
    /**
     * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsList&gt; partitionStatistics = 1;</code>
     */

    public alluxio.grpc.table.ColumnStatisticsList getPartitionStatisticsOrDefault(
        java.lang.String key,
        alluxio.grpc.table.ColumnStatisticsList defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, alluxio.grpc.table.ColumnStatisticsList> map =
          internalGetPartitionStatistics().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsList&gt; partitionStatistics = 1;</code>
     */

    public alluxio.grpc.table.ColumnStatisticsList getPartitionStatisticsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, alluxio.grpc.table.ColumnStatisticsList> map =
          internalGetPartitionStatistics().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearPartitionStatistics() {
      internalGetMutablePartitionStatistics().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsList&gt; partitionStatistics = 1;</code>
     */

    public Builder removePartitionStatistics(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutablePartitionStatistics().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, alluxio.grpc.table.ColumnStatisticsList>
    getMutablePartitionStatistics() {
      return internalGetMutablePartitionStatistics().getMutableMap();
    }
    /**
     * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsList&gt; partitionStatistics = 1;</code>
     */
    public Builder putPartitionStatistics(
        java.lang.String key,
        alluxio.grpc.table.ColumnStatisticsList value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutablePartitionStatistics().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsList&gt; partitionStatistics = 1;</code>
     */

    public Builder putAllPartitionStatistics(
        java.util.Map<java.lang.String, alluxio.grpc.table.ColumnStatisticsList> values) {
      internalGetMutablePartitionStatistics().getMutableMap()
          .putAll(values);
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.table.GetPartitionColumnStatisticsPResponse)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.table.GetPartitionColumnStatisticsPResponse)
  private static final alluxio.grpc.table.GetPartitionColumnStatisticsPResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.table.GetPartitionColumnStatisticsPResponse();
  }

  public static alluxio.grpc.table.GetPartitionColumnStatisticsPResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GetPartitionColumnStatisticsPResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetPartitionColumnStatisticsPResponse>() {
    public GetPartitionColumnStatisticsPResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetPartitionColumnStatisticsPResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetPartitionColumnStatisticsPResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPartitionColumnStatisticsPResponse> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.table.GetPartitionColumnStatisticsPResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

