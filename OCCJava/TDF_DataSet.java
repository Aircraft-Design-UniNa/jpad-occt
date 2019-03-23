package opencascade;

/**
 *  This class is a set of TDF informations like
 *  labels and attributes.
 */
public class TDF_DataSet extends Standard_Transient {
  TDF_DataSet(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates an  empty   DataSet  object.
   */
  public TDF_DataSet() {
    this(OCCwrapJavaJNI.new_TDF_DataSet(), true);
  }

  /**
   *  Clears all information.
   */
  public void Clear() {
    OCCwrapJavaJNI.TDF_DataSet_Clear(swigCPtr, this);
  }

  /**
   *  Returns true if there is at least one label or one
   *  attribute.
   */
  public long IsEmpty() {
    return OCCwrapJavaJNI.TDF_DataSet_IsEmpty(swigCPtr, this);
  }

  /**
   *  Adds <aLabel> in  the  current  data  set.
   */
  public void AddLabel(TDF_Label aLabel) {
    OCCwrapJavaJNI.TDF_DataSet_AddLabel(swigCPtr, this, TDF_Label.getCPtr(aLabel), aLabel);
  }

  /**
   *  Returns true if the label  <alabel>   is in the data set.
   */
  public long ContainsLabel(TDF_Label aLabel) {
    return OCCwrapJavaJNI.TDF_DataSet_ContainsLabel(swigCPtr, this, TDF_Label.getCPtr(aLabel), aLabel);
  }

  /**
   *  Returns the map of labels in this data set.
   *  This map can be used directly, or updated.
   */
  public TDF_LabelMap Labels() {
    return new TDF_LabelMap(OCCwrapJavaJNI.TDF_DataSet_Labels(swigCPtr, this), false);
  }

  /**
   *  Adds <anAttribute> into the current data  set.
   */
  public void AddAttribute( TDF_Attribute  anAttribute) {
    OCCwrapJavaJNI.TDF_DataSet_AddAttribute(swigCPtr, this,  TDF_Attribute.getCPtr(anAttribute) , anAttribute);
  }

  /**
   *  Returns true if <anAttribute> is in the data set.
   */
  public long ContainsAttribute( TDF_Attribute  anAttribute) {
    return OCCwrapJavaJNI.TDF_DataSet_ContainsAttribute(swigCPtr, this,  TDF_Attribute.getCPtr(anAttribute) , anAttribute);
  }

  /**
   *  Returns the map of attributes in the  current  data   set.
   *  This map can be used directly, or updated.
   */
  public TDF_AttributeMap Attributes() {
    return new TDF_AttributeMap(OCCwrapJavaJNI.TDF_DataSet_Attributes(swigCPtr, this), false);
  }

  /**
   *  Adds a root label to <myRootLabels>.
   */
  public void AddRoot(TDF_Label aLabel) {
    OCCwrapJavaJNI.TDF_DataSet_AddRoot(swigCPtr, this, TDF_Label.getCPtr(aLabel), aLabel);
  }

  /**
   *  Returns <myRootLabels> to be used or updated.
   */
  public TDF_LabelList Roots() {
    return new TDF_LabelList(OCCwrapJavaJNI.TDF_DataSet_Roots(swigCPtr, this), false);
  }

  /**
   *  Dumps the minimum information about <me> on
   *  <aStream>.
   */
  public SWIGTYPE_p_Standard_OStream Dump(SWIGTYPE_p_Standard_OStream anOS) {
    return new SWIGTYPE_p_Standard_OStream(OCCwrapJavaJNI.TDF_DataSet_Dump(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(anOS)), false);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDF_DataSet_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_DataSet_get_type_descriptor(), true );
  }

  public static  TDF_DataSet  DownCast( Standard_Transient  T) {
    return new TDF_DataSet ( OCCwrapJavaJNI.TDF_DataSet_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_DataSet_TypeOf(), true );
  }

}
