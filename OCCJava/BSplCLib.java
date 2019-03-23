package opencascade;

/**
 *  BSplCLib   B-spline curve Library.
 * 
 *  The BSplCLib package is  a basic library  for BSplines. It
 *  provides three categories of functions.
 * 
 *  * Management methods to  process knots and multiplicities.
 * 
 *  * Multi-Dimensions  spline methods.  BSpline methods where
 *  poles have an arbitrary number of dimensions. They divides
 *  in two groups :
 * 
 *  - Global methods modifying the  whole set of  poles. The
 *  poles are    described   by an array   of   Reals and  a
 *  Dimension. Example : Inserting knots.
 * 
 *  - Local methods  computing  points and derivatives.  The
 *  poles  are described by a pointer  on  a local array  of
 *  Reals and a Dimension. The local array is modified.
 * 
 *  *  2D  and 3D spline   curves  methods.
 * 
 *  Methods  for 2d and 3d BSplines  curves  rational or not
 *  rational.
 * 
 *  Those methods have the following structure :
 * 
 *  - They extract the pole informations in a working array.
 * 
 *  -  They      process the  working   array    with   the
 *  multi-dimension  methods. (for example  a  3d  rational
 *  curve is processed as a 4 dimension curve).
 * 
 *  - They get back the result in the original dimension.
 * 
 *  Note that the  bspline   surface methods found   in the
 *  package BSplSLib  uses  the same  structure and rely on
 *  BSplCLib.
 * 
 *  In the following list  of methods the  2d and 3d  curve
 *  methods   will be  described   with  the  corresponding
 *  multi-dimension method.
 * 
 *  The 3d or 2d B-spline curve is defined with :
 * 
 *  . its control points : TColgp_Array1OfPnt(2d)        Poles
 *  . its weights        : TColStd_Array1OfReal          Weights
 *  . its knots          : TColStd_Array1OfReal          Knots
 *  . its multiplicities : TColStd_Array1OfInteger       Mults
 *  . its degree         : Standard_Integer              Degree
 *  . its periodicity    : Standard_Boolean              Periodic
 * 
 *  Warnings :
 *  The bounds of Poles and Weights should be the same.
 *  The bounds of Knots and Mults   should be the same.
 * 
 *  Note: weight and multiplicity arrays can be passed by pointer for
 *  some functions so that NULL pointer is valid.
 *  That means no weights/no multiplicities passed.
 * 
 *  No weights (BSplCLib::NoWeights()) means the curve is non rational.
 *  No mults (BSplCLib::NoMults()) means the knots are "flat" knots.
 * 
 *  KeyWords :
 *  B-spline curve, Functions, Library
 * 
 *  References :
 *  . A survey of curves and surfaces methods in CADG Wolfgang
 *  BOHM CAGD 1 (1984)
 *  . On de Boor-like algorithms and blossoming Wolfgang BOEHM
 *  cagd 5 (1988)
 *  . Blossoming and knot insertion algorithms for B-spline curves
 *  Ronald N. GOLDMAN
 *  . Modelisation des surfaces en CAO, Henri GIAUME Peugeot SA
 *  . Curves and Surfaces for Computer Aided Geometric Design,
 *  a practical guide Gerald Farin
 */
