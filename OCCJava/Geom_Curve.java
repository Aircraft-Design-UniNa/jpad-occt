package opencascade;

/**
 *  The abstract class Curve describes the common
 *  behavior of curves in 3D space. The Geom package
 *  provides numerous concrete classes of derived
 *  curves, including lines, circles, conics, Bezier or
 *  BSpline curves, etc.
 *  The main characteristic of these curves is that they
 *  are parameterized. The Geom_Curve class shows:
 *  - how to work with the parametric equation of a curve
 *  in order to calculate the point of parameter u,
 *  together with the vector tangent and the derivative
 *  vectors of order 2, 3,..., N at this point;
 *  - how to obtain general information about the curve
 *  (for example, level of continuity, closed
 *  characteristics, periodicity, bounds of the parameter field);
 *  - how the parameter changes when a geometric
 *  transformation is applied to the curve or when the
 *  orientation of the curve is inverted.
 *  All curves must have a geometric continuity: a curve is
 *  at least "C0". Generally, this property is checked at
 *  the time of construction or when the curve is edited.
 *  Where this is not the case, the documentation states so explicitly.
 *  Warning
 *  The Geom package does not prevent the
 *  construction of curves with null length or curves which
 *  self-intersect.
 */
public class Geom_Curve extends Geom_Geometry {
  Geom_Curve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Changes the direction of parametrization of <me>.
   *  The "FirstParameter" and the "LastParameter" are not changed
   *  but the orientation  of the curve is modified. If the curve
   *  is bounded the StartPoint of the initial curve becomes the
   *  EndPoint of the reversed curve  and the EndPoint of the initial
   *  curve becomes the StartPoint of the reversed curve.
   */
  public void Reverse() {
    OCCwrapJavaJNI.Geom_Curve_Reverse(swigCPtr, this);
  }

  /**
   *  Returns the  parameter on the  reversed  curve for
   *  the point of parameter U on <me>.
   * 
   *  me->Reversed()->Value(me->ReversedParameter(U))
   * 
   *  is the same point as
   * 
   *  me->Value(U)
   */
  public double ReversedParameter(double U) {
    return OCCwrapJavaJNI.Geom_Curve_ReversedParameter(swigCPtr, this, U);
  }

