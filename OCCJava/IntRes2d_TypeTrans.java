package opencascade;

public enum IntRes2d_TypeTrans {
  IntRes2d_In,
  IntRes2d_Out,
  IntRes2d_Touch,
  IntRes2d_Undecided;

  public final int swigValue() {
    return swigValue;
  }

  public static IntRes2d_TypeTrans swigToEnum(int swigValue) {
    IntRes2d_TypeTrans[] swigValues = IntRes2d_TypeTrans.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (IntRes2d_TypeTrans swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + IntRes2d_TypeTrans.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private IntRes2d_TypeTrans() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private IntRes2d_TypeTrans(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private IntRes2d_TypeTrans(IntRes2d_TypeTrans swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

