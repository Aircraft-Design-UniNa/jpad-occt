package opencascade;

public class StepGeom_Parabola extends StepGeom_Conic {
  StepGeom_Parabola(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Parabola
   */
  public StepGeom_Parabola() {
    this(OCCwrapJavaJNI.new_StepGeom_Parabola(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Axis2Placement  aPosition, double aFocalDist) {
    OCCwrapJavaJNI.StepGeom_Parabola_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName, StepGeom_Axis2Placement.getCPtr(aPosition), aPosition, aFocalDist);
  }

  public void SetFocalDist(double aFocalDist) {
    OCCwrapJavaJNI.StepGeom_Parabola_SetFocalDist(swigCPtr, this, aFocalDist);
  }

  public double FocalDist() {
    return OCCwrapJavaJNI.StepGeom_Parabola_FocalDist(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_Parabola_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Parabola_get_type_descriptor(), true );
  }

  public static  StepGeom_Parabola  DownCast( Standard_Transient  T) {
    return new StepGeom_Parabola ( OCCwrapJavaJNI.StepGeom_Parabola_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Parabola_TypeOf(), true );
  }

}
