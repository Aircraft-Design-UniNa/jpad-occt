package opencascade;

/**
 *  Indicates the outcome of a construction, i.e.
 *  whether it is successful or not, as explained below.
 *  gce_Done: Construction was successful.
 *  gce_ConfusedPoints: Two points are coincident.
 *  gce_NegativeRadius: Radius value is negative.
 *  gce_ColinearPoints: Three points are collinear.
 *  gce_IntersectionError: Intersection cannot be computed.
 *  gce_NullAxis: Axis is undefined.
 *  gce_NullAngle: Angle value is invalid (usually null).
 *  gce_NullRadius: Radius is null.
 *  gce_InvertAxis: Axis value is invalid.
 *  gce_BadAngle: Angle value is invalid.
 *  gce_InvertRadius: Radius value is incorrect
 *  (usually with respect to another radius).
 *  gce_NullFocusLength: Focal distance is null.
 *  gce_NullVector: Vector is null.
 *  gce_BadEquation: Coefficients are
 *  incorrect (applies to the equation of a geometric object).
 */
public enum gce_ErrorType {
  gce_Done,
  gce_ConfusedPoints,
  gce_NegativeRadius,
  gce_ColinearPoints,
  gce_IntersectionError,
  gce_NullAxis,
  gce_NullAngle,
  gce_NullRadius,
  gce_InvertAxis,
  gce_BadAngle,
  gce_InvertRadius,
  gce_NullFocusLength,
  gce_NullVector,
  gce_BadEquation;

  public final int swigValue() {
    return swigValue;
  }

  public static gce_ErrorType swigToEnum(int swigValue) {
    gce_ErrorType[] swigValues = gce_ErrorType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (gce_ErrorType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + gce_ErrorType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private gce_ErrorType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private gce_ErrorType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private gce_ErrorType(gce_ErrorType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

