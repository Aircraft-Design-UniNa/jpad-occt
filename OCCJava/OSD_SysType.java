package opencascade;

/**
 *  Thisd is a set of possible system types.
 *  'Default' means SysType of machine operating this process.
 *  This can be used with the Path class.
 *  All UNIX-like are grouped under "UnixBSD" or "UnixSystemV".
 *  Such systems are Solaris, NexTOS ...
 *  A category of systems accept MSDOS-like path such as
 *  WindowsNT and OS2.
 */
public enum OSD_SysType {
  OSD_Unknown,
  OSD_Default,
  OSD_UnixBSD,
  OSD_UnixSystemV,
  OSD_VMS,
  OSD_OS2,
  OSD_OSF,
  OSD_MacOs,
  OSD_Taligent,
  OSD_WindowsNT,
  OSD_LinuxREDHAT,
  OSD_Aix;

  public final int swigValue() {
    return swigValue;
  }

  public static OSD_SysType swigToEnum(int swigValue) {
    OSD_SysType[] swigValues = OSD_SysType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (OSD_SysType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + OSD_SysType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private OSD_SysType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private OSD_SysType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private OSD_SysType(OSD_SysType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

