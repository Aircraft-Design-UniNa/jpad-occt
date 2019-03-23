package opencascade;

public class TColStd_MapOfTransient {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_MapOfTransient(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_MapOfTransient(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_MapOfTransient obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_MapOfTransient(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_MapOfTransient() {
    this(OCCwrapJavaJNI.new_TColStd_MapOfTransient__SWIG_0(), true);
  }

  public TColStd_MapOfTransient(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TColStd_MapOfTransient__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TColStd_MapOfTransient(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_TColStd_MapOfTransient__SWIG_2(theNbBuckets), true);
  }

  public TColStd_MapOfTransient( TColStd_MapOfTransient  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_MapOfTransient__SWIG_3(TColStd_MapOfTransient.getCPtr(theOther), theOther), true);
  }

  public void Exchange( TColStd_MapOfTransient  theOther) {
    OCCwrapJavaJNI.TColStd_MapOfTransient_Exchange(swigCPtr, this, TColStd_MapOfTransient.getCPtr(theOther), theOther);
  }

  public  TColStd_MapOfTransient  Assign( TColStd_MapOfTransient  theOther) {
    TColStd_MapOfTransient ret = new TColStd_MapOfTransient(OCCwrapJavaJNI.TColStd_MapOfTransient_Assign(swigCPtr, this, TColStd_MapOfTransient.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int N) {
    OCCwrapJavaJNI.TColStd_MapOfTransient_ReSize(swigCPtr, this, N);
  }

  public long Add( Standard_Transient  K) {
    return OCCwrapJavaJNI.TColStd_MapOfTransient_Add(swigCPtr, this,  Standard_Transient.getCPtr(K) , K);
  }

  public  Standard_Transient  Added( Standard_Transient  K) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_MapOfTransient_Added(swigCPtr, this,  Standard_Transient.getCPtr(K) , K), true );
  }

  public long Contains( Standard_Transient  K) {
    return OCCwrapJavaJNI.TColStd_MapOfTransient_Contains__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(K) , K);
  }

  public long Remove( Standard_Transient  K) {
    return OCCwrapJavaJNI.TColStd_MapOfTransient_Remove(swigCPtr, this,  Standard_Transient.getCPtr(K) , K);
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.TColStd_MapOfTransient_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.TColStd_MapOfTransient_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TColStd_MapOfTransient_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_MapOfTransient_Size(swigCPtr, this);
  }

  public long IsEqual( TColStd_MapOfTransient  theOther) {
    return OCCwrapJavaJNI.TColStd_MapOfTransient_IsEqual(swigCPtr, this, TColStd_MapOfTransient.getCPtr(theOther), theOther);
  }

  public long Contains( TColStd_MapOfTransient  theOther) {
    return OCCwrapJavaJNI.TColStd_MapOfTransient_Contains__SWIG_1(swigCPtr, this, TColStd_MapOfTransient.getCPtr(theOther), theOther);
  }

  public void Union( TColStd_MapOfTransient  theLeft,  TColStd_MapOfTransient  theRight) {
    OCCwrapJavaJNI.TColStd_MapOfTransient_Union(swigCPtr, this, TColStd_MapOfTransient.getCPtr(theLeft), theLeft, TColStd_MapOfTransient.getCPtr(theRight), theRight);
  }

  public long Unite( TColStd_MapOfTransient  theOther) {
    return OCCwrapJavaJNI.TColStd_MapOfTransient_Unite(swigCPtr, this, TColStd_MapOfTransient.getCPtr(theOther), theOther);
  }

  public long HasIntersection( TColStd_MapOfTransient  theMap) {
    return OCCwrapJavaJNI.TColStd_MapOfTransient_HasIntersection(swigCPtr, this, TColStd_MapOfTransient.getCPtr(theMap), theMap);
  }

  public void Intersection( TColStd_MapOfTransient  theLeft,  TColStd_MapOfTransient  theRight) {
    OCCwrapJavaJNI.TColStd_MapOfTransient_Intersection(swigCPtr, this, TColStd_MapOfTransient.getCPtr(theLeft), theLeft, TColStd_MapOfTransient.getCPtr(theRight), theRight);
  }

  public long Intersect( TColStd_MapOfTransient  theOther) {
    return OCCwrapJavaJNI.TColStd_MapOfTransient_Intersect(swigCPtr, this, TColStd_MapOfTransient.getCPtr(theOther), theOther);
  }

  public void Subtraction( TColStd_MapOfTransient  theLeft,  TColStd_MapOfTransient  theRight) {
    OCCwrapJavaJNI.TColStd_MapOfTransient_Subtraction(swigCPtr, this, TColStd_MapOfTransient.getCPtr(theLeft), theLeft, TColStd_MapOfTransient.getCPtr(theRight), theRight);
  }

  public long Subtract( TColStd_MapOfTransient  theOther) {
    return OCCwrapJavaJNI.TColStd_MapOfTransient_Subtract(swigCPtr, this, TColStd_MapOfTransient.getCPtr(theOther), theOther);
  }

  public void Difference( TColStd_MapOfTransient  theLeft,  TColStd_MapOfTransient  theRight) {
    OCCwrapJavaJNI.TColStd_MapOfTransient_Difference(swigCPtr, this, TColStd_MapOfTransient.getCPtr(theLeft), theLeft, TColStd_MapOfTransient.getCPtr(theRight), theRight);
  }

  public long Differ( TColStd_MapOfTransient  theOther) {
    return OCCwrapJavaJNI.TColStd_MapOfTransient_Differ(swigCPtr, this, TColStd_MapOfTransient.getCPtr(theOther), theOther);
  }

}
