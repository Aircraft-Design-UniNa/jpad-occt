package opencascade;

public class TColStd_ListOfTransient {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_ListOfTransient(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_ListOfTransient(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_ListOfTransient obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_ListOfTransient(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_ListOfTransient() {
    this(OCCwrapJavaJNI.new_TColStd_ListOfTransient__SWIG_0(), true);
  }

  public TColStd_ListOfTransient( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TColStd_ListOfTransient__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TColStd_ListOfTransient( TColStd_ListOfTransient  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_ListOfTransient__SWIG_2(TColStd_ListOfTransient.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_ListOfTransient_Size(swigCPtr, this);
  }

  public  TColStd_ListOfTransient  Assign( TColStd_ListOfTransient  theOther) {
    TColStd_ListOfTransient ret = new TColStd_ListOfTransient(OCCwrapJavaJNI.TColStd_ListOfTransient_Assign(swigCPtr, this, TColStd_ListOfTransient.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TColStd_ListOfTransient_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TColStd_ListOfTransient_Clear__SWIG_1(swigCPtr, this);
  }

  public  Standard_Transient  First() {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_ListOfTransient_First(swigCPtr, this), true );
  }

  public  Standard_Transient  Last() {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_ListOfTransient_Last(swigCPtr, this), true );
  }

  public  Standard_Transient  Append( Standard_Transient  theItem) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_ListOfTransient_Append__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(theItem) , theItem), true );
  }

  public void Append( Standard_Transient  theItem,  TColStd_ListOfTransient_Iterator  theIter) {
    OCCwrapJavaJNI.TColStd_ListOfTransient_Append__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(theItem) , theItem,  TColStd_ListOfTransient_Iterator.getCPtr(theIter) , theIter);
  }

  public void Append( TColStd_ListOfTransient  theOther) {
    OCCwrapJavaJNI.TColStd_ListOfTransient_Append__SWIG_2(swigCPtr, this, TColStd_ListOfTransient.getCPtr(theOther), theOther);
  }

  public  Standard_Transient  Prepend( Standard_Transient  theItem) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_ListOfTransient_Prepend__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(theItem) , theItem), true );
  }

  public void Prepend( TColStd_ListOfTransient  theOther) {
    OCCwrapJavaJNI.TColStd_ListOfTransient_Prepend__SWIG_1(swigCPtr, this, TColStd_ListOfTransient.getCPtr(theOther), theOther);
  }

  public void RemoveFirst() {
    OCCwrapJavaJNI.TColStd_ListOfTransient_RemoveFirst(swigCPtr, this);
  }

  public void Remove( TColStd_ListOfTransient_Iterator  theIter) {
    OCCwrapJavaJNI.TColStd_ListOfTransient_Remove(swigCPtr, this,  TColStd_ListOfTransient_Iterator.getCPtr(theIter) , theIter);
  }

  public  Standard_Transient  InsertBefore( Standard_Transient  theItem,  TColStd_ListOfTransient_Iterator  theIter) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_ListOfTransient_InsertBefore__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(theItem) , theItem,  TColStd_ListOfTransient_Iterator.getCPtr(theIter) , theIter), true );
  }

  public void InsertBefore( TColStd_ListOfTransient  theOther,  TColStd_ListOfTransient_Iterator  theIter) {
    OCCwrapJavaJNI.TColStd_ListOfTransient_InsertBefore__SWIG_1(swigCPtr, this, TColStd_ListOfTransient.getCPtr(theOther), theOther,  TColStd_ListOfTransient_Iterator.getCPtr(theIter) , theIter);
  }

  public  Standard_Transient  InsertAfter( Standard_Transient  theItem,  TColStd_ListOfTransient_Iterator  theIter) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_ListOfTransient_InsertAfter__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(theItem) , theItem,  TColStd_ListOfTransient_Iterator.getCPtr(theIter) , theIter), true );
  }

  public void InsertAfter( TColStd_ListOfTransient  theOther,  TColStd_ListOfTransient_Iterator  theIter) {
    OCCwrapJavaJNI.TColStd_ListOfTransient_InsertAfter__SWIG_1(swigCPtr, this, TColStd_ListOfTransient.getCPtr(theOther), theOther,  TColStd_ListOfTransient_Iterator.getCPtr(theIter) , theIter);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColStd_ListOfTransient_Reverse(swigCPtr, this);
  }

}
