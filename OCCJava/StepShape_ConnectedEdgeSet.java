package opencascade;

/**
 *  Representation of STEP entity ConnectedEdgeSet
 */
public class StepShape_ConnectedEdgeSet extends StepShape_TopologicalRepresentationItem {
  StepShape_ConnectedEdgeSet(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor
   */
  public StepShape_ConnectedEdgeSet() {
    this(OCCwrapJavaJNI.new_StepShape_ConnectedEdgeSet(), true);
  }

  /**
   *  Initialize all fields (own and inherited)
   */
  public void Init( TCollection_HAsciiString  aRepresentationItem_Name,  StepShape_HArray1OfEdge  aCesEdges) {
    OCCwrapJavaJNI.StepShape_ConnectedEdgeSet_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aRepresentationItem_Name) , aRepresentationItem_Name,  StepShape_HArray1OfEdge.getCPtr(aCesEdges) , aCesEdges);
  }

  public  StepShape_HArray1OfEdge  CesEdges() {
    return new StepShape_HArray1OfEdge ( OCCwrapJavaJNI.StepShape_ConnectedEdgeSet_CesEdges(swigCPtr, this), true );
  }

  /**
   *  Set field CesEdges
   */
  public void SetCesEdges( StepShape_HArray1OfEdge  CesEdges) {
    OCCwrapJavaJNI.StepShape_ConnectedEdgeSet_SetCesEdges(swigCPtr, this,  StepShape_HArray1OfEdge.getCPtr(CesEdges) , CesEdges);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_ConnectedEdgeSet_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_ConnectedEdgeSet_get_type_descriptor(), true );
  }

  public static  StepShape_ConnectedEdgeSet  DownCast( Standard_Transient  T) {
    return new StepShape_ConnectedEdgeSet ( OCCwrapJavaJNI.StepShape_ConnectedEdgeSet_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_ConnectedEdgeSet_TypeOf(), true );
  }

}
