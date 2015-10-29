/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

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
/**
 * 增量数据的消费请求回执
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-29")
public class EditCommitRequest implements libthrift091.TBase<EditCommitRequest, EditCommitRequest._Fields>, java.io.Serializable, Cloneable, Comparable<EditCommitRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("EditCommitRequest");

  private static final libthrift091.protocol.TField TABLE_NAME_FIELD_DESC = new libthrift091.protocol.TField("tableName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField PARTITION_ID_FIELD_DESC = new libthrift091.protocol.TField("partitionId", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField SUBSCRIBER_NAME_FIELD_DESC = new libthrift091.protocol.TField("subscriberName", libthrift091.protocol.TType.STRING, (short)3);
  private static final libthrift091.protocol.TField LAST_CONSUMED_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("lastConsumedOffset", libthrift091.protocol.TType.I64, (short)4);
  private static final libthrift091.protocol.TField COMMIT_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("commitNumber", libthrift091.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EditCommitRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EditCommitRequestTupleSchemeFactory());
  }

  /**
   * 表名
   */
  public String tableName; // optional
  /**
   * 表分区ID
   */
  public int partitionId; // optional
  /**
   * 订阅者名字
   */
  public String subscriberName; // optional
  /**
   * 当前消费增量数据的最后偏移
   */
  public long lastConsumedOffset; // optional
  /**
   * 确认消费数量
   */
  public int commitNumber; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 表名
     */
    TABLE_NAME((short)1, "tableName"),
    /**
     * 表分区ID
     */
    PARTITION_ID((short)2, "partitionId"),
    /**
     * 订阅者名字
     */
    SUBSCRIBER_NAME((short)3, "subscriberName"),
    /**
     * 当前消费增量数据的最后偏移
     */
    LAST_CONSUMED_OFFSET((short)4, "lastConsumedOffset"),
    /**
     * 确认消费数量
     */
    COMMIT_NUMBER((short)5, "commitNumber");

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
        case 1: // TABLE_NAME
          return TABLE_NAME;
        case 2: // PARTITION_ID
          return PARTITION_ID;
        case 3: // SUBSCRIBER_NAME
          return SUBSCRIBER_NAME;
        case 4: // LAST_CONSUMED_OFFSET
          return LAST_CONSUMED_OFFSET;
        case 5: // COMMIT_NUMBER
          return COMMIT_NUMBER;
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
  private static final int __PARTITIONID_ISSET_ID = 0;
  private static final int __LASTCONSUMEDOFFSET_ISSET_ID = 1;
  private static final int __COMMITNUMBER_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TABLE_NAME,_Fields.PARTITION_ID,_Fields.SUBSCRIBER_NAME,_Fields.LAST_CONSUMED_OFFSET,_Fields.COMMIT_NUMBER};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new libthrift091.meta_data.FieldMetaData("tableName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARTITION_ID, new libthrift091.meta_data.FieldMetaData("partitionId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.SUBSCRIBER_NAME, new libthrift091.meta_data.FieldMetaData("subscriberName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.LAST_CONSUMED_OFFSET, new libthrift091.meta_data.FieldMetaData("lastConsumedOffset", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.COMMIT_NUMBER, new libthrift091.meta_data.FieldMetaData("commitNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(EditCommitRequest.class, metaDataMap);
  }

  public EditCommitRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EditCommitRequest(EditCommitRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    this.partitionId = other.partitionId;
    if (other.isSetSubscriberName()) {
      this.subscriberName = other.subscriberName;
    }
    this.lastConsumedOffset = other.lastConsumedOffset;
    this.commitNumber = other.commitNumber;
  }

  public EditCommitRequest deepCopy() {
    return new EditCommitRequest(this);
  }

  @Override
  public void clear() {
    this.tableName = null;
    setPartitionIdIsSet(false);
    this.partitionId = 0;
    this.subscriberName = null;
    setLastConsumedOffsetIsSet(false);
    this.lastConsumedOffset = 0;
    setCommitNumberIsSet(false);
    this.commitNumber = 0;
  }

  /**
   * 表名
   */
  public String getTableName() {
    return this.tableName;
  }

  /**
   * 表名
   */
  public EditCommitRequest setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  /**
   * 表分区ID
   */
  public int getPartitionId() {
    return this.partitionId;
  }

  /**
   * 表分区ID
   */
  public EditCommitRequest setPartitionId(int partitionId) {
    this.partitionId = partitionId;
    setPartitionIdIsSet(true);
    return this;
  }

  public void unsetPartitionId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PARTITIONID_ISSET_ID);
  }

  /** Returns true if field partitionId is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionId() {
    return EncodingUtils.testBit(__isset_bitfield, __PARTITIONID_ISSET_ID);
  }

  public void setPartitionIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PARTITIONID_ISSET_ID, value);
  }

  /**
   * 订阅者名字
   */
  public String getSubscriberName() {
    return this.subscriberName;
  }

  /**
   * 订阅者名字
   */
  public EditCommitRequest setSubscriberName(String subscriberName) {
    this.subscriberName = subscriberName;
    return this;
  }

  public void unsetSubscriberName() {
    this.subscriberName = null;
  }

  /** Returns true if field subscriberName is set (has been assigned a value) and false otherwise */
  public boolean isSetSubscriberName() {
    return this.subscriberName != null;
  }

  public void setSubscriberNameIsSet(boolean value) {
    if (!value) {
      this.subscriberName = null;
    }
  }

  /**
   * 当前消费增量数据的最后偏移
   */
  public long getLastConsumedOffset() {
    return this.lastConsumedOffset;
  }

  /**
   * 当前消费增量数据的最后偏移
   */
  public EditCommitRequest setLastConsumedOffset(long lastConsumedOffset) {
    this.lastConsumedOffset = lastConsumedOffset;
    setLastConsumedOffsetIsSet(true);
    return this;
  }

  public void unsetLastConsumedOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTCONSUMEDOFFSET_ISSET_ID);
  }

  /** Returns true if field lastConsumedOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetLastConsumedOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTCONSUMEDOFFSET_ISSET_ID);
  }

  public void setLastConsumedOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTCONSUMEDOFFSET_ISSET_ID, value);
  }

  /**
   * 确认消费数量
   */
  public int getCommitNumber() {
    return this.commitNumber;
  }

  /**
   * 确认消费数量
   */
  public EditCommitRequest setCommitNumber(int commitNumber) {
    this.commitNumber = commitNumber;
    setCommitNumberIsSet(true);
    return this;
  }

  public void unsetCommitNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COMMITNUMBER_ISSET_ID);
  }

  /** Returns true if field commitNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetCommitNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __COMMITNUMBER_ISSET_ID);
  }

  public void setCommitNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COMMITNUMBER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((String)value);
      }
      break;

    case PARTITION_ID:
      if (value == null) {
        unsetPartitionId();
      } else {
        setPartitionId((Integer)value);
      }
      break;

    case SUBSCRIBER_NAME:
      if (value == null) {
        unsetSubscriberName();
      } else {
        setSubscriberName((String)value);
      }
      break;

    case LAST_CONSUMED_OFFSET:
      if (value == null) {
        unsetLastConsumedOffset();
      } else {
        setLastConsumedOffset((Long)value);
      }
      break;

    case COMMIT_NUMBER:
      if (value == null) {
        unsetCommitNumber();
      } else {
        setCommitNumber((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTableName();

    case PARTITION_ID:
      return Integer.valueOf(getPartitionId());

    case SUBSCRIBER_NAME:
      return getSubscriberName();

    case LAST_CONSUMED_OFFSET:
      return Long.valueOf(getLastConsumedOffset());

    case COMMIT_NUMBER:
      return Integer.valueOf(getCommitNumber());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TABLE_NAME:
      return isSetTableName();
    case PARTITION_ID:
      return isSetPartitionId();
    case SUBSCRIBER_NAME:
      return isSetSubscriberName();
    case LAST_CONSUMED_OFFSET:
      return isSetLastConsumedOffset();
    case COMMIT_NUMBER:
      return isSetCommitNumber();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EditCommitRequest)
      return this.equals((EditCommitRequest)that);
    return false;
  }

  public boolean equals(EditCommitRequest that) {
    if (that == null)
      return false;

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_partitionId = true && this.isSetPartitionId();
    boolean that_present_partitionId = true && that.isSetPartitionId();
    if (this_present_partitionId || that_present_partitionId) {
      if (!(this_present_partitionId && that_present_partitionId))
        return false;
      if (this.partitionId != that.partitionId)
        return false;
    }

    boolean this_present_subscriberName = true && this.isSetSubscriberName();
    boolean that_present_subscriberName = true && that.isSetSubscriberName();
    if (this_present_subscriberName || that_present_subscriberName) {
      if (!(this_present_subscriberName && that_present_subscriberName))
        return false;
      if (!this.subscriberName.equals(that.subscriberName))
        return false;
    }

    boolean this_present_lastConsumedOffset = true && this.isSetLastConsumedOffset();
    boolean that_present_lastConsumedOffset = true && that.isSetLastConsumedOffset();
    if (this_present_lastConsumedOffset || that_present_lastConsumedOffset) {
      if (!(this_present_lastConsumedOffset && that_present_lastConsumedOffset))
        return false;
      if (this.lastConsumedOffset != that.lastConsumedOffset)
        return false;
    }

    boolean this_present_commitNumber = true && this.isSetCommitNumber();
    boolean that_present_commitNumber = true && that.isSetCommitNumber();
    if (this_present_commitNumber || that_present_commitNumber) {
      if (!(this_present_commitNumber && that_present_commitNumber))
        return false;
      if (this.commitNumber != that.commitNumber)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tableName = true && (isSetTableName());
    list.add(present_tableName);
    if (present_tableName)
      list.add(tableName);

    boolean present_partitionId = true && (isSetPartitionId());
    list.add(present_partitionId);
    if (present_partitionId)
      list.add(partitionId);

    boolean present_subscriberName = true && (isSetSubscriberName());
    list.add(present_subscriberName);
    if (present_subscriberName)
      list.add(subscriberName);

    boolean present_lastConsumedOffset = true && (isSetLastConsumedOffset());
    list.add(present_lastConsumedOffset);
    if (present_lastConsumedOffset)
      list.add(lastConsumedOffset);

    boolean present_commitNumber = true && (isSetCommitNumber());
    list.add(present_commitNumber);
    if (present_commitNumber)
      list.add(commitNumber);

    return list.hashCode();
  }

  @Override
  public int compareTo(EditCommitRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTableName()).compareTo(other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.tableName, other.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartitionId()).compareTo(other.isSetPartitionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.partitionId, other.partitionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSubscriberName()).compareTo(other.isSetSubscriberName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubscriberName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.subscriberName, other.subscriberName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastConsumedOffset()).compareTo(other.isSetLastConsumedOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastConsumedOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.lastConsumedOffset, other.lastConsumedOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCommitNumber()).compareTo(other.isSetCommitNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommitNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.commitNumber, other.commitNumber);
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
    StringBuilder sb = new StringBuilder("EditCommitRequest(");
    boolean first = true;

    if (isSetTableName()) {
      sb.append("tableName:");
      if (this.tableName == null) {
        sb.append("null");
      } else {
        sb.append(this.tableName);
      }
      first = false;
    }
    if (isSetPartitionId()) {
      if (!first) sb.append(", ");
      sb.append("partitionId:");
      sb.append(this.partitionId);
      first = false;
    }
    if (isSetSubscriberName()) {
      if (!first) sb.append(", ");
      sb.append("subscriberName:");
      if (this.subscriberName == null) {
        sb.append("null");
      } else {
        sb.append(this.subscriberName);
      }
      first = false;
    }
    if (isSetLastConsumedOffset()) {
      if (!first) sb.append(", ");
      sb.append("lastConsumedOffset:");
      sb.append(this.lastConsumedOffset);
      first = false;
    }
    if (isSetCommitNumber()) {
      if (!first) sb.append(", ");
      sb.append("commitNumber:");
      sb.append(this.commitNumber);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
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

  private static class EditCommitRequestStandardSchemeFactory implements SchemeFactory {
    public EditCommitRequestStandardScheme getScheme() {
      return new EditCommitRequestStandardScheme();
    }
  }

  private static class EditCommitRequestStandardScheme extends StandardScheme<EditCommitRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, EditCommitRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARTITION_ID
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.partitionId = iprot.readI32();
              struct.setPartitionIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SUBSCRIBER_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.subscriberName = iprot.readString();
              struct.setSubscriberNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LAST_CONSUMED_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.lastConsumedOffset = iprot.readI64();
              struct.setLastConsumedOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // COMMIT_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.commitNumber = iprot.readI32();
              struct.setCommitNumberIsSet(true);
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
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, EditCommitRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tableName != null) {
        if (struct.isSetTableName()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.tableName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetPartitionId()) {
        oprot.writeFieldBegin(PARTITION_ID_FIELD_DESC);
        oprot.writeI32(struct.partitionId);
        oprot.writeFieldEnd();
      }
      if (struct.subscriberName != null) {
        if (struct.isSetSubscriberName()) {
          oprot.writeFieldBegin(SUBSCRIBER_NAME_FIELD_DESC);
          oprot.writeString(struct.subscriberName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetLastConsumedOffset()) {
        oprot.writeFieldBegin(LAST_CONSUMED_OFFSET_FIELD_DESC);
        oprot.writeI64(struct.lastConsumedOffset);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCommitNumber()) {
        oprot.writeFieldBegin(COMMIT_NUMBER_FIELD_DESC);
        oprot.writeI32(struct.commitNumber);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EditCommitRequestTupleSchemeFactory implements SchemeFactory {
    public EditCommitRequestTupleScheme getScheme() {
      return new EditCommitRequestTupleScheme();
    }
  }

  private static class EditCommitRequestTupleScheme extends TupleScheme<EditCommitRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, EditCommitRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTableName()) {
        optionals.set(0);
      }
      if (struct.isSetPartitionId()) {
        optionals.set(1);
      }
      if (struct.isSetSubscriberName()) {
        optionals.set(2);
      }
      if (struct.isSetLastConsumedOffset()) {
        optionals.set(3);
      }
      if (struct.isSetCommitNumber()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetTableName()) {
        oprot.writeString(struct.tableName);
      }
      if (struct.isSetPartitionId()) {
        oprot.writeI32(struct.partitionId);
      }
      if (struct.isSetSubscriberName()) {
        oprot.writeString(struct.subscriberName);
      }
      if (struct.isSetLastConsumedOffset()) {
        oprot.writeI64(struct.lastConsumedOffset);
      }
      if (struct.isSetCommitNumber()) {
        oprot.writeI32(struct.commitNumber);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, EditCommitRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.tableName = iprot.readString();
        struct.setTableNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.partitionId = iprot.readI32();
        struct.setPartitionIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.subscriberName = iprot.readString();
        struct.setSubscriberNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.lastConsumedOffset = iprot.readI64();
        struct.setLastConsumedOffsetIsSet(true);
      }
      if (incoming.get(4)) {
        struct.commitNumber = iprot.readI32();
        struct.setCommitNumberIsSet(true);
      }
    }
  }

}

