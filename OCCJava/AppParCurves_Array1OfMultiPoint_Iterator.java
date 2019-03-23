package opencascade;

public class AppParCurves_Array1OfMultiPoint_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  AppParCurves_Array1OfMultiPoint_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  AppParCurves_Array1OfMultiPoint_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(AppParCurves_Array1OfMultiPoint_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_AppParCurves_Array1OfMultiPoint_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AppParCurves_Array1OfMultiPoint_Iterator(AppParCurves_Array1OfMultiPoint arg0) {
    this(OCCwrapJavaJNI.new_AppParCurves_Array1OfMultiPoint_Iterator(AppParCurves_Array1OfMultiPoint.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_Iterator_Next(swigCPtr, this);
  }

  public  AppParCurves_MultiPoint  Value() {
    AppParCurves_MultiPoint ret = new AppParCurves_MultiPoint(OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_Iterator_Value(swigCPtr, this), false, this);
    return ret;
  }

  public  AppParCurves_MultiPoint  ChangeValue() {
    AppParCurves_MultiPoint ret = new AppParCurves_MultiPoint(OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret;
  }

}
