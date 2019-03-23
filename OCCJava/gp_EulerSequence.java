package opencascade;

public enum gp_EulerSequence {
  gp_EulerAngles,
  gp_YawPitchRoll,
  gp_Extrinsic_XYZ,
  gp_Extrinsic_XZY,
  gp_Extrinsic_YZX,
  gp_Extrinsic_YXZ,
  gp_Extrinsic_ZXY,
  gp_Extrinsic_ZYX,
  gp_Intrinsic_XYZ,
  gp_Intrinsic_XZY,
  gp_Intrinsic_YZX,
  gp_Intrinsic_YXZ,
  gp_Intrinsic_ZXY,
  gp_Intrinsic_ZYX,
  gp_Extrinsic_XYX,
  gp_Extrinsic_XZX,
  gp_Extrinsic_YZY,
  gp_Extrinsic_YXY,
  gp_Extrinsic_ZYZ,
  gp_Extrinsic_ZXZ,
  gp_Intrinsic_XYX,
  gp_Intrinsic_XZX,
  gp_Intrinsic_YZY,
  gp_Intrinsic_YXY,
  gp_Intrinsic_ZXZ,
  gp_Intrinsic_ZYZ;

  public final int swigValue() {
    return swigValue;
  }

  public static gp_EulerSequence swigToEnum(int swigValue) {
    gp_EulerSequence[] swigValues = gp_EulerSequence.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (gp_EulerSequence swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + gp_EulerSequence.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private gp_EulerSequence() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private gp_EulerSequence(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private gp_EulerSequence(gp_EulerSequence swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

