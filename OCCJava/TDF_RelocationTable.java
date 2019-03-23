package opencascade;

/**
 *  This is a relocation dictionnary between source
 *  and target labels, attributes or any
 *  transient(useful for copy or paste actions).
 *  Note that one target value may be the
 *  relocation value of more than one source object.
 * 
 *  Common behaviour: it returns true and the found
 *  relocation value as target object; false
 *  otherwise.
 * 
 *  Look at SelfRelocate method for more explanation
 *  about self relocation behavior of this class.
 */
public class TDF_RelocationTable extends Standard_Transient {
  TDF_RelocationTable(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates an relocation table. <selfRelocate> says
   *  if a value without explicit relocation is its own
   *  relocation.
   */
  public TDF_RelocationTable(long selfRelocate) {
    this(OCCwrapJavaJNI.new_TDF_RelocationTable__SWIG_0(selfRelocate), true);
  }

  public TDF_RelocationTable() {
    this(OCCwrapJavaJNI.new_TDF_RelocationTable__SWIG_1(), true);
  }

  /**
   *  Sets <mySelfRelocate> to <selfRelocate>.
   * 
   *  This flag affects the HasRelocation method
   *  behavior like this:
   * 
   *  <mySelfRelocate> == False:
   * 
   *  If no relocation object is found in the map, a
   *  null object is returned
   * 
   *  <mySelfRelocate> == True:
   * 
   *  If no relocation object is found in the map, the
   *  method assumes the source object is relocation
   *  value; so the source object is returned as target
   *  object.
   */
  public void SelfRelocate(long selfRelocate) {
    OCCwrapJavaJNI.TDF_RelocationTable_SelfRelocate__SWIG_0(swigCPtr, this, selfRelocate);
  }

  /**
   *  Returns <mySelfRelocate>.
   */
  public long SelfRelocate() {
    return OCCwrapJavaJNI.TDF_RelocationTable_SelfRelocate__SWIG_1(swigCPtr, this);
  }

  public void AfterRelocate(long afterRelocate) {
    OCCwrapJavaJNI.TDF_RelocationTable_AfterRelocate__SWIG_0(swigCPtr, this, afterRelocate);
  }

  /**
   *  Returns <myAfterRelocate>.
   */
  public long AfterRelocate() {
    return OCCwrapJavaJNI.TDF_RelocationTable_AfterRelocate__SWIG_1(swigCPtr, this);
  }

  /**
   *  Sets the relocation value of <aSourceLabel> to
   *  <aTargetLabel>.
   */
  public void SetRelocation( TDF_Label  aSourceLabel,  TDF_Label  aTargetLabel) {
    OCCwrapJavaJNI.TDF_RelocationTable_SetRelocation__SWIG_0(swigCPtr, this, TDF_Label.getCPtr(aSourceLabel), aSourceLabel, TDF_Label.getCPtr(aTargetLabel), aTargetLabel);
  }

  /**
   *  Finds the relocation value of <aSourceLabel>
   *  and returns it into <aTargetLabel>.
   * 
   *  (See above SelfRelocate method for more
   *  explanation about the method behavior)
   */
  public long HasRelocation( TDF_Label  aSourceLabel, TDF_Label aTargetLabel) {
    return OCCwrapJavaJNI.TDF_RelocationTable_HasRelocation__SWIG_0(swigCPtr, this, TDF_Label.getCPtr(aSourceLabel), aSourceLabel, TDF_Label.getCPtr(aTargetLabel), aTargetLabel);
  }

  /**
   *  Sets the relocation value of <aSourceAttribute> to
   *  <aTargetAttribute>.
   */
  public void SetRelocation( TDF_Attribute  aSourceAttribute,  TDF_Attribute  aTargetAttribute) {
    OCCwrapJavaJNI.TDF_RelocationTable_SetRelocation__SWIG_1(swigCPtr, this,  TDF_Attribute.getCPtr(aSourceAttribute) , aSourceAttribute,  TDF_Attribute.getCPtr(aTargetAttribute) , aTargetAttribute);
  }

  /**
   *  Finds the relocation value of <aSourceAttribute>
   *  and returns it into <aTargetAttribute>.
   * 
   *  (See above SelfRelocate method for more
   *  explanation about the method behavior)
   */
  public long HasRelocation( TDF_Attribute  aSourceAttribute,  TDF_Attribute  aTargetAttribute) {
    return OCCwrapJavaJNI.TDF_RelocationTable_HasRelocation__SWIG_1(swigCPtr, this,  TDF_Attribute.getCPtr(aSourceAttribute) , aSourceAttribute,  TDF_Attribute.getCPtr(aTargetAttribute) , aTargetAttribute);
  }

  /**
   *  Sets the relocation value of <aSourceTransient> to
   *  <aTargetTransient>.
   */
  public void SetTransientRelocation( Standard_Transient  aSourceTransient,  Standard_Transient  aTargetTransient) {
    OCCwrapJavaJNI.TDF_RelocationTable_SetTransientRelocation(swigCPtr, this,  Standard_Transient.getCPtr(aSourceTransient) , aSourceTransient,  Standard_Transient.getCPtr(aTargetTransient) , aTargetTransient);
  }

  /**
   *  Finds the relocation value of <aSourceTransient>
   *  and returns it into <aTargetTransient>.
   * 
   *  (See above SelfRelocate method for more
   *  explanation about the method behavior)
   */
  public long HasTransientRelocation( Standard_Transient  aSourceTransient,  Standard_Transient  aTargetTransient) {
    return OCCwrapJavaJNI.TDF_RelocationTable_HasTransientRelocation(swigCPtr, this,  Standard_Transient.getCPtr(aSourceTransient) , aSourceTransient,  Standard_Transient.getCPtr(aTargetTransient) , aTargetTransient);
  }

  /**
   *  Clears the relocation dictionnary, but lets the
   *  self relocation flag to its current value.
   */
  public void Clear() {
    OCCwrapJavaJNI.TDF_RelocationTable_Clear(swigCPtr, this);
  }

  /**
   *  Fills <aLabelMap> with target relocation
   *  labels. <aLabelMap> is not cleared before use.
   */
  public void TargetLabelMap( TDF_LabelMap  aLabelMap) {
    OCCwrapJavaJNI.TDF_RelocationTable_TargetLabelMap(swigCPtr, this, TDF_LabelMap.getCPtr(aLabelMap), aLabelMap);
  }

  /**
   *  Fills <anAttributeMap> with target relocation
   *  attributes. <anAttributeMap> is not cleared before
   *  use.
   */
  public void TargetAttributeMap( TDF_AttributeMap  anAttributeMap) {
    OCCwrapJavaJNI.TDF_RelocationTable_TargetAttributeMap(swigCPtr, this, TDF_AttributeMap.getCPtr(anAttributeMap), anAttributeMap);
  }

  /**
   *  Returns <myLabelTable> to be used or updated.
   */
  public  TDF_LabelDataMap  LabelTable() {
    TDF_LabelDataMap ret = new TDF_LabelDataMap(OCCwrapJavaJNI.TDF_RelocationTable_LabelTable(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns <myAttributeTable> to be used or updated.
   */
  public  TDF_AttributeDataMap  AttributeTable() {
    TDF_AttributeDataMap ret = new TDF_AttributeDataMap(OCCwrapJavaJNI.TDF_RelocationTable_AttributeTable(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Dumps the relocation table.
   */
  public SWIGTYPE_p_Standard_OStream Dump(long dumpLabels, long dumpAttributes, long dumpTransients, SWIGTYPE_p_Standard_OStream anOS) {
    return new SWIGTYPE_p_Standard_OStream(OCCwrapJavaJNI.TDF_RelocationTable_Dump(swigCPtr, this, dumpLabels, dumpAttributes, dumpTransients, SWIGTYPE_p_Standard_OStream.getCPtr(anOS)), false);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDF_RelocationTable_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_RelocationTable_get_type_descriptor(), true );
  }

  public static  TDF_RelocationTable  DownCast( Standard_Transient  T) {
    return new TDF_RelocationTable ( OCCwrapJavaJNI.TDF_RelocationTable_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_RelocationTable_TypeOf(), true );
  }

}
