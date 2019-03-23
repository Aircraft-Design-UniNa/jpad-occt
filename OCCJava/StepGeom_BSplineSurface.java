package opencascade;

public class StepGeom_BSplineSurface extends StepGeom_BoundedSurface {
  StepGeom_BSplineSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a BSplineSurface
   */
  public StepGeom_BSplineSurface() {
    this(OCCwrapJavaJNI.new_StepGeom_BSplineSurface(), true);
  }

  public void Init( TCollection_HAsciiString  aName, int aUDegree, int aVDegree,  StepGeom_HArray2OfCartesianPoint  aControlPointsList, StepGeom_BSplineSurfaceForm aSurfaceForm, StepData_Logical aUClosed, StepData_Logical aVClosed, StepData_Logical aSelfIntersect) {
    OCCwrapJavaJNI.StepGeom_BSplineSurface_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName, aUDegree, aVDegree,  StepGeom_HArray2OfCartesianPoint.getCPtr(aControlPointsList) , aControlPointsList, aSurfaceForm.swigValue(), aUClosed.swigValue(), aVClosed.swigValue(), aSelfIntersect.swigValue());
  }

  public void SetUDegree(int aUDegree) {
    OCCwrapJavaJNI.StepGeom_BSplineSurface_SetUDegree(swigCPtr, this, aUDegree);
  }

  public int UDegree() {
    return OCCwrapJavaJNI.StepGeom_BSplineSurface_UDegree(swigCPtr, this);
  }

  public void SetVDegree(int aVDegree) {
    OCCwrapJavaJNI.StepGeom_BSplineSurface_SetVDegree(swigCPtr, this, aVDegree);
  }

  public int VDegree() {
    return OCCwrapJavaJNI.StepGeom_BSplineSurface_VDegree(swigCPtr, this);
  }

  public void SetControlPointsList( StepGeom_HArray2OfCartesianPoint  aControlPointsList) {
    OCCwrapJavaJNI.StepGeom_BSplineSurface_SetControlPointsList(swigCPtr, this,  StepGeom_HArray2OfCartesianPoint.getCPtr(aControlPointsList) , aControlPointsList);
  }

  public  StepGeom_HArray2OfCartesianPoint  ControlPointsList() {
    return new StepGeom_HArray2OfCartesianPoint ( OCCwrapJavaJNI.StepGeom_BSplineSurface_ControlPointsList(swigCPtr, this), true );
  }

  public  StepGeom_CartesianPoint  ControlPointsListValue(int num1, int num2) {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_BSplineSurface_ControlPointsListValue(swigCPtr, this, num1, num2), true );
  }

  public int NbControlPointsListI() {
    return OCCwrapJavaJNI.StepGeom_BSplineSurface_NbControlPointsListI(swigCPtr, this);
  }

  public int NbControlPointsListJ() {
    return OCCwrapJavaJNI.StepGeom_BSplineSurface_NbControlPointsListJ(swigCPtr, this);
  }

  public void SetSurfaceForm(StepGeom_BSplineSurfaceForm aSurfaceForm) {
    OCCwrapJavaJNI.StepGeom_BSplineSurface_SetSurfaceForm(swigCPtr, this, aSurfaceForm.swigValue());
  }

  public StepGeom_BSplineSurfaceForm SurfaceForm() {
    return StepGeom_BSplineSurfaceForm.swigToEnum(OCCwrapJavaJNI.StepGeom_BSplineSurface_SurfaceForm(swigCPtr, this));
  }

  public void SetUClosed(StepData_Logical aUClosed) {
    OCCwrapJavaJNI.StepGeom_BSplineSurface_SetUClosed(swigCPtr, this, aUClosed.swigValue());
  }

  public StepData_Logical UClosed() {
    return StepData_Logical.swigToEnum(OCCwrapJavaJNI.StepGeom_BSplineSurface_UClosed(swigCPtr, this));
  }

  public void SetVClosed(StepData_Logical aVClosed) {
    OCCwrapJavaJNI.StepGeom_BSplineSurface_SetVClosed(swigCPtr, this, aVClosed.swigValue());
  }

  public StepData_Logical VClosed() {
    return StepData_Logical.swigToEnum(OCCwrapJavaJNI.StepGeom_BSplineSurface_VClosed(swigCPtr, this));
  }

  public void SetSelfIntersect(StepData_Logical aSelfIntersect) {
    OCCwrapJavaJNI.StepGeom_BSplineSurface_SetSelfIntersect(swigCPtr, this, aSelfIntersect.swigValue());
  }

  public StepData_Logical SelfIntersect() {
    return StepData_Logical.swigToEnum(OCCwrapJavaJNI.StepGeom_BSplineSurface_SelfIntersect(swigCPtr, this));
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_BSplineSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_BSplineSurface_get_type_descriptor(), true );
  }

  public static  StepGeom_BSplineSurface  DownCast( Standard_Transient  T) {
    return new StepGeom_BSplineSurface ( OCCwrapJavaJNI.StepGeom_BSplineSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_BSplineSurface_TypeOf(), true );
  }

}
