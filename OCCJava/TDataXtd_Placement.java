package opencascade;

public class TDataXtd_Placement extends TDF_Attribute {
  TDataXtd_Placement(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static  TDataXtd_Placement  Set( TDF_Label  label) {
    return new TDataXtd_Placement ( OCCwrapJavaJNI.TDataXtd_Placement_Set(TDF_Label.getCPtr(label), label), true );
  }

  public TDataXtd_Placement() {
    this(OCCwrapJavaJNI.new_TDataXtd_Placement(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataXtd_Placement_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataXtd_Placement_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataXtd_Placement_GetId(), true);
  }

  public static  TDataXtd_Placement  DownCast( Standard_Transient  T) {
    return new TDataXtd_Placement ( OCCwrapJavaJNI.TDataXtd_Placement_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataXtd_Placement_TypeOf(), true );
  }

}
