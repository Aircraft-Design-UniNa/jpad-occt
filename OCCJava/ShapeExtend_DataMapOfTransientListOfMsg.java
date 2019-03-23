package opencascade;

public class ShapeExtend_DataMapOfTransientListOfMsg {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeExtend_DataMapOfTransientListOfMsg(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeExtend_DataMapOfTransientListOfMsg(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeExtend_DataMapOfTransientListOfMsg obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeExtend_DataMapOfTransientListOfMsg(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ShapeExtend_DataMapOfTransientListOfMsg() {
    this(OCCwrapJavaJNI.new_ShapeExtend_DataMapOfTransientListOfMsg__SWIG_0(), true);
  }

  public ShapeExtend_DataMapOfTransientListOfMsg(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_ShapeExtend_DataMapOfTransientListOfMsg__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public ShapeExtend_DataMapOfTransientListOfMsg(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_ShapeExtend_DataMapOfTransientListOfMsg__SWIG_2(theNbBuckets), true);
  }

  public ShapeExtend_DataMapOfTransientListOfMsg( ShapeExtend_DataMapOfTransientListOfMsg  theOther) {
    this(OCCwrapJavaJNI.new_ShapeExtend_DataMapOfTransientListOfMsg__SWIG_3(ShapeExtend_DataMapOfTransientListOfMsg.getCPtr(theOther), theOther), true);
  }

  public void Exchange( ShapeExtend_DataMapOfTransientListOfMsg  theOther) {
    OCCwrapJavaJNI.ShapeExtend_DataMapOfTransientListOfMsg_Exchange(swigCPtr, this, ShapeExtend_DataMapOfTransientListOfMsg.getCPtr(theOther), theOther);
  }

  public  ShapeExtend_DataMapOfTransientListOfMsg  Assign( ShapeExtend_DataMapOfTransientListOfMsg  theOther) {
    ShapeExtend_DataMapOfTransientListOfMsg ret = new ShapeExtend_DataMapOfTransientListOfMsg(OCCwrapJavaJNI.ShapeExtend_DataMapOfTransientListOfMsg_Assign(swigCPtr, this, ShapeExtend_DataMapOfTransientListOfMsg.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int N) {
    OCCwrapJavaJNI.ShapeExtend_DataMapOfTransientListOfMsg_ReSize(swigCPtr, this, N);
  }

  public long Bind( Standard_Transient  theKey,  Message_ListOfMsg  theItem) {
    return OCCwrapJavaJNI.ShapeExtend_DataMapOfTransientListOfMsg_Bind(swigCPtr, this,  Standard_Transient.getCPtr(theKey) , theKey, Message_ListOfMsg.getCPtr(theItem), theItem);
  }

  public long IsBound( Standard_Transient  theKey) {
    return OCCwrapJavaJNI.ShapeExtend_DataMapOfTransientListOfMsg_IsBound(swigCPtr, this,  Standard_Transient.getCPtr(theKey) , theKey);
  }

  public long UnBind( Standard_Transient  theKey) {
    return OCCwrapJavaJNI.ShapeExtend_DataMapOfTransientListOfMsg_UnBind(swigCPtr, this,  Standard_Transient.getCPtr(theKey) , theKey);
  }

  public  Message_ListOfMsg  Find( Standard_Transient  theKey) {
    Message_ListOfMsg ret = new Message_ListOfMsg(OCCwrapJavaJNI.ShapeExtend_DataMapOfTransientListOfMsg_Find__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(theKey) , theKey), false, this);
    return ret;
  }

  public long Find( Standard_Transient  theKey,  Message_ListOfMsg  theValue) {
    return OCCwrapJavaJNI.ShapeExtend_DataMapOfTransientListOfMsg_Find__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(theKey) , theKey, Message_ListOfMsg.getCPtr(theValue), theValue);
  }

  public  Message_ListOfMsg  ChangeFind( Standard_Transient  theKey) {
    Message_ListOfMsg ret = new Message_ListOfMsg(OCCwrapJavaJNI.ShapeExtend_DataMapOfTransientListOfMsg_ChangeFind(swigCPtr, this,  Standard_Transient.getCPtr(theKey) , theKey), false, this);
    return ret;
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.ShapeExtend_DataMapOfTransientListOfMsg_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.ShapeExtend_DataMapOfTransientListOfMsg_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.ShapeExtend_DataMapOfTransientListOfMsg_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.ShapeExtend_DataMapOfTransientListOfMsg_Size(swigCPtr, this);
  }

}
