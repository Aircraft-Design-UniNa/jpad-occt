package opencascade;

/**
 *  Variable attribute.
 *  ==================
 * 
 *  * A variable is  associated to a TDataStd_Real (which
 *  contains its    current  value) and  a   TDataStd_Name
 *  attribute (which  contains  its name).  It  contains a
 *  constant flag, and a Unit
 * 
 *  * An  expression may  be assigned  to a variable.   In
 *  thatcase the expression  is handled by the  associated
 *  Expression Attribute  and the Variable returns True to
 *  the method <IsAssigned>.
 */
public class TDataStd_Variable extends TDF_Attribute {
  TDataStd_Variable(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  retrieve or create  the associated real attribute  and
   *  set the  value  <value>.
   */
  public static  TDataStd_Variable  Set( TDF_Label  label) {
    return new TDataStd_Variable ( OCCwrapJavaJNI.TDataStd_Variable_Set__SWIG_0(TDF_Label.getCPtr(label), label), true );
  }

  public TDataStd_Variable() {
    this(OCCwrapJavaJNI.new_TDataStd_Variable(), true);
  }

  /**
   *  set or change the name  of the variable, in myUnknown
   *  and my associated Name attribute.
   */
  public void Name( TCollection_ExtendedString  string) {
    OCCwrapJavaJNI.TDataStd_Variable_Name__SWIG_0(swigCPtr, this, TCollection_ExtendedString.getCPtr(string), string);
  }

  /**
   *  returns    string   stored  in   the  associated  Name
   *  attribute.
   */
  public  TCollection_ExtendedString  Name() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TDataStd_Variable_Name__SWIG_1(swigCPtr, this), true);
    return ret;
  }

  public void Set(double value) {
    OCCwrapJavaJNI.TDataStd_Variable_Set__SWIG_1(swigCPtr, this, value);
  }

  public void Set(double value, TDataStd_RealEnum dimension) {
    OCCwrapJavaJNI.TDataStd_Variable_Set__SWIG_2(swigCPtr, this, value, dimension.swigValue());
  }

  /**
   *  returns True if a Real attribute is associated.
   */
  public long IsValued() {
    return OCCwrapJavaJNI.TDataStd_Variable_IsValued(swigCPtr, this);
  }

  /**
   *  returns value stored in associated Real attribute.
   */
  public double Get() {
    return OCCwrapJavaJNI.TDataStd_Variable_Get(swigCPtr, this);
  }

  public  TDataStd_Real  Real() {
    return new TDataStd_Real ( OCCwrapJavaJNI.TDataStd_Variable_Real(swigCPtr, this), true );
  }

  /**
   *  returns True if an Expression attribute is associated.
   *  create(if doesn't exist), set and returns the assigned
   *  expression attribute.
   */
  public long IsAssigned() {
    return OCCwrapJavaJNI.TDataStd_Variable_IsAssigned(swigCPtr, this);
  }

  public  TDataStd_Expression  Assign() {
    return new TDataStd_Expression ( OCCwrapJavaJNI.TDataStd_Variable_Assign(swigCPtr, this), true );
  }

  /**
   *  if <me> is  assigned delete the associated  expression
   *  attribute.
   */
  public void Desassign() {
    OCCwrapJavaJNI.TDataStd_Variable_Desassign(swigCPtr, this);
  }

  public  TDataStd_Expression  Expression() {
    return new TDataStd_Expression ( OCCwrapJavaJNI.TDataStd_Variable_Expression(swigCPtr, this), true );
  }

  /**
   *  shortcut for <Real()->IsCaptured()>
   */
  public long IsCaptured() {
    return OCCwrapJavaJNI.TDataStd_Variable_IsCaptured(swigCPtr, this);
  }

  /**
   *  A constant value is not modified by regeneration.
   */
  public long IsConstant() {
    return OCCwrapJavaJNI.TDataStd_Variable_IsConstant(swigCPtr, this);
  }

  public void Unit( TCollection_AsciiString  unit) {
    OCCwrapJavaJNI.TDataStd_Variable_Unit__SWIG_0(swigCPtr, this, TCollection_AsciiString.getCPtr(unit), unit);
  }

  /**
   *  to read/write fields
   *  ===================
   */
  public  TCollection_AsciiString  Unit() {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TDataStd_Variable_Unit__SWIG_1(swigCPtr, this), true);
    return ret;
  }

  /**
   *  if  <status> is   True, this  variable  will not   be
   *  modified by the solver.
   */
  public void Constant(long status) {
    OCCwrapJavaJNI.TDataStd_Variable_Constant(swigCPtr, this, status);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataStd_Variable_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_Variable_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataStd_Variable_GetId(), true);
  }

  public static  TDataStd_Variable  DownCast( Standard_Transient  T) {
    return new TDataStd_Variable ( OCCwrapJavaJNI.TDataStd_Variable_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_Variable_TypeOf(), true );
  }

}
