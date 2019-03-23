package opencascade;

public class StepShape_FacetedBrep extends StepShape_ManifoldSolidBrep {
  StepShape_FacetedBrep(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a FacetedBrep
   */
  public StepShape_FacetedBrep() {
    this(OCCwrapJavaJNI.new_StepShape_FacetedBrep(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_FacetedBrep_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_FacetedBrep_get_type_descriptor(), true );
  }

  public static  StepShape_FacetedBrep  DownCast( Standard_Transient  T) {
    return new StepShape_FacetedBrep ( OCCwrapJavaJNI.StepShape_FacetedBrep_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_FacetedBrep_TypeOf(), true );
  }

}
