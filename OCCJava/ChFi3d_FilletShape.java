package opencascade;

/**
 *  Lists the types of fillet shapes. These include the following:
 *  -   ChFi3d_Rational (default value), which is the
 *  standard NURBS representation of circles,
 *  -   ChFi3d_QuasiAngular, which is a NURBS
 *  representation of circles where the parameters
 *  match those of the circle,
 *  -   ChFi3d_Polynomial, which corresponds to a
 *  polynomial approximation of circles. This type
 *  facilitates the implementation of the construction algorithm.
 */
public enum ChFi3d_FilletShape {
  ChFi3d_Rational,
  ChFi3d_QuasiAngular,
  ChFi3d_Polynomial;

  public final int swigValue() {
    return swigValue;
  }

  public static ChFi3d_FilletShape swigToEnum(int swigValue) {
    ChFi3d_FilletShape[] swigValues = ChFi3d_FilletShape.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ChFi3d_FilletShape swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ChFi3d_FilletShape.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ChFi3d_FilletShape() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ChFi3d_FilletShape(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ChFi3d_FilletShape(ChFi3d_FilletShape swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

