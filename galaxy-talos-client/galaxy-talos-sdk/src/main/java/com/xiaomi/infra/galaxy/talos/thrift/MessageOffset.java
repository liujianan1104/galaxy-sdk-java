/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;


import java.util.Map;
import java.util.HashMap;
import libthrift091.TEnum;

public enum MessageOffset implements libthrift091.TEnum {
  START_OFFSET(-1),
  LATEST_OFFSET(-2);

  private final int value;

  private MessageOffset(int value) {
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
  public static MessageOffset findByValue(int value) { 
    switch (value) {
      case -1:
        return START_OFFSET;
      case -2:
        return LATEST_OFFSET;
      default:
        return null;
    }
  }
}
