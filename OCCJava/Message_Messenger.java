package opencascade;

/**
 *  Messenger is API class providing general-purpose interface for
 *  libraries that may issue text messages without knowledge
 *  of how these messages will be further processed.
 * 
 *  The messenger contains a sequence of "printers" which can be
 *  customized by the application, and dispatches every received
 *  message to all the printers.
 * 
 *  For convenience, a number of operators << are defined with left
 *  argument being Handle(Message_Messenger); thus it can be used
 *  with syntax similar to C++ streams.
 *  Note that all these operators use trace level Warning.
 */
public class Message_Messenger extends Standard_Transient {
  Message_Messenger(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static String get_type_name() {
    return OCCwrapJavaJNI.Message_Messenger_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Message_Messenger_get_type_descriptor(), true );
  }

  /**
   *  Empty constructor; initializes by single printer directed to cout.
   *  Note: the default messenger is not empty but directed to cout
   *  in order to protect against possibility to forget defining printers.
   *  If printing to cout is not needed, clear messenger by GetPrinters().Clear()
   */
  public Message_Messenger() {
    this(OCCwrapJavaJNI.new_Message_Messenger__SWIG_0(), true);
  }

  /**
   *  Create messenger with single printer
   */
  public Message_Messenger( Message_Printer  thePrinter) {
    this(OCCwrapJavaJNI.new_Message_Messenger__SWIG_1( Message_Printer.getCPtr(thePrinter) , thePrinter), true);
  }

  /**
   *  Add a printer to the messenger.
   *  The printer will be added only if it is not yet in the list.
   *  Returns True if printer has been added.
   */
  public long AddPrinter( Message_Printer  thePrinter) {
    return OCCwrapJavaJNI.Message_Messenger_AddPrinter(swigCPtr, this,  Message_Printer.getCPtr(thePrinter) , thePrinter);
  }

  /**
   *  Removes specified printer from the messenger.
   *  Returns True if this printer has been found in the list
   *  and removed.
   */
  public long RemovePrinter( Message_Printer  thePrinter) {
    return OCCwrapJavaJNI.Message_Messenger_RemovePrinter(swigCPtr, this,  Message_Printer.getCPtr(thePrinter) , thePrinter);
  }

  /**
   *  Removes printers of specified type (including derived classes)
   *  from the messenger.
   *  Returns number of removed printers.
   */
  public int RemovePrinters( Standard_Type  theType) {
    return OCCwrapJavaJNI.Message_Messenger_RemovePrinters(swigCPtr, this,  Standard_Type.getCPtr(theType) , theType);
  }

  /**
   *  Returns current sequence of printers
   */
  public  Message_SequenceOfPrinters  Printers() {
    Message_SequenceOfPrinters ret = new Message_SequenceOfPrinters(OCCwrapJavaJNI.Message_Messenger_Printers(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns sequence of printers
   *  The sequence can be modified.
   */
  public  Message_SequenceOfPrinters  ChangePrinters() {
    Message_SequenceOfPrinters ret = new Message_SequenceOfPrinters(OCCwrapJavaJNI.Message_Messenger_ChangePrinters(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Dispatch a message to all the printers in the list.
   *  Three versions of string representations are accepted for
   *  convenience, by default all are converted to ExtendedString.
   *  The parameter putEndl specifies whether the new line should
   *  be started after this message (default) or not (may have
   *  sense in some conditions).
   */
  public void Send(String theString, Message_Gravity theGravity, long putEndl) {
    OCCwrapJavaJNI.Message_Messenger_Send__SWIG_0(swigCPtr, this, theString, theGravity.swigValue(), putEndl);
  }

  /**
   *  See above
   */
  public void Send(String theString, Message_Gravity theGravity) {
    OCCwrapJavaJNI.Message_Messenger_Send__SWIG_1(swigCPtr, this, theString, theGravity.swigValue());
  }

  /**
   *  See above
   */
  public void Send(String theString) {
    OCCwrapJavaJNI.Message_Messenger_Send__SWIG_2(swigCPtr, this, theString);
  }

  public void Send( TCollection_AsciiString  theString, Message_Gravity theGravity, long putEndl) {
    OCCwrapJavaJNI.Message_Messenger_Send__SWIG_3(swigCPtr, this, TCollection_AsciiString.getCPtr(theString), theString, theGravity.swigValue(), putEndl);
  }

  public void Send( TCollection_AsciiString  theString, Message_Gravity theGravity) {
    OCCwrapJavaJNI.Message_Messenger_Send__SWIG_4(swigCPtr, this, TCollection_AsciiString.getCPtr(theString), theString, theGravity.swigValue());
  }

  public void Send( TCollection_AsciiString  theString) {
    OCCwrapJavaJNI.Message_Messenger_Send__SWIG_5(swigCPtr, this, TCollection_AsciiString.getCPtr(theString), theString);
  }

  public void Send( TCollection_ExtendedString  theString, Message_Gravity theGravity, long putEndl) {
    OCCwrapJavaJNI.Message_Messenger_Send__SWIG_6(swigCPtr, this, TCollection_ExtendedString.getCPtr(theString), theString, theGravity.swigValue(), putEndl);
  }

  public void Send( TCollection_ExtendedString  theString, Message_Gravity theGravity) {
    OCCwrapJavaJNI.Message_Messenger_Send__SWIG_7(swigCPtr, this, TCollection_ExtendedString.getCPtr(theString), theString, theGravity.swigValue());
  }

  public void Send( TCollection_ExtendedString  theString) {
    OCCwrapJavaJNI.Message_Messenger_Send__SWIG_8(swigCPtr, this, TCollection_ExtendedString.getCPtr(theString), theString);
  }

  public static  Message_Messenger  DownCast( Standard_Transient  T) {
    return new Message_Messenger ( OCCwrapJavaJNI.Message_Messenger_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Message_Messenger_TypeOf(), true );
  }

}
