package opencascade;

/**
 *  Representation of STEP entity EdgeBasedWireframeModel
 */
public class StepShape_EdgeBasedWireframeModel extends StepGeom_GeometricRepresentationItem {
  StepShape_EdgeBasedWireframeModel(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor
   */
  public StepShape_EdgeBasedWireframeModel() {
    this(OCCwrapJavaJNI.new_StepShape_EdgeBasedWireframeModel(), true);
  }

  /**
   *  Initialize all fields (own and inherited)
   */
  public void Init( TCollection_HAsciiString  aRepresentationItem_Name,  StepShape_HArray1OfConnectedEdgeSet  aEbwmBoundary) {
    OCCwrapJavaJNI.StepShape_EdgeBasedWireframeModel_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aRepresentationItem_Name) , aRepresentationItem_Name,  StepShape_HArray1OfConnectedEdgeSet.getCPtr(aEbwmBoundary) , aEbwmBoundary);
  }

  public  StepShape_HArray1OfConnectedEdgeSet  EbwmBoundary() {
    return new StepShape_HArray1OfConnectedEdgeSet ( OCCwrapJavaJNI.StepShape_EdgeBasedWireframeModel_EbwmBoundary(swigCPtr, this), true );
  }

  /**
   *  Set field EbwmBoundary
   */
  public void SetEbwmBoundary( StepShape_HArray1OfConnectedEdgeSet  EbwmBoundary) {
    OCCwrapJavaJNI.StepShape_EdgeBasedWireframeModel_SetEbwmBoundary(swigCPtr, this,  StepShape_HArray1OfConnectedEdgeSet.getCPtr(EbwmBoundary) , EbwmBoundary);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_EdgeBasedWireframeModel_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_EdgeBasedWireframeModel_get_type_descriptor(), true );
  }

  public static  StepShape_EdgeBasedWireframeModel  DownCast( Standard_Transient  T) {
    return new StepShape_EdgeBasedWireframeModel ( OCCwrapJavaJNI.StepShape_EdgeBasedWireframeModel_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_EdgeBasedWireframeModel_TypeOf(), true );
  }

}
