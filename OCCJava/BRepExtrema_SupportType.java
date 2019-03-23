package opencascade;

public enum BRepExtrema_SupportType {
  BRepExtrema_IsVertex,
  BRepExtrema_IsOnEdge,
  BRepExtrema_IsInFace;

  public final int swigValue() {
    return swigValue;
  }

  public static BRepExtrema_SupportType swigToEnum(int swigValue) {
    BRepExtrema_SupportType[] swigValues = BRepExtrema_SupportType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (BRepExtrema_SupportType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + BRepExtrema_SupportType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private BRepExtrema_SupportType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private BRepExtrema_SupportType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private BRepExtrema_SupportType(BRepExtrema_SupportType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

