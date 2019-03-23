package opencascade;

public class StepShape_SolidModel extends StepGeom_GeometricRepresentationItem {
  StepShape_SolidModel(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a SolidModel
   */
  public StepShape_SolidModel() {
    this(OCCwrapJavaJNI.new_StepShape_SolidModel(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_SolidModel_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_SolidModel_get_type_descriptor(), true );
  }

  public static  StepShape_SolidModel  DownCast( Standard_Transient  T) {
    return new StepShape_SolidModel ( OCCwrapJavaJNI.StepShape_SolidModel_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_SolidModel_TypeOf(), true );
  }

}
