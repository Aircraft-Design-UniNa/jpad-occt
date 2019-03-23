package opencascade;

/**
 *  Specifies the type of files.
 */
public enum OSD_KindFile {
  OSD_FILE,
  OSD_DIRECTORY,
  OSD_LINK,
  OSD_SOCKET,
  OSD_UNKNOWN;

  public final int swigValue() {
    return swigValue;
  }

  public static OSD_KindFile swigToEnum(int swigValue) {
    OSD_KindFile[] swigValues = OSD_KindFile.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (OSD_KindFile swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + OSD_KindFile.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private OSD_KindFile() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private OSD_KindFile(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private OSD_KindFile(OSD_KindFile swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

