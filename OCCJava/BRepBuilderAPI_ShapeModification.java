package opencascade;

/**
 *  Lists the possible types of modification to a shape
 *  following a topological operation: Preserved, Deleted,
 *  Trimmed, Merged or BoundaryModified.
 *  This enumeration enables you to assign a "state" to the
 *  different shapes that are on the list of operands for
 *  each API function. The MakeShape class then uses this
 *  to determine what has happened to the shapes which
 *  constitute the list of operands.
 */
public enum BRepBuilderAPI_ShapeModification {
  BRepBuilderAPI_Preserved,
  BRepBuilderAPI_Deleted,
  BRepBuilderAPI_Trimmed,
  BRepBuilderAPI_Merged,
  BRepBuilderAPI_BoundaryModified;

  public final int swigValue() {
    return swigValue;
  }

  public static BRepBuilderAPI_ShapeModification swigToEnum(int swigValue) {
    BRepBuilderAPI_ShapeModification[] swigValues = BRepBuilderAPI_ShapeModification.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (BRepBuilderAPI_ShapeModification swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + BRepBuilderAPI_ShapeModification.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_ShapeModification() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_ShapeModification(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_ShapeModification(BRepBuilderAPI_ShapeModification swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

