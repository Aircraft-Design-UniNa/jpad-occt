package opencascade;

public class TDF_LabelMap {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_LabelMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_LabelMap(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_LabelMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_LabelMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDF_LabelMap() {
    this(OCCwrapJavaJNI.new_TDF_LabelMap__SWIG_0(), true);
  }

  public TDF_LabelMap(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TDF_LabelMap__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TDF_LabelMap(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_TDF_LabelMap__SWIG_2(theNbBuckets), true);
  }

  public TDF_LabelMap( TDF_LabelMap  theOther) {
    this(OCCwrapJavaJNI.new_TDF_LabelMap__SWIG_3(TDF_LabelMap.getCPtr(theOther), theOther), true);
  }

  public void Exchange( TDF_LabelMap  theOther) {
    OCCwrapJavaJNI.TDF_LabelMap_Exchange(swigCPtr, this, TDF_LabelMap.getCPtr(theOther), theOther);
  }

  public  TDF_LabelMap  Assign( TDF_LabelMap  theOther) {
    TDF_LabelMap ret = new TDF_LabelMap(OCCwrapJavaJNI.TDF_LabelMap_Assign(swigCPtr, this, TDF_LabelMap.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int N) {
    OCCwrapJavaJNI.TDF_LabelMap_ReSize(swigCPtr, this, N);
  }

  public long Add( TDF_Label  K) {
    return OCCwrapJavaJNI.TDF_LabelMap_Add(swigCPtr, this, TDF_Label.getCPtr(K), K);
  }

  public  TDF_Label  Added( TDF_Label  K) {
    TDF_Label ret = new TDF_Label(OCCwrapJavaJNI.TDF_LabelMap_Added(swigCPtr, this, TDF_Label.getCPtr(K), K), true);
    return ret;
  }

  public long Contains( TDF_Label  K) {
    return OCCwrapJavaJNI.TDF_LabelMap_Contains__SWIG_0(swigCPtr, this, TDF_Label.getCPtr(K), K);
  }

  public long Remove( TDF_Label  K) {
    return OCCwrapJavaJNI.TDF_LabelMap_Remove(swigCPtr, this, TDF_Label.getCPtr(K), K);
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.TDF_LabelMap_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.TDF_LabelMap_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TDF_LabelMap_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.TDF_LabelMap_Size(swigCPtr, this);
  }

  public long IsEqual( TDF_LabelMap  theOther) {
    return OCCwrapJavaJNI.TDF_LabelMap_IsEqual(swigCPtr, this, TDF_LabelMap.getCPtr(theOther), theOther);
  }

  public long Contains( TDF_LabelMap  theOther) {
    return OCCwrapJavaJNI.TDF_LabelMap_Contains__SWIG_1(swigCPtr, this, TDF_LabelMap.getCPtr(theOther), theOther);
  }

  public void Union( TDF_LabelMap  theLeft,  TDF_LabelMap  theRight) {
    OCCwrapJavaJNI.TDF_LabelMap_Union(swigCPtr, this, TDF_LabelMap.getCPtr(theLeft), theLeft, TDF_LabelMap.getCPtr(theRight), theRight);
  }

  public long Unite( TDF_LabelMap  theOther) {
    return OCCwrapJavaJNI.TDF_LabelMap_Unite(swigCPtr, this, TDF_LabelMap.getCPtr(theOther), theOther);
  }

  public long HasIntersection( TDF_LabelMap  theMap) {
    return OCCwrapJavaJNI.TDF_LabelMap_HasIntersection(swigCPtr, this, TDF_LabelMap.getCPtr(theMap), theMap);
  }

  public void Intersection( TDF_LabelMap  theLeft,  TDF_LabelMap  theRight) {
    OCCwrapJavaJNI.TDF_LabelMap_Intersection(swigCPtr, this, TDF_LabelMap.getCPtr(theLeft), theLeft, TDF_LabelMap.getCPtr(theRight), theRight);
  }

  public long Intersect( TDF_LabelMap  theOther) {
    return OCCwrapJavaJNI.TDF_LabelMap_Intersect(swigCPtr, this, TDF_LabelMap.getCPtr(theOther), theOther);
  }

  public void Subtraction( TDF_LabelMap  theLeft,  TDF_LabelMap  theRight) {
    OCCwrapJavaJNI.TDF_LabelMap_Subtraction(swigCPtr, this, TDF_LabelMap.getCPtr(theLeft), theLeft, TDF_LabelMap.getCPtr(theRight), theRight);
  }

  public long Subtract( TDF_LabelMap  theOther) {
    return OCCwrapJavaJNI.TDF_LabelMap_Subtract(swigCPtr, this, TDF_LabelMap.getCPtr(theOther), theOther);
  }

  public void Difference( TDF_LabelMap  theLeft,  TDF_LabelMap  theRight) {
    OCCwrapJavaJNI.TDF_LabelMap_Difference(swigCPtr, this, TDF_LabelMap.getCPtr(theLeft), theLeft, TDF_LabelMap.getCPtr(theRight), theRight);
  }

  public long Differ( TDF_LabelMap  theOther) {
    return OCCwrapJavaJNI.TDF_LabelMap_Differ(swigCPtr, this, TDF_LabelMap.getCPtr(theOther), theOther);
  }

}
