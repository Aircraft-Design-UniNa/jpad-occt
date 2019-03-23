package opencascade;

/**
 *  validity state of anentity's content (see InterfaceModel)
 */
public enum Interface_DataState {
  Interface_StateOK,
  Interface_LoadWarning,
  Interface_LoadFail,
  Interface_DataWarning,
  Interface_DataFail,
  Interface_StateUnloaded,
  Interface_StateUnknown;

  public final int swigValue() {
    return swigValue;
  }

  public static Interface_DataState swigToEnum(int swigValue) {
    Interface_DataState[] swigValues = Interface_DataState.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (Interface_DataState swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + Interface_DataState.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private Interface_DataState() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private Interface_DataState(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private Interface_DataState(Interface_DataState swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

