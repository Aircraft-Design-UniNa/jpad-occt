package opencascade;

public class StepGeom_Axis2Placement2d extends StepGeom_Placement {
  StepGeom_Axis2Placement2d(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Axis2Placement2d
   */
  public StepGeom_Axis2Placement2d() {
    this(OCCwrapJavaJNI.new_StepGeom_Axis2Placement2d(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_CartesianPoint  aLocation, long hasArefDirection,  StepGeom_Direction  aRefDirection) {
    OCCwrapJavaJNI.StepGeom_Axis2Placement2d_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_CartesianPoint.getCPtr(aLocation) , aLocation, hasArefDirection,  StepGeom_Direction.getCPtr(aRefDirection) , aRefDirection);
  }

  public void SetRefDirection( StepGeom_Direction  aRefDirection) {
    OCCwrapJavaJNI.StepGeom_Axis2Placement2d_SetRefDirection(swigCPtr, this,  StepGeom_Direction.getCPtr(aRefDirection) , aRefDirection);
  }

  public void UnSetRefDirection() {
    OCCwrapJavaJNI.StepGeom_Axis2Placement2d_UnSetRefDirection(swigCPtr, this);
  }

  public  StepGeom_Direction  RefDirection() {
    return new StepGeom_Direction ( OCCwrapJavaJNI.StepGeom_Axis2Placement2d_RefDirection(swigCPtr, this), true );
  }

  public long HasRefDirection() {
    return OCCwrapJavaJNI.StepGeom_Axis2Placement2d_HasRefDirection(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_Axis2Placement2d_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Axis2Placement2d_get_type_descriptor(), true );
  }

  public static  StepGeom_Axis2Placement2d  DownCast( Standard_Transient  T) {
    return new StepGeom_Axis2Placement2d ( OCCwrapJavaJNI.StepGeom_Axis2Placement2d_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Axis2Placement2d_TypeOf(), true );
  }

}
