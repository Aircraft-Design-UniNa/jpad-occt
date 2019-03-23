package opencascade;

/**
 *  A Binder is an auxiliary object to Map the Result of the
 *  Transfer of a given Object : it records the Result of the
 *  Unitary Transfer (Resulting Object), status of progress and
 *  error (if any) of the Process
 * 
 *  The class Binder itself makes no definition for the Result :
 *  it is defined by sub-classes : it can be either Simple (and
 *  has to be typed : see generic class SimpleBinder) or Multiple
 *  (see class MultipleBinder).
 * 
 *  In principle, for a Transfer in progress, Result cannot be
 *  accessed : this would cause an exception raising.
 *  This is controlled by the value if StatusResult : if it is
 *  "Used", the Result cannot be changed. This status is normally
 *  controlled by TransferProcess but can be directly (see method
 *  SetAlreadyUsed)
 * 
 *  Checks can be completed by a record of cases, as string which
 *  can be used as codes, but not to be printed
 * 
 *  In addition to the Result, a Binder can bring a list of
 *  Attributes, which are additional data, each of them has a name
 */
public class Transfer_Binder extends Standard_Transient {
  Transfer_Binder(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Merges basic data (Check, ExecStatus) from another Binder but
   *  keeps its result. Used when a binder is replaced by another
   *  one, this allows to keep messages
   */
  public void Merge( Transfer_Binder  other) {
    OCCwrapJavaJNI.Transfer_Binder_Merge(swigCPtr, this,  Transfer_Binder.getCPtr(other) , other);
  }

  /**
   *  Returns True if a Binder has several results, either by itself
   *  or because it has next results
   *  Can be defined by sub-classes.
   */
  public long IsMultiple() {
    return OCCwrapJavaJNI.Transfer_Binder_IsMultiple(swigCPtr, this);
  }

  public  Standard_Type  ResultType() {
    return new Standard_Type ( OCCwrapJavaJNI.Transfer_Binder_ResultType(swigCPtr, this), true );
  }

  /**
   *  Returns the Name of the Type which characterizes the Result
   *  Can be returned even if ResultType itself is unknown
   */
  public String ResultTypeName() {
    return OCCwrapJavaJNI.Transfer_Binder_ResultTypeName(swigCPtr, this);
  }

  /**
   *  Adds a next result (at the end of the list)
   *  Remark : this information is not processed by Merge
   */
  public void AddResult( Transfer_Binder  next) {
    OCCwrapJavaJNI.Transfer_Binder_AddResult(swigCPtr, this,  Transfer_Binder.getCPtr(next) , next);
  }

  public  Transfer_Binder  NextResult() {
    return new Transfer_Binder ( OCCwrapJavaJNI.Transfer_Binder_NextResult(swigCPtr, this), true );
  }

  /**
   *  Returns True if a Result is available (StatusResult = Defined)
   *  A Unique Result will be gotten by Result (which must be
   *  defined in each sub-class according to result type)
   *  For a Multiple Result, see class MultipleBinder
   *  For other case, specific access has to be forecast
   */
  public long HasResult() {
    return OCCwrapJavaJNI.Transfer_Binder_HasResult(swigCPtr, this);
  }

  /**
   *  Declares that result is now used by another one, it means that
   *  it cannot be modified (by Rebind)
   */
  public void SetAlreadyUsed() {
    OCCwrapJavaJNI.Transfer_Binder_SetAlreadyUsed(swigCPtr, this);
  }

  /**
   *  Returns status, which can be Initial (not yet done), Made (a
   *  result is recorded, not yet shared), Used (it is shared and
   *  cannot be modified)
   */
  public Transfer_StatusResult Status() {
    return Transfer_StatusResult.swigToEnum(OCCwrapJavaJNI.Transfer_Binder_Status(swigCPtr, this));
  }

  /**
   *  Returns execution status
   */
  public Transfer_StatusExec StatusExec() {
    return Transfer_StatusExec.swigToEnum(OCCwrapJavaJNI.Transfer_Binder_StatusExec(swigCPtr, this));
  }

  /**
   *  Modifies execution status; called by TransferProcess only
   *  (for StatusError, rather use SetError, below)
   */
  public void SetStatusExec(Transfer_StatusExec stat) {
    OCCwrapJavaJNI.Transfer_Binder_SetStatusExec(swigCPtr, this, stat.swigValue());
  }

  /**
   *  Used to declare an individual transfer as beeing erroneous
   *  (Status is set to Void, StatusExec is set to Error, <errmess>
   *  is added to Check's list of Fails)
   *  It is possible to record several messages of error
   * 
   *  It has same effect for TransferProcess as raising an exception
   *  during the operation of Transfer, except the Transfer tries to
   *  continue (as if ErrorHandle had been set)
   */
  public void AddFail(String mess, String orig) {
    OCCwrapJavaJNI.Transfer_Binder_AddFail__SWIG_0(swigCPtr, this, mess, orig);
  }

  public void AddFail(String mess) {
    OCCwrapJavaJNI.Transfer_Binder_AddFail__SWIG_1(swigCPtr, this, mess);
  }

  /**
   *  Used to attach a Warning Message to an individual Transfer
   *  It has no effect on the Status
   */
  public void AddWarning(String mess, String orig) {
    OCCwrapJavaJNI.Transfer_Binder_AddWarning__SWIG_0(swigCPtr, this, mess, orig);
  }

  public void AddWarning(String mess) {
    OCCwrapJavaJNI.Transfer_Binder_AddWarning__SWIG_1(swigCPtr, this, mess);
  }

  public  Interface_Check  Check() {
    return new Interface_Check ( OCCwrapJavaJNI.Transfer_Binder_Check(swigCPtr, this), true );
  }

  public  Interface_Check  CCheck() {
    return new Interface_Check ( OCCwrapJavaJNI.Transfer_Binder_CCheck(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Transfer_Binder_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Transfer_Binder_get_type_descriptor(), true );
  }

  public static  Transfer_Binder  DownCast( Standard_Transient  T) {
    return new Transfer_Binder ( OCCwrapJavaJNI.Transfer_Binder_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Transfer_Binder_TypeOf(), true );
  }

}
