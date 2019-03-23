package opencascade;

/**
 *  The contents of a TDocStd_Application, a
 *  document is a container for a data framework
 *  composed of labels and attributes. As such,
 *  TDocStd_Document is the entry point into the data framework.
 *  To gain access to the data, you create a document as follows:
 *  Handle(TDocStd_Document) MyDF = new TDocStd_Document
 *  The document also allows you to manage:
 *  -   modifications, providing Undo and Redo functions.
 *  -   command transactions.
 *  Warning: The only data saved is the framework (TDF_Data)
 */
public class TDocStd_Document extends CDM_Document {
  TDocStd_Document(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static  TDocStd_Document  Get( TDF_Label  L) {
    return new TDocStd_Document ( OCCwrapJavaJNI.TDocStd_Document_Get(TDF_Label.getCPtr(L), L), true );
  }

  /**
   *  Constructs a document object defined by the
   *  string astorageformat.
   */
  public TDocStd_Document( TCollection_ExtendedString  astorageformat) {
    this(OCCwrapJavaJNI.new_TDocStd_Document(TCollection_ExtendedString.getCPtr(astorageformat), astorageformat), true);
  }

  /**
   *  the document is saved in a file.
   */
  public long IsSaved() {
    return OCCwrapJavaJNI.TDocStd_Document_IsSaved(swigCPtr, this);
  }

  /**
   *  returns True if document differs from the state of last saving.
   *  this method have to be called only wroking in the transaction mode
   */
  public long IsChanged() {
    return OCCwrapJavaJNI.TDocStd_Document_IsChanged(swigCPtr, this);
  }

  /**
   *  This method have to be called to show document that it has been saved
   */
  public void SetSaved() {
    OCCwrapJavaJNI.TDocStd_Document_SetSaved(swigCPtr, this);
  }

  /**
   *  Say to document what it is not saved.
   *  Use value, returned earlier by GetSavedTime().
   */
  public void SetSavedTime(int theTime) {
    OCCwrapJavaJNI.TDocStd_Document_SetSavedTime(swigCPtr, this, theTime);
  }

  /**
   *  Returns value of <mySavedTime> to be used later in SetSavedTime()
   */
  public int GetSavedTime() {
    return OCCwrapJavaJNI.TDocStd_Document_GetSavedTime(swigCPtr, this);
  }

  /**
   *  raise if <me> is not saved.
   */
  public TCollection_ExtendedString GetName() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.TDocStd_Document_GetName(swigCPtr, this), true);
  }

  /**
   *  returns the OS  path of the  file, in wich one <me> is
   *  saved. Raise an exception if <me> is not saved.
   */
  public TCollection_ExtendedString GetPath() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.TDocStd_Document_GetPath(swigCPtr, this), true);
  }

  public void SetData( TDF_Data  data) {
    OCCwrapJavaJNI.TDocStd_Document_SetData(swigCPtr, this,  TDF_Data.getCPtr(data) , data);
  }

  public  TDF_Data  GetData() {
    return new TDF_Data ( OCCwrapJavaJNI.TDocStd_Document_GetData(swigCPtr, this), true );
  }

  /**
   *  Returns the main label in this data framework.
   *  By definition, this is the label with the entry 0:1.
   */
  public TDF_Label Main() {
    return new TDF_Label(OCCwrapJavaJNI.TDocStd_Document_Main(swigCPtr, this), true);
  }

  /**
   *  Returns True if the main label has no attributes
   */
  public long IsEmpty() {
    return OCCwrapJavaJNI.TDocStd_Document_IsEmpty(swigCPtr, this);
  }

  /**
   *  Returns False if the  document has been modified
   *  but not recomputed.
   */
  public long IsValid() {
    return OCCwrapJavaJNI.TDocStd_Document_IsValid(swigCPtr, this);
  }

  /**
   *  Notify the label as modified, the Document becomes UnValid.
   *  returns True if <L> has been notified as modified.
   */
  public void SetModified( TDF_Label  L) {
    OCCwrapJavaJNI.TDocStd_Document_SetModified(swigCPtr, this, TDF_Label.getCPtr(L), L);
  }

  /**
   *  Remove all modifications. After this call The document
   *  becomesagain Valid.
   */
  public void PurgeModified() {
    OCCwrapJavaJNI.TDocStd_Document_PurgeModified(swigCPtr, this);
  }

  /**
   *  Returns the labels which have been modified in
   *  this document.
   */
  public  TDF_LabelMap  GetModified() {
    TDF_LabelMap ret = new TDF_LabelMap(OCCwrapJavaJNI.TDocStd_Document_GetModified(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Launches a new command. This command may be undone.
   */
  public void NewCommand() {
    OCCwrapJavaJNI.TDocStd_Document_NewCommand(swigCPtr, this);
  }

  /**
   *  returns True if a Command transaction is open in the curret .
   */
  public long HasOpenCommand() {
    return OCCwrapJavaJNI.TDocStd_Document_HasOpenCommand(swigCPtr, this);
  }

  /**
   *  Opens a new command transaction in this document.
   *  You can use HasOpenCommand to see whether a command is already open.
   *  Exceptions
   *  Standard_DomainError if a command is already open in this document.
   */
  public void OpenCommand() {
    OCCwrapJavaJNI.TDocStd_Document_OpenCommand(swigCPtr, this);
  }

  /**
   *  Commits documents transactions and fills the
   *  transaction manager with documents that have
   *  been changed during the transaction.
   *  If no command transaction is open, nothing is done.
   *  Returns True if a new delta has been added to myUndos.
   */
  public long CommitCommand() {
    return OCCwrapJavaJNI.TDocStd_Document_CommitCommand(swigCPtr, this);
  }

  /**
   *  Abort the  Command  transaction. Does nothing If there is
   *  no Command transaction open.
   */
  public void AbortCommand() {
    OCCwrapJavaJNI.TDocStd_Document_AbortCommand(swigCPtr, this);
  }

  /**
   *  The current limit on the number of undos
   */
  public int GetUndoLimit() {
    return OCCwrapJavaJNI.TDocStd_Document_GetUndoLimit(swigCPtr, this);
  }

  /**
   *  Set the  limit on  the number of  Undo Delta  stored 0
   *  will disable  Undo  on the  document A negative  value
   *  means no limit. Note that by default Undo is disabled.
   *  Enabling  it will  take effect with  the next  call to
   *  NewCommand. Of course this limit is the same for Redo
   */
  public void SetUndoLimit(int L) {
    OCCwrapJavaJNI.TDocStd_Document_SetUndoLimit(swigCPtr, this, L);
  }

  /**
   *  Remove all stored Undos and Redos
   */
  public void ClearUndos() {
    OCCwrapJavaJNI.TDocStd_Document_ClearUndos(swigCPtr, this);
  }

  /**
   *  Remove all stored Redos
   */
  public void ClearRedos() {
    OCCwrapJavaJNI.TDocStd_Document_ClearRedos(swigCPtr, this);
  }

  /**
   *  Returns the number of undos stored in this
   *  document. If this figure is greater than 0, the method Undo
   *  can be used.
   */
  public int GetAvailableUndos() {
    return OCCwrapJavaJNI.TDocStd_Document_GetAvailableUndos(swigCPtr, this);
  }

  /**
   *  Will UNDO  one step, returns  False if no undo was
   *  done (Undos == 0).
   *  Otherwise, true is returned and one step in the
   *  list of undoes is undone.
   */
  public long Undo() {
    return OCCwrapJavaJNI.TDocStd_Document_Undo(swigCPtr, this);
  }

  /**
   *  Returns the number of redos stored in this
   *  document. If this figure is greater than 0, the method Redo
   *  can be used.
   */
  public int GetAvailableRedos() {
    return OCCwrapJavaJNI.TDocStd_Document_GetAvailableRedos(swigCPtr, this);
  }

  /**
   *  Will REDO  one step, returns  False if no redo was
   *  done (Redos == 0).
   *  Otherwise, true is returned, and one step in the list of redoes is done again.
   */
  public long Redo() {
    return OCCwrapJavaJNI.TDocStd_Document_Redo(swigCPtr, this);
  }

  public  TDF_DeltaList  GetUndos() {
    TDF_DeltaList ret = new TDF_DeltaList(OCCwrapJavaJNI.TDocStd_Document_GetUndos(swigCPtr, this), false, this);
    return ret;
  }

  public  TDF_DeltaList  GetRedos() {
    TDF_DeltaList ret = new TDF_DeltaList(OCCwrapJavaJNI.TDocStd_Document_GetRedos(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Removes the first undo in the list of document undos.
   *  It is used in the application when the undo limit is exceed.
   */
  public void RemoveFirstUndo() {
    OCCwrapJavaJNI.TDocStd_Document_RemoveFirstUndo(swigCPtr, this);
  }

  /**
   *  Initializes the procedure of delta compaction
   *  Returns false if there is no delta to compact
   *  Marks the last delta as a "from" delta
   */
  public long InitDeltaCompaction() {
    return OCCwrapJavaJNI.TDocStd_Document_InitDeltaCompaction(swigCPtr, this);
  }

  /**
   *  Performs the procedure of delta compaction
   *  Makes all deltas starting from "from" delta
   *  till the last one to be one delta.
   */
  public long PerformDeltaCompaction() {
    return OCCwrapJavaJNI.TDocStd_Document_PerformDeltaCompaction(swigCPtr, this);
  }

  /**
   *  Set   modifications on  labels  impacted  by  external
   *  references to the entry.  The document becomes invalid
   *  and must be recomputed.
   */
  public void UpdateReferences( TCollection_AsciiString  aDocEntry) {
    OCCwrapJavaJNI.TDocStd_Document_UpdateReferences(swigCPtr, this, TCollection_AsciiString.getCPtr(aDocEntry), aDocEntry);
  }

  /**
   *  Recompute if the document was  not valid and propagate
   *  the reccorded modification.
   */
  public void Recompute() {
    OCCwrapJavaJNI.TDocStd_Document_Recompute(swigCPtr, this);
  }

  /**
   *  Sets saving mode for empty labels. If Standard_True, empty labels will be saved.
   */
  public void SetEmptyLabelsSavingMode(long isAllowed) {
    OCCwrapJavaJNI.TDocStd_Document_SetEmptyLabelsSavingMode(swigCPtr, this, isAllowed);
  }

  /**
   *  Returns saving mode for empty labels.
   */
  public long EmptyLabelsSavingMode() {
    return OCCwrapJavaJNI.TDocStd_Document_EmptyLabelsSavingMode(swigCPtr, this);
  }

  /**
   *  methods for the nested transaction mode
   */
  public void ChangeStorageFormat( TCollection_ExtendedString  newStorageFormat) {
    OCCwrapJavaJNI.TDocStd_Document_ChangeStorageFormat(swigCPtr, this, TCollection_ExtendedString.getCPtr(newStorageFormat), newStorageFormat);
  }

  /**
   *  Sets nested transaction mode if isAllowed == Standard_True
   */
  public void SetNestedTransactionMode(long isAllowed) {
    OCCwrapJavaJNI.TDocStd_Document_SetNestedTransactionMode__SWIG_0(swigCPtr, this, isAllowed);
  }

  public void SetNestedTransactionMode() {
    OCCwrapJavaJNI.TDocStd_Document_SetNestedTransactionMode__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns Standard_True if mode is set
   */
  public long IsNestedTransactionMode() {
    return OCCwrapJavaJNI.TDocStd_Document_IsNestedTransactionMode(swigCPtr, this);
  }

  /**
   *  if theTransactionOnly is True changes is denied outside transactions
   */
  public void SetModificationMode(long theTransactionOnly) {
    OCCwrapJavaJNI.TDocStd_Document_SetModificationMode(swigCPtr, this, theTransactionOnly);
  }

  /**
   *  returns True if changes allowed only inside transactions
   */
  public long ModificationMode() {
    return OCCwrapJavaJNI.TDocStd_Document_ModificationMode(swigCPtr, this);
  }

  /**
   *  Prepares document for closing
   */
  public void BeforeClose() {
    OCCwrapJavaJNI.TDocStd_Document_BeforeClose(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDocStd_Document_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDocStd_Document_get_type_descriptor(), true );
  }

  public static  TDocStd_Document  DownCast( Standard_Transient  T) {
    return new TDocStd_Document ( OCCwrapJavaJNI.TDocStd_Document_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDocStd_Document_TypeOf(), true );
  }

}
