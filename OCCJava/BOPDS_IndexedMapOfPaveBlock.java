package opencascade;

public class BOPDS_IndexedMapOfPaveBlock {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BOPDS_IndexedMapOfPaveBlock(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BOPDS_IndexedMapOfPaveBlock(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BOPDS_IndexedMapOfPaveBlock obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPDS_IndexedMapOfPaveBlock(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BOPDS_IndexedMapOfPaveBlock() {
    this(OCCwrapJavaJNI.new_BOPDS_IndexedMapOfPaveBlock__SWIG_0(), true);
  }

  public BOPDS_IndexedMapOfPaveBlock(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BOPDS_IndexedMapOfPaveBlock__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public BOPDS_IndexedMapOfPaveBlock(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_BOPDS_IndexedMapOfPaveBlock__SWIG_2(theNbBuckets), true);
  }

  public BOPDS_IndexedMapOfPaveBlock( BOPDS_IndexedMapOfPaveBlock  theOther) {
    this(OCCwrapJavaJNI.new_BOPDS_IndexedMapOfPaveBlock__SWIG_3(BOPDS_IndexedMapOfPaveBlock.getCPtr(theOther), theOther), true);
  }

  public void Exchange( BOPDS_IndexedMapOfPaveBlock  theOther) {
    OCCwrapJavaJNI.BOPDS_IndexedMapOfPaveBlock_Exchange(swigCPtr, this, BOPDS_IndexedMapOfPaveBlock.getCPtr(theOther), theOther);
  }

  public  BOPDS_IndexedMapOfPaveBlock  Assign( BOPDS_IndexedMapOfPaveBlock  theOther) {
    BOPDS_IndexedMapOfPaveBlock ret = new BOPDS_IndexedMapOfPaveBlock(OCCwrapJavaJNI.BOPDS_IndexedMapOfPaveBlock_Assign(swigCPtr, this, BOPDS_IndexedMapOfPaveBlock.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int theExtent) {
    OCCwrapJavaJNI.BOPDS_IndexedMapOfPaveBlock_ReSize(swigCPtr, this, theExtent);
  }

  public int Add( BOPDS_PaveBlock  theKey1) {
    return OCCwrapJavaJNI.BOPDS_IndexedMapOfPaveBlock_Add(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(theKey1) , theKey1);
  }

  public long Contains( BOPDS_PaveBlock  theKey1) {
    return OCCwrapJavaJNI.BOPDS_IndexedMapOfPaveBlock_Contains(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(theKey1) , theKey1);
  }

  public void Substitute(int theIndex,  BOPDS_PaveBlock  theKey1) {
    OCCwrapJavaJNI.BOPDS_IndexedMapOfPaveBlock_Substitute(swigCPtr, this, theIndex,  BOPDS_PaveBlock.getCPtr(theKey1) , theKey1);
  }

  public void Swap(int theIndex1, int theIndex2) {
    OCCwrapJavaJNI.BOPDS_IndexedMapOfPaveBlock_Swap(swigCPtr, this, theIndex1, theIndex2);
  }

  public void RemoveLast() {
    OCCwrapJavaJNI.BOPDS_IndexedMapOfPaveBlock_RemoveLast(swigCPtr, this);
  }

  public void RemoveFromIndex(int theIndex) {
    OCCwrapJavaJNI.BOPDS_IndexedMapOfPaveBlock_RemoveFromIndex(swigCPtr, this, theIndex);
  }

  public long RemoveKey( BOPDS_PaveBlock  theKey1) {
    return OCCwrapJavaJNI.BOPDS_IndexedMapOfPaveBlock_RemoveKey(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(theKey1) , theKey1);
  }

  public  BOPDS_PaveBlock  FindKey(int theIndex) {
    return new BOPDS_PaveBlock ( OCCwrapJavaJNI.BOPDS_IndexedMapOfPaveBlock_FindKey(swigCPtr, this, theIndex), true );
  }

  public int FindIndex( BOPDS_PaveBlock  theKey1) {
    return OCCwrapJavaJNI.BOPDS_IndexedMapOfPaveBlock_FindIndex(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(theKey1) , theKey1);
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.BOPDS_IndexedMapOfPaveBlock_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.BOPDS_IndexedMapOfPaveBlock_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.BOPDS_IndexedMapOfPaveBlock_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.BOPDS_IndexedMapOfPaveBlock_Size(swigCPtr, this);
  }

}
