// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: krpcmonitor.proto

package krpc.rpc.monitor.proto;

/**
 * Protobuf type {@code ReportAlarmRes}
 */
public  final class ReportAlarmRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ReportAlarmRes)
    ReportAlarmResOrBuilder {
private static final long serialVersionUID = 0L;
public static final ReportAlarmRes ok() { return ReportAlarmRes.newBuilder().build(); } ;
public static final ReportAlarmRes failed(int retCode) { return ReportAlarmRes.newBuilder().setRetCode(retCode).build(); } ;
public static final ReportAlarmRes failed(int retCode,String retMsg) { return ReportAlarmRes.newBuilder().setRetCode(retCode).setRetMsg(retMsg).build(); } ;
  // Use ReportAlarmRes.newBuilder() to construct.
  private ReportAlarmRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReportAlarmRes() {
    retCode_ = 0;
    retMsg_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReportAlarmRes(
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

            retCode_ = input.readInt32();
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            retMsg_ = s;
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
    return MonitorProtos.internal_static_ReportAlarmRes_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MonitorProtos.internal_static_ReportAlarmRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ReportAlarmRes.class, Builder.class);
  }

  public static final int RETCODE_FIELD_NUMBER = 1;
  private int retCode_;
  /**
   * <code>int32 retCode = 1;</code>
   */
  public int getRetCode() {
    return retCode_;
  }

  public static final int RETMSG_FIELD_NUMBER = 2;
  private volatile Object retMsg_;
  /**
   * <code>string retMsg = 2;</code>
   */
  public String getRetMsg() {
    Object ref = retMsg_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      retMsg_ = s;
      return s;
    }
  }
  /**
   * <code>string retMsg = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRetMsgBytes() {
    Object ref = retMsg_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      retMsg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (retCode_ != 0) {
      output.writeInt32(1, retCode_);
    }
    if (!getRetMsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, retMsg_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (retCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, retCode_);
    }
    if (!getRetMsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, retMsg_);
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
    if (!(obj instanceof ReportAlarmRes)) {
      return super.equals(obj);
    }
    ReportAlarmRes other = (ReportAlarmRes) obj;

    boolean result = true;
    result = result && (getRetCode()
        == other.getRetCode());
    result = result && getRetMsg()
        .equals(other.getRetMsg());
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
    hash = (37 * hash) + RETCODE_FIELD_NUMBER;
    hash = (53 * hash) + getRetCode();
    hash = (37 * hash) + RETMSG_FIELD_NUMBER;
    hash = (53 * hash) + getRetMsg().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ReportAlarmRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReportAlarmRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReportAlarmRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReportAlarmRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReportAlarmRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReportAlarmRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReportAlarmRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ReportAlarmRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ReportAlarmRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ReportAlarmRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ReportAlarmRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ReportAlarmRes parseFrom(
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
  public static Builder newBuilder(ReportAlarmRes prototype) {
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
   * Protobuf type {@code ReportAlarmRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ReportAlarmRes)
      ReportAlarmResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MonitorProtos.internal_static_ReportAlarmRes_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MonitorProtos.internal_static_ReportAlarmRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ReportAlarmRes.class, Builder.class);
    }

    // Construct using krpc.rpc.monitor.proto.ReportAlarmRes.newBuilder()
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
      retCode_ = 0;

      retMsg_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MonitorProtos.internal_static_ReportAlarmRes_descriptor;
    }

    @Override
    public ReportAlarmRes getDefaultInstanceForType() {
      return ReportAlarmRes.getDefaultInstance();
    }

    @Override
    public ReportAlarmRes build() {
      ReportAlarmRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ReportAlarmRes buildPartial() {
      ReportAlarmRes result = new ReportAlarmRes(this);
      result.retCode_ = retCode_;
      result.retMsg_ = retMsg_;
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
      if (other instanceof ReportAlarmRes) {
        return mergeFrom((ReportAlarmRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ReportAlarmRes other) {
      if (other == ReportAlarmRes.getDefaultInstance()) return this;
      if (other.getRetCode() != 0) {
        setRetCode(other.getRetCode());
      }
      if (!other.getRetMsg().isEmpty()) {
        retMsg_ = other.retMsg_;
        onChanged();
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
      ReportAlarmRes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ReportAlarmRes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int retCode_ ;
    /**
     * <code>int32 retCode = 1;</code>
     */
    public int getRetCode() {
      return retCode_;
    }
    /**
     * <code>int32 retCode = 1;</code>
     */
    public Builder setRetCode(int value) {
      
      retCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 retCode = 1;</code>
     */
    public Builder clearRetCode() {
      
      retCode_ = 0;
      onChanged();
      return this;
    }

    private Object retMsg_ = "";
    /**
     * <code>string retMsg = 2;</code>
     */
    public String getRetMsg() {
      Object ref = retMsg_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        retMsg_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string retMsg = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRetMsgBytes() {
      Object ref = retMsg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        retMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string retMsg = 2;</code>
     */
    public Builder setRetMsg(
        String value) {
      if (value == null) value = "";
  
      retMsg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string retMsg = 2;</code>
     */
    public Builder clearRetMsg() {
      
      retMsg_ = getDefaultInstance().getRetMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string retMsg = 2;</code>
     */
    public Builder setRetMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      retMsg_ = value;
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


    // @@protoc_insertion_point(builder_scope:ReportAlarmRes)
  }

  // @@protoc_insertion_point(class_scope:ReportAlarmRes)
  private static final ReportAlarmRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ReportAlarmRes();
  }

  public static ReportAlarmRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReportAlarmRes>
      PARSER = new com.google.protobuf.AbstractParser<ReportAlarmRes>() {
    @Override
    public ReportAlarmRes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReportAlarmRes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReportAlarmRes> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ReportAlarmRes> getParserForType() {
    return PARSER;
  }

  @Override
  public ReportAlarmRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

