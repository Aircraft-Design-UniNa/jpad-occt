package opencascade;

public enum PCDM_ReaderStatus {
  PCDM_RS_OK,
  PCDM_RS_NoDriver,
  PCDM_RS_UnknownFileDriver,
  PCDM_RS_OpenError,
  PCDM_RS_NoVersion,
  PCDM_RS_NoSchema,
  PCDM_RS_NoDocument,
  PCDM_RS_ExtensionFailure,
  PCDM_RS_WrongStreamMode,
  PCDM_RS_FormatFailure,
  PCDM_RS_TypeFailure,
  PCDM_RS_TypeNotFoundInSchema,
  PCDM_RS_UnrecognizedFileFormat,
  PCDM_RS_MakeFailure,
  PCDM_RS_PermissionDenied,
  PCDM_RS_DriverFailure,
  PCDM_RS_AlreadyRetrievedAndModified,
  PCDM_RS_AlreadyRetrieved,
  PCDM_RS_UnknownDocument,
  PCDM_RS_WrongResource,
  PCDM_RS_ReaderException,
  PCDM_RS_NoModel;

  public final int swigValue() {
    return swigValue;
  }

  public static PCDM_ReaderStatus swigToEnum(int swigValue) {
    PCDM_ReaderStatus[] swigValues = PCDM_ReaderStatus.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (PCDM_ReaderStatus swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + PCDM_ReaderStatus.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private PCDM_ReaderStatus() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private PCDM_ReaderStatus(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private PCDM_ReaderStatus(PCDM_ReaderStatus swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

