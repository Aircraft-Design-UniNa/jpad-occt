package opencascade;

/**
 *  -   NoConstraint: this point has no constraints.
 *  -   PassPoint: the approximation curve passes through this point.
 *  -   TangencyPoint: this point has a tangency constraint.
 *  -   CurvaturePoint: this point has a curvature constraint.
 */
public enum AppParCurves_Constraint {
  AppParCurves_NoConstraint,
  AppParCurves_PassPoint,
  AppParCurves_TangencyPoint,
  AppParCurves_CurvaturePoint;

  public final int swigValue() {
    return swigValue;
  }

  public static AppParCurves_Constraint swigToEnum(int swigValue) {
    AppParCurves_Constraint[] swigValues = AppParCurves_Constraint.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (AppParCurves_Constraint swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + AppParCurves_Constraint.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private AppParCurves_Constraint() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private AppParCurves_Constraint(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private AppParCurves_Constraint(AppParCurves_Constraint swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

