package opencascade;

/**
 *  This  attribute is  used to  store in the  framework a
 *  reference to an other label.
 */
public class TDF_Reference extends TDF_Attribute {
  TDF_Reference(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static  TDF_Reference  Set( TDF_Label  I,  TDF_Label  Origin) {
    return new TDF_Reference ( OCCwrapJavaJNI.TDF_Reference_Set__SWIG_0(TDF_Label.getCPtr(I), I, TDF_Label.getCPtr(Origin), Origin), true );
  }

  public void Set( TDF_Label  Origin) {
    OCCwrapJavaJNI.TDF_Reference_Set__SWIG_1(swigCPtr, this, TDF_Label.getCPtr(Origin), Origin);
  }

  public TDF_Label Get() {
    return new TDF_Label(OCCwrapJavaJNI.TDF_Reference_Get(swigCPtr, this), true);
  }

  public TDF_Reference() {
    this(OCCwrapJavaJNI.new_TDF_Reference(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDF_Reference_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_Reference_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDF_Reference_GetId(), true);
  }

  public static  TDF_Reference  DownCast( Standard_Transient  T) {
    return new TDF_Reference ( OCCwrapJavaJNI.TDF_Reference_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_Reference_TypeOf(), true );
  }

}
