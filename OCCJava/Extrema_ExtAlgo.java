package opencascade;

public enum Extrema_ExtAlgo {
  Extrema_ExtAlgo_Grad,
  Extrema_ExtAlgo_Tree;

  public final int swigValue() {
    return swigValue;
  }

  public static Extrema_ExtAlgo swigToEnum(int swigValue) {
    Extrema_ExtAlgo[] swigValues = Extrema_ExtAlgo.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (Extrema_ExtAlgo swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + Extrema_ExtAlgo.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private Extrema_ExtAlgo() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private Extrema_ExtAlgo(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private Extrema_ExtAlgo(Extrema_ExtAlgo swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

