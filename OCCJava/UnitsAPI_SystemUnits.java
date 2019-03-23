package opencascade;

/**
 *  Identifies unit systems which may be defined as a
 *  basis system in the user's session:
 *  -   UnitsAPI_DEFAULT : default system (this is the SI system)
 *  -   UnitsAPI_SI : the SI unit system
 *  -   UnitsAPI_MDTV : the MDTV unit system; it
 *  is equivalent to the SI unit system but the
 *  length unit and all its derivatives use
 *  millimeters instead of meters.
 *  Use the function SetLocalSystem to set up one
 *  of these unit systems as working environment.
 */
public enum UnitsAPI_SystemUnits {
  UnitsAPI_DEFAULT,
  UnitsAPI_SI,
  UnitsAPI_MDTV;

  public final int swigValue() {
    return swigValue;
  }

  public static UnitsAPI_SystemUnits swigToEnum(int swigValue) {
    UnitsAPI_SystemUnits[] swigValues = UnitsAPI_SystemUnits.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (UnitsAPI_SystemUnits swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + UnitsAPI_SystemUnits.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private UnitsAPI_SystemUnits() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private UnitsAPI_SystemUnits(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private UnitsAPI_SystemUnits(UnitsAPI_SystemUnits swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

