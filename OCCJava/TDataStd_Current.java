package opencascade;

/**
 *  this attribute,  located at root label,  manage an
 *  access to a current label.
 */
public class TDataStd_Current extends TDF_Attribute {
  TDataStd_Current(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Set <L> as current of <L> Framework.
   */
  public static void Set( TDF_Label  L) {
    OCCwrapJavaJNI.TDataStd_Current_Set(TDF_Label.getCPtr(L), L);
  }

  /**
   *  returns current of <acces> Framework. raise if (!Has)
   */
  public static TDF_Label Get( TDF_Label  acces) {
    return new TDF_Label(OCCwrapJavaJNI.TDataStd_Current_Get(TDF_Label.getCPtr(acces), acces), true);
  }

  /**
   *  returns True if a  current label is managed in <acces>
   *  Framework.
   *  class methods
   *  =============
   */
  public static long Has( TDF_Label  acces) {
    return OCCwrapJavaJNI.TDataStd_Current_Has(TDF_Label.getCPtr(acces), acces);
  }

  public TDataStd_Current() {
    this(OCCwrapJavaJNI.new_TDataStd_Current(), true);
  }

  public void SetLabel( TDF_Label  current) {
    OCCwrapJavaJNI.TDataStd_Current_SetLabel(swigCPtr, this, TDF_Label.getCPtr(current), current);
  }

  public TDF_Label GetLabel() {
    return new TDF_Label(OCCwrapJavaJNI.TDataStd_Current_GetLabel(swigCPtr, this), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataStd_Current_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_Current_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataStd_Current_GetId(), true);
  }

  public static  TDataStd_Current  DownCast( Standard_Transient  T) {
    return new TDataStd_Current ( OCCwrapJavaJNI.TDataStd_Current_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_Current_TypeOf(), true );
  }

}
