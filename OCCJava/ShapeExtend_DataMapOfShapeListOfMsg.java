package opencascade;

public class ShapeExtend_DataMapOfShapeListOfMsg {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeExtend_DataMapOfShapeListOfMsg(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeExtend_DataMapOfShapeListOfMsg(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeExtend_DataMapOfShapeListOfMsg obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeExtend_DataMapOfShapeListOfMsg(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ShapeExtend_DataMapOfShapeListOfMsg() {
    this(OCCwrapJavaJNI.new_ShapeExtend_DataMapOfShapeListOfMsg__SWIG_0(), true);
  }

  public ShapeExtend_DataMapOfShapeListOfMsg(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_ShapeExtend_DataMapOfShapeListOfMsg__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public ShapeExtend_DataMapOfShapeListOfMsg(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_ShapeExtend_DataMapOfShapeListOfMsg__SWIG_2(theNbBuckets), true);
  }

  public ShapeExtend_DataMapOfShapeListOfMsg( ShapeExtend_DataMapOfShapeListOfMsg  theOther) {
    this(OCCwrapJavaJNI.new_ShapeExtend_DataMapOfShapeListOfMsg__SWIG_3(ShapeExtend_DataMapOfShapeListOfMsg.getCPtr(theOther), theOther), true);
  }

  public void Exchange( ShapeExtend_DataMapOfShapeListOfMsg  theOther) {
    OCCwrapJavaJNI.ShapeExtend_DataMapOfShapeListOfMsg_Exchange(swigCPtr, this, ShapeExtend_DataMapOfShapeListOfMsg.getCPtr(theOther), theOther);
  }

  public  ShapeExtend_DataMapOfShapeListOfMsg  Assign( ShapeExtend_DataMapOfShapeListOfMsg  theOther) {
    ShapeExtend_DataMapOfShapeListOfMsg ret = new ShapeExtend_DataMapOfShapeListOfMsg(OCCwrapJavaJNI.ShapeExtend_DataMapOfShapeListOfMsg_Assign(swigCPtr, this, ShapeExtend_DataMapOfShapeListOfMsg.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int N) {
    OCCwrapJavaJNI.ShapeExtend_DataMapOfShapeListOfMsg_ReSize(swigCPtr, this, N);
  }

  public long Bind( TopoDS_Shape  theKey,  Message_ListOfMsg  theItem) {
    return OCCwrapJavaJNI.ShapeExtend_DataMapOfShapeListOfMsg_Bind(swigCPtr, this, TopoDS_Shape.getCPtr(theKey), theKey, Message_ListOfMsg.getCPtr(theItem), theItem);
  }

  public long IsBound( TopoDS_Shape  theKey) {
    return OCCwrapJavaJNI.ShapeExtend_DataMapOfShapeListOfMsg_IsBound(swigCPtr, this, TopoDS_Shape.getCPtr(theKey), theKey);
  }

  public long UnBind( TopoDS_Shape  theKey) {
    return OCCwrapJavaJNI.ShapeExtend_DataMapOfShapeListOfMsg_UnBind(swigCPtr, this, TopoDS_Shape.getCPtr(theKey), theKey);
  }

  public  Message_ListOfMsg  Find( TopoDS_Shape  theKey) {
    Message_ListOfMsg ret = new Message_ListOfMsg(OCCwrapJavaJNI.ShapeExtend_DataMapOfShapeListOfMsg_Find__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(theKey), theKey), false, this);
    return ret;
  }

  public long Find( TopoDS_Shape  theKey,  Message_ListOfMsg  theValue) {
    return OCCwrapJavaJNI.ShapeExtend_DataMapOfShapeListOfMsg_Find__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(theKey), theKey, Message_ListOfMsg.getCPtr(theValue), theValue);
  }

  public  Message_ListOfMsg  ChangeFind( TopoDS_Shape  theKey) {
    Message_ListOfMsg ret = new Message_ListOfMsg(OCCwrapJavaJNI.ShapeExtend_DataMapOfShapeListOfMsg_ChangeFind(swigCPtr, this, TopoDS_Shape.getCPtr(theKey), theKey), false, this);
    return ret;
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.ShapeExtend_DataMapOfShapeListOfMsg_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.ShapeExtend_DataMapOfShapeListOfMsg_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.ShapeExtend_DataMapOfShapeListOfMsg_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.ShapeExtend_DataMapOfShapeListOfMsg_Size(swigCPtr, this);
  }

}
