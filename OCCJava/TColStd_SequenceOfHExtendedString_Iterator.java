package opencascade;

public class TColStd_SequenceOfHExtendedString_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_SequenceOfHExtendedString_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_SequenceOfHExtendedString_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_SequenceOfHExtendedString_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_SequenceOfHExtendedString_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_SequenceOfHExtendedString_Iterator(TColStd_SequenceOfHExtendedString arg0) {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfHExtendedString_Iterator(TColStd_SequenceOfHExtendedString.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Iterator_Next(swigCPtr, this);
  }

  public  TCollection_HExtendedString  Value() {
    return new TCollection_HExtendedString ( OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Iterator_Value(swigCPtr, this), true );
  }

  public  TCollection_HExtendedString  ChangeValue() {
    return new TCollection_HExtendedString ( OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
