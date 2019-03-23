package opencascade;

/**
 *  Characterizes the type of a join, built by an algorithm for
 *  constructing parallel curves, between two consecutive
 *  arcs of a contour parallel to a given contour.
 */
public enum GeomAbs_JoinType {
  GeomAbs_Arc,
  GeomAbs_Tangent,
  GeomAbs_Intersection;

  public final int swigValue() {
    return swigValue;
  }

  public static GeomAbs_JoinType swigToEnum(int swigValue) {
    GeomAbs_JoinType[] swigValues = GeomAbs_JoinType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (GeomAbs_JoinType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + GeomAbs_JoinType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private GeomAbs_JoinType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private GeomAbs_JoinType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private GeomAbs_JoinType(GeomAbs_JoinType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

