package opencascade;

public class StepShape_VertexLoop extends StepShape_Loop {
  StepShape_VertexLoop(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a VertexLoop
   */
  public StepShape_VertexLoop() {
    this(OCCwrapJavaJNI.new_StepShape_VertexLoop(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepShape_Vertex  aLoopVertex) {
    OCCwrapJavaJNI.StepShape_VertexLoop_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepShape_Vertex.getCPtr(aLoopVertex) , aLoopVertex);
  }

  public void SetLoopVertex( StepShape_Vertex  aLoopVertex) {
    OCCwrapJavaJNI.StepShape_VertexLoop_SetLoopVertex(swigCPtr, this,  StepShape_Vertex.getCPtr(aLoopVertex) , aLoopVertex);
  }

  public  StepShape_Vertex  LoopVertex() {
    return new StepShape_Vertex ( OCCwrapJavaJNI.StepShape_VertexLoop_LoopVertex(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_VertexLoop_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_VertexLoop_get_type_descriptor(), true );
  }

  public static  StepShape_VertexLoop  DownCast( Standard_Transient  T) {
    return new StepShape_VertexLoop ( OCCwrapJavaJNI.StepShape_VertexLoop_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_VertexLoop_TypeOf(), true );
  }

}
