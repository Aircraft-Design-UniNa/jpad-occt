package opencascade;

public enum StepToTopoDS_TranslateFaceError {
  StepToTopoDS_TranslateFaceDone,
  StepToTopoDS_TranslateFaceOther;

  public final int swigValue() {
    return swigValue;
  }

  public static StepToTopoDS_TranslateFaceError swigToEnum(int swigValue) {
    StepToTopoDS_TranslateFaceError[] swigValues = StepToTopoDS_TranslateFaceError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (StepToTopoDS_TranslateFaceError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + StepToTopoDS_TranslateFaceError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslateFaceError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslateFaceError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_TranslateFaceError(StepToTopoDS_TranslateFaceError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

