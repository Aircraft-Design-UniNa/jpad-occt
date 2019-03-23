package opencascade;

/**
 *  Indicates the outcome of the
 *  construction of an edge, i.e. whether it has been successful or
 *  not, as explained below:
 *  -      BRepBuilderAPI_EdgeDone No    error occurred; The edge is
 *  correctly built.
 *  -      BRepBuilderAPI_PointProjectionFailed No parameters were given but
 *  the projection of the 3D points on the curve failed. This
 *  happens when the point distance to the curve is greater than
 *  the precision value.
 *  -      BRepBuilderAPI_ParameterOutOfRange
 *  The given parameters are not in the parametric range
 *  C->FirstParameter(), C->LastParameter()
 *  -      BRepBuilderAPI_DifferentPointsOnClosedCurve
 *  The two vertices or points are the extremities of a closed
 *  curve but have different locations.
 *  -      BRepBuilderAPI_PointWithInfiniteParameter
 *  A finite coordinate point was associated with an infinite
 *  parameter (see the Precision package for a definition of    infinite values).
 *  -      BRepBuilderAPI_DifferentsPointAndParameter
 *  The distance between the 3D point and the point evaluated
 *  on the curve with the parameter is greater than the precision.
 *  -      BRepBuilderAPI_LineThroughIdenticPoints
 *  Two identical points were given to define a line (construction
 *  of an edge without curve); gp::Resolution is used for the    confusion test.
 */
public enum BRepBuilderAPI_EdgeError {
  BRepBuilderAPI_EdgeDone,
  BRepBuilderAPI_PointProjectionFailed,
  BRepBuilderAPI_ParameterOutOfRange,
  BRepBuilderAPI_DifferentPointsOnClosedCurve,
  BRepBuilderAPI_PointWithInfiniteParameter,
  BRepBuilderAPI_DifferentsPointAndParameter,
  BRepBuilderAPI_LineThroughIdenticPoints;

  public final int swigValue() {
    return swigValue;
  }

  public static BRepBuilderAPI_EdgeError swigToEnum(int swigValue) {
    BRepBuilderAPI_EdgeError[] swigValues = BRepBuilderAPI_EdgeError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (BRepBuilderAPI_EdgeError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + BRepBuilderAPI_EdgeError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_EdgeError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_EdgeError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_EdgeError(BRepBuilderAPI_EdgeError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

