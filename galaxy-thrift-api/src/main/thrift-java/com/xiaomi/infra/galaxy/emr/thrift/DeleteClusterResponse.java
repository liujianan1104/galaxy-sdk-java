/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emr.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2019-3-7")
public class DeleteClusterResponse implements libthrift091.TBase<DeleteClusterResponse, DeleteClusterResponse._Fields>, java.io.Serializable, Cloneable, Comparable<DeleteClusterResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("DeleteClusterResponse");

  private static final libthrift091.protocol.TField CLUSTER_ID_FIELD_DESC = new libthrift091.protocol.TField("clusterId", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField SUCCEED_FIELD_DESC = new libthrift091.protocol.TField("succeed", libthrift091.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeleteClusterResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeleteClusterResponseTupleSchemeFactory());
  }

  public String clusterId; // required
  public boolean succeed; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    CLUSTER_ID((short)1, "clusterId"),
    SUCCEED((short)2, "succeed");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CLUSTER_ID
          return CLUSTER_ID;
        case 2: // SUCCEED
          return SUCCEED;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SUCCEED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLUSTER_ID, new libthrift091.meta_data.FieldMetaData("clusterId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.SUCCEED, new libthrift091.meta_data.FieldMetaData("succeed", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(DeleteClusterResponse.class, metaDataMap);
  }

  public DeleteClusterResponse() {
  }

  public DeleteClusterResponse(
    String clusterId,
    boolean succeed)
  {
    this();
    this.clusterId = clusterId;
    this.succeed = succeed;
    setSucceedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeleteClusterResponse(DeleteClusterResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetClusterId()) {
      this.clusterId = other.clusterId;
    }
    this.succeed = other.succeed;
  }

  public DeleteClusterResponse deepCopy() {
    return new DeleteClusterResponse(this);
  }

  @Override
  public void clear() {
    this.clusterId = null;
    setSucceedIsSet(false);
    this.succeed = false;
  }

  public String getClusterId() {
    return this.clusterId;
  }

  public DeleteClusterResponse setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public void unsetClusterId() {
    this.clusterId = null;
  }

  /** Returns true if field clusterId is set (has been assigned a value) and false otherwise */
  public boolean isSetClusterId() {
    return this.clusterId != null;
  }

  public void setClusterIdIsSet(boolean value) {
    if (!value) {
      this.clusterId = null;
    }
  }

  public boolean isSucceed() {
    return this.succeed;
  }

  public DeleteClusterResponse setSucceed(boolean succeed) {
    this.succeed = succeed;
    setSucceedIsSet(true);
    return this;
  }

  public void unsetSucceed() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUCCEED_ISSET_ID);
  }

  /** Returns true if field succeed is set (has been assigned a value) and false otherwise */
  public boolean isSetSucceed() {
    return EncodingUtils.testBit(__isset_bitfield, __SUCCEED_ISSET_ID);
  }

  public void setSucceedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUCCEED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CLUSTER_ID:
      if (value == null) {
        unsetClusterId();
      } else {
        setClusterId((String)value);
      }
      break;

    case SUCCEED:
      if (value == null) {
        unsetSucceed();
      } else {
        setSucceed((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CLUSTER_ID:
      return getClusterId();

    case SUCCEED:
      return Boolean.valueOf(isSucceed());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CLUSTER_ID:
      return isSetClusterId();
    case SUCCEED:
      return isSetSucceed();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeleteClusterResponse)
      return this.equals((DeleteClusterResponse)that);
    return false;
  }

  public boolean equals(DeleteClusterResponse that) {
    if (that == null)
      return false;

    boolean this_present_clusterId = true && this.isSetClusterId();
    boolean that_present_clusterId = true && that.isSetClusterId();
    if (this_present_clusterId || that_present_clusterId) {
      if (!(this_present_clusterId && that_present_clusterId))
        return false;
      if (!this.clusterId.equals(that.clusterId))
        return false;
    }

    boolean this_present_succeed = true;
    boolean that_present_succeed = true;
    if (this_present_succeed || that_present_succeed) {
      if (!(this_present_succeed && that_present_succeed))
        return false;
      if (this.succeed != that.succeed)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_clusterId = true && (isSetClusterId());
    list.add(present_clusterId);
    if (present_clusterId)
      list.add(clusterId);

    boolean present_succeed = true;
    list.add(present_succeed);
    if (present_succeed)
      list.add(succeed);

    return list.hashCode();
  }

  @Override
  public int compareTo(DeleteClusterResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetClusterId()).compareTo(other.isSetClusterId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClusterId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.clusterId, other.clusterId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSucceed()).compareTo(other.isSetSucceed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSucceed()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.succeed, other.succeed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DeleteClusterResponse(");
    boolean first = true;

    sb.append("clusterId:");
    if (this.clusterId == null) {
      sb.append("null");
    } else {
      sb.append(this.clusterId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("succeed:");
    sb.append(this.succeed);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (clusterId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'clusterId' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'succeed' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DeleteClusterResponseStandardSchemeFactory implements SchemeFactory {
    public DeleteClusterResponseStandardScheme getScheme() {
      return new DeleteClusterResponseStandardScheme();
    }
  }

  private static class DeleteClusterResponseStandardScheme extends StandardScheme<DeleteClusterResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, DeleteClusterResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLUSTER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.clusterId = iprot.readString();
              struct.setClusterIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SUCCEED
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.succeed = iprot.readBool();
              struct.setSucceedIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetSucceed()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'succeed' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, DeleteClusterResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.clusterId != null) {
        oprot.writeFieldBegin(CLUSTER_ID_FIELD_DESC);
        oprot.writeString(struct.clusterId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SUCCEED_FIELD_DESC);
      oprot.writeBool(struct.succeed);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DeleteClusterResponseTupleSchemeFactory implements SchemeFactory {
    public DeleteClusterResponseTupleScheme getScheme() {
      return new DeleteClusterResponseTupleScheme();
    }
  }

  private static class DeleteClusterResponseTupleScheme extends TupleScheme<DeleteClusterResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, DeleteClusterResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.clusterId);
      oprot.writeBool(struct.succeed);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, DeleteClusterResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.clusterId = iprot.readString();
      struct.setClusterIdIsSet(true);
      struct.succeed = iprot.readBool();
      struct.setSucceedIsSet(true);
    }
  }

}

