package opencascade;

/**
 *  Defines a Check, as a list of Fail or Warning Messages under
 *  a literal form, which can be empty. A Check can also bring an
 *  Entity, which is the Entity to which the messages apply
 *  (this Entity may be any Transient Object).
 * 
 *  Messages can be stored in two forms : the definitive form
 *  (the only one by default), and another form, the original
 *  form, which can be different if it contains values to be
 *  inserted (integers, reals, strings)
 *  The original form can be more suitable for some operations
 *  such as counting messages
 */
public class Interface_Check extends Standard_Transient {
  Interface_Check(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Allows definition of a Sequence. Used also for Global Check
   *  of an InterfaceModel (which stores global messages for file)
   */
  public Interface_Check() {
    this(OCCwrapJavaJNI.new_Interface_Check__SWIG_0(), true);
  }

  /**
   *  Defines a Check on an Entity
   */
  public Interface_Check( Standard_Transient  anentity) {
    this(OCCwrapJavaJNI.new_Interface_Check__SWIG_1( Standard_Transient.getCPtr(anentity) , anentity), true);
  }

  /**
   *  New name for AddFail (Msg)
   */
  public void SendFail( Message_Msg  amsg) {
    OCCwrapJavaJNI.Interface_Check_SendFail(swigCPtr, this, Message_Msg.getCPtr(amsg), amsg);
  }

  /**
   *  Records a new Fail message
   */
  public void AddFail( TCollection_HAsciiString  amess) {
    OCCwrapJavaJNI.Interface_Check_AddFail__SWIG_0(swigCPtr, this,  TCollection_HAsciiString.getCPtr(amess) , amess);
  }

  /**
   *  Records a new Fail message under two forms : final,original
   */
  public void AddFail( TCollection_HAsciiString  amess,  TCollection_HAsciiString  orig) {
    OCCwrapJavaJNI.Interface_Check_AddFail__SWIG_1(swigCPtr, this,  TCollection_HAsciiString.getCPtr(amess) , amess,  TCollection_HAsciiString.getCPtr(orig) , orig);
  }

  /**
   *  Records a new Fail message given as "error text" directly
   *  If <orig> is given, a distinct original form is recorded
   *  else (D), the original form equates <amess>
   */
  public void AddFail(String amess, String orig) {
    OCCwrapJavaJNI.Interface_Check_AddFail__SWIG_2(swigCPtr, this, amess, orig);
  }

  /**
   *  Records a new Fail from the definition of a Msg (Original+Value)
   */
  public void AddFail(String amess) {
    OCCwrapJavaJNI.Interface_Check_AddFail__SWIG_3(swigCPtr, this, amess);
  }

  public void AddFail( Message_Msg  amsg) {
    OCCwrapJavaJNI.Interface_Check_AddFail__SWIG_4(swigCPtr, this, Message_Msg.getCPtr(amsg), amsg);
  }

  /**
   *  Returns True if Check brings at least one Fail Message
   */
  public long HasFailed() {
    return OCCwrapJavaJNI.Interface_Check_HasFailed(swigCPtr, this);
  }

  /**
   *  Returns count of recorded Fails
   */
  public int NbFails() {
    return OCCwrapJavaJNI.Interface_Check_NbFails(swigCPtr, this);
  }

  public  TCollection_HAsciiString  Fail(int num, long arg1) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.Interface_Check_Fail__SWIG_0(swigCPtr, this, num, arg1), true );
  }

  public  TCollection_HAsciiString  Fail(int num) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.Interface_Check_Fail__SWIG_1(swigCPtr, this, num), true );
  }

  /**
   *  Same as above, but returns a CString (to be printed ...)
   *  Final form by default, Original form if <final> is False
   */
  public String CFail(int num, long arg1) {
    return OCCwrapJavaJNI.Interface_Check_CFail__SWIG_0(swigCPtr, this, num, arg1);
  }

  public String CFail(int num) {
    return OCCwrapJavaJNI.Interface_Check_CFail__SWIG_1(swigCPtr, this, num);
  }

  public  TColStd_HSequenceOfHAsciiString  Fails(long arg0) {
    return new TColStd_HSequenceOfHAsciiString ( OCCwrapJavaJNI.Interface_Check_Fails__SWIG_0(swigCPtr, this, arg0), true );
  }

  public  TColStd_HSequenceOfHAsciiString  Fails() {
    return new TColStd_HSequenceOfHAsciiString ( OCCwrapJavaJNI.Interface_Check_Fails__SWIG_1(swigCPtr, this), true );
  }

  /**
   *  New name for AddWarning
   */
  public void SendWarning( Message_Msg  amsg) {
    OCCwrapJavaJNI.Interface_Check_SendWarning(swigCPtr, this, Message_Msg.getCPtr(amsg), amsg);
  }

  /**
   *  Records a new Warning message
   */
  public void AddWarning( TCollection_HAsciiString  amess) {
    OCCwrapJavaJNI.Interface_Check_AddWarning__SWIG_0(swigCPtr, this,  TCollection_HAsciiString.getCPtr(amess) , amess);
  }

  /**
   *  Records a new Warning message under two forms : final,original
   */
  public void AddWarning( TCollection_HAsciiString  amess,  TCollection_HAsciiString  orig) {
    OCCwrapJavaJNI.Interface_Check_AddWarning__SWIG_1(swigCPtr, this,  TCollection_HAsciiString.getCPtr(amess) , amess,  TCollection_HAsciiString.getCPtr(orig) , orig);
  }

  /**
   *  Records a Warning message given as "warning message" directly
   *  If <orig> is given, a distinct original form is recorded
   *  else (D), the original form equates <amess>
   */
  public void AddWarning(String amess, String orig) {
    OCCwrapJavaJNI.Interface_Check_AddWarning__SWIG_2(swigCPtr, this, amess, orig);
  }

  /**
   *  Records a new Warning from the definition of a Msg (Original+Value)
   */
  public void AddWarning(String amess) {
    OCCwrapJavaJNI.Interface_Check_AddWarning__SWIG_3(swigCPtr, this, amess);
  }

  public void AddWarning( Message_Msg  amsg) {
    OCCwrapJavaJNI.Interface_Check_AddWarning__SWIG_4(swigCPtr, this, Message_Msg.getCPtr(amsg), amsg);
  }

  /**
   *  Returns True if Check brings at least one Warning Message
   */
  public long HasWarnings() {
    return OCCwrapJavaJNI.Interface_Check_HasWarnings(swigCPtr, this);
  }

  /**
   *  Returns count of recorded Warning messages
   */
  public int NbWarnings() {
    return OCCwrapJavaJNI.Interface_Check_NbWarnings(swigCPtr, this);
  }

  public  TCollection_HAsciiString  Warning(int num, long arg1) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.Interface_Check_Warning__SWIG_0(swigCPtr, this, num, arg1), true );
  }

  public  TCollection_HAsciiString  Warning(int num) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.Interface_Check_Warning__SWIG_1(swigCPtr, this, num), true );
  }

  /**
   *  Same as above, but returns a CString (to be printed ...)
   *  Final form by default, Original form if <final> is False
   */
  public String CWarning(int num, long arg1) {
    return OCCwrapJavaJNI.Interface_Check_CWarning__SWIG_0(swigCPtr, this, num, arg1);
  }

  public String CWarning(int num) {
    return OCCwrapJavaJNI.Interface_Check_CWarning__SWIG_1(swigCPtr, this, num);
  }

  public  TColStd_HSequenceOfHAsciiString  Warnings(long arg0) {
    return new TColStd_HSequenceOfHAsciiString ( OCCwrapJavaJNI.Interface_Check_Warnings__SWIG_0(swigCPtr, this, arg0), true );
  }

  public  TColStd_HSequenceOfHAsciiString  Warnings() {
    return new TColStd_HSequenceOfHAsciiString ( OCCwrapJavaJNI.Interface_Check_Warnings__SWIG_1(swigCPtr, this), true );
  }

  /**
   *  Records an information message
   *  This does not change the status of the Check
   */
  public void SendMsg( Message_Msg  amsg) {
    OCCwrapJavaJNI.Interface_Check_SendMsg(swigCPtr, this, Message_Msg.getCPtr(amsg), amsg);
  }

  /**
   *  Returns the count of recorded information messages
   */
  public int NbInfoMsgs() {
    return OCCwrapJavaJNI.Interface_Check_NbInfoMsgs(swigCPtr, this);
  }

  public  TCollection_HAsciiString  InfoMsg(int num, long arg1) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.Interface_Check_InfoMsg__SWIG_0(swigCPtr, this, num, arg1), true );
  }

  public  TCollection_HAsciiString  InfoMsg(int num) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.Interface_Check_InfoMsg__SWIG_1(swigCPtr, this, num), true );
  }

  /**
   *  Same as above, but returns a CString (to be printed ...)
   *  Final form by default, Original form if <final> is False
   */
  public String CInfoMsg(int num, long arg1) {
    return OCCwrapJavaJNI.Interface_Check_CInfoMsg__SWIG_0(swigCPtr, this, num, arg1);
  }

  public String CInfoMsg(int num) {
    return OCCwrapJavaJNI.Interface_Check_CInfoMsg__SWIG_1(swigCPtr, this, num);
  }

  public  TColStd_HSequenceOfHAsciiString  InfoMsgs(long arg0) {
    return new TColStd_HSequenceOfHAsciiString ( OCCwrapJavaJNI.Interface_Check_InfoMsgs__SWIG_0(swigCPtr, this, arg0), true );
  }

  public  TColStd_HSequenceOfHAsciiString  InfoMsgs() {
    return new TColStd_HSequenceOfHAsciiString ( OCCwrapJavaJNI.Interface_Check_InfoMsgs__SWIG_1(swigCPtr, this), true );
  }

  /**
   *  Returns the Check Status : OK, Warning or Fail
   */
  public Interface_CheckStatus Status() {
    return Interface_CheckStatus.swigToEnum(OCCwrapJavaJNI.Interface_Check_Status(swigCPtr, this));
  }

  /**
   *  Tells if Check Status complies with a given one
   *  (i.e. also status for query)
   */
  public long Complies(Interface_CheckStatus status) {
    return OCCwrapJavaJNI.Interface_Check_Complies__SWIG_0(swigCPtr, this, status.swigValue());
  }

  /**
   *  Tells if a message is brought by a Check, as follows :
   *  <incl> = 0 : <mess> exactly matches one of the messages
   *  <incl> < 0 : <mess> is contained by one of the messages
   *  <incl> > 0 : <mess> contains one of the messages
   *  For <status> : for CheckWarning and CheckFail, considers only
   *  resp. Warning or Check messages. for CheckAny, considers all
   *  other values are ignored (answer will be false)
   */
  public long Complies( TCollection_HAsciiString  mess, int incl, Interface_CheckStatus status) {
    return OCCwrapJavaJNI.Interface_Check_Complies__SWIG_1(swigCPtr, this,  TCollection_HAsciiString.getCPtr(mess) , mess, incl, status.swigValue());
  }

  /**
   *  Returns True if a Check is devoted to an entity; else, it is
   *  global (for InterfaceModel's storing of global error messages)
   */
  public long HasEntity() {
    return OCCwrapJavaJNI.Interface_Check_HasEntity(swigCPtr, this);
  }

  public  Standard_Transient  Entity() {
    return new Standard_Transient ( OCCwrapJavaJNI.Interface_Check_Entity(swigCPtr, this), true );
  }

  /**
   *  Clears a check, in order to receive informations from transfer
   *  (Messages and Entity)
   */
  public void Clear() {
    OCCwrapJavaJNI.Interface_Check_Clear(swigCPtr, this);
  }

  /**
   *  Clears the Fail Messages (for instance to keep only Warnings)
   */
  public void ClearFails() {
    OCCwrapJavaJNI.Interface_Check_ClearFails(swigCPtr, this);
  }

  /**
   *  Clears the Warning Messages (for instance to keep only Fails)
   */
  public void ClearWarnings() {
    OCCwrapJavaJNI.Interface_Check_ClearWarnings(swigCPtr, this);
  }

  /**
   *  Clears the Info Messages
   */
  public void ClearInfoMsgs() {
    OCCwrapJavaJNI.Interface_Check_ClearInfoMsgs(swigCPtr, this);
  }

  /**
   *  Removes the messages which comply with <mess>, as follows :
   *  <incl> = 0 : <mess> exactly matches one of the messages
   *  <incl> < 0 : <mess> is contained by one of the messages
   *  <incl> > 0 : <mess> contains one of the messages
   *  For <status> : for CheckWarning and CheckFail, considers only
   *  resp. Warning or Check messages. for CheckAny, considers all
   *  other values are ignored (nothing is done)
   *  Returns True if at least one message has been removed, False else
   */
  public long Remove( TCollection_HAsciiString  mess, int incl, Interface_CheckStatus status) {
    return OCCwrapJavaJNI.Interface_Check_Remove(swigCPtr, this,  TCollection_HAsciiString.getCPtr(mess) , mess, incl, status.swigValue());
  }

  /**
   *  Mends messages, according <pref> and <num>
   *  According to <num>, works on the whole list of Fails if = 0(D)
   *  or only one Fail message, given its rank
   *  If <pref> is empty, converts Fail(s) to Warning(s)
   *  Else, does the conversion but prefixes the new Warning(s) but
   *  <pref> followed by a semi-column
   *  Some reserved values of <pref> are :
   *  "FM" : standard prefix "Mended" (can be translated)
   *  "CF" : clears Fail(s)
   *  "CW" : clears Warning(s) : here, <num> refers to Warning list
   *  "CA" : clears all messages : here, <num> is ignored
   */
  public long Mend(String pref, int num) {
    return OCCwrapJavaJNI.Interface_Check_Mend__SWIG_0(swigCPtr, this, pref, num);
  }

  public long Mend(String pref) {
    return OCCwrapJavaJNI.Interface_Check_Mend__SWIG_1(swigCPtr, this, pref);
  }

  /**
   *  Receives an entity result of a Transfer
   */
  public void SetEntity( Standard_Transient  anentity) {
    OCCwrapJavaJNI.Interface_Check_SetEntity(swigCPtr, this,  Standard_Transient.getCPtr(anentity) , anentity);
  }

  /**
   *  same as SetEntity (old form kept for compatibility)
   *  Warning : Does nothing if Entity field is not yet clear
   */
  public void GetEntity( Standard_Transient  anentity) {
    OCCwrapJavaJNI.Interface_Check_GetEntity(swigCPtr, this,  Standard_Transient.getCPtr(anentity) , anentity);
  }

  /**
   *  Copies messages stored in another Check, cumulating
   *  Does not regard other's Entity. Used to cumulate messages
   */
  public void GetMessages( Interface_Check  other) {
    OCCwrapJavaJNI.Interface_Check_GetMessages(swigCPtr, this,  Interface_Check.getCPtr(other) , other);
  }

  /**
   *  Copies messages converted into Warning messages
   *  If failsonly is true, only Fails are taken, and converted
   *  else, Warnings are taken too. Does not regard Entity
   *  Used to keep Fail messages as Warning, after a recovery
   */
  public void GetAsWarning( Interface_Check  other, long failsonly) {
    OCCwrapJavaJNI.Interface_Check_GetAsWarning(swigCPtr, this,  Interface_Check.getCPtr(other) , other, failsonly);
  }

  /**
   *  Prints the messages of the check to an Messenger
   *  <level> = 1 : only fails
   *  <level> = 2 : fails and warnings
   *  <level> = 3 : all (fails, warnings, info msg)
   *  <final> : if positive (D) prints final values of messages
   *  if negative, prints originals
   *  if null, prints both forms
   */
  public void Print( Message_Messenger  S, int level, int arg2) {
    OCCwrapJavaJNI.Interface_Check_Print__SWIG_0(swigCPtr, this,  Message_Messenger.getCPtr(S) , S, level, arg2);
  }

  public void Print( Message_Messenger  S, int level) {
    OCCwrapJavaJNI.Interface_Check_Print__SWIG_1(swigCPtr, this,  Message_Messenger.getCPtr(S) , S, level);
  }

  /**
   *  Prints the messages of the check to the default trace file
   *  By default, according to the default standard level
   *  Else, according level (see method Print)
   */
  public void Trace(int level, int arg1) {
    OCCwrapJavaJNI.Interface_Check_Trace__SWIG_0(swigCPtr, this, level, arg1);
  }

  public void Trace(int level) {
    OCCwrapJavaJNI.Interface_Check_Trace__SWIG_1(swigCPtr, this, level);
  }

  public void Trace() {
    OCCwrapJavaJNI.Interface_Check_Trace__SWIG_2(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Interface_Check_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Interface_Check_get_type_descriptor(), true );
  }

  public static  Interface_Check  DownCast( Standard_Transient  T) {
    return new Interface_Check ( OCCwrapJavaJNI.Interface_Check_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Interface_Check_TypeOf(), true );
  }

}
