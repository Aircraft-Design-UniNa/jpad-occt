package opencascade;

public class StepShape_ClosedShell extends StepShape_ConnectedFaceSet {
  StepShape_ClosedShell(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a ClosedShell
   */
  public StepShape_ClosedShell() {
    this(OCCwrapJavaJNI.new_StepShape_ClosedShell(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_ClosedShell_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_ClosedShell_get_type_descriptor(), true );
  }

  public static  StepShape_ClosedShell  DownCast( Standard_Transient  T) {
    return new StepShape_ClosedShell ( OCCwrapJavaJNI.StepShape_ClosedShell_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_ClosedShell_TypeOf(), true );
  }

}
