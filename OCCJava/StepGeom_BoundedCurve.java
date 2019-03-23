package opencascade;

public class StepGeom_BoundedCurve extends StepGeom_Curve {
  StepGeom_BoundedCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a BoundedCurve
   */
  public StepGeom_BoundedCurve() {
    this(OCCwrapJavaJNI.new_StepGeom_BoundedCurve(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_BoundedCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_BoundedCurve_get_type_descriptor(), true );
  }

  public static  StepGeom_BoundedCurve  DownCast( Standard_Transient  T) {
    return new StepGeom_BoundedCurve ( OCCwrapJavaJNI.StepGeom_BoundedCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_BoundedCurve_TypeOf(), true );
  }

}
