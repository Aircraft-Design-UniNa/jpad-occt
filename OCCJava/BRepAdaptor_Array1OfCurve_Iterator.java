package opencascade;

public class BRepAdaptor_Array1OfCurve_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepAdaptor_Array1OfCurve_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepAdaptor_Array1OfCurve_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepAdaptor_Array1OfCurve_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepAdaptor_Array1OfCurve_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BRepAdaptor_Array1OfCurve_Iterator(BRepAdaptor_Array1OfCurve arg0) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_Array1OfCurve_Iterator(BRepAdaptor_Array1OfCurve.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_Iterator_Next(swigCPtr, this);
  }

  public  BRepAdaptor_Curve  Value() {
    BRepAdaptor_Curve ret = new BRepAdaptor_Curve(OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_Iterator_Value(swigCPtr, this), false, this);
    return ret;
  }

  public  BRepAdaptor_Curve  ChangeValue() {
    BRepAdaptor_Curve ret = new BRepAdaptor_Curve(OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret;
  }

}
