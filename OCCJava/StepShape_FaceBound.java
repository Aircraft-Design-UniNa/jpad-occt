package opencascade;

public class StepShape_FaceBound extends StepShape_TopologicalRepresentationItem {
  StepShape_FaceBound(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a FaceBound
   */
  public StepShape_FaceBound() {
    this(OCCwrapJavaJNI.new_StepShape_FaceBound(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepShape_Loop  aBound, long aOrientation) {
    OCCwrapJavaJNI.StepShape_FaceBound_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepShape_Loop.getCPtr(aBound) , aBound, aOrientation);
  }

  public void SetBound( StepShape_Loop  aBound) {
    OCCwrapJavaJNI.StepShape_FaceBound_SetBound(swigCPtr, this,  StepShape_Loop.getCPtr(aBound) , aBound);
  }

  public  StepShape_Loop  Bound() {
    return new StepShape_Loop ( OCCwrapJavaJNI.StepShape_FaceBound_Bound(swigCPtr, this), true );
  }

  public void SetOrientation(long aOrientation) {
    OCCwrapJavaJNI.StepShape_FaceBound_SetOrientation(swigCPtr, this, aOrientation);
  }

  public long Orientation() {
    return OCCwrapJavaJNI.StepShape_FaceBound_Orientation(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_FaceBound_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_FaceBound_get_type_descriptor(), true );
  }

  public static  StepShape_FaceBound  DownCast( Standard_Transient  T) {
    return new StepShape_FaceBound ( OCCwrapJavaJNI.StepShape_FaceBound_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_FaceBound_TypeOf(), true );
  }

}
