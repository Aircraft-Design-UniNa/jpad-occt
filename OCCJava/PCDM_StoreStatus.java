package opencascade;

public enum PCDM_StoreStatus {
  PCDM_SS_OK,
  PCDM_SS_DriverFailure,
  PCDM_SS_WriteFailure,
  PCDM_SS_Failure,
  PCDM_SS_Doc_IsNull,
  PCDM_SS_No_Obj,
  PCDM_SS_Info_Section_Error;

  public final int swigValue() {
    return swigValue;
  }

  public static PCDM_StoreStatus swigToEnum(int swigValue) {
    PCDM_StoreStatus[] swigValues = PCDM_StoreStatus.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (PCDM_StoreStatus swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + PCDM_StoreStatus.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private PCDM_StoreStatus() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private PCDM_StoreStatus(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private PCDM_StoreStatus(PCDM_StoreStatus swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

