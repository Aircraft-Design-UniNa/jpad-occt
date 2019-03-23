package opencascade;

public class StepRepr_MappedItem extends StepRepr_RepresentationItem {
  StepRepr_MappedItem(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a MappedItem
   */
  public StepRepr_MappedItem() {
    this(OCCwrapJavaJNI.new_StepRepr_MappedItem(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepRepr_RepresentationMap  aMappingSource,  StepRepr_RepresentationItem  aMappingTarget) {
    OCCwrapJavaJNI.StepRepr_MappedItem_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepRepr_RepresentationMap.getCPtr(aMappingSource) , aMappingSource,  StepRepr_RepresentationItem.getCPtr(aMappingTarget) , aMappingTarget);
  }

  public void SetMappingSource( StepRepr_RepresentationMap  aMappingSource) {
    OCCwrapJavaJNI.StepRepr_MappedItem_SetMappingSource(swigCPtr, this,  StepRepr_RepresentationMap.getCPtr(aMappingSource) , aMappingSource);
  }

  public  StepRepr_RepresentationMap  MappingSource() {
    return new StepRepr_RepresentationMap ( OCCwrapJavaJNI.StepRepr_MappedItem_MappingSource(swigCPtr, this), true );
  }

  public void SetMappingTarget( StepRepr_RepresentationItem  aMappingTarget) {
    OCCwrapJavaJNI.StepRepr_MappedItem_SetMappingTarget(swigCPtr, this,  StepRepr_RepresentationItem.getCPtr(aMappingTarget) , aMappingTarget);
  }

  public  StepRepr_RepresentationItem  MappingTarget() {
    return new StepRepr_RepresentationItem ( OCCwrapJavaJNI.StepRepr_MappedItem_MappingTarget(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepRepr_MappedItem_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepRepr_MappedItem_get_type_descriptor(), true );
  }

  public static  StepRepr_MappedItem  DownCast( Standard_Transient  T) {
    return new StepRepr_MappedItem ( OCCwrapJavaJNI.StepRepr_MappedItem_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepRepr_MappedItem_TypeOf(), true );
  }

}
