package opencascade;

/**
 *  A IntersectionSegment describes a segment of curve
 *  (w1,w2) where distance(C(w),Surface) is less than a
 *  given tolerances.
 */
public class IntCurveSurface_IntersectionSegment {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntCurveSurface_IntersectionSegment(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntCurveSurface_IntersectionSegment(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntCurveSurface_IntersectionSegment obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (IntCurveSurface_IntersectionSegment ptr) { Ptr = ptr; }
    public IntCurveSurface_IntersectionSegment AsReference () { return Ptr; }
    public IntCurveSurface_IntersectionSegment AsCopy () { return Ptr.MakeCopy(); }
    public IntCurveSurface_IntersectionSegment Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntCurveSurface_IntersectionSegment(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntCurveSurface_IntersectionSegment() {
    this(OCCwrapJavaJNI.new_IntCurveSurface_IntersectionSegment__SWIG_0(), true);
  }

  public IntCurveSurface_IntersectionSegment( IntCurveSurface_IntersectionPoint  P1,  IntCurveSurface_IntersectionPoint  P2) {
    this(OCCwrapJavaJNI.new_IntCurveSurface_IntersectionSegment__SWIG_1(IntCurveSurface_IntersectionPoint.getCPtr(P1), P1, IntCurveSurface_IntersectionPoint.getCPtr(P2), P2), true);
  }

  public void SetValues( IntCurveSurface_IntersectionPoint  P1,  IntCurveSurface_IntersectionPoint  P2) {
    OCCwrapJavaJNI.IntCurveSurface_IntersectionSegment_SetValues(swigCPtr, this, IntCurveSurface_IntersectionPoint.getCPtr(P1), P1, IntCurveSurface_IntersectionPoint.getCPtr(P2), P2);
  }

  public void Values(IntCurveSurface_IntersectionPoint P1, IntCurveSurface_IntersectionPoint P2) {
    OCCwrapJavaJNI.IntCurveSurface_IntersectionSegment_Values(swigCPtr, this, IntCurveSurface_IntersectionPoint.getCPtr(P1), P1, IntCurveSurface_IntersectionPoint.getCPtr(P2), P2);
  }

  public void FirstPoint(IntCurveSurface_IntersectionPoint P1) {
    OCCwrapJavaJNI.IntCurveSurface_IntersectionSegment_FirstPoint__SWIG_0(swigCPtr, this, IntCurveSurface_IntersectionPoint.getCPtr(P1), P1);
  }

  public void SecondPoint(IntCurveSurface_IntersectionPoint P2) {
    OCCwrapJavaJNI.IntCurveSurface_IntersectionSegment_SecondPoint__SWIG_0(swigCPtr, this, IntCurveSurface_IntersectionPoint.getCPtr(P2), P2);
  }

  public  IntCurveSurface_IntersectionPoint  FirstPoint() {
    IntCurveSurface_IntersectionPoint ret = new IntCurveSurface_IntersectionPoint(OCCwrapJavaJNI.IntCurveSurface_IntersectionSegment_FirstPoint__SWIG_1(swigCPtr, this), true);
    return ret;
  }

  public  IntCurveSurface_IntersectionPoint  SecondPoint() {
    IntCurveSurface_IntersectionPoint ret = new IntCurveSurface_IntersectionPoint(OCCwrapJavaJNI.IntCurveSurface_IntersectionSegment_SecondPoint__SWIG_1(swigCPtr, this), true);
    return ret;
  }

  public void Dump() {
    OCCwrapJavaJNI.IntCurveSurface_IntersectionSegment_Dump(swigCPtr, this);
  }

}
