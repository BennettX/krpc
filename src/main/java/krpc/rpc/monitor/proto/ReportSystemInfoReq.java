// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: krpcmonitor.proto

package krpc.rpc.monitor.proto;

/**
 * Protobuf type {@code ReportSystemInfoReq}
 */
public  final class ReportSystemInfoReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ReportSystemInfoReq)
    ReportSystemInfoReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReportSystemInfoReq.newBuilder() to construct.
  private ReportSystemInfoReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReportSystemInfoReq() {
    timestamp_ = 0L;
    host_ = "";
    app_ = "";
    kvs_ = java.util.Collections.emptyList();
    appServiceId_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReportSystemInfoReq(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
          case 8: {

            timestamp_ = input.readInt64();
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            host_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            app_ = s;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              kvs_ = new java.util.ArrayList<SystemInfoKV>();
              mutable_bitField0_ |= 0x00000008;
            }
            kvs_.add(
                input.readMessage(SystemInfoKV.parser(), extensionRegistry));
            break;
          }
          case 40: {

            appServiceId_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        kvs_ = java.util.Collections.unmodifiableList(kvs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return MonitorProtos.internal_static_ReportSystemInfoReq_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MonitorProtos.internal_static_ReportSystemInfoReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ReportSystemInfoReq.class, Builder.class);
  }

  private int bitField0_;
  public static final int TIMESTAMP_FIELD_NUMBER = 1;
  private long timestamp_;
  /**
   * <code>int64 timestamp = 1;</code>
   */
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int HOST_FIELD_NUMBER = 2;
  private volatile Object host_;
  /**
   * <code>string host = 2;</code>
   */
  public String getHost() {
    Object ref = host_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      host_ = s;
      return s;
    }
  }
  /**
   * <code>string host = 2;</code>
   */
  public com.google.protobuf.ByteString
      getHostBytes() {
    Object ref = host_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      host_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APP_FIELD_NUMBER = 3;
  private volatile Object app_;
  /**
   * <code>string app = 3;</code>
   */
  public String getApp() {
    Object ref = app_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      app_ = s;
      return s;
    }
  }
  /**
   * <code>string app = 3;</code>
   */
  public com.google.protobuf.ByteString
      getAppBytes() {
    Object ref = app_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      app_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KVS_FIELD_NUMBER = 4;
  private java.util.List<SystemInfoKV> kvs_;
  /**
   * <code>repeated .SystemInfoKV kvs = 4;</code>
   */
  public java.util.List<SystemInfoKV> getKvsList() {
    return kvs_;
  }
  /**
   * <code>repeated .SystemInfoKV kvs = 4;</code>
   */
  public java.util.List<? extends SystemInfoKVOrBuilder>
      getKvsOrBuilderList() {
    return kvs_;
  }
  /**
   * <code>repeated .SystemInfoKV kvs = 4;</code>
   */
  public int getKvsCount() {
    return kvs_.size();
  }
  /**
   * <code>repeated .SystemInfoKV kvs = 4;</code>
   */
  public SystemInfoKV getKvs(int index) {
    return kvs_.get(index);
  }
  /**
   * <code>repeated .SystemInfoKV kvs = 4;</code>
   */
  public SystemInfoKVOrBuilder getKvsOrBuilder(
      int index) {
    return kvs_.get(index);
  }

  public static final int APPSERVICEID_FIELD_NUMBER = 5;
  private int appServiceId_;
  /**
   * <code>int32 appServiceId = 5;</code>
   */
  public int getAppServiceId() {
    return appServiceId_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (timestamp_ != 0L) {
      output.writeInt64(1, timestamp_);
    }
    if (!getHostBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, host_);
    }
    if (!getAppBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, app_);
    }
    for (int i = 0; i < kvs_.size(); i++) {
      output.writeMessage(4, kvs_.get(i));
    }
    if (appServiceId_ != 0) {
      output.writeInt32(5, appServiceId_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, timestamp_);
    }
    if (!getHostBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, host_);
    }
    if (!getAppBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, app_);
    }
    for (int i = 0; i < kvs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, kvs_.get(i));
    }
    if (appServiceId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, appServiceId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ReportSystemInfoReq)) {
      return super.equals(obj);
    }
    ReportSystemInfoReq other = (ReportSystemInfoReq) obj;

    boolean result = true;
    result = result && (getTimestamp()
        == other.getTimestamp());
    result = result && getHost()
        .equals(other.getHost());
    result = result && getApp()
        .equals(other.getApp());
    result = result && getKvsList()
        .equals(other.getKvsList());
    result = result && (getAppServiceId()
        == other.getAppServiceId());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + HOST_FIELD_NUMBER;
    hash = (53 * hash) + getHost().hashCode();
    hash = (37 * hash) + APP_FIELD_NUMBER;
    hash = (53 * hash) + getApp().hashCode();
    if (getKvsCount() > 0) {
      hash = (37 * hash) + KVS_FIELD_NUMBER;
      hash = (53 * hash) + getKvsList().hashCode();
    }
    hash = (37 * hash) + APPSERVICEID_FIELD_NUMBER;
    hash = (53 * hash) + getAppServiceId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ReportSystemInfoReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReportSystemInfoReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReportSystemInfoReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReportSystemInfoReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReportSystemInfoReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReportSystemInfoReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReportSystemInfoReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ReportSystemInfoReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ReportSystemInfoReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ReportSystemInfoReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ReportSystemInfoReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ReportSystemInfoReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ReportSystemInfoReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ReportSystemInfoReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ReportSystemInfoReq)
      ReportSystemInfoReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MonitorProtos.internal_static_ReportSystemInfoReq_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MonitorProtos.internal_static_ReportSystemInfoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ReportSystemInfoReq.class, Builder.class);
    }

    // Construct using krpc.rpc.monitor.proto.ReportSystemInfoReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getKvsFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      timestamp_ = 0L;

      host_ = "";

      app_ = "";

      if (kvsBuilder_ == null) {
        kvs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        kvsBuilder_.clear();
      }
      appServiceId_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MonitorProtos.internal_static_ReportSystemInfoReq_descriptor;
    }

    @Override
    public ReportSystemInfoReq getDefaultInstanceForType() {
      return ReportSystemInfoReq.getDefaultInstance();
    }

    @Override
    public ReportSystemInfoReq build() {
      ReportSystemInfoReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ReportSystemInfoReq buildPartial() {
      ReportSystemInfoReq result = new ReportSystemInfoReq(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.timestamp_ = timestamp_;
      result.host_ = host_;
      result.app_ = app_;
      if (kvsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          kvs_ = java.util.Collections.unmodifiableList(kvs_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.kvs_ = kvs_;
      } else {
        result.kvs_ = kvsBuilder_.build();
      }
      result.appServiceId_ = appServiceId_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ReportSystemInfoReq) {
        return mergeFrom((ReportSystemInfoReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ReportSystemInfoReq other) {
      if (other == ReportSystemInfoReq.getDefaultInstance()) return this;
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (!other.getHost().isEmpty()) {
        host_ = other.host_;
        onChanged();
      }
      if (!other.getApp().isEmpty()) {
        app_ = other.app_;
        onChanged();
      }
      if (kvsBuilder_ == null) {
        if (!other.kvs_.isEmpty()) {
          if (kvs_.isEmpty()) {
            kvs_ = other.kvs_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureKvsIsMutable();
            kvs_.addAll(other.kvs_);
          }
          onChanged();
        }
      } else {
        if (!other.kvs_.isEmpty()) {
          if (kvsBuilder_.isEmpty()) {
            kvsBuilder_.dispose();
            kvsBuilder_ = null;
            kvs_ = other.kvs_;
            bitField0_ = (bitField0_ & ~0x00000008);
            kvsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getKvsFieldBuilder() : null;
          } else {
            kvsBuilder_.addAllMessages(other.kvs_);
          }
        }
      }
      if (other.getAppServiceId() != 0) {
        setAppServiceId(other.getAppServiceId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ReportSystemInfoReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ReportSystemInfoReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long timestamp_ ;
    /**
     * <code>int64 timestamp = 1;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>int64 timestamp = 1;</code>
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp = 1;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private Object host_ = "";
    /**
     * <code>string host = 2;</code>
     */
    public String getHost() {
      Object ref = host_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        host_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string host = 2;</code>
     */
    public com.google.protobuf.ByteString
        getHostBytes() {
      Object ref = host_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        host_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string host = 2;</code>
     */
    public Builder setHost(
        String value) {
      if (value == null) value = "";
  
      host_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string host = 2;</code>
     */
    public Builder clearHost() {
      
      host_ = getDefaultInstance().getHost();
      onChanged();
      return this;
    }
    /**
     * <code>string host = 2;</code>
     */
    public Builder setHostBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      host_ = value;
      onChanged();
      return this;
    }

    private Object app_ = "";
    /**
     * <code>string app = 3;</code>
     */
    public String getApp() {
      Object ref = app_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        app_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string app = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAppBytes() {
      Object ref = app_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        app_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string app = 3;</code>
     */
    public Builder setApp(
        String value) {
      if (value == null) value = "";
  
      app_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string app = 3;</code>
     */
    public Builder clearApp() {
      
      app_ = getDefaultInstance().getApp();
      onChanged();
      return this;
    }
    /**
     * <code>string app = 3;</code>
     */
    public Builder setAppBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      app_ = value;
      onChanged();
      return this;
    }

    private java.util.List<SystemInfoKV> kvs_ =
      java.util.Collections.emptyList();
    private void ensureKvsIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        kvs_ = new java.util.ArrayList<SystemInfoKV>(kvs_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        SystemInfoKV, SystemInfoKV.Builder, SystemInfoKVOrBuilder> kvsBuilder_;

    /**
     * <code>repeated .SystemInfoKV kvs = 4;</code>
     */
    public java.util.List<SystemInfoKV> getKvsList() {
      if (kvsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(kvs_);
      } else {
        return kvsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .SystemInfoKV kvs = 4;</code>
     */
    public int getKvsCount() {
      if (kvsBuilder_ == null) {
        return kvs_.size();
      } else {
        return kvsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .SystemInfoKV kvs = 4;</code>
     */
    public SystemInfoKV getKvs(int index) {
      if (kvsBuilder_ == null) {
        return kvs_.get(index);
      } else {
        return kvsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .SystemInfoKV kvs = 4;</code>
     */
    public Builder setKvs(
        int index, SystemInfoKV value) {
      if (kvsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKvsIsMutable();
        kvs_.set(index, value);
        onChanged();
      } else {
        kvsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .SystemInfoKV kvs = 4;</code>
     */
    public Builder setKvs(
        int index, SystemInfoKV.Builder builderForValue) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.set(index, builderForValue.build());
        onChanged();
      } else {
        kvsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SystemInfoKV kvs = 4;</code>
     */
    public Builder addKvs(SystemInfoKV value) {
      if (kvsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKvsIsMutable();
        kvs_.add(value);
        onChanged();
      } else {
        kvsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .SystemInfoKV kvs = 4;</code>
     */
    public Builder addKvs(
        int index, SystemInfoKV value) {
      if (kvsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKvsIsMutable();
        kvs_.add(index, value);
        onChanged();
      } else {
        kvsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .SystemInfoKV kvs = 4;</code>
     */
    public Builder addKvs(
        SystemInfoKV.Builder builderForValue) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.add(builderForValue.build());
        onChanged();
      } else {
        kvsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SystemInfoKV kvs = 4;</code>
     */
    public Builder addKvs(
        int index, SystemInfoKV.Builder builderForValue) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.add(index, builderForValue.build());
        onChanged();
      } else {
        kvsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SystemInfoKV kvs = 4;</code>
     */
    public Builder addAllKvs(
        Iterable<? extends SystemInfoKV> values) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, kvs_);
        onChanged();
      } else {
        kvsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .SystemInfoKV kvs = 4;</code>
     */
    public Builder clearKvs() {
      if (kvsBuilder_ == null) {
        kvs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        kvsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .SystemInfoKV kvs = 4;</code>
     */
    public Builder removeKvs(int index) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.remove(index);
        onChanged();
      } else {
        kvsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .SystemInfoKV kvs = 4;</code>
     */
    public SystemInfoKV.Builder getKvsBuilder(
        int index) {
      return getKvsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .SystemInfoKV kvs = 4;</code>
     */
    public SystemInfoKVOrBuilder getKvsOrBuilder(
        int index) {
      if (kvsBuilder_ == null) {
        return kvs_.get(index);  } else {
        return kvsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .SystemInfoKV kvs = 4;</code>
     */
    public java.util.List<? extends SystemInfoKVOrBuilder>
         getKvsOrBuilderList() {
      if (kvsBuilder_ != null) {
        return kvsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(kvs_);
      }
    }
    /**
     * <code>repeated .SystemInfoKV kvs = 4;</code>
     */
    public SystemInfoKV.Builder addKvsBuilder() {
      return getKvsFieldBuilder().addBuilder(
          SystemInfoKV.getDefaultInstance());
    }
    /**
     * <code>repeated .SystemInfoKV kvs = 4;</code>
     */
    public SystemInfoKV.Builder addKvsBuilder(
        int index) {
      return getKvsFieldBuilder().addBuilder(
          index, SystemInfoKV.getDefaultInstance());
    }
    /**
     * <code>repeated .SystemInfoKV kvs = 4;</code>
     */
    public java.util.List<SystemInfoKV.Builder>
         getKvsBuilderList() {
      return getKvsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        SystemInfoKV, SystemInfoKV.Builder, SystemInfoKVOrBuilder>
        getKvsFieldBuilder() {
      if (kvsBuilder_ == null) {
        kvsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            SystemInfoKV, SystemInfoKV.Builder, SystemInfoKVOrBuilder>(
                kvs_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        kvs_ = null;
      }
      return kvsBuilder_;
    }

    private int appServiceId_ ;
    /**
     * <code>int32 appServiceId = 5;</code>
     */
    public int getAppServiceId() {
      return appServiceId_;
    }
    /**
     * <code>int32 appServiceId = 5;</code>
     */
    public Builder setAppServiceId(int value) {
      
      appServiceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 appServiceId = 5;</code>
     */
    public Builder clearAppServiceId() {
      
      appServiceId_ = 0;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ReportSystemInfoReq)
  }

  // @@protoc_insertion_point(class_scope:ReportSystemInfoReq)
  private static final ReportSystemInfoReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ReportSystemInfoReq();
  }

  public static ReportSystemInfoReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReportSystemInfoReq>
      PARSER = new com.google.protobuf.AbstractParser<ReportSystemInfoReq>() {
    @Override
    public ReportSystemInfoReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReportSystemInfoReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReportSystemInfoReq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ReportSystemInfoReq> getParserForType() {
    return PARSER;
  }

  @Override
  public ReportSystemInfoReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

