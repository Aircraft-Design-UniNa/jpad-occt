package opencascade;

/**
 *  This class allows a general X-STEP engine to run generic
 *  functions on any interface norm, in the same way. It includes
 *  the transfer operations. I.e. it gathers the already available
 *  general modules, the engine has just to know it
 * 
 *  The important point is that a given X-STEP Controller is
 *  attached to a given couple made of an Interface Norm (such as
 *  IGES-5.1) and an application data model (CasCade Shapes for
 *  instance).
 * 
 *  Finally, Controller can be gathered in a general dictionary then
 *  retreived later by a general call (method Recorded)
 * 
 *  It does not manage the produced data, but the Actors make the
 *  link between the norm and the application
 */
public class XSControl_Controller extends Standard_Transient {
  XSControl_Controller(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Changes names
   *  if a name is empty, the formerly set one remains
   *  Remark : Does not call Record or AutoRecord
   */
  public void SetNames(String theLongName, String theShortName) {
    OCCwrapJavaJNI.XSControl_Controller_SetNames(swigCPtr, this, theLongName, theShortName);
  }

  /**
   *  Records <me> is a general dictionary under Short and Long
   *  Names (see method Name)
   */
  public void AutoRecord() {
    OCCwrapJavaJNI.XSControl_Controller_AutoRecord(swigCPtr, this);
  }

  public void Record(String name) {
    OCCwrapJavaJNI.XSControl_Controller_Record(swigCPtr, this, name);
  }

  public static  XSControl_Controller  Recorded(String name) {
    return new XSControl_Controller ( OCCwrapJavaJNI.XSControl_Controller_Recorded(name), true );
  }

  /**
   *  Returns a name, as given when initializing :
   *  rsc = False (D) : True Name attached to the Norm (long name)
   *  rsc = True : Name of the ressource set (i.e. short name)
   */
  public String Name(long rsc) {
    return OCCwrapJavaJNI.XSControl_Controller_Name__SWIG_0(swigCPtr, this, rsc);
  }

  public String Name() {
    return OCCwrapJavaJNI.XSControl_Controller_Name__SWIG_1(swigCPtr, this);
  }

  public  Interface_InterfaceModel  NewModel() {
    return new Interface_InterfaceModel ( OCCwrapJavaJNI.XSControl_Controller_NewModel(swigCPtr, this), true );
  }

  /**
   *  Sets mininum and maximum values for modetrans (write)
   *  Erases formerly recorded bounds and values
   *  Actually only for shape
   *  Then, for each value a little help can be attached
   */
  public void SetModeWrite(int modemin, int modemax, long shape) {
    OCCwrapJavaJNI.XSControl_Controller_SetModeWrite__SWIG_0(swigCPtr, this, modemin, modemax, shape);
  }

  public void SetModeWrite(int modemin, int modemax) {
    OCCwrapJavaJNI.XSControl_Controller_SetModeWrite__SWIG_1(swigCPtr, this, modemin, modemax);
  }

  /**
   *  Attaches a short line of help to a value of modetrans (write)
   */
  public void SetModeWriteHelp(int modetrans, String help, long shape) {
    OCCwrapJavaJNI.XSControl_Controller_SetModeWriteHelp__SWIG_0(swigCPtr, this, modetrans, help, shape);
  }

  public void SetModeWriteHelp(int modetrans, String help) {
    OCCwrapJavaJNI.XSControl_Controller_SetModeWriteHelp__SWIG_1(swigCPtr, this, modetrans, help);
  }

  /**
   *  Returns recorded min and max values for modetrans (write)
   *  Actually only for shapes
   *  Returns True if bounds are set, False else (then, free value)
   */
  public long ModeWriteBounds(int[] modemin, int[] modemax, long shape) {
    return OCCwrapJavaJNI.XSControl_Controller_ModeWriteBounds__SWIG_0(swigCPtr, this, modemin, modemax, shape);
  }

  public long ModeWriteBounds(int[] modemin, int[] modemax) {
    return OCCwrapJavaJNI.XSControl_Controller_ModeWriteBounds__SWIG_1(swigCPtr, this, modemin, modemax);
  }

  /**
   *  Tells if a value of <modetrans> is a good value(within bounds)
   *  Actually only for shapes
   */
  public long IsModeWrite(int modetrans, long shape) {
    return OCCwrapJavaJNI.XSControl_Controller_IsModeWrite__SWIG_0(swigCPtr, this, modetrans, shape);
  }

  public long IsModeWrite(int modetrans) {
    return OCCwrapJavaJNI.XSControl_Controller_IsModeWrite__SWIG_1(swigCPtr, this, modetrans);
  }

  /**
   *  Returns the help line recorded for a value of modetrans
   *  empty if help not defined or not within bounds or if values are free
   */
  public String ModeWriteHelp(int modetrans, long shape) {
    return OCCwrapJavaJNI.XSControl_Controller_ModeWriteHelp__SWIG_0(swigCPtr, this, modetrans, shape);
  }

  public String ModeWriteHelp(int modetrans) {
    return OCCwrapJavaJNI.XSControl_Controller_ModeWriteHelp__SWIG_1(swigCPtr, this, modetrans);
  }

  /**
   *  Tells if <obj> (an application object) is a valid candidate
   *  for a transfer to a Model.
   *  By default, asks the ActorWrite if known (through a
   *  TransientMapper). Can be redefined
   */
  public long RecognizeWriteTransient( Standard_Transient  obj, int modetrans) {
    return OCCwrapJavaJNI.XSControl_Controller_RecognizeWriteTransient__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(obj) , obj, modetrans);
  }

