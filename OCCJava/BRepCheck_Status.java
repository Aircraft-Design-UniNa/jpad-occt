package opencascade;

public enum BRepCheck_Status {
  BRepCheck_NoError,
  BRepCheck_InvalidPointOnCurve,
  BRepCheck_InvalidPointOnCurveOnSurface,
  BRepCheck_InvalidPointOnSurface,
  BRepCheck_No3DCurve,
  BRepCheck_Multiple3DCurve,
  BRepCheck_Invalid3DCurve,
  BRepCheck_NoCurveOnSurface,
  BRepCheck_InvalidCurveOnSurface,
  BRepCheck_InvalidCurveOnClosedSurface,
  BRepCheck_InvalidSameRangeFlag,
  BRepCheck_InvalidSameParameterFlag,
  BRepCheck_InvalidDegeneratedFlag,
  BRepCheck_FreeEdge,
  BRepCheck_InvalidMultiConnexity,
  BRepCheck_InvalidRange,
  BRepCheck_EmptyWire,
  BRepCheck_RedundantEdge,
  BRepCheck_SelfIntersectingWire,
  BRepCheck_NoSurface,
  BRepCheck_InvalidWire,
  BRepCheck_RedundantWire,
  BRepCheck_IntersectingWires,
  BRepCheck_InvalidImbricationOfWires,
  BRepCheck_EmptyShell,
  BRepCheck_RedundantFace,
  BRepCheck_InvalidImbricationOfShells,
  BRepCheck_UnorientableShape,
  BRepCheck_NotClosed,
  BRepCheck_NotConnected,
  BRepCheck_SubshapeNotInShape,
  BRepCheck_BadOrientation,
  BRepCheck_BadOrientationOfSubshape,
  BRepCheck_InvalidPolygonOnTriangulation,
  BRepCheck_InvalidToleranceValue,
  BRepCheck_EnclosedRegion,
  BRepCheck_CheckFail;

  public final int swigValue() {
    return swigValue;
  }

  public static BRepCheck_Status swigToEnum(int swigValue) {
    BRepCheck_Status[] swigValues = BRepCheck_Status.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (BRepCheck_Status swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + BRepCheck_Status.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private BRepCheck_Status() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private BRepCheck_Status(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private BRepCheck_Status(BRepCheck_Status swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

