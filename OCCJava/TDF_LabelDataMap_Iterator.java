package opencascade;

public class TDF_LabelDataMap_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_LabelDataMap_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_LabelDataMap_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_LabelDataMap_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_LabelDataMap_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDF_LabelDataMap_Iterator(TDF_LabelDataMap arg0) {
    this(OCCwrapJavaJNI.new_TDF_LabelDataMap_Iterator(TDF_LabelDataMap.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TDF_LabelDataMap_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TDF_LabelDataMap_Iterator_Next(swigCPtr, this);
  }

  public  TDF_Label  Key() {
    TDF_Label ret = new TDF_Label(OCCwrapJavaJNI.TDF_LabelDataMap_Iterator_Key(swigCPtr, this), true);
    return ret;
  }

  public  TDF_Label  Value() {
    TDF_Label ret = new TDF_Label(OCCwrapJavaJNI.TDF_LabelDataMap_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public TDF_Label ChangeValue() {
    TDF_Label ret = new TDF_Label(OCCwrapJavaJNI.TDF_LabelDataMap_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new TDF_Label.CRef (ret);
  }

}
