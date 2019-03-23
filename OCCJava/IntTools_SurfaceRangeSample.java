package opencascade;

/**
 *  class for range index management of surface
 */
public class IntTools_SurfaceRangeSample {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntTools_SurfaceRangeSample(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntTools_SurfaceRangeSample(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntTools_SurfaceRangeSample obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntTools_SurfaceRangeSample(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntTools_SurfaceRangeSample() {
    this(OCCwrapJavaJNI.new_IntTools_SurfaceRangeSample__SWIG_0(), true);
  }

  public IntTools_SurfaceRangeSample(int theIndexU, int theDepthU, int theIndexV, int theDepthV) {
    this(OCCwrapJavaJNI.new_IntTools_SurfaceRangeSample__SWIG_1(theIndexU, theDepthU, theIndexV, theDepthV), true);
  }

  public IntTools_SurfaceRangeSample( IntTools_CurveRangeSample  theRangeU,  IntTools_CurveRangeSample  theRangeV) {
    this(OCCwrapJavaJNI.new_IntTools_SurfaceRangeSample__SWIG_2(IntTools_CurveRangeSample.getCPtr(theRangeU), theRangeU, IntTools_CurveRangeSample.getCPtr(theRangeV), theRangeV), true);
  }

  public IntTools_SurfaceRangeSample( IntTools_SurfaceRangeSample  Other) {
    this(OCCwrapJavaJNI.new_IntTools_SurfaceRangeSample__SWIG_3(IntTools_SurfaceRangeSample.getCPtr(Other), Other), true);
  }

  public  IntTools_SurfaceRangeSample  Assign( IntTools_SurfaceRangeSample  Other) {
    IntTools_SurfaceRangeSample ret = new IntTools_SurfaceRangeSample(OCCwrapJavaJNI.IntTools_SurfaceRangeSample_Assign(swigCPtr, this, IntTools_SurfaceRangeSample.getCPtr(Other), Other), false, this);
    return ret;
  }

  public void SetRanges( IntTools_CurveRangeSample  theRangeU,  IntTools_CurveRangeSample  theRangeV) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeSample_SetRanges(swigCPtr, this, IntTools_CurveRangeSample.getCPtr(theRangeU), theRangeU, IntTools_CurveRangeSample.getCPtr(theRangeV), theRangeV);
  }

  public void GetRanges( IntTools_CurveRangeSample  theRangeU,  IntTools_CurveRangeSample  theRangeV) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeSample_GetRanges(swigCPtr, this, IntTools_CurveRangeSample.getCPtr(theRangeU), theRangeU, IntTools_CurveRangeSample.getCPtr(theRangeV), theRangeV);
  }

  public void SetIndexes(int theIndexU, int theIndexV) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeSample_SetIndexes(swigCPtr, this, theIndexU, theIndexV);
  }

  public void GetIndexes(int[] theIndexU, int[] theIndexV) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeSample_GetIndexes(swigCPtr, this, theIndexU, theIndexV);
  }

  public void GetDepths(int[] theDepthU, int[] theDepthV) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeSample_GetDepths(swigCPtr, this, theDepthU, theDepthV);
  }

  public void SetSampleRangeU( IntTools_CurveRangeSample  theRangeSampleU) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeSample_SetSampleRangeU(swigCPtr, this, IntTools_CurveRangeSample.getCPtr(theRangeSampleU), theRangeSampleU);
  }

  public  IntTools_CurveRangeSample  GetSampleRangeU() {
    IntTools_CurveRangeSample ret = new IntTools_CurveRangeSample(OCCwrapJavaJNI.IntTools_SurfaceRangeSample_GetSampleRangeU(swigCPtr, this), false, this);
    return ret;
  }

  public void SetSampleRangeV( IntTools_CurveRangeSample  theRangeSampleV) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeSample_SetSampleRangeV(swigCPtr, this, IntTools_CurveRangeSample.getCPtr(theRangeSampleV), theRangeSampleV);
  }

  public  IntTools_CurveRangeSample  GetSampleRangeV() {
    IntTools_CurveRangeSample ret = new IntTools_CurveRangeSample(OCCwrapJavaJNI.IntTools_SurfaceRangeSample_GetSampleRangeV(swigCPtr, this), false, this);
    return ret;
  }

  public void SetIndexU(int theIndexU) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeSample_SetIndexU(swigCPtr, this, theIndexU);
  }

  public int GetIndexU() {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeSample_GetIndexU(swigCPtr, this);
  }

  public void SetIndexV(int theIndexV) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeSample_SetIndexV(swigCPtr, this, theIndexV);
  }

  public int GetIndexV() {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeSample_GetIndexV(swigCPtr, this);
  }

  public void SetDepthU(int theDepthU) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeSample_SetDepthU(swigCPtr, this, theDepthU);
  }

  public int GetDepthU() {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeSample_GetDepthU(swigCPtr, this);
  }

  public void SetDepthV(int theDepthV) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeSample_SetDepthV(swigCPtr, this, theDepthV);
  }

  public int GetDepthV() {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeSample_GetDepthV(swigCPtr, this);
  }

  public IntTools_Range GetRangeU(double theFirstU, double theLastU, int theNbSampleU) {
    return new IntTools_Range(OCCwrapJavaJNI.IntTools_SurfaceRangeSample_GetRangeU(swigCPtr, this, theFirstU, theLastU, theNbSampleU), true);
  }

  public IntTools_Range GetRangeV(double theFirstV, double theLastV, int theNbSampleV) {
    return new IntTools_Range(OCCwrapJavaJNI.IntTools_SurfaceRangeSample_GetRangeV(swigCPtr, this, theFirstV, theLastV, theNbSampleV), true);
  }

  public long IsEqual( IntTools_SurfaceRangeSample  Other) {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeSample_IsEqual(swigCPtr, this, IntTools_SurfaceRangeSample.getCPtr(Other), Other);
  }

  public int GetRangeIndexUDeeper(int theNbSampleU) {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeSample_GetRangeIndexUDeeper(swigCPtr, this, theNbSampleU);
  }

  public int GetRangeIndexVDeeper(int theNbSampleV) {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeSample_GetRangeIndexVDeeper(swigCPtr, this, theNbSampleV);
  }

}
