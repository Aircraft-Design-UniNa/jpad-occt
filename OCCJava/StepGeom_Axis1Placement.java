package opencascade;

public class StepGeom_Axis1Placement extends StepGeom_Placement {
  StepGeom_Axis1Placement(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Axis1Placement
   */
  public StepGeom_Axis1Placement() {
    this(OCCwrapJavaJNI.new_StepGeom_Axis1Placement(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_CartesianPoint  aLocation, long hasAaxis,  StepGeom_Direction  aAxis) {
    OCCwrapJavaJNI.StepGeom_Axis1Placement_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_CartesianPoint.getCPtr(aLocation) , aLocation, hasAaxis,  StepGeom_Direction.getCPtr(aAxis) , aAxis);
  }

  public void SetAxis( StepGeom_Direction  aAxis) {
    OCCwrapJavaJNI.StepGeom_Axis1Placement_SetAxis(swigCPtr, this,  StepGeom_Direction.getCPtr(aAxis) , aAxis);
  }

  public void UnSetAxis() {
    OCCwrapJavaJNI.StepGeom_Axis1Placement_UnSetAxis(swigCPtr, this);
  }

  public  StepGeom_Direction  Axis() {
    return new StepGeom_Direction ( OCCwrapJavaJNI.StepGeom_Axis1Placement_Axis(swigCPtr, this), true );
  }

  public long HasAxis() {
    return OCCwrapJavaJNI.StepGeom_Axis1Placement_HasAxis(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_Axis1Placement_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Axis1Placement_get_type_descriptor(), true );
  }

  public static  StepGeom_Axis1Placement  DownCast( Standard_Transient  T) {
    return new StepGeom_Axis1Placement ( OCCwrapJavaJNI.StepGeom_Axis1Placement_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Axis1Placement_TypeOf(), true );
  }

}
