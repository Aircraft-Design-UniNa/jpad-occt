package opencascade;

public class StepRepr_RepresentationContext extends Standard_Transient {
  StepRepr_RepresentationContext(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a RepresentationContext
   */
  public StepRepr_RepresentationContext() {
    this(OCCwrapJavaJNI.new_StepRepr_RepresentationContext(), true);
  }

  public void Init( TCollection_HAsciiString  aContextIdentifier,  TCollection_HAsciiString  aContextType) {
    OCCwrapJavaJNI.StepRepr_RepresentationContext_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aContextIdentifier) , aContextIdentifier,  TCollection_HAsciiString.getCPtr(aContextType) , aContextType);
  }

  public void SetContextIdentifier( TCollection_HAsciiString  aContextIdentifier) {
    OCCwrapJavaJNI.StepRepr_RepresentationContext_SetContextIdentifier(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aContextIdentifier) , aContextIdentifier);
  }

  public  TCollection_HAsciiString  ContextIdentifier() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.StepRepr_RepresentationContext_ContextIdentifier(swigCPtr, this), true );
  }

  public void SetContextType( TCollection_HAsciiString  aContextType) {
    OCCwrapJavaJNI.StepRepr_RepresentationContext_SetContextType(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aContextType) , aContextType);
  }

  public  TCollection_HAsciiString  ContextType() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.StepRepr_RepresentationContext_ContextType(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepRepr_RepresentationContext_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepRepr_RepresentationContext_get_type_descriptor(), true );
  }

  public static  StepRepr_RepresentationContext  DownCast( Standard_Transient  T) {
    return new StepRepr_RepresentationContext ( OCCwrapJavaJNI.StepRepr_RepresentationContext_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepRepr_RepresentationContext_TypeOf(), true );
  }

}
