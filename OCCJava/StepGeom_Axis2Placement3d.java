package opencascade;

public class StepGeom_Axis2Placement3d extends StepGeom_Placement {
  StepGeom_Axis2Placement3d(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Axis2Placement3d
   */
  public StepGeom_Axis2Placement3d() {
    this(OCCwrapJavaJNI.new_StepGeom_Axis2Placement3d(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_CartesianPoint  aLocation, long hasAaxis,  StepGeom_Direction  aAxis, long hasArefDirection,  StepGeom_Direction  aRefDirection) {
    OCCwrapJavaJNI.StepGeom_Axis2Placement3d_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_CartesianPoint.getCPtr(aLocation) , aLocation, hasAaxis,  StepGeom_Direction.getCPtr(aAxis) , aAxis, hasArefDirection,  StepGeom_Direction.getCPtr(aRefDirection) , aRefDirection);
  }

  public void SetAxis( StepGeom_Direction  aAxis) {
    OCCwrapJavaJNI.StepGeom_Axis2Placement3d_SetAxis(swigCPtr, this,  StepGeom_Direction.getCPtr(aAxis) , aAxis);
  }

  public void UnSetAxis() {
    OCCwrapJavaJNI.StepGeom_Axis2Placement3d_UnSetAxis(swigCPtr, this);
  }

  public  StepGeom_Direction  Axis() {
    return new StepGeom_Direction ( OCCwrapJavaJNI.StepGeom_Axis2Placement3d_Axis(swigCPtr, this), true );
  }

  public long HasAxis() {
    return OCCwrapJavaJNI.StepGeom_Axis2Placement3d_HasAxis(swigCPtr, this);
  }

  public void SetRefDirection( StepGeom_Direction  aRefDirection) {
    OCCwrapJavaJNI.StepGeom_Axis2Placement3d_SetRefDirection(swigCPtr, this,  StepGeom_Direction.getCPtr(aRefDirection) , aRefDirection);
  }

  public void UnSetRefDirection() {
    OCCwrapJavaJNI.StepGeom_Axis2Placement3d_UnSetRefDirection(swigCPtr, this);
  }

  public  StepGeom_Direction  RefDirection() {
    return new StepGeom_Direction ( OCCwrapJavaJNI.StepGeom_Axis2Placement3d_RefDirection(swigCPtr, this), true );
  }

  public long HasRefDirection() {
    return OCCwrapJavaJNI.StepGeom_Axis2Placement3d_HasRefDirection(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_Axis2Placement3d_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Axis2Placement3d_get_type_descriptor(), true );
  }

  public static  StepGeom_Axis2Placement3d  DownCast( Standard_Transient  T) {
    return new StepGeom_Axis2Placement3d ( OCCwrapJavaJNI.StepGeom_Axis2Placement3d_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Axis2Placement3d_TypeOf(), true );
  }

}
