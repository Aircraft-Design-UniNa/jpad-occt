package opencascade;

/**
 *  execution status of an individual transfer (see Transcriptor)
 */
public enum Transfer_StatusExec {
  Transfer_StatusInitial,
  Transfer_StatusRun,
  Transfer_StatusDone,
  Transfer_StatusError,
  Transfer_StatusLoop;

  public final int swigValue() {
    return swigValue;
  }

  public static Transfer_StatusExec swigToEnum(int swigValue) {
    Transfer_StatusExec[] swigValues = Transfer_StatusExec.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (Transfer_StatusExec swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + Transfer_StatusExec.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private Transfer_StatusExec() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private Transfer_StatusExec(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private Transfer_StatusExec(Transfer_StatusExec swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

