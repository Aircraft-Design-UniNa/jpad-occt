package opencascade;

/**
 *  class for range index management of curve
 */
public class IntTools_CurveRangeSample extends IntTools_BaseRangeSample {

  private long swigCPtr;
  IntTools_CurveRangeSample(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.IntTools_CurveRangeSample_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  IntTools_CurveRangeSample(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.IntTools_CurveRangeSample_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(IntTools_CurveRangeSample obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntTools_CurveRangeSample(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IntTools_CurveRangeSample() {
    this(OCCwrapJavaJNI.new_IntTools_CurveRangeSample__SWIG_0(), true);
  }

  public IntTools_CurveRangeSample(int theIndex) {
    this(OCCwrapJavaJNI.new_IntTools_CurveRangeSample__SWIG_1(theIndex), true);
  }

  public void SetRangeIndex(int theIndex) {
    OCCwrapJavaJNI.IntTools_CurveRangeSample_SetRangeIndex(swigCPtr, this, theIndex);
  }

  public int GetRangeIndex() {
    return OCCwrapJavaJNI.IntTools_CurveRangeSample_GetRangeIndex(swigCPtr, this);
  }

  public long IsEqual( IntTools_CurveRangeSample  Other) {
    return OCCwrapJavaJNI.IntTools_CurveRangeSample_IsEqual(swigCPtr, this, IntTools_CurveRangeSample.getCPtr(Other), Other);
  }

  public IntTools_Range GetRange(double theFirst, double theLast, int theNbSample) {
    return new IntTools_Range(OCCwrapJavaJNI.IntTools_CurveRangeSample_GetRange(swigCPtr, this, theFirst, theLast, theNbSample), true);
  }

  public int GetRangeIndexDeeper(int theNbSample) {
    return OCCwrapJavaJNI.IntTools_CurveRangeSample_GetRangeIndexDeeper(swigCPtr, this, theNbSample);
  }

}
