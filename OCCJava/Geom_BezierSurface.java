package opencascade;

/**
 *  Describes a rational or non-rational Bezier surface.
 *  - A non-rational Bezier surface is defined by a table
 *  of poles (also known as control points).
 *  - A rational Bezier surface is defined by a table of
 *  poles with varying associated weights.
 *  This data is manipulated using two associative 2D arrays:
 *  - the poles table, which is a 2D array of gp_Pnt, and
 *  - the weights table, which is a 2D array of reals.
 *  The bounds of these arrays are:
 *  - 1 and NbUPoles for the row bounds, where
 *  NbUPoles is the number of poles of the surface
 *  in the u parametric direction, and
 *  - 1 and NbVPoles for the column bounds, where
 *  NbVPoles is the number of poles of the surface
 *  in the v parametric direction.
 *  The poles of the surface, the "control points", are the
 *  points used to shape and reshape the surface. They
 *  comprise a rectangular network of points:
 *  - The points (1, 1), (NbUPoles, 1), (1,
 *  NbVPoles) and (NbUPoles, NbVPoles)
 *  are the four parametric "corners" of the surface.
 *  - The first column of poles and the last column of
 *  poles define two Bezier curves which delimit the
 *  surface in the v parametric direction. These are
 *  the v isoparametric curves corresponding to
 *  values 0 and 1 of the v parameter.
 *  - The first row of poles and the last row of poles
 *  define two Bezier curves which delimit the surface
 *  in the u parametric direction. These are the u
 *  isoparametric curves corresponding to values 0
 *  and 1 of the u parameter.
 *  It is more difficult to define a geometrical significance
 *  for the weights. However they are useful for
 *  representing a quadric surface precisely. Moreover, if
 *  the weights of all the poles are equal, the surface has
 *  a polynomial equation, and hence is a "non-rational surface".
 *  The non-rational surface is a special, but frequently
 *  used, case, where all poles have identical weights.
 *  The weights are defined and used only in the case of
 *  a rational surface. This rational characteristic is
 *  defined in each parametric direction. Hence, a
 *  surface can be rational in the u parametric direction,
 *  and non-rational in the v parametric direction.
 *  Likewise, the degree of a surface is defined in each
 *  parametric direction. The degree of a Bezier surface
 *  in a given parametric direction is equal to the number
 *  of poles of the surface in that parametric direction,
 *  minus 1. This must be greater than or equal to 1.
 *  However, the degree for a Geom_BezierSurface is
 *  limited to a value of (25) which is defined and
 *  controlled by the system. This value is returned by the
 *  function MaxDegree.
 *  The parameter range for a Bezier surface is [ 0, 1 ]
 *  in the two parametric directions.
 *  A Bezier surface can also be closed, or open, in each
 *  parametric direction. If the first row of poles is
 *  identical to the last row of poles, the surface is closed
 *  in the u parametric direction. If the first column of
 *  poles is identical to the last column of poles, the
 *  surface is closed in the v parametric direction.
 *  The continuity of a Bezier surface is infinite in the u
 *  parametric direction and the in v parametric direction.
 *  Note: It is not possible to build a Bezier surface with
 *  negative weights. Any weight value that is less than,
 *  or equal to, gp::Resolution() is considered
 *  to be zero. Two weight values, W1 and W2, are
 *  considered equal if: |W2-W1| <= gp::Resolution()
 */
public class Geom_BezierSurface extends Geom_BoundedSurface {
  Geom_BezierSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a non-rational Bezier surface with a set of poles.
   *  Control points representation :
   *  SPoles(Uorigin,Vorigin) ...................SPoles(Uorigin,Vend)
   *  .                                     .
   *  .                                     .
   *  SPoles(Uend, Vorigin) .....................SPoles(Uend, Vend)
   *  For the double array the row indice corresponds to the parametric
   *  U direction and the columns indice corresponds to the parametric
   *  V direction.
   *  The weights are defaulted to all being 1.
   * 
   *  Raised if the number of poles of the surface is lower than 2
   *  or greater than MaxDegree + 1 in one of the two directions
   *  U or V.
   */
  public Geom_BezierSurface( TColgp_Array2OfPnt  SurfacePoles) {
    this(OCCwrapJavaJNI.new_Geom_BezierSurface__SWIG_0(TColgp_Array2OfPnt.getCPtr(SurfacePoles), SurfacePoles), true);
  }

