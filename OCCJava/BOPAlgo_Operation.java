package opencascade;

public enum BOPAlgo_Operation {
  BOPAlgo_COMMON,
  BOPAlgo_FUSE,
  BOPAlgo_CUT,
  BOPAlgo_CUT21,
  BOPAlgo_SECTION,
  BOPAlgo_UNKNOWN;

  public final int swigValue() {
    return swigValue;
  }

  public static BOPAlgo_Operation swigToEnum(int swigValue) {
    BOPAlgo_Operation[] swigValues = BOPAlgo_Operation.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (BOPAlgo_Operation swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + BOPAlgo_Operation.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private BOPAlgo_Operation() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private BOPAlgo_Operation(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private BOPAlgo_Operation(BOPAlgo_Operation swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

