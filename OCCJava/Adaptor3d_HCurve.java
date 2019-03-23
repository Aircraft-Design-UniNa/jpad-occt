package opencascade;

/**
 *  Root class for 3D curves manipulated by handles, on
 *  which geometric algorithms work.
 *  An adapted curve is an interface between the
 *  services provided by a curve and those required of
 *  the curve by algorithms which use it.
 *  Two derived concrete classes are provided:
 *  - GeomAdaptor_HCurve for a curve from the Geom package
 *  - Adaptor3d_HCurveOnSurface for a curve lying
 *  on a surface from the Geom package.
 */
public class Adaptor3d_HCurve extends Standard_Transient {
  Adaptor3d_HCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a pointer to the Curve inside the HCurve.
   */
  public  Adaptor3d_Curve  Curve() {
    Adaptor3d_Curve ret = new Adaptor3d_Curve(OCCwrapJavaJNI.Adaptor3d_HCurve_Curve(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns a pointer to the Curve inside the HCurve.
   */
  public  Adaptor3d_Curve  GetCurve() {
    Adaptor3d_Curve ret = new Adaptor3d_Curve(OCCwrapJavaJNI.Adaptor3d_HCurve_GetCurve(swigCPtr, this), false, this);
    return ret;
  }

  public double FirstParameter() {
    return OCCwrapJavaJNI.Adaptor3d_HCurve_FirstParameter(swigCPtr, this);
  }

  public double LastParameter() {
    return OCCwrapJavaJNI.Adaptor3d_HCurve_LastParameter(swigCPtr, this);
  }

  public GeomAbs_Shape Continuity() {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.Adaptor3d_HCurve_Continuity(swigCPtr, this));
  }

  public int NbIntervals(GeomAbs_Shape S) {
    return OCCwrapJavaJNI.Adaptor3d_HCurve_NbIntervals(swigCPtr, this, S.swigValue());
  }

  /**
   *  Stores in <T> the  parameters bounding the intervals
   *  of continuity <S>.
   * 
   *  The array must provide  enough room to  accomodate
   *  for the parameters. i.e. T.Length() > NbIntervals()
   */
  public void Intervals( TColStd_Array1OfReal  T, GeomAbs_Shape S) {
    OCCwrapJavaJNI.Adaptor3d_HCurve_Intervals(swigCPtr, this, TColStd_Array1OfReal.getCPtr(T), T, S.swigValue());
  }

  public  Adaptor3d_HCurve  Trim(double First, double Last, double Tol) {
    return new Adaptor3d_HCurve ( OCCwrapJavaJNI.Adaptor3d_HCurve_Trim(swigCPtr, this, First, Last, Tol), true );
  }

  public long IsClosed() {
    return OCCwrapJavaJNI.Adaptor3d_HCurve_IsClosed(swigCPtr, this);
  }

  public long IsPeriodic() {
    return OCCwrapJavaJNI.Adaptor3d_HCurve_IsPeriodic(swigCPtr, this);
  }

  public double Period() {
    return OCCwrapJavaJNI.Adaptor3d_HCurve_Period(swigCPtr, this);
  }

  public gp_Pnt Value(double U) {
    return new gp_Pnt(OCCwrapJavaJNI.Adaptor3d_HCurve_Value(swigCPtr, this, U), true);
  }

  public void D0(double U, gp_Pnt P) {
    OCCwrapJavaJNI.Adaptor3d_HCurve_D0(swigCPtr, this, U, gp_Pnt.getCPtr(P), P);
  }

  public void D1(double U, gp_Pnt P, gp_Vec V) {
    OCCwrapJavaJNI.Adaptor3d_HCurve_D1(swigCPtr, this, U, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V), V);
  }

  public void D2(double U, gp_Pnt P, gp_Vec V1, gp_Vec V2) {
    OCCwrapJavaJNI.Adaptor3d_HCurve_D2(swigCPtr, this, U, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2);
  }

  public void D3(double U, gp_Pnt P, gp_Vec V1, gp_Vec V2, gp_Vec V3) {
    OCCwrapJavaJNI.Adaptor3d_HCurve_D3(swigCPtr, this, U, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2, gp_Vec.getCPtr(V3), V3);
  }

  public gp_Vec DN(double U, int N) {
    return new gp_Vec(OCCwrapJavaJNI.Adaptor3d_HCurve_DN(swigCPtr, this, U, N), true);
  }

  public double Resolution(double R3d) {
    return OCCwrapJavaJNI.Adaptor3d_HCurve_Resolution(swigCPtr, this, R3d);
  }

  public GeomAbs_CurveType GetCurveType() {
    return GeomAbs_CurveType.swigToEnum(OCCwrapJavaJNI.Adaptor3d_HCurve_GetCurveType(swigCPtr, this));
  }

  public gp_Lin Line() {
    return new gp_Lin(OCCwrapJavaJNI.Adaptor3d_HCurve_Line(swigCPtr, this), true);
  }

  public gp_Circ Circle() {
    return new gp_Circ(OCCwrapJavaJNI.Adaptor3d_HCurve_Circle(swigCPtr, this), true);
  }

  public gp_Elips Ellipse() {
    return new gp_Elips(OCCwrapJavaJNI.Adaptor3d_HCurve_Ellipse(swigCPtr, this), true);
  }

  public gp_Hypr Hyperbola() {
    return new gp_Hypr(OCCwrapJavaJNI.Adaptor3d_HCurve_Hyperbola(swigCPtr, this), true);
  }

  public gp_Parab Parabola() {
    return new gp_Parab(OCCwrapJavaJNI.Adaptor3d_HCurve_Parabola(swigCPtr, this), true);
  }

  public int Degree() {
    return OCCwrapJavaJNI.Adaptor3d_HCurve_Degree(swigCPtr, this);
  }

  public long IsRational() {
    return OCCwrapJavaJNI.Adaptor3d_HCurve_IsRational(swigCPtr, this);
  }

  public int NbPoles() {
    return OCCwrapJavaJNI.Adaptor3d_HCurve_NbPoles(swigCPtr, this);
  }

  public int NbKnots() {
    return OCCwrapJavaJNI.Adaptor3d_HCurve_NbKnots(swigCPtr, this);
  }

  public  Geom_BezierCurve  Bezier() {
    return new Geom_BezierCurve ( OCCwrapJavaJNI.Adaptor3d_HCurve_Bezier(swigCPtr, this), true );
  }

  public  Geom_BSplineCurve  BSpline() {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.Adaptor3d_HCurve_BSpline(swigCPtr, this), true );
  }

  public  Geom_OffsetCurve  OffsetCurve() {
    return new Geom_OffsetCurve ( OCCwrapJavaJNI.Adaptor3d_HCurve_OffsetCurve(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Adaptor3d_HCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Adaptor3d_HCurve_get_type_descriptor(), true );
  }

  public static  Adaptor3d_HCurve  DownCast( Standard_Transient  T) {
    return new Adaptor3d_HCurve ( OCCwrapJavaJNI.Adaptor3d_HCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Adaptor3d_HCurve_TypeOf(), true );
  }

}