  /**
   *  Returns the  parameter on the  transformed  curve for
   *  the transform of the point of parameter U on <me>.
   * 
   *  me->Transformed(T)->Value(me->TransformedParameter(U,T))
   * 
   *  is the same point as
   * 
   *  me->Value(U).Transformed(T)
   * 
   *  This methods returns <U>
   * 
   *  It can be redefined. For example on the Line.
   */
  public double TransformedParameter(double U,  gp_Trsf  T) {
    return OCCwrapJavaJNI.Geom_Curve_TransformedParameter(swigCPtr, this, U, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Returns a  coefficient to compute the parameter on
   *  the transformed  curve  for  the transform  of the
   *  point on <me>.
   * 
   *  Transformed(T)->Value(U * ParametricTransformation(T))
   * 
   *  is the same point as
   * 
   *  Value(U).Transformed(T)
   * 
   *  This methods returns 1.
   * 
   *  It can be redefined. For example on the Line.
   */
  public double ParametricTransformation( gp_Trsf  T) {
    return OCCwrapJavaJNI.Geom_Curve_ParametricTransformation(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  public  Geom_Curve  Reversed() {
    return new Geom_Curve ( OCCwrapJavaJNI.Geom_Curve_Reversed(swigCPtr, this), true );
  }

  /**
   *  Returns the value of the first parameter.
   *  Warnings :
   *  It can be RealFirst from package Standard
   *  if the curve is infinite
   */
  public double FirstParameter() {
    return OCCwrapJavaJNI.Geom_Curve_FirstParameter(swigCPtr, this);
  }

  /**
   *  Returns the value of the last parameter.
   *  Warnings :
   *  It can be RealLast from package Standard
   *  if the curve is infinite
   */
  public double LastParameter() {
    return OCCwrapJavaJNI.Geom_Curve_LastParameter(swigCPtr, this);
  }

  /**
   *  Returns true if the curve is closed.
   *  Some curves such as circle are always closed, others such as line
   *  are never closed (by definition).
   *  Some Curves such as OffsetCurve can be closed or not. These curves
   *  are considered as closed if the distance between the first point
   *  and the last point of the curve is lower or equal to the Resolution
   *  from package gp wich is a fixed criterion independant of the
   *  application.
   */
  public long IsClosed() {
    return OCCwrapJavaJNI.Geom_Curve_IsClosed(swigCPtr, this);
  }

  /**
   *  Is the parametrization of the curve periodic ?
   *  It is possible only if the curve is closed and if the
   *  following relation is satisfied :
   *  for each parametric value U the distance between the point
   *  P(u) and the point P (u + T) is lower or equal to Resolution
   *  from package gp, T is the period and must be a constant.
   *  There are three possibilities :
   *  . the curve is never periodic by definition (SegmentLine)
   *  . the curve is always periodic by definition (Circle)
   *  . the curve can be defined as periodic (BSpline). In this case
   *  a function SetPeriodic allows you to give the shape of the
   *  curve.  The general rule for this case is : if a curve can be
   *  periodic or not the default periodicity set is non periodic
   *  and you have to turn (explicitly) the curve into a periodic
   *  curve  if you want the curve to be periodic.
   */
  public long IsPeriodic() {
    return OCCwrapJavaJNI.Geom_Curve_IsPeriodic(swigCPtr, this);
  }

  /**
   *  Returns the period of this curve.
   *  Exceptions Standard_NoSuchObject if this curve is not periodic.
   */
  public double Period() {
    return OCCwrapJavaJNI.Geom_Curve_Period(swigCPtr, this);
  }

  /**
   *  It is the global continuity of the curve
   *  C0 : only geometric continuity,
   *  C1 : continuity of the first derivative all along the Curve,
   *  C2 : continuity of the second derivative all along the Curve,
   *  C3 : continuity of the third derivative all along the Curve,
   *  G1 : tangency continuity all along the Curve,
   *  G2 : curvature continuity all along the Curve,
   *  CN : the order of continuity is infinite.
   */
  public GeomAbs_Shape Continuity() {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.Geom_Curve_Continuity(swigCPtr, this));
  }

  /**
   *  Returns true if the degree of continuity of this curve is at least N.
   *  Exceptions -  Standard_RangeError if N is less than 0.
   */
  public long IsCN(int N) {
    return OCCwrapJavaJNI.Geom_Curve_IsCN(swigCPtr, this, N);
  }

  /**
   *  Returns in P the point of parameter U.
   *  If the curve is periodic  then the returned point is P(U) with
   *  U = Ustart + (U - Uend)  where Ustart and Uend are the
   *  parametric bounds of the curve.
   * 
   *  Raised only for the "OffsetCurve" if it is not possible to
   *  compute the current point. For example when the first
   *  derivative on the basis curve and the offset direction
   *  are parallel.
   */
  public void D0(double U, gp_Pnt P) {
    OCCwrapJavaJNI.Geom_Curve_D0(swigCPtr, this, U, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Returns the point P of parameter U and the first derivative V1.
   *  Raised if the continuity of the curve is not C1.
   */
  public void D1(double U, gp_Pnt P, gp_Vec V1) {
    OCCwrapJavaJNI.Geom_Curve_D1(swigCPtr, this, U, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V1), V1);
  }

  /**
   *  Returns the point P of parameter U, the first and second
   *  derivatives V1 and V2.
   *  Raised if the continuity of the curve is not C2.
   */
  public void D2(double U, gp_Pnt P, gp_Vec V1, gp_Vec V2) {
    OCCwrapJavaJNI.Geom_Curve_D2(swigCPtr, this, U, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2);
  }

  /**
   *  Returns the point P of parameter U, the first, the second
   *  and the third derivative.
   *  Raised if the continuity of the curve is not C3.
   */
  public void D3(double U, gp_Pnt P, gp_Vec V1, gp_Vec V2, gp_Vec V3) {
    OCCwrapJavaJNI.Geom_Curve_D3(swigCPtr, this, U, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2, gp_Vec.getCPtr(V3), V3);
  }

  /**
   *  The returned vector gives the value of the derivative for the
   *  order of derivation N.
   *  Raised if the continuity of the curve is not CN.
   * 
   *  Raised if the   derivative  cannot  be  computed
   *  easily. e.g. rational bspline and n > 3.
   *  Raised if N < 1.
   */
  public gp_Vec DN(double U, int N) {
    return new gp_Vec(OCCwrapJavaJNI.Geom_Curve_DN(swigCPtr, this, U, N), true);
  }

  /**
   *  Computes the point of parameter U on <me>.
   *  If the curve is periodic  then the returned point is P(U) with
   *  U = Ustart + (U - Uend)  where Ustart and Uend are the
   *  parametric bounds of the curve.
   *  it is implemented with D0.
   * 
   *  Raised only for the "OffsetCurve" if it is not possible to
   *  compute the current point. For example when the first
   *  derivative on the basis curve and the offset direction are parallel.
   */
  public gp_Pnt Value(double U) {
    return new gp_Pnt(OCCwrapJavaJNI.Geom_Curve_Value(swigCPtr, this, U), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_Curve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Curve_get_type_descriptor(), true );
  }

  public static  Geom_Curve  DownCast( Standard_Transient  T) {
    return new Geom_Curve ( OCCwrapJavaJNI.Geom_Curve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Curve_TypeOf(), true );
  }

}
