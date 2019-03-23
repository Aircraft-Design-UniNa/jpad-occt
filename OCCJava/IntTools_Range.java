package opencascade;

/**
 *  The class describes the  1-d range
 *  [myFirst, myLast].
 */
public class IntTools_Range {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntTools_Range(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntTools_Range(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntTools_Range obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntTools_Range(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor
   */
  public IntTools_Range() {
    this(OCCwrapJavaJNI.new_IntTools_Range__SWIG_0(), true);
  }

  /**
   *  Initialize me by range boundaries
   */
  public IntTools_Range(double aFirst, double aLast) {
    this(OCCwrapJavaJNI.new_IntTools_Range__SWIG_1(aFirst, aLast), true);
  }

  /**
   *  Modifier
   */
  public void SetFirst(double aFirst) {
    OCCwrapJavaJNI.IntTools_Range_SetFirst(swigCPtr, this, aFirst);
  }

  /**
   *  Modifier
   */
  public void SetLast(double aLast) {
    OCCwrapJavaJNI.IntTools_Range_SetLast(swigCPtr, this, aLast);
  }

  /**
   *  Selector
   */
  public double First() {
    return OCCwrapJavaJNI.IntTools_Range_First(swigCPtr, this);
  }

  /**
   *  Selector
   */
  public double Last() {
    return OCCwrapJavaJNI.IntTools_Range_Last(swigCPtr, this);
  }

  /**
   *  Selector
   */
  public void Range(double[] aFirst, double[] aLast) {
    OCCwrapJavaJNI.IntTools_Range_Range(swigCPtr, this, aFirst, aLast);
  }

}
