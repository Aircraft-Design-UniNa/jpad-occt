package opencascade;

public class ShapeExtend_DataMapOfTransientListOfMsg_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeExtend_DataMapOfTransientListOfMsg_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeExtend_DataMapOfTransientListOfMsg_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeExtend_DataMapOfTransientListOfMsg_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeExtend_DataMapOfTransientListOfMsg_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ShapeExtend_DataMapOfTransientListOfMsg_Iterator(ShapeExtend_DataMapOfTransientListOfMsg arg0) {
    this(OCCwrapJavaJNI.new_ShapeExtend_DataMapOfTransientListOfMsg_Iterator(ShapeExtend_DataMapOfTransientListOfMsg.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.ShapeExtend_DataMapOfTransientListOfMsg_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.ShapeExtend_DataMapOfTransientListOfMsg_Iterator_Next(swigCPtr, this);
  }

  public  Standard_Transient  Key() {
    return new Standard_Transient ( OCCwrapJavaJNI.ShapeExtend_DataMapOfTransientListOfMsg_Iterator_Key(swigCPtr, this), true );
  }

  public  Message_ListOfMsg  Value() {
    Message_ListOfMsg ret = new Message_ListOfMsg(OCCwrapJavaJNI.ShapeExtend_DataMapOfTransientListOfMsg_Iterator_Value(swigCPtr, this), false, this);
    return ret;
  }

  public  Message_ListOfMsg  ChangeValue() {
    Message_ListOfMsg ret = new Message_ListOfMsg(OCCwrapJavaJNI.ShapeExtend_DataMapOfTransientListOfMsg_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret;
  }

}
