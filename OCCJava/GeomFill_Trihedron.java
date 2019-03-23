package opencascade;

public enum GeomFill_Trihedron {
  GeomFill_IsCorrectedFrenet,
  GeomFill_IsFixed,
  GeomFill_IsFrenet,
  GeomFill_IsConstantNormal,
  GeomFill_IsDarboux,
  GeomFill_IsGuideAC,
  GeomFill_IsGuidePlan,
  GeomFill_IsGuideACWithContact,
  GeomFill_IsGuidePlanWithContact,
  GeomFill_IsDiscreteTrihedron;

  public final int swigValue() {
    return swigValue;
  }

  public static GeomFill_Trihedron swigToEnum(int swigValue) {
    GeomFill_Trihedron[] swigValues = GeomFill_Trihedron.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (GeomFill_Trihedron swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + GeomFill_Trihedron.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private GeomFill_Trihedron() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private GeomFill_Trihedron(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private GeomFill_Trihedron(GeomFill_Trihedron swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

