package opencascade;

/**
 *  Indicates the outcome of wire
 *  construction, i.e. whether it is successful or not, as explained below:
 *  -      BRepBuilderAPI_WireDone No
 *  error occurred. The wire is correctly built.
 *  -      BRepBuilderAPI_EmptyWire No
 *  initialization of the algorithm. Only an empty constructor was used.
 *  -      BRepBuilderAPI_DisconnectedWire
 *  The last edge which you attempted to add was not connected to the wire.
 *  -      BRepBuilderAPI_NonManifoldWire
 *  The wire with some singularity.
 */
public enum BRepBuilderAPI_WireError {
  BRepBuilderAPI_WireDone,
  BRepBuilderAPI_EmptyWire,
  BRepBuilderAPI_DisconnectedWire,
  BRepBuilderAPI_NonManifoldWire;

  public final int swigValue() {
    return swigValue;
  }

  public static BRepBuilderAPI_WireError swigToEnum(int swigValue) {
    BRepBuilderAPI_WireError[] swigValues = BRepBuilderAPI_WireError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (BRepBuilderAPI_WireError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + BRepBuilderAPI_WireError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_WireError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_WireError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private BRepBuilderAPI_WireError(BRepBuilderAPI_WireError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

