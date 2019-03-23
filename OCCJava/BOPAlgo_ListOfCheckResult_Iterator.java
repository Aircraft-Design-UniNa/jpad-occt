package opencascade;

public class BOPAlgo_ListOfCheckResult_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BOPAlgo_ListOfCheckResult_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BOPAlgo_ListOfCheckResult_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BOPAlgo_ListOfCheckResult_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPAlgo_ListOfCheckResult_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BOPAlgo_ListOfCheckResult_Iterator(BOPAlgo_ListOfCheckResult arg0) {
    this(OCCwrapJavaJNI.new_BOPAlgo_ListOfCheckResult_Iterator(BOPAlgo_ListOfCheckResult.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_Iterator_Next(swigCPtr, this);
  }

  public  BOPAlgo_CheckResult  Value() {
    BOPAlgo_CheckResult ret = new BOPAlgo_CheckResult(OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_Iterator_Value(swigCPtr, this), false, this);
    return ret;
  }

  public  BOPAlgo_CheckResult  ChangeValue() {
    BOPAlgo_CheckResult ret = new BOPAlgo_CheckResult(OCCwrapJavaJNI.BOPAlgo_ListOfCheckResult_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret;
  }

}
