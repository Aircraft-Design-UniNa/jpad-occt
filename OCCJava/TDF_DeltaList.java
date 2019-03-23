package opencascade;

public class TDF_DeltaList {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_DeltaList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_DeltaList(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_DeltaList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_DeltaList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDF_DeltaList() {
    this(OCCwrapJavaJNI.new_TDF_DeltaList__SWIG_0(), true);
  }

  public TDF_DeltaList( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TDF_DeltaList__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TDF_DeltaList( TDF_DeltaList  theOther) {
    this(OCCwrapJavaJNI.new_TDF_DeltaList__SWIG_2(TDF_DeltaList.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TDF_DeltaList_Size(swigCPtr, this);
  }

  public  TDF_DeltaList  Assign( TDF_DeltaList  theOther) {
    TDF_DeltaList ret = new TDF_DeltaList(OCCwrapJavaJNI.TDF_DeltaList_Assign(swigCPtr, this, TDF_DeltaList.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TDF_DeltaList_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TDF_DeltaList_Clear__SWIG_1(swigCPtr, this);
  }

  public  TDF_Delta  First() {
    return new TDF_Delta ( OCCwrapJavaJNI.TDF_DeltaList_First(swigCPtr, this), true );
  }

  public  TDF_Delta  Last() {
    return new TDF_Delta ( OCCwrapJavaJNI.TDF_DeltaList_Last(swigCPtr, this), true );
  }

  public  TDF_Delta  Append( TDF_Delta  theItem) {
    return new TDF_Delta ( OCCwrapJavaJNI.TDF_DeltaList_Append__SWIG_0(swigCPtr, this,  TDF_Delta.getCPtr(theItem) , theItem), true );
  }

  public void Append( TDF_Delta  theItem,  TDF_DeltaList_Iterator  theIter) {
    OCCwrapJavaJNI.TDF_DeltaList_Append__SWIG_1(swigCPtr, this,  TDF_Delta.getCPtr(theItem) , theItem,  TDF_DeltaList_Iterator.getCPtr(theIter) , theIter);
  }

  public void Append( TDF_DeltaList  theOther) {
    OCCwrapJavaJNI.TDF_DeltaList_Append__SWIG_2(swigCPtr, this, TDF_DeltaList.getCPtr(theOther), theOther);
  }

  public  TDF_Delta  Prepend( TDF_Delta  theItem) {
    return new TDF_Delta ( OCCwrapJavaJNI.TDF_DeltaList_Prepend__SWIG_0(swigCPtr, this,  TDF_Delta.getCPtr(theItem) , theItem), true );
  }

  public void Prepend( TDF_DeltaList  theOther) {
    OCCwrapJavaJNI.TDF_DeltaList_Prepend__SWIG_1(swigCPtr, this, TDF_DeltaList.getCPtr(theOther), theOther);
  }

  public void RemoveFirst() {
    OCCwrapJavaJNI.TDF_DeltaList_RemoveFirst(swigCPtr, this);
  }

  public void Remove( TDF_DeltaList_Iterator  theIter) {
    OCCwrapJavaJNI.TDF_DeltaList_Remove(swigCPtr, this,  TDF_DeltaList_Iterator.getCPtr(theIter) , theIter);
  }

  public  TDF_Delta  InsertBefore( TDF_Delta  theItem,  TDF_DeltaList_Iterator  theIter) {
    return new TDF_Delta ( OCCwrapJavaJNI.TDF_DeltaList_InsertBefore__SWIG_0(swigCPtr, this,  TDF_Delta.getCPtr(theItem) , theItem,  TDF_DeltaList_Iterator.getCPtr(theIter) , theIter), true );
  }

  public void InsertBefore( TDF_DeltaList  theOther,  TDF_DeltaList_Iterator  theIter) {
    OCCwrapJavaJNI.TDF_DeltaList_InsertBefore__SWIG_1(swigCPtr, this, TDF_DeltaList.getCPtr(theOther), theOther,  TDF_DeltaList_Iterator.getCPtr(theIter) , theIter);
  }

  public  TDF_Delta  InsertAfter( TDF_Delta  theItem,  TDF_DeltaList_Iterator  theIter) {
    return new TDF_Delta ( OCCwrapJavaJNI.TDF_DeltaList_InsertAfter__SWIG_0(swigCPtr, this,  TDF_Delta.getCPtr(theItem) , theItem,  TDF_DeltaList_Iterator.getCPtr(theIter) , theIter), true );
  }

  public void InsertAfter( TDF_DeltaList  theOther,  TDF_DeltaList_Iterator  theIter) {
    OCCwrapJavaJNI.TDF_DeltaList_InsertAfter__SWIG_1(swigCPtr, this, TDF_DeltaList.getCPtr(theOther), theOther,  TDF_DeltaList_Iterator.getCPtr(theIter) , theIter);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TDF_DeltaList_Reverse(swigCPtr, this);
  }

}
