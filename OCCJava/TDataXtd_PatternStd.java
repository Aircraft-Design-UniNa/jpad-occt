package opencascade;

/**
 *  to create a PatternStd
 *  (LinearPattern, CircularPattern, RectangularPattern,
 *  RadialCircularPattern, MirrorPattern)
 */
public class TDataXtd_PatternStd extends TDataXtd_Pattern {
  TDataXtd_PatternStd(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static  TDataXtd_PatternStd  Set( TDF_Label  label) {
    return new TDataXtd_PatternStd ( OCCwrapJavaJNI.TDataXtd_PatternStd_Set(TDF_Label.getCPtr(label), label), true );
  }

  public TDataXtd_PatternStd() {
    this(OCCwrapJavaJNI.new_TDataXtd_PatternStd(), true);
  }

  public void Signature(int signature) {
    OCCwrapJavaJNI.TDataXtd_PatternStd_Signature__SWIG_0(swigCPtr, this, signature);
  }

  public void Axis1( TNaming_NamedShape  Axis1) {
    OCCwrapJavaJNI.TDataXtd_PatternStd_Axis1__SWIG_0(swigCPtr, this,  TNaming_NamedShape.getCPtr(Axis1) , Axis1);
  }

  public void Axis2( TNaming_NamedShape  Axis2) {
    OCCwrapJavaJNI.TDataXtd_PatternStd_Axis2__SWIG_0(swigCPtr, this,  TNaming_NamedShape.getCPtr(Axis2) , Axis2);
  }

  public void Axis1Reversed(long Axis1Reversed) {
    OCCwrapJavaJNI.TDataXtd_PatternStd_Axis1Reversed__SWIG_0(swigCPtr, this, Axis1Reversed);
  }

  public void Axis2Reversed(long Axis2Reversed) {
    OCCwrapJavaJNI.TDataXtd_PatternStd_Axis2Reversed__SWIG_0(swigCPtr, this, Axis2Reversed);
  }

  public void Value1( TDataStd_Real  value) {
    OCCwrapJavaJNI.TDataXtd_PatternStd_Value1__SWIG_0(swigCPtr, this,  TDataStd_Real.getCPtr(value) , value);
  }

  public void Value2( TDataStd_Real  value) {
    OCCwrapJavaJNI.TDataXtd_PatternStd_Value2__SWIG_0(swigCPtr, this,  TDataStd_Real.getCPtr(value) , value);
  }

  public void NbInstances1( TDataStd_Integer  NbInstances1) {
    OCCwrapJavaJNI.TDataXtd_PatternStd_NbInstances1__SWIG_0(swigCPtr, this,  TDataStd_Integer.getCPtr(NbInstances1) , NbInstances1);
  }

  public void NbInstances2( TDataStd_Integer  NbInstances2) {
    OCCwrapJavaJNI.TDataXtd_PatternStd_NbInstances2__SWIG_0(swigCPtr, this,  TDataStd_Integer.getCPtr(NbInstances2) , NbInstances2);
  }

  public void Mirror( TNaming_NamedShape  plane) {
    OCCwrapJavaJNI.TDataXtd_PatternStd_Mirror__SWIG_0(swigCPtr, this,  TNaming_NamedShape.getCPtr(plane) , plane);
  }

  public int Signature() {
    return OCCwrapJavaJNI.TDataXtd_PatternStd_Signature__SWIG_1(swigCPtr, this);
  }

  public  TNaming_NamedShape  Axis1() {
    return new TNaming_NamedShape ( OCCwrapJavaJNI.TDataXtd_PatternStd_Axis1__SWIG_1(swigCPtr, this), true );
  }

  public  TNaming_NamedShape  Axis2() {
    return new TNaming_NamedShape ( OCCwrapJavaJNI.TDataXtd_PatternStd_Axis2__SWIG_1(swigCPtr, this), true );
  }

  public long Axis1Reversed() {
    return OCCwrapJavaJNI.TDataXtd_PatternStd_Axis1Reversed__SWIG_1(swigCPtr, this);
  }

  public long Axis2Reversed() {
    return OCCwrapJavaJNI.TDataXtd_PatternStd_Axis2Reversed__SWIG_1(swigCPtr, this);
  }

  public  TDataStd_Real  Value1() {
    return new TDataStd_Real ( OCCwrapJavaJNI.TDataXtd_PatternStd_Value1__SWIG_1(swigCPtr, this), true );
  }

  public  TDataStd_Real  Value2() {
    return new TDataStd_Real ( OCCwrapJavaJNI.TDataXtd_PatternStd_Value2__SWIG_1(swigCPtr, this), true );
  }

  public  TDataStd_Integer  NbInstances1() {
    return new TDataStd_Integer ( OCCwrapJavaJNI.TDataXtd_PatternStd_NbInstances1__SWIG_1(swigCPtr, this), true );
  }

  public  TDataStd_Integer  NbInstances2() {
    return new TDataStd_Integer ( OCCwrapJavaJNI.TDataXtd_PatternStd_NbInstances2__SWIG_1(swigCPtr, this), true );
  }

  public  TNaming_NamedShape  Mirror() {
    return new TNaming_NamedShape ( OCCwrapJavaJNI.TDataXtd_PatternStd_Mirror__SWIG_1(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataXtd_PatternStd_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataXtd_PatternStd_get_type_descriptor(), true );
  }

  public static Standard_GUID GetPatternId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataXtd_PatternStd_GetPatternId(), true);
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataXtd_PatternStd_GetId(), true);
  }

  public static  TDataXtd_PatternStd  DownCast( Standard_Transient  T) {
    return new TDataXtd_PatternStd ( OCCwrapJavaJNI.TDataXtd_PatternStd_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataXtd_PatternStd_TypeOf(), true );
  }

}
