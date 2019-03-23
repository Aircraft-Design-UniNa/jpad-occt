package opencascade;

/**
 *  Converts a plane, bspline surface, surface of revolution, surface
 *  of extrusion, offset surface to grid of bezier basis surface (
 *  bezier surface,
 *  surface of revolution based on bezier curve,
 *  offset surface based on any previous type).
 */
public class ShapeUpgrade_ConvertSurfaceToBezierBasis extends ShapeUpgrade_SplitSurface {
  ShapeUpgrade_ConvertSurfaceToBezierBasis(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor.
   */
  public ShapeUpgrade_ConvertSurfaceToBezierBasis() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_ConvertSurfaceToBezierBasis(), true);
  }

  public  ShapeExtend_CompositeSurface  Segments() {
    return new ShapeExtend_CompositeSurface ( OCCwrapJavaJNI.ShapeUpgrade_ConvertSurfaceToBezierBasis_Segments(swigCPtr, this), true );
  }

  /**
   *  Sets mode for conversion Geom_Plane to Bezier
   */
  public void SetPlaneMode(long mode) {
    OCCwrapJavaJNI.ShapeUpgrade_ConvertSurfaceToBezierBasis_SetPlaneMode(swigCPtr, this, mode);
  }

  /**
   *  Returns the Geom_Pline conversion mode.
   */
  public long GetPlaneMode() {
    return OCCwrapJavaJNI.ShapeUpgrade_ConvertSurfaceToBezierBasis_GetPlaneMode(swigCPtr, this);
  }

  /**
   *  Sets mode for conversion Geom_SurfaceOfRevolution to Bezier
   */
  public void SetRevolutionMode(long mode) {
    OCCwrapJavaJNI.ShapeUpgrade_ConvertSurfaceToBezierBasis_SetRevolutionMode(swigCPtr, this, mode);
  }

  /**
   *  Returns the Geom_SurfaceOfRevolution conversion mode.
   */
  public long GetRevolutionMode() {
    return OCCwrapJavaJNI.ShapeUpgrade_ConvertSurfaceToBezierBasis_GetRevolutionMode(swigCPtr, this);
  }

  /**
   *  Sets mode for conversion Geom_SurfaceOfLinearExtrusion to Bezier
   */
  public void SetExtrusionMode(long mode) {
    OCCwrapJavaJNI.ShapeUpgrade_ConvertSurfaceToBezierBasis_SetExtrusionMode(swigCPtr, this, mode);
  }

  /**
   *  Returns the Geom_SurfaceOfLinearExtrusion conversion mode.
   */
  public long GetExtrusionMode() {
    return OCCwrapJavaJNI.ShapeUpgrade_ConvertSurfaceToBezierBasis_GetExtrusionMode(swigCPtr, this);
  }

  /**
   *  Sets mode for conversion Geom_BSplineSurface to Bezier
   */
  public void SetBSplineMode(long mode) {
    OCCwrapJavaJNI.ShapeUpgrade_ConvertSurfaceToBezierBasis_SetBSplineMode(swigCPtr, this, mode);
  }

  /**
   *  Returns the Geom_BSplineSurface conversion mode.
   */
  public long GetBSplineMode() {
    return OCCwrapJavaJNI.ShapeUpgrade_ConvertSurfaceToBezierBasis_GetBSplineMode(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_ConvertSurfaceToBezierBasis_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_ConvertSurfaceToBezierBasis_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_ConvertSurfaceToBezierBasis  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_ConvertSurfaceToBezierBasis ( OCCwrapJavaJNI.ShapeUpgrade_ConvertSurfaceToBezierBasis_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_ConvertSurfaceToBezierBasis_TypeOf(), true );
  }

}
