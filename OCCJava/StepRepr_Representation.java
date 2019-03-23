package opencascade;

public class StepRepr_Representation extends Standard_Transient {
  StepRepr_Representation(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Representation
   */
  public StepRepr_Representation() {
    this(OCCwrapJavaJNI.new_StepRepr_Representation(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepRepr_HArray1OfRepresentationItem  aItems,  StepRepr_RepresentationContext  aContextOfItems) {
    OCCwrapJavaJNI.StepRepr_Representation_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepRepr_HArray1OfRepresentationItem.getCPtr(aItems) , aItems,  StepRepr_RepresentationContext.getCPtr(aContextOfItems) , aContextOfItems);
  }

  public void SetName( TCollection_HAsciiString  aName) {
    OCCwrapJavaJNI.StepRepr_Representation_SetName(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName);
  }

  public  TCollection_HAsciiString  Name() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.StepRepr_Representation_Name(swigCPtr, this), true );
  }

  public void SetItems( StepRepr_HArray1OfRepresentationItem  aItems) {
    OCCwrapJavaJNI.StepRepr_Representation_SetItems(swigCPtr, this,  StepRepr_HArray1OfRepresentationItem.getCPtr(aItems) , aItems);
  }

  public  StepRepr_HArray1OfRepresentationItem  Items() {
    return new StepRepr_HArray1OfRepresentationItem ( OCCwrapJavaJNI.StepRepr_Representation_Items(swigCPtr, this), true );
  }

  public  StepRepr_RepresentationItem  ItemsValue(int num) {
    return new StepRepr_RepresentationItem ( OCCwrapJavaJNI.StepRepr_Representation_ItemsValue(swigCPtr, this, num), true );
  }

  public int NbItems() {
    return OCCwrapJavaJNI.StepRepr_Representation_NbItems(swigCPtr, this);
  }

  public void SetContextOfItems( StepRepr_RepresentationContext  aContextOfItems) {
    OCCwrapJavaJNI.StepRepr_Representation_SetContextOfItems(swigCPtr, this,  StepRepr_RepresentationContext.getCPtr(aContextOfItems) , aContextOfItems);
  }

  public  StepRepr_RepresentationContext  ContextOfItems() {
    return new StepRepr_RepresentationContext ( OCCwrapJavaJNI.StepRepr_Representation_ContextOfItems(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepRepr_Representation_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepRepr_Representation_get_type_descriptor(), true );
  }

  public static  StepRepr_Representation  DownCast( Standard_Transient  T) {
    return new StepRepr_Representation ( OCCwrapJavaJNI.StepRepr_Representation_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepRepr_Representation_TypeOf(), true );
  }

}
