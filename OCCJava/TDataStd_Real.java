package opencascade;

/**
 *  The basis to define a real number attribute.
 */
public class TDataStd_Real extends TDF_Attribute {
  TDataStd_Real(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Sets the real number V.
   */
  public static  TDataStd_Real  Set( TDF_Label  label, double value) {
    return new TDataStd_Real ( OCCwrapJavaJNI.TDataStd_Real_Set__SWIG_0(TDF_Label.getCPtr(label), label, value), true );
  }

  public static  TDataStd_Real  Set( TDF_Label  label,  Standard_GUID  guid, double value) {
    return new TDataStd_Real ( OCCwrapJavaJNI.TDataStd_Real_Set__SWIG_1(TDF_Label.getCPtr(label), label, Standard_GUID.getCPtr(guid), guid, value), true );
  }

  public TDataStd_Real() {
    this(OCCwrapJavaJNI.new_TDataStd_Real(), true);
  }

  public void SetDimension(TDataStd_RealEnum DIM) {
    OCCwrapJavaJNI.TDataStd_Real_SetDimension(swigCPtr, this, DIM.swigValue());
  }

  public TDataStd_RealEnum GetDimension() {
    return TDataStd_RealEnum.swigToEnum(OCCwrapJavaJNI.TDataStd_Real_GetDimension(swigCPtr, this));
  }

  public void Set(double V) {
    OCCwrapJavaJNI.TDataStd_Real_Set__SWIG_2(swigCPtr, this, V);
  }

  /**
   *  Sets the explicit GUID for the attribute.
   */
  public void SetID( Standard_GUID  guid) {
    OCCwrapJavaJNI.TDataStd_Real_SetID__SWIG_0(swigCPtr, this, Standard_GUID.getCPtr(guid), guid);
  }

  /**
   *  Sets default GUID for the attribute.
   */
  public void SetID() {
    OCCwrapJavaJNI.TDataStd_Real_SetID__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns the real number value contained in the attribute.
   */
  public double Get() {
    return OCCwrapJavaJNI.TDataStd_Real_Get(swigCPtr, this);
  }

  /**
   *  Returns True if there is a reference on the same label
   */
  public long IsCaptured() {
    return OCCwrapJavaJNI.TDataStd_Real_IsCaptured(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataStd_Real_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_Real_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataStd_Real_GetId(), true);
  }

  public static  TDataStd_Real  DownCast( Standard_Transient  T) {
    return new TDataStd_Real ( OCCwrapJavaJNI.TDataStd_Real_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_Real_TypeOf(), true );
  }

}
