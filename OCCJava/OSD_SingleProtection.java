package opencascade;

/**
 *  Access rights for files.
 *  R means Read, W means Write, X means eXecute and D means Delete.
 *  On UNIX, the right to Delete is combined with Write access.
 *  So if "W"rite is not set and "D"elete is, "W"rite will be set
 *  and if "W" is set, "D" will be too.
 */
public enum OSD_SingleProtection {
  OSD_None,
  OSD_R,
  OSD_W,
  OSD_RW,
  OSD_X,
  OSD_RX,
  OSD_WX,
  OSD_RWX,
  OSD_D,
  OSD_RD,
  OSD_WD,
  OSD_RWD,
  OSD_XD,
  OSD_RXD,
  OSD_WXD,
  OSD_RWXD;

  public final int swigValue() {
    return swigValue;
  }

  public static OSD_SingleProtection swigToEnum(int swigValue) {
    OSD_SingleProtection[] swigValues = OSD_SingleProtection.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (OSD_SingleProtection swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + OSD_SingleProtection.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private OSD_SingleProtection() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private OSD_SingleProtection(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private OSD_SingleProtection(OSD_SingleProtection swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

