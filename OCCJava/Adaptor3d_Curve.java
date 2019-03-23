package opencascade;

/**
 *  Root class for 3D curves on which geometric
 *  algorithms work.
 *  An adapted curve is an interface between the
 *  services provided by a curve and those required of
 *  the curve by algorithms which use it.
 *  Two derived concrete classes are provided:
 *  - GeomAdaptor_Curve for a curve from the Geom package
 *  - Adaptor3d_CurveOnSurface for a curve lying on
 *  a surface from the Geom package.
 * 
 *  Polynomial coefficients of BSpline curves used for their evaluation are
 *  cached for better performance. Therefore these evaluations are not
 *  thread-safe and parallel evaluations need to be prevented.
 */
public class Adaptor3d_Curve {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Adaptor3d_Curve(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Adaptor3d_Curve(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Adaptor3d_Curve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Adaptor3d_Curve(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public double FirstParameter() {
    return OCCwrapJavaJNI.Adaptor3d_Curve_FirstParameter(swigCPtr, this);
  }

  public double LastParameter() {
    return OCCwrapJavaJNI.Adaptor3d_Curve_LastParameter(swigCPtr, this);
  }

  public GeomAbs_Shape Continuity() {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.Adaptor3d_Curve_Continuity(swigCPtr, this));
  }

  /**
   *  Returns  the number  of  intervals for  continuity
   *  <S>. May be one if Continuity(me) >= <S>
   */
  public int NbIntervals(GeomAbs_Shape S) {
    return OCCwrapJavaJNI.Adaptor3d_Curve_NbIntervals(swigCPtr, this, S.swigValue());
  }

  /**
   *  Stores in <T> the  parameters bounding the intervals
   *  of continuity <S>.
   * 
   *  The array must provide  enough room to  accomodate
   *  for the parameters. i.e. T.Length() > NbIntervals()
   */
  public void Intervals( TColStd_Array1OfReal  T, GeomAbs_Shape S) {
    OCCwrapJavaJNI.Adaptor3d_Curve_Intervals(swigCPtr, this, TColStd_Array1OfReal.getCPtr(T), T, S.swigValue());
  }

  public  Adaptor3d_HCurve  Trim(double First, double Last, double Tol) {
    return new Adaptor3d_HCurve ( OCCwrapJavaJNI.Adaptor3d_Curve_Trim(swigCPtr, this, First, Last, Tol), true );
  }

  public long IsClosed() {
    return OCCwrapJavaJNI.Adaptor3d_Curve_IsClosed(swigCPtr, this);
  }

  public long IsPeriodic() {
    return OCCwrapJavaJNI.Adaptor3d_Curve_IsPeriodic(swigCPtr, this);
  }

  public double Period() {
    return OCCwrapJavaJNI.Adaptor3d_Curve_Period(swigCPtr, this);
  }

  /**
   *  Computes the point of parameter U on the curve.
   */
  public gp_Pnt Value(double U) {
    return new gp_Pnt(OCCwrapJavaJNI.Adaptor3d_Curve_Value(swigCPtr, this, U), true);
  }

  /**
   *  Computes the point of parameter U on the curve.
   */
  public void D0(double U, gp_Pnt P) {
    OCCwrapJavaJNI.Adaptor3d_Curve_D0(swigCPtr, this, U, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Computes the point of parameter U on the curve with its
   *  first derivative.
   *  Raised if the continuity of the current interval
   *  is not C1.
   */
  public void D1(double U, gp_Pnt P, gp_Vec V) {
    OCCwrapJavaJNI.Adaptor3d_Curve_D1(swigCPtr, this, U, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Returns the point P of parameter U, the first and second
   *  derivatives V1 and V2.
   *  Raised if the continuity of the current interval
   *  is not C2.
   */
  public void D2(double U, gp_Pnt P, gp_Vec V1, gp_Vec V2) {
    OCCwrapJavaJNI.Adaptor3d_Curve_D2(swigCPtr, this, U, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2);
  }

  /**
   *  Returns the point P of parameter U, the first, the second
   *  and the third derivative.
   *  Raised if the continuity of the current interval
   *  is not C3.
   */
  public void D3(double U, gp_Pnt P, gp_Vec V1, gp_Vec V2, gp_Vec V3) {
    OCCwrapJavaJNI.Adaptor3d_Curve_D3(swigCPtr, this, U, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2, gp_Vec.getCPtr(V3), V3);
  }

  /**
   *  The returned vector gives the value of the derivative for the
   *  order of derivation N.
   *  Raised if the continuity of the current interval
   *  is not CN.
   *  Raised if N < 1.
   */
  public gp_Vec DN(double U, int N) {
    return new gp_Vec(OCCwrapJavaJNI.Adaptor3d_Curve_DN(swigCPtr, this, U, N), true);
  }

  /**
   *  Returns the parametric  resolution corresponding
   *  to the real space resolution <R3d>.
   */
  public double Resolution(double R3d) {
    return OCCwrapJavaJNI.Adaptor3d_Curve_Resolution(swigCPtr, this, R3d);
  }

  public GeomAbs_CurveType GetCurveType() {
    return GeomAbs_CurveType.swigToEnum(OCCwrapJavaJNI.Adaptor3d_Curve_GetCurveType(swigCPtr, this));
  }

  public gp_Lin Line() {
    return new gp_Lin(OCCwrapJavaJNI.Adaptor3d_Curve_Line(swigCPtr, this), true);
  }

  public gp_Circ Circle() {
    return new gp_Circ(OCCwrapJavaJNI.Adaptor3d_Curve_Circle(swigCPtr, this), true);
  }

  public gp_Elips Ellipse() {
    return new gp_Elips(OCCwrapJavaJNI.Adaptor3d_Curve_Ellipse(swigCPtr, this), true);
  }

  public gp_Hypr Hyperbola() {
    return new gp_Hypr(OCCwrapJavaJNI.Adaptor3d_Curve_Hyperbola(swigCPtr, this), true);
  }

  public gp_Parab Parabola() {
    return new gp_Parab(OCCwrapJavaJNI.Adaptor3d_Curve_Parabola(swigCPtr, this), true);
  }

  public int Degree() {
    return OCCwrapJavaJNI.Adaptor3d_Curve_Degree(swigCPtr, this);
  }

  public long IsRational() {
    return OCCwrapJavaJNI.Adaptor3d_Curve_IsRational(swigCPtr, this);
  }

  public int NbPoles() {
    return OCCwrapJavaJNI.Adaptor3d_Curve_NbPoles(swigCPtr, this);
  }

  public int NbKnots() {
    return OCCwrapJavaJNI.Adaptor3d_Curve_NbKnots(swigCPtr, this);
  }

  public  Geom_BezierCurve  Bezier() {
    return new Geom_BezierCurve ( OCCwrapJavaJNI.Adaptor3d_Curve_Bezier(swigCPtr, this), true );
  }

  public  Geom_BSplineCurve  BSpline() {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.Adaptor3d_Curve_BSpline(swigCPtr, this), true );
  }

  public  Geom_OffsetCurve  OffsetCurve() {
    return new Geom_OffsetCurve ( OCCwrapJavaJNI.Adaptor3d_Curve_OffsetCurve(swigCPtr, this), true );
  }

  public Adaptor3d_Curve() {
    this(OCCwrapJavaJNI.new_Adaptor3d_Curve(), true);
  }

}
