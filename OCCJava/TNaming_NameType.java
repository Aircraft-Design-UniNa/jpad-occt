package opencascade;

/**
 *  to store naming characteristcs
 */
public enum TNaming_NameType {
  TNaming_UNKNOWN,
  TNaming_IDENTITY,
  TNaming_MODIFUNTIL,
  TNaming_GENERATION,
  TNaming_INTERSECTION,
  TNaming_UNION,
  TNaming_SUBSTRACTION,
  TNaming_CONSTSHAPE,
  TNaming_FILTERBYNEIGHBOURGS,
  TNaming_ORIENTATION,
  TNaming_WIREIN,
  TNaming_SHELLIN;

  public final int swigValue() {
    return swigValue;
  }

  public static TNaming_NameType swigToEnum(int swigValue) {
    TNaming_NameType[] swigValues = TNaming_NameType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (TNaming_NameType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + TNaming_NameType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private TNaming_NameType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private TNaming_NameType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private TNaming_NameType(TNaming_NameType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

