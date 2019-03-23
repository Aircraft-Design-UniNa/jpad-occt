package opencascade;

public class StepGeom_Placement extends StepGeom_GeometricRepresentationItem {
  StepGeom_Placement(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Placement
   */
  public StepGeom_Placement() {
    this(OCCwrapJavaJNI.new_StepGeom_Placement(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_CartesianPoint  aLocation) {
    OCCwrapJavaJNI.StepGeom_Placement_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_CartesianPoint.getCPtr(aLocation) , aLocation);
  }

  public void SetLocation( StepGeom_CartesianPoint  aLocation) {
    OCCwrapJavaJNI.StepGeom_Placement_SetLocation(swigCPtr, this,  StepGeom_CartesianPoint.getCPtr(aLocation) , aLocation);
  }

  public  StepGeom_CartesianPoint  Location() {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_Placement_Location(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_Placement_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Placement_get_type_descriptor(), true );
  }

  public static  StepGeom_Placement  DownCast( Standard_Transient  T) {
    return new StepGeom_Placement ( OCCwrapJavaJNI.StepGeom_Placement_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Placement_TypeOf(), true );
  }

}
