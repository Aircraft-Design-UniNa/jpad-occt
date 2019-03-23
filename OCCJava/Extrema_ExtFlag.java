package opencascade;

public enum Extrema_ExtFlag {
  Extrema_ExtFlag_MIN,
  Extrema_ExtFlag_MAX,
  Extrema_ExtFlag_MINMAX;

  public final int swigValue() {
    return swigValue;
  }

  public static Extrema_ExtFlag swigToEnum(int swigValue) {
    Extrema_ExtFlag[] swigValues = Extrema_ExtFlag.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (Extrema_ExtFlag swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + Extrema_ExtFlag.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private Extrema_ExtFlag() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private Extrema_ExtFlag(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private Extrema_ExtFlag(Extrema_ExtFlag swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

