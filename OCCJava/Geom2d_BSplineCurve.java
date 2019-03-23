package opencascade;

/**
 *  Describes a BSpline curve.
 *  A BSpline curve can be:
 *  - uniform or non-uniform,
 *  - rational or non-rational,
 *  - periodic or non-periodic.
 *  A BSpline curve is defined by:
 *  - its degree; the degree for a
 *  Geom2d_BSplineCurve is limited to a value (25)
 *  which is defined and controlled by the system. This
 *  value is returned by the function MaxDegree;
 *  - its periodic or non-periodic nature;
 *  - a table of poles (also called control points), with
 *  their associated weights if the BSpline curve is
 *  rational. The poles of the curve are "control points"
 *  used to deform the curve. If the curve is
 *  non-periodic, the first pole is the start point of the
 *  curve, and the last pole is the end point of the
 *  curve. The segment, which joins the first pole to the
 *  second pole, is the tangent to the curve at its start
 *  point, and the segment, which joins the last pole to
 *  the second-from-last pole, is the tangent to the
 *  curve at its end point. If the curve is periodic, these
 *  geometric properties are not verified. It is more
 *  difficult to give a geometric signification to the
 *  weights but they are useful for providing exact
 *  representations of the arcs of a circle or ellipse.
 *  Moreover, if the weights of all the poles are equal,
 *  the curve has a polynomial equation; it is
 *  therefore a non-rational curve.
 *  - a table of knots with their multiplicities. For a
 *  Geom2d_BSplineCurve, the table of knots is an
 *  increasing sequence of reals without repetition; the
 *  multiplicities define the repetition of the knots. A
 *  BSpline curve is a piecewise polynomial or rational
 *  curve. The knots are the parameters of junction
 *  points between two pieces. The multiplicity
 *  Mult(i) of the knot Knot(i) of the BSpline
 *  curve is related to the degree of continuity of the
 *  curve at the knot Knot(i), which is equal to
 *  Degree - Mult(i) where Degree is the
 *  degree of the BSpline curve.
 *  If the knots are regularly spaced (i.e. the difference
 *  between two consecutive knots is a constant), three
 *  specific and frequently used cases of knot distribution
 *  can be identified:
 *  - "uniform" if all multiplicities are equal to 1,
 *  - "quasi-uniform" if all multiplicities are equal to 1,
 *  except the first and the last knot which have a
 *  multiplicity of Degree + 1, where Degree is
 *  the degree of the BSpline curve,
 *  - "Piecewise Bezier" if all multiplicities are equal to
 *  Degree except the first and last knot which have
 *  a multiplicity of Degree + 1, where Degree is
 *  the degree of the BSpline curve. A curve of this
 *  type is a concatenation of arcs of Bezier curves.
 *  If the BSpline curve is not periodic:
 *  - the bounds of the Poles and Weights tables are 1
 *  and NbPoles, where NbPoles is the number of
 *  poles of the BSpline curve,
 *  - the bounds of the Knots and Multiplicities tables are
 *  1 and NbKnots, where NbKnots is the number
 *  of knots of the BSpline curve.
 *  If the BSpline curve is periodic, and if there are k
 *  periodic knots and p periodic poles, the period is:
 *  period = Knot(k + 1) - Knot(1)
 *  and the poles and knots tables can be considered as
 *  infinite tables, such that:
 *  - Knot(i+k) = Knot(i) + period
 *  - Pole(i+p) = Pole(i)
 *  Note: data structures of a periodic BSpline curve are
 *  more complex than those of a non-periodic one.
 *  Warnings :
 *  In this class we consider that a weight value is zero if
 *  Weight <= Resolution from package gp.
 *  For two parametric values (or two knot values) U1, U2 we
 *  consider that U1 = U2 if Abs (U2 - U1) <= Epsilon (U1).
 *  For two weights values W1, W2 we consider that W1 = W2 if
 *  Abs (W2 - W1) <= Epsilon (W1).  The method Epsilon is
 *  defined in the class Real from package Standard.
 * 
 *  References :
 *  . A survey of curve and surface methods in CADG Wolfgang BOHM
 *  CAGD 1 (1984)
 *  . On de Boor-like algorithms and blossoming Wolfgang BOEHM
 *  cagd 5 (1988)
 *  . Blossoming and knot insertion algorithms for B-spline curves
 *  Ronald N. GOLDMAN
 *  . Modelisation des surfaces en CAO, Henri GIAUME Peugeot SA
 *  . Curves and Surfaces for Computer Aided Geometric Design,
 *  a practical guide Gerald Farin
 */
