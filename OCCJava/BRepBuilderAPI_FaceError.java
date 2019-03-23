package opencascade;

/**
 *  Indicates the outcome of the
 *  construction of a face, i.e. whether it has been successful or
 *  not, as explained below:
 *  -      BRepBuilderAPI_FaceDone No error occurred. The face is
 *  correctly built.
 *  -      BRepBuilderAPI_NoFace No initialization of the
 *  algorithm; only an empty constructor was used.
 *  -      BRepBuilderAPI_NotPlanar
 *  No surface was given and the wire was not planar.
 *  -      BRepBuilderAPI_CurveProjectionFailed
 *  Not used so far.
 *  -      BRepBuilderAPI_ParametersOutOfRange
 *  The parameters given to limit the surface are out of its    bounds.
 */
public enum BRepBuilderAPI_FaceError {
  BRepBuilderAPI_FaceDone,
  BRepBuilderAPI_NoFace,
  BRepBuilderAPI_NotPlanar,
  BRepBuilderAPI_CurveProjectionFailed,
  BRepBuilderAPI_ParametersOutOfRange;

  public final int swigValue() {
    return swigValue;
  }

  public static BRepBuilderAPI_FaceError swigToEnum(int swigValue) {
    BRepBuilderAPI_FaceError[] swigValues = BRepBuilderAPI_FaceError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (BRepBuilderAPI_FaceError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + BRepBuilderAPI_FaceError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_FaceError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_FaceError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_FaceError(BRepBuilderAPI_FaceError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

