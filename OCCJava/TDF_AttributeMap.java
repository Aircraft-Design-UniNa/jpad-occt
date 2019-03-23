package opencascade;

public class TDF_AttributeMap {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_AttributeMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_AttributeMap(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_AttributeMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_AttributeMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDF_AttributeMap() {
    this(OCCwrapJavaJNI.new_TDF_AttributeMap__SWIG_0(), true);
  }

  public TDF_AttributeMap(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TDF_AttributeMap__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TDF_AttributeMap(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_TDF_AttributeMap__SWIG_2(theNbBuckets), true);
  }

  public TDF_AttributeMap( TDF_AttributeMap  theOther) {
    this(OCCwrapJavaJNI.new_TDF_AttributeMap__SWIG_3(TDF_AttributeMap.getCPtr(theOther), theOther), true);
  }

  public void Exchange( TDF_AttributeMap  theOther) {
    OCCwrapJavaJNI.TDF_AttributeMap_Exchange(swigCPtr, this, TDF_AttributeMap.getCPtr(theOther), theOther);
  }

  public  TDF_AttributeMap  Assign( TDF_AttributeMap  theOther) {
    TDF_AttributeMap ret = new TDF_AttributeMap(OCCwrapJavaJNI.TDF_AttributeMap_Assign(swigCPtr, this, TDF_AttributeMap.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int N) {
    OCCwrapJavaJNI.TDF_AttributeMap_ReSize(swigCPtr, this, N);
  }

  public long Add( TDF_Attribute  K) {
    return OCCwrapJavaJNI.TDF_AttributeMap_Add(swigCPtr, this,  TDF_Attribute.getCPtr(K) , K);
  }

  public  TDF_Attribute  Added( TDF_Attribute  K) {
    return new TDF_Attribute ( OCCwrapJavaJNI.TDF_AttributeMap_Added(swigCPtr, this,  TDF_Attribute.getCPtr(K) , K), true );
  }

  public long Contains( TDF_Attribute  K) {
    return OCCwrapJavaJNI.TDF_AttributeMap_Contains__SWIG_0(swigCPtr, this,  TDF_Attribute.getCPtr(K) , K);
  }

  public long Remove( TDF_Attribute  K) {
    return OCCwrapJavaJNI.TDF_AttributeMap_Remove(swigCPtr, this,  TDF_Attribute.getCPtr(K) , K);
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.TDF_AttributeMap_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.TDF_AttributeMap_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TDF_AttributeMap_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.TDF_AttributeMap_Size(swigCPtr, this);
  }

  public long IsEqual( TDF_AttributeMap  theOther) {
    return OCCwrapJavaJNI.TDF_AttributeMap_IsEqual(swigCPtr, this, TDF_AttributeMap.getCPtr(theOther), theOther);
  }

  public long Contains( TDF_AttributeMap  theOther) {
    return OCCwrapJavaJNI.TDF_AttributeMap_Contains__SWIG_1(swigCPtr, this, TDF_AttributeMap.getCPtr(theOther), theOther);
  }

  public void Union( TDF_AttributeMap  theLeft,  TDF_AttributeMap  theRight) {
    OCCwrapJavaJNI.TDF_AttributeMap_Union(swigCPtr, this, TDF_AttributeMap.getCPtr(theLeft), theLeft, TDF_AttributeMap.getCPtr(theRight), theRight);
  }

  public long Unite( TDF_AttributeMap  theOther) {
    return OCCwrapJavaJNI.TDF_AttributeMap_Unite(swigCPtr, this, TDF_AttributeMap.getCPtr(theOther), theOther);
  }

  public long HasIntersection( TDF_AttributeMap  theMap) {
    return OCCwrapJavaJNI.TDF_AttributeMap_HasIntersection(swigCPtr, this, TDF_AttributeMap.getCPtr(theMap), theMap);
  }

  public void Intersection( TDF_AttributeMap  theLeft,  TDF_AttributeMap  theRight) {
    OCCwrapJavaJNI.TDF_AttributeMap_Intersection(swigCPtr, this, TDF_AttributeMap.getCPtr(theLeft), theLeft, TDF_AttributeMap.getCPtr(theRight), theRight);
  }

  public long Intersect( TDF_AttributeMap  theOther) {
    return OCCwrapJavaJNI.TDF_AttributeMap_Intersect(swigCPtr, this, TDF_AttributeMap.getCPtr(theOther), theOther);
  }

  public void Subtraction( TDF_AttributeMap  theLeft,  TDF_AttributeMap  theRight) {
    OCCwrapJavaJNI.TDF_AttributeMap_Subtraction(swigCPtr, this, TDF_AttributeMap.getCPtr(theLeft), theLeft, TDF_AttributeMap.getCPtr(theRight), theRight);
  }

  public long Subtract( TDF_AttributeMap  theOther) {
    return OCCwrapJavaJNI.TDF_AttributeMap_Subtract(swigCPtr, this, TDF_AttributeMap.getCPtr(theOther), theOther);
  }

  public void Difference( TDF_AttributeMap  theLeft,  TDF_AttributeMap  theRight) {
    OCCwrapJavaJNI.TDF_AttributeMap_Difference(swigCPtr, this, TDF_AttributeMap.getCPtr(theLeft), theLeft, TDF_AttributeMap.getCPtr(theRight), theRight);
  }

  public long Differ( TDF_AttributeMap  theOther) {
    return OCCwrapJavaJNI.TDF_AttributeMap_Differ(swigCPtr, this, TDF_AttributeMap.getCPtr(theOther), theOther);
  }

}
