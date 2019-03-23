package opencascade;

/**
 *  implement a modification for BRepTools
 *  Modifier algortihm. Converts Surface of
 *  Linear Exctrusion, Revolution and Offset
 *  surfaces into BSpline Surface according to
 *  flags.
 */
public class ShapeCustom_ConvertToBSpline extends ShapeCustom_Modification {
  ShapeCustom_ConvertToBSpline(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public ShapeCustom_ConvertToBSpline() {
    this(OCCwrapJavaJNI.new_ShapeCustom_ConvertToBSpline(), true);
  }

  /**
   *  Sets mode for convertion of Surfaces of Linear
   *  extrusion.
   */
  public void SetExtrusionMode(long extrMode) {
    OCCwrapJavaJNI.ShapeCustom_ConvertToBSpline_SetExtrusionMode(swigCPtr, this, extrMode);
  }

  /**
   *  Sets mode for convertion of Surfaces of Revolution.
   */
  public void SetRevolutionMode(long revolMode) {
    OCCwrapJavaJNI.ShapeCustom_ConvertToBSpline_SetRevolutionMode(swigCPtr, this, revolMode);
  }

  /**
   *  Sets mode for convertion of Offset surfaces.
   */
  public void SetOffsetMode(long offsetMode) {
    OCCwrapJavaJNI.ShapeCustom_ConvertToBSpline_SetOffsetMode(swigCPtr, this, offsetMode);
  }

  /**
   *  Sets mode for convertion of Plane surfaces.
   */
  public void SetPlaneMode(long planeMode) {
    OCCwrapJavaJNI.ShapeCustom_ConvertToBSpline_SetPlaneMode(swigCPtr, this, planeMode);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeCustom_ConvertToBSpline_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeCustom_ConvertToBSpline_get_type_descriptor(), true );
  }

  public static  ShapeCustom_ConvertToBSpline  DownCast( Standard_Transient  T) {
    return new ShapeCustom_ConvertToBSpline ( OCCwrapJavaJNI.ShapeCustom_ConvertToBSpline_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeCustom_ConvertToBSpline_TypeOf(), true );
  }

}