  /**
   *  ---Purpose
   *  Creates a rational Bezier surface with a set of poles and a
   *  set of weights.
   *  For the double array the row indice corresponds to the parametric
   *  U direction and the columns indice corresponds to the parametric
   *  V direction.
   *  If all the weights are identical the surface is considered as
   *  non-rational (the tolerance criterion is Resolution from package
   *  gp).
   * 
   *  Raised if SurfacePoles and PoleWeights have not the same
   *  Rowlength or have not the same ColLength.
   *  Raised if PoleWeights (i, j) <= Resolution from gp;
   *  Raised if the number of poles of the surface is lower than 2
   *  or greater than MaxDegree + 1 in one of the two directions U or V.
   */
  public Geom_BezierSurface( TColgp_Array2OfPnt  SurfacePoles,  TColStd_Array2OfReal  PoleWeights) {
    this(OCCwrapJavaJNI.new_Geom_BezierSurface__SWIG_1(TColgp_Array2OfPnt.getCPtr(SurfacePoles), SurfacePoles, TColStd_Array2OfReal.getCPtr(PoleWeights), PoleWeights), true);
  }

  /**
   *  Exchanges the direction U and V on a Bezier surface
   *  As a consequence:
   *  - the poles and weights tables are transposed,
   *  - degrees, rational characteristics and so on are
   *  exchanged between the two parametric directions, and
   *  - the orientation of the surface is reversed.
   */
  public void ExchangeUV() {
    OCCwrapJavaJNI.Geom_BezierSurface_ExchangeUV(swigCPtr, this);
  }

  /**
   *  Increases the degree of this Bezier surface in the two parametric directions.
   * 
   *  Raised if UDegree < UDegree <me>  or VDegree < VDegree <me>
   *  Raised if the degree of the surface is greater than MaxDegree
   *  in one of the two directions U or V.
   */
  public void Increase(int UDeg, int VDeg) {
    OCCwrapJavaJNI.Geom_BezierSurface_Increase(swigCPtr, this, UDeg, VDeg);
  }

  /**
   *  Inserts a column of poles. If the surface is rational the weights
   *  values associated with CPoles are equal defaulted to 1.
   * 
   *  Raised if Vindex < 1 or VIndex > NbVPoles.
   * 
   *  raises if VDegree is greater than MaxDegree.
   *  raises if the Length of CPoles is not equal to NbUPoles
   */
  public void InsertPoleColAfter(int VIndex,  TColgp_Array1OfPnt  CPoles) {
    OCCwrapJavaJNI.Geom_BezierSurface_InsertPoleColAfter__SWIG_0(swigCPtr, this, VIndex, TColgp_Array1OfPnt.getCPtr(CPoles), CPoles);
  }

  /**
   *  Inserts a column of poles and weights.
   *  If the surface was non-rational it can become rational.
   * 
   *  Raised if Vindex < 1 or VIndex > NbVPoles.
   *  Raised if
   *  . VDegree is greater than MaxDegree.
   *  . the Length of CPoles is not equal to NbUPoles
   *  . a weight value is lower or equal to Resolution from
   *  package gp
   */
  public void InsertPoleColAfter(int VIndex,  TColgp_Array1OfPnt  CPoles,  TColStd_Array1OfReal  CPoleWeights) {
    OCCwrapJavaJNI.Geom_BezierSurface_InsertPoleColAfter__SWIG_1(swigCPtr, this, VIndex, TColgp_Array1OfPnt.getCPtr(CPoles), CPoles, TColStd_Array1OfReal.getCPtr(CPoleWeights), CPoleWeights);
  }

