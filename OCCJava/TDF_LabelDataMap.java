package opencascade;

public class TDF_LabelDataMap {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_LabelDataMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_LabelDataMap(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_LabelDataMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_LabelDataMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDF_LabelDataMap() {
    this(OCCwrapJavaJNI.new_TDF_LabelDataMap__SWIG_0(), true);
  }

  public TDF_LabelDataMap(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TDF_LabelDataMap__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TDF_LabelDataMap(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_TDF_LabelDataMap__SWIG_2(theNbBuckets), true);
  }

  public TDF_LabelDataMap( TDF_LabelDataMap  theOther) {
    this(OCCwrapJavaJNI.new_TDF_LabelDataMap__SWIG_3(TDF_LabelDataMap.getCPtr(theOther), theOther), true);
  }

  public void Exchange( TDF_LabelDataMap  theOther) {
    OCCwrapJavaJNI.TDF_LabelDataMap_Exchange(swigCPtr, this, TDF_LabelDataMap.getCPtr(theOther), theOther);
  }

  public  TDF_LabelDataMap  Assign( TDF_LabelDataMap  theOther) {
    TDF_LabelDataMap ret = new TDF_LabelDataMap(OCCwrapJavaJNI.TDF_LabelDataMap_Assign(swigCPtr, this, TDF_LabelDataMap.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int N) {
    OCCwrapJavaJNI.TDF_LabelDataMap_ReSize(swigCPtr, this, N);
  }

  public long Bind( TDF_Label  theKey,  TDF_Label  theItem) {
    return OCCwrapJavaJNI.TDF_LabelDataMap_Bind(swigCPtr, this, TDF_Label.getCPtr(theKey), theKey, TDF_Label.getCPtr(theItem), theItem);
  }

  public long IsBound( TDF_Label  theKey) {
    return OCCwrapJavaJNI.TDF_LabelDataMap_IsBound(swigCPtr, this, TDF_Label.getCPtr(theKey), theKey);
  }

  public long UnBind( TDF_Label  theKey) {
    return OCCwrapJavaJNI.TDF_LabelDataMap_UnBind(swigCPtr, this, TDF_Label.getCPtr(theKey), theKey);
  }

  public  TDF_Label  Find( TDF_Label  theKey) {
    TDF_Label ret = new TDF_Label(OCCwrapJavaJNI.TDF_LabelDataMap_Find__SWIG_0(swigCPtr, this, TDF_Label.getCPtr(theKey), theKey), true);
    return ret;
  }

  public long Find( TDF_Label  theKey, TDF_Label theValue) {
    return OCCwrapJavaJNI.TDF_LabelDataMap_Find__SWIG_1(swigCPtr, this, TDF_Label.getCPtr(theKey), theKey, TDF_Label.getCPtr(theValue), theValue);
  }

  public TDF_Label ChangeFind( TDF_Label  theKey) {
    TDF_Label ret = new TDF_Label(OCCwrapJavaJNI.TDF_LabelDataMap_ChangeFind(swigCPtr, this, TDF_Label.getCPtr(theKey), theKey), false, this);
    return ret; //new TDF_Label.CRef (ret);
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.TDF_LabelDataMap_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.TDF_LabelDataMap_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TDF_LabelDataMap_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.TDF_LabelDataMap_Size(swigCPtr, this);
  }

}
