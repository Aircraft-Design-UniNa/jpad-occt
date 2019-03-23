package opencascade;

public class StepGeom_CartesianTransformationOperator extends StepGeom_GeometricRepresentationItem {
  StepGeom_CartesianTransformationOperator(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a CartesianTransformationOperator
   */
  public StepGeom_CartesianTransformationOperator() {
    this(OCCwrapJavaJNI.new_StepGeom_CartesianTransformationOperator(), true);
  }

  public void Init( TCollection_HAsciiString  aName, long hasAaxis1,  StepGeom_Direction  aAxis1, long hasAaxis2,  StepGeom_Direction  aAxis2,  StepGeom_CartesianPoint  aLocalOrigin, long hasAscale, double aScale) {
    OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName, hasAaxis1,  StepGeom_Direction.getCPtr(aAxis1) , aAxis1, hasAaxis2,  StepGeom_Direction.getCPtr(aAxis2) , aAxis2,  StepGeom_CartesianPoint.getCPtr(aLocalOrigin) , aLocalOrigin, hasAscale, aScale);
  }

  public void SetAxis1( StepGeom_Direction  aAxis1) {
    OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_SetAxis1(swigCPtr, this,  StepGeom_Direction.getCPtr(aAxis1) , aAxis1);
  }

  public void UnSetAxis1() {
    OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_UnSetAxis1(swigCPtr, this);
  }

  public  StepGeom_Direction  Axis1() {
    return new StepGeom_Direction ( OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_Axis1(swigCPtr, this), true );
  }

  public long HasAxis1() {
    return OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_HasAxis1(swigCPtr, this);
  }

  public void SetAxis2( StepGeom_Direction  aAxis2) {
    OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_SetAxis2(swigCPtr, this,  StepGeom_Direction.getCPtr(aAxis2) , aAxis2);
  }

  public void UnSetAxis2() {
    OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_UnSetAxis2(swigCPtr, this);
  }

  public  StepGeom_Direction  Axis2() {
    return new StepGeom_Direction ( OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_Axis2(swigCPtr, this), true );
  }

  public long HasAxis2() {
    return OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_HasAxis2(swigCPtr, this);
  }

  public void SetLocalOrigin( StepGeom_CartesianPoint  aLocalOrigin) {
    OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_SetLocalOrigin(swigCPtr, this,  StepGeom_CartesianPoint.getCPtr(aLocalOrigin) , aLocalOrigin);
  }

  public  StepGeom_CartesianPoint  LocalOrigin() {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_LocalOrigin(swigCPtr, this), true );
  }

  public void SetScale(double aScale) {
    OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_SetScale(swigCPtr, this, aScale);
  }

  public void UnSetScale() {
    OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_UnSetScale(swigCPtr, this);
  }

  public double Scale() {
    return OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_Scale(swigCPtr, this);
  }

  public long HasScale() {
    return OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_HasScale(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_get_type_descriptor(), true );
  }

  public static  StepGeom_CartesianTransformationOperator  DownCast( Standard_Transient  T) {
    return new StepGeom_CartesianTransformationOperator ( OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator_TypeOf(), true );
  }

}
