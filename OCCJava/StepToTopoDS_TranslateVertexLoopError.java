package opencascade;

public enum StepToTopoDS_TranslateVertexLoopError {
  StepToTopoDS_TranslateVertexLoopDone,
  StepToTopoDS_TranslateVertexLoopOther;

  public final int swigValue() {
    return swigValue;
  }

  public static StepToTopoDS_TranslateVertexLoopError swigToEnum(int swigValue) {
    StepToTopoDS_TranslateVertexLoopError[] swigValues = StepToTopoDS_TranslateVertexLoopError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (StepToTopoDS_TranslateVertexLoopError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + StepToTopoDS_TranslateVertexLoopError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslateVertexLoopError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslateVertexLoopError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslateVertexLoopError(StepToTopoDS_TranslateVertexLoopError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

