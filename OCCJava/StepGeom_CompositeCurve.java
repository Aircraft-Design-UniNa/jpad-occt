package opencascade;

public class StepGeom_CompositeCurve extends StepGeom_BoundedCurve {
  StepGeom_CompositeCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a CompositeCurve
   */
  public StepGeom_CompositeCurve() {
    this(OCCwrapJavaJNI.new_StepGeom_CompositeCurve(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_HArray1OfCompositeCurveSegment  aSegments, StepData_Logical aSelfIntersect) {
    OCCwrapJavaJNI.StepGeom_CompositeCurve_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_HArray1OfCompositeCurveSegment.getCPtr(aSegments) , aSegments, aSelfIntersect.swigValue());
  }

  public void SetSegments( StepGeom_HArray1OfCompositeCurveSegment  aSegments) {
    OCCwrapJavaJNI.StepGeom_CompositeCurve_SetSegments(swigCPtr, this,  StepGeom_HArray1OfCompositeCurveSegment.getCPtr(aSegments) , aSegments);
  }

  public  StepGeom_HArray1OfCompositeCurveSegment  Segments() {
    return new StepGeom_HArray1OfCompositeCurveSegment ( OCCwrapJavaJNI.StepGeom_CompositeCurve_Segments(swigCPtr, this), true );
  }

  public  StepGeom_CompositeCurveSegment  SegmentsValue(int num) {
    return new StepGeom_CompositeCurveSegment ( OCCwrapJavaJNI.StepGeom_CompositeCurve_SegmentsValue(swigCPtr, this, num), true );
  }

  public int NbSegments() {
    return OCCwrapJavaJNI.StepGeom_CompositeCurve_NbSegments(swigCPtr, this);
  }

  public void SetSelfIntersect(StepData_Logical aSelfIntersect) {
    OCCwrapJavaJNI.StepGeom_CompositeCurve_SetSelfIntersect(swigCPtr, this, aSelfIntersect.swigValue());
  }

  public StepData_Logical SelfIntersect() {
    return StepData_Logical.swigToEnum(OCCwrapJavaJNI.StepGeom_CompositeCurve_SelfIntersect(swigCPtr, this));
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_CompositeCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_CompositeCurve_get_type_descriptor(), true );
  }

  public static  StepGeom_CompositeCurve  DownCast( Standard_Transient  T) {
    return new StepGeom_CompositeCurve ( OCCwrapJavaJNI.StepGeom_CompositeCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_CompositeCurve_TypeOf(), true );
  }

}
