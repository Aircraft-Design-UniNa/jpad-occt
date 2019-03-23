package opencascade;

public class TColStd_MapOfTransient_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_MapOfTransient_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_MapOfTransient_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_MapOfTransient_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_MapOfTransient_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_MapOfTransient_Iterator(TColStd_MapOfTransient arg0) {
    this(OCCwrapJavaJNI.new_TColStd_MapOfTransient_Iterator(TColStd_MapOfTransient.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TColStd_MapOfTransient_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TColStd_MapOfTransient_Iterator_Next(swigCPtr, this);
  }

  public  Standard_Transient  Value() {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_MapOfTransient_Iterator_Value(swigCPtr, this), true );
  }

}
