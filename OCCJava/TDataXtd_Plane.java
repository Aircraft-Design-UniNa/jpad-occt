package opencascade;

/**
 *  The basis to define a plane attribute.
 *  Warning:  Use TDataXtd_Geometry  attribute  to retrieve  the
 *  gp_Pln of the Plane attribute
 */
public class TDataXtd_Plane extends TDF_Attribute {
  TDataXtd_Plane(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static  TDataXtd_Plane  Set( TDF_Label  label) {
    return new TDataXtd_Plane ( OCCwrapJavaJNI.TDataXtd_Plane_Set__SWIG_0(TDF_Label.getCPtr(label), label), true );
  }

  public static  TDataXtd_Plane  Set( TDF_Label  label,  gp_Pln  P) {
    return new TDataXtd_Plane ( OCCwrapJavaJNI.TDataXtd_Plane_Set__SWIG_1(TDF_Label.getCPtr(label), label, gp_Pln.getCPtr(P), P), true );
  }

  public TDataXtd_Plane() {
    this(OCCwrapJavaJNI.new_TDataXtd_Plane(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataXtd_Plane_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataXtd_Plane_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataXtd_Plane_GetId(), true);
  }

  public static  TDataXtd_Plane  DownCast( Standard_Transient  T) {
    return new TDataXtd_Plane ( OCCwrapJavaJNI.TDataXtd_Plane_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataXtd_Plane_TypeOf(), true );
  }

}
