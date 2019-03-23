package opencascade;

public class TColStd_Array1OfAsciiString_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_Array1OfAsciiString_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_Array1OfAsciiString_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_Array1OfAsciiString_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_Array1OfAsciiString_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_Array1OfAsciiString_Iterator(TColStd_Array1OfAsciiString arg0) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfAsciiString_Iterator(TColStd_Array1OfAsciiString.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TColStd_Array1OfAsciiString_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TColStd_Array1OfAsciiString_Iterator_Next(swigCPtr, this);
  }

  public  TCollection_AsciiString  Value() {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TColStd_Array1OfAsciiString_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public TCollection_AsciiString ChangeValue() {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TColStd_Array1OfAsciiString_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new TCollection_AsciiString.CRef (ret);
  }

}
