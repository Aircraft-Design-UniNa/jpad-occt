package opencascade;

public class ShapeExtend_DataMapOfShapeListOfMsg_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeExtend_DataMapOfShapeListOfMsg_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeExtend_DataMapOfShapeListOfMsg_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeExtend_DataMapOfShapeListOfMsg_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeExtend_DataMapOfShapeListOfMsg_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ShapeExtend_DataMapOfShapeListOfMsg_Iterator(ShapeExtend_DataMapOfShapeListOfMsg arg0) {
    this(OCCwrapJavaJNI.new_ShapeExtend_DataMapOfShapeListOfMsg_Iterator(ShapeExtend_DataMapOfShapeListOfMsg.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.ShapeExtend_DataMapOfShapeListOfMsg_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.ShapeExtend_DataMapOfShapeListOfMsg_Iterator_Next(swigCPtr, this);
  }

  public  TopoDS_Shape  Key() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.ShapeExtend_DataMapOfShapeListOfMsg_Iterator_Key(swigCPtr, this), true);
    return ret;
  }

  public  Message_ListOfMsg  Value() {
    Message_ListOfMsg ret = new Message_ListOfMsg(OCCwrapJavaJNI.ShapeExtend_DataMapOfShapeListOfMsg_Iterator_Value(swigCPtr, this), false, this);
    return ret;
  }

  public  Message_ListOfMsg  ChangeValue() {
    Message_ListOfMsg ret = new Message_ListOfMsg(OCCwrapJavaJNI.ShapeExtend_DataMapOfShapeListOfMsg_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret;
  }

}
