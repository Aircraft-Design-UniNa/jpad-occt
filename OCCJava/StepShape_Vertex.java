package opencascade;

public class StepShape_Vertex extends StepShape_TopologicalRepresentationItem {
  StepShape_Vertex(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Vertex
   */
  public StepShape_Vertex() {
    this(OCCwrapJavaJNI.new_StepShape_Vertex(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_Vertex_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_Vertex_get_type_descriptor(), true );
  }

  public static  StepShape_Vertex  DownCast( Standard_Transient  T) {
    return new StepShape_Vertex ( OCCwrapJavaJNI.StepShape_Vertex_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_Vertex_TypeOf(), true );
  }

}
