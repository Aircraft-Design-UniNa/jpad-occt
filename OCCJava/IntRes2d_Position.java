package opencascade;

public enum IntRes2d_Position {
  IntRes2d_Head,
  IntRes2d_Middle,
  IntRes2d_End;

  public final int swigValue() {
    return swigValue;
  }

  public static IntRes2d_Position swigToEnum(int swigValue) {
    IntRes2d_Position[] swigValues = IntRes2d_Position.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (IntRes2d_Position swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + IntRes2d_Position.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private IntRes2d_Position() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private IntRes2d_Position(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private IntRes2d_Position(IntRes2d_Position swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