public class BSplCLib {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BSplCLib(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BSplCLib(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BSplCLib obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BSplCLib(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  This routine searches the position of the real
   *  value X in  the ordered set of  real  values XX.
   * 
   *  The  elements   in   the  table    XX  are   either
   *  monotonically    increasing     or    monotonically
   *  decreasing.
   * 
   *  The input   value Iloc is    used to initialize the
   *  algorithm  :  if  Iloc  is outside  of   the bounds
   *  [XX.Lower(), -- XX.Upper()] the bisection algorithm
   *  is used else  the routine searches from  a previous
   *  known position  by increasing steps  then converges
   *  by bisection.
   * 
   *  This  routine is used to  locate a  knot value in a
   *  set of knots.
   */
  public static void Hunt( TColStd_Array1OfReal  XX, double X, int[] Iloc) {
    OCCwrapJavaJNI.BSplCLib_Hunt(TColStd_Array1OfReal.getCPtr(XX), XX, X, Iloc);
  }

  /**
   *  Computes the index of the knots value which gives
   *  the start point of the curve.
   */
  public static int FirstUKnotIndex(int Degree,  TColStd_Array1OfInteger  Mults) {
    return OCCwrapJavaJNI.BSplCLib_FirstUKnotIndex(Degree, TColStd_Array1OfInteger.getCPtr(Mults), Mults);
  }

  /**
   *  Computes the index of the knots value which gives
   *  the end point of the curve.
   */
  public static int LastUKnotIndex(int Degree,  TColStd_Array1OfInteger  Mults) {
    return OCCwrapJavaJNI.BSplCLib_LastUKnotIndex(Degree, TColStd_Array1OfInteger.getCPtr(Mults), Mults);
  }

  /**
   *  Computes the index  of  the  flats knots  sequence
   *  corresponding  to  <Index> in  the  knots sequence
   *  which multiplicities are <Mults>.
   */
  public static int FlatIndex(int Degree, int Index,  TColStd_Array1OfInteger  Mults, long Periodic) {
    return OCCwrapJavaJNI.BSplCLib_FlatIndex(Degree, Index, TColStd_Array1OfInteger.getCPtr(Mults), Mults, Periodic);
  }

  /**
   *  Locates  the parametric value    U  in the knots
   *  sequence  between  the  knot K1   and the knot  K2.
   *  The value return in Index verifies.
   * 
   *  Knots(Index) <= U < Knots(Index + 1)
   *  if U <= Knots (K1) then Index = K1
   *  if U >= Knots (K2) then Index = K2 - 1
   * 
   *  If Periodic is True U  may be  modified  to fit in
   *  the range  Knots(K1), Knots(K2).  In any case  the
   *  correct value is returned in NewU.
   * 
   *  Warnings :Index is used  as input   data to initialize  the
   *  searching  function.
   *  Warning: Knots have to be "withe repetitions"
   */
  public static void LocateParameter(int Degree,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults, double U, long IsPeriodic, int FromK1, int ToK2, int[] KnotIndex, double[] NewU) {
    OCCwrapJavaJNI.BSplCLib_LocateParameter__SWIG_0(Degree, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, U, IsPeriodic, FromK1, ToK2, KnotIndex, NewU);
  }

  /**
   *  Locates  the parametric value    U  in the knots
   *  sequence  between  the  knot K1   and the knot  K2.
   *  The value return in Index verifies.
   * 
   *  Knots(Index) <= U < Knots(Index + 1)
   *  if U <= Knots (K1) then Index = K1
   *  if U >= Knots (K2) then Index = K2 - 1
   * 
   *  If Periodic is True U  may be  modified  to fit in
   *  the range  Knots(K1), Knots(K2).  In any case  the
   *  correct value is returned in NewU.
   * 
   *  Warnings :Index is used  as input   data to initialize  the
   *  searching  function.
   *  Warning: Knots have to be "flat"
   */
  public static void LocateParameter(int Degree,  TColStd_Array1OfReal  Knots, double U, long IsPeriodic, int FromK1, int ToK2, int[] KnotIndex, double[] NewU) {
    OCCwrapJavaJNI.BSplCLib_LocateParameter__SWIG_1(Degree, TColStd_Array1OfReal.getCPtr(Knots), Knots, U, IsPeriodic, FromK1, ToK2, KnotIndex, NewU);
  }

  public static void LocateParameter(int Degree,  TColStd_Array1OfReal  Knots, TColStd_Array1OfInteger Mults, double U, long Periodic, int[] Index, double[] NewU) {
    OCCwrapJavaJNI.BSplCLib_LocateParameter__SWIG_2(Degree, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, U, Periodic, Index, NewU);
  }

  /**
   *  Finds the greatest multiplicity in a set of knots
   *  between  K1  and K2.   Mults  is  the  multiplicity
   *  associated with each knot value.
   */
  public static int MaxKnotMult( TColStd_Array1OfInteger  Mults, int K1, int K2) {
    return OCCwrapJavaJNI.BSplCLib_MaxKnotMult(TColStd_Array1OfInteger.getCPtr(Mults), Mults, K1, K2);
  }

  /**
   *  Finds the lowest multiplicity in  a  set of knots
   *  between   K1  and K2.   Mults is  the  multiplicity
   *  associated with each knot value.
   */
  public static int MinKnotMult( TColStd_Array1OfInteger  Mults, int K1, int K2) {
    return OCCwrapJavaJNI.BSplCLib_MinKnotMult(TColStd_Array1OfInteger.getCPtr(Mults), Mults, K1, K2);
  }

  /**
   *  Returns the number of poles of the curve. Returns 0 if
   *  one of the multiplicities is incorrect.
   * 
   *  * Non positive.
   * 
   *  * Greater than Degree,  or  Degree+1  at the first and
   *  last knot of a non periodic curve.
   * 
   *  *  The  last periodicity  on  a periodic  curve is not
   *  equal to the first.
   */
  public static int NbPoles(int Degree, long Periodic,  TColStd_Array1OfInteger  Mults) {
    return OCCwrapJavaJNI.BSplCLib_NbPoles(Degree, Periodic, TColStd_Array1OfInteger.getCPtr(Mults), Mults);
  }

  /**
   *  Returns the length  of the sequence  of knots with
   *  repetition.
   * 
   *  Periodic :
   * 
   *  Sum(Mults(i), i = Mults.Lower(); i <= Mults.Upper());
   * 
   *  Non Periodic :
   * 
   *  Sum(Mults(i); i = Mults.Lower(); i < Mults.Upper())
   *  + 2 * Degree
   */
  public static int KnotSequenceLength( TColStd_Array1OfInteger  Mults, int Degree, long Periodic) {
    return OCCwrapJavaJNI.BSplCLib_KnotSequenceLength(TColStd_Array1OfInteger.getCPtr(Mults), Mults, Degree, Periodic);
  }

  public static void KnotSequence( TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  KnotSeq, long Periodic) {
    OCCwrapJavaJNI.BSplCLib_KnotSequence__SWIG_0(TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(KnotSeq), KnotSeq, Periodic);
  }

  /**
   *  Computes  the  sequence   of knots KnotSeq  with
   *  repetition  of the  knots  of multiplicity  greater
   *  than 1.
   * 
   *  Length of KnotSeq must be KnotSequenceLength(Mults,Degree,Periodic)
   */
  public static void KnotSequence( TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  KnotSeq) {
    OCCwrapJavaJNI.BSplCLib_KnotSequence__SWIG_1(TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(KnotSeq), KnotSeq);
  }

  public static void KnotSequence( TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults, int Degree, long Periodic,  TColStd_Array1OfReal  KnotSeq) {
    OCCwrapJavaJNI.BSplCLib_KnotSequence__SWIG_2(TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, Degree, Periodic, TColStd_Array1OfReal.getCPtr(KnotSeq), KnotSeq);
  }

  /**
   *  Returns the  length  of the   sequence of  knots  (and
   *  Mults)  without repetition.
   */
  public static int KnotsLength( TColStd_Array1OfReal  KnotSeq, long Periodic) {
    return OCCwrapJavaJNI.BSplCLib_KnotsLength__SWIG_0(TColStd_Array1OfReal.getCPtr(KnotSeq), KnotSeq, Periodic);
  }

  public static int KnotsLength( TColStd_Array1OfReal  KnotSeq) {
    return OCCwrapJavaJNI.BSplCLib_KnotsLength__SWIG_1(TColStd_Array1OfReal.getCPtr(KnotSeq), KnotSeq);
  }

  /**
   *  Computes  the  sequence   of knots Knots  without
   *  repetition  of the  knots  of multiplicity  greater
   *  than 1.
   * 
   *  Length  of <Knots> and  <Mults> must be
   *  KnotsLength(KnotSequence,Periodic)
   */
  public static void Knots( TColStd_Array1OfReal  KnotSeq,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults, long Periodic) {
    OCCwrapJavaJNI.BSplCLib_Knots__SWIG_0(TColStd_Array1OfReal.getCPtr(KnotSeq), KnotSeq, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, Periodic);
  }

  public static void Knots( TColStd_Array1OfReal  KnotSeq,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults) {
    OCCwrapJavaJNI.BSplCLib_Knots__SWIG_1(TColStd_Array1OfReal.getCPtr(KnotSeq), KnotSeq, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults);
  }

  /**
   *  Analyses if the  knots distribution is "Uniform"
   *  or  "NonUniform" between  the  knot  FromK1 and the
   *  knot ToK2.  There is  no repetition of  knot in the
   *  knots'sequence <Knots>.
   */
  public static SWIGTYPE_p_BSplCLib_KnotDistribution KnotForm( TColStd_Array1OfReal  Knots, int FromK1, int ToK2) {
    return new SWIGTYPE_p_BSplCLib_KnotDistribution(OCCwrapJavaJNI.BSplCLib_KnotForm(TColStd_Array1OfReal.getCPtr(Knots), Knots, FromK1, ToK2), true);
  }

  /**
   *  Analyses the distribution of multiplicities between
   *  the knot FromK1 and the Knot ToK2.
   */
  public static SWIGTYPE_p_BSplCLib_MultDistribution MultForm( TColStd_Array1OfInteger  Mults, int FromK1, int ToK2) {
    return new SWIGTYPE_p_BSplCLib_MultDistribution(OCCwrapJavaJNI.BSplCLib_MultForm(TColStd_Array1OfInteger.getCPtr(Mults), Mults, FromK1, ToK2), true);
  }

  /**
   *  Analyzes the array of knots.
   *  Returns the form and the maximum knot multiplicity.
   */
  public static void KnotAnalysis(int Degree, long Periodic,  TColStd_Array1OfReal  CKnots,  TColStd_Array1OfInteger  CMults, SWIGTYPE_p_GeomAbs_BSplKnotDistribution KnotForm, int[] MaxKnotMult) {
    OCCwrapJavaJNI.BSplCLib_KnotAnalysis(Degree, Periodic, TColStd_Array1OfReal.getCPtr(CKnots), CKnots, TColStd_Array1OfInteger.getCPtr(CMults), CMults, SWIGTYPE_p_GeomAbs_BSplKnotDistribution.getCPtr(KnotForm), MaxKnotMult);
  }

  /**
   *  Reparametrizes a B-spline curve to [U1, U2].
   *  The knot values are recomputed such that Knots (Lower) = U1
   *  and Knots (Upper) = U2   but the knot form is not modified.
   *  Warnings :
   *  In the array Knots the values must be in ascending order.
   *  U1 must not be equal to U2 to avoid division by zero.
   */
  public static void Reparametrize(double U1, double U2,  TColStd_Array1OfReal  Knots) {
    OCCwrapJavaJNI.BSplCLib_Reparametrize(U1, U2, TColStd_Array1OfReal.getCPtr(Knots), Knots);
  }

  /**
   *  Reverses  the  array   knots  to  become  the knots
   *  sequence of the reversed curve.
   */
  public static void Reverse( TColStd_Array1OfReal  Knots) {
    OCCwrapJavaJNI.BSplCLib_Reverse__SWIG_0(TColStd_Array1OfReal.getCPtr(Knots), Knots);
  }

  /**
   *  Reverses  the  array of multiplicities.
   */
  public static void Reverse( TColStd_Array1OfInteger  Mults) {
    OCCwrapJavaJNI.BSplCLib_Reverse__SWIG_1(TColStd_Array1OfInteger.getCPtr(Mults), Mults);
  }

  /**
   *  Reverses the array of poles. Last is the  index of
   *  the new first pole. On  a  non periodic curve last
   *  is Poles.Upper(). On a periodic curve last is
   * 
   *  (number of flat knots - degree - 1)
   * 
   *  or
   * 
   *  (sum of multiplicities(but  for the last) + degree
   *  - 1)
   */
  public static void Reverse( TColgp_Array1OfPnt  Poles, int Last) {
    OCCwrapJavaJNI.BSplCLib_Reverse__SWIG_2(TColgp_Array1OfPnt.getCPtr(Poles), Poles, Last);
  }

  /**
   *  Reverses the array of poles.
   */
  public static void Reverse( TColgp_Array1OfPnt2d  Poles, int Last) {
    OCCwrapJavaJNI.BSplCLib_Reverse__SWIG_3(TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, Last);
  }

  /**
   *  Reverses the array of poles.
   */
  public static void Reverse( TColStd_Array1OfReal  Weights, int Last) {
    OCCwrapJavaJNI.BSplCLib_Reverse__SWIG_4(TColStd_Array1OfReal.getCPtr(Weights), Weights, Last);
  }

  /**
   *  Returns False if all the weights  of the  array <Weights>
   *  between   I1 an I2   are  identic.   Epsilon  is used for
   *  comparing  weights. If Epsilon  is 0. the  Epsilon of the
   *  first weight is used.
   */
  public static long IsRational( TColStd_Array1OfReal  Weights, int I1, int I2, double Epsilon) {
    return OCCwrapJavaJNI.BSplCLib_IsRational__SWIG_0(TColStd_Array1OfReal.getCPtr(Weights), Weights, I1, I2, Epsilon);
  }

  public static long IsRational( TColStd_Array1OfReal  Weights, int I1, int I2) {
    return OCCwrapJavaJNI.BSplCLib_IsRational__SWIG_1(TColStd_Array1OfReal.getCPtr(Weights), Weights, I1, I2);
  }

  /**
   *  returns the degree maxima for a BSplineCurve.
   */
  public static int MaxDegree() {
    return OCCwrapJavaJNI.BSplCLib_MaxDegree();
  }

  /**
   *  Perform the Boor  algorithm  to  evaluate a point at
   *  parameter <U>, with <Degree> and <Dimension>.
   * 
   *  Poles is  an array of  Reals of size
   * 
   *  <Dimension> *  <Degree>+1
   * 
   *  Containing  the poles.  At  the end <Poles> contains
   *  the current point.
   */
  public static void Eval(double U, int Degree, double[] Knots, int Dimension, double[] Poles) {
    OCCwrapJavaJNI.BSplCLib_Eval__SWIG_0(U, Degree, Knots, Dimension, Poles);
  }

  /**
   *  Performs the  Boor Algorithm  at  parameter <U> with
   *  the given <Degree> and the  array of <Knots> on  the
   *  poles <Poles> of dimension  <Dimension>.  The schema
   *  is  computed  until  level  <Depth>  on a   basis of
   *  <Length+1> poles.
   * 
   *  * Knots is an array of reals of length :
   * 
   *  <Length> + <Degree>
   * 
   *  * Poles is an array of reals of length :
   * 
   *  (2 * <Length> + 1) * <Dimension>
   * 
   *  The poles values  must be  set  in the array at the
   *  positions.
   * 
   *  0..Dimension,
   * 
   *  2 * Dimension ..
   *  3 * Dimension
   * 
   *  4  * Dimension ..
   *  5  * Dimension
   * 
   *  ...
   * 
   *  The results are found in the array poles depending
   *  on the Depth. (See the method GetPole).
   */
  public static void BoorScheme(double U, int Degree, double[] Knots, int Dimension, double[] Poles, int Depth, int Length) {
    OCCwrapJavaJNI.BSplCLib_BoorScheme(U, Degree, Knots, Dimension, Poles, Depth, Length);
  }

  /**
   *  Compute  the content of  Pole before the BoorScheme.
   *  This method is used to remove poles.
   * 
   *  U is the poles to  remove, Knots should contains the
   *  knots of the curve after knot removal.
   * 
   *  The first  and last poles  do not  change, the other
   *  poles are computed by averaging two possible values.
   *  The distance between  the  two   possible  poles  is
   *  computed, if it  is higher than <Tolerance> False is
   *  returned.
   */
  public static long AntiBoorScheme(double U, int Degree, double[] Knots, int Dimension, double[] Poles, int Depth, int Length, double Tolerance) {
    return OCCwrapJavaJNI.BSplCLib_AntiBoorScheme(U, Degree, Knots, Dimension, Poles, Depth, Length, Tolerance);
  }

  /**
   *  Computes   the   poles of  the    BSpline  giving the
   *  derivatives of order <Order>.
   * 
   *  The formula for the first order is
   * 
   *  Pole(i) = Degree * (Pole(i+1) - Pole(i)) /
   *  (Knots(i+Degree+1) - Knots(i+1))
   * 
   *  This formula  is repeated  (Degree  is decremented at
   *  each step).
   */
  public static void Derivative(int Degree, double[] Knots, int Dimension, int Length, int Order, double[] Poles) {
    OCCwrapJavaJNI.BSplCLib_Derivative(Degree, Knots, Dimension, Length, Order, Poles);
  }

  /**
   *  Performs the Bohm  Algorithm at  parameter <U>. This
   *  algorithm computes the value and all the derivatives
   *  up to order N (N <= Degree).
   * 
   *  <Poles> is the original array of poles.
   * 
   *  The   result in  <Poles>  is    the value and    the
   *  derivatives.  Poles[0] is  the value,  Poles[Degree]
   *  is the last  derivative.
   */
  public static void Bohm(double U, int Degree, int N, double[] Knots, int Dimension, double[] Poles) {
    OCCwrapJavaJNI.BSplCLib_Bohm(U, Degree, N, Knots, Dimension, Poles);
  }

  /**
   *  Used as argument for a non rational curve.
   */
  public static TColStd_Array1OfReal NoWeights() {
    long cPtr = OCCwrapJavaJNI.BSplCLib_NoWeights();
    return (cPtr == 0) ? null : new TColStd_Array1OfReal(cPtr, false);
  }

  /**
   *  Used as argument for a flatknots evaluation.
   */
  public static TColStd_Array1OfInteger NoMults() {
    long cPtr = OCCwrapJavaJNI.BSplCLib_NoMults();
    return (cPtr == 0) ? null : new TColStd_Array1OfInteger(cPtr, false);
  }

  /**
   *  Stores in LK  the usefull knots  for the BoorSchem
   *  on the span Knots(Index) - Knots(Index+1)
   */
  public static void BuildKnots(int Degree, int Index, long Periodic,  TColStd_Array1OfReal  Knots, TColStd_Array1OfInteger Mults, double[] LK) {
    OCCwrapJavaJNI.BSplCLib_BuildKnots(Degree, Index, Periodic, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, LK);
  }

  /**
   *  Return the index of the  first Pole to  use on the
   *  span  Mults(Index)  - Mults(Index+1).  This  index
   *  must be added to Poles.Lower().
   */
  public static int PoleIndex(int Degree, int Index, long Periodic,  TColStd_Array1OfInteger  Mults) {
    return OCCwrapJavaJNI.BSplCLib_PoleIndex(Degree, Index, Periodic, TColStd_Array1OfInteger.getCPtr(Mults), Mults);
  }

  public static void BuildEval(int Degree, int Index,  TColStd_Array1OfReal  Poles, TColStd_Array1OfReal Weights, double[] LP) {
    OCCwrapJavaJNI.BSplCLib_BuildEval__SWIG_0(Degree, Index, TColStd_Array1OfReal.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, LP);
  }

  public static void BuildEval(int Degree, int Index,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights, double[] LP) {
    OCCwrapJavaJNI.BSplCLib_BuildEval__SWIG_1(Degree, Index, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, LP);
  }

  /**
   *  Copy in <LP>  the poles and  weights for  the Eval
   *  scheme. starting from  Poles(Poles.Lower()+Index)
   */
  public static void BuildEval(int Degree, int Index,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights, double[] LP) {
    OCCwrapJavaJNI.BSplCLib_BuildEval__SWIG_2(Degree, Index, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, LP);
  }

  /**
   *  Copy in <LP>  poles for <Dimension>  Boor  scheme.
   *  Starting  from    <Index>     *  <Dimension>, copy
   *  <Length+1> poles.
   */
  public static void BuildBoor(int Index, int Length, int Dimension,  TColStd_Array1OfReal  Poles, double[] LP) {
    OCCwrapJavaJNI.BSplCLib_BuildBoor(Index, Length, Dimension, TColStd_Array1OfReal.getCPtr(Poles), Poles, LP);
  }

  /**
   *  Returns the index in  the Boor result array of the
   *  poles <Index>. If  the Boor  algorithm was perform
   *  with <Length> and <Depth>.
   */
  public static int BoorIndex(int Index, int Length, int Depth) {
    return OCCwrapJavaJNI.BSplCLib_BoorIndex(Index, Length, Depth);
  }

  /**
   *  Copy  the  pole at  position  <Index>  in  the Boor
   *  scheme of   dimension <Dimension> to  <Position> in
   *  the array <Pole>. <Position> is updated.
   */
  public static void GetPole(int Index, int Length, int Depth, int Dimension, double[] LocPoles, int[] Position,  TColStd_Array1OfReal  Pole) {
    OCCwrapJavaJNI.BSplCLib_GetPole(Index, Length, Depth, Dimension, LocPoles, Position, TColStd_Array1OfReal.getCPtr(Pole), Pole);
  }

  /**
   *  Returns in <NbPoles, NbKnots> the  new number of poles
   *  and  knots    if  the  sequence   of  knots <AddKnots,
   *  AddMults> is inserted in the sequence <Knots, Mults>.
   * 
   *  Epsilon is used to compare knots for equality.
   * 
   *  If Add is True  the multiplicities on  equal knots are
   *  added.
   * 
   *  If Add is False the max value of the multiplicities is
   *  kept.
   * 
   *  Return False if :
   *  The knew knots are knot increasing.
   *  The new knots are not in the range.
   */
  public static long PrepareInsertKnots(int Degree, long Periodic,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  AddKnots, TColStd_Array1OfInteger AddMults, int[] NbPoles, int[] NbKnots, double Epsilon, long Add) {
    return OCCwrapJavaJNI.BSplCLib_PrepareInsertKnots__SWIG_0(Degree, Periodic, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(AddKnots), AddKnots, TColStd_Array1OfInteger.getCPtr(AddMults), AddMults, NbPoles, NbKnots, Epsilon, Add);
  }

  public static long PrepareInsertKnots(int Degree, long Periodic,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  AddKnots, TColStd_Array1OfInteger AddMults, int[] NbPoles, int[] NbKnots, double Epsilon) {
    return OCCwrapJavaJNI.BSplCLib_PrepareInsertKnots__SWIG_1(Degree, Periodic, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(AddKnots), AddKnots, TColStd_Array1OfInteger.getCPtr(AddMults), AddMults, NbPoles, NbKnots, Epsilon);
  }

  public static void InsertKnots(int Degree, long Periodic, int Dimension,  TColStd_Array1OfReal  Poles,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  AddKnots, TColStd_Array1OfInteger AddMults,  TColStd_Array1OfReal  NewPoles,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults, double Epsilon, long Add) {
    OCCwrapJavaJNI.BSplCLib_InsertKnots__SWIG_0(Degree, Periodic, Dimension, TColStd_Array1OfReal.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(AddKnots), AddKnots, TColStd_Array1OfInteger.getCPtr(AddMults), AddMults, TColStd_Array1OfReal.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, Epsilon, Add);
  }

  public static void InsertKnots(int Degree, long Periodic, int Dimension,  TColStd_Array1OfReal  Poles,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  AddKnots, TColStd_Array1OfInteger AddMults,  TColStd_Array1OfReal  NewPoles,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults, double Epsilon) {
    OCCwrapJavaJNI.BSplCLib_InsertKnots__SWIG_1(Degree, Periodic, Dimension, TColStd_Array1OfReal.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(AddKnots), AddKnots, TColStd_Array1OfInteger.getCPtr(AddMults), AddMults, TColStd_Array1OfReal.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, Epsilon);
  }

  /**
   *  Insert   a  sequence  of  knots <AddKnots> with
   *  multiplicities   <AddMults>. <AddKnots>   must  be a   non
   *  decreasing sequence and verifies :
   * 
   *  Knots(Knots.Lower()) <= AddKnots(AddKnots.Lower())
   *  Knots(Knots.Upper()) >= AddKnots(AddKnots.Upper())
   * 
   *  The NewPoles and NewWeights arrays must have a length :
   *  Poles.Length() + Sum(AddMults())
   * 
   *  When a knot  to insert is identic  to an existing knot the
   *  multiplicities   are added.
   * 
   *  Epsilon is used to test knots for equality.
   * 
   *  When AddMult is negative or null the knot is not inserted.
   *  No multiplicity will becomes higher than the degree.
   * 
   *  The new Knots and Multiplicities  are copied in <NewKnots>
   *  and  <NewMults>.
   * 
   *  All the New arrays should be correctly dimensioned.
   * 
   *  When all  the new knots  are existing knots, i.e. only the
   *  multiplicities  will  change it is   safe to  use the same
   *  arrays as input and output.
   */
  public static void InsertKnots(int Degree, long Periodic,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  AddKnots, TColStd_Array1OfInteger AddMults,  TColgp_Array1OfPnt  NewPoles, TColStd_Array1OfReal NewWeights,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults, double Epsilon, long Add) {
    OCCwrapJavaJNI.BSplCLib_InsertKnots__SWIG_2(Degree, Periodic, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(AddKnots), AddKnots, TColStd_Array1OfInteger.getCPtr(AddMults), AddMults, TColgp_Array1OfPnt.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewWeights), NewWeights, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, Epsilon, Add);
  }

  public static void InsertKnots(int Degree, long Periodic,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  AddKnots, TColStd_Array1OfInteger AddMults,  TColgp_Array1OfPnt  NewPoles, TColStd_Array1OfReal NewWeights,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults, double Epsilon) {
    OCCwrapJavaJNI.BSplCLib_InsertKnots__SWIG_3(Degree, Periodic, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(AddKnots), AddKnots, TColStd_Array1OfInteger.getCPtr(AddMults), AddMults, TColgp_Array1OfPnt.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewWeights), NewWeights, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, Epsilon);
  }

  public static void InsertKnots(int Degree, long Periodic,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  AddKnots, TColStd_Array1OfInteger AddMults,  TColgp_Array1OfPnt2d  NewPoles, TColStd_Array1OfReal NewWeights,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults, double Epsilon, long Add) {
    OCCwrapJavaJNI.BSplCLib_InsertKnots__SWIG_4(Degree, Periodic, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(AddKnots), AddKnots, TColStd_Array1OfInteger.getCPtr(AddMults), AddMults, TColgp_Array1OfPnt2d.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewWeights), NewWeights, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, Epsilon, Add);
  }

