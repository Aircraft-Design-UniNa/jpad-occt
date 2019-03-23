package opencascade;

/**
 *  Provides convenient interface to resource file
 *  Allows to load resource file and get values of
 *  attributes starting from some scope, for example
 *  if scope is defined as "ToV4" and requested parameter
 *  is "exec.op", value of "ToV4.exec.op" parameter from
 *  the resource file will be returned
 */
public class ShapeProcess_Context extends Standard_Transient {
  ShapeProcess_Context(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates an empty tool
   */
  public ShapeProcess_Context() {
    this(OCCwrapJavaJNI.new_ShapeProcess_Context__SWIG_0(), true);
  }

  /**
   *  Creates a new tool and initialises by name of
   *  resource file and (if specified) starting scope
   *  Calls method Init()
   */
  public ShapeProcess_Context(String file, String scope) {
    this(OCCwrapJavaJNI.new_ShapeProcess_Context__SWIG_1(file, scope), true);
  }

  public ShapeProcess_Context(String file) {
    this(OCCwrapJavaJNI.new_ShapeProcess_Context__SWIG_2(file), true);
  }

  /**
   *  Initialises a tool by loading resource file and
   *  (if specified) sets starting scope
   *  Returns False if resource file not found
   */
  public long Init(String file, String scope) {
    return OCCwrapJavaJNI.ShapeProcess_Context_Init__SWIG_0(swigCPtr, this, file, scope);
  }

  public long Init(String file) {
    return OCCwrapJavaJNI.ShapeProcess_Context_Init__SWIG_1(swigCPtr, this, file);
  }

  public  Resource_Manager  LoadResourceManager(String file) {
    return new Resource_Manager ( OCCwrapJavaJNI.ShapeProcess_Context_LoadResourceManager(swigCPtr, this, file), true );
  }

  public  Resource_Manager  ResourceManager() {
    return new Resource_Manager ( OCCwrapJavaJNI.ShapeProcess_Context_ResourceManager(swigCPtr, this), true );
  }

  /**
   *  Set a new (sub)scope
   */
  public void SetScope(String scope) {
    OCCwrapJavaJNI.ShapeProcess_Context_SetScope(swigCPtr, this, scope);
  }

  /**
   *  Go out of current scope
   */
  public void UnSetScope() {
    OCCwrapJavaJNI.ShapeProcess_Context_UnSetScope(swigCPtr, this);
  }

  /**
   *  Returns True if parameter is defined in the resource file
   */
  public long IsParamSet(String param) {
    return OCCwrapJavaJNI.ShapeProcess_Context_IsParamSet(swigCPtr, this, param);
  }

  public long GetReal(String param, double[] val) {
    return OCCwrapJavaJNI.ShapeProcess_Context_GetReal(swigCPtr, this, param, val);
  }

  public long GetInteger(String param, int[] val) {
    return OCCwrapJavaJNI.ShapeProcess_Context_GetInteger(swigCPtr, this, param, val);
  }

  public long GetBoolean(String param, long[] val) {
    return OCCwrapJavaJNI.ShapeProcess_Context_GetBoolean(swigCPtr, this, param, val);
  }

  /**
   *  Get value of parameter as being of specific type
   *  Returns False if parameter is not defined or has a wrong type
   */
  public long GetString(String param, TCollection_AsciiString val) {
    return OCCwrapJavaJNI.ShapeProcess_Context_GetString(swigCPtr, this, param, TCollection_AsciiString.getCPtr(val), val);
  }

  public double RealVal(String param, double def) {
    return OCCwrapJavaJNI.ShapeProcess_Context_RealVal(swigCPtr, this, param, def);
  }

  public int IntegerVal(String param, int def) {
    return OCCwrapJavaJNI.ShapeProcess_Context_IntegerVal(swigCPtr, this, param, def);
  }

  public long BooleanVal(String param, long def) {
    return OCCwrapJavaJNI.ShapeProcess_Context_BooleanVal(swigCPtr, this, param, def);
  }

  /**
   *  Get value of parameter as being of specific type
   *  If parameter is not defined or does not have expected
   *  type, returns default value as specified
   */
  public String StringVal(String param, String def) {
    return OCCwrapJavaJNI.ShapeProcess_Context_StringVal(swigCPtr, this, param, def);
  }

  /**
   *  Sets Messenger used for outputting messages.
   */
  public void SetMessenger( Message_Messenger  messenger) {
    OCCwrapJavaJNI.ShapeProcess_Context_SetMessenger(swigCPtr, this,  Message_Messenger.getCPtr(messenger) , messenger);
  }

  public  Message_Messenger  Messenger() {
    return new Message_Messenger ( OCCwrapJavaJNI.ShapeProcess_Context_Messenger(swigCPtr, this), true );
  }

  /**
   *  Sets Progress Indicator.
   */
  public void SetProgress( Message_ProgressIndicator  theProgress) {
    OCCwrapJavaJNI.ShapeProcess_Context_SetProgress(swigCPtr, this,  Message_ProgressIndicator.getCPtr(theProgress) , theProgress);
  }

  public  Message_ProgressIndicator  Progress() {
    return new Message_ProgressIndicator ( OCCwrapJavaJNI.ShapeProcess_Context_Progress(swigCPtr, this), true );
  }

  /**
   *  Sets trace level used for outputting messages
   *  - 0: no trace at all
   *  - 1: errors
   *  - 2: errors and warnings
   *  - 3: all messages
   *  Default is 1 : Errors traced
   */
  public void SetTraceLevel(int tracelev) {
    OCCwrapJavaJNI.ShapeProcess_Context_SetTraceLevel(swigCPtr, this, tracelev);
  }

  /**
   *  Returns trace level used for outputting messages.
   */
  public int TraceLevel() {
    return OCCwrapJavaJNI.ShapeProcess_Context_TraceLevel(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeProcess_Context_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeProcess_Context_get_type_descriptor(), true );
  }

  public static  ShapeProcess_Context  DownCast( Standard_Transient  T) {
    return new ShapeProcess_Context ( OCCwrapJavaJNI.ShapeProcess_Context_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeProcess_Context_TypeOf(), true );
  }

}
