package opencascade;

public class StepShape_Array1OfConnectedEdgeSet_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepShape_Array1OfConnectedEdgeSet_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepShape_Array1OfConnectedEdgeSet_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepShape_Array1OfConnectedEdgeSet_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepShape_Array1OfConnectedEdgeSet_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepShape_Array1OfConnectedEdgeSet_Iterator(StepShape_Array1OfConnectedEdgeSet arg0) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfConnectedEdgeSet_Iterator(StepShape_Array1OfConnectedEdgeSet.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_Iterator_Next(swigCPtr, this);
  }

  public  StepShape_ConnectedEdgeSet  Value() {
    return new StepShape_ConnectedEdgeSet ( OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_Iterator_Value(swigCPtr, this), true );
  }

  public  StepShape_ConnectedEdgeSet  ChangeValue() {
    return new StepShape_ConnectedEdgeSet ( OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
