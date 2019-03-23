package opencascade;

/**
 *  Root class for surfaces manipulated by handles, on
 *  which geometric algorithms work.
 *  An adapted surface is an interface between the
 *  services provided by a surface and those required of
 *  the surface by algorithms which use it.
 *  A derived concrete class is provided:
 *  GeomAdaptor_HSurface for a surface from the Geom package.
 */
public class Adaptor3d_HSurface extends Standard_Transient {
  Adaptor3d_HSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a reference to the Surface inside the HSurface.
   */
  public  Adaptor3d_Surface  Surface() {
    Adaptor3d_Surface ret = new Adaptor3d_Surface(OCCwrapJavaJNI.Adaptor3d_HSurface_Surface(swigCPtr, this), false, this);
    return ret;
  }

  public double FirstUParameter() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_FirstUParameter(swigCPtr, this);
  }

  public double LastUParameter() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_LastUParameter(swigCPtr, this);
  }

  public double FirstVParameter() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_FirstVParameter(swigCPtr, this);
  }

  public double LastVParameter() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_LastVParameter(swigCPtr, this);
  }

  public GeomAbs_Shape UContinuity() {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.Adaptor3d_HSurface_UContinuity(swigCPtr, this));
  }

  public GeomAbs_Shape VContinuity() {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.Adaptor3d_HSurface_VContinuity(swigCPtr, this));
  }

  public int NbUIntervals(GeomAbs_Shape S) {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_NbUIntervals(swigCPtr, this, S.swigValue());
  }

  public int NbVIntervals(GeomAbs_Shape S) {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_NbVIntervals(swigCPtr, this, S.swigValue());
  }

  public void UIntervals( TColStd_Array1OfReal  T, GeomAbs_Shape S) {
    OCCwrapJavaJNI.Adaptor3d_HSurface_UIntervals(swigCPtr, this, TColStd_Array1OfReal.getCPtr(T), T, S.swigValue());
  }

  public void VIntervals( TColStd_Array1OfReal  T, GeomAbs_Shape S) {
    OCCwrapJavaJNI.Adaptor3d_HSurface_VIntervals(swigCPtr, this, TColStd_Array1OfReal.getCPtr(T), T, S.swigValue());
  }

  public  Adaptor3d_HSurface  UTrim(double First, double Last, double Tol) {
    return new Adaptor3d_HSurface ( OCCwrapJavaJNI.Adaptor3d_HSurface_UTrim(swigCPtr, this, First, Last, Tol), true );
  }

  public  Adaptor3d_HSurface  VTrim(double First, double Last, double Tol) {
    return new Adaptor3d_HSurface ( OCCwrapJavaJNI.Adaptor3d_HSurface_VTrim(swigCPtr, this, First, Last, Tol), true );
  }

  public long IsUClosed() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_IsUClosed(swigCPtr, this);
  }

  public long IsVClosed() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_IsVClosed(swigCPtr, this);
  }

  public long IsUPeriodic() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_IsUPeriodic(swigCPtr, this);
  }

  public double UPeriod() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_UPeriod(swigCPtr, this);
  }

  public long IsVPeriodic() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_IsVPeriodic(swigCPtr, this);
  }

  public double VPeriod() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_VPeriod(swigCPtr, this);
  }

  public gp_Pnt Value(double U, double V) {
    return new gp_Pnt(OCCwrapJavaJNI.Adaptor3d_HSurface_Value(swigCPtr, this, U, V), true);
  }

  public void D0(double U, double V, gp_Pnt P) {
    OCCwrapJavaJNI.Adaptor3d_HSurface_D0(swigCPtr, this, U, V, gp_Pnt.getCPtr(P), P);
  }

  public void D1(double U, double V, gp_Pnt P, gp_Vec D1U, gp_Vec D1V) {
    OCCwrapJavaJNI.Adaptor3d_HSurface_D1(swigCPtr, this, U, V, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(D1U), D1U, gp_Vec.getCPtr(D1V), D1V);
  }

  public void D2(double U, double V, gp_Pnt P, gp_Vec D1U, gp_Vec D1V, gp_Vec D2U, gp_Vec D2V, gp_Vec D2UV) {
    OCCwrapJavaJNI.Adaptor3d_HSurface_D2(swigCPtr, this, U, V, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(D1U), D1U, gp_Vec.getCPtr(D1V), D1V, gp_Vec.getCPtr(D2U), D2U, gp_Vec.getCPtr(D2V), D2V, gp_Vec.getCPtr(D2UV), D2UV);
  }

  public void D3(double U, double V, gp_Pnt P, gp_Vec D1U, gp_Vec D1V, gp_Vec D2U, gp_Vec D2V, gp_Vec D2UV, gp_Vec D3U, gp_Vec D3V, gp_Vec D3UUV, gp_Vec D3UVV) {
    OCCwrapJavaJNI.Adaptor3d_HSurface_D3(swigCPtr, this, U, V, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(D1U), D1U, gp_Vec.getCPtr(D1V), D1V, gp_Vec.getCPtr(D2U), D2U, gp_Vec.getCPtr(D2V), D2V, gp_Vec.getCPtr(D2UV), D2UV, gp_Vec.getCPtr(D3U), D3U, gp_Vec.getCPtr(D3V), D3V, gp_Vec.getCPtr(D3UUV), D3UUV, gp_Vec.getCPtr(D3UVV), D3UVV);
  }

  public gp_Vec DN(double U, double V, int Nu, int Nv) {
    return new gp_Vec(OCCwrapJavaJNI.Adaptor3d_HSurface_DN(swigCPtr, this, U, V, Nu, Nv), true);
  }

  public double UResolution(double R3d) {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_UResolution(swigCPtr, this, R3d);
  }

  public double VResolution(double R3d) {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_VResolution(swigCPtr, this, R3d);
  }

  public GeomAbs_SurfaceType GetSurfaceType() {
    return GeomAbs_SurfaceType.swigToEnum(OCCwrapJavaJNI.Adaptor3d_HSurface_GetSurfaceType(swigCPtr, this));
  }

  public gp_Pln Plane() {
    return new gp_Pln(OCCwrapJavaJNI.Adaptor3d_HSurface_Plane(swigCPtr, this), true);
  }

  public gp_Cylinder Cylinder() {
    return new gp_Cylinder(OCCwrapJavaJNI.Adaptor3d_HSurface_Cylinder(swigCPtr, this), true);
  }

  public gp_Cone Cone() {
    return new gp_Cone(OCCwrapJavaJNI.Adaptor3d_HSurface_Cone(swigCPtr, this), true);
  }

  public gp_Sphere Sphere() {
    return new gp_Sphere(OCCwrapJavaJNI.Adaptor3d_HSurface_Sphere(swigCPtr, this), true);
  }

  public gp_Torus Torus() {
    return new gp_Torus(OCCwrapJavaJNI.Adaptor3d_HSurface_Torus(swigCPtr, this), true);
  }

  public int UDegree() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_UDegree(swigCPtr, this);
  }

  public int NbUPoles() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_NbUPoles(swigCPtr, this);
  }

  public int VDegree() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_VDegree(swigCPtr, this);
  }

  public int NbVPoles() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_NbVPoles(swigCPtr, this);
  }

  public int NbUKnots() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_NbUKnots(swigCPtr, this);
  }

  public int NbVKnots() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_NbVKnots(swigCPtr, this);
  }

  public long IsURational() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_IsURational(swigCPtr, this);
  }

  public long IsVRational() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_IsVRational(swigCPtr, this);
  }

  public  Geom_BezierSurface  Bezier() {
    return new Geom_BezierSurface ( OCCwrapJavaJNI.Adaptor3d_HSurface_Bezier(swigCPtr, this), true );
  }

  public  Geom_BSplineSurface  BSpline() {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.Adaptor3d_HSurface_BSpline(swigCPtr, this), true );
  }

  public gp_Ax1 AxeOfRevolution() {
    return new gp_Ax1(OCCwrapJavaJNI.Adaptor3d_HSurface_AxeOfRevolution(swigCPtr, this), true);
  }

  public gp_Dir Direction() {
    return new gp_Dir(OCCwrapJavaJNI.Adaptor3d_HSurface_Direction(swigCPtr, this), true);
  }

  public  Adaptor3d_HCurve  BasisCurve() {
    return new Adaptor3d_HCurve ( OCCwrapJavaJNI.Adaptor3d_HSurface_BasisCurve(swigCPtr, this), true );
  }

  public  Adaptor3d_HSurface  BasisSurface() {
    return new Adaptor3d_HSurface ( OCCwrapJavaJNI.Adaptor3d_HSurface_BasisSurface(swigCPtr, this), true );
  }

  public double OffsetValue() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_OffsetValue(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Adaptor3d_HSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Adaptor3d_HSurface_get_type_descriptor(), true );
  }

  public static  Adaptor3d_HSurface  DownCast( Standard_Transient  T) {
    return new Adaptor3d_HSurface ( OCCwrapJavaJNI.Adaptor3d_HSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Adaptor3d_HSurface_TypeOf(), true );
  }

}
