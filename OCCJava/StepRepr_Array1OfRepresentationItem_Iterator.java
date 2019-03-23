package opencascade;

public class StepRepr_Array1OfRepresentationItem_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepRepr_Array1OfRepresentationItem_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepRepr_Array1OfRepresentationItem_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepRepr_Array1OfRepresentationItem_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepRepr_Array1OfRepresentationItem_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepRepr_Array1OfRepresentationItem_Iterator(StepRepr_Array1OfRepresentationItem arg0) {
    this(OCCwrapJavaJNI.new_StepRepr_Array1OfRepresentationItem_Iterator(StepRepr_Array1OfRepresentationItem.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_Iterator_Next(swigCPtr, this);
  }

  public  StepRepr_RepresentationItem  Value() {
    return new StepRepr_RepresentationItem ( OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_Iterator_Value(swigCPtr, this), true );
  }

  public  StepRepr_RepresentationItem  ChangeValue() {
    return new StepRepr_RepresentationItem ( OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
