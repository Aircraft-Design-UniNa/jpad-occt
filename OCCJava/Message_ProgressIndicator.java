package opencascade;

public class Message_ProgressIndicator extends Standard_Transient {
  Message_ProgressIndicator(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    disposeUnused();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    OCCwrapJavaJNI.Message_ProgressIndicator_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    OCCwrapJavaJNI.Message_ProgressIndicator_change_ownership(this, swigCPtr, true);
  }

  /**
   *  Drops all scopes and sets scale from 0 to 100, step 1
   *  This scale has name "Step"
   */
  public void Reset() {
    if (getClass() == Message_ProgressIndicator.class) OCCwrapJavaJNI.Message_ProgressIndicator_Reset(swigCPtr, this); else OCCwrapJavaJNI.Message_ProgressIndicator_ResetSwigExplicitMessage_ProgressIndicator(swigCPtr, this);
  }

  public void SetName(String name) {
    OCCwrapJavaJNI.Message_ProgressIndicator_SetName__SWIG_0(swigCPtr, this, name);
  }

  /**
   *  Set (optional) name for scale
   */
  public void SetName( TCollection_HAsciiString  name) {
    OCCwrapJavaJNI.Message_ProgressIndicator_SetName__SWIG_1(swigCPtr, this,  TCollection_HAsciiString.getCPtr(name) , name);
  }

  /**
   *  Set range for current scale
   */
  public void SetRange(double min, double max) {
    OCCwrapJavaJNI.Message_ProgressIndicator_SetRange(swigCPtr, this, min, max);
  }

  /**
   *  Set step for current scale
   */
  public void SetStep(double step) {
    OCCwrapJavaJNI.Message_ProgressIndicator_SetStep(swigCPtr, this, step);
  }

  /**
   *  Set or drop infinite mode for the current scale
   */
  public void SetInfinite(long isInf) {
    OCCwrapJavaJNI.Message_ProgressIndicator_SetInfinite__SWIG_0(swigCPtr, this, isInf);
  }

  public void SetInfinite() {
    OCCwrapJavaJNI.Message_ProgressIndicator_SetInfinite__SWIG_1(swigCPtr, this);
  }

  public void SetScale(String name, double min, double max, double step, long isInf) {
    OCCwrapJavaJNI.Message_ProgressIndicator_SetScale__SWIG_0(swigCPtr, this, name, min, max, step, isInf);
  }

  /**
   *  Set all parameters for current scale
   */
  public void SetScale(String name, double min, double max, double step) {
    OCCwrapJavaJNI.Message_ProgressIndicator_SetScale__SWIG_1(swigCPtr, this, name, min, max, step);
  }

  public void SetScale(double min, double max, double step, long isInf) {
    OCCwrapJavaJNI.Message_ProgressIndicator_SetScale__SWIG_2(swigCPtr, this, min, max, step, isInf);
  }

  public void SetScale(double min, double max, double step) {
    OCCwrapJavaJNI.Message_ProgressIndicator_SetScale__SWIG_3(swigCPtr, this, min, max, step);
  }

  /**
   *  Returns all parameters for current scale
   */
  public void GetScale(double[] min, double[] max, double[] step, long[] isInf) {
    OCCwrapJavaJNI.Message_ProgressIndicator_GetScale(swigCPtr, this, min, max, step, isInf);
  }

  public void SetValue(double val) {
    OCCwrapJavaJNI.Message_ProgressIndicator_SetValue(swigCPtr, this, val);
  }

  /**
   *  Set and get progress value at current scale
   *  If the value to be set is more than currently set one, or out
   *  of range for the current scale, it is limited by that range
   */
  public double GetValue() {
    return OCCwrapJavaJNI.Message_ProgressIndicator_GetValue(swigCPtr, this);
  }

  public void Increment() {
    OCCwrapJavaJNI.Message_ProgressIndicator_Increment__SWIG_0(swigCPtr, this);
  }

  /**
   *  Increment the progress value by the default of specified step
   */
  public void Increment(double step) {
    OCCwrapJavaJNI.Message_ProgressIndicator_Increment__SWIG_1(swigCPtr, this, step);
  }

  public long NewScope(String name) {
    return OCCwrapJavaJNI.Message_ProgressIndicator_NewScope__SWIG_0(swigCPtr, this, name);
  }

  public long NewScope() {
    return OCCwrapJavaJNI.Message_ProgressIndicator_NewScope__SWIG_1(swigCPtr, this);
  }

