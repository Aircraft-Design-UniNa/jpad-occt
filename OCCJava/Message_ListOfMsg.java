package opencascade;

public class Message_ListOfMsg {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Message_ListOfMsg(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Message_ListOfMsg(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Message_ListOfMsg obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Message_ListOfMsg(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Message_ListOfMsg() {
    this(OCCwrapJavaJNI.new_Message_ListOfMsg__SWIG_0(), true);
  }

  public Message_ListOfMsg( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_Message_ListOfMsg__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public Message_ListOfMsg( Message_ListOfMsg  theOther) {
    this(OCCwrapJavaJNI.new_Message_ListOfMsg__SWIG_2(Message_ListOfMsg.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.Message_ListOfMsg_Size(swigCPtr, this);
  }

  public  Message_ListOfMsg  Assign( Message_ListOfMsg  theOther) {
    Message_ListOfMsg ret = new Message_ListOfMsg(OCCwrapJavaJNI.Message_ListOfMsg_Assign(swigCPtr, this, Message_ListOfMsg.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.Message_ListOfMsg_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.Message_ListOfMsg_Clear__SWIG_1(swigCPtr, this);
  }

  public  Message_Msg  First() {
    Message_Msg ret = new Message_Msg(OCCwrapJavaJNI.Message_ListOfMsg_First(swigCPtr, this), false, this);
    return ret;
  }

  public  Message_Msg  Last() {
    Message_Msg ret = new Message_Msg(OCCwrapJavaJNI.Message_ListOfMsg_Last(swigCPtr, this), false, this);
    return ret;
  }

  public  Message_Msg  Append( Message_Msg  theItem) {
    Message_Msg ret = new Message_Msg(OCCwrapJavaJNI.Message_ListOfMsg_Append__SWIG_0(swigCPtr, this, Message_Msg.getCPtr(theItem), theItem), false, this);
    return ret;
  }

  public void Append( Message_Msg  theItem,  Message_ListOfMsg_Iterator  theIter) {
    OCCwrapJavaJNI.Message_ListOfMsg_Append__SWIG_1(swigCPtr, this, Message_Msg.getCPtr(theItem), theItem,  Message_ListOfMsg_Iterator.getCPtr(theIter) , theIter);
  }

  public void Append( Message_ListOfMsg  theOther) {
    OCCwrapJavaJNI.Message_ListOfMsg_Append__SWIG_2(swigCPtr, this, Message_ListOfMsg.getCPtr(theOther), theOther);
  }

  public  Message_Msg  Prepend( Message_Msg  theItem) {
    Message_Msg ret = new Message_Msg(OCCwrapJavaJNI.Message_ListOfMsg_Prepend__SWIG_0(swigCPtr, this, Message_Msg.getCPtr(theItem), theItem), false, this);
    return ret;
  }

  public void Prepend( Message_ListOfMsg  theOther) {
    OCCwrapJavaJNI.Message_ListOfMsg_Prepend__SWIG_1(swigCPtr, this, Message_ListOfMsg.getCPtr(theOther), theOther);
  }

  public void RemoveFirst() {
    OCCwrapJavaJNI.Message_ListOfMsg_RemoveFirst(swigCPtr, this);
  }

  public void Remove( Message_ListOfMsg_Iterator  theIter) {
    OCCwrapJavaJNI.Message_ListOfMsg_Remove(swigCPtr, this,  Message_ListOfMsg_Iterator.getCPtr(theIter) , theIter);
  }

  public  Message_Msg  InsertBefore( Message_Msg  theItem,  Message_ListOfMsg_Iterator  theIter) {
    Message_Msg ret = new Message_Msg(OCCwrapJavaJNI.Message_ListOfMsg_InsertBefore__SWIG_0(swigCPtr, this, Message_Msg.getCPtr(theItem), theItem,  Message_ListOfMsg_Iterator.getCPtr(theIter) , theIter), false, this);
    return ret;
  }

  public void InsertBefore( Message_ListOfMsg  theOther,  Message_ListOfMsg_Iterator  theIter) {
    OCCwrapJavaJNI.Message_ListOfMsg_InsertBefore__SWIG_1(swigCPtr, this, Message_ListOfMsg.getCPtr(theOther), theOther,  Message_ListOfMsg_Iterator.getCPtr(theIter) , theIter);
  }

  public  Message_Msg  InsertAfter( Message_Msg  theItem,  Message_ListOfMsg_Iterator  theIter) {
    Message_Msg ret = new Message_Msg(OCCwrapJavaJNI.Message_ListOfMsg_InsertAfter__SWIG_0(swigCPtr, this, Message_Msg.getCPtr(theItem), theItem,  Message_ListOfMsg_Iterator.getCPtr(theIter) , theIter), false, this);
    return ret;
  }

  public void InsertAfter( Message_ListOfMsg  theOther,  Message_ListOfMsg_Iterator  theIter) {
    OCCwrapJavaJNI.Message_ListOfMsg_InsertAfter__SWIG_1(swigCPtr, this, Message_ListOfMsg.getCPtr(theOther), theOther,  Message_ListOfMsg_Iterator.getCPtr(theIter) , theIter);
  }

  public void Reverse() {
    OCCwrapJavaJNI.Message_ListOfMsg_Reverse(swigCPtr, this);
  }

}
