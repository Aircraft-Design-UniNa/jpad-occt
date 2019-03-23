package opencascade;

/**
 *  Some fields of an IGES entity may be
 *  - Undefined
 *  - Defined as a single item
 *  - Defined as a list of items.
 *  A typical example, which presents this kind of variation,
 *  is a level number.
 *  This enumeration allows you to identify which of the above is the case.
 *  The semantics of the terms is as follows:
 *  - DefNone indicates that the list is empty (there is not
 *  even a single item).
 *  - DefOne indicates that the list contains a single item.
 *  - DefSeveral indicates that the list contains several items.
 *  - ErrorOne indicates that the list contains one item, but
 *  that this item is incorrect
 *  - ErrorSeveral indicates that the list contains several
 *  items, but that at least one of them is incorrect.
 */
public enum IGESData_DefList {
  IGESData_DefNone,
  IGESData_DefOne,
  IGESData_DefSeveral,
  IGESData_ErrorOne,
  IGESData_ErrorSeveral;

  public final int swigValue() {
    return swigValue;
  }

  public static IGESData_DefList swigToEnum(int swigValue) {
    IGESData_DefList[] swigValues = IGESData_DefList.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (IGESData_DefList swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + IGESData_DefList.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private IGESData_DefList() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private IGESData_DefList(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private IGESData_DefList(IGESData_DefList swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

