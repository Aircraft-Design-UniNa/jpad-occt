package opencascade;

/**
 *  result status of transferring an entity (see Transcriptor)
 */
public enum Transfer_StatusResult {
  Transfer_StatusVoid,
  Transfer_StatusDefined,
  Transfer_StatusUsed;

  public final int swigValue() {
    return swigValue;
  }

  public static Transfer_StatusResult swigToEnum(int swigValue) {
    Transfer_StatusResult[] swigValues = Transfer_StatusResult.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (Transfer_StatusResult swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + Transfer_StatusResult.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private Transfer_StatusResult() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private Transfer_StatusResult(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private Transfer_StatusResult(Transfer_StatusResult swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

