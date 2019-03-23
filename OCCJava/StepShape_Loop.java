package opencascade;

public class StepShape_Loop extends StepShape_TopologicalRepresentationItem {
  StepShape_Loop(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Loop
   */
  public StepShape_Loop() {
    this(OCCwrapJavaJNI.new_StepShape_Loop(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_Loop_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_Loop_get_type_descriptor(), true );
  }

  public static  StepShape_Loop  DownCast( Standard_Transient  T) {
    return new StepShape_Loop ( OCCwrapJavaJNI.StepShape_Loop_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_Loop_TypeOf(), true );
  }

}
