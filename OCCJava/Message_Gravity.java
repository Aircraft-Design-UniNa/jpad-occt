package opencascade;

/**
 *  Defines gravity level of messages
 *  - Trace: low-level details on algorithm execution (usually for debug purposes)
 *  - Info: informative message
 *  - Warning: warning message
 *  - Alarm: non-critical error
 *  - Fail: fatal error
 */
public enum Message_Gravity {
  Message_Trace,
  Message_Info,
  Message_Warning,
  Message_Alarm,
  Message_Fail;

  public final int swigValue() {
    return swigValue;
  }

  public static Message_Gravity swigToEnum(int swigValue) {
    Message_Gravity[] swigValues = Message_Gravity.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (Message_Gravity swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + Message_Gravity.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private Message_Gravity() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private Message_Gravity(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private Message_Gravity(Message_Gravity swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

