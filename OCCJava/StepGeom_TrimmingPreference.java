package opencascade;

public enum StepGeom_TrimmingPreference {
  StepGeom_tpCartesian,
  StepGeom_tpParameter,
  StepGeom_tpUnspecified;

  public final int swigValue() {
    return swigValue;
  }

  public static StepGeom_TrimmingPreference swigToEnum(int swigValue) {
    StepGeom_TrimmingPreference[] swigValues = StepGeom_TrimmingPreference.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (StepGeom_TrimmingPreference swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + StepGeom_TrimmingPreference.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private StepGeom_TrimmingPreference() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private StepGeom_TrimmingPreference(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private StepGeom_TrimmingPreference(StepGeom_TrimmingPreference swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

