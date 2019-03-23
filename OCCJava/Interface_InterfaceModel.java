package opencascade;

/**
 *  Defines an (Indexed) Set of data corresponding to a complete
 *  Transfer by a File Interface, i.e. File Header and Transient
 *  Entities (Objects) contained in a File. Contained Entities are
 *  identified in the Model by unique and consecutive Numbers.
 * 
 *  In addition, a Model can attach to each entity, a specific
 *  Label according to the norm (e.g. Name for VDA, #ident for
 *  Step ...), intended to be output on a string or a stream
 *  (remark : labels are not obliged to be unique)
 * 
 *  InterfaceModel itself is not Transient, it is intended to
 *  work on a set of Transient Data. The services offered are
 *  basic Listing and Identification operations on Transient
 *  Entities, storage of Error Reports, Copying.
 * 
 *  Moreovere, it is possible to define and use templates. These
 *  are empty Models, from which copies can be obtained in order
 *  to be filled with effective data. This allows to record
 *  standard definitions for headers, avoiding to recreate them
 *  for each sendings, and assuring customisation of produced
 *  files for a given site.
 *  A template is attached to a name. It is possible to define a
 *  template from another one (get it, edit it then record it
 *  under another name).
 * 
 *  See also Graph, ShareTool, CheckTool for more
 */
public class Interface_InterfaceModel extends Standard_Transient {
  Interface_InterfaceModel(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Clears the list of entities (service WhenDelete)
   */
  public void Destroy() {
    OCCwrapJavaJNI.Interface_InterfaceModel_Destroy(swigCPtr, this);
  }

  public long[] DispatchStatus() {return OCCwrapJavaJNI.Interface_InterfaceModel_DispatchStatus(swigCPtr, this);}

  /**
   *  Erases contained data; used when a Model is copied to others :
   *  the new copied ones begin from clear
   *  Clear calls specific method ClearHeader (see below)
   */
  public void Clear() {
    OCCwrapJavaJNI.Interface_InterfaceModel_Clear(swigCPtr, this);
  }

  /**
   *  Clears the entities; uses the general service WhenDelete, in
   *  addition to the standard Memory Manager; can be redefined
   */
  public void ClearEntities() {
    OCCwrapJavaJNI.Interface_InterfaceModel_ClearEntities(swigCPtr, this);
  }

  /**
   *  Erases informations about labels, if any : specific to each
   *  norm
   */
  public void ClearLabels() {
    OCCwrapJavaJNI.Interface_InterfaceModel_ClearLabels(swigCPtr, this);
  }

  /**
   *  Clears Model's header : specific to each norm
   */
  public void ClearHeader() {
    OCCwrapJavaJNI.Interface_InterfaceModel_ClearHeader(swigCPtr, this);
  }

  /**
   *  Returns count of contained Entities
   */
  public int NbEntities() {
    return OCCwrapJavaJNI.Interface_InterfaceModel_NbEntities(swigCPtr, this);
  }

  /**
   *  Returns True if a Model contains an Entity (for a ReportEntity,
   *  looks for the ReportEntity itself AND its Concerned Entity)
   */
  public long Contains( Standard_Transient  anentity) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_Contains(swigCPtr, this,  Standard_Transient.getCPtr(anentity) , anentity);
  }

