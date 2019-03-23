package opencascade;

public class TDF_AttributeDataMap_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_AttributeDataMap_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_AttributeDataMap_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_AttributeDataMap_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_AttributeDataMap_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDF_AttributeDataMap_Iterator(TDF_AttributeDataMap arg0) {
    this(OCCwrapJavaJNI.new_TDF_AttributeDataMap_Iterator(TDF_AttributeDataMap.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TDF_AttributeDataMap_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TDF_AttributeDataMap_Iterator_Next(swigCPtr, this);
  }

  public  TDF_Attribute  Key() {
    return new TDF_Attribute ( OCCwrapJavaJNI.TDF_AttributeDataMap_Iterator_Key(swigCPtr, this), true );
  }

  public  TDF_Attribute  Value() {
    return new TDF_Attribute ( OCCwrapJavaJNI.TDF_AttributeDataMap_Iterator_Value(swigCPtr, this), true );
  }

  public  TDF_Attribute  ChangeValue() {
    return new TDF_Attribute ( OCCwrapJavaJNI.TDF_AttributeDataMap_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