  public long NewScope( TCollection_HAsciiString  name) {
    return OCCwrapJavaJNI.Message_ProgressIndicator_NewScope__SWIG_2(swigCPtr, this,  TCollection_HAsciiString.getCPtr(name) , name);
  }

  /**
   *  Creates new scope on a part of a current scale from current
   *  position with span either equal to default step, or specified
   *  The scale for the new scope will have specified name and
   *  ranged from 0 to 100 with step 1
   *  Returns False if something is wrong in arguments or in current
   *  position of progress indicator; scope is opened anyway
   */
  public long NewScope(double span, String name) {
    return OCCwrapJavaJNI.Message_ProgressIndicator_NewScope__SWIG_3(swigCPtr, this, span, name);
  }

  public long NewScope(double span) {
    return OCCwrapJavaJNI.Message_ProgressIndicator_NewScope__SWIG_4(swigCPtr, this, span);
  }

  public long NewScope(double span,  TCollection_HAsciiString  name) {
    return OCCwrapJavaJNI.Message_ProgressIndicator_NewScope__SWIG_5(swigCPtr, this, span,  TCollection_HAsciiString.getCPtr(name) , name);
  }

  /**
   *  Close the current scope and thus return to previous scale
   *  Updates position to be at the end of the closing scope
   *  Returns False if no scope is opened
   */
  public long EndScope() {
    return OCCwrapJavaJNI.Message_ProgressIndicator_EndScope(swigCPtr, this);
  }

  public long NextScope(String name) {
    return OCCwrapJavaJNI.Message_ProgressIndicator_NextScope__SWIG_0(swigCPtr, this, name);
  }

  /**
   *  Optimized version of { return EndScope() && NewScope(); }
   */
  public long NextScope() {
    return OCCwrapJavaJNI.Message_ProgressIndicator_NextScope__SWIG_1(swigCPtr, this);
  }

  public long NextScope(double span, String name) {
    return OCCwrapJavaJNI.Message_ProgressIndicator_NextScope__SWIG_2(swigCPtr, this, span, name);
  }

  public long NextScope(double span) {
    return OCCwrapJavaJNI.Message_ProgressIndicator_NextScope__SWIG_3(swigCPtr, this, span);
  }

  /**
   *  Should return True if user has send a break signal.
   *  Default implementation returns False.
   */
  public long UserBreak() {
    return (getClass() == Message_ProgressIndicator.class) ? OCCwrapJavaJNI.Message_ProgressIndicator_UserBreak(swigCPtr, this) : OCCwrapJavaJNI.Message_ProgressIndicator_UserBreakSwigExplicitMessage_ProgressIndicator(swigCPtr, this);
  }

  /**
   *  Update presentation of the progress indicator
   *  Called when progress position is changed
   *  Flag force is intended for forcing update in case if it is
   *  optimized; all internal calls from ProgressIndicator are
   *  done with this flag equal to False
   */
  public long Show(long force) {
    return OCCwrapJavaJNI.Message_ProgressIndicator_Show__SWIG_0(swigCPtr, this, force);
  }

  public long Show() {
    return OCCwrapJavaJNI.Message_ProgressIndicator_Show__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns total progress position on the basic scale
   *  ranged from 0. to 1.
   */
  public double GetPosition() {
    return OCCwrapJavaJNI.Message_ProgressIndicator_GetPosition(swigCPtr, this);
  }

  /**
   *  Returns current number of opened scopes
   *  This number is always >=1 as top-level scale is always present
   */
  public int GetNbScopes() {
    return OCCwrapJavaJNI.Message_ProgressIndicator_GetNbScopes(swigCPtr, this);
  }

  /**
   *  Returns data for scale of index-th scope
   *  The first scope is current one, the last is the top-level one
   */
  public  Message_ProgressScale  GetScope(int index) {
    Message_ProgressScale ret = new Message_ProgressScale(OCCwrapJavaJNI.Message_ProgressIndicator_GetScope(swigCPtr, this, index), false, this);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Message_ProgressIndicator_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Message_ProgressIndicator_get_type_descriptor(), true );
  }

  protected Message_ProgressIndicator() {
    this(OCCwrapJavaJNI.new_Message_ProgressIndicator(), true);
    OCCwrapJavaJNI.Message_ProgressIndicator_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public static  Message_ProgressIndicator  DownCast( Standard_Transient  T) {
    return new Message_ProgressIndicator ( OCCwrapJavaJNI.Message_ProgressIndicator_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Message_ProgressIndicator_TypeOf(), true );
  }

}
