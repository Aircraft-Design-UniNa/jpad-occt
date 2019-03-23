package opencascade;

/**
 *  This class provides general services for a data framework.
 */
public class TDF_Tool {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_Tool(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_Tool(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_Tool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_Tool(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Returns the number of labels of the tree,
   *  including <aLabel>. aLabel is also included in this figure.
   *  This information is useful in setting the size of an array.
   */
  public static int NbLabels( TDF_Label  aLabel) {
    return OCCwrapJavaJNI.TDF_Tool_NbLabels(TDF_Label.getCPtr(aLabel), aLabel);
  }

  /**
   *  Returns the total number of attributes attached
   *  to the labels dependent on the label aLabel.
   *  The attributes of aLabel are also included in this figure.
   *  This information is useful in setting the size of an array.
   */
  public static int NbAttributes( TDF_Label  aLabel) {
    return OCCwrapJavaJNI.TDF_Tool_NbAttributes__SWIG_0(TDF_Label.getCPtr(aLabel), aLabel);
  }

  /**
   *  Returns the number of attributes of the tree,
   *  selected by a<Filter>, including those of
   *  <aLabel>.
   */
  public static int NbAttributes( TDF_Label  aLabel,  TDF_IDFilter  aFilter) {
    return OCCwrapJavaJNI.TDF_Tool_NbAttributes__SWIG_1(TDF_Label.getCPtr(aLabel), aLabel, TDF_IDFilter.getCPtr(aFilter), aFilter);
  }

  /**
   *  Returns true if <aLabel> and its descendants
   *  reference only attributes or labels attached to
   *  themselves.
   */
  public static long IsSelfContained( TDF_Label  aLabel) {
    return OCCwrapJavaJNI.TDF_Tool_IsSelfContained__SWIG_0(TDF_Label.getCPtr(aLabel), aLabel);
  }

  /**
   *  Returns true if <aLabel> and its descendants
   *  reference only attributes or labels attached to
   *  themselves and kept by <aFilter>.
   */
  public static long IsSelfContained( TDF_Label  aLabel,  TDF_IDFilter  aFilter) {
    return OCCwrapJavaJNI.TDF_Tool_IsSelfContained__SWIG_1(TDF_Label.getCPtr(aLabel), aLabel, TDF_IDFilter.getCPtr(aFilter), aFilter);
  }

  /**
   *  Returns in <theAtts> the attributes having out
   *  references.
   * 
   *  Caution: <theAtts> is not cleared before use!
   */
  public static void OutReferers( TDF_Label  theLabel,  TDF_AttributeMap  theAtts) {
    OCCwrapJavaJNI.TDF_Tool_OutReferers__SWIG_0(TDF_Label.getCPtr(theLabel), theLabel, TDF_AttributeMap.getCPtr(theAtts), theAtts);
  }

  /**
   *  Returns in <atts> the attributes having out
   *  references and kept by <aFilterForReferers>.
   *  It considers only the references kept by <aFilterForReferences>.
   *  Caution: <atts> is not cleared before use!
   */
  public static void OutReferers( TDF_Label  aLabel,  TDF_IDFilter  aFilterForReferers,  TDF_IDFilter  aFilterForReferences,  TDF_AttributeMap  atts) {
    OCCwrapJavaJNI.TDF_Tool_OutReferers__SWIG_1(TDF_Label.getCPtr(aLabel), aLabel, TDF_IDFilter.getCPtr(aFilterForReferers), aFilterForReferers, TDF_IDFilter.getCPtr(aFilterForReferences), aFilterForReferences, TDF_AttributeMap.getCPtr(atts), atts);
  }

  /**
   *  Returns in <atts> the referenced attributes.
   *  Caution: <atts> is not cleared before use!
   */
  public static void OutReferences( TDF_Label  aLabel,  TDF_AttributeMap  atts) {
    OCCwrapJavaJNI.TDF_Tool_OutReferences__SWIG_0(TDF_Label.getCPtr(aLabel), aLabel, TDF_AttributeMap.getCPtr(atts), atts);
  }

  /**
   *  Returns in <atts> the referenced attributes and kept by <aFilterForReferences>.
   *  It considers only the referers kept by <aFilterForReferers>.
   *  Caution: <atts> is not cleared before use!
   */
  public static void OutReferences( TDF_Label  aLabel,  TDF_IDFilter  aFilterForReferers,  TDF_IDFilter  aFilterForReferences,  TDF_AttributeMap  atts) {
    OCCwrapJavaJNI.TDF_Tool_OutReferences__SWIG_1(TDF_Label.getCPtr(aLabel), aLabel, TDF_IDFilter.getCPtr(aFilterForReferers), aFilterForReferers, TDF_IDFilter.getCPtr(aFilterForReferences), aFilterForReferences, TDF_AttributeMap.getCPtr(atts), atts);
  }

  /**
   *  Returns the label having the same sub-entry as
   *  <aLabel> but located as descendant as <toRoot>
   *  instead of <fromRoot>.
   * 
   *  Exemple :
   * 
   *  aLabel = 0:3:24:7:2:7
   *  fromRoot = 0:3:24
   *  toRoot = 0:5
   *  returned label = 0:5:7:2:7
   */
  public static void RelocateLabel( TDF_Label  aSourceLabel,  TDF_Label  fromRoot,  TDF_Label  toRoot, TDF_Label aTargetLabel, long create) {
    OCCwrapJavaJNI.TDF_Tool_RelocateLabel__SWIG_0(TDF_Label.getCPtr(aSourceLabel), aSourceLabel, TDF_Label.getCPtr(fromRoot), fromRoot, TDF_Label.getCPtr(toRoot), toRoot, TDF_Label.getCPtr(aTargetLabel), aTargetLabel, create);
  }

  public static void RelocateLabel( TDF_Label  aSourceLabel,  TDF_Label  fromRoot,  TDF_Label  toRoot, TDF_Label aTargetLabel) {
    OCCwrapJavaJNI.TDF_Tool_RelocateLabel__SWIG_1(TDF_Label.getCPtr(aSourceLabel), aSourceLabel, TDF_Label.getCPtr(fromRoot), fromRoot, TDF_Label.getCPtr(toRoot), toRoot, TDF_Label.getCPtr(aTargetLabel), aTargetLabel);
  }

  /**
   *  Returns the entry for the label aLabel in the form
   *  of the ASCII character string anEntry containing
   *  the tag list for aLabel.
   */
  public static void Entry( TDF_Label  aLabel, TCollection_AsciiString anEntry) {
    OCCwrapJavaJNI.TDF_Tool_Entry(TDF_Label.getCPtr(aLabel), aLabel, TCollection_AsciiString.getCPtr(anEntry), anEntry);
  }

  /**
   *  Returns the entry of <aLabel> as list of integers
   *  in <aTagList>.
   */
  public static void TagList( TDF_Label  aLabel,  TColStd_ListOfInteger  aTagList) {
    OCCwrapJavaJNI.TDF_Tool_TagList__SWIG_0(TDF_Label.getCPtr(aLabel), aLabel, TColStd_ListOfInteger.getCPtr(aTagList), aTagList);
  }

  /**
   *  Returns the entry expressed by <anEntry> as list
   *  of integers in <aTagList>.
   */
  public static void TagList( TCollection_AsciiString  anEntry,  TColStd_ListOfInteger  aTagList) {
    OCCwrapJavaJNI.TDF_Tool_TagList__SWIG_1(TCollection_AsciiString.getCPtr(anEntry), anEntry, TColStd_ListOfInteger.getCPtr(aTagList), aTagList);
  }

  /**
   *  Returns the label expressed by <anEntry>; creates
   *  the label if it does not exist and if <create> is
   *  true.
   */
  public static void Label( TDF_Data  aDF,  TCollection_AsciiString  anEntry, TDF_Label aLabel, long create) {
    OCCwrapJavaJNI.TDF_Tool_Label__SWIG_0( TDF_Data.getCPtr(aDF) , aDF, TCollection_AsciiString.getCPtr(anEntry), anEntry, TDF_Label.getCPtr(aLabel), aLabel, create);
  }

  /**
   *  Returns the label expressed by <anEntry>; creates
   *  the label if it does not exist and if <create> is
   *  true.
   */
  public static void Label( TDF_Data  aDF,  TCollection_AsciiString  anEntry, TDF_Label aLabel) {
    OCCwrapJavaJNI.TDF_Tool_Label__SWIG_1( TDF_Data.getCPtr(aDF) , aDF, TCollection_AsciiString.getCPtr(anEntry), anEntry, TDF_Label.getCPtr(aLabel), aLabel);
  }

  /**
   *  Returns the label expressed by <anEntry>; creates
   *  the label if it does not exist and if <create> is
   *  true.
   */
  public static void Label( TDF_Data  aDF, String anEntry, TDF_Label aLabel, long create) {
    OCCwrapJavaJNI.TDF_Tool_Label__SWIG_2( TDF_Data.getCPtr(aDF) , aDF, anEntry, TDF_Label.getCPtr(aLabel), aLabel, create);
  }

  public static void Label( TDF_Data  aDF, String anEntry, TDF_Label aLabel) {
    OCCwrapJavaJNI.TDF_Tool_Label__SWIG_3( TDF_Data.getCPtr(aDF) , aDF, anEntry, TDF_Label.getCPtr(aLabel), aLabel);
  }

  public static void Label( TDF_Data  aDF,  TColStd_ListOfInteger  aTagList, TDF_Label aLabel, long create) {
    OCCwrapJavaJNI.TDF_Tool_Label__SWIG_4( TDF_Data.getCPtr(aDF) , aDF, TColStd_ListOfInteger.getCPtr(aTagList), aTagList, TDF_Label.getCPtr(aLabel), aLabel, create);
  }

  public static void Label( TDF_Data  aDF,  TColStd_ListOfInteger  aTagList, TDF_Label aLabel) {
    OCCwrapJavaJNI.TDF_Tool_Label__SWIG_5( TDF_Data.getCPtr(aDF) , aDF, TColStd_ListOfInteger.getCPtr(aTagList), aTagList, TDF_Label.getCPtr(aLabel), aLabel);
  }

  /**
   *  Dumps <aDF> and its labels and their attributes.
   */
  public static void DeepDump(SWIGTYPE_p_Standard_OStream anOS,  TDF_Data  aDF) {
    OCCwrapJavaJNI.TDF_Tool_DeepDump__SWIG_0(SWIGTYPE_p_Standard_OStream.getCPtr(anOS),  TDF_Data.getCPtr(aDF) , aDF);
  }

  /**
   *  Dumps <aDF> and its labels and their attributes,
   *  if their IDs are kept by <aFilter>. Dumps also the
   *  attributes content.
   */
  public static void ExtendedDeepDump(SWIGTYPE_p_Standard_OStream anOS,  TDF_Data  aDF,  TDF_IDFilter  aFilter) {
    OCCwrapJavaJNI.TDF_Tool_ExtendedDeepDump__SWIG_0(SWIGTYPE_p_Standard_OStream.getCPtr(anOS),  TDF_Data.getCPtr(aDF) , aDF, TDF_IDFilter.getCPtr(aFilter), aFilter);
  }

  /**
   *  Dumps <aLabel>, its chilren and their attributes.
   */
  public static void DeepDump(SWIGTYPE_p_Standard_OStream anOS,  TDF_Label  aLabel) {
    OCCwrapJavaJNI.TDF_Tool_DeepDump__SWIG_1(SWIGTYPE_p_Standard_OStream.getCPtr(anOS), TDF_Label.getCPtr(aLabel), aLabel);
  }

  /**
   *  Dumps <aLabel>, its chilren and their attributes,
   *  if their IDs are kept by <aFilter>. Dumps also the
   *  attributes content.
   */
  public static void ExtendedDeepDump(SWIGTYPE_p_Standard_OStream anOS,  TDF_Label  aLabel,  TDF_IDFilter  aFilter) {
    OCCwrapJavaJNI.TDF_Tool_ExtendedDeepDump__SWIG_1(SWIGTYPE_p_Standard_OStream.getCPtr(anOS), TDF_Label.getCPtr(aLabel), aLabel, TDF_IDFilter.getCPtr(aFilter), aFilter);
  }

  public TDF_Tool() {
    this(OCCwrapJavaJNI.new_TDF_Tool(), true);
  }

}