  /**
   *  Inserts a column of poles. If the surface is rational the weights
   *  values associated with CPoles are equal defaulted to 1.
   * 
   *  Raised if Vindex < 1 or VIndex > NbVPoles.
   * 
   *  Raised if VDegree is greater than MaxDegree.
   *  Raised if the Length of CPoles is not equal to NbUPoles
   */
  public void InsertPoleColBefore(int VIndex,  TColgp_Array1OfPnt  CPoles) {
    OCCwrapJavaJNI.Geom_BezierSurface_InsertPoleColBefore__SWIG_0(swigCPtr, this, VIndex, TColgp_Array1OfPnt.getCPtr(CPoles), CPoles);
  }

  /**
   *  Inserts a column of poles and weights.
   *  If the surface was non-rational it can become rational.
   * 
   *  Raised if Vindex < 1 or VIndex > NbVPoles.
   *  Raised if :
   *  . VDegree is greater than MaxDegree.
   *  . the Length of CPoles is not equal to NbUPoles
   *  . a weight value is lower or equal to Resolution from
   *  package gp
   */
  public void InsertPoleColBefore(int VIndex,  TColgp_Array1OfPnt  CPoles,  TColStd_Array1OfReal  CPoleWeights) {
    OCCwrapJavaJNI.Geom_BezierSurface_InsertPoleColBefore__SWIG_1(swigCPtr, this, VIndex, TColgp_Array1OfPnt.getCPtr(CPoles), CPoles, TColStd_Array1OfReal.getCPtr(CPoleWeights), CPoleWeights);
  }

  /**
   *  Inserts a row of poles. If the surface is rational the weights
   *  values associated with CPoles are equal defaulted to 1.
   * 
   *  Raised if Uindex < 1 or UIndex > NbUPoles.
   * 
   *  Raised if UDegree is greater than MaxDegree.
   *  Raised if the Length of CPoles is not equal to NbVPoles
   */
  public void InsertPoleRowAfter(int UIndex,  TColgp_Array1OfPnt  CPoles) {
    OCCwrapJavaJNI.Geom_BezierSurface_InsertPoleRowAfter__SWIG_0(swigCPtr, this, UIndex, TColgp_Array1OfPnt.getCPtr(CPoles), CPoles);
  }

  /**
   *  Inserts a row of poles and weights.
   *  If the surface was non-rational it can become rational.
   * 
   *  Raised if Uindex < 1 or UIndex > NbUPoles.
   *  Raised if :
   *  . UDegree is greater than MaxDegree.
   *  . the Length of CPoles is not equal to NbVPoles
   *  . a weight value is lower or equal to Resolution from
   *  package gp
   */
  public void InsertPoleRowAfter(int UIndex,  TColgp_Array1OfPnt  CPoles,  TColStd_Array1OfReal  CPoleWeights) {
    OCCwrapJavaJNI.Geom_BezierSurface_InsertPoleRowAfter__SWIG_1(swigCPtr, this, UIndex, TColgp_Array1OfPnt.getCPtr(CPoles), CPoles, TColStd_Array1OfReal.getCPtr(CPoleWeights), CPoleWeights);
  }

  /**
   *  Inserts a row of poles. If the surface is rational the weights
   *  values associated with CPoles are equal defaulted to 1.
   * 
   *  Raised if Uindex < 1 or UIndex > NbUPoles.
   * 
   *  Raised if UDegree is greater than MaxDegree.
   *  Raised if the Length of CPoles is not equal to NbVPoles
   */
  public void InsertPoleRowBefore(int UIndex,  TColgp_Array1OfPnt  CPoles) {
    OCCwrapJavaJNI.Geom_BezierSurface_InsertPoleRowBefore__SWIG_0(swigCPtr, this, UIndex, TColgp_Array1OfPnt.getCPtr(CPoles), CPoles);
  }

