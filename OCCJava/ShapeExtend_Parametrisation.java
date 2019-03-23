package opencascade;

/**
 *  Defines kind of global parametrisation on the composite surface
 *  each patch of the 1st row and column adds its range, Ui+1 = Ui + URange(i,1), etc.
 *  each patch gives range 1.: Ui = i-1, Vj = j-1
 *  uniform parametrisation with global range [0,1]
 */
public enum ShapeExtend_Parametrisation {
  ShapeExtend_Natural,
  ShapeExtend_Uniform,
  ShapeExtend_Unitary;

  public final int swigValue() {
    return swigValue;
  }

  public static ShapeExtend_Parametrisation swigToEnum(int swigValue) {
    ShapeExtend_Parametrisation[] swigValues = ShapeExtend_Parametrisation.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ShapeExtend_Parametrisation swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ShapeExtend_Parametrisation.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ShapeExtend_Parametrisation() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ShapeExtend_Parametrisation(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ShapeExtend_Parametrisation(ShapeExtend_Parametrisation swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

