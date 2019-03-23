package opencascade;

public class StepGeom_SurfaceOfRevolution extends StepGeom_SweptSurface {
  StepGeom_SurfaceOfRevolution(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a SurfaceOfRevolution
   */
  public StepGeom_SurfaceOfRevolution() {
    this(OCCwrapJavaJNI.new_StepGeom_SurfaceOfRevolution(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Curve  aSweptCurve,  StepGeom_Axis1Placement  aAxisPosition) {
    OCCwrapJavaJNI.StepGeom_SurfaceOfRevolution_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_Curve.getCPtr(aSweptCurve) , aSweptCurve,  StepGeom_Axis1Placement.getCPtr(aAxisPosition) , aAxisPosition);
  }

  public void SetAxisPosition( StepGeom_Axis1Placement  aAxisPosition) {
    OCCwrapJavaJNI.StepGeom_SurfaceOfRevolution_SetAxisPosition(swigCPtr, this,  StepGeom_Axis1Placement.getCPtr(aAxisPosition) , aAxisPosition);
  }

  public  StepGeom_Axis1Placement  AxisPosition() {
    return new StepGeom_Axis1Placement ( OCCwrapJavaJNI.StepGeom_SurfaceOfRevolution_AxisPosition(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_SurfaceOfRevolution_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_SurfaceOfRevolution_get_type_descriptor(), true );
  }

  public static  StepGeom_SurfaceOfRevolution  DownCast( Standard_Transient  T) {
    return new StepGeom_SurfaceOfRevolution ( OCCwrapJavaJNI.StepGeom_SurfaceOfRevolution_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_SurfaceOfRevolution_TypeOf(), true );
  }

}
