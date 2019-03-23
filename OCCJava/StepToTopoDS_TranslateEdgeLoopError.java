package opencascade;

public enum StepToTopoDS_TranslateEdgeLoopError {
  StepToTopoDS_TranslateEdgeLoopDone,
  StepToTopoDS_TranslateEdgeLoopOther;

  public final int swigValue() {
    return swigValue;
  }

  public static StepToTopoDS_TranslateEdgeLoopError swigToEnum(int swigValue) {
    StepToTopoDS_TranslateEdgeLoopError[] swigValues = StepToTopoDS_TranslateEdgeLoopError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (StepToTopoDS_TranslateEdgeLoopError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + StepToTopoDS_TranslateEdgeLoopError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslateEdgeLoopError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslateEdgeLoopError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslateEdgeLoopError(StepToTopoDS_TranslateEdgeLoopError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

