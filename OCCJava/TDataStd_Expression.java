package opencascade;

/**
 *  Expression attribute.
 *  ====================
 * 
 *  * Data Structure  of the Expression   is stored in a
 *  string and references to variables used by the string
 * 
 *  Warning:  To be consistent,  each  Variable  referenced by  the
 *  expression must have its equivalent in the string
 */
public class TDataStd_Expression extends TDF_Attribute {
  TDataStd_Expression(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static  TDataStd_Expression  Set( TDF_Label  label) {
    return new TDataStd_Expression ( OCCwrapJavaJNI.TDataStd_Expression_Set(TDF_Label.getCPtr(label), label), true );
  }

  public TDataStd_Expression() {
    this(OCCwrapJavaJNI.new_TDataStd_Expression(), true);
  }

  /**
   *  build and return the expression name
   */
  public TCollection_ExtendedString Name() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.TDataStd_Expression_Name(swigCPtr, this), true);
  }

  public void SetExpression( TCollection_ExtendedString  E) {
    OCCwrapJavaJNI.TDataStd_Expression_SetExpression(swigCPtr, this, TCollection_ExtendedString.getCPtr(E), E);
  }

  public  TCollection_ExtendedString  GetExpression() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TDataStd_Expression_GetExpression(swigCPtr, this), true);
    return ret;
  }

  public  TDF_AttributeList  GetVariables() {
    TDF_AttributeList ret = new TDF_AttributeList(OCCwrapJavaJNI.TDataStd_Expression_GetVariables(swigCPtr, this), false, this);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataStd_Expression_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_Expression_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataStd_Expression_GetId(), true);
  }

  public static  TDataStd_Expression  DownCast( Standard_Transient  T) {
    return new TDataStd_Expression ( OCCwrapJavaJNI.TDataStd_Expression_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_Expression_TypeOf(), true );
  }

}
