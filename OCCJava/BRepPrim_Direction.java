package opencascade;

public enum BRepPrim_Direction {
  BRepPrim_XMin,
  BRepPrim_XMax,
  BRepPrim_YMin,
  BRepPrim_YMax,
  BRepPrim_ZMin,
  BRepPrim_ZMax;

  public final int swigValue() {
    return swigValue;
  }

  public static BRepPrim_Direction swigToEnum(int swigValue) {
    BRepPrim_Direction[] swigValues = BRepPrim_Direction.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (BRepPrim_Direction swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + BRepPrim_Direction.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private BRepPrim_Direction() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private BRepPrim_Direction(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private BRepPrim_Direction(BRepPrim_Direction swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

