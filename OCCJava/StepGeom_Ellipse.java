package opencascade;

public class StepGeom_Ellipse extends StepGeom_Conic {
  StepGeom_Ellipse(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Ellipse
   */
  public StepGeom_Ellipse() {
    this(OCCwrapJavaJNI.new_StepGeom_Ellipse(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Axis2Placement  aPosition, double aSemiAxis1, double aSemiAxis2) {
    OCCwrapJavaJNI.StepGeom_Ellipse_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName, StepGeom_Axis2Placement.getCPtr(aPosition), aPosition, aSemiAxis1, aSemiAxis2);
  }

  public void SetSemiAxis1(double aSemiAxis1) {
    OCCwrapJavaJNI.StepGeom_Ellipse_SetSemiAxis1(swigCPtr, this, aSemiAxis1);
  }

  public double SemiAxis1() {
    return OCCwrapJavaJNI.StepGeom_Ellipse_SemiAxis1(swigCPtr, this);
  }

  public void SetSemiAxis2(double aSemiAxis2) {
    OCCwrapJavaJNI.StepGeom_Ellipse_SetSemiAxis2(swigCPtr, this, aSemiAxis2);
  }

  public double SemiAxis2() {
    return OCCwrapJavaJNI.StepGeom_Ellipse_SemiAxis2(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_Ellipse_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Ellipse_get_type_descriptor(), true );
  }

  public static  StepGeom_Ellipse  DownCast( Standard_Transient  T) {
    return new StepGeom_Ellipse ( OCCwrapJavaJNI.StepGeom_Ellipse_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Ellipse_TypeOf(), true );
  }

}
