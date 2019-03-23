package opencascade;

/**
 *  This class implements methods for
 *  computing intersection points and  segments between a
 */
public class GeomAPI_IntCS {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomAPI_IntCS(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomAPI_IntCS(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomAPI_IntCS obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomAPI_IntCS(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an empty object. Use the
   *  function Perform for further initialization of the algorithm by
   *  the curve and the surface.
   */
  public GeomAPI_IntCS() {
    this(OCCwrapJavaJNI.new_GeomAPI_IntCS__SWIG_0(), true);
  }

  /**
   *  Computes the intersections between
   *  the curve C and the surface S.
   *  Warning
   *  Use function IsDone to verify that the intersections are computed successfully.
   */
  public GeomAPI_IntCS( Geom_Curve  C,  Geom_Surface  S) {
    this(OCCwrapJavaJNI.new_GeomAPI_IntCS__SWIG_1( Geom_Curve.getCPtr(C) , C,  Geom_Surface.getCPtr(S) , S), true);
  }

  /**
   *  This function Initializes an algorithm with the curve C and the
   *  surface S and computes the intersections between C and S.
   *  Warning
   *  Use function IsDone to verify that the intersections are computed successfully.
   */
  public void Perform( Geom_Curve  C,  Geom_Surface  S) {
    OCCwrapJavaJNI.GeomAPI_IntCS_Perform(swigCPtr, this,  Geom_Curve.getCPtr(C) , C,  Geom_Surface.getCPtr(S) , S);
  }

  /**
   *  Returns true if the intersections are successfully computed.
   */
  public long IsDone() {
    return OCCwrapJavaJNI.GeomAPI_IntCS_IsDone(swigCPtr, this);
  }

  /**
   *  Returns the number of Intersection Points
   *  if IsDone returns True.
   *  else NotDone is raised.
   */
  public int NbPoints() {
    return OCCwrapJavaJNI.GeomAPI_IntCS_NbPoints(swigCPtr, this);
  }

  /**
   *  Returns the Intersection Point of range <Index>in case of cross intersection.
   *  Raises NotDone if the computation has failed or if
   *  the computation has not been done
   *  raises OutOfRange if Index is not in the range <1..NbPoints>
   */
  public  gp_Pnt  Point(int Index) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.GeomAPI_IntCS_Point(swigCPtr, this, Index), true);
    return ret;
  }

  /**
   *  Returns parameter W on the curve
   *  and (parameters U,V) on the surface of the computed intersection point
   *  of index Index in case of cross intersection.
   *  Exceptions
   *  StdFail_NotDone if intersection algorithm fails or is not initialized.
   *  Standard_OutOfRange if Index is not in the range [ 1,NbPoints ], where
   *  NbPoints is the number of computed intersection points.
   */
  public void Parameters(int Index, double[] U, double[] V, double[] W) {
    OCCwrapJavaJNI.GeomAPI_IntCS_Parameters__SWIG_0(swigCPtr, this, Index, U, V, W);
  }

  /**
   *  Returns the number of computed
   *  intersection segments in case of tangential intersection.
   *  Exceptions
   *  StdFail_NotDone if the intersection algorithm fails or is not initialized.
   */
  public int NbSegments() {
    return OCCwrapJavaJNI.GeomAPI_IntCS_NbSegments(swigCPtr, this);
  }

  public  Geom_Curve  Segment(int Index) {
    return new Geom_Curve ( OCCwrapJavaJNI.GeomAPI_IntCS_Segment(swigCPtr, this, Index), true );
  }

  /**
   *  Returns the parameters of the first (U1,V1) and the last (U2,V2) points
   *  of curve's segment on the surface in case of tangential intersection.
   *  Index is the number of computed intersection segments.
   *  Exceptions
   *  StdFail_NotDone if intersection algorithm fails or is not initialized.
   *  Standard_OutOfRange if Index is not in the range [ 1,NbSegments ],
   *  where NbSegments is the number of computed intersection segments.
   */
  public void Parameters(int Index, double[] U1, double[] V1, double[] U2, double[] V2) {
    OCCwrapJavaJNI.GeomAPI_IntCS_Parameters__SWIG_1(swigCPtr, this, Index, U1, V1, U2, V2);
  }

}
