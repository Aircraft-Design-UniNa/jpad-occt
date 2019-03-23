package opencascade;

public class StepShape_ShellBasedSurfaceModel extends StepGeom_GeometricRepresentationItem {
  StepShape_ShellBasedSurfaceModel(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a ShellBasedSurfaceModel
   */
  public StepShape_ShellBasedSurfaceModel() {
    this(OCCwrapJavaJNI.new_StepShape_ShellBasedSurfaceModel(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepShape_HArray1OfShell  aSbsmBoundary) {
    OCCwrapJavaJNI.StepShape_ShellBasedSurfaceModel_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepShape_HArray1OfShell.getCPtr(aSbsmBoundary) , aSbsmBoundary);
  }

  public void SetSbsmBoundary( StepShape_HArray1OfShell  aSbsmBoundary) {
    OCCwrapJavaJNI.StepShape_ShellBasedSurfaceModel_SetSbsmBoundary(swigCPtr, this,  StepShape_HArray1OfShell.getCPtr(aSbsmBoundary) , aSbsmBoundary);
  }

  public  StepShape_HArray1OfShell  SbsmBoundary() {
    return new StepShape_HArray1OfShell ( OCCwrapJavaJNI.StepShape_ShellBasedSurfaceModel_SbsmBoundary(swigCPtr, this), true );
  }

  public StepShape_Shell SbsmBoundaryValue(int num) {
    return new StepShape_Shell(OCCwrapJavaJNI.StepShape_ShellBasedSurfaceModel_SbsmBoundaryValue(swigCPtr, this, num), true);
  }

  public int NbSbsmBoundary() {
    return OCCwrapJavaJNI.StepShape_ShellBasedSurfaceModel_NbSbsmBoundary(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_ShellBasedSurfaceModel_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_ShellBasedSurfaceModel_get_type_descriptor(), true );
  }

  public static  StepShape_ShellBasedSurfaceModel  DownCast( Standard_Transient  T) {
    return new StepShape_ShellBasedSurfaceModel ( OCCwrapJavaJNI.StepShape_ShellBasedSurfaceModel_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_ShellBasedSurfaceModel_TypeOf(), true );
  }

}
