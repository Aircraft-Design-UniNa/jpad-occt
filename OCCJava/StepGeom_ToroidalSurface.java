package opencascade;

public class StepGeom_ToroidalSurface extends StepGeom_ElementarySurface {
  StepGeom_ToroidalSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a ToroidalSurface
   */
  public StepGeom_ToroidalSurface() {
    this(OCCwrapJavaJNI.new_StepGeom_ToroidalSurface(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Axis2Placement3d  aPosition, double aMajorRadius, double aMinorRadius) {
    OCCwrapJavaJNI.StepGeom_ToroidalSurface_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_Axis2Placement3d.getCPtr(aPosition) , aPosition, aMajorRadius, aMinorRadius);
  }

  public void SetMajorRadius(double aMajorRadius) {
    OCCwrapJavaJNI.StepGeom_ToroidalSurface_SetMajorRadius(swigCPtr, this, aMajorRadius);
  }

  public double MajorRadius() {
    return OCCwrapJavaJNI.StepGeom_ToroidalSurface_MajorRadius(swigCPtr, this);
  }

  public void SetMinorRadius(double aMinorRadius) {
    OCCwrapJavaJNI.StepGeom_ToroidalSurface_SetMinorRadius(swigCPtr, this, aMinorRadius);
  }

  public double MinorRadius() {
    return OCCwrapJavaJNI.StepGeom_ToroidalSurface_MinorRadius(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_ToroidalSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_ToroidalSurface_get_type_descriptor(), true );
  }

  public static  StepGeom_ToroidalSurface  DownCast( Standard_Transient  T) {
    return new StepGeom_ToroidalSurface ( OCCwrapJavaJNI.StepGeom_ToroidalSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_ToroidalSurface_TypeOf(), true );
  }

}
