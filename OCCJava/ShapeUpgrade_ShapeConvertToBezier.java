package opencascade;

/**
 *  API class for performing conversion of 3D, 2D curves to bezier curves
 *  and surfaces to bezier based surfaces (
 *  bezier surface,
 *  surface of revolution based on bezier curve,
 *  offset surface based on any previous type).
 */
public class ShapeUpgrade_ShapeConvertToBezier extends ShapeUpgrade_ShapeDivide {

  private long swigCPtr;
  ShapeUpgrade_ShapeConvertToBezier(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  ShapeUpgrade_ShapeConvertToBezier(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(ShapeUpgrade_ShapeConvertToBezier obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeUpgrade_ShapeConvertToBezier(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Empty constructor.
   */
  public ShapeUpgrade_ShapeConvertToBezier() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_ShapeConvertToBezier__SWIG_0(), true);
  }

  /**
   *  Initialize by a Shape.
   */
  public ShapeUpgrade_ShapeConvertToBezier( TopoDS_Shape  S) {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_ShapeConvertToBezier__SWIG_1(TopoDS_Shape.getCPtr(S), S), true);
  }

  /**
   *  Sets mode for conversion 2D curves to bezier.
   */
  public void Set2dConversion(long mode) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_Set2dConversion(swigCPtr, this, mode);
  }

  /**
   *  Returns the 2D conversion mode.
   */
  public long Get2dConversion() {
    return OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_Get2dConversion(swigCPtr, this);
  }

  /**
   *  Sets mode for conversion 3d curves to bezier.
   */
  public void Set3dConversion(long mode) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_Set3dConversion(swigCPtr, this, mode);
  }

  /**
   *  Returns the 3D conversion mode.
   */
  public long Get3dConversion() {
    return OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_Get3dConversion(swigCPtr, this);
  }

  /**
   *  Sets mode for conversion surfaces curves to
   *  bezier basis.
   */
  public void SetSurfaceConversion(long mode) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_SetSurfaceConversion(swigCPtr, this, mode);
  }

  /**
   *  Returns the surface conversion mode.
   */
  public long GetSurfaceConversion() {
    return OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_GetSurfaceConversion(swigCPtr, this);
  }

  /**
   *  Sets mode for conversion Geom_Line to bezier.
   */
  public void Set3dLineConversion(long mode) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_Set3dLineConversion(swigCPtr, this, mode);
  }

  /**
   *  Returns the Geom_Line conversion mode.
   */
  public long Get3dLineConversion() {
    return OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_Get3dLineConversion(swigCPtr, this);
  }

  /**
   *  Sets mode for conversion Geom_Circle to bezier.
   */
  public void Set3dCircleConversion(long mode) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_Set3dCircleConversion(swigCPtr, this, mode);
  }

  /**
   *  Returns the Geom_Circle conversion mode.
   */
  public long Get3dCircleConversion() {
    return OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_Get3dCircleConversion(swigCPtr, this);
  }

  /**
   *  Sets mode for conversion Geom_Conic to bezier.
   */
  public void Set3dConicConversion(long mode) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_Set3dConicConversion(swigCPtr, this, mode);
  }

  /**
   *  Returns the Geom_Conic conversion mode.
   */
  public long Get3dConicConversion() {
    return OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_Get3dConicConversion(swigCPtr, this);
  }

  /**
   *  Sets mode for conversion Geom_Plane to Bezier
   */
  public void SetPlaneMode(long mode) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_SetPlaneMode(swigCPtr, this, mode);
  }

  /**
   *  Returns the Geom_Pline conversion mode.
   */
  public long GetPlaneMode() {
    return OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_GetPlaneMode(swigCPtr, this);
  }

  /**
   *  Sets mode for conversion Geom_SurfaceOfRevolution to Bezier
   */
  public void SetRevolutionMode(long mode) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_SetRevolutionMode(swigCPtr, this, mode);
  }

  /**
   *  Returns the Geom_SurfaceOfRevolution conversion mode.
   */
  public long GetRevolutionMode() {
    return OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_GetRevolutionMode(swigCPtr, this);
  }

  /**
   *  Sets mode for conversion Geom_SurfaceOfLinearExtrusion to Bezier
   */
  public void SetExtrusionMode(long mode) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_SetExtrusionMode(swigCPtr, this, mode);
  }

  /**
   *  Returns the Geom_SurfaceOfLinearExtrusion conversion mode.
   */
  public long GetExtrusionMode() {
    return OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_GetExtrusionMode(swigCPtr, this);
  }

  /**
   *  Sets mode for conversion Geom_BSplineSurface to Bezier
   */
  public void SetBSplineMode(long mode) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_SetBSplineMode(swigCPtr, this, mode);
  }

  /**
   *  Returns the Geom_BSplineSurface conversion mode.
   */
  public long GetBSplineMode() {
    return OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_GetBSplineMode(swigCPtr, this);
  }

  /**
   *  Performs converting and computes the resulting shape
   */
  public long Perform(long newContext) {
    return OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_Perform__SWIG_0(swigCPtr, this, newContext);
  }

  public long Perform() {
    return OCCwrapJavaJNI.ShapeUpgrade_ShapeConvertToBezier_Perform__SWIG_1(swigCPtr, this);
  }

}
