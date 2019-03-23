package opencascade;

/**
 *  This enumeration is used in the classes BSplineCurve and
 *  BSplineSurface to describe the repartition of set of knots.
 *  (comments in classes BSplineCurve and BSplineSurface)
 */
public enum GeomAbs_BSplKnotDistribution {
  GeomAbs_NonUniform,
  GeomAbs_Uniform,
  GeomAbs_QuasiUniform,
  GeomAbs_PiecewiseBezier;

  public final int swigValue() {
    return swigValue;
  }

  public static GeomAbs_BSplKnotDistribution swigToEnum(int swigValue) {
    GeomAbs_BSplKnotDistribution[] swigValues = GeomAbs_BSplKnotDistribution.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (GeomAbs_BSplKnotDistribution swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + GeomAbs_BSplKnotDistribution.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private GeomAbs_BSplKnotDistribution() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private GeomAbs_BSplKnotDistribution(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private GeomAbs_BSplKnotDistribution(GeomAbs_BSplKnotDistribution swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

