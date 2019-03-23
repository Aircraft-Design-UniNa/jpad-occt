package opencascade;

/**
 *  Definition of an interserction point between a
 *  curve and a surface.
 */
public class IntCurveSurface_IntersectionPoint {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntCurveSurface_IntersectionPoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntCurveSurface_IntersectionPoint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntCurveSurface_IntersectionPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (IntCurveSurface_IntersectionPoint ptr) { Ptr = ptr; }
    public IntCurveSurface_IntersectionPoint AsReference () { return Ptr; }
    public IntCurveSurface_IntersectionPoint AsCopy () { return Ptr.MakeCopy(); }
    public IntCurveSurface_IntersectionPoint Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntCurveSurface_IntersectionPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty Constructor.
   */
  public IntCurveSurface_IntersectionPoint() {
    this(OCCwrapJavaJNI.new_IntCurveSurface_IntersectionPoint__SWIG_0(), true);
  }

  /**
   *  Create an IntersectionPoint.
   */
  public IntCurveSurface_IntersectionPoint( gp_Pnt  P, double USurf, double VSurf, double UCurv, IntCurveSurface_TransitionOnCurve TrCurv) {
    this(OCCwrapJavaJNI.new_IntCurveSurface_IntersectionPoint__SWIG_1(gp_Pnt.getCPtr(P), P, USurf, VSurf, UCurv, TrCurv.swigValue()), true);
  }

  /**
   *  Set the fields of the current IntersectionPoint.
   */
  public void SetValues( gp_Pnt  P, double USurf, double VSurf, double UCurv, IntCurveSurface_TransitionOnCurve TrCurv) {
    OCCwrapJavaJNI.IntCurveSurface_IntersectionPoint_SetValues(swigCPtr, this, gp_Pnt.getCPtr(P), P, USurf, VSurf, UCurv, TrCurv.swigValue());
  }

  /**
   *  Get the fields of the current IntersectionPoint.
   */
  public void Values(gp_Pnt P, double[] USurf, double[] VSurf, double[] UCurv, int[] TrCurv) {
    OCCwrapJavaJNI.IntCurveSurface_IntersectionPoint_Values(swigCPtr, this, gp_Pnt.getCPtr(P), P, USurf, VSurf, UCurv, TrCurv);
  }

  /**
   *  returns the geometric point.
   */
  public  gp_Pnt  Pnt() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.IntCurveSurface_IntersectionPoint_Pnt(swigCPtr, this), true);
    return ret;
  }

  /**
   *  returns the U parameter on the surface.
   */
  public double U() {
    return OCCwrapJavaJNI.IntCurveSurface_IntersectionPoint_U(swigCPtr, this);
  }

  /**
   *  returns the V parameter on the surface.
   */
  public double V() {
    return OCCwrapJavaJNI.IntCurveSurface_IntersectionPoint_V(swigCPtr, this);
  }

  /**
   *  returns the parameter on the curve.
   */
  public double W() {
    return OCCwrapJavaJNI.IntCurveSurface_IntersectionPoint_W(swigCPtr, this);
  }

  /**
   *  returns the Transition of the point.
   */
  public IntCurveSurface_TransitionOnCurve Transition() {
    return IntCurveSurface_TransitionOnCurve.swigToEnum(OCCwrapJavaJNI.IntCurveSurface_IntersectionPoint_Transition(swigCPtr, this));
  }

  /**
   *  Dump all the fields.
   */
  public void Dump() {
    OCCwrapJavaJNI.IntCurveSurface_IntersectionPoint_Dump(swigCPtr, this);
  }

}
