package opencascade;

public class StepGeom_CompositeCurveSegment extends Standard_Transient {
  StepGeom_CompositeCurveSegment(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a CompositeCurveSegment
   */
  public StepGeom_CompositeCurveSegment() {
    this(OCCwrapJavaJNI.new_StepGeom_CompositeCurveSegment(), true);
  }

  public void Init(StepGeom_TransitionCode aTransition, long aSameSense,  StepGeom_Curve  aParentCurve) {
    OCCwrapJavaJNI.StepGeom_CompositeCurveSegment_Init(swigCPtr, this, aTransition.swigValue(), aSameSense,  StepGeom_Curve.getCPtr(aParentCurve) , aParentCurve);
  }

  public void SetTransition(StepGeom_TransitionCode aTransition) {
    OCCwrapJavaJNI.StepGeom_CompositeCurveSegment_SetTransition(swigCPtr, this, aTransition.swigValue());
  }

  public StepGeom_TransitionCode Transition() {
    return StepGeom_TransitionCode.swigToEnum(OCCwrapJavaJNI.StepGeom_CompositeCurveSegment_Transition(swigCPtr, this));
  }

  public void SetSameSense(long aSameSense) {
    OCCwrapJavaJNI.StepGeom_CompositeCurveSegment_SetSameSense(swigCPtr, this, aSameSense);
  }

  public long SameSense() {
    return OCCwrapJavaJNI.StepGeom_CompositeCurveSegment_SameSense(swigCPtr, this);
  }

  public void SetParentCurve( StepGeom_Curve  aParentCurve) {
    OCCwrapJavaJNI.StepGeom_CompositeCurveSegment_SetParentCurve(swigCPtr, this,  StepGeom_Curve.getCPtr(aParentCurve) , aParentCurve);
  }

  public  StepGeom_Curve  ParentCurve() {
    return new StepGeom_Curve ( OCCwrapJavaJNI.StepGeom_CompositeCurveSegment_ParentCurve(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_CompositeCurveSegment_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_CompositeCurveSegment_get_type_descriptor(), true );
  }

  public static  StepGeom_CompositeCurveSegment  DownCast( Standard_Transient  T) {
    return new StepGeom_CompositeCurveSegment ( OCCwrapJavaJNI.StepGeom_CompositeCurveSegment_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_CompositeCurveSegment_TypeOf(), true );
  }

}
