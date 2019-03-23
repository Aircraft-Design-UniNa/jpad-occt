package opencascade;

/**
 *  locks for files.
 *  NoLock is the default value when opening a file.
 * 
 *  ReadLock allows only one reading of the file at a time.
 * 
 *  WriteLock prevents others writing into a file(excepted the user
 *  who puts the lock)but allows everybody to read.
 * 
 *  ExclusiveLock prevents reading and writing except for the
 *  current user of the file.
 *  So ExclusiveLock means only one user on the file and this
 *  user is the one who puts the lock.
 */
public enum OSD_LockType {
  OSD_NoLock,
  OSD_ReadLock,
  OSD_WriteLock,
  OSD_ExclusiveLock;

  public final int swigValue() {
    return swigValue;
  }

  public static OSD_LockType swigToEnum(int swigValue) {
    OSD_LockType[] swigValues = OSD_LockType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (OSD_LockType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + OSD_LockType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private OSD_LockType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private OSD_LockType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private OSD_LockType(OSD_LockType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

