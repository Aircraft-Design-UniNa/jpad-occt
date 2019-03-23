package opencascade;

/**
 *  Describes the common behavior of surfaces in 3D
 *  space. The Geom package provides many
 *  implementations of concrete derived surfaces, such as
 *  planes, cylinders, cones, spheres and tori, surfaces of
 *  linear extrusion, surfaces of revolution, Bezier and
 *  BSpline surfaces, and so on.
 *  The key characteristic of these surfaces is that they
 *  are parameterized. Geom_Surface demonstrates:
 *  - how to work with the parametric equation of a
 *  surface to compute the point of parameters (u,
 *  v), and, at this point, the 1st, 2nd ... Nth derivative,
 *  - how to find global information about a surface in
 *  each parametric direction (for example, level of
 *  continuity, whether the surface is closed, its
 *  periodicity, the bounds of the parameters and so on), and
 *  - how the parameters change when geometric
 *  transformations are applied to the surface, or the
 *  orientation is modified.
 *  Note that all surfaces must have a geometric
 *  continuity, and any surface is at least "C0". Generally,
 *  continuity is checked at construction time or when the
 *  curve is edited. Where this is not the case, the
 *  documentation makes this explicit.
 *  Warning
 *  The Geom package does not prevent the construction of
 *  surfaces with null areas, or surfaces which self-intersect.
 */
public class Geom_Surface extends Geom_Geometry {
  Geom_Surface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Reverses the U direction of parametrization of <me>.
   *  The bounds of the surface are not modified.
   */
  public void UReverse() {
    OCCwrapJavaJNI.Geom_Surface_UReverse(swigCPtr, this);
  }

  public  Geom_Surface  UReversed() {
    return new Geom_Surface ( OCCwrapJavaJNI.Geom_Surface_UReversed(swigCPtr, this), true );
  }

  /**
   *  Returns the  parameter on the  Ureversed surface for
   *  the point of parameter U on <me>.
   * 
   *  me->UReversed()->Value(me->UReversedParameter(U),V)
   * 
   *  is the same point as
   * 
   *  me->Value(U,V)
   */
  public double UReversedParameter(double U) {
    return OCCwrapJavaJNI.Geom_Surface_UReversedParameter(swigCPtr, this, U);
  }

  /**
   *  Reverses the V direction of parametrization of <me>.
   *  The bounds of the surface are not modified.
   */
  public void VReverse() {
    OCCwrapJavaJNI.Geom_Surface_VReverse(swigCPtr, this);
  }

  public  Geom_Surface  VReversed() {
    return new Geom_Surface ( OCCwrapJavaJNI.Geom_Surface_VReversed(swigCPtr, this), true );
  }

  /**
   *  Returns the  parameter on the  Vreversed surface for
   *  the point of parameter V on <me>.
   * 
   *  me->VReversed()->Value(U,me->VReversedParameter(V))
   * 
   *  is the same point as
   * 
   *  me->Value(U,V)
   */
  public double VReversedParameter(double V) {
    return OCCwrapJavaJNI.Geom_Surface_VReversedParameter(swigCPtr, this, V);
  }

