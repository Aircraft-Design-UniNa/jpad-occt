package opencascade;

/**
 *  Comment attribute. may be  associated to any label
 *  to store user comment.
 */
public class TDataStd_Comment extends TDF_Attribute {
  TDataStd_Comment(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static  TDataStd_Comment  Set( TDF_Label  label) {
    return new TDataStd_Comment ( OCCwrapJavaJNI.TDataStd_Comment_Set__SWIG_0(TDF_Label.getCPtr(label), label), true );
  }

  public static  TDataStd_Comment  Set( TDF_Label  label,  TCollection_ExtendedString  string) {
    return new TDataStd_Comment ( OCCwrapJavaJNI.TDataStd_Comment_Set__SWIG_1(TDF_Label.getCPtr(label), label, TCollection_ExtendedString.getCPtr(string), string), true );
  }

  public TDataStd_Comment() {
    this(OCCwrapJavaJNI.new_TDataStd_Comment(), true);
  }

  public void Set( TCollection_ExtendedString  S) {
    OCCwrapJavaJNI.TDataStd_Comment_Set__SWIG_2(swigCPtr, this, TCollection_ExtendedString.getCPtr(S), S);
  }

  /**
   *  Returns the comment attribute.
   */
  public  TCollection_ExtendedString  Get() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TDataStd_Comment_Get(swigCPtr, this), true);
    return ret;
  }

  public long AfterRetrieval(long forceIt) {
    return OCCwrapJavaJNI.TDataStd_Comment_AfterRetrieval__SWIG_0(swigCPtr, this, forceIt);
  }

  public long AfterRetrieval() {
    return OCCwrapJavaJNI.TDataStd_Comment_AfterRetrieval__SWIG_1(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataStd_Comment_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_Comment_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataStd_Comment_GetId(), true);
  }

  public static  TDataStd_Comment  DownCast( Standard_Transient  T) {
    return new TDataStd_Comment ( OCCwrapJavaJNI.TDataStd_Comment_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_Comment_TypeOf(), true );
  }

}
