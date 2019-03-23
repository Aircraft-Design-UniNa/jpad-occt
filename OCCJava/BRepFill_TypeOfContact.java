package opencascade;

/**
 *  A pair of bound shapes with the result.
 */
public enum BRepFill_TypeOfContact {
  BRepFill_NoContact,
  BRepFill_Contact,
  BRepFill_ContactOnBorder;

  public final int swigValue() {
    return swigValue;
  }

  public static BRepFill_TypeOfContact swigToEnum(int swigValue) {
    BRepFill_TypeOfContact[] swigValues = BRepFill_TypeOfContact.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (BRepFill_TypeOfContact swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + BRepFill_TypeOfContact.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private BRepFill_TypeOfContact() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private BRepFill_TypeOfContact(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private BRepFill_TypeOfContact(BRepFill_TypeOfContact swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

