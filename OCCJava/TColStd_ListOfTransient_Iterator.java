package opencascade;

public class TColStd_ListOfTransient_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_ListOfTransient_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_ListOfTransient_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_ListOfTransient_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_ListOfTransient_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_ListOfTransient_Iterator(TColStd_ListOfTransient arg0) {
    this(OCCwrapJavaJNI.new_TColStd_ListOfTransient_Iterator(TColStd_ListOfTransient.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TColStd_ListOfTransient_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TColStd_ListOfTransient_Iterator_Next(swigCPtr, this);
  }

  public  Standard_Transient  Value() {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_ListOfTransient_Iterator_Value(swigCPtr, this), true );
  }

  public  Standard_Transient  ChangeValue() {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_ListOfTransient_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
