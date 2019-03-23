package opencascade;

public class StepShape_ManifoldSolidBrep extends StepShape_SolidModel {
  StepShape_ManifoldSolidBrep(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a ManifoldSolidBrep
   */
  public StepShape_ManifoldSolidBrep() {
    this(OCCwrapJavaJNI.new_StepShape_ManifoldSolidBrep(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepShape_ClosedShell  aOuter) {
    OCCwrapJavaJNI.StepShape_ManifoldSolidBrep_Init__SWIG_0(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepShape_ClosedShell.getCPtr(aOuter) , aOuter);
  }

  public void Init( TCollection_HAsciiString  aName,  StepShape_ConnectedFaceSet  aOuter) {
    OCCwrapJavaJNI.StepShape_ManifoldSolidBrep_Init__SWIG_1(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepShape_ConnectedFaceSet.getCPtr(aOuter) , aOuter);
  }

  public void SetOuter( StepShape_ConnectedFaceSet  aOuter) {
    OCCwrapJavaJNI.StepShape_ManifoldSolidBrep_SetOuter(swigCPtr, this,  StepShape_ConnectedFaceSet.getCPtr(aOuter) , aOuter);
  }

  public  StepShape_ConnectedFaceSet  Outer() {
    return new StepShape_ConnectedFaceSet ( OCCwrapJavaJNI.StepShape_ManifoldSolidBrep_Outer(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_ManifoldSolidBrep_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_ManifoldSolidBrep_get_type_descriptor(), true );
  }

  public static  StepShape_ManifoldSolidBrep  DownCast( Standard_Transient  T) {
    return new StepShape_ManifoldSolidBrep ( OCCwrapJavaJNI.StepShape_ManifoldSolidBrep_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_ManifoldSolidBrep_TypeOf(), true );
  }

}
