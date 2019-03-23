package opencascade;

public enum BRepOffset_Error {
  BRepOffset_NoError,
  BRepOffset_UnknownError,
  BRepOffset_BadNormalsOnGeometry,
  BRepOffset_C0Geometry,
  BRepOffset_NullOffset,
  BRepOffset_NotConnectedShell;

  public final int swigValue() {
    return swigValue;
  }

  public static BRepOffset_Error swigToEnum(int swigValue) {
    BRepOffset_Error[] swigValues = BRepOffset_Error.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (BRepOffset_Error swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + BRepOffset_Error.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private BRepOffset_Error() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private BRepOffset_Error(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private BRepOffset_Error(BRepOffset_Error swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

