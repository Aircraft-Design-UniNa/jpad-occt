package opencascade;

public class StepGeom_BoundaryCurve extends StepGeom_CompositeCurveOnSurface {
  StepGeom_BoundaryCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a BoundaryCurve
   */
  public StepGeom_BoundaryCurve() {
    this(OCCwrapJavaJNI.new_StepGeom_BoundaryCurve(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_BoundaryCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_BoundaryCurve_get_type_descriptor(), true );
  }

  public static  StepGeom_BoundaryCurve  DownCast( Standard_Transient  T) {
    return new StepGeom_BoundaryCurve ( OCCwrapJavaJNI.StepGeom_BoundaryCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_BoundaryCurve_TypeOf(), true );
  }

}
