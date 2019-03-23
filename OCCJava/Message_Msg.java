package opencascade;

/**
 *  This class provides a tool for constructing the parametrized message
 *  basing on resources loaded by Message_MsgFile tool.
 * 
 *  A Message is created from a keyword: this keyword identifies the
 *  message in a message file that should be previously loaded by call
 *  to Message_MsgFile::LoadFile().
 * 
 *  The text of the message can contain placeholders for the parameters
 *  which are to be filled by the proper values when the message
 *  is prepared. Most of the format specifiers used in C can be used,
 *  for instance, %s for string, %d for integer etc. In addition,
 *  specifier %f is supported for double numbers (for compatibility
 *  with previous versions).
 * 
 *  User fills the parameter fields in the text of the message by
 *  calling corresponding methods Arg() or operators .
 * 
 *  The resulting message, filled with all parameters, can be obtained
 *  by method Get(). If some parameters were not filled, the text
 *  UNKNOWN is placed instead.
 */
public class Message_Msg {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Message_Msg(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Message_Msg(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Message_Msg obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Message_Msg(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor
   */
  public Message_Msg() {
    this(OCCwrapJavaJNI.new_Message_Msg__SWIG_0(), true);
  }

  /**
   *  Copy constructor
   */
  public Message_Msg( Message_Msg  theMsg) {
    this(OCCwrapJavaJNI.new_Message_Msg__SWIG_1(Message_Msg.getCPtr(theMsg), theMsg), true);
  }

  /**
   *  Create a message using a corresponding entry in Message_MsgFile
   */
  public Message_Msg(String theKey) {
    this(OCCwrapJavaJNI.new_Message_Msg__SWIG_2(theKey), true);
  }

  /**
   *  Create a message using a corresponding entry in Message_MsgFile
   */
  public Message_Msg( TCollection_ExtendedString  theKey) {
    this(OCCwrapJavaJNI.new_Message_Msg__SWIG_3(TCollection_ExtendedString.getCPtr(theKey), theKey), true);
  }

  /**
   *  Set a message body text -- can be used as alternative to
   *  using messages from resource file
   */
  public void Set(String theMsg) {
    OCCwrapJavaJNI.Message_Msg_Set__SWIG_0(swigCPtr, this, theMsg);
  }

  /**
   *  Set a message body text -- can be used as alternative to
   *  using messages from resource file
   */
  public void Set( TCollection_ExtendedString  theMsg) {
    OCCwrapJavaJNI.Message_Msg_Set__SWIG_1(swigCPtr, this, TCollection_ExtendedString.getCPtr(theMsg), theMsg);
  }

  /**
   *  Set a value for %..s conversion
   */
  public  Message_Msg  Arg(String theString) {
    Message_Msg ret = new Message_Msg(OCCwrapJavaJNI.Message_Msg_Arg__SWIG_0(swigCPtr, this, theString), false, this);
    return ret;
  }

  public  Message_Msg  Arg( TCollection_AsciiString  theString) {
    Message_Msg ret = new Message_Msg(OCCwrapJavaJNI.Message_Msg_Arg__SWIG_1(swigCPtr, this, TCollection_AsciiString.getCPtr(theString), theString), false, this);
    return ret;
  }

  /**
   *  Set a value for %..s conversion
   */
  public  Message_Msg  Arg( TCollection_HAsciiString  theString) {
    Message_Msg ret = new Message_Msg(OCCwrapJavaJNI.Message_Msg_Arg__SWIG_2(swigCPtr, this,  TCollection_HAsciiString.getCPtr(theString) , theString), false, this);
    return ret;
  }

  public  Message_Msg  Arg( TCollection_ExtendedString  theString) {
    Message_Msg ret = new Message_Msg(OCCwrapJavaJNI.Message_Msg_Arg__SWIG_3(swigCPtr, this, TCollection_ExtendedString.getCPtr(theString), theString), false, this);
    return ret;
  }

  /**
   *  Set a value for %..s conversion
   */
  public  Message_Msg  Arg( TCollection_HExtendedString  theString) {
    Message_Msg ret = new Message_Msg(OCCwrapJavaJNI.Message_Msg_Arg__SWIG_4(swigCPtr, this,  TCollection_HExtendedString.getCPtr(theString) , theString), false, this);
    return ret;
  }

  public  Message_Msg  Arg(int theInt) {
    Message_Msg ret = new Message_Msg(OCCwrapJavaJNI.Message_Msg_Arg__SWIG_5(swigCPtr, this, theInt), false, this);
    return ret;
  }

  /**
   *  Set a value for %..s conversion
   */
  public  Message_Msg  Arg(double theReal) {
    Message_Msg ret = new Message_Msg(OCCwrapJavaJNI.Message_Msg_Arg__SWIG_6(swigCPtr, this, theReal), false, this);
    return ret;
  }

  /**
   *  Returns the original message text
   */
  public  TCollection_ExtendedString  Original() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.Message_Msg_Original(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns current state of the message text with
   *  parameters to the moment
   */
  public  TCollection_ExtendedString  Value() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.Message_Msg_Value(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Tells if Value differs from Original
   */
  public long IsEdited() {
    return OCCwrapJavaJNI.Message_Msg_IsEdited(swigCPtr, this);
  }

  /**
   *  Return the resulting message string with all parameters
   *  filled. If some parameters were not yet filled by calls
   *  to methods Arg (or <<), these parameters are filled by
   *  the word UNKNOWN
   */
  public  TCollection_ExtendedString  Get() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.Message_Msg_Get(swigCPtr, this), true);
    return ret;
  }

}
