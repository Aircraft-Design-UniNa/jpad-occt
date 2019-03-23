package opencascade;

/**
 *  Gives you the choice of translation mode for an Open
 *  CASCADE shape that is being translated to STEP.
 *  - STEPControl_AsIs translates an Open CASCADE shape to its
 *  highest possible STEP representation.
 *  - STEPControl_ManifoldSolidBrep translates an Open CASCADE shape
 *  to a STEP manifold_solid_brep or brep_with_voids entity.
 *  - STEPControl_FacetedBrep translates an Open CASCADE shape
 *  into a STEP faceted_brep entity.
 *  -  STEPControl_ShellBasedSurfaceModel translates an Open CASCADE shape
 *  into a STEP shell_based_surface_model entity.
 *  - STEPControl_GeometricCurveSet
 *  translates an Open CASCADE shape into a STEP geometric_curve_set entity.
 */
public enum STEPControl_StepModelType {
  STEPControl_AsIs,
  STEPControl_ManifoldSolidBrep,
  STEPControl_BrepWithVoids,
  STEPControl_FacetedBrep,
  STEPControl_FacetedBrepAndBrepWithVoids,
  STEPControl_ShellBasedSurfaceModel,
  STEPControl_GeometricCurveSet,
  STEPControl_Hybrid;

  public final int swigValue() {
    return swigValue;
  }

  public static STEPControl_StepModelType swigToEnum(int swigValue) {
    STEPControl_StepModelType[] swigValues = STEPControl_StepModelType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (STEPControl_StepModelType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + STEPControl_StepModelType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private STEPControl_StepModelType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private STEPControl_StepModelType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private STEPControl_StepModelType(STEPControl_StepModelType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

