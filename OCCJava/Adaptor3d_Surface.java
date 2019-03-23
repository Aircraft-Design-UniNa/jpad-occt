package opencascade;

/**
 *  Root class for surfaces on which geometric algorithms work.
 *  An adapted surface is an interface between the
 *  services provided by a surface and those required of
 *  the surface by algorithms which use it.
 *  A derived concrete class is provided:
 *  GeomAdaptor_Surface for a surface from the Geom package.
 *  The  Surface class describes  the standard behaviour
 *  of a surface for generic algorithms.
 * 
 *  The Surface can  be decomposed in intervals of any
 *  continuity    in  U    and    V using  the  method
 *  NbIntervals.  A current interval can be set.  Most
 *  of the methods apply to the current interval.
 *  Warning: All the methods are virtual and implemented with a
 *  raise to allow to redefined only the methods realy
 *  used.
 * 
 *  Polynomial coefficients of BSpline surfaces used for their evaluation are
 *  cached for better performance. Therefore these evaluations are not
 *  thread-safe and parallel evaluations need to be prevented.
 */
public class Adaptor3d_Surface {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Adaptor3d_Surface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Adaptor3d_Surface(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Adaptor3d_Surface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Adaptor3d_Surface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public double FirstUParameter() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_FirstUParameter(swigCPtr, this);
  }

