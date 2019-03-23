package opencascade;

/**
 *  Some fields of an IGES entity may be
 *  - Undefined
 *  - Defined as a positive integer
 *  - Defined as a reference to a specialized entity.
 *  A typical example of this kind of variation is color.
 *  This enumeration allows you to identify which of the above is the case.
 *  The semantics of the terms are as follows:
 *  - DefVoid indicates that the item contained in the field is undefined
 *  - DefValue indicates that the item is defined as an immediate
 *  positive integer value (i.e. not a pointer)
 *  - DefReference indicates that the item is defined as an entity
 *  - DefAny indicates the item could not be determined
 *  - ErrorVal indicates that the item is defined as an integer
 *  but its value is incorrect (it could be out of range, for example)
 *  - ErrorRef indicates that the item is defined as an entity but
 *  is not of the required type.
 */
public enum IGESData_DefType {
  IGESData_DefVoid,
  IGESData_DefValue,
  IGESData_DefReference,
  IGESData_DefAny,
  IGESData_ErrorVal,
  IGESData_ErrorRef;

  public final int swigValue() {
    return swigValue;
  }

  public static IGESData_DefType swigToEnum(int swigValue) {
    IGESData_DefType[] swigValues = IGESData_DefType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (IGESData_DefType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + IGESData_DefType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private IGESData_DefType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private IGESData_DefType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private IGESData_DefType(IGESData_DefType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

