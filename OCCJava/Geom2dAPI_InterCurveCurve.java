package opencascade;

/**
 *  This class implements methods for computing
 *  -       the intersections between  two 2D curves,
 *  -       the self-intersections of a  2D curve.
 *  Using the InterCurveCurve algorithm allows to get the following results:
 *  -      intersection points in the  case of cross intersections,
 *  -      intersection segments in the case of tangential intersections,
 *  -       nothing in the case of no intersections.
 */
public class Geom2dAPI_InterCurveCurve {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Geom2dAPI_InterCurveCurve(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Geom2dAPI_InterCurveCurve(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Geom2dAPI_InterCurveCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Geom2dAPI_InterCurveCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Create an empty intersector. Use the
   *  function Init for further initialization of the intersection
   *  algorithm by curves or curve.
   */
  public Geom2dAPI_InterCurveCurve() {
    this(OCCwrapJavaJNI.new_Geom2dAPI_InterCurveCurve__SWIG_0(), true);
  }

  /**
   *  Creates an object and computes the
   *  intersections between the curves C1 and C2.
   */
  public Geom2dAPI_InterCurveCurve( Geom2d_Curve  C1,  Geom2d_Curve  C2, double Tol) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_InterCurveCurve__SWIG_1( Geom2d_Curve.getCPtr(C1) , C1,  Geom2d_Curve.getCPtr(C2) , C2, Tol), true);
  }

  /**
   *  Creates an object and computes self-intersections of the curve C1.
   *  Tolerance value Tol, defaulted to 1.0e-6, defines the precision of
   *  computing the intersection points.
   *  In case of a tangential intersection, Tol also defines the
   *  size of intersection segments (limited portions of the curves)
   *  where the distance between all points from two curves (or a curve
   *  in case of self-intersection) is less than Tol.
   *  Warning
   *  Use functions NbPoints and NbSegments to obtain the number of
   *  solutions. If the algorithm finds no intersections NbPoints and
   *  NbSegments return 0.
   */
  public Geom2dAPI_InterCurveCurve( Geom2d_Curve  C1,  Geom2d_Curve  C2) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_InterCurveCurve__SWIG_2( Geom2d_Curve.getCPtr(C1) , C1,  Geom2d_Curve.getCPtr(C2) , C2), true);
  }

  public Geom2dAPI_InterCurveCurve( Geom2d_Curve  C1, double Tol) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_InterCurveCurve__SWIG_3( Geom2d_Curve.getCPtr(C1) , C1, Tol), true);
  }

  public Geom2dAPI_InterCurveCurve( Geom2d_Curve  C1) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_InterCurveCurve__SWIG_4( Geom2d_Curve.getCPtr(C1) , C1), true);
  }

  /**
   *  Initializes an algorithm with the
   *  given arguments and computes the intersections between the curves C1. and C2.
   */
  public void Init( Geom2d_Curve  C1,  Geom2d_Curve  C2, double Tol) {
    OCCwrapJavaJNI.Geom2dAPI_InterCurveCurve_Init__SWIG_0(swigCPtr, this,  Geom2d_Curve.getCPtr(C1) , C1,  Geom2d_Curve.getCPtr(C2) , C2, Tol);
  }

  /**
   *  Initializes an algorithm with the
   *  given arguments and computes the self-intersections of the curve C1.
   *  Tolerance value Tol, defaulted to 1.0e-6, defines the precision of
   *  computing the intersection points. In case of a tangential
   *  intersection, Tol also defines the size of intersection segments
   *  (limited portions of the curves) where the distance between all
   *  points from two curves (or a curve in case of self-intersection) is less than Tol.
   *  Warning
   *  Use functions NbPoints and NbSegments to obtain the number
   *  of solutions. If the algorithm finds no intersections NbPoints
   *  and NbSegments return 0.
   */
  public void Init( Geom2d_Curve  C1,  Geom2d_Curve  C2) {
    OCCwrapJavaJNI.Geom2dAPI_InterCurveCurve_Init__SWIG_1(swigCPtr, this,  Geom2d_Curve.getCPtr(C1) , C1,  Geom2d_Curve.getCPtr(C2) , C2);
  }

  public void Init( Geom2d_Curve  C1, double Tol) {
    OCCwrapJavaJNI.Geom2dAPI_InterCurveCurve_Init__SWIG_2(swigCPtr, this,  Geom2d_Curve.getCPtr(C1) , C1, Tol);
  }

  public void Init( Geom2d_Curve  C1) {
    OCCwrapJavaJNI.Geom2dAPI_InterCurveCurve_Init__SWIG_3(swigCPtr, this,  Geom2d_Curve.getCPtr(C1) , C1);
  }

  /**
   *  Returns the number of intersection-points in case of cross intersections.
   *  NbPoints returns 0 if no intersections were found.
   */
  public int NbPoints() {
    return OCCwrapJavaJNI.Geom2dAPI_InterCurveCurve_NbPoints(swigCPtr, this);
  }

  /**
   *  Returns the intersection point of index Index.
   *  Intersection points are computed in case of cross intersections with a
   *  precision equal to the tolerance value assigned at the time of
   *  construction or in the function Init (this value is defaulted to 1.0e-6).
   *  Exceptions
   *  Standard_OutOfRange if index is not in the range [ 1,NbPoints ], where
   *  NbPoints is the number of computed intersection points
   */
  public gp_Pnt2d Point(int Index) {
    return new gp_Pnt2d(OCCwrapJavaJNI.Geom2dAPI_InterCurveCurve_Point(swigCPtr, this, Index), true);
  }

  /**
   *  Returns the number of tangential intersections.
   *  NbSegments returns 0 if no intersections were found
   */
  public int NbSegments() {
    return OCCwrapJavaJNI.Geom2dAPI_InterCurveCurve_NbSegments(swigCPtr, this);
  }

  /**
   *  Use this syntax only to get
   *  solutions of tangential intersection between two curves.
   *  Output values Curve1 and Curve2 are the intersection segments on the
   *  first curve and on the second curve accordingly. Parameter Index
   *  defines a number of computed solution.
   *  An intersection segment is a portion of an initial curve limited
   *  by two points. The distance from each point of this segment to the
   *  other curve is less or equal to the tolerance value assigned at the
   *  time of construction or in function Init (this value is defaulted to 1.0e-6).
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [ 1,NbSegments ],
   *  where NbSegments is the number of computed tangential intersections.
   *  Standard_NullObject if the algorithm is initialized for the
   *  computing of self-intersections on a curve.
   */
  public void Segment(int Index,  Geom2d_Curve  Curve1,  Geom2d_Curve  Curve2) {
    OCCwrapJavaJNI.Geom2dAPI_InterCurveCurve_Segment(swigCPtr, this, Index,  Geom2d_Curve.getCPtr(Curve1) , Curve1,  Geom2d_Curve.getCPtr(Curve2) , Curve2);
  }

}
