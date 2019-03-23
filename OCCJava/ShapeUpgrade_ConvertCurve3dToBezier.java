package opencascade;

/**
 *  converts/splits a 3d curve of any type to a list of beziers
 */
public class ShapeUpgrade_ConvertCurve3dToBezier extends ShapeUpgrade_SplitCurve3d {
  ShapeUpgrade_ConvertCurve3dToBezier(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor
   */
  public ShapeUpgrade_ConvertCurve3dToBezier() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_ConvertCurve3dToBezier(), true);
  }

  /**
   *  Sets mode for conversion Geom_Line to bezier.
   */
  public void SetLineMode(long mode) {
    OCCwrapJavaJNI.ShapeUpgrade_ConvertCurve3dToBezier_SetLineMode(swigCPtr, this, mode);
  }

  /**
   *  Returns the Geom_Line conversion mode.
   */
  public long GetLineMode() {
    return OCCwrapJavaJNI.ShapeUpgrade_ConvertCurve3dToBezier_GetLineMode(swigCPtr, this);
  }

  /**
   *  Sets mode for conversion Geom_Circle to bezier.
   */
  public void SetCircleMode(long mode) {
    OCCwrapJavaJNI.ShapeUpgrade_ConvertCurve3dToBezier_SetCircleMode(swigCPtr, this, mode);
  }

  /**
   *  Returns the Geom_Circle conversion mode.
   */
  public long GetCircleMode() {
    return OCCwrapJavaJNI.ShapeUpgrade_ConvertCurve3dToBezier_GetCircleMode(swigCPtr, this);
  }

  /**
   *  Returns the Geom_Conic conversion mode.
   */
  public void SetConicMode(long mode) {
    OCCwrapJavaJNI.ShapeUpgrade_ConvertCurve3dToBezier_SetConicMode(swigCPtr, this, mode);
  }

  /**
   *  Performs converting and computes the resulting shape.
   */
  public long GetConicMode() {
    return OCCwrapJavaJNI.ShapeUpgrade_ConvertCurve3dToBezier_GetConicMode(swigCPtr, this);
  }

  public  TColStd_HSequenceOfReal  SplitParams() {
    return new TColStd_HSequenceOfReal ( OCCwrapJavaJNI.ShapeUpgrade_ConvertCurve3dToBezier_SplitParams(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_ConvertCurve3dToBezier_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_ConvertCurve3dToBezier_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_ConvertCurve3dToBezier  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_ConvertCurve3dToBezier ( OCCwrapJavaJNI.ShapeUpgrade_ConvertCurve3dToBezier_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_ConvertCurve3dToBezier_TypeOf(), true );
  }

}
