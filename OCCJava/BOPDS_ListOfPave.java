package opencascade;

public class BOPDS_ListOfPave {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BOPDS_ListOfPave(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BOPDS_ListOfPave(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BOPDS_ListOfPave obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPDS_ListOfPave(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BOPDS_ListOfPave() {
    this(OCCwrapJavaJNI.new_BOPDS_ListOfPave__SWIG_0(), true);
  }

  public BOPDS_ListOfPave( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BOPDS_ListOfPave__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public BOPDS_ListOfPave( BOPDS_ListOfPave  theOther) {
    this(OCCwrapJavaJNI.new_BOPDS_ListOfPave__SWIG_2(BOPDS_ListOfPave.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.BOPDS_ListOfPave_Size(swigCPtr, this);
  }

  public  BOPDS_ListOfPave  Assign( BOPDS_ListOfPave  theOther) {
    BOPDS_ListOfPave ret = new BOPDS_ListOfPave(OCCwrapJavaJNI.BOPDS_ListOfPave_Assign(swigCPtr, this, BOPDS_ListOfPave.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.BOPDS_ListOfPave_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.BOPDS_ListOfPave_Clear__SWIG_1(swigCPtr, this);
  }

  public  BOPDS_Pave  First() {
    BOPDS_Pave ret = new BOPDS_Pave(OCCwrapJavaJNI.BOPDS_ListOfPave_First(swigCPtr, this), false, this);
    return ret;
  }

  public  BOPDS_Pave  Last() {
    BOPDS_Pave ret = new BOPDS_Pave(OCCwrapJavaJNI.BOPDS_ListOfPave_Last(swigCPtr, this), false, this);
    return ret;
  }

  public  BOPDS_Pave  Append( BOPDS_Pave  theItem) {
    BOPDS_Pave ret = new BOPDS_Pave(OCCwrapJavaJNI.BOPDS_ListOfPave_Append__SWIG_0(swigCPtr, this, BOPDS_Pave.getCPtr(theItem), theItem), false, this);
    return ret;
  }

  public void Append( BOPDS_Pave  theItem,  BOPDS_ListOfPave_Iterator  theIter) {
    OCCwrapJavaJNI.BOPDS_ListOfPave_Append__SWIG_1(swigCPtr, this, BOPDS_Pave.getCPtr(theItem), theItem,  BOPDS_ListOfPave_Iterator.getCPtr(theIter) , theIter);
  }

  public void Append( BOPDS_ListOfPave  theOther) {
    OCCwrapJavaJNI.BOPDS_ListOfPave_Append__SWIG_2(swigCPtr, this, BOPDS_ListOfPave.getCPtr(theOther), theOther);
  }

  public  BOPDS_Pave  Prepend( BOPDS_Pave  theItem) {
    BOPDS_Pave ret = new BOPDS_Pave(OCCwrapJavaJNI.BOPDS_ListOfPave_Prepend__SWIG_0(swigCPtr, this, BOPDS_Pave.getCPtr(theItem), theItem), false, this);
    return ret;
  }

  public void Prepend( BOPDS_ListOfPave  theOther) {
    OCCwrapJavaJNI.BOPDS_ListOfPave_Prepend__SWIG_1(swigCPtr, this, BOPDS_ListOfPave.getCPtr(theOther), theOther);
  }

  public void RemoveFirst() {
    OCCwrapJavaJNI.BOPDS_ListOfPave_RemoveFirst(swigCPtr, this);
  }

  public void Remove( BOPDS_ListOfPave_Iterator  theIter) {
    OCCwrapJavaJNI.BOPDS_ListOfPave_Remove(swigCPtr, this,  BOPDS_ListOfPave_Iterator.getCPtr(theIter) , theIter);
  }

  public  BOPDS_Pave  InsertBefore( BOPDS_Pave  theItem,  BOPDS_ListOfPave_Iterator  theIter) {
    BOPDS_Pave ret = new BOPDS_Pave(OCCwrapJavaJNI.BOPDS_ListOfPave_InsertBefore__SWIG_0(swigCPtr, this, BOPDS_Pave.getCPtr(theItem), theItem,  BOPDS_ListOfPave_Iterator.getCPtr(theIter) , theIter), false, this);
    return ret;
  }

  public void InsertBefore( BOPDS_ListOfPave  theOther,  BOPDS_ListOfPave_Iterator  theIter) {
    OCCwrapJavaJNI.BOPDS_ListOfPave_InsertBefore__SWIG_1(swigCPtr, this, BOPDS_ListOfPave.getCPtr(theOther), theOther,  BOPDS_ListOfPave_Iterator.getCPtr(theIter) , theIter);
  }

  public  BOPDS_Pave  InsertAfter( BOPDS_Pave  theItem,  BOPDS_ListOfPave_Iterator  theIter) {
    BOPDS_Pave ret = new BOPDS_Pave(OCCwrapJavaJNI.BOPDS_ListOfPave_InsertAfter__SWIG_0(swigCPtr, this, BOPDS_Pave.getCPtr(theItem), theItem,  BOPDS_ListOfPave_Iterator.getCPtr(theIter) , theIter), false, this);
    return ret;
  }

  public void InsertAfter( BOPDS_ListOfPave  theOther,  BOPDS_ListOfPave_Iterator  theIter) {
    OCCwrapJavaJNI.BOPDS_ListOfPave_InsertAfter__SWIG_1(swigCPtr, this, BOPDS_ListOfPave.getCPtr(theOther), theOther,  BOPDS_ListOfPave_Iterator.getCPtr(theIter) , theIter);
  }

  public void Reverse() {
    OCCwrapJavaJNI.BOPDS_ListOfPave_Reverse(swigCPtr, this);
  }

}
