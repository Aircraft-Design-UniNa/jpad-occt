package opencascade;

public class StepShape_EdgeCurve extends StepShape_Edge {
  StepShape_EdgeCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a EdgeCurve
   */
  public StepShape_EdgeCurve() {
    this(OCCwrapJavaJNI.new_StepShape_EdgeCurve(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepShape_Vertex  aEdgeStart,  StepShape_Vertex  aEdgeEnd,  StepGeom_Curve  aEdgeGeometry, long aSameSense) {
    OCCwrapJavaJNI.StepShape_EdgeCurve_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepShape_Vertex.getCPtr(aEdgeStart) , aEdgeStart,  StepShape_Vertex.getCPtr(aEdgeEnd) , aEdgeEnd,  StepGeom_Curve.getCPtr(aEdgeGeometry) , aEdgeGeometry, aSameSense);
  }

  public void SetEdgeGeometry( StepGeom_Curve  aEdgeGeometry) {
    OCCwrapJavaJNI.StepShape_EdgeCurve_SetEdgeGeometry(swigCPtr, this,  StepGeom_Curve.getCPtr(aEdgeGeometry) , aEdgeGeometry);
  }

  public  StepGeom_Curve  EdgeGeometry() {
    return new StepGeom_Curve ( OCCwrapJavaJNI.StepShape_EdgeCurve_EdgeGeometry(swigCPtr, this), true );
  }

  public void SetSameSense(long aSameSense) {
    OCCwrapJavaJNI.StepShape_EdgeCurve_SetSameSense(swigCPtr, this, aSameSense);
  }

  public long SameSense() {
    return OCCwrapJavaJNI.StepShape_EdgeCurve_SameSense(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_EdgeCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_EdgeCurve_get_type_descriptor(), true );
  }

  public static  StepShape_EdgeCurve  DownCast( Standard_Transient  T) {
    return new StepShape_EdgeCurve ( OCCwrapJavaJNI.StepShape_EdgeCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_EdgeCurve_TypeOf(), true );
  }

}
