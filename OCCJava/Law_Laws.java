package opencascade;

public class Law_Laws {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Law_Laws(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Law_Laws(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Law_Laws obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Law_Laws(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Law_Laws() {
    this(OCCwrapJavaJNI.new_Law_Laws__SWIG_0(), true);
  }

  public Law_Laws( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_Law_Laws__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public Law_Laws( Law_Laws  theOther) {
    this(OCCwrapJavaJNI.new_Law_Laws__SWIG_2(Law_Laws.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.Law_Laws_Size(swigCPtr, this);
  }

  public  Law_Laws  Assign( Law_Laws  theOther) {
    Law_Laws ret = new Law_Laws(OCCwrapJavaJNI.Law_Laws_Assign(swigCPtr, this, Law_Laws.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.Law_Laws_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.Law_Laws_Clear__SWIG_1(swigCPtr, this);
  }

  public  Law_Function  First() {
    return new Law_Function ( OCCwrapJavaJNI.Law_Laws_First(swigCPtr, this), true );
  }

  public  Law_Function  Last() {
    return new Law_Function ( OCCwrapJavaJNI.Law_Laws_Last(swigCPtr, this), true );
  }

  public  Law_Function  Append( Law_Function  theItem) {
    return new Law_Function ( OCCwrapJavaJNI.Law_Laws_Append__SWIG_0(swigCPtr, this,  Law_Function.getCPtr(theItem) , theItem), true );
  }

  public void Append( Law_Function  theItem,  Law_Laws_Iterator  theIter) {
    OCCwrapJavaJNI.Law_Laws_Append__SWIG_1(swigCPtr, this,  Law_Function.getCPtr(theItem) , theItem,  Law_Laws_Iterator.getCPtr(theIter) , theIter);
  }

  public void Append( Law_Laws  theOther) {
    OCCwrapJavaJNI.Law_Laws_Append__SWIG_2(swigCPtr, this, Law_Laws.getCPtr(theOther), theOther);
  }

  public  Law_Function  Prepend( Law_Function  theItem) {
    return new Law_Function ( OCCwrapJavaJNI.Law_Laws_Prepend__SWIG_0(swigCPtr, this,  Law_Function.getCPtr(theItem) , theItem), true );
  }

  public void Prepend( Law_Laws  theOther) {
    OCCwrapJavaJNI.Law_Laws_Prepend__SWIG_1(swigCPtr, this, Law_Laws.getCPtr(theOther), theOther);
  }

  public void RemoveFirst() {
    OCCwrapJavaJNI.Law_Laws_RemoveFirst(swigCPtr, this);
  }

  public void Remove( Law_Laws_Iterator  theIter) {
    OCCwrapJavaJNI.Law_Laws_Remove(swigCPtr, this,  Law_Laws_Iterator.getCPtr(theIter) , theIter);
  }

  public  Law_Function  InsertBefore( Law_Function  theItem,  Law_Laws_Iterator  theIter) {
    return new Law_Function ( OCCwrapJavaJNI.Law_Laws_InsertBefore__SWIG_0(swigCPtr, this,  Law_Function.getCPtr(theItem) , theItem,  Law_Laws_Iterator.getCPtr(theIter) , theIter), true );
  }

  public void InsertBefore( Law_Laws  theOther,  Law_Laws_Iterator  theIter) {
    OCCwrapJavaJNI.Law_Laws_InsertBefore__SWIG_1(swigCPtr, this, Law_Laws.getCPtr(theOther), theOther,  Law_Laws_Iterator.getCPtr(theIter) , theIter);
  }

  public  Law_Function  InsertAfter( Law_Function  theItem,  Law_Laws_Iterator  theIter) {
    return new Law_Function ( OCCwrapJavaJNI.Law_Laws_InsertAfter__SWIG_0(swigCPtr, this,  Law_Function.getCPtr(theItem) , theItem,  Law_Laws_Iterator.getCPtr(theIter) , theIter), true );
  }

  public void InsertAfter( Law_Laws  theOther,  Law_Laws_Iterator  theIter) {
    OCCwrapJavaJNI.Law_Laws_InsertAfter__SWIG_1(swigCPtr, this, Law_Laws.getCPtr(theOther), theOther,  Law_Laws_Iterator.getCPtr(theIter) , theIter);
  }

  public void Reverse() {
    OCCwrapJavaJNI.Law_Laws_Reverse(swigCPtr, this);
  }

}
