package opencascade;

/**
 *  Provides information about the continuity of a curve:
 *  -   C0: only geometric continuity.
 *  -   G1: for each point on the curve, the tangent vectors
 *  "on the right" and "on the left" are collinear with the same orientation.
 *  -   C1: continuity of the first derivative. The "C1" curve is
 *  also "G1" but, in addition, the tangent vectors " on the
 *  right" and "on the left" are equal.
 *  -   G2: for each point on the curve, the normalized
 *  normal vectors "on the right" and "on the left" are equal.
 *  -   C2: continuity of the second derivative.
 *  -   C3: continuity of the third derivative.
 *  -   CN: continuity of the N-th derivative, whatever is the
 *  value given for N (infinite order of continuity).
 *  Also provides information about the continuity of a surface:
 *  -   C0: only geometric continuity.
 *  -   C1: continuity of the first derivatives; any
 *  isoparametric (in U or V) of a surface "C1" is also "C1".
 *  -   G2: for BSpline curves only; "on the right" and "on the
 *  left" of a knot the computation of the "main curvature
 *  radii" and the "main directions" (when they exist) gives the same result.
 *  -   C2: continuity of the second derivative.
 *  -   C3: continuity of the third derivative.
 *  -   CN: continuity of any N-th derivative, whatever is the
 *  value given for N (infinite order of continuity).
 *  We may also say that a surface is "Ci" in u, and "Cj" in v
 *  to indicate the continuity of its derivatives up to the order
 *  i in the u parametric direction, and j in the v parametric direction.
 */
public enum GeomAbs_Shape {
  GeomAbs_C0,
  GeomAbs_G1,
  GeomAbs_C1,
  GeomAbs_G2,
  GeomAbs_C2,
  GeomAbs_C3,
  GeomAbs_CN;

  public final int swigValue() {
    return swigValue;
  }

  public static GeomAbs_Shape swigToEnum(int swigValue) {
    GeomAbs_Shape[] swigValues = GeomAbs_Shape.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (GeomAbs_Shape swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + GeomAbs_Shape.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private GeomAbs_Shape() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private GeomAbs_Shape(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private GeomAbs_Shape(GeomAbs_Shape swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

