package opencascade;

public class TDataStd_UAttribute extends TDF_Attribute {
  TDataStd_UAttribute(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static  TDataStd_UAttribute  Set( TDF_Label  label,  Standard_GUID  LocalID) {
    return new TDataStd_UAttribute ( OCCwrapJavaJNI.TDataStd_UAttribute_Set(TDF_Label.getCPtr(label), label, Standard_GUID.getCPtr(LocalID), LocalID), true );
  }

  public TDataStd_UAttribute() {
    this(OCCwrapJavaJNI.new_TDataStd_UAttribute(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataStd_UAttribute_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_UAttribute_get_type_descriptor(), true );
  }

  public static  TDataStd_UAttribute  DownCast( Standard_Transient  T) {
    return new TDataStd_UAttribute ( OCCwrapJavaJNI.TDataStd_UAttribute_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_UAttribute_TypeOf(), true );
  }

}
