package opencascade;

public class StepShape_OrientedClosedShell extends StepShape_ClosedShell {
  StepShape_OrientedClosedShell(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a OrientedClosedShell
   */
  public StepShape_OrientedClosedShell() {
    this(OCCwrapJavaJNI.new_StepShape_OrientedClosedShell(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepShape_ClosedShell  aClosedShellElement, long aOrientation) {
    OCCwrapJavaJNI.StepShape_OrientedClosedShell_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepShape_ClosedShell.getCPtr(aClosedShellElement) , aClosedShellElement, aOrientation);
  }

  public void SetClosedShellElement( StepShape_ClosedShell  aClosedShellElement) {
    OCCwrapJavaJNI.StepShape_OrientedClosedShell_SetClosedShellElement(swigCPtr, this,  StepShape_ClosedShell.getCPtr(aClosedShellElement) , aClosedShellElement);
  }

  public  StepShape_ClosedShell  ClosedShellElement() {
    return new StepShape_ClosedShell ( OCCwrapJavaJNI.StepShape_OrientedClosedShell_ClosedShellElement(swigCPtr, this), true );
  }

  public void SetOrientation(long aOrientation) {
    OCCwrapJavaJNI.StepShape_OrientedClosedShell_SetOrientation(swigCPtr, this, aOrientation);
  }

  public long Orientation() {
    return OCCwrapJavaJNI.StepShape_OrientedClosedShell_Orientation(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_OrientedClosedShell_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_OrientedClosedShell_get_type_descriptor(), true );
  }

  public static  StepShape_OrientedClosedShell  DownCast( Standard_Transient  T) {
    return new StepShape_OrientedClosedShell ( OCCwrapJavaJNI.StepShape_OrientedClosedShell_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_OrientedClosedShell_TypeOf(), true );
  }

}
