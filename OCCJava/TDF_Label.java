package opencascade;

/**
 *  This class provides basic operations  to define
 *  a label in a data structure.
 *  A label is a feature in the feature hierarchy. A
 *  label is always connected to a Data from TDF.
 *  To a label is attached attributes containing the
 *  software components information.
 * 
 *  Label information:
 * 
 *  It is possible to know the tag, the father, the
 *  depth in the tree of the label, if the label is
 *  root, null or equal to another label.
 * 
 *  Comfort methods:
 *  Some methods useful on a label.
 * 
 *  Attributes:
 * 
 *  It is possible to get an attribute in accordance
 *  to an ID, or the yougest previous version of a
 *  current attribute.
 */
public class TDF_Label {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_Label(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_Label(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_Label obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (TDF_Label ptr) { Ptr = ptr; }
    public TDF_Label AsReference () { return Ptr; }
    public TDF_Label AsCopy () { return Ptr.MakeCopy(); }
    public TDF_Label Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_Label(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs an empty label object.
   */
  public TDF_Label() {
    this(OCCwrapJavaJNI.new_TDF_Label(), true);
  }

  /**
   *  Nullifies the label.
   */
  public void Nullify() {
    OCCwrapJavaJNI.TDF_Label_Nullify(swigCPtr, this);
  }

  public  TDF_Data  Data() {
    return new TDF_Data ( OCCwrapJavaJNI.TDF_Label_Data(swigCPtr, this), true );
  }

  /**
   *  Returns the tag of the label.
   *  This is the integer assigned randomly to a label
   *  in a data framework. This integer is used to
   *  identify this label in an entry.
   */
  public int Tag() {
    return OCCwrapJavaJNI.TDF_Label_Tag(swigCPtr, this);
  }

  /**
   *  Returns the label father. This label may be null
   *  if the label is root.
   */
  public TDF_Label Father() {
    return new TDF_Label(OCCwrapJavaJNI.TDF_Label_Father(swigCPtr, this), true);
  }

  /**
   *  Returns True if the <aLabel> is null, i.e. it has
   *  not been included in the data framework.
   */
  public long IsNull() {
    return OCCwrapJavaJNI.TDF_Label_IsNull(swigCPtr, this);
  }

  /**
   *  Sets or unsets <me> and all its descendants as
   *  imported label, according to <aStatus>.
   */
  public void Imported(long aStatus) {
    OCCwrapJavaJNI.TDF_Label_Imported(swigCPtr, this, aStatus);
  }

  /**
   *  Returns True if the <aLabel> is imported.
   */
  public long IsImported() {
    return OCCwrapJavaJNI.TDF_Label_IsImported(swigCPtr, this);
  }

  /**
   *  Returns True if the <aLabel> is equal to me (same
   *  LabelNode*).
   */
  public long IsEqual( TDF_Label  aLabel) {
    return OCCwrapJavaJNI.TDF_Label_IsEqual(swigCPtr, this, TDF_Label.getCPtr(aLabel), aLabel);
  }

  public long IsDifferent( TDF_Label  aLabel) {
    return OCCwrapJavaJNI.TDF_Label_IsDifferent(swigCPtr, this, TDF_Label.getCPtr(aLabel), aLabel);
  }

  public long IsRoot() {
    return OCCwrapJavaJNI.TDF_Label_IsRoot(swigCPtr, this);
  }

  /**
   *  Returns true if <me> owns an attribute with <anID> as ID.
   */
  public long IsAttribute( Standard_GUID  anID) {
    return OCCwrapJavaJNI.TDF_Label_IsAttribute(swigCPtr, this, Standard_GUID.getCPtr(anID), anID);
  }

  /**
   *  Adds an Attribute  to the current label. Raises if
   *  there is already one.
   */
  public void AddAttribute( TDF_Attribute  anAttribute, long append) {
    OCCwrapJavaJNI.TDF_Label_AddAttribute__SWIG_0(swigCPtr, this,  TDF_Attribute.getCPtr(anAttribute) , anAttribute, append);
  }

  public void AddAttribute( TDF_Attribute  anAttribute) {
    OCCwrapJavaJNI.TDF_Label_AddAttribute__SWIG_1(swigCPtr, this,  TDF_Attribute.getCPtr(anAttribute) , anAttribute);
  }

  /**
   *  Forgets an  Attribute   from the  current  label,
   *  setting its   forgotten status true and  its valid
   *  status false. Raises if   the attribute is not in
   *  the structure.
   */
  public void ForgetAttribute( TDF_Attribute  anAttribute) {
    OCCwrapJavaJNI.TDF_Label_ForgetAttribute__SWIG_0(swigCPtr, this,  TDF_Attribute.getCPtr(anAttribute) , anAttribute);
  }

  /**
   *  Forgets the  Attribute of  GUID <aguid> from   the
   *  current label   . If the   attribute doesn't exist
   *  returns False. Otherwise returns True.
   */
  public long ForgetAttribute( Standard_GUID  aguid) {
    return OCCwrapJavaJNI.TDF_Label_ForgetAttribute__SWIG_1(swigCPtr, this, Standard_GUID.getCPtr(aguid), aguid);
  }

  /**
   *  Forgets all the attributes. Does it on also on the
   *  sub-labels if <clearChildren> is set to true. Of
   *  course, this method is compatible with Transaction
   *  & Delta mecanisms.
   */
  public void ForgetAllAttributes(long clearChildren) {
    OCCwrapJavaJNI.TDF_Label_ForgetAllAttributes__SWIG_0(swigCPtr, this, clearChildren);
  }

  public void ForgetAllAttributes() {
    OCCwrapJavaJNI.TDF_Label_ForgetAllAttributes__SWIG_1(swigCPtr, this);
  }

  /**
   *  Undo Forget action, setting its forgotten status
   *  false and its valid status true. Raises if the
   *  attribute is not in the structure.
   */
  public void ResumeAttribute( TDF_Attribute  anAttribute) {
    OCCwrapJavaJNI.TDF_Label_ResumeAttribute(swigCPtr, this,  TDF_Attribute.getCPtr(anAttribute) , anAttribute);
  }

  /**
   *  Finds an attribute of the current label, according
   *  to <anID>.
   *  If anAttribute is not a valid one, false is returned.
   * 
   *  The method returns True if found, False otherwise.
   * 
   *  A removed attribute cannot be found.
   */
  public long FindAttribute( Standard_GUID  anID,  TDF_Attribute  anAttribute) {
    return OCCwrapJavaJNI.TDF_Label_FindAttribute__SWIG_0(swigCPtr, this, Standard_GUID.getCPtr(anID), anID,  TDF_Attribute.getCPtr(anAttribute) , anAttribute);
  }

  public long FindAttribute( Standard_GUID  anID, int aTransaction,  TDF_Attribute  anAttribute) {
    return OCCwrapJavaJNI.TDF_Label_FindAttribute__SWIG_2(swigCPtr, this, Standard_GUID.getCPtr(anID), anID, aTransaction,  TDF_Attribute.getCPtr(anAttribute) , anAttribute);
  }

  /**
   *  Returns true if <me> or a DESCENDANT of <me> owns
   *  attributes not yet available in transaction 0. It
   *  means at least one of their attributes is new,
   *  modified or deleted.
   */
  public long MayBeModified() {
    return OCCwrapJavaJNI.TDF_Label_MayBeModified(swigCPtr, this);
  }

  /**
   *  Returns true if <me> owns attributes not yet
   *  available in transaction 0. It means at least one
   *  attribute is new, modified or deleted.
   */
  public long AttributesModified() {
    return OCCwrapJavaJNI.TDF_Label_AttributesModified(swigCPtr, this);
  }

  /**
   *  Returns true if this label has at least one attribute.
   */
  public long HasAttribute() {
    return OCCwrapJavaJNI.TDF_Label_HasAttribute(swigCPtr, this);
  }

  /**
   *  Returns the number of attributes.
   */
  public int NbAttributes() {
    return OCCwrapJavaJNI.TDF_Label_NbAttributes(swigCPtr, this);
  }

  /**
   *  Returns the depth of the label in the data framework.
   *  This corresponds to the number of fathers which
   *  this label has, and is used in determining
   *  whether a label is root, null or equivalent to another label.
   *  Exceptions:
   *  Standard_NullObject if this label is null. This is
   *  because a null object can have no depth.
   */
  public int Depth() {
    return OCCwrapJavaJNI.TDF_Label_Depth(swigCPtr, this);
  }

  /**
   *  Returns True if <me> is a descendant of
   *  <aLabel>. Attention: every label is its own
   *  descendant.
   */
  public long IsDescendant( TDF_Label  aLabel) {
    return OCCwrapJavaJNI.TDF_Label_IsDescendant(swigCPtr, this, TDF_Label.getCPtr(aLabel), aLabel);
  }

  /**
   *  Returns the root label Root of the data structure.
   *  This has a depth of 0.
   *  Exceptions:
   *  Standard_NullObject if this label is null. This is
   *  because a null object can have no depth.
   */
  public TDF_Label Root() {
    return new TDF_Label(OCCwrapJavaJNI.TDF_Label_Root(swigCPtr, this), true);
  }

  /**
   *  Returns true if this label has at least one child.
   */
  public long HasChild() {
    return OCCwrapJavaJNI.TDF_Label_HasChild(swigCPtr, this);
  }

  /**
   *  Returns the number of children.
   */
  public int NbChildren() {
    return OCCwrapJavaJNI.TDF_Label_NbChildren(swigCPtr, this);
  }

  /**
   *  Finds a child label having <aTag> as tag. Creates
   *  The tag aTag identifies the label which will be the parent.
   *  If create is true and no child label is found, a new one is created.
   *  Example:
   *  //creating a label with tag 10 at Root
   *  TDF_Label lab1 = aDF->Root().FindChild(10);
   *  //creating labels 7 and 2 on label 10
   *  TDF_Label lab2 = lab1.FindChild(7);
   *  TDF_Label lab3 = lab1.FindChild(2);
   */
  public TDF_Label FindChild(int aTag, long create) {
    return new TDF_Label(OCCwrapJavaJNI.TDF_Label_FindChild__SWIG_0(swigCPtr, this, aTag, create), true);
  }

  public TDF_Label FindChild(int aTag) {
    return new TDF_Label(OCCwrapJavaJNI.TDF_Label_FindChild__SWIG_1(swigCPtr, this, aTag), true);
  }

  /**
   *  Create  a new child   label of me  using autoamtic
   *  delivery tags provided by TagSource.
   */
  public TDF_Label NewChild() {
    return new TDF_Label(OCCwrapJavaJNI.TDF_Label_NewChild(swigCPtr, this), true);
  }

  /**
   *  Returns the current transaction index.
   */
  public int Transaction() {
    return OCCwrapJavaJNI.TDF_Label_Transaction(swigCPtr, this);
  }

  /**
   *  Returns true if node address of <me> is lower than
   *  <otherLabel> one. Used to quickly sort labels (not
   *  on entry criterion).
   * 
   *  -C++: inline
   */
  public long HasLowerNode( TDF_Label  otherLabel) {
    return OCCwrapJavaJNI.TDF_Label_HasLowerNode(swigCPtr, this, TDF_Label.getCPtr(otherLabel), otherLabel);
  }

  /**
   *  Returns true if node address of <me> is greater
   *  than <otherLabel> one. Used to quickly sort labels
   *  (not on entry criterion).
   * 
   *  -C++: inline
   */
  public long HasGreaterNode( TDF_Label  otherLabel) {
    return OCCwrapJavaJNI.TDF_Label_HasGreaterNode(swigCPtr, this, TDF_Label.getCPtr(otherLabel), otherLabel);
  }

  /**
   *  Dumps the minimum information about <me> on
   *  <aStream>.
   */
  public SWIGTYPE_p_Standard_OStream Dump(SWIGTYPE_p_Standard_OStream anOS) {
    return new SWIGTYPE_p_Standard_OStream(OCCwrapJavaJNI.TDF_Label_Dump(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(anOS)), false);
  }

  /**
   *  Dumps the label entry.
   */
  public void EntryDump(SWIGTYPE_p_Standard_OStream anOS) {
    OCCwrapJavaJNI.TDF_Label_EntryDump(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(anOS));
  }

}
