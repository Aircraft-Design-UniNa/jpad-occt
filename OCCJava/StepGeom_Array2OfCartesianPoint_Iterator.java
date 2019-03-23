package opencascade;

public class StepGeom_Array2OfCartesianPoint_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepGeom_Array2OfCartesianPoint_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepGeom_Array2OfCartesianPoint_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepGeom_Array2OfCartesianPoint_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepGeom_Array2OfCartesianPoint_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepGeom_Array2OfCartesianPoint_Iterator(StepGeom_Array2OfCartesianPoint arg0) {
    this(OCCwrapJavaJNI.new_StepGeom_Array2OfCartesianPoint_Iterator(StepGeom_Array2OfCartesianPoint.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.StepGeom_Array2OfCartesianPoint_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.StepGeom_Array2OfCartesianPoint_Iterator_Next(swigCPtr, this);
  }

  public  StepGeom_CartesianPoint  Value() {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_Array2OfCartesianPoint_Iterator_Value(swigCPtr, this), true );
  }

  public  StepGeom_CartesianPoint  ChangeValue() {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_Array2OfCartesianPoint_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
