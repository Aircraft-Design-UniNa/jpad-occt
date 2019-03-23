package opencascade;

/**
 *  A class each application has to implement. It is
 *  used to contain the application data.
 *  This abstract class, alongwith Label,
 *  is one of the cornerstones of Model Editor.
 *  The groundwork is to define the root of
 *  information. This information is to be
 *  attached to a Label, and could be of any of
 *  the following types:
 *  -   a feature
 *  -   a constraint
 *  -   a comment
 * 
 *  Contents:
 *  ---------
 * 
 *  Each software component who'd like to attach its
 *  own information to a label has to inherit from
 *  this class and has to add its own information as
 *  fields of this new class.
 * 
 *  Identification:
 *  ---------------
 * 
 *  An attribute can be identified by its ID. Every
 *  attributes used with the same meaning (for
 *  exemple: Integer, String, Topology...) have the
 *  same worldwide unique ID.
 * 
 *  Addition:
 *  ---------
 * 
 *  An attribute can be added to a label only if there
 *  is no attribute yet with the same ID. Call-back
 *  methods are offered, called automatically before
 *  and after the addition action.
 * 
 *  Removal:
 *  --------
 * 
 *  An attribute can be removed from a label only if
 *  there is an attribute yet with the same
 *  ID. Call-back methods are offered, called
 *  automatically before and after the removal
 *  action. A removed attribute cannot be found
 *  again. After a removal, only an addition of an
 *  attribute with the sane ID is possible (no
 *  backup...).
 * 
 *  Modification & Transaction:
 *  ---------------------------
 * 
 *  An attribute can be backuped before a
 *  modification. Only one backup attribute by
 *  transaction is possible. The modification can be
 *  forgotten (abort transaction) or validated (commit
 *  transaction).
 * 
 *  BackupCopy and restore are methods used by the backup or
 *  abort transaction actions. BackupCopy is called by
 *  Backup to generate an attribute with the same
 *  contents as the current one. Restore is called
 *  when aborting a transaction to transfer the
 *  backuped contents into the current
 *  attribute. These methods must be implemented by
 *  end use inheriting classes.
 * 
 *  A standard implementation of BackupCopy is provided, but
 *  it is not necessary a good one for any use.
 * 
 *  Copy use methods:
 *  -----------------
 * 
 *  Paste and NewEmpty methods are used by the copy
 *  algorithms. The goal of "Paste" is to transfer an
 *  attribute new contents into another attribute. The
 *  goal of "NewEmpty" is to create an attribute
 *  whithout contents, to be further filled with the
 *  new contents of another one. These 2 methods must
 *  be implemented by end use inheriting classes.
 * 
 *  AttributeDelta:
 *  ---------------
 * 
 *  An AttributeDelta is the difference between to
 *  attribute values states.  These methods must be
 *  implemented by end use inheriting classes, to
 *  profit from the delta services.
 */
