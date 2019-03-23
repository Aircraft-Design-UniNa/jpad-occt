package opencascade;

public enum StepGeom_BSplineSurfaceForm {
  StepGeom_bssfPlaneSurf,
  StepGeom_bssfCylindricalSurf,
  StepGeom_bssfConicalSurf,
  StepGeom_bssfSphericalSurf,
  StepGeom_bssfToroidalSurf,
  StepGeom_bssfSurfOfRevolution,
  StepGeom_bssfRuledSurf,
  StepGeom_bssfGeneralisedCone,
  StepGeom_bssfQuadricSurf,
  StepGeom_bssfSurfOfLinearExtrusion,
  StepGeom_bssfUnspecified;

  public final int swigValue() {
    return swigValue;
  }

  public static StepGeom_BSplineSurfaceForm swigToEnum(int swigValue) {
    StepGeom_BSplineSurfaceForm[] swigValues = StepGeom_BSplineSurfaceForm.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (StepGeom_BSplineSurfaceForm swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + StepGeom_BSplineSurfaceForm.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private StepGeom_BSplineSurfaceForm() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private StepGeom_BSplineSurfaceForm(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private StepGeom_BSplineSurfaceForm(StepGeom_BSplineSurfaceForm swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

