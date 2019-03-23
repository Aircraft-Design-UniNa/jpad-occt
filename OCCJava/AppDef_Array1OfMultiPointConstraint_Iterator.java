package opencascade;

public class AppDef_Array1OfMultiPointConstraint_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  AppDef_Array1OfMultiPointConstraint_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  AppDef_Array1OfMultiPointConstraint_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(AppDef_Array1OfMultiPointConstraint_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_AppDef_Array1OfMultiPointConstraint_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AppDef_Array1OfMultiPointConstraint_Iterator(AppDef_Array1OfMultiPointConstraint arg0) {
    this(OCCwrapJavaJNI.new_AppDef_Array1OfMultiPointConstraint_Iterator(AppDef_Array1OfMultiPointConstraint.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_Iterator_Next(swigCPtr, this);
  }

  public  AppDef_MultiPointConstraint  Value() {
    AppDef_MultiPointConstraint ret = new AppDef_MultiPointConstraint(OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_Iterator_Value(swigCPtr, this), false, this);
    return ret;
  }

  public  AppDef_MultiPointConstraint  ChangeValue() {
    AppDef_MultiPointConstraint ret = new AppDef_MultiPointConstraint(OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret;
  }

}
