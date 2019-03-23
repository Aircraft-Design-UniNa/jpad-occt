package opencascade;

public class StepShape_Array1OfGeometricSetSelect_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepShape_Array1OfGeometricSetSelect_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepShape_Array1OfGeometricSetSelect_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepShape_Array1OfGeometricSetSelect_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepShape_Array1OfGeometricSetSelect_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepShape_Array1OfGeometricSetSelect_Iterator(StepShape_Array1OfGeometricSetSelect arg0) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfGeometricSetSelect_Iterator(StepShape_Array1OfGeometricSetSelect.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_Iterator_Next(swigCPtr, this);
  }

  public  StepShape_GeometricSetSelect  Value() {
    StepShape_GeometricSetSelect ret = new StepShape_GeometricSetSelect(OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_Iterator_Value(swigCPtr, this), false, this);
    return ret;
  }

  public  StepShape_GeometricSetSelect  ChangeValue() {
    StepShape_GeometricSetSelect ret = new StepShape_GeometricSetSelect(OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret;
  }

}
