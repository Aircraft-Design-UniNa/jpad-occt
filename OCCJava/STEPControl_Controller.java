package opencascade;

/**
 *  defines basic controller for STEP processor
 */
public class STEPControl_Controller extends XSControl_Controller {
  STEPControl_Controller(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Initializes the use of STEP Norm (the first time) and
   *  returns a Controller
   */
  public STEPControl_Controller() {
    this(OCCwrapJavaJNI.new_STEPControl_Controller(), true);
  }

  /**
   *  Standard Initialisation. It creates a Controller for STEP
   *  and records it to various names, available to select it later
   *  Returns True when done, False if could not be done
   */
  public static long Init() {
    return OCCwrapJavaJNI.STEPControl_Controller_Init();
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.STEPControl_Controller_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.STEPControl_Controller_get_type_descriptor(), true );
  }

  public static  STEPControl_Controller  DownCast( Standard_Transient  T) {
    return new STEPControl_Controller ( OCCwrapJavaJNI.STEPControl_Controller_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.STEPControl_Controller_TypeOf(), true );
  }

}
