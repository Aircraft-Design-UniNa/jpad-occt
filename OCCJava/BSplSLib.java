package opencascade;

/**
 *  BSplSLib   B-spline surface Library
 *  This  package provides   an  implementation  of  geometric
 *  functions for rational and non rational, periodic  and non
 *  periodic B-spline surface computation.
 * 
 *  this package uses   the  multi-dimensions splines  methods
 *  provided in the package BSplCLib.
 * 
 *  In this package the B-spline surface is defined with :
 *  . its control points :  Array2OfPnt     Poles
 *  . its weights        :  Array2OfReal    Weights
 *  . its knots and their multiplicity in the two parametric
 *  direction U and V  :  Array1OfReal    UKnots, VKnots and
 *  Array1OfInteger UMults, VMults.
 *  . the degree of the normalized Spline functions :
 *  UDegree, VDegree
 * 
 *  . the Booleans URational, VRational to know if the weights
 *  are constant in the U or V direction.
 * 
 *  . the Booleans UPeriodic,   VRational  to know if the  the
 *  surface is periodic in the U or V direction.
 * 
 *  Warnings : The  bounds of UKnots  and UMults should be the
 *  same, the bounds of VKnots and VMults should be  the same,
 *  the bounds of Poles and Weights shoud be the same.
 * 
 *  The Control points representation is :
 *  Poles(Uorigin,Vorigin) ...................Poles(Uorigin,Vend)
 *  .                                     .
 *  .                                     .
 *  Poles(Uend, Vorigin) .....................Poles(Uend, Vend)
 * 
 *  For  the double array  the row indice   corresponds to the
 *  parametric U direction  and the columns indice corresponds
 *  to the parametric V direction.
 * 
 *  Note: weight and multiplicity arrays can be passed by pointer for
 *  some functions so that NULL pointer is valid.
 *  That means no weights/no multiplicities passed.
 *  
 *  KeyWords :
 *  B-spline surface, Functions, Library
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
public class BSplSLib {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BSplSLib(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BSplSLib(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BSplSLib obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BSplSLib(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  this is a one dimensional function
   *  typedef  void (*EvaluatorFunction)  (
   *  Standard_Integer     // Derivative Request
   *  Standard_Real    *   // StartEnd[2][2]
   *  //  [0] = U
   *  //  [1] = V
   *  //        [0] = start
   *  //        [1] = end
   *  Standard_Real        // UParameter
   *  Standard_Real        // VParamerer
   *  Standard_Real    &   // Result
   *  Standard_Integer &) ;// Error Code
   *  serves to multiply a given vectorial BSpline by a function
   *  Computes  the     derivatives   of  a    ratio  of
   *  two-variables functions  x(u,v) / w(u,v) at orders
   *  <N,M>,    x(u,v)    is   a  vector in    dimension
   *  <3>.
   * 
   *  <Ders> is  an array  containing the values  of the
   *  input derivatives from 0  to Min(<N>,<UDeg>), 0 to
   *  Min(<M>,<VDeg>).    For orders    higher      than
   *  <UDeg,VDeg>  the  input derivatives are assumed to
   *  be 0.
   * 
   *  The <Ders> is a 2d array and the  dimension of the
   *  lines is always (<VDeg>+1) * (<3>+1), even
   *  if   <N> is smaller  than  <Udeg> (the derivatives
   *  higher than <N> are not used).
   * 
   *  Content of <Ders> :
   * 
   *  x(i,j)[k] means :  the composant  k of x derivated
   *  (i) times in u and (j) times in v.
   * 
   *  ... First line ...
   * 
   *  x[1],x[2],...,x[3],w
   *  x(0,1)[1],...,x(0,1)[3],w(1,0)
   *  ...
   *  x(0,VDeg)[1],...,x(0,VDeg)[3],w(0,VDeg)
   * 
   *  ... Then second line ...
   * 
   *  x(1,0)[1],...,x(1,0)[3],w(1,0)
   *  x(1,1)[1],...,x(1,1)[3],w(1,1)
   *  ...
   *  x(1,VDeg)[1],...,x(1,VDeg)[3],w(1,VDeg)
   * 
   *  ...
   * 
   *  ... Last line ...
   * 
   *  x(UDeg,0)[1],...,x(UDeg,0)[3],w(UDeg,0)
   *  x(UDeg,1)[1],...,x(UDeg,1)[3],w(UDeg,1)
   *  ...
   *  x(Udeg,VDeg)[1],...,x(UDeg,VDeg)[3],w(Udeg,VDeg)
   * 
   *  If <All>  is false, only  the derivative  at order
   *  <N,M> is computed.  <RDers> is an  array of length
   *  3 which will contain the result :
   * 
   *  x(1)/w , x(2)/w ,  ... derivated <N> <M> times
   * 
   *  If   <All>    is  true  multiples  derivatives are
   *  computed. All the  derivatives (i,j) with 0 <= i+j
   *  <= Max(N,M) are  computed.  <RDers> is an array of
   *  length 3 *  (<N>+1)  * (<M>+1) which  will
   *  contains :
   * 
   *  x(1)/w , x(2)/w ,  ...
   *  x(1)/w , x(2)/w ,  ... derivated <0,1> times
   *  x(1)/w , x(2)/w ,  ... derivated <0,2> times
   *  ...
   *  x(1)/w , x(2)/w ,  ... derivated <0,N> times
   * 
   *  x(1)/w , x(2)/w ,  ... derivated <1,0> times
   *  x(1)/w , x(2)/w ,  ... derivated <1,1> times
   *  ...
   *  x(1)/w , x(2)/w ,  ... derivated <1,N> times
   * 
   *  x(1)/w , x(2)/w ,  ... derivated <N,0> times
   *  ....
   *  Warning: <RDers> must be dimensionned properly.
   */
  public static void RationalDerivative(int UDeg, int VDeg, int N, int M, double[] Ders, double[] RDers, long All) {
    OCCwrapJavaJNI.BSplSLib_RationalDerivative__SWIG_0(UDeg, VDeg, N, M, Ders, RDers, All);
  }

  public static void RationalDerivative(int UDeg, int VDeg, int N, int M, double[] Ders, double[] RDers) {
    OCCwrapJavaJNI.BSplSLib_RationalDerivative__SWIG_1(UDeg, VDeg, N, M, Ders, RDers);
  }

  public static void D0(double U, double V, int UIndex, int VIndex,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights,  TColStd_Array1OfReal  UKnots,  TColStd_Array1OfReal  VKnots, TColStd_Array1OfInteger UMults, TColStd_Array1OfInteger VMults, int UDegree, int VDegree, long URat, long VRat, long UPer, long VPer, gp_Pnt P) {
    OCCwrapJavaJNI.BSplSLib_D0(U, V, UIndex, VIndex, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(UKnots), UKnots, TColStd_Array1OfReal.getCPtr(VKnots), VKnots, TColStd_Array1OfInteger.getCPtr(UMults), UMults, TColStd_Array1OfInteger.getCPtr(VMults), VMults, UDegree, VDegree, URat, VRat, UPer, VPer, gp_Pnt.getCPtr(P), P);
  }

  public static void D1(double U, double V, int UIndex, int VIndex,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights,  TColStd_Array1OfReal  UKnots,  TColStd_Array1OfReal  VKnots, TColStd_Array1OfInteger UMults, TColStd_Array1OfInteger VMults, int Degree, int VDegree, long URat, long VRat, long UPer, long VPer, gp_Pnt P, gp_Vec Vu, gp_Vec Vv) {
    OCCwrapJavaJNI.BSplSLib_D1(U, V, UIndex, VIndex, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(UKnots), UKnots, TColStd_Array1OfReal.getCPtr(VKnots), VKnots, TColStd_Array1OfInteger.getCPtr(UMults), UMults, TColStd_Array1OfInteger.getCPtr(VMults), VMults, Degree, VDegree, URat, VRat, UPer, VPer, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(Vu), Vu, gp_Vec.getCPtr(Vv), Vv);
  }

  public static void D2(double U, double V, int UIndex, int VIndex,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights,  TColStd_Array1OfReal  UKnots,  TColStd_Array1OfReal  VKnots, TColStd_Array1OfInteger UMults, TColStd_Array1OfInteger VMults, int UDegree, int VDegree, long URat, long VRat, long UPer, long VPer, gp_Pnt P, gp_Vec Vu, gp_Vec Vv, gp_Vec Vuu, gp_Vec Vvv, gp_Vec Vuv) {
    OCCwrapJavaJNI.BSplSLib_D2(U, V, UIndex, VIndex, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(UKnots), UKnots, TColStd_Array1OfReal.getCPtr(VKnots), VKnots, TColStd_Array1OfInteger.getCPtr(UMults), UMults, TColStd_Array1OfInteger.getCPtr(VMults), VMults, UDegree, VDegree, URat, VRat, UPer, VPer, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(Vu), Vu, gp_Vec.getCPtr(Vv), Vv, gp_Vec.getCPtr(Vuu), Vuu, gp_Vec.getCPtr(Vvv), Vvv, gp_Vec.getCPtr(Vuv), Vuv);
  }

  public static void D3(double U, double V, int UIndex, int VIndex,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights,  TColStd_Array1OfReal  UKnots,  TColStd_Array1OfReal  VKnots, TColStd_Array1OfInteger UMults, TColStd_Array1OfInteger VMults, int UDegree, int VDegree, long URat, long VRat, long UPer, long VPer, gp_Pnt P, gp_Vec Vu, gp_Vec Vv, gp_Vec Vuu, gp_Vec Vvv, gp_Vec Vuv, gp_Vec Vuuu, gp_Vec Vvvv, gp_Vec Vuuv, gp_Vec Vuvv) {
    OCCwrapJavaJNI.BSplSLib_D3(U, V, UIndex, VIndex, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(UKnots), UKnots, TColStd_Array1OfReal.getCPtr(VKnots), VKnots, TColStd_Array1OfInteger.getCPtr(UMults), UMults, TColStd_Array1OfInteger.getCPtr(VMults), VMults, UDegree, VDegree, URat, VRat, UPer, VPer, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(Vu), Vu, gp_Vec.getCPtr(Vv), Vv, gp_Vec.getCPtr(Vuu), Vuu, gp_Vec.getCPtr(Vvv), Vvv, gp_Vec.getCPtr(Vuv), Vuv, gp_Vec.getCPtr(Vuuu), Vuuu, gp_Vec.getCPtr(Vvvv), Vvvv, gp_Vec.getCPtr(Vuuv), Vuuv, gp_Vec.getCPtr(Vuvv), Vuvv);
  }

  public static void DN(double U, double V, int Nu, int Nv, int UIndex, int VIndex,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights,  TColStd_Array1OfReal  UKnots,  TColStd_Array1OfReal  VKnots, TColStd_Array1OfInteger UMults, TColStd_Array1OfInteger VMults, int UDegree, int VDegree, long URat, long VRat, long UPer, long VPer, gp_Vec Vn) {
    OCCwrapJavaJNI.BSplSLib_DN(U, V, Nu, Nv, UIndex, VIndex, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(UKnots), UKnots, TColStd_Array1OfReal.getCPtr(VKnots), VKnots, TColStd_Array1OfInteger.getCPtr(UMults), UMults, TColStd_Array1OfInteger.getCPtr(VMults), VMults, UDegree, VDegree, URat, VRat, UPer, VPer, gp_Vec.getCPtr(Vn), Vn);
  }

  /**
   *  Computes the  poles and weights of an isoparametric
   *  curve at parameter  <Param> (UIso if <IsU> is True,
   *  VIso  else).
   */
  public static void Iso(double Param, long IsU,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights,  TColStd_Array1OfReal  Knots, TColStd_Array1OfInteger Mults, int Degree, long Periodic,  TColgp_Array1OfPnt  CPoles, TColStd_Array1OfReal CWeights) {
    OCCwrapJavaJNI.BSplSLib_Iso(Param, IsU, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, Degree, Periodic, TColgp_Array1OfPnt.getCPtr(CPoles), CPoles, TColStd_Array1OfReal.getCPtr(CWeights), CWeights);
  }

  /**
   *  Reverses the array of poles. Last is the Index of
   *  the new first Row( Col) of Poles.
   *  On  a  non periodic surface Last is
   *  Poles.Upper().
   *  On a periodic curve last is
   *  (number of flat knots - degree - 1)
   *  or
   *  (sum of multiplicities(but  for the last) + degree
   *  - 1)
   */
  public static void Reverse( TColgp_Array2OfPnt  Poles, int Last, long UDirection) {
    OCCwrapJavaJNI.BSplSLib_Reverse__SWIG_0(TColgp_Array2OfPnt.getCPtr(Poles), Poles, Last, UDirection);
  }

  /**
   *  Makes an homogeneous  evaluation of Poles and Weights
   *  any and returns in P the Numerator value and
   *  in W the Denominator value if Weights are present
   *  otherwise returns 1.0e0
   */
  public static void HomogeneousD0(double U, double V, int UIndex, int VIndex,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights,  TColStd_Array1OfReal  UKnots,  TColStd_Array1OfReal  VKnots, TColStd_Array1OfInteger UMults, TColStd_Array1OfInteger VMults, int UDegree, int VDegree, long URat, long VRat, long UPer, long VPer, double[] W, gp_Pnt P) {
    OCCwrapJavaJNI.BSplSLib_HomogeneousD0(U, V, UIndex, VIndex, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(UKnots), UKnots, TColStd_Array1OfReal.getCPtr(VKnots), VKnots, TColStd_Array1OfInteger.getCPtr(UMults), UMults, TColStd_Array1OfInteger.getCPtr(VMults), VMults, UDegree, VDegree, URat, VRat, UPer, VPer, W, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Makes an homogeneous  evaluation of Poles and Weights
   *  any and returns in P the Numerator value and
   *  in W the Denominator value if Weights are present
   *  otherwise returns 1.0e0
   */
  public static void HomogeneousD1(double U, double V, int UIndex, int VIndex,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights,  TColStd_Array1OfReal  UKnots,  TColStd_Array1OfReal  VKnots, TColStd_Array1OfInteger UMults, TColStd_Array1OfInteger VMults, int UDegree, int VDegree, long URat, long VRat, long UPer, long VPer, gp_Pnt N, gp_Vec Nu, gp_Vec Nv, double[] D, double[] Du, double[] Dv) {
    OCCwrapJavaJNI.BSplSLib_HomogeneousD1(U, V, UIndex, VIndex, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(UKnots), UKnots, TColStd_Array1OfReal.getCPtr(VKnots), VKnots, TColStd_Array1OfInteger.getCPtr(UMults), UMults, TColStd_Array1OfInteger.getCPtr(VMults), VMults, UDegree, VDegree, URat, VRat, UPer, VPer, gp_Pnt.getCPtr(N), N, gp_Vec.getCPtr(Nu), Nu, gp_Vec.getCPtr(Nv), Nv, D, Du, Dv);
  }

  /**
   *  Reverses the array of weights.
   */
  public static void Reverse( TColStd_Array2OfReal  Weights, int Last, long UDirection) {
    OCCwrapJavaJNI.BSplSLib_Reverse__SWIG_1(TColStd_Array2OfReal.getCPtr(Weights), Weights, Last, UDirection);
  }

  /**
   *  Returns False if all the weights  of the  array <Weights>
   *  in the area [I1,I2] * [J1,J2] are  identic.
   *  Epsilon  is used for comparing  weights.
   *  If Epsilon  is 0. the  Epsilon of the first weight is used.
   */
  public static long IsRational( TColStd_Array2OfReal  Weights, int I1, int I2, int J1, int J2, double Epsilon) {
    return OCCwrapJavaJNI.BSplSLib_IsRational__SWIG_0(TColStd_Array2OfReal.getCPtr(Weights), Weights, I1, I2, J1, J2, Epsilon);
  }

  public static long IsRational( TColStd_Array2OfReal  Weights, int I1, int I2, int J1, int J2) {
    return OCCwrapJavaJNI.BSplSLib_IsRational__SWIG_1(TColStd_Array2OfReal.getCPtr(Weights), Weights, I1, I2, J1, J2);
  }

  /**
   *  Copy in FP the coordinates of the poles.
   */
  public static void SetPoles( TColgp_Array2OfPnt  Poles,  TColStd_Array1OfReal  FP, long UDirection) {
    OCCwrapJavaJNI.BSplSLib_SetPoles__SWIG_0(TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(FP), FP, UDirection);
  }

  /**
   *  Copy in FP the coordinates of the poles.
   */
  public static void SetPoles( TColgp_Array2OfPnt  Poles,  TColStd_Array2OfReal  Weights,  TColStd_Array1OfReal  FP, long UDirection) {
    OCCwrapJavaJNI.BSplSLib_SetPoles__SWIG_1(TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(FP), FP, UDirection);
  }

  /**
   *  Get from FP the coordinates of the poles.
   */
  public static void GetPoles( TColStd_Array1OfReal  FP,  TColgp_Array2OfPnt  Poles, long UDirection) {
    OCCwrapJavaJNI.BSplSLib_GetPoles__SWIG_0(TColStd_Array1OfReal.getCPtr(FP), FP, TColgp_Array2OfPnt.getCPtr(Poles), Poles, UDirection);
  }

  /**
   *  Get from FP the coordinates of the poles.
   */
  public static void GetPoles( TColStd_Array1OfReal  FP,  TColgp_Array2OfPnt  Poles,  TColStd_Array2OfReal  Weights, long UDirection) {
    OCCwrapJavaJNI.BSplSLib_GetPoles__SWIG_1(TColStd_Array1OfReal.getCPtr(FP), FP, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, UDirection);
  }

  /**
   *  Find the new poles which allows an old point (with a
   *  given u,v  as parameters)  to  reach a  new position
   *  UIndex1,UIndex2 indicate the  range of poles we can
   *  move for U
   *  (1, UNbPoles-1) or (2, UNbPoles) -> no constraint
   *  for one side in U
   *  (2, UNbPoles-1)   -> the ends are enforced for U
   *  don't enter (1,NbPoles) and (1,VNbPoles)
   *  -> error: rigid move
   *  if problem in BSplineBasis calculation, no change
   *  for the curve  and
   *  UFirstIndex, VLastIndex = 0
   *  VFirstIndex, VLastIndex = 0
   */
  public static void MovePoint(double U, double V,  gp_Vec  Displ, int UIndex1, int UIndex2, int VIndex1, int VIndex2, int UDegree, int VDegree, long Rational,  TColgp_Array2OfPnt  Poles,  TColStd_Array2OfReal  Weights,  TColStd_Array1OfReal  UFlatKnots,  TColStd_Array1OfReal  VFlatKnots, int[] UFirstIndex, int[] ULastIndex, int[] VFirstIndex, int[] VLastIndex,  TColgp_Array2OfPnt  NewPoles) {
    OCCwrapJavaJNI.BSplSLib_MovePoint(U, V, gp_Vec.getCPtr(Displ), Displ, UIndex1, UIndex2, VIndex1, VIndex2, UDegree, VDegree, Rational, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(UFlatKnots), UFlatKnots, TColStd_Array1OfReal.getCPtr(VFlatKnots), VFlatKnots, UFirstIndex, ULastIndex, VFirstIndex, VLastIndex, TColgp_Array2OfPnt.getCPtr(NewPoles), NewPoles);
  }

  public static void InsertKnots(long UDirection, int Degree, long Periodic,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  AddKnots, TColStd_Array1OfInteger AddMults,  TColgp_Array2OfPnt  NewPoles, TColStd_Array2OfReal NewWeights,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults, double Epsilon, long Add) {
    OCCwrapJavaJNI.BSplSLib_InsertKnots__SWIG_0(UDirection, Degree, Periodic, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(AddKnots), AddKnots, TColStd_Array1OfInteger.getCPtr(AddMults), AddMults, TColgp_Array2OfPnt.getCPtr(NewPoles), NewPoles, TColStd_Array2OfReal.getCPtr(NewWeights), NewWeights, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, Epsilon, Add);
  }

  public static void InsertKnots(long UDirection, int Degree, long Periodic,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  AddKnots, TColStd_Array1OfInteger AddMults,  TColgp_Array2OfPnt  NewPoles, TColStd_Array2OfReal NewWeights,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults, double Epsilon) {
    OCCwrapJavaJNI.BSplSLib_InsertKnots__SWIG_1(UDirection, Degree, Periodic, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(AddKnots), AddKnots, TColStd_Array1OfInteger.getCPtr(AddMults), AddMults, TColgp_Array2OfPnt.getCPtr(NewPoles), NewPoles, TColStd_Array2OfReal.getCPtr(NewWeights), NewWeights, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, Epsilon);
  }

  public static long RemoveKnot(long UDirection, int Index, int Mult, int Degree, long Periodic,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColgp_Array2OfPnt  NewPoles, TColStd_Array2OfReal NewWeights,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults, double Tolerance) {
    return OCCwrapJavaJNI.BSplSLib_RemoveKnot(UDirection, Index, Mult, Degree, Periodic, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColgp_Array2OfPnt.getCPtr(NewPoles), NewPoles, TColStd_Array2OfReal.getCPtr(NewWeights), NewWeights, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, Tolerance);
  }

  public static void IncreaseDegree(long UDirection, int Degree, int NewDegree, long Periodic,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults,  TColgp_Array2OfPnt  NewPoles, TColStd_Array2OfReal NewWeights,  TColStd_Array1OfReal  NewKnots,  TColStd_Array1OfInteger  NewMults) {
    OCCwrapJavaJNI.BSplSLib_IncreaseDegree(UDirection, Degree, NewDegree, Periodic, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColgp_Array2OfPnt.getCPtr(NewPoles), NewPoles, TColStd_Array2OfReal.getCPtr(NewWeights), NewWeights, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults);
  }

  public static void Unperiodize(long UDirection, int Degree,  TColStd_Array1OfInteger  Mults,  TColStd_Array1OfReal  Knots,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights,  TColStd_Array1OfInteger  NewMults,  TColStd_Array1OfReal  NewKnots,  TColgp_Array2OfPnt  NewPoles, TColStd_Array2OfReal NewWeights) {
    OCCwrapJavaJNI.BSplSLib_Unperiodize(UDirection, Degree, TColStd_Array1OfInteger.getCPtr(Mults), Mults, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfInteger.getCPtr(NewMults), NewMults, TColStd_Array1OfReal.getCPtr(NewKnots), NewKnots, TColgp_Array2OfPnt.getCPtr(NewPoles), NewPoles, TColStd_Array2OfReal.getCPtr(NewWeights), NewWeights);
  }

  /**
   *  Used as argument for a non rational curve.
   */
  public static TColStd_Array2OfReal NoWeights() {
    long cPtr = OCCwrapJavaJNI.BSplSLib_NoWeights();
    return (cPtr == 0) ? null : new TColStd_Array2OfReal(cPtr, false);
  }

  /**
   *  Perform the evaluation of the Taylor expansion
   *  of the Bspline normalized between 0 and 1.
   *  If rational computes the homogeneous Taylor expension
   *  for the numerator and stores it in CachePoles
   */
  public static void BuildCache(double U, double V, double USpanDomain, double VSpanDomain, long UPeriodicFlag, long VPeriodicFlag, int UDegree, int VDegree, int UIndex, int VIndex,  TColStd_Array1OfReal  UFlatKnots,  TColStd_Array1OfReal  VFlatKnots,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights,  TColgp_Array2OfPnt  CachePoles, TColStd_Array2OfReal CacheWeights) {
    OCCwrapJavaJNI.BSplSLib_BuildCache__SWIG_0(U, V, USpanDomain, VSpanDomain, UPeriodicFlag, VPeriodicFlag, UDegree, VDegree, UIndex, VIndex, TColStd_Array1OfReal.getCPtr(UFlatKnots), UFlatKnots, TColStd_Array1OfReal.getCPtr(VFlatKnots), VFlatKnots, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColgp_Array2OfPnt.getCPtr(CachePoles), CachePoles, TColStd_Array2OfReal.getCPtr(CacheWeights), CacheWeights);
  }

  /**
   *  Perform the evaluation of the Taylor expansion
   *  of the Bspline normalized between 0 and 1.
   *  Structure of result optimized for BSplSLib_Cache.
   */
  public static void BuildCache(double theU, double theV, double theUSpanDomain, double theVSpanDomain, long theUPeriodic, long theVPeriodic, int theUDegree, int theVDegree, int theUIndex, int theVIndex,  TColStd_Array1OfReal  theUFlatKnots,  TColStd_Array1OfReal  theVFlatKnots,  TColgp_Array2OfPnt  thePoles, TColStd_Array2OfReal theWeights,  TColStd_Array2OfReal  theCacheArray) {
    OCCwrapJavaJNI.BSplSLib_BuildCache__SWIG_1(theU, theV, theUSpanDomain, theVSpanDomain, theUPeriodic, theVPeriodic, theUDegree, theVDegree, theUIndex, theVIndex, TColStd_Array1OfReal.getCPtr(theUFlatKnots), theUFlatKnots, TColStd_Array1OfReal.getCPtr(theVFlatKnots), theVFlatKnots, TColgp_Array2OfPnt.getCPtr(thePoles), thePoles, TColStd_Array2OfReal.getCPtr(theWeights), theWeights, TColStd_Array2OfReal.getCPtr(theCacheArray), theCacheArray);
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
  public static void CacheD0(double U, double V, int UDegree, int VDegree, double UCacheParameter, double VCacheParameter, double USpanLenght, double VSpanLength,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights, gp_Pnt Point) {
    OCCwrapJavaJNI.BSplSLib_CacheD0(U, V, UDegree, VDegree, UCacheParameter, VCacheParameter, USpanLenght, VSpanLength, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(Point), Point);
  }

  /**
   *  Calls CacheD0 for Bezier Surfaces Arrays computed with
   *  the method PolesCoefficients.
   *  Warning: To be used for BezierSurfaces ONLY!!!
   */
  public static void CoefsD0(double U, double V,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights, gp_Pnt Point) {
    OCCwrapJavaJNI.BSplSLib_CoefsD0(U, V, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(Point), Point);
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
  public static void CacheD1(double U, double V, int UDegree, int VDegree, double UCacheParameter, double VCacheParameter, double USpanLenght, double VSpanLength,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights, gp_Pnt Point, gp_Vec VecU, gp_Vec VecV) {
    OCCwrapJavaJNI.BSplSLib_CacheD1(U, V, UDegree, VDegree, UCacheParameter, VCacheParameter, USpanLenght, VSpanLength, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(Point), Point, gp_Vec.getCPtr(VecU), VecU, gp_Vec.getCPtr(VecV), VecV);
  }

  /**
   *  Calls CacheD0 for Bezier Surfaces Arrays computed with
   *  the method PolesCoefficients.
   *  Warning: To be used for BezierSurfaces ONLY!!!
   */
  public static void CoefsD1(double U, double V,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights, gp_Pnt Point, gp_Vec VecU, gp_Vec VecV) {
    OCCwrapJavaJNI.BSplSLib_CoefsD1(U, V, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(Point), Point, gp_Vec.getCPtr(VecU), VecU, gp_Vec.getCPtr(VecV), VecV);
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
  public static void CacheD2(double U, double V, int UDegree, int VDegree, double UCacheParameter, double VCacheParameter, double USpanLenght, double VSpanLength,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights, gp_Pnt Point, gp_Vec VecU, gp_Vec VecV, gp_Vec VecUU, gp_Vec VecUV, gp_Vec VecVV) {
    OCCwrapJavaJNI.BSplSLib_CacheD2(U, V, UDegree, VDegree, UCacheParameter, VCacheParameter, USpanLenght, VSpanLength, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(Point), Point, gp_Vec.getCPtr(VecU), VecU, gp_Vec.getCPtr(VecV), VecV, gp_Vec.getCPtr(VecUU), VecUU, gp_Vec.getCPtr(VecUV), VecUV, gp_Vec.getCPtr(VecVV), VecVV);
  }

  /**
   *  Calls CacheD0 for Bezier Surfaces Arrays computed with
   *  the method PolesCoefficients.
   *  Warning: To be used for BezierSurfaces ONLY!!!
   */
  public static void CoefsD2(double U, double V,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights, gp_Pnt Point, gp_Vec VecU, gp_Vec VecV, gp_Vec VecUU, gp_Vec VecUV, gp_Vec VecVV) {
    OCCwrapJavaJNI.BSplSLib_CoefsD2(U, V, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, gp_Pnt.getCPtr(Point), Point, gp_Vec.getCPtr(VecU), VecU, gp_Vec.getCPtr(VecV), VecV, gp_Vec.getCPtr(VecUU), VecUU, gp_Vec.getCPtr(VecUV), VecUV, gp_Vec.getCPtr(VecVV), VecVV);
  }

  /**
   *  Warning! To be used for BezierSurfaces ONLY!!!
   */
  public static void PolesCoefficients( TColgp_Array2OfPnt  Poles,  TColgp_Array2OfPnt  CachePoles) {
    OCCwrapJavaJNI.BSplSLib_PolesCoefficients__SWIG_0(TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColgp_Array2OfPnt.getCPtr(CachePoles), CachePoles);
  }

  /**
   *  Encapsulation   of  BuildCache    to   perform   the
   *  evaluation  of the Taylor expansion for beziersurfaces
   *  at parameters 0.,0.;
   *  Warning: To be used for BezierSurfaces ONLY!!!
   */
  public static void PolesCoefficients( TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights,  TColgp_Array2OfPnt  CachePoles, TColStd_Array2OfReal CacheWeights) {
    OCCwrapJavaJNI.BSplSLib_PolesCoefficients__SWIG_1(TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColgp_Array2OfPnt.getCPtr(CachePoles), CachePoles, TColStd_Array2OfReal.getCPtr(CacheWeights), CacheWeights);
  }

  /**
   *  Given a tolerance in 3D space returns two
   *  tolerances, one in U one in V such that for
   *  all (u1,v1) and (u0,v0) in the domain of
   *  the surface f(u,v)  we have :
   *  | u1 - u0 | < UTolerance and
   *  | v1 - v0 | < VTolerance
   *  we have |f (u1,v1) - f (u0,v0)| < Tolerance3D
   */
  public static void Resolution( TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights,  TColStd_Array1OfReal  UKnots,  TColStd_Array1OfReal  VKnots,  TColStd_Array1OfInteger  UMults,  TColStd_Array1OfInteger  VMults, int UDegree, int VDegree, long URat, long VRat, long UPer, long VPer, double Tolerance3D, double[] UTolerance, double[] VTolerance) {
    OCCwrapJavaJNI.BSplSLib_Resolution(TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(UKnots), UKnots, TColStd_Array1OfReal.getCPtr(VKnots), VKnots, TColStd_Array1OfInteger.getCPtr(UMults), UMults, TColStd_Array1OfInteger.getCPtr(VMults), VMults, UDegree, VDegree, URat, VRat, UPer, VPer, Tolerance3D, UTolerance, VTolerance);
  }

  /**
   *  Performs the interpolation of the data points given in
   *  the   Poles       array      in   the      form
   *  [1,...,RL][1,...,RC][1...PolesDimension]    .    The
   *  ColLength CL and the Length of UParameters must be the
   *  same. The length of VFlatKnots is VDegree + CL + 1.
   * 
   *  The  RowLength RL and the Length of VParameters must be
   *  the  same. The length of VFlatKnots is Degree + RL + 1.
   * 
   *  Warning: the method used  to do that  interpolation
   *  is gauss  elimination  WITHOUT pivoting.  Thus if  the
   *  diagonal is not  dominant  there is no guarantee  that
   *  the   algorithm will    work.  Nevertheless  for Cubic
   *  interpolation  at knots or interpolation at Scheonberg
   *  points  the method   will work.  The  InversionProblem
   *  will  report 0 if there   was no problem  else it will
   *  give the index of the faulty pivot
   */
  public static void Interpolate(int UDegree, int VDegree,  TColStd_Array1OfReal  UFlatKnots,  TColStd_Array1OfReal  VFlatKnots,  TColStd_Array1OfReal  UParameters,  TColStd_Array1OfReal  VParameters,  TColgp_Array2OfPnt  Poles,  TColStd_Array2OfReal  Weights, int[] InversionProblem) {
    OCCwrapJavaJNI.BSplSLib_Interpolate__SWIG_0(UDegree, VDegree, TColStd_Array1OfReal.getCPtr(UFlatKnots), UFlatKnots, TColStd_Array1OfReal.getCPtr(VFlatKnots), VFlatKnots, TColStd_Array1OfReal.getCPtr(UParameters), UParameters, TColStd_Array1OfReal.getCPtr(VParameters), VParameters, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, InversionProblem);
  }

  /**
   *  Performs the interpolation of the data points given in
   *  the  Poles array.
   *  The  ColLength CL and the Length of UParameters must be
   *  the  same. The length of VFlatKnots is VDegree + CL + 1.
   * 
   *  The  RowLength RL and the Length of VParameters must be
   *  the  same. The length of VFlatKnots is Degree + RL + 1.
   * 
   *  Warning: the method used  to do that  interpolation
   *  is gauss  elimination  WITHOUT pivoting.  Thus if  the
   *  diagonal is not  dominant  there is no guarantee  that
   *  the   algorithm will    work.  Nevertheless  for Cubic
   *  interpolation  at knots or interpolation at Scheonberg
   *  points  the method   will work.  The  InversionProblem
   *  will  report 0 if there   was no problem  else it will
   *  give the index of the faulty pivot
   */
  public static void Interpolate(int UDegree, int VDegree,  TColStd_Array1OfReal  UFlatKnots,  TColStd_Array1OfReal  VFlatKnots,  TColStd_Array1OfReal  UParameters,  TColStd_Array1OfReal  VParameters,  TColgp_Array2OfPnt  Poles, int[] InversionProblem) {
    OCCwrapJavaJNI.BSplSLib_Interpolate__SWIG_1(UDegree, VDegree, TColStd_Array1OfReal.getCPtr(UFlatKnots), UFlatKnots, TColStd_Array1OfReal.getCPtr(VFlatKnots), VFlatKnots, TColStd_Array1OfReal.getCPtr(UParameters), UParameters, TColStd_Array1OfReal.getCPtr(VParameters), VParameters, TColgp_Array2OfPnt.getCPtr(Poles), Poles, InversionProblem);
  }

  /**
   *  this will multiply  a given BSpline numerator  N(u,v)
   *  and    denominator    D(u,v)  defined     by   its
   *  U/VBSplineDegree   and    U/VBSplineKnots,     and
   *  U/VMults. Its Poles  and Weights are arrays which are
   *  coded   as      array2      of      the    form
   *  [1..UNumPoles][1..VNumPoles]  by  a function a(u,v)
   *  which  is assumed  to satisfy    the following :  1.
   *  a(u,v)  * N(u,v) and a(u,v) *  D(u,v)  is a polynomial
   *  BSpline that can be expressed exactly as a BSpline of
   *  degree U/VNewDegree  on  the knots U/VFlatKnots 2. the range
   *  of a(u,v) is   the   same as  the range   of  N(u,v)
   *  or D(u,v)
   *  ---Warning:  it is   the caller's  responsability  to
   *  insure that conditions 1. and  2. above are satisfied
   *  : no  check  whatsoever is made   in  this method  --
   *  theStatus will  return 0 if  OK else it will return  the
   *  pivot index -- of the   matrix that was inverted to
   *  compute the multiplied -- BSpline  : the method used
   *  is  interpolation   at Schoenenberg   --  points  of
   *  a(u,v)* N(u,v) and a(u,v) * D(u,v)
   *  theStatus will return 0 if OK else it will return the pivot index
   *  of the matrix that was inverted to compute the multiplied
   *  BSpline : the method used is interpolation at Schoenenberg
   *  points of a(u,v)*F(u,v)
   *  --
   */
  public static void FunctionMultiply(SWIGTYPE_p_BSplSLib_EvaluatorFunction Function, int UBSplineDegree, int VBSplineDegree,  TColStd_Array1OfReal  UBSplineKnots,  TColStd_Array1OfReal  VBSplineKnots, TColStd_Array1OfInteger UMults, TColStd_Array1OfInteger VMults,  TColgp_Array2OfPnt  Poles, TColStd_Array2OfReal Weights,  TColStd_Array1OfReal  UFlatKnots,  TColStd_Array1OfReal  VFlatKnots, int UNewDegree, int VNewDegree,  TColgp_Array2OfPnt  NewNumerator,  TColStd_Array2OfReal  NewDenominator, int[] theStatus) {
    OCCwrapJavaJNI.BSplSLib_FunctionMultiply(SWIGTYPE_p_BSplSLib_EvaluatorFunction.getCPtr(Function), UBSplineDegree, VBSplineDegree, TColStd_Array1OfReal.getCPtr(UBSplineKnots), UBSplineKnots, TColStd_Array1OfReal.getCPtr(VBSplineKnots), VBSplineKnots, TColStd_Array1OfInteger.getCPtr(UMults), UMults, TColStd_Array1OfInteger.getCPtr(VMults), VMults, TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(UFlatKnots), UFlatKnots, TColStd_Array1OfReal.getCPtr(VFlatKnots), VFlatKnots, UNewDegree, VNewDegree, TColgp_Array2OfPnt.getCPtr(NewNumerator), NewNumerator, TColStd_Array2OfReal.getCPtr(NewDenominator), NewDenominator, theStatus);
  }

  public BSplSLib() {
    this(OCCwrapJavaJNI.new_BSplSLib(), true);
  }

}
