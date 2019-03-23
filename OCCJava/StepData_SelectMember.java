package opencascade;

/**
 *  The general form for a Select Member. A Select Member can,
 *  either define a value of a basic type (such as an integer)
 *  with an additional information : a name or list of names
 *  which precise the meaning of this value
 *  or be an alternate value in a select, which also accepts an
 *  entity (in this case, the name is not mandatory)
 * 
 *  Several sub-types of SelectMember are defined for integer and
 *  real value, plus an "universal" one for any, and one more to
 *  describe a select with several names
 * 
 *  It is also possible to define a specific subtype by redefining
 *  virtual method, then give a better control
 * 
 *  Remark : this class itself could be deferred, because at least
 *  one of its virtual methods must be redefined to be usable
 */
public class StepData_SelectMember extends Standard_Transient {
  StepData_SelectMember(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public StepData_SelectMember() {
    this(OCCwrapJavaJNI.new_StepData_SelectMember(), true);
  }

  /**
   *  Tells if a SelectMember has a name. Default is False
   */
  public long HasName() {
    return OCCwrapJavaJNI.StepData_SelectMember_HasName(swigCPtr, this);
  }

  /**
   *  Returns the name of a SelectMember. Default is empty
   */
  public String Name() {
    return OCCwrapJavaJNI.StepData_SelectMember_Name(swigCPtr, this);
  }

  /**
   *  Sets the name of a SelectMember, returns True if done, False
   *  if no name is allowed
   *  Default does nothing and returns False
   */
  public long SetName(String name) {
    return OCCwrapJavaJNI.StepData_SelectMember_SetName(swigCPtr, this, name);
  }

  /**
   *  Tells if the name of a SelectMember matches a given one
   *  By default, compares the strings, can be redefined (optimised)
   */
  public long Matches(String name) {
    return OCCwrapJavaJNI.StepData_SelectMember_Matches(swigCPtr, this, name);
  }

  public int Kind() {
    return OCCwrapJavaJNI.StepData_SelectMember_Kind(swigCPtr, this);
  }

  public void SetKind(int kind) {
    OCCwrapJavaJNI.StepData_SelectMember_SetKind(swigCPtr, this, kind);
  }

  /**
   *  Returns the Kind of the SelectMember, under the form of an
   *  enum ParamType
   */
  public Interface_ParamType ParamType() {
    return Interface_ParamType.swigToEnum(OCCwrapJavaJNI.StepData_SelectMember_ParamType(swigCPtr, this));
  }

  /**
   *  This internal method gives access to a value implemented by an
   *  Integer (to read it)
   */
  public int Int() {
    return OCCwrapJavaJNI.StepData_SelectMember_Int(swigCPtr, this);
  }

  /**
   *  This internal method gives access to a value implemented by an
   *  Integer (to set it)
   */
  public void SetInt(int val) {
    OCCwrapJavaJNI.StepData_SelectMember_SetInt(swigCPtr, this, val);
  }

  /**
   *  Gets the value as an Integer
   */
  public int Integer() {
    return OCCwrapJavaJNI.StepData_SelectMember_Integer(swigCPtr, this);
  }

  public void SetInteger(int val) {
    OCCwrapJavaJNI.StepData_SelectMember_SetInteger(swigCPtr, this, val);
  }

  public long Boolean() {
    return OCCwrapJavaJNI.StepData_SelectMember_Boolean(swigCPtr, this);
  }

  public void SetBoolean(long val) {
    OCCwrapJavaJNI.StepData_SelectMember_SetBoolean(swigCPtr, this, val);
  }

  public StepData_Logical Logical() {
    return StepData_Logical.swigToEnum(OCCwrapJavaJNI.StepData_SelectMember_Logical(swigCPtr, this));
  }

  public void SetLogical(StepData_Logical val) {
    OCCwrapJavaJNI.StepData_SelectMember_SetLogical(swigCPtr, this, val.swigValue());
  }

  public double Real() {
    return OCCwrapJavaJNI.StepData_SelectMember_Real(swigCPtr, this);
  }

  public void SetReal(double val) {
    OCCwrapJavaJNI.StepData_SelectMember_SetReal(swigCPtr, this, val);
  }

  public String String() {
    return OCCwrapJavaJNI.StepData_SelectMember_String(swigCPtr, this);
  }

  public void SetString(String val) {
    OCCwrapJavaJNI.StepData_SelectMember_SetString(swigCPtr, this, val);
  }

  public int Enum() {
    return OCCwrapJavaJNI.StepData_SelectMember_Enum(swigCPtr, this);
  }

  public String EnumText() {
    return OCCwrapJavaJNI.StepData_SelectMember_EnumText(swigCPtr, this);
  }

  public void SetEnum(int val, String text) {
    OCCwrapJavaJNI.StepData_SelectMember_SetEnum__SWIG_0(swigCPtr, this, val, text);
  }

  public void SetEnum(int val) {
    OCCwrapJavaJNI.StepData_SelectMember_SetEnum__SWIG_1(swigCPtr, this, val);
  }

  public void SetEnumText(int val, String text) {
    OCCwrapJavaJNI.StepData_SelectMember_SetEnumText(swigCPtr, this, val, text);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepData_SelectMember_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepData_SelectMember_get_type_descriptor(), true );
  }

  public static  StepData_SelectMember  DownCast( Standard_Transient  T) {
    return new StepData_SelectMember ( OCCwrapJavaJNI.StepData_SelectMember_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepData_SelectMember_TypeOf(), true );
  }

}
