package opencascade;

public class StepRepr_DefinitionalRepresentation extends StepRepr_Representation {
  StepRepr_DefinitionalRepresentation(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a DefinitionalRepresentation
   */
  public StepRepr_DefinitionalRepresentation() {
    this(OCCwrapJavaJNI.new_StepRepr_DefinitionalRepresentation(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepRepr_DefinitionalRepresentation_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepRepr_DefinitionalRepresentation_get_type_descriptor(), true );
  }

  public static  StepRepr_DefinitionalRepresentation  DownCast( Standard_Transient  T) {
    return new StepRepr_DefinitionalRepresentation ( OCCwrapJavaJNI.StepRepr_DefinitionalRepresentation_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepRepr_DefinitionalRepresentation_TypeOf(), true );
  }

}
