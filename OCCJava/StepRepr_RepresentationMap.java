package opencascade;

public class StepRepr_RepresentationMap extends Standard_Transient {
  StepRepr_RepresentationMap(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a RepresentationMap
   */
  public StepRepr_RepresentationMap() {
    this(OCCwrapJavaJNI.new_StepRepr_RepresentationMap(), true);
  }

  public void Init( StepRepr_RepresentationItem  aMappingOrigin,  StepRepr_Representation  aMappedRepresentation) {
    OCCwrapJavaJNI.StepRepr_RepresentationMap_Init(swigCPtr, this,  StepRepr_RepresentationItem.getCPtr(aMappingOrigin) , aMappingOrigin,  StepRepr_Representation.getCPtr(aMappedRepresentation) , aMappedRepresentation);
  }

  public void SetMappingOrigin( StepRepr_RepresentationItem  aMappingOrigin) {
    OCCwrapJavaJNI.StepRepr_RepresentationMap_SetMappingOrigin(swigCPtr, this,  StepRepr_RepresentationItem.getCPtr(aMappingOrigin) , aMappingOrigin);
  }

  public  StepRepr_RepresentationItem  MappingOrigin() {
    return new StepRepr_RepresentationItem ( OCCwrapJavaJNI.StepRepr_RepresentationMap_MappingOrigin(swigCPtr, this), true );
  }

  public void SetMappedRepresentation( StepRepr_Representation  aMappedRepresentation) {
    OCCwrapJavaJNI.StepRepr_RepresentationMap_SetMappedRepresentation(swigCPtr, this,  StepRepr_Representation.getCPtr(aMappedRepresentation) , aMappedRepresentation);
  }

  public  StepRepr_Representation  MappedRepresentation() {
    return new StepRepr_Representation ( OCCwrapJavaJNI.StepRepr_RepresentationMap_MappedRepresentation(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepRepr_RepresentationMap_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepRepr_RepresentationMap_get_type_descriptor(), true );
  }

  public static  StepRepr_RepresentationMap  DownCast( Standard_Transient  T) {
    return new StepRepr_RepresentationMap ( OCCwrapJavaJNI.StepRepr_RepresentationMap_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepRepr_RepresentationMap_TypeOf(), true );
  }

}
