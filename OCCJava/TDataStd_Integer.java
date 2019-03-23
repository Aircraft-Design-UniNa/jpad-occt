package opencascade;

/**
 *  The basis to define an integer attribute.
 */
public class TDataStd_Integer extends TDF_Attribute {
  TDataStd_Integer(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Integer methods
   *  ===============
   */
  public static  TDataStd_Integer  Set( TDF_Label  label, int value) {
    return new TDataStd_Integer ( OCCwrapJavaJNI.TDataStd_Integer_Set__SWIG_0(TDF_Label.getCPtr(label), label, value), true );
  }

  public static  TDataStd_Integer  Set( TDF_Label  label,  Standard_GUID  guid, int value) {
    return new TDataStd_Integer ( OCCwrapJavaJNI.TDataStd_Integer_Set__SWIG_1(TDF_Label.getCPtr(label), label, Standard_GUID.getCPtr(guid), guid, value), true );
  }

  public void Set(int V) {
    OCCwrapJavaJNI.TDataStd_Integer_Set__SWIG_2(swigCPtr, this, V);
  }

  /**
   *  Sets the explicit GUID (user defined) for the attribute.
   */
  public void SetID( Standard_GUID  guid) {
    OCCwrapJavaJNI.TDataStd_Integer_SetID__SWIG_0(swigCPtr, this, Standard_GUID.getCPtr(guid), guid);
  }

  /**
   *  Sets default GUID for the attribute.
   */
  public void SetID() {
    OCCwrapJavaJNI.TDataStd_Integer_SetID__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns the integer value contained in the attribute.
   */
  public int Get() {
    return OCCwrapJavaJNI.TDataStd_Integer_Get(swigCPtr, this);
  }

  /**
   *  Returns True if there is a reference on the same label
   */
  public long IsCaptured() {
    return OCCwrapJavaJNI.TDataStd_Integer_IsCaptured(swigCPtr, this);
  }

  public TDataStd_Integer() {
    this(OCCwrapJavaJNI.new_TDataStd_Integer(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataStd_Integer_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_Integer_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataStd_Integer_GetId(), true);
  }

  public static  TDataStd_Integer  DownCast( Standard_Transient  T) {
    return new TDataStd_Integer ( OCCwrapJavaJNI.TDataStd_Integer_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_Integer_TypeOf(), true );
  }

}
