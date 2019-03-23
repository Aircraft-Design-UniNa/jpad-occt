package opencascade;

/**
 *  Adds specific features to the generic definition :
 *  TransientProcess is intended to work from an InterfaceModel
 *  to a set of application objects.
 * 
 *  Hence, some informations about starting entities can be gotten
 *  from the model : for Trace, CheckList, Integrity Status
 */
public class Transfer_TransientProcess extends Transfer_ProcessForTransient {
  Transfer_TransientProcess(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Sets TransientProcess at initial state, with an initial size
   */
  public Transfer_TransientProcess(int nb) {
    this(OCCwrapJavaJNI.new_Transfer_TransientProcess__SWIG_0(nb), true);
  }

  public Transfer_TransientProcess() {
    this(OCCwrapJavaJNI.new_Transfer_TransientProcess__SWIG_1(), true);
  }

  /**
   *  Sets an InterfaceModel, used by StartTrace, CheckList, queries
   *  on Integrity, to give informations significant for each norm.
   */
  public void SetModel( Interface_InterfaceModel  model) {
    OCCwrapJavaJNI.Transfer_TransientProcess_SetModel(swigCPtr, this,  Interface_InterfaceModel.getCPtr(model) , model);
  }

  public  Interface_InterfaceModel  Model() {
    return new Interface_InterfaceModel ( OCCwrapJavaJNI.Transfer_TransientProcess_Model(swigCPtr, this), true );
  }

  public long HasGraph() {
    return OCCwrapJavaJNI.Transfer_TransientProcess_HasGraph(swigCPtr, this);
  }

  /**
   *  Sets a Context : according to receiving appli, to be
   *  interpreted by the Actor
   */
  public void SetContext(String name,  Standard_Transient  ctx) {
    OCCwrapJavaJNI.Transfer_TransientProcess_SetContext(swigCPtr, this, name,  Standard_Transient.getCPtr(ctx) , ctx);
  }

  /**
   *  Returns the Context attached to a name, if set and if it is
   *  Kind of the type, else a Null Handle
   *  Returns True if OK, False if no Context
   */
  public long GetContext(String name,  Standard_Type  type,  Standard_Transient  ctx) {
    return OCCwrapJavaJNI.Transfer_TransientProcess_GetContext(swigCPtr, this, name,  Standard_Type.getCPtr(type) , type,  Standard_Transient.getCPtr(ctx) , ctx);
  }

  /**
   *  Returns the list of sharings entities, AT ANY LEVEL, which are
   *  kind of a given type. Calls TypedSharings from Graph
   *  Returns an empty list if the Graph has not been aknowledged
   */
  public Interface_EntityIterator TypedSharings( Standard_Transient  start,  Standard_Type  type) {
    return new Interface_EntityIterator(OCCwrapJavaJNI.Transfer_TransientProcess_TypedSharings(swigCPtr, this,  Standard_Transient.getCPtr(start) , start,  Standard_Type.getCPtr(type) , type), true);
  }

  /**
   *  Tells if an entity is well loaded from file (even if its data
   *  fail on checking, they are present). Mostly often, answers
   *  True. Else, there was a syntactic error in the file.
   *  A non-loaded entity MAY NOT BE transferred, unless its Report
   *  (in the model) is interpreted
   */
  public long IsDataLoaded( Standard_Transient  ent) {
    return OCCwrapJavaJNI.Transfer_TransientProcess_IsDataLoaded(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent);
  }

  /**
   *  Tells if an entity fails on data checking (load time,
   *  syntactic, or semantic check). Normally, should answer False.
   *  It is not prudent to try transferring an entity which fails on
   *  data checking
   */
  public long IsDataFail( Standard_Transient  ent) {
    return OCCwrapJavaJNI.Transfer_TransientProcess_IsDataFail(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent);
  }

  /**
   *  Prints statistics on a given output, according mode
   */
  public void PrintStats(int mode,  Message_Messenger  S) {
    OCCwrapJavaJNI.Transfer_TransientProcess_PrintStats(swigCPtr, this, mode,  Message_Messenger.getCPtr(S) , S);
  }

  public  TColStd_HSequenceOfTransient  RootsForTransfer() {
    return new TColStd_HSequenceOfTransient ( OCCwrapJavaJNI.Transfer_TransientProcess_RootsForTransfer(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Transfer_TransientProcess_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Transfer_TransientProcess_get_type_descriptor(), true );
  }

  public static  Transfer_TransientProcess  DownCast( Standard_Transient  T) {
    return new Transfer_TransientProcess ( OCCwrapJavaJNI.Transfer_TransientProcess_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Transfer_TransientProcess_TypeOf(), true );
  }

}
