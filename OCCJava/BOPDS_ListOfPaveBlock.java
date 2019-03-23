package opencascade;

public class BOPDS_ListOfPaveBlock {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BOPDS_ListOfPaveBlock(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BOPDS_ListOfPaveBlock(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BOPDS_ListOfPaveBlock obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPDS_ListOfPaveBlock(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BOPDS_ListOfPaveBlock() {
    this(OCCwrapJavaJNI.new_BOPDS_ListOfPaveBlock__SWIG_0(), true);
  }

  public BOPDS_ListOfPaveBlock( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BOPDS_ListOfPaveBlock__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public BOPDS_ListOfPaveBlock( BOPDS_ListOfPaveBlock  theOther) {
    this(OCCwrapJavaJNI.new_BOPDS_ListOfPaveBlock__SWIG_2(BOPDS_ListOfPaveBlock.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.BOPDS_ListOfPaveBlock_Size(swigCPtr, this);
  }

  public  BOPDS_ListOfPaveBlock  Assign( BOPDS_ListOfPaveBlock  theOther) {
    BOPDS_ListOfPaveBlock ret = new BOPDS_ListOfPaveBlock(OCCwrapJavaJNI.BOPDS_ListOfPaveBlock_Assign(swigCPtr, this, BOPDS_ListOfPaveBlock.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.BOPDS_ListOfPaveBlock_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.BOPDS_ListOfPaveBlock_Clear__SWIG_1(swigCPtr, this);
  }

  public  BOPDS_PaveBlock  First() {
    return new BOPDS_PaveBlock ( OCCwrapJavaJNI.BOPDS_ListOfPaveBlock_First(swigCPtr, this), true );
  }

  public  BOPDS_PaveBlock  Last() {
    return new BOPDS_PaveBlock ( OCCwrapJavaJNI.BOPDS_ListOfPaveBlock_Last(swigCPtr, this), true );
  }

  public  BOPDS_PaveBlock  Append( BOPDS_PaveBlock  theItem) {
    return new BOPDS_PaveBlock ( OCCwrapJavaJNI.BOPDS_ListOfPaveBlock_Append__SWIG_0(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(theItem) , theItem), true );
  }

  public void Append( BOPDS_PaveBlock  theItem,  BOPDS_ListOfPaveBlock_Iterator  theIter) {
    OCCwrapJavaJNI.BOPDS_ListOfPaveBlock_Append__SWIG_1(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(theItem) , theItem,  BOPDS_ListOfPaveBlock_Iterator.getCPtr(theIter) , theIter);
  }

  public void Append( BOPDS_ListOfPaveBlock  theOther) {
    OCCwrapJavaJNI.BOPDS_ListOfPaveBlock_Append__SWIG_2(swigCPtr, this, BOPDS_ListOfPaveBlock.getCPtr(theOther), theOther);
  }

  public  BOPDS_PaveBlock  Prepend( BOPDS_PaveBlock  theItem) {
    return new BOPDS_PaveBlock ( OCCwrapJavaJNI.BOPDS_ListOfPaveBlock_Prepend__SWIG_0(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(theItem) , theItem), true );
  }

  public void Prepend( BOPDS_ListOfPaveBlock  theOther) {
    OCCwrapJavaJNI.BOPDS_ListOfPaveBlock_Prepend__SWIG_1(swigCPtr, this, BOPDS_ListOfPaveBlock.getCPtr(theOther), theOther);
  }

  public void RemoveFirst() {
    OCCwrapJavaJNI.BOPDS_ListOfPaveBlock_RemoveFirst(swigCPtr, this);
  }

  public void Remove( BOPDS_ListOfPaveBlock_Iterator  theIter) {
    OCCwrapJavaJNI.BOPDS_ListOfPaveBlock_Remove(swigCPtr, this,  BOPDS_ListOfPaveBlock_Iterator.getCPtr(theIter) , theIter);
  }

  public  BOPDS_PaveBlock  InsertBefore( BOPDS_PaveBlock  theItem,  BOPDS_ListOfPaveBlock_Iterator  theIter) {
    return new BOPDS_PaveBlock ( OCCwrapJavaJNI.BOPDS_ListOfPaveBlock_InsertBefore__SWIG_0(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(theItem) , theItem,  BOPDS_ListOfPaveBlock_Iterator.getCPtr(theIter) , theIter), true );
  }

  public void InsertBefore( BOPDS_ListOfPaveBlock  theOther,  BOPDS_ListOfPaveBlock_Iterator  theIter) {
    OCCwrapJavaJNI.BOPDS_ListOfPaveBlock_InsertBefore__SWIG_1(swigCPtr, this, BOPDS_ListOfPaveBlock.getCPtr(theOther), theOther,  BOPDS_ListOfPaveBlock_Iterator.getCPtr(theIter) , theIter);
  }

  public  BOPDS_PaveBlock  InsertAfter( BOPDS_PaveBlock  theItem,  BOPDS_ListOfPaveBlock_Iterator  theIter) {
    return new BOPDS_PaveBlock ( OCCwrapJavaJNI.BOPDS_ListOfPaveBlock_InsertAfter__SWIG_0(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(theItem) , theItem,  BOPDS_ListOfPaveBlock_Iterator.getCPtr(theIter) , theIter), true );
  }

  public void InsertAfter( BOPDS_ListOfPaveBlock  theOther,  BOPDS_ListOfPaveBlock_Iterator  theIter) {
    OCCwrapJavaJNI.BOPDS_ListOfPaveBlock_InsertAfter__SWIG_1(swigCPtr, this, BOPDS_ListOfPaveBlock.getCPtr(theOther), theOther,  BOPDS_ListOfPaveBlock_Iterator.getCPtr(theIter) , theIter);
  }

  public void Reverse() {
    OCCwrapJavaJNI.BOPDS_ListOfPaveBlock_Reverse(swigCPtr, this);
  }

}
