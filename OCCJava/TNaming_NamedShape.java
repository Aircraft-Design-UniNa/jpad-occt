package opencascade;

/**
 *  The basis to define an attribute for the storage of
 *  topology and naming data.
 *  This attribute contains two parts:
 *  -   The type of evolution, a term of the
 *  enumeration TNaming_Evolution
 *  -   A list of pairs of shapes called the "old"
 *  shape and the "new" shape. The meaning
 *  depends on the type of evolution.
 */
public class TNaming_NamedShape extends TDF_Attribute {
  TNaming_NamedShape(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TNaming_NamedShape() {
    this(OCCwrapJavaJNI.new_TNaming_NamedShape(), true);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TNaming_NamedShape_IsEmpty(swigCPtr, this);
  }

  /**
   *  Returns the shapes contained in <NS>. Returns a null
   *  shape if IsEmpty.
   */
  public TopoDS_Shape Get() {
    return new TopoDS_Shape(OCCwrapJavaJNI.TNaming_NamedShape_Get(swigCPtr, this), true);
  }

  /**
   *  Returns the Evolution of the attribute.
   */
  public TNaming_Evolution Evolution() {
    return TNaming_Evolution.swigToEnum(OCCwrapJavaJNI.TNaming_NamedShape_Evolution(swigCPtr, this));
  }

  /**
   *  Returns the Version of the attribute.
   */
  public int Version() {
    return OCCwrapJavaJNI.TNaming_NamedShape_Version(swigCPtr, this);
  }

  /**
   *  Set the Version of the attribute.
   */
  public void SetVersion(int version) {
    OCCwrapJavaJNI.TNaming_NamedShape_SetVersion(swigCPtr, this, version);
  }

  public void Clear() {
    OCCwrapJavaJNI.TNaming_NamedShape_Clear(swigCPtr, this);
  }

  /**
   *  Applies a DeltaOnModification to <me>.
   */
  public  TDF_DeltaOnModification  DeltaOnModification( TDF_Attribute  anOldAttribute) {
    return new TDF_DeltaOnModification ( OCCwrapJavaJNI.TNaming_NamedShape_DeltaOnModification__SWIG_0(swigCPtr, this,  TDF_Attribute.getCPtr(anOldAttribute) , anOldAttribute), true );
  }

  public void DeltaOnModification( TDF_DeltaOnModification  aDelta) {
    OCCwrapJavaJNI.TNaming_NamedShape_DeltaOnModification__SWIG_1(swigCPtr, this,  TDF_DeltaOnModification.getCPtr(aDelta) , aDelta);
  }

  /**
   *  Something to do before applying <anAttDelta>
   */
  public long BeforeUndo( TDF_AttributeDelta  anAttDelta, long forceIt) {
    return OCCwrapJavaJNI.TNaming_NamedShape_BeforeUndo__SWIG_0(swigCPtr, this,  TDF_AttributeDelta.getCPtr(anAttDelta) , anAttDelta, forceIt);
  }

  public long BeforeUndo( TDF_AttributeDelta  anAttDelta) {
    return OCCwrapJavaJNI.TNaming_NamedShape_BeforeUndo__SWIG_1(swigCPtr, this,  TDF_AttributeDelta.getCPtr(anAttDelta) , anAttDelta);
  }

  /**
   *  Something to do after applying <anAttDelta>.
   */
  public long AfterUndo( TDF_AttributeDelta  anAttDelta, long forceIt) {
    return OCCwrapJavaJNI.TNaming_NamedShape_AfterUndo__SWIG_0(swigCPtr, this,  TDF_AttributeDelta.getCPtr(anAttDelta) , anAttDelta, forceIt);
  }

  public long AfterUndo( TDF_AttributeDelta  anAttDelta) {
    return OCCwrapJavaJNI.TNaming_NamedShape_AfterUndo__SWIG_1(swigCPtr, this,  TDF_AttributeDelta.getCPtr(anAttDelta) , anAttDelta);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TNaming_NamedShape_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TNaming_NamedShape_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TNaming_NamedShape_GetId(), true);
  }

  public static  TNaming_NamedShape  DownCast( Standard_Transient  T) {
    return new TNaming_NamedShape ( OCCwrapJavaJNI.TNaming_NamedShape_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TNaming_NamedShape_TypeOf(), true );
  }

}
