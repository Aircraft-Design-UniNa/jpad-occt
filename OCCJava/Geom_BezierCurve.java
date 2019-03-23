package opencascade;

/**
 *  Describes a rational or non-rational Bezier curve
 *  - a non-rational Bezier curve is defined by a table of
 *  poles (also called control points),
 *  - a rational Bezier curve is defined by a table of
 *  poles with varying weights.
 *  These data are manipulated by two parallel arrays:
 *  - the poles table, which is an array of gp_Pnt points, and
 *  - the weights table, which is an array of reals.
 *  The bounds of these arrays are 1 and "the number of "poles" of the curve.
 *  The poles of the curve are "control points" used to deform the curve.
 *  The first pole is the start point of the curve, and the
 *  last pole is the end point of the curve. The segment
 *  that joins the first pole to the second pole is the
 *  tangent to the curve at its start point, and the
 *  segment that joins the last pole to the
 *  second-from-last pole is the tangent to the curve at its end point.
 *  It is more difficult to give a geometric signification to
 *  the weights but they are useful for providing the exact
 *  representations of arcs of a circle or ellipse.
 *  Moreover, if the weights of all poles are equal, the
 *  curve is polynomial; it is therefore a non-rational
 *  curve. The non-rational curve is a special and
 *  frequently used case. The weights are defined and
 *  used only in the case of a rational curve.
 *  The degree of a Bezier curve is equal to the number
 *  of poles, minus 1. It must be greater than or equal to
 *  1. However, the degree of a Geom_BezierCurve
 *  curve is limited to a value (25) which is defined and
 *  controlled by the system. This value is returned by the function MaxDegree.
 *  The parameter range for a Bezier curve is [ 0, 1 ].
 *  If the first and last control points of the Bezier curve
 *  are the same point then the curve is closed. For
 *  example, to create a closed Bezier curve with four
 *  control points, you have to give the set of control
 *  points P1, P2, P3 and P1.
 *  The continuity of a Bezier curve is infinite.
 *  It is not possible to build a Bezier curve with negative
 *  weights. We consider that a weight value is zero if it
 *  is less than or equal to gp::Resolution(). We
 *  also consider that two weight values W1 and W2 are equal if:
 *  |W2 - W1| <= gp::Resolution().
 *  Warning
 *  - When considering the continuity of a closed Bezier
 *  curve at the junction point, remember that a curve
 *  of this type is never periodic. This means that the
 *  derivatives for the parameter u = 0 have no
 *  reason to be the same as the derivatives for the
 *  parameter u = 1 even if the curve is closed.
 *  - The length of a Bezier curve can be null.
 */
public class Geom_BezierCurve extends Geom_BoundedCurve {
  Geom_BezierCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a non rational Bezier curve with a set of poles
   *  CurvePoles.  The weights are defaulted to all being 1.
   *  Raises ConstructionError if the number of poles is greater than MaxDegree + 1
   *  or lower than 2.
   */
  public Geom_BezierCurve( TColgp_Array1OfPnt  CurvePoles) {
    this(OCCwrapJavaJNI.new_Geom_BezierCurve__SWIG_0(TColgp_Array1OfPnt.getCPtr(CurvePoles), CurvePoles), true);
  }

  /**
   *  Creates a rational Bezier curve with the set of poles
   *  CurvePoles and the set of weights  PoleWeights .
   *  If all the weights are identical the curve is considered
   *  as non rational. Raises ConstructionError if
   *  the number of poles is greater than  MaxDegree + 1 or lower
   *  than 2 or CurvePoles and CurveWeights have not the same length
   *  or one weight value is lower or equal to Resolution from package gp.
   */
  public Geom_BezierCurve( TColgp_Array1OfPnt  CurvePoles,  TColStd_Array1OfReal  PoleWeights) {
    this(OCCwrapJavaJNI.new_Geom_BezierCurve__SWIG_1(TColgp_Array1OfPnt.getCPtr(CurvePoles), CurvePoles, TColStd_Array1OfReal.getCPtr(PoleWeights), PoleWeights), true);
  }

  /**
   *  Increases the degree of a bezier curve. Degree is the new
   *  degree of <me>. Raises ConstructionError
   *  if Degree is greater than MaxDegree or lower than 2
   *  or lower than the initial degree of <me>.
   */
  public void Increase(int Degree) {
    OCCwrapJavaJNI.Geom_BezierCurve_Increase(swigCPtr, this, Degree);
  }

