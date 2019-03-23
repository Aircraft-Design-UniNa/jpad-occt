package opencascade;

/**
 *  Identifies the type of a geometric transformation.
 */
public enum gp_TrsfForm {
  gp_Identity,
  gp_Rotation,
  gp_Translation,
  gp_PntMirror,
  gp_Ax1Mirror,
  gp_Ax2Mirror,
  gp_Scale,
  gp_CompoundTrsf,
  gp_Other;

  public final int swigValue() {
    return swigValue;
  }

  public static gp_TrsfForm swigToEnum(int swigValue) {
    gp_TrsfForm[] swigValues = gp_TrsfForm.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (gp_TrsfForm swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + gp_TrsfForm.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private gp_TrsfForm() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private gp_TrsfForm(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private gp_TrsfForm(gp_TrsfForm swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

