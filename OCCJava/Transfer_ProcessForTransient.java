package opencascade;

public class Transfer_ProcessForTransient extends Standard_Transient {
  Transfer_ProcessForTransient(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Sets TransferProcess at initial state. Gives an Initial size
   *  (indicative) for the Map when known (default is 10000).
   *  Sets default trace file as a printer and default trace level
   *  (see Message_TraceFile).
   */
  public Transfer_ProcessForTransient(int nb) {
    this(OCCwrapJavaJNI.new_Transfer_ProcessForTransient__SWIG_0(nb), true);
  }

  /**
   *  Sets TransferProcess at initial state. Gives an Initial size
   *  (indicative) for the Map when known (default is 10000).
   *  Sets a specified printer.
   */
  public Transfer_ProcessForTransient() {
    this(OCCwrapJavaJNI.new_Transfer_ProcessForTransient__SWIG_1(), true);
  }

  public Transfer_ProcessForTransient( Message_Messenger  printer, int nb) {
    this(OCCwrapJavaJNI.new_Transfer_ProcessForTransient__SWIG_2( Message_Messenger.getCPtr(printer) , printer, nb), true);
  }

  public Transfer_ProcessForTransient( Message_Messenger  printer) {
    this(OCCwrapJavaJNI.new_Transfer_ProcessForTransient__SWIG_3( Message_Messenger.getCPtr(printer) , printer), true);
  }

  /**
   *  Resets a TransferProcess as ready for a completely new work.
   *  Clears general data (roots) and the Map
   */
  public void Clear() {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_Clear(swigCPtr, this);
  }

  /**
   *  Rebuilds the Map and the roots to really remove Unbound items
   *  Because Unbind keeps the entity in place, even if not bound
   *  Hence, working by checking new items is meaningless if a
   *  formerly unbound item is rebound
   */
  public void Clean() {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_Clean(swigCPtr, this);
  }

  /**
   *  Resizes the Map as required (if a new reliable value has been
   *  determined). Acts only if <nb> is greater than actual NbMapped
   */
  public void Resize(int nb) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_Resize(swigCPtr, this, nb);
  }

