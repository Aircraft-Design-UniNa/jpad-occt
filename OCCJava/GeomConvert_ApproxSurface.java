package opencascade;

/**
 *  A framework to convert a surface to a BSpline
 *  surface. This is done by approximation to a BSpline
 *  surface within a given tolerance.
 */
public class GeomConvert_ApproxSurface {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomConvert_ApproxSurface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomConvert_ApproxSurface(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomConvert_ApproxSurface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomConvert_ApproxSurface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs a surface approximation framework defined by
   *  -   the conic Surf
   *  -   the tolerance value Tol3d
   *  -   the degree of continuity UContinuity, VContinuity
   *  in the directions of the U and V parameters
   *  -   the highest degree MaxDegU, MaxDegV which
   *  the polynomial defining the BSpline curve may
   *  have in the directions of the U and V parameters
   *  -   the maximum number of segments MaxSegments
   *  allowed in the resulting BSpline curve
   *  -   the index of precision PrecisCode.
   */
  public GeomConvert_ApproxSurface( Geom_Surface  Surf, double Tol3d, GeomAbs_Shape UContinuity, GeomAbs_Shape VContinuity, int MaxDegU, int MaxDegV, int MaxSegments, int PrecisCode) {
    this(OCCwrapJavaJNI.new_GeomConvert_ApproxSurface__SWIG_0( Geom_Surface.getCPtr(Surf) , Surf, Tol3d, UContinuity.swigValue(), VContinuity.swigValue(), MaxDegU, MaxDegV, MaxSegments, PrecisCode), true);
  }

  /**
   *  Constructs a surface approximation framework defined by
   *  -   the Surf
   *  -   the tolerance value Tol3d
   *  -   the degree of continuity UContinuity, VContinuity
   *  in the directions of the U and V parameters
   *  -   the highest degree MaxDegU, MaxDegV which
   *  the polynomial defining the BSpline curve may
   *  have in the directions of the U and V parameters
   *  -   the maximum number of segments MaxSegments
   *  allowed in the resulting BSpline curve
   *  -   the index of precision PrecisCode.
   */
  public GeomConvert_ApproxSurface( Adaptor3d_HSurface  Surf, double Tol3d, GeomAbs_Shape UContinuity, GeomAbs_Shape VContinuity, int MaxDegU, int MaxDegV, int MaxSegments, int PrecisCode) {
    this(OCCwrapJavaJNI.new_GeomConvert_ApproxSurface__SWIG_1( Adaptor3d_HSurface.getCPtr(Surf) , Surf, Tol3d, UContinuity.swigValue(), VContinuity.swigValue(), MaxDegU, MaxDegV, MaxSegments, PrecisCode), true);
  }

  public  Geom_BSplineSurface  Surface() {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.GeomConvert_ApproxSurface_Surface(swigCPtr, this), true );
  }

  /**
   *  Returns Standard_True if the approximation has be done
   */
  public long IsDone() {
    return OCCwrapJavaJNI.GeomConvert_ApproxSurface_IsDone(swigCPtr, this);
  }

  /**
   *  Returns true if the approximation did come out with a result that
   *  is not NECESSARILY within the required tolerance or a result
   *  that is not recognized with the wished continuities.
   */
  public long HasResult() {
    return OCCwrapJavaJNI.GeomConvert_ApproxSurface_HasResult(swigCPtr, this);
  }

  /**
   *  Returns the greatest distance between a point on the
   *  source conic surface and the BSpline surface
   *  resulting from the approximation (>0 when an approximation
   *  has been done, 0 if no  approximation )
   */
  public double MaxError() {
    return OCCwrapJavaJNI.GeomConvert_ApproxSurface_MaxError(swigCPtr, this);
  }

  /**
   *  Prints on the stream o informations on the current state of the object.
   */
  public void Dump(SWIGTYPE_p_Standard_OStream o) {
    OCCwrapJavaJNI.GeomConvert_ApproxSurface_Dump(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(o));
  }

}
