package opencascade;

public class BOPDS_MapOfPaveBlock {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BOPDS_MapOfPaveBlock(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BOPDS_MapOfPaveBlock(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BOPDS_MapOfPaveBlock obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPDS_MapOfPaveBlock(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BOPDS_MapOfPaveBlock() {
    this(OCCwrapJavaJNI.new_BOPDS_MapOfPaveBlock__SWIG_0(), true);
  }

  public BOPDS_MapOfPaveBlock(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BOPDS_MapOfPaveBlock__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public BOPDS_MapOfPaveBlock(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_BOPDS_MapOfPaveBlock__SWIG_2(theNbBuckets), true);
  }

  public BOPDS_MapOfPaveBlock( BOPDS_MapOfPaveBlock  theOther) {
    this(OCCwrapJavaJNI.new_BOPDS_MapOfPaveBlock__SWIG_3(BOPDS_MapOfPaveBlock.getCPtr(theOther), theOther), true);
  }

  public void Exchange( BOPDS_MapOfPaveBlock  theOther) {
    OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Exchange(swigCPtr, this, BOPDS_MapOfPaveBlock.getCPtr(theOther), theOther);
  }

  public  BOPDS_MapOfPaveBlock  Assign( BOPDS_MapOfPaveBlock  theOther) {
    BOPDS_MapOfPaveBlock ret = new BOPDS_MapOfPaveBlock(OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Assign(swigCPtr, this, BOPDS_MapOfPaveBlock.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int N) {
    OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_ReSize(swigCPtr, this, N);
  }

  public long Add( BOPDS_PaveBlock  K) {
    return OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Add(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(K) , K);
  }

  public  BOPDS_PaveBlock  Added( BOPDS_PaveBlock  K) {
    return new BOPDS_PaveBlock ( OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Added(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(K) , K), true );
  }

  public long Contains( BOPDS_PaveBlock  K) {
    return OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Contains__SWIG_0(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(K) , K);
  }

  public long Remove( BOPDS_PaveBlock  K) {
    return OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Remove(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(K) , K);
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Size(swigCPtr, this);
  }

  public long IsEqual( BOPDS_MapOfPaveBlock  theOther) {
    return OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_IsEqual(swigCPtr, this, BOPDS_MapOfPaveBlock.getCPtr(theOther), theOther);
  }

  public long Contains( BOPDS_MapOfPaveBlock  theOther) {
    return OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Contains__SWIG_1(swigCPtr, this, BOPDS_MapOfPaveBlock.getCPtr(theOther), theOther);
  }

  public void Union( BOPDS_MapOfPaveBlock  theLeft,  BOPDS_MapOfPaveBlock  theRight) {
    OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Union(swigCPtr, this, BOPDS_MapOfPaveBlock.getCPtr(theLeft), theLeft, BOPDS_MapOfPaveBlock.getCPtr(theRight), theRight);
  }

  public long Unite( BOPDS_MapOfPaveBlock  theOther) {
    return OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Unite(swigCPtr, this, BOPDS_MapOfPaveBlock.getCPtr(theOther), theOther);
  }

  public long HasIntersection( BOPDS_MapOfPaveBlock  theMap) {
    return OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_HasIntersection(swigCPtr, this, BOPDS_MapOfPaveBlock.getCPtr(theMap), theMap);
  }

  public void Intersection( BOPDS_MapOfPaveBlock  theLeft,  BOPDS_MapOfPaveBlock  theRight) {
    OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Intersection(swigCPtr, this, BOPDS_MapOfPaveBlock.getCPtr(theLeft), theLeft, BOPDS_MapOfPaveBlock.getCPtr(theRight), theRight);
  }

  public long Intersect( BOPDS_MapOfPaveBlock  theOther) {
    return OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Intersect(swigCPtr, this, BOPDS_MapOfPaveBlock.getCPtr(theOther), theOther);
  }

  public void Subtraction( BOPDS_MapOfPaveBlock  theLeft,  BOPDS_MapOfPaveBlock  theRight) {
    OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Subtraction(swigCPtr, this, BOPDS_MapOfPaveBlock.getCPtr(theLeft), theLeft, BOPDS_MapOfPaveBlock.getCPtr(theRight), theRight);
  }

  public long Subtract( BOPDS_MapOfPaveBlock  theOther) {
    return OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Subtract(swigCPtr, this, BOPDS_MapOfPaveBlock.getCPtr(theOther), theOther);
  }

  public void Difference( BOPDS_MapOfPaveBlock  theLeft,  BOPDS_MapOfPaveBlock  theRight) {
    OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Difference(swigCPtr, this, BOPDS_MapOfPaveBlock.getCPtr(theLeft), theLeft, BOPDS_MapOfPaveBlock.getCPtr(theRight), theRight);
  }

  public long Differ( BOPDS_MapOfPaveBlock  theOther) {
    return OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Differ(swigCPtr, this, BOPDS_MapOfPaveBlock.getCPtr(theOther), theOther);
  }

}
