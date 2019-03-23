package opencascade;

/**
 *  This class implements methods for computing all the orthogonal
 *  projections of a 2D point onto a 2D curve.
 */
public class Geom2dAPI_ProjectPointOnCurve {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Geom2dAPI_ProjectPointOnCurve(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Geom2dAPI_ProjectPointOnCurve(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Geom2dAPI_ProjectPointOnCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Geom2dAPI_ProjectPointOnCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs an empty projector algorithm. Use an Init
   *  function to define the point and the curve on which it is going to work.
   */
  public Geom2dAPI_ProjectPointOnCurve() {
    this(OCCwrapJavaJNI.new_Geom2dAPI_ProjectPointOnCurve__SWIG_0(), true);
  }

  /**
   *  Create the projection  of a  point  <P> on a curve
   *  <Curve>
   */
  public Geom2dAPI_ProjectPointOnCurve( gp_Pnt2d  P,  Geom2d_Curve  Curve) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_ProjectPointOnCurve__SWIG_1(gp_Pnt2d.getCPtr(P), P,  Geom2d_Curve.getCPtr(Curve) , Curve), true);
  }

  /**
   *  Create  the projection  of a point <P>  on a curve
   *  <Curve> limited by the two   points of parameter Umin and Usup.
   *  Warning
   *  Use the function NbPoints to obtain the number of solutions. If
   *  projection fails, NbPoints returns 0.
   */
  public Geom2dAPI_ProjectPointOnCurve( gp_Pnt2d  P,  Geom2d_Curve  Curve, double Umin, double Usup) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_ProjectPointOnCurve__SWIG_2(gp_Pnt2d.getCPtr(P), P,  Geom2d_Curve.getCPtr(Curve) , Curve, Umin, Usup), true);
  }

  /**
   *  Initializes this algorithm with the given arguments, and
   *  computes the orthogonal  projections  of a  point  <P> on a curve <Curve>
   */
  public void Init( gp_Pnt2d  P,  Geom2d_Curve  Curve) {
    OCCwrapJavaJNI.Geom2dAPI_ProjectPointOnCurve_Init__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P,  Geom2d_Curve.getCPtr(Curve) , Curve);
  }

  /**
   *  Initializes this algorithm with the given arguments, and
   *  computes the orthogonal projections of the point P onto the portion
   *  of the curve Curve limited by the two points of parameter Umin and Usup.
   */
  public void Init( gp_Pnt2d  P,  Geom2d_Curve  Curve, double Umin, double Usup) {
    OCCwrapJavaJNI.Geom2dAPI_ProjectPointOnCurve_Init__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P), P,  Geom2d_Curve.getCPtr(Curve) , Curve, Umin, Usup);
  }

  /**
   *  return the number of of computed
   *  orthogonal projectionn points.
   */
  public int NbPoints() {
    return OCCwrapJavaJNI.Geom2dAPI_ProjectPointOnCurve_NbPoints(swigCPtr, this);
  }

  /**
   *  Returns the orthogonal projection
   *  on the curve. Index is a number of a computed point.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [ 1,NbPoints ], where
   *  NbPoints is the number of solution points.
   */
  public gp_Pnt2d Point(int Index) {
    return new gp_Pnt2d(OCCwrapJavaJNI.Geom2dAPI_ProjectPointOnCurve_Point(swigCPtr, this, Index), true);
  }

  /**
   *  Returns the parameter on the curve
   *  of a point which is the orthogonal projection. Index is a number of a
   *  computed projected point.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [ 1,NbPoints ], where
   *  NbPoints is the number of solution points.
   */
  public double Parameter(int Index) {
    return OCCwrapJavaJNI.Geom2dAPI_ProjectPointOnCurve_Parameter__SWIG_0(swigCPtr, this, Index);
  }

  /**
   *  Returns the parameter on the curve
   *  of a point which is the orthogonal projection. Index is a number of a
   *  computed projected point.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [ 1,NbPoints ], where
   *  NbPoints is the number of solution points
   */
  public void Parameter(int Index, double[] U) {
    OCCwrapJavaJNI.Geom2dAPI_ProjectPointOnCurve_Parameter__SWIG_1(swigCPtr, this, Index, U);
  }

  /**
   *  Computes the distance between the
   *  point and its computed orthogonal projection on the curve. Index is a
   *  number of computed projected point.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [ 1,NbPoints ], where
   *  NbPoints is the number of solution points.
   */
  public double Distance(int Index) {
    return OCCwrapJavaJNI.Geom2dAPI_ProjectPointOnCurve_Distance(swigCPtr, this, Index);
  }

  /**
   *  Returns the nearest orthogonal projection of the point on the curve.
   *  Exceptions
   *  StdFail_NotDone if this algorithm fails.
   */
  public gp_Pnt2d NearestPoint() {
    return new gp_Pnt2d(OCCwrapJavaJNI.Geom2dAPI_ProjectPointOnCurve_NearestPoint(swigCPtr, this), true);
  }

  /**
   *  Returns the parameter on the curve
   *  of the nearest orthogonal projection of the point.
   *  Exceptions
   *  StdFail_NotDone if this algorithm fails.
   */
  public double LowerDistanceParameter() {
    return OCCwrapJavaJNI.Geom2dAPI_ProjectPointOnCurve_LowerDistanceParameter(swigCPtr, this);
  }

  /**
   *  Computes the distance between the
   *  point and its nearest orthogonal projection on the curve.
   *  Exceptions
   *  StdFail_NotDone if this algorithm fails.
   */
  public double LowerDistance() {
    return OCCwrapJavaJNI.Geom2dAPI_ProjectPointOnCurve_LowerDistance(swigCPtr, this);
  }

}