  /**
   *  Inserts a row of poles and weights.
   *  If the surface was non-rational it can become rational.
   * 
   *  Raised if Uindex < 1 or UIndex > NbUPoles.
   *  Raised if :
   *  . UDegree is greater than MaxDegree.
   *  . the Length of CPoles is not equal to NbVPoles
   *  . a weight value is lower or equal to Resolution from
   *  pacakage gp
   */
  public void InsertPoleRowBefore(int UIndex,  TColgp_Array1OfPnt  CPoles,  TColStd_Array1OfReal  CPoleWeights) {
    OCCwrapJavaJNI.Geom_BezierSurface_InsertPoleRowBefore__SWIG_1(swigCPtr, this, UIndex, TColgp_Array1OfPnt.getCPtr(CPoles), CPoles, TColStd_Array1OfReal.getCPtr(CPoleWeights), CPoleWeights);
  }

  /**
   *  Removes a column of poles.
   *  If the surface was rational it can become non-rational.
   * 
   *  Raised if NbVPoles <= 2 after removing, a Bezier surface
   *  must have at least two columns of poles.
   *  Raised if Vindex < 1 or VIndex > NbVPoles
   */
  public void RemovePoleCol(int VIndex) {
    OCCwrapJavaJNI.Geom_BezierSurface_RemovePoleCol(swigCPtr, this, VIndex);
  }

  /**
   *  Removes a row of poles.
   *  If the surface was rational it can become non-rational.
   * 
   *  Raised if NbUPoles <= 2 after removing, a Bezier surface
   *  must have at least two rows of poles.
   *  Raised if Uindex < 1 or UIndex > NbUPoles
   */
  public void RemovePoleRow(int UIndex) {
    OCCwrapJavaJNI.Geom_BezierSurface_RemovePoleRow(swigCPtr, this, UIndex);
  }

  /**
   *  Modifies this Bezier surface by segmenting it
   *  between U1 and U2 in the u parametric direction,
   *  and between V1 and V2 in the v parametric
   *  direction. U1, U2, V1, and V2 can be outside the
   *  bounds of this surface.
   *  - U1 and U2 isoparametric Bezier curves,
   *  segmented between V1 and V2, become the two
   *  bounds of the surface in the v parametric
   *  direction (0. and 1. u isoparametric curves).
   *  - V1 and V2 isoparametric Bezier curves,
   *  segmented between U1 and U2, become the two
   *  bounds of the surface in the u parametric
   *  direction (0. and 1. v isoparametric curves).
   *  The poles and weights tables are modified, but the
   *  degree of this surface in the u and v parametric
   *  directions does not change.
   *  U1 can be greater than U2, and V1 can be greater
   *  than V2. In these cases, the corresponding
   *  parametric direction is inverted. The orientation of
   *  the surface is inverted if one (and only one)
   *  parametric direction is inverted.
   */
  public void Segment(double U1, double U2, double V1, double V2) {
    OCCwrapJavaJNI.Geom_BezierSurface_Segment(swigCPtr, this, U1, U2, V1, V2);
  }

