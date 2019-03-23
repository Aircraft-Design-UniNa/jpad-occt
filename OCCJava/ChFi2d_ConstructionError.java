package opencascade;

/**
 *  error     that    can   occur       during   the
 *  fillet  construction on planar wire//! the face is not planar//! the face is null//! the two  faces used for the initialisation are
 *  uncompatible.//! the  parameters  as  distances   or  angle for
 *  chamfer are less or equal to zero.//! the initialization has been succesfull.//! the algorithm could not find a solution.//! the vertex given  to locate the fillet  or the
 *  chamfer  is not connected to 2 edges.//! the two edges connected to the vertex are tangent.//! the first edge is degenerated.//! the last edge is degenerated.//! the two edges are degenerated.//! One or the two  edges connected to the  vertex
 *  is a fillet or a chamfer
 *  One or the two  edges connected to the  vertex
 *  is not a line or a circle
 */
public enum ChFi2d_ConstructionError {
  ChFi2d_NotPlanar,
  ChFi2d_NoFace,
  ChFi2d_InitialisationError,
  ChFi2d_ParametersError,
  ChFi2d_Ready,
  ChFi2d_IsDone,
  ChFi2d_ComputationError,
  ChFi2d_ConnexionError,
  ChFi2d_TangencyError,
  ChFi2d_FirstEdgeDegenerated,
  ChFi2d_LastEdgeDegenerated,
  ChFi2d_BothEdgesDegenerated,
  ChFi2d_NotAuthorized;

  public final int swigValue() {
    return swigValue;
  }

  public static ChFi2d_ConstructionError swigToEnum(int swigValue) {
    ChFi2d_ConstructionError[] swigValues = ChFi2d_ConstructionError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ChFi2d_ConstructionError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ChFi2d_ConstructionError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ChFi2d_ConstructionError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ChFi2d_ConstructionError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ChFi2d_ConstructionError(ChFi2d_ConstructionError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

