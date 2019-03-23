package opencascade;

public class StepGeom_Array1OfCompositeCurveSegment_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepGeom_Array1OfCompositeCurveSegment_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepGeom_Array1OfCompositeCurveSegment_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepGeom_Array1OfCompositeCurveSegment_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepGeom_Array1OfCompositeCurveSegment_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepGeom_Array1OfCompositeCurveSegment_Iterator(StepGeom_Array1OfCompositeCurveSegment arg0) {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfCompositeCurveSegment_Iterator(StepGeom_Array1OfCompositeCurveSegment.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_Iterator_Next(swigCPtr, this);
  }

  public  StepGeom_CompositeCurveSegment  Value() {
    return new StepGeom_CompositeCurveSegment ( OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_Iterator_Value(swigCPtr, this), true );
  }

  public  StepGeom_CompositeCurveSegment  ChangeValue() {
    return new StepGeom_CompositeCurveSegment ( OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
