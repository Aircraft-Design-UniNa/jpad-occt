package opencascade;

public enum Approx_ParametrizationType {
  Approx_ChordLength,
  Approx_Centripetal,
  Approx_IsoParametric;

  public final int swigValue() {
    return swigValue;
  }

  public static Approx_ParametrizationType swigToEnum(int swigValue) {
    Approx_ParametrizationType[] swigValues = Approx_ParametrizationType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (Approx_ParametrizationType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + Approx_ParametrizationType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private Approx_ParametrizationType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private Approx_ParametrizationType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private Approx_ParametrizationType(Approx_ParametrizationType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

