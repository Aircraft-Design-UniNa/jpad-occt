package opencascade;

public class StepGeom_BoundedSurface extends StepGeom_Surface {
  StepGeom_BoundedSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a BoundedSurface
   */
  public StepGeom_BoundedSurface() {
    this(OCCwrapJavaJNI.new_StepGeom_BoundedSurface(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_BoundedSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_BoundedSurface_get_type_descriptor(), true );
  }

  public static  StepGeom_BoundedSurface  DownCast( Standard_Transient  T) {
    return new StepGeom_BoundedSurface ( OCCwrapJavaJNI.StepGeom_BoundedSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_BoundedSurface_TypeOf(), true );
  }

}
