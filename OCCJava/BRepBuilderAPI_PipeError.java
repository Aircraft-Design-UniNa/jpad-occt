package opencascade;

/**
 *  Errors that can occur at (shell)pipe construction.
 */
public enum BRepBuilderAPI_PipeError {
  BRepBuilderAPI_PipeDone,
  BRepBuilderAPI_PipeNotDone,
  BRepBuilderAPI_PlaneNotIntersectGuide,
  BRepBuilderAPI_ImpossibleContact;

  public final int swigValue() {
    return swigValue;
  }

  public static BRepBuilderAPI_PipeError swigToEnum(int swigValue) {
    BRepBuilderAPI_PipeError[] swigValues = BRepBuilderAPI_PipeError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (BRepBuilderAPI_PipeError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + BRepBuilderAPI_PipeError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_PipeError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_PipeError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_PipeError(BRepBuilderAPI_PipeError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

