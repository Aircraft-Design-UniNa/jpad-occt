package opencascade;

public enum StepToTopoDS_BuilderError {
  StepToTopoDS_BuilderDone,
  StepToTopoDS_BuilderOther;

  public final int swigValue() {
    return swigValue;
  }

  public static StepToTopoDS_BuilderError swigToEnum(int swigValue) {
    StepToTopoDS_BuilderError[] swigValues = StepToTopoDS_BuilderError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (StepToTopoDS_BuilderError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + StepToTopoDS_BuilderError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_BuilderError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_BuilderError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_BuilderError(StepToTopoDS_BuilderError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

