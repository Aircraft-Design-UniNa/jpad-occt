package opencascade;

/**
 *  Specifies the file open mode.
 */
public enum OSD_OpenMode {
  OSD_ReadOnly,
  OSD_WriteOnly,
  OSD_ReadWrite;

  public final int swigValue() {
    return swigValue;
  }

  public static OSD_OpenMode swigToEnum(int swigValue) {
    OSD_OpenMode[] swigValues = OSD_OpenMode.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (OSD_OpenMode swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + OSD_OpenMode.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private OSD_OpenMode() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private OSD_OpenMode(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private OSD_OpenMode(OSD_OpenMode swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

