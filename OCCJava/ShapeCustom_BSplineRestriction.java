package opencascade;

/**
 *  this tool intended for aproximation surfaces, curves and pcurves with
 *  specified degree , max number of segments, tolerance 2d, tolerance 3d. Specified
 *  continuity can be reduced if approximation with specified continuity was not done.
 */
public class ShapeCustom_BSplineRestriction extends ShapeCustom_Modification {
  ShapeCustom_BSplineRestriction(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor.
   */
  public ShapeCustom_BSplineRestriction() {
    this(OCCwrapJavaJNI.new_ShapeCustom_BSplineRestriction__SWIG_0(), true);
  }

  /**
   *  Initializes with specified parameters of aproximation.
   */
  public ShapeCustom_BSplineRestriction(long anApproxSurfaceFlag, long anApproxCurve3dFlag, long anApproxCurve2dFlag, double aTol3d, double aTol2d, GeomAbs_Shape aContinuity3d, GeomAbs_Shape aContinuity2d, int aMaxDegree, int aNbMaxSeg, long Degree, long Rational) {
    this(OCCwrapJavaJNI.new_ShapeCustom_BSplineRestriction__SWIG_1(anApproxSurfaceFlag, anApproxCurve3dFlag, anApproxCurve2dFlag, aTol3d, aTol2d, aContinuity3d.swigValue(), aContinuity2d.swigValue(), aMaxDegree, aNbMaxSeg, Degree, Rational), true);
  }

  /**
   *  Initializes with specified parameters of aproximation.
   */
  public ShapeCustom_BSplineRestriction(long anApproxSurfaceFlag, long anApproxCurve3dFlag, long anApproxCurve2dFlag, double aTol3d, double aTol2d, GeomAbs_Shape aContinuity3d, GeomAbs_Shape aContinuity2d, int aMaxDegree, int aNbMaxSeg, long Degree, long Rational,  ShapeCustom_RestrictionParameters  aModes) {
    this(OCCwrapJavaJNI.new_ShapeCustom_BSplineRestriction__SWIG_2(anApproxSurfaceFlag, anApproxCurve3dFlag, anApproxCurve2dFlag, aTol3d, aTol2d, aContinuity3d.swigValue(), aContinuity2d.swigValue(), aMaxDegree, aNbMaxSeg, Degree, Rational,  ShapeCustom_RestrictionParameters.getCPtr(aModes) , aModes), true);
  }

  /**
   *  Returns Standard_True if  the surface has been modified.
   *  if flag IsOf equals Standard_True Offset surfaces are aproximated to Offset
   *  if Standard_False to BSpline
   */
  public long ConvertSurface( Geom_Surface  aSurface,  Geom_Surface  S, double UF, double UL, double VF, double VL, long IsOf) {
    return OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_ConvertSurface__SWIG_0(swigCPtr, this,  Geom_Surface.getCPtr(aSurface) , aSurface,  Geom_Surface.getCPtr(S) , S, UF, UL, VF, VL, IsOf);
  }

  public long ConvertSurface( Geom_Surface  aSurface,  Geom_Surface  S, double UF, double UL, double VF, double VL) {
    return OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_ConvertSurface__SWIG_1(swigCPtr, this,  Geom_Surface.getCPtr(aSurface) , aSurface,  Geom_Surface.getCPtr(S) , S, UF, UL, VF, VL);
  }

  /**
   *  Returns Standard_True if  the curve has been modified.
   *  if flag IsOf equals Standard_True Offset curves are aproximated to Offset
   *  if Standard_False to BSpline
   */
  public long ConvertCurve( Geom_Curve  aCurve,  Geom_Curve  C, long IsConvert, double First, double Last, double[] TolCur, long IsOf) {
    return OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_ConvertCurve__SWIG_0(swigCPtr, this,  Geom_Curve.getCPtr(aCurve) , aCurve,  Geom_Curve.getCPtr(C) , C, IsConvert, First, Last, TolCur, IsOf);
  }

  public long ConvertCurve( Geom_Curve  aCurve,  Geom_Curve  C, long IsConvert, double First, double Last, double[] TolCur) {
    return OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_ConvertCurve__SWIG_1(swigCPtr, this,  Geom_Curve.getCPtr(aCurve) , aCurve,  Geom_Curve.getCPtr(C) , C, IsConvert, First, Last, TolCur);
  }

  /**
   *  Returns Standard_True if the pcurve has been modified.
   *  if flag IsOf equals Standard_True Offset pcurves are aproximated to Offset
   *  if Standard_False to BSpline
   */
  public long ConvertCurve2d( Geom2d_Curve  aCurve,  Geom2d_Curve  C, long IsConvert, double First, double Last, double[] TolCur, long IsOf) {
    return OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_ConvertCurve2d__SWIG_0(swigCPtr, this,  Geom2d_Curve.getCPtr(aCurve) , aCurve,  Geom2d_Curve.getCPtr(C) , C, IsConvert, First, Last, TolCur, IsOf);
  }

  public long ConvertCurve2d( Geom2d_Curve  aCurve,  Geom2d_Curve  C, long IsConvert, double First, double Last, double[] TolCur) {
    return OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_ConvertCurve2d__SWIG_1(swigCPtr, this,  Geom2d_Curve.getCPtr(aCurve) , aCurve,  Geom2d_Curve.getCPtr(C) , C, IsConvert, First, Last, TolCur);
  }

  /**
   *  Sets tolerance of aproximation for curve3d and surface
   */
  public void SetTol3d(double Tol3d) {
    OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_SetTol3d(swigCPtr, this, Tol3d);
  }

  /**
   *  Sets tolerance of aproximation for curve2d
   */
  public void SetTol2d(double Tol2d) {
    OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_SetTol2d(swigCPtr, this, Tol2d);
  }

  public long[] ModifyApproxSurfaceFlag() {return OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_ModifyApproxSurfaceFlag(swigCPtr, this);}

  public long[] ModifyApproxCurve3dFlag() {return OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_ModifyApproxCurve3dFlag(swigCPtr, this);}

  public long[] ModifyApproxCurve2dFlag() {return OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_ModifyApproxCurve2dFlag(swigCPtr, this);}

  /**
   *  Sets continuity3d for aproximation curve3d and surface.
   */
  public void SetContinuity3d(GeomAbs_Shape Continuity3d) {
    OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_SetContinuity3d(swigCPtr, this, Continuity3d.swigValue());
  }

  /**
   *  Sets continuity3d for aproximation curve2d.
   */
  public void SetContinuity2d(GeomAbs_Shape Continuity2d) {
    OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_SetContinuity2d(swigCPtr, this, Continuity2d.swigValue());
  }

  /**
   *  Sets max degree for aproximation.
   */
  public void SetMaxDegree(int MaxDegree) {
    OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_SetMaxDegree(swigCPtr, this, MaxDegree);
  }

  /**
   *  Sets max number of segments for aproximation.
   */
  public void SetMaxNbSegments(int MaxNbSegments) {
    OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_SetMaxNbSegments(swigCPtr, this, MaxNbSegments);
  }

  /**
   *  Sets priority  for aproximation curves and surface.
   *  If Degree is True approximation is made with degree less
   *  then specified MaxDegree at the expense of number of spanes.
   *  If Degree is False approximation is made with number of
   *  spans less then specified MaxNbSegment at the expense of
   *  specified MaxDegree.
   */
  public void SetPriority(long Degree) {
    OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_SetPriority(swigCPtr, this, Degree);
  }

  /**
   *  Sets flag for define if rational BSpline or Bezier is
   *  converted to polynomial. If Rational is True approximation
   *  for rational BSpline and Bezier is made to polynomial even
   *  if degree is less then MaxDegree and number of spans is less
   *  then specified MaxNbSegment.
   */
  public void SetConvRational(long Rational) {
    OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_SetConvRational(swigCPtr, this, Rational);
  }

  public  ShapeCustom_RestrictionParameters  GetRestrictionParameters() {
    return new ShapeCustom_RestrictionParameters ( OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_GetRestrictionParameters(swigCPtr, this), true );
  }

  /**
   *  Sets the container of modes which defines
   *  what geometry should be converted to BSplines.
   */
  public void SetRestrictionParameters( ShapeCustom_RestrictionParameters  aModes) {
    OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_SetRestrictionParameters(swigCPtr, this,  ShapeCustom_RestrictionParameters.getCPtr(aModes) , aModes);
  }

  /**
   *  Returns error for aproximation curve3d.
   */
  public double Curve3dError() {
    return OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_Curve3dError(swigCPtr, this);
  }

  /**
   *  Returns error for aproximation curve2d.
   */
  public double Curve2dError() {
    return OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_Curve2dError(swigCPtr, this);
  }

  /**
   *  Returns error for aproximation surface.
   */
  public double SurfaceError() {
    return OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_SurfaceError(swigCPtr, this);
  }

  /**
   *  Returns error for aproximation surface, curve3d and curve2d.
   */
  public double MaxErrors(double[] aCurve3dErr, double[] aCurve2dErr) {
    return OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_MaxErrors(swigCPtr, this, aCurve3dErr, aCurve2dErr);
  }

  /**
   *  Returns number for aproximation surface, curve3d and curve2d.
   */
  public int NbOfSpan() {
    return OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_NbOfSpan(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_get_type_descriptor(), true );
  }

  public static  ShapeCustom_BSplineRestriction  DownCast( Standard_Transient  T) {
    return new ShapeCustom_BSplineRestriction ( OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeCustom_BSplineRestriction_TypeOf(), true );
  }

}
