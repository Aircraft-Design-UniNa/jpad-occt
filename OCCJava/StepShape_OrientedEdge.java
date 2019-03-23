package opencascade;

public class StepShape_OrientedEdge extends StepShape_Edge {
  StepShape_OrientedEdge(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a OrientedEdge
   */
  public StepShape_OrientedEdge() {
    this(OCCwrapJavaJNI.new_StepShape_OrientedEdge(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepShape_Edge  aEdgeElement, long aOrientation) {
    OCCwrapJavaJNI.StepShape_OrientedEdge_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepShape_Edge.getCPtr(aEdgeElement) , aEdgeElement, aOrientation);
  }

  public void SetEdgeElement( StepShape_Edge  aEdgeElement) {
    OCCwrapJavaJNI.StepShape_OrientedEdge_SetEdgeElement(swigCPtr, this,  StepShape_Edge.getCPtr(aEdgeElement) , aEdgeElement);
  }

  public  StepShape_Edge  EdgeElement() {
    return new StepShape_Edge ( OCCwrapJavaJNI.StepShape_OrientedEdge_EdgeElement(swigCPtr, this), true );
  }

  public void SetOrientation(long aOrientation) {
    OCCwrapJavaJNI.StepShape_OrientedEdge_SetOrientation(swigCPtr, this, aOrientation);
  }

  public long Orientation() {
    return OCCwrapJavaJNI.StepShape_OrientedEdge_Orientation(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_OrientedEdge_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_OrientedEdge_get_type_descriptor(), true );
  }

  public static  StepShape_OrientedEdge  DownCast( Standard_Transient  T) {
    return new StepShape_OrientedEdge ( OCCwrapJavaJNI.StepShape_OrientedEdge_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_OrientedEdge_TypeOf(), true );
  }

}
