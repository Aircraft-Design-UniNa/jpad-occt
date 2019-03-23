package opencascade;

public class Plate_Array1OfPinpointConstraint_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Plate_Array1OfPinpointConstraint_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Plate_Array1OfPinpointConstraint_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Plate_Array1OfPinpointConstraint_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Plate_Array1OfPinpointConstraint_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plate_Array1OfPinpointConstraint_Iterator(Plate_Array1OfPinpointConstraint arg0) {
    this(OCCwrapJavaJNI.new_Plate_Array1OfPinpointConstraint_Iterator(Plate_Array1OfPinpointConstraint.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_Iterator_Next(swigCPtr, this);
  }

  public  Plate_PinpointConstraint  Value() {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public Plate_PinpointConstraint ChangeValue() {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new Plate_PinpointConstraint.CRef (ret);
  }

}
