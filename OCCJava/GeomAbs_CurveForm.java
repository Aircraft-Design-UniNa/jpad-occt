package opencascade;

/**
 *  This enumeration is used to note specific curve form.
 */
public enum GeomAbs_CurveForm {
  GeomAbs_PolylineForm,
  GeomAbs_CircularForm,
  GeomAbs_EllipticForm,
  GeomAbs_HyperbolicForm,
  GeomAbs_ParabolicForm,
  GeomAbs_OtherCurveForm;

  public final int swigValue() {
    return swigValue;
  }

  public static GeomAbs_CurveForm swigToEnum(int swigValue) {
    GeomAbs_CurveForm[] swigValues = GeomAbs_CurveForm.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (GeomAbs_CurveForm swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + GeomAbs_CurveForm.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private GeomAbs_CurveForm() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private GeomAbs_CurveForm(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private GeomAbs_CurveForm(GeomAbs_CurveForm swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