  public static void InsertKnots(int Degree, long Periodic,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  AddKnots, TColStd_Array1OfInteger AddMults,  TColgp_Array1OfPnt2d  NewPoles, TColStd_Array1OfReal NewWeights,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults, double Epsilon) {
    OCCwrapJavaJNI.BSplCLib_InsertKnots__SWIG_5(Degree, Periodic, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(AddKnots), AddKnots, TColStd_Array1OfInteger.getCPtr(AddMults), AddMults, TColgp_Array1OfPnt2d.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewWeights), NewWeights, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, Epsilon);
  }

  public static void InsertKnot(int UIndex, double U, int UMult, int Degree, long Periodic,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColgp_Array1OfPnt  NewPoles, TColStd_Array1OfReal NewWeights) {
    OCCwrapJavaJNI.BSplCLib_InsertKnot__SWIG_0(UIndex, U, UMult, Degree, Periodic, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColgp_Array1OfPnt.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewWeights), NewWeights);
  }

  /**
   *  Insert a new knot U of multiplicity UMult in the
   *  knot sequence.
   * 
   *  The  location of the new Knot  should be given as an input
   *  data.  UIndex locates the new knot U  in the knot sequence
   *  and Knots (UIndex) < U < Knots (UIndex + 1).
   * 
   *  The new control points corresponding to this insertion are
   *  returned. Knots and Mults are not updated.
   */
  public static void InsertKnot(int UIndex, double U, int UMult, int Degree, long Periodic,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColgp_Array1OfPnt2d  NewPoles, TColStd_Array1OfReal NewWeights) {
    OCCwrapJavaJNI.BSplCLib_InsertKnot__SWIG_1(UIndex, U, UMult, Degree, Periodic, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColgp_Array1OfPnt2d.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewWeights), NewWeights);
  }

  public static void RaiseMultiplicity(int KnotIndex, int Mult, int Degree, long Periodic,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColgp_Array1OfPnt  NewPoles, TColStd_Array1OfReal NewWeights) {
    OCCwrapJavaJNI.BSplCLib_RaiseMultiplicity__SWIG_0(KnotIndex, Mult, Degree, Periodic, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColgp_Array1OfPnt.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewWeights), NewWeights);
  }

  /**
   *  Raise the multiplicity of knot to <UMult>.
   * 
   *  The new control points  are  returned. Knots and Mults are
   *  not updated.
   */
  public static void RaiseMultiplicity(int KnotIndex, int Mult, int Degree, long Periodic,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColgp_Array1OfPnt2d  NewPoles, TColStd_Array1OfReal NewWeights) {
    OCCwrapJavaJNI.BSplCLib_RaiseMultiplicity__SWIG_1(KnotIndex, Mult, Degree, Periodic, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColgp_Array1OfPnt2d.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewWeights), NewWeights);
  }

  public static long RemoveKnot(int Index, int Mult, int Degree, long Periodic, int Dimension,  TColStd_Array1OfReal  Poles,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  NewPoles,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults, double Tolerance) {
    return OCCwrapJavaJNI.BSplCLib_RemoveKnot__SWIG_0(Index, Mult, Degree, Periodic, Dimension, TColStd_Array1OfReal.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, Tolerance);
  }

  public static long RemoveKnot(int Index, int Mult, int Degree, long Periodic,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColgp_Array1OfPnt  NewPoles, TColStd_Array1OfReal NewWeights,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults, double Tolerance) {
    return OCCwrapJavaJNI.BSplCLib_RemoveKnot__SWIG_1(Index, Mult, Degree, Periodic, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColgp_Array1OfPnt.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewWeights), NewWeights, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, Tolerance);
  }

  /**
   *  Decrement the  multiplicity  of <Knots(Index)>
   *  to <Mult>. If <Mult>   is  null the   knot  is
   *  removed.
   * 
   *  As there are two ways to compute the new poles
   *  the midlle   will  be used  as  long    as the
   *  distance is lower than Tolerance.
   * 
   *  If a  distance is  bigger  than  tolerance the
   *  methods returns False  and  the new arrays are
   *  not modified.
   * 
   *  A low  tolerance can be  used  to test  if the
   *  knot  can be  removed  without  modifying  the
   *  curve.
   * 
   *  A high tolerance  can be used  to "smooth" the
   *  curve.
   */
  public static long RemoveKnot(int Index, int Mult, int Degree, long Periodic,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColgp_Array1OfPnt2d  NewPoles, TColStd_Array1OfReal NewWeights,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults, double Tolerance) {
    return OCCwrapJavaJNI.BSplCLib_RemoveKnot__SWIG_2(Index, Mult, Degree, Periodic, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColgp_Array1OfPnt2d.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewWeights), NewWeights, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, Tolerance);
  }

  /**
   *  Returns the   number   of  knots   of  a  curve   with
   *  multiplicities <Mults> after elevating the degree from
   *  <Degree> to <NewDegree>. See the IncreaseDegree method
   *  for more comments.
   */
  public static int IncreaseDegreeCountKnots(int Degree, int NewDegree, long Periodic,  TColStd_Array1OfInteger  Mults) {
    return OCCwrapJavaJNI.BSplCLib_IncreaseDegreeCountKnots(Degree, NewDegree, Periodic, TColStd_Array1OfInteger.getCPtr(Mults), Mults);
  }

  public static void IncreaseDegree(int Degree, int NewDegree, long Periodic, int Dimension,  TColStd_Array1OfReal  Poles,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  NewPoles,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults) {
    OCCwrapJavaJNI.BSplCLib_IncreaseDegree__SWIG_0(Degree, NewDegree, Periodic, Dimension, TColStd_Array1OfReal.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults);
  }

  public static void IncreaseDegree(int Degree, int NewDegree, long Periodic,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColgp_Array1OfPnt  NewPoles, TColStd_Array1OfReal NewWeights,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults) {
    OCCwrapJavaJNI.BSplCLib_IncreaseDegree__SWIG_1(Degree, NewDegree, Periodic, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColgp_Array1OfPnt.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewWeights), NewWeights, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults);
  }

  public static void IncreaseDegree(int Degree, int NewDegree, long Periodic,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColgp_Array1OfPnt2d  NewPoles, TColStd_Array1OfReal NewWeights,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults) {
    OCCwrapJavaJNI.BSplCLib_IncreaseDegree__SWIG_2(Degree, NewDegree, Periodic, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColgp_Array1OfPnt2d.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewWeights), NewWeights, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults);
  }

  public static void IncreaseDegree(int NewDegree,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights,  TColgp_Array1OfPnt  NewPoles, TColStd_Array1OfReal NewWeights) {
    OCCwrapJavaJNI.BSplCLib_IncreaseDegree__SWIG_3(NewDegree, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColgp_Array1OfPnt.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewWeights), NewWeights);
  }

  /**
   *  Increase the degree of a bspline (or bezier) curve
   *  of   dimension  <Dimension>  form <Degree>      to
   *  <NewDegree>.
   * 
   *  The number of poles in the new curve is :
   * 
   *  Poles.Length() + (NewDegree - Degree) * Number of spans
   * 
   *  Where the number of spans is :
   * 
   *  LastUKnotIndex(Mults) - FirstUKnotIndex(Mults) + 1
   * 
   *  for a non-periodic curve
   * 
   *  And Knots.Length() - 1 for a periodic curve.
   * 
   *  The multiplicities of all  knots  are increased by
   *  the degree elevation.
   * 
   *  The new knots are usually  the same knots with the
   *  exception of  a non-periodic curve with  the first
   *  and last multiplicity not  equal to Degree+1 where
   *  knots are removed  form the start  and the  bottom
   *  untils the sum of the  multiplicities is  equal to
   *  NewDegree+1  at the  knots   corresponding  to the
   *  first and last parameters of the curve.
   * 
   *  Example  :  Suppose a  curve  of degree 3 starting
   *  with following knots and multiplicities :
   * 
   *  knot : 0.  1.  2.
   *  mult : 1   2   1
   * 
   *  The  FirstUKnot is  2.     because the   sum    of
   *  multiplicities is Degree+1 : 1 + 2 + 1 = 4 = 3 + 1
   * 
   *  i.e. the first parameter  of the  curve is  2. and
   *  will still be   2.  after degree  elevation.   Let
   *  raises this curve to degree 4.  The multiplicities
   *  are increased by 2.
   * 
   *  They   become 2 3  2.   But     we need a   sum of
   *  multiplicities  of 5 at knot  2. So the first knot
   *  is removed and the new knots are :
   * 
   *  knot : 1.  2.
   *  mult : 3   2
   * 
   *  The multipicity   of the first  knot may   also be
   *  reduced if the sum is still to big.
   * 
   *  In the  most common situations (periodic  curve or
   *  curve with first and last multiplicities equals to
   *  Degree+1) the knots are knot changes.
   * 
   *  The method IncreaseDegreeCountKnots can be used to
   *  compute the new number of knots.
   */
  public static void IncreaseDegree(int NewDegree,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights,  TColgp_Array1OfPnt2d  NewPoles, TColStd_Array1OfReal NewWeights) {
    OCCwrapJavaJNI.BSplCLib_IncreaseDegree__SWIG_4(NewDegree, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColgp_Array1OfPnt2d.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewWeights), NewWeights);
  }

  /**
   *  Set in <NbKnots> and <NbPolesToAdd> the number of Knots and
   *  Poles   of  the NotPeriodic  Curve   identical  at the
   *  periodic     curve with    a  degree    <Degree>  ,  a
   *  knots-distribution with Multiplicities <Mults>.
   */
  public static void PrepareUnperiodize(int Degree,  TColStd_Array1OfInteger  Mults, int[] NbKnots, int[] NbPoles) {
    OCCwrapJavaJNI.BSplCLib_PrepareUnperiodize(Degree, TColStd_Array1OfInteger.getCPtr(Mults), Mults, NbKnots, NbPoles);
  }

  public static void Unperiodize(int Degree, int Dimension,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfReal  Poles,  TColStd_Array1OfInteger  NewMults,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfReal  NewPoles) {
    OCCwrapJavaJNI.BSplCLib_Unperiodize__SWIG_0(Degree, Dimension, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfReal.getCPtr(Poles), Poles, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfReal.getCPtr(NewPoles), NewPoles);
  }

  public static void Unperiodize(int Degree,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  Knots,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfInteger  NewMults,  TColStd_Array1OfReal  NewKnots,  TColgp_Array1OfPnt  NewPoles, TColStd_Array1OfReal NewWeights) {
    OCCwrapJavaJNI.BSplCLib_Unperiodize__SWIG_1(Degree, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColgp_Array1OfPnt.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewWeights), NewWeights);
  }

  public static void Unperiodize(int Degree,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  Knots,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfInteger  NewMults,  TColStd_Array1OfReal  NewKnots,  TColgp_Array1OfPnt2d  NewPoles, TColStd_Array1OfReal NewWeights) {
    OCCwrapJavaJNI.BSplCLib_Unperiodize__SWIG_2(Degree, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColgp_Array1OfPnt2d.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewWeights), NewWeights);
  }

  /**
   *  Set in <NbKnots> and <NbPoles> the number of Knots and
   *  Poles of the  curve resulting  of  the trimming of the
   *  BSplinecurve definded with <degree>, <knots>, <mults>
   */
  public static void PrepareTrimming(int Degree, long Periodic,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults, double U1, double U2, int[] NbKnots, int[] NbPoles) {
    OCCwrapJavaJNI.BSplCLib_PrepareTrimming(Degree, Periodic, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, U1, U2, NbKnots, NbPoles);
  }

  public static void Trimming(int Degree, long Periodic, int Dimension,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  Poles, double U1, double U2,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults,  TColStd_Array1OfReal  NewPoles) {
    OCCwrapJavaJNI.BSplCLib_Trimming__SWIG_0(Degree, Periodic, Dimension, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(Poles), Poles, U1, U2, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, TColStd_Array1OfReal.getCPtr(NewPoles), NewPoles);
  }

  public static void Trimming(int Degree, long Periodic,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights, double U1, double U2,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults,  TColgp_Array1OfPnt  NewPoles, TColStd_Array1OfReal NewWeights) {
    OCCwrapJavaJNI.BSplCLib_Trimming__SWIG_1(Degree, Periodic, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, U1, U2, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, TColgp_Array1OfPnt.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewWeights), NewWeights);
  }

  public static void Trimming(int Degree, long Periodic,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights, double U1, double U2,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults,  TColgp_Array1OfPnt2d  NewPoles, TColStd_Array1OfReal NewWeights) {
    OCCwrapJavaJNI.BSplCLib_Trimming__SWIG_2(Degree, Periodic, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, U1, U2, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, TColgp_Array1OfPnt2d.getCPtr(NewPoles), NewPoles, TColStd_Array1OfReal.getCPtr(NewWeights), NewWeights);
  }

  public static void D0(double U, int Index, int Degree, long Periodic,  TColStd_Array1OfReal  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots, TColStd_Array1OfInteger Mults, double[] P) {
    OCCwrapJavaJNI.BSplCLib_D0__SWIG_0(U, Index, Degree, Periodic, TColStd_Array1OfReal.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, P);
  }

  public static void D0(double U, int Index, int Degree, long Periodic,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots, TColStd_Array1OfInteger Mults, gp_Pnt P) {
    OCCwrapJavaJNI.BSplCLib_D0__SWIG_1(U, Index, Degree, Periodic, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, gp_Pnt.getCPtr(P), P);
  }

  public static void D0(double U, int UIndex, int Degree, long Periodic,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots, TColStd_Array1OfInteger Mults, gp_Pnt2d P) {
    OCCwrapJavaJNI.BSplCLib_D0__SWIG_2(U, UIndex, Degree, Periodic, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, gp_Pnt2d.getCPtr(P), P);
  }

  public static void D0(double U,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights, gp_Pnt P) {
    OCCwrapJavaJNI.BSplCLib_D0__SWIG_3(U, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(P), P);
  }

  public static void D0(double U,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights, gp_Pnt2d P) {
    OCCwrapJavaJNI.BSplCLib_D0__SWIG_4(U, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt2d.getCPtr(P), P);
  }

  public static void D1(double U, int Index, int Degree, long Periodic,  TColStd_Array1OfReal  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots, TColStd_Array1OfInteger Mults, double[] P, double[] V) {
    OCCwrapJavaJNI.BSplCLib_D1__SWIG_0(U, Index, Degree, Periodic, TColStd_Array1OfReal.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, P, V);
  }

  public static void D1(double U, int Index, int Degree, long Periodic,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots, TColStd_Array1OfInteger Mults, gp_Pnt P, gp_Vec V) {
    OCCwrapJavaJNI.BSplCLib_D1__SWIG_1(U, Index, Degree, Periodic, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V), V);
  }

  public static void D1(double U, int UIndex, int Degree, long Periodic,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots, TColStd_Array1OfInteger Mults, gp_Pnt2d P, gp_Vec2d V) {
    OCCwrapJavaJNI.BSplCLib_D1__SWIG_2(U, UIndex, Degree, Periodic, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, gp_Pnt2d.getCPtr(P), P, gp_Vec2d.getCPtr(V), V);
  }

  public static void D1(double U,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights, gp_Pnt P, gp_Vec V) {
    OCCwrapJavaJNI.BSplCLib_D1__SWIG_3(U, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V), V);
  }

  public static void D1(double U,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights, gp_Pnt2d P, gp_Vec2d V) {
    OCCwrapJavaJNI.BSplCLib_D1__SWIG_4(U, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt2d.getCPtr(P), P, gp_Vec2d.getCPtr(V), V);
  }

  public static void D2(double U, int Index, int Degree, long Periodic,  TColStd_Array1OfReal  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots, TColStd_Array1OfInteger Mults, double[] P, double[] V1, double[] V2) {
    OCCwrapJavaJNI.BSplCLib_D2__SWIG_0(U, Index, Degree, Periodic, TColStd_Array1OfReal.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, P, V1, V2);
  }

  public static void D2(double U, int Index, int Degree, long Periodic,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots, TColStd_Array1OfInteger Mults, gp_Pnt P, gp_Vec V1, gp_Vec V2) {
    OCCwrapJavaJNI.BSplCLib_D2__SWIG_1(U, Index, Degree, Periodic, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2);
  }

  public static void D2(double U, int UIndex, int Degree, long Periodic,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots, TColStd_Array1OfInteger Mults, gp_Pnt2d P, gp_Vec2d V1, gp_Vec2d V2) {
    OCCwrapJavaJNI.BSplCLib_D2__SWIG_2(U, UIndex, Degree, Periodic, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, gp_Pnt2d.getCPtr(P), P, gp_Vec2d.getCPtr(V1), V1, gp_Vec2d.getCPtr(V2), V2);
  }

  public static void D2(double U,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights, gp_Pnt P, gp_Vec V1, gp_Vec V2) {
    OCCwrapJavaJNI.BSplCLib_D2__SWIG_3(U, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2);
  }

  public static void D2(double U,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights, gp_Pnt2d P, gp_Vec2d V1, gp_Vec2d V2) {
    OCCwrapJavaJNI.BSplCLib_D2__SWIG_4(U, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt2d.getCPtr(P), P, gp_Vec2d.getCPtr(V1), V1, gp_Vec2d.getCPtr(V2), V2);
  }

  public static void D3(double U, int Index, int Degree, long Periodic,  TColStd_Array1OfReal  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots, TColStd_Array1OfInteger Mults, double[] P, double[] V1, double[] V2, double[] V3) {
    OCCwrapJavaJNI.BSplCLib_D3__SWIG_0(U, Index, Degree, Periodic, TColStd_Array1OfReal.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, P, V1, V2, V3);
  }

  public static void D3(double U, int Index, int Degree, long Periodic,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots, TColStd_Array1OfInteger Mults, gp_Pnt P, gp_Vec V1, gp_Vec V2, gp_Vec V3) {
    OCCwrapJavaJNI.BSplCLib_D3__SWIG_1(U, Index, Degree, Periodic, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2, gp_Vec.getCPtr(V3), V3);
  }

  public static void D3(double U, int UIndex, int Degree, long Periodic,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots, TColStd_Array1OfInteger Mults, gp_Pnt2d P, gp_Vec2d V1, gp_Vec2d V2, gp_Vec2d V3) {
    OCCwrapJavaJNI.BSplCLib_D3__SWIG_2(U, UIndex, Degree, Periodic, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, gp_Pnt2d.getCPtr(P), P, gp_Vec2d.getCPtr(V1), V1, gp_Vec2d.getCPtr(V2), V2, gp_Vec2d.getCPtr(V3), V3);
  }

  public static void D3(double U,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights, gp_Pnt P, gp_Vec V1, gp_Vec V2, gp_Vec V3) {
    OCCwrapJavaJNI.BSplCLib_D3__SWIG_3(U, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2, gp_Vec.getCPtr(V3), V3);
  }

  public static void D3(double U,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights, gp_Pnt2d P, gp_Vec2d V1, gp_Vec2d V2, gp_Vec2d V3) {
    OCCwrapJavaJNI.BSplCLib_D3__SWIG_4(U, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt2d.getCPtr(P), P, gp_Vec2d.getCPtr(V1), V1, gp_Vec2d.getCPtr(V2), V2, gp_Vec2d.getCPtr(V3), V3);
  }

  public static void DN(double U, int N, int Index, int Degree, long Periodic,  TColStd_Array1OfReal  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots, TColStd_Array1OfInteger Mults, double[] VN) {
    OCCwrapJavaJNI.BSplCLib_DN__SWIG_0(U, N, Index, Degree, Periodic, TColStd_Array1OfReal.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, VN);
  }

  public static void DN(double U, int N, int Index, int Degree, long Periodic,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots, TColStd_Array1OfInteger Mults, gp_Vec VN) {
    OCCwrapJavaJNI.BSplCLib_DN__SWIG_1(U, N, Index, Degree, Periodic, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, gp_Vec.getCPtr(VN), VN);
  }

  public static void DN(double U, int N, int UIndex, int Degree, long Periodic,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  Knots, TColStd_Array1OfInteger Mults, gp_Vec2d V) {
    OCCwrapJavaJNI.BSplCLib_DN__SWIG_2(U, N, UIndex, Degree, Periodic, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, gp_Vec2d.getCPtr(V), V);
  }

  public static void DN(double U, int N,  TColgp_Array1OfPnt  Poles,  TColStd_Array1OfReal  Weights, gp_Pnt P, gp_Vec VN) {
    OCCwrapJavaJNI.BSplCLib_DN__SWIG_3(U, N, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(VN), VN);
  }

  /**
   *  The  above  functions  compute   values and
   *  derivatives in the following situations :
   * 
   *  * 3D, 2D and 1D
   * 
   *  * Rational or not Rational.
   * 
   *  * Knots  and multiplicities or "flat knots" without
   *  multiplicities.
   * 
   *  * The  <Index>  is   the the  localization  of  the
   *  parameter in the knot sequence.  If <Index> is  out
   *  of range the correct value will be searched.
   * 
   *  VERY IMPORTANT!!!
   *  USE  BSplCLib::NoWeights()  as Weights argument for non
   *  rational curves computations.
   */
  public static void DN(double U, int N,  TColgp_Array1OfPnt2d  Poles,  TColStd_Array1OfReal  Weights, gp_Pnt2d P, gp_Vec2d VN) {
    OCCwrapJavaJNI.BSplCLib_DN__SWIG_4(U, N, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt2d.getCPtr(P), P, gp_Vec2d.getCPtr(VN), VN);
  }

  /**
   *  This  evaluates  the Bspline  Basis  at  a
   *  given  parameter  Parameter   up   to  the
   *  requested   DerivativeOrder  and store the
   *  result  in the  array BsplineBasis  in the
   *  following   fashion
   *  BSplineBasis(1,1)   =
   *  value of first non vanishing
   *  Bspline function which has Index FirstNonZeroBsplineIndex
   *  BsplineBasis(1,2)   =
   *  value of second non vanishing
   *  Bspline   function which  has   Index
   *  FirstNonZeroBsplineIndex + 1
   *  BsplineBasis(1,n)   =
   *  value of second non vanishing non vanishing
   *  Bspline   function which  has   Index
   *  FirstNonZeroBsplineIndex + n (n <= Order)
   *  BSplineBasis(2,1)   =
   *  value of derivative of first non vanishing
   *  Bspline function which has Index FirstNonZeroBsplineIndex
   *  BSplineBasis(N,1)   =
   *  value of Nth derivative of first non vanishing
   *  Bspline function which has Index FirstNonZeroBsplineIndex
   *  if N <= DerivativeOrder + 1
   */
  public static int EvalBsplineBasis(int DerivativeOrder, int Order,  TColStd_Array1OfReal  FlatKnots, double Parameter, int[] FirstNonZeroBsplineIndex,  math_Matrix  BsplineBasis, long isPeriodic) {
    return OCCwrapJavaJNI.BSplCLib_EvalBsplineBasis__SWIG_0(DerivativeOrder, Order, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, Parameter, FirstNonZeroBsplineIndex, math_Matrix.getCPtr(BsplineBasis), BsplineBasis, isPeriodic);
  }

  public static int EvalBsplineBasis(int DerivativeOrder, int Order,  TColStd_Array1OfReal  FlatKnots, double Parameter, int[] FirstNonZeroBsplineIndex,  math_Matrix  BsplineBasis) {
    return OCCwrapJavaJNI.BSplCLib_EvalBsplineBasis__SWIG_1(DerivativeOrder, Order, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, Parameter, FirstNonZeroBsplineIndex, math_Matrix.getCPtr(BsplineBasis), BsplineBasis);
  }

  /**
   *  This Builds   a fully  blown   Matrix of
   *  (ni)
   *  Bi    (tj)
   * 
   *  with i  and j within 1..Order + NumPoles
   *  The  integer ni is   the ith slot of the
   *  array OrderArray, tj is the jth slot of
   *  the array Parameters
   */
  public static int BuildBSpMatrix( TColStd_Array1OfReal  Parameters,  TColStd_Array1OfInteger  OrderArray,  TColStd_Array1OfReal  FlatKnots, int Degree,  math_Matrix  Matrix, int[] UpperBandWidth, int[] LowerBandWidth) {
    return OCCwrapJavaJNI.BSplCLib_BuildBSpMatrix(TColStd_Array1OfReal.getCPtr(Parameters), Parameters, TColStd_Array1OfInteger.getCPtr(OrderArray), OrderArray, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, Degree, math_Matrix.getCPtr(Matrix), Matrix, UpperBandWidth, LowerBandWidth);
  }

  /**
   *  this  factors  the Banded Matrix in
   *  the LU form with a Banded storage of
   *  components of the L matrix
   *  WARNING : do not use if the Matrix is
   *  totally positive (It is the case for
   *  Bspline matrices build as above with
   *  parameters being the Schoenberg points
   */
  public static int FactorBandedMatrix( math_Matrix  Matrix, int UpperBandWidth, int LowerBandWidth, int[] PivotIndexProblem) {
    return OCCwrapJavaJNI.BSplCLib_FactorBandedMatrix(math_Matrix.getCPtr(Matrix), Matrix, UpperBandWidth, LowerBandWidth, PivotIndexProblem);
  }

  /**
   *  This solves  the system Matrix.X =  B
   *  with when Matrix is factored in LU form
   *  The  Array   is    an   seen   as    an
   *  Array[1..N][1..ArrayDimension] with N =
   *  the  rank  of the  matrix  Matrix.  The
   *  result is stored   in Array  when  each
   *  coordinate is  solved that is  B is the
   *  array whose values are
   *  B[i] = Array[i][p] for each p in 1..ArrayDimension
   */
  public static int SolveBandedSystem( math_Matrix  Matrix, int UpperBandWidth, int LowerBandWidth, int ArrayDimension, double[] Array) {
    return OCCwrapJavaJNI.BSplCLib_SolveBandedSystem__SWIG_0(math_Matrix.getCPtr(Matrix), Matrix, UpperBandWidth, LowerBandWidth, ArrayDimension, Array);
  }

  /**
   *  This solves  the system Matrix.X =  B
   *  with when Matrix is factored in LU form
   *  The  Array   has the length of
   *  the  rank  of the  matrix  Matrix.  The
   *  result is stored   in Array  when  each
   *  coordinate is  solved that is  B is the
   *  array whose values are
   *  B[i] = Array[i][p] for each p in 1..ArrayDimension
   */
  public static int SolveBandedSystem( math_Matrix  Matrix, int UpperBandWidth, int LowerBandWidth,  TColgp_Array1OfPnt2d  Array) {
    return OCCwrapJavaJNI.BSplCLib_SolveBandedSystem__SWIG_1(math_Matrix.getCPtr(Matrix), Matrix, UpperBandWidth, LowerBandWidth, TColgp_Array1OfPnt2d.getCPtr(Array), Array);
  }

  /**
   *  This solves  the system Matrix.X =  B
   *  with when Matrix is factored in LU form
   *  The  Array   has the length of
   *  the  rank  of the  matrix  Matrix.  The
   *  result is stored   in Array  when  each
   *  coordinate is  solved that is  B is the
   *  array whose values are
   *  B[i] = Array[i][p] for each p in 1..ArrayDimension
   */
  public static int SolveBandedSystem( math_Matrix  Matrix, int UpperBandWidth, int LowerBandWidth,  TColgp_Array1OfPnt  Array) {
    return OCCwrapJavaJNI.BSplCLib_SolveBandedSystem__SWIG_2(math_Matrix.getCPtr(Matrix), Matrix, UpperBandWidth, LowerBandWidth, TColgp_Array1OfPnt.getCPtr(Array), Array);
  }

  public static int SolveBandedSystem( math_Matrix  Matrix, int UpperBandWidth, int LowerBandWidth, long HomogenousFlag, int ArrayDimension, double[] Array, double[] Weights) {
    return OCCwrapJavaJNI.BSplCLib_SolveBandedSystem__SWIG_3(math_Matrix.getCPtr(Matrix), Matrix, UpperBandWidth, LowerBandWidth, HomogenousFlag, ArrayDimension, Array, Weights);
  }

  /**
   *  This solves the  system Matrix.X =  B
   *  with when Matrix is factored in LU form
   *  The    Array   is    an   seen  as   an
   *  Array[1..N][1..ArrayDimension] with N =
   *  the  rank  of  the  matrix Matrix.  The
   *  result is  stored   in Array when  each
   *  coordinate is  solved that is B  is the
   *  array  whose   values     are   B[i]  =
   *  Array[i][p]       for     each  p    in
   *  1..ArrayDimension. If  HomogeneousFlag ==
   *  0  the  Poles  are  multiplied by   the
   *  Weights   uppon   Entry   and      once
   *  interpolation   is    carried  over the
   *  result of the  poles are divided by the
   *  result of   the   interpolation of  the
   *  weights. Otherwise if HomogenousFlag == 1
   *  the Poles and Weigths are treated homogenously
   *  that is that those are interpolated as they
   *  are and result is returned without division
   *  by the interpolated weigths.
   */
  public static int SolveBandedSystem( math_Matrix  Matrix, int UpperBandWidth, int LowerBandWidth, long HomogenousFlag,  TColgp_Array1OfPnt2d  Array,  TColStd_Array1OfReal  Weights) {
    return OCCwrapJavaJNI.BSplCLib_SolveBandedSystem__SWIG_4(math_Matrix.getCPtr(Matrix), Matrix, UpperBandWidth, LowerBandWidth, HomogenousFlag, TColgp_Array1OfPnt2d.getCPtr(Array), Array, TColStd_Array1OfReal.getCPtr(Weights), Weights);
  }

  /**
   *  This solves  the system Matrix.X =  B
   *  with when Matrix is factored in LU form
   *  The  Array   is    an   seen   as    an
   *  Array[1..N][1..ArrayDimension] with N =
   *  the  rank  of the  matrix  Matrix.  The
   *  result is stored   in Array  when  each
   *  coordinate is  solved that is  B is the
   *  array whose values are
   *  B[i] = Array[i][p] for each p in 1..ArrayDimension
   *  If  HomogeneousFlag ==
   *  0  the  Poles  are  multiplied by   the
   *  Weights   uppon   Entry   and      once
   *  interpolation   is    carried  over the
   *  result of the  poles are divided by the
   *  result of   the   interpolation of  the
   *  weights. Otherwise if HomogenousFlag == 1
   *  the Poles and Weigths are treated homogenously
   *  that is that those are interpolated as they
   *  are and result is returned without division
   *  by the interpolated weigths.
   */
  public static int SolveBandedSystem( math_Matrix  Matrix, int UpperBandWidth, int LowerBandWidth, long HomogeneousFlag,  TColgp_Array1OfPnt  Array,  TColStd_Array1OfReal  Weights) {
    return OCCwrapJavaJNI.BSplCLib_SolveBandedSystem__SWIG_5(math_Matrix.getCPtr(Matrix), Matrix, UpperBandWidth, LowerBandWidth, HomogeneousFlag, TColgp_Array1OfPnt.getCPtr(Array), Array, TColStd_Array1OfReal.getCPtr(Weights), Weights);
  }

  /**
   *  Merges  two knot vector by   setting the starting and
   *  ending values to StartValue and EndValue
   */
  public static void MergeBSplineKnots(double Tolerance, double StartValue, double EndValue, int Degree1,  TColStd_Array1OfReal  Knots1,  TColStd_Array1OfInteger  Mults1, int Degree2,  TColStd_Array1OfReal  Knots2,  TColStd_Array1OfInteger  Mults2, int[] NumPoles,  TColStd_HArray1OfReal  NewKnots,  TColStd_HArray1OfInteger  NewMults) {
    OCCwrapJavaJNI.BSplCLib_MergeBSplineKnots(Tolerance, StartValue, EndValue, Degree1, TColStd_Array1OfReal.getCPtr(Knots1), Knots1, TColStd_Array1OfInteger.getCPtr(Mults1), Mults1, Degree2, TColStd_Array1OfReal.getCPtr(Knots2), Knots2, TColStd_Array1OfInteger.getCPtr(Mults2), Mults2, NumPoles,  TColStd_HArray1OfReal.getCPtr(NewKnots) , NewKnots,  TColStd_HArray1OfInteger.getCPtr(NewMults) , NewMults);
  }

  /**
   *  This function will compose  a given Vectorial BSpline F(t)
   *  defined  by its  BSplineDegree and BSplineFlatKnotsl,
   *  its Poles  array which are coded as  an array of Real
   *  of  the  form  [1..NumPoles][1..PolesDimension] with  a
   *  function     a(t) which is   assumed to   satisfy the
   *  following:
   * 
   *  1. F(a(t))  is a polynomial BSpline
   *  that can be expressed  exactly as a BSpline of degree
   *  NewDegree on the knots FlatKnots
   * 
   *  2. a(t) defines a differentiable
   *  isomorphism between the range of FlatKnots to the range
   *  of BSplineFlatKnots which is the
   *  same as the  range of F(t)
   * 
   *  Warning: it is
   *  the caller's responsability to insure that conditions
   *  1. and  2. above are  satisfied : no check whatsoever
   *  is made in this method
   * 
   *  theStatus will return 0 if OK else it will return the pivot index
   *  of the matrix that was inverted to compute the multiplied
   *  BSpline : the method used is interpolation at Schoenenberg
   *  points of F(a(t))
   */
  public static void FunctionReparameterise(SWIGTYPE_p_BSplCLib_EvaluatorFunction Function, int BSplineDegree,  TColStd_Array1OfReal  BSplineFlatKnots, int PolesDimension, double[] Poles,  TColStd_Array1OfReal  FlatKnots, int NewDegree, double[] NewPoles, int[] theStatus) {
    OCCwrapJavaJNI.BSplCLib_FunctionReparameterise__SWIG_0(SWIGTYPE_p_BSplCLib_EvaluatorFunction.getCPtr(Function), BSplineDegree, TColStd_Array1OfReal.getCPtr(BSplineFlatKnots), BSplineFlatKnots, PolesDimension, Poles, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, NewDegree, NewPoles, theStatus);
  }

  /**
   *  This function will compose  a given Vectorial BSpline F(t)
   *  defined  by its  BSplineDegree and BSplineFlatKnotsl,
   *  its Poles  array which are coded as  an array of Real
   *  of  the  form  [1..NumPoles][1..PolesDimension] with  a
   *  function     a(t) which is   assumed to   satisfy the
   *  following:
   * 
   *  1. F(a(t))  is a polynomial BSpline
   *  that can be expressed  exactly as a BSpline of degree
   *  NewDegree on the knots FlatKnots
   * 
   *  2. a(t) defines a differentiable
   *  isomorphism between the range of FlatKnots to the range
   *  of BSplineFlatKnots which is the
   *  same as the  range of F(t)
   * 
   *  Warning: it is
   *  the caller's responsability to insure that conditions
   *  1. and  2. above are  satisfied : no check whatsoever
   *  is made in this method
   * 
   *  theStatus will return 0 if OK else it will return the pivot index
   *  of the matrix that was inverted to compute the multiplied
   *  BSpline : the method used is interpolation at Schoenenberg
   *  points of F(a(t))
   */
  public static void FunctionReparameterise(SWIGTYPE_p_BSplCLib_EvaluatorFunction Function, int BSplineDegree,  TColStd_Array1OfReal  BSplineFlatKnots,  TColStd_Array1OfReal  Poles,  TColStd_Array1OfReal  FlatKnots, int NewDegree,  TColStd_Array1OfReal  NewPoles, int[] theStatus) {
    OCCwrapJavaJNI.BSplCLib_FunctionReparameterise__SWIG_1(SWIGTYPE_p_BSplCLib_EvaluatorFunction.getCPtr(Function), BSplineDegree, TColStd_Array1OfReal.getCPtr(BSplineFlatKnots), BSplineFlatKnots, TColStd_Array1OfReal.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, NewDegree, TColStd_Array1OfReal.getCPtr(NewPoles), NewPoles, theStatus);
  }

  /**
   *  this will compose  a given Vectorial BSpline F(t)
   *  defined  by its  BSplineDegree and BSplineFlatKnotsl,
   *  its Poles  array which are coded as  an array of Real
   *  of  the  form  [1..NumPoles][1..PolesDimension] with  a
   *  function     a(t) which is   assumed to   satisfy the
   *  following  : 1. F(a(t))  is a polynomial BSpline
   *  that can be expressed  exactly as a BSpline of degree
   *  NewDegree on the knots FlatKnots
   *  2. a(t) defines a differentiable
   *  isomorphism between the range of FlatKnots to the range
   *  of BSplineFlatKnots which is the
   *  same as the  range of F(t)
   *  Warning: it is
   *  the caller's responsability to insure that conditions
   *  1. and  2. above are  satisfied : no check whatsoever
   *  is made in this method
   *  theStatus will return 0 if OK else it will return the pivot index
   *  of the matrix that was inverted to compute the multiplied
   *  BSpline : the method used is interpolation at Schoenenberg
   *  points of F(a(t))
   */
  public static void FunctionReparameterise(SWIGTYPE_p_BSplCLib_EvaluatorFunction Function, int BSplineDegree,  TColStd_Array1OfReal  BSplineFlatKnots,  TColgp_Array1OfPnt  Poles,  TColStd_Array1OfReal  FlatKnots, int NewDegree,  TColgp_Array1OfPnt  NewPoles, int[] theStatus) {
    OCCwrapJavaJNI.BSplCLib_FunctionReparameterise__SWIG_2(SWIGTYPE_p_BSplCLib_EvaluatorFunction.getCPtr(Function), BSplineDegree, TColStd_Array1OfReal.getCPtr(BSplineFlatKnots), BSplineFlatKnots, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, NewDegree, TColgp_Array1OfPnt.getCPtr(NewPoles), NewPoles, theStatus);
  }

  /**
   *  this will compose  a given Vectorial BSpline F(t)
   *  defined  by its  BSplineDegree and BSplineFlatKnotsl,
   *  its Poles  array which are coded as  an array of Real
   *  of  the  form  [1..NumPoles][1..PolesDimension] with  a
   *  function     a(t) which is   assumed to   satisfy the
   *  following  : 1. F(a(t))  is a polynomial BSpline
   *  that can be expressed  exactly as a BSpline of degree
   *  NewDegree on the knots FlatKnots
   *  2. a(t) defines a differentiable
   *  isomorphism between the range of FlatKnots to the range
   *  of BSplineFlatKnots which is the
   *  same as the  range of F(t)
   *  Warning: it is
   *  the caller's responsability to insure that conditions
   *  1. and  2. above are  satisfied : no check whatsoever
   *  is made in this method
   *  theStatus will return 0 if OK else it will return the pivot index
   *  of the matrix that was inverted to compute the multiplied
   *  BSpline : the method used is interpolation at Schoenenberg
   *  points of F(a(t))
   */
  public static void FunctionReparameterise(SWIGTYPE_p_BSplCLib_EvaluatorFunction Function, int BSplineDegree,  TColStd_Array1OfReal  BSplineFlatKnots,  TColgp_Array1OfPnt2d  Poles,  TColStd_Array1OfReal  FlatKnots, int NewDegree,  TColgp_Array1OfPnt2d  NewPoles, int[] theStatus) {
    OCCwrapJavaJNI.BSplCLib_FunctionReparameterise__SWIG_3(SWIGTYPE_p_BSplCLib_EvaluatorFunction.getCPtr(Function), BSplineDegree, TColStd_Array1OfReal.getCPtr(BSplineFlatKnots), BSplineFlatKnots, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, NewDegree, TColgp_Array1OfPnt2d.getCPtr(NewPoles), NewPoles, theStatus);
  }

  /**
   *  this will  multiply a given Vectorial BSpline F(t)
   *  defined  by its  BSplineDegree and BSplineFlatKnotsl,
   *  its Poles  array which are coded as  an array of Real
   *  of  the  form  [1..NumPoles][1..PolesDimension] by  a
   *  function     a(t) which is   assumed to   satisfy the
   *  following  : 1. a(t)  * F(t)  is a polynomial BSpline
   *  that can be expressed  exactly as a BSpline of degree
   *  NewDegree on the knots FlatKnots 2. the range of a(t)
   *  is the same as the  range of F(t)
   *  Warning: it is
   *  the caller's responsability to insure that conditions
   *  1. and  2. above are  satisfied : no check whatsoever
   *  is made in this method
   *  theStatus will return 0 if OK else it will return the pivot index
   *  of the matrix that was inverted to compute the multiplied
   *  BSpline : the method used is interpolation at Schoenenberg
   *  points of a(t)*F(t)
   */
  public static void FunctionMultiply(SWIGTYPE_p_BSplCLib_EvaluatorFunction Function, int BSplineDegree,  TColStd_Array1OfReal  BSplineFlatKnots, int PolesDimension, double[] Poles,  TColStd_Array1OfReal  FlatKnots, int NewDegree, double[] NewPoles, int[] theStatus) {
    OCCwrapJavaJNI.BSplCLib_FunctionMultiply__SWIG_0(SWIGTYPE_p_BSplCLib_EvaluatorFunction.getCPtr(Function), BSplineDegree, TColStd_Array1OfReal.getCPtr(BSplineFlatKnots), BSplineFlatKnots, PolesDimension, Poles, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, NewDegree, NewPoles, theStatus);
  }

  /**
   *  this will  multiply a given Vectorial BSpline F(t)
   *  defined  by its  BSplineDegree and BSplineFlatKnotsl,
   *  its Poles  array which are coded as  an array of Real
   *  of  the  form  [1..NumPoles][1..PolesDimension] by  a
   *  function     a(t) which is   assumed to   satisfy the
   *  following  : 1. a(t)  * F(t)  is a polynomial BSpline
   *  that can be expressed  exactly as a BSpline of degree
   *  NewDegree on the knots FlatKnots 2. the range of a(t)
   *  is the same as the  range of F(t)
   *  Warning: it is
   *  the caller's responsability to insure that conditions
   *  1. and  2. above are  satisfied : no check whatsoever
   *  is made in this method
   *  theStatus will return 0 if OK else it will return the pivot index
   *  of the matrix that was inverted to compute the multiplied
   *  BSpline : the method used is interpolation at Schoenenberg
   *  points of a(t)*F(t)
   */
  public static void FunctionMultiply(SWIGTYPE_p_BSplCLib_EvaluatorFunction Function, int BSplineDegree,  TColStd_Array1OfReal  BSplineFlatKnots,  TColStd_Array1OfReal  Poles,  TColStd_Array1OfReal  FlatKnots, int NewDegree,  TColStd_Array1OfReal  NewPoles, int[] theStatus) {
    OCCwrapJavaJNI.BSplCLib_FunctionMultiply__SWIG_1(SWIGTYPE_p_BSplCLib_EvaluatorFunction.getCPtr(Function), BSplineDegree, TColStd_Array1OfReal.getCPtr(BSplineFlatKnots), BSplineFlatKnots, TColStd_Array1OfReal.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, NewDegree, TColStd_Array1OfReal.getCPtr(NewPoles), NewPoles, theStatus);
  }

  /**
   *  this will  multiply a given Vectorial BSpline F(t)
   *  defined  by its  BSplineDegree and BSplineFlatKnotsl,
   *  its Poles  array which are coded as  an array of Real
   *  of  the  form  [1..NumPoles][1..PolesDimension] by  a
   *  function     a(t) which is   assumed to   satisfy the
   *  following  : 1. a(t)  * F(t)  is a polynomial BSpline
   *  that can be expressed  exactly as a BSpline of degree
   *  NewDegree on the knots FlatKnots 2. the range of a(t)
   *  is the same as the  range of F(t)
   *  Warning: it is
   *  the caller's responsability to insure that conditions
   *  1. and  2. above are  satisfied : no check whatsoever
   *  is made in this method
   *  theStatus will return 0 if OK else it will return the pivot index
   *  of the matrix that was inverted to compute the multiplied
   *  BSpline : the method used is interpolation at Schoenenberg
   *  points of a(t)*F(t)
   */
  public static void FunctionMultiply(SWIGTYPE_p_BSplCLib_EvaluatorFunction Function, int BSplineDegree,  TColStd_Array1OfReal  BSplineFlatKnots,  TColgp_Array1OfPnt2d  Poles,  TColStd_Array1OfReal  FlatKnots, int NewDegree,  TColgp_Array1OfPnt2d  NewPoles, int[] theStatus) {
    OCCwrapJavaJNI.BSplCLib_FunctionMultiply__SWIG_2(SWIGTYPE_p_BSplCLib_EvaluatorFunction.getCPtr(Function), BSplineDegree, TColStd_Array1OfReal.getCPtr(BSplineFlatKnots), BSplineFlatKnots, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, NewDegree, TColgp_Array1OfPnt2d.getCPtr(NewPoles), NewPoles, theStatus);
  }

  /**
   *  this will  multiply a given Vectorial BSpline F(t)
   *  defined  by its  BSplineDegree and BSplineFlatKnotsl,
   *  its Poles  array which are coded as  an array of Real
   *  of  the  form  [1..NumPoles][1..PolesDimension] by  a
   *  function     a(t) which is   assumed to   satisfy the
   *  following  : 1. a(t)  * F(t)  is a polynomial BSpline
   *  that can be expressed  exactly as a BSpline of degree
   *  NewDegree on the knots FlatKnots 2. the range of a(t)
   *  is the same as the  range of F(t)
   *  Warning: it is
   *  the caller's responsability to insure that conditions
   *  1. and  2. above are  satisfied : no check whatsoever
   *  is made in this method
   *  theStatus will return 0 if OK else it will return the pivot index
   *  of the matrix that was inverted to compute the multiplied
   *  BSpline : the method used is interpolation at Schoenenberg
   *  points of a(t)*F(t)
   */
  public static void FunctionMultiply(SWIGTYPE_p_BSplCLib_EvaluatorFunction Function, int BSplineDegree,  TColStd_Array1OfReal  BSplineFlatKnots,  TColgp_Array1OfPnt  Poles,  TColStd_Array1OfReal  FlatKnots, int NewDegree,  TColgp_Array1OfPnt  NewPoles, int[] theStatus) {
    OCCwrapJavaJNI.BSplCLib_FunctionMultiply__SWIG_3(SWIGTYPE_p_BSplCLib_EvaluatorFunction.getCPtr(Function), BSplineDegree, TColStd_Array1OfReal.getCPtr(BSplineFlatKnots), BSplineFlatKnots, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, NewDegree, TColgp_Array1OfPnt.getCPtr(NewPoles), NewPoles, theStatus);
  }

  /**
   *  Perform the De Boor   algorithm  to  evaluate a point at
   *  parameter <U>, with <Degree> and <Dimension>.
   * 
   *  Poles is  an array of  Reals of size
   * 
   *  <Dimension> *  <Degree>+1
   * 
   *  Containing the  poles.  At  the end <Poles> contains
   *  the current point.   Poles Contain all  the poles of
   *  the BsplineCurve, Knots  also Contains all the knots
   *  of the BsplineCurve.  ExtrapMode has two slots [0] =
   *  Degree used to extrapolate before the first knot [1]
   *  = Degre used to  extrapolate after the last knot has
   *  to be between 1 and  Degree
   */
  public static void Eval(double U, long PeriodicFlag, int DerivativeRequest, int[] ExtrapMode, int Degree,  TColStd_Array1OfReal  FlatKnots, int ArrayDimension, double[] Poles, double[] Result) {
    OCCwrapJavaJNI.BSplCLib_Eval__SWIG_1(U, PeriodicFlag, DerivativeRequest, ExtrapMode, Degree, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, ArrayDimension, Poles, Result);
  }

  /**
   *  Perform the  De Boor algorithm  to evaluate a point at
   *  parameter   <U>,  with   <Degree>    and  <Dimension>.
   *  Evaluates by multiplying the  Poles by the Weights and
   *  gives  the homogeneous  result  in PolesResult that is
   *  the results of the evaluation of the numerator once it
   *  has     been  multiplied   by  the     weights and  in
   *  WeightsResult one has  the result of the evaluation of
   *  the denominator
   * 
   *  Warning:   <PolesResult> and <WeightsResult>  must be   dimensionned
   *  properly.
   */
  public static void Eval(double U, long PeriodicFlag, int DerivativeRequest, int[] ExtrapMode, int Degree,  TColStd_Array1OfReal  FlatKnots, int ArrayDimension, double[] Poles, double[] Weights, double[] PolesResult, double[] WeightsResult) {
    OCCwrapJavaJNI.BSplCLib_Eval__SWIG_2(U, PeriodicFlag, DerivativeRequest, ExtrapMode, Degree, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, ArrayDimension, Poles, Weights, PolesResult, WeightsResult);
  }

  /**
   *  Perform the evaluation of the Bspline Basis
   *  and then multiplies by the weights
   *  this just evaluates the current point
   */
  public static void Eval(double U, long PeriodicFlag, long HomogeneousFlag, int[] ExtrapMode, int Degree,  TColStd_Array1OfReal  FlatKnots,  TColgp_Array1OfPnt  Poles,  TColStd_Array1OfReal  Weights, gp_Pnt Point, double[] Weight) {
    OCCwrapJavaJNI.BSplCLib_Eval__SWIG_3(U, PeriodicFlag, HomogeneousFlag, ExtrapMode, Degree, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(Point), Point, Weight);
  }

  /**
   *  Perform the evaluation of the Bspline Basis
   *  and then multiplies by the weights
   *  this just evaluates the current point
   */
  public static void Eval(double U, long PeriodicFlag, long HomogeneousFlag, int[] ExtrapMode, int Degree,  TColStd_Array1OfReal  FlatKnots,  TColgp_Array1OfPnt2d  Poles,  TColStd_Array1OfReal  Weights, gp_Pnt2d Point, double[] Weight) {
    OCCwrapJavaJNI.BSplCLib_Eval__SWIG_4(U, PeriodicFlag, HomogeneousFlag, ExtrapMode, Degree, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt2d.getCPtr(Point), Point, Weight);
  }

  /**
   *  Extend a BSpline nD using the tangency map
   *  <C1Coefficient> is the coefficient of reparametrisation
   *  <Continuity> must be equal to 1, 2 or 3.
   *  <Degree> must be greater or equal than <Continuity> + 1.
   * 
   *  Warning:   <KnotsResult> and <PolesResult>  must be   dimensionned
   *  properly.
   */
  public static void TangExtendToConstraint( TColStd_Array1OfReal  FlatKnots, double C1Coefficient, int NumPoles, double[] Poles, int Dimension, int Degree,  TColStd_Array1OfReal  ConstraintPoint, int Continuity, long After, int[] NbPolesResult, int[] NbKnotsRsult, double[] KnotsResult, double[] PolesResult) {
    OCCwrapJavaJNI.BSplCLib_TangExtendToConstraint(TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, C1Coefficient, NumPoles, Poles, Dimension, Degree, TColStd_Array1OfReal.getCPtr(ConstraintPoint), ConstraintPoint, Continuity, After, NbPolesResult, NbKnotsRsult, KnotsResult, PolesResult);
  }

  /**
   *  Perform the evaluation of the of the cache
   *  the parameter must be normalized between
   *  the 0 and 1 for the span.
   *  The Cache must be valid when calling this
   *  routine. Geom Package will insure that.
   *  and then multiplies by the weights
   *  this just evaluates the current point
   *  the CacheParameter is where the Cache was
   *  constructed the SpanLength is to normalize
   *  the polynomial in the cache to avoid bad conditioning
   *  effects
   */
  public static void CacheD0(double U, int Degree, double CacheParameter, double SpanLenght,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights, gp_Pnt Point) {
    OCCwrapJavaJNI.BSplCLib_CacheD0__SWIG_0(U, Degree, CacheParameter, SpanLenght, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(Point), Point);
  }

  /**
   *  Perform the evaluation of the Bspline Basis
   *  and then multiplies by the weights
   *  this just evaluates the current point
   *  the parameter must be normalized between
   *  the 0 and 1 for the span.
   *  The Cache must be valid when calling this
   *  routine. Geom Package will insure that.
   *  and then multiplies by the weights
   *  ththe CacheParameter is where the Cache was
   *  constructed the SpanLength is to normalize
   *  the polynomial in the cache to avoid bad conditioning
   *  effectsis just evaluates the current point
   */
  public static void CacheD0(double U, int Degree, double CacheParameter, double SpanLenght,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights, gp_Pnt2d Point) {
    OCCwrapJavaJNI.BSplCLib_CacheD0__SWIG_1(U, Degree, CacheParameter, SpanLenght, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt2d.getCPtr(Point), Point);
  }

  /**
   *  Calls CacheD0 for Bezier  Curves Arrays computed with
   *  the method PolesCoefficients.
   *  Warning: To be used for Beziercurves ONLY!!!
   */
  public static void CoefsD0(double U,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights, gp_Pnt Point) {
    OCCwrapJavaJNI.BSplCLib_CoefsD0__SWIG_0(U, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(Point), Point);
  }

  /**
   *  Calls CacheD0 for Bezier  Curves Arrays computed with
   *  the method PolesCoefficients.
   *  Warning: To be used for Beziercurves ONLY!!!
   */
  public static void CoefsD0(double U,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights, gp_Pnt2d Point) {
    OCCwrapJavaJNI.BSplCLib_CoefsD0__SWIG_1(U, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt2d.getCPtr(Point), Point);
  }

  /**
   *  Perform the evaluation of the of the cache
   *  the parameter must be normalized between
   *  the 0 and 1 for the span.
   *  The Cache must be valid when calling this
   *  routine. Geom Package will insure that.
   *  and then multiplies by the weights
   *  this just evaluates the current point
   *  the CacheParameter is where the Cache was
   *  constructed the SpanLength is to normalize
   *  the polynomial in the cache to avoid bad conditioning
   *  effects
   */
  public static void CacheD1(double U, int Degree, double CacheParameter, double SpanLenght,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights, gp_Pnt Point, gp_Vec Vec) {
    OCCwrapJavaJNI.BSplCLib_CacheD1__SWIG_0(U, Degree, CacheParameter, SpanLenght, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(Point), Point, gp_Vec.getCPtr(Vec), Vec);
  }

  /**
   *  Perform the evaluation of the Bspline Basis
   *  and then multiplies by the weights
   *  this just evaluates the current point
   *  the parameter must be normalized between
   *  the 0 and 1 for the span.
   *  The Cache must be valid when calling this
   *  routine. Geom Package will insure that.
   *  and then multiplies by the weights
   *  ththe CacheParameter is where the Cache was
   *  constructed the SpanLength is to normalize
   *  the polynomial in the cache to avoid bad conditioning
   *  effectsis just evaluates the current point
   */
  public static void CacheD1(double U, int Degree, double CacheParameter, double SpanLenght,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights, gp_Pnt2d Point, gp_Vec2d Vec) {
    OCCwrapJavaJNI.BSplCLib_CacheD1__SWIG_1(U, Degree, CacheParameter, SpanLenght, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt2d.getCPtr(Point), Point, gp_Vec2d.getCPtr(Vec), Vec);
  }

  /**
   *  Calls CacheD1 for Bezier  Curves Arrays computed with
   *  the method PolesCoefficients.
   *  Warning: To be used for Beziercurves ONLY!!!
   */
  public static void CoefsD1(double U,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights, gp_Pnt Point, gp_Vec Vec) {
    OCCwrapJavaJNI.BSplCLib_CoefsD1__SWIG_0(U, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(Point), Point, gp_Vec.getCPtr(Vec), Vec);
  }

  /**
   *  Calls CacheD1 for Bezier  Curves Arrays computed with
   *  the method PolesCoefficients.
   *  Warning: To be used for Beziercurves ONLY!!!
   */
  public static void CoefsD1(double U,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights, gp_Pnt2d Point, gp_Vec2d Vec) {
    OCCwrapJavaJNI.BSplCLib_CoefsD1__SWIG_1(U, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt2d.getCPtr(Point), Point, gp_Vec2d.getCPtr(Vec), Vec);
  }

  /**
   *  Perform the evaluation of the of the cache
   *  the parameter must be normalized between
   *  the 0 and 1 for the span.
   *  The Cache must be valid when calling this
   *  routine. Geom Package will insure that.
   *  and then multiplies by the weights
   *  this just evaluates the current point
   *  the CacheParameter is where the Cache was
   *  constructed the SpanLength is to normalize
   *  the polynomial in the cache to avoid bad conditioning
   *  effects
   */
  public static void CacheD2(double U, int Degree, double CacheParameter, double SpanLenght,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights, gp_Pnt Point, gp_Vec Vec1, gp_Vec Vec2) {
    OCCwrapJavaJNI.BSplCLib_CacheD2__SWIG_0(U, Degree, CacheParameter, SpanLenght, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(Point), Point, gp_Vec.getCPtr(Vec1), Vec1, gp_Vec.getCPtr(Vec2), Vec2);
  }

  /**
   *  Perform the evaluation of the Bspline Basis
   *  and then multiplies by the weights
   *  this just evaluates the current point
   *  the parameter must be normalized between
   *  the 0 and 1 for the span.
   *  The Cache must be valid when calling this
   *  routine. Geom Package will insure that.
   *  and then multiplies by the weights
   *  ththe CacheParameter is where the Cache was
   *  constructed the SpanLength is to normalize
   *  the polynomial in the cache to avoid bad conditioning
   *  effectsis just evaluates the current point
   */
  public static void CacheD2(double U, int Degree, double CacheParameter, double SpanLenght,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights, gp_Pnt2d Point, gp_Vec2d Vec1, gp_Vec2d Vec2) {
    OCCwrapJavaJNI.BSplCLib_CacheD2__SWIG_1(U, Degree, CacheParameter, SpanLenght, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt2d.getCPtr(Point), Point, gp_Vec2d.getCPtr(Vec1), Vec1, gp_Vec2d.getCPtr(Vec2), Vec2);
  }

  /**
   *  Calls CacheD1 for Bezier  Curves Arrays computed with
   *  the method PolesCoefficients.
   *  Warning: To be used for Beziercurves ONLY!!!
   */
  public static void CoefsD2(double U,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights, gp_Pnt Point, gp_Vec Vec1, gp_Vec Vec2) {
    OCCwrapJavaJNI.BSplCLib_CoefsD2__SWIG_0(U, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(Point), Point, gp_Vec.getCPtr(Vec1), Vec1, gp_Vec.getCPtr(Vec2), Vec2);
  }

  /**
   *  Calls CacheD1 for Bezier  Curves Arrays computed with
   *  the method PolesCoefficients.
   *  Warning: To be used for Beziercurves ONLY!!!
   */
  public static void CoefsD2(double U,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights, gp_Pnt2d Point, gp_Vec2d Vec1, gp_Vec2d Vec2) {
    OCCwrapJavaJNI.BSplCLib_CoefsD2__SWIG_1(U, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt2d.getCPtr(Point), Point, gp_Vec2d.getCPtr(Vec1), Vec1, gp_Vec2d.getCPtr(Vec2), Vec2);
  }

  /**
   *  Perform the evaluation of the of the cache
   *  the parameter must be normalized between
   *  the 0 and 1 for the span.
   *  The Cache must be valid when calling this
   *  routine. Geom Package will insure that.
   *  and then multiplies by the weights
   *  this just evaluates the current point
   *  the CacheParameter is where the Cache was
   *  constructed the SpanLength is to normalize
   *  the polynomial in the cache to avoid bad conditioning
   *  effects
   */
  public static void CacheD3(double U, int Degree, double CacheParameter, double SpanLenght,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights, gp_Pnt Point, gp_Vec Vec1, gp_Vec Vec2, gp_Vec Vec3) {
    OCCwrapJavaJNI.BSplCLib_CacheD3__SWIG_0(U, Degree, CacheParameter, SpanLenght, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(Point), Point, gp_Vec.getCPtr(Vec1), Vec1, gp_Vec.getCPtr(Vec2), Vec2, gp_Vec.getCPtr(Vec3), Vec3);
  }

  /**
   *  Perform the evaluation of the Bspline Basis
   *  and then multiplies by the weights
   *  this just evaluates the current point
   *  the parameter must be normalized between
   *  the 0 and 1 for the span.
   *  The Cache must be valid when calling this
   *  routine. Geom Package will insure that.
   *  and then multiplies by the weights
   *  ththe CacheParameter is where the Cache was
   *  constructed the SpanLength is to normalize
   *  the polynomial in the cache to avoid bad conditioning
   *  effectsis just evaluates the current point
   */
  public static void CacheD3(double U, int Degree, double CacheParameter, double SpanLenght,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights, gp_Pnt2d Point, gp_Vec2d Vec1, gp_Vec2d Vec2, gp_Vec2d Vec3) {
    OCCwrapJavaJNI.BSplCLib_CacheD3__SWIG_1(U, Degree, CacheParameter, SpanLenght, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt2d.getCPtr(Point), Point, gp_Vec2d.getCPtr(Vec1), Vec1, gp_Vec2d.getCPtr(Vec2), Vec2, gp_Vec2d.getCPtr(Vec3), Vec3);
  }

  /**
   *  Calls CacheD1 for Bezier  Curves Arrays computed with
   *  the method PolesCoefficients.
   *  Warning: To be used for Beziercurves ONLY!!!
   */
  public static void CoefsD3(double U,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights, gp_Pnt Point, gp_Vec Vec1, gp_Vec Vec2, gp_Vec Vec3) {
    OCCwrapJavaJNI.BSplCLib_CoefsD3__SWIG_0(U, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(Point), Point, gp_Vec.getCPtr(Vec1), Vec1, gp_Vec.getCPtr(Vec2), Vec2, gp_Vec.getCPtr(Vec3), Vec3);
  }

  /**
   *  Calls CacheD1 for Bezier  Curves Arrays computed with
   *  the method PolesCoefficients.
   *  Warning: To be used for Beziercurves ONLY!!!
   */
  public static void CoefsD3(double U,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights, gp_Pnt2d Point, gp_Vec2d Vec1, gp_Vec2d Vec2, gp_Vec2d Vec3) {
    OCCwrapJavaJNI.BSplCLib_CoefsD3__SWIG_1(U, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, gp_Pnt2d.getCPtr(Point), Point, gp_Vec2d.getCPtr(Vec1), Vec1, gp_Vec2d.getCPtr(Vec2), Vec2, gp_Vec2d.getCPtr(Vec3), Vec3);
  }

  /**
   *  Perform the evaluation of the Taylor expansion
   *  of the Bspline normalized between 0 and 1.
   *  If rational computes the homogeneous Taylor expension
   *  for the numerator and stores it in CachePoles
   */
  public static void BuildCache(double U, double InverseOfSpanDomain, long PeriodicFlag, int Degree,  TColStd_Array1OfReal  FlatKnots,  TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights,  TColgp_Array1OfPnt  CachePoles, TColStd_Array1OfReal CacheWeights) {
    OCCwrapJavaJNI.BSplCLib_BuildCache__SWIG_0(U, InverseOfSpanDomain, PeriodicFlag, Degree, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColgp_Array1OfPnt.getCPtr(CachePoles), CachePoles, TColStd_Array1OfReal.getCPtr(CacheWeights), CacheWeights);
  }

  /**
   *  Perform the evaluation of the Taylor expansion
   *  of the Bspline normalized between 0 and 1.
   *  If rational computes the homogeneous Taylor expension
   *  for the numerator and stores it in CachePoles
   */
  public static void BuildCache(double U, double InverseOfSpanDomain, long PeriodicFlag, int Degree,  TColStd_Array1OfReal  FlatKnots,  TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights,  TColgp_Array1OfPnt2d  CachePoles, TColStd_Array1OfReal CacheWeights) {
    OCCwrapJavaJNI.BSplCLib_BuildCache__SWIG_1(U, InverseOfSpanDomain, PeriodicFlag, Degree, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColgp_Array1OfPnt2d.getCPtr(CachePoles), CachePoles, TColStd_Array1OfReal.getCPtr(CacheWeights), CacheWeights);
  }

  /**
   *  Perform the evaluation of the Taylor expansion
   *  of the Bspline normalized between 0 and 1.
   *  Structure of result optimized for BSplCLib_Cache.
   */
  public static void BuildCache(double theParameter, double theSpanDomain, long thePeriodicFlag, int theDegree, int theSpanIndex,  TColStd_Array1OfReal  theFlatKnots,  TColgp_Array1OfPnt  thePoles, TColStd_Array1OfReal theWeights,  TColStd_Array2OfReal  theCacheArray) {
    OCCwrapJavaJNI.BSplCLib_BuildCache__SWIG_2(theParameter, theSpanDomain, thePeriodicFlag, theDegree, theSpanIndex, TColStd_Array1OfReal.getCPtr(theFlatKnots), theFlatKnots, TColgp_Array1OfPnt.getCPtr(thePoles), thePoles, TColStd_Array1OfReal.getCPtr(theWeights), theWeights, TColStd_Array2OfReal.getCPtr(theCacheArray), theCacheArray);
  }

  /**
   *  Perform the evaluation of the Taylor expansion
   *  of the Bspline normalized between 0 and 1.
   *  Structure of result optimized for BSplCLib_Cache.
   */
  public static void BuildCache(double theParameter, double theSpanDomain, long thePeriodicFlag, int theDegree, int theSpanIndex,  TColStd_Array1OfReal  theFlatKnots,  TColgp_Array1OfPnt2d  thePoles, TColStd_Array1OfReal theWeights,  TColStd_Array2OfReal  theCacheArray) {
    OCCwrapJavaJNI.BSplCLib_BuildCache__SWIG_3(theParameter, theSpanDomain, thePeriodicFlag, theDegree, theSpanIndex, TColStd_Array1OfReal.getCPtr(theFlatKnots), theFlatKnots, TColgp_Array1OfPnt2d.getCPtr(thePoles), thePoles, TColStd_Array1OfReal.getCPtr(theWeights), theWeights, TColStd_Array2OfReal.getCPtr(theCacheArray), theCacheArray);
  }

  public static void PolesCoefficients( TColgp_Array1OfPnt2d  Poles,  TColgp_Array1OfPnt2d  CachePoles) {
    OCCwrapJavaJNI.BSplCLib_PolesCoefficients__SWIG_0(TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColgp_Array1OfPnt2d.getCPtr(CachePoles), CachePoles);
  }

  public static void PolesCoefficients( TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights,  TColgp_Array1OfPnt2d  CachePoles, TColStd_Array1OfReal CacheWeights) {
    OCCwrapJavaJNI.BSplCLib_PolesCoefficients__SWIG_1(TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColgp_Array1OfPnt2d.getCPtr(CachePoles), CachePoles, TColStd_Array1OfReal.getCPtr(CacheWeights), CacheWeights);
  }

  public static void PolesCoefficients( TColgp_Array1OfPnt  Poles,  TColgp_Array1OfPnt  CachePoles) {
    OCCwrapJavaJNI.BSplCLib_PolesCoefficients__SWIG_2(TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColgp_Array1OfPnt.getCPtr(CachePoles), CachePoles);
  }

  /**
   *  Encapsulation   of  BuildCache    to   perform   the
   *  evaluation  of the Taylor expansion for beziercurves
   *  at parameter 0.
   *  Warning: To be used for Beziercurves ONLY!!!
   */
  public static void PolesCoefficients( TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights,  TColgp_Array1OfPnt  CachePoles, TColStd_Array1OfReal CacheWeights) {
    OCCwrapJavaJNI.BSplCLib_PolesCoefficients__SWIG_3(TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColgp_Array1OfPnt.getCPtr(CachePoles), CachePoles, TColStd_Array1OfReal.getCPtr(CacheWeights), CacheWeights);
  }

  /**
   *  Returns pointer to statically allocated array representing
   *  flat knots for bezier curve of the specified degree.
   *  Raises OutOfRange if Degree > MaxDegree()
   */
  public static  double  FlatBezierKnots(int Degree) { return OCCwrapJavaJNI.BSplCLib_FlatBezierKnots(Degree); }

  /**
   *  builds the Schoenberg points from the flat knot
   *  used to interpolate a BSpline since the
   *  BSpline matrix is invertible.
   */
  public static void BuildSchoenbergPoints(int Degree,  TColStd_Array1OfReal  FlatKnots,  TColStd_Array1OfReal  Parameters) {
    OCCwrapJavaJNI.BSplCLib_BuildSchoenbergPoints(Degree, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, TColStd_Array1OfReal.getCPtr(Parameters), Parameters);
  }

  /**
   *  Performs the interpolation of  the data given in
   *  the Poles  array  according  to the  requests in
   *  ContactOrderArray    that is      :           if
   *  ContactOrderArray(i) has value  d it means  that
   *  Poles(i)   containes the dth  derivative of  the
   *  function to be interpolated. The length L of the
   *  following arrays must be the same :
   *  Parameters, ContactOrderArray, Poles,
   *  The length of FlatKnots is Degree + L + 1
   *  Warning:
   *  the method used to do that interpolation is
   *  gauss elimination WITHOUT pivoting. Thus if the
   *  diagonal is not dominant there is no guarantee
   *  that the algorithm will work. Nevertheless for
   *  Cubic interpolation or interpolation at Scheonberg
   *  points the method will work
   *  The InversionProblem will report 0 if there was no
   *  problem else it will give the index of the faulty
   *  pivot
   */
  public static void Interpolate(int Degree,  TColStd_Array1OfReal  FlatKnots,  TColStd_Array1OfReal  Parameters,  TColStd_Array1OfInteger  ContactOrderArray,  TColgp_Array1OfPnt  Poles, int[] InversionProblem) {
    OCCwrapJavaJNI.BSplCLib_Interpolate__SWIG_0(Degree, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, TColStd_Array1OfInteger.getCPtr(ContactOrderArray), ContactOrderArray, TColgp_Array1OfPnt.getCPtr(Poles), Poles, InversionProblem);
  }

  /**
   *  Performs the interpolation of  the data given in
   *  the Poles  array  according  to the  requests in
   *  ContactOrderArray    that is      :           if
   *  ContactOrderArray(i) has value  d it means  that
   *  Poles(i)   containes the dth  derivative of  the
   *  function to be interpolated. The length L of the
   *  following arrays must be the same :
   *  Parameters, ContactOrderArray, Poles,
   *  The length of FlatKnots is Degree + L + 1
   *  Warning:
   *  the method used to do that interpolation is
   *  gauss elimination WITHOUT pivoting. Thus if the
   *  diagonal is not dominant there is no guarantee
   *  that the algorithm will work. Nevertheless for
   *  Cubic interpolation at knots or interpolation at Scheonberg
   *  points the method will work.
   *  The InversionProblem w
   *  ll report 0 if there was no
   *  problem else it will give the index of the faulty
   *  pivot
   */
  public static void Interpolate(int Degree,  TColStd_Array1OfReal  FlatKnots,  TColStd_Array1OfReal  Parameters,  TColStd_Array1OfInteger  ContactOrderArray,  TColgp_Array1OfPnt2d  Poles, int[] InversionProblem) {
    OCCwrapJavaJNI.BSplCLib_Interpolate__SWIG_1(Degree, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, TColStd_Array1OfInteger.getCPtr(ContactOrderArray), ContactOrderArray, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, InversionProblem);
  }

  /**
   *  Performs the interpolation of  the data given in
   *  the Poles  array  according  to the  requests in
   *  ContactOrderArray    that is      :           if
   *  ContactOrderArray(i) has value  d it means  that
   *  Poles(i)   containes the dth  derivative of  the
   *  function to be interpolated. The length L of the
   *  following arrays must be the same :
   *  Parameters, ContactOrderArray, Poles,
   *  The length of FlatKnots is Degree + L + 1
   *  Warning:
   *  the method used to do that interpolation is
   *  gauss elimination WITHOUT pivoting. Thus if the
   *  diagonal is not dominant there is no guarantee
   *  that the algorithm will work. Nevertheless for
   *  Cubic interpolation at knots or interpolation at Scheonberg
   *  points the method will work.
   *  The InversionProblem will report 0 if there was no
   *  problem else it will give the index of the faulty
   *  pivot
   */
  public static void Interpolate(int Degree,  TColStd_Array1OfReal  FlatKnots,  TColStd_Array1OfReal  Parameters,  TColStd_Array1OfInteger  ContactOrderArray,  TColgp_Array1OfPnt  Poles,  TColStd_Array1OfReal  Weights, int[] InversionProblem) {
    OCCwrapJavaJNI.BSplCLib_Interpolate__SWIG_2(Degree, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, TColStd_Array1OfInteger.getCPtr(ContactOrderArray), ContactOrderArray, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, InversionProblem);
  }

  /**
   *  Performs the interpolation of  the data given in
   *  the Poles  array  according  to the  requests in
   *  ContactOrderArray    that is      :           if
   *  ContactOrderArray(i) has value  d it means  that
   *  Poles(i)   containes the dth  derivative of  the
   *  function to be interpolated. The length L of the
   *  following arrays must be the same :
   *  Parameters, ContactOrderArray, Poles,
   *  The length of FlatKnots is Degree + L + 1
   *  Warning:
   *  the method used to do that interpolation is
   *  gauss elimination WITHOUT pivoting. Thus if the
   *  diagonal is not dominant there is no guarantee
   *  that the algorithm will work. Nevertheless for
   *  Cubic interpolation at knots or interpolation at Scheonberg
   *  points the method will work.
   *  The InversionProblem w
   *  ll report 0 if there was no
   *  problem else it will give the i
   */
  public static void Interpolate(int Degree,  TColStd_Array1OfReal  FlatKnots,  TColStd_Array1OfReal  Parameters,  TColStd_Array1OfInteger  ContactOrderArray,  TColgp_Array1OfPnt2d  Poles,  TColStd_Array1OfReal  Weights, int[] InversionProblem) {
    OCCwrapJavaJNI.BSplCLib_Interpolate__SWIG_3(Degree, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, TColStd_Array1OfInteger.getCPtr(ContactOrderArray), ContactOrderArray, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, InversionProblem);
  }

  /**
   *  Performs the interpolation of  the data given in
   *  the Poles  array  according  to the  requests in
   *  ContactOrderArray    that is      :           if
   *  ContactOrderArray(i) has value  d it means  that
   *  Poles(i)   containes the dth  derivative of  the
   *  function to be interpolated. The length L of the
   *  following arrays must be the same :
   *  Parameters, ContactOrderArray
   *  The length of FlatKnots is Degree + L + 1
   *  The  PolesArray   is    an   seen   as    an
   *  Array[1..N][1..ArrayDimension] with N = tge length
   *  of the parameters array
   *  Warning:
   *  the method used to do that interpolation is
   *  gauss elimination WITHOUT pivoting. Thus if the
   *  diagonal is not dominant there is no guarantee
   *  that the algorithm will work. Nevertheless for
   *  Cubic interpolation or interpolation at Scheonberg
   *  points the method will work
   *  The InversionProblem will report 0 if there was no
   *  problem else it will give the index of the faulty
   *  pivot
   */
  public static void Interpolate(int Degree,  TColStd_Array1OfReal  FlatKnots,  TColStd_Array1OfReal  Parameters,  TColStd_Array1OfInteger  ContactOrderArray, int ArrayDimension, double[] Poles, int[] InversionProblem) {
    OCCwrapJavaJNI.BSplCLib_Interpolate__SWIG_4(Degree, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, TColStd_Array1OfInteger.getCPtr(ContactOrderArray), ContactOrderArray, ArrayDimension, Poles, InversionProblem);
  }

  public static void Interpolate(int Degree,  TColStd_Array1OfReal  FlatKnots,  TColStd_Array1OfReal  Parameters,  TColStd_Array1OfInteger  ContactOrderArray, int ArrayDimension, double[] Poles, double[] Weights, int[] InversionProblem) {
    OCCwrapJavaJNI.BSplCLib_Interpolate__SWIG_5(Degree, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, TColStd_Array1OfInteger.getCPtr(ContactOrderArray), ContactOrderArray, ArrayDimension, Poles, Weights, InversionProblem);
  }

  /**
   *  Find the new poles which allows  an old point (with a
   *  given  u as parameter) to reach a new position
   *  Index1 and Index2 indicate the range of poles we can move
   *  (1, NbPoles-1) or (2, NbPoles) -> no constraint for one side
   *  don't enter (1,NbPoles) -> error: rigid move
   *  (2, NbPoles-1) -> the ends are enforced
   *  (3, NbPoles-2) -> the ends and the tangency are enforced
   *  if Problem in BSplineBasis calculation, no change for the curve
   *  and FirstIndex, LastIndex = 0
   */
  public static void MovePoint(double U,  gp_Vec2d  Displ, int Index1, int Index2, int Degree, long Rational,  TColgp_Array1OfPnt2d  Poles,  TColStd_Array1OfReal  Weights,  TColStd_Array1OfReal  FlatKnots, int[] FirstIndex, int[] LastIndex,  TColgp_Array1OfPnt2d  NewPoles) {
    OCCwrapJavaJNI.BSplCLib_MovePoint__SWIG_0(U, gp_Vec2d.getCPtr(Displ), Displ, Index1, Index2, Degree, Rational, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, FirstIndex, LastIndex, TColgp_Array1OfPnt2d.getCPtr(NewPoles), NewPoles);
  }

  /**
   *  Find the new poles which allows  an old point (with a
   *  given  u as parameter) to reach a new position
   *  Index1 and Index2 indicate the range of poles we can move
   *  (1, NbPoles-1) or (2, NbPoles) -> no constraint for one side
   *  don't enter (1,NbPoles) -> error: rigid move
   *  (2, NbPoles-1) -> the ends are enforced
   *  (3, NbPoles-2) -> the ends and the tangency are enforced
   *  if Problem in BSplineBasis calculation, no change for the curve
   *  and FirstIndex, LastIndex = 0
   */
  public static void MovePoint(double U,  gp_Vec  Displ, int Index1, int Index2, int Degree, long Rational,  TColgp_Array1OfPnt  Poles,  TColStd_Array1OfReal  Weights,  TColStd_Array1OfReal  FlatKnots, int[] FirstIndex, int[] LastIndex,  TColgp_Array1OfPnt  NewPoles) {
    OCCwrapJavaJNI.BSplCLib_MovePoint__SWIG_1(U, gp_Vec.getCPtr(Displ), Displ, Index1, Index2, Degree, Rational, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, FirstIndex, LastIndex, TColgp_Array1OfPnt.getCPtr(NewPoles), NewPoles);
  }

  /**
   *  This is the dimension free version of the utility
   *  U is the parameter  must be within the  first FlatKnots and the
   *  last FlatKnots  Delta is the amount the  curve has  to be moved
   *  DeltaDerivative is the  amount the derivative  has to be moved.
   *  Delta  and   DeltaDerivative   must be    array   of  dimension
   *  ArrayDimension  Degree  is the degree  of   the BSpline and the
   *  FlatKnots are the knots of the BSpline  Starting Condition if =
   *  -1 means the starting point of the curve can move
   *  = 0 means the
   *  starting  point  of the cuve  cannot  move but  tangen  starting
   *  point of the curve cannot move
   *  = 1 means the starting point and tangents cannot move
   *  = 2 means the starting point tangent and curvature cannot move
   *  = ...
   *  Same holds for EndingCondition
   *  Poles are the poles of the curve
   *  Weights are the weights of the curve if Rational = Standard_True
   *  NewPoles are the poles of the deformed curve
   *  ErrorStatus will be 0 if no error happened
   *  1 if there are not enough knots/poles
   *  the imposed conditions
   *  The way to solve this problem is to add knots to the BSpline
   *  If StartCondition = 1 and EndCondition = 1 then you need at least
   *  4 + 2 = 6 poles so for example to have a C1 cubic you will need
   *  have at least 2 internal knots.
   */
  public static void MovePointAndTangent(double U, int ArrayDimension, double[] Delta, double[] DeltaDerivative, double Tolerance, int Degree, long Rational, int StartingCondition, int EndingCondition, double[] Poles,  TColStd_Array1OfReal  Weights,  TColStd_Array1OfReal  FlatKnots, double[] NewPoles, int[] ErrorStatus) {
    OCCwrapJavaJNI.BSplCLib_MovePointAndTangent__SWIG_0(U, ArrayDimension, Delta, DeltaDerivative, Tolerance, Degree, Rational, StartingCondition, EndingCondition, Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, NewPoles, ErrorStatus);
  }

  /**
   *  This is the dimension free version of the utility
   *  U is the parameter  must be within the  first FlatKnots and the
   *  last FlatKnots  Delta is the amount the  curve has  to be moved
   *  DeltaDerivative is the  amount the derivative  has to be moved.
   *  Delta  and   DeltaDerivative   must be    array   of  dimension
   *  ArrayDimension  Degree  is the degree  of   the BSpline and the
   *  FlatKnots are the knots of the BSpline  Starting Condition if =
   *  -1 means the starting point of the curve can move
   *  = 0 means the
   *  starting  point  of the cuve  cannot  move but  tangen  starting
   *  point of the curve cannot move
   *  = 1 means the starting point and tangents cannot move
   *  = 2 means the starting point tangent and curvature cannot move
   *  = ...
   *  Same holds for EndingCondition
   *  Poles are the poles of the curve
   *  Weights are the weights of the curve if Rational = Standard_True
   *  NewPoles are the poles of the deformed curve
   *  ErrorStatus will be 0 if no error happened
   *  1 if there are not enough knots/poles
   *  the imposed conditions
   *  The way to solve this problem is to add knots to the BSpline
   *  If StartCondition = 1 and EndCondition = 1 then you need at least
   *  4 + 2 = 6 poles so for example to have a C1 cubic you will need
   *  have at least 2 internal knots.
   */
  public static void MovePointAndTangent(double U,  gp_Vec  Delta,  gp_Vec  DeltaDerivative, double Tolerance, int Degree, long Rational, int StartingCondition, int EndingCondition,  TColgp_Array1OfPnt  Poles,  TColStd_Array1OfReal  Weights,  TColStd_Array1OfReal  FlatKnots,  TColgp_Array1OfPnt  NewPoles, int[] ErrorStatus) {
    OCCwrapJavaJNI.BSplCLib_MovePointAndTangent__SWIG_1(U, gp_Vec.getCPtr(Delta), Delta, gp_Vec.getCPtr(DeltaDerivative), DeltaDerivative, Tolerance, Degree, Rational, StartingCondition, EndingCondition, TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, TColgp_Array1OfPnt.getCPtr(NewPoles), NewPoles, ErrorStatus);
  }

  /**
   *  This is the dimension free version of the utility
   *  U is the parameter  must be within the  first FlatKnots and the
   *  last FlatKnots  Delta is the amount the  curve has  to be moved
   *  DeltaDerivative is the  amount the derivative  has to be moved.
   *  Delta  and   DeltaDerivative   must be    array   of  dimension
   *  ArrayDimension  Degree  is the degree  of   the BSpline and the
   *  FlatKnots are the knots of the BSpline  Starting Condition if =
   *  -1 means the starting point of the curve can move
   *  = 0 means the
   *  starting  point  of the cuve  cannot  move but  tangen  starting
   *  point of the curve cannot move
   *  = 1 means the starting point and tangents cannot move
   *  = 2 means the starting point tangent and curvature cannot move
   *  = ...
   *  Same holds for EndingCondition
   *  Poles are the poles of the curve
   *  Weights are the weights of the curve if Rational = Standard_True
   *  NewPoles are the poles of the deformed curve
   *  ErrorStatus will be 0 if no error happened
   *  1 if there are not enough knots/poles
   *  the imposed conditions
   *  The way to solve this problem is to add knots to the BSpline
   *  If StartCondition = 1 and EndCondition = 1 then you need at least
   *  4 + 2 = 6 poles so for example to have a C1 cubic you will need
   *  have at least 2 internal knots.
   */
  public static void MovePointAndTangent(double U,  gp_Vec2d  Delta,  gp_Vec2d  DeltaDerivative, double Tolerance, int Degree, long Rational, int StartingCondition, int EndingCondition,  TColgp_Array1OfPnt2d  Poles,  TColStd_Array1OfReal  Weights,  TColStd_Array1OfReal  FlatKnots,  TColgp_Array1OfPnt2d  NewPoles, int[] ErrorStatus) {
    OCCwrapJavaJNI.BSplCLib_MovePointAndTangent__SWIG_2(U, gp_Vec2d.getCPtr(Delta), Delta, gp_Vec2d.getCPtr(DeltaDerivative), DeltaDerivative, Tolerance, Degree, Rational, StartingCondition, EndingCondition, TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, TColgp_Array1OfPnt2d.getCPtr(NewPoles), NewPoles, ErrorStatus);
  }

  /**
   *  given a tolerance in 3D space returns a
   *  tolerance    in U parameter space such that
   *  all u1 and u0 in the domain of the curve f(u)
   *  | u1 - u0 | < UTolerance and
   *  we have |f (u1) - f (u0)| < Tolerance3D
   */
  public static void Resolution(double[] PolesArray, int ArrayDimension, int NumPoles, TColStd_Array1OfReal Weights,  TColStd_Array1OfReal  FlatKnots, int Degree, double Tolerance3D, double[] UTolerance) {
    OCCwrapJavaJNI.BSplCLib_Resolution__SWIG_0(PolesArray, ArrayDimension, NumPoles, TColStd_Array1OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, Degree, Tolerance3D, UTolerance);
  }

  /**
   *  given a tolerance in 3D space returns a
   *  tolerance    in U parameter space such that
   *  all u1 and u0 in the domain of the curve f(u)
   *  | u1 - u0 | < UTolerance and
   *  we have |f (u1) - f (u0)| < Tolerance3D
   */
  public static void Resolution( TColgp_Array1OfPnt  Poles, TColStd_Array1OfReal Weights, int NumPoles,  TColStd_Array1OfReal  FlatKnots, int Degree, double Tolerance3D, double[] UTolerance) {
    OCCwrapJavaJNI.BSplCLib_Resolution__SWIG_1(TColgp_Array1OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, NumPoles, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, Degree, Tolerance3D, UTolerance);
  }

  /**
   *  given a tolerance in 3D space returns a
   *  tolerance    in U parameter space such that
   *  all u1 and u0 in the domain of the curve f(u)
   *  | u1 - u0 | < UTolerance and
   *  we have |f (u1) - f (u0)| < Tolerance3D
   */
  public static void Resolution( TColgp_Array1OfPnt2d  Poles, TColStd_Array1OfReal Weights, int NumPoles,  TColStd_Array1OfReal  FlatKnots, int Degree, double Tolerance3D, double[] UTolerance) {
    OCCwrapJavaJNI.BSplCLib_Resolution__SWIG_2(TColgp_Array1OfPnt2d.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(Weights), Weights, NumPoles, TColStd_Array1OfReal.getCPtr(FlatKnots), FlatKnots, Degree, Tolerance3D, UTolerance);
  }

  public BSplCLib() {
    this(OCCwrapJavaJNI.new_BSplCLib(), true);
  }

}