  /**
   *  Returns the Number of an Entity in the Model if it contains it.
   *  Else returns 0. For a ReportEntity, looks at Concerned Entity.
   *  Returns the Directory entry   Number of  an Entity in
   *  the  Model if it contains it.   Else returns  0.  For a
   *  ReportEntity, looks at Concerned Entity.
   */
  public int Number( Standard_Transient  anentity) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_Number(swigCPtr, this,  Standard_Transient.getCPtr(anentity) , anentity);
  }

  public  Standard_Transient  Value(int num) {
    return new Standard_Transient ( OCCwrapJavaJNI.Interface_InterfaceModel_Value(swigCPtr, this, num), true );
  }

  /**
   *  Returns the count of DISTINCT types under which an entity may
   *  be processed. Defined by the Protocol, which gives default as
   *  1 (dynamic Type).
   */
  public int NbTypes( Standard_Transient  ent) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_NbTypes(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent);
  }

  public  Standard_Type  Type( Standard_Transient  ent, int num) {
    return new Standard_Type ( OCCwrapJavaJNI.Interface_InterfaceModel_Type__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent, num), true );
  }

  public  Standard_Type  Type( Standard_Transient  ent) {
    return new Standard_Type ( OCCwrapJavaJNI.Interface_InterfaceModel_Type__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent), true );
  }

  /**
   *  Returns the type name of an entity, from the list of types
   *  (one or more ...)
   *  <complete> True (D) gives the complete type, else packages are
   *  removed
   *  WARNING : buffered, to be immediately copied or printed
   */
  public String TypeName( Standard_Transient  ent, long complete) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_TypeName__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent, complete);
  }

  public String TypeName( Standard_Transient  ent) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_TypeName__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent);
  }

  /**
   *  From a CDL Type Name, returns the Class part (package dropped)
   *  WARNING : buffered, to be immediately copied or printed
   */
  public static String ClassName(String typnam) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_ClassName(typnam);
  }

  /**
   *  Returns the State of an entity, given its number
   */
  public Interface_DataState EntityState(int num) {
    return Interface_DataState.swigToEnum(OCCwrapJavaJNI.Interface_InterfaceModel_EntityState(swigCPtr, this, num));
  }

  /**
   *  Returns True if <num> identifies a ReportEntity in the Model
   *  Hence, ReportEntity can be called.
   * 
   *  By default, queries main report, if <semantic> is True, it
   *  queries report for semantic check
   * 
   *  Remember that a Report Entity can be defined for an Unknown
   *  Entity, or a Corrected or Erroneous (at read time) Entity.
   *  The ReportEntity is defined before call to method AddEntity.
   */
  public long IsReportEntity(int num, long semantic) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_IsReportEntity__SWIG_0(swigCPtr, this, num, semantic);
  }

  public long IsReportEntity(int num) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_IsReportEntity__SWIG_1(swigCPtr, this, num);
  }

  public  Interface_ReportEntity  ReportEntity(int num, long semantic) {
    return new Interface_ReportEntity ( OCCwrapJavaJNI.Interface_InterfaceModel_ReportEntity__SWIG_0(swigCPtr, this, num, semantic), true );
  }

  public  Interface_ReportEntity  ReportEntity(int num) {
    return new Interface_ReportEntity ( OCCwrapJavaJNI.Interface_InterfaceModel_ReportEntity__SWIG_1(swigCPtr, this, num), true );
  }

  /**
   *  Returns True if <num> identifies an Error Entity : in this
   *  case, a ReportEntity brings Fail Messages and possibly an
   *  "undefined" Content, see IsRedefinedEntity
   */
  public long IsErrorEntity(int num) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_IsErrorEntity(swigCPtr, this, num);
  }

  /**
   *  Returns True if <num> identifies an Entity which content is
   *  redefined through a ReportEntity (i.e. with literal data only)
   *  This happens when an entity is syntactically erroneous in the
   *  way that its basic content remains empty.
   *  For more details (such as content itself), see ReportEntity
   */
  public long IsRedefinedContent(int num) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_IsRedefinedContent(swigCPtr, this, num);
  }

  /**
   *  Removes the ReportEntity attached to Entity <num>. Returns
   *  True if done, False if no ReportEntity was attached to <num>.
   *  Warning : the caller must assume that this clearing is meaningfull
   */
  public long ClearReportEntity(int num) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_ClearReportEntity(swigCPtr, this, num);
  }

  /**
   *  Sets or Replaces a ReportEntity for the Entity <num>. Returns
   *  True if Report is replaced, False if it has been replaced
   *  Warning : the caller must assume that this setting is meaningfull
   */
  public long SetReportEntity(int num,  Interface_ReportEntity  rep) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_SetReportEntity(swigCPtr, this, num,  Interface_ReportEntity.getCPtr(rep) , rep);
  }

  /**
   *  Adds a ReportEntity as such. Returns False if the concerned
   *  entity is not recorded in the Model
   *  Else, adds it into, either the main report list or the
   *  list for semantic checks, then returns True
   */
  public long AddReportEntity( Interface_ReportEntity  rep, long semantic) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_AddReportEntity__SWIG_0(swigCPtr, this,  Interface_ReportEntity.getCPtr(rep) , rep, semantic);
  }

  public long AddReportEntity( Interface_ReportEntity  rep) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_AddReportEntity__SWIG_1(swigCPtr, this,  Interface_ReportEntity.getCPtr(rep) , rep);
  }

  /**
   *  Returns True if <num> identifies an Unknown Entity : in this
   *  case, a ReportEntity with no Check Messages designates it.
   */
  public long IsUnknownEntity(int num) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_IsUnknownEntity(swigCPtr, this, num);
  }

  /**
   *  Fills the list of semantic checks.
   *  This list is computed (by CheckTool). Hence, it can be stored
   *  in the model for later queries
   *  <clear> True (D) : new list replaces
   *  <clear> False    : new list is cumulated
   */
  public void FillSemanticChecks( Interface_CheckIterator  checks, long clear) {
    OCCwrapJavaJNI.Interface_InterfaceModel_FillSemanticChecks__SWIG_0(swigCPtr, this, Interface_CheckIterator.getCPtr(checks), checks, clear);
  }

  public void FillSemanticChecks( Interface_CheckIterator  checks) {
    OCCwrapJavaJNI.Interface_InterfaceModel_FillSemanticChecks__SWIG_1(swigCPtr, this, Interface_CheckIterator.getCPtr(checks), checks);
  }

  /**
   *  Returns True if semantic checks have been filled
   */
  public long HasSemanticChecks() {
    return OCCwrapJavaJNI.Interface_InterfaceModel_HasSemanticChecks(swigCPtr, this);
  }

  public  Interface_Check  Check(int num, long syntactic) {
    return new Interface_Check ( OCCwrapJavaJNI.Interface_InterfaceModel_Check(swigCPtr, this, num, syntactic), true );
  }

  /**
   *  Does a reservation for the List of Entities (for optimized
   *  storage management). If it is not called, storage management
   *  can be less efficient. <nbent> is the expected count of
   *  Entities to store
   */
  public void Reservate(int nbent) {
    OCCwrapJavaJNI.Interface_InterfaceModel_Reservate(swigCPtr, this, nbent);
  }

  /**
   *  Internal method for adding an Entity. Used by file reading
   *  (defined by each Interface) and Transfer tools. It adds the
   *  entity required to be added, not its refs : see AddWithRefs.
   *  If <anentity> is a ReportEntity, it is added to the list of
   *  Reports, its Concerned Entity (Erroneous or Corrected, else
   *  Unknown) is added to the list of Entities.
   *  That is, the ReportEntity must be created before Adding
   */
  public void AddEntity( Standard_Transient  anentity) {
    OCCwrapJavaJNI.Interface_InterfaceModel_AddEntity(swigCPtr, this,  Standard_Transient.getCPtr(anentity) , anentity);
  }

  /**
   *  Replace Entity with Number=nument on other entity - "anent"
   */
  public void ReplaceEntity(int nument,  Standard_Transient  anent) {
    OCCwrapJavaJNI.Interface_InterfaceModel_ReplaceEntity(swigCPtr, this, nument,  Standard_Transient.getCPtr(anent) , anent);
  }

  /**
   *  Reverses the Numbers of the Entities, between <after> and the
   *  total count of Entities. Thus, the entities :
   *  1,2 ... after, after+1 ... nb-1, nb  become numbered as :
   *  1,2 ... after, nb, nb-1 ... after+1
   *  By default (after = 0) the whole list of Entities is reversed
   */
  public void ReverseOrders(int after) {
    OCCwrapJavaJNI.Interface_InterfaceModel_ReverseOrders__SWIG_0(swigCPtr, this, after);
  }

  public void ReverseOrders() {
    OCCwrapJavaJNI.Interface_InterfaceModel_ReverseOrders__SWIG_1(swigCPtr, this);
  }

  /**
   *  Changes the Numbers of some Entities : <oldnum> is moved to
   *  <newnum>, same for <count> entities. Thus :
   *  1,2 ... newnum-1 newnum ... oldnum .. oldnum+count oldnum+count+1 .. gives
   *  1,2 ... newnum-1 oldnum .. oldnum+count newnum ... oldnum+count+1
   *  (can be seen as a circular permutation)
   */
  public void ChangeOrder(int oldnum, int newnum, int count) {
    OCCwrapJavaJNI.Interface_InterfaceModel_ChangeOrder__SWIG_0(swigCPtr, this, oldnum, newnum, count);
  }

  public void ChangeOrder(int oldnum, int newnum) {
    OCCwrapJavaJNI.Interface_InterfaceModel_ChangeOrder__SWIG_1(swigCPtr, this, oldnum, newnum);
  }

  /**
   *  Gets contents from an EntityIterator, prepared by a
   *  Transfer tool (e.g TransferCopy). Starts from clear
   */
  public void GetFromTransfer(Interface_EntityIterator aniter) {
    OCCwrapJavaJNI.Interface_InterfaceModel_GetFromTransfer(swigCPtr, this, Interface_EntityIterator.getCPtr(aniter), aniter);
  }

  /**
   *  Gets header (data specific of a defined Interface) from
   *  another InterfaceModel; called from TransferCopy
   */
  public void GetFromAnother( Interface_InterfaceModel  other) {
    OCCwrapJavaJNI.Interface_InterfaceModel_GetFromAnother(swigCPtr, this,  Interface_InterfaceModel.getCPtr(other) , other);
  }

  public  Interface_InterfaceModel  NewEmptyModel() {
    return new Interface_InterfaceModel ( OCCwrapJavaJNI.Interface_InterfaceModel_NewEmptyModel(swigCPtr, this), true );
  }

  /**
   *  Records a category number for an entity number
   *  Returns True when done, False if <num> is out of range
   */
  public long SetCategoryNumber(int num, int val) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_SetCategoryNumber(swigCPtr, this, num, val);
  }

  /**
   *  Returns the recorded category number for a given entity number
   *  0 if none was defined for this entity
   */
  public int CategoryNumber(int num) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_CategoryNumber(swigCPtr, this, num);
  }

  /**
   *  Allows an EntityIterator to get a list of Entities
   */
  public void FillIterator(Interface_EntityIterator iter) {
    OCCwrapJavaJNI.Interface_InterfaceModel_FillIterator(swigCPtr, this, Interface_EntityIterator.getCPtr(iter), iter);
  }

  /**
   *  Returns the list of all Entities, as an Iterator on Entities
   *  (the Entities themselves, not the Reports)
   */
  public Interface_EntityIterator Entities() {
    return new Interface_EntityIterator(OCCwrapJavaJNI.Interface_InterfaceModel_Entities(swigCPtr, this), true);
  }

  /**
   *  Returns the list of all ReportEntities, i.e. data about
   *  Entities read with Error or Warning informations
   *  (each item has to be casted to Report Entity then it can be
   *  queried for Concerned Entity, Content, Check ...)
   *  By default, returns the main reports, is <semantic> is True it
   *  returns the list for sematic checks
   */
  public Interface_EntityIterator Reports(long semantic) {
    return new Interface_EntityIterator(OCCwrapJavaJNI.Interface_InterfaceModel_Reports__SWIG_0(swigCPtr, this, semantic), true);
  }

  public Interface_EntityIterator Reports() {
    return new Interface_EntityIterator(OCCwrapJavaJNI.Interface_InterfaceModel_Reports__SWIG_1(swigCPtr, this), true);
  }

  public  Interface_Check  GlobalCheck(long syntactic) {
    return new Interface_Check ( OCCwrapJavaJNI.Interface_InterfaceModel_GlobalCheck__SWIG_0(swigCPtr, this, syntactic), true );
  }

  public  Interface_Check  GlobalCheck() {
    return new Interface_Check ( OCCwrapJavaJNI.Interface_InterfaceModel_GlobalCheck__SWIG_1(swigCPtr, this), true );
  }

  /**
   *  Allows to modify GlobalCheck, after getting then completing it
   *  Remark : it is SYNTACTIC check. Semantics, see FillChecks
   */
  public void SetGlobalCheck( Interface_Check  ach) {
    OCCwrapJavaJNI.Interface_InterfaceModel_SetGlobalCheck(swigCPtr, this,  Interface_Check.getCPtr(ach) , ach);
  }

  /**
   *  Minimum Semantic Global Check on data in model (header)
   *  Can only check basic Data. See also GlobalCheck from Protocol
   *  for a check which takes the Graph into account
   *  Default does nothing, can be redefined
   */
  public void VerifyCheck( Interface_Check  ach) {
    OCCwrapJavaJNI.Interface_InterfaceModel_VerifyCheck(swigCPtr, this,  Interface_Check.getCPtr(ach) , ach);
  }

  /**
   *  Dumps Header in a short, easy to read, form, onto a Stream
   *  <level> allows to print more or less parts of the header,
   *  if necessary. 0 for basic print
   */
  public void DumpHeader( Message_Messenger  S, int level) {
    OCCwrapJavaJNI.Interface_InterfaceModel_DumpHeader__SWIG_0(swigCPtr, this,  Message_Messenger.getCPtr(S) , S, level);
  }

  public void DumpHeader( Message_Messenger  S) {
    OCCwrapJavaJNI.Interface_InterfaceModel_DumpHeader__SWIG_1(swigCPtr, this,  Message_Messenger.getCPtr(S) , S);
  }

  /**
   *  Prints identification of a given entity in <me>, in order to
   *  be printed in a list or phrase
   *  <mode> < 0 : prints only its number
   *  <mode> = 1 : just calls PrintLabel
   *  <mode> = 0 (D) : prints its number plus '/' plus PrintLabel
   *  If <ent> == <me>, simply prints "Global"
   *  If <ent> is unknown, prints "??/its type"
   */
  public void Print( Standard_Transient  ent,  Message_Messenger  s, int mode) {
    OCCwrapJavaJNI.Interface_InterfaceModel_Print__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent,  Message_Messenger.getCPtr(s) , s, mode);
  }

  public void Print( Standard_Transient  ent,  Message_Messenger  s) {
    OCCwrapJavaJNI.Interface_InterfaceModel_Print__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent,  Message_Messenger.getCPtr(s) , s);
  }

  /**
   *  Prints label specific to each norm, for a given entity.
   *  Must only print label itself, in order to be included in a
   *  phrase. Can call the result of StringLabel, but not obliged.
   */
  public void PrintLabel( Standard_Transient  ent,  Message_Messenger  S) {
    OCCwrapJavaJNI.Interface_InterfaceModel_PrintLabel(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent,  Message_Messenger.getCPtr(S) , S);
  }

  /**
   *  Prints label specific to each norm in log format, for
   *  a given entity.
   *  By default, just calls PrintLabel, can be redefined
   */
  public void PrintToLog( Standard_Transient  ent,  Message_Messenger  S) {
    OCCwrapJavaJNI.Interface_InterfaceModel_PrintToLog(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent,  Message_Messenger.getCPtr(S) , S);
  }

  public  TCollection_HAsciiString  StringLabel( Standard_Transient  ent) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.Interface_InterfaceModel_StringLabel(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent), true );
  }

  /**
   *  Searches a label which matches with one entity.
   *  Begins from <lastnum>+1 (default:1) and scans the entities
   *  until <NbEntities>. For the first which matches <label>,
   *  this method returns its Number. Returns 0 if nothing found
   *  Can be called recursively (labels are not specified as unique)
   *  <exact> : if True (default), exact match is required
   *  else, checks the END of entity label
   * 
   *  This method is virtual, hence it can be redefined for a more
   *  efficient search (if exact is true).
   */
  public int NextNumberForLabel(String label, int lastnum, long exact) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_NextNumberForLabel__SWIG_0(swigCPtr, this, label, lastnum, exact);
  }

  public int NextNumberForLabel(String label, int lastnum) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_NextNumberForLabel__SWIG_1(swigCPtr, this, label, lastnum);
  }

  public int NextNumberForLabel(String label) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_NextNumberForLabel__SWIG_2(swigCPtr, this, label);
  }

  /**
   *  Returns true if a template is attached to a given name
   */
  public static long HasTemplate(String name) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_HasTemplate(name);
  }

  public static  Interface_InterfaceModel  Template(String name) {
    return new Interface_InterfaceModel ( OCCwrapJavaJNI.Interface_InterfaceModel_Template(name), true );
  }

  /**
   *  Records a new template model with a name. If the name was
   *  already recorded, the corresponding template is replaced by
   *  the new one. Then, WARNING : test HasTemplate to avoid
   *  surprises
   */
  public static long SetTemplate(String name,  Interface_InterfaceModel  model) {
    return OCCwrapJavaJNI.Interface_InterfaceModel_SetTemplate(name,  Interface_InterfaceModel.getCPtr(model) , model);
  }

  public static  TColStd_HSequenceOfHAsciiString  ListTemplates() {
    return new TColStd_HSequenceOfHAsciiString ( OCCwrapJavaJNI.Interface_InterfaceModel_ListTemplates(), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Interface_InterfaceModel_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Interface_InterfaceModel_get_type_descriptor(), true );
  }

  public static  Interface_InterfaceModel  DownCast( Standard_Transient  T) {
    return new Interface_InterfaceModel ( OCCwrapJavaJNI.Interface_InterfaceModel_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Interface_InterfaceModel_TypeOf(), true );
  }

}
