package opencascade;

/**
 *  Root class for 2D curves manipulated by handles, on
 *  which geometric algorithms work.
 *  An adapted curve is an interface between the
 *  services provided by a curve, and those required of
 *  the curve by algorithms, which use it.
 *  A derived specific class is provided:
 *  Geom2dAdaptor_HCurve for a curve from the Geom2d package.
 */
public class Adaptor2d_HCurve2d extends Standard_Transient {
  Adaptor2d_HCurve2d(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a reference to the Curve2d inside the HCurve2d.
   */
  public  Adaptor2d_Curve2d  Curve2d() {
    Adaptor2d_Curve2d ret = new Adaptor2d_Curve2d(OCCwrapJavaJNI.Adaptor2d_HCurve2d_Curve2d(swigCPtr, this), false, this);
    return ret;
  }

  public double FirstParameter() {
    return OCCwrapJavaJNI.Adaptor2d_HCurve2d_FirstParameter(swigCPtr, this);
  }

  public double LastParameter() {
    return OCCwrapJavaJNI.Adaptor2d_HCurve2d_LastParameter(swigCPtr, this);
  }

  public GeomAbs_Shape Continuity() {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.Adaptor2d_HCurve2d_Continuity(swigCPtr, this));
  }

  public int NbIntervals(GeomAbs_Shape S) {
    return OCCwrapJavaJNI.Adaptor2d_HCurve2d_NbIntervals(swigCPtr, this, S.swigValue());
  }

  public void Intervals( TColStd_Array1OfReal  T, GeomAbs_Shape S) {
    OCCwrapJavaJNI.Adaptor2d_HCurve2d_Intervals(swigCPtr, this, TColStd_Array1OfReal.getCPtr(T), T, S.swigValue());
  }

  public  Adaptor2d_HCurve2d  Trim(double First, double Last, double Tol) {
    return new Adaptor2d_HCurve2d ( OCCwrapJavaJNI.Adaptor2d_HCurve2d_Trim(swigCPtr, this, First, Last, Tol), true );
  }

  public long IsClosed() {
    return OCCwrapJavaJNI.Adaptor2d_HCurve2d_IsClosed(swigCPtr, this);
  }

  public long IsPeriodic() {
    return OCCwrapJavaJNI.Adaptor2d_HCurve2d_IsPeriodic(swigCPtr, this);
  }

  public double Period() {
    return OCCwrapJavaJNI.Adaptor2d_HCurve2d_Period(swigCPtr, this);
  }

  public gp_Pnt2d Value(double U) {
    return new gp_Pnt2d(OCCwrapJavaJNI.Adaptor2d_HCurve2d_Value(swigCPtr, this, U), true);
  }

  public void D0(double U, gp_Pnt2d P) {
    OCCwrapJavaJNI.Adaptor2d_HCurve2d_D0(swigCPtr, this, U, gp_Pnt2d.getCPtr(P), P);
  }

  public void D1(double U, gp_Pnt2d P, gp_Vec2d V) {
    OCCwrapJavaJNI.Adaptor2d_HCurve2d_D1(swigCPtr, this, U, gp_Pnt2d.getCPtr(P), P, gp_Vec2d.getCPtr(V), V);
  }

  public void D2(double U, gp_Pnt2d P, gp_Vec2d V1, gp_Vec2d V2) {
    OCCwrapJavaJNI.Adaptor2d_HCurve2d_D2(swigCPtr, this, U, gp_Pnt2d.getCPtr(P), P, gp_Vec2d.getCPtr(V1), V1, gp_Vec2d.getCPtr(V2), V2);
  }

  public void D3(double U, gp_Pnt2d P, gp_Vec2d V1, gp_Vec2d V2, gp_Vec2d V3) {
    OCCwrapJavaJNI.Adaptor2d_HCurve2d_D3(swigCPtr, this, U, gp_Pnt2d.getCPtr(P), P, gp_Vec2d.getCPtr(V1), V1, gp_Vec2d.getCPtr(V2), V2, gp_Vec2d.getCPtr(V3), V3);
  }

  public gp_Vec2d DN(double U, int N) {
    return new gp_Vec2d(OCCwrapJavaJNI.Adaptor2d_HCurve2d_DN(swigCPtr, this, U, N), true);
  }

  public double Resolution(double R3d) {
    return OCCwrapJavaJNI.Adaptor2d_HCurve2d_Resolution(swigCPtr, this, R3d);
  }

  public GeomAbs_CurveType GetCurveType() {
    return GeomAbs_CurveType.swigToEnum(OCCwrapJavaJNI.Adaptor2d_HCurve2d_GetCurveType(swigCPtr, this));
  }

  public gp_Lin2d Line() {
    return new gp_Lin2d(OCCwrapJavaJNI.Adaptor2d_HCurve2d_Line(swigCPtr, this), true);
  }

  public gp_Circ2d Circle() {
    return new gp_Circ2d(OCCwrapJavaJNI.Adaptor2d_HCurve2d_Circle(swigCPtr, this), true);
  }

  public gp_Elips2d Ellipse() {
    return new gp_Elips2d(OCCwrapJavaJNI.Adaptor2d_HCurve2d_Ellipse(swigCPtr, this), true);
  }

  public gp_Hypr2d Hyperbola() {
    return new gp_Hypr2d(OCCwrapJavaJNI.Adaptor2d_HCurve2d_Hyperbola(swigCPtr, this), true);
  }

  public gp_Parab2d Parabola() {
    return new gp_Parab2d(OCCwrapJavaJNI.Adaptor2d_HCurve2d_Parabola(swigCPtr, this), true);
  }

  public int Degree() {
    return OCCwrapJavaJNI.Adaptor2d_HCurve2d_Degree(swigCPtr, this);
  }

  public long IsRational() {
    return OCCwrapJavaJNI.Adaptor2d_HCurve2d_IsRational(swigCPtr, this);
  }

  public int NbPoles() {
    return OCCwrapJavaJNI.Adaptor2d_HCurve2d_NbPoles(swigCPtr, this);
  }

  public int NbKnots() {
    return OCCwrapJavaJNI.Adaptor2d_HCurve2d_NbKnots(swigCPtr, this);
  }

  public  Geom2d_BezierCurve  Bezier() {
    return new Geom2d_BezierCurve ( OCCwrapJavaJNI.Adaptor2d_HCurve2d_Bezier(swigCPtr, this), true );
  }

  public  Geom2d_BSplineCurve  BSpline() {
    return new Geom2d_BSplineCurve ( OCCwrapJavaJNI.Adaptor2d_HCurve2d_BSpline(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Adaptor2d_HCurve2d_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Adaptor2d_HCurve2d_get_type_descriptor(), true );
  }

  public static  Adaptor2d_HCurve2d  DownCast( Standard_Transient  T) {
    return new Adaptor2d_HCurve2d ( OCCwrapJavaJNI.Adaptor2d_HCurve2d_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Adaptor2d_HCurve2d_TypeOf(), true );
  }

}
