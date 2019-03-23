package opencascade;

/**
 *  Adjusts curve to have start and end points at the given
 *  points (currently works on lines and B-Splines only)
 */
public class ShapeConstruct_Curve {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeConstruct_Curve(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeConstruct_Curve(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeConstruct_Curve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeConstruct_Curve(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Modifies a curve in order to make its bounds confused with
   *  given points.
   *  Works only on lines and B-Splines, returns True in this case,
   *  else returns False.
   *  For line considers both bounding points, for B-Splines only
   *  specified.
   * 
   *  Warning : Does not check if curve should be reversed
   */
  public long AdjustCurve( Geom_Curve  C3D,  gp_Pnt  P1,  gp_Pnt  P2, long take1, long take2) {
    return OCCwrapJavaJNI.ShapeConstruct_Curve_AdjustCurve__SWIG_0(swigCPtr, this,  Geom_Curve.getCPtr(C3D) , C3D, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2, take1, take2);
  }

  public long AdjustCurve( Geom_Curve  C3D,  gp_Pnt  P1,  gp_Pnt  P2, long take1) {
    return OCCwrapJavaJNI.ShapeConstruct_Curve_AdjustCurve__SWIG_1(swigCPtr, this,  Geom_Curve.getCPtr(C3D) , C3D, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2, take1);
  }

  public long AdjustCurve( Geom_Curve  C3D,  gp_Pnt  P1,  gp_Pnt  P2) {
    return OCCwrapJavaJNI.ShapeConstruct_Curve_AdjustCurve__SWIG_2(swigCPtr, this,  Geom_Curve.getCPtr(C3D) , C3D, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Modifies a curve in order to make its bounds confused with
   *  given points.
   *  Works only on lines and B-Splines.
   * 
   *  For lines works as previous method, B-Splines are segmented
   *  at the given values and then are adjusted to the points.
   */
  public long AdjustCurveSegment( Geom_Curve  C3D,  gp_Pnt  P1,  gp_Pnt  P2, double U1, double U2) {
    return OCCwrapJavaJNI.ShapeConstruct_Curve_AdjustCurveSegment(swigCPtr, this,  Geom_Curve.getCPtr(C3D) , C3D, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2, U1, U2);
  }

  /**
   *  Modifies a curve in order to make its bounds confused with
   *  given points.
   *  Works only on lines and B-Splines, returns True in this case,
   *  else returns False.
   * 
   *  For line considers both bounding points, for B-Splines only
   *  specified.
   * 
   *  Warning : Does not check if curve should be reversed
   */
  public long AdjustCurve2d( Geom2d_Curve  C2D,  gp_Pnt2d  P1,  gp_Pnt2d  P2, long take1, long take2) {
    return OCCwrapJavaJNI.ShapeConstruct_Curve_AdjustCurve2d__SWIG_0(swigCPtr, this,  Geom2d_Curve.getCPtr(C2D) , C2D, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2, take1, take2);
  }

  public long AdjustCurve2d( Geom2d_Curve  C2D,  gp_Pnt2d  P1,  gp_Pnt2d  P2, long take1) {
    return OCCwrapJavaJNI.ShapeConstruct_Curve_AdjustCurve2d__SWIG_1(swigCPtr, this,  Geom2d_Curve.getCPtr(C2D) , C2D, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2, take1);
  }

  public long AdjustCurve2d( Geom2d_Curve  C2D,  gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    return OCCwrapJavaJNI.ShapeConstruct_Curve_AdjustCurve2d__SWIG_2(swigCPtr, this,  Geom2d_Curve.getCPtr(C2D) , C2D, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2);
  }

  public  Geom_BSplineCurve  ConvertToBSpline( Geom_Curve  C, double first, double last, double prec) {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.ShapeConstruct_Curve_ConvertToBSpline__SWIG_0(swigCPtr, this,  Geom_Curve.getCPtr(C) , C, first, last, prec), true );
  }

  public  Geom2d_BSplineCurve  ConvertToBSpline( Geom2d_Curve  C, double first, double last, double prec) {
    return new Geom2d_BSplineCurve ( OCCwrapJavaJNI.ShapeConstruct_Curve_ConvertToBSpline__SWIG_1(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C, first, last, prec), true );
  }

  public static long FixKnots( TColStd_HArray1OfReal  knots) {
    return OCCwrapJavaJNI.ShapeConstruct_Curve_FixKnots__SWIG_0( TColStd_HArray1OfReal.getCPtr(knots) , knots);
  }

  /**
   *  Fix bspline knots to ensure that there is enough
   *  gap between neighbouring values
   *  Returns True if something fixed (by shifting knot)
   */
  public static long FixKnots( TColStd_Array1OfReal  knots) {
    return OCCwrapJavaJNI.ShapeConstruct_Curve_FixKnots__SWIG_1(TColStd_Array1OfReal.getCPtr(knots), knots);
  }

  public ShapeConstruct_Curve() {
    this(OCCwrapJavaJNI.new_ShapeConstruct_Curve(), true);
  }

}
