package opencascade;

public class Message_ListOfMsg_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Message_ListOfMsg_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Message_ListOfMsg_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Message_ListOfMsg_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Message_ListOfMsg_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Message_ListOfMsg_Iterator(Message_ListOfMsg arg0) {
    this(OCCwrapJavaJNI.new_Message_ListOfMsg_Iterator(Message_ListOfMsg.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.Message_ListOfMsg_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.Message_ListOfMsg_Iterator_Next(swigCPtr, this);
  }

  public  Message_Msg  Value() {
    Message_Msg ret = new Message_Msg(OCCwrapJavaJNI.Message_ListOfMsg_Iterator_Value(swigCPtr, this), false, this);
    return ret;
  }

  public  Message_Msg  ChangeValue() {
    Message_Msg ret = new Message_Msg(OCCwrapJavaJNI.Message_ListOfMsg_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret;
  }

}