public class Geom2d_BSplineCurve extends Geom2d_BoundedCurve {
  Geom2d_BSplineCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a  non-rational B_spline curve   on  the
   *  basis <Knots, Multiplicities> of degree <Degree>.
   *  The following conditions must be verified.
   *  0 < Degree <= MaxDegree.
   * 
   *  Knots.Length() == Mults.Length() >= 2
   * 
   *  Knots(i) < Knots(i+1) (Knots are increasing)
   * 
   *  1 <= Mults(i) <= Degree
   * 
   *  On a non periodic curve the first and last multiplicities
   *  may be Degree+1 (this is even recommanded if you want the
   *  curve to start and finish on the first and last pole).
   * 
   *  On a periodic  curve the first  and  the last multicities
   *  must be the same.
   * 
   *  on non-periodic curves
   * 
   *  Poles.Length() == Sum(Mults(i)) - Degree - 1 >= 2
   * 
   *  on periodic curves
   * 
   *  Poles.Length() == Sum(Mults(i)) except the first or last
   */
  public Geom2d_BSplineCurve( TColgp_Array1OfPnt2d  Poles,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Multiplicities, int Degree, long Periodic) {
    this(OCCwrapJavaJNI.new_Geom2d_BSplineCurve__SWIG_0(TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Multiplicities), Multiplicities, Degree, Periodic), true);
  }

  /**
   *  Creates  a rational B_spline  curve  on the basis
   *  <Knots, Multiplicities> of degree <Degree>.
   *  The following conditions must be verified.
   *  0 < Degree <= MaxDegree.
   * 
   *  Knots.Length() == Mults.Length() >= 2
   * 
   *  Knots(i) < Knots(i+1) (Knots are increasing)
   * 
   *  1 <= Mults(i) <= Degree
   * 
   *  On a non periodic curve the first and last multiplicities
   *  may be Degree+1 (this is even recommanded if you want the
   *  curve to start and finish on the first and last pole).
   * 
   *  On a periodic  curve the first  and  the last multicities
   *  must be the same.
   * 
   *  on non-periodic curves
   * 
   *  Poles.Length() == Sum(Mults(i)) - Degree - 1 >= 2
   * 
   *  on periodic curves
   * 
   *  Poles.Length() == Sum(Mults(i)) except the first or last
   */
  public Geom2d_BSplineCurve( TColgp_Array1OfPnt2d  Poles,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Multiplicities, int Degree) {
    this(OCCwrapJavaJNI.new_Geom2d_BSplineCurve__SWIG_1(TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Multiplicities), Multiplicities, Degree), true);
  }

  public Geom2d_BSplineCurve( TColgp_Array1OfPnt2d  Poles,  TColStd_Array1OfReal  Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Multiplicities, int Degree, long Periodic) {
    this(OCCwrapJavaJNI.new_Geom2d_BSplineCurve__SWIG_2(TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Multiplicities), Multiplicities, Degree, Periodic), true);
  }

  public Geom2d_BSplineCurve( TColgp_Array1OfPnt2d  Poles,  TColStd_Array1OfReal  Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Multiplicities, int Degree) {
    this(OCCwrapJavaJNI.new_Geom2d_BSplineCurve__SWIG_3(TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Multiplicities), Multiplicities, Degree), true);
  }

  /**
   *  Increases the degree of this BSpline curve to
   *  Degree. As a result, the poles, weights and
   *  multiplicities tables are modified; the knots table is
   *  not changed. Nothing is done if Degree is less than
   *  or equal to the current degree.
   *  Exceptions
   *  Standard_ConstructionError if Degree is greater than
   *  Geom2d_BSplineCurve::MaxDegree().
   */
  public void IncreaseDegree(int Degree) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_IncreaseDegree(swigCPtr, this, Degree);
  }

  /**
   *  Increases the multiplicity  of the knot <Index> to
   *  <M>.
   * 
   *  If   <M>   is   lower   or  equal   to  the current
   *  multiplicity nothing is done. If <M> is higher than
   *  the degree the degree is used.
   *  If <Index> is not in [FirstUKnotIndex, LastUKnotIndex]
   */
  public void IncreaseMultiplicity(int Index, int M) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_IncreaseMultiplicity__SWIG_0(swigCPtr, this, Index, M);
  }

  /**
   *  Increases  the  multiplicities   of  the knots  in
   *  [I1,I2] to <M>.
   * 
   *  For each knot if  <M>  is  lower  or equal  to  the
   *  current multiplicity  nothing  is  done. If <M>  is
   *  higher than the degree the degree is used.
   *  As a result, the poles and weights tables of this curve are modified.
   *  Warning
   *  It is forbidden to modify the multiplicity of the first or
   *  last knot of a non-periodic curve. Be careful as
   *  Geom2d does not protect against this.
   *  Exceptions
   *  Standard_OutOfRange if either Index, I1 or I2 is
   *  outside the bounds of the knots table.
   */
  public void IncreaseMultiplicity(int I1, int I2, int M) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_IncreaseMultiplicity__SWIG_1(swigCPtr, this, I1, I2, M);
  }

  /**
   *  Increases by M the multiplicity of the knots of indexes
   *  I1 to I2 in the knots table of this BSpline curve. For
   *  each knot, the resulting multiplicity is limited to the
   *  degree of this curve. If M is negative, nothing is done.
   *  As a result, the poles and weights tables of this
   *  BSpline curve are modified.
   *  Warning
   *  It is forbidden to modify the multiplicity of the first or
   *  last knot of a non-periodic curve. Be careful as
   *  Geom2d does not protect against this.
   *  Exceptions
   *  Standard_OutOfRange if I1 or I2 is outside the
   *  bounds of the knots table.
   */
  public void IncrementMultiplicity(int I1, int I2, int M) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_IncrementMultiplicity(swigCPtr, this, I1, I2, M);
  }

  /**
   *  Inserts a knot value in the sequence of knots.  If
   *  <U>  is an  existing knot     the multiplicity  is
   *  increased by <M>.
   * 
   *  If U  is  not  on the parameter  range  nothing is
   *  done.
   * 
   *  If the multiplicity is negative or null nothing is
   *  done. The  new   multiplicity  is limited  to  the
   *  degree.
   * 
   *  The  tolerance criterion  for  knots  equality  is
   *  the max of Epsilon(U) and ParametricTolerance.
   *  Warning
   *  - If U is less than the first parameter or greater than
   *  the last parameter of this BSpline curve, nothing is done.
   *  - If M is negative or null, nothing is done.
   *  - The multiplicity of a knot is limited to the degree of
   *  this BSpline curve.
   */
  public void InsertKnot(double U, int M, double ParametricTolerance) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_InsertKnot__SWIG_0(swigCPtr, this, U, M, ParametricTolerance);
  }

  public void InsertKnot(double U, int M) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_InsertKnot__SWIG_1(swigCPtr, this, U, M);
  }

  public void InsertKnot(double U) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_InsertKnot__SWIG_2(swigCPtr, this, U);
  }

  /**
   *  Inserts the values of the array Knots, with the
   *  respective multiplicities given by the array Mults, into
   *  the knots table of this BSpline curve.
   *  If a value of the array Knots is an existing knot, its multiplicity is:
   *  - increased by M, if Add is true, or
   *  - increased to M, if Add is false (default value).
   *  The tolerance criterion used for knot equality is the
   *  larger of the values ParametricTolerance (defaulted
   *  to 0.) and Standard_Real::Epsilon(U),
   *  where U is the current knot value.
   *  Warning
   *  - For a value of the array Knots which is less than
   *  the first parameter or greater than the last
   *  parameter of this BSpline curve, nothing is done.
   *  - For a value of the array Mults which is negative or
   *  null, nothing is done.
   *  - The multiplicity of a knot is limited to the degree of
   *  this BSpline curve.
   */
  public void InsertKnots( TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults, double ParametricTolerance, long Add) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_InsertKnots__SWIG_0(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, ParametricTolerance, Add);
  }

  public void InsertKnots( TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults, double ParametricTolerance) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_InsertKnots__SWIG_1(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, ParametricTolerance);
  }

  public void InsertKnots( TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_InsertKnots__SWIG_2(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults);
  }

  /**
   *  Reduces the multiplicity of the knot of index Index
   *  to M. If M is equal to 0, the knot is removed.
   *  With a modification of this type, the array of poles is also modified.
   *  Two different algorithms are systematically used to
   *  compute the new poles of the curve. If, for each
   *  pole, the distance between the pole calculated
   *  using the first algorithm and the same pole
   *  calculated using the second algorithm, is less than
   *  Tolerance, this ensures that the curve is not
   *  modified by more than Tolerance. Under these
   *  conditions, true is returned; otherwise, false is returned.
   *  A low tolerance is used to prevent modification of
   *  the curve. A high tolerance is used to "smooth" the curve.
   *  Exceptions
   *  Standard_OutOfRange if Index is outside the
   *  bounds of the knots table.
   */
  public long RemoveKnot(int Index, int M, double Tolerance) {
    return OCCwrapJavaJNI.Geom2d_BSplineCurve_RemoveKnot(swigCPtr, this, Index, M, Tolerance);
  }

  /**
   *  The new pole is inserted after the pole of range Index.
   *  If the curve was non rational it can become rational.
   * 
   *  Raised if the B-spline is NonUniform or PiecewiseBezier or if
   *  Weight <= 0.0
   *  Raised if Index is not in the range [1, Number of Poles]
   */
  public void InsertPoleAfter(int Index,  gp_Pnt2d  P, double Weight) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_InsertPoleAfter__SWIG_0(swigCPtr, this, Index, gp_Pnt2d.getCPtr(P), P, Weight);
  }

  public void InsertPoleAfter(int Index,  gp_Pnt2d  P) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_InsertPoleAfter__SWIG_1(swigCPtr, this, Index, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  The new pole is inserted before the pole of range Index.
   *  If the curve was non rational it can become rational.
   * 
   *  Raised if the B-spline is NonUniform or PiecewiseBezier or if
   *  Weight <= 0.0
   *  Raised if Index is not in the range [1, Number of Poles]
   */
  public void InsertPoleBefore(int Index,  gp_Pnt2d  P, double Weight) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_InsertPoleBefore__SWIG_0(swigCPtr, this, Index, gp_Pnt2d.getCPtr(P), P, Weight);
  }

  public void InsertPoleBefore(int Index,  gp_Pnt2d  P) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_InsertPoleBefore__SWIG_1(swigCPtr, this, Index, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Removes the pole of range Index
   *  If the curve was rational it can become non rational.
   * 
   *  Raised if the B-spline is NonUniform or PiecewiseBezier.
   *  Raised if the number of poles of the B-spline curve is lower or
   *  equal to 2 before removing.
   *  Raised if Index is not in the range [1, Number of Poles]
   */
  public void RemovePole(int Index) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_RemovePole(swigCPtr, this, Index);
  }

  /**
   *  Modifies this BSpline curve by segmenting it
   *  between U1 and U2. Either of these values can be
   *  outside the bounds of the curve, but U2 must be greater than U1.
   *  All data structure tables of this BSpline curve are
   *  modified, but the knots located between U1 and U2
   *  are retained. The degree of the curve is not modified.
   *  Warnings :
   *  Even if <me> is not closed it can become closed after the
   *  segmentation for example if U1 or U2 are out of the bounds
   *  of the curve <me> or if the curve makes loop.
   *  After the segmentation the length of a curve can be null.
   *  - The segmentation of a periodic curve over an
   *  interval corresponding to its period generates a
   *  non-periodic curve with equivalent geometry.
   *  Exceptions
   *  Standard_DomainError if U2 is less than U1.
   *  raises if U2 < U1.
   *  Standard_DomainError if U2 - U1 exceeds the period for periodic curves.
   *  i.e. ((U2 - U1) - Period) > Precision::PConfusion().
   */
  public void Segment(double U1, double U2) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_Segment(swigCPtr, this, U1, U2);
  }

  /**
   *  Modifies this BSpline curve by assigning the value K
   *  to the knot of index Index in the knots table. This is a
   *  relatively local modification because K must be such that:
   *  Knots(Index - 1) < K < Knots(Index + 1)
   *  Exceptions
   *  Standard_ConstructionError if:
   *  - K is not such that:
   *  Knots(Index - 1) < K < Knots(Index + 1)
   *  - M is greater than the degree of this BSpline curve
   *  or lower than the previous multiplicity of knot of
   *  index Index in the knots table.
   *  Standard_OutOfRange if Index is outside the bounds of the knots table.
   */
  public void SetKnot(int Index, double K) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_SetKnot__SWIG_0(swigCPtr, this, Index, K);
  }

  /**
   *  Modifies this BSpline curve by assigning the array
   *  K to its knots table. The multiplicity of the knots is not modified.
   *  Exceptions
   *  Standard_ConstructionError if the values in the
   *  array K are not in ascending order.
   *  Standard_OutOfRange if the bounds of the array
   *  K are not respectively 1 and the number of knots of this BSpline curve.
   */
  public void SetKnots( TColStd_Array1OfReal  K) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_SetKnots(swigCPtr, this, TColStd_Array1OfReal.getCPtr(K), K);
  }

  /**
   *  Modifies this BSpline curve by assigning the value K
   *  to the knot of index Index in the knots table. This is a
   *  relatively local modification because K must be such that:
   *  Knots(Index - 1) < K < Knots(Index + 1)
   *  The second syntax allows you also to increase the
   *  multiplicity of the knot to M (but it is not possible to
   *  decrease the multiplicity of the knot with this function).
   *  Exceptions
   *  Standard_ConstructionError if:
   *  - K is not such that:
   *  Knots(Index - 1) < K < Knots(Index + 1)
   *  - M is greater than the degree of this BSpline curve
   *  or lower than the previous multiplicity of knot of
   *  index Index in the knots table.
   *  Standard_OutOfRange if Index is outside the bounds of the knots table.
   */
  public void SetKnot(int Index, double K, int M) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_SetKnot__SWIG_1(swigCPtr, this, Index, K, M);
  }

  /**
   *  Computes the parameter normalized within the
   *  "first" period of this BSpline curve, if it is periodic:
   *  the returned value is in the range Param1 and
   *  Param1 + Period, where:
   *  - Param1 is the "first parameter", and
   *  - Period the period of this BSpline curve.
   *  Note: If this curve is not periodic, U is not modified.
   */
  public void PeriodicNormalization(double[] U) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_PeriodicNormalization(swigCPtr, this, U);
  }

  /**
   *  Changes this BSpline curve into a periodic curve.
   *  To become periodic, the curve must first be closed.
   *  Next, the knot sequence must be periodic. For this,
   *  FirstUKnotIndex and LastUKnotIndex are used to
   *  compute I1 and I2, the indexes in the knots array
   *  of the knots corresponding to the first and last
   *  parameters of this BSpline curve.
   *  The period is therefore Knot(I2) - Knot(I1).
   *  Consequently, the knots and poles tables are modified.
   *  Exceptions
   *  Standard_ConstructionError if this BSpline curve is not closed.
   */
  public void SetPeriodic() {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_SetPeriodic(swigCPtr, this);
  }

  /**
   *  Assigns the knot of index Index in the knots table as
   *  the origin of this periodic BSpline curve. As a
   *  consequence, the knots and poles tables are modified.
   *  Exceptions
   *  Standard_NoSuchObject if this curve is not periodic.
   *  Standard_DomainError if Index is outside the
   *  bounds of the knots table.
   */
  public void SetOrigin(int Index) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_SetOrigin(swigCPtr, this, Index);
  }

  /**
   *  Changes this BSpline curve into a non-periodic
   *  curve. If this curve is already non-periodic, it is not modified.
   *  Note that the poles and knots tables are modified.
   *  Warning
   *  If this curve is periodic, as the multiplicity of the first
   *  and last knots is not modified, and is not equal to
   *  Degree + 1, where Degree is the degree of
   *  this BSpline curve, the start and end points of the
   *  curve are not its first and last poles.
   */
  public void SetNotPeriodic() {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_SetNotPeriodic(swigCPtr, this);
  }

  /**
   *  Modifies this BSpline curve by assigning P to the
   *  pole of index Index in the poles table.
   *  Exceptions
   *  Standard_OutOfRange if Index is outside the
   *  bounds of the poles table.
   *  Standard_ConstructionError if Weight is negative or null.
   */
  public void SetPole(int Index,  gp_Pnt2d  P) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_SetPole__SWIG_0(swigCPtr, this, Index, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Modifies this BSpline curve by assigning P to the
   *  pole of index Index in the poles table.
   *  The second syntax also allows you to modify the
   *  weight of the modified pole, which becomes Weight.
   *  In this case, if this BSpline curve is non-rational, it
   *  can become rational and vice versa.
   *  Exceptions
   *  Standard_OutOfRange if Index is outside the
   *  bounds of the poles table.
   *  Standard_ConstructionError if Weight is negative or null.
   */
  public void SetPole(int Index,  gp_Pnt2d  P, double Weight) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_SetPole__SWIG_1(swigCPtr, this, Index, gp_Pnt2d.getCPtr(P), P, Weight);
  }

  /**
   *  Assigns the weight Weight to the pole of index Index of the poles table.
   *  If the curve was non rational it can become rational.
   *  If the curve was rational it can become non rational.
   *  Exceptions
   *  Standard_OutOfRange if Index is outside the
   *  bounds of the poles table.
   *  Standard_ConstructionError if Weight is negative or null.
   */
  public void SetWeight(int Index, double Weight) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_SetWeight(swigCPtr, this, Index, Weight);
  }

  /**
   *  Moves the point of parameter U of this BSpline
   *  curve to P. Index1 and Index2 are the indexes in the
   *  table of poles of this BSpline curve of the first and
   *  last poles designated to be moved.
   *  FirstModifiedPole and LastModifiedPole are the
   *  indexes of the first and last poles, which are
   *  effectively modified.
   *  In the event of incompatibility between Index1,
   *  Index2 and the value U:
   *  - no change is made to this BSpline curve, and
   *  - the FirstModifiedPole and LastModifiedPole are returned null.
   *  Exceptions
   *  Standard_OutOfRange if:
   *  - Index1 is greater than or equal to Index2, or
   *  - Index1 or Index2 is less than 1 or greater than the
   *  number of poles of this BSpline curve.
   */
  public void MovePoint(double U,  gp_Pnt2d  P, int Index1, int Index2, int[] FirstModifiedPole, int[] LastModifiedPole) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_MovePoint(swigCPtr, this, U, gp_Pnt2d.getCPtr(P), P, Index1, Index2, FirstModifiedPole, LastModifiedPole);
  }

  /**
   *  Move a point with parameter U to P.
   *  and makes it tangent at U be Tangent.
   *  StartingCondition = -1 means first can move
   *  EndingCondition   = -1 means last point can move
   *  StartingCondition = 0 means the first point cannot move
   *  EndingCondition   = 0 means the last point cannot move
   *  StartingCondition = 1 means the first point and tangent cannot move
   *  EndingCondition   = 1 means the last point and tangent cannot move
   *  and so forth
   *  ErrorStatus != 0 means that there are not enought degree of freedom
   *  with the constrain to deform the curve accordingly
   */
  public void MovePointAndTangent(double U,  gp_Pnt2d  P,  gp_Vec2d  Tangent, double Tolerance, int StartingCondition, int EndingCondition, int[] ErrorStatus) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_MovePointAndTangent(swigCPtr, this, U, gp_Pnt2d.getCPtr(P), P, gp_Vec2d.getCPtr(Tangent), Tangent, Tolerance, StartingCondition, EndingCondition, ErrorStatus);
  }

  /**
   *  Check if curve has at least G1 continuity in interval [theTf, theTl]
   *  Returns true if IsCN(1)
   *  or
   *  angle betweem "left" and "right" first derivatives at
   *  knots with C0 continuity is less then theAngTol
   *  only knots in interval [theTf, theTl] is checked
   */
  public long IsG1(double theTf, double theTl, double theAngTol) {
    return OCCwrapJavaJNI.Geom2d_BSplineCurve_IsG1(swigCPtr, this, theTf, theTl, theAngTol);
  }

  /**
   *  Returns True if the weights are not identical.
   *  The tolerance criterion is Epsilon of the class Real.
   */
  public long IsRational() {
    return OCCwrapJavaJNI.Geom2d_BSplineCurve_IsRational(swigCPtr, this);
  }

  /**
   *  Returns the degree of this BSpline curve.
   *  In this class the degree of the basis normalized B-spline
   *  functions cannot be greater than "MaxDegree"
   *  Computation of value and derivatives
   */
  public int Degree() {
    return OCCwrapJavaJNI.Geom2d_BSplineCurve_Degree(swigCPtr, this);
  }

  /**
   *  Raised if FromK1 = ToK2.
   */
  public gp_Pnt2d LocalValue(double U, int FromK1, int ToK2) {
    return new gp_Pnt2d(OCCwrapJavaJNI.Geom2d_BSplineCurve_LocalValue(swigCPtr, this, U, FromK1, ToK2), true);
  }

  /**
   *  Raised if FromK1 = ToK2.
   */
  public void LocalD0(double U, int FromK1, int ToK2, gp_Pnt2d P) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_LocalD0(swigCPtr, this, U, FromK1, ToK2, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Raised if the local continuity of the curve is not C1
   *  between the knot K1 and the knot K2.
   *  Raised if FromK1 = ToK2.
   */
  public void LocalD1(double U, int FromK1, int ToK2, gp_Pnt2d P, gp_Vec2d V1) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_LocalD1(swigCPtr, this, U, FromK1, ToK2, gp_Pnt2d.getCPtr(P), P, gp_Vec2d.getCPtr(V1), V1);
  }

  /**
   *  Raised if the local continuity of the curve is not C2
   *  between the knot K1 and the knot K2.
   *  Raised if FromK1 = ToK2.
   */
  public void LocalD2(double U, int FromK1, int ToK2, gp_Pnt2d P, gp_Vec2d V1, gp_Vec2d V2) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_LocalD2(swigCPtr, this, U, FromK1, ToK2, gp_Pnt2d.getCPtr(P), P, gp_Vec2d.getCPtr(V1), V1, gp_Vec2d.getCPtr(V2), V2);
  }

  /**
   *  Raised if the local continuity of the curve is not C3
   *  between the knot K1 and the knot K2.
   *  Raised if FromK1 = ToK2.
   */
  public void LocalD3(double U, int FromK1, int ToK2, gp_Pnt2d P, gp_Vec2d V1, gp_Vec2d V2, gp_Vec2d V3) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_LocalD3(swigCPtr, this, U, FromK1, ToK2, gp_Pnt2d.getCPtr(P), P, gp_Vec2d.getCPtr(V1), V1, gp_Vec2d.getCPtr(V2), V2, gp_Vec2d.getCPtr(V3), V3);
  }

  /**
   *  Raised if the local continuity of the curve is not CN
   *  between the knot K1 and the knot K2.
   *  Raised if FromK1 = ToK2.
   *  Raised if N < 1.
   */
  public gp_Vec2d LocalDN(double U, int FromK1, int ToK2, int N) {
    return new gp_Vec2d(OCCwrapJavaJNI.Geom2d_BSplineCurve_LocalDN(swigCPtr, this, U, FromK1, ToK2, N), true);
  }

  /**
   *  For a B-spline curve the first parameter (which gives the start
   *  point of the curve) is a knot value but if the multiplicity of
   *  the first knot index is lower than Degree + 1 it is not the
   *  first knot of the curve. This method computes the index of the
   *  knot corresponding to the first parameter.
   */
  public int FirstUKnotIndex() {
    return OCCwrapJavaJNI.Geom2d_BSplineCurve_FirstUKnotIndex(swigCPtr, this);
  }

  /**
   *  Returns the knot of range Index. When there is a knot
   *  with a multiplicity greater than 1 the knot is not repeated.
   *  The method Multiplicity can be used to get the multiplicity
   *  of the Knot.
   *  Raised if Index < 1 or Index > NbKnots
   */
  public double Knot(int Index) {
    return OCCwrapJavaJNI.Geom2d_BSplineCurve_Knot(swigCPtr, this, Index);
  }

  /**
   *  returns the knot values of the B-spline curve;
   * 
   *  Raised K.Lower() is less than number of first knot or
   *  K.Upper() is more than number of last knot.
   */
  public void Knots( TColStd_Array1OfReal  K) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_Knots__SWIG_0(swigCPtr, this, TColStd_Array1OfReal.getCPtr(K), K);
  }

  /**
   *  returns the knot values of the B-spline curve;
   */
  public  TColStd_Array1OfReal  Knots() {
    TColStd_Array1OfReal ret = new TColStd_Array1OfReal(OCCwrapJavaJNI.Geom2d_BSplineCurve_Knots__SWIG_1(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the knots sequence.
   *  In this sequence the knots with a multiplicity greater than 1
   *  are repeated.
   *  Example :
   *  K = {k1, k1, k1, k2, k3, k3, k4, k4, k4}
   * 
   *  Raised if K.Lower() is less than number of first knot
   *  in knot sequence with repetitions or K.Upper() is more
   *  than number of last knot in knot sequence with repetitions.
   */
  public void KnotSequence( TColStd_Array1OfReal  K) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_KnotSequence__SWIG_0(swigCPtr, this, TColStd_Array1OfReal.getCPtr(K), K);
  }

  /**
   *  Returns the knots sequence.
   *  In this sequence the knots with a multiplicity greater than 1
   *  are repeated.
   *  Example :
   *  K = {k1, k1, k1, k2, k3, k3, k4, k4, k4}
   */
  public  TColStd_Array1OfReal  KnotSequence() {
    TColStd_Array1OfReal ret = new TColStd_Array1OfReal(OCCwrapJavaJNI.Geom2d_BSplineCurve_KnotSequence__SWIG_1(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns NonUniform or Uniform or QuasiUniform or PiecewiseBezier.
   *  If all the knots differ by a positive constant from the
   *  preceding knot the BSpline Curve can be :
   *  - Uniform if all the knots are of multiplicity 1,
   *  - QuasiUniform if all the knots are of multiplicity 1 except for
   *  the first and last knot which are of multiplicity Degree + 1,
   *  - PiecewiseBezier if the first and last knots have multiplicity
   *  Degree + 1 and if interior knots have multiplicity Degree
   *  A piecewise Bezier with only two knots is a BezierCurve.
   *  else the curve is non uniform.
   *  The tolerance criterion is Epsilon from class Real.
   */
  public GeomAbs_BSplKnotDistribution KnotDistribution() {
    return GeomAbs_BSplKnotDistribution.swigToEnum(OCCwrapJavaJNI.Geom2d_BSplineCurve_KnotDistribution(swigCPtr, this));
  }

  /**
   *  For a BSpline curve the last parameter (which gives the
   *  end point of the curve) is a knot value but if the
   *  multiplicity of the last knot index is lower than
   *  Degree + 1 it is not the last knot of the curve. This
   *  method computes the index of the knot corresponding to
   *  the last parameter.
   */
  public int LastUKnotIndex() {
    return OCCwrapJavaJNI.Geom2d_BSplineCurve_LastUKnotIndex(swigCPtr, this);
  }

  /**
   *  Locates the parametric value U in the sequence of knots.
   *  If "WithKnotRepetition" is True we consider the knot's
   *  representation with repetition of multiple knot value,
   *  otherwise  we consider the knot's representation with
   *  no repetition of multiple knot values.
   *  Knots (I1) <= U <= Knots (I2)
   *  . if I1 = I2  U is a knot value (the tolerance criterion
   *  ParametricTolerance is used).
   *  . if I1 < 1  => U < Knots (1) - Abs(ParametricTolerance)
   *  . if I2 > NbKnots => U > Knots (NbKnots) + Abs(ParametricTolerance)
   */
  public void LocateU(double U, double ParametricTolerance, int[] I1, int[] I2, long WithKnotRepetition) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_LocateU__SWIG_0(swigCPtr, this, U, ParametricTolerance, I1, I2, WithKnotRepetition);
  }

  public void LocateU(double U, double ParametricTolerance, int[] I1, int[] I2) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_LocateU__SWIG_1(swigCPtr, this, U, ParametricTolerance, I1, I2);
  }

  /**
   *  Returns the multiplicity of the knots of range Index.
   *  Raised if Index < 1 or Index > NbKnots
   */
  public int Multiplicity(int Index) {
    return OCCwrapJavaJNI.Geom2d_BSplineCurve_Multiplicity(swigCPtr, this, Index);
  }

  /**
   *  Returns the multiplicity of the knots of the curve.
   * 
   *  Raised if the length of M is not equal to NbKnots.
   */
  public void Multiplicities( TColStd_Array1OfInteger  M) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_Multiplicities__SWIG_0(swigCPtr, this, TColStd_Array1OfInteger.getCPtr(M), M);
  }

  /**
   *  returns the multiplicity of the knots of the curve.
   */
  public  TColStd_Array1OfInteger  Multiplicities() {
    TColStd_Array1OfInteger ret = new TColStd_Array1OfInteger(OCCwrapJavaJNI.Geom2d_BSplineCurve_Multiplicities__SWIG_1(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the number of knots. This method returns the number of
   *  knot without repetition of multiple knots.
   */
  public int NbKnots() {
    return OCCwrapJavaJNI.Geom2d_BSplineCurve_NbKnots(swigCPtr, this);
  }

  /**
   *  Returns the number of poles
   */
  public int NbPoles() {
    return OCCwrapJavaJNI.Geom2d_BSplineCurve_NbPoles(swigCPtr, this);
  }

  /**
   *  Returns the pole of range Index.
   *  Raised if Index < 1 or Index > NbPoles.
   */
  public  gp_Pnt2d  Pole(int Index) {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.Geom2d_BSplineCurve_Pole(swigCPtr, this, Index), true);
    return ret;
  }

  /**
   *  Returns the poles of the B-spline curve;
   * 
   *  Raised if the length of P is not equal to the number of poles.
   */
  public void Poles( TColgp_Array1OfPnt2d  P) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_Poles__SWIG_0(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(P), P);
  }

  /**
   *  Returns the poles of the B-spline curve;
   */
  public  TColgp_Array1OfPnt2d  Poles() {
    TColgp_Array1OfPnt2d ret = new TColgp_Array1OfPnt2d(OCCwrapJavaJNI.Geom2d_BSplineCurve_Poles__SWIG_1(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the weight of the pole of range Index .
   *  Raised if Index < 1 or Index > NbPoles.
   */
  public double Weight(int Index) {
    return OCCwrapJavaJNI.Geom2d_BSplineCurve_Weight(swigCPtr, this, Index);
  }

  /**
   *  Returns the weights of the B-spline curve;
   * 
   *  Raised if the length of W is not equal to NbPoles.
   */
  public void Weights( TColStd_Array1OfReal  W) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_Weights__SWIG_0(swigCPtr, this, TColStd_Array1OfReal.getCPtr(W), W);
  }

  /**
   *  Returns the weights of the B-spline curve;
   */
  public TColStd_Array1OfReal Weights() {
    long cPtr = OCCwrapJavaJNI.Geom2d_BSplineCurve_Weights__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new TColStd_Array1OfReal(cPtr, false);
  }

  /**
   *  Returns the value of the maximum degree of the normalized
   *  B-spline basis functions in this package.
   */
  public static int MaxDegree() {
    return OCCwrapJavaJNI.Geom2d_BSplineCurve_MaxDegree();
  }

  /**
   *  Computes for this BSpline curve the parametric
   *  tolerance UTolerance for a given tolerance
   *  Tolerance3D (relative to dimensions in the plane).
   *  If f(t) is the equation of this BSpline curve,
   *  UTolerance ensures that:
   *  | t1 - t0| < Utolerance ===>
   *  |f(t1) - f(t0)| < ToleranceUV
   */
  public void Resolution(double ToleranceUV, double[] UTolerance) {
    OCCwrapJavaJNI.Geom2d_BSplineCurve_Resolution(swigCPtr, this, ToleranceUV, UTolerance);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom2d_BSplineCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_BSplineCurve_get_type_descriptor(), true );
  }

  public static  Geom2d_BSplineCurve  DownCast( Standard_Transient  T) {
    return new Geom2d_BSplineCurve ( OCCwrapJavaJNI.Geom2d_BSplineCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_BSplineCurve_TypeOf(), true );
  }

}
