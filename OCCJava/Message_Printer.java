package opencascade;

/**
 *  Abstract interface class defining printer as output context for text messages
 * 
 *  The message, besides being text string, has associated gravity
 *  level, which can be used by printer to decide either to process a message or ignore it.
 */
public class Message_Printer extends Standard_Transient {
  Message_Printer(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    disposeUnused();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    OCCwrapJavaJNI.Message_Printer_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    OCCwrapJavaJNI.Message_Printer_change_ownership(this, swigCPtr, true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Message_Printer_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Message_Printer_get_type_descriptor(), true );
  }

  /**
   *  Return trace level used for filtering messages;
   *  messages with lover gravity will be ignored.
   */
  public Message_Gravity GetTraceLevel() {
    return Message_Gravity.swigToEnum(OCCwrapJavaJNI.Message_Printer_GetTraceLevel(swigCPtr, this));
  }

  /**
   *  Set trace level used for filtering messages.
   *  By default, trace level is Message_Info, so that all messages are output
   */
  public void SetTraceLevel(Message_Gravity theTraceLevel) {
    OCCwrapJavaJNI.Message_Printer_SetTraceLevel(swigCPtr, this, theTraceLevel.swigValue());
  }

  /**
   *  Send a string message with specified trace level.
   *  The parameter theToPutEol specified whether end-of-line should be added to the end of the message.
   *  This method must be redefined in descentant.
   */
  public void Send( TCollection_ExtendedString  theString, Message_Gravity theGravity, long theToPutEol) {
    OCCwrapJavaJNI.Message_Printer_Send__SWIG_0(swigCPtr, this, TCollection_ExtendedString.getCPtr(theString), theString, theGravity.swigValue(), theToPutEol);
  }

  /**
   *  Send a string message with specified trace level.
   *  The parameter theToPutEol specified whether end-of-line should be added to the end of the message.
   *  Default implementation calls first method Send().
   */
  public void Send(String theString, Message_Gravity theGravity, long theToPutEol) {
    if (getClass() == Message_Printer.class) OCCwrapJavaJNI.Message_Printer_Send__SWIG_1(swigCPtr, this, theString, theGravity.swigValue(), theToPutEol); else OCCwrapJavaJNI.Message_Printer_SendSwigExplicitMessage_Printer__SWIG_1(swigCPtr, this, theString, theGravity.swigValue(), theToPutEol);
  }

  /**
   *  Send a string message with specified trace level.
   *  The parameter theToPutEol specified whether end-of-line should be added to the end of the message.
   *  Default implementation calls first method Send().
   */
  public void Send( TCollection_AsciiString  theString, Message_Gravity theGravity, long theToPutEol) {
    if (getClass() == Message_Printer.class) OCCwrapJavaJNI.Message_Printer_Send__SWIG_2(swigCPtr, this, TCollection_AsciiString.getCPtr(theString), theString, theGravity.swigValue(), theToPutEol); else OCCwrapJavaJNI.Message_Printer_SendSwigExplicitMessage_Printer__SWIG_2(swigCPtr, this, TCollection_AsciiString.getCPtr(theString), theString, theGravity.swigValue(), theToPutEol);
  }

  protected Message_Printer() {
    this(OCCwrapJavaJNI.new_Message_Printer(), true);
    OCCwrapJavaJNI.Message_Printer_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public static  Message_Printer  DownCast( Standard_Transient  T) {
    return new Message_Printer ( OCCwrapJavaJNI.Message_Printer_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Message_Printer_TypeOf(), true );
  }

}
