package opencascade;

public class TDF_LabelMap_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_LabelMap_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_LabelMap_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_LabelMap_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_LabelMap_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDF_LabelMap_Iterator(TDF_LabelMap arg0) {
    this(OCCwrapJavaJNI.new_TDF_LabelMap_Iterator(TDF_LabelMap.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TDF_LabelMap_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TDF_LabelMap_Iterator_Next(swigCPtr, this);
  }

  public  TDF_Label  Value() {
    TDF_Label ret = new TDF_Label(OCCwrapJavaJNI.TDF_LabelMap_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public TDF_Label ChangeValue() {
    TDF_Label ret = new TDF_Label(OCCwrapJavaJNI.TDF_LabelMap_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new TDF_Label.CRef (ret);
  }

}
