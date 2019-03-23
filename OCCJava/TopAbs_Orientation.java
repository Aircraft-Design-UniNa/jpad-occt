package opencascade;

/**
 *  Identifies the orientation of a topological shape.
 *  Orientation can represent a relation between two
 *  entities, or it can apply to a shape in its own right.
 *  When used to describe a relation between two
 *  shapes, orientation allows you to use the underlying
 *  entity in either direction. For example on a curve
 *  which is oriented FORWARD (say from left to right)
 *  you can have both a FORWARD and a REVERSED
 *  edge. The FORWARD edge will be oriented from
 *  left to right, and the REVERSED edge from right to
 *  left. In this way, you share the underlying entity. In
 *  other words, two faces of a cube can share an
 *  edge, and can also be used to build compound shapes.
 *  For each case in which an element is used as the
 *  boundary of a geometric domain of a higher
 *  dimension, this element defines two local regions of
 *  which one is arbitrarily considered as the default
 *  region. A change in orientation implies a switch of
 *  default region. This allows you to apply changes of
 *  orientation to the shape as a whole.
 */
public enum TopAbs_Orientation {
  TopAbs_FORWARD,
  TopAbs_REVERSED,
  TopAbs_INTERNAL,
  TopAbs_EXTERNAL;

  public final int swigValue() {
    return swigValue;
  }

  public static TopAbs_Orientation swigToEnum(int swigValue) {
    TopAbs_Orientation[] swigValues = TopAbs_Orientation.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (TopAbs_Orientation swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + TopAbs_Orientation.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private TopAbs_Orientation() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private TopAbs_Orientation(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private TopAbs_Orientation(TopAbs_Orientation swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

