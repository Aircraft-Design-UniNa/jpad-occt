package opencascade;

public class TDocStd_SequenceOfDocument_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDocStd_SequenceOfDocument_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDocStd_SequenceOfDocument_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDocStd_SequenceOfDocument_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDocStd_SequenceOfDocument_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDocStd_SequenceOfDocument_Iterator(TDocStd_SequenceOfDocument arg0) {
    this(OCCwrapJavaJNI.new_TDocStd_SequenceOfDocument_Iterator(TDocStd_SequenceOfDocument.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Iterator_Next(swigCPtr, this);
  }

  public  TDocStd_Document  Value() {
    return new TDocStd_Document ( OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Iterator_Value(swigCPtr, this), true );
  }

  public  TDocStd_Document  ChangeValue() {
    return new TDocStd_Document ( OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
