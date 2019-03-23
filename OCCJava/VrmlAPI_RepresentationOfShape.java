package opencascade;

/**
 *  Identifies the representation of the shape written
 *  to a VRML file. The available options are :
 *  -      VrmlAPI_ShadedRepresentation :
 *  the shape is translated with a shaded representation.
 *  -      VrmlAPI_WireFrameRepresentation :
 *  the shape is translated with a wireframe representation.
 *  -      VrmlAPI_BothRepresentation : the shape is translated
 *  to VRML format with both representations : shaded and
 *  wireframe. This is the default option.
 */
public enum VrmlAPI_RepresentationOfShape {
  VrmlAPI_ShadedRepresentation,
  VrmlAPI_WireFrameRepresentation,
  VrmlAPI_BothRepresentation;

  public final int swigValue() {
    return swigValue;
  }

  public static VrmlAPI_RepresentationOfShape swigToEnum(int swigValue) {
    VrmlAPI_RepresentationOfShape[] swigValues = VrmlAPI_RepresentationOfShape.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (VrmlAPI_RepresentationOfShape swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + VrmlAPI_RepresentationOfShape.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private VrmlAPI_RepresentationOfShape() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private VrmlAPI_RepresentationOfShape(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private VrmlAPI_RepresentationOfShape(VrmlAPI_RepresentationOfShape swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

