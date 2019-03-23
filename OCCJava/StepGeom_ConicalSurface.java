package opencascade;

public class StepGeom_ConicalSurface extends StepGeom_ElementarySurface {
  StepGeom_ConicalSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a ConicalSurface
   */
  public StepGeom_ConicalSurface() {
    this(OCCwrapJavaJNI.new_StepGeom_ConicalSurface(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Axis2Placement3d  aPosition, double aRadius, double aSemiAngle) {
    OCCwrapJavaJNI.StepGeom_ConicalSurface_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_Axis2Placement3d.getCPtr(aPosition) , aPosition, aRadius, aSemiAngle);
  }

  public void SetRadius(double aRadius) {
    OCCwrapJavaJNI.StepGeom_ConicalSurface_SetRadius(swigCPtr, this, aRadius);
  }

  public double Radius() {
    return OCCwrapJavaJNI.StepGeom_ConicalSurface_Radius(swigCPtr, this);
  }

  public void SetSemiAngle(double aSemiAngle) {
    OCCwrapJavaJNI.StepGeom_ConicalSurface_SetSemiAngle(swigCPtr, this, aSemiAngle);
  }

  public double SemiAngle() {
    return OCCwrapJavaJNI.StepGeom_ConicalSurface_SemiAngle(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_ConicalSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_ConicalSurface_get_type_descriptor(), true );
  }

  public static  StepGeom_ConicalSurface  DownCast( Standard_Transient  T) {
    return new StepGeom_ConicalSurface ( OCCwrapJavaJNI.StepGeom_ConicalSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_ConicalSurface_TypeOf(), true );
  }

}
