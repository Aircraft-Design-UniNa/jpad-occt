package opencascade;

public class Plate_SequenceOfPinpointConstraint_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Plate_SequenceOfPinpointConstraint_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Plate_SequenceOfPinpointConstraint_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Plate_SequenceOfPinpointConstraint_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Plate_SequenceOfPinpointConstraint_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plate_SequenceOfPinpointConstraint_Iterator(Plate_SequenceOfPinpointConstraint arg0) {
    this(OCCwrapJavaJNI.new_Plate_SequenceOfPinpointConstraint_Iterator(Plate_SequenceOfPinpointConstraint.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Iterator_Next(swigCPtr, this);
  }

  public  Plate_PinpointConstraint  Value() {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public Plate_PinpointConstraint ChangeValue() {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new Plate_PinpointConstraint.CRef (ret);
  }

}
