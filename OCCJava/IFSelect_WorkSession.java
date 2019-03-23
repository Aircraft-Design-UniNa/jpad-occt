package opencascade;

/**
 *  This class can be used to simply manage a process such as
 *  splitting a file, extracting a set of Entities ...
 *  It allows to manage different types of Variables : Integer or
 *  Text Parameters, Selections, Dispatches, in addition to a
 *  ShareOut. To each of these variables, a unique Integer
 *  Identifier is attached. A Name can be attached too as desired.
 */
public class IFSelect_WorkSession extends Standard_Transient {
  IFSelect_WorkSession(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a Work Session
   *  It provides default, empty ShareOut and ModelCopier, which can
   *  be replaced (if required, should be done just after creation).
   */
  public IFSelect_WorkSession() {
    this(OCCwrapJavaJNI.new_IFSelect_WorkSession(), true);
  }

  /**
   *  Changes the Error Handler status (by default, it is not set)
   */
  public void SetErrorHandle(long toHandle) {
    OCCwrapJavaJNI.IFSelect_WorkSession_SetErrorHandle(swigCPtr, this, toHandle);
  }

  /**
   *  Returns the Error Handler status
   */
  public long ErrorHandle() {
    return OCCwrapJavaJNI.IFSelect_WorkSession_ErrorHandle(swigCPtr, this);
  }

  /**
   *  Set value of mode responsible for precence of selections after loading
   *  If mode set to true that different selections will be accessible after loading
   *  else selections will be not accessible after loading( for economy memory in applicatios)
   */
  public void SetModeStat(long theMode) {
    OCCwrapJavaJNI.IFSelect_WorkSession_SetModeStat(swigCPtr, this, theMode);
  }

  /**
   *  Return value of mode defining of filling selection during loading
   */
  public long GetModeStat() {
    return OCCwrapJavaJNI.IFSelect_WorkSession_GetModeStat(swigCPtr, this);
  }

  /**
   *  Returns True is a Model has been set
   */
  public long HasModel() {
    return OCCwrapJavaJNI.IFSelect_WorkSession_HasModel(swigCPtr, this);
  }

  /**
   *  Sets a Model as input : this will be the Model from which the
   *  ShareOut will work
   *  if <clearpointed> is True (default) all SelectPointed items
   *  are cleared, else they must be managed by the caller
   *  Remark : SetModel clears the Graph, recomputes it if a
   *  Protocol is set and if the Model is not empty, of course
   */
  public void SetModel( Interface_InterfaceModel  model, long clearpointed) {
    OCCwrapJavaJNI.IFSelect_WorkSession_SetModel__SWIG_0(swigCPtr, this,  Interface_InterfaceModel.getCPtr(model) , model, clearpointed);
  }

  public void SetModel( Interface_InterfaceModel  model) {
    OCCwrapJavaJNI.IFSelect_WorkSession_SetModel__SWIG_1(swigCPtr, this,  Interface_InterfaceModel.getCPtr(model) , model);
  }

  public  Interface_InterfaceModel  Model() {
    return new Interface_InterfaceModel ( OCCwrapJavaJNI.IFSelect_WorkSession_Model(swigCPtr, this), true );
  }

  /**
   *  Stores the filename used for read for setting the model
   *  It is cleared by SetModel and ClearData(1)
   */
  public void SetLoadedFile(String theFileName) {
    OCCwrapJavaJNI.IFSelect_WorkSession_SetLoadedFile(swigCPtr, this, theFileName);
  }

  /**
   *  Returns the filename used to load current model
   *  empty if unknown
   */
  public String LoadedFile() {
    return OCCwrapJavaJNI.IFSelect_WorkSession_LoadedFile(swigCPtr, this);
  }

  /**
   *  Reads a file with the WorkLibrary (sets Model and LoadedFile)
   *  Returns a integer status which can be :
   *  RetDone if OK,  RetVoid if no Protocol not defined,
   *  RetError for file not found, RetFail if fail during read
   */
  public IFSelect_ReturnStatus ReadFile(String filename) {
    return IFSelect_ReturnStatus.swigToEnum(OCCwrapJavaJNI.IFSelect_WorkSession_ReadFile(swigCPtr, this, filename));
  }

  /**
   *  Returns the count of Entities stored in the Model, or 0
   */
  public int NbStartingEntities() {
    return OCCwrapJavaJNI.IFSelect_WorkSession_NbStartingEntities(swigCPtr, this);
  }

  public  Standard_Transient  StartingEntity(int num) {
    return new Standard_Transient ( OCCwrapJavaJNI.IFSelect_WorkSession_StartingEntity(swigCPtr, this, num), true );
  }

  /**
   *  Returns the Number of an Entity in the Model
   *  (0 if no Model set or <ent> not in the Model)
   */
  public int StartingNumber( Standard_Transient  ent) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_StartingNumber(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent);
  }

