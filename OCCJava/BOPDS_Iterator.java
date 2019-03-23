package opencascade;

/**
 *  The class BOPDS_Iterator is
 *  1.to compute intersections between BRep sub-shapes
 *  of arguments of an operation (see the class BOPDS_DS)
 *  in terms of theirs bounding boxes
 *  2.provides interface to iterare the pairs of
 *  intersected sub-shapes of given type
 */
public class BOPDS_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BOPDS_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BOPDS_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BOPDS_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPDS_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty contructor
   */
  public BOPDS_Iterator() {
    this(OCCwrapJavaJNI.new_BOPDS_Iterator__SWIG_0(), true);
  }

  public BOPDS_Iterator( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BOPDS_Iterator__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  /**
   *  Modifier
   *  Sets the data structure <pDS> to process
   */
  public void SetDS(BOPDS_DS pDS) {
    OCCwrapJavaJNI.BOPDS_Iterator_SetDS(swigCPtr, this, BOPDS_DS.getCPtr(pDS), pDS);
  }

  /**
   *  Selector
   *  Returns the data structure
   */
  public  BOPDS_DS  DS() {
    BOPDS_DS ret = new BOPDS_DS(OCCwrapJavaJNI.BOPDS_Iterator_DS(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Initializes the  iterator
   *  theType1 - the first type of shape
   *  theType2 - the second type of shape
   */
  public void Initialize(TopAbs_ShapeEnum theType1, TopAbs_ShapeEnum theType2) {
    OCCwrapJavaJNI.BOPDS_Iterator_Initialize(swigCPtr, this, theType1.swigValue(), theType2.swigValue());
  }

  /**
   *  Returns  true if still there are pairs
   *  of intersected shapes
   */
  public long More() {
    return OCCwrapJavaJNI.BOPDS_Iterator_More(swigCPtr, this);
  }

  /**
   *  Moves iterations ahead
   */
  public void Next() {
    OCCwrapJavaJNI.BOPDS_Iterator_Next(swigCPtr, this);
  }

  /**
   *  Returns indices (DS) of intersected shapes
   *  theIndex1 - the index of the first shape
   *  theIndex2 - the index of the second shape
   */
  public void Value(int[] theIndex1, int[] theIndex2) {
    OCCwrapJavaJNI.BOPDS_Iterator_Value(swigCPtr, this, theIndex1, theIndex2);
  }

  /**
   *  Perform the intersection algorithm and prepare
   *  the results to be used
   */
  public void Prepare( IntTools_Context  theCtx, long theCheckOBB, double theFuzzyValue) {
    OCCwrapJavaJNI.BOPDS_Iterator_Prepare__SWIG_0(swigCPtr, this,  IntTools_Context.getCPtr(theCtx) , theCtx, theCheckOBB, theFuzzyValue);
  }

  public void Prepare( IntTools_Context  theCtx, long theCheckOBB) {
    OCCwrapJavaJNI.BOPDS_Iterator_Prepare__SWIG_1(swigCPtr, this,  IntTools_Context.getCPtr(theCtx) , theCtx, theCheckOBB);
  }

  public void Prepare( IntTools_Context  theCtx) {
    OCCwrapJavaJNI.BOPDS_Iterator_Prepare__SWIG_2(swigCPtr, this,  IntTools_Context.getCPtr(theCtx) , theCtx);
  }

  public void Prepare() {
    OCCwrapJavaJNI.BOPDS_Iterator_Prepare__SWIG_3(swigCPtr, this);
  }

  /**
   *  Returns the number of intersections founded
   */
  public int ExpectedLength() {
    return OCCwrapJavaJNI.BOPDS_Iterator_ExpectedLength(swigCPtr, this);
  }

  /**
   *  Returns the block length
   */
  public int BlockLength() {
    return OCCwrapJavaJNI.BOPDS_Iterator_BlockLength(swigCPtr, this);
  }

  /**
   *  Set the flag of parallel processing
   *  if <theFlag> is true  the parallel processing is switched on
   *  if <theFlag> is false the parallel processing is switched off
   */
  public void SetRunParallel(long theFlag) {
    OCCwrapJavaJNI.BOPDS_Iterator_SetRunParallel(swigCPtr, this, theFlag);
  }

  /**
   *  Returns the flag of parallel processing
   */
  public long RunParallel() {
    return OCCwrapJavaJNI.BOPDS_Iterator_RunParallel(swigCPtr, this);
  }

}
