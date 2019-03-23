package opencascade;

public class StepShape_Edge extends StepShape_TopologicalRepresentationItem {
  StepShape_Edge(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Edge
   */
  public StepShape_Edge() {
    this(OCCwrapJavaJNI.new_StepShape_Edge(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepShape_Vertex  aEdgeStart,  StepShape_Vertex  aEdgeEnd) {
    OCCwrapJavaJNI.StepShape_Edge_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepShape_Vertex.getCPtr(aEdgeStart) , aEdgeStart,  StepShape_Vertex.getCPtr(aEdgeEnd) , aEdgeEnd);
  }

  public void SetEdgeStart( StepShape_Vertex  aEdgeStart) {
    OCCwrapJavaJNI.StepShape_Edge_SetEdgeStart(swigCPtr, this,  StepShape_Vertex.getCPtr(aEdgeStart) , aEdgeStart);
  }

  public  StepShape_Vertex  EdgeStart() {
    return new StepShape_Vertex ( OCCwrapJavaJNI.StepShape_Edge_EdgeStart(swigCPtr, this), true );
  }

  public void SetEdgeEnd( StepShape_Vertex  aEdgeEnd) {
    OCCwrapJavaJNI.StepShape_Edge_SetEdgeEnd(swigCPtr, this,  StepShape_Vertex.getCPtr(aEdgeEnd) , aEdgeEnd);
  }

  public  StepShape_Vertex  EdgeEnd() {
    return new StepShape_Vertex ( OCCwrapJavaJNI.StepShape_Edge_EdgeEnd(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_Edge_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_Edge_get_type_descriptor(), true );
  }

  public static  StepShape_Edge  DownCast( Standard_Transient  T) {
    return new StepShape_Edge ( OCCwrapJavaJNI.StepShape_Edge_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_Edge_TypeOf(), true );
  }

}