  /**
   *  From a given label in Model, returns the corresponding number
   *  Starts from first entity by Default, may start after a given
   *  number : this number may be given negative, its absolute value
   *  is then considered. Hence a loop on NumberFromLabel may be
   *  programmed (stop test is : returned value positive or null)
   * 
   *  Returns 0 if not found, < 0 if more than one found (first
   *  found in negative).
   *  If <val> just gives an integer value, returns it
   */
  public int NumberFromLabel(String val, int afternum) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_NumberFromLabel__SWIG_0(swigCPtr, this, val, afternum);
  }

  public int NumberFromLabel(String val) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_NumberFromLabel__SWIG_1(swigCPtr, this, val);
  }

  public  TCollection_HAsciiString  EntityLabel( Standard_Transient  ent) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IFSelect_WorkSession_EntityLabel(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent), true );
  }

  public  TCollection_HAsciiString  EntityName( Standard_Transient  ent) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IFSelect_WorkSession_EntityName(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent), true );
  }

  /**
   *  Returns the Category Number determined for an entity
   *  it is computed by the class Category
   *  An unknown entity (number 0) gives a value -1
   */
  public int CategoryNumber( Standard_Transient  ent) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_CategoryNumber(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent);
  }

  /**
   *  Returns the Category Name determined for an entity
   *  it is computed by the class Category
   *  Remark : an unknown entity gives an empty string
   */
  public String CategoryName( Standard_Transient  ent) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_CategoryName(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent);
  }

  /**
   *  Returns the Validity Name determined for an entity
   *  it is computed by the class SignValidity
   *  Remark : an unknown entity gives an empty string
   */
  public String ValidityName( Standard_Transient  ent) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_ValidityName(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent);
  }

  /**
   *  Clears recorded data (not the items) according mode :
   *  1 : all Data : Model, Graph, CheckList, + ClearData 4
   *  2 : Graph and CheckList (they will then be recomputed later)
   *  3 : CheckList (it will be recomputed by ComputeCheck)
   *  4 : just content of SelectPointed and Counters
   *  Plus 0 : does nothing but called by SetModel
   *  ClearData is virtual, hence it can be redefined to clear
   *  other data of a specialised Work Session
   */
  public void ClearData(int mode) {
    OCCwrapJavaJNI.IFSelect_WorkSession_ClearData(swigCPtr, this, mode);
  }

  /**
   *  Computes the Graph used for Selections, Displays ...
   *  If a HGraph is already set, with same model as given by method
   *  Model, does nothing. Else, computes a new Graph.
   *  If <enforce> is given True, computes a new Graph anyway.
   *  Remark that a call to ClearGraph will cause ComputeGraph to
   *  really compute a new Graph
   *  Returns True if Graph is OK, False else (i.e. if no Protocol
   *  is set, or if Model is absent or empty).
   */
  public long ComputeGraph(long enforce) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_ComputeGraph__SWIG_0(swigCPtr, this, enforce);
  }

  public long ComputeGraph() {
    return OCCwrapJavaJNI.IFSelect_WorkSession_ComputeGraph__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns the Computed Graph, for Read only
   */
  public  Interface_Graph  Graph() {
    Interface_Graph ret = new Interface_Graph(OCCwrapJavaJNI.IFSelect_WorkSession_Graph(swigCPtr, this), false, this);
    return ret;
  }

  public  TColStd_HSequenceOfTransient  Shareds( Standard_Transient  ent) {
    return new TColStd_HSequenceOfTransient ( OCCwrapJavaJNI.IFSelect_WorkSession_Shareds(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent), true );
  }

  public  TColStd_HSequenceOfTransient  Sharings( Standard_Transient  ent) {
    return new TColStd_HSequenceOfTransient ( OCCwrapJavaJNI.IFSelect_WorkSession_Sharings(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent), true );
  }

  /**
   *  Returns True if a Model is defined and really loaded (not
   *  empty), a Protocol is set and a Graph has been computed.
   *  In this case, the WorkSession can start to work
   */
  public long IsLoaded() {
    return OCCwrapJavaJNI.IFSelect_WorkSession_IsLoaded(swigCPtr, this);
  }

  /**
   *  Computes the CheckList for the Model currently loaded
   *  It can then be used for displays, querries ...
   *  Returns True if OK, False else (i.e. no Protocol set, or Model
   *  absent). If <enforce> is False, works only if not already done
   *  or if a new Model has been loaded from last call.
   *  Remark : computation is enforced by every call to
   *  SetModel or RunTransformer
   */
  public long ComputeCheck(long enforce) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_ComputeCheck__SWIG_0(swigCPtr, this, enforce);
  }

  public long ComputeCheck() {
    return OCCwrapJavaJNI.IFSelect_WorkSession_ComputeCheck__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns the Maximum Value for an Item Identifier. It can be
   *  greater to the count of known Items, because some can have
   *  been removed
   */
  public int MaxIdent() {
    return OCCwrapJavaJNI.IFSelect_WorkSession_MaxIdent(swigCPtr, this);
  }

  public  Standard_Transient  Item(int id) {
    return new Standard_Transient ( OCCwrapJavaJNI.IFSelect_WorkSession_Item(swigCPtr, this, id), true );
  }

  /**
   *  Returns the Ident attached to an Item in the WorkSession, or
   *  Zero if it is unknown
   */
  public int ItemIdent( Standard_Transient  item) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_ItemIdent(swigCPtr, this,  Standard_Transient.getCPtr(item) , item);
  }

  public  Standard_Transient  NamedItem(String name) {
    return new Standard_Transient ( OCCwrapJavaJNI.IFSelect_WorkSession_NamedItem__SWIG_0(swigCPtr, this, name), true );
  }

  public  Standard_Transient  NamedItem( TCollection_HAsciiString  name) {
    return new Standard_Transient ( OCCwrapJavaJNI.IFSelect_WorkSession_NamedItem__SWIG_1(swigCPtr, this,  TCollection_HAsciiString.getCPtr(name) , name), true );
  }

  /**
   *  Returns the Ident attached to a Name, 0 if name not recorded
   */
  public int NameIdent(String name) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_NameIdent(swigCPtr, this, name);
  }

  /**
   *  Returns True if an Item of the WorkSession has an attached Name
   */
  public long HasName( Standard_Transient  item) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_HasName(swigCPtr, this,  Standard_Transient.getCPtr(item) , item);
  }

  public  TCollection_HAsciiString  Name( Standard_Transient  item) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IFSelect_WorkSession_Name(swigCPtr, this,  Standard_Transient.getCPtr(item) , item), true );
  }

  /**
   *  Adds an Item and returns its attached Ident. Does nothing
   *  if <item> is already recorded (and returns its attached Ident)
   *  <active> if True commands call to SetActive (see below)
   *  Remark : the determined Ident is used if <item> is a Dispatch,
   *  to fill the ShareOut
   */
  public int AddItem( Standard_Transient  item, long active) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_AddItem__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(item) , item, active);
  }

  public int AddItem( Standard_Transient  item) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_AddItem__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(item) , item);
  }

  /**
   *  Adds an Item with an attached Name. If the Name is already
   *  known in the WorkSession, the older item losts it
   *  Returns Ident if Done, 0 else, i.e. if <item> is null
   *  If <name> is empty, works as AddItem (i.e. with no name)
   *  If <item> is already known but with no attached Name, this
   *  method tries to attached a Name to it
   *  <active> if True commands call to SetActive (see below)
   */
  public int AddNamedItem(String name,  Standard_Transient  item, long active) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_AddNamedItem__SWIG_0(swigCPtr, this, name,  Standard_Transient.getCPtr(item) , item, active);
  }

  public int AddNamedItem(String name,  Standard_Transient  item) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_AddNamedItem__SWIG_1(swigCPtr, this, name,  Standard_Transient.getCPtr(item) , item);
  }

  /**
   *  Following the type of <item> :
   *  - Dispatch : Adds or Removes it in the ShareOut & FileNaming
   *  - GeneralModifier : Adds or Removes it for final sending
   *  (i.e. in the ModelCopier)
   *  Returns True if it did something, False else (state unchanged)
   */
  public long SetActive( Standard_Transient  item, long mode) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_SetActive(swigCPtr, this,  Standard_Transient.getCPtr(item) , item, mode);
  }

  /**
   *  Removes an Item from the Session, given its Name
   *  Returns True if Done, False else (Name not recorded)
   *  (Applies only on Item which are Named)
   */
  public long RemoveNamedItem(String name) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_RemoveNamedItem(swigCPtr, this, name);
  }

  /**
   *  Removes a Name without removing the Item
   *  Returns True if Done, False else (Name not recorded)
   */
  public long RemoveName(String name) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_RemoveName(swigCPtr, this, name);
  }

  /**
   *  Removes an Item given its Ident. Returns False if <id> is
   *  attached to no Item in the WorkSession. For a Named Item,
   *  also removes its Name.
   */
  public long RemoveItem( Standard_Transient  item) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_RemoveItem(swigCPtr, this,  Standard_Transient.getCPtr(item) , item);
  }

  /**
   *  Clears all the recorded Items : Selections, Dispatches,
   *  Modifiers, and Strings & IntParams, with their Idents & Names.
   *  Remark that if a Model has been loaded, it is not cleared.
   */
  public void ClearItems() {
    OCCwrapJavaJNI.IFSelect_WorkSession_ClearItems(swigCPtr, this);
  }

  public  TCollection_HAsciiString  ItemLabel(int id) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IFSelect_WorkSession_ItemLabel(swigCPtr, this, id), true );
  }

  public  TColStd_HSequenceOfHAsciiString  ItemNames( Standard_Type  type) {
    return new TColStd_HSequenceOfHAsciiString ( OCCwrapJavaJNI.IFSelect_WorkSession_ItemNames(swigCPtr, this,  Standard_Type.getCPtr(type) , type), true );
  }

  public  TColStd_HSequenceOfHAsciiString  ItemNamesForLabel(String label) {
    return new TColStd_HSequenceOfHAsciiString ( OCCwrapJavaJNI.IFSelect_WorkSession_ItemNamesForLabel(swigCPtr, this, label), true );
  }

  /**
   *  For query by Label with possible iterations
   *  Searches the Ident of which Item has a Label which matches a
   *  given one, the search starts from an initial Ident.
   *  Returns the first found Ident which follows <id>, or ZERO
   * 
   *  The search must start with <id> = 0, it returns the next Ident
   *  which matches. To iterate, call again this method which this
   *  returned value as <id>. Once an Ident has been returned, the
   *  Item can be obtained by the method Item
   * 
   *  <mode> precises the required matching mode :
   *  - 0 (Default) : <label> must match exactly with the Item Label
   *  - 1 : <label> must match the exact beginning (the end is free)
   *  - 2 : <label> must be at least once wherever in the Item Label
   *  - other values are ignored
   */
  public int NextIdentForLabel(String label, int id, int mode) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_NextIdentForLabel__SWIG_0(swigCPtr, this, label, id, mode);
  }

  public int NextIdentForLabel(String label, int id) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_NextIdentForLabel__SWIG_1(swigCPtr, this, label, id);
  }

  public  Standard_Transient  NewParamFromStatic(String statname, String name) {
    return new Standard_Transient ( OCCwrapJavaJNI.IFSelect_WorkSession_NewParamFromStatic__SWIG_0(swigCPtr, this, statname, name), true );
  }

  public  Standard_Transient  NewParamFromStatic(String statname) {
    return new Standard_Transient ( OCCwrapJavaJNI.IFSelect_WorkSession_NewParamFromStatic__SWIG_1(swigCPtr, this, statname), true );
  }

  public  TCollection_HAsciiString  TextParam(int id) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IFSelect_WorkSession_TextParam(swigCPtr, this, id), true );
  }

  /**
   *  Returns Text Value of a TextParam (a String)
   *  or an empty string if <it> is not in the WorkSession
   */
  public TCollection_AsciiString TextValue( TCollection_HAsciiString  par) {
    return new TCollection_AsciiString(OCCwrapJavaJNI.IFSelect_WorkSession_TextValue(swigCPtr, this,  TCollection_HAsciiString.getCPtr(par) , par), true);
  }

  public  TCollection_HAsciiString  NewTextParam(String name) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IFSelect_WorkSession_NewTextParam__SWIG_0(swigCPtr, this, name), true );
  }

  public  TCollection_HAsciiString  NewTextParam() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IFSelect_WorkSession_NewTextParam__SWIG_1(swigCPtr, this), true );
  }

  /**
   *  Changes the Text Value of a TextParam (an HAsciiString)
   *  Returns True if Done, False if <it> is not in the WorkSession
   */
  public long SetTextValue( TCollection_HAsciiString  par, String val) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_SetTextValue(swigCPtr, this,  TCollection_HAsciiString.getCPtr(par) , par, val);
  }

  /**
   *  Resets input Selection which was set by SetItemSelection
   *  Same conditions as for SetItemSelection
   *  Returns True if done, False if <item> is not in the WorkSession
   */
  public long ResetItemSelection( Standard_Transient  item) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_ResetItemSelection(swigCPtr, this,  Standard_Transient.getCPtr(item) , item);
  }

  /**
   *  Clears the list of Dispatches recorded by the ShareOut
   *  if <only> disp is True, tha's all. Else, clears also the lists
   *  of Modifiers recorded by the ShareOut
   */
  public void ClearShareOut(long onlydisp) {
    OCCwrapJavaJNI.IFSelect_WorkSession_ClearShareOut(swigCPtr, this, onlydisp);
  }

  /**
   *  Returns the count of Modifiers applied to final sending
   *  Model Modifiers if <formodel> is True, File Modifiers else
   *  (i.e. Modifiers which apply once the Models have been filled)
   */
  public int NbFinalModifiers(long formodel) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_NbFinalModifiers(swigCPtr, this, formodel);
  }

  /**
   *  Changes the Rank of a Modifier in the Session :
   *  Model Modifiers if <formodel> is True, File Modifiers else
   *  the Modifier n0 <before> is put to n0 <after>
   *  Return True if Done, False if <before> or <after> out of range
   */
  public long ChangeModifierRank(long formodel, int before, int after) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_ChangeModifierRank(swigCPtr, this, formodel, before, after);
  }

  /**
   *  Removes all the Modifiers active in the ModelCopier : they
   *  become inactive and they are removed from the Session
   */
  public void ClearFinalModifiers() {
    OCCwrapJavaJNI.IFSelect_WorkSession_ClearFinalModifiers(swigCPtr, this);
  }

  public  TCollection_HAsciiString  FilePrefix() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IFSelect_WorkSession_FilePrefix(swigCPtr, this), true );
  }

  public  TCollection_HAsciiString  DefaultFileRoot() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IFSelect_WorkSession_DefaultFileRoot(swigCPtr, this), true );
  }

  public  TCollection_HAsciiString  FileExtension() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IFSelect_WorkSession_FileExtension(swigCPtr, this), true );
  }

  /**
   *  Defines a File Prefix
   */
  public void SetFilePrefix(String name) {
    OCCwrapJavaJNI.IFSelect_WorkSession_SetFilePrefix(swigCPtr, this, name);
  }

  /**
   *  Defines a Default File Root Name. Clears it is <name> = ""
   *  Returns True if OK, False if <name> already set for a Dispatch
   */
  public long SetDefaultFileRoot(String name) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_SetDefaultFileRoot(swigCPtr, this, name);
  }

  /**
   *  Defines a File Extension
   */
  public void SetFileExtension(String name) {
    OCCwrapJavaJNI.IFSelect_WorkSession_SetFileExtension(swigCPtr, this, name);
  }

  /**
   *  Extracts File Root Name from a given complete file name
   *  (uses OSD_Path)
   */
  public String GiveFileRoot(String file) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_GiveFileRoot(swigCPtr, this, file);
  }

  /**
   *  Completes a file name as required, with Prefix and Extension
   *  (if defined; for a non-defined item, completes nothing)
   */
  public String GiveFileComplete(String file) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_GiveFileComplete(swigCPtr, this, file);
  }

  /**
   *  Erases all stored data from the File Evaluation
   *  (i.e. ALL former naming informations are lost)
   */
  public void ClearFile() {
    OCCwrapJavaJNI.IFSelect_WorkSession_ClearFile(swigCPtr, this);
  }

  /**
   *  Performs and stores a File Evaluation. The Results are a List
   *  of produced Models and a List of names (Strings), in parallel
   *  Fills LastRunCheckList
   */
  public void EvaluateFile() {
    OCCwrapJavaJNI.IFSelect_WorkSession_EvaluateFile(swigCPtr, this);
  }

  /**
   *  Returns the count of produced Models
   */
  public int NbFiles() {
    return OCCwrapJavaJNI.IFSelect_WorkSession_NbFiles(swigCPtr, this);
  }

  public  Interface_InterfaceModel  FileModel(int num) {
    return new Interface_InterfaceModel ( OCCwrapJavaJNI.IFSelect_WorkSession_FileModel(swigCPtr, this, num), true );
  }

  /**
   *  Returns the name of a file corresponding to a produced Model,
   *  given its rank in the Evaluation List
   */
  public TCollection_AsciiString FileName(int num) {
    return new TCollection_AsciiString(OCCwrapJavaJNI.IFSelect_WorkSession_FileName(swigCPtr, this, num), true);
  }

  /**
   *  Commands file sending to clear the list of already sent files,
   *  commands to record a new one if <record> is True
   *  This list is managed by the ModelCopier when SendSplit is called
   *  It allows a global exploitation of the set of sent files
   */
  public void BeginSentFiles(long record) {
    OCCwrapJavaJNI.IFSelect_WorkSession_BeginSentFiles(swigCPtr, this, record);
  }

  public  TColStd_HSequenceOfHAsciiString  SentFiles() {
    return new TColStd_HSequenceOfHAsciiString ( OCCwrapJavaJNI.IFSelect_WorkSession_SentFiles(swigCPtr, this), true );
  }

  /**
   *  Performs creation of derived files from the input Model
   *  Takes its data (sub-models and names), from result EvaluateFile
   *  if active, else by dynamic Evaluation (not stored)
   *  After SendSplit, result of EvaluateFile is Cleared
   *  Fills LastRunCheckList
   * 
   *  Works with the WorkLibrary which acts on specific type of Model
   *  and can work with File Modifiers (managed by the Model Copier)
   *  and a ModelCopier, which can work with Model Modifiers
   *  Returns False if, either WorkLibrary has failed on at least
   *  one sub-file, or the Work Session is badly conditionned
   *  (no Model defined, or FileNaming not in phase with ShareOut)
   */
  public long SendSplit() {
    return OCCwrapJavaJNI.IFSelect_WorkSession_SendSplit(swigCPtr, this);
  }

  /**
   *  Returns the greater count of different files in which any of
   *  the starting entities could be sent.
   *  Before any file output, this count is 0.
   *  Ideal count is 1. More than 1 means that duplications occur.
   */
  public int MaxSendingCount() {
    return OCCwrapJavaJNI.IFSelect_WorkSession_MaxSendingCount(swigCPtr, this);
  }

  /**
   *  Sends the starting Model into one file, without splitting,
   *  managing remaining data or anything else.
   *  <computegraph> true commands the Graph to be recomputed before
   *  sending : required when a Model is filled in several steps
   * 
   *  The Model and File Modifiers recorded to be applied on sending
   *  files are.
   *  Returns a status of execution :
   *  Done if OK,
   *  Void if no data available,
   *  Error if errors occured (work library is not defined), errors
   *  during translation
   *  Fail if exception during translation is raised
   *  Stop if no disk space or disk, file is write protected
   *  Fills LastRunCheckList
   */
  public IFSelect_ReturnStatus SendAll(String filename, long computegraph) {
    return IFSelect_ReturnStatus.swigToEnum(OCCwrapJavaJNI.IFSelect_WorkSession_SendAll__SWIG_0(swigCPtr, this, filename, computegraph));
  }

  public IFSelect_ReturnStatus SendAll(String filename) {
    return IFSelect_ReturnStatus.swigToEnum(OCCwrapJavaJNI.IFSelect_WorkSession_SendAll__SWIG_1(swigCPtr, this, filename));
  }

  public  TColStd_HSequenceOfTransient  GiveList( Standard_Transient  obj) {
    return new TColStd_HSequenceOfTransient ( OCCwrapJavaJNI.IFSelect_WorkSession_GiveList__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(obj) , obj), true );
  }

  public  TColStd_HSequenceOfTransient  GiveList(String first, String second) {
    return new TColStd_HSequenceOfTransient ( OCCwrapJavaJNI.IFSelect_WorkSession_GiveList__SWIG_1(swigCPtr, this, first, second), true );
  }

  public  TColStd_HSequenceOfTransient  GiveList(String first) {
    return new TColStd_HSequenceOfTransient ( OCCwrapJavaJNI.IFSelect_WorkSession_GiveList__SWIG_2(swigCPtr, this, first), true );
  }

  public  TColStd_HSequenceOfTransient  GiveListFromList(String selname,  Standard_Transient  ent) {
    return new TColStd_HSequenceOfTransient ( OCCwrapJavaJNI.IFSelect_WorkSession_GiveListFromList(swigCPtr, this, selname,  Standard_Transient.getCPtr(ent) , ent), true );
  }

  public  TColStd_HSequenceOfTransient  GiveListCombined( TColStd_HSequenceOfTransient  l1,  TColStd_HSequenceOfTransient  l2, int mode) {
    return new TColStd_HSequenceOfTransient ( OCCwrapJavaJNI.IFSelect_WorkSession_GiveListCombined(swigCPtr, this,  TColStd_HSequenceOfTransient.getCPtr(l1) , l1,  TColStd_HSequenceOfTransient.getCPtr(l2) , l2, mode), true );
  }

  /**
   *  Determines check status for an entity regarding last call to
   *  QueryCheckList :
   *  -1 : <ent> unknown in the model, ignored
   *  0 : no check at all, immediate or inherited thru Graph
   *  1 : immediate warning (no fail), no inherited check
   *  2 : immediate fail, no inherited check
   *  +10 : idem but some inherited warning (no fail)
   *  +20 : idem but some inherited fail
   */
  public int QueryCheckStatus( Standard_Transient  ent) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_QueryCheckStatus(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent);
  }

  /**
   *  Determines if <entdad> is parent of <entson> (in the graph),
   *  returns : -1 if no; 0 if <entdad> = <entson>
   *  1 if immediate parent, > 1 if parent, gives count of steps
   */
  public int QueryParent( Standard_Transient  entdad,  Standard_Transient  entson) {
    return OCCwrapJavaJNI.IFSelect_WorkSession_QueryParent(swigCPtr, this,  Standard_Transient.getCPtr(entdad) , entdad,  Standard_Transient.getCPtr(entson) , entson);
  }

  /**
   *  Sets a list of Parameters, i.e. TypedValue, to be handled
   *  through an Editor
   *  The two lists are parallel, if <params> is longer than <uses>,
   *  surnumeral parameters are for general use
   * 
   *  EditForms are created to handle these parameters (list, edit)
   *  on the basis of a ParamEditor  xst-params-edit
   * 
   *  A use number dispatches the parameter to a given EditForm
   *  EditForms are defined as follows
   *  Name                Use   Means
   *  xst-params          all   All Parameters (complete list)
   *  xst-params-general  1     Generals
   *  xst-params-load     2     LoadFile (no Transfer)
   *  xst-params-send     3     SendFile (Write, no Transfer)
   *  xst-params-split    4     Split
   *  xst-param-read      5     Transfer on Reading
   *  xst-param-write     6     Transfer on Writing
   */
  public void SetParams(SWIGTYPE_p_NCollection_VectorT_opencascade__handleT_Standard_Transient_t_t params, SWIGTYPE_p_NCollection_VectorT_int_t uselist) {
    OCCwrapJavaJNI.IFSelect_WorkSession_SetParams(swigCPtr, this, SWIGTYPE_p_NCollection_VectorT_opencascade__handleT_Standard_Transient_t_t.getCPtr(params), SWIGTYPE_p_NCollection_VectorT_int_t.getCPtr(uselist));
  }

  /**
   *  Traces the Statics attached to a given use number
   *  If <use> is given positive (normal), the trace is embedded
   *  with a header and a trailer
   *  If <use> is negative, just values are printed
   *  (this allows to make compositions)
   *  Remark : use number  5 commands use -2 to be traced
   *  Remark : use numbers 4 and 6 command use -3 to be traced
   */
  public void TraceStatics(int use, int mode) {
    OCCwrapJavaJNI.IFSelect_WorkSession_TraceStatics__SWIG_0(swigCPtr, this, use, mode);
  }

  public void TraceStatics(int use) {
    OCCwrapJavaJNI.IFSelect_WorkSession_TraceStatics__SWIG_1(swigCPtr, this, use);
  }

  /**
   *  Dumps contents of the ShareOut (on "cout")
   */
  public void DumpShare() {
    OCCwrapJavaJNI.IFSelect_WorkSession_DumpShare(swigCPtr, this);
  }

  /**
   *  Lists the Labels of all Items of the WorkSession
   *  If <label> is defined, lists labels which contain it
   */
  public void ListItems(String label) {
    OCCwrapJavaJNI.IFSelect_WorkSession_ListItems__SWIG_0(swigCPtr, this, label);
  }

  public void ListItems() {
    OCCwrapJavaJNI.IFSelect_WorkSession_ListItems__SWIG_1(swigCPtr, this);
  }

  /**
   *  Lists the Modifiers of the session (for each one, displays
   *  its Label). Listing is done following Ranks (Modifiers are
   *  invoked following their ranks)
   *  Model Modifiers if <formodel> is True, File Modifiers else
   */
  public void ListFinalModifiers(long formodel) {
    OCCwrapJavaJNI.IFSelect_WorkSession_ListFinalModifiers(swigCPtr, this, formodel);
  }

  /**
   *  Lists the content of the Input Model (if there is one)
   *  According level : 0 -> gives only count of Entities and Roots
   *  1 -> Lists also Roots;  2 -> Lists all Entities (by TraceType)
   *  3 -> Performs a call to CheckList (Fails) and lists the result
   *  4 -> as 3 but all CheckList (Fails + Warnings)
   *  5,6,7  : as 3 but resp. Count,List,Labels by Fail
   *  8,9,10 : as 4 but resp. Count,List,Labels by message
   */
  public void DumpModel(int level,  Message_Messenger  S) {
    OCCwrapJavaJNI.IFSelect_WorkSession_DumpModel(swigCPtr, this, level,  Message_Messenger.getCPtr(S) , S);
  }

  /**
   *  Dumps the current Model (as inherited DumpModel), on currently
   *  defined Default Trace File (default is standard output)
   */
  public void TraceDumpModel(int mode) {
    OCCwrapJavaJNI.IFSelect_WorkSession_TraceDumpModel(swigCPtr, this, mode);
  }

  /**
   *  Dumps a starting entity according to the current norm.
   *  To do this, it calls DumpEntity from WorkLibrary.
   *  <level> is to be interpreted for each norm : see specific
   *  classes of WorkLibrary for it. Generally, 0 if for very basic
   *  (only type ...), greater values give more and more details.
   */
  public void DumpEntity( Standard_Transient  ent, int level,  Message_Messenger  S) {
    OCCwrapJavaJNI.IFSelect_WorkSession_DumpEntity(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent, level,  Message_Messenger.getCPtr(S) , S);
  }

  /**
   *  Prints main informations about an entity : its number, type,
   *  validity (and checks if any), category, shareds and sharings..
   *  mutable because it can recompute checks as necessary
   */
  public void PrintEntityStatus( Standard_Transient  ent,  Message_Messenger  S) {
    OCCwrapJavaJNI.IFSelect_WorkSession_PrintEntityStatus(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent,  Message_Messenger.getCPtr(S) , S);
  }

  /**
   *  Dumps an entity from the current Model as inherited DumpEntity
   *  on currently defined Default Trace File
   *  (<level> interpreted according to the Norm, see WorkLibrary)
   */
  public void TraceDumpEntity( Standard_Transient  ent, int level) {
    OCCwrapJavaJNI.IFSelect_WorkSession_TraceDumpEntity(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent, level);
  }

  /**
   *  Displays the effect of applying the ShareOut on the input
   *  Model.
   *  <mode> = 0 (default) : displays only roots for each packet,
   *  <mode> = 1 : displays all entities for each packet, plus
   *  duplicated entities
   *  <mode> = 2 : same as <mode> = 1, plus displays forgotten
   *  entities (which are in no packet at all)
   */
  public void EvaluateComplete(int mode) {
    OCCwrapJavaJNI.IFSelect_WorkSession_EvaluateComplete__SWIG_0(swigCPtr, this, mode);
  }

  public void EvaluateComplete() {
    OCCwrapJavaJNI.IFSelect_WorkSession_EvaluateComplete__SWIG_1(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.IFSelect_WorkSession_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.IFSelect_WorkSession_get_type_descriptor(), true );
  }

  public static  IFSelect_WorkSession  DownCast( Standard_Transient  T) {
    return new IFSelect_WorkSession ( OCCwrapJavaJNI.IFSelect_WorkSession_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.IFSelect_WorkSession_TypeOf(), true );
  }

}
