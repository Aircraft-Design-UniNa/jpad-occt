package opencascade;

/**
 *  Relation attribute.
 *  ==================
 * 
 *  *  Data Structure of  the  Expression is stored in a
 *  string and references to variables used by the string
 * 
 *  Warning:  To be consistent,  each  Variable  referenced by  the
 *  relation must have its equivalent in the string
 */
public class TDataStd_Relation extends TDF_Attribute {
  TDataStd_Relation(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static  TDataStd_Relation  Set( TDF_Label  label) {
    return new TDataStd_Relation ( OCCwrapJavaJNI.TDataStd_Relation_Set(TDF_Label.getCPtr(label), label), true );
  }

  public TDataStd_Relation() {
    this(OCCwrapJavaJNI.new_TDataStd_Relation(), true);
  }

  /**
   *  build and return the relation name
   */
  public TCollection_ExtendedString Name() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.TDataStd_Relation_Name(swigCPtr, this), true);
  }

  public void SetRelation( TCollection_ExtendedString  E) {
    OCCwrapJavaJNI.TDataStd_Relation_SetRelation(swigCPtr, this, TCollection_ExtendedString.getCPtr(E), E);
  }

  public  TCollection_ExtendedString  GetRelation() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TDataStd_Relation_GetRelation(swigCPtr, this), true);
    return ret;
  }

  public  TDF_AttributeList  GetVariables() {
    TDF_AttributeList ret = new TDF_AttributeList(OCCwrapJavaJNI.TDataStd_Relation_GetVariables(swigCPtr, this), false, this);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataStd_Relation_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_Relation_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataStd_Relation_GetId(), true);
  }

  public static  TDataStd_Relation  DownCast( Standard_Transient  T) {
    return new TDataStd_Relation ( OCCwrapJavaJNI.TDataStd_Relation_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_Relation_TypeOf(), true );
  }

}
