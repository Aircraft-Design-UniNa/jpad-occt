package opencascade;

public class StepGeom_BSplineCurve extends StepGeom_BoundedCurve {
  StepGeom_BSplineCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a BSplineCurve
   */
  public StepGeom_BSplineCurve() {
    this(OCCwrapJavaJNI.new_StepGeom_BSplineCurve(), true);
  }

  public void Init( TCollection_HAsciiString  aName, int aDegree,  StepGeom_HArray1OfCartesianPoint  aControlPointsList, StepGeom_BSplineCurveForm aCurveForm, StepData_Logical aClosedCurve, StepData_Logical aSelfIntersect) {
    OCCwrapJavaJNI.StepGeom_BSplineCurve_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName, aDegree,  StepGeom_HArray1OfCartesianPoint.getCPtr(aControlPointsList) , aControlPointsList, aCurveForm.swigValue(), aClosedCurve.swigValue(), aSelfIntersect.swigValue());
  }

  public void SetDegree(int aDegree) {
    OCCwrapJavaJNI.StepGeom_BSplineCurve_SetDegree(swigCPtr, this, aDegree);
  }

  public int Degree() {
    return OCCwrapJavaJNI.StepGeom_BSplineCurve_Degree(swigCPtr, this);
  }

  public void SetControlPointsList( StepGeom_HArray1OfCartesianPoint  aControlPointsList) {
    OCCwrapJavaJNI.StepGeom_BSplineCurve_SetControlPointsList(swigCPtr, this,  StepGeom_HArray1OfCartesianPoint.getCPtr(aControlPointsList) , aControlPointsList);
  }

  public  StepGeom_HArray1OfCartesianPoint  ControlPointsList() {
    return new StepGeom_HArray1OfCartesianPoint ( OCCwrapJavaJNI.StepGeom_BSplineCurve_ControlPointsList(swigCPtr, this), true );
  }

  public  StepGeom_CartesianPoint  ControlPointsListValue(int num) {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_BSplineCurve_ControlPointsListValue(swigCPtr, this, num), true );
  }

  public int NbControlPointsList() {
    return OCCwrapJavaJNI.StepGeom_BSplineCurve_NbControlPointsList(swigCPtr, this);
  }

  public void SetCurveForm(StepGeom_BSplineCurveForm aCurveForm) {
    OCCwrapJavaJNI.StepGeom_BSplineCurve_SetCurveForm(swigCPtr, this, aCurveForm.swigValue());
  }

  public StepGeom_BSplineCurveForm CurveForm() {
    return StepGeom_BSplineCurveForm.swigToEnum(OCCwrapJavaJNI.StepGeom_BSplineCurve_CurveForm(swigCPtr, this));
  }

  public void SetClosedCurve(StepData_Logical aClosedCurve) {
    OCCwrapJavaJNI.StepGeom_BSplineCurve_SetClosedCurve(swigCPtr, this, aClosedCurve.swigValue());
  }

  public StepData_Logical ClosedCurve() {
    return StepData_Logical.swigToEnum(OCCwrapJavaJNI.StepGeom_BSplineCurve_ClosedCurve(swigCPtr, this));
  }

  public void SetSelfIntersect(StepData_Logical aSelfIntersect) {
    OCCwrapJavaJNI.StepGeom_BSplineCurve_SetSelfIntersect(swigCPtr, this, aSelfIntersect.swigValue());
  }

  public StepData_Logical SelfIntersect() {
    return StepData_Logical.swigToEnum(OCCwrapJavaJNI.StepGeom_BSplineCurve_SelfIntersect(swigCPtr, this));
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_BSplineCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_BSplineCurve_get_type_descriptor(), true );
  }

  public static  StepGeom_BSplineCurve  DownCast( Standard_Transient  T) {
    return new StepGeom_BSplineCurve ( OCCwrapJavaJNI.StepGeom_BSplineCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_BSplineCurve_TypeOf(), true );
  }

}
