package opencascade;

public class StepGeom_Plane extends StepGeom_ElementarySurface {
  StepGeom_Plane(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Plane
   */
  public StepGeom_Plane() {
    this(OCCwrapJavaJNI.new_StepGeom_Plane(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_Plane_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Plane_get_type_descriptor(), true );
  }

  public static  StepGeom_Plane  DownCast( Standard_Transient  T) {
    return new StepGeom_Plane ( OCCwrapJavaJNI.StepGeom_Plane_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Plane_TypeOf(), true );
  }

}
