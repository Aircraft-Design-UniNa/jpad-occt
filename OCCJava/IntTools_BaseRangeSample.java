package opencascade;

/**
 *  base class for range index management
 */
public class IntTools_BaseRangeSample {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntTools_BaseRangeSample(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntTools_BaseRangeSample(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntTools_BaseRangeSample obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntTools_BaseRangeSample(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntTools_BaseRangeSample() {
    this(OCCwrapJavaJNI.new_IntTools_BaseRangeSample__SWIG_0(), true);
  }

  public IntTools_BaseRangeSample(int theDepth) {
    this(OCCwrapJavaJNI.new_IntTools_BaseRangeSample__SWIG_1(theDepth), true);
  }

  public void SetDepth(int theDepth) {
    OCCwrapJavaJNI.IntTools_BaseRangeSample_SetDepth(swigCPtr, this, theDepth);
  }

  public int GetDepth() {
    return OCCwrapJavaJNI.IntTools_BaseRangeSample_GetDepth(swigCPtr, this);
  }

}
