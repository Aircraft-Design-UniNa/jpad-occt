package opencascade;

public enum StepToTopoDS_GeometricToolError {
  StepToTopoDS_GeometricToolDone,
  StepToTopoDS_GeometricToolIsDegenerated,
  StepToTopoDS_GeometricToolHasNoPCurve,
  StepToTopoDS_GeometricToolWrong3dParameters,
  StepToTopoDS_GeometricToolNoProjectiOnCurve,
  StepToTopoDS_GeometricToolOther;

  public final int swigValue() {
    return swigValue;
  }

  public static StepToTopoDS_GeometricToolError swigToEnum(int swigValue) {
    StepToTopoDS_GeometricToolError[] swigValues = StepToTopoDS_GeometricToolError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (StepToTopoDS_GeometricToolError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + StepToTopoDS_GeometricToolError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_GeometricToolError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_GeometricToolError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private StepToTopoDS_GeometricToolError(StepToTopoDS_GeometricToolError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

