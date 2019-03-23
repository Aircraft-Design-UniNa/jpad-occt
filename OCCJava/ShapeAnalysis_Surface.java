package opencascade;

/**
 *  Complements standard tool Geom_Surface by providing additional
 *  functionality for detection surface singularities, checking
 *  spatial surface closure and computing projections of 3D points
 *  onto a surface.
 * 
 *  * The singularities
 *  Each singularity stores the precision with which corresponding
 *  surface iso-line is considered as degenerated.
 *  The number of singularities is determined by specifying precision
 *  and always not greater than 4.
 * 
 *  * The spatial closure
 *  The check for spatial closure is performed with given precision
 *  (default value is Precision::Confusion).
 *  If Geom_Surface says that the surface is closed, this class
 *  also says this. Otherwise additional analysis is performed.
 * 
 *  * The parameters of 3D point on the surface
 *  The projection of the point is performed with given precision.
 *  This class tries to find a solution taking into account possible
 *  singularities.
 *  Additional method for searching the solution from already built
 *  one is also provided.
 * 
 *  This tool is optimised: computes most information only once
 */
public class ShapeAnalysis_Surface extends Standard_Transient {
  ShapeAnalysis_Surface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates an analyzer object on the basis of existing surface
   */
  public ShapeAnalysis_Surface( Geom_Surface  S) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_Surface( Geom_Surface.getCPtr(S) , S), true);
  }

  /**
   *  Loads existing surface
   */
  public void Init( Geom_Surface  S) {
    OCCwrapJavaJNI.ShapeAnalysis_Surface_Init__SWIG_0(swigCPtr, this,  Geom_Surface.getCPtr(S) , S);
  }

  /**
   *  Reads all the data from another Surface, without recomputing
   */
  public void Init( ShapeAnalysis_Surface  other) {
    OCCwrapJavaJNI.ShapeAnalysis_Surface_Init__SWIG_1(swigCPtr, this,  ShapeAnalysis_Surface.getCPtr(other) , other);
  }

  public void SetDomain(double U1, double U2, double V1, double V2) {
    OCCwrapJavaJNI.ShapeAnalysis_Surface_SetDomain(swigCPtr, this, U1, U2, V1, V2);
  }

  public  Geom_Surface  Surface() {
    return new Geom_Surface ( OCCwrapJavaJNI.ShapeAnalysis_Surface_Surface(swigCPtr, this), true );
  }

  public  GeomAdaptor_HSurface  Adaptor3d() {
    return new GeomAdaptor_HSurface ( OCCwrapJavaJNI.ShapeAnalysis_Surface_Adaptor3d(swigCPtr, this), true );
  }

  public  GeomAdaptor_HSurface  TrueAdaptor3d() {
    return new GeomAdaptor_HSurface ( OCCwrapJavaJNI.ShapeAnalysis_Surface_TrueAdaptor3d(swigCPtr, this), true );
  }

  /**
   *  Returns 3D distance found by one of the following methods.
   *  IsDegenerated, DegeneratedValues, ProjectDegenerated
   *  (distance between 3D point and found or last (if not found)
   *  singularity),
   *  IsUClosed, IsVClosed (minimum value of precision to consider
   *  the surface to be closed),
   *  ValueOfUV (distance between 3D point and found solution).
   */
  public double Gap() {
    return OCCwrapJavaJNI.ShapeAnalysis_Surface_Gap(swigCPtr, this);
  }

  /**
   *  Returns a 3D point specified by parameters in surface
   *  parametrical space
   */
  public gp_Pnt Value(double u, double v) {
    return new gp_Pnt(OCCwrapJavaJNI.ShapeAnalysis_Surface_Value__SWIG_0(swigCPtr, this, u, v), true);
  }

  /**
   *  Returns a 3d point specified by a point in surface
   *  parametrical space
   */
  public gp_Pnt Value( gp_Pnt2d  p2d) {
    return new gp_Pnt(OCCwrapJavaJNI.ShapeAnalysis_Surface_Value__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(p2d), p2d), true);
  }

  /**
   *  Returns True if the surface has singularities for the given
   *  precision (i.e. if there are surface singularities with sizes
   *  not greater than precision).
   */
  public long HasSingularities(double preci) {
    return OCCwrapJavaJNI.ShapeAnalysis_Surface_HasSingularities(swigCPtr, this, preci);
  }

  /**
   *  Returns the number of singularities for the given precision
   *  (i.e. number of surface singularities with sizes not greater
   *  than precision).
   */
  public int NbSingularities(double preci) {
    return OCCwrapJavaJNI.ShapeAnalysis_Surface_NbSingularities(swigCPtr, this, preci);
  }

  /**
   *  Returns the characteristics of the singularity specified by
   *  its rank number <num>.
   *  That means, that it is not neccessary for <num> to be in the
   *  range [1, NbSingularities] but must be not greater than
   *  possible (see ComputeSingularities).
   *  The returned characteristics are:
   *  preci: the smallest precision with which the iso-line is
   *  considered as degenerated,
   *  P3d: 3D point of singularity (middle point of the surface
   *  iso-line),
   *  firstP2d and lastP2d: first and last 2D points of the
   *  iso-line in parametrical surface,
   *  firstpar and lastpar: first and last parameters of the
   *  iso-line in parametrical surface,
   *  uisodeg: if the degenerated iso-line is U-iso (True) or
   *  V-iso (False).
   *  Returns False if <num> is out of range, else returns True.
   */
  public long Singularity(int num, double[] preci, gp_Pnt P3d, gp_Pnt2d firstP2d, gp_Pnt2d lastP2d, double[] firstpar, double[] lastpar, long[] uisodeg) {
    return OCCwrapJavaJNI.ShapeAnalysis_Surface_Singularity(swigCPtr, this, num, preci, gp_Pnt.getCPtr(P3d), P3d, gp_Pnt2d.getCPtr(firstP2d), firstP2d, gp_Pnt2d.getCPtr(lastP2d), lastP2d, firstpar, lastpar, uisodeg);
  }

  /**
   *  Returns True if there is at least one surface boundary which
   *  is considered as degenerated with <preci> and distance
   *  between P3d and corresponding singular point is less than
   *  <preci>
   */
  public long IsDegenerated( gp_Pnt  P3d, double preci) {
    return OCCwrapJavaJNI.ShapeAnalysis_Surface_IsDegenerated__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P3d), P3d, preci);
  }

  /**
   *  Returns True if there is at least one surface iso-line which
   *  is considered as degenerated with <preci> and distance
   *  between P3d and corresponding singular point is less than
   *  <preci> (like IsDegenerated).
   *  Returns characteristics of the first found boundary matching
   *  those criteria.
   */
  public long DegeneratedValues( gp_Pnt  P3d, double preci, gp_Pnt2d firstP2d, gp_Pnt2d lastP2d, double[] firstpar, double[] lastpar, long forward) {
    return OCCwrapJavaJNI.ShapeAnalysis_Surface_DegeneratedValues__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P3d), P3d, preci, gp_Pnt2d.getCPtr(firstP2d), firstP2d, gp_Pnt2d.getCPtr(lastP2d), lastP2d, firstpar, lastpar, forward);
  }

  public long DegeneratedValues( gp_Pnt  P3d, double preci, gp_Pnt2d firstP2d, gp_Pnt2d lastP2d, double[] firstpar, double[] lastpar) {
    return OCCwrapJavaJNI.ShapeAnalysis_Surface_DegeneratedValues__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P3d), P3d, preci, gp_Pnt2d.getCPtr(firstP2d), firstP2d, gp_Pnt2d.getCPtr(lastP2d), lastP2d, firstpar, lastpar);
  }

  /**
   *  Projects a point <P3d> on a singularity by computing
   *  one of the coordinates of preliminary computed <result>.
   * 
   *  Finds the iso-line which is considered as degenerated with
   *  <preci> and
   *  a. distance between P3d and corresponding singular point is
   *  less than <preci> (like IsDegenerated) or
   *  b. difference between already computed <result>'s coordinate
   *  and iso-coordinate of the boundary is less than 2D
   *  resolution (computed from <preci> by Geom_Adaptor).
   *  Then sets not yet computed <result>'s coordinate taking it
   *  from <neighbour> and returns True.
   */
  public long ProjectDegenerated( gp_Pnt  P3d, double preci,  gp_Pnt2d  neighbour, gp_Pnt2d result) {
    return OCCwrapJavaJNI.ShapeAnalysis_Surface_ProjectDegenerated__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P3d), P3d, preci, gp_Pnt2d.getCPtr(neighbour), neighbour, gp_Pnt2d.getCPtr(result), result);
  }

  /**
   *  Checks points at the beginning (direct is True) or end
   *  (direct is False) of array <points> to lie in singularity of
   *  surface, and if yes, adjusts the indeterminate 2d coordinate
   *  of these points by nearest point which is not in singularity.
   *  Returns True if some points were adjusted.
   */
  public long ProjectDegenerated(int nbrPnt,  TColgp_SequenceOfPnt  points,  TColgp_SequenceOfPnt2d  pnt2d, double preci, long direct) {
    return OCCwrapJavaJNI.ShapeAnalysis_Surface_ProjectDegenerated__SWIG_1(swigCPtr, this, nbrPnt, TColgp_SequenceOfPnt.getCPtr(points), points, TColgp_SequenceOfPnt2d.getCPtr(pnt2d), pnt2d, preci, direct);
  }

  /**
   *  Returns True if straight pcurve going from point p2d1 to p2d2
   *  is degenerate, i.e. lies in the singularity of the surface.
   *  NOTE: it uses another method of detecting singularity than
   *  used by ComputeSingularities() et al.!
   *  For that, maximums of distances between points p2d1, p2d2
   *  and 0.5*(p2d1+p2d2) and between corresponding 3d points are
   *  computed.
   *  The pcurve (p2d1, p2d2) is considered as degenerate if:
   *  - max distance in 3d is less than <tol>
   *  - max distance in 2d is at least <ratio> times greather than
   *  the Resolution computed from max distance in 3d
   *  (max3d < tol && max2d > ratio * Resolution(max3d))
   *  NOTE: <ratio> should be >1 (e.g. 10)
   */
  public long IsDegenerated( gp_Pnt2d  p2d1,  gp_Pnt2d  p2d2, double tol, double ratio) {
    return OCCwrapJavaJNI.ShapeAnalysis_Surface_IsDegenerated__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(p2d1), p2d1, gp_Pnt2d.getCPtr(p2d2), p2d2, tol, ratio);
  }

  /**
   *  Returns the bounds of the surface
   *  (from Bounds from Surface, but buffered)
   */
  public void Bounds(double[] ufirst, double[] ulast, double[] vfirst, double[] vlast) {
    OCCwrapJavaJNI.ShapeAnalysis_Surface_Bounds(swigCPtr, this, ufirst, ulast, vfirst, vlast);
  }

  /**
   *  Computes bound isos (protected against exceptions)
   */
  public void ComputeBoundIsos() {
    OCCwrapJavaJNI.ShapeAnalysis_Surface_ComputeBoundIsos(swigCPtr, this);
  }

  public  Geom_Curve  UIso(double U) {
    return new Geom_Curve ( OCCwrapJavaJNI.ShapeAnalysis_Surface_UIso(swigCPtr, this, U), true );
  }

  public  Geom_Curve  VIso(double V) {
    return new Geom_Curve ( OCCwrapJavaJNI.ShapeAnalysis_Surface_VIso(swigCPtr, this, V), true );
  }

  /**
   *  Tells if the Surface is spatially closed in U with given
   *  precision. If <preci> < 0 then Precision::Confusion is used.
   *  If Geom_Surface says that the surface is U-closed, this method
   *  also says this. Otherwise additional analysis is performed,
   *  comparing given precision with the following distances:
   *  - periodic B-Splines are closed,
   *  - polinomial B-Spline with boundary multiplicities degree+1
   *  and Bezier - maximum distance between poles,
   *  - rational B-Spline or one with boundary multiplicities not
   *  degree+1 - maximum distance computed at knots and their
   *  middles,
   *  - surface of extrusion - distance between ends of basis
   *  curve,
   *  - other (RectangularTrimmed and Offset) - maximum distance
   *  computed at 100 equi-distanted points.
   */
  public long IsUClosed(double preci) {
    return OCCwrapJavaJNI.ShapeAnalysis_Surface_IsUClosed__SWIG_0(swigCPtr, this, preci);
  }

  public long IsUClosed() {
    return OCCwrapJavaJNI.ShapeAnalysis_Surface_IsUClosed__SWIG_1(swigCPtr, this);
  }

  /**
   *  Tells if the Surface is spatially closed in V with given
   *  precision. If <preci> < 0 then Precision::Confusion is used.
   *  If Geom_Surface says that the surface is V-closed, this method
   *  also says this. Otherwise additional analysis is performed,
   *  comparing given precision with the following distances:
   *  - periodic B-Splines are closed,
   *  - polinomial B-Spline with boundary multiplicities degree+1
   *  and Bezier - maximum distance between poles,
   *  - rational B-Spline or one with boundary multiplicities not
   *  degree+1 - maximum distance computed at knots and their
   *  middles,
   *  - surface of revolution - distance between ends of basis
   *  curve,
   *  - other (RectangularTrimmed and Offset) - maximum distance
   *  computed at 100 equi-distanted points.
   */
  public long IsVClosed(double preci) {
    return OCCwrapJavaJNI.ShapeAnalysis_Surface_IsVClosed__SWIG_0(swigCPtr, this, preci);
  }

  public long IsVClosed() {
    return OCCwrapJavaJNI.ShapeAnalysis_Surface_IsVClosed__SWIG_1(swigCPtr, this);
  }

  /**
   *  Computes the parameters in the surface parametrical space of
   *  3D point.
   *  The result is parameters of the point projected onto the
   *  surface.
   *  This method enhances functionality provided by the standard
   *  tool GeomAPI_ProjectPointOnSurface by treatment of cases when
   *  the projected point is near to the surface boundaries and
   *  when this standard tool fails.
   */
  public gp_Pnt2d ValueOfUV( gp_Pnt  P3D, double preci) {
    return new gp_Pnt2d(OCCwrapJavaJNI.ShapeAnalysis_Surface_ValueOfUV(swigCPtr, this, gp_Pnt.getCPtr(P3D), P3D, preci), true);
  }

  /**
   *  Projects a point P3D on the surface.
   *  Does the same thing as ValueOfUV but tries to optimize
   *  computations by taking into account previous point <p2dPrev>:
   *  makes a step by UV and tries Newton algorithm.
   *  If <maxpreci> >0. and distance between solution and
   *  P3D is greater than <maxpreci>, that solution is considered
   *  as bad, and ValueOfUV() is used.
   *  If not succeded, calls ValueOfUV()
   */
  public gp_Pnt2d NextValueOfUV( gp_Pnt2d  p2dPrev,  gp_Pnt  P3D, double preci, double maxpreci) {
    return new gp_Pnt2d(OCCwrapJavaJNI.ShapeAnalysis_Surface_NextValueOfUV__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(p2dPrev), p2dPrev, gp_Pnt.getCPtr(P3D), P3D, preci, maxpreci), true);
  }

  public gp_Pnt2d NextValueOfUV( gp_Pnt2d  p2dPrev,  gp_Pnt  P3D, double preci) {
    return new gp_Pnt2d(OCCwrapJavaJNI.ShapeAnalysis_Surface_NextValueOfUV__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(p2dPrev), p2dPrev, gp_Pnt.getCPtr(P3D), P3D, preci), true);
  }

  /**
   *  Tries a refinement of an already computed couple (U,V) by
   *  using projecting 3D point on iso-lines:
   *  1. boundaries of the surface,
   *  2. iso-lines passing through (U,V)
   *  3. iteratively received iso-lines passing through new U and
   *  new V (number of iterations is limited by 5 in each
   *  direction)
   *  Returns the best resulting distance between P3D and Value(U,V)
   *  in the case of success. Else, returns a very great value
   */
  public double UVFromIso( gp_Pnt  P3D, double preci, double[] U, double[] V) {
    return OCCwrapJavaJNI.ShapeAnalysis_Surface_UVFromIso(swigCPtr, this, gp_Pnt.getCPtr(P3D), P3D, preci, U, V);
  }

  /**
   *  Returns minimum value to consider the surface as U-closed
   */
  public double UCloseVal() {
    return OCCwrapJavaJNI.ShapeAnalysis_Surface_UCloseVal(swigCPtr, this);
  }

  /**
   *  Returns minimum value to consider the surface as V-closed
   */
  public double VCloseVal() {
    return OCCwrapJavaJNI.ShapeAnalysis_Surface_VCloseVal(swigCPtr, this);
  }

  public  Bnd_Box  GetBoxUF() {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.ShapeAnalysis_Surface_GetBoxUF(swigCPtr, this), true);
    return ret;
  }

  public  Bnd_Box  GetBoxUL() {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.ShapeAnalysis_Surface_GetBoxUL(swigCPtr, this), true);
    return ret;
  }

  public  Bnd_Box  GetBoxVF() {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.ShapeAnalysis_Surface_GetBoxVF(swigCPtr, this), true);
    return ret;
  }

  public  Bnd_Box  GetBoxVL() {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.ShapeAnalysis_Surface_GetBoxVL(swigCPtr, this), true);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeAnalysis_Surface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeAnalysis_Surface_get_type_descriptor(), true );
  }

  public static  ShapeAnalysis_Surface  DownCast( Standard_Transient  T) {
    return new ShapeAnalysis_Surface ( OCCwrapJavaJNI.ShapeAnalysis_Surface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeAnalysis_Surface_TypeOf(), true );
  }

}
