package opencascade;

public enum MoniTool_ValueType {
  MoniTool_ValueMisc,
  MoniTool_ValueInteger,
  MoniTool_ValueReal,
  MoniTool_ValueIdent,
  MoniTool_ValueVoid,
  MoniTool_ValueText,
  MoniTool_ValueEnum,
  MoniTool_ValueLogical,
  MoniTool_ValueSub,
  MoniTool_ValueHexa,
  MoniTool_ValueBinary;

  public final int swigValue() {
    return swigValue;
  }

  public static MoniTool_ValueType swigToEnum(int swigValue) {
    MoniTool_ValueType[] swigValues = MoniTool_ValueType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (MoniTool_ValueType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + MoniTool_ValueType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private MoniTool_ValueType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private MoniTool_ValueType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private MoniTool_ValueType(MoniTool_ValueType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

