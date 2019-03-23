package opencascade;

public class StepGeom_Hyperbola extends StepGeom_Conic {
  StepGeom_Hyperbola(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Hyperbola
   */
  public StepGeom_Hyperbola() {
    this(OCCwrapJavaJNI.new_StepGeom_Hyperbola(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Axis2Placement  aPosition, double aSemiAxis, double aSemiImagAxis) {
    OCCwrapJavaJNI.StepGeom_Hyperbola_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName, StepGeom_Axis2Placement.getCPtr(aPosition), aPosition, aSemiAxis, aSemiImagAxis);
  }

  public void SetSemiAxis(double aSemiAxis) {
    OCCwrapJavaJNI.StepGeom_Hyperbola_SetSemiAxis(swigCPtr, this, aSemiAxis);
  }

  public double SemiAxis() {
    return OCCwrapJavaJNI.StepGeom_Hyperbola_SemiAxis(swigCPtr, this);
  }

  public void SetSemiImagAxis(double aSemiImagAxis) {
    OCCwrapJavaJNI.StepGeom_Hyperbola_SetSemiImagAxis(swigCPtr, this, aSemiImagAxis);
  }

  public double SemiImagAxis() {
    return OCCwrapJavaJNI.StepGeom_Hyperbola_SemiImagAxis(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_Hyperbola_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Hyperbola_get_type_descriptor(), true );
  }

  public static  StepGeom_Hyperbola  DownCast( Standard_Transient  T) {
    return new StepGeom_Hyperbola ( OCCwrapJavaJNI.StepGeom_Hyperbola_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Hyperbola_TypeOf(), true );
  }

}
