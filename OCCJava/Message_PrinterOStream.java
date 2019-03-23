package opencascade;

/**
 *  Implementation of a message printer associated with an ostream
 *  The ostream may be either externally defined one (e.g. cout),
 *  or file stream maintained internally (depending on constructor).
 */
public class Message_PrinterOStream extends Message_Printer {
  Message_PrinterOStream(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static String get_type_name() {
    return OCCwrapJavaJNI.Message_PrinterOStream_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Message_PrinterOStream_get_type_descriptor(), true );
  }

  /**
   *  Empty constructor, defaulting to cout
   */
  public Message_PrinterOStream(Message_Gravity theTraceLevel) {
    this(OCCwrapJavaJNI.new_Message_PrinterOStream__SWIG_0(theTraceLevel.swigValue()), true);
  }

  /**
   *  Create printer for output to a specified file.
   *  The option theDoAppend specifies whether file should be
   *  appended or rewritten.
   *  For specific file names (cout, cerr) standard streams are used
   */
  public Message_PrinterOStream() {
    this(OCCwrapJavaJNI.new_Message_PrinterOStream__SWIG_1(), true);
  }

  public Message_PrinterOStream(String theFileName, long theDoAppend, Message_Gravity theTraceLevel) {
    this(OCCwrapJavaJNI.new_Message_PrinterOStream__SWIG_2(theFileName, theDoAppend, theTraceLevel.swigValue()), true);
  }

  public Message_PrinterOStream(String theFileName, long theDoAppend) {
    this(OCCwrapJavaJNI.new_Message_PrinterOStream__SWIG_3(theFileName, theDoAppend), true);
  }

  /**
   *  Flushes the output stream and destroys it if it has been
   *  specified externally with option doFree (or if it is internal
   *  file stream)
   */
  public void Close() {
    OCCwrapJavaJNI.Message_PrinterOStream_Close(swigCPtr, this);
  }

  /**
   *  Returns reference to the output stream
   */
  public SWIGTYPE_p_Standard_OStream GetStream() {
    return new SWIGTYPE_p_Standard_OStream(OCCwrapJavaJNI.Message_PrinterOStream_GetStream(swigCPtr, this), false);
  }

  /**
   *  Puts a message to the current stream
   *  if its gravity is equal or greater
   *  to the trace level set by SetTraceLevel()
   */
  public void Send(String theString, Message_Gravity theGravity, long putEndl) {
    OCCwrapJavaJNI.Message_PrinterOStream_Send__SWIG_0(swigCPtr, this, theString, theGravity.swigValue(), putEndl);
  }

  /**
   *  Puts a message to the current stream
   *  if its gravity is equal or greater
   *  to the trace level set by SetTraceLevel()
   */
  public void Send(String theString, Message_Gravity theGravity) {
    OCCwrapJavaJNI.Message_PrinterOStream_Send__SWIG_1(swigCPtr, this, theString, theGravity.swigValue());
  }

  /**
   *  Puts a message to the current stream
   *  if its gravity is equal or greater
   *  to the trace level set by SetTraceLevel()
   *  Non-Ascii symbols are converted to UTF-8 if UseUtf8
   *  option is set, else replaced by symbols '?'
   */
  public void Send( TCollection_AsciiString  theString, Message_Gravity theGravity, long putEndl) {
    OCCwrapJavaJNI.Message_PrinterOStream_Send__SWIG_2(swigCPtr, this, TCollection_AsciiString.getCPtr(theString), theString, theGravity.swigValue(), putEndl);
  }

  public void Send( TCollection_AsciiString  theString, Message_Gravity theGravity) {
    OCCwrapJavaJNI.Message_PrinterOStream_Send__SWIG_3(swigCPtr, this, TCollection_AsciiString.getCPtr(theString), theString, theGravity.swigValue());
  }

  public void Send( TCollection_ExtendedString  theString, Message_Gravity theGravity, long putEndl) {
    OCCwrapJavaJNI.Message_PrinterOStream_Send__SWIG_4(swigCPtr, this, TCollection_ExtendedString.getCPtr(theString), theString, theGravity.swigValue(), putEndl);
  }

  public void Send( TCollection_ExtendedString  theString, Message_Gravity theGravity) {
    OCCwrapJavaJNI.Message_PrinterOStream_Send__SWIG_5(swigCPtr, this, TCollection_ExtendedString.getCPtr(theString), theString, theGravity.swigValue());
  }

  public static  Message_PrinterOStream  DownCast( Standard_Transient  T) {
    return new Message_PrinterOStream ( OCCwrapJavaJNI.Message_PrinterOStream_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Message_PrinterOStream_TypeOf(), true );
  }

}
