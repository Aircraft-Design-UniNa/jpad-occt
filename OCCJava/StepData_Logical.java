package opencascade;

/**
 *  A Standard Definition for STEP (which knows Boolean too)
 */
public enum StepData_Logical {
  StepData_LFalse,
  StepData_LTrue,
  StepData_LUnknown;

  public final int swigValue() {
    return swigValue;
  }

  public static StepData_Logical swigToEnum(int swigValue) {
    StepData_Logical[] swigValues = StepData_Logical.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (StepData_Logical swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + StepData_Logical.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private StepData_Logical() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private StepData_Logical(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private StepData_Logical(StepData_Logical swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

