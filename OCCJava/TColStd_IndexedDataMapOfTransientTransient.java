package opencascade;

public class TColStd_IndexedDataMapOfTransientTransient {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_IndexedDataMapOfTransientTransient(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_IndexedDataMapOfTransientTransient(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_IndexedDataMapOfTransientTransient obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_IndexedDataMapOfTransientTransient(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_IndexedDataMapOfTransientTransient() {
    this(OCCwrapJavaJNI.new_TColStd_IndexedDataMapOfTransientTransient__SWIG_0(), true);
  }

  public TColStd_IndexedDataMapOfTransientTransient(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TColStd_IndexedDataMapOfTransientTransient__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TColStd_IndexedDataMapOfTransientTransient(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_TColStd_IndexedDataMapOfTransientTransient__SWIG_2(theNbBuckets), true);
  }

  public TColStd_IndexedDataMapOfTransientTransient( TColStd_IndexedDataMapOfTransientTransient  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_IndexedDataMapOfTransientTransient__SWIG_3(TColStd_IndexedDataMapOfTransientTransient.getCPtr(theOther), theOther), true);
  }

  public void Exchange( TColStd_IndexedDataMapOfTransientTransient  theOther) {
    OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_Exchange(swigCPtr, this, TColStd_IndexedDataMapOfTransientTransient.getCPtr(theOther), theOther);
  }

  public  TColStd_IndexedDataMapOfTransientTransient  Assign( TColStd_IndexedDataMapOfTransientTransient  theOther) {
    TColStd_IndexedDataMapOfTransientTransient ret = new TColStd_IndexedDataMapOfTransientTransient(OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_Assign(swigCPtr, this, TColStd_IndexedDataMapOfTransientTransient.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int N) {
    OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_ReSize(swigCPtr, this, N);
  }

  public int Add( Standard_Transient  theKey1,  Standard_Transient  theItem) {
    return OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_Add(swigCPtr, this,  Standard_Transient.getCPtr(theKey1) , theKey1,  Standard_Transient.getCPtr(theItem) , theItem);
  }

  public long Contains( Standard_Transient  theKey1) {
    return OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_Contains(swigCPtr, this,  Standard_Transient.getCPtr(theKey1) , theKey1);
  }

  public void Substitute(int theIndex,  Standard_Transient  theKey1,  Standard_Transient  theItem) {
    OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_Substitute(swigCPtr, this, theIndex,  Standard_Transient.getCPtr(theKey1) , theKey1,  Standard_Transient.getCPtr(theItem) , theItem);
  }

  public void Swap(int theIndex1, int theIndex2) {
    OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_Swap(swigCPtr, this, theIndex1, theIndex2);
  }

  public void RemoveLast() {
    OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_RemoveLast(swigCPtr, this);
  }

  public void RemoveFromIndex(int theIndex) {
    OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_RemoveFromIndex(swigCPtr, this, theIndex);
  }

  public void RemoveKey( Standard_Transient  theKey1) {
    OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_RemoveKey(swigCPtr, this,  Standard_Transient.getCPtr(theKey1) , theKey1);
  }

  public  Standard_Transient  FindKey(int theIndex) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_FindKey(swigCPtr, this, theIndex), true );
  }

  public  Standard_Transient  FindFromIndex(int theIndex) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_FindFromIndex(swigCPtr, this, theIndex), true );
  }

  public  Standard_Transient  ChangeFromIndex(int theIndex) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_ChangeFromIndex(swigCPtr, this, theIndex), true );
  }

  public int FindIndex( Standard_Transient  theKey1) {
    return OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_FindIndex(swigCPtr, this,  Standard_Transient.getCPtr(theKey1) , theKey1);
  }

  public  Standard_Transient  FindFromKey( Standard_Transient  theKey1) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_FindFromKey__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(theKey1) , theKey1), true );
  }

  public  Standard_Transient  ChangeFromKey( Standard_Transient  theKey1) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_ChangeFromKey(swigCPtr, this,  Standard_Transient.getCPtr(theKey1) , theKey1), true );
  }

  public long FindFromKey( Standard_Transient  theKey1,  Standard_Transient  theValue) {
    return OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_FindFromKey__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(theKey1) , theKey1,  Standard_Transient.getCPtr(theValue) , theValue);
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_IndexedDataMapOfTransientTransient_Size(swigCPtr, this);
  }

}
