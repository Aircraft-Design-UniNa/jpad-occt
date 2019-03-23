package opencascade;

public enum StepGeom_BSplineCurveForm {
  StepGeom_bscfPolylineForm,
  StepGeom_bscfCircularArc,
  StepGeom_bscfEllipticArc,
  StepGeom_bscfParabolicArc,
  StepGeom_bscfHyperbolicArc,
  StepGeom_bscfUnspecified;

  public final int swigValue() {
    return swigValue;
  }

  public static StepGeom_BSplineCurveForm swigToEnum(int swigValue) {
    StepGeom_BSplineCurveForm[] swigValues = StepGeom_BSplineCurveForm.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (StepGeom_BSplineCurveForm swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + StepGeom_BSplineCurveForm.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private StepGeom_BSplineCurveForm() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private StepGeom_BSplineCurveForm(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private StepGeom_BSplineCurveForm(StepGeom_BSplineCurveForm swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

