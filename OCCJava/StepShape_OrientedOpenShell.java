package opencascade;

public class StepShape_OrientedOpenShell extends StepShape_OpenShell {
  StepShape_OrientedOpenShell(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a OrientedOpenShell
   */
  public StepShape_OrientedOpenShell() {
    this(OCCwrapJavaJNI.new_StepShape_OrientedOpenShell(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepShape_OpenShell  aOpenShellElement, long aOrientation) {
    OCCwrapJavaJNI.StepShape_OrientedOpenShell_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepShape_OpenShell.getCPtr(aOpenShellElement) , aOpenShellElement, aOrientation);
  }

  public void SetOpenShellElement( StepShape_OpenShell  aOpenShellElement) {
    OCCwrapJavaJNI.StepShape_OrientedOpenShell_SetOpenShellElement(swigCPtr, this,  StepShape_OpenShell.getCPtr(aOpenShellElement) , aOpenShellElement);
  }

  public  StepShape_OpenShell  OpenShellElement() {
    return new StepShape_OpenShell ( OCCwrapJavaJNI.StepShape_OrientedOpenShell_OpenShellElement(swigCPtr, this), true );
  }

  public void SetOrientation(long aOrientation) {
    OCCwrapJavaJNI.StepShape_OrientedOpenShell_SetOrientation(swigCPtr, this, aOrientation);
  }

  public long Orientation() {
    return OCCwrapJavaJNI.StepShape_OrientedOpenShell_Orientation(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_OrientedOpenShell_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_OrientedOpenShell_get_type_descriptor(), true );
  }

  public static  StepShape_OrientedOpenShell  DownCast( Standard_Transient  T) {
    return new StepShape_OrientedOpenShell ( OCCwrapJavaJNI.StepShape_OrientedOpenShell_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_OrientedOpenShell_TypeOf(), true );
  }

}
