package opencascade;

public enum StepToTopoDS_TranslatePolyLoopError {
  StepToTopoDS_TranslatePolyLoopDone,
  StepToTopoDS_TranslatePolyLoopOther;

  public final int swigValue() {
    return swigValue;
  }

  public static StepToTopoDS_TranslatePolyLoopError swigToEnum(int swigValue) {
    StepToTopoDS_TranslatePolyLoopError[] swigValues = StepToTopoDS_TranslatePolyLoopError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (StepToTopoDS_TranslatePolyLoopError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + StepToTopoDS_TranslatePolyLoopError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslatePolyLoopError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslatePolyLoopError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslatePolyLoopError(StepToTopoDS_TranslatePolyLoopError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

