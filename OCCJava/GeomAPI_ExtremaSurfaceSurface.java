package opencascade;

/**
 *  Describes functions for computing all the extrema
 *  between two surfaces.
 *  An ExtremaSurfaceSurface algorithm minimizes or
 *  maximizes the distance between a point on the first
 *  surface and a point on the second surface. Results
 *  are start and end points of perpendiculars common to the two surfaces.
 *  Solutions consist of pairs of points, and an extremum
 *  is considered to be a segment joining the two points of a solution.
 *  An ExtremaSurfaceSurface object provides a framework for:
 *  -   defining the construction of the extrema,
 *  -   implementing the construction algorithm, and
 *  -   consulting the results.
 *  Warning
 *  In some cases, the nearest points between the two
 *  surfaces do not correspond to one of the computed
 *  extrema. Instead, they may be given by:
 *  -   a point of a bounding curve of one surface and one of the following:
 *  -   its orthogonal projection on the other surface,
 *  -   a point of a bounding curve of the other surface; or
 *  -   any point on intersection curves between the two surfaces.
 */
public class GeomAPI_ExtremaSurfaceSurface {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomAPI_ExtremaSurfaceSurface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomAPI_ExtremaSurfaceSurface(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomAPI_ExtremaSurfaceSurface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomAPI_ExtremaSurfaceSurface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs an empty algorithm for computing
   *  extrema between two surfaces. Use an Init function
   *  to define the surfaces on which it is going to work.
   */
  public GeomAPI_ExtremaSurfaceSurface() {
    this(OCCwrapJavaJNI.new_GeomAPI_ExtremaSurfaceSurface__SWIG_0(), true);
  }

  /**
   *  Computes  the  extrema  distances  between  the
   *  surfaces <S1>  and <S2>
   */
  public GeomAPI_ExtremaSurfaceSurface( Geom_Surface  S1,  Geom_Surface  S2) {
    this(OCCwrapJavaJNI.new_GeomAPI_ExtremaSurfaceSurface__SWIG_1( Geom_Surface.getCPtr(S1) , S1,  Geom_Surface.getCPtr(S2) , S2), true);
  }

  /**
   *  Computes  the  extrema  distances  between
   *  the portion of the surface S1 limited by the
   *  two values of parameter (U1min,U1max) in
   *  the u parametric direction, and by the two
   *  values of parameter (V1min,V1max) in the v
   *  parametric direction, and
   *  -   the portion of the surface S2 limited by the
   *  two values of parameter (U2min,U2max) in
   *  the u parametric direction, and by the two
   *  values of parameter (V2min,V2max) in the v
   *  parametric direction.
   */
  public GeomAPI_ExtremaSurfaceSurface( Geom_Surface  S1,  Geom_Surface  S2, double U1min, double U1max, double V1min, double V1max, double U2min, double U2max, double V2min, double V2max) {
    this(OCCwrapJavaJNI.new_GeomAPI_ExtremaSurfaceSurface__SWIG_2( Geom_Surface.getCPtr(S1) , S1,  Geom_Surface.getCPtr(S2) , S2, U1min, U1max, V1min, V1max, U2min, U2max, V2min, V2max), true);
  }

  /**
   *  Initializes this algorithm with the given arguments
   *  and computes  the  extrema  distances  between  the
   *  surfaces <S1>  and <S2>
   */
  public void Init( Geom_Surface  S1,  Geom_Surface  S2) {
    OCCwrapJavaJNI.GeomAPI_ExtremaSurfaceSurface_Init__SWIG_0(swigCPtr, this,  Geom_Surface.getCPtr(S1) , S1,  Geom_Surface.getCPtr(S2) , S2);
  }

  /**
   *  Initializes this algorithm with the given arguments
   *  and computes  the  extrema  distances  between -
   *  the portion of the surface S1 limited by the two
   *  values of parameter (U1min,U1max) in the u
   *  parametric direction, and by the two values of
   *  parameter (V1min,V1max) in the v parametric direction, and
   *  -   the portion of the surface S2 limited by the two
   *  values of parameter (U2min,U2max) in the u
   *  parametric direction, and by the two values of
   *  parameter (V2min,V2max) in the v parametric direction.
   */
  public void Init( Geom_Surface  S1,  Geom_Surface  S2, double U1min, double U1max, double V1min, double V1max, double U2min, double U2max, double V2min, double V2max) {
    OCCwrapJavaJNI.GeomAPI_ExtremaSurfaceSurface_Init__SWIG_1(swigCPtr, this,  Geom_Surface.getCPtr(S1) , S1,  Geom_Surface.getCPtr(S2) , S2, U1min, U1max, V1min, V1max, U2min, U2max, V2min, V2max);
  }

  /**
   *  Returns the number of extrema computed by this algorithm.
   *  Note: if this algorithm fails, NbExtrema returns 0.
   */
  public int NbExtrema() {
    return OCCwrapJavaJNI.GeomAPI_ExtremaSurfaceSurface_NbExtrema(swigCPtr, this);
  }

  /**
   *  Returns the points P1 on the first surface and P2 on
   *  the second surface, which are the ends of the
   *  extremum of index Index computed by this algorithm.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [
   *  1,NbExtrema ], where NbExtrema is the
   *  number of extrema computed by this algorithm.
   */
  public void Points(int Index, gp_Pnt P1, gp_Pnt P2) {
    OCCwrapJavaJNI.GeomAPI_ExtremaSurfaceSurface_Points(swigCPtr, this, Index, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Returns the parameters (U1,V1) of the point on the
   *  first surface, and (U2,V2) of the point on the second
   *  surface, which are the ends of the extremum of index
   *  Index computed by this algorithm.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [
   *  1,NbExtrema ], where NbExtrema is the
   *  number of extrema computed by this algorithm.
   */
  public void Parameters(int Index, double[] U1, double[] V1, double[] U2, double[] V2) {
    OCCwrapJavaJNI.GeomAPI_ExtremaSurfaceSurface_Parameters(swigCPtr, this, Index, U1, V1, U2, V2);
  }

  /**
   *  Computes the distance between the end points of the
   *  extremum of index Index computed by this algorithm.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [
   *  1,NbExtrema ], where NbExtrema is the
   *  number of extrema computed by this algorithm.
   */
  public double Distance(int Index) {
    return OCCwrapJavaJNI.GeomAPI_ExtremaSurfaceSurface_Distance(swigCPtr, this, Index);
  }

  /**
   *  Returns the points P1 on the first surface and P2 on
   *  the second surface, which are the ends of the
   *  shortest extremum computed by this algorithm.
   *  Exceptions StdFail_NotDone if this algorithm fails.
   */
  public void NearestPoints(gp_Pnt P1, gp_Pnt P2) {
    OCCwrapJavaJNI.GeomAPI_ExtremaSurfaceSurface_NearestPoints(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Returns the parameters (U1,V1) of the point on the
   *  first surface and (U2,V2) of the point on the second
   *  surface, which are the ends of the shortest extremum
   *  computed by this algorithm.
   *  Exceptions - StdFail_NotDone if this algorithm fails.
   */
  public void LowerDistanceParameters(double[] U1, double[] V1, double[] U2, double[] V2) {
    OCCwrapJavaJNI.GeomAPI_ExtremaSurfaceSurface_LowerDistanceParameters(swigCPtr, this, U1, V1, U2, V2);
  }

  /**
   *  Computes the distance between the end points of the
   *  shortest extremum computed by this algorithm.
   *  Exceptions StdFail_NotDone if this algorithm fails.
   */
  public double LowerDistance() {
    return OCCwrapJavaJNI.GeomAPI_ExtremaSurfaceSurface_LowerDistance(swigCPtr, this);
  }

}
