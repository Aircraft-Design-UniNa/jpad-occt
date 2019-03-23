package opencascade;

/**
 *  Indicates the outcome of the construction of a face, i.e.
 *  whether it is successful or not, as explained below:
 *  -   BRepBuilderAPI_ShellDone No error occurred.
 *  The shell is correctly built.
 *  -   BRepBuilderAPI_EmptyShell No initialization of
 *  the algorithm: only an empty constructor was used.
 *  -   BRepBuilderAPI_DisconnectedShell not yet used
 *  -   BRepBuilderAPI_ShellParametersOutOfRange
 *  The parameters given to limit the surface are out of its bounds.
 */
public enum BRepBuilderAPI_ShellError {
  BRepBuilderAPI_ShellDone,
  BRepBuilderAPI_EmptyShell,
  BRepBuilderAPI_DisconnectedShell,
  BRepBuilderAPI_ShellParametersOutOfRange;

  public final int swigValue() {
    return swigValue;
  }

  public static BRepBuilderAPI_ShellError swigToEnum(int swigValue) {
    BRepBuilderAPI_ShellError[] swigValues = BRepBuilderAPI_ShellError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (BRepBuilderAPI_ShellError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + BRepBuilderAPI_ShellError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_ShellError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_ShellError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_ShellError(BRepBuilderAPI_ShellError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

