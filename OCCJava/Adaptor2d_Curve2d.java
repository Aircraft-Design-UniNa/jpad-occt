package opencascade;

/**
 *  Root class for 2D curves on which geometric
 *  algorithms work.
 *  An adapted curve is an interface between the
 *  services provided by a curve, and those required of
 *  the curve by algorithms, which use it.
 *  A derived concrete class is provided:
 *  Geom2dAdaptor_Curve for a curve from the Geom2d package.
 * 
 *  Polynomial coefficients of BSpline curves used for their evaluation are
 *  cached for better performance. Therefore these evaluations are not
 *  thread-safe and parallel evaluations need to be prevented.
 */
public class Adaptor2d_Curve2d {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Adaptor2d_Curve2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Adaptor2d_Curve2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Adaptor2d_Curve2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Adaptor2d_Curve2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public double FirstParameter() {
    return OCCwrapJavaJNI.Adaptor2d_Curve2d_FirstParameter(swigCPtr, this);
  }

  public double LastParameter() {
    return OCCwrapJavaJNI.Adaptor2d_Curve2d_LastParameter(swigCPtr, this);
  }

  public GeomAbs_Shape Continuity() {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.Adaptor2d_Curve2d_Continuity(swigCPtr, this));
  }

  /**
   *  If necessary,  breaks the  curve in  intervals  of
   *  continuity  <S>.    And  returns   the number   of
   *  intervals.
   */
  public int NbIntervals(GeomAbs_Shape S) {
    return OCCwrapJavaJNI.Adaptor2d_Curve2d_NbIntervals(swigCPtr, this, S.swigValue());
  }

  /**
   *  Stores in <T> the  parameters bounding the intervals
   *  of continuity <S>.
   * 
   *  The array must provide  enough room to  accomodate
   *  for the parameters. i.e. T.Length() > NbIntervals()
   */
  public void Intervals( TColStd_Array1OfReal  T, GeomAbs_Shape S) {
    OCCwrapJavaJNI.Adaptor2d_Curve2d_Intervals(swigCPtr, this, TColStd_Array1OfReal.getCPtr(T), T, S.swigValue());
  }

  public  Adaptor2d_HCurve2d  Trim(double First, double Last, double Tol) {
    return new Adaptor2d_HCurve2d ( OCCwrapJavaJNI.Adaptor2d_Curve2d_Trim(swigCPtr, this, First, Last, Tol), true );
  }

  public long IsClosed() {
    return OCCwrapJavaJNI.Adaptor2d_Curve2d_IsClosed(swigCPtr, this);
  }

  public long IsPeriodic() {
    return OCCwrapJavaJNI.Adaptor2d_Curve2d_IsPeriodic(swigCPtr, this);
  }

  public double Period() {
    return OCCwrapJavaJNI.Adaptor2d_Curve2d_Period(swigCPtr, this);
  }

  /**
   *  Computes the point of parameter U on the curve.
   */
  public gp_Pnt2d Value(double U) {
    return new gp_Pnt2d(OCCwrapJavaJNI.Adaptor2d_Curve2d_Value(swigCPtr, this, U), true);
  }

  /**
   *  Computes the point of parameter U on the curve.
   */
  public void D0(double U, gp_Pnt2d P) {
    OCCwrapJavaJNI.Adaptor2d_Curve2d_D0(swigCPtr, this, U, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Computes the point of parameter U on the curve with its
   *  first derivative.
   *  Raised if the continuity of the current interval
   *  is not C1.
   */
  public void D1(double U, gp_Pnt2d P, gp_Vec2d V) {
    OCCwrapJavaJNI.Adaptor2d_Curve2d_D1(swigCPtr, this, U, gp_Pnt2d.getCPtr(P), P, gp_Vec2d.getCPtr(V), V);
  }

  /**
   *  Returns the point P of parameter U, the first and second
   *  derivatives V1 and V2.
   *  Raised if the continuity of the current interval
   *  is not C2.
   */
  public void D2(double U, gp_Pnt2d P, gp_Vec2d V1, gp_Vec2d V2) {
    OCCwrapJavaJNI.Adaptor2d_Curve2d_D2(swigCPtr, this, U, gp_Pnt2d.getCPtr(P), P, gp_Vec2d.getCPtr(V1), V1, gp_Vec2d.getCPtr(V2), V2);
  }

  /**
   *  Returns the point P of parameter U, the first, the second
   *  and the third derivative.
   *  Raised if the continuity of the current interval
   *  is not C3.
   */
  public void D3(double U, gp_Pnt2d P, gp_Vec2d V1, gp_Vec2d V2, gp_Vec2d V3) {
    OCCwrapJavaJNI.Adaptor2d_Curve2d_D3(swigCPtr, this, U, gp_Pnt2d.getCPtr(P), P, gp_Vec2d.getCPtr(V1), V1, gp_Vec2d.getCPtr(V2), V2, gp_Vec2d.getCPtr(V3), V3);
  }

  /**
   *  The returned vector gives the value of the derivative for the
   *  order of derivation N.
   *  Raised if the continuity of the current interval
   *  is not CN.
   *  Raised if N < 1.
   */
  public gp_Vec2d DN(double U, int N) {
    return new gp_Vec2d(OCCwrapJavaJNI.Adaptor2d_Curve2d_DN(swigCPtr, this, U, N), true);
  }

  /**
   *  Returns the parametric  resolution corresponding
   *  to the real space resolution <R3d>.
   */
  public double Resolution(double R3d) {
    return OCCwrapJavaJNI.Adaptor2d_Curve2d_Resolution(swigCPtr, this, R3d);
  }

  public GeomAbs_CurveType GetCurveType() {
    return GeomAbs_CurveType.swigToEnum(OCCwrapJavaJNI.Adaptor2d_Curve2d_GetCurveType(swigCPtr, this));
  }

  public gp_Lin2d Line() {
    return new gp_Lin2d(OCCwrapJavaJNI.Adaptor2d_Curve2d_Line(swigCPtr, this), true);
  }

  public gp_Circ2d Circle() {
    return new gp_Circ2d(OCCwrapJavaJNI.Adaptor2d_Curve2d_Circle(swigCPtr, this), true);
  }

  public gp_Elips2d Ellipse() {
    return new gp_Elips2d(OCCwrapJavaJNI.Adaptor2d_Curve2d_Ellipse(swigCPtr, this), true);
  }

  public gp_Hypr2d Hyperbola() {
    return new gp_Hypr2d(OCCwrapJavaJNI.Adaptor2d_Curve2d_Hyperbola(swigCPtr, this), true);
  }

  public gp_Parab2d Parabola() {
    return new gp_Parab2d(OCCwrapJavaJNI.Adaptor2d_Curve2d_Parabola(swigCPtr, this), true);
  }

  public int Degree() {
    return OCCwrapJavaJNI.Adaptor2d_Curve2d_Degree(swigCPtr, this);
  }

  public long IsRational() {
    return OCCwrapJavaJNI.Adaptor2d_Curve2d_IsRational(swigCPtr, this);
  }

  public int NbPoles() {
    return OCCwrapJavaJNI.Adaptor2d_Curve2d_NbPoles(swigCPtr, this);
  }

  public int NbKnots() {
    return OCCwrapJavaJNI.Adaptor2d_Curve2d_NbKnots(swigCPtr, this);
  }

  public int NbSamples() {
    return OCCwrapJavaJNI.Adaptor2d_Curve2d_NbSamples(swigCPtr, this);
  }

  public  Geom2d_BezierCurve  Bezier() {
    return new Geom2d_BezierCurve ( OCCwrapJavaJNI.Adaptor2d_Curve2d_Bezier(swigCPtr, this), true );
  }

  public  Geom2d_BSplineCurve  BSpline() {
    return new Geom2d_BSplineCurve ( OCCwrapJavaJNI.Adaptor2d_Curve2d_BSpline(swigCPtr, this), true );
  }

  public Adaptor2d_Curve2d() {
    this(OCCwrapJavaJNI.new_Adaptor2d_Curve2d(), true);
  }

}
