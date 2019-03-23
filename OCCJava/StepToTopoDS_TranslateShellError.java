package opencascade;

public enum StepToTopoDS_TranslateShellError {
  StepToTopoDS_TranslateShellDone,
  StepToTopoDS_TranslateShellOther;

  public final int swigValue() {
    return swigValue;
  }

  public static StepToTopoDS_TranslateShellError swigToEnum(int swigValue) {
    StepToTopoDS_TranslateShellError[] swigValues = StepToTopoDS_TranslateShellError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (StepToTopoDS_TranslateShellError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + StepToTopoDS_TranslateShellError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslateShellError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslateShellError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslateShellError(StepToTopoDS_TranslateShellError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

