package opencascade;

public enum IntAna_ResultType {
  IntAna_Point,
  IntAna_Line,
  IntAna_Circle,
  IntAna_PointAndCircle,
  IntAna_Ellipse,
  IntAna_Parabola,
  IntAna_Hyperbola,
  IntAna_Empty,
  IntAna_Same,
  IntAna_NoGeometricSolution;

  public final int swigValue() {
    return swigValue;
  }

  public static IntAna_ResultType swigToEnum(int swigValue) {
    IntAna_ResultType[] swigValues = IntAna_ResultType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (IntAna_ResultType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + IntAna_ResultType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private IntAna_ResultType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private IntAna_ResultType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private IntAna_ResultType(IntAna_ResultType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

