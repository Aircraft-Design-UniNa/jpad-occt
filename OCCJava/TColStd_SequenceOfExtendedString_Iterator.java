package opencascade;

public class TColStd_SequenceOfExtendedString_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_SequenceOfExtendedString_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_SequenceOfExtendedString_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_SequenceOfExtendedString_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_SequenceOfExtendedString_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_SequenceOfExtendedString_Iterator(TColStd_SequenceOfExtendedString arg0) {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfExtendedString_Iterator(TColStd_SequenceOfExtendedString.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Iterator_Next(swigCPtr, this);
  }

  public  TCollection_ExtendedString  Value() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public TCollection_ExtendedString ChangeValue() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new TCollection_ExtendedString.CRef (ret);
  }

}
