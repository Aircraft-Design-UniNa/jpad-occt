package opencascade;

public class TColStd_Array1OfByte_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_Array1OfByte_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_Array1OfByte_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_Array1OfByte_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_Array1OfByte_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_Array1OfByte_Iterator(TColStd_Array1OfByte arg0) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfByte_Iterator(TColStd_Array1OfByte.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TColStd_Array1OfByte_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TColStd_Array1OfByte_Iterator_Next(swigCPtr, this);
  }

  public  short  Value() { return OCCwrapJavaJNI.TColStd_Array1OfByte_Iterator_Value(swigCPtr, this); }

  public short[] ChangeValue() {return OCCwrapJavaJNI.TColStd_Array1OfByte_Iterator_ChangeValue(swigCPtr, this);}

}
