package opencascade;

/**
 *  Analyzing tool for 2d or 3d curve.
 *  Computes parameters of projected point onto a curve.
 */
public class ShapeAnalysis_Curve {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeAnalysis_Curve(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeAnalysis_Curve(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeAnalysis_Curve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeAnalysis_Curve(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Projects a Point on a Curve.
   *  Computes the projected point and its parameter on the curve.
   *  <preci> is used as 3d precision (hence, 0 will produce
   *  reject unless exact confusion).
   *  The number of iterations is limited.
   *  If AdjustToEnds is True, point will be adjusted to the end
   *  of the curve if distance is less than <preci>
   * 
   *  Returned value is the distance between the given point and
   *  computed one.
   */
  public double Project( Geom_Curve  C3D,  gp_Pnt  P3D, double preci, gp_Pnt proj, double[] param, long AdjustToEnds) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_Project__SWIG_0(swigCPtr, this,  Geom_Curve.getCPtr(C3D) , C3D, gp_Pnt.getCPtr(P3D), P3D, preci, gp_Pnt.getCPtr(proj), proj, param, AdjustToEnds);
  }

  /**
   *  Projects a Point on a Curve.
   *  Computes the projected point and its parameter on the curve.
   *  <preci> is used as 3d precision (hence, 0 will produce
   *  reject unless exact confusion).
   *  The number of iterations is limited.
   * 
   *  Returned value is the distance between the given point and
   *  computed one.
   */
  public double Project( Geom_Curve  C3D,  gp_Pnt  P3D, double preci, gp_Pnt proj, double[] param) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_Project__SWIG_1(swigCPtr, this,  Geom_Curve.getCPtr(C3D) , C3D, gp_Pnt.getCPtr(P3D), P3D, preci, gp_Pnt.getCPtr(proj), proj, param);
  }

  /**
   *  Projects a Point on a Curve, but parameters are limited
   *  between <cf> and <cl>.
   *  The range [cf, cl] is extended with help of Adaptor3d on the
   *  basis of 3d precision <preci>.
   *  If AdjustToEnds is True, point will be adjusted to the end
   *  of the curve if distance is less than <preci>
   */
  public double Project( Adaptor3d_Curve  C3D,  gp_Pnt  P3D, double preci, gp_Pnt proj, double[] param, long AdjustToEnds) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_Project__SWIG_2(swigCPtr, this, Adaptor3d_Curve.getCPtr(C3D), C3D, gp_Pnt.getCPtr(P3D), P3D, preci, gp_Pnt.getCPtr(proj), proj, param, AdjustToEnds);
  }

