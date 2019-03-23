package opencascade;

public enum GeomAbs_SurfaceType {
  GeomAbs_Plane,
  GeomAbs_Cylinder,
  GeomAbs_Cone,
  GeomAbs_Sphere,
  GeomAbs_Torus,
  GeomAbs_BezierSurface,
  GeomAbs_BSplineSurface,
  GeomAbs_SurfaceOfRevolution,
  GeomAbs_SurfaceOfExtrusion,
  GeomAbs_OffsetSurface,
  GeomAbs_OtherSurface;

  public final int swigValue() {
    return swigValue;
  }

  public static GeomAbs_SurfaceType swigToEnum(int swigValue) {
    GeomAbs_SurfaceType[] swigValues = GeomAbs_SurfaceType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (GeomAbs_SurfaceType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + GeomAbs_SurfaceType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private GeomAbs_SurfaceType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private GeomAbs_SurfaceType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private GeomAbs_SurfaceType(GeomAbs_SurfaceType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

