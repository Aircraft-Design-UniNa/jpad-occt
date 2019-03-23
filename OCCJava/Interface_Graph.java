package opencascade;

/**
 *  Gives basic data structure for operating and storing
 *  graph results (usage is normally internal)
 *  Entities are Mapped according their Number in the Model
 * 
 *  Each Entity from the Model can be known as "Present" or
 *  not; if it is, it is Mapped with a Status : an Integer
 *  which can be used according to needs of each algorithm
 *  In addition, the Graph brings a BitMap which can be used
 *  by any caller
 * 
 *  Also, it is bound with two lists : a list of Shared
 *  Entities (in fact, their Numbers in the Model) which is
 *  filled by a ShareTool, and a list of Sharing Entities,
 *  computed by deduction from the Shared Lists
 * 
 *  Moreover, it is possible to redefine the list of Entities
 *  Shared by an Entity (instead of standard answer by general
 *  service Shareds) : this new list can be empty; it can
 *  be changed or reset (i.e. to come back to standard answer)
 */
public class Interface_Graph {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Interface_Graph(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Interface_Graph(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Interface_Graph obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Interface_Graph(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Erases data, making graph ready to rebegin from void
   *  (also resets Shared lists redefinitions)
   */
  public void Reset() {
    OCCwrapJavaJNI.Interface_Graph_Reset(swigCPtr, this);
  }

  /**
   *  Erases Status (Values and Flags of Presence), making graph
   *  ready to rebegin from void. Does not concerns Shared lists
   */
  public void ResetStatus() {
    OCCwrapJavaJNI.Interface_Graph_ResetStatus(swigCPtr, this);
  }

  /**
   *  Returns size (max nb of entities, i.e. Model's nb of entities)
   */
  public int Size() {
    return OCCwrapJavaJNI.Interface_Graph_Size(swigCPtr, this);
  }

  /**
   *  Returns size of array of statuses
   */
  public int NbStatuses() {
    return OCCwrapJavaJNI.Interface_Graph_NbStatuses(swigCPtr, this);
  }

  /**
   *  Returns the Number of the entity in the Map, computed at
   *  creation time (Entities loaded from the Model)
   *  Returns 0 if <ent> not contained by Model used to create <me>
   *  (that is, <ent> is unknown from <me>)
   */
  public int EntityNumber( Standard_Transient  ent) {
    return OCCwrapJavaJNI.Interface_Graph_EntityNumber(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent);
  }

  /**
   *  Returns True if an Entity is noted as present in the graph
   *  (See methods Get... which determine this status)
   *  Returns False if <num> is out of range too
   */
  public long IsPresent(int num) {
    return OCCwrapJavaJNI.Interface_Graph_IsPresent__SWIG_0(swigCPtr, this, num);
  }

  /**
   *  Same as above but directly on an Entity <ent> : if it is not
   *  contained in the Model, returns False. Else calls
   *  IsPresent(num)  with <num> given by EntityNumber
   */
  public long IsPresent( Standard_Transient  ent) {
    return OCCwrapJavaJNI.Interface_Graph_IsPresent__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent);
  }

  public  Standard_Transient  Entity(int num) {
    return new Standard_Transient ( OCCwrapJavaJNI.Interface_Graph_Entity(swigCPtr, this, num), true );
  }

  /**
   *  Returns Status associated to a numero (only to read it)
   */
  public int Status(int num) {
    return OCCwrapJavaJNI.Interface_Graph_Status(swigCPtr, this, num);
  }

  /**
   *  Modifies Status associated to a numero
   */
  public void SetStatus(int num, int stat) {
    OCCwrapJavaJNI.Interface_Graph_SetStatus(swigCPtr, this, num, stat);
  }

  /**
   *  Clears Entity and sets Status to 0, for a numero
   */
  public void RemoveItem(int num) {
    OCCwrapJavaJNI.Interface_Graph_RemoveItem(swigCPtr, this, num);
  }

  /**
   *  Changes all status which value is oldstat to new value newstat
   */
  public void ChangeStatus(int oldstat, int newstat) {
    OCCwrapJavaJNI.Interface_Graph_ChangeStatus(swigCPtr, this, oldstat, newstat);
  }

  /**
   *  Removes all items of which status has a given value stat
   */
  public void RemoveStatus(int stat) {
    OCCwrapJavaJNI.Interface_Graph_RemoveStatus(swigCPtr, this, stat);
  }

  public  Interface_InterfaceModel  Model() {
    return new Interface_InterfaceModel ( OCCwrapJavaJNI.Interface_Graph_Model(swigCPtr, this), true );
  }

  /**
   *  Loads Graph with all Entities contained in the Model
   */
  public void GetFromModel() {
    OCCwrapJavaJNI.Interface_Graph_GetFromModel(swigCPtr, this);
  }

  /**
   *  Gets an Entity, plus its shared ones (at every level) if
   *  "shared" is True. New items are set to status "newstat"
   *  Items already present in graph remain unchanged
   *  Of course, redefinitions of Shared lists are taken into
   *  account if there are some
   */
  public void GetFromEntity( Standard_Transient  ent, long shared, int newstat) {
    OCCwrapJavaJNI.Interface_Graph_GetFromEntity__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent, shared, newstat);
  }

  /**
   *  Gets an Entity, plus its shared ones (at every level) if
   *  "shared" is True. New items are set to status "newstat".
   *  Items already present in graph are processed as follows :
   *  - if they already have status "newstat", they remain unchanged
   *  - if they have another status, this one is modified :
   *  if cumul is True,  to former status + overlapstat (cumul)
   *  if cumul is False, to overlapstat (enforce)
   */
  public void GetFromEntity( Standard_Transient  ent, long shared) {
    OCCwrapJavaJNI.Interface_Graph_GetFromEntity__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent, shared);
  }

