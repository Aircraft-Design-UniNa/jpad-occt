package opencascade;

public class TColStd_SequenceOfHAsciiString_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_SequenceOfHAsciiString_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_SequenceOfHAsciiString_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_SequenceOfHAsciiString_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_SequenceOfHAsciiString_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_SequenceOfHAsciiString_Iterator(TColStd_SequenceOfHAsciiString arg0) {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfHAsciiString_Iterator(TColStd_SequenceOfHAsciiString.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Iterator_Next(swigCPtr, this);
  }

  public  TCollection_HAsciiString  Value() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Iterator_Value(swigCPtr, this), true );
  }

  public  TCollection_HAsciiString  ChangeValue() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
