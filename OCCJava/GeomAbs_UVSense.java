package opencascade;

/**
 *  This enumeration is used in the class RectangularTrimmedSurface
 *  to compare the orientation of the basic surface and the orientation
 *  of the trimmed surface and in the class ElementarySurface to know
 *  the direction of parametrization by comparison with the default
 *  construction mode.
 */
public enum GeomAbs_UVSense {
  GeomAbs_SameUV,
  GeomAbs_SameU,
  GeomAbs_SameV,
  GeomAbs_OppositeUV;

  public final int swigValue() {
    return swigValue;
  }

  public static GeomAbs_UVSense swigToEnum(int swigValue) {
    GeomAbs_UVSense[] swigValues = GeomAbs_UVSense.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (GeomAbs_UVSense swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + GeomAbs_UVSense.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private GeomAbs_UVSense() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private GeomAbs_UVSense(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private GeomAbs_UVSense(GeomAbs_UVSense swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

