package opencascade;

/**
 *  This class implements methods for  computing all the orthogonal
 *  projections of a point onto a  surface.
 */
public class GeomAPI_ProjectPointOnSurf {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomAPI_ProjectPointOnSurf(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomAPI_ProjectPointOnSurf(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomAPI_ProjectPointOnSurf obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomAPI_ProjectPointOnSurf(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an empty object. Use the
   *  Init function for further initialization.
   */
  public GeomAPI_ProjectPointOnSurf() {
    this(OCCwrapJavaJNI.new_GeomAPI_ProjectPointOnSurf__SWIG_0(), true);
  }

  /**
   *  Create the projection  of a point <P> on a surface
   *  <Surface>
   */
  public GeomAPI_ProjectPointOnSurf( gp_Pnt  P,  Geom_Surface  Surface, Extrema_ExtAlgo Algo) {
    this(OCCwrapJavaJNI.new_GeomAPI_ProjectPointOnSurf__SWIG_1(gp_Pnt.getCPtr(P), P,  Geom_Surface.getCPtr(Surface) , Surface, Algo.swigValue()), true);
  }

  /**
   *  Create the projection  of a point <P> on a surface
   *  <Surface>
   *  Create the projection of a point <P>  on a surface
   *  <Surface>. The solution are computed in the domain
   *  [Umin,Usup] [Vmin,Vsup] of the surface.
   */
  public GeomAPI_ProjectPointOnSurf( gp_Pnt  P,  Geom_Surface  Surface) {
    this(OCCwrapJavaJNI.new_GeomAPI_ProjectPointOnSurf__SWIG_2(gp_Pnt.getCPtr(P), P,  Geom_Surface.getCPtr(Surface) , Surface), true);
  }

  public GeomAPI_ProjectPointOnSurf( gp_Pnt  P,  Geom_Surface  Surface, double Tolerance, Extrema_ExtAlgo Algo) {
    this(OCCwrapJavaJNI.new_GeomAPI_ProjectPointOnSurf__SWIG_3(gp_Pnt.getCPtr(P), P,  Geom_Surface.getCPtr(Surface) , Surface, Tolerance, Algo.swigValue()), true);
  }

  /**
   *  Init the projection  of a point <P> on a surface
   *  <Surface>
   */
  public GeomAPI_ProjectPointOnSurf( gp_Pnt  P,  Geom_Surface  Surface, double Tolerance) {
    this(OCCwrapJavaJNI.new_GeomAPI_ProjectPointOnSurf__SWIG_4(gp_Pnt.getCPtr(P), P,  Geom_Surface.getCPtr(Surface) , Surface, Tolerance), true);
  }

  public GeomAPI_ProjectPointOnSurf( gp_Pnt  P,  Geom_Surface  Surface, double Umin, double Usup, double Vmin, double Vsup, double Tolerance, Extrema_ExtAlgo Algo) {
    this(OCCwrapJavaJNI.new_GeomAPI_ProjectPointOnSurf__SWIG_5(gp_Pnt.getCPtr(P), P,  Geom_Surface.getCPtr(Surface) , Surface, Umin, Usup, Vmin, Vsup, Tolerance, Algo.swigValue()), true);
  }

  public GeomAPI_ProjectPointOnSurf( gp_Pnt  P,  Geom_Surface  Surface, double Umin, double Usup, double Vmin, double Vsup, double Tolerance) {
    this(OCCwrapJavaJNI.new_GeomAPI_ProjectPointOnSurf__SWIG_6(gp_Pnt.getCPtr(P), P,  Geom_Surface.getCPtr(Surface) , Surface, Umin, Usup, Vmin, Vsup, Tolerance), true);
  }

  public GeomAPI_ProjectPointOnSurf( gp_Pnt  P,  Geom_Surface  Surface, double Umin, double Usup, double Vmin, double Vsup, Extrema_ExtAlgo Algo) {
    this(OCCwrapJavaJNI.new_GeomAPI_ProjectPointOnSurf__SWIG_7(gp_Pnt.getCPtr(P), P,  Geom_Surface.getCPtr(Surface) , Surface, Umin, Usup, Vmin, Vsup, Algo.swigValue()), true);
  }

  public GeomAPI_ProjectPointOnSurf( gp_Pnt  P,  Geom_Surface  Surface, double Umin, double Usup, double Vmin, double Vsup) {
    this(OCCwrapJavaJNI.new_GeomAPI_ProjectPointOnSurf__SWIG_8(gp_Pnt.getCPtr(P), P,  Geom_Surface.getCPtr(Surface) , Surface, Umin, Usup, Vmin, Vsup), true);
  }

  public void Init( gp_Pnt  P,  Geom_Surface  Surface, double Tolerance, Extrema_ExtAlgo Algo) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_Init__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P,  Geom_Surface.getCPtr(Surface) , Surface, Tolerance, Algo.swigValue());
  }

  /**
   *  Init the projection of a point <P>  on a surface
   *  <Surface>. The solution are computed in the domain
   *  [Umin,Usup] [Vmin,Vsup] of the surface.
   */
  public void Init( gp_Pnt  P,  Geom_Surface  Surface, double Tolerance) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_Init__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P), P,  Geom_Surface.getCPtr(Surface) , Surface, Tolerance);
  }

  public void Init( gp_Pnt  P,  Geom_Surface  Surface, Extrema_ExtAlgo Algo) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_Init__SWIG_2(swigCPtr, this, gp_Pnt.getCPtr(P), P,  Geom_Surface.getCPtr(Surface) , Surface, Algo.swigValue());
  }

  /**
   *  Init the projection for many points on a surface
   *  <Surface>. The solutions will be computed in the domain
   *  [Umin,Usup] [Vmin,Vsup] of the surface.
   */
  public void Init( gp_Pnt  P,  Geom_Surface  Surface) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_Init__SWIG_3(swigCPtr, this, gp_Pnt.getCPtr(P), P,  Geom_Surface.getCPtr(Surface) , Surface);
  }

  public void Init( gp_Pnt  P,  Geom_Surface  Surface, double Umin, double Usup, double Vmin, double Vsup, double Tolerance, Extrema_ExtAlgo Algo) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_Init__SWIG_4(swigCPtr, this, gp_Pnt.getCPtr(P), P,  Geom_Surface.getCPtr(Surface) , Surface, Umin, Usup, Vmin, Vsup, Tolerance, Algo.swigValue());
  }

  public void Init( gp_Pnt  P,  Geom_Surface  Surface, double Umin, double Usup, double Vmin, double Vsup, double Tolerance) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_Init__SWIG_5(swigCPtr, this, gp_Pnt.getCPtr(P), P,  Geom_Surface.getCPtr(Surface) , Surface, Umin, Usup, Vmin, Vsup, Tolerance);
  }

  public void Init( gp_Pnt  P,  Geom_Surface  Surface, double Umin, double Usup, double Vmin, double Vsup, Extrema_ExtAlgo Algo) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_Init__SWIG_6(swigCPtr, this, gp_Pnt.getCPtr(P), P,  Geom_Surface.getCPtr(Surface) , Surface, Umin, Usup, Vmin, Vsup, Algo.swigValue());
  }

  public void Init( gp_Pnt  P,  Geom_Surface  Surface, double Umin, double Usup, double Vmin, double Vsup) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_Init__SWIG_7(swigCPtr, this, gp_Pnt.getCPtr(P), P,  Geom_Surface.getCPtr(Surface) , Surface, Umin, Usup, Vmin, Vsup);
  }

  public void Init( Geom_Surface  Surface, double Umin, double Usup, double Vmin, double Vsup, double Tolerance, Extrema_ExtAlgo Algo) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_Init__SWIG_8(swigCPtr, this,  Geom_Surface.getCPtr(Surface) , Surface, Umin, Usup, Vmin, Vsup, Tolerance, Algo.swigValue());
  }

  public void Init( Geom_Surface  Surface, double Umin, double Usup, double Vmin, double Vsup, double Tolerance) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_Init__SWIG_9(swigCPtr, this,  Geom_Surface.getCPtr(Surface) , Surface, Umin, Usup, Vmin, Vsup, Tolerance);
  }

  public void Init( Geom_Surface  Surface, double Umin, double Usup, double Vmin, double Vsup, Extrema_ExtAlgo Algo) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_Init__SWIG_10(swigCPtr, this,  Geom_Surface.getCPtr(Surface) , Surface, Umin, Usup, Vmin, Vsup, Algo.swigValue());
  }

  public void Init( Geom_Surface  Surface, double Umin, double Usup, double Vmin, double Vsup) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_Init__SWIG_11(swigCPtr, this,  Geom_Surface.getCPtr(Surface) , Surface, Umin, Usup, Vmin, Vsup);
  }

  /**
   *  Sets the Extrema search algorithm - Grad or Tree. 
   *  By default the Extrema is initialized with Grad algorithm.
   */
  public void SetExtremaAlgo(Extrema_ExtAlgo theAlgo) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_SetExtremaAlgo(swigCPtr, this, theAlgo.swigValue());
  }

  /**
   *  Sets the Extrema search flag - MIN or MAX or MINMAX.
   *  By default the Extrema is set to search the MinMax solutions.
   */
  public void SetExtremaFlag(Extrema_ExtFlag theExtFlag) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_SetExtremaFlag(swigCPtr, this, theExtFlag.swigValue());
  }

  /**
   *  Performs the projection of a point on the current surface.
   */
  public void Perform( gp_Pnt  P) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_Perform(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  public long IsDone() {
    return OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_IsDone(swigCPtr, this);
  }

  /**
   *  Returns the number of computed orthogonal projection points.
   *  Note: if projection fails, NbPoints returns 0.
   */
  public int NbPoints() {
    return OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_NbPoints(swigCPtr, this);
  }

  /**
   *  Returns the orthogonal projection
   *  on the surface. Index is a number of a computed point.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [ 1,NbPoints ], where
   *  NbPoints is the number of solution points.
   */
  public gp_Pnt Point(int Index) {
    return new gp_Pnt(OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_Point(swigCPtr, this, Index), true);
  }

  /**
   *  Returns the parameters (U,V) on the
   *  surface of the orthogonal projection. Index is a number of a
   *  computed point.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [ 1,NbPoints ], where
   *  NbPoints is the number of solution points.
   */
  public void Parameters(int Index, double[] U, double[] V) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_Parameters(swigCPtr, this, Index, U, V);
  }

  /**
   *  Computes the distance between the
   *  point and its orthogonal projection on the surface. Index is a number
   *  of a computed point.
   *  Exceptions
   *  Standard_OutOfRange if Index is not in the range [ 1,NbPoints ], where
   *  NbPoints is the number of solution points.
   */
  public double Distance(int Index) {
    return OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_Distance(swigCPtr, this, Index);
  }

  /**
   *  Returns the nearest orthogonal projection of the point
   *  on the surface.
   *  Exceptions
   *  StdFail_NotDone if projection fails.
   */
  public gp_Pnt NearestPoint() {
    return new gp_Pnt(OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_NearestPoint(swigCPtr, this), true);
  }

  /**
   *  Returns the parameters (U,V) on the
   *  surface of the nearest computed orthogonal projection of the point.
   *  Exceptions
   *  StdFail_NotDone if projection fails.
   */
  public void LowerDistanceParameters(double[] U, double[] V) {
    OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_LowerDistanceParameters(swigCPtr, this, U, V);
  }

  /**
   *  Computes the distance between the
   *  point and its nearest orthogonal projection on the surface.
   *  Exceptions
   *  StdFail_NotDone if projection fails.
   */
  public double LowerDistance() {
    return OCCwrapJavaJNI.GeomAPI_ProjectPointOnSurf_LowerDistance(swigCPtr, this);
  }

}
