package opencascade;

/**
 *  Option to manage  discontinuities in  Sweep
 */
public enum BRepBuilderAPI_TransitionMode {
  BRepBuilderAPI_Transformed,
  BRepBuilderAPI_RightCorner,
  BRepBuilderAPI_RoundCorner;

  public final int swigValue() {
    return swigValue;
  }

  public static BRepBuilderAPI_TransitionMode swigToEnum(int swigValue) {
    BRepBuilderAPI_TransitionMode[] swigValues = BRepBuilderAPI_TransitionMode.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (BRepBuilderAPI_TransitionMode swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + BRepBuilderAPI_TransitionMode.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_TransitionMode() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_TransitionMode(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_TransitionMode(BRepBuilderAPI_TransitionMode swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

