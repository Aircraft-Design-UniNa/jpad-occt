package opencascade;

/**
 *  This enumeration is used to note specific surface form.
 */
public enum GeomAbs_SurfaceForm {
  GeomAbs_PlanarForm,
  GeomAbs_ConicalForm,
  GeomAbs_CylindricalForm,
  GeomAbs_ToroidalForm,
  GeomAbs_SphericalForm,
  GeomAbs_RevolutionForm,
  GeomAbs_RuledForm,
  GeomAbs_QuadricForm,
  GeomAbs_OtherSurfaceForm;

  public final int swigValue() {
    return swigValue;
  }

  public static GeomAbs_SurfaceForm swigToEnum(int swigValue) {
    GeomAbs_SurfaceForm[] swigValues = GeomAbs_SurfaceForm.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (GeomAbs_SurfaceForm swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + GeomAbs_SurfaceForm.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private GeomAbs_SurfaceForm() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private GeomAbs_SurfaceForm(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private GeomAbs_SurfaceForm(GeomAbs_SurfaceForm swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

