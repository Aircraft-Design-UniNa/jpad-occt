package opencascade;

public class StepShape_Array1OfEdge_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepShape_Array1OfEdge_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepShape_Array1OfEdge_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepShape_Array1OfEdge_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepShape_Array1OfEdge_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepShape_Array1OfEdge_Iterator(StepShape_Array1OfEdge arg0) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfEdge_Iterator(StepShape_Array1OfEdge.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.StepShape_Array1OfEdge_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.StepShape_Array1OfEdge_Iterator_Next(swigCPtr, this);
  }

  public  StepShape_Edge  Value() {
    return new StepShape_Edge ( OCCwrapJavaJNI.StepShape_Array1OfEdge_Iterator_Value(swigCPtr, this), true );
  }

  public  StepShape_Edge  ChangeValue() {
    return new StepShape_Edge ( OCCwrapJavaJNI.StepShape_Array1OfEdge_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
