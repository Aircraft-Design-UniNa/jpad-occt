package opencascade;

public class StepShape_EdgeLoop extends StepShape_Loop {
  StepShape_EdgeLoop(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a EdgeLoop
   */
  public StepShape_EdgeLoop() {
    this(OCCwrapJavaJNI.new_StepShape_EdgeLoop(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepShape_HArray1OfOrientedEdge  aEdgeList) {
    OCCwrapJavaJNI.StepShape_EdgeLoop_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepShape_HArray1OfOrientedEdge.getCPtr(aEdgeList) , aEdgeList);
  }

  public void SetEdgeList( StepShape_HArray1OfOrientedEdge  aEdgeList) {
    OCCwrapJavaJNI.StepShape_EdgeLoop_SetEdgeList(swigCPtr, this,  StepShape_HArray1OfOrientedEdge.getCPtr(aEdgeList) , aEdgeList);
  }

  public  StepShape_HArray1OfOrientedEdge  EdgeList() {
    return new StepShape_HArray1OfOrientedEdge ( OCCwrapJavaJNI.StepShape_EdgeLoop_EdgeList(swigCPtr, this), true );
  }

  public  StepShape_OrientedEdge  EdgeListValue(int num) {
    return new StepShape_OrientedEdge ( OCCwrapJavaJNI.StepShape_EdgeLoop_EdgeListValue(swigCPtr, this, num), true );
  }

  public int NbEdgeList() {
    return OCCwrapJavaJNI.StepShape_EdgeLoop_NbEdgeList(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_EdgeLoop_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_EdgeLoop_get_type_descriptor(), true );
  }

  public static  StepShape_EdgeLoop  DownCast( Standard_Transient  T) {
    return new StepShape_EdgeLoop ( OCCwrapJavaJNI.StepShape_EdgeLoop_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_EdgeLoop_TypeOf(), true );
  }

}
