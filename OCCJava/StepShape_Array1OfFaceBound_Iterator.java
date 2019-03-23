package opencascade;

public class StepShape_Array1OfFaceBound_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepShape_Array1OfFaceBound_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepShape_Array1OfFaceBound_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepShape_Array1OfFaceBound_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepShape_Array1OfFaceBound_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepShape_Array1OfFaceBound_Iterator(StepShape_Array1OfFaceBound arg0) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfFaceBound_Iterator(StepShape_Array1OfFaceBound.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.StepShape_Array1OfFaceBound_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.StepShape_Array1OfFaceBound_Iterator_Next(swigCPtr, this);
  }

  public  StepShape_FaceBound  Value() {
    return new StepShape_FaceBound ( OCCwrapJavaJNI.StepShape_Array1OfFaceBound_Iterator_Value(swigCPtr, this), true );
  }

  public  StepShape_FaceBound  ChangeValue() {
    return new StepShape_FaceBound ( OCCwrapJavaJNI.StepShape_Array1OfFaceBound_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
