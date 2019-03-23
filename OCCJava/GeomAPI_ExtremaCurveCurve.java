package opencascade;

/**
 *  Describes functions for computing all the extrema
 *  between two 3D curves.
 *  An ExtremaCurveCurve algorithm minimizes or
 *  maximizes the distance between a point on the first
 *  curve and a point on the second curve. Thus, it
 *  computes start and end points of perpendiculars
 *  common to the two curves (an intersection point is
 *  not an extremum unless the two curves are tangential at this point).
 *  Solutions consist of pairs of points, and an extremum
 *  is considered to be a segment joining the two points of a solution.
 *  An ExtremaCurveCurve object provides a framework for:
 *  -   defining the construction of the extrema,
 *  -   implementing the construction algorithm, and
 *  -   consulting the results.
 *  Warning
 *  In some cases, the nearest points between two
 *  curves do not correspond to one of the computed
 *  extrema. Instead, they may be given by:
 *  -   a limit point of one curve and one of the following:
 *  -   its orthogonal projection on the other curve,
 *  -   a limit point of the other curve; or
 *  -   an intersection point between the two curves.
 */
public class GeomAPI_ExtremaCurveCurve {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomAPI_ExtremaCurveCurve(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomAPI_ExtremaCurveCurve(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomAPI_ExtremaCurveCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomAPI_ExtremaCurveCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs an empty algorithm for computing
   *  extrema between two curves. Use an Init function
   *  to define the curves on which it is going to work.
   */
  public GeomAPI_ExtremaCurveCurve() {
    this(OCCwrapJavaJNI.new_GeomAPI_ExtremaCurveCurve__SWIG_0(), true);
  }

  /**
   *  Computes the extrema between the curves C1 and C2.
   */
  public GeomAPI_ExtremaCurveCurve( Geom_Curve  C1,  Geom_Curve  C2) {
    this(OCCwrapJavaJNI.new_GeomAPI_ExtremaCurveCurve__SWIG_1( Geom_Curve.getCPtr(C1) , C1,  Geom_Curve.getCPtr(C2) , C2), true);
  }

  /**
   *  Computes   the portion of the curve C1 limited by the two
   *  points of parameter (U1min,U1max), and
   *  -   the portion of the curve C2 limited by the two
   *  points of parameter (U2min,U2max).
   *  Warning
   *  Use the function NbExtrema to obtain the number
   *  of solutions. If this algorithm fails, NbExtrema returns 0.
   */
  public GeomAPI_ExtremaCurveCurve( Geom_Curve  C1,  Geom_Curve  C2, double U1min, double U1max, double U2min, double U2max) {
    this(OCCwrapJavaJNI.new_GeomAPI_ExtremaCurveCurve__SWIG_2( Geom_Curve.getCPtr(C1) , C1,  Geom_Curve.getCPtr(C2) , C2, U1min, U1max, U2min, U2max), true);
  }

  /**
   *  Initializes this algorithm with the given arguments
   *  and computes the extrema between the curves C1 and C2
   */
  public void Init( Geom_Curve  C1,  Geom_Curve  C2) {
    OCCwrapJavaJNI.GeomAPI_ExtremaCurveCurve_Init__SWIG_0(swigCPtr, this,  Geom_Curve.getCPtr(C1) , C1,  Geom_Curve.getCPtr(C2) , C2);
  }

  /**
   *  Initializes this algorithm with the given arguments
   *  and computes the extrema between :
   *  -   the portion of the curve C1 limited by the two
   *  points of parameter (U1min,U1max), and
   *  -   the portion of the curve C2 limited by the two
   *  points of parameter (U2min,U2max).
   *  Warning
   *  Use the function NbExtrema to obtain the number
   *  of solutions. If this algorithm fails, NbExtrema returns 0.
   */
  public void Init( Geom_Curve  C1,  Geom_Curve  C2, double U1min, double U1max, double U2min, double U2max) {
    OCCwrapJavaJNI.GeomAPI_ExtremaCurveCurve_Init__SWIG_1(swigCPtr, this,  Geom_Curve.getCPtr(C1) , C1,  Geom_Curve.getCPtr(C2) , C2, U1min, U1max, U2min, U2max);
  }

  /**
   *  Returns the number of extrema computed by this algorithm.
   *  Note: if this algorithm fails, NbExtrema returns 0.
   */
  public int NbExtrema() {
    return OCCwrapJavaJNI.GeomAPI_ExtremaCurveCurve_NbExtrema(swigCPtr, this);
  }

  /**
   *  Returns the points P1 on the first curve and P2 on
   *  the second curve, which are the ends of the
   *  extremum of index Index computed by this algorithm.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [
   *  1,NbExtrema ], where NbExtrema is the
   *  number of extrema computed by this algorithm.
   */
  public void Points(int Index, gp_Pnt P1, gp_Pnt P2) {
    OCCwrapJavaJNI.GeomAPI_ExtremaCurveCurve_Points(swigCPtr, this, Index, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Returns the parameters U1 of the point on the first
   *  curve and U2 of the point on the second curve, which
   *  are the ends of the extremum of index Index computed by this algorithm.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [
   *  1,NbExtrema ], where NbExtrema is the
   *  number of extrema computed by this algorithm.
   */
  public void Parameters(int Index, double[] U1, double[] U2) {
    OCCwrapJavaJNI.GeomAPI_ExtremaCurveCurve_Parameters(swigCPtr, this, Index, U1, U2);
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
    return OCCwrapJavaJNI.GeomAPI_ExtremaCurveCurve_Distance(swigCPtr, this, Index);
  }

  /**
   *  Returns the points P1 on the first curve and P2 on
   *  the second curve, which are the ends of the shortest
   *  extremum computed by this algorithm.
   *  Exceptions StdFail_NotDone if this algorithm fails.
   */
  public void NearestPoints(gp_Pnt P1, gp_Pnt P2) {
    OCCwrapJavaJNI.GeomAPI_ExtremaCurveCurve_NearestPoints(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Returns the parameters U1 of the point on the first
   *  curve and U2 of the point on the second curve, which
   *  are the ends of the shortest extremum computed by this algorithm.
   *  Exceptions StdFail_NotDone if this algorithm fails.
   */
  public void LowerDistanceParameters(double[] U1, double[] U2) {
    OCCwrapJavaJNI.GeomAPI_ExtremaCurveCurve_LowerDistanceParameters(swigCPtr, this, U1, U2);
  }

  /**
   *  Computes the distance between the end points of the
   *  shortest extremum computed by this algorithm.
   *  Exceptions StdFail_NotDone if this algorithm fails.
   */
  public double LowerDistance() {
    return OCCwrapJavaJNI.GeomAPI_ExtremaCurveCurve_LowerDistance(swigCPtr, this);
  }

  /**
   *  set  in  <P1>  and <P2> the couple solution points
   *  such a the distance [P1,P2] is the minimum. taking  in  account
   *  extremity  points  of  curves.
   */
  public long TotalNearestPoints(gp_Pnt P1, gp_Pnt P2) {
    return OCCwrapJavaJNI.GeomAPI_ExtremaCurveCurve_TotalNearestPoints(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  set  in <U1> and <U2> the parameters of the couple
   *  solution   points  which  represents  the  total  nearest
   *  solution.
   */
  public long TotalLowerDistanceParameters(double[] U1, double[] U2) {
    return OCCwrapJavaJNI.GeomAPI_ExtremaCurveCurve_TotalLowerDistanceParameters(swigCPtr, this, U1, U2);
  }

  /**
   *  return the distance of the total  nearest couple solution
   *  point.
   *  if <myExtCC> is not done
   */
  public double TotalLowerDistance() {
    return OCCwrapJavaJNI.GeomAPI_ExtremaCurveCurve_TotalLowerDistance(swigCPtr, this);
  }

}
