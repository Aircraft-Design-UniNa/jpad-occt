package opencascade;

public class StepShape_OpenShell extends StepShape_ConnectedFaceSet {
  StepShape_OpenShell(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a OpenShell
   */
  public StepShape_OpenShell() {
    this(OCCwrapJavaJNI.new_StepShape_OpenShell(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_OpenShell_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_OpenShell_get_type_descriptor(), true );
  }

  public static  StepShape_OpenShell  DownCast( Standard_Transient  T) {
    return new StepShape_OpenShell ( OCCwrapJavaJNI.StepShape_OpenShell_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_OpenShell_TypeOf(), true );
  }

}
