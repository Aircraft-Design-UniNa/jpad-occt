package opencascade;

public class StepGeom_CartesianTransformationOperator3d extends StepGeom_CartesianTransformationOperator {
  StepGeom_CartesianTransformationOperator3d(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a CartesianTransformationOperator3d
   */
  public StepGeom_CartesianTransformationOperator3d() {
    this(OCCwrapJavaJNI.new_StepGeom_CartesianTransformationOperator3d(), true);
  }

  public void Init( TCollection_HAsciiString  aName, long hasAaxis1,  StepGeom_Direction  aAxis1, long hasAaxis2,  StepGeom_Direction  aAxis2,  StepGeom_CartesianPoint  aLocalOrigin, long hasAscale, double aScale, long hasAaxis3,  StepGeom_Direction  aAxis3) {
    OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator3d_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName, hasAaxis1,  StepGeom_Direction.getCPtr(aAxis1) , aAxis1, hasAaxis2,  StepGeom_Direction.getCPtr(aAxis2) , aAxis2,  StepGeom_CartesianPoint.getCPtr(aLocalOrigin) , aLocalOrigin, hasAscale, aScale, hasAaxis3,  StepGeom_Direction.getCPtr(aAxis3) , aAxis3);
  }

  public void SetAxis3( StepGeom_Direction  aAxis3) {
    OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator3d_SetAxis3(swigCPtr, this,  StepGeom_Direction.getCPtr(aAxis3) , aAxis3);
  }

  public void UnSetAxis3() {
    OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator3d_UnSetAxis3(swigCPtr, this);
  }

  public  StepGeom_Direction  Axis3() {
    return new StepGeom_Direction ( OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator3d_Axis3(swigCPtr, this), true );
  }

  public long HasAxis3() {
    return OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator3d_HasAxis3(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator3d_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator3d_get_type_descriptor(), true );
  }

  public static  StepGeom_CartesianTransformationOperator3d  DownCast( Standard_Transient  T) {
    return new StepGeom_CartesianTransformationOperator3d ( OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator3d_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator3d_TypeOf(), true );
  }

}
