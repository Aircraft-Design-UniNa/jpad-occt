package opencascade;

/**
 *  Lists the offset modes. These are the following:
 *  - BRepOffset_Skin which describes the offset along
 *  the surface of a solid, used to obtain a manifold topological space,
 *  - BRepOffset_Pipe which describes the offset of a
 *  curve, used to obtain a pre-surface,
 *  - BRepOffset_RectoVerso which describes the offset
 *  of a given surface shell along both sides of the surface.
 */
public enum BRepOffset_Mode {
  BRepOffset_Skin,
  BRepOffset_Pipe,
  BRepOffset_RectoVerso;

  public final int swigValue() {
    return swigValue;
  }

  public static BRepOffset_Mode swigToEnum(int swigValue) {
    BRepOffset_Mode[] swigValues = BRepOffset_Mode.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (BRepOffset_Mode swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + BRepOffset_Mode.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private BRepOffset_Mode() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private BRepOffset_Mode(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private BRepOffset_Mode(BRepOffset_Mode swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