public class TDF_Attribute extends Standard_Transient {
  TDF_Attribute(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns the ID of the attribute.
   */
  public  Standard_GUID  ID() {
    Standard_GUID ret = new Standard_GUID(OCCwrapJavaJNI.TDF_Attribute_ID(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Sets specific ID of the attribute (supports several attributes 
   *  of one type at the same label feature).
   */
  public void SetID( Standard_GUID  arg0) {
    OCCwrapJavaJNI.TDF_Attribute_SetID__SWIG_0(swigCPtr, this, Standard_GUID.getCPtr(arg0), arg0);
  }

  /**
   *  Sets default ID defined in nested class (to be used for attributes having User ID feature).
   */
  public void SetID() {
    OCCwrapJavaJNI.TDF_Attribute_SetID__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns   the   label to which  the   attribute is
   *  attached. If the  label is not  included in a  DF,
   *  the label is null. See Label.
   *  Warning
   *  If the label is not included in a data
   *  framework, it is null.
   *  This function should not be redefined inline.
   */
  public TDF_Label Label() {
    return new TDF_Label(OCCwrapJavaJNI.TDF_Attribute_Label(swigCPtr, this), true);
  }

  /**
   *  Returns the transaction index in which the
   *  attribute has been created or modified.
   */
  public int Transaction() {
    return OCCwrapJavaJNI.TDF_Attribute_Transaction(swigCPtr, this);
  }

  /**
   *  Returns the upper transaction index until which
   *  the attribute is/was valid. This number may
   *  vary. A removed attribute validity range is
   *  reduced to its transaction index.
   */
  public int UntilTransaction() {
    return OCCwrapJavaJNI.TDF_Attribute_UntilTransaction(swigCPtr, this);
  }

  /**
   *  Returns true if the attribute is valid; i.e. not a
   *  backuped or removed one.
   */
  public long IsValid() {
    return OCCwrapJavaJNI.TDF_Attribute_IsValid(swigCPtr, this);
  }

  /**
   *  Returns true if the attribute has no backup
   */
  public long IsNew() {
    return OCCwrapJavaJNI.TDF_Attribute_IsNew(swigCPtr, this);
  }

  /**
   *  Returns true if the attribute forgotten status is
   *  set.
   * 
   *  ShortCut Methods concerning associated attributes
   *  =================================================
   */
  public long IsForgotten() {
    return OCCwrapJavaJNI.TDF_Attribute_IsForgotten(swigCPtr, this);
  }

  /**
   *  Returns true if it  exists an associated attribute
   *  of <me> with <anID> as ID.
   */
  public long IsAttribute( Standard_GUID  anID) {
    return OCCwrapJavaJNI.TDF_Attribute_IsAttribute(swigCPtr, this, Standard_GUID.getCPtr(anID), anID);
  }

  /**
   *  Finds an associated  attribute of  <me>, according
   *  to <anID>.  the returned <anAttribute> is a  valid
   *  one. The  method  returns  True if   found,  False
   *  otherwise.   A removed attribute  cannot be found using
   *  this  method.
   */
  public long FindAttribute( Standard_GUID  anID,  TDF_Attribute  anAttribute) {
    return OCCwrapJavaJNI.TDF_Attribute_FindAttribute(swigCPtr, this, Standard_GUID.getCPtr(anID), anID,  TDF_Attribute.getCPtr(anAttribute) , anAttribute);
  }

  /**
   *  Adds   an   Attribute <other>  to  the   label  of
   *  <me>.Raises if there is  already  one of the same
   *  GUID fhan <other>.
   */
  public void AddAttribute( TDF_Attribute  other) {
    OCCwrapJavaJNI.TDF_Attribute_AddAttribute(swigCPtr, this,  TDF_Attribute.getCPtr(other) , other);
  }

  /**
   *  Forgets  the Attribute of  GUID <aguid> associated
   *  to the label of <me>. Be  carefull that if <me> is
   *  the attribute of <guid>, <me> will have a null label
   *  after this call.  If  the attribute doesn't  exist
   *  returns False. Otherwise returns True.
   */
  public long ForgetAttribute( Standard_GUID  aguid) {
    return OCCwrapJavaJNI.TDF_Attribute_ForgetAttribute(swigCPtr, this, Standard_GUID.getCPtr(aguid), aguid);
  }

  /**
   *  Forgets all the  attributes attached to  the label
   *  of <me>.    Does   it   on  the  sub-labels   if
   *  <clearChildren> is set  to true.  Of  course, this
   *  method  is  compatible with Transaction  &  Delta
   *  mecanisms. Be carefull  that  if <me> will have a
   *  null label after this call
   */
  public void ForgetAllAttributes(long clearChildren) {
    OCCwrapJavaJNI.TDF_Attribute_ForgetAllAttributes__SWIG_0(swigCPtr, this, clearChildren);
  }

  public void ForgetAllAttributes() {
    OCCwrapJavaJNI.TDF_Attribute_ForgetAllAttributes__SWIG_1(swigCPtr, this);
  }

  /**
   *  Something to do after adding an Attribute to a label.
   */
  public void AfterAddition() {
    OCCwrapJavaJNI.TDF_Attribute_AfterAddition(swigCPtr, this);
  }

  /**
   *  Something to do before removing an Attribute from
   *  a label.
   */
  public void BeforeRemoval() {
    OCCwrapJavaJNI.TDF_Attribute_BeforeRemoval(swigCPtr, this);
  }

  /**
   *  Something to do before forgetting an Attribute to a
   *  label.
   */
  public void BeforeForget() {
    OCCwrapJavaJNI.TDF_Attribute_BeforeForget(swigCPtr, this);
  }

  /**
   *  Something to do after resuming an Attribute from
   *  a label.
   */
  public void AfterResume() {
    OCCwrapJavaJNI.TDF_Attribute_AfterResume(swigCPtr, this);
  }

  /**
   *  Something to do AFTER creation of an attribute by
   *  persistent-transient translation. The returned
   *  status says if AfterUndo has been performed (true)
   *  or if this callback must be called once again
   *  further (false). If <forceIt> is set to true, the
   *  method MUST perform and return true. Does nothing
   *  by default and returns true.
   */
  public long AfterRetrieval(long forceIt) {
    return OCCwrapJavaJNI.TDF_Attribute_AfterRetrieval__SWIG_0(swigCPtr, this, forceIt);
  }

  public long AfterRetrieval() {
    return OCCwrapJavaJNI.TDF_Attribute_AfterRetrieval__SWIG_1(swigCPtr, this);
  }

  /**
   *  Something to do before applying <anAttDelta>. The
   *  returned status says if AfterUndo has been
   *  performed (true) or if this callback must be
   *  called once again further (false). If <forceIt> is
   *  set to true, the method MUST perform and return
   *  true. Does nothing by default and returns true.
   */
  public long BeforeUndo( TDF_AttributeDelta  anAttDelta, long forceIt) {
    return OCCwrapJavaJNI.TDF_Attribute_BeforeUndo__SWIG_0(swigCPtr, this,  TDF_AttributeDelta.getCPtr(anAttDelta) , anAttDelta, forceIt);
  }

  public long BeforeUndo( TDF_AttributeDelta  anAttDelta) {
    return OCCwrapJavaJNI.TDF_Attribute_BeforeUndo__SWIG_1(swigCPtr, this,  TDF_AttributeDelta.getCPtr(anAttDelta) , anAttDelta);
  }

  /**
   *  Something to do after applying <anAttDelta>. The
   *  returned status says if AfterUndo has been
   *  performed (true) or if this callback must be
   *  called once again further (false). If <forceIt> is
   *  set to true, the method MUST perform and return
   *  true. Does nothing by default and returns true.
   */
  public long AfterUndo( TDF_AttributeDelta  anAttDelta, long forceIt) {
    return OCCwrapJavaJNI.TDF_Attribute_AfterUndo__SWIG_0(swigCPtr, this,  TDF_AttributeDelta.getCPtr(anAttDelta) , anAttDelta, forceIt);
  }

  public long AfterUndo( TDF_AttributeDelta  anAttDelta) {
    return OCCwrapJavaJNI.TDF_Attribute_AfterUndo__SWIG_1(swigCPtr, this,  TDF_AttributeDelta.getCPtr(anAttDelta) , anAttDelta);
  }

  /**
   *  A callback.
   *  By default does nothing.
   *  It is called by TDF_Data::CommitTransaction() method.
   */
  public void BeforeCommitTransaction() {
    OCCwrapJavaJNI.TDF_Attribute_BeforeCommitTransaction(swigCPtr, this);
  }

  /**
   *  Backups the attribute. The backuped attribute is
   *  flagged "Backuped" and not "Valid".
   * 
   *  The method does nothing:
   * 
   *  1) If the attribute transaction number is equal to
   *  the current transaction number (the attribute has
   *  already been backuped).
   * 
   *  2) If the attribute is not attached to a label.
   */
  public void Backup() {
    OCCwrapJavaJNI.TDF_Attribute_Backup(swigCPtr, this);
  }

  /**
   *  Returns true if the attribute backup status is
   *  set. This status is set/unset by the
   *  Backup() method.
   */
  public long IsBackuped() {
    return OCCwrapJavaJNI.TDF_Attribute_IsBackuped(swigCPtr, this);
  }

  public  TDF_Attribute  BackupCopy() {
    return new TDF_Attribute ( OCCwrapJavaJNI.TDF_Attribute_BackupCopy(swigCPtr, this), true );
  }

  /**
   *  Restores the backuped contents from <anAttribute>
   *  into this one. It is used when aborting a
   *  transaction.
   */
  public void Restore( TDF_Attribute  anAttribute) {
    OCCwrapJavaJNI.TDF_Attribute_Restore(swigCPtr, this,  TDF_Attribute.getCPtr(anAttribute) , anAttribute);
  }

  public  TDF_DeltaOnAddition  DeltaOnAddition() {
    return new TDF_DeltaOnAddition ( OCCwrapJavaJNI.TDF_Attribute_DeltaOnAddition(swigCPtr, this), true );
  }

  public  TDF_DeltaOnForget  DeltaOnForget() {
    return new TDF_DeltaOnForget ( OCCwrapJavaJNI.TDF_Attribute_DeltaOnForget(swigCPtr, this), true );
  }

  public  TDF_DeltaOnResume  DeltaOnResume() {
    return new TDF_DeltaOnResume ( OCCwrapJavaJNI.TDF_Attribute_DeltaOnResume(swigCPtr, this), true );
  }

  /**
   *  Applies a DeltaOnModification to <me>.
   */
  public  TDF_DeltaOnModification  DeltaOnModification( TDF_Attribute  anOldAttribute) {
    return new TDF_DeltaOnModification ( OCCwrapJavaJNI.TDF_Attribute_DeltaOnModification__SWIG_0(swigCPtr, this,  TDF_Attribute.getCPtr(anOldAttribute) , anOldAttribute), true );
  }

  public void DeltaOnModification( TDF_DeltaOnModification  aDelta) {
    OCCwrapJavaJNI.TDF_Attribute_DeltaOnModification__SWIG_1(swigCPtr, this,  TDF_DeltaOnModification.getCPtr(aDelta) , aDelta);
  }

  public  TDF_DeltaOnRemoval  DeltaOnRemoval() {
    return new TDF_DeltaOnRemoval ( OCCwrapJavaJNI.TDF_Attribute_DeltaOnRemoval(swigCPtr, this), true );
  }

  public  TDF_Attribute  NewEmpty() {
    return new TDF_Attribute ( OCCwrapJavaJNI.TDF_Attribute_NewEmpty(swigCPtr, this), true );
  }

  /**
   *  This method is different from the "Copy" one,
   *  because it is used when copying an attribute from
   *  a source structure into a target structure. This
   *  method may paste the contents of <me> into
   *  <intoAttribute>.
   * 
   *  The given pasted attribute can be full or empty of
   *  its contents. But don't make a NEW! Just set the
   *  contents!
   * 
   *  It is possible to use <aRelocationTable> to
   *  get/set the relocation value of a source
   *  attribute.
   */
  public void Paste( TDF_Attribute  intoAttribute,  TDF_RelocationTable  aRelocationTable) {
    OCCwrapJavaJNI.TDF_Attribute_Paste(swigCPtr, this,  TDF_Attribute.getCPtr(intoAttribute) , intoAttribute,  TDF_RelocationTable.getCPtr(aRelocationTable) , aRelocationTable);
  }

  /**
   *  Adds the first level referenced attributes and labels
   *  to <aDataSet>.
   * 
   *  For this, use the AddLabel or AddAttribute of
   *  DataSet.
   * 
   *  If there is none, do not implement the method.
   */
  public void References( TDF_DataSet  aDataSet) {
    OCCwrapJavaJNI.TDF_Attribute_References(swigCPtr, this,  TDF_DataSet.getCPtr(aDataSet) , aDataSet);
  }

  /**
   *  Dumps the minimum information about <me> on
   *  <aStream>.
   */
  public SWIGTYPE_p_Standard_OStream Dump(SWIGTYPE_p_Standard_OStream anOS) {
    return new SWIGTYPE_p_Standard_OStream(OCCwrapJavaJNI.TDF_Attribute_Dump(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(anOS)), false);
  }

  /**
   *  Forgets the attribute. <aTransaction> is the
   *  current transaction in which the forget is done. A
   *  forgotten attribute is also flagged not "Valid".
   * 
   *  A forgotten attribute is invisible. Set also the
   *  "Valid" status to False. Obvioulsy, DF cannot
   *  empty an attribute (this has a semantic
   *  signification), but can remove it from the
   *  structure. So, a forgotten attribute is NOT an empty
   *  one, but a soon DEAD one.
   * 
   *  Should be private.
   */
  public void Forget(int aTransaction) {
    OCCwrapJavaJNI.TDF_Attribute_Forget(swigCPtr, this, aTransaction);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDF_Attribute_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_Attribute_get_type_descriptor(), true );
  }

  public static  TDF_Attribute  DownCast( Standard_Transient  T) {
    return new TDF_Attribute ( OCCwrapJavaJNI.TDF_Attribute_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_Attribute_TypeOf(), true );
  }

}
