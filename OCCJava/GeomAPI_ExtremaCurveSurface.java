package opencascade;

/**
 *  Describes functions for computing all the extrema
 *  between a curve and a surface.
 *  An ExtremaCurveSurface algorithm minimizes or
 *  maximizes the distance between a point on the curve
 *  and a point on the surface. Thus, it computes start
 *  and end points of perpendiculars common to the
 *  curve and the surface (an intersection point is not an
 *  extremum except where the curve and the surface
 *  are tangential at this point).
 *  Solutions consist of pairs of points, and an extremum
 *  is considered to be a segment joining the two points of a solution.
 *  An ExtremaCurveSurface object provides a framework for:
 *  -   defining the construction of the extrema,
 *  -   implementing the construction algorithm, and
 *  -   consulting the results.
 *  Warning
 *  In some cases, the nearest points between a curve
 *  and a surface do not correspond to one of the
 *  computed extrema. Instead, they may be given by:
 *  -   a point of a bounding curve of the surface and one of the following:
 *  -   its orthogonal projection on the curve,
 *  -   a limit point of the curve; or
 *  -   a limit point of the curve and its projection on the surface; or
 *  -   an intersection point between the curve and the surface.
 */
public class GeomAPI_ExtremaCurveSurface {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomAPI_ExtremaCurveSurface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomAPI_ExtremaCurveSurface(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomAPI_ExtremaCurveSurface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomAPI_ExtremaCurveSurface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs an empty algorithm for computing
   *  extrema between a curve and a surface. Use an
   *  Init function to define the curve and the surface on
   *  which it is going to work.
   */
  public GeomAPI_ExtremaCurveSurface() {
    this(OCCwrapJavaJNI.new_GeomAPI_ExtremaCurveSurface__SWIG_0(), true);
  }

  /**
   *  Computes  the  extrema  distances  between  the
   *  curve <C> and the surface  <S>.
   */
  public GeomAPI_ExtremaCurveSurface( Geom_Curve  Curve,  Geom_Surface  Surface) {
    this(OCCwrapJavaJNI.new_GeomAPI_ExtremaCurveSurface__SWIG_1( Geom_Curve.getCPtr(Curve) , Curve,  Geom_Surface.getCPtr(Surface) , Surface), true);
  }

  /**
   *  Computes  the  extrema  distances  between  the
   *  curve <C>  and the  surface  <S>.  The solution
   *  point are computed in the domain [Wmin,Wmax] of
   *  the  curve   and  in  the  domain   [Umin,Umax]
   *  [Vmin,Vmax] of the surface.
   *  Warning
   *  Use the function NbExtrema to obtain the number
   *  of solutions. If this algorithm fails, NbExtrema returns 0.
   */
  public GeomAPI_ExtremaCurveSurface( Geom_Curve  Curve,  Geom_Surface  Surface, double Wmin, double Wmax, double Umin, double Umax, double Vmin, double Vmax) {
    this(OCCwrapJavaJNI.new_GeomAPI_ExtremaCurveSurface__SWIG_2( Geom_Curve.getCPtr(Curve) , Curve,  Geom_Surface.getCPtr(Surface) , Surface, Wmin, Wmax, Umin, Umax, Vmin, Vmax), true);
  }

  /**
   *  Computes  the  extrema  distances  between  the
   *  curve <C> and the surface  <S>.
   */
  public void Init( Geom_Curve  Curve,  Geom_Surface  Surface) {
    OCCwrapJavaJNI.GeomAPI_ExtremaCurveSurface_Init__SWIG_0(swigCPtr, this,  Geom_Curve.getCPtr(Curve) , Curve,  Geom_Surface.getCPtr(Surface) , Surface);
  }

  /**
   *  Computes  the  extrema  distances  between  the
   *  curve <C>  and the  surface  <S>.  The solution
   *  point are computed in the domain [Wmin,Wmax] of
   *  the  curve   and  in  the  domain   [Umin,Umax]
   *  [Vmin,Vmax] of the surface.
   *  Warning
   *  Use the function NbExtrema to obtain the number
   *  of solutions. If this algorithm fails, NbExtrema returns 0.
   */
  public void Init( Geom_Curve  Curve,  Geom_Surface  Surface, double Wmin, double Wmax, double Umin, double Umax, double Vmin, double Vmax) {
    OCCwrapJavaJNI.GeomAPI_ExtremaCurveSurface_Init__SWIG_1(swigCPtr, this,  Geom_Curve.getCPtr(Curve) , Curve,  Geom_Surface.getCPtr(Surface) , Surface, Wmin, Wmax, Umin, Umax, Vmin, Vmax);
  }

  /**
   *  Returns the number of extrema computed by this algorithm.
   *  Note: if this algorithm fails, NbExtrema returns 0.
   */
  public int NbExtrema() {
    return OCCwrapJavaJNI.GeomAPI_ExtremaCurveSurface_NbExtrema(swigCPtr, this);
  }

  /**
   *  Returns the points P1 on the curve and P2 on the
   *  surface, which are the ends of the extremum of index
   *  Index computed by this algorithm.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [
   *  1,NbExtrema ], where NbExtrema is the
   *  number of extrema computed by this algorithm.
   */
  public void Points(int Index, gp_Pnt P1, gp_Pnt P2) {
    OCCwrapJavaJNI.GeomAPI_ExtremaCurveSurface_Points(swigCPtr, this, Index, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Returns the parameters W of the point on the curve,
   *  and (U,V) of the point on the surface, which are the
   *  ends of the extremum of index Index computed by this algorithm.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [
   *  1,NbExtrema ], where NbExtrema is the
   *  number of extrema computed by this algorithm.
   */
  public void Parameters(int Index, double[] W, double[] U, double[] V) {
    OCCwrapJavaJNI.GeomAPI_ExtremaCurveSurface_Parameters(swigCPtr, this, Index, W, U, V);
  }

  /**
   *  Computes the distance between the end points of the
   *  extremum of index Index computed by this algorithm.
   *  Exceptions
   *  Standard_OutOfRange if index is not in the range [
   *  1,NbExtrema ], where NbExtrema is the
   *  number of extrema computed by this algorithm.
   */
  public double Distance(int Index) {
    return OCCwrapJavaJNI.GeomAPI_ExtremaCurveSurface_Distance(swigCPtr, this, Index);
  }

  /**
   *  Returns the points PC on the curve and PS on the
   *  surface, which are the ends of the shortest extremum computed by this algorithm.
   *  Exceptions - StdFail_NotDone if this algorithm fails.
   */
  public void NearestPoints(gp_Pnt PC, gp_Pnt PS) {
    OCCwrapJavaJNI.GeomAPI_ExtremaCurveSurface_NearestPoints(swigCPtr, this, gp_Pnt.getCPtr(PC), PC, gp_Pnt.getCPtr(PS), PS);
  }

  /**
   *  Returns the parameters W of the point on the curve
   *  and (U,V) of the point on the surface, which are the
   *  ends of the shortest extremum computed by this algorithm.
   *  Exceptions - StdFail_NotDone if this algorithm fails.
   */
  public void LowerDistanceParameters(double[] W, double[] U, double[] V) {
    OCCwrapJavaJNI.GeomAPI_ExtremaCurveSurface_LowerDistanceParameters(swigCPtr, this, W, U, V);
  }

  /**
   *  Computes the distance between the end points of the
   *  shortest extremum computed by this algorithm.
   *  Exceptions - StdFail_NotDone if this algorithm fails.
   */
  public double LowerDistance() {
    return OCCwrapJavaJNI.GeomAPI_ExtremaCurveSurface_LowerDistance(swigCPtr, this);
  }

}
