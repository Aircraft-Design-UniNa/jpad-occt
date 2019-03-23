package opencascade;

/**
 *  This tool provides a method for computing pcurve by projecting
 *  3d curve onto a surface.
 *  Projection is done by 23 or more points (this number is changed
 *  for B-Splines according to the following rule:
 *  the total number of the points is not less than number of spans *
 *  (degree + 1);
 *  it is increased recursively starting with 23 and is added with 22
 *  until the condition is fulfilled).
 *  Isoparametric cases (if curve corresponds to U=const or V=const on
 *  the surface) are recognized with the given precision.
 */
public class ShapeConstruct_ProjectCurveOnSurface extends Standard_Transient {
  ShapeConstruct_ProjectCurveOnSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor.
   */
  public ShapeConstruct_ProjectCurveOnSurface() {
    this(OCCwrapJavaJNI.new_ShapeConstruct_ProjectCurveOnSurface(), true);
  }

  /**
   *  Initializes the object with all necessary parameters,
   *  i.e. surface and precision
   */
  public void Init( Geom_Surface  surf, double preci) {
    OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_Init__SWIG_0(swigCPtr, this,  Geom_Surface.getCPtr(surf) , surf, preci);
  }

  /**
   *  Initializes the object with all necessary parameters,
   *  i.e. surface and precision
   */
  public void Init( ShapeAnalysis_Surface  surf, double preci) {
    OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_Init__SWIG_1(swigCPtr, this,  ShapeAnalysis_Surface.getCPtr(surf) , surf, preci);
  }

  /**
   *  Loads a surface (in the form of Geom_Surface) to project on
   */
  public void SetSurface( Geom_Surface  surf) {
    OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_SetSurface__SWIG_0(swigCPtr, this,  Geom_Surface.getCPtr(surf) , surf);
  }

  /**
   *  Loads a surface (in the form of ShapeAnalysis_Surface) to project on
   */
  public void SetSurface( ShapeAnalysis_Surface  surf) {
    OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_SetSurface__SWIG_1(swigCPtr, this,  ShapeAnalysis_Surface.getCPtr(surf) , surf);
  }

  /**
   *  Sets value for current precision
   */
  public void SetPrecision(double preci) {
    OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_SetPrecision(swigCPtr, this, preci);
  }

  public long[] BuildCurveMode() {return OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_BuildCurveMode(swigCPtr, this);}

  public int[] AdjustOverDegenMode() {return OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_AdjustOverDegenMode(swigCPtr, this);}

  /**
   *  Returns the status of last Peform
   */
  public long Status(ShapeExtend_Status theStatus) {
    return OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_Status(swigCPtr, this, theStatus.swigValue());
  }

  /**
   *  Computes the projection of 3d curve onto a surface using the
   *  specialized algorithm. Returns False if projector fails,
   *  otherwise, if pcurve computed successfully, returns True.
   *  The output curve 2D is guaranteed to be same-parameter
   *  with input curve 3D on the interval [First, Last]. If the output curve
   *  lies on a direct line the infinite line is returned, in the case
   *  same-parameter condition is satisfied.
   *  TolFirst and TolLast are the tolerances at the ends of input curve 3D.
   */
  public long Perform( Geom_Curve  c3d, double First, double Last,  Geom2d_Curve  c2d, double TolFirst, double TolLast) {
    return OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_Perform__SWIG_0(swigCPtr, this,  Geom_Curve.getCPtr(c3d) , c3d, First, Last,  Geom2d_Curve.getCPtr(c2d) , c2d, TolFirst, TolLast);
  }

  public long Perform( Geom_Curve  c3d, double First, double Last,  Geom2d_Curve  c2d, double TolFirst) {
    return OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_Perform__SWIG_1(swigCPtr, this,  Geom_Curve.getCPtr(c3d) , c3d, First, Last,  Geom2d_Curve.getCPtr(c2d) , c2d, TolFirst);
  }

  public long Perform( Geom_Curve  c3d, double First, double Last,  Geom2d_Curve  c2d) {
    return OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_Perform__SWIG_2(swigCPtr, this,  Geom_Curve.getCPtr(c3d) , c3d, First, Last,  Geom2d_Curve.getCPtr(c2d) , c2d);
  }

  /**
   *  Computes the projection of 3d curve onto a surface using the
   *  standard algorithm from ProjLib. Returns False if standard
   *  projector fails or raises an exception or cuts the curve by
   *  parametrical bounds of the surface. Else, if pcurve computed
   *  successfully, returns True.
   *  The continuity, maxdeg and nbinterval are parameters of call
   *  to Approx_CurveOnSurface. If nbinterval is equal to -1
   *  (default), this value is computed depending on source 3d curve
   *  and surface.
   */
  public long PerformByProjLib( Geom_Curve  c3d, double First, double Last,  Geom2d_Curve  c2d, GeomAbs_Shape continuity, int maxdeg, int nbinterval) {
    return OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_PerformByProjLib__SWIG_0(swigCPtr, this,  Geom_Curve.getCPtr(c3d) , c3d, First, Last,  Geom2d_Curve.getCPtr(c2d) , c2d, continuity.swigValue(), maxdeg, nbinterval);
  }

  public long PerformByProjLib( Geom_Curve  c3d, double First, double Last,  Geom2d_Curve  c2d, GeomAbs_Shape continuity, int maxdeg) {
    return OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_PerformByProjLib__SWIG_1(swigCPtr, this,  Geom_Curve.getCPtr(c3d) , c3d, First, Last,  Geom2d_Curve.getCPtr(c2d) , c2d, continuity.swigValue(), maxdeg);
  }

  public long PerformByProjLib( Geom_Curve  c3d, double First, double Last,  Geom2d_Curve  c2d, GeomAbs_Shape continuity) {
    return OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_PerformByProjLib__SWIG_2(swigCPtr, this,  Geom_Curve.getCPtr(c3d) , c3d, First, Last,  Geom2d_Curve.getCPtr(c2d) , c2d, continuity.swigValue());
  }

  public long PerformByProjLib( Geom_Curve  c3d, double First, double Last,  Geom2d_Curve  c2d) {
    return OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_PerformByProjLib__SWIG_3(swigCPtr, this,  Geom_Curve.getCPtr(c3d) , c3d, First, Last,  Geom2d_Curve.getCPtr(c2d) , c2d);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_get_type_descriptor(), true );
  }

  public static  ShapeConstruct_ProjectCurveOnSurface  DownCast( Standard_Transient  T) {
    return new ShapeConstruct_ProjectCurveOnSurface ( OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeConstruct_ProjectCurveOnSurface_TypeOf(), true );
  }

}
