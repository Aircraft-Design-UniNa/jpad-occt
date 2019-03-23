package opencascade;

public class StepGeom_Circle extends StepGeom_Conic {
  StepGeom_Circle(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Circle
   */
  public StepGeom_Circle() {
    this(OCCwrapJavaJNI.new_StepGeom_Circle(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Axis2Placement  aPosition, double aRadius) {
    OCCwrapJavaJNI.StepGeom_Circle_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName, StepGeom_Axis2Placement.getCPtr(aPosition), aPosition, aRadius);
  }

  public void SetRadius(double aRadius) {
    OCCwrapJavaJNI.StepGeom_Circle_SetRadius(swigCPtr, this, aRadius);
  }

  public double Radius() {
    return OCCwrapJavaJNI.StepGeom_Circle_Radius(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_Circle_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Circle_get_type_descriptor(), true );
  }

  public static  StepGeom_Circle  DownCast( Standard_Transient  T) {
    return new StepGeom_Circle ( OCCwrapJavaJNI.StepGeom_Circle_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Circle_TypeOf(), true );
  }

}
