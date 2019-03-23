package opencascade;

/**
 *  Describes functions for computing all the extrema
 *  between two 2D curves.
 *  An ExtremaCurveCurve algorithm minimizes or
 *  maximizes the distance between a point on the first
 *  curve and a point on the second curve. Thus, it
 *  computes the start point and end point of
 *  perpendiculars common to the two curves (an
 *  intersection point is not an extremum except where
 *  the two curves are tangential at this point).
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
public class Geom2dAPI_ExtremaCurveCurve {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Geom2dAPI_ExtremaCurveCurve(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Geom2dAPI_ExtremaCurveCurve(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Geom2dAPI_ExtremaCurveCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Geom2dAPI_ExtremaCurveCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Computes the extrema between
   *  -   the portion of the curve C1 limited by the two
   *  points of parameter (U1min,U1max), and
   *  -   the portion of the curve C2 limited by the two
   *  points of parameter (U2min,U2max).
   *  Warning
   *  Use the function NbExtrema to obtain the number
   *  of solutions. If this algorithm fails, NbExtrema returns 0.
   */
  public Geom2dAPI_ExtremaCurveCurve( Geom2d_Curve  C1,  Geom2d_Curve  C2, double U1min, double U1max, double U2min, double U2max) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_ExtremaCurveCurve( Geom2d_Curve.getCPtr(C1) , C1,  Geom2d_Curve.getCPtr(C2) , C2, U1min, U1max, U2min, U2max), true);
  }

  /**
   *  Returns the number of extrema computed by this algorithm.
   *  Note: if this algorithm fails, NbExtrema returns 0.
   */
  public int NbExtrema() {
    return OCCwrapJavaJNI.Geom2dAPI_ExtremaCurveCurve_NbExtrema(swigCPtr, this);
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
  public void Points(int Index, gp_Pnt2d P1, gp_Pnt2d P2) {
    OCCwrapJavaJNI.Geom2dAPI_ExtremaCurveCurve_Points(swigCPtr, this, Index, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2);
  }

  /**
   *  Returns the parameters U1 of the point on the first
   *  curve and U2 of the point on the second curve, which
   *  are the ends of the extremum of index Index
   *  computed by this algorithm.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [
   *  1,NbExtrema ], where NbExtrema is the
   *  number of extrema computed by this algorithm.
   */
  public void Parameters(int Index, double[] U1, double[] U2) {
    OCCwrapJavaJNI.Geom2dAPI_ExtremaCurveCurve_Parameters(swigCPtr, this, Index, U1, U2);
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
    return OCCwrapJavaJNI.Geom2dAPI_ExtremaCurveCurve_Distance(swigCPtr, this, Index);
  }

  /**
   *  Returns the points P1 on the first curve and P2 on
   *  the second curve, which are the ends of the shortest
   *  extremum computed by this algorithm.
   *  Exceptions StdFail_NotDone if this algorithm fails.
   */
  public void NearestPoints(gp_Pnt2d P1, gp_Pnt2d P2) {
    OCCwrapJavaJNI.Geom2dAPI_ExtremaCurveCurve_NearestPoints(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2);
  }

  /**
   *  Returns the parameters U1 of the point on the first
   *  curve and U2 of the point on the second curve, which
   *  are the ends of the shortest extremum computed by this algorithm.
   *  Exceptions
   *  StdFail_NotDone if this algorithm fails.
   */
  public void LowerDistanceParameters(double[] U1, double[] U2) {
    OCCwrapJavaJNI.Geom2dAPI_ExtremaCurveCurve_LowerDistanceParameters(swigCPtr, this, U1, U2);
  }

  /**
   *  Computes the distance between the end points of the
   *  shortest extremum computed by this algorithm.
   *  Exceptions - StdFail_NotDone if this algorithm fails.
   */
  public double LowerDistance() {
    return OCCwrapJavaJNI.Geom2dAPI_ExtremaCurveCurve_LowerDistance(swigCPtr, this);
  }

}