  public double LastUParameter() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_LastUParameter(swigCPtr, this);
  }

  public double FirstVParameter() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_FirstVParameter(swigCPtr, this);
  }

  public double LastVParameter() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_LastVParameter(swigCPtr, this);
  }

  public GeomAbs_Shape UContinuity() {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.Adaptor3d_Surface_UContinuity(swigCPtr, this));
  }

  public GeomAbs_Shape VContinuity() {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.Adaptor3d_Surface_VContinuity(swigCPtr, this));
  }

  /**
   *  Returns the number of U intervals for  continuity
   *  <S>. May be one if UContinuity(me) >= <S>
   */
  public int NbUIntervals(GeomAbs_Shape S) {
    return OCCwrapJavaJNI.Adaptor3d_Surface_NbUIntervals(swigCPtr, this, S.swigValue());
  }

  /**
   *  Returns the number of V intervals for  continuity
   *  <S>. May be one if VContinuity(me) >= <S>
   */
  public int NbVIntervals(GeomAbs_Shape S) {
    return OCCwrapJavaJNI.Adaptor3d_Surface_NbVIntervals(swigCPtr, this, S.swigValue());
  }

  /**
   *  Returns the  intervals with the requested continuity
   *  in the U direction.
   */
  public void UIntervals( TColStd_Array1OfReal  T, GeomAbs_Shape S) {
    OCCwrapJavaJNI.Adaptor3d_Surface_UIntervals(swigCPtr, this, TColStd_Array1OfReal.getCPtr(T), T, S.swigValue());
  }

  /**
   *  Returns the  intervals with the requested continuity
   *  in the V direction.
   */
  public void VIntervals( TColStd_Array1OfReal  T, GeomAbs_Shape S) {
    OCCwrapJavaJNI.Adaptor3d_Surface_VIntervals(swigCPtr, this, TColStd_Array1OfReal.getCPtr(T), T, S.swigValue());
  }

  public  Adaptor3d_HSurface  UTrim(double First, double Last, double Tol) {
    return new Adaptor3d_HSurface ( OCCwrapJavaJNI.Adaptor3d_Surface_UTrim(swigCPtr, this, First, Last, Tol), true );
  }

  public  Adaptor3d_HSurface  VTrim(double First, double Last, double Tol) {
    return new Adaptor3d_HSurface ( OCCwrapJavaJNI.Adaptor3d_Surface_VTrim(swigCPtr, this, First, Last, Tol), true );
  }

  public long IsUClosed() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_IsUClosed(swigCPtr, this);
  }

  public long IsVClosed() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_IsVClosed(swigCPtr, this);
  }

  public long IsUPeriodic() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_IsUPeriodic(swigCPtr, this);
  }

  public double UPeriod() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_UPeriod(swigCPtr, this);
  }

  public long IsVPeriodic() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_IsVPeriodic(swigCPtr, this);
  }

  public double VPeriod() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_VPeriod(swigCPtr, this);
  }

  /**
   *  Computes the point of parameters U,V on the surface.
   */
  public gp_Pnt Value(double U, double V) {
    return new gp_Pnt(OCCwrapJavaJNI.Adaptor3d_Surface_Value(swigCPtr, this, U, V), true);
  }

  /**
   *  Computes the point of parameters U,V on the surface.
   */
  public void D0(double U, double V, gp_Pnt P) {
    OCCwrapJavaJNI.Adaptor3d_Surface_D0(swigCPtr, this, U, V, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Computes the point  and the first derivatives on
   *  the surface.
   *  Raised   if  the continuity  of   the  current
   *  intervals is not C1.
   */
  public void D1(double U, double V, gp_Pnt P, gp_Vec D1U, gp_Vec D1V) {
    OCCwrapJavaJNI.Adaptor3d_Surface_D1(swigCPtr, this, U, V, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(D1U), D1U, gp_Vec.getCPtr(D1V), D1V);
  }

  /**
   *  Computes   the point,  the  first  and  second
   *  derivatives on the surface.
   *  Raised  if   the   continuity   of the current
   *  intervals is not C2.
   */
  public void D2(double U, double V, gp_Pnt P, gp_Vec D1U, gp_Vec D1V, gp_Vec D2U, gp_Vec D2V, gp_Vec D2UV) {
    OCCwrapJavaJNI.Adaptor3d_Surface_D2(swigCPtr, this, U, V, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(D1U), D1U, gp_Vec.getCPtr(D1V), D1V, gp_Vec.getCPtr(D2U), D2U, gp_Vec.getCPtr(D2V), D2V, gp_Vec.getCPtr(D2UV), D2UV);
  }

  /**
   *  Computes the point,  the first, second and third
   *  derivatives on the surface.
   *  Raised  if   the   continuity   of the current
   *  intervals is not C3.
   */
  public void D3(double U, double V, gp_Pnt P, gp_Vec D1U, gp_Vec D1V, gp_Vec D2U, gp_Vec D2V, gp_Vec D2UV, gp_Vec D3U, gp_Vec D3V, gp_Vec D3UUV, gp_Vec D3UVV) {
    OCCwrapJavaJNI.Adaptor3d_Surface_D3(swigCPtr, this, U, V, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(D1U), D1U, gp_Vec.getCPtr(D1V), D1V, gp_Vec.getCPtr(D2U), D2U, gp_Vec.getCPtr(D2V), D2V, gp_Vec.getCPtr(D2UV), D2UV, gp_Vec.getCPtr(D3U), D3U, gp_Vec.getCPtr(D3V), D3V, gp_Vec.getCPtr(D3UUV), D3UUV, gp_Vec.getCPtr(D3UVV), D3UVV);
  }

  /**
   *  Computes the derivative of order Nu in the direction U and Nv
   *  in the direction V at the point P(U, V).
   *  Raised if the current U  interval is not not CNu
   *  and the current V interval is not CNv.
   *  Raised if Nu + Nv < 1 or Nu < 0 or Nv < 0.
   */
  public gp_Vec DN(double U, double V, int Nu, int Nv) {
    return new gp_Vec(OCCwrapJavaJNI.Adaptor3d_Surface_DN(swigCPtr, this, U, V, Nu, Nv), true);
  }

  /**
   *  Returns the parametric U  resolution corresponding
   *  to the real space resolution <R3d>.
   */
  public double UResolution(double R3d) {
    return OCCwrapJavaJNI.Adaptor3d_Surface_UResolution(swigCPtr, this, R3d);
  }

  /**
   *  Returns the parametric V  resolution corresponding
   *  to the real space resolution <R3d>.
   */
  public double VResolution(double R3d) {
    return OCCwrapJavaJNI.Adaptor3d_Surface_VResolution(swigCPtr, this, R3d);
  }

  public GeomAbs_SurfaceType GetSurfaceType() {
    return GeomAbs_SurfaceType.swigToEnum(OCCwrapJavaJNI.Adaptor3d_Surface_GetSurfaceType(swigCPtr, this));
  }

  public gp_Pln Plane() {
    return new gp_Pln(OCCwrapJavaJNI.Adaptor3d_Surface_Plane(swigCPtr, this), true);
  }

  public gp_Cylinder Cylinder() {
    return new gp_Cylinder(OCCwrapJavaJNI.Adaptor3d_Surface_Cylinder(swigCPtr, this), true);
  }

  public gp_Cone Cone() {
    return new gp_Cone(OCCwrapJavaJNI.Adaptor3d_Surface_Cone(swigCPtr, this), true);
  }

  public gp_Sphere Sphere() {
    return new gp_Sphere(OCCwrapJavaJNI.Adaptor3d_Surface_Sphere(swigCPtr, this), true);
  }

  public gp_Torus Torus() {
    return new gp_Torus(OCCwrapJavaJNI.Adaptor3d_Surface_Torus(swigCPtr, this), true);
  }

  public int UDegree() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_UDegree(swigCPtr, this);
  }

  public int NbUPoles() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_NbUPoles(swigCPtr, this);
  }

  public int VDegree() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_VDegree(swigCPtr, this);
  }

  public int NbVPoles() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_NbVPoles(swigCPtr, this);
  }

  public int NbUKnots() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_NbUKnots(swigCPtr, this);
  }

  public int NbVKnots() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_NbVKnots(swigCPtr, this);
  }

  public long IsURational() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_IsURational(swigCPtr, this);
  }

  public long IsVRational() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_IsVRational(swigCPtr, this);
  }

  public  Geom_BezierSurface  Bezier() {
    return new Geom_BezierSurface ( OCCwrapJavaJNI.Adaptor3d_Surface_Bezier(swigCPtr, this), true );
  }

  public  Geom_BSplineSurface  BSpline() {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.Adaptor3d_Surface_BSpline(swigCPtr, this), true );
  }

  public gp_Ax1 AxeOfRevolution() {
    return new gp_Ax1(OCCwrapJavaJNI.Adaptor3d_Surface_AxeOfRevolution(swigCPtr, this), true);
  }

  public gp_Dir Direction() {
    return new gp_Dir(OCCwrapJavaJNI.Adaptor3d_Surface_Direction(swigCPtr, this), true);
  }

  public  Adaptor3d_HCurve  BasisCurve() {
    return new Adaptor3d_HCurve ( OCCwrapJavaJNI.Adaptor3d_Surface_BasisCurve(swigCPtr, this), true );
  }

  public  Adaptor3d_HSurface  BasisSurface() {
    return new Adaptor3d_HSurface ( OCCwrapJavaJNI.Adaptor3d_Surface_BasisSurface(swigCPtr, this), true );
  }

  public double OffsetValue() {
    return OCCwrapJavaJNI.Adaptor3d_Surface_OffsetValue(swigCPtr, this);
  }

  public Adaptor3d_Surface() {
    this(OCCwrapJavaJNI.new_Adaptor3d_Surface(), true);
  }

}