  /**
   *  Modifies a pole value.
   *  If the surface is rational the weight of range (UIndex, VIndex)
   *  is not modified.
   * 
   *  Raised if  UIndex < 1 or UIndex > NbUPoles  or  VIndex < 1
   *  or VIndex > NbVPoles.
   */
  public void SetPole(int UIndex, int VIndex,  gp_Pnt  P) {
    OCCwrapJavaJNI.Geom_BezierSurface_SetPole__SWIG_0(swigCPtr, this, UIndex, VIndex, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Substitutes the pole and the weight of range UIndex, VIndex.
   *  If the surface <me> is not rational it can become rational.
   *  if the surface was rational it can become non-rational.
   * 
   *  raises if  UIndex < 1 or UIndex > NbUPoles  or  VIndex < 1
   *  or VIndex > NbVPoles.
   *  Raised if Weight <= Resolution from package gp.
   */
  public void SetPole(int UIndex, int VIndex,  gp_Pnt  P, double Weight) {
    OCCwrapJavaJNI.Geom_BezierSurface_SetPole__SWIG_1(swigCPtr, this, UIndex, VIndex, gp_Pnt.getCPtr(P), P, Weight);
  }

  /**
   *  Modifies a column of poles.
   *  The length of CPoles can be lower but not greater than NbUPoles
   *  so you can modify just a part of the column.
   *  Raised if VIndex < 1 or  VIndex > NbVPoles
   * 
   *  Raised if CPoles.Lower() < 1 or CPoles.Upper() > NbUPoles
   */
  public void SetPoleCol(int VIndex,  TColgp_Array1OfPnt  CPoles) {
    OCCwrapJavaJNI.Geom_BezierSurface_SetPoleCol__SWIG_0(swigCPtr, this, VIndex, TColgp_Array1OfPnt.getCPtr(CPoles), CPoles);
  }

  /**
   *  Modifies a column of poles.
   *  If the surface was rational it can become non-rational
   *  If the surface was non-rational it can become rational.
   *  The length of CPoles can be lower but not greater than NbUPoles
   *  so you can modify just a part of the column.
   *  Raised if VIndex < 1 or  VIndex > NbVPoles
   * 
   *  Raised if CPoles.Lower() < 1 or CPoles.Upper() > NbUPoles
   *  Raised if CPoleWeights and CPoles have not the same bounds.
   *  Raised if one of the weight value CPoleWeights (i) is lower
   *  or equal to Resolution from package gp.
   */
  public void SetPoleCol(int VIndex,  TColgp_Array1OfPnt  CPoles,  TColStd_Array1OfReal  CPoleWeights) {
    OCCwrapJavaJNI.Geom_BezierSurface_SetPoleCol__SWIG_1(swigCPtr, this, VIndex, TColgp_Array1OfPnt.getCPtr(CPoles), CPoles, TColStd_Array1OfReal.getCPtr(CPoleWeights), CPoleWeights);
  }

  /**
   *  Modifies a row of poles.
   *  The length of CPoles can be lower but not greater than NbVPoles
   *  so you can modify just a part of the row.
   *  Raised if UIndex < 1 or  UIndex > NbUPoles
   * 
   *  Raised if CPoles.Lower() < 1 or CPoles.Upper() > NbVPoles
   */
  public void SetPoleRow(int UIndex,  TColgp_Array1OfPnt  CPoles) {
    OCCwrapJavaJNI.Geom_BezierSurface_SetPoleRow__SWIG_0(swigCPtr, this, UIndex, TColgp_Array1OfPnt.getCPtr(CPoles), CPoles);
  }

  /**
   *  Modifies a row of poles and weights.
   *  If the surface was rational it can become non-rational.
   *  If the surface was non-rational it can become rational.
   *  The length of CPoles can be lower but not greater than NbVPoles
   *  so you can modify just a part of the row.
   *  Raised if UIndex < 1 or  UIndex > NbUPoles
   * 
   *  Raised if CPoles.Lower() < 1 or CPoles.Upper() > NbVPoles
   *  Raised if CPoleWeights and CPoles have not the same bounds.
   *  Raised if one of the weight value CPoleWeights (i) is lower
   *  or equal to Resolution from gp.
   */
  public void SetPoleRow(int UIndex,  TColgp_Array1OfPnt  CPoles,  TColStd_Array1OfReal  CPoleWeights) {
    OCCwrapJavaJNI.Geom_BezierSurface_SetPoleRow__SWIG_1(swigCPtr, this, UIndex, TColgp_Array1OfPnt.getCPtr(CPoles), CPoles, TColStd_Array1OfReal.getCPtr(CPoleWeights), CPoleWeights);
  }

  /**
   *  Modifies the weight of the pole of range UIndex, VIndex.
   *  If the surface was non-rational it can become rational.
   *  If the surface was rational it can become non-rational.
   * 
   *  Raised if UIndex < 1  or  UIndex > NbUPoles or VIndex < 1 or
   *  VIndex > NbVPoles.
   *  Raised if Weight <= Resolution from package gp.
   */
  public void SetWeight(int UIndex, int VIndex, double Weight) {
    OCCwrapJavaJNI.Geom_BezierSurface_SetWeight(swigCPtr, this, UIndex, VIndex, Weight);
  }

  /**
   *  Modifies a column of weights.
   *  If the surface was rational it can become non-rational.
   *  If the surface was non-rational it can become rational.
   *  The length of CPoleWeights can be lower but not greater than
   *  NbUPoles.
   *  Raised if VIndex < 1 or  VIndex > NbVPoles
   * 
   *  Raised if CPoleWeights.Lower() < 1 or CPoleWeights.Upper() >
   *  NbUPoles
   *  Raised if one of the weight value CPoleWeights (i) is lower
   *  or equal to Resolution from package gp.
   */
  public void SetWeightCol(int VIndex,  TColStd_Array1OfReal  CPoleWeights) {
    OCCwrapJavaJNI.Geom_BezierSurface_SetWeightCol(swigCPtr, this, VIndex, TColStd_Array1OfReal.getCPtr(CPoleWeights), CPoleWeights);
  }

  /**
   *  Modifies a row of weights.
   *  If the surface was rational it can become non-rational.
   *  If the surface was non-rational it can become rational.
   *  The length of CPoleWeights can be lower but not greater than
   *  NbVPoles.
   *  Raised if UIndex < 1 or  UIndex > NbUPoles
   * 
   *  Raised if CPoleWeights.Lower() < 1 or CPoleWeights.Upper() >
   *  NbVPoles
   *  Raised if one of the weight value CPoleWeights (i) is lower
   *  or equal to Resolution from package gp.
   */
  public void SetWeightRow(int UIndex,  TColStd_Array1OfReal  CPoleWeights) {
    OCCwrapJavaJNI.Geom_BezierSurface_SetWeightRow(swigCPtr, this, UIndex, TColStd_Array1OfReal.getCPtr(CPoleWeights), CPoleWeights);
  }

  /**
   *  Returns the number of poles in the U direction.
   */
  public int NbUPoles() {
    return OCCwrapJavaJNI.Geom_BezierSurface_NbUPoles(swigCPtr, this);
  }

  /**
   *  Returns the number of poles in the V direction.
   */
  public int NbVPoles() {
    return OCCwrapJavaJNI.Geom_BezierSurface_NbVPoles(swigCPtr, this);
  }

  /**
   *  Returns the pole of range UIndex, VIndex
   *  Raised if UIndex < 1 or UIndex > NbUPoles, or
   *  VIndex < 1 or VIndex > NbVPoles.
   */
  public  gp_Pnt  Pole(int UIndex, int VIndex) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.Geom_BezierSurface_Pole(swigCPtr, this, UIndex, VIndex), true);
    return ret;
  }

