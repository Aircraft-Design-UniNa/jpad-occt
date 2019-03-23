package opencascade;

public class StepGeom_Conic extends StepGeom_Curve {
  StepGeom_Conic(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Conic
   */
  public StepGeom_Conic() {
    this(OCCwrapJavaJNI.new_StepGeom_Conic(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Axis2Placement  aPosition) {
    OCCwrapJavaJNI.StepGeom_Conic_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName, StepGeom_Axis2Placement.getCPtr(aPosition), aPosition);
  }

  public void SetPosition( StepGeom_Axis2Placement  aPosition) {
    OCCwrapJavaJNI.StepGeom_Conic_SetPosition(swigCPtr, this, StepGeom_Axis2Placement.getCPtr(aPosition), aPosition);
  }

  public StepGeom_Axis2Placement Position() {
    return new StepGeom_Axis2Placement(OCCwrapJavaJNI.StepGeom_Conic_Position(swigCPtr, this), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_Conic_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Conic_get_type_descriptor(), true );
  }

  public static  StepGeom_Conic  DownCast( Standard_Transient  T) {
    return new StepGeom_Conic ( OCCwrapJavaJNI.StepGeom_Conic_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Conic_TypeOf(), true );
  }

}
