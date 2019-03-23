package opencascade;

/**
 *  \ Uo     ^        \ U1     ^
 *  \       | n       \       | n
 *  Surf  ====\======|===   ====\======|===
 *  \     .           \     .
 *  \    .            \    .
 *  U1  \   .          Uo \   .
 * 
 *  ( In )            ( Out )
 * 
 *  \           /
 *  \         /
 *  \       /
 *  \     /
 *  Surf =====-----=====
 * 
 *  ( Tangent )
 *  Crb and Surf are  C1
 */
public enum IntCurveSurface_TransitionOnCurve {
  IntCurveSurface_Tangent,
  IntCurveSurface_In,
  IntCurveSurface_Out;

  public final int swigValue() {
    return swigValue;
  }

  public static IntCurveSurface_TransitionOnCurve swigToEnum(int swigValue) {
    IntCurveSurface_TransitionOnCurve[] swigValues = IntCurveSurface_TransitionOnCurve.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (IntCurveSurface_TransitionOnCurve swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + IntCurveSurface_TransitionOnCurve.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private IntCurveSurface_TransitionOnCurve() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private IntCurveSurface_TransitionOnCurve(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private IntCurveSurface_TransitionOnCurve(IntCurveSurface_TransitionOnCurve swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

