package opencascade;

public enum StepToTopoDS_TranslateVertexError {
  StepToTopoDS_TranslateVertexDone,
  StepToTopoDS_TranslateVertexOther;

  public final int swigValue() {
    return swigValue;
  }

  public static StepToTopoDS_TranslateVertexError swigToEnum(int swigValue) {
    StepToTopoDS_TranslateVertexError[] swigValues = StepToTopoDS_TranslateVertexError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (StepToTopoDS_TranslateVertexError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + StepToTopoDS_TranslateVertexError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslateVertexError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslateVertexError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslateVertexError(StepToTopoDS_TranslateVertexError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

