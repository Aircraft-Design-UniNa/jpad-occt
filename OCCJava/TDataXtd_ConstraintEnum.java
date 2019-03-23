package opencascade;

/**
 *  The terms of this enumeration define the types
 *  of  available constraint.
 *  ==================
 */
public enum TDataXtd_ConstraintEnum {
  TDataXtd_RADIUS,
  TDataXtd_DIAMETER,
  TDataXtd_MINOR_RADIUS,
  TDataXtd_MAJOR_RADIUS,
  TDataXtd_TANGENT,
  TDataXtd_PARALLEL,
  TDataXtd_PERPENDICULAR,
  TDataXtd_CONCENTRIC,
  TDataXtd_COINCIDENT,
  TDataXtd_DISTANCE,
  TDataXtd_ANGLE,
  TDataXtd_EQUAL_RADIUS,
  TDataXtd_SYMMETRY,
  TDataXtd_MIDPOINT,
  TDataXtd_EQUAL_DISTANCE,
  TDataXtd_FIX,
  TDataXtd_RIGID,
  TDataXtd_FROM,
  TDataXtd_AXIS,
  TDataXtd_MATE,
  TDataXtd_ALIGN_FACES,
  TDataXtd_ALIGN_AXES,
  TDataXtd_AXES_ANGLE,
  TDataXtd_FACES_ANGLE,
  TDataXtd_ROUND,
  TDataXtd_OFFSET;

  public final int swigValue() {
    return swigValue;
  }

  public static TDataXtd_ConstraintEnum swigToEnum(int swigValue) {
    TDataXtd_ConstraintEnum[] swigValues = TDataXtd_ConstraintEnum.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (TDataXtd_ConstraintEnum swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + TDataXtd_ConstraintEnum.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private TDataXtd_ConstraintEnum() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private TDataXtd_ConstraintEnum(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private TDataXtd_ConstraintEnum(TDataXtd_ConstraintEnum swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

