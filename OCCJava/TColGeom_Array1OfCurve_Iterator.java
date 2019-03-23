package opencascade;

public class TColGeom_Array1OfCurve_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColGeom_Array1OfCurve_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColGeom_Array1OfCurve_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColGeom_Array1OfCurve_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColGeom_Array1OfCurve_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColGeom_Array1OfCurve_Iterator(TColGeom_Array1OfCurve arg0) {
    this(OCCwrapJavaJNI.new_TColGeom_Array1OfCurve_Iterator(TColGeom_Array1OfCurve.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TColGeom_Array1OfCurve_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TColGeom_Array1OfCurve_Iterator_Next(swigCPtr, this);
  }

  public  Geom_Curve  Value() {
    return new Geom_Curve ( OCCwrapJavaJNI.TColGeom_Array1OfCurve_Iterator_Value(swigCPtr, this), true );
  }

  public  Geom_Curve  ChangeValue() {
    return new Geom_Curve ( OCCwrapJavaJNI.TColGeom_Array1OfCurve_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
