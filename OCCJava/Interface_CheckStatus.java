package opencascade;

/**
 *  Classifies checks
 *  OK : check is empty  Warning : Warning, no Fail   Fail : Fail
 *  Others to query :
 *  Any : any status   Message : Warning/Fail  NoFail : Warning/OK
 */
public enum Interface_CheckStatus {
  Interface_CheckOK,
  Interface_CheckWarning,
  Interface_CheckFail,
  Interface_CheckAny,
  Interface_CheckMessage,
  Interface_CheckNoFail;

  public final int swigValue() {
    return swigValue;
  }

  public static Interface_CheckStatus swigToEnum(int swigValue) {
    Interface_CheckStatus[] swigValues = Interface_CheckStatus.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (Interface_CheckStatus swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + Interface_CheckStatus.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private Interface_CheckStatus() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private Interface_CheckStatus(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private Interface_CheckStatus(Interface_CheckStatus swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

