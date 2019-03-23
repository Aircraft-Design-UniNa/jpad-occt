package opencascade;

public class StepRepr_RepresentationItem extends Standard_Transient {
  StepRepr_RepresentationItem(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a RepresentationItem
   */
  public StepRepr_RepresentationItem() {
    this(OCCwrapJavaJNI.new_StepRepr_RepresentationItem(), true);
  }

  public void Init( TCollection_HAsciiString  aName) {
    OCCwrapJavaJNI.StepRepr_RepresentationItem_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName);
  }

  public void SetName( TCollection_HAsciiString  aName) {
    OCCwrapJavaJNI.StepRepr_RepresentationItem_SetName(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName);
  }

  public  TCollection_HAsciiString  Name() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.StepRepr_RepresentationItem_Name(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepRepr_RepresentationItem_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepRepr_RepresentationItem_get_type_descriptor(), true );
  }

  public static  StepRepr_RepresentationItem  DownCast( Standard_Transient  T) {
    return new StepRepr_RepresentationItem ( OCCwrapJavaJNI.StepRepr_RepresentationItem_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepRepr_RepresentationItem_TypeOf(), true );
  }

}
