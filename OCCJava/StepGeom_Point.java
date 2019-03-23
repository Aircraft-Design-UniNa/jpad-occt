package opencascade;

public class StepGeom_Point extends StepGeom_GeometricRepresentationItem {
  StepGeom_Point(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Point
   */
  public StepGeom_Point() {
    this(OCCwrapJavaJNI.new_StepGeom_Point(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_Point_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Point_get_type_descriptor(), true );
  }

  public static  StepGeom_Point  DownCast( Standard_Transient  T) {
    return new StepGeom_Point ( OCCwrapJavaJNI.StepGeom_Point_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Point_TypeOf(), true );
  }

}
