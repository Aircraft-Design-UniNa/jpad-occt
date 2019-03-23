package opencascade;

/**
 *  Used by OSD_File in the method Seek.
 */
public enum OSD_FromWhere {
  OSD_FromBeginning,
  OSD_FromHere,
  OSD_FromEnd;

  public final int swigValue() {
    return swigValue;
  }

  public static OSD_FromWhere swigToEnum(int swigValue) {
    OSD_FromWhere[] swigValues = OSD_FromWhere.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (OSD_FromWhere swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + OSD_FromWhere.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private OSD_FromWhere() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private OSD_FromWhere(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private OSD_FromWhere(OSD_FromWhere swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

