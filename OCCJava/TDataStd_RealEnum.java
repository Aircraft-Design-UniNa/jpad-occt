package opencascade;

/**
 *  The terms of this enumeration define the
 *  semantics of a real number value.
 */
public enum TDataStd_RealEnum {
  TDataStd_SCALAR,
  TDataStd_LENGTH,
  TDataStd_ANGULAR;

  public final int swigValue() {
    return swigValue;
  }

  public static TDataStd_RealEnum swigToEnum(int swigValue) {
    TDataStd_RealEnum[] swigValues = TDataStd_RealEnum.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (TDataStd_RealEnum swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + TDataStd_RealEnum.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private TDataStd_RealEnum() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private TDataStd_RealEnum(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private TDataStd_RealEnum(TDataStd_RealEnum swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

