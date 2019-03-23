package opencascade;

public class TDF_AttributeDataMap {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_AttributeDataMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_AttributeDataMap(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_AttributeDataMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_AttributeDataMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDF_AttributeDataMap() {
    this(OCCwrapJavaJNI.new_TDF_AttributeDataMap__SWIG_0(), true);
  }

  public TDF_AttributeDataMap(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TDF_AttributeDataMap__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TDF_AttributeDataMap(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_TDF_AttributeDataMap__SWIG_2(theNbBuckets), true);
  }

  public TDF_AttributeDataMap( TDF_AttributeDataMap  theOther) {
    this(OCCwrapJavaJNI.new_TDF_AttributeDataMap__SWIG_3(TDF_AttributeDataMap.getCPtr(theOther), theOther), true);
  }

  public void Exchange( TDF_AttributeDataMap  theOther) {
    OCCwrapJavaJNI.TDF_AttributeDataMap_Exchange(swigCPtr, this, TDF_AttributeDataMap.getCPtr(theOther), theOther);
  }

  public  TDF_AttributeDataMap  Assign( TDF_AttributeDataMap  theOther) {
    TDF_AttributeDataMap ret = new TDF_AttributeDataMap(OCCwrapJavaJNI.TDF_AttributeDataMap_Assign(swigCPtr, this, TDF_AttributeDataMap.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int N) {
    OCCwrapJavaJNI.TDF_AttributeDataMap_ReSize(swigCPtr, this, N);
  }

  public long Bind( TDF_Attribute  theKey,  TDF_Attribute  theItem) {
    return OCCwrapJavaJNI.TDF_AttributeDataMap_Bind(swigCPtr, this,  TDF_Attribute.getCPtr(theKey) , theKey,  TDF_Attribute.getCPtr(theItem) , theItem);
  }

  public long IsBound( TDF_Attribute  theKey) {
    return OCCwrapJavaJNI.TDF_AttributeDataMap_IsBound(swigCPtr, this,  TDF_Attribute.getCPtr(theKey) , theKey);
  }

  public long UnBind( TDF_Attribute  theKey) {
    return OCCwrapJavaJNI.TDF_AttributeDataMap_UnBind(swigCPtr, this,  TDF_Attribute.getCPtr(theKey) , theKey);
  }

  public  TDF_Attribute  Find( TDF_Attribute  theKey) {
    return new TDF_Attribute ( OCCwrapJavaJNI.TDF_AttributeDataMap_Find__SWIG_0(swigCPtr, this,  TDF_Attribute.getCPtr(theKey) , theKey), true );
  }

  public long Find( TDF_Attribute  theKey,  TDF_Attribute  theValue) {
    return OCCwrapJavaJNI.TDF_AttributeDataMap_Find__SWIG_1(swigCPtr, this,  TDF_Attribute.getCPtr(theKey) , theKey,  TDF_Attribute.getCPtr(theValue) , theValue);
  }

  public  TDF_Attribute  ChangeFind( TDF_Attribute  theKey) {
    return new TDF_Attribute ( OCCwrapJavaJNI.TDF_AttributeDataMap_ChangeFind(swigCPtr, this,  TDF_Attribute.getCPtr(theKey) , theKey), true );
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.TDF_AttributeDataMap_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.TDF_AttributeDataMap_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TDF_AttributeDataMap_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.TDF_AttributeDataMap_Size(swigCPtr, this);
  }

}
