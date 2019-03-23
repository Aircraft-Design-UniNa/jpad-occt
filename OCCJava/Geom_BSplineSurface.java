package opencascade;

/**
 *  Describes a BSpline surface.
 *  In each parametric direction, a BSpline surface can be:
 *  - uniform or non-uniform,
 *  - rational or non-rational,
 *  - periodic or non-periodic.
 *  A BSpline surface is defined by:
 *  - its degrees, in the u and v parametric directions,
 *  - its periodic characteristic, in the u and v parametric directions,
 *  - a table of poles, also called control points (together
 *  with the associated weights if the surface is rational), and
 *  - a table of knots, together with the associated multiplicities.
 *  The degree of a Geom_BSplineSurface is limited to
 *  a value (25) which is defined and controlled by the
 *  system. This value is returned by the function MaxDegree.
 *  Poles and Weights
 *  Poles and Weights are manipulated using two associative double arrays:
 *  - the poles table, which is a double array of gp_Pnt points, and
 *  - the weights table, which is a double array of reals.
 *  The bounds of the poles and weights arrays are:
 *  - 1 and NbUPoles for the row bounds (provided
 *  that the BSpline surface is not periodic in the u
 *  parametric direction), where NbUPoles is the
 *  number of poles of the surface in the u parametric direction, and
 *  - 1 and NbVPoles for the column bounds (provided
 *  that the BSpline surface is not periodic in the v
 *  parametric direction), where NbVPoles is the
 *  number of poles of the surface in the v parametric direction.
 *  The poles of the surface are the points used to shape
 *  and reshape the surface. They comprise a rectangular network.
 *  If the surface is not periodic:
 *  - The points (1, 1), (NbUPoles, 1), (1,
 *  NbVPoles), and (NbUPoles, NbVPoles)
 *  are the four parametric "corners" of the surface.
 *  - The first column of poles and the last column of
 *  poles define two BSpline curves which delimit the
 *  surface in the v parametric direction. These are the
 *  v isoparametric curves corresponding to the two
 *  bounds of the v parameter.
 *  - The first row of poles and the last row of poles
 *  define two BSpline curves which delimit the surface
 *  in the u parametric direction. These are the u
 *  isoparametric curves corresponding to the two bounds of the u parameter.
 *  If the surface is periodic, these geometric properties are not verified.
 *  It is more difficult to define a geometrical significance
 *  for the weights. However they are useful for
 *  representing a quadric surface precisely. Moreover, if
 *  the weights of all the poles are equal, the surface has
 *  a polynomial equation, and hence is a "non-rational surface".
 *  The non-rational surface is a special, but frequently
 *  used, case, where all poles have identical weights.
 *  The weights are defined and used only in the case of
 *  a rational surface. The rational characteristic is
 *  defined in each parametric direction. A surface can be
 *  rational in the u parametric direction, and
 *  non-rational in the v parametric direction.
 *  Knots and Multiplicities
 *  For a Geom_BSplineSurface the table of knots is
 *  made up of two increasing sequences of reals, without
 *  repetition, one for each parametric direction. The
 *  multiplicities define the repetition of the knots.
 *  A BSpline surface comprises multiple contiguous
 *  patches, which are themselves polynomial or rational
 *  surfaces. The knots are the parameters of the
 *  isoparametric curves which limit these contiguous
 *  patches. The multiplicity of a knot on a BSpline
 *  surface (in a given parametric direction) is related to
 *  the degree of continuity of the surface at that knot in
 *  that parametric direction:
 *  Degree of continuity at knot(i) = Degree - Multi(i) where:
 *  - Degree is the degree of the BSpline surface in
 *  the given parametric direction, and
 *  - Multi(i) is the multiplicity of knot number i in
 *  the given parametric direction.
 *  There are some special cases, where the knots are
 *  regularly spaced in one parametric direction (i.e. the
 *  difference between two consecutive knots is a constant).
 *  - "Uniform": all the multiplicities are equal to 1.
 *  - "Quasi-uniform": all the multiplicities are equal to 1,
 *  except for the first and last knots in this parametric
 *  direction, and these are equal to Degree + 1.
 *  - "Piecewise Bezier": all the multiplicities are equal to
 *  Degree except for the first and last knots, which
 *  are equal to Degree + 1. This surface is a
 *  concatenation of Bezier patches in the given
 *  parametric direction.
 *  If the BSpline surface is not periodic in a given
 *  parametric direction, the bounds of the knots and
 *  multiplicities tables are 1 and NbKnots, where
 *  NbKnots is the number of knots of the BSpline
 *  surface in that parametric direction.
 *  If the BSpline surface is periodic in a given parametric
 *  direction, and there are k periodic knots and p
 *  periodic poles in that parametric direction:
 *  - the period is such that:
 *  period = Knot(k+1) - Knot(1), and
 *  - the poles and knots tables in that parametric
 *  direction can be considered as infinite tables, such that:
 *  Knot(i+k) = Knot(i) + period, and
 *  Pole(i+p) = Pole(i)
 *  Note: The data structure tables for a periodic BSpline
 *  surface are more complex than those of a non-periodic one.
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
public class Geom_BSplineSurface extends Geom_BoundedSurface {
  Geom_BSplineSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates  a non-rational b-spline surface (weights
   *  default value is 1.).
   *  The following conditions must be verified.
   *  0 < UDegree <= MaxDegree.
   *  UKnots.Length() == UMults.Length() >= 2
   *  UKnots(i) < UKnots(i+1) (Knots are increasing)
   *  1 <= UMults(i) <= UDegree
   *  On a   non  uperiodic   surface    the  first and    last
   *  umultiplicities  may  be     UDegree+1  (this   is   even
   *  recommanded if you want the curve  to start and finish on
   *  the first and last pole).
   *  On a uperiodic     surface  the first    and   the   last
   *  umultiplicities must be the same.
   *  on non-uperiodic surfaces
   *  Poles.ColLength() == Sum(UMults(i)) - UDegree - 1 >= 2
   *  on uperiodic surfaces
   *  Poles.ColLength() == Sum(UMults(i)) except the first or last
   *  The previous conditions for U holds  also for V, with the
   *  RowLength of the poles.
   */
  public Geom_BSplineSurface( TColgp_Array2OfPnt  Poles,  TColStd_Array1OfReal  UKnots,  TColStd_Array1OfReal  VKnots,  TColStd_Array1OfInteger  UMults,  TColStd_Array1OfInteger  VMults, int UDegree, int VDegree, long UPeriodic, long VPeriodic) {
    this(OCCwrapJavaJNI.new_Geom_BSplineSurface__SWIG_0(TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(UKnots), UKnots, TColStd_Array1OfReal.getCPtr(VKnots), VKnots, TColStd_Array1OfInteger.getCPtr(UMults), UMults, TColStd_Array1OfInteger.getCPtr(VMults), VMults, UDegree, VDegree, UPeriodic, VPeriodic), true);
  }

  /**
   *  Creates  a non-rational b-spline surface (weights
   *  default value is 1.).
   * 
   *  The following conditions must be verified.
   *  0 < UDegree <= MaxDegree.
   * 
   *  UKnots.Length() == UMults.Length() >= 2
   * 
   *  UKnots(i) < UKnots(i+1) (Knots are increasing)
   *  1 <= UMults(i) <= UDegree
   * 
   *  On a   non  uperiodic   surface    the  first and    last
   *  umultiplicities  may  be     UDegree+1  (this   is   even
   *  recommanded if you want the curve  to start and finish on
   *  the first and last pole).
   * 
   *  On a uperiodic     surface  the first    and   the   last
   *  umultiplicities must be the same.
   * 
   *  on non-uperiodic surfaces
   * 
   *  Poles.ColLength() == Sum(UMults(i)) - UDegree - 1 >= 2
   * 
   *  on uperiodic surfaces
   * 
   *  Poles.ColLength() == Sum(UMults(i)) except the first or
   *  last
   * 
   *  The previous conditions for U holds  also for V, with the
   *  RowLength of the poles.
   */
  public Geom_BSplineSurface( TColgp_Array2OfPnt  Poles,  TColStd_Array1OfReal  UKnots,  TColStd_Array1OfReal  VKnots,  TColStd_Array1OfInteger  UMults,  TColStd_Array1OfInteger  VMults, int UDegree, int VDegree, long UPeriodic) {
    this(OCCwrapJavaJNI.new_Geom_BSplineSurface__SWIG_1(TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(UKnots), UKnots, TColStd_Array1OfReal.getCPtr(VKnots), VKnots, TColStd_Array1OfInteger.getCPtr(UMults), UMults, TColStd_Array1OfInteger.getCPtr(VMults), VMults, UDegree, VDegree, UPeriodic), true);
  }

  public Geom_BSplineSurface( TColgp_Array2OfPnt  Poles,  TColStd_Array1OfReal  UKnots,  TColStd_Array1OfReal  VKnots,  TColStd_Array1OfInteger  UMults,  TColStd_Array1OfInteger  VMults, int UDegree, int VDegree) {
    this(OCCwrapJavaJNI.new_Geom_BSplineSurface__SWIG_2(TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array1OfReal.getCPtr(UKnots), UKnots, TColStd_Array1OfReal.getCPtr(VKnots), VKnots, TColStd_Array1OfInteger.getCPtr(UMults), UMults, TColStd_Array1OfInteger.getCPtr(VMults), VMults, UDegree, VDegree), true);
  }

  public Geom_BSplineSurface( TColgp_Array2OfPnt  Poles,  TColStd_Array2OfReal  Weights,  TColStd_Array1OfReal  UKnots,  TColStd_Array1OfReal  VKnots,  TColStd_Array1OfInteger  UMults,  TColStd_Array1OfInteger  VMults, int UDegree, int VDegree, long UPeriodic, long VPeriodic) {
    this(OCCwrapJavaJNI.new_Geom_BSplineSurface__SWIG_3(TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(UKnots), UKnots, TColStd_Array1OfReal.getCPtr(VKnots), VKnots, TColStd_Array1OfInteger.getCPtr(UMults), UMults, TColStd_Array1OfInteger.getCPtr(VMults), VMults, UDegree, VDegree, UPeriodic, VPeriodic), true);
  }

  public Geom_BSplineSurface( TColgp_Array2OfPnt  Poles,  TColStd_Array2OfReal  Weights,  TColStd_Array1OfReal  UKnots,  TColStd_Array1OfReal  VKnots,  TColStd_Array1OfInteger  UMults,  TColStd_Array1OfInteger  VMults, int UDegree, int VDegree, long UPeriodic) {
    this(OCCwrapJavaJNI.new_Geom_BSplineSurface__SWIG_4(TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(UKnots), UKnots, TColStd_Array1OfReal.getCPtr(VKnots), VKnots, TColStd_Array1OfInteger.getCPtr(UMults), UMults, TColStd_Array1OfInteger.getCPtr(VMults), VMults, UDegree, VDegree, UPeriodic), true);
  }

  public Geom_BSplineSurface( TColgp_Array2OfPnt  Poles,  TColStd_Array2OfReal  Weights,  TColStd_Array1OfReal  UKnots,  TColStd_Array1OfReal  VKnots,  TColStd_Array1OfInteger  UMults,  TColStd_Array1OfInteger  VMults, int UDegree, int VDegree) {
    this(OCCwrapJavaJNI.new_Geom_BSplineSurface__SWIG_5(TColgp_Array2OfPnt.getCPtr(Poles), Poles, TColStd_Array2OfReal.getCPtr(Weights), Weights, TColStd_Array1OfReal.getCPtr(UKnots), UKnots, TColStd_Array1OfReal.getCPtr(VKnots), VKnots, TColStd_Array1OfInteger.getCPtr(UMults), UMults, TColStd_Array1OfInteger.getCPtr(VMults), VMults, UDegree, VDegree), true);
  }

  /**
   *  Exchanges the u and v parametric directions on
   *  this BSpline surface.
   *  As a consequence:
   *  - the poles and weights tables are transposed,
   *  - the knots and multiplicities tables are exchanged,
   *  - degrees of continuity, and rational, periodic and
   *  uniform characteristics are exchanged, and
   *  - the orientation of the surface is inverted.
   */
  public void ExchangeUV() {
    OCCwrapJavaJNI.Geom_BSplineSurface_ExchangeUV(swigCPtr, this);
  }

  /**
   *  Sets the surface U periodic.
   *  Modifies this surface to be periodic in the U 
   *  parametric direction.
   *  To become periodic in a given parametric direction a
   *  surface must be closed in that parametric direction,
   *  and the knot sequence relative to that direction must be periodic.
   *  To generate this periodic sequence of knots, the
   *  functions FirstUKnotIndex and LastUKnotIndex  are used to
   *  compute I1 and I2. These are the indexes, in the
   *  knot array associated with the given parametric
   *  direction, of the knots that correspond to the first and
   *  last parameters of this BSpline surface in the given
   *  parametric direction. Hence the period is:
   *  Knots(I1) - Knots(I2)
   *  As a result, the knots and poles tables are modified.
   *  Exceptions
   *  Standard_ConstructionError if the surface is not
   *  closed in the given parametric direction.
   */
  public void SetUPeriodic() {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetUPeriodic(swigCPtr, this);
  }

  /**
   *  Sets the surface V periodic.
   *  Modifies this surface to be periodic in the V
   *  parametric direction.
   *  To become periodic in a given parametric direction a
   *  surface must be closed in that parametric direction,
   *  and the knot sequence relative to that direction must be periodic.
   *  To generate this periodic sequence of knots, the
   *  functions FirstVKnotIndex and LastVKnotIndex are used to
   *  compute I1 and I2. These are the indexes, in the
   *  knot array associated with the given parametric
   *  direction, of the knots that correspond to the first and
   *  last parameters of this BSpline surface in the given
   *  parametric direction. Hence the period is:
   *  Knots(I1) - Knots(I2)
   *  As a result, the knots and poles tables are modified.
   *  Exceptions
   *  Standard_ConstructionError if the surface is not
   *  closed in the given parametric direction.
   */
  public void SetVPeriodic() {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetVPeriodic(swigCPtr, this);
  }

  /**
   *  returns the parameter normalized within
   *  the period if the surface is periodic : otherwise
   *  does not do anything
   */
  public void PeriodicNormalization(double[] U, double[] V) {
    OCCwrapJavaJNI.Geom_BSplineSurface_PeriodicNormalization(swigCPtr, this, U, V);
  }

  /**
   *  Assigns the knot of index Index in the knots table in
   *  the corresponding parametric direction to be the
   *  origin of this periodic BSpline surface. As a
   *  consequence, the knots and poles tables are modified.
   *  Exceptions
   *  Standard_NoSuchObject if this BSpline surface is
   *  not periodic in the given parametric direction.
   *  Standard_DomainError if Index is outside the
   *  bounds of the knots table in the given parametric direction.
   */
  public void SetUOrigin(int Index) {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetUOrigin(swigCPtr, this, Index);
  }

  /**
   *  Assigns the knot of index Index in the knots table in
   *  the corresponding parametric direction to be the
   *  origin of this periodic BSpline surface. As a
   *  consequence, the knots and poles tables are modified.
   *  Exceptions
   *  Standard_NoSuchObject if this BSpline surface is
   *  not periodic in the given parametric direction.
   *  Standard_DomainError if Index is outside the
   *  bounds of the knots table in the given parametric direction.
   */
  public void SetVOrigin(int Index) {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetVOrigin(swigCPtr, this, Index);
  }

  /**
   *  Sets the surface U not periodic.
   *  Changes this BSpline surface into a non-periodic
   *  surface along U direction. 
   *  If this surface is already non-periodic, it is not modified.
   *  Note: the poles and knots tables are modified.
   */
  public void SetUNotPeriodic() {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetUNotPeriodic(swigCPtr, this);
  }

  /**
   *  Sets the surface V not periodic.
   *  Changes this BSpline surface into a non-periodic
   *  surface along V direction. 
   *  If this surface is already non-periodic, it is not modified.
   *  Note: the poles and knots tables are modified.
   */
  public void SetVNotPeriodic() {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetVNotPeriodic(swigCPtr, this);
  }

  /**
   *  Increases the degrees of this BSpline surface to
   *  UDegree and VDegree in the u and v parametric
   *  directions respectively. As a result, the tables of poles,
   *  weights and multiplicities are modified. The tables of
   *  knots is not changed.
   *  Note: Nothing is done if the given degree is less than
   *  or equal to the current degree in the corresponding
   *  parametric direction.
   *  Exceptions
   *  Standard_ConstructionError if UDegree or
   *  VDegree is greater than
   *  Geom_BSplineSurface::MaxDegree().
   */
  public void IncreaseDegree(int UDegree, int VDegree) {
    OCCwrapJavaJNI.Geom_BSplineSurface_IncreaseDegree(swigCPtr, this, UDegree, VDegree);
  }

  /**
   *  Inserts into the knots table for the U
   *  parametric direction of this BSpline surface:
   *  - the values of the array Knots, with their respective
   *  multiplicities, Mults.
   *  If the knot value to insert already exists in the table, its multiplicity is:
   *  - increased by M, if Add is true (the default), or
   *  - increased to M, if Add is false.
   *  The tolerance criterion used to check the equality of
   *  the knots is the larger of the values ParametricTolerance and
   *  Standard_Real::Epsilon(val), where val is the knot value to be inserted.
   *  Warning
   *  - If a given multiplicity coefficient is null, or negative, nothing is done.
   *  - The new multiplicity of a knot is limited to the degree of this BSpline surface in the
   *  corresponding parametric direction.
   *  Exceptions
   *  Standard_ConstructionError if a knot value to
   *  insert is outside the bounds of this BSpline surface in
   *  the specified parametric direction. The comparison
   *  uses the precision criterion ParametricTolerance.
   */
  public void InsertUKnots( TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults, double ParametricTolerance, long Add) {
    OCCwrapJavaJNI.Geom_BSplineSurface_InsertUKnots__SWIG_0(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, ParametricTolerance, Add);
  }

  public void InsertUKnots( TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults, double ParametricTolerance) {
    OCCwrapJavaJNI.Geom_BSplineSurface_InsertUKnots__SWIG_1(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, ParametricTolerance);
  }

  public void InsertUKnots( TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults) {
    OCCwrapJavaJNI.Geom_BSplineSurface_InsertUKnots__SWIG_2(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults);
  }

  /**
   *  Inserts into the knots table for the V
   *  parametric direction of this BSpline surface:
   *  - the values of the array Knots, with their respective
   *  multiplicities, Mults.
   *  If the knot value to insert already exists in the table, its multiplicity is:
   *  - increased by M, if Add is true (the default), or
   *  - increased to M, if Add is false.
   *  The tolerance criterion used to check the equality of
   *  the knots is the larger of the values ParametricTolerance and
   *  Standard_Real::Epsilon(val), where val is the knot value to be inserted.
   *  Warning
   *  - If a given multiplicity coefficient is null, or negative, nothing is done.
   *  - The new multiplicity of a knot is limited to the degree of this BSpline surface in the
   *  corresponding parametric direction.
   *  Exceptions
   *  Standard_ConstructionError if a knot value to
   *  insert is outside the bounds of this BSpline surface in
   *  the specified parametric direction. The comparison
   *  uses the precision criterion ParametricTolerance.
   */
  public void InsertVKnots( TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults, double ParametricTolerance, long Add) {
    OCCwrapJavaJNI.Geom_BSplineSurface_InsertVKnots__SWIG_0(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, ParametricTolerance, Add);
  }

  public void InsertVKnots( TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults, double ParametricTolerance) {
    OCCwrapJavaJNI.Geom_BSplineSurface_InsertVKnots__SWIG_1(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults, ParametricTolerance);
  }

  public void InsertVKnots( TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults) {
    OCCwrapJavaJNI.Geom_BSplineSurface_InsertVKnots__SWIG_2(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults);
  }

  /**
   *  Reduces to M the multiplicity of the knot of index
   *  Index in the U parametric direction. If M is 0, the knot is removed.
   *  With a modification of this type, the table of poles is also modified.
   *  Two different algorithms are used systematically to
   *  compute the new poles of the surface. For each
   *  pole, the distance between the pole calculated
   *  using the first algorithm and the same pole
   *  calculated using the second algorithm, is checked. If
   *  this distance is less than Tolerance it ensures that
   *  the surface is not modified by more than Tolerance.
   *  Under these conditions, the function returns true;
   *  otherwise, it returns false.
   *  A low tolerance prevents modification of the
   *  surface. A high tolerance "smoothes" the surface.
   *  Exceptions
   *  Standard_OutOfRange if Index is outside the
   *  bounds of the knots table of this BSpline surface.
   */
  public long RemoveUKnot(int Index, int M, double Tolerance) {
    return OCCwrapJavaJNI.Geom_BSplineSurface_RemoveUKnot(swigCPtr, this, Index, M, Tolerance);
  }

  /**
   *  Reduces to M the multiplicity of the knot of index
   *  Index in the V parametric direction. If M is 0, the knot is removed.
   *  With a modification of this type, the table of poles is also modified.
   *  Two different algorithms are used systematically to
   *  compute the new poles of the surface. For each
   *  pole, the distance between the pole calculated
   *  using the first algorithm and the same pole
   *  calculated using the second algorithm, is checked. If
   *  this distance is less than Tolerance it ensures that
   *  the surface is not modified by more than Tolerance.
   *  Under these conditions, the function returns true;
   *  otherwise, it returns false.
   *  A low tolerance prevents modification of the
   *  surface. A high tolerance "smoothes" the surface.
   *  Exceptions
   *  Standard_OutOfRange if Index is outside the
   *  bounds of the knots table of this BSpline surface.
   */
  public long RemoveVKnot(int Index, int M, double Tolerance) {
    return OCCwrapJavaJNI.Geom_BSplineSurface_RemoveVKnot(swigCPtr, this, Index, M, Tolerance);
  }

  /**
   *  Increases the multiplicity of the knot of range UIndex
   *  in the UKnots sequence.
   *  M is the new multiplicity. M must be greater than the
   *  previous multiplicity and lower or equal to the degree
   *  of the surface in the U parametric direction.
   *  Raised if M is not in the range [1, UDegree]
   * 
   *  Raised if UIndex is not in the range [FirstUKnotIndex,
   *  LastUKnotIndex] given by the methods with the same name.
   */
  public void IncreaseUMultiplicity(int UIndex, int M) {
    OCCwrapJavaJNI.Geom_BSplineSurface_IncreaseUMultiplicity__SWIG_0(swigCPtr, this, UIndex, M);
  }

  /**
   *  Increases until order M the multiplicity of the set of knots
   *  FromI1,...., ToI2 in the U direction. This method can be used
   *  to make a B_spline surface into a PiecewiseBezier B_spline
   *  surface.
   *  If <me> was uniform, it can become non uniform.
   * 
   *  Raised if FromI1 or ToI2 is out of the range [FirstUKnotIndex,
   *  LastUKnotIndex].
   * 
   *  M should be greater than the previous multiplicity of the
   *  all the knots FromI1,..., ToI2 and lower or equal to the
   *  Degree of the surface in the U parametric direction.
   */
  public void IncreaseUMultiplicity(int FromI1, int ToI2, int M) {
    OCCwrapJavaJNI.Geom_BSplineSurface_IncreaseUMultiplicity__SWIG_1(swigCPtr, this, FromI1, ToI2, M);
  }

  /**
   *  Increments the multiplicity of the consecutives uknots FromI1..ToI2
   *  by step.   The multiplicity of each knot FromI1,.....,ToI2 must be
   *  lower or equal to the UDegree of the B_spline.
   * 
   *  Raised if FromI1 or ToI2 is not in the range
   *  [FirstUKnotIndex, LastUKnotIndex]
   * 
   *  Raised if one knot has a multiplicity greater than UDegree.
   */
  public void IncrementUMultiplicity(int FromI1, int ToI2, int Step) {
    OCCwrapJavaJNI.Geom_BSplineSurface_IncrementUMultiplicity(swigCPtr, this, FromI1, ToI2, Step);
  }

  /**
   *  Increases the multiplicity of a knot in the V direction.
   *  M is the new multiplicity.
   * 
   *  M should be greater than the previous multiplicity and lower
   *  than the degree of the surface in the V parametric direction.
   * 
   *  Raised if VIndex is not in the range [FirstVKnotIndex,
   *  LastVKnotIndex] given by the methods with the same name.
   */
  public void IncreaseVMultiplicity(int VIndex, int M) {
    OCCwrapJavaJNI.Geom_BSplineSurface_IncreaseVMultiplicity__SWIG_0(swigCPtr, this, VIndex, M);
  }

  /**
   *  Increases until order M the multiplicity of the set of knots
   *  FromI1,...., ToI2 in the V direction. This method can be used to
   *  make a BSplineSurface into a PiecewiseBezier B_spline
   *  surface. If <me> was uniform, it can become non-uniform.
   * 
   *  Raised if FromI1 or ToI2 is out of the range [FirstVKnotIndex,
   *  LastVKnotIndex] given by the methods with the same name.
   * 
   *  M should be greater than the previous multiplicity of the
   *  all the knots FromI1,..., ToI2 and lower or equal to the
   *  Degree of the surface in the V parametric direction.
   */
  public void IncreaseVMultiplicity(int FromI1, int ToI2, int M) {
    OCCwrapJavaJNI.Geom_BSplineSurface_IncreaseVMultiplicity__SWIG_1(swigCPtr, this, FromI1, ToI2, M);
  }

  /**
   *  Increments the multiplicity of the consecutives vknots FromI1..ToI2
   *  by step.  The multiplicity of each knot FromI1,.....,ToI2 must be
   *  lower or equal to the VDegree of the B_spline.
   * 
   *  Raised if FromI1 or ToI2 is not in the range
   *  [FirstVKnotIndex, LastVKnotIndex]
   * 
   *  Raised if one knot has a multiplicity greater than VDegree.
   */
  public void IncrementVMultiplicity(int FromI1, int ToI2, int Step) {
    OCCwrapJavaJNI.Geom_BSplineSurface_IncrementVMultiplicity(swigCPtr, this, FromI1, ToI2, Step);
  }

  /**
   *  Inserts a knot value in the sequence of UKnots. If U is a knot
   *  value this method increases the multiplicity of the knot if the
   *  previous multiplicity was lower than M else it does nothing. The
   *  tolerance criterion is ParametricTolerance. ParametricTolerance
   *  should be greater or equal than Resolution from package gp.
   * 
   *  Raised if U is out of the bounds [U1, U2] given by the methods
   *  Bounds, the criterion ParametricTolerance is used.
   *  Raised if M is not in the range [1, UDegree].
   */
  public void InsertUKnot(double U, int M, double ParametricTolerance, long Add) {
    OCCwrapJavaJNI.Geom_BSplineSurface_InsertUKnot__SWIG_0(swigCPtr, this, U, M, ParametricTolerance, Add);
  }

  public void InsertUKnot(double U, int M, double ParametricTolerance) {
    OCCwrapJavaJNI.Geom_BSplineSurface_InsertUKnot__SWIG_1(swigCPtr, this, U, M, ParametricTolerance);
  }

  /**
   *  Inserts a knot value in the sequence of VKnots. If V is a knot
   *  value this method increases the multiplicity of the knot if the
   *  previous multiplicity was lower than M otherwise it does nothing.
   *  The tolerance criterion is ParametricTolerance.
   *  ParametricTolerance should be greater or equal than Resolution
   *  from package gp.
   * 
   *  raises if V is out of the Bounds [V1, V2] given by the methods
   *  Bounds, the criterion ParametricTolerance is used.
   *  raises if M is not in the range [1, VDegree].
   */
  public void InsertVKnot(double V, int M, double ParametricTolerance, long Add) {
    OCCwrapJavaJNI.Geom_BSplineSurface_InsertVKnot__SWIG_0(swigCPtr, this, V, M, ParametricTolerance, Add);
  }

  public void InsertVKnot(double V, int M, double ParametricTolerance) {
    OCCwrapJavaJNI.Geom_BSplineSurface_InsertVKnot__SWIG_1(swigCPtr, this, V, M, ParametricTolerance);
  }

  /**
   *  Segments the surface between U1 and U2 in the U-Direction.
   *  between V1 and V2 in the V-Direction.
   *  The control points are modified, the first and the last point
   *  are not the same.
   *  Warnings :
   *  Even if <me> is not closed it can become closed after the
   *  segmentation for example if U1 or U2 are out of the bounds
   *  of the surface <me> or if the surface makes loop.
   *  raises if U2 < U1 or V2 < V1.
   *  Standard_DomainError if U2 - U1 exceeds the uperiod for uperiodic surfaces.
   *  i.e. ((U2 - U1) - UPeriod) > Precision::PConfusion().
   *  Standard_DomainError if V2 - V1 exceeds the vperiod for vperiodic surfaces.
   *  i.e. ((V2 - V1) - VPeriod) > Precision::PConfusion()).
   */
  public void Segment(double U1, double U2, double V1, double V2) {
    OCCwrapJavaJNI.Geom_BSplineSurface_Segment(swigCPtr, this, U1, U2, V1, V2);
  }

  /**
   *  Segments the surface between U1 and U2 in the U-Direction.
   *  between V1 and V2 in the V-Direction.
   * 
   *  same as Segment but do nothing if U1 and U2 (resp. V1 and V2) are
   *  equal to the bounds in U (resp. in V) of <me>.
   *  For example, if <me> is periodic in V, it will be always periodic
   *  in V after the segmentation if the bounds in V are unchanged
   * 
   *  Warnings :
   *  Even if <me> is not closed it can become closed after the
   *  segmentation for example if U1 or U2 are out of the bounds
   *  of the surface <me> or if the surface makes loop.
   *  raises if U2 < U1 or V2 < V1.
   *  Standard_DomainError if U2 - U1 exceeds the uperiod for uperiodic surfaces.
   *  i.e. ((U2 - U1) - UPeriod) > Precision::PConfusion().
   *  Standard_DomainError if V2 - V1 exceeds the vperiod for vperiodic surfaces.
   *  i.e. ((V2 - V1) - VPeriod) > Precision::PConfusion()).
   */
  public void CheckAndSegment(double U1, double U2, double V1, double V2) {
    OCCwrapJavaJNI.Geom_BSplineSurface_CheckAndSegment(swigCPtr, this, U1, U2, V1, V2);
  }

  /**
   *  Substitutes the UKnots of range UIndex with K.
   * 
   *  Raised if UIndex < 1 or UIndex > NbUKnots
   * 
   *  Raised if K >= UKnots(UIndex+1) or K <= UKnots(UIndex-1)
   */
  public void SetUKnot(int UIndex, double K) {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetUKnot__SWIG_0(swigCPtr, this, UIndex, K);
  }

  /**
   *  Changes all the U-knots of the surface.
   *  The multiplicity of the knots are not modified.
   * 
   *  Raised if there is an index such that UK (Index+1) <= UK (Index).
   * 
   *  Raised if  UK.Lower() < 1 or UK.Upper() > NbUKnots
   */
  public void SetUKnots( TColStd_Array1OfReal  UK) {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetUKnots(swigCPtr, this, TColStd_Array1OfReal.getCPtr(UK), UK);
  }

  /**
   *  Changes the value of the UKnots of range UIndex and
   *  increases its multiplicity.
   * 
   *  Raised if UIndex is not in the range [FirstUKnotIndex,
   *  LastUKnotIndex] given by the methods with the same name.
   * 
   *  Raised if K >= UKnots(UIndex+1) or K <= UKnots(UIndex-1)
   *  M must be lower than UDegree and greater than the previous
   *  multiplicity of the knot of range UIndex.
   */
  public void SetUKnot(int UIndex, double K, int M) {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetUKnot__SWIG_1(swigCPtr, this, UIndex, K, M);
  }

  /**
   *  Substitutes the VKnots of range VIndex with K.
   * 
   *  Raised if VIndex < 1 or VIndex > NbVKnots
   * 
   *  Raised if K >= VKnots(VIndex+1) or K <= VKnots(VIndex-1)
   */
  public void SetVKnot(int VIndex, double K) {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetVKnot__SWIG_0(swigCPtr, this, VIndex, K);
  }

  /**
   *  Changes all the V-knots of the surface.
   *  The multiplicity of the knots are not modified.
   * 
   *  Raised if there is an index such that VK (Index+1) <= VK (Index).
   * 
   *  Raised if  VK.Lower() < 1 or VK.Upper() > NbVKnots
   */
  public void SetVKnots( TColStd_Array1OfReal  VK) {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetVKnots(swigCPtr, this, TColStd_Array1OfReal.getCPtr(VK), VK);
  }

  /**
   *  Changes the value of the VKnots of range VIndex and increases
   *  its multiplicity.
   * 
   *  Raised if VIndex is not in the range [FirstVKnotIndex,
   *  LastVKnotIndex] given by the methods with the same name.
   * 
   *  Raised if K >= VKnots(VIndex+1) or K <= VKnots(VIndex-1)
   *  M must be lower than VDegree and greater than the previous
   *  multiplicity of the knot of range VIndex.
   */
  public void SetVKnot(int VIndex, double K, int M) {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetVKnot__SWIG_1(swigCPtr, this, VIndex, K, M);
  }

  /**
   *  Locates the parametric value U in the sequence of UKnots.
   *  If "WithKnotRepetition" is True we consider the knot's
   *  representation with repetition of multiple knot value,
   *  otherwise  we consider the knot's representation with
   *  no repetition of multiple knot values.
   *  UKnots (I1) <= U <= UKnots (I2)
   *  . if I1 = I2  U is a knot value (the tolerance criterion
   *  ParametricTolerance is used).
   *  . if I1 < 1  => U < UKnots(1) - Abs(ParametricTolerance)
   *  . if I2 > NbUKnots => U > UKnots(NbUKnots)+Abs(ParametricTolerance)
   */
  public void LocateU(double U, double ParametricTolerance, int[] I1, int[] I2, long WithKnotRepetition) {
    OCCwrapJavaJNI.Geom_BSplineSurface_LocateU__SWIG_0(swigCPtr, this, U, ParametricTolerance, I1, I2, WithKnotRepetition);
  }

  public void LocateU(double U, double ParametricTolerance, int[] I1, int[] I2) {
    OCCwrapJavaJNI.Geom_BSplineSurface_LocateU__SWIG_1(swigCPtr, this, U, ParametricTolerance, I1, I2);
  }

  /**
   *  Locates the parametric value V in the sequence of knots.
   *  If "WithKnotRepetition" is True we consider the knot's
   *  representation with repetition of multiple knot value,
   *  otherwise  we consider the knot's representation with
   *  no repetition of multiple knot values.
   *  VKnots (I1) <= V <= VKnots (I2)
   *  . if I1 = I2  V is a knot value (the tolerance criterion
   *  ParametricTolerance is used).
   *  . if I1 < 1  => V < VKnots(1) - Abs(ParametricTolerance)
   *  . if I2 > NbVKnots => V > VKnots(NbVKnots)+Abs(ParametricTolerance)
   *  poles insertion and removing
   *  The following methods are available only if the surface
   *  is Uniform or QuasiUniform in the considered direction
   *  The knot repartition is modified.
   */
  public void LocateV(double V, double ParametricTolerance, int[] I1, int[] I2, long WithKnotRepetition) {
    OCCwrapJavaJNI.Geom_BSplineSurface_LocateV__SWIG_0(swigCPtr, this, V, ParametricTolerance, I1, I2, WithKnotRepetition);
  }

  public void LocateV(double V, double ParametricTolerance, int[] I1, int[] I2) {
    OCCwrapJavaJNI.Geom_BSplineSurface_LocateV__SWIG_1(swigCPtr, this, V, ParametricTolerance, I1, I2);
  }

  /**
   *  Substitutes the pole of range (UIndex, VIndex) with P.
   *  If the surface is rational the weight of range (UIndex, VIndex)
   *  is not modified.
   * 
   *  Raised if UIndex < 1 or UIndex > NbUPoles or VIndex < 1 or
   *  VIndex > NbVPoles.
   */
  public void SetPole(int UIndex, int VIndex,  gp_Pnt  P) {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetPole__SWIG_0(swigCPtr, this, UIndex, VIndex, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Substitutes the pole and the weight of range (UIndex, VIndex)
   *  with P and W.
   * 
   *  Raised if UIndex < 1 or UIndex > NbUPoles or VIndex < 1 or
   *  VIndex > NbVPoles.
   *  Raised if Weight <= Resolution from package gp.
   */
  public void SetPole(int UIndex, int VIndex,  gp_Pnt  P, double Weight) {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetPole__SWIG_1(swigCPtr, this, UIndex, VIndex, gp_Pnt.getCPtr(P), P, Weight);
  }

  /**
   *  Changes a column of poles or a part of this column.
   *  Raised if Vindex < 1 or VIndex > NbVPoles.
   * 
   *  Raised if CPoles.Lower() < 1 or CPoles.Upper() > NbUPoles.
   */
  public void SetPoleCol(int VIndex,  TColgp_Array1OfPnt  CPoles) {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetPoleCol__SWIG_0(swigCPtr, this, VIndex, TColgp_Array1OfPnt.getCPtr(CPoles), CPoles);
  }

  /**
   *  Changes a column of poles or a part of this column with the
   *  corresponding weights. If the surface was rational it can
   *  become non rational. If the surface was non rational it can
   *  become rational.
   *  Raised if Vindex < 1 or VIndex > NbVPoles.
   * 
   *  Raised if CPoles.Lower() < 1 or CPoles.Upper() > NbUPoles
   *  Raised if the bounds of CPoleWeights are not the same as the
   *  bounds of CPoles.
   *  Raised if one of the weight value of CPoleWeights is lower or
   *  equal to Resolution from package gp.
   */
  public void SetPoleCol(int VIndex,  TColgp_Array1OfPnt  CPoles,  TColStd_Array1OfReal  CPoleWeights) {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetPoleCol__SWIG_1(swigCPtr, this, VIndex, TColgp_Array1OfPnt.getCPtr(CPoles), CPoles, TColStd_Array1OfReal.getCPtr(CPoleWeights), CPoleWeights);
  }

  /**
   *  Changes a row of poles or a part of this row with the
   *  corresponding weights. If the surface was rational it can
   *  become non rational. If the surface was non rational it can
   *  become rational.
   *  Raised if Uindex < 1 or UIndex > NbUPoles.
   * 
   *  Raised if CPoles.Lower() < 1 or CPoles.Upper() > NbVPoles
   *  raises if the bounds of CPoleWeights are not the same as the
   *  bounds of CPoles.
   *  Raised if one of the weight value of CPoleWeights is lower or
   *  equal to Resolution from package gp.
   */
  public void SetPoleRow(int UIndex,  TColgp_Array1OfPnt  CPoles,  TColStd_Array1OfReal  CPoleWeights) {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetPoleRow__SWIG_0(swigCPtr, this, UIndex, TColgp_Array1OfPnt.getCPtr(CPoles), CPoles, TColStd_Array1OfReal.getCPtr(CPoleWeights), CPoleWeights);
  }

  /**
   *  Changes a row of poles or a part of this row.
   *  Raised if Uindex < 1 or UIndex > NbUPoles.
   * 
   *  Raised if CPoles.Lower() < 1 or CPoles.Upper() > NbVPoles.
   */
  public void SetPoleRow(int UIndex,  TColgp_Array1OfPnt  CPoles) {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetPoleRow__SWIG_1(swigCPtr, this, UIndex, TColgp_Array1OfPnt.getCPtr(CPoles), CPoles);
  }

  /**
   *  Changes the weight of the pole of range UIndex, VIndex.
   *  If the surface was non rational it can become rational.
   *  If the surface was rational it can become non rational.
   * 
   *  Raised if UIndex < 1 or UIndex > NbUPoles or VIndex < 1 or
   *  VIndex > NbVPoles
   * 
   *  Raised if weight is lower or equal to Resolution from
   *  package gp
   */
  public void SetWeight(int UIndex, int VIndex, double Weight) {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetWeight(swigCPtr, this, UIndex, VIndex, Weight);
  }

  /**
   *  Changes a column of weights of a part of this column.
   * 
   *  Raised if VIndex < 1 or VIndex > NbVPoles
   * 
   *  Raised if CPoleWeights.Lower() < 1 or
   *  CPoleWeights.Upper() > NbUPoles.
   *  Raised if a weight value is lower or equal to Resolution
   *  from package gp.
   */
  public void SetWeightCol(int VIndex,  TColStd_Array1OfReal  CPoleWeights) {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetWeightCol(swigCPtr, this, VIndex, TColStd_Array1OfReal.getCPtr(CPoleWeights), CPoleWeights);
  }

  /**
   *  Changes a row of weights or a part of this row.
   * 
   *  Raised if UIndex < 1 or UIndex > NbUPoles
   * 
   *  Raised if CPoleWeights.Lower() < 1 or
   *  CPoleWeights.Upper() > NbVPoles.
   *  Raised  if a weight value is lower or equal to Resolution
   *  from package gp.
   */
  public void SetWeightRow(int UIndex,  TColStd_Array1OfReal  CPoleWeights) {
    OCCwrapJavaJNI.Geom_BSplineSurface_SetWeightRow(swigCPtr, this, UIndex, TColStd_Array1OfReal.getCPtr(CPoleWeights), CPoleWeights);
  }

  /**
   *  Move a point with parameter U and V to P.
   *  given u,v  as parameters)  to  reach a  new position
   *  UIndex1, UIndex2, VIndex1, VIndex2:
   *  indicates the poles which can be moved
   *  if Problem in BSplineBasis calculation, no change
   *  for the curve and
   *  UFirstIndex, VLastIndex = 0
   *  VFirstIndex, VLastIndex = 0
   * 
   *  Raised if UIndex1 < UIndex2 or VIndex1 < VIndex2 or
   *  UIndex1 < 1 || UIndex1 > NbUPoles or
   *  UIndex2 < 1 || UIndex2 > NbUPoles
   *  VIndex1 < 1 || VIndex1 > NbVPoles or
   *  VIndex2 < 1 || VIndex2 > NbVPoles
   *  characteristics of the surface
   */
  public void MovePoint(double U, double V,  gp_Pnt  P, int UIndex1, int UIndex2, int VIndex1, int VIndex2, int[] UFirstIndex, int[] ULastIndex, int[] VFirstIndex, int[] VLastIndex) {
    OCCwrapJavaJNI.Geom_BSplineSurface_MovePoint(swigCPtr, this, U, V, gp_Pnt.getCPtr(P), P, UIndex1, UIndex2, VIndex1, VIndex2, UFirstIndex, ULastIndex, VFirstIndex, VLastIndex);
  }

  /**
   *  Returns False if for each row of weights all the weights
   *  are identical.
   *  The tolerance criterion is resolution from package gp.
   *  Example :
   *  |1.0, 1.0, 1.0|
   *  if Weights =  |0.5, 0.5, 0.5|   returns False
   *  |2.0, 2.0, 2.0|
   */
  public long IsURational() {
    return OCCwrapJavaJNI.Geom_BSplineSurface_IsURational(swigCPtr, this);
  }

  /**
   *  Returns False if for each column of weights all the weights
   *  are identical.
   *  The tolerance criterion is resolution from package gp.
   *  Examples :
   *  |1.0, 2.0, 0.5|
   *  if Weights =  |1.0, 2.0, 0.5|   returns False
   *  |1.0, 2.0, 0.5|
   */
  public long IsVRational() {
    return OCCwrapJavaJNI.Geom_BSplineSurface_IsVRational(swigCPtr, this);
  }

  /**
   *  Computes the Index of the UKnots which gives the first
   *  parametric value of the surface in the U direction.
   *  The UIso curve corresponding to this value is a
   *  boundary curve of the surface.
   */
  public int FirstUKnotIndex() {
    return OCCwrapJavaJNI.Geom_BSplineSurface_FirstUKnotIndex(swigCPtr, this);
  }

  /**
   *  Computes the Index of the VKnots which gives the
   *  first parametric value of the surface in the V direction.
   *  The VIso curve corresponding to this knot is a boundary
   *  curve of the surface.
   */
  public int FirstVKnotIndex() {
    return OCCwrapJavaJNI.Geom_BSplineSurface_FirstVKnotIndex(swigCPtr, this);
  }

  /**
   *  Computes the Index of the UKnots which gives the
   *  last parametric value of the surface in the U direction.
   *  The UIso curve corresponding to this knot is a boundary
   *  curve of the surface.
   */
  public int LastUKnotIndex() {
    return OCCwrapJavaJNI.Geom_BSplineSurface_LastUKnotIndex(swigCPtr, this);
  }

  /**
   *  Computes the Index of the VKnots which gives the
   *  last parametric value of the surface in the V direction.
   *  The VIso curve corresponding to this knot is a
   *  boundary curve of the surface.
   */
  public int LastVKnotIndex() {
    return OCCwrapJavaJNI.Geom_BSplineSurface_LastVKnotIndex(swigCPtr, this);
  }

  /**
   *  Returns the number of knots in the U direction.
   */
  public int NbUKnots() {
    return OCCwrapJavaJNI.Geom_BSplineSurface_NbUKnots(swigCPtr, this);
  }

  /**
   *  Returns number of poles in the U direction.
   */
  public int NbUPoles() {
    return OCCwrapJavaJNI.Geom_BSplineSurface_NbUPoles(swigCPtr, this);
  }

  /**
   *  Returns the number of knots in the V direction.
   */
  public int NbVKnots() {
    return OCCwrapJavaJNI.Geom_BSplineSurface_NbVKnots(swigCPtr, this);
  }

  /**
   *  Returns the number of poles in the V direction.
   */
  public int NbVPoles() {
    return OCCwrapJavaJNI.Geom_BSplineSurface_NbVPoles(swigCPtr, this);
  }

  /**
   *  Returns the pole of range (UIndex, VIndex).
   * 
   *  Raised if UIndex < 1 or UIndex > NbUPoles or VIndex < 1 or
   *  VIndex > NbVPoles.
   */
  public  gp_Pnt  Pole(int UIndex, int VIndex) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.Geom_BSplineSurface_Pole(swigCPtr, this, UIndex, VIndex), true);
    return ret;
  }

  /**
   *  Returns the poles of the B-spline surface.
   * 
   *  Raised if the length of P in the U and V direction
   *  is not equal to NbUpoles and NbVPoles.
   */
  public void Poles( TColgp_Array2OfPnt  P) {
    OCCwrapJavaJNI.Geom_BSplineSurface_Poles__SWIG_0(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(P), P);
  }

  /**
   *  Returns the poles of the B-spline surface.
   */
  public  TColgp_Array2OfPnt  Poles() {
    TColgp_Array2OfPnt ret = new TColgp_Array2OfPnt(OCCwrapJavaJNI.Geom_BSplineSurface_Poles__SWIG_1(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the degree of the normalized B-splines Ni,n in the U
   *  direction.
   */
  public int UDegree() {
    return OCCwrapJavaJNI.Geom_BSplineSurface_UDegree(swigCPtr, this);
  }

  /**
   *  Returns the Knot value of range UIndex.
   *  Raised if UIndex < 1 or UIndex > NbUKnots
   */
  public double UKnot(int UIndex) {
    return OCCwrapJavaJNI.Geom_BSplineSurface_UKnot(swigCPtr, this, UIndex);
  }

  /**
   *  Returns NonUniform or Uniform or QuasiUniform or
   *  PiecewiseBezier.  If all the knots differ by a
   *  positive constant from the preceding knot in the U
   *  direction the B-spline surface can be :
   *  - Uniform if all the knots are of multiplicity 1,
   *  - QuasiUniform if all the knots are of multiplicity 1
   *  except for the first and last knot which are of
   *  multiplicity Degree + 1,
   *  - PiecewiseBezier if the first and last knots have
   *  multiplicity Degree + 1 and if interior knots have
   *  multiplicity Degree
   *  otherwise the surface is non uniform in the U direction
   *  The tolerance criterion is Resolution from package gp.
   */
  public GeomAbs_BSplKnotDistribution UKnotDistribution() {
    return GeomAbs_BSplKnotDistribution.swigToEnum(OCCwrapJavaJNI.Geom_BSplineSurface_UKnotDistribution(swigCPtr, this));
  }

  /**
   *  Returns the knots in the U direction.
   * 
   *  Raised if the length of Ku is not equal to the number of knots
   *  in the U direction.
   */
  public void UKnots( TColStd_Array1OfReal  Ku) {
    OCCwrapJavaJNI.Geom_BSplineSurface_UKnots__SWIG_0(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Ku), Ku);
  }

  /**
   *  Returns the knots in the U direction.
   */
  public  TColStd_Array1OfReal  UKnots() {
    TColStd_Array1OfReal ret = new TColStd_Array1OfReal(OCCwrapJavaJNI.Geom_BSplineSurface_UKnots__SWIG_1(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the uknots sequence.
   *  In this sequence the knots with a multiplicity greater than 1
   *  are repeated.
   *  Example :
   *  Ku = {k1, k1, k1, k2, k3, k3, k4, k4, k4}
   * 
   *  Raised if the length of Ku is not equal to NbUPoles + UDegree + 1
   */
  public void UKnotSequence( TColStd_Array1OfReal  Ku) {
    OCCwrapJavaJNI.Geom_BSplineSurface_UKnotSequence__SWIG_0(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Ku), Ku);
  }

  /**
   *  Returns the uknots sequence.
   *  In this sequence the knots with a multiplicity greater than 1
   *  are repeated.
   *  Example :
   *  Ku = {k1, k1, k1, k2, k3, k3, k4, k4, k4}
   */
  public  TColStd_Array1OfReal  UKnotSequence() {
    TColStd_Array1OfReal ret = new TColStd_Array1OfReal(OCCwrapJavaJNI.Geom_BSplineSurface_UKnotSequence__SWIG_1(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the multiplicity value of knot of range UIndex in
   *  the u direction.
   *  Raised if UIndex < 1 or UIndex > NbUKnots.
   */
  public int UMultiplicity(int UIndex) {
    return OCCwrapJavaJNI.Geom_BSplineSurface_UMultiplicity(swigCPtr, this, UIndex);
  }

  /**
   *  Returns the multiplicities of the knots in the U direction.
   * 
   *  Raised if the length of Mu is not equal to the number of
   *  knots in the U direction.
   */
  public void UMultiplicities( TColStd_Array1OfInteger  Mu) {
    OCCwrapJavaJNI.Geom_BSplineSurface_UMultiplicities__SWIG_0(swigCPtr, this, TColStd_Array1OfInteger.getCPtr(Mu), Mu);
  }

  /**
   *  Returns the multiplicities of the knots in the U direction.
   */
  public  TColStd_Array1OfInteger  UMultiplicities() {
    TColStd_Array1OfInteger ret = new TColStd_Array1OfInteger(OCCwrapJavaJNI.Geom_BSplineSurface_UMultiplicities__SWIG_1(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the degree of the normalized B-splines Ni,d in the
   *  V direction.
   */
  public int VDegree() {
    return OCCwrapJavaJNI.Geom_BSplineSurface_VDegree(swigCPtr, this);
  }

  /**
   *  Returns the Knot value of range VIndex.
   *  Raised if VIndex < 1 or VIndex > NbVKnots
   */
  public double VKnot(int VIndex) {
    return OCCwrapJavaJNI.Geom_BSplineSurface_VKnot(swigCPtr, this, VIndex);
  }

  /**
   *  Returns NonUniform or Uniform or QuasiUniform or
   *  PiecewiseBezier. If all the knots differ by a positive
   *  constant from the preceding knot in the V direction the
   *  B-spline surface can be :
   *  - Uniform if all the knots are of multiplicity 1,
   *  - QuasiUniform if all the knots are of multiplicity 1
   *  except for the first and last knot which are of
   *  multiplicity Degree + 1,
   *  - PiecewiseBezier if the first and last knots have
   *  multiplicity  Degree + 1 and if interior knots have
   *  multiplicity Degree
   *  otherwise the surface is non uniform in the V direction.
   *  The tolerance criterion is Resolution from package gp.
   */
  public GeomAbs_BSplKnotDistribution VKnotDistribution() {
    return GeomAbs_BSplKnotDistribution.swigToEnum(OCCwrapJavaJNI.Geom_BSplineSurface_VKnotDistribution(swigCPtr, this));
  }

  /**
   *  Returns the knots in the V direction.
   * 
   *  Raised if the length of Kv is not equal to the number of
   *  knots in the V direction.
   */
  public void VKnots( TColStd_Array1OfReal  Kv) {
    OCCwrapJavaJNI.Geom_BSplineSurface_VKnots__SWIG_0(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Kv), Kv);
  }

  /**
   *  Returns the knots in the V direction.
   */
  public  TColStd_Array1OfReal  VKnots() {
    TColStd_Array1OfReal ret = new TColStd_Array1OfReal(OCCwrapJavaJNI.Geom_BSplineSurface_VKnots__SWIG_1(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the vknots sequence.
   *  In this sequence the knots with a multiplicity greater than 1
   *  are repeated.
   *  Example :
   *  Kv = {k1, k1, k1, k2, k3, k3, k4, k4, k4}
   * 
   *  Raised if the length of Kv is not equal to NbVPoles + VDegree + 1
   */
  public void VKnotSequence( TColStd_Array1OfReal  Kv) {
    OCCwrapJavaJNI.Geom_BSplineSurface_VKnotSequence__SWIG_0(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Kv), Kv);
  }

  /**
   *  Returns the vknots sequence.
   *  In this sequence the knots with a multiplicity greater than 1
   *  are repeated.
   *  Example :
   *  Ku = {k1, k1, k1, k2, k3, k3, k4, k4, k4}
   */
  public  TColStd_Array1OfReal  VKnotSequence() {
    TColStd_Array1OfReal ret = new TColStd_Array1OfReal(OCCwrapJavaJNI.Geom_BSplineSurface_VKnotSequence__SWIG_1(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the multiplicity value of knot of range VIndex in
   *  the v direction.
   *  Raised if VIndex < 1 or VIndex > NbVKnots
   */
  public int VMultiplicity(int VIndex) {
    return OCCwrapJavaJNI.Geom_BSplineSurface_VMultiplicity(swigCPtr, this, VIndex);
  }

  /**
   *  Returns the multiplicities of the knots in the V direction.
   * 
   *  Raised if the length of Mv is not equal to the number of
   *  knots in the V direction.
   */
  public void VMultiplicities( TColStd_Array1OfInteger  Mv) {
    OCCwrapJavaJNI.Geom_BSplineSurface_VMultiplicities__SWIG_0(swigCPtr, this, TColStd_Array1OfInteger.getCPtr(Mv), Mv);
  }

  /**
   *  Returns the multiplicities of the knots in the V direction.
   */
  public  TColStd_Array1OfInteger  VMultiplicities() {
    TColStd_Array1OfInteger ret = new TColStd_Array1OfInteger(OCCwrapJavaJNI.Geom_BSplineSurface_VMultiplicities__SWIG_1(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the weight value of range UIndex, VIndex.
   * 
   *  Raised if UIndex < 1 or UIndex > NbUPoles or VIndex < 1
   *  or VIndex > NbVPoles.
   */
  public double Weight(int UIndex, int VIndex) {
    return OCCwrapJavaJNI.Geom_BSplineSurface_Weight(swigCPtr, this, UIndex, VIndex);
  }

  /**
   *  Returns the weights of the B-spline surface.
   * 
   *  Raised if the length of W in the U and V direction is
   *  not equal to NbUPoles and NbVPoles.
   */
  public void Weights( TColStd_Array2OfReal  W) {
    OCCwrapJavaJNI.Geom_BSplineSurface_Weights__SWIG_0(swigCPtr, this, TColStd_Array2OfReal.getCPtr(W), W);
  }

  /**
   *  Returns the weights of the B-spline surface.
   *  value and derivatives computation
   */
  public TColStd_Array2OfReal Weights() {
    long cPtr = OCCwrapJavaJNI.Geom_BSplineSurface_Weights__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new TColStd_Array2OfReal(cPtr, false);
  }

  /**
   *  Raised if FromUK1 = ToUK2 or FromVK1 = ToVK2.
   */
  public void LocalD0(double U, double V, int FromUK1, int ToUK2, int FromVK1, int ToVK2, gp_Pnt P) {
    OCCwrapJavaJNI.Geom_BSplineSurface_LocalD0(swigCPtr, this, U, V, FromUK1, ToUK2, FromVK1, ToVK2, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Raised if the local continuity of the surface is not C1
   *  between the knots FromUK1, ToUK2 and FromVK1, ToVK2.
   *  Raised if FromUK1 = ToUK2 or FromVK1 = ToVK2.
   */
  public void LocalD1(double U, double V, int FromUK1, int ToUK2, int FromVK1, int ToVK2, gp_Pnt P, gp_Vec D1U, gp_Vec D1V) {
    OCCwrapJavaJNI.Geom_BSplineSurface_LocalD1(swigCPtr, this, U, V, FromUK1, ToUK2, FromVK1, ToVK2, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(D1U), D1U, gp_Vec.getCPtr(D1V), D1V);
  }

  /**
   *  Raised if the local continuity of the surface is not C2
   *  between the knots FromUK1, ToUK2 and FromVK1, ToVK2.
   *  Raised if FromUK1 = ToUK2 or FromVK1 = ToVK2.
   */
  public void LocalD2(double U, double V, int FromUK1, int ToUK2, int FromVK1, int ToVK2, gp_Pnt P, gp_Vec D1U, gp_Vec D1V, gp_Vec D2U, gp_Vec D2V, gp_Vec D2UV) {
    OCCwrapJavaJNI.Geom_BSplineSurface_LocalD2(swigCPtr, this, U, V, FromUK1, ToUK2, FromVK1, ToVK2, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(D1U), D1U, gp_Vec.getCPtr(D1V), D1V, gp_Vec.getCPtr(D2U), D2U, gp_Vec.getCPtr(D2V), D2V, gp_Vec.getCPtr(D2UV), D2UV);
  }

  /**
   *  Raised if the local continuity of the surface is not C3
   *  between the knots FromUK1, ToUK2 and FromVK1, ToVK2.
   *  Raised if FromUK1 = ToUK2 or FromVK1 = ToVK2.
   */
  public void LocalD3(double U, double V, int FromUK1, int ToUK2, int FromVK1, int ToVK2, gp_Pnt P, gp_Vec D1U, gp_Vec D1V, gp_Vec D2U, gp_Vec D2V, gp_Vec D2UV, gp_Vec D3U, gp_Vec D3V, gp_Vec D3UUV, gp_Vec D3UVV) {
    OCCwrapJavaJNI.Geom_BSplineSurface_LocalD3(swigCPtr, this, U, V, FromUK1, ToUK2, FromVK1, ToVK2, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(D1U), D1U, gp_Vec.getCPtr(D1V), D1V, gp_Vec.getCPtr(D2U), D2U, gp_Vec.getCPtr(D2V), D2V, gp_Vec.getCPtr(D2UV), D2UV, gp_Vec.getCPtr(D3U), D3U, gp_Vec.getCPtr(D3V), D3V, gp_Vec.getCPtr(D3UUV), D3UUV, gp_Vec.getCPtr(D3UVV), D3UVV);
  }

  /**
   *  Raised if the local continuity of the surface is not CNu
   *  between the knots FromUK1, ToUK2 and CNv between the knots
   *  FromVK1, ToVK2.
   *  Raised if FromUK1 = ToUK2 or FromVK1 = ToVK2.
   */
  public gp_Vec LocalDN(double U, double V, int FromUK1, int ToUK2, int FromVK1, int ToVK2, int Nu, int Nv) {
    return new gp_Vec(OCCwrapJavaJNI.Geom_BSplineSurface_LocalDN(swigCPtr, this, U, V, FromUK1, ToUK2, FromVK1, ToVK2, Nu, Nv), true);
  }

  /**
   *  Computes the point of parameter U, V on the BSpline surface patch
   *  defines between the knots UK1 UK2, VK1, VK2. U can be out of the
   *  bounds [Knot UK1, Knot UK2] and V can be outof the bounds
   *  [Knot VK1, Knot VK2]  but for the computation we only use the
   *  definition of the surface between these knot values.
   *  Raises if FromUK1 = ToUK2 or FromVK1 = ToVK2.
   */
  public gp_Pnt LocalValue(double U, double V, int FromUK1, int ToUK2, int FromVK1, int ToVK2) {
    return new gp_Pnt(OCCwrapJavaJNI.Geom_BSplineSurface_LocalValue(swigCPtr, this, U, V, FromUK1, ToUK2, FromVK1, ToVK2), true);
  }

  public  Geom_Curve  UIso(double U) {
    return new Geom_Curve ( OCCwrapJavaJNI.Geom_BSplineSurface_UIso__SWIG_0(swigCPtr, this, U), true );
  }

  public  Geom_Curve  VIso(double V) {
    return new Geom_Curve ( OCCwrapJavaJNI.Geom_BSplineSurface_VIso__SWIG_0(swigCPtr, this, V), true );
  }

  public  Geom_Curve  UIso(double U, long CheckRational) {
    return new Geom_Curve ( OCCwrapJavaJNI.Geom_BSplineSurface_UIso__SWIG_1(swigCPtr, this, U, CheckRational), true );
  }

  public  Geom_Curve  VIso(double V, long CheckRational) {
    return new Geom_Curve ( OCCwrapJavaJNI.Geom_BSplineSurface_VIso__SWIG_1(swigCPtr, this, V, CheckRational), true );
  }

  /**
   *  Returns the value of the maximum degree of the normalized
   *  B-spline basis functions in the u and v directions.
   */
  public static int MaxDegree() {
    return OCCwrapJavaJNI.Geom_BSplineSurface_MaxDegree();
  }

  /**
   *  Computes two tolerance values for this BSpline
   *  surface, based on the given tolerance in 3D space
   *  Tolerance3D. The tolerances computed are:
   *  - UTolerance in the u parametric direction, and
   *  - VTolerance in the v parametric direction.
   *  If f(u,v) is the equation of this BSpline surface,
   *  UTolerance and VTolerance guarantee that :
   *  | u1 - u0 | < UTolerance and
   *  | v1 - v0 | < VTolerance
   *  ====> |f (u1,v1) - f (u0,v0)| < Tolerance3D
   */
  public void Resolution(double Tolerance3D, double[] UTolerance, double[] VTolerance) {
    OCCwrapJavaJNI.Geom_BSplineSurface_Resolution(swigCPtr, this, Tolerance3D, UTolerance, VTolerance);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_BSplineSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_BSplineSurface_get_type_descriptor(), true );
  }

  public static  Geom_BSplineSurface  DownCast( Standard_Transient  T) {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.Geom_BSplineSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_BSplineSurface_TypeOf(), true );
  }

}
