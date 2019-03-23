package opencascade;

/**
 *  Controller for IGES-5.1
 */
public class IGESControl_Controller extends XSControl_Controller {
  IGESControl_Controller(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Initializes the use of IGES Norm (the first time) and returns
   *  a Controller for IGES-5.1
   *  If <modefnes> is True, sets it to internal FNES format
   */
  public IGESControl_Controller(long modefnes) {
    this(OCCwrapJavaJNI.new_IGESControl_Controller__SWIG_0(modefnes), true);
  }

  public IGESControl_Controller() {
    this(OCCwrapJavaJNI.new_IGESControl_Controller__SWIG_1(), true);
  }

  /**
   *  Standard Initialisation. It creates a Controller for IGES and
   *  records it to various names, available to select it later
   *  Returns True when done, False if could not be done
   *  Also, it creates and records an Adaptor for FNES
   */
  public static long Init() {
    return OCCwrapJavaJNI.IGESControl_Controller_Init();
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.IGESControl_Controller_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.IGESControl_Controller_get_type_descriptor(), true );
  }

  public static  IGESControl_Controller  DownCast( Standard_Transient  T) {
    return new IGESControl_Controller ( OCCwrapJavaJNI.IGESControl_Controller_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.IGESControl_Controller_TypeOf(), true );
  }

}
