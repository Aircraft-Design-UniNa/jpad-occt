package opencascade;

public enum StepToTopoDS_TranslateEdgeError {
  StepToTopoDS_TranslateEdgeDone,
  StepToTopoDS_TranslateEdgeOther;

  public final int swigValue() {
    return swigValue;
  }

  public static StepToTopoDS_TranslateEdgeError swigToEnum(int swigValue) {
    StepToTopoDS_TranslateEdgeError[] swigValues = StepToTopoDS_TranslateEdgeError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (StepToTopoDS_TranslateEdgeError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + StepToTopoDS_TranslateEdgeError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslateEdgeError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslateEdgeError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslateEdgeError(StepToTopoDS_TranslateEdgeError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

