package opencascade;

/**
 *  Result of a Check operation (especially from InterfaceModel)
 */
public class Interface_CheckIterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Interface_CheckIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Interface_CheckIterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Interface_CheckIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Interface_CheckIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an empty CheckIterator
   */
  public Interface_CheckIterator() {
    this(OCCwrapJavaJNI.new_Interface_CheckIterator__SWIG_0(), true);
  }

  /**
   *  Creates a CheckIterator with a name (displayed by Print as a
   *  title)
   */
  public Interface_CheckIterator(String name) {
    this(OCCwrapJavaJNI.new_Interface_CheckIterator__SWIG_1(name), true);
  }

  /**
   *  Sets / Changes the name
   */
  public void SetName(String name) {
    OCCwrapJavaJNI.Interface_CheckIterator_SetName(swigCPtr, this, name);
  }

  /**
   *  Returns the recorded name (can be empty)
   */
  public String Name() {
    return OCCwrapJavaJNI.Interface_CheckIterator_Name(swigCPtr, this);
  }

  /**
   *  Defines a Model, used to locate entities (not required, if it
   *  is absent, entities are simply less documented)
   */
  public void SetModel( Interface_InterfaceModel  model) {
    OCCwrapJavaJNI.Interface_CheckIterator_SetModel(swigCPtr, this,  Interface_InterfaceModel.getCPtr(model) , model);
  }

  public  Interface_InterfaceModel  Model() {
    return new Interface_InterfaceModel ( OCCwrapJavaJNI.Interface_CheckIterator_Model(swigCPtr, this), true );
  }

  /**
   *  Clears the list of checks
   */
  public void Clear() {
    OCCwrapJavaJNI.Interface_CheckIterator_Clear(swigCPtr, this);
  }

  /**
   *  Merges another CheckIterator into <me>, i.e. adds each of its
   *  Checks. Content of <other> remains unchanged.
   *  Takes also the Model but not the Name
   */
  public void Merge( Interface_CheckIterator  other) {
    OCCwrapJavaJNI.Interface_CheckIterator_Merge(swigCPtr, this, Interface_CheckIterator.getCPtr(other), other);
  }

  /**
   *  Adds a Check to the list to be iterated
   *  This Check is Accompanied by Entity Number in the Model
   *  (0 for Global Check or Entity unknown in the Model), if 0 and
   *  Model is recorded in <me>, it is computed
   */
  public void Add( Interface_Check  ach, int num) {
    OCCwrapJavaJNI.Interface_CheckIterator_Add__SWIG_0(swigCPtr, this,  Interface_Check.getCPtr(ach) , ach, num);
  }

  public void Add( Interface_Check  ach) {
    OCCwrapJavaJNI.Interface_CheckIterator_Add__SWIG_1(swigCPtr, this,  Interface_Check.getCPtr(ach) , ach);
  }

  public  Interface_Check  Check(int num) {
    return new Interface_Check ( OCCwrapJavaJNI.Interface_CheckIterator_Check__SWIG_0(swigCPtr, this, num), true );
  }

  public  Interface_Check  Check( Standard_Transient  ent) {
    return new Interface_Check ( OCCwrapJavaJNI.Interface_CheckIterator_Check__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent), true );
  }

  public  Interface_Check  CCheck(int num) {
    return new Interface_Check ( OCCwrapJavaJNI.Interface_CheckIterator_CCheck__SWIG_0(swigCPtr, this, num), true );
  }

  public  Interface_Check  CCheck( Standard_Transient  ent) {
    return new Interface_Check ( OCCwrapJavaJNI.Interface_CheckIterator_CCheck__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent), true );
  }

  /**
   *  Returns True if : no Fail has been recorded if <failsonly> is
   *  True, no Check at all if <failsonly> is False
   */
  public long IsEmpty(long failsonly) {
    return OCCwrapJavaJNI.Interface_CheckIterator_IsEmpty(swigCPtr, this, failsonly);
  }

  /**
   *  Returns worst status among : OK, Warning, Fail
   */
  public Interface_CheckStatus Status() {
    return Interface_CheckStatus.swigToEnum(OCCwrapJavaJNI.Interface_CheckIterator_Status(swigCPtr, this));
  }

  /**
   *  Tells if this check list complies with a given status :
   *  OK (i.e. empty),  Warning (at least one Warning, but no Fail),
   *  Fail (at least one), Message (not OK), NoFail, Any
   */
  public long Complies(Interface_CheckStatus status) {
    return OCCwrapJavaJNI.Interface_CheckIterator_Complies(swigCPtr, this, status.swigValue());
  }

  /**
   *  Returns a CheckIterator which contains the checks which comply
   *  with a given status
   *  Each check is added completely (no split Warning/Fail)
   */
  public Interface_CheckIterator Extract(Interface_CheckStatus status) {
    return new Interface_CheckIterator(OCCwrapJavaJNI.Interface_CheckIterator_Extract__SWIG_0(swigCPtr, this, status.swigValue()), true);
  }

  /**
   *  Returns a CheckIterator which contains the check which comply
   *  with a message, plus some conditions as follows :
   *  <incl> = 0 : <mess> exactly matches one of the messages
   *  <incl> < 0 : <mess> is contained by one of the messages
   *  <incl> > 0 : <mess> contains one of the messages
   *  For <status> : for CheckWarning and CheckFail, considers only
   *  resp. Warning or Check messages. for CheckAny, considers all
   *  other values are ignored (answer will be false)
   *  Each Check which complies is entirely taken
   */
  public Interface_CheckIterator Extract(String mess, int incl, Interface_CheckStatus status) {
    return new Interface_CheckIterator(OCCwrapJavaJNI.Interface_CheckIterator_Extract__SWIG_1(swigCPtr, this, mess, incl, status.swigValue()), true);
  }

  /**
   *  Removes the messages of all Checks, under these conditions :
   *  <incl> = 0 : <mess> exactly matches one of the messages
   *  <incl> < 0 : <mess> is contained by one of the messages
   *  <incl> > 0 : <mess> contains one of the messages
   *  For <status> : for CheckWarning and CheckFail, considers only
   *  resp. Warning or Check messages. for CheckAny, considers all
   *  other values are ignored (nothing is done)
   *  Returns True if at least one message has been removed, False else
   */
  public long Remove(String mess, int incl, Interface_CheckStatus status) {
    return OCCwrapJavaJNI.Interface_CheckIterator_Remove(swigCPtr, this, mess, incl, status.swigValue());
  }

  public  TColStd_HSequenceOfTransient  Checkeds(long failsonly, long global) {
    return new TColStd_HSequenceOfTransient ( OCCwrapJavaJNI.Interface_CheckIterator_Checkeds(swigCPtr, this, failsonly, global), true );
  }

  /**
   *  Starts Iteration. Thus, it is possible to restart it
   *  Remark : an iteration may be done with a const Iterator
   *  While its content is modified (through a pointer), this allows
   *  to give it as a const argument to a function
   */
  public void Start() {
    OCCwrapJavaJNI.Interface_CheckIterator_Start(swigCPtr, this);
  }

  /**
   *  Returns True if there are more Checks to get
   */
  public long More() {
    return OCCwrapJavaJNI.Interface_CheckIterator_More(swigCPtr, this);
  }

  /**
   *  Sets Iteration to next Item
   */
  public void Next() {
    OCCwrapJavaJNI.Interface_CheckIterator_Next(swigCPtr, this);
  }

  public  Interface_Check  Value() {
    return new Interface_Check ( OCCwrapJavaJNI.Interface_CheckIterator_Value(swigCPtr, this), true );
  }

  /**
   *  Returns Number of Entity for the Check currently iterated
   *  or 0 for GlobalCheck
   */
  public int Number() {
    return OCCwrapJavaJNI.Interface_CheckIterator_Number(swigCPtr, this);
  }

  /**
   *  Prints the list of Checks with their attached Numbers
   *  If <failsonly> is True, prints only Fail messages
   *  If <failsonly> is False, prints all messages
   *  If <final> = 0 (D), prints also original messages if different
   *  If <final> < 0, prints only original messages
   *  If <final> > 0, prints only final messages
   *  It uses the recorded Model if it is defined
   *  Remark : Works apart from the iteration methods (no interference)
   */
  public void Print( Message_Messenger  S, long failsonly, int arg2) {
    OCCwrapJavaJNI.Interface_CheckIterator_Print__SWIG_0(swigCPtr, this,  Message_Messenger.getCPtr(S) , S, failsonly, arg2);
  }

  /**
   *  Works as Print without a model, but for entities which have
   *  no attached number (Number not positive), tries to compute
   *  this Number from <model> and displays "original" or "computed"
   */
  public void Print( Message_Messenger  S, long failsonly) {
    OCCwrapJavaJNI.Interface_CheckIterator_Print__SWIG_1(swigCPtr, this,  Message_Messenger.getCPtr(S) , S, failsonly);
  }

  public void Print( Message_Messenger  S,  Interface_InterfaceModel  model, long failsonly, int arg3) {
    OCCwrapJavaJNI.Interface_CheckIterator_Print__SWIG_2(swigCPtr, this,  Message_Messenger.getCPtr(S) , S,  Interface_InterfaceModel.getCPtr(model) , model, failsonly, arg3);
  }

  public void Print( Message_Messenger  S,  Interface_InterfaceModel  model, long failsonly) {
    OCCwrapJavaJNI.Interface_CheckIterator_Print__SWIG_3(swigCPtr, this,  Message_Messenger.getCPtr(S) , S,  Interface_InterfaceModel.getCPtr(model) , model, failsonly);
  }

  /**
   *  Clears data of iteration
   */
  public void Destroy() {
    OCCwrapJavaJNI.Interface_CheckIterator_Destroy(swigCPtr, this);
  }

}
