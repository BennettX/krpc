// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: krpcmonitor.proto

package krpc.rpc.monitor.proto;

/**
 * Protobuf type {@code AlarmInfo}
 */
public  final class AlarmInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AlarmInfo)
    AlarmInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlarmInfo.newBuilder() to construct.
  private AlarmInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlarmInfo() {
    time_ = 0L;
    type_ = "";
    msg_ = "";
    count_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AlarmInfo(
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

            time_ = input.readInt64();
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 42: {
            String s = input.readStringRequireUtf8();

            msg_ = s;
            break;
          }
          case 48: {

            count_ = input.readInt32();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return MonitorProtos.internal_static_AlarmInfo_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MonitorProtos.internal_static_AlarmInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AlarmInfo.class, Builder.class);
  }

  public static final int TIME_FIELD_NUMBER = 1;
  private long time_;
  /**
   * <code>int64 time = 1;</code>
   */
  public long getTime() {
    return time_;
  }

  public static final int TYPE_FIELD_NUMBER = 4;
  private volatile Object type_;
  /**
   * <code>string type = 4;</code>
   */
  public String getType() {
    Object ref = type_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 4;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    Object ref = type_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MSG_FIELD_NUMBER = 5;
  private volatile Object msg_;
  /**
   * <code>string msg = 5;</code>
   */
  public String getMsg() {
    Object ref = msg_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      msg_ = s;
      return s;
    }
  }
  /**
   * <code>string msg = 5;</code>
   */
  public com.google.protobuf.ByteString
      getMsgBytes() {
    Object ref = msg_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      msg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNT_FIELD_NUMBER = 6;
  private int count_;
  /**
   * <code>int32 count = 6;</code>
   */
  public int getCount() {
    return count_;
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
    if (time_ != 0L) {
      output.writeInt64(1, time_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, type_);
    }
    if (!getMsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, msg_);
    }
    if (count_ != 0) {
      output.writeInt32(6, count_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (time_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, time_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, type_);
    }
    if (!getMsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, msg_);
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, count_);
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
    if (!(obj instanceof AlarmInfo)) {
      return super.equals(obj);
    }
    AlarmInfo other = (AlarmInfo) obj;

    boolean result = true;
    result = result && (getTime()
        == other.getTime());
    result = result && getType()
        .equals(other.getType());
    result = result && getMsg()
        .equals(other.getMsg());
    result = result && (getCount()
        == other.getCount());
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
    hash = (37 * hash) + TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTime());
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + MSG_FIELD_NUMBER;
    hash = (53 * hash) + getMsg().hashCode();
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AlarmInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AlarmInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AlarmInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AlarmInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AlarmInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AlarmInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AlarmInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AlarmInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AlarmInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AlarmInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AlarmInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AlarmInfo parseFrom(
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
  public static Builder newBuilder(AlarmInfo prototype) {
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
   * Protobuf type {@code AlarmInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AlarmInfo)
      AlarmInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MonitorProtos.internal_static_AlarmInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MonitorProtos.internal_static_AlarmInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AlarmInfo.class, Builder.class);
    }

    // Construct using krpc.rpc.monitor.proto.AlarmInfo.newBuilder()
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
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      time_ = 0L;

      type_ = "";

      msg_ = "";

      count_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MonitorProtos.internal_static_AlarmInfo_descriptor;
    }

    @Override
    public AlarmInfo getDefaultInstanceForType() {
      return AlarmInfo.getDefaultInstance();
    }

    @Override
    public AlarmInfo build() {
      AlarmInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public AlarmInfo buildPartial() {
      AlarmInfo result = new AlarmInfo(this);
      result.time_ = time_;
      result.type_ = type_;
      result.msg_ = msg_;
      result.count_ = count_;
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
      if (other instanceof AlarmInfo) {
        return mergeFrom((AlarmInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AlarmInfo other) {
      if (other == AlarmInfo.getDefaultInstance()) return this;
      if (other.getTime() != 0L) {
        setTime(other.getTime());
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (!other.getMsg().isEmpty()) {
        msg_ = other.msg_;
        onChanged();
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
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
      AlarmInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AlarmInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long time_ ;
    /**
     * <code>int64 time = 1;</code>
     */
    public long getTime() {
      return time_;
    }
    /**
     * <code>int64 time = 1;</code>
     */
    public Builder setTime(long value) {
      
      time_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 time = 1;</code>
     */
    public Builder clearTime() {
      
      time_ = 0L;
      onChanged();
      return this;
    }

    private Object type_ = "";
    /**
     * <code>string type = 4;</code>
     */
    public String getType() {
      Object ref = type_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string type = 4;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 4;</code>
     */
    public Builder setType(
        String value) {
      if (value == null) value = "";
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 4;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 4;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private Object msg_ = "";
    /**
     * <code>string msg = 5;</code>
     */
    public String getMsg() {
      Object ref = msg_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string msg = 5;</code>
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msg = 5;</code>
     */
    public Builder setMsg(
        String value) {
      if (value == null) value = "";
  
      msg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msg = 5;</code>
     */
    public Builder clearMsg() {
      
      msg_ = getDefaultInstance().getMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string msg = 5;</code>
     */
    public Builder setMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msg_ = value;
      onChanged();
      return this;
    }

    private int count_ ;
    /**
     * <code>int32 count = 6;</code>
     */
    public int getCount() {
      return count_;
    }
    /**
     * <code>int32 count = 6;</code>
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 count = 6;</code>
     */
    public Builder clearCount() {
      
      count_ = 0;
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


    // @@protoc_insertion_point(builder_scope:AlarmInfo)
  }

  // @@protoc_insertion_point(class_scope:AlarmInfo)
  private static final AlarmInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AlarmInfo();
  }

  public static AlarmInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlarmInfo>
      PARSER = new com.google.protobuf.AbstractParser<AlarmInfo>() {
    @Override
    public AlarmInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AlarmInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AlarmInfo> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<AlarmInfo> getParserForType() {
    return PARSER;
  }

  @Override
  public AlarmInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

