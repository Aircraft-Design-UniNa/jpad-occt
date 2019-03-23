package opencascade;

/**
 *  Definition of the 1D B_spline curve.
 * 
 *  Uniform  or non-uniform
 *  Rational or non-rational
 *  Periodic or non-periodic
 * 
 *  a b-spline curve is defined by :
 * 
 *  The Degree (up to 25)
 * 
 *  The Poles  (and the weights if it is rational)
 * 
 *  The Knots and Multiplicities
 * 
 *  The knot vector   is an  increasing  sequence  of
 *  reals without  repetition. The multiplicities are
 *  the repetition of the knots.
 * 
 *  If the knots are regularly spaced (the difference
 *  of two  consecutive  knots  is a   constant), the
 *  knots repartition is :
 * 
 *  - Uniform if all multiplicities are 1.
 * 
 *  -  Quasi-uniform if  all multiplicities are  1
 *  but the first and the last which are Degree+1.
 * 
 *  -   PiecewiseBezier if  all multiplicites  are
 *  Degree but the   first and the  last which are
 *  Degree+1.
 * 
 *  The curve may be periodic.
 * 
 *  On a periodic curve if there are k knots and p
 *  poles. the period is knot(k) - knot(1)
 * 
 *  the poles and knots are infinite vectors with :
 * 
 *  knot(i+k) = knot(i) + period
 * 
 *  pole(i+p) = pole(i)
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
public class Law_BSpline extends Standard_Transient {
  Law_BSpline(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a  non-rational B_spline curve   on  the
   *  basis <Knots, Multiplicities> of degree <Degree>.
   */
  public Law_BSpline( TColStd_Array1OfReal  Poles,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Multiplicities, int Degree, long Periodic) {
    this(OCCwrapJavaJNI.new_Law_BSpline__SWIG_0(TColStd_Array1OfReal.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Multiplicities), Multiplicities, Degree, Periodic), true);
  }

  /**
   *  Creates  a rational B_spline  curve  on the basis
   *  <Knots, Multiplicities> of degree <Degree>.
   */
  public Law_BSpline( TColStd_Array1OfReal  Poles,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Multiplicities, int Degree) {
    this(OCCwrapJavaJNI.new_Law_BSpline__SWIG_1(TColStd_Array1OfReal.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Multiplicities), Multiplicities, Degree), true);
  }

  public Law_BSpline( TColStd_Array1OfReal  Poles,  TColStd_Array1OfReal  Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Multiplicities, int Degree, long Periodic) {
    this(OCCwrapJavaJNI.new_Law_BSpline__SWIG_2(TColStd_Array1OfReal.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Multiplicities), Multiplicities, Degree, Periodic), true);
  }

  public Law_BSpline( TColStd_Array1OfReal  Poles,  TColStd_Array1OfReal  Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Multiplicities, int Degree) {
    this(OCCwrapJavaJNI.new_Law_BSpline__SWIG_3(TColStd_Array1OfReal.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Multiplicities), Multiplicities, Degree), true);
  }

  /**
   *  Increase the degree to  <Degree>. Nothing is  done
   *  if  <Degree>   is lower or  equal  to the  current
   *  degree.
   */
  public void IncreaseDegree(int Degree) {
    OCCwrapJavaJNI.Law_BSpline_IncreaseDegree(swigCPtr, this, Degree);
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
    OCCwrapJavaJNI.Law_BSpline_IncreaseMultiplicity__SWIG_0(swigCPtr, this, Index, M);
  }

  /**
   *  Increases  the  multiplicities   of  the knots  in
   *  [I1,I2] to <M>.
   * 
   *  For each knot if  <M>  is  lower  or equal  to  the
   *  current multiplicity  nothing  is  done. If <M>  is
   *  higher than the degree the degree is used.
   *  If <I1,I2> are not in [FirstUKnotIndex, LastUKnotIndex]
   */
  public void IncreaseMultiplicity(int I1, int I2, int M) {
    OCCwrapJavaJNI.Law_BSpline_IncreaseMultiplicity__SWIG_1(swigCPtr, this, I1, I2, M);
  }

  /**
   *  Increment  the  multiplicities   of  the knots  in
   *  [I1,I2] by <M>.
   * 
   *  If <M> is not positive nithing is done.
   * 
   *  For   each  knot   the resulting   multiplicity  is
   *  limited to the Degree.
   *  If <I1,I2> are not in [FirstUKnotIndex, LastUKnotIndex]
   */
  public void IncrementMultiplicity(int I1, int I2, int M) {
    OCCwrapJavaJNI.Law_BSpline_IncrementMultiplicity(swigCPtr, this, I1, I2, M);
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
   */
  public void InsertKnot(double U, int M, double ParametricTolerance, long Add) {
    OCCwrapJavaJNI.Law_BSpline_InsertKnot__SWIG_0(swigCPtr, this, U, M, ParametricTolerance, Add);
  }

  public void InsertKnot(double U, int M, double ParametricTolerance) {
    OCCwrapJavaJNI.Law_BSpline_InsertKnot__SWIG_1(swigCPtr, this, U, M, ParametricTolerance);
  }

  public void InsertKnot(double U, int M) {
    OCCwrapJavaJNI.Law_BSpline_InsertKnot__SWIG_2(swigCPtr, this, U, M);
  }

  public void InsertKnot(double U) {
    OCCwrapJavaJNI.Law_BSpline_InsertKnot__SWIG_3(swigCPtr, this, U);
  }

  /**
   *  Inserts a set of knots  values in  the sequence of
   *  knots.
   * 
   *  For each U = Knots(i), M = Mults(i)
   * 
   *  If <U>  is an existing  knot  the  multiplicity is
   *  increased by  <M> if  <Add>  is True, increased to
   *  <M> if <Add> is False.
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
   */
  public void InsertKnots( TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults, double ParametricTolerance, long Add) {
    OCCwrapJavaJNI.Law_BSpline_InsertKnots__SWIG_0(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, ParametricTolerance, Add);
  }

  public void InsertKnots( TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults, double ParametricTolerance) {
    OCCwrapJavaJNI.Law_BSpline_InsertKnots__SWIG_1(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, ParametricTolerance);
  }

  public void InsertKnots( TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults) {
    OCCwrapJavaJNI.Law_BSpline_InsertKnots__SWIG_2(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults);
  }

  /**
   *  Decrement the knots multiplicity to <M>. If  M is
   *  0 the knot   is  removed. The  Poles  sequence   is
   *  modified.
   * 
   *  As there are two ways to  compute the new poles the
   *  average is  computed if  the distance is lower than
   *  the <Tolerance>, else False is returned.
   * 
   *  A low tolerance is used to prevent the modification
   *  of the curve.
   * 
   *  A high tolerance is used to "smooth" the curve.
   * 
   *  Raised if Index is not in the range
   *  [FirstUKnotIndex, LastUKnotIndex]
   *  pole insertion and pole removing
   *  this operation is limited to the Uniform or QuasiUniform
   *  BSplineCurve. The knot values are modified . If the BSpline is
   *  NonUniform or Piecewise Bezier an exception Construction error
   *  is raised.
   */
  public long RemoveKnot(int Index, int M, double Tolerance) {
    return OCCwrapJavaJNI.Law_BSpline_RemoveKnot(swigCPtr, this, Index, M, Tolerance);
  }

  /**
   *  Changes the direction of parametrization of <me>. The Knot
   *  sequence is modified, the FirstParameter and the
   *  LastParameter are not modified. The StartPoint of the
   *  initial curve becomes the EndPoint of the reversed curve
   *  and the EndPoint of the initial curve becomes the StartPoint
   *  of the reversed curve.
   */
  public void Reverse() {
    OCCwrapJavaJNI.Law_BSpline_Reverse(swigCPtr, this);
  }

  /**
   *  Returns the  parameter on the  reversed  curve for
   *  the point of parameter U on <me>.
   * 
   *  returns UFirst + ULast - U
   */
  public double ReversedParameter(double U) {
    return OCCwrapJavaJNI.Law_BSpline_ReversedParameter(swigCPtr, this, U);
  }

  /**
   *  Segments the curve between U1 and U2.
   *  The control points are modified, the first and the last point
   *  are not the same.
   *  Warnings :
   *  Even if <me> is not closed it can become closed after the
   *  segmentation for example if U1 or U2 are out of the bounds
   *  of the curve <me> or if the curve makes loop.
   *  After the segmentation the length of a curve can be null.
   *  raises if U2 < U1.
   */
  public void Segment(double U1, double U2) {
    OCCwrapJavaJNI.Law_BSpline_Segment(swigCPtr, this, U1, U2);
  }

  /**
   *  Changes the knot of range Index.
   *  The multiplicity of the knot is not modified.
   *  Raised if K >= Knots(Index+1) or K <= Knots(Index-1).
   *  Raised if Index < 1 || Index > NbKnots
   */
  public void SetKnot(int Index, double K) {
    OCCwrapJavaJNI.Law_BSpline_SetKnot__SWIG_0(swigCPtr, this, Index, K);
  }

  /**
   *  Changes all the knots of the curve
   *  The multiplicity of the knots are not modified.
   * 
   *  Raised if there is an index such that K (Index+1) <= K (Index).
   * 
   *  Raised if  K.Lower() < 1 or K.Upper() > NbKnots
   */
  public void SetKnots( TColStd_Array1OfReal  K) {
    OCCwrapJavaJNI.Law_BSpline_SetKnots(swigCPtr, this, TColStd_Array1OfReal.getCPtr(K), K);
  }

  /**
   *  Changes the knot of range Index with its multiplicity.
   *  You can increase the multiplicity of a knot but it is
   *  not allowed to decrease the multiplicity of an existing knot.
   * 
   *  Raised if K >= Knots(Index+1) or K <= Knots(Index-1).
   *  Raised if M is greater than Degree or lower than the previous
   *  multiplicity of knot of range Index.
   *  Raised if Index < 1 || Index > NbKnots
   */
  public void SetKnot(int Index, double K, int M) {
    OCCwrapJavaJNI.Law_BSpline_SetKnot__SWIG_1(swigCPtr, this, Index, K, M);
  }

  /**
   *  returns the parameter normalized within
   *  the period if the curve is periodic : otherwise
   *  does not do anything
   */
  public void PeriodicNormalization(double[] U) {
    OCCwrapJavaJNI.Law_BSpline_PeriodicNormalization(swigCPtr, this, U);
  }

  /**
   *  Makes a closed B-spline into a periodic curve. The curve is
   *  periodic if the knot sequence is periodic and if the curve is
   *  closed (The tolerance criterion is Resolution from gp).
   *  The period T is equal to Knot(LastUKnotIndex) -
   *  Knot(FirstUKnotIndex). A periodic B-spline can be uniform
   *  or not.
   *  Raised if the curve is not closed.
   */
  public void SetPeriodic() {
    OCCwrapJavaJNI.Law_BSpline_SetPeriodic(swigCPtr, this);
  }

  /**
   *  Set the origin of a periodic curve at Knot(index)
   *  KnotVector and poles are modified.
   *  Raised if the curve is not periodic
   *  Raised if index not in the range
   *  [FirstUKnotIndex , LastUKnotIndex]
   */
  public void SetOrigin(int Index) {
    OCCwrapJavaJNI.Law_BSpline_SetOrigin(swigCPtr, this, Index);
  }

  /**
   *  Makes a non periodic curve. If the curve was non periodic
   *  the curve is not modified.
   */
  public void SetNotPeriodic() {
    OCCwrapJavaJNI.Law_BSpline_SetNotPeriodic(swigCPtr, this);
  }

  /**
   *  Substitutes the Pole of range Index with P.
   * 
   *  Raised if Index < 1 || Index > NbPoles
   */
  public void SetPole(int Index, double P) {
    OCCwrapJavaJNI.Law_BSpline_SetPole__SWIG_0(swigCPtr, this, Index, P);
  }

  /**
   *  Substitutes the pole and the weight of range Index.
   *  If the curve <me> is not rational it can become rational
   *  If the curve was rational it can become non rational
   * 
   *  Raised if Index < 1 || Index > NbPoles
   *  Raised if Weight <= 0.0
   */
  public void SetPole(int Index, double P, double Weight) {
    OCCwrapJavaJNI.Law_BSpline_SetPole__SWIG_1(swigCPtr, this, Index, P, Weight);
  }

  /**
   *  Changes the weight for the pole of range Index.
   *  If the curve was non rational it can become rational.
   *  If the curve was rational it can become non rational.
   * 
   *  Raised if Index < 1 || Index > NbPoles
   *  Raised if Weight <= 0.0
   */
  public void SetWeight(int Index, double Weight) {
    OCCwrapJavaJNI.Law_BSpline_SetWeight(swigCPtr, this, Index, Weight);
  }

  /**
   *  Returns the continuity of the curve, the curve is at least C0.
   *  Raised if N < 0.
   */
  public long IsCN(int N) {
    return OCCwrapJavaJNI.Law_BSpline_IsCN(swigCPtr, this, N);
  }

  /**
   *  Returns true if the distance between the first point and the
   *  last point of the curve is lower or equal to Resolution
   *  from package gp.
   *  Warnings :
   *  The first and the last point can be different from the first
   *  pole and the last pole of the curve.
   */
  public long IsClosed() {
    return OCCwrapJavaJNI.Law_BSpline_IsClosed(swigCPtr, this);
  }

  /**
   *  Returns True if the curve is periodic.
   */
  public long IsPeriodic() {
    return OCCwrapJavaJNI.Law_BSpline_IsPeriodic(swigCPtr, this);
  }

  /**
   *  Returns True if the weights are not identical.
   *  The tolerance criterion is Epsilon of the class Real.
   */
  public long IsRational() {
    return OCCwrapJavaJNI.Law_BSpline_IsRational(swigCPtr, this);
  }

  /**
   *  Returns the global continuity of the curve :
   *  C0 : only geometric continuity,
   *  C1 : continuity of the first derivative all along the Curve,
   *  C2 : continuity of the second derivative all along the Curve,
   *  C3 : continuity of the third derivative all along the Curve,
   *  CN : the order of continuity is infinite.
   *  For a B-spline curve of degree d if a knot Ui has a
   *  multiplicity p the B-spline curve is only Cd-p continuous
   *  at Ui. So the global continuity of the curve can't be greater
   *  than Cd-p where p is the maximum multiplicity of the interior
   *  Knots. In the interior of a knot span the curve is infinitely
   *  continuously differentiable.
   */
  public GeomAbs_Shape Continuity() {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.Law_BSpline_Continuity(swigCPtr, this));
  }

  /**
   *  Computation of value and derivatives
   */
  public int Degree() {
    return OCCwrapJavaJNI.Law_BSpline_Degree(swigCPtr, this);
  }

  public double Value(double U) {
    return OCCwrapJavaJNI.Law_BSpline_Value(swigCPtr, this, U);
  }

  public void D0(double U, double[] P) {
    OCCwrapJavaJNI.Law_BSpline_D0(swigCPtr, this, U, P);
  }

  public void D1(double U, double[] P, double[] V1) {
    OCCwrapJavaJNI.Law_BSpline_D1(swigCPtr, this, U, P, V1);
  }

  public void D2(double U, double[] P, double[] V1, double[] V2) {
    OCCwrapJavaJNI.Law_BSpline_D2(swigCPtr, this, U, P, V1, V2);
  }

  public void D3(double U, double[] P, double[] V1, double[] V2, double[] V3) {
    OCCwrapJavaJNI.Law_BSpline_D3(swigCPtr, this, U, P, V1, V2, V3);
  }

  /**
   *  The following functions computes the point  of parameter U and
   *  the  derivatives at   this  point on  the  B-spline curve  arc
   *  defined between the knot FromK1  and the knot  ToK2.  U can be
   *  out of bounds   [Knot  (FromK1), Knot   (ToK2)] but   for  the
   *  computation we only  use  the definition of the  curve between
   *  these  two  knots. This  method is  useful  to  compute  local
   *  derivative,  if the order of  continuity of the whole curve is
   *  not   greater  enough.   Inside   the parametric   domain Knot
   *  (FromK1), Knot (ToK2)  the evaluations are the  same as if  we
   *  consider  the whole  definition of the  curve.   Of course the
   *  evaluations are different outside this parametric domain.
   */
  public double DN(double U, int N) {
    return OCCwrapJavaJNI.Law_BSpline_DN(swigCPtr, this, U, N);
  }

  public double LocalValue(double U, int FromK1, int ToK2) {
    return OCCwrapJavaJNI.Law_BSpline_LocalValue(swigCPtr, this, U, FromK1, ToK2);
  }

  public void LocalD0(double U, int FromK1, int ToK2, double[] P) {
    OCCwrapJavaJNI.Law_BSpline_LocalD0(swigCPtr, this, U, FromK1, ToK2, P);
  }

  public void LocalD1(double U, int FromK1, int ToK2, double[] P, double[] V1) {
    OCCwrapJavaJNI.Law_BSpline_LocalD1(swigCPtr, this, U, FromK1, ToK2, P, V1);
  }

  public void LocalD2(double U, int FromK1, int ToK2, double[] P, double[] V1, double[] V2) {
    OCCwrapJavaJNI.Law_BSpline_LocalD2(swigCPtr, this, U, FromK1, ToK2, P, V1, V2);
  }

  public void LocalD3(double U, int FromK1, int ToK2, double[] P, double[] V1, double[] V2, double[] V3) {
    OCCwrapJavaJNI.Law_BSpline_LocalD3(swigCPtr, this, U, FromK1, ToK2, P, V1, V2, V3);
  }

  public double LocalDN(double U, int FromK1, int ToK2, int N) {
    return OCCwrapJavaJNI.Law_BSpline_LocalDN(swigCPtr, this, U, FromK1, ToK2, N);
  }

  /**
   *  Returns the last point of the curve.
   *  Warnings :
   *  The last point of the curve is different from the last
   *  pole of the curve if the multiplicity of the last knot
   *  is lower than Degree.
   */
  public double EndPoint() {
    return OCCwrapJavaJNI.Law_BSpline_EndPoint(swigCPtr, this);
  }

  /**
   *  For a B-spline curve the first parameter (which gives the start
   *  point of the curve) is a knot value but if the multiplicity of
   *  the first knot index is lower than Degree + 1 it is not the
   *  first knot of the curve. This method computes the index of the
   *  knot corresponding to the first parameter.
   */
  public int FirstUKnotIndex() {
    return OCCwrapJavaJNI.Law_BSpline_FirstUKnotIndex(swigCPtr, this);
  }

  /**
   *  Computes the parametric value of the start point of the curve.
   *  It is a knot value.
   */
  public double FirstParameter() {
    return OCCwrapJavaJNI.Law_BSpline_FirstParameter(swigCPtr, this);
  }

  /**
   *  Returns the knot of range Index. When there is a knot
   *  with a multiplicity greater than 1 the knot is not repeated.
   *  The method Multiplicity can be used to get the multiplicity
   *  of the Knot.
   *  Raised if Index < 1 or Index > NbKnots
   */
  public double Knot(int Index) {
    return OCCwrapJavaJNI.Law_BSpline_Knot(swigCPtr, this, Index);
  }

  /**
   *  returns the knot values of the B-spline curve;
   * 
   *  Raised if the length of K is not equal to the number of knots.
   */
  public void Knots( TColStd_Array1OfReal  K) {
    OCCwrapJavaJNI.Law_BSpline_Knots(swigCPtr, this, TColStd_Array1OfReal.getCPtr(K), K);
  }

  /**
   *  Returns the knots sequence.
   *  In this sequence the knots with a multiplicity greater than 1
   *  are repeated.
   *  Example :
   *  K = {k1, k1, k1, k2, k3, k3, k4, k4, k4}
   * 
   *  Raised if the length of K is not equal to NbPoles + Degree + 1
   */
  public void KnotSequence( TColStd_Array1OfReal  K) {
    OCCwrapJavaJNI.Law_BSpline_KnotSequence(swigCPtr, this, TColStd_Array1OfReal.getCPtr(K), K);
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
    return GeomAbs_BSplKnotDistribution.swigToEnum(OCCwrapJavaJNI.Law_BSpline_KnotDistribution(swigCPtr, this));
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
    return OCCwrapJavaJNI.Law_BSpline_LastUKnotIndex(swigCPtr, this);
  }

  /**
   *  Computes the parametric value of the end point of the curve.
   *  It is a knot value.
   */
  public double LastParameter() {
    return OCCwrapJavaJNI.Law_BSpline_LastParameter(swigCPtr, this);
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
    OCCwrapJavaJNI.Law_BSpline_LocateU__SWIG_0(swigCPtr, this, U, ParametricTolerance, I1, I2, WithKnotRepetition);
  }

  public void LocateU(double U, double ParametricTolerance, int[] I1, int[] I2) {
    OCCwrapJavaJNI.Law_BSpline_LocateU__SWIG_1(swigCPtr, this, U, ParametricTolerance, I1, I2);
  }

  /**
   *  Returns the multiplicity of the knots of range Index.
   *  Raised if Index < 1 or Index > NbKnots
   */
  public int Multiplicity(int Index) {
    return OCCwrapJavaJNI.Law_BSpline_Multiplicity(swigCPtr, this, Index);
  }

  /**
   *  Returns the multiplicity of the knots of the curve.
   * 
   *  Raised if the length of M is not equal to NbKnots.
   */
  public void Multiplicities( TColStd_Array1OfInteger  M) {
    OCCwrapJavaJNI.Law_BSpline_Multiplicities(swigCPtr, this, TColStd_Array1OfInteger.getCPtr(M), M);
  }

  /**
   *  Returns the number of knots. This method returns the number of
   *  knot without repetition of multiple knots.
   */
  public int NbKnots() {
    return OCCwrapJavaJNI.Law_BSpline_NbKnots(swigCPtr, this);
  }

  /**
   *  Returns the number of poles
   */
  public int NbPoles() {
    return OCCwrapJavaJNI.Law_BSpline_NbPoles(swigCPtr, this);
  }

  /**
   *  Returns the pole of range Index.
   *  Raised if Index < 1 or Index > NbPoles.
   */
  public double Pole(int Index) {
    return OCCwrapJavaJNI.Law_BSpline_Pole(swigCPtr, this, Index);
  }

  /**
   *  Returns the poles of the B-spline curve;
   * 
   *  Raised if the length of P is not equal to the number of poles.
   */
  public void Poles( TColStd_Array1OfReal  P) {
    OCCwrapJavaJNI.Law_BSpline_Poles(swigCPtr, this, TColStd_Array1OfReal.getCPtr(P), P);
  }

  /**
   *  Returns the start point of the curve.
   *  Warnings :
   *  This point is different from the first pole of the curve if the
   *  multiplicity of the first knot is lower than Degree.
   */
  public double StartPoint() {
    return OCCwrapJavaJNI.Law_BSpline_StartPoint(swigCPtr, this);
  }

  /**
   *  Returns the weight of the pole of range Index .
   *  Raised if Index < 1 or Index > NbPoles.
   */
  public double Weight(int Index) {
    return OCCwrapJavaJNI.Law_BSpline_Weight(swigCPtr, this, Index);
  }

  /**
   *  Returns the weights of the B-spline curve;
   * 
   *  Raised if the length of W is not equal to NbPoles.
   */
  public void Weights( TColStd_Array1OfReal  W) {
    OCCwrapJavaJNI.Law_BSpline_Weights(swigCPtr, this, TColStd_Array1OfReal.getCPtr(W), W);
  }

  /**
   *  Returns the value of the maximum degree of the normalized
   *  B-spline basis functions in this package.
   */
  public static int MaxDegree() {
    return OCCwrapJavaJNI.Law_BSpline_MaxDegree();
  }

  /**
   *  Changes the value of the Law at parameter U to NewValue.
   *  and makes its derivative at U be derivative.
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
  public void MovePointAndTangent(double U, double NewValue, double Derivative, double Tolerance, int StartingCondition, int EndingCondition, int[] ErrorStatus) {
    OCCwrapJavaJNI.Law_BSpline_MovePointAndTangent(swigCPtr, this, U, NewValue, Derivative, Tolerance, StartingCondition, EndingCondition, ErrorStatus);
  }

  /**
   *  given Tolerance3D returns UTolerance
   *  such that if f(t) is the curve we have
   *  | t1 - t0| < Utolerance ===>
   *  |f(t1) - f(t0)| < Tolerance3D
   */
  public void Resolution(double Tolerance3D, double[] UTolerance) {
    OCCwrapJavaJNI.Law_BSpline_Resolution(swigCPtr, this, Tolerance3D, UTolerance);
  }

  public  Law_BSpline  Copy() {
    return new Law_BSpline ( OCCwrapJavaJNI.Law_BSpline_Copy(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Law_BSpline_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Law_BSpline_get_type_descriptor(), true );
  }

  public static  Law_BSpline  DownCast( Standard_Transient  T) {
    return new Law_BSpline ( OCCwrapJavaJNI.Law_BSpline_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Law_BSpline_TypeOf(), true );
  }

}
