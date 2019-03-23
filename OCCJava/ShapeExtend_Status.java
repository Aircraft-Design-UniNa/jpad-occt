package opencascade;

/**
 *  This enumeration is used in
 *  ShapeHealing toolkit for representing flags in the
 *  return statuses of class methods.
 *  The status is a field of the class which is set by one or
 *  several methods of that class.
 *  It is used for reporting about errors and other situations
 *  encountered during execution of the method.
 *  There are defined 8 values for DONE and 8 for FAIL flags:
 *  ShapeExtend_DONE1 ...      ShapeExtend_DONE8,
 *  ShapeExtend_FAIL1 ...      ShapeExtend_FAIL8
 *  and also enumerations for representing combinations of flags:
 *  ShapeExtend_OK - no flags at all,
 *  ShapeExtend_DONE - any of flags DONEi,
 *  ShapeExtend_FAIL - any of flags FAILi.
 *  The class that uses statuses provides a method(s) which
 *  answers whether the flag corresponding to a given
 *  enumerative value is (are) set:
 *  Standard_Boolean Status(const ShapeExtend_Status test);
 *  Note that status can have several flags set simultaneously.
 *  Status(ShapeExtend_OK) gives True when no flags are set.
 *  Nothing done, everything OK
 *  Something was done, case 1
 *  Something was done, case 2
 *  Something was done, case 3
 *  Something was done, case 4
 *  Something was done, case 5
 *  Something was done, case 6
 *  Something was done, case 7
 *  Something was done, case 8
 *  Something was done (any of DONE#)
 *  The method failed, case 1
 *  The method failed, case 2
 *  The method failed, case 3
 *  The method failed, case 4
 *  The method failed, case 5
 *  The method failed, case 6
 *  The method failed, case 7
 *  The method failed, case 8
 *  The mathod failed (any of FAIL# occured)
 */
public enum ShapeExtend_Status {
  ShapeExtend_OK,
  ShapeExtend_DONE1,
  ShapeExtend_DONE2,
  ShapeExtend_DONE3,
  ShapeExtend_DONE4,
  ShapeExtend_DONE5,
  ShapeExtend_DONE6,
  ShapeExtend_DONE7,
  ShapeExtend_DONE8,
  ShapeExtend_DONE,
  ShapeExtend_FAIL1,
  ShapeExtend_FAIL2,
  ShapeExtend_FAIL3,
  ShapeExtend_FAIL4,
  ShapeExtend_FAIL5,
  ShapeExtend_FAIL6,
  ShapeExtend_FAIL7,
  ShapeExtend_FAIL8,
  ShapeExtend_FAIL;

  public final int swigValue() {
    return swigValue;
  }

  public static ShapeExtend_Status swigToEnum(int swigValue) {
    ShapeExtend_Status[] swigValues = ShapeExtend_Status.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ShapeExtend_Status swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ShapeExtend_Status.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ShapeExtend_Status() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ShapeExtend_Status(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ShapeExtend_Status(ShapeExtend_Status swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

