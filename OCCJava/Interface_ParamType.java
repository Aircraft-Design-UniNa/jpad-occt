package opencascade;

public enum Interface_ParamType {
  Interface_ParamMisc,
  Interface_ParamInteger,
  Interface_ParamReal,
  Interface_ParamIdent,
  Interface_ParamVoid,
  Interface_ParamText,
  Interface_ParamEnum,
  Interface_ParamLogical,
  Interface_ParamSub,
  Interface_ParamHexa,
  Interface_ParamBinary;

  public final int swigValue() {
    return swigValue;
  }

  public static Interface_ParamType swigToEnum(int swigValue) {
    Interface_ParamType[] swigValues = Interface_ParamType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (Interface_ParamType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + Interface_ParamType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private Interface_ParamType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private Interface_ParamType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private Interface_ParamType(Interface_ParamType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