  /**
   *  Defines an Actor, which is used for automatic Transfer
   *  If already defined, the new Actor is cumulated
   *  (see SetNext from Actor)
   */
  public void SetActor( Transfer_ActorOfProcessForTransient  actor) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_SetActor(swigCPtr, this,  Transfer_ActorOfProcessForTransient.getCPtr(actor) , actor);
  }

  public  Transfer_ActorOfProcessForTransient  Actor() {
    return new Transfer_ActorOfProcessForTransient ( OCCwrapJavaJNI.Transfer_ProcessForTransient_Actor(swigCPtr, this), true );
  }

  public  Transfer_Binder  Find( Standard_Transient  start) {
    return new Transfer_Binder ( OCCwrapJavaJNI.Transfer_ProcessForTransient_Find(swigCPtr, this,  Standard_Transient.getCPtr(start) , start), true );
  }

  /**
   *  Returns True if a Result (whatever its form) is Bound with
   *  a starting Object. I.e., if a Binder with a Result set,
   *  is linked with it
   *  Considers a category number, by default 0
   */
  public long IsBound( Standard_Transient  start) {
    return OCCwrapJavaJNI.Transfer_ProcessForTransient_IsBound(swigCPtr, this,  Standard_Transient.getCPtr(start) , start);
  }

  /**
   *  Returns True if the result of the transfer of an object is
   *  already used in other ones. If it is, Rebind cannot change it.
   *  Considers a category number, by default 0
   */
  public long IsAlreadyUsed( Standard_Transient  start) {
    return OCCwrapJavaJNI.Transfer_ProcessForTransient_IsAlreadyUsed(swigCPtr, this,  Standard_Transient.getCPtr(start) , start);
  }

  /**
   *  Creates a Link a starting Object with a Binder. This Binder
   *  can either bring a Result (effective Binding) or none (it can
   *  be set later : pre-binding).
   *  Considers a category number, by default 0
   */
  public void Bind( Standard_Transient  start,  Transfer_Binder  binder) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_Bind(swigCPtr, this,  Standard_Transient.getCPtr(start) , start,  Transfer_Binder.getCPtr(binder) , binder);
  }

  /**
   *  Changes the Binder linked with a starting Object for its
   *  unitary transfer. This it can be useful when the exact form
   *  of the result is known once the transfer is widely engaged.
   *  This can be done only on first transfer.
   *  Considers a category number, by default 0
   */
  public void Rebind( Standard_Transient  start,  Transfer_Binder  binder) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_Rebind(swigCPtr, this,  Standard_Transient.getCPtr(start) , start,  Transfer_Binder.getCPtr(binder) , binder);
  }

  /**
   *  Removes the Binder linked with a starting object
   *  If this Binder brings a non-empty Check, it is replaced by
   *  a VoidBinder. Also removes from the list of Roots as required.
   *  Returns True if done, False if <start> was not bound
   *  Considers a category number, by default 0
   */
  public long Unbind( Standard_Transient  start) {
    return OCCwrapJavaJNI.Transfer_ProcessForTransient_Unbind(swigCPtr, this,  Standard_Transient.getCPtr(start) , start);
  }

  public  Transfer_Binder  FindElseBind( Standard_Transient  start) {
    return new Transfer_Binder ( OCCwrapJavaJNI.Transfer_ProcessForTransient_FindElseBind(swigCPtr, this,  Standard_Transient.getCPtr(start) , start), true );
  }

  /**
   *  Sets Messenger used for outputting messages.
   */
  public void SetMessenger( Message_Messenger  messenger) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_SetMessenger(swigCPtr, this,  Message_Messenger.getCPtr(messenger) , messenger);
  }

  public  Message_Messenger  Messenger() {
    return new Message_Messenger ( OCCwrapJavaJNI.Transfer_ProcessForTransient_Messenger(swigCPtr, this), true );
  }

  /**
   *  Sets trace level used for outputting messages:
   *  <trace> = 0 : no trace at all
   *  <trace> = 1 : handled exceptions and calls to AddError
   *  <trace> = 2 : also calls to AddWarning
   *  <trace> = 3 : also traces new Roots
   *  (uses method ErrorTrace).
   *  Default is 1 : Errors traced
   */
  public void SetTraceLevel(int tracelev) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_SetTraceLevel(swigCPtr, this, tracelev);
  }

  /**
   *  Returns trace level used for outputting messages.
   */
  public int TraceLevel() {
    return OCCwrapJavaJNI.Transfer_ProcessForTransient_TraceLevel(swigCPtr, this);
  }

  /**
   *  New name for AddFail (Msg)
   */
  public void SendFail( Standard_Transient  start,  Message_Msg  amsg) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_SendFail(swigCPtr, this,  Standard_Transient.getCPtr(start) , start, Message_Msg.getCPtr(amsg), amsg);
  }

  /**
   *  New name for AddWarning (Msg)
   */
  public void SendWarning( Standard_Transient  start,  Message_Msg  amsg) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_SendWarning(swigCPtr, this,  Standard_Transient.getCPtr(start) , start, Message_Msg.getCPtr(amsg), amsg);
  }

  /**
   *  Adds an information message
   *  Trace is filled if trace level is at least 3
   */
  public void SendMsg( Standard_Transient  start,  Message_Msg  amsg) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_SendMsg(swigCPtr, this,  Standard_Transient.getCPtr(start) , start, Message_Msg.getCPtr(amsg), amsg);
  }

  /**
   *  Adds an Error message to a starting entity (to the check of
   *  its Binder of category 0, as a Fail)
   */
  public void AddFail( Standard_Transient  start, String mess, String orig) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_AddFail__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(start) , start, mess, orig);
  }

  /**
   *  Adds an Error Message to a starting entity from the definition
   *  of a Msg (Original+Value)
   */
  public void AddFail( Standard_Transient  start, String mess) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_AddFail__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(start) , start, mess);
  }

  /**
   *  (other name of AddFail, maintained for compatibility)
   */
  public void AddError( Standard_Transient  start, String mess, String orig) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_AddError__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(start) , start, mess, orig);
  }

  public void AddError( Standard_Transient  start, String mess) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_AddError__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(start) , start, mess);
  }

  public void AddFail( Standard_Transient  start,  Message_Msg  amsg) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_AddFail__SWIG_2(swigCPtr, this,  Standard_Transient.getCPtr(start) , start, Message_Msg.getCPtr(amsg), amsg);
  }

  /**
   *  Adds a Warning message to a starting entity (to the check of
   *  its Binder of category 0)
   */
  public void AddWarning( Standard_Transient  start, String mess, String orig) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_AddWarning__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(start) , start, mess, orig);
  }

  /**
   *  Adds a Warning Message to a starting entity from the definition
   *  of a Msg (Original+Value)
   */
  public void AddWarning( Standard_Transient  start, String mess) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_AddWarning__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(start) , start, mess);
  }

  public void AddWarning( Standard_Transient  start,  Message_Msg  amsg) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_AddWarning__SWIG_2(swigCPtr, this,  Standard_Transient.getCPtr(start) , start, Message_Msg.getCPtr(amsg), amsg);
  }

  public void Mend( Standard_Transient  start, String pref) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_Mend__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(start) , start, pref);
  }

  public void Mend( Standard_Transient  start) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_Mend__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(start) , start);
  }

  public  Interface_Check  Check( Standard_Transient  start) {
    return new Interface_Check ( OCCwrapJavaJNI.Transfer_ProcessForTransient_Check(swigCPtr, this,  Standard_Transient.getCPtr(start) , start), true );
  }

  /**
   *  Binds a starting object with a Transient Result.
   *  Uses a SimpleBinderOfTransient to work. If there is already
   *  one but with no Result set, sets its Result.
   *  Considers a category number, by default 0
   */
  public void BindTransient( Standard_Transient  start,  Standard_Transient  res) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_BindTransient(swigCPtr, this,  Standard_Transient.getCPtr(start) , start,  Standard_Transient.getCPtr(res) , res);
  }

  public  Standard_Transient  FindTransient( Standard_Transient  start) {
    return new Standard_Transient ( OCCwrapJavaJNI.Transfer_ProcessForTransient_FindTransient(swigCPtr, this,  Standard_Transient.getCPtr(start) , start), true );
  }

  /**
   *  Prepares an object <start> to be bound with several results.
   *  If no Binder is yet attached to <obj>, a MultipleBinder
   *  is created, empty. If a Binder is already set, it must
   *  accept Multiple Binding.
   *  Considers a category number, by default 0
   */
  public void BindMultiple( Standard_Transient  start) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_BindMultiple(swigCPtr, this,  Standard_Transient.getCPtr(start) , start);
  }

  /**
   *  Adds an item to a list of results bound to a starting object.
   *  Considers a category number, by default 0, for all results
   */
  public void AddMultiple( Standard_Transient  start,  Standard_Transient  res) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_AddMultiple(swigCPtr, this,  Standard_Transient.getCPtr(start) , start,  Standard_Transient.getCPtr(res) , res);
  }

  /**
   *  Searches for a transient result attached to a starting object,
   *  according to its type, by criterium IsKind(atype)
   * 
   *  In case of multiple result, explores the list and gives in
   *  <val> the first transient result IsKind(atype)
   *  Returns True and fills <val> if found
   *  Else, returns False (<val> is not touched, not even nullified)
   * 
   *  This syntactic form avoids to do DownCast : if a result is
   *  found with the good type, it is loaded in <val> and can be
   *  immediately used, well initialised
   */
  public long FindTypedTransient( Standard_Transient  start,  Standard_Type  atype,  Standard_Transient  val) {
    return OCCwrapJavaJNI.Transfer_ProcessForTransient_FindTypedTransient(swigCPtr, this,  Standard_Transient.getCPtr(start) , start,  Standard_Type.getCPtr(atype) , atype,  Standard_Transient.getCPtr(val) , val);
  }

  /**
   *  Searches for a transient result recorded in a Binder, whatever
   *  this Binder is recorded or not in <me>
   * 
   *  This is strictly equivalent to the class method GetTypedResult
   *  from class SimpleBinderOfTransient, but is just lighter to call
   * 
   *  Apart from this, works as FindTypedTransient
   */
  public long GetTypedTransient( Transfer_Binder  binder,  Standard_Type  atype,  Standard_Transient  val) {
    return OCCwrapJavaJNI.Transfer_ProcessForTransient_GetTypedTransient(swigCPtr, this,  Transfer_Binder.getCPtr(binder) , binder,  Standard_Type.getCPtr(atype) , atype,  Standard_Transient.getCPtr(val) , val);
  }

  /**
   *  Returns the maximum possible value for Map Index
   *  (no result can be bound with a value greater than it)
   */
  public int NbMapped() {
    return OCCwrapJavaJNI.Transfer_ProcessForTransient_NbMapped(swigCPtr, this);
  }

  public  Standard_Transient  Mapped(int num) {
    return new Standard_Transient ( OCCwrapJavaJNI.Transfer_ProcessForTransient_Mapped(swigCPtr, this, num), true );
  }

  /**
   *  Returns the Index value bound to a Starting Object, 0 if none
   */
  public int MapIndex( Standard_Transient  start) {
    return OCCwrapJavaJNI.Transfer_ProcessForTransient_MapIndex(swigCPtr, this,  Standard_Transient.getCPtr(start) , start);
  }

  public  Transfer_Binder  MapItem(int num) {
    return new Transfer_Binder ( OCCwrapJavaJNI.Transfer_ProcessForTransient_MapItem(swigCPtr, this, num), true );
  }

  /**
   *  Declares <obj> (and its Result) as Root. This status will be
   *  later exploited by RootResult, see below (Result can be
   *  produced at any time)
   */
  public void SetRoot( Standard_Transient  start) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_SetRoot(swigCPtr, this,  Standard_Transient.getCPtr(start) , start);
  }

  /**
   *  Enable (if <stat> True) or Disables (if <stat> False) Root
   *  Management. If it is set, Transfers are considered as stacked
   *  (a first Transfer commands other Transfers, and so on) and
   *  the Transfers commanded by an external caller are "Root".
   *  Remark : SetRoot can be called whatever this status, on every
   *  object.
   *  Default is set to True.
   */
  public void SetRootManagement(long stat) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_SetRootManagement(swigCPtr, this, stat);
  }

  /**
   *  Returns the count of recorded Roots
   */
  public int NbRoots() {
    return OCCwrapJavaJNI.Transfer_ProcessForTransient_NbRoots(swigCPtr, this);
  }

  public  Standard_Transient  Root(int num) {
    return new Standard_Transient ( OCCwrapJavaJNI.Transfer_ProcessForTransient_Root(swigCPtr, this, num), true );
  }

  public  Transfer_Binder  RootItem(int num) {
    return new Transfer_Binder ( OCCwrapJavaJNI.Transfer_ProcessForTransient_RootItem(swigCPtr, this, num), true );
  }

  /**
   *  Returns the index in the list of roots for a starting item,
   *  or 0 if it is not recorded as a root
   */
  public int RootIndex( Standard_Transient  start) {
    return OCCwrapJavaJNI.Transfer_ProcessForTransient_RootIndex(swigCPtr, this,  Standard_Transient.getCPtr(start) , start);
  }

  /**
   *  Returns Nesting Level of Transfers (managed by methods
   *  TranscriptWith & Co). Starts to zero. If no automatic Transfer
   *  is used, it remains to zero. Zero means Root Level.
   */
  public int NestingLevel() {
    return OCCwrapJavaJNI.Transfer_ProcessForTransient_NestingLevel(swigCPtr, this);
  }

  /**
   *  Resets Nesting Level of Transfers to Zero (Root Level),
   *  whatever its current value.
   */
  public void ResetNestingLevel() {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_ResetNestingLevel(swigCPtr, this);
  }

  /**
   *  Tells if <start> has been recognized as good candidate for
   *  Transfer. i.e. queries the Actor and its Nexts
   */
  public long Recognize( Standard_Transient  start) {
    return OCCwrapJavaJNI.Transfer_ProcessForTransient_Recognize(swigCPtr, this,  Standard_Transient.getCPtr(start) , start);
  }

  public  Transfer_Binder  Transferring( Standard_Transient  start) {
    return new Transfer_Binder ( OCCwrapJavaJNI.Transfer_ProcessForTransient_Transferring(swigCPtr, this,  Standard_Transient.getCPtr(start) , start), true );
  }

  /**
   *  Same as Transferring but does not return the Binder.
   *  Simply returns True in case of success (for user call)
   */
  public long Transfer( Standard_Transient  start) {
    return OCCwrapJavaJNI.Transfer_ProcessForTransient_Transfer(swigCPtr, this,  Standard_Transient.getCPtr(start) , start);
  }

  /**
   *  Allows controls if exceptions will be handled
   *  Transfer Operations
   *  <err> False : they are not handled with try {} catch {}
   *  <err> True  : they are
   *  Default is False: no handling performed
   */
  public void SetErrorHandle(long err) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_SetErrorHandle(swigCPtr, this, err);
  }

  /**
   *  Returns error handling flag
   */
  public long ErrorHandle() {
    return OCCwrapJavaJNI.Transfer_ProcessForTransient_ErrorHandle(swigCPtr, this);
  }

  /**
   *  Method called when trace is asked
   *  Calls PrintTrace to display information relevant for starting
   *  objects (which can be redefined)
   *  <level> is Nesting Level of Transfer (0 = root)
   *  <mode> controls the way the trace is done :
   *  0 neutral, 1 for Error, 2 for Warning message, 3 for new Root
   */
  public void StartTrace( Transfer_Binder  binder,  Standard_Transient  start, int level, int mode) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_StartTrace(swigCPtr, this,  Transfer_Binder.getCPtr(binder) , binder,  Standard_Transient.getCPtr(start) , start, level, mode);
  }

  /**
   *  Prints a short information on a starting object. By default
   *  prints its Dynamic Type. Can be redefined
   */
  public void PrintTrace( Standard_Transient  start,  Message_Messenger  S) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_PrintTrace(swigCPtr, this,  Standard_Transient.getCPtr(start) , start,  Message_Messenger.getCPtr(S) , S);
  }

  /**
   *  Returns True if we are surely in a DeadLoop. Evaluation is not
   *  exact, it is a "majorant" which must be computed fast.
   *  This "majorant" is : <alevel> greater than NbMapped.
   */
  public long IsLooping(int alevel) {
    return OCCwrapJavaJNI.Transfer_ProcessForTransient_IsLooping(swigCPtr, this, alevel);
  }

  /**
   *  Returns, as an iterator, the log of root transfer, i.e. the
   *  created objects and Binders bound to starting roots
   *  If withstart is given True, Starting Objets are also returned
   */
  public Transfer_IteratorOfProcessForTransient RootResult(long withstart) {
    return new Transfer_IteratorOfProcessForTransient(OCCwrapJavaJNI.Transfer_ProcessForTransient_RootResult__SWIG_0(swigCPtr, this, withstart), true);
  }

  public Transfer_IteratorOfProcessForTransient RootResult() {
    return new Transfer_IteratorOfProcessForTransient(OCCwrapJavaJNI.Transfer_ProcessForTransient_RootResult__SWIG_1(swigCPtr, this), true);
  }

  /**
   *  Returns, as an Iterator, the entire log of transfer (list of
   *  created objects and Binders which can bring errors)
   *  If withstart is given True, Starting Objets are also returned
   */
  public Transfer_IteratorOfProcessForTransient CompleteResult(long withstart) {
    return new Transfer_IteratorOfProcessForTransient(OCCwrapJavaJNI.Transfer_ProcessForTransient_CompleteResult__SWIG_0(swigCPtr, this, withstart), true);
  }

  public Transfer_IteratorOfProcessForTransient CompleteResult() {
    return new Transfer_IteratorOfProcessForTransient(OCCwrapJavaJNI.Transfer_ProcessForTransient_CompleteResult__SWIG_1(swigCPtr, this), true);
  }

  /**
   *  Returns Binders which are neither "Done" nor "Initial",
   *  that is Error,Loop or Run (abnormal states at end of Transfer)
   *  Starting Objects are given in correspondance in the iterator
   */
  public Transfer_IteratorOfProcessForTransient AbnormalResult() {
    return new Transfer_IteratorOfProcessForTransient(OCCwrapJavaJNI.Transfer_ProcessForTransient_AbnormalResult(swigCPtr, this), true);
  }

  /**
   *  Returns a CheckList as a list of Check : each one is for a
   *  starting entity which have either check (warning or fail)
   *  messages are attached, or are in abnormal state : that case
   *  gives a specific message
   *  If <erronly> is True, checks with Warnings only are ignored
   */
  public Interface_CheckIterator CheckList(long erronly) {
    return new Interface_CheckIterator(OCCwrapJavaJNI.Transfer_ProcessForTransient_CheckList(swigCPtr, this, erronly), true);
  }

  /**
   *  Returns, as an Iterator, the log of transfer for one object
   *  <level> = 0 : this object only
   *  and if <start> is a scope owner (else, <level> is ignored) :
   *  <level> = 1 : object plus its immediate scoped ones
   *  <level> = 2 : object plus all its scoped ones
   */
  public Transfer_IteratorOfProcessForTransient ResultOne( Standard_Transient  start, int level, long withstart) {
    return new Transfer_IteratorOfProcessForTransient(OCCwrapJavaJNI.Transfer_ProcessForTransient_ResultOne__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(start) , start, level, withstart), true);
  }

  public Transfer_IteratorOfProcessForTransient ResultOne( Standard_Transient  start, int level) {
    return new Transfer_IteratorOfProcessForTransient(OCCwrapJavaJNI.Transfer_ProcessForTransient_ResultOne__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(start) , start, level), true);
  }

  /**
   *  Returns a CheckList for one starting object
   *  <level> interpreted as by ResultOne
   *  If <erronly> is True, checks with Warnings only are ignored
   */
  public Interface_CheckIterator CheckListOne( Standard_Transient  start, int level, long erronly) {
    return new Interface_CheckIterator(OCCwrapJavaJNI.Transfer_ProcessForTransient_CheckListOne(swigCPtr, this,  Standard_Transient.getCPtr(start) , start, level, erronly), true);
  }

  /**
   *  Returns True if no check message is attached to a starting
   *  object. <level> interpreted as by ResultOne
   *  If <erronly> is True, checks with Warnings only are ignored
   */
  public long IsCheckListEmpty( Standard_Transient  start, int level, long erronly) {
    return OCCwrapJavaJNI.Transfer_ProcessForTransient_IsCheckListEmpty(swigCPtr, this,  Standard_Transient.getCPtr(start) , start, level, erronly);
  }

  /**
   *  Removes Results attached to (== Unbinds) a given object and,
   *  according <level> :
   *  <level> = 0 : only it
   *  <level> = 1 : it plus its immediately owned sub-results(scope)
   *  <level> = 2 : it plus all its owned sub-results(scope)
   */
  public void RemoveResult( Standard_Transient  start, int level, long compute) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_RemoveResult__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(start) , start, level, compute);
  }

  public void RemoveResult( Standard_Transient  start, int level) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_RemoveResult__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(start) , start, level);
  }

  /**
   *  Computes a number to be associated to a starting object in
   *  a check or a check-list
   *  By default, returns 0; can be redefined
   */
  public int CheckNum( Standard_Transient  start) {
    return OCCwrapJavaJNI.Transfer_ProcessForTransient_CheckNum(swigCPtr, this,  Standard_Transient.getCPtr(start) , start);
  }

  /**
   *  Sets Progress indicator
   */
  public void SetProgress( Message_ProgressIndicator  theProgress) {
    OCCwrapJavaJNI.Transfer_ProcessForTransient_SetProgress(swigCPtr, this,  Message_ProgressIndicator.getCPtr(theProgress) , theProgress);
  }

  public  Message_ProgressIndicator  GetProgress() {
    return new Message_ProgressIndicator ( OCCwrapJavaJNI.Transfer_ProcessForTransient_GetProgress(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Transfer_ProcessForTransient_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Transfer_ProcessForTransient_get_type_descriptor(), true );
  }

  public static  Transfer_ProcessForTransient  DownCast( Standard_Transient  T) {
    return new Transfer_ProcessForTransient ( OCCwrapJavaJNI.Transfer_ProcessForTransient_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Transfer_ProcessForTransient_TypeOf(), true );
  }

}
