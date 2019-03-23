package opencascade;

public class StepGeom_CompositeCurveOnSurface extends StepGeom_CompositeCurve {
  StepGeom_CompositeCurveOnSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a CompositeCurveOnSurface
   */
  public StepGeom_CompositeCurveOnSurface() {
    this(OCCwrapJavaJNI.new_StepGeom_CompositeCurveOnSurface(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_CompositeCurveOnSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_CompositeCurveOnSurface_get_type_descriptor(), true );
  }

  public static  StepGeom_CompositeCurveOnSurface  DownCast( Standard_Transient  T) {
    return new StepGeom_CompositeCurveOnSurface ( OCCwrapJavaJNI.StepGeom_CompositeCurveOnSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_CompositeCurveOnSurface_TypeOf(), true );
  }

}
