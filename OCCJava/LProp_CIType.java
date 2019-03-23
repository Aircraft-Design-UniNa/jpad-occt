package opencascade;

/**
 *  Identifies the type of a particular point on a curve:
 *  - LProp_Inflection: a point of inflection
 *  - LProp_MinCur: a minimum of curvature
 *  - LProp_MaxCur: a maximum of curvature.
 */
public enum LProp_CIType {
  LProp_Inflection,
  LProp_MinCur,
  LProp_MaxCur;

  public final int swigValue() {
    return swigValue;
  }

  public static LProp_CIType swigToEnum(int swigValue) {
    LProp_CIType[] swigValues = LProp_CIType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (LProp_CIType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + LProp_CIType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private LProp_CIType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private LProp_CIType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private LProp_CIType(LProp_CIType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

