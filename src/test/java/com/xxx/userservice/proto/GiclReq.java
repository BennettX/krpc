// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userservice.proto

package com.xxx.userservice.proto;

/**
 * Protobuf type {@code GiclReq}
 */
public  final class GiclReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GiclReq)
    GiclReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GiclReq.newBuilder() to construct.
  private GiclReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GiclReq() {
    a_ = 0;
    b_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GiclReq(
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
          case 88: {

            a_ = input.readInt32();
            break;
          }
          case 122: {
            java.lang.String s = input.readStringRequireUtf8();

            b_ = s;
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
    return com.xxx.userservice.proto.UserServiceMetas.internal_static_GiclReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xxx.userservice.proto.UserServiceMetas.internal_static_GiclReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xxx.userservice.proto.GiclReq.class, com.xxx.userservice.proto.GiclReq.Builder.class);
  }

  public static final int A_FIELD_NUMBER = 11;
  private int a_;
  /**
   * <code>int32 a = 11 [(.krpc.gicl) = { ... }</code>
   */
  public int getA() {
    return a_;
  }

  public static final int B_FIELD_NUMBER = 15;
  private volatile java.lang.Object b_;
  /**
   * <code>string b = 15 [(.krpc.gicl) = { ... }</code>
   */
  public java.lang.String getB() {
    java.lang.Object ref = b_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      b_ = s;
      return s;
    }
  }
  /**
   * <code>string b = 15 [(.krpc.gicl) = { ... }</code>
   */
  public com.google.protobuf.ByteString
      getBBytes() {
    java.lang.Object ref = b_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      b_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (a_ != 0) {
      output.writeInt32(11, a_);
    }
    if (!getBBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 15, b_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (a_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(11, a_);
    }
    if (!getBBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(15, b_);
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
    if (!(obj instanceof com.xxx.userservice.proto.GiclReq)) {
      return super.equals(obj);
    }
    com.xxx.userservice.proto.GiclReq other = (com.xxx.userservice.proto.GiclReq) obj;

    boolean result = true;
    result = result && (getA()
        == other.getA());
    result = result && getB()
        .equals(other.getB());
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
    hash = (37 * hash) + A_FIELD_NUMBER;
    hash = (53 * hash) + getA();
    hash = (37 * hash) + B_FIELD_NUMBER;
    hash = (53 * hash) + getB().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xxx.userservice.proto.GiclReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxx.userservice.proto.GiclReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxx.userservice.proto.GiclReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxx.userservice.proto.GiclReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxx.userservice.proto.GiclReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxx.userservice.proto.GiclReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxx.userservice.proto.GiclReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xxx.userservice.proto.GiclReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xxx.userservice.proto.GiclReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xxx.userservice.proto.GiclReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xxx.userservice.proto.GiclReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xxx.userservice.proto.GiclReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.xxx.userservice.proto.GiclReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code GiclReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GiclReq)
      com.xxx.userservice.proto.GiclReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xxx.userservice.proto.UserServiceMetas.internal_static_GiclReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xxx.userservice.proto.UserServiceMetas.internal_static_GiclReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xxx.userservice.proto.GiclReq.class, com.xxx.userservice.proto.GiclReq.Builder.class);
    }

    // Construct using com.xxx.userservice.proto.GiclReq.newBuilder()
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
      a_ = 0;

      b_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xxx.userservice.proto.UserServiceMetas.internal_static_GiclReq_descriptor;
    }

    public com.xxx.userservice.proto.GiclReq getDefaultInstanceForType() {
      return com.xxx.userservice.proto.GiclReq.getDefaultInstance();
    }

    public com.xxx.userservice.proto.GiclReq build() {
      com.xxx.userservice.proto.GiclReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.xxx.userservice.proto.GiclReq buildPartial() {
      com.xxx.userservice.proto.GiclReq result = new com.xxx.userservice.proto.GiclReq(this);
      result.a_ = a_;
      result.b_ = b_;
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
      if (other instanceof com.xxx.userservice.proto.GiclReq) {
        return mergeFrom((com.xxx.userservice.proto.GiclReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xxx.userservice.proto.GiclReq other) {
      if (other == com.xxx.userservice.proto.GiclReq.getDefaultInstance()) return this;
      if (other.getA() != 0) {
        setA(other.getA());
      }
      if (!other.getB().isEmpty()) {
        b_ = other.b_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.xxx.userservice.proto.GiclReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xxx.userservice.proto.GiclReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int a_ ;
    /**
     * <code>int32 a = 11 [(.krpc.gicl) = { ... }</code>
     */
    public int getA() {
      return a_;
    }
    /**
     * <code>int32 a = 11 [(.krpc.gicl) = { ... }</code>
     */
    public Builder setA(int value) {
      
      a_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 a = 11 [(.krpc.gicl) = { ... }</code>
     */
    public Builder clearA() {
      
      a_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object b_ = "";
    /**
     * <code>string b = 15 [(.krpc.gicl) = { ... }</code>
     */
    public java.lang.String getB() {
      java.lang.Object ref = b_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        b_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string b = 15 [(.krpc.gicl) = { ... }</code>
     */
    public com.google.protobuf.ByteString
        getBBytes() {
      java.lang.Object ref = b_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        b_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string b = 15 [(.krpc.gicl) = { ... }</code>
     */
    public Builder setB(
        java.lang.String value) {
      if (value == null) value = "";
  
      b_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string b = 15 [(.krpc.gicl) = { ... }</code>
     */
    public Builder clearB() {
      
      b_ = getDefaultInstance().getB();
      onChanged();
      return this;
    }
    /**
     * <code>string b = 15 [(.krpc.gicl) = { ... }</code>
     */
    public Builder setBBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      b_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GiclReq)
  }

  // @@protoc_insertion_point(class_scope:GiclReq)
  private static final com.xxx.userservice.proto.GiclReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xxx.userservice.proto.GiclReq();
  }

  public static com.xxx.userservice.proto.GiclReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GiclReq>
      PARSER = new com.google.protobuf.AbstractParser<GiclReq>() {
    @java.lang.Override
    public GiclReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GiclReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GiclReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GiclReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xxx.userservice.proto.GiclReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

