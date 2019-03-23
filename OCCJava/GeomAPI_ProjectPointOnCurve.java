package opencascade;

/**
 *  This class implements methods for  computing all the orthogonal
 *  projections of a 3D point onto a  3D curve.
 */
public class GeomAPI_ProjectPointOnCurve {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomAPI_ProjectPointOnCurve(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomAPI_ProjectPointOnCurve(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomAPI_ProjectPointOnCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomAPI_ProjectPointOnCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an empty object. Use an
   *  Init function for further initialization.
   */
  public GeomAPI_ProjectPointOnCurve() {
    this(OCCwrapJavaJNI.new_GeomAPI_ProjectPointOnCurve__SWIG_0(), true);
  }

  /**
   *  Create the projection  of a  point  <P> on a curve
   *  <Curve>
   */
  public GeomAPI_ProjectPointOnCurve( gp_Pnt  P,  Geom_Curve  Curve) {
    this(OCCwrapJavaJNI.new_GeomAPI_ProjectPointOnCurve__SWIG_1(gp_Pnt.getCPtr(P), P,  Geom_Curve.getCPtr(Curve) , Curve), true);
  }

  /**
   *  Create  the projection  of a point <P>  on a curve
   *  <Curve> limited by the two points of parameter Umin and Usup.
   */
  public GeomAPI_ProjectPointOnCurve( gp_Pnt  P,  Geom_Curve  Curve, double Umin, double Usup) {
    this(OCCwrapJavaJNI.new_GeomAPI_ProjectPointOnCurve__SWIG_2(gp_Pnt.getCPtr(P), P,  Geom_Curve.getCPtr(Curve) , Curve, Umin, Usup), true);
  }

  /**
   *  Init the projection  of a  point  <P> on a curve
   *  <Curve>
   */
  public void Init( gp_Pnt  P,  Geom_Curve  Curve) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnCurve_Init__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P,  Geom_Curve.getCPtr(Curve) , Curve);
  }

  /**
   *  Init  the  projection  of a  point <P>  on a curve
   *  <Curve> limited by the two points of parameter Umin and Usup.
   */
  public void Init( gp_Pnt  P,  Geom_Curve  Curve, double Umin, double Usup) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnCurve_Init__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P), P,  Geom_Curve.getCPtr(Curve) , Curve, Umin, Usup);
  }

  /**
   *  Init  the  projection  of a  point <P>  on a curve
   *  <Curve> limited by the two points of parameter Umin and Usup.
   */
  public void Init( Geom_Curve  Curve, double Umin, double Usup) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnCurve_Init__SWIG_2(swigCPtr, this,  Geom_Curve.getCPtr(Curve) , Curve, Umin, Usup);
  }

  /**
   *  Performs the projection of a point on the current curve.
   */
  public void Perform( gp_Pnt  P) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnCurve_Perform(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Returns the number of computed
   *  orthogonal projection points.
   *  Note: if this algorithm fails, NbPoints returns 0.
   */
  public int NbPoints() {
    return OCCwrapJavaJNI.GeomAPI_ProjectPointOnCurve_NbPoints(swigCPtr, this);
  }

  /**
   *  Returns the orthogonal projection
   *  on the curve. Index is a number of a computed point.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [ 1,NbPoints ], where
   *  NbPoints is the number of solution points.
   */
  public gp_Pnt Point(int Index) {
    return new gp_Pnt(OCCwrapJavaJNI.GeomAPI_ProjectPointOnCurve_Point(swigCPtr, this, Index), true);
  }

  /**
   *  Returns the parameter on the curve
   *  of the point, which is the orthogonal projection. Index is a
   *  number of a computed point.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [ 1,NbPoints ], where
   *  NbPoints is the number of solution points.
   */
  public double Parameter(int Index) {
    return OCCwrapJavaJNI.GeomAPI_ProjectPointOnCurve_Parameter__SWIG_0(swigCPtr, this, Index);
  }

  /**
   *  Returns the parameter on the curve
   *  of the point, which is the orthogonal projection. Index is a
   *  number of a computed point.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [ 1,NbPoints ], where
   *  NbPoints is the number of solution points.-
   */
  public void Parameter(int Index, double[] U) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnCurve_Parameter__SWIG_1(swigCPtr, this, Index, U);
  }

  /**
   *  Computes the distance between the
   *  point and its orthogonal projection on the curve. Index is a number of a computed point.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [ 1,NbPoints ], where
   *  NbPoints is the number of solution points.
   */
  public double Distance(int Index) {
    return OCCwrapJavaJNI.GeomAPI_ProjectPointOnCurve_Distance(swigCPtr, this, Index);
  }

  /**
   *  Returns the nearest orthogonal
   *  projection of the point on the curve.
   *  Exceptions: StdFail_NotDone if this algorithm fails.
   */
  public gp_Pnt NearestPoint() {
    return new gp_Pnt(OCCwrapJavaJNI.GeomAPI_ProjectPointOnCurve_NearestPoint(swigCPtr, this), true);
  }

  /**
   *  Returns the parameter on the curve
   *  of the nearest orthogonal projection of the point.
   *  Exceptions: StdFail_NotDone if this algorithm fails.
   */
  public double LowerDistanceParameter() {
    return OCCwrapJavaJNI.GeomAPI_ProjectPointOnCurve_LowerDistanceParameter(swigCPtr, this);
  }

  /**
   *  Computes the distance between the
   *  point and its nearest orthogonal projection on the curve.
   *  Exceptions: StdFail_NotDone if this algorithm fails.
   */
  public double LowerDistance() {
    return OCCwrapJavaJNI.GeomAPI_ProjectPointOnCurve_LowerDistance(swigCPtr, this);
  }

}
