package opencascade;

/**
 *  An attribute to store the path and the entry of
 *  external links.
 *  These refer from one data structure to a data
 *  structure in another document.
 */
public class TDocStd_XLink extends TDF_Attribute {
  TDocStd_XLink(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static  TDocStd_XLink  Set( TDF_Label  atLabel) {
    return new TDocStd_XLink ( OCCwrapJavaJNI.TDocStd_XLink_Set(TDF_Label.getCPtr(atLabel), atLabel), true );
  }

  /**
   *  Initializes fields.
   */
  public TDocStd_XLink() {
    this(OCCwrapJavaJNI.new_TDocStd_XLink(), true);
  }

  public  TDF_Reference  Update() {
    return new TDF_Reference ( OCCwrapJavaJNI.TDocStd_XLink_Update(swigCPtr, this), true );
  }

  /**
   *  Sets the name aDocEntry for the external
   *  document in this external link attribute.
   */
  public void DocumentEntry( TCollection_AsciiString  aDocEntry) {
    OCCwrapJavaJNI.TDocStd_XLink_DocumentEntry__SWIG_0(swigCPtr, this, TCollection_AsciiString.getCPtr(aDocEntry), aDocEntry);
  }

  /**
   *  Returns the contents of the document identified by aDocEntry.
   *  aDocEntry provides external data to this external link attribute.
   */
  public  TCollection_AsciiString  DocumentEntry() {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TDocStd_XLink_DocumentEntry__SWIG_1(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Sets the label entry for this external link attribute with the label aLabel.
   *  aLabel pilots the importation of data from the document entry.
   */
  public void LabelEntry( TDF_Label  aLabel) {
    OCCwrapJavaJNI.TDocStd_XLink_LabelEntry__SWIG_0(swigCPtr, this, TDF_Label.getCPtr(aLabel), aLabel);
  }

  /**
   *  Sets the label entry for this external link attribute
   *  as a document identified by aLabEntry.
   */
  public void LabelEntry( TCollection_AsciiString  aLabEntry) {
    OCCwrapJavaJNI.TDocStd_XLink_LabelEntry__SWIG_1(swigCPtr, this, TCollection_AsciiString.getCPtr(aLabEntry), aLabEntry);
  }

  /**
   *  Returns the contents of the field <myLabelEntry>.
   */
  public  TCollection_AsciiString  LabelEntry() {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TDocStd_XLink_LabelEntry__SWIG_2(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Something to do before applying <anAttDelta>.
   */
  public long BeforeUndo( TDF_AttributeDelta  anAttDelta, long forceIt) {
    return OCCwrapJavaJNI.TDocStd_XLink_BeforeUndo__SWIG_0(swigCPtr, this,  TDF_AttributeDelta.getCPtr(anAttDelta) , anAttDelta, forceIt);
  }

  public long BeforeUndo( TDF_AttributeDelta  anAttDelta) {
    return OCCwrapJavaJNI.TDocStd_XLink_BeforeUndo__SWIG_1(swigCPtr, this,  TDF_AttributeDelta.getCPtr(anAttDelta) , anAttDelta);
  }

  /**
   *  Something to do after applying <anAttDelta>.
   */
  public long AfterUndo( TDF_AttributeDelta  anAttDelta, long forceIt) {
    return OCCwrapJavaJNI.TDocStd_XLink_AfterUndo__SWIG_0(swigCPtr, this,  TDF_AttributeDelta.getCPtr(anAttDelta) , anAttDelta, forceIt);
  }

  public long AfterUndo( TDF_AttributeDelta  anAttDelta) {
    return OCCwrapJavaJNI.TDocStd_XLink_AfterUndo__SWIG_1(swigCPtr, this,  TDF_AttributeDelta.getCPtr(anAttDelta) , anAttDelta);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDocStd_XLink_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDocStd_XLink_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDocStd_XLink_GetId(), true);
  }

  public static  TDocStd_XLink  DownCast( Standard_Transient  T) {
    return new TDocStd_XLink ( OCCwrapJavaJNI.TDocStd_XLink_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDocStd_XLink_TypeOf(), true );
  }

}
