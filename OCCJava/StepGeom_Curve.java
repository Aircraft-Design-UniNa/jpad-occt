package opencascade;

public class StepGeom_Curve extends StepGeom_GeometricRepresentationItem {
  StepGeom_Curve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Curve
   */
  public StepGeom_Curve() {
    this(OCCwrapJavaJNI.new_StepGeom_Curve(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_Curve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Curve_get_type_descriptor(), true );
  }

  public static  StepGeom_Curve  DownCast( Standard_Transient  T) {
    return new StepGeom_Curve ( OCCwrapJavaJNI.StepGeom_Curve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Curve_TypeOf(), true );
  }

}
