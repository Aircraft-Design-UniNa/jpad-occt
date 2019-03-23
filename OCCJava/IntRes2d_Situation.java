package opencascade;

public enum IntRes2d_Situation {
  IntRes2d_Inside,
  IntRes2d_Outside,
  IntRes2d_Unknown;

  public final int swigValue() {
    return swigValue;
  }

  public static IntRes2d_Situation swigToEnum(int swigValue) {
    IntRes2d_Situation[] swigValues = IntRes2d_Situation.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (IntRes2d_Situation swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + IntRes2d_Situation.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private IntRes2d_Situation() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private IntRes2d_Situation(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private IntRes2d_Situation(IntRes2d_Situation swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

