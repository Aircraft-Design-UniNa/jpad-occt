package opencascade;

public class StepGeom_SphericalSurface extends StepGeom_ElementarySurface {
  StepGeom_SphericalSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a SphericalSurface
   */
  public StepGeom_SphericalSurface() {
    this(OCCwrapJavaJNI.new_StepGeom_SphericalSurface(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Axis2Placement3d  aPosition, double aRadius) {
    OCCwrapJavaJNI.StepGeom_SphericalSurface_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_Axis2Placement3d.getCPtr(aPosition) , aPosition, aRadius);
  }

  public void SetRadius(double aRadius) {
    OCCwrapJavaJNI.StepGeom_SphericalSurface_SetRadius(swigCPtr, this, aRadius);
  }

  public double Radius() {
    return OCCwrapJavaJNI.StepGeom_SphericalSurface_Radius(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_SphericalSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_SphericalSurface_get_type_descriptor(), true );
  }

  public static  StepGeom_SphericalSurface  DownCast( Standard_Transient  T) {
    return new StepGeom_SphericalSurface ( OCCwrapJavaJNI.StepGeom_SphericalSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_SphericalSurface_TypeOf(), true );
  }

}
