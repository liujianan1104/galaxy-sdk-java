/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emq.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-10")
public class Version implements libthrift091.TBase<Version, Version._Fields>, java.io.Serializable, Cloneable, Comparable<Version> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("Version");

  private static final libthrift091.protocol.TField MAJOR_FIELD_DESC = new libthrift091.protocol.TField("major", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField MINOR_FIELD_DESC = new libthrift091.protocol.TField("minor", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField REVISION_FIELD_DESC = new libthrift091.protocol.TField("revision", libthrift091.protocol.TType.I32, (short)3);
  private static final libthrift091.protocol.TField DATE_FIELD_DESC = new libthrift091.protocol.TField("date", libthrift091.protocol.TType.STRING, (short)4);
  private static final libthrift091.protocol.TField DETAILS_FIELD_DESC = new libthrift091.protocol.TField("details", libthrift091.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new VersionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new VersionTupleSchemeFactory());
  }

  /**
   * The major version number;
   * 
   */
  public int major; // required
  /**
   * The minor version number;
   * 
   */
  public int minor; // required
  /**
   * The revision number;
   * 
   */
  public int revision; // required
  /**
   * The date for release this version;
   * 
   */
  public String date; // required
  /**
   * The version details;
   * 
   */
  public String details; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The major version number;
     * 
     */
    MAJOR((short)1, "major"),
    /**
     * The minor version number;
     * 
     */
    MINOR((short)2, "minor"),
    /**
     * The revision number;
     * 
     */
    REVISION((short)3, "revision"),
    /**
     * The date for release this version;
     * 
     */
    DATE((short)4, "date"),
    /**
     * The version details;
     * 
     */
    DETAILS((short)5, "details");

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
        case 1: // MAJOR
          return MAJOR;
        case 2: // MINOR
          return MINOR;
        case 3: // REVISION
          return REVISION;
        case 4: // DATE
          return DATE;
        case 5: // DETAILS
          return DETAILS;
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
  private static final int __MAJOR_ISSET_ID = 0;
  private static final int __MINOR_ISSET_ID = 1;
  private static final int __REVISION_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DETAILS};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MAJOR, new libthrift091.meta_data.FieldMetaData("major", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.MINOR, new libthrift091.meta_data.FieldMetaData("minor", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.REVISION, new libthrift091.meta_data.FieldMetaData("revision", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.DATE, new libthrift091.meta_data.FieldMetaData("date", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.DETAILS, new libthrift091.meta_data.FieldMetaData("details", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(Version.class, metaDataMap);
  }

  public Version() {
    this.major = 1;

    this.minor = 0;

    this.revision = 0;

    this.date = "19700101";

    this.details = "";

  }

  public Version(
    int major,
    int minor,
    int revision,
    String date)
  {
    this();
    this.major = major;
    setMajorIsSet(true);
    this.minor = minor;
    setMinorIsSet(true);
    this.revision = revision;
    setRevisionIsSet(true);
    this.date = date;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Version(Version other) {
    __isset_bitfield = other.__isset_bitfield;
    this.major = other.major;
    this.minor = other.minor;
    this.revision = other.revision;
    if (other.isSetDate()) {
      this.date = other.date;
    }
    if (other.isSetDetails()) {
      this.details = other.details;
    }
  }

  public Version deepCopy() {
    return new Version(this);
  }

  @Override
  public void clear() {
    this.major = 1;

    this.minor = 0;

    this.revision = 0;

    this.date = "19700101";

    this.details = "";

  }

  /**
   * The major version number;
   * 
   */
  public int getMajor() {
    return this.major;
  }

  /**
   * The major version number;
   * 
   */
  public Version setMajor(int major) {
    this.major = major;
    setMajorIsSet(true);
    return this;
  }

  public void unsetMajor() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAJOR_ISSET_ID);
  }

  /** Returns true if field major is set (has been assigned a value) and false otherwise */
  public boolean isSetMajor() {
    return EncodingUtils.testBit(__isset_bitfield, __MAJOR_ISSET_ID);
  }

  public void setMajorIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAJOR_ISSET_ID, value);
  }

  /**
   * The minor version number;
   * 
   */
  public int getMinor() {
    return this.minor;
  }

  /**
   * The minor version number;
   * 
   */
  public Version setMinor(int minor) {
    this.minor = minor;
    setMinorIsSet(true);
    return this;
  }

  public void unsetMinor() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MINOR_ISSET_ID);
  }

  /** Returns true if field minor is set (has been assigned a value) and false otherwise */
  public boolean isSetMinor() {
    return EncodingUtils.testBit(__isset_bitfield, __MINOR_ISSET_ID);
  }

  public void setMinorIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MINOR_ISSET_ID, value);
  }

  /**
   * The revision number;
   * 
   */
  public int getRevision() {
    return this.revision;
  }

  /**
   * The revision number;
   * 
   */
  public Version setRevision(int revision) {
    this.revision = revision;
    setRevisionIsSet(true);
    return this;
  }

  public void unsetRevision() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REVISION_ISSET_ID);
  }

  /** Returns true if field revision is set (has been assigned a value) and false otherwise */
  public boolean isSetRevision() {
    return EncodingUtils.testBit(__isset_bitfield, __REVISION_ISSET_ID);
  }

  public void setRevisionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REVISION_ISSET_ID, value);
  }

  /**
   * The date for release this version;
   * 
   */
  public String getDate() {
    return this.date;
  }

  /**
   * The date for release this version;
   * 
   */
  public Version setDate(String date) {
    this.date = date;
    return this;
  }

  public void unsetDate() {
    this.date = null;
  }

  /** Returns true if field date is set (has been assigned a value) and false otherwise */
  public boolean isSetDate() {
    return this.date != null;
  }

  public void setDateIsSet(boolean value) {
    if (!value) {
      this.date = null;
    }
  }

  /**
   * The version details;
   * 
   */
  public String getDetails() {
    return this.details;
  }

  /**
   * The version details;
   * 
   */
  public Version setDetails(String details) {
    this.details = details;
    return this;
  }

  public void unsetDetails() {
    this.details = null;
  }

  /** Returns true if field details is set (has been assigned a value) and false otherwise */
  public boolean isSetDetails() {
    return this.details != null;
  }

  public void setDetailsIsSet(boolean value) {
    if (!value) {
      this.details = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MAJOR:
      if (value == null) {
        unsetMajor();
      } else {
        setMajor((Integer)value);
      }
      break;

    case MINOR:
      if (value == null) {
        unsetMinor();
      } else {
        setMinor((Integer)value);
      }
      break;

    case REVISION:
      if (value == null) {
        unsetRevision();
      } else {
        setRevision((Integer)value);
      }
      break;

    case DATE:
      if (value == null) {
        unsetDate();
      } else {
        setDate((String)value);
      }
      break;

    case DETAILS:
      if (value == null) {
        unsetDetails();
      } else {
        setDetails((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MAJOR:
      return Integer.valueOf(getMajor());

    case MINOR:
      return Integer.valueOf(getMinor());

    case REVISION:
      return Integer.valueOf(getRevision());

    case DATE:
      return getDate();

    case DETAILS:
      return getDetails();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MAJOR:
      return isSetMajor();
    case MINOR:
      return isSetMinor();
    case REVISION:
      return isSetRevision();
    case DATE:
      return isSetDate();
    case DETAILS:
      return isSetDetails();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Version)
      return this.equals((Version)that);
    return false;
  }

  public boolean equals(Version that) {
    if (that == null)
      return false;

    boolean this_present_major = true;
    boolean that_present_major = true;
    if (this_present_major || that_present_major) {
      if (!(this_present_major && that_present_major))
        return false;
      if (this.major != that.major)
        return false;
    }

    boolean this_present_minor = true;
    boolean that_present_minor = true;
    if (this_present_minor || that_present_minor) {
      if (!(this_present_minor && that_present_minor))
        return false;
      if (this.minor != that.minor)
        return false;
    }

    boolean this_present_revision = true;
    boolean that_present_revision = true;
    if (this_present_revision || that_present_revision) {
      if (!(this_present_revision && that_present_revision))
        return false;
      if (this.revision != that.revision)
        return false;
    }

    boolean this_present_date = true && this.isSetDate();
    boolean that_present_date = true && that.isSetDate();
    if (this_present_date || that_present_date) {
      if (!(this_present_date && that_present_date))
        return false;
      if (!this.date.equals(that.date))
        return false;
    }

    boolean this_present_details = true && this.isSetDetails();
    boolean that_present_details = true && that.isSetDetails();
    if (this_present_details || that_present_details) {
      if (!(this_present_details && that_present_details))
        return false;
      if (!this.details.equals(that.details))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_major = true;
    list.add(present_major);
    if (present_major)
      list.add(major);

    boolean present_minor = true;
    list.add(present_minor);
    if (present_minor)
      list.add(minor);

    boolean present_revision = true;
    list.add(present_revision);
    if (present_revision)
      list.add(revision);

    boolean present_date = true && (isSetDate());
    list.add(present_date);
    if (present_date)
      list.add(date);

    boolean present_details = true && (isSetDetails());
    list.add(present_details);
    if (present_details)
      list.add(details);

    return list.hashCode();
  }

  @Override
  public int compareTo(Version other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMajor()).compareTo(other.isSetMajor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMajor()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.major, other.major);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMinor()).compareTo(other.isSetMinor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMinor()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.minor, other.minor);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRevision()).compareTo(other.isSetRevision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRevision()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.revision, other.revision);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDate()).compareTo(other.isSetDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDate()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.date, other.date);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDetails()).compareTo(other.isSetDetails());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDetails()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.details, other.details);
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
    StringBuilder sb = new StringBuilder("Version(");
    boolean first = true;

    sb.append("major:");
    sb.append(this.major);
    first = false;
    if (!first) sb.append(", ");
    sb.append("minor:");
    sb.append(this.minor);
    first = false;
    if (!first) sb.append(", ");
    sb.append("revision:");
    sb.append(this.revision);
    first = false;
    if (!first) sb.append(", ");
    sb.append("date:");
    if (this.date == null) {
      sb.append("null");
    } else {
      sb.append(this.date);
    }
    first = false;
    if (isSetDetails()) {
      if (!first) sb.append(", ");
      sb.append("details:");
      if (this.details == null) {
        sb.append("null");
      } else {
        sb.append(this.details);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // alas, we cannot check 'major' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'minor' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'revision' because it's a primitive and you chose the non-beans generator.
    if (date == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'date' was not present! Struct: " + toString());
    }
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

  private static class VersionStandardSchemeFactory implements SchemeFactory {
    public VersionStandardScheme getScheme() {
      return new VersionStandardScheme();
    }
  }

  private static class VersionStandardScheme extends StandardScheme<Version> {

    public void read(libthrift091.protocol.TProtocol iprot, Version struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MAJOR
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.major = iprot.readI32();
              struct.setMajorIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MINOR
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.minor = iprot.readI32();
              struct.setMinorIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REVISION
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.revision = iprot.readI32();
              struct.setRevisionIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DATE
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.date = iprot.readString();
              struct.setDateIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DETAILS
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.details = iprot.readString();
              struct.setDetailsIsSet(true);
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
      if (!struct.isSetMajor()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'major' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetMinor()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'minor' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetRevision()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'revision' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, Version struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(MAJOR_FIELD_DESC);
      oprot.writeI32(struct.major);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MINOR_FIELD_DESC);
      oprot.writeI32(struct.minor);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(REVISION_FIELD_DESC);
      oprot.writeI32(struct.revision);
      oprot.writeFieldEnd();
      if (struct.date != null) {
        oprot.writeFieldBegin(DATE_FIELD_DESC);
        oprot.writeString(struct.date);
        oprot.writeFieldEnd();
      }
      if (struct.details != null) {
        if (struct.isSetDetails()) {
          oprot.writeFieldBegin(DETAILS_FIELD_DESC);
          oprot.writeString(struct.details);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class VersionTupleSchemeFactory implements SchemeFactory {
    public VersionTupleScheme getScheme() {
      return new VersionTupleScheme();
    }
  }

  private static class VersionTupleScheme extends TupleScheme<Version> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, Version struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.major);
      oprot.writeI32(struct.minor);
      oprot.writeI32(struct.revision);
      oprot.writeString(struct.date);
      BitSet optionals = new BitSet();
      if (struct.isSetDetails()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetDetails()) {
        oprot.writeString(struct.details);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, Version struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.major = iprot.readI32();
      struct.setMajorIsSet(true);
      struct.minor = iprot.readI32();
      struct.setMinorIsSet(true);
      struct.revision = iprot.readI32();
      struct.setRevisionIsSet(true);
      struct.date = iprot.readString();
      struct.setDateIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.details = iprot.readString();
        struct.setDetailsIsSet(true);
      }
    }
  }

}

