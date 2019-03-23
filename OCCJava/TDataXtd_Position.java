package opencascade;

/**
 *  Position of a Label
 */
public class TDataXtd_Position extends TDF_Attribute {
  TDataXtd_Position(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Create if not found the TDataXtd_Position attribute set its position to <aPos>
   */
  public static void Set( TDF_Label  aLabel,  gp_Pnt  aPos) {
    OCCwrapJavaJNI.TDataXtd_Position_Set__SWIG_0(TDF_Label.getCPtr(aLabel), aLabel, gp_Pnt.getCPtr(aPos), aPos);
  }

  public static  TDataXtd_Position  Set( TDF_Label  aLabel) {
    return new TDataXtd_Position ( OCCwrapJavaJNI.TDataXtd_Position_Set__SWIG_1(TDF_Label.getCPtr(aLabel), aLabel), true );
  }

  /**
   *  Search label <aLabel) for the TDataXtd_Position attribute and get its position
   *  if found returns True
   */
  public static long Get( TDF_Label  aLabel, gp_Pnt aPos) {
    return OCCwrapJavaJNI.TDataXtd_Position_Get(TDF_Label.getCPtr(aLabel), aLabel, gp_Pnt.getCPtr(aPos), aPos);
  }

  public TDataXtd_Position() {
    this(OCCwrapJavaJNI.new_TDataXtd_Position(), true);
  }

  public  gp_Pnt  GetPosition() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TDataXtd_Position_GetPosition(swigCPtr, this), true);
    return ret;
  }

  public void SetPosition( gp_Pnt  aPos) {
    OCCwrapJavaJNI.TDataXtd_Position_SetPosition(swigCPtr, this, gp_Pnt.getCPtr(aPos), aPos);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataXtd_Position_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataXtd_Position_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataXtd_Position_GetId(), true);
  }

  public static  TDataXtd_Position  DownCast( Standard_Transient  T) {
    return new TDataXtd_Position ( OCCwrapJavaJNI.TDataXtd_Position_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataXtd_Position_TypeOf(), true );
  }

}
