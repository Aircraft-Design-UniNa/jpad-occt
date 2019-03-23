package opencascade;

/**
 *  Identifies the position of a vertex or a set of
 *  vertices relative to a region of a shape.
 *  The figure shown above illustrates the states of
 *  vertices found in various parts of the edge relative
 *  to the face which it intersects.
 */
public enum TopAbs_State {
  TopAbs_IN,
  TopAbs_OUT,
  TopAbs_ON,
  TopAbs_UNKNOWN;

  public final int swigValue() {
    return swigValue;
  }

  public static TopAbs_State swigToEnum(int swigValue) {
    TopAbs_State[] swigValues = TopAbs_State.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (TopAbs_State swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + TopAbs_State.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private TopAbs_State() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private TopAbs_State(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private TopAbs_State(TopAbs_State swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

