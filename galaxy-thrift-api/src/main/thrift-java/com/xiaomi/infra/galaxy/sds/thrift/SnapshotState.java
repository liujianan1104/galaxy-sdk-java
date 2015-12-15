/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;


import java.util.Map;
import java.util.HashMap;
import libthrift091.TEnum;

/**
 * 快照状态
 */
public enum SnapshotState implements libthrift091.TEnum {
  /**
   * 开启状态，可操作
   */
  ENABLED(1),
  /**
   * 正在创建，不可操作
   */
  INPROGRESS(2);

  private final int value;

  private SnapshotState(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static SnapshotState findByValue(int value) { 
    switch (value) {
      case 1:
        return ENABLED;
      case 2:
        return INPROGRESS;
      default:
        return null;
    }
  }
}