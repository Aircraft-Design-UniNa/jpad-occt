package opencascade;

/**
 *  Allows you to define an explicit tree of labels
 *  which you can also edit.
 *  Without this class, the data structure cannot be fully edited.
 *  This service is required if for presentation
 *  purposes, you want to create an application with
 *  a tree which allows you to organize and link data
 *  as a function of application features.
 */
public class TDataStd_TreeNode extends TDF_Attribute {
  TDataStd_TreeNode(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  class  methods working on the node
   *  ===================================
   *  Returns true if the tree node T is found on the label L.
   *  Otherwise, false is returned.
   */
  public static long Find( TDF_Label  L,  TDataStd_TreeNode  T) {
    return OCCwrapJavaJNI.TDataStd_TreeNode_Find(TDF_Label.getCPtr(L), L,  TDataStd_TreeNode.getCPtr(T) , T);
  }

  public static  TDataStd_TreeNode  Set( TDF_Label  L) {
    return new TDataStd_TreeNode ( OCCwrapJavaJNI.TDataStd_TreeNode_Set__SWIG_0(TDF_Label.getCPtr(L), L), true );
  }

  public static  TDataStd_TreeNode  Set( TDF_Label  L,  Standard_GUID  ExplicitTreeID) {
    return new TDataStd_TreeNode ( OCCwrapJavaJNI.TDataStd_TreeNode_Set__SWIG_1(TDF_Label.getCPtr(L), L, Standard_GUID.getCPtr(ExplicitTreeID), ExplicitTreeID), true );
  }

  public TDataStd_TreeNode() {
    this(OCCwrapJavaJNI.new_TDataStd_TreeNode(), true);
  }

  /**
   *  Insert the TreeNode <Child> as last  child of <me>. If
   *  the insertion is successful <me> becomes the Father of <Child>.
   */
  public long Append( TDataStd_TreeNode  Child) {
    return OCCwrapJavaJNI.TDataStd_TreeNode_Append(swigCPtr, this,  TDataStd_TreeNode.getCPtr(Child) , Child);
  }

  /**
   *  Insert the   the TreeNode <Child>  as  first child of
   *  <me>. If the insertion is successful <me> becomes the Father of <Child>
   */
  public long Prepend( TDataStd_TreeNode  Child) {
    return OCCwrapJavaJNI.TDataStd_TreeNode_Prepend(swigCPtr, this,  TDataStd_TreeNode.getCPtr(Child) , Child);
  }

  /**
   *  Inserts the TreeNode  <Node> before <me>. If insertion is successful <me>
   *  and <Node> belongs to the same Father.
   */
  public long InsertBefore( TDataStd_TreeNode  Node) {
    return OCCwrapJavaJNI.TDataStd_TreeNode_InsertBefore(swigCPtr, this,  TDataStd_TreeNode.getCPtr(Node) , Node);
  }

  /**
   *  Inserts the TreeNode <Node>  after <me>. If insertion is successful  <me>
   *  and <Node> belongs to the same Father.
   */
  public long InsertAfter( TDataStd_TreeNode  Node) {
    return OCCwrapJavaJNI.TDataStd_TreeNode_InsertAfter(swigCPtr, this,  TDataStd_TreeNode.getCPtr(Node) , Node);
  }

  /**
   *  Removes this tree node attribute from its father
   *  node. The result is that this attribute becomes a root node.
   */
  public long Remove() {
    return OCCwrapJavaJNI.TDataStd_TreeNode_Remove(swigCPtr, this);
  }

  /**
   *  Returns the depth of this tree node in the overall tree node structure.
   *  In other words, the number of father tree nodes of this one is returned.
   */
  public int Depth() {
    return OCCwrapJavaJNI.TDataStd_TreeNode_Depth(swigCPtr, this);
  }

  /**
   *  Returns the number of child nodes.
   *  If <allLevels> is true, the method counts children of all levels
   *  (children of children ...)
   */
  public int NbChildren(long allLevels) {
    return OCCwrapJavaJNI.TDataStd_TreeNode_NbChildren__SWIG_0(swigCPtr, this, allLevels);
  }

  public int NbChildren() {
    return OCCwrapJavaJNI.TDataStd_TreeNode_NbChildren__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns true if this tree node attribute is an
   *  ascendant of of. In other words, if it is a father or
   *  the father of a father of of.
   */
  public long IsAscendant( TDataStd_TreeNode  of) {
    return OCCwrapJavaJNI.TDataStd_TreeNode_IsAscendant(swigCPtr, this,  TDataStd_TreeNode.getCPtr(of) , of);
  }

  /**
   *  Returns true if this tree node attribute is a
   *  descendant of of. In other words, if it is a child or
   *  the child of a child of of.
   */
  public long IsDescendant( TDataStd_TreeNode  of) {
    return OCCwrapJavaJNI.TDataStd_TreeNode_IsDescendant(swigCPtr, this,  TDataStd_TreeNode.getCPtr(of) , of);
  }

  /**
   *  Returns true if this tree node attribute is the
   *  ultimate father in the tree.
   */
  public long IsRoot() {
    return OCCwrapJavaJNI.TDataStd_TreeNode_IsRoot(swigCPtr, this);
  }

  public  TDataStd_TreeNode  Root() {
    return new TDataStd_TreeNode ( OCCwrapJavaJNI.TDataStd_TreeNode_Root(swigCPtr, this), true );
  }

  /**
   *  Returns true if this tree node attribute is a father of of.
   */
  public long IsFather( TDataStd_TreeNode  of) {
    return OCCwrapJavaJNI.TDataStd_TreeNode_IsFather(swigCPtr, this,  TDataStd_TreeNode.getCPtr(of) , of);
  }

  /**
   *  Returns true if this tree node attribute is a child of of.
   */
  public long IsChild( TDataStd_TreeNode  of) {
    return OCCwrapJavaJNI.TDataStd_TreeNode_IsChild(swigCPtr, this,  TDataStd_TreeNode.getCPtr(of) , of);
  }

  /**
   *  Returns true if this tree node attribute has a father tree node.
   */
  public long HasFather() {
    return OCCwrapJavaJNI.TDataStd_TreeNode_HasFather(swigCPtr, this);
  }

  public  TDataStd_TreeNode  Father() {
    return new TDataStd_TreeNode ( OCCwrapJavaJNI.TDataStd_TreeNode_Father(swigCPtr, this), true );
  }

  /**
   *  Returns true if this tree node attribute has a next tree node.
   */
  public long HasNext() {
    return OCCwrapJavaJNI.TDataStd_TreeNode_HasNext(swigCPtr, this);
  }

  public  TDataStd_TreeNode  Next() {
    return new TDataStd_TreeNode ( OCCwrapJavaJNI.TDataStd_TreeNode_Next(swigCPtr, this), true );
  }

  /**
   *  Returns true if this tree node attribute has a previous tree node.
   */
  public long HasPrevious() {
    return OCCwrapJavaJNI.TDataStd_TreeNode_HasPrevious(swigCPtr, this);
  }

  public  TDataStd_TreeNode  Previous() {
    return new TDataStd_TreeNode ( OCCwrapJavaJNI.TDataStd_TreeNode_Previous(swigCPtr, this), true );
  }

  /**
   *  Returns true if this tree node attribute has a first child tree node.
   */
  public long HasFirst() {
    return OCCwrapJavaJNI.TDataStd_TreeNode_HasFirst(swigCPtr, this);
  }

  public  TDataStd_TreeNode  First() {
    return new TDataStd_TreeNode ( OCCwrapJavaJNI.TDataStd_TreeNode_First(swigCPtr, this), true );
  }

  /**
   *  Returns true if this tree node attribute has a last child tree node.
   */
  public long HasLast() {
    return OCCwrapJavaJNI.TDataStd_TreeNode_HasLast(swigCPtr, this);
  }

  public  TDataStd_TreeNode  Last() {
    return new TDataStd_TreeNode ( OCCwrapJavaJNI.TDataStd_TreeNode_Last(swigCPtr, this), true );
  }

  public  TDataStd_TreeNode  FindLast() {
    return new TDataStd_TreeNode ( OCCwrapJavaJNI.TDataStd_TreeNode_FindLast(swigCPtr, this), true );
  }

  public void SetTreeID( Standard_GUID  explicitID) {
    OCCwrapJavaJNI.TDataStd_TreeNode_SetTreeID(swigCPtr, this, Standard_GUID.getCPtr(explicitID), explicitID);
  }

  public void SetFather( TDataStd_TreeNode  F) {
    OCCwrapJavaJNI.TDataStd_TreeNode_SetFather(swigCPtr, this,  TDataStd_TreeNode.getCPtr(F) , F);
  }

  public void SetNext( TDataStd_TreeNode  F) {
    OCCwrapJavaJNI.TDataStd_TreeNode_SetNext(swigCPtr, this,  TDataStd_TreeNode.getCPtr(F) , F);
  }

  public void SetPrevious( TDataStd_TreeNode  F) {
    OCCwrapJavaJNI.TDataStd_TreeNode_SetPrevious(swigCPtr, this,  TDataStd_TreeNode.getCPtr(F) , F);
  }

  public void SetFirst( TDataStd_TreeNode  F) {
    OCCwrapJavaJNI.TDataStd_TreeNode_SetFirst(swigCPtr, this,  TDataStd_TreeNode.getCPtr(F) , F);
  }

  /**
   *  TreeNode callback:
   *  ==================
   */
  public void SetLast( TDataStd_TreeNode  F) {
    OCCwrapJavaJNI.TDataStd_TreeNode_SetLast(swigCPtr, this,  TDataStd_TreeNode.getCPtr(F) , F);
  }

  /**
   *  Disconnect the TreeNode, if necessary.
   */
  public long BeforeUndo( TDF_AttributeDelta  anAttDelta, long forceIt) {
    return OCCwrapJavaJNI.TDataStd_TreeNode_BeforeUndo__SWIG_0(swigCPtr, this,  TDF_AttributeDelta.getCPtr(anAttDelta) , anAttDelta, forceIt);
  }

  public long BeforeUndo( TDF_AttributeDelta  anAttDelta) {
    return OCCwrapJavaJNI.TDataStd_TreeNode_BeforeUndo__SWIG_1(swigCPtr, this,  TDF_AttributeDelta.getCPtr(anAttDelta) , anAttDelta);
  }

  /**
   *  Reconnect the TreeNode, if necessary.
   *  Implementation of Attribute methods:
   *  ===================================
   */
  public long AfterUndo( TDF_AttributeDelta  anAttDelta, long forceIt) {
    return OCCwrapJavaJNI.TDataStd_TreeNode_AfterUndo__SWIG_0(swigCPtr, this,  TDF_AttributeDelta.getCPtr(anAttDelta) , anAttDelta, forceIt);
  }

  public long AfterUndo( TDF_AttributeDelta  anAttDelta) {
    return OCCwrapJavaJNI.TDataStd_TreeNode_AfterUndo__SWIG_1(swigCPtr, this,  TDF_AttributeDelta.getCPtr(anAttDelta) , anAttDelta);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataStd_TreeNode_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_TreeNode_get_type_descriptor(), true );
  }

  public static Standard_GUID GetDefaultTreeId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataStd_TreeNode_GetDefaultTreeId(), true);
  }

  public static  TDataStd_TreeNode  DownCast( Standard_Transient  T) {
    return new TDataStd_TreeNode ( OCCwrapJavaJNI.TDataStd_TreeNode_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_TreeNode_TypeOf(), true );
  }

}
