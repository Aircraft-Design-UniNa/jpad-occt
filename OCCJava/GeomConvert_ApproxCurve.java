package opencascade;

/**
 *  A framework to convert a 3D curve to a 3D BSpline.
 *  This is done by approximation to a BSpline curve within a given tolerance.
 */
public class GeomConvert_ApproxCurve {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomConvert_ApproxCurve(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomConvert_ApproxCurve(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomConvert_ApproxCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomConvert_ApproxCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs a curve approximation framework defined by -
   *  -      the conic Curve,
   *  -      the tolerance value Tol3d,
   *  -      the degree of continuity Order,
   *  -      the maximum number of segments
   *  MaxSegments allowed in the resulting BSpline curve, and
   *  -      the highest degree MaxDeg which the
   *  polynomial defining the BSpline curve may have.
   */
  public GeomConvert_ApproxCurve( Geom_Curve  Curve, double Tol3d, GeomAbs_Shape Order, int MaxSegments, int MaxDegree) {
    this(OCCwrapJavaJNI.new_GeomConvert_ApproxCurve__SWIG_0( Geom_Curve.getCPtr(Curve) , Curve, Tol3d, Order.swigValue(), MaxSegments, MaxDegree), true);
  }

  /**
   *  Constructs a curve approximation framework defined by -
   *  -      the Curve,
   *  -      the tolerance value Tol3d,
   *  -      the degree of continuity Order,
   *  -      the maximum number of segments
   *  MaxSegments allowed in the resulting BSpline curve, and
   *  -      the highest degree MaxDeg which the
   *  polynomial defining the BSpline curve may have.
   */
  public GeomConvert_ApproxCurve( Adaptor3d_HCurve  Curve, double Tol3d, GeomAbs_Shape Order, int MaxSegments, int MaxDegree) {
    this(OCCwrapJavaJNI.new_GeomConvert_ApproxCurve__SWIG_1( Adaptor3d_HCurve.getCPtr(Curve) , Curve, Tol3d, Order.swigValue(), MaxSegments, MaxDegree), true);
  }

  public  Geom_BSplineCurve  Curve() {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.GeomConvert_ApproxCurve_Curve(swigCPtr, this), true );
  }

  /**
   *  returns  Standard_True  if  the  approximation  has
   *  been  done  within  requiered tolerance
   */
  public long IsDone() {
    return OCCwrapJavaJNI.GeomConvert_ApproxCurve_IsDone(swigCPtr, this);
  }

  /**
   *  Returns  Standard_True if the approximation did come out
   *  with a result that  is not NECESSARELY within the required tolerance
   */
  public long HasResult() {
    return OCCwrapJavaJNI.GeomConvert_ApproxCurve_HasResult(swigCPtr, this);
  }

  /**
   *  Returns the greatest distance between a point on the
   *  source conic and the BSpline curve resulting from the
   *  approximation. (>0 when an approximation
   *  has  been  done, 0  if  no  approximation)
   */
  public double MaxError() {
    return OCCwrapJavaJNI.GeomConvert_ApproxCurve_MaxError(swigCPtr, this);
  }

  /**
   *  Print on the stream  o  information about the object
   */
  public void Dump(SWIGTYPE_p_Standard_OStream o) {
    OCCwrapJavaJNI.GeomConvert_ApproxCurve_Dump(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(o));
  }

}