  /**
   *  Returns the poles of the Bezier surface.
   * 
   *  Raised if the length of P in the U an V direction is not equal to
   *  NbUPoles and NbVPoles.
   */
  public void Poles( TColgp_Array2OfPnt  P) {
    OCCwrapJavaJNI.Geom_BezierSurface_Poles__SWIG_0(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(P), P);
  }

  /**
   *  Returns the poles of the Bezier surface.
   */
  public  TColgp_Array2OfPnt  Poles() {
    TColgp_Array2OfPnt ret = new TColgp_Array2OfPnt(OCCwrapJavaJNI.Geom_BezierSurface_Poles__SWIG_1(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the degree of the surface in the U direction it is
   *  NbUPoles - 1
   */
  public int UDegree() {
    return OCCwrapJavaJNI.Geom_BezierSurface_UDegree(swigCPtr, this);
  }

  /**
   *  Returns the degree of the surface in the V direction it is
   *  NbVPoles - 1
   */
  public int VDegree() {
    return OCCwrapJavaJNI.Geom_BezierSurface_VDegree(swigCPtr, this);
  }

  /**
   *  Returns the weight of range UIndex, VIndex
   * 
   *  Raised if UIndex < 1 or UIndex > NbUPoles, or
   *  VIndex < 1 or VIndex > NbVPoles.
   */
  public double Weight(int UIndex, int VIndex) {
    return OCCwrapJavaJNI.Geom_BezierSurface_Weight(swigCPtr, this, UIndex, VIndex);
  }

  /**
   *  Returns the weights of the Bezier surface.
   * 
   *  Raised if the length of W in the U an V direction is not
   *  equal to NbUPoles and NbVPoles.
   */
  public void Weights( TColStd_Array2OfReal  W) {
    OCCwrapJavaJNI.Geom_BezierSurface_Weights__SWIG_0(swigCPtr, this, TColStd_Array2OfReal.getCPtr(W), W);
  }

  /**
   *  Returns the weights of the Bezier surface.
   */
  public TColStd_Array2OfReal Weights() {
    long cPtr = OCCwrapJavaJNI.Geom_BezierSurface_Weights__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new TColStd_Array2OfReal(cPtr, false);
  }

  /**
   *  Returns False if the weights are identical in the U direction,
   *  The tolerance criterion is Resolution from package gp.
   *  Example :
   *  |1.0, 1.0, 1.0|
   *  if Weights =  |0.5, 0.5, 0.5|   returns False
   *  |2.0, 2.0, 2.0|
   */
  public long IsURational() {
    return OCCwrapJavaJNI.Geom_BezierSurface_IsURational(swigCPtr, this);
  }

  /**
   *  Returns False if the weights are identical in the V direction,
   *  The tolerance criterion is Resolution from package gp.
   *  Example :
   *  |1.0, 2.0, 0.5|
   *  if Weights =  |1.0, 2.0, 0.5|   returns False
   *  |1.0, 2.0, 0.5|
   */
  public long IsVRational() {
    return OCCwrapJavaJNI.Geom_BezierSurface_IsVRational(swigCPtr, this);
  }

  /**
   *  Returns the value of the maximum polynomial degree of a
   *  Bezier surface. This value is 25.
   */
  public static int MaxDegree() {
    return OCCwrapJavaJNI.Geom_BezierSurface_MaxDegree();
  }

  /**
   *  Computes two tolerance values for this Bezier
   *  surface, based on the given tolerance in 3D space
   *  Tolerance3D. The tolerances computed are:
   *  - UTolerance in the u parametric direction, and
   *  - VTolerance in the v parametric direction.
   *  If f(u,v) is the equation of this Bezier surface,
   *  UTolerance and VTolerance guarantee that:
   *  | u1 - u0 | < UTolerance and
   *  | v1 - v0 | < VTolerance
   *  ====> |f (u1,v1) - f (u0,v0)| < Tolerance3D
   */
  public void Resolution(double Tolerance3D, double[] UTolerance, double[] VTolerance) {
    OCCwrapJavaJNI.Geom_BezierSurface_Resolution(swigCPtr, this, Tolerance3D, UTolerance, VTolerance);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_BezierSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_BezierSurface_get_type_descriptor(), true );
  }

  public static  Geom_BezierSurface  DownCast( Standard_Transient  T) {
    return new Geom_BezierSurface ( OCCwrapJavaJNI.Geom_BezierSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_BezierSurface_TypeOf(), true );
  }

}
