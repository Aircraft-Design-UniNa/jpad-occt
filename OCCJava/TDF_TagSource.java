package opencascade;

/**
 *  This attribute manage   a tag provider   to create
 *  child labels of a given one.
 */
public class TDF_TagSource extends TDF_Attribute {
  TDF_TagSource(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  TDF_Attribute methods
   *  =====================
   */
  public static  TDF_TagSource  Set( TDF_Label  label) {
    return new TDF_TagSource ( OCCwrapJavaJNI.TDF_TagSource_Set__SWIG_0(TDF_Label.getCPtr(label), label), true );
  }

  /**
   *  Find (or create) a  tagSource attribute located at <L>
   *  and make a new child label.
   *  TagSource methods
   *  =================
   */
  public static TDF_Label NewChild( TDF_Label  L) {
    return new TDF_Label(OCCwrapJavaJNI.TDF_TagSource_NewChild__SWIG_0(TDF_Label.getCPtr(L), L), true);
  }

  public TDF_TagSource() {
    this(OCCwrapJavaJNI.new_TDF_TagSource(), true);
  }

  public int NewTag() {
    return OCCwrapJavaJNI.TDF_TagSource_NewTag(swigCPtr, this);
  }

  public TDF_Label NewChild() {
    return new TDF_Label(OCCwrapJavaJNI.TDF_TagSource_NewChild__SWIG_1(swigCPtr, this), true);
  }

  public int Get() {
    return OCCwrapJavaJNI.TDF_TagSource_Get(swigCPtr, this);
  }

  public void Set(int T) {
    OCCwrapJavaJNI.TDF_TagSource_Set__SWIG_1(swigCPtr, this, T);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDF_TagSource_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_TagSource_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDF_TagSource_GetId(), true);
  }

  public static  TDF_TagSource  DownCast( Standard_Transient  T) {
    return new TDF_TagSource ( OCCwrapJavaJNI.TDF_TagSource_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_TagSource_TypeOf(), true );
  }

}
