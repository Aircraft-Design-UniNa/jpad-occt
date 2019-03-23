package opencascade;

public class TDF_AttributeList {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_AttributeList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_AttributeList(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_AttributeList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_AttributeList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDF_AttributeList() {
    this(OCCwrapJavaJNI.new_TDF_AttributeList__SWIG_0(), true);
  }

  public TDF_AttributeList( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TDF_AttributeList__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TDF_AttributeList( TDF_AttributeList  theOther) {
    this(OCCwrapJavaJNI.new_TDF_AttributeList__SWIG_2(TDF_AttributeList.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TDF_AttributeList_Size(swigCPtr, this);
  }

  public  TDF_AttributeList  Assign( TDF_AttributeList  theOther) {
    TDF_AttributeList ret = new TDF_AttributeList(OCCwrapJavaJNI.TDF_AttributeList_Assign(swigCPtr, this, TDF_AttributeList.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TDF_AttributeList_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TDF_AttributeList_Clear__SWIG_1(swigCPtr, this);
  }

  public  TDF_Attribute  First() {
    return new TDF_Attribute ( OCCwrapJavaJNI.TDF_AttributeList_First(swigCPtr, this), true );
  }

  public  TDF_Attribute  Last() {
    return new TDF_Attribute ( OCCwrapJavaJNI.TDF_AttributeList_Last(swigCPtr, this), true );
  }

  public  TDF_Attribute  Append( TDF_Attribute  theItem) {
    return new TDF_Attribute ( OCCwrapJavaJNI.TDF_AttributeList_Append__SWIG_0(swigCPtr, this,  TDF_Attribute.getCPtr(theItem) , theItem), true );
  }

  public void Append( TDF_Attribute  theItem,  TDF_AttributeList_Iterator  theIter) {
    OCCwrapJavaJNI.TDF_AttributeList_Append__SWIG_1(swigCPtr, this,  TDF_Attribute.getCPtr(theItem) , theItem,  TDF_AttributeList_Iterator.getCPtr(theIter) , theIter);
  }

  public void Append( TDF_AttributeList  theOther) {
    OCCwrapJavaJNI.TDF_AttributeList_Append__SWIG_2(swigCPtr, this, TDF_AttributeList.getCPtr(theOther), theOther);
  }

  public  TDF_Attribute  Prepend( TDF_Attribute  theItem) {
    return new TDF_Attribute ( OCCwrapJavaJNI.TDF_AttributeList_Prepend__SWIG_0(swigCPtr, this,  TDF_Attribute.getCPtr(theItem) , theItem), true );
  }

  public void Prepend( TDF_AttributeList  theOther) {
    OCCwrapJavaJNI.TDF_AttributeList_Prepend__SWIG_1(swigCPtr, this, TDF_AttributeList.getCPtr(theOther), theOther);
  }

  public void RemoveFirst() {
    OCCwrapJavaJNI.TDF_AttributeList_RemoveFirst(swigCPtr, this);
  }

  public void Remove( TDF_AttributeList_Iterator  theIter) {
    OCCwrapJavaJNI.TDF_AttributeList_Remove(swigCPtr, this,  TDF_AttributeList_Iterator.getCPtr(theIter) , theIter);
  }

  public  TDF_Attribute  InsertBefore( TDF_Attribute  theItem,  TDF_AttributeList_Iterator  theIter) {
    return new TDF_Attribute ( OCCwrapJavaJNI.TDF_AttributeList_InsertBefore__SWIG_0(swigCPtr, this,  TDF_Attribute.getCPtr(theItem) , theItem,  TDF_AttributeList_Iterator.getCPtr(theIter) , theIter), true );
  }

  public void InsertBefore( TDF_AttributeList  theOther,  TDF_AttributeList_Iterator  theIter) {
    OCCwrapJavaJNI.TDF_AttributeList_InsertBefore__SWIG_1(swigCPtr, this, TDF_AttributeList.getCPtr(theOther), theOther,  TDF_AttributeList_Iterator.getCPtr(theIter) , theIter);
  }

  public  TDF_Attribute  InsertAfter( TDF_Attribute  theItem,  TDF_AttributeList_Iterator  theIter) {
    return new TDF_Attribute ( OCCwrapJavaJNI.TDF_AttributeList_InsertAfter__SWIG_0(swigCPtr, this,  TDF_Attribute.getCPtr(theItem) , theItem,  TDF_AttributeList_Iterator.getCPtr(theIter) , theIter), true );
  }

  public void InsertAfter( TDF_AttributeList  theOther,  TDF_AttributeList_Iterator  theIter) {
    OCCwrapJavaJNI.TDF_AttributeList_InsertAfter__SWIG_1(swigCPtr, this, TDF_AttributeList.getCPtr(theOther), theOther,  TDF_AttributeList_Iterator.getCPtr(theIter) , theIter);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TDF_AttributeList_Reverse(swigCPtr, this);
  }

}
