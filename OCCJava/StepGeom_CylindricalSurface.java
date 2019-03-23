package opencascade;

public class StepGeom_CylindricalSurface extends StepGeom_ElementarySurface {
  StepGeom_CylindricalSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a CylindricalSurface
   */
  public StepGeom_CylindricalSurface() {
    this(OCCwrapJavaJNI.new_StepGeom_CylindricalSurface(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Axis2Placement3d  aPosition, double aRadius) {
    OCCwrapJavaJNI.StepGeom_CylindricalSurface_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_Axis2Placement3d.getCPtr(aPosition) , aPosition, aRadius);
  }

  public void SetRadius(double aRadius) {
    OCCwrapJavaJNI.StepGeom_CylindricalSurface_SetRadius(swigCPtr, this, aRadius);
  }

  public double Radius() {
    return OCCwrapJavaJNI.StepGeom_CylindricalSurface_Radius(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_CylindricalSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_CylindricalSurface_get_type_descriptor(), true );
  }

  public static  StepGeom_CylindricalSurface  DownCast( Standard_Transient  T) {
    return new StepGeom_CylindricalSurface ( OCCwrapJavaJNI.StepGeom_CylindricalSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_CylindricalSurface_TypeOf(), true );
  }

}
