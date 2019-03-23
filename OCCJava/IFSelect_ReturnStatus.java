package opencascade;

/**
 *  Qualifies an execution status :
 *  RetVoid  : normal execution which created nothing, or
 *  no data to process
 *  RetDone  : normal execution with a result
 *  RetError : error in command or input data, no execution
 *  RetFail  : execution was run and has failed
 *  RetStop  : indicates end or stop (such as Raise)
 */
public enum IFSelect_ReturnStatus {
  IFSelect_RetVoid,
  IFSelect_RetDone,
  IFSelect_RetError,
  IFSelect_RetFail,
  IFSelect_RetStop;

  public final int swigValue() {
    return swigValue;
  }

  public static IFSelect_ReturnStatus swigToEnum(int swigValue) {
    IFSelect_ReturnStatus[] swigValues = IFSelect_ReturnStatus.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (IFSelect_ReturnStatus swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + IFSelect_ReturnStatus.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private IFSelect_ReturnStatus() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private IFSelect_ReturnStatus(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private IFSelect_ReturnStatus(IFSelect_ReturnStatus swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

