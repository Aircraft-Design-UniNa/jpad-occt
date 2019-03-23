package opencascade;

public class TDF_IDList {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_IDList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_IDList(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_IDList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_IDList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDF_IDList() {
    this(OCCwrapJavaJNI.new_TDF_IDList__SWIG_0(), true);
  }

  public TDF_IDList( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TDF_IDList__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TDF_IDList( TDF_IDList  theOther) {
    this(OCCwrapJavaJNI.new_TDF_IDList__SWIG_2(TDF_IDList.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TDF_IDList_Size(swigCPtr, this);
  }

  public  TDF_IDList  Assign( TDF_IDList  theOther) {
    TDF_IDList ret = new TDF_IDList(OCCwrapJavaJNI.TDF_IDList_Assign(swigCPtr, this, TDF_IDList.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TDF_IDList_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TDF_IDList_Clear__SWIG_1(swigCPtr, this);
  }

  public  Standard_GUID  First() {
    Standard_GUID ret = new Standard_GUID(OCCwrapJavaJNI.TDF_IDList_First(swigCPtr, this), true);
    return ret;
  }

  public  Standard_GUID  Last() {
    Standard_GUID ret = new Standard_GUID(OCCwrapJavaJNI.TDF_IDList_Last(swigCPtr, this), true);
    return ret;
  }

  public Standard_GUID Append( Standard_GUID  theItem) {
    Standard_GUID ret = new Standard_GUID(OCCwrapJavaJNI.TDF_IDList_Append__SWIG_0(swigCPtr, this, Standard_GUID.getCPtr(theItem), theItem), false, this);
    return ret; //new Standard_GUID.CRef (ret);
  }

  public void Append( Standard_GUID  theItem,  TDF_IDList_Iterator  theIter) {
    OCCwrapJavaJNI.TDF_IDList_Append__SWIG_1(swigCPtr, this, Standard_GUID.getCPtr(theItem), theItem,  TDF_IDList_Iterator.getCPtr(theIter) , theIter);
  }

  public void Append( TDF_IDList  theOther) {
    OCCwrapJavaJNI.TDF_IDList_Append__SWIG_2(swigCPtr, this, TDF_IDList.getCPtr(theOther), theOther);
  }

  public Standard_GUID Prepend( Standard_GUID  theItem) {
    Standard_GUID ret = new Standard_GUID(OCCwrapJavaJNI.TDF_IDList_Prepend__SWIG_0(swigCPtr, this, Standard_GUID.getCPtr(theItem), theItem), false, this);
    return ret; //new Standard_GUID.CRef (ret);
  }

  public void Prepend( TDF_IDList  theOther) {
    OCCwrapJavaJNI.TDF_IDList_Prepend__SWIG_1(swigCPtr, this, TDF_IDList.getCPtr(theOther), theOther);
  }

  public void RemoveFirst() {
    OCCwrapJavaJNI.TDF_IDList_RemoveFirst(swigCPtr, this);
  }

  public void Remove( TDF_IDList_Iterator  theIter) {
    OCCwrapJavaJNI.TDF_IDList_Remove(swigCPtr, this,  TDF_IDList_Iterator.getCPtr(theIter) , theIter);
  }

  public Standard_GUID InsertBefore( Standard_GUID  theItem,  TDF_IDList_Iterator  theIter) {
    Standard_GUID ret = new Standard_GUID(OCCwrapJavaJNI.TDF_IDList_InsertBefore__SWIG_0(swigCPtr, this, Standard_GUID.getCPtr(theItem), theItem,  TDF_IDList_Iterator.getCPtr(theIter) , theIter), false, this);
    return ret; //new Standard_GUID.CRef (ret);
  }

  public void InsertBefore( TDF_IDList  theOther,  TDF_IDList_Iterator  theIter) {
    OCCwrapJavaJNI.TDF_IDList_InsertBefore__SWIG_1(swigCPtr, this, TDF_IDList.getCPtr(theOther), theOther,  TDF_IDList_Iterator.getCPtr(theIter) , theIter);
  }

  public Standard_GUID InsertAfter( Standard_GUID  theItem,  TDF_IDList_Iterator  theIter) {
    Standard_GUID ret = new Standard_GUID(OCCwrapJavaJNI.TDF_IDList_InsertAfter__SWIG_0(swigCPtr, this, Standard_GUID.getCPtr(theItem), theItem,  TDF_IDList_Iterator.getCPtr(theIter) , theIter), false, this);
    return ret; //new Standard_GUID.CRef (ret);
  }

  public void InsertAfter( TDF_IDList  theOther,  TDF_IDList_Iterator  theIter) {
    OCCwrapJavaJNI.TDF_IDList_InsertAfter__SWIG_1(swigCPtr, this, TDF_IDList.getCPtr(theOther), theOther,  TDF_IDList_Iterator.getCPtr(theIter) , theIter);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TDF_IDList_Reverse(swigCPtr, this);
  }

}
