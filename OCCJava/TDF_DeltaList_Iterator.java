package opencascade;

public class TDF_DeltaList_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_DeltaList_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_DeltaList_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_DeltaList_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_DeltaList_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDF_DeltaList_Iterator(TDF_DeltaList arg0) {
    this(OCCwrapJavaJNI.new_TDF_DeltaList_Iterator(TDF_DeltaList.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TDF_DeltaList_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TDF_DeltaList_Iterator_Next(swigCPtr, this);
  }

  public  TDF_Delta  Value() {
    return new TDF_Delta ( OCCwrapJavaJNI.TDF_DeltaList_Iterator_Value(swigCPtr, this), true );
  }

  public  TDF_Delta  ChangeValue() {
    return new TDF_Delta ( OCCwrapJavaJNI.TDF_DeltaList_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
