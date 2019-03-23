package opencascade;

public enum BOPAlgo_CheckStatus {
  BOPAlgo_CheckUnknown,
  BOPAlgo_BadType,
  BOPAlgo_SelfIntersect,
  BOPAlgo_TooSmallEdge,
  BOPAlgo_NonRecoverableFace,
  BOPAlgo_IncompatibilityOfVertex,
  BOPAlgo_IncompatibilityOfEdge,
  BOPAlgo_IncompatibilityOfFace,
  BOPAlgo_OperationAborted,
  BOPAlgo_GeomAbs_C0,
  BOPAlgo_InvalidCurveOnSurface,
  BOPAlgo_NotValid;

  public final int swigValue() {
    return swigValue;
  }

  public static BOPAlgo_CheckStatus swigToEnum(int swigValue) {
    BOPAlgo_CheckStatus[] swigValues = BOPAlgo_CheckStatus.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (BOPAlgo_CheckStatus swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + BOPAlgo_CheckStatus.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private BOPAlgo_CheckStatus() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private BOPAlgo_CheckStatus(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private BOPAlgo_CheckStatus(BOPAlgo_CheckStatus swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

