package opencascade;

/**
 *  this enumeration describes if a curve is an U isoparaetric
 *  or V isoparametric
 */
public enum GeomAbs_IsoType {
  GeomAbs_IsoU,
  GeomAbs_IsoV,
  GeomAbs_NoneIso;

  public final int swigValue() {
    return swigValue;
  }

  public static GeomAbs_IsoType swigToEnum(int swigValue) {
    GeomAbs_IsoType[] swigValues = GeomAbs_IsoType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (GeomAbs_IsoType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + GeomAbs_IsoType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private GeomAbs_IsoType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private GeomAbs_IsoType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private GeomAbs_IsoType(GeomAbs_IsoType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

