package opencascade;

public class BOPAlgo_ListOfCheckResult {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BOPAlgo_ListOfCheckResult(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BOPAlgo_ListOfCheckResult(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BOPAlgo_ListOfCheckResult obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPAlgo_ListOfCheckResult(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BOPAlgo_ListOfCheckResult() {
    this(OCCwrapJavaJNI.new_BOPAlgo_ListOfCheckResult__SWIG_0(), true);
  }

  public BOPAlgo_ListOfCheckResult( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BOPAlgo_ListOfCheckResult__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public BOPAlgo_ListOfCheckResult( BOPAlgo_ListOfCheckResult  theOther) {
    this(OCCwrapJavaJNI.new_BOPAlgo_ListOfCheckResult__SWIG_2(BOPAlgo_ListOfCheckResult.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_Size(swigCPtr, this);
  }

  public  BOPAlgo_ListOfCheckResult  Assign( BOPAlgo_ListOfCheckResult  theOther) {
    BOPAlgo_ListOfCheckResult ret = new BOPAlgo_ListOfCheckResult(OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_Assign(swigCPtr, this, BOPAlgo_ListOfCheckResult.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_Clear__SWIG_1(swigCPtr, this);
  }

  public  BOPAlgo_CheckResult  First() {
    BOPAlgo_CheckResult ret = new BOPAlgo_CheckResult(OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_First(swigCPtr, this), false, this);
    return ret;
  }

  public  BOPAlgo_CheckResult  Last() {
    BOPAlgo_CheckResult ret = new BOPAlgo_CheckResult(OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_Last(swigCPtr, this), false, this);
    return ret;
  }

  public  BOPAlgo_CheckResult  Append( BOPAlgo_CheckResult  theItem) {
    BOPAlgo_CheckResult ret = new BOPAlgo_CheckResult(OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_Append__SWIG_0(swigCPtr, this, BOPAlgo_CheckResult.getCPtr(theItem), theItem), false, this);
    return ret;
  }

  public void Append( BOPAlgo_CheckResult  theItem,  BOPAlgo_ListOfCheckResult_Iterator  theIter) {
    OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_Append__SWIG_1(swigCPtr, this, BOPAlgo_CheckResult.getCPtr(theItem), theItem,  BOPAlgo_ListOfCheckResult_Iterator.getCPtr(theIter) , theIter);
  }

  public void Append( BOPAlgo_ListOfCheckResult  theOther) {
    OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_Append__SWIG_2(swigCPtr, this, BOPAlgo_ListOfCheckResult.getCPtr(theOther), theOther);
  }

  public  BOPAlgo_CheckResult  Prepend( BOPAlgo_CheckResult  theItem) {
    BOPAlgo_CheckResult ret = new BOPAlgo_CheckResult(OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_Prepend__SWIG_0(swigCPtr, this, BOPAlgo_CheckResult.getCPtr(theItem), theItem), false, this);
    return ret;
  }

  public void Prepend( BOPAlgo_ListOfCheckResult  theOther) {
    OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_Prepend__SWIG_1(swigCPtr, this, BOPAlgo_ListOfCheckResult.getCPtr(theOther), theOther);
  }

  public void RemoveFirst() {
    OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_RemoveFirst(swigCPtr, this);
  }

  public void Remove( BOPAlgo_ListOfCheckResult_Iterator  theIter) {
    OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_Remove(swigCPtr, this,  BOPAlgo_ListOfCheckResult_Iterator.getCPtr(theIter) , theIter);
  }

  public  BOPAlgo_CheckResult  InsertBefore( BOPAlgo_CheckResult  theItem,  BOPAlgo_ListOfCheckResult_Iterator  theIter) {
    BOPAlgo_CheckResult ret = new BOPAlgo_CheckResult(OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_InsertBefore__SWIG_0(swigCPtr, this, BOPAlgo_CheckResult.getCPtr(theItem), theItem,  BOPAlgo_ListOfCheckResult_Iterator.getCPtr(theIter) , theIter), false, this);
    return ret;
  }

  public void InsertBefore( BOPAlgo_ListOfCheckResult  theOther,  BOPAlgo_ListOfCheckResult_Iterator  theIter) {
    OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_InsertBefore__SWIG_1(swigCPtr, this, BOPAlgo_ListOfCheckResult.getCPtr(theOther), theOther,  BOPAlgo_ListOfCheckResult_Iterator.getCPtr(theIter) , theIter);
  }

  public  BOPAlgo_CheckResult  InsertAfter( BOPAlgo_CheckResult  theItem,  BOPAlgo_ListOfCheckResult_Iterator  theIter) {
    BOPAlgo_CheckResult ret = new BOPAlgo_CheckResult(OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_InsertAfter__SWIG_0(swigCPtr, this, BOPAlgo_CheckResult.getCPtr(theItem), theItem,  BOPAlgo_ListOfCheckResult_Iterator.getCPtr(theIter) , theIter), false, this);
    return ret;
  }

  public void InsertAfter( BOPAlgo_ListOfCheckResult  theOther,  BOPAlgo_ListOfCheckResult_Iterator  theIter) {
    OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_InsertAfter__SWIG_1(swigCPtr, this, BOPAlgo_ListOfCheckResult.getCPtr(theOther), theOther,  BOPAlgo_ListOfCheckResult_Iterator.getCPtr(theIter) , theIter);
  }

  public void Reverse() {
    OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_Reverse(swigCPtr, this);
  }

}
