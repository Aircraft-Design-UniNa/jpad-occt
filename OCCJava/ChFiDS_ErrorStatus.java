package opencascade;

/**
 *  --- Purpose statuts concernant la cause de l'erreur
 */
public enum ChFiDS_ErrorStatus {
  ChFiDS_Ok,
  ChFiDS_Error,
  ChFiDS_WalkingFailure,
  ChFiDS_StartsolFailure,
  ChFiDS_TwistedSurface;

  public final int swigValue() {
    return swigValue;
  }

  public static ChFiDS_ErrorStatus swigToEnum(int swigValue) {
    ChFiDS_ErrorStatus[] swigValues = ChFiDS_ErrorStatus.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ChFiDS_ErrorStatus swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ChFiDS_ErrorStatus.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ChFiDS_ErrorStatus() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ChFiDS_ErrorStatus(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ChFiDS_ErrorStatus(ChFiDS_ErrorStatus swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

