package opencascade;

public class TDF_IDList_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_IDList_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_IDList_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_IDList_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_IDList_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDF_IDList_Iterator(TDF_IDList arg0) {
    this(OCCwrapJavaJNI.new_TDF_IDList_Iterator(TDF_IDList.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TDF_IDList_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TDF_IDList_Iterator_Next(swigCPtr, this);
  }

  public  Standard_GUID  Value() {
    Standard_GUID ret = new Standard_GUID(OCCwrapJavaJNI.TDF_IDList_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public Standard_GUID ChangeValue() {
    Standard_GUID ret = new Standard_GUID(OCCwrapJavaJNI.TDF_IDList_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new Standard_GUID.CRef (ret);
  }

}