  /**
   *  Inserts a pole P after the pole of range Index.
   *  If the curve <me> is rational the weight value for the new
   *  pole of range Index is 1.0.
   *  raised if Index is not in the range [1, NbPoles]
   * 
   *  raised if the resulting number of poles is greater than
   *  MaxDegree + 1.
   */
  public void InsertPoleAfter(int Index,  gp_Pnt  P) {
    OCCwrapJavaJNI.Geom_BezierCurve_InsertPoleAfter__SWIG_0(swigCPtr, this, Index, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Inserts a pole with its weight in the set of poles after the
   *  pole of range Index. If the curve was non rational it can
   *  become rational if all the weights are not identical.
   *  Raised if Index is not in the range [1, NbPoles]
   * 
   *  Raised if the resulting number of poles is greater than
   *  MaxDegree + 1.
   *  Raised if Weight is lower or equal to Resolution from package gp.
   */
  public void InsertPoleAfter(int Index,  gp_Pnt  P, double Weight) {
    OCCwrapJavaJNI.Geom_BezierCurve_InsertPoleAfter__SWIG_1(swigCPtr, this, Index, gp_Pnt.getCPtr(P), P, Weight);
  }

  /**
   *  Inserts a pole P before the pole of range Index.
   *  If the curve <me> is rational the weight value for the new
   *  pole of range Index is 1.0.
   *  Raised if Index is not in the range [1, NbPoles]
   * 
   *  Raised if the resulting number of poles is greater than
   *  MaxDegree + 1.
   */
  public void InsertPoleBefore(int Index,  gp_Pnt  P) {
    OCCwrapJavaJNI.Geom_BezierCurve_InsertPoleBefore__SWIG_0(swigCPtr, this, Index, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Inserts a pole with its weight in the set of poles after
   *  the pole of range Index. If the curve was non rational it
   *  can become rational if all the weights are not identical.
   *  Raised if Index is not in the range [1, NbPoles]
   * 
   *  Raised if the resulting number of poles is greater than
   *  MaxDegree + 1.
   *  Raised if Weight is lower or equal to Resolution from
   *  package gp.
   */
  public void InsertPoleBefore(int Index,  gp_Pnt  P, double Weight) {
    OCCwrapJavaJNI.Geom_BezierCurve_InsertPoleBefore__SWIG_1(swigCPtr, this, Index, gp_Pnt.getCPtr(P), P, Weight);
  }

  /**
   *  Removes the pole of range Index.
   *  If the curve was rational it can become non rational.
   *  Raised if Index is not in the range [1, NbPoles]
   *  Raised if Degree is lower than 2.
   */
  public void RemovePole(int Index) {
    OCCwrapJavaJNI.Geom_BezierCurve_RemovePole(swigCPtr, this, Index);
  }

  /**
   *  Segments the curve between U1 and U2 which can be out
   *  of the bounds of the curve. The curve is oriented from U1
   *  to U2.
   *  The control points are modified, the first and the last point
   *  are not the same but the parametrization range is [0, 1]
   *  else it could not be a Bezier curve.
   *  Warnings :
   *  Even if <me> is not closed it can become closed after the
   *  segmentation for example if U1 or U2 are out of the bounds
   *  of the curve <me> or if the curve makes loop.
   *  After the segmentation the length of a curve can be null.
   */
  public void Segment(double U1, double U2) {
    OCCwrapJavaJNI.Geom_BezierCurve_Segment(swigCPtr, this, U1, U2);
  }

  /**
   *  Substitutes the pole of range index with P.
   *  If the curve <me> is rational the weight of range Index
   *  is not modified.
   *  raiseD if Index is not in the range [1, NbPoles]
   */
  public void SetPole(int Index,  gp_Pnt  P) {
    OCCwrapJavaJNI.Geom_BezierCurve_SetPole__SWIG_0(swigCPtr, this, Index, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Substitutes the pole and the weights of range Index.
   *  If the curve <me> is not rational it can become rational
   *  if all the weights are not identical.
   *  If the curve was rational it can become non rational if
   *  all the weights are identical.
   *  Raised if Index is not in the range [1, NbPoles]
   *  Raised if Weight <= Resolution from package gp
   */
  public void SetPole(int Index,  gp_Pnt  P, double Weight) {
    OCCwrapJavaJNI.Geom_BezierCurve_SetPole__SWIG_1(swigCPtr, this, Index, gp_Pnt.getCPtr(P), P, Weight);
  }

  /**
   *  Changes the weight of the pole of range Index.
   *  If the curve <me> is not rational it can become rational
   *  if all the weights are not identical.
   *  If the curve was rational it can become non rational if
   *  all the weights are identical.
   *  Raised if Index is not in the range [1, NbPoles]
   *  Raised if Weight <= Resolution from package gp
   */
  public void SetWeight(int Index, double Weight) {
    OCCwrapJavaJNI.Geom_BezierCurve_SetWeight(swigCPtr, this, Index, Weight);
  }

  /**
   *  Returns false if all the weights are identical. The tolerance
   *  criterion is Resolution from package gp.
   */
  public long IsRational() {
    return OCCwrapJavaJNI.Geom_BezierCurve_IsRational(swigCPtr, this);
  }

  /**
   *  Returns the polynomial degree of the curve.
   *  it is the number of poles - 1
   *  point P and derivatives (V1, V2, V3) computation
   *  The Bezier Curve has a Polynomial representation so the
   *  parameter U can be out of the bounds of the curve.
   */
  public int Degree() {
    return OCCwrapJavaJNI.Geom_BezierCurve_Degree(swigCPtr, this);
  }

  /**
   *  Returns the number of poles of this Bezier curve.
   */
  public int NbPoles() {
    return OCCwrapJavaJNI.Geom_BezierCurve_NbPoles(swigCPtr, this);
  }

  /**
   *  Returns the pole of range Index.
   *  Raised if Index is not in the range [1, NbPoles]
   */
  public  gp_Pnt  Pole(int Index) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.Geom_BezierCurve_Pole(swigCPtr, this, Index), true);
    return ret;
  }

  /**
   *  Returns all the poles of the curve.
   * 
   *  Raised if the length of P is not equal to the number of poles.
   */
  public void Poles( TColgp_Array1OfPnt  P) {
    OCCwrapJavaJNI.Geom_BezierCurve_Poles__SWIG_0(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(P), P);
  }

  /**
   *  Returns all the poles of the curve.
   */
  public  TColgp_Array1OfPnt  Poles() {
    TColgp_Array1OfPnt ret = new TColgp_Array1OfPnt(OCCwrapJavaJNI.Geom_BezierCurve_Poles__SWIG_1(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the weight of range Index.
   *  Raised if Index is not in the range [1, NbPoles]
   */
  public double Weight(int Index) {
    return OCCwrapJavaJNI.Geom_BezierCurve_Weight(swigCPtr, this, Index);
  }

  /**
   *  Returns all the weights of the curve.
   * 
   *  Raised if the length of W is not equal to the number of poles.
   */
  public void Weights( TColStd_Array1OfReal  W) {
    OCCwrapJavaJNI.Geom_BezierCurve_Weights__SWIG_0(swigCPtr, this, TColStd_Array1OfReal.getCPtr(W), W);
  }

  /**
   *  Returns all the weights of the curve.
   */
  public TColStd_Array1OfReal Weights() {
    long cPtr = OCCwrapJavaJNI.Geom_BezierCurve_Weights__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new TColStd_Array1OfReal(cPtr, false);
  }

  /**
   *  Returns the value of the maximum polynomial degree
   *  of any Geom_BezierCurve curve. This value is 25.
   */
  public static int MaxDegree() {
    return OCCwrapJavaJNI.Geom_BezierCurve_MaxDegree();
  }

  /**
   *  Computes for this Bezier curve the parametric
   *  tolerance UTolerance for a given 3D tolerance Tolerance3D.
   *  If f(t) is the equation of this Bezier curve,
   *  UTolerance ensures that:
   *  |t1-t0| < UTolerance ===> |f(t1)-f(t0)| < Tolerance3D
   */
  public void Resolution(double Tolerance3D, double[] UTolerance) {
    OCCwrapJavaJNI.Geom_BezierCurve_Resolution(swigCPtr, this, Tolerance3D, UTolerance);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_BezierCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_BezierCurve_get_type_descriptor(), true );
  }

  public static  Geom_BezierCurve  DownCast( Standard_Transient  T) {
    return new Geom_BezierCurve ( OCCwrapJavaJNI.Geom_BezierCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_BezierCurve_TypeOf(), true );
  }

}
