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
public class MetricQueryRequest implements libthrift091.TBase<MetricQueryRequest, MetricQueryRequest._Fields>, java.io.Serializable, Cloneable, Comparable<MetricQueryRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("MetricQueryRequest");

  private static final libthrift091.protocol.TField START_TIME_FIELD_DESC = new libthrift091.protocol.TField("startTime", libthrift091.protocol.TType.I64, (short)1);
  private static final libthrift091.protocol.TField END_TIME_FIELD_DESC = new libthrift091.protocol.TField("endTime", libthrift091.protocol.TType.I64, (short)2);
  private static final libthrift091.protocol.TField METRIC_FIELD_DESC = new libthrift091.protocol.TField("metric", libthrift091.protocol.TType.I32, (short)3);
  private static final libthrift091.protocol.TField MESUREMENT_FIELD_DESC = new libthrift091.protocol.TField("mesurement", libthrift091.protocol.TType.I32, (short)4);
  private static final libthrift091.protocol.TField HOST_FIELD_DESC = new libthrift091.protocol.TField("host", libthrift091.protocol.TType.STRING, (short)5);
  private static final libthrift091.protocol.TField DOWN_SAMPLER_INTERVAL_FIELD_DESC = new libthrift091.protocol.TField("downSamplerInterval", libthrift091.protocol.TType.I32, (short)6);
  private static final libthrift091.protocol.TField DOWN_SAMPLER_TIME_UNIT_FIELD_DESC = new libthrift091.protocol.TField("downSamplerTimeUnit", libthrift091.protocol.TType.I32, (short)7);
  private static final libthrift091.protocol.TField CALC_RATE_FIELD_DESC = new libthrift091.protocol.TField("calcRate", libthrift091.protocol.TType.BOOL, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MetricQueryRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MetricQueryRequestTupleSchemeFactory());
  }

  public long startTime; // required
  public long endTime; // required
  /**
   * 
   * @see Metric
   */
  public Metric metric; // required
  /**
   * 
   * @see Mesurement
   */
  public Mesurement mesurement; // required
  public String host; // required
  public int downSamplerInterval; // required
  /**
   * 
   * @see TimeSpanUnit
   */
  public TimeSpanUnit downSamplerTimeUnit; // required
  public boolean calcRate; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    START_TIME((short)1, "startTime"),
    END_TIME((short)2, "endTime"),
    /**
     * 
     * @see Metric
     */
    METRIC((short)3, "metric"),
    /**
     * 
     * @see Mesurement
     */
    MESUREMENT((short)4, "mesurement"),
    HOST((short)5, "host"),
    DOWN_SAMPLER_INTERVAL((short)6, "downSamplerInterval"),
    /**
     * 
     * @see TimeSpanUnit
     */
    DOWN_SAMPLER_TIME_UNIT((short)7, "downSamplerTimeUnit"),
    CALC_RATE((short)8, "calcRate");

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
        case 1: // START_TIME
          return START_TIME;
        case 2: // END_TIME
          return END_TIME;
        case 3: // METRIC
          return METRIC;
        case 4: // MESUREMENT
          return MESUREMENT;
        case 5: // HOST
          return HOST;
        case 6: // DOWN_SAMPLER_INTERVAL
          return DOWN_SAMPLER_INTERVAL;
        case 7: // DOWN_SAMPLER_TIME_UNIT
          return DOWN_SAMPLER_TIME_UNIT;
        case 8: // CALC_RATE
          return CALC_RATE;
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
  private static final int __STARTTIME_ISSET_ID = 0;
  private static final int __ENDTIME_ISSET_ID = 1;
  private static final int __DOWNSAMPLERINTERVAL_ISSET_ID = 2;
  private static final int __CALCRATE_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START_TIME, new libthrift091.meta_data.FieldMetaData("startTime", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.END_TIME, new libthrift091.meta_data.FieldMetaData("endTime", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.METRIC, new libthrift091.meta_data.FieldMetaData("metric", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, Metric.class)));
    tmpMap.put(_Fields.MESUREMENT, new libthrift091.meta_data.FieldMetaData("mesurement", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, Mesurement.class)));
    tmpMap.put(_Fields.HOST, new libthrift091.meta_data.FieldMetaData("host", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.DOWN_SAMPLER_INTERVAL, new libthrift091.meta_data.FieldMetaData("downSamplerInterval", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.DOWN_SAMPLER_TIME_UNIT, new libthrift091.meta_data.FieldMetaData("downSamplerTimeUnit", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, TimeSpanUnit.class)));
    tmpMap.put(_Fields.CALC_RATE, new libthrift091.meta_data.FieldMetaData("calcRate", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(MetricQueryRequest.class, metaDataMap);
  }

  public MetricQueryRequest() {
  }

  public MetricQueryRequest(
    long startTime,
    long endTime,
    Metric metric,
    Mesurement mesurement,
    String host,
    int downSamplerInterval,
    TimeSpanUnit downSamplerTimeUnit,
    boolean calcRate)
  {
    this();
    this.startTime = startTime;
    setStartTimeIsSet(true);
    this.endTime = endTime;
    setEndTimeIsSet(true);
    this.metric = metric;
    this.mesurement = mesurement;
    this.host = host;
    this.downSamplerInterval = downSamplerInterval;
    setDownSamplerIntervalIsSet(true);
    this.downSamplerTimeUnit = downSamplerTimeUnit;
    this.calcRate = calcRate;
    setCalcRateIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MetricQueryRequest(MetricQueryRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.startTime = other.startTime;
    this.endTime = other.endTime;
    if (other.isSetMetric()) {
      this.metric = other.metric;
    }
    if (other.isSetMesurement()) {
      this.mesurement = other.mesurement;
    }
    if (other.isSetHost()) {
      this.host = other.host;
    }
    this.downSamplerInterval = other.downSamplerInterval;
    if (other.isSetDownSamplerTimeUnit()) {
      this.downSamplerTimeUnit = other.downSamplerTimeUnit;
    }
    this.calcRate = other.calcRate;
  }

  public MetricQueryRequest deepCopy() {
    return new MetricQueryRequest(this);
  }

  @Override
  public void clear() {
    setStartTimeIsSet(false);
    this.startTime = 0;
    setEndTimeIsSet(false);
    this.endTime = 0;
    this.metric = null;
    this.mesurement = null;
    this.host = null;
    setDownSamplerIntervalIsSet(false);
    this.downSamplerInterval = 0;
    this.downSamplerTimeUnit = null;
    setCalcRateIsSet(false);
    this.calcRate = false;
  }

  public long getStartTime() {
    return this.startTime;
  }

  public MetricQueryRequest setStartTime(long startTime) {
    this.startTime = startTime;
    setStartTimeIsSet(true);
    return this;
  }

  public void unsetStartTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  /** Returns true if field startTime is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTime() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  public void setStartTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTTIME_ISSET_ID, value);
  }

  public long getEndTime() {
    return this.endTime;
  }

  public MetricQueryRequest setEndTime(long endTime) {
    this.endTime = endTime;
    setEndTimeIsSet(true);
    return this;
  }

  public void unsetEndTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENDTIME_ISSET_ID);
  }

  /** Returns true if field endTime is set (has been assigned a value) and false otherwise */
  public boolean isSetEndTime() {
    return EncodingUtils.testBit(__isset_bitfield, __ENDTIME_ISSET_ID);
  }

  public void setEndTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENDTIME_ISSET_ID, value);
  }

  /**
   * 
   * @see Metric
   */
  public Metric getMetric() {
    return this.metric;
  }

  /**
   * 
   * @see Metric
   */
  public MetricQueryRequest setMetric(Metric metric) {
    this.metric = metric;
    return this;
  }

  public void unsetMetric() {
    this.metric = null;
  }

  /** Returns true if field metric is set (has been assigned a value) and false otherwise */
  public boolean isSetMetric() {
    return this.metric != null;
  }

  public void setMetricIsSet(boolean value) {
    if (!value) {
      this.metric = null;
    }
  }

  /**
   * 
   * @see Mesurement
   */
  public Mesurement getMesurement() {
    return this.mesurement;
  }

  /**
   * 
   * @see Mesurement
   */
  public MetricQueryRequest setMesurement(Mesurement mesurement) {
    this.mesurement = mesurement;
    return this;
  }

  public void unsetMesurement() {
    this.mesurement = null;
  }

  /** Returns true if field mesurement is set (has been assigned a value) and false otherwise */
  public boolean isSetMesurement() {
    return this.mesurement != null;
  }

  public void setMesurementIsSet(boolean value) {
    if (!value) {
      this.mesurement = null;
    }
  }

  public String getHost() {
    return this.host;
  }

  public MetricQueryRequest setHost(String host) {
    this.host = host;
    return this;
  }

  public void unsetHost() {
    this.host = null;
  }

  /** Returns true if field host is set (has been assigned a value) and false otherwise */
  public boolean isSetHost() {
    return this.host != null;
  }

  public void setHostIsSet(boolean value) {
    if (!value) {
      this.host = null;
    }
  }

  public int getDownSamplerInterval() {
    return this.downSamplerInterval;
  }

  public MetricQueryRequest setDownSamplerInterval(int downSamplerInterval) {
    this.downSamplerInterval = downSamplerInterval;
    setDownSamplerIntervalIsSet(true);
    return this;
  }

  public void unsetDownSamplerInterval() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DOWNSAMPLERINTERVAL_ISSET_ID);
  }

  /** Returns true if field downSamplerInterval is set (has been assigned a value) and false otherwise */
  public boolean isSetDownSamplerInterval() {
    return EncodingUtils.testBit(__isset_bitfield, __DOWNSAMPLERINTERVAL_ISSET_ID);
  }

  public void setDownSamplerIntervalIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DOWNSAMPLERINTERVAL_ISSET_ID, value);
  }

  /**
   * 
   * @see TimeSpanUnit
   */
  public TimeSpanUnit getDownSamplerTimeUnit() {
    return this.downSamplerTimeUnit;
  }

  /**
   * 
   * @see TimeSpanUnit
   */
  public MetricQueryRequest setDownSamplerTimeUnit(TimeSpanUnit downSamplerTimeUnit) {
    this.downSamplerTimeUnit = downSamplerTimeUnit;
    return this;
  }

  public void unsetDownSamplerTimeUnit() {
    this.downSamplerTimeUnit = null;
  }

  /** Returns true if field downSamplerTimeUnit is set (has been assigned a value) and false otherwise */
  public boolean isSetDownSamplerTimeUnit() {
    return this.downSamplerTimeUnit != null;
  }

  public void setDownSamplerTimeUnitIsSet(boolean value) {
    if (!value) {
      this.downSamplerTimeUnit = null;
    }
  }

  public boolean isCalcRate() {
    return this.calcRate;
  }

  public MetricQueryRequest setCalcRate(boolean calcRate) {
    this.calcRate = calcRate;
    setCalcRateIsSet(true);
    return this;
  }

  public void unsetCalcRate() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CALCRATE_ISSET_ID);
  }

  /** Returns true if field calcRate is set (has been assigned a value) and false otherwise */
  public boolean isSetCalcRate() {
    return EncodingUtils.testBit(__isset_bitfield, __CALCRATE_ISSET_ID);
  }

  public void setCalcRateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CALCRATE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case START_TIME:
      if (value == null) {
        unsetStartTime();
      } else {
        setStartTime((Long)value);
      }
      break;

    case END_TIME:
      if (value == null) {
        unsetEndTime();
      } else {
        setEndTime((Long)value);
      }
      break;

    case METRIC:
      if (value == null) {
        unsetMetric();
      } else {
        setMetric((Metric)value);
      }
      break;

    case MESUREMENT:
      if (value == null) {
        unsetMesurement();
      } else {
        setMesurement((Mesurement)value);
      }
      break;

    case HOST:
      if (value == null) {
        unsetHost();
      } else {
        setHost((String)value);
      }
      break;

    case DOWN_SAMPLER_INTERVAL:
      if (value == null) {
        unsetDownSamplerInterval();
      } else {
        setDownSamplerInterval((Integer)value);
      }
      break;

    case DOWN_SAMPLER_TIME_UNIT:
      if (value == null) {
        unsetDownSamplerTimeUnit();
      } else {
        setDownSamplerTimeUnit((TimeSpanUnit)value);
      }
      break;

    case CALC_RATE:
      if (value == null) {
        unsetCalcRate();
      } else {
        setCalcRate((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case START_TIME:
      return Long.valueOf(getStartTime());

    case END_TIME:
      return Long.valueOf(getEndTime());

    case METRIC:
      return getMetric();

    case MESUREMENT:
      return getMesurement();

    case HOST:
      return getHost();

    case DOWN_SAMPLER_INTERVAL:
      return Integer.valueOf(getDownSamplerInterval());

    case DOWN_SAMPLER_TIME_UNIT:
      return getDownSamplerTimeUnit();

    case CALC_RATE:
      return Boolean.valueOf(isCalcRate());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case START_TIME:
      return isSetStartTime();
    case END_TIME:
      return isSetEndTime();
    case METRIC:
      return isSetMetric();
    case MESUREMENT:
      return isSetMesurement();
    case HOST:
      return isSetHost();
    case DOWN_SAMPLER_INTERVAL:
      return isSetDownSamplerInterval();
    case DOWN_SAMPLER_TIME_UNIT:
      return isSetDownSamplerTimeUnit();
    case CALC_RATE:
      return isSetCalcRate();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MetricQueryRequest)
      return this.equals((MetricQueryRequest)that);
    return false;
  }

  public boolean equals(MetricQueryRequest that) {
    if (that == null)
      return false;

    boolean this_present_startTime = true;
    boolean that_present_startTime = true;
    if (this_present_startTime || that_present_startTime) {
      if (!(this_present_startTime && that_present_startTime))
        return false;
      if (this.startTime != that.startTime)
        return false;
    }

    boolean this_present_endTime = true;
    boolean that_present_endTime = true;
    if (this_present_endTime || that_present_endTime) {
      if (!(this_present_endTime && that_present_endTime))
        return false;
      if (this.endTime != that.endTime)
        return false;
    }

    boolean this_present_metric = true && this.isSetMetric();
    boolean that_present_metric = true && that.isSetMetric();
    if (this_present_metric || that_present_metric) {
      if (!(this_present_metric && that_present_metric))
        return false;
      if (!this.metric.equals(that.metric))
        return false;
    }

    boolean this_present_mesurement = true && this.isSetMesurement();
    boolean that_present_mesurement = true && that.isSetMesurement();
    if (this_present_mesurement || that_present_mesurement) {
      if (!(this_present_mesurement && that_present_mesurement))
        return false;
      if (!this.mesurement.equals(that.mesurement))
        return false;
    }

    boolean this_present_host = true && this.isSetHost();
    boolean that_present_host = true && that.isSetHost();
    if (this_present_host || that_present_host) {
      if (!(this_present_host && that_present_host))
        return false;
      if (!this.host.equals(that.host))
        return false;
    }

    boolean this_present_downSamplerInterval = true;
    boolean that_present_downSamplerInterval = true;
    if (this_present_downSamplerInterval || that_present_downSamplerInterval) {
      if (!(this_present_downSamplerInterval && that_present_downSamplerInterval))
        return false;
      if (this.downSamplerInterval != that.downSamplerInterval)
        return false;
    }

    boolean this_present_downSamplerTimeUnit = true && this.isSetDownSamplerTimeUnit();
    boolean that_present_downSamplerTimeUnit = true && that.isSetDownSamplerTimeUnit();
    if (this_present_downSamplerTimeUnit || that_present_downSamplerTimeUnit) {
      if (!(this_present_downSamplerTimeUnit && that_present_downSamplerTimeUnit))
        return false;
      if (!this.downSamplerTimeUnit.equals(that.downSamplerTimeUnit))
        return false;
    }

    boolean this_present_calcRate = true;
    boolean that_present_calcRate = true;
    if (this_present_calcRate || that_present_calcRate) {
      if (!(this_present_calcRate && that_present_calcRate))
        return false;
      if (this.calcRate != that.calcRate)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_startTime = true;
    list.add(present_startTime);
    if (present_startTime)
      list.add(startTime);

    boolean present_endTime = true;
    list.add(present_endTime);
    if (present_endTime)
      list.add(endTime);

    boolean present_metric = true && (isSetMetric());
    list.add(present_metric);
    if (present_metric)
      list.add(metric.getValue());

    boolean present_mesurement = true && (isSetMesurement());
    list.add(present_mesurement);
    if (present_mesurement)
      list.add(mesurement.getValue());

    boolean present_host = true && (isSetHost());
    list.add(present_host);
    if (present_host)
      list.add(host);

    boolean present_downSamplerInterval = true;
    list.add(present_downSamplerInterval);
    if (present_downSamplerInterval)
      list.add(downSamplerInterval);

    boolean present_downSamplerTimeUnit = true && (isSetDownSamplerTimeUnit());
    list.add(present_downSamplerTimeUnit);
    if (present_downSamplerTimeUnit)
      list.add(downSamplerTimeUnit.getValue());

    boolean present_calcRate = true;
    list.add(present_calcRate);
    if (present_calcRate)
      list.add(calcRate);

    return list.hashCode();
  }

  @Override
  public int compareTo(MetricQueryRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStartTime()).compareTo(other.isSetStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTime()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.startTime, other.startTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndTime()).compareTo(other.isSetEndTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndTime()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.endTime, other.endTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMetric()).compareTo(other.isSetMetric());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetric()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.metric, other.metric);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMesurement()).compareTo(other.isSetMesurement());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMesurement()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.mesurement, other.mesurement);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHost()).compareTo(other.isSetHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHost()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.host, other.host);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDownSamplerInterval()).compareTo(other.isSetDownSamplerInterval());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDownSamplerInterval()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.downSamplerInterval, other.downSamplerInterval);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDownSamplerTimeUnit()).compareTo(other.isSetDownSamplerTimeUnit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDownSamplerTimeUnit()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.downSamplerTimeUnit, other.downSamplerTimeUnit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCalcRate()).compareTo(other.isSetCalcRate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCalcRate()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.calcRate, other.calcRate);
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
    StringBuilder sb = new StringBuilder("MetricQueryRequest(");
    boolean first = true;

    sb.append("startTime:");
    sb.append(this.startTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("endTime:");
    sb.append(this.endTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("metric:");
    if (this.metric == null) {
      sb.append("null");
    } else {
      sb.append(this.metric);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mesurement:");
    if (this.mesurement == null) {
      sb.append("null");
    } else {
      sb.append(this.mesurement);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("host:");
    if (this.host == null) {
      sb.append("null");
    } else {
      sb.append(this.host);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("downSamplerInterval:");
    sb.append(this.downSamplerInterval);
    first = false;
    if (!first) sb.append(", ");
    sb.append("downSamplerTimeUnit:");
    if (this.downSamplerTimeUnit == null) {
      sb.append("null");
    } else {
      sb.append(this.downSamplerTimeUnit);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("calcRate:");
    sb.append(this.calcRate);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (metric == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'metric' was not present! Struct: " + toString());
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

  private static class MetricQueryRequestStandardSchemeFactory implements SchemeFactory {
    public MetricQueryRequestStandardScheme getScheme() {
      return new MetricQueryRequestStandardScheme();
    }
  }

  private static class MetricQueryRequestStandardScheme extends StandardScheme<MetricQueryRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, MetricQueryRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START_TIME
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.startTime = iprot.readI64();
              struct.setStartTimeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // END_TIME
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.endTime = iprot.readI64();
              struct.setEndTimeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // METRIC
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.metric = com.xiaomi.infra.galaxy.emr.thrift.Metric.findByValue(iprot.readI32());
              struct.setMetricIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MESUREMENT
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.mesurement = com.xiaomi.infra.galaxy.emr.thrift.Mesurement.findByValue(iprot.readI32());
              struct.setMesurementIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // HOST
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.host = iprot.readString();
              struct.setHostIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DOWN_SAMPLER_INTERVAL
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.downSamplerInterval = iprot.readI32();
              struct.setDownSamplerIntervalIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DOWN_SAMPLER_TIME_UNIT
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.downSamplerTimeUnit = com.xiaomi.infra.galaxy.emr.thrift.TimeSpanUnit.findByValue(iprot.readI32());
              struct.setDownSamplerTimeUnitIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // CALC_RATE
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.calcRate = iprot.readBool();
              struct.setCalcRateIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, MetricQueryRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(START_TIME_FIELD_DESC);
      oprot.writeI64(struct.startTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(END_TIME_FIELD_DESC);
      oprot.writeI64(struct.endTime);
      oprot.writeFieldEnd();
      if (struct.metric != null) {
        oprot.writeFieldBegin(METRIC_FIELD_DESC);
        oprot.writeI32(struct.metric.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.mesurement != null) {
        oprot.writeFieldBegin(MESUREMENT_FIELD_DESC);
        oprot.writeI32(struct.mesurement.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.host != null) {
        oprot.writeFieldBegin(HOST_FIELD_DESC);
        oprot.writeString(struct.host);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(DOWN_SAMPLER_INTERVAL_FIELD_DESC);
      oprot.writeI32(struct.downSamplerInterval);
      oprot.writeFieldEnd();
      if (struct.downSamplerTimeUnit != null) {
        oprot.writeFieldBegin(DOWN_SAMPLER_TIME_UNIT_FIELD_DESC);
        oprot.writeI32(struct.downSamplerTimeUnit.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CALC_RATE_FIELD_DESC);
      oprot.writeBool(struct.calcRate);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MetricQueryRequestTupleSchemeFactory implements SchemeFactory {
    public MetricQueryRequestTupleScheme getScheme() {
      return new MetricQueryRequestTupleScheme();
    }
  }

  private static class MetricQueryRequestTupleScheme extends TupleScheme<MetricQueryRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, MetricQueryRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.metric.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetStartTime()) {
        optionals.set(0);
      }
      if (struct.isSetEndTime()) {
        optionals.set(1);
      }
      if (struct.isSetMesurement()) {
        optionals.set(2);
      }
      if (struct.isSetHost()) {
        optionals.set(3);
      }
      if (struct.isSetDownSamplerInterval()) {
        optionals.set(4);
      }
      if (struct.isSetDownSamplerTimeUnit()) {
        optionals.set(5);
      }
      if (struct.isSetCalcRate()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetStartTime()) {
        oprot.writeI64(struct.startTime);
      }
      if (struct.isSetEndTime()) {
        oprot.writeI64(struct.endTime);
      }
      if (struct.isSetMesurement()) {
        oprot.writeI32(struct.mesurement.getValue());
      }
      if (struct.isSetHost()) {
        oprot.writeString(struct.host);
      }
      if (struct.isSetDownSamplerInterval()) {
        oprot.writeI32(struct.downSamplerInterval);
      }
      if (struct.isSetDownSamplerTimeUnit()) {
        oprot.writeI32(struct.downSamplerTimeUnit.getValue());
      }
      if (struct.isSetCalcRate()) {
        oprot.writeBool(struct.calcRate);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, MetricQueryRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.metric = com.xiaomi.infra.galaxy.emr.thrift.Metric.findByValue(iprot.readI32());
      struct.setMetricIsSet(true);
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.startTime = iprot.readI64();
        struct.setStartTimeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.endTime = iprot.readI64();
        struct.setEndTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.mesurement = com.xiaomi.infra.galaxy.emr.thrift.Mesurement.findByValue(iprot.readI32());
        struct.setMesurementIsSet(true);
      }
      if (incoming.get(3)) {
        struct.host = iprot.readString();
        struct.setHostIsSet(true);
      }
      if (incoming.get(4)) {
        struct.downSamplerInterval = iprot.readI32();
        struct.setDownSamplerIntervalIsSet(true);
      }
      if (incoming.get(5)) {
        struct.downSamplerTimeUnit = com.xiaomi.infra.galaxy.emr.thrift.TimeSpanUnit.findByValue(iprot.readI32());
        struct.setDownSamplerTimeUnitIsSet(true);
      }
      if (incoming.get(6)) {
        struct.calcRate = iprot.readBool();
        struct.setCalcRateIsSet(true);
      }
    }
  }

}

