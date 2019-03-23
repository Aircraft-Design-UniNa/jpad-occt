package opencascade;

/**
 *  This WorkSession completes the basic one, by adding :
 *  - use of Controller, with norm selection...
 *  - management of transfers (both ways) with auxiliary classes
 *  TransferReader and TransferWriter
 *  -> these transfers may work with a Context List : its items
 *  are given by the user, according to the transfer to be
 *  i.e. it is interpreted by the Actors
 *  Each item is accessed by a Name
 */
public class XSControl_WorkSession extends IFSelect_WorkSession {
  XSControl_WorkSession(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public XSControl_WorkSession() {
    this(OCCwrapJavaJNI.new_XSControl_WorkSession(), true);
  }

  /**
   *  Selects a Norm defined by its name.
   *  A Norm is described and handled by a Controller
   *  Returns True if done, False if <normname> is unknown
   * 
   *  The current Profile for this Norm is taken.
   */
  public long SelectNorm(String theNormName) {
    return OCCwrapJavaJNI.XSControl_WorkSession_SelectNorm(swigCPtr, this, theNormName);
  }

  /**
   *  Selects a Norm defined by its Controller itself
   */
  public void SetController( XSControl_Controller  theCtl) {
    OCCwrapJavaJNI.XSControl_WorkSession_SetController(swigCPtr, this,  XSControl_Controller.getCPtr(theCtl) , theCtl);
  }

  /**
   *  Returns the name of the last Selected Norm. If none is
   *  defined, returns an empty string
   *  By default, returns the complete name of the norm
   *  If <rsc> is True, returns the short name used for resource
   */
  public String SelectedNorm(long theRsc) {
    return OCCwrapJavaJNI.XSControl_WorkSession_SelectedNorm__SWIG_0(swigCPtr, this, theRsc);
  }

  public String SelectedNorm() {
    return OCCwrapJavaJNI.XSControl_WorkSession_SelectedNorm__SWIG_1(swigCPtr, this);
  }

  public  XSControl_Controller  NormAdaptor() {
    return new XSControl_Controller ( OCCwrapJavaJNI.XSControl_WorkSession_NormAdaptor(swigCPtr, this), true );
  }

  /**
   *  Clears the whole current Context (nullifies it)
   */
  public void ClearContext() {
    OCCwrapJavaJNI.XSControl_WorkSession_ClearContext(swigCPtr, this);
  }

  /**
   *  Prints the transfer status of a transferred item, as beeing
   *  the Mapped n0 <num>, from MapWriter if <wri> is True, or
   *  from MapReader if <wri> is False
   *  Returns True when done, False else (i.e. num out of range)
   */
  public long PrintTransferStatus(int theNum, long theWri,  Message_Messenger  theS) {
    return OCCwrapJavaJNI.XSControl_WorkSession_PrintTransferStatus(swigCPtr, this, theNum, theWri,  Message_Messenger.getCPtr(theS) , theS);
  }

  /**
   *  Sets a Transfer Reader, by internal ways, according mode :
   *  0 recreates it clear,  1 clears it (does not recreate)
   *  2 aligns Roots of TransientProcess from final Results
   *  3 aligns final Results from Roots of TransientProcess
   *  4 begins a new transfer (by BeginTransfer)
   *  5 recreates TransferReader then begins a new transfer
   */
  public void InitTransferReader(int theMode) {
    OCCwrapJavaJNI.XSControl_WorkSession_InitTransferReader(swigCPtr, this, theMode);
  }

  public  Standard_Transient  Result( Standard_Transient  theEnt, int theMode) {
    return new Standard_Transient ( OCCwrapJavaJNI.XSControl_WorkSession_Result(swigCPtr, this,  Standard_Transient.getCPtr(theEnt) , theEnt, theMode), true );
  }

  /**
   *  Commands the transfer of, either one entity, or a list
   *  I.E. calls the TransferReader after having analysed <ents>
   *  It is cumulated from the last BeginTransfer
   *  <ents> is processed by GiveList, hence :
   *  - <ents> a Selection : its SelectionResult
   *  - <ents> a HSequenceOfTransient : this list
   *  - <ents> the Model : in this specific case, all the roots,
   *  with no cumulation of former transfers (TransferReadRoots)
   */
  public int TransferReadOne( Standard_Transient  theEnts) {
    return OCCwrapJavaJNI.XSControl_WorkSession_TransferReadOne(swigCPtr, this,  Standard_Transient.getCPtr(theEnts) , theEnts);
  }

  /**
   *  Commands the transfer of all the root entities of the model
   *  i.e. calls TransferRoot from the TransferReader with the Graph
   *  No cumulation with former calls to TransferReadOne
   */
  public int TransferReadRoots() {
    return OCCwrapJavaJNI.XSControl_WorkSession_TransferReadRoots(swigCPtr, this);
  }

  public  Interface_InterfaceModel  NewModel() {
    return new Interface_InterfaceModel ( OCCwrapJavaJNI.XSControl_WorkSession_NewModel(swigCPtr, this), true );
  }

  /**
   *  Transfers a Shape from CasCade to a model of current norm,
   *  according to the last call to SetModeWriteShape
   *  Returns status :Done if OK, Fail if error during transfer,
   *  Error if transfer badly initialised
   */
  public IFSelect_ReturnStatus TransferWriteShape( TopoDS_Shape  theShape, long theCompGraph) {
    return IFSelect_ReturnStatus.swigToEnum(OCCwrapJavaJNI.XSControl_WorkSession_TransferWriteShape__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(theShape), theShape, theCompGraph));
  }

  public IFSelect_ReturnStatus TransferWriteShape( TopoDS_Shape  theShape) {
    return IFSelect_ReturnStatus.swigToEnum(OCCwrapJavaJNI.XSControl_WorkSession_TransferWriteShape__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(theShape), theShape));
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.XSControl_WorkSession_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.XSControl_WorkSession_get_type_descriptor(), true );
  }

  public static  XSControl_WorkSession  DownCast( Standard_Transient  T) {
    return new XSControl_WorkSession ( OCCwrapJavaJNI.XSControl_WorkSession_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.XSControl_WorkSession_TypeOf(), true );
  }

}
