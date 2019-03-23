package opencascade;

/**
 *  Defines
 *  - tools to work with messages
 *  - basic tools intended for progress indication
 */
public class Message {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Message(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Message(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Message obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Message(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static  Message_Messenger  DefaultMessenger() {
    return new Message_Messenger ( OCCwrapJavaJNI.Message_DefaultMessenger(), true );
  }

  /**
   *  Returns the string filled with values of hours, minutes and seconds.
   *  Example:
   *  1. (5, 12, 26.3345) returns "05h:12m:26.33s",
   *  2. (0,  6, 34.496 ) returns "06m:34.50s",
   *  3. (0,  0,  4.5   ) returns "4.50s"
   */
  public static TCollection_AsciiString FillTime(int Hour, int Minute, double Second) {
    return new TCollection_AsciiString(OCCwrapJavaJNI.Message_FillTime(Hour, Minute, Second), true);
  }

  public Message() {
    this(OCCwrapJavaJNI.new_Message(), true);
  }

}
