package opencascade;

public class StepGeom_Surface extends StepGeom_GeometricRepresentationItem {
  StepGeom_Surface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Surface
   */
  public StepGeom_Surface() {
    this(OCCwrapJavaJNI.new_StepGeom_Surface(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_Surface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Surface_get_type_descriptor(), true );
  }

  public static  StepGeom_Surface  DownCast( Standard_Transient  T) {
    return new StepGeom_Surface ( OCCwrapJavaJNI.StepGeom_Surface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Surface_TypeOf(), true );
  }

}
