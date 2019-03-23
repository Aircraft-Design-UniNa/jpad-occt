package opencascade;

public class StepGeom_GeometricRepresentationItem extends StepRepr_RepresentationItem {
  StepGeom_GeometricRepresentationItem(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a GeometricRepresentationItem
   */
  public StepGeom_GeometricRepresentationItem() {
    this(OCCwrapJavaJNI.new_StepGeom_GeometricRepresentationItem(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_GeometricRepresentationItem_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_GeometricRepresentationItem_get_type_descriptor(), true );
  }

  public static  StepGeom_GeometricRepresentationItem  DownCast( Standard_Transient  T) {
    return new StepGeom_GeometricRepresentationItem ( OCCwrapJavaJNI.StepGeom_GeometricRepresentationItem_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_GeometricRepresentationItem_TypeOf(), true );
  }

}
