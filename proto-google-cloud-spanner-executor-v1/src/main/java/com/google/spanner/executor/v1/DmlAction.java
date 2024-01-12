/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/executor/v1/cloud_executor.proto

package com.google.spanner.executor.v1;

/**
 *
 *
 * <pre>
 * A single DML statement.
 * </pre>
 *
 * Protobuf type {@code google.spanner.executor.v1.DmlAction}
 */
public final class DmlAction extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.executor.v1.DmlAction)
    DmlActionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DmlAction.newBuilder() to construct.
  private DmlAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DmlAction() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DmlAction();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.spanner.executor.v1.CloudExecutorProto
        .internal_static_google_spanner_executor_v1_DmlAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.executor.v1.CloudExecutorProto
        .internal_static_google_spanner_executor_v1_DmlAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.executor.v1.DmlAction.class,
            com.google.spanner.executor.v1.DmlAction.Builder.class);
  }

  private int bitField0_;
  public static final int UPDATE_FIELD_NUMBER = 1;
  private com.google.spanner.executor.v1.QueryAction update_;
  /**
   *
   *
   * <pre>
   * DML statement.
   * </pre>
   *
   * <code>.google.spanner.executor.v1.QueryAction update = 1;</code>
   *
   * @return Whether the update field is set.
   */
  @java.lang.Override
  public boolean hasUpdate() {
    return update_ != null;
  }
  /**
   *
   *
   * <pre>
   * DML statement.
   * </pre>
   *
   * <code>.google.spanner.executor.v1.QueryAction update = 1;</code>
   *
   * @return The update.
   */
  @java.lang.Override
  public com.google.spanner.executor.v1.QueryAction getUpdate() {
    return update_ == null
        ? com.google.spanner.executor.v1.QueryAction.getDefaultInstance()
        : update_;
  }
  /**
   *
   *
   * <pre>
   * DML statement.
   * </pre>
   *
   * <code>.google.spanner.executor.v1.QueryAction update = 1;</code>
   */
  @java.lang.Override
  public com.google.spanner.executor.v1.QueryActionOrBuilder getUpdateOrBuilder() {
    return update_ == null
        ? com.google.spanner.executor.v1.QueryAction.getDefaultInstance()
        : update_;
  }

  public static final int AUTOCOMMIT_IF_SUPPORTED_FIELD_NUMBER = 2;
  private boolean autocommitIfSupported_ = false;
  /**
   *
   *
   * <pre>
   * Whether to autocommit the transaction after executing the DML statement,
   * if the Executor supports autocommit.
   * </pre>
   *
   * <code>optional bool autocommit_if_supported = 2;</code>
   *
   * @return Whether the autocommitIfSupported field is set.
   */
  @java.lang.Override
  public boolean hasAutocommitIfSupported() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Whether to autocommit the transaction after executing the DML statement,
   * if the Executor supports autocommit.
   * </pre>
   *
   * <code>optional bool autocommit_if_supported = 2;</code>
   *
   * @return The autocommitIfSupported.
   */
  @java.lang.Override
  public boolean getAutocommitIfSupported() {
    return autocommitIfSupported_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (update_ != null) {
      output.writeMessage(1, getUpdate());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(2, autocommitIfSupported_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (update_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getUpdate());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, autocommitIfSupported_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.spanner.executor.v1.DmlAction)) {
      return super.equals(obj);
    }
    com.google.spanner.executor.v1.DmlAction other = (com.google.spanner.executor.v1.DmlAction) obj;

    if (hasUpdate() != other.hasUpdate()) return false;
    if (hasUpdate()) {
      if (!getUpdate().equals(other.getUpdate())) return false;
    }
    if (hasAutocommitIfSupported() != other.hasAutocommitIfSupported()) return false;
    if (hasAutocommitIfSupported()) {
      if (getAutocommitIfSupported() != other.getAutocommitIfSupported()) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasUpdate()) {
      hash = (37 * hash) + UPDATE_FIELD_NUMBER;
      hash = (53 * hash) + getUpdate().hashCode();
    }
    if (hasAutocommitIfSupported()) {
      hash = (37 * hash) + AUTOCOMMIT_IF_SUPPORTED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAutocommitIfSupported());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.executor.v1.DmlAction parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.executor.v1.DmlAction parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.DmlAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.executor.v1.DmlAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.DmlAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.executor.v1.DmlAction parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.DmlAction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.executor.v1.DmlAction parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.DmlAction parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.executor.v1.DmlAction parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.DmlAction parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.executor.v1.DmlAction parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.spanner.executor.v1.DmlAction prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A single DML statement.
   * </pre>
   *
   * Protobuf type {@code google.spanner.executor.v1.DmlAction}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.executor.v1.DmlAction)
      com.google.spanner.executor.v1.DmlActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.executor.v1.CloudExecutorProto
          .internal_static_google_spanner_executor_v1_DmlAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.executor.v1.CloudExecutorProto
          .internal_static_google_spanner_executor_v1_DmlAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.executor.v1.DmlAction.class,
              com.google.spanner.executor.v1.DmlAction.Builder.class);
    }

    // Construct using com.google.spanner.executor.v1.DmlAction.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      update_ = null;
      if (updateBuilder_ != null) {
        updateBuilder_.dispose();
        updateBuilder_ = null;
      }
      autocommitIfSupported_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.executor.v1.CloudExecutorProto
          .internal_static_google_spanner_executor_v1_DmlAction_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.executor.v1.DmlAction getDefaultInstanceForType() {
      return com.google.spanner.executor.v1.DmlAction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.executor.v1.DmlAction build() {
      com.google.spanner.executor.v1.DmlAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.executor.v1.DmlAction buildPartial() {
      com.google.spanner.executor.v1.DmlAction result =
          new com.google.spanner.executor.v1.DmlAction(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.spanner.executor.v1.DmlAction result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.update_ = updateBuilder_ == null ? update_ : updateBuilder_.build();
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.autocommitIfSupported_ = autocommitIfSupported_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.spanner.executor.v1.DmlAction) {
        return mergeFrom((com.google.spanner.executor.v1.DmlAction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.executor.v1.DmlAction other) {
      if (other == com.google.spanner.executor.v1.DmlAction.getDefaultInstance()) return this;
      if (other.hasUpdate()) {
        mergeUpdate(other.getUpdate());
      }
      if (other.hasAutocommitIfSupported()) {
        setAutocommitIfSupported(other.getAutocommitIfSupported());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getUpdateFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                autocommitIfSupported_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.spanner.executor.v1.QueryAction update_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.executor.v1.QueryAction,
            com.google.spanner.executor.v1.QueryAction.Builder,
            com.google.spanner.executor.v1.QueryActionOrBuilder>
        updateBuilder_;
    /**
     *
     *
     * <pre>
     * DML statement.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.QueryAction update = 1;</code>
     *
     * @return Whether the update field is set.
     */
    public boolean hasUpdate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * DML statement.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.QueryAction update = 1;</code>
     *
     * @return The update.
     */
    public com.google.spanner.executor.v1.QueryAction getUpdate() {
      if (updateBuilder_ == null) {
        return update_ == null
            ? com.google.spanner.executor.v1.QueryAction.getDefaultInstance()
            : update_;
      } else {
        return updateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * DML statement.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.QueryAction update = 1;</code>
     */
    public Builder setUpdate(com.google.spanner.executor.v1.QueryAction value) {
      if (updateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        update_ = value;
      } else {
        updateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * DML statement.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.QueryAction update = 1;</code>
     */
    public Builder setUpdate(com.google.spanner.executor.v1.QueryAction.Builder builderForValue) {
      if (updateBuilder_ == null) {
        update_ = builderForValue.build();
      } else {
        updateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * DML statement.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.QueryAction update = 1;</code>
     */
    public Builder mergeUpdate(com.google.spanner.executor.v1.QueryAction value) {
      if (updateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && update_ != null
            && update_ != com.google.spanner.executor.v1.QueryAction.getDefaultInstance()) {
          getUpdateBuilder().mergeFrom(value);
        } else {
          update_ = value;
        }
      } else {
        updateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * DML statement.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.QueryAction update = 1;</code>
     */
    public Builder clearUpdate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      update_ = null;
      if (updateBuilder_ != null) {
        updateBuilder_.dispose();
        updateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * DML statement.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.QueryAction update = 1;</code>
     */
    public com.google.spanner.executor.v1.QueryAction.Builder getUpdateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUpdateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * DML statement.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.QueryAction update = 1;</code>
     */
    public com.google.spanner.executor.v1.QueryActionOrBuilder getUpdateOrBuilder() {
      if (updateBuilder_ != null) {
        return updateBuilder_.getMessageOrBuilder();
      } else {
        return update_ == null
            ? com.google.spanner.executor.v1.QueryAction.getDefaultInstance()
            : update_;
      }
    }
    /**
     *
     *
     * <pre>
     * DML statement.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.QueryAction update = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.executor.v1.QueryAction,
            com.google.spanner.executor.v1.QueryAction.Builder,
            com.google.spanner.executor.v1.QueryActionOrBuilder>
        getUpdateFieldBuilder() {
      if (updateBuilder_ == null) {
        updateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.spanner.executor.v1.QueryAction,
                com.google.spanner.executor.v1.QueryAction.Builder,
                com.google.spanner.executor.v1.QueryActionOrBuilder>(
                getUpdate(), getParentForChildren(), isClean());
        update_ = null;
      }
      return updateBuilder_;
    }

    private boolean autocommitIfSupported_;
    /**
     *
     *
     * <pre>
     * Whether to autocommit the transaction after executing the DML statement,
     * if the Executor supports autocommit.
     * </pre>
     *
     * <code>optional bool autocommit_if_supported = 2;</code>
     *
     * @return Whether the autocommitIfSupported field is set.
     */
    @java.lang.Override
    public boolean hasAutocommitIfSupported() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Whether to autocommit the transaction after executing the DML statement,
     * if the Executor supports autocommit.
     * </pre>
     *
     * <code>optional bool autocommit_if_supported = 2;</code>
     *
     * @return The autocommitIfSupported.
     */
    @java.lang.Override
    public boolean getAutocommitIfSupported() {
      return autocommitIfSupported_;
    }
    /**
     *
     *
     * <pre>
     * Whether to autocommit the transaction after executing the DML statement,
     * if the Executor supports autocommit.
     * </pre>
     *
     * <code>optional bool autocommit_if_supported = 2;</code>
     *
     * @param value The autocommitIfSupported to set.
     * @return This builder for chaining.
     */
    public Builder setAutocommitIfSupported(boolean value) {

      autocommitIfSupported_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether to autocommit the transaction after executing the DML statement,
     * if the Executor supports autocommit.
     * </pre>
     *
     * <code>optional bool autocommit_if_supported = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAutocommitIfSupported() {
      bitField0_ = (bitField0_ & ~0x00000002);
      autocommitIfSupported_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.spanner.executor.v1.DmlAction)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.executor.v1.DmlAction)
  private static final com.google.spanner.executor.v1.DmlAction DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.executor.v1.DmlAction();
  }

  public static com.google.spanner.executor.v1.DmlAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DmlAction> PARSER =
      new com.google.protobuf.AbstractParser<DmlAction>() {
        @java.lang.Override
        public DmlAction parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<DmlAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DmlAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.executor.v1.DmlAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}