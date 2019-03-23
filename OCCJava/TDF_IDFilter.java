package opencascade;

/**
 *  This class offers filtering services around an ID list.
 */
public class TDF_IDFilter {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_IDFilter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_IDFilter(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_IDFilter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_IDFilter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an ID/attribute filter based on an ID
   *  list. The default mode is "ignore all but...".
   * 
   *  This filter has 2 working mode: keep and ignore.
   * 
   *  Ignore/Exclusive mode: all IDs are ignored except
   *  these set to be kept, using Keep(). Of course, it
   *  is possible set an kept ID to be ignored using
   *  Ignore().
   * 
   *  Keep/Inclusive mode: all IDs are kept except these
   *  set to be ignored, using Ignore(). Of course, it
   *  is possible set an ignored ID to be kept using
   *  Keep().
   */
  public TDF_IDFilter(long ignoreMode) {
    this(OCCwrapJavaJNI.new_TDF_IDFilter__SWIG_0(ignoreMode), true);
  }

  /**
   *  Private, to forbid implicit or hidden accesses to
   *  the copy constructor.
   */
  public TDF_IDFilter() {
    this(OCCwrapJavaJNI.new_TDF_IDFilter__SWIG_1(), true);
  }

  /**
   *  The list of ID is cleared and the filter mode is
   *  set to ignore mode if <keep> is true; false
   *  otherwise.
   */
  public void IgnoreAll(long ignore) {
    OCCwrapJavaJNI.TDF_IDFilter_IgnoreAll__SWIG_0(swigCPtr, this, ignore);
  }

  /**
   *  Returns true is the mode is set to "ignore all
   *  but...".
   */
  public long IgnoreAll() {
    return OCCwrapJavaJNI.TDF_IDFilter_IgnoreAll__SWIG_1(swigCPtr, this);
  }

  /**
   *  An attribute with <anID> as ID is to be kept and
   *  the filter will answer true to the question
   *  IsKept(<anID>).
   */
  public void Keep( Standard_GUID  anID) {
    OCCwrapJavaJNI.TDF_IDFilter_Keep__SWIG_0(swigCPtr, this, Standard_GUID.getCPtr(anID), anID);
  }

  /**
   *  Attributes with ID owned by <anIDList> are to be kept and
   *  the filter will answer true to the question
   *  IsKept(<anID>) with ID from <anIDList>.
   */
  public void Keep( TDF_IDList  anIDList) {
    OCCwrapJavaJNI.TDF_IDFilter_Keep__SWIG_1(swigCPtr, this, TDF_IDList.getCPtr(anIDList), anIDList);
  }

  /**
   *  An attribute with <anID> as ID is to be ignored and
   *  the filter will answer false to the question
   *  IsKept(<anID>).
   */
  public void Ignore( Standard_GUID  anID) {
    OCCwrapJavaJNI.TDF_IDFilter_Ignore__SWIG_0(swigCPtr, this, Standard_GUID.getCPtr(anID), anID);
  }

  /**
   *  Attributes with ID owned by <anIDList> are to be
   *  ignored and the filter will answer false to the
   *  question IsKept(<anID>) with ID from <anIDList>.
   */
  public void Ignore( TDF_IDList  anIDList) {
    OCCwrapJavaJNI.TDF_IDFilter_Ignore__SWIG_1(swigCPtr, this, TDF_IDList.getCPtr(anIDList), anIDList);
  }

  /**
   *  Returns true if the ID is to be kept.
   */
  public long IsKept( Standard_GUID  anID) {
    return OCCwrapJavaJNI.TDF_IDFilter_IsKept__SWIG_0(swigCPtr, this, Standard_GUID.getCPtr(anID), anID);
  }

  /**
   *  Returns true if the attribute is to be kept.
   */
  public long IsKept( TDF_Attribute  anAtt) {
    return OCCwrapJavaJNI.TDF_IDFilter_IsKept__SWIG_1(swigCPtr, this,  TDF_Attribute.getCPtr(anAtt) , anAtt);
  }

  /**
   *  Returns true if the ID is to be ignored.
   */
  public long IsIgnored( Standard_GUID  anID) {
    return OCCwrapJavaJNI.TDF_IDFilter_IsIgnored__SWIG_0(swigCPtr, this, Standard_GUID.getCPtr(anID), anID);
  }

  /**
   *  Returns true if the attribute is to be ignored.
   */
  public long IsIgnored( TDF_Attribute  anAtt) {
    return OCCwrapJavaJNI.TDF_IDFilter_IsIgnored__SWIG_1(swigCPtr, this,  TDF_Attribute.getCPtr(anAtt) , anAtt);
  }

  /**
   *  Copies the list of ID to be kept or ignored in
   *  <anIDList>. <anIDList> is cleared before use.
   */
  public void IDList( TDF_IDList  anIDList) {
    OCCwrapJavaJNI.TDF_IDFilter_IDList(swigCPtr, this, TDF_IDList.getCPtr(anIDList), anIDList);
  }

  /**
   *  Copies into <me> the contents of
   *  <fromFilter>. <me> is cleared before copy.
   */
  public void Copy( TDF_IDFilter  fromFilter) {
    OCCwrapJavaJNI.TDF_IDFilter_Copy(swigCPtr, this, TDF_IDFilter.getCPtr(fromFilter), fromFilter);
  }

  /**
   *  Writes the contents of <me> to <OS>.
   */
  public void Dump(SWIGTYPE_p_Standard_OStream anOS) {
    OCCwrapJavaJNI.TDF_IDFilter_Dump(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(anOS));
  }

}