  public long RecognizeWriteTransient( Standard_Transient  obj) {
    return OCCwrapJavaJNI.XSControl_Controller_RecognizeWriteTransient__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(obj) , obj);
  }

  /**
   *  Tells if a shape is valid for a transfer to a model
   *  Asks the ActorWrite (through a ShapeMapper)
   */
  public long RecognizeWriteShape( TopoDS_Shape  shape, int modetrans) {
    return OCCwrapJavaJNI.XSControl_Controller_RecognizeWriteShape__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, modetrans);
  }

  public long RecognizeWriteShape( TopoDS_Shape  shape) {
    return OCCwrapJavaJNI.XSControl_Controller_RecognizeWriteShape__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Records a Session Item, to be added for customisation of the Work Session.
   *  It must have a specific name.
   *  <setapplied> is used if <item> is a GeneralModifier, to decide
   *  If set to true, <item> will be applied to the hook list "send".
   *  Else, it is not applied to any hook list.
   *  Remark : this method is to be called at Create time,
   *  the recorded items will be used by Customise
   *  Warning : if <name> conflicts, the last recorded item is kept
   */
  public void AddSessionItem( Standard_Transient  theItem, String theName, long toApply) {
    OCCwrapJavaJNI.XSControl_Controller_AddSessionItem__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(theItem) , theItem, theName, toApply);
  }

  public void AddSessionItem( Standard_Transient  theItem, String theName) {
    OCCwrapJavaJNI.XSControl_Controller_AddSessionItem__SWIG_1(swigCPtr, this,  Standard_Transient.getCPtr(theItem) , theItem, theName);
  }

  public  Standard_Transient  SessionItem(String theName) {
    return new Standard_Transient ( OCCwrapJavaJNI.XSControl_Controller_SessionItem(swigCPtr, this, theName), true );
  }

  /**
   *  Customises a WorkSession, by adding to it the recorded items (by AddSessionItem)
   */
  public void Customise( XSControl_WorkSession  WS) {
    OCCwrapJavaJNI.XSControl_Controller_Customise(swigCPtr, this,  XSControl_WorkSession.getCPtr(WS) , WS);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.XSControl_Controller_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.XSControl_Controller_get_type_descriptor(), true );
  }

  public static  XSControl_Controller  DownCast( Standard_Transient  T) {
    return new XSControl_Controller ( OCCwrapJavaJNI.XSControl_Controller_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.XSControl_Controller_TypeOf(), true );
  }

}
