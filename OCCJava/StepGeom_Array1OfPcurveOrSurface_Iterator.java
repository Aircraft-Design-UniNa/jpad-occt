package opencascade;

public class StepGeom_Array1OfPcurveOrSurface_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepGeom_Array1OfPcurveOrSurface_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepGeom_Array1OfPcurveOrSurface_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepGeom_Array1OfPcurveOrSurface_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepGeom_Array1OfPcurveOrSurface_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepGeom_Array1OfPcurveOrSurface_Iterator(StepGeom_Array1OfPcurveOrSurface arg0) {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfPcurveOrSurface_Iterator(StepGeom_Array1OfPcurveOrSurface.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_Iterator_Next(swigCPtr, this);
  }

  public  StepGeom_PcurveOrSurface  Value() {
    StepGeom_PcurveOrSurface ret = new StepGeom_PcurveOrSurface(OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_Iterator_Value(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_PcurveOrSurface  ChangeValue() {
    StepGeom_PcurveOrSurface ret = new StepGeom_PcurveOrSurface(OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret;
  }

}
