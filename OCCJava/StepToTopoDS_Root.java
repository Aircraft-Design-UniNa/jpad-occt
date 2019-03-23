package opencascade;

/**
 *  This class implements the common services for
 *  all classes of StepToTopoDS which report error
 *  and sets and returns precision.
 */
public class StepToTopoDS_Root {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepToTopoDS_Root(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepToTopoDS_Root(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepToTopoDS_Root obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_Root(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public long IsDone() {
    return OCCwrapJavaJNI.StepToTopoDS_Root_IsDone(swigCPtr, this);
  }

  /**
   *  Returns the value of "MyPrecision"
   */
  public double Precision() {
    return OCCwrapJavaJNI.StepToTopoDS_Root_Precision(swigCPtr, this);
  }

  /**
   *  Sets the value of "MyPrecision"
   */
  public void SetPrecision(double preci) {
    OCCwrapJavaJNI.StepToTopoDS_Root_SetPrecision(swigCPtr, this, preci);
  }

  /**
   *  Returns the value of "MaxTol"
   */
  public double MaxTol() {
    return OCCwrapJavaJNI.StepToTopoDS_Root_MaxTol(swigCPtr, this);
  }

  /**
   *  Sets the value of MaxTol
   */
  public void SetMaxTol(double maxpreci) {
    OCCwrapJavaJNI.StepToTopoDS_Root_SetMaxTol(swigCPtr, this, maxpreci);
  }

}
