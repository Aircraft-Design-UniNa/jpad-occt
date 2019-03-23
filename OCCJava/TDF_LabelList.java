package opencascade;

public class TDF_LabelList {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_LabelList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_LabelList(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_LabelList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_LabelList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDF_LabelList() {
    this(OCCwrapJavaJNI.new_TDF_LabelList__SWIG_0(), true);
  }

  public TDF_LabelList( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TDF_LabelList__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TDF_LabelList( TDF_LabelList  theOther) {
    this(OCCwrapJavaJNI.new_TDF_LabelList__SWIG_2(TDF_LabelList.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TDF_LabelList_Size(swigCPtr, this);
  }

  public  TDF_LabelList  Assign( TDF_LabelList  theOther) {
    TDF_LabelList ret = new TDF_LabelList(OCCwrapJavaJNI.TDF_LabelList_Assign(swigCPtr, this, TDF_LabelList.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TDF_LabelList_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TDF_LabelList_Clear__SWIG_1(swigCPtr, this);
  }

  public  TDF_Label  First() {
    TDF_Label ret = new TDF_Label(OCCwrapJavaJNI.TDF_LabelList_First(swigCPtr, this), true);
    return ret;
  }

  public  TDF_Label  Last() {
    TDF_Label ret = new TDF_Label(OCCwrapJavaJNI.TDF_LabelList_Last(swigCPtr, this), true);
    return ret;
  }

  public TDF_Label Append( TDF_Label  theItem) {
    TDF_Label ret = new TDF_Label(OCCwrapJavaJNI.TDF_LabelList_Append__SWIG_0(swigCPtr, this, TDF_Label.getCPtr(theItem), theItem), false, this);
    return ret; //new TDF_Label.CRef (ret);
  }

  public void Append( TDF_Label  theItem,  TDF_LabelList_Iterator  theIter) {
    OCCwrapJavaJNI.TDF_LabelList_Append__SWIG_1(swigCPtr, this, TDF_Label.getCPtr(theItem), theItem,  TDF_LabelList_Iterator.getCPtr(theIter) , theIter);
  }

  public void Append( TDF_LabelList  theOther) {
    OCCwrapJavaJNI.TDF_LabelList_Append__SWIG_2(swigCPtr, this, TDF_LabelList.getCPtr(theOther), theOther);
  }

  public TDF_Label Prepend( TDF_Label  theItem) {
    TDF_Label ret = new TDF_Label(OCCwrapJavaJNI.TDF_LabelList_Prepend__SWIG_0(swigCPtr, this, TDF_Label.getCPtr(theItem), theItem), false, this);
    return ret; //new TDF_Label.CRef (ret);
  }

  public void Prepend( TDF_LabelList  theOther) {
    OCCwrapJavaJNI.TDF_LabelList_Prepend__SWIG_1(swigCPtr, this, TDF_LabelList.getCPtr(theOther), theOther);
  }

  public void RemoveFirst() {
    OCCwrapJavaJNI.TDF_LabelList_RemoveFirst(swigCPtr, this);
  }

  public void Remove( TDF_LabelList_Iterator  theIter) {
    OCCwrapJavaJNI.TDF_LabelList_Remove(swigCPtr, this,  TDF_LabelList_Iterator.getCPtr(theIter) , theIter);
  }

  public TDF_Label InsertBefore( TDF_Label  theItem,  TDF_LabelList_Iterator  theIter) {
    TDF_Label ret = new TDF_Label(OCCwrapJavaJNI.TDF_LabelList_InsertBefore__SWIG_0(swigCPtr, this, TDF_Label.getCPtr(theItem), theItem,  TDF_LabelList_Iterator.getCPtr(theIter) , theIter), false, this);
    return ret; //new TDF_Label.CRef (ret);
  }

  public void InsertBefore( TDF_LabelList  theOther,  TDF_LabelList_Iterator  theIter) {
    OCCwrapJavaJNI.TDF_LabelList_InsertBefore__SWIG_1(swigCPtr, this, TDF_LabelList.getCPtr(theOther), theOther,  TDF_LabelList_Iterator.getCPtr(theIter) , theIter);
  }

  public TDF_Label InsertAfter( TDF_Label  theItem,  TDF_LabelList_Iterator  theIter) {
    TDF_Label ret = new TDF_Label(OCCwrapJavaJNI.TDF_LabelList_InsertAfter__SWIG_0(swigCPtr, this, TDF_Label.getCPtr(theItem), theItem,  TDF_LabelList_Iterator.getCPtr(theIter) , theIter), false, this);
    return ret; //new TDF_Label.CRef (ret);
  }

  public void InsertAfter( TDF_LabelList  theOther,  TDF_LabelList_Iterator  theIter) {
    OCCwrapJavaJNI.TDF_LabelList_InsertAfter__SWIG_1(swigCPtr, this, TDF_LabelList.getCPtr(theOther), theOther,  TDF_LabelList_Iterator.getCPtr(theIter) , theIter);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TDF_LabelList_Reverse(swigCPtr, this);
  }

}
