package opencascade;

/**
 *  Class for synchronization of transactions within multiple documents.
 *  Each transaction of this class involvess one transaction in each modified document.
 * 
 *  The documents to be synchronized should be added explicitly to
 *  the manager; then its interface is uesd to ensure that all transactions
 *  (Open/Commit, Undo/Redo) are performed synchronously in all managed documents.
 * 
 *  The current implementation does not support nested transactions
 *  on multitransaction manager level. It only sets the flag enabling
 *  or disabling nested transactions in all its documents, so that
 *  a nested transaction can be opened for each particular document
 *  with TDocStd_Document class interface.
 * 
 *  NOTE: When you invoke CommitTransaction of multi transaction
 *  manager, all nested transaction of its documents will be closed (commited).
 */
public class TDocStd_MultiTransactionManager extends Standard_Transient {
  TDocStd_MultiTransactionManager(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructor
   */
  public TDocStd_MultiTransactionManager() {
    this(OCCwrapJavaJNI.new_TDocStd_MultiTransactionManager(), true);
  }

  /**
   *  Sets undo limit for the manager and all documents.
   */
  public void SetUndoLimit(int theLimit) {
    OCCwrapJavaJNI.TDocStd_MultiTransactionManager_SetUndoLimit(swigCPtr, this, theLimit);
  }

  /**
   *  Returns undo limit for the manager.
   */
  public int GetUndoLimit() {
    return OCCwrapJavaJNI.TDocStd_MultiTransactionManager_GetUndoLimit(swigCPtr, this);
  }

  /**
   *  Undoes the current transaction of the manager.
   *  It calls the Undo () method of the document being
   *  on top of the manager list of undos (list.First())
   *  and moves the list item to the top of the list of manager
   *  redos (list.Prepend(item)).
   */
  public void Undo() {
    OCCwrapJavaJNI.TDocStd_MultiTransactionManager_Undo(swigCPtr, this);
  }

  /**
   *  Redoes the current transaction of the application. It calls
   *  the Redo () method of the document being on top of the
   *  manager list of redos (list.First()) and moves the list
   *  item to the top of the list of manager undos (list.Prepend(item)).
   */
  public void Redo() {
    OCCwrapJavaJNI.TDocStd_MultiTransactionManager_Redo(swigCPtr, this);
  }

  /**
   *  Opens transaction in each document and sets the flag that
   *  transaction is opened. If there are already opened transactions in the documents,
   *  these transactions will be aborted before openning new ones.
   */
  public void OpenCommand() {
    OCCwrapJavaJNI.TDocStd_MultiTransactionManager_OpenCommand(swigCPtr, this);
  }

  /**
   *  Unsets the flag of started manager transaction and aborts
   *  transaction in each document.
   */
  public void AbortCommand() {
    OCCwrapJavaJNI.TDocStd_MultiTransactionManager_AbortCommand(swigCPtr, this);
  }

  /**
   *  Commits transaction in all documents and fills the transaction manager
   *  with the documents that have been changed during the transaction.
   *  Returns True if new data has been added to myUndos.
   *  NOTE: All nested transactions in the documents will be commited.
   */
  public long CommitCommand() {
    return OCCwrapJavaJNI.TDocStd_MultiTransactionManager_CommitCommand__SWIG_0(swigCPtr, this);
  }

  /**
   *  Makes the same steps as the previous function but defines the name for transaction.
   *  Returns True if new data has been added to myUndos.
   */
  public long CommitCommand( TCollection_ExtendedString  theName) {
    return OCCwrapJavaJNI.TDocStd_MultiTransactionManager_CommitCommand__SWIG_1(swigCPtr, this, TCollection_ExtendedString.getCPtr(theName), theName);
  }

  /**
   *  Returns true if a transaction is opened.
   */
  public long HasOpenCommand() {
    return OCCwrapJavaJNI.TDocStd_MultiTransactionManager_HasOpenCommand(swigCPtr, this);
  }

  /**
   *  Removes undo information from the list of undos of the manager and
   *  all documents which have been modified during the transaction.
   */
  public void RemoveLastUndo() {
    OCCwrapJavaJNI.TDocStd_MultiTransactionManager_RemoveLastUndo(swigCPtr, this);
  }

  /**
   *  Dumps transactions in undos and redos
   */
  public void DumpTransaction(SWIGTYPE_p_Standard_OStream theOS) {
    OCCwrapJavaJNI.TDocStd_MultiTransactionManager_DumpTransaction(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(theOS));
  }

  /**
   *  Adds the document to the transaction manager and
   *  checks if it has been already added
   */
  public void AddDocument( TDocStd_Document  theDoc) {
    OCCwrapJavaJNI.TDocStd_MultiTransactionManager_AddDocument(swigCPtr, this,  TDocStd_Document.getCPtr(theDoc) , theDoc);
  }

  /**
   *  Removes the document from the transaction manager.
   */
  public void RemoveDocument( TDocStd_Document  theDoc) {
    OCCwrapJavaJNI.TDocStd_MultiTransactionManager_RemoveDocument(swigCPtr, this,  TDocStd_Document.getCPtr(theDoc) , theDoc);
  }

  /**
   *  Returns the added documents to the transaction manager.
   */
  public  TDocStd_SequenceOfDocument  Documents() {
    TDocStd_SequenceOfDocument ret = new TDocStd_SequenceOfDocument(OCCwrapJavaJNI.TDocStd_MultiTransactionManager_Documents(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Sets nested transaction mode if isAllowed == Standard_True
   *  NOTE: field myIsNestedTransactionMode exists only for synchronization
   *  between several documents and has no effect on transactions
   *  of multitransaction manager.
   */
  public void SetNestedTransactionMode(long isAllowed) {
    OCCwrapJavaJNI.TDocStd_MultiTransactionManager_SetNestedTransactionMode__SWIG_0(swigCPtr, this, isAllowed);
  }

  public void SetNestedTransactionMode() {
    OCCwrapJavaJNI.TDocStd_MultiTransactionManager_SetNestedTransactionMode__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns Standard_True if NestedTransaction mode is set.
   *  Methods for protection of changes outside transactions
   */
  public long IsNestedTransactionMode() {
    return OCCwrapJavaJNI.TDocStd_MultiTransactionManager_IsNestedTransactionMode(swigCPtr, this);
  }

  /**
   *  If theTransactionOnly is True, denies all changes outside transactions.
   */
  public void SetModificationMode(long theTransactionOnly) {
    OCCwrapJavaJNI.TDocStd_MultiTransactionManager_SetModificationMode(swigCPtr, this, theTransactionOnly);
  }

  /**
   *  Returns True if changes are allowed only inside transactions.
   */
  public long ModificationMode() {
    return OCCwrapJavaJNI.TDocStd_MultiTransactionManager_ModificationMode(swigCPtr, this);
  }

  /**
   *  Clears undos in the manager and in documents.
   */
  public void ClearUndos() {
    OCCwrapJavaJNI.TDocStd_MultiTransactionManager_ClearUndos(swigCPtr, this);
  }

  /**
   *  Clears redos in the manager and in documents.
   */
  public void ClearRedos() {
    OCCwrapJavaJNI.TDocStd_MultiTransactionManager_ClearRedos(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDocStd_MultiTransactionManager_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDocStd_MultiTransactionManager_get_type_descriptor(), true );
  }

  public static  TDocStd_MultiTransactionManager  DownCast( Standard_Transient  T) {
    return new TDocStd_MultiTransactionManager ( OCCwrapJavaJNI.TDocStd_MultiTransactionManager_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDocStd_MultiTransactionManager_TypeOf(), true );
  }

}
