/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-4-7")
public class CreateTopicRequest implements libthrift091.TBase<CreateTopicRequest, CreateTopicRequest._Fields>, java.io.Serializable, Cloneable, Comparable<CreateTopicRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("CreateTopicRequest");

  private static final libthrift091.protocol.TField TOPIC_NAME_FIELD_DESC = new libthrift091.protocol.TField("topicName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField TOPIC_ATTRIBUTE_FIELD_DESC = new libthrift091.protocol.TField("topicAttribute", libthrift091.protocol.TType.STRUCT, (short)2);
  private static final libthrift091.protocol.TField TOPIC_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("topicQuota", libthrift091.protocol.TType.STRUCT, (short)3);
  private static final libthrift091.protocol.TField ACL_MAP_FIELD_DESC = new libthrift091.protocol.TField("aclMap", libthrift091.protocol.TType.MAP, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CreateTopicRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CreateTopicRequestTupleSchemeFactory());
  }

  /**
   * Topic name;
   * 
   */
  public String topicName; // required
  /**
   * TopicAttribute for the topic, partitionNumber is required;
   * 
   */
  public TopicAttribute topicAttribute; // required
  /**
   * TopicQuota for the topic
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.BaseQuota topicQuota; // optional
  /**
   * TopicAcl for the topic
   * Note: Grantee must specified 'GrantType' and 'identifier', specifically,
   * the 'identifier' must be the 'appId'/'accountId' in openplatform of Xiaomi
   * 
   */
  public Map<com.xiaomi.infra.galaxy.rpc.thrift.Grantee,Permission> aclMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Topic name;
     * 
     */
    TOPIC_NAME((short)1, "topicName"),
    /**
     * TopicAttribute for the topic, partitionNumber is required;
     * 
     */
    TOPIC_ATTRIBUTE((short)2, "topicAttribute"),
    /**
     * TopicQuota for the topic
     * 
     */
    TOPIC_QUOTA((short)3, "topicQuota"),
    /**
     * TopicAcl for the topic
     * Note: Grantee must specified 'GrantType' and 'identifier', specifically,
     * the 'identifier' must be the 'appId'/'accountId' in openplatform of Xiaomi
     * 
     */
    ACL_MAP((short)4, "aclMap");

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
        case 1: // TOPIC_NAME
          return TOPIC_NAME;
        case 2: // TOPIC_ATTRIBUTE
          return TOPIC_ATTRIBUTE;
        case 3: // TOPIC_QUOTA
          return TOPIC_QUOTA;
        case 4: // ACL_MAP
          return ACL_MAP;
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
  private static final _Fields optionals[] = {_Fields.TOPIC_QUOTA,_Fields.ACL_MAP};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPIC_NAME, new libthrift091.meta_data.FieldMetaData("topicName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.TOPIC_ATTRIBUTE, new libthrift091.meta_data.FieldMetaData("topicAttribute", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, TopicAttribute.class)));
    tmpMap.put(_Fields.TOPIC_QUOTA, new libthrift091.meta_data.FieldMetaData("topicQuota", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.talos.thrift.BaseQuota.class)));
    tmpMap.put(_Fields.ACL_MAP, new libthrift091.meta_data.FieldMetaData("aclMap", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.rpc.thrift.Grantee.class), 
            new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, Permission.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(CreateTopicRequest.class, metaDataMap);
  }

  public CreateTopicRequest() {
  }

  public CreateTopicRequest(
    String topicName,
    TopicAttribute topicAttribute)
  {
    this();
    this.topicName = topicName;
    this.topicAttribute = topicAttribute;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CreateTopicRequest(CreateTopicRequest other) {
    if (other.isSetTopicName()) {
      this.topicName = other.topicName;
    }
    if (other.isSetTopicAttribute()) {
      this.topicAttribute = new TopicAttribute(other.topicAttribute);
    }
    if (other.isSetTopicQuota()) {
      this.topicQuota = new com.xiaomi.infra.galaxy.talos.thrift.BaseQuota(other.topicQuota);
    }
    if (other.isSetAclMap()) {
      Map<com.xiaomi.infra.galaxy.rpc.thrift.Grantee,Permission> __this__aclMap = new HashMap<com.xiaomi.infra.galaxy.rpc.thrift.Grantee,Permission>(other.aclMap.size());
      for (Map.Entry<com.xiaomi.infra.galaxy.rpc.thrift.Grantee, Permission> other_element : other.aclMap.entrySet()) {

        com.xiaomi.infra.galaxy.rpc.thrift.Grantee other_element_key = other_element.getKey();
        Permission other_element_value = other_element.getValue();

        com.xiaomi.infra.galaxy.rpc.thrift.Grantee __this__aclMap_copy_key = new com.xiaomi.infra.galaxy.rpc.thrift.Grantee(other_element_key);

        Permission __this__aclMap_copy_value = other_element_value;

        __this__aclMap.put(__this__aclMap_copy_key, __this__aclMap_copy_value);
      }
      this.aclMap = __this__aclMap;
    }
  }

  public CreateTopicRequest deepCopy() {
    return new CreateTopicRequest(this);
  }

  @Override
  public void clear() {
    this.topicName = null;
    this.topicAttribute = null;
    this.topicQuota = null;
    this.aclMap = null;
  }

  /**
   * Topic name;
   * 
   */
  public String getTopicName() {
    return this.topicName;
  }

  /**
   * Topic name;
   * 
   */
  public CreateTopicRequest setTopicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

  public void unsetTopicName() {
    this.topicName = null;
  }

  /** Returns true if field topicName is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicName() {
    return this.topicName != null;
  }

  public void setTopicNameIsSet(boolean value) {
    if (!value) {
      this.topicName = null;
    }
  }

  /**
   * TopicAttribute for the topic, partitionNumber is required;
   * 
   */
  public TopicAttribute getTopicAttribute() {
    return this.topicAttribute;
  }

  /**
   * TopicAttribute for the topic, partitionNumber is required;
   * 
   */
  public CreateTopicRequest setTopicAttribute(TopicAttribute topicAttribute) {
    this.topicAttribute = topicAttribute;
    return this;
  }

  public void unsetTopicAttribute() {
    this.topicAttribute = null;
  }

  /** Returns true if field topicAttribute is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicAttribute() {
    return this.topicAttribute != null;
  }

  public void setTopicAttributeIsSet(boolean value) {
    if (!value) {
      this.topicAttribute = null;
    }
  }

  /**
   * TopicQuota for the topic
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.BaseQuota getTopicQuota() {
    return this.topicQuota;
  }

  /**
   * TopicQuota for the topic
   * 
   */
  public CreateTopicRequest setTopicQuota(com.xiaomi.infra.galaxy.talos.thrift.BaseQuota topicQuota) {
    this.topicQuota = topicQuota;
    return this;
  }

  public void unsetTopicQuota() {
    this.topicQuota = null;
  }

  /** Returns true if field topicQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicQuota() {
    return this.topicQuota != null;
  }

  public void setTopicQuotaIsSet(boolean value) {
    if (!value) {
      this.topicQuota = null;
    }
  }

  public int getAclMapSize() {
    return (this.aclMap == null) ? 0 : this.aclMap.size();
  }

  public void putToAclMap(com.xiaomi.infra.galaxy.rpc.thrift.Grantee key, Permission val) {
    if (this.aclMap == null) {
      this.aclMap = new HashMap<com.xiaomi.infra.galaxy.rpc.thrift.Grantee,Permission>();
    }
    this.aclMap.put(key, val);
  }

  /**
   * TopicAcl for the topic
   * Note: Grantee must specified 'GrantType' and 'identifier', specifically,
   * the 'identifier' must be the 'appId'/'accountId' in openplatform of Xiaomi
   * 
   */
  public Map<com.xiaomi.infra.galaxy.rpc.thrift.Grantee,Permission> getAclMap() {
    return this.aclMap;
  }

  /**
   * TopicAcl for the topic
   * Note: Grantee must specified 'GrantType' and 'identifier', specifically,
   * the 'identifier' must be the 'appId'/'accountId' in openplatform of Xiaomi
   * 
   */
  public CreateTopicRequest setAclMap(Map<com.xiaomi.infra.galaxy.rpc.thrift.Grantee,Permission> aclMap) {
    this.aclMap = aclMap;
    return this;
  }

  public void unsetAclMap() {
    this.aclMap = null;
  }

  /** Returns true if field aclMap is set (has been assigned a value) and false otherwise */
  public boolean isSetAclMap() {
    return this.aclMap != null;
  }

  public void setAclMapIsSet(boolean value) {
    if (!value) {
      this.aclMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_NAME:
      if (value == null) {
        unsetTopicName();
      } else {
        setTopicName((String)value);
      }
      break;

    case TOPIC_ATTRIBUTE:
      if (value == null) {
        unsetTopicAttribute();
      } else {
        setTopicAttribute((TopicAttribute)value);
      }
      break;

    case TOPIC_QUOTA:
      if (value == null) {
        unsetTopicQuota();
      } else {
        setTopicQuota((com.xiaomi.infra.galaxy.talos.thrift.BaseQuota)value);
      }
      break;

    case ACL_MAP:
      if (value == null) {
        unsetAclMap();
      } else {
        setAclMap((Map<com.xiaomi.infra.galaxy.rpc.thrift.Grantee,Permission>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_NAME:
      return getTopicName();

    case TOPIC_ATTRIBUTE:
      return getTopicAttribute();

    case TOPIC_QUOTA:
      return getTopicQuota();

    case ACL_MAP:
      return getAclMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_NAME:
      return isSetTopicName();
    case TOPIC_ATTRIBUTE:
      return isSetTopicAttribute();
    case TOPIC_QUOTA:
      return isSetTopicQuota();
    case ACL_MAP:
      return isSetAclMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CreateTopicRequest)
      return this.equals((CreateTopicRequest)that);
    return false;
  }

  public boolean equals(CreateTopicRequest that) {
    if (that == null)
      return false;

    boolean this_present_topicName = true && this.isSetTopicName();
    boolean that_present_topicName = true && that.isSetTopicName();
    if (this_present_topicName || that_present_topicName) {
      if (!(this_present_topicName && that_present_topicName))
        return false;
      if (!this.topicName.equals(that.topicName))
        return false;
    }

    boolean this_present_topicAttribute = true && this.isSetTopicAttribute();
    boolean that_present_topicAttribute = true && that.isSetTopicAttribute();
    if (this_present_topicAttribute || that_present_topicAttribute) {
      if (!(this_present_topicAttribute && that_present_topicAttribute))
        return false;
      if (!this.topicAttribute.equals(that.topicAttribute))
        return false;
    }

    boolean this_present_topicQuota = true && this.isSetTopicQuota();
    boolean that_present_topicQuota = true && that.isSetTopicQuota();
    if (this_present_topicQuota || that_present_topicQuota) {
      if (!(this_present_topicQuota && that_present_topicQuota))
        return false;
      if (!this.topicQuota.equals(that.topicQuota))
        return false;
    }

    boolean this_present_aclMap = true && this.isSetAclMap();
    boolean that_present_aclMap = true && that.isSetAclMap();
    if (this_present_aclMap || that_present_aclMap) {
      if (!(this_present_aclMap && that_present_aclMap))
        return false;
      if (!this.aclMap.equals(that.aclMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topicName = true && (isSetTopicName());
    list.add(present_topicName);
    if (present_topicName)
      list.add(topicName);

    boolean present_topicAttribute = true && (isSetTopicAttribute());
    list.add(present_topicAttribute);
    if (present_topicAttribute)
      list.add(topicAttribute);

    boolean present_topicQuota = true && (isSetTopicQuota());
    list.add(present_topicQuota);
    if (present_topicQuota)
      list.add(topicQuota);

    boolean present_aclMap = true && (isSetAclMap());
    list.add(present_aclMap);
    if (present_aclMap)
      list.add(aclMap);

    return list.hashCode();
  }

  @Override
  public int compareTo(CreateTopicRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicName()).compareTo(other.isSetTopicName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicName, other.topicName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopicAttribute()).compareTo(other.isSetTopicAttribute());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicAttribute()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicAttribute, other.topicAttribute);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopicQuota()).compareTo(other.isSetTopicQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicQuota, other.topicQuota);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAclMap()).compareTo(other.isSetAclMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAclMap()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.aclMap, other.aclMap);
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
    StringBuilder sb = new StringBuilder("CreateTopicRequest(");
    boolean first = true;

    sb.append("topicName:");
    if (this.topicName == null) {
      sb.append("null");
    } else {
      sb.append(this.topicName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("topicAttribute:");
    if (this.topicAttribute == null) {
      sb.append("null");
    } else {
      sb.append(this.topicAttribute);
    }
    first = false;
    if (isSetTopicQuota()) {
      if (!first) sb.append(", ");
      sb.append("topicQuota:");
      if (this.topicQuota == null) {
        sb.append("null");
      } else {
        sb.append(this.topicQuota);
      }
      first = false;
    }
    if (isSetAclMap()) {
      if (!first) sb.append(", ");
      sb.append("aclMap:");
      if (this.aclMap == null) {
        sb.append("null");
      } else {
        sb.append(this.aclMap);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicName' was not present! Struct: " + toString());
    }
    if (topicAttribute == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicAttribute' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (topicAttribute != null) {
      topicAttribute.validate();
    }
    if (topicQuota != null) {
      topicQuota.validate();
    }
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CreateTopicRequestStandardSchemeFactory implements SchemeFactory {
    public CreateTopicRequestStandardScheme getScheme() {
      return new CreateTopicRequestStandardScheme();
    }
  }

  private static class CreateTopicRequestStandardScheme extends StandardScheme<CreateTopicRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, CreateTopicRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.topicName = iprot.readString();
              struct.setTopicNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOPIC_ATTRIBUTE
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicAttribute = new TopicAttribute();
              struct.topicAttribute.read(iprot);
              struct.setTopicAttributeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOPIC_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicQuota = new com.xiaomi.infra.galaxy.talos.thrift.BaseQuota();
              struct.topicQuota.read(iprot);
              struct.setTopicQuotaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ACL_MAP
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map28 = iprot.readMapBegin();
                struct.aclMap = new HashMap<com.xiaomi.infra.galaxy.rpc.thrift.Grantee,Permission>(2*_map28.size);
                com.xiaomi.infra.galaxy.rpc.thrift.Grantee _key29;
                Permission _val30;
                for (int _i31 = 0; _i31 < _map28.size; ++_i31)
                {
                  _key29 = new com.xiaomi.infra.galaxy.rpc.thrift.Grantee();
                  _key29.read(iprot);
                  _val30 = com.xiaomi.infra.galaxy.talos.thrift.Permission.findByValue(iprot.readI32());
                  struct.aclMap.put(_key29, _val30);
                }
                iprot.readMapEnd();
              }
              struct.setAclMapIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, CreateTopicRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicName != null) {
        oprot.writeFieldBegin(TOPIC_NAME_FIELD_DESC);
        oprot.writeString(struct.topicName);
        oprot.writeFieldEnd();
      }
      if (struct.topicAttribute != null) {
        oprot.writeFieldBegin(TOPIC_ATTRIBUTE_FIELD_DESC);
        struct.topicAttribute.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.topicQuota != null) {
        if (struct.isSetTopicQuota()) {
          oprot.writeFieldBegin(TOPIC_QUOTA_FIELD_DESC);
          struct.topicQuota.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.aclMap != null) {
        if (struct.isSetAclMap()) {
          oprot.writeFieldBegin(ACL_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRUCT, libthrift091.protocol.TType.I32, struct.aclMap.size()));
            for (Map.Entry<com.xiaomi.infra.galaxy.rpc.thrift.Grantee, Permission> _iter32 : struct.aclMap.entrySet())
            {
              _iter32.getKey().write(oprot);
              oprot.writeI32(_iter32.getValue().getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CreateTopicRequestTupleSchemeFactory implements SchemeFactory {
    public CreateTopicRequestTupleScheme getScheme() {
      return new CreateTopicRequestTupleScheme();
    }
  }

  private static class CreateTopicRequestTupleScheme extends TupleScheme<CreateTopicRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, CreateTopicRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.topicName);
      struct.topicAttribute.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetTopicQuota()) {
        optionals.set(0);
      }
      if (struct.isSetAclMap()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTopicQuota()) {
        struct.topicQuota.write(oprot);
      }
      if (struct.isSetAclMap()) {
        {
          oprot.writeI32(struct.aclMap.size());
          for (Map.Entry<com.xiaomi.infra.galaxy.rpc.thrift.Grantee, Permission> _iter33 : struct.aclMap.entrySet())
          {
            _iter33.getKey().write(oprot);
            oprot.writeI32(_iter33.getValue().getValue());
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, CreateTopicRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topicName = iprot.readString();
      struct.setTopicNameIsSet(true);
      struct.topicAttribute = new TopicAttribute();
      struct.topicAttribute.read(iprot);
      struct.setTopicAttributeIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.topicQuota = new com.xiaomi.infra.galaxy.talos.thrift.BaseQuota();
        struct.topicQuota.read(iprot);
        struct.setTopicQuotaIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TMap _map34 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRUCT, libthrift091.protocol.TType.I32, iprot.readI32());
          struct.aclMap = new HashMap<com.xiaomi.infra.galaxy.rpc.thrift.Grantee,Permission>(2*_map34.size);
          com.xiaomi.infra.galaxy.rpc.thrift.Grantee _key35;
          Permission _val36;
          for (int _i37 = 0; _i37 < _map34.size; ++_i37)
          {
            _key35 = new com.xiaomi.infra.galaxy.rpc.thrift.Grantee();
            _key35.read(iprot);
            _val36 = com.xiaomi.infra.galaxy.talos.thrift.Permission.findByValue(iprot.readI32());
            struct.aclMap.put(_key35, _val36);
          }
        }
        struct.setAclMapIsSet(true);
      }
    }
  }

}