  /**
   *  Computes the  parameters on the  transformed  surface for
   *  the transform of the point of parameters U,V on <me>.
   * 
   *  me->Transformed(T)->Value(U',V')
   * 
   *  is the same point as
   * 
   *  me->Value(U,V).Transformed(T)
   * 
   *  Where U',V' are the new values of U,V after calling
   * 
   *  me->TranformParameters(U,V,T)
   * 
   *  This methods does not change <U> and <V>
   * 
   *  It  can be redefined.  For  example on  the Plane,
   *  Cylinder, Cone, Revolved and Extruded surfaces.
   */
  public void TransformParameters(double[] U, double[] V,  gp_Trsf  T) {
    OCCwrapJavaJNI.Geom_Surface_TransformParameters(swigCPtr, this, U, V, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Returns a 2d transformation  used to find the  new
   *  parameters of a point on the transformed surface.
   * 
   *  me->Transformed(T)->Value(U',V')
   * 
   *  is the same point as
   * 
   *  me->Value(U,V).Transformed(T)
   * 
   *  Where U',V' are  obtained by transforming U,V with
   *  th 2d transformation returned by
   * 
   *  me->ParametricTransformation(T)
   * 
   *  This methods returns an identity transformation
   * 
   *  It  can be redefined.  For  example on  the Plane,
   *  Cylinder, Cone, Revolved and Extruded surfaces.
   */
  public gp_GTrsf2d ParametricTransformation( gp_Trsf  T) {
    return new gp_GTrsf2d(OCCwrapJavaJNI.Geom_Surface_ParametricTransformation(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

  /**
   *  Returns the parametric bounds U1, U2, V1 and V2 of this surface.
   *  If the surface is infinite, this function can return a value
   *  equal to Precision::Infinite: instead of Standard_Real::LastReal.
   */
  public void Bounds(double[] U1, double[] U2, double[] V1, double[] V2) {
    OCCwrapJavaJNI.Geom_Surface_Bounds(swigCPtr, this, U1, U2, V1, V2);
  }

  /**
   *  Checks whether this surface is closed in the u
   *  parametric direction.
   *  Returns true if, in the u parametric direction: taking
   *  uFirst and uLast as the parametric bounds in
   *  the u parametric direction, for each parameter v, the
   *  distance between the points P(uFirst, v) and
   *  P(uLast, v) is less than or equal to gp::Resolution().
   */
  public long IsUClosed() {
    return OCCwrapJavaJNI.Geom_Surface_IsUClosed(swigCPtr, this);
  }

  /**
   *  Checks whether this surface is closed in the u
   *  parametric direction.
   *  Returns true if, in the v parametric
   *  direction: taking vFirst and vLast as the
   *  parametric bounds in the v parametric direction, for
   *  each parameter u, the distance between the points
   *  P(u, vFirst) and P(u, vLast) is less than
   *  or equal to gp::Resolution().
   */
  public long IsVClosed() {
    return OCCwrapJavaJNI.Geom_Surface_IsVClosed(swigCPtr, this);
  }

  /**
   *  Checks if this surface is periodic in the u
   *  parametric direction. Returns true if:
   *  - this surface is closed in the u parametric direction, and
   *  - there is a constant T such that the distance
   *  between the points P (u, v) and P (u + T,
   *  v) (or the points P (u, v) and P (u, v +
   *  T)) is less than or equal to gp::Resolution().
   *  Note: T is the parametric period in the u parametric direction.
   */
  public long IsUPeriodic() {
    return OCCwrapJavaJNI.Geom_Surface_IsUPeriodic(swigCPtr, this);
  }

  /**
   *  Returns the period of this surface in the u
   *  parametric direction.
   *  raises if the surface is not uperiodic.
   */
  public double UPeriod() {
    return OCCwrapJavaJNI.Geom_Surface_UPeriod(swigCPtr, this);
  }

  /**
   *  Checks if this surface is periodic in the v
   *  parametric direction. Returns true if:
   *  - this surface is closed in the v parametric direction, and
   *  - there is a constant T such that the distance
   *  between the points P (u, v) and P (u + T,
   *  v) (or the points P (u, v) and P (u, v +
   *  T)) is less than or equal to gp::Resolution().
   *  Note: T is the parametric period in the v parametric direction.
   */
  public long IsVPeriodic() {
    return OCCwrapJavaJNI.Geom_Surface_IsVPeriodic(swigCPtr, this);
  }

  /**
   *  Returns the period of this surface in the v parametric direction.
   *  raises if the surface is not vperiodic.
   */
  public double VPeriod() {
    return OCCwrapJavaJNI.Geom_Surface_VPeriod(swigCPtr, this);
  }

  public  Geom_Curve  UIso(double U) {
    return new Geom_Curve ( OCCwrapJavaJNI.Geom_Surface_UIso(swigCPtr, this, U), true );
  }

  public  Geom_Curve  VIso(double V) {
    return new Geom_Curve ( OCCwrapJavaJNI.Geom_Surface_VIso(swigCPtr, this, V), true );
  }

  /**
   *  Returns the Global Continuity of the surface in direction U and V :
   *  C0 : only geometric continuity,
   *  C1 : continuity of the first derivative all along the surface,
   *  C2 : continuity of the second derivative all along the surface,
   *  C3 : continuity of the third derivative all along the surface,
   *  G1 : tangency continuity all along the surface,
   *  G2 : curvature continuity all along the surface,
   *  CN : the order of continuity is infinite.
   *  Example :
   *  If the surface is C1 in the V parametric direction and C2
   *  in the U parametric direction Shape = C1.
   */
  public GeomAbs_Shape Continuity() {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.Geom_Surface_Continuity(swigCPtr, this));
  }

  /**
   *  Returns the order of continuity of the surface in the
   *  U parametric direction.
   *  Raised if N < 0.
   */
  public long IsCNu(int N) {
    return OCCwrapJavaJNI.Geom_Surface_IsCNu(swigCPtr, this, N);
  }

  /**
   *  Returns the order of continuity of the surface in the
   *  V parametric direction.
   *  Raised if N < 0.
   */
  public long IsCNv(int N) {
    return OCCwrapJavaJNI.Geom_Surface_IsCNv(swigCPtr, this, N);
  }

  /**
   *  Computes the point of parameter U,V on the surface.
   * 
   *  Raised only for an "OffsetSurface" if it is not possible to
   *  compute the current point.
   */
  public void D0(double U, double V, gp_Pnt P) {
    OCCwrapJavaJNI.Geom_Surface_D0(swigCPtr, this, U, V, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Computes the point P and the first derivatives in the
   *  directions U and V at this point.
   *  Raised if the continuity of the surface is not C1.
   */
  public void D1(double U, double V, gp_Pnt P, gp_Vec D1U, gp_Vec D1V) {
    OCCwrapJavaJNI.Geom_Surface_D1(swigCPtr, this, U, V, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(D1U), D1U, gp_Vec.getCPtr(D1V), D1V);
  }

  /**
   *  Computes the point P, the first and the second derivatives in
   *  the directions U and V at this point.
   *  Raised if the continuity of the surface is not C2.
   */
  public void D2(double U, double V, gp_Pnt P, gp_Vec D1U, gp_Vec D1V, gp_Vec D2U, gp_Vec D2V, gp_Vec D2UV) {
    OCCwrapJavaJNI.Geom_Surface_D2(swigCPtr, this, U, V, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(D1U), D1U, gp_Vec.getCPtr(D1V), D1V, gp_Vec.getCPtr(D2U), D2U, gp_Vec.getCPtr(D2V), D2V, gp_Vec.getCPtr(D2UV), D2UV);
  }

  /**
   *  Computes the point P, the first,the second and the third
   *  derivatives in the directions U and V at this point.
   *  Raised if the continuity of the surface is not C2.
   */
  public void D3(double U, double V, gp_Pnt P, gp_Vec D1U, gp_Vec D1V, gp_Vec D2U, gp_Vec D2V, gp_Vec D2UV, gp_Vec D3U, gp_Vec D3V, gp_Vec D3UUV, gp_Vec D3UVV) {
    OCCwrapJavaJNI.Geom_Surface_D3(swigCPtr, this, U, V, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(D1U), D1U, gp_Vec.getCPtr(D1V), D1V, gp_Vec.getCPtr(D2U), D2U, gp_Vec.getCPtr(D2V), D2V, gp_Vec.getCPtr(D2UV), D2UV, gp_Vec.getCPtr(D3U), D3U, gp_Vec.getCPtr(D3V), D3V, gp_Vec.getCPtr(D3UUV), D3UUV, gp_Vec.getCPtr(D3UVV), D3UVV);
  }

  /**
   *  ---Purpose ;
   *  Computes the derivative of order Nu in the direction U and Nv
   *  in the direction V at the point P(U, V).
   * 
   *  Raised if the continuity of the surface is not CNu in the U
   *  direction or not CNv in the V direction.
   *  Raised if Nu + Nv < 1 or Nu < 0 or Nv < 0.
   */
  public gp_Vec DN(double U, double V, int Nu, int Nv) {
    return new gp_Vec(OCCwrapJavaJNI.Geom_Surface_DN(swigCPtr, this, U, V, Nu, Nv), true);
  }

  /**
   *  Computes the point of parameter U on the surface.
   * 
   *  It is implemented with D0
   * 
   *  Raised only for an "OffsetSurface" if it is not possible to
   *  compute the current point.
   */
  public gp_Pnt Value(double U, double V) {
    return new gp_Pnt(OCCwrapJavaJNI.Geom_Surface_Value(swigCPtr, this, U, V), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_Surface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Surface_get_type_descriptor(), true );
  }

  public static  Geom_Surface  DownCast( Standard_Transient  T) {
    return new Geom_Surface ( OCCwrapJavaJNI.Geom_Surface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Surface_TypeOf(), true );
  }

}
