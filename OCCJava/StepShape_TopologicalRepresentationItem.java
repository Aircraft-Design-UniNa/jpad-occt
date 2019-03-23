package opencascade;

public class StepShape_TopologicalRepresentationItem extends StepRepr_RepresentationItem {
  StepShape_TopologicalRepresentationItem(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a TopologicalRepresentationItem
   */
  public StepShape_TopologicalRepresentationItem() {
    this(OCCwrapJavaJNI.new_StepShape_TopologicalRepresentationItem(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_TopologicalRepresentationItem_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_TopologicalRepresentationItem_get_type_descriptor(), true );
  }

  public static  StepShape_TopologicalRepresentationItem  DownCast( Standard_Transient  T) {
    return new StepShape_TopologicalRepresentationItem ( OCCwrapJavaJNI.StepShape_TopologicalRepresentationItem_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_TopologicalRepresentationItem_TypeOf(), true );
  }

}
