package opencascade;

/**
 *  Identifies the type of a curve.
 */
public enum GeomAbs_CurveType {
  GeomAbs_Line,
  GeomAbs_Circle,
  GeomAbs_Ellipse,
  GeomAbs_Hyperbola,
  GeomAbs_Parabola,
  GeomAbs_BezierCurve,
  GeomAbs_BSplineCurve,
  GeomAbs_OffsetCurve,
  GeomAbs_OtherCurve;

  public final int swigValue() {
    return swigValue;
  }

  public static GeomAbs_CurveType swigToEnum(int swigValue) {
    GeomAbs_CurveType[] swigValues = GeomAbs_CurveType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (GeomAbs_CurveType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + GeomAbs_CurveType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private GeomAbs_CurveType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private GeomAbs_CurveType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private GeomAbs_CurveType(GeomAbs_CurveType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

