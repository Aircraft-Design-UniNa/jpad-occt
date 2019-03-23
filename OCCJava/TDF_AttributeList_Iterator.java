package opencascade;

public class TDF_AttributeList_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_AttributeList_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_AttributeList_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_AttributeList_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_AttributeList_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDF_AttributeList_Iterator(TDF_AttributeList arg0) {
    this(OCCwrapJavaJNI.new_TDF_AttributeList_Iterator(TDF_AttributeList.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TDF_AttributeList_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TDF_AttributeList_Iterator_Next(swigCPtr, this);
  }

  public  TDF_Attribute  Value() {
    return new TDF_Attribute ( OCCwrapJavaJNI.TDF_AttributeList_Iterator_Value(swigCPtr, this), true );
  }

  public  TDF_Attribute  ChangeValue() {
    return new TDF_Attribute ( OCCwrapJavaJNI.TDF_AttributeList_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
