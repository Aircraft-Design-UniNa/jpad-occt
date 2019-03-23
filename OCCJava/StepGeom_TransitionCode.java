package opencascade;

public enum StepGeom_TransitionCode {
  StepGeom_tcDiscontinuous,
  StepGeom_tcContinuous,
  StepGeom_tcContSameGradient,
  StepGeom_tcContSameGradientSameCurvature;

  public final int swigValue() {
    return swigValue;
  }

  public static StepGeom_TransitionCode swigToEnum(int swigValue) {
    StepGeom_TransitionCode[] swigValues = StepGeom_TransitionCode.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (StepGeom_TransitionCode swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + StepGeom_TransitionCode.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private StepGeom_TransitionCode() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private StepGeom_TransitionCode(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private StepGeom_TransitionCode(StepGeom_TransitionCode swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