  public void GetFromEntity( Standard_Transient  ent, long shared, int newstat, int overlapstat, long cumul) {
    OCCwrapJavaJNI.Interface_Graph_GetFromEntity__SWIG_2(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent, shared, newstat, overlapstat, cumul);
  }

  /**
   *  Gets all present items from another graph
   */
  public void GetFromGraph( Interface_Graph  agraph) {
    OCCwrapJavaJNI.Interface_Graph_GetFromGraph__SWIG_0(swigCPtr, this, Interface_Graph.getCPtr(agraph), agraph);
  }

  /**
   *  Gets items from another graph which have a specific Status
   */
  public void GetFromGraph( Interface_Graph  agraph, int stat) {
    OCCwrapJavaJNI.Interface_Graph_GetFromGraph__SWIG_1(swigCPtr, this, Interface_Graph.getCPtr(agraph), agraph, stat);
  }

  /**
   *  Returns True if <ent> or the list of entities shared by <ent>
   *  (not redefined) contains items unknown from this Graph
   *  Remark : apart from the status HasShareError, these items
   *  are ignored
   */
  public long HasShareErrors( Standard_Transient  ent) {
    return OCCwrapJavaJNI.Interface_Graph_HasShareErrors(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent);
  }

  public  TColStd_HSequenceOfTransient  GetShareds( Standard_Transient  ent) {
    return new TColStd_HSequenceOfTransient ( OCCwrapJavaJNI.Interface_Graph_GetShareds(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent), true );
  }

  /**
   *  Returns the list of Entities Shared by an Entity, as recorded
   *  by the Graph. That is, by default Basic Shared List, else it
   *  can be redefined by methods SetShare, SetNoShare ... see below
   */
  public Interface_EntityIterator Shareds( Standard_Transient  ent) {
    return new Interface_EntityIterator(OCCwrapJavaJNI.Interface_Graph_Shareds(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent), true);
  }

  /**
   *  Returns the list of Entities which Share an Entity, computed
   *  from the Basic or Redefined Shared Lists
   */
  public Interface_EntityIterator Sharings( Standard_Transient  ent) {
    return new Interface_EntityIterator(OCCwrapJavaJNI.Interface_Graph_Sharings(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent), true);
  }

  public  TColStd_HSequenceOfTransient  GetSharings( Standard_Transient  ent) {
    return new TColStd_HSequenceOfTransient ( OCCwrapJavaJNI.Interface_Graph_GetSharings(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent), true );
  }

  /**
   *  Returns the list of sharings entities, AT ANY LEVEL, which are
   *  kind of a given type. A sharing entity kind of this type
   *  ends the exploration of its branch
   */
  public Interface_EntityIterator TypedSharings( Standard_Transient  ent,  Standard_Type  type) {
    return new Interface_EntityIterator(OCCwrapJavaJNI.Interface_Graph_TypedSharings(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent,  Standard_Type.getCPtr(type) , type), true);
  }

  /**
   *  Returns the Entities which are not Shared (their Sharing List
   *  is empty) in the Model
   */
  public Interface_EntityIterator RootEntities() {
    return new Interface_EntityIterator(OCCwrapJavaJNI.Interface_Graph_RootEntities(swigCPtr, this), true);
  }

  public  TCollection_HAsciiString  Name( Standard_Transient  ent) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.Interface_Graph_Name(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent), true );
  }

  public  TColStd_HArray1OfListOfInteger  SharingTable() {
    return new TColStd_HArray1OfListOfInteger ( OCCwrapJavaJNI.Interface_Graph_SharingTable(swigCPtr, this), true );
  }

  /**
   *  Returns mode resposible for computation of statuses;
   */
  public long ModeStat() {
    return OCCwrapJavaJNI.Interface_Graph_ModeStat(swigCPtr, this);
  }

}
