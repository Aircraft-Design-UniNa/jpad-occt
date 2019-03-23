package opencascade;

/**
 *  The terms of this enumeration define the types of geometric shapes available.
 */
public enum TDataXtd_GeometryEnum {
  TDataXtd_ANY_GEOM,
  TDataXtd_POINT,
  TDataXtd_LINE,
  TDataXtd_CIRCLE,
  TDataXtd_ELLIPSE,
  TDataXtd_SPLINE,
  TDataXtd_PLANE,
  TDataXtd_CYLINDER;

  public final int swigValue() {
    return swigValue;
  }

  public static TDataXtd_GeometryEnum swigToEnum(int swigValue) {
    TDataXtd_GeometryEnum[] swigValues = TDataXtd_GeometryEnum.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (TDataXtd_GeometryEnum swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + TDataXtd_GeometryEnum.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private TDataXtd_GeometryEnum() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private TDataXtd_GeometryEnum(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private TDataXtd_GeometryEnum(TDataXtd_GeometryEnum swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