  public double Project( Adaptor3d_Curve  C3D,  gp_Pnt  P3D, double preci, gp_Pnt proj, double[] param) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_Project__SWIG_3(swigCPtr, this, Adaptor3d_Curve.getCPtr(C3D), C3D, gp_Pnt.getCPtr(P3D), P3D, preci, gp_Pnt.getCPtr(proj), proj, param);
  }

  public double Project( Geom_Curve  C3D,  gp_Pnt  P3D, double preci, gp_Pnt proj, double[] param, double cf, double cl, long AdjustToEnds) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_Project__SWIG_4(swigCPtr, this,  Geom_Curve.getCPtr(C3D) , C3D, gp_Pnt.getCPtr(P3D), P3D, preci, gp_Pnt.getCPtr(proj), proj, param, cf, cl, AdjustToEnds);
  }

  public double Project( Geom_Curve  C3D,  gp_Pnt  P3D, double preci, gp_Pnt proj, double[] param, double cf, double cl) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_Project__SWIG_5(swigCPtr, this,  Geom_Curve.getCPtr(C3D) , C3D, gp_Pnt.getCPtr(P3D), P3D, preci, gp_Pnt.getCPtr(proj), proj, param, cf, cl);
  }

  public double ProjectAct( Adaptor3d_Curve  C3D,  gp_Pnt  P3D, double preci, gp_Pnt proj, double[] param) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_ProjectAct(swigCPtr, this, Adaptor3d_Curve.getCPtr(C3D), C3D, gp_Pnt.getCPtr(P3D), P3D, preci, gp_Pnt.getCPtr(proj), proj, param);
  }

  /**
   *  Projects a Point on a Curve using Newton method.
   *  <paramPrev> is taken as the first approximation of solution.
   *  If Newton algorithm fails the method Project() is used.
   *  If AdjustToEnds is True, point will be adjusted to the end
   *  of the curve if distance is less than <preci>
   */
  public double NextProject(double paramPrev,  Geom_Curve  C3D,  gp_Pnt  P3D, double preci, gp_Pnt proj, double[] param, double cf, double cl, long AdjustToEnds) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_NextProject__SWIG_0(swigCPtr, this, paramPrev,  Geom_Curve.getCPtr(C3D) , C3D, gp_Pnt.getCPtr(P3D), P3D, preci, gp_Pnt.getCPtr(proj), proj, param, cf, cl, AdjustToEnds);
  }

  /**
   *  Projects a Point on a Curve using Newton method.
   *  <paramPrev> is taken as the first approximation of solution.
   *  If Newton algorithm fails the method Project() is used.
   */
  public double NextProject(double paramPrev,  Geom_Curve  C3D,  gp_Pnt  P3D, double preci, gp_Pnt proj, double[] param, double cf, double cl) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_NextProject__SWIG_1(swigCPtr, this, paramPrev,  Geom_Curve.getCPtr(C3D) , C3D, gp_Pnt.getCPtr(P3D), P3D, preci, gp_Pnt.getCPtr(proj), proj, param, cf, cl);
  }

  public double NextProject(double paramPrev,  Adaptor3d_Curve  C3D,  gp_Pnt  P3D, double preci, gp_Pnt proj, double[] param) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_NextProject__SWIG_2(swigCPtr, this, paramPrev, Adaptor3d_Curve.getCPtr(C3D), C3D, gp_Pnt.getCPtr(P3D), P3D, preci, gp_Pnt.getCPtr(proj), proj, param);
  }

  /**
   *  Validate parameters First and Last for the given curve
   *  in order to make them valid for creation of edge.
   *  This includes:
   *  - limiting range [First,Last] by range of curve
   *  - adjusting range [First,Last] for periodic (or closed)
   *  curve if Last < First
   *  Returns True if parameters are OK or are successfully
   *  corrected, or False if parameters cannot be corrected.
   *  In the latter case, parameters are reset to range of curve.
   */
  public long ValidateRange( Geom_Curve  Crv, double[] First, double[] Last, double prec) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_ValidateRange(swigCPtr, this,  Geom_Curve.getCPtr(Crv) , Crv, First, Last, prec);
  }

  /**
   *  Computes a boundary box on segment of curve C2d from First
   *  to Last. This is done by taking NPoints points from the
   *  curve and, if Exact is True, by searching for exact
   *  extrema. All these points are added to Box.
   */
  public void FillBndBox( Geom2d_Curve  C2d, double First, double Last, int NPoints, long Exact, Bnd_Box2d Box) {
    OCCwrapJavaJNI.ShapeAnalysis_Curve_FillBndBox(swigCPtr, this,  Geom2d_Curve.getCPtr(C2d) , C2d, First, Last, NPoints, Exact, Bnd_Box2d.getCPtr(Box), Box);
  }

  /**
   *  Defines which pcurve (C1 or C2) should be chosen for FORWARD
   *  seam edge.
   */
  public int SelectForwardSeam( Geom2d_Curve  C1,  Geom2d_Curve  C2) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_SelectForwardSeam(swigCPtr, this,  Geom2d_Curve.getCPtr(C1) , C1,  Geom2d_Curve.getCPtr(C2) , C2);
  }

  /**
   *  Checks if points are planar with given preci. If Normal has not zero
   *  modulus, checks with given normal
   */
  public static long IsPlanar( TColgp_Array1OfPnt  pnts, gp_XYZ Normal, double preci) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_IsPlanar__SWIG_0(TColgp_Array1OfPnt.getCPtr(pnts), pnts, gp_XYZ.getCPtr(Normal), Normal, preci);
  }

  /**
   *  Checks if curve is planar with given preci. If Normal has not zero
   *  modulus, checks with given normal
   */
  public static long IsPlanar( TColgp_Array1OfPnt  pnts, gp_XYZ Normal) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_IsPlanar__SWIG_1(TColgp_Array1OfPnt.getCPtr(pnts), pnts, gp_XYZ.getCPtr(Normal), Normal);
  }

  public static long IsPlanar( Geom_Curve  curve, gp_XYZ Normal, double preci) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_IsPlanar__SWIG_2( Geom_Curve.getCPtr(curve) , curve, gp_XYZ.getCPtr(Normal), Normal, preci);
  }

  public static long IsPlanar( Geom_Curve  curve, gp_XYZ Normal) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_IsPlanar__SWIG_3( Geom_Curve.getCPtr(curve) , curve, gp_XYZ.getCPtr(Normal), Normal);
  }

  /**
   *  Returns sample points which will serve as linearisation
   *  of the2d curve in range (first, last)
   *  The distribution of sample points is consystent with
   *  what is used by BRepTopAdaptor_FClass2d
   */
  public static long GetSamplePoints( Geom2d_Curve  curve, double first, double last,  TColgp_SequenceOfPnt2d  seq) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_GetSamplePoints__SWIG_0( Geom2d_Curve.getCPtr(curve) , curve, first, last, TColgp_SequenceOfPnt2d.getCPtr(seq), seq);
  }

  /**
   *  Returns sample points which will serve as linearisation
   *  of the curve in range (first, last)
   */
  public static long GetSamplePoints( Geom_Curve  curve, double first, double last,  TColgp_SequenceOfPnt  seq) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_GetSamplePoints__SWIG_1( Geom_Curve.getCPtr(curve) , curve, first, last, TColgp_SequenceOfPnt.getCPtr(seq), seq);
  }

  /**
   *  Tells if the Curve is closed with given precision.
   *  If <preci> < 0 then Precision::Confusion is used.
   */
  public static long IsClosed( Geom_Curve  curve, double preci) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_IsClosed__SWIG_0( Geom_Curve.getCPtr(curve) , curve, preci);
  }

  public static long IsClosed( Geom_Curve  curve) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_IsClosed__SWIG_1( Geom_Curve.getCPtr(curve) , curve);
  }

  /**
   *  This method was implemented as fix for changes in trimmed curve
   *  behaviour. For the moment trimmed curve returns false anyway.
   *  So it is necessary to adapt all Data exchange tools for this behaviour.
   *  Current implementation takes into account that curve may be offset.
   */
  public static long IsPeriodic( Geom_Curve  curve) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_IsPeriodic__SWIG_0( Geom_Curve.getCPtr(curve) , curve);
  }

  /**
   *  The same as for Curve3d.
   */
  public static long IsPeriodic( Geom2d_Curve  curve) {
    return OCCwrapJavaJNI.ShapeAnalysis_Curve_IsPeriodic__SWIG_1( Geom2d_Curve.getCPtr(curve) , curve);
  }

  public ShapeAnalysis_Curve() {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_Curve(), true);
  }

}
