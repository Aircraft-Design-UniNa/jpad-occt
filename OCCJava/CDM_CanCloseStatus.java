package opencascade;

public enum CDM_CanCloseStatus {
  CDM_CCS_OK,
  CDM_CCS_NotOpen,
  CDM_CCS_UnstoredReferenced,
  CDM_CCS_ModifiedReferenced,
  CDM_CCS_ReferenceRejection;

  public final int swigValue() {
    return swigValue;
  }

  public static CDM_CanCloseStatus swigToEnum(int swigValue) {
    CDM_CanCloseStatus[] swigValues = CDM_CanCloseStatus.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (CDM_CanCloseStatus swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + CDM_CanCloseStatus.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private CDM_CanCloseStatus() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private CDM_CanCloseStatus(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private CDM_CanCloseStatus(CDM_CanCloseStatus swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

