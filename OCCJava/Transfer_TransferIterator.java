package opencascade;

/**
 *  Defines an Iterator on the result of a Transfer
 *  Available for Normal Results or not (Erroneous Transfer)
 *  It gives several kinds of Informations, and allows to consider
 *  various criteria (criteria are cumulative)
 */
public class Transfer_TransferIterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Transfer_TransferIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Transfer_TransferIterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Transfer_TransferIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Transfer_TransferIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an empty Iterator
   */
  public Transfer_TransferIterator() {
    this(OCCwrapJavaJNI.new_Transfer_TransferIterator(), true);
  }

  /**
   *  Adds a Binder to the iteration list (construction)
   */
  public void AddItem( Transfer_Binder  atr) {
    OCCwrapJavaJNI.Transfer_TransferIterator_AddItem(swigCPtr, this,  Transfer_Binder.getCPtr(atr) , atr);
  }

  /**
   *  Selects Items on the Type of Binder : keep only
   *  Binders which are of a given Type (if keep is True) or
   *  reject only them (if keep is False)
   */
  public void SelectBinder( Standard_Type  atype, long keep) {
    OCCwrapJavaJNI.Transfer_TransferIterator_SelectBinder(swigCPtr, this,  Standard_Type.getCPtr(atype) , atype, keep);
  }

  /**
   *  Selects Items on the Type of Result. Considers only Unique
   *  Results. Considers Dynamic Type for Transient Result,
   *  Static Type (the one given to define the Binder) else.
   * 
   *  Results which are of a given Type (if keep is True) or reject
   *  only them (if keep is False)
   */
  public void SelectResult( Standard_Type  atype, long keep) {
    OCCwrapJavaJNI.Transfer_TransferIterator_SelectResult(swigCPtr, this,  Standard_Type.getCPtr(atype) , atype, keep);
  }

  /**
   *  Select Items according Unicity : keep only Unique Results (if
   *  keep is True) or keep only Multiple Results (if keep is False)
   */
  public void SelectUnique(long keep) {
    OCCwrapJavaJNI.Transfer_TransferIterator_SelectUnique(swigCPtr, this, keep);
  }

  /**
   *  Selects/Unselect (according to <keep> an item designated by
   *  its rank <num> in the list
   *  Used by sub-classes which have specific criteria
   */
  public void SelectItem(int num, long keep) {
    OCCwrapJavaJNI.Transfer_TransferIterator_SelectItem(swigCPtr, this, num, keep);
  }

  /**
   *  Returns count of Binders to be iterated
   */
  public int Number() {
    return OCCwrapJavaJNI.Transfer_TransferIterator_Number(swigCPtr, this);
  }

  /**
   *  Clears Iteration in progress, to allow it to be restarted
   */
  public void Start() {
    OCCwrapJavaJNI.Transfer_TransferIterator_Start(swigCPtr, this);
  }

  /**
   *  Returns True if there are other Items to iterate
   */
  public long More() {
    return OCCwrapJavaJNI.Transfer_TransferIterator_More(swigCPtr, this);
  }

  /**
   *  Sets Iteration to the next Item
   */
  public void Next() {
    OCCwrapJavaJNI.Transfer_TransferIterator_Next(swigCPtr, this);
  }

  public  Transfer_Binder  Value() {
    return new Transfer_Binder ( OCCwrapJavaJNI.Transfer_TransferIterator_Value(swigCPtr, this), true );
  }

  /**
   *  Returns True if current Item brings a Result, Transient
   *  (Handle) or not or Multiple. That is to say, if it corresponds
   *  to a normally acheived Transfer, Transient Result is read by
   *  specific TransientResult below.
   *  Other kind of Result must be read specifically from its Binder
   */
  public long HasResult() {
    return OCCwrapJavaJNI.Transfer_TransferIterator_HasResult(swigCPtr, this);
  }

  /**
   *  Returns True if Current Item has a Unique Result
   */
  public long HasUniqueResult() {
    return OCCwrapJavaJNI.Transfer_TransferIterator_HasUniqueResult(swigCPtr, this);
  }

  public  Standard_Type  ResultType() {
    return new Standard_Type ( OCCwrapJavaJNI.Transfer_TransferIterator_ResultType(swigCPtr, this), true );
  }

  /**
   *  Returns True if the current Item has a Transient Unique
   *  Result (if yes, use TransientResult to get it)
   */
  public long HasTransientResult() {
    return OCCwrapJavaJNI.Transfer_TransferIterator_HasTransientResult(swigCPtr, this);
  }

  public  Standard_Transient  TransientResult() {
    return new Standard_Transient ( OCCwrapJavaJNI.Transfer_TransferIterator_TransientResult(swigCPtr, this), true );
  }

  /**
   *  Returns Execution Status of current Binder
   *  Normal transfer corresponds to StatusDone
   */
  public Transfer_StatusExec Status() {
    return Transfer_StatusExec.swigToEnum(OCCwrapJavaJNI.Transfer_TransferIterator_Status(swigCPtr, this));
  }

  /**
   *  Returns True if Fail Messages are recorded with the current
   *  Binder. They can then be read through Check (see below)
   */
  public long HasFails() {
    return OCCwrapJavaJNI.Transfer_TransferIterator_HasFails(swigCPtr, this);
  }

  /**
   *  Returns True if Warning Messages are recorded with the current
   *  Binder. They can then be read through Check (see below)
   */
  public long HasWarnings() {
    return OCCwrapJavaJNI.Transfer_TransferIterator_HasWarnings(swigCPtr, this);
  }

  public  Interface_Check  Check() {
    return new Interface_Check ( OCCwrapJavaJNI.Transfer_TransferIterator_Check(swigCPtr, this), true );
  }

}
