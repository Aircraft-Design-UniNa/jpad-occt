package opencascade;

/**
 *  Used to define a name attribute containing a string which specifies the name.
 */
public class TDataStd_Name extends TDF_Attribute {
  TDataStd_Name(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Sets <S> as name. Raises if <S> is not a valid name.
   */
  public static  TDataStd_Name  Set( TDF_Label  label,  TCollection_ExtendedString  string) {
    return new TDataStd_Name ( OCCwrapJavaJNI.TDataStd_Name_Set__SWIG_0(TDF_Label.getCPtr(label), label, TCollection_ExtendedString.getCPtr(string), string), true );
  }

  public static  TDataStd_Name  Set( TDF_Label  label,  Standard_GUID  guid,  TCollection_ExtendedString  string) {
    return new TDataStd_Name ( OCCwrapJavaJNI.TDataStd_Name_Set__SWIG_1(TDF_Label.getCPtr(label), label, Standard_GUID.getCPtr(guid), guid, TCollection_ExtendedString.getCPtr(string), string), true );
  }

  public TDataStd_Name() {
    this(OCCwrapJavaJNI.new_TDataStd_Name(), true);
  }

  public void Set( TCollection_ExtendedString  S) {
    OCCwrapJavaJNI.TDataStd_Name_Set__SWIG_2(swigCPtr, this, TCollection_ExtendedString.getCPtr(S), S);
  }

  /**
   *  Sets the explicit user defined GUID  to the attribute.
   */
  public void SetID( Standard_GUID  guid) {
    OCCwrapJavaJNI.TDataStd_Name_SetID__SWIG_0(swigCPtr, this, Standard_GUID.getCPtr(guid), guid);
  }

  /**
   *  Sets default GUID for the attribute.
   */
  public void SetID() {
    OCCwrapJavaJNI.TDataStd_Name_SetID__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns the name contained in this name attribute.
   */
  public  TCollection_ExtendedString  Get() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TDataStd_Name_Get(swigCPtr, this), true);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataStd_Name_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_Name_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataStd_Name_GetId(), true);
  }

  public static  TDataStd_Name  DownCast( Standard_Transient  T) {
    return new TDataStd_Name ( OCCwrapJavaJNI.TDataStd_Name_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_Name_TypeOf(), true );
  }

}
