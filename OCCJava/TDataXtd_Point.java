package opencascade;

/**
 *  The basis to define a point attribute.
 *  The topological attribute must contain a vertex.
 *  You use this class to create reference points in a design.
 * 
 *  Warning:  Use TDataXtd_Geometry  attribute  to retrieve the
 *  gp_Pnt of the Point attribute
 */
public class TDataXtd_Point extends TDF_Attribute {
  TDataXtd_Point(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static  TDataXtd_Point  Set( TDF_Label  label) {
    return new TDataXtd_Point ( OCCwrapJavaJNI.TDataXtd_Point_Set__SWIG_0(TDF_Label.getCPtr(label), label), true );
  }

  public static  TDataXtd_Point  Set( TDF_Label  label,  gp_Pnt  P) {
    return new TDataXtd_Point ( OCCwrapJavaJNI.TDataXtd_Point_Set__SWIG_1(TDF_Label.getCPtr(label), label, gp_Pnt.getCPtr(P), P), true );
  }

  public TDataXtd_Point() {
    this(OCCwrapJavaJNI.new_TDataXtd_Point(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataXtd_Point_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataXtd_Point_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataXtd_Point_GetId(), true);
  }

  public static  TDataXtd_Point  DownCast( Standard_Transient  T) {
    return new TDataXtd_Point ( OCCwrapJavaJNI.TDataXtd_Point_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataXtd_Point_TypeOf(), true );
  }

}
