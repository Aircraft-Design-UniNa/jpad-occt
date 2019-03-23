package opencascade;

public enum StepGeom_PreferredSurfaceCurveRepresentation {
  StepGeom_pscrCurve3d,
  StepGeom_pscrPcurveS1,
  StepGeom_pscrPcurveS2;

  public final int swigValue() {
    return swigValue;
  }

  public static StepGeom_PreferredSurfaceCurveRepresentation swigToEnum(int swigValue) {
    StepGeom_PreferredSurfaceCurveRepresentation[] swigValues = StepGeom_PreferredSurfaceCurveRepresentation.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (StepGeom_PreferredSurfaceCurveRepresentation swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + StepGeom_PreferredSurfaceCurveRepresentation.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private StepGeom_PreferredSurfaceCurveRepresentation() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private StepGeom_PreferredSurfaceCurveRepresentation(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private StepGeom_PreferredSurfaceCurveRepresentation(StepGeom_PreferredSurfaceCurveRepresentation swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

