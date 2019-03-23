package opencascade;

/**
 *  This class allows to dynamically manage .. typed values, i.e.
 *  values which have an alphanumeric expression, but with
 *  controls. Such as "must be an Integer" or "Enumerative Text"
 *  etc
 * 
 *  Hence, a TypedValue brings a specification (type + constraints
 *  if any) and a value. Its basic form is a string, it can be
 *  specified as integer or real or enumerative string, then
 *  queried as such.
 *  Its string content, which is a Handle(HAsciiString) can be
 *  shared by other data structures, hence gives a direct on line
 *  access to its value.
 */
public class MoniTool_TypedValue extends Standard_Transient {
  MoniTool_TypedValue(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a TypedValue, with a name
   * 
   *  type gives the type of the parameter, default is free text
   *  Also available : Integer, Real, Enum, Entity (i.e. Object)
   *  More precise specifications, titles, can be given to the
   *  TypedValue once created
   * 
   *  init gives an initial value. If it is not given, the
   *  TypedValue begins as "not set", its value is empty
   */
  public MoniTool_TypedValue(String name, MoniTool_ValueType type, String init) {
    this(OCCwrapJavaJNI.new_MoniTool_TypedValue__SWIG_0(name, type.swigValue(), init), true);
  }

  /**
   *  Creates a TypedValue from another one, by duplication
   */
  public MoniTool_TypedValue(String name, MoniTool_ValueType type) {
    this(OCCwrapJavaJNI.new_MoniTool_TypedValue__SWIG_1(name, type.swigValue()), true);
  }

  public MoniTool_TypedValue(String name) {
    this(OCCwrapJavaJNI.new_MoniTool_TypedValue__SWIG_2(name), true);
  }

  public MoniTool_TypedValue( MoniTool_TypedValue  other) {
    this(OCCwrapJavaJNI.new_MoniTool_TypedValue__SWIG_3( MoniTool_TypedValue.getCPtr(other) , other), true);
  }

  /**
   *  Returns the name
   */
  public String Name() {
    return OCCwrapJavaJNI.MoniTool_TypedValue_Name(swigCPtr, this);
  }

  /**
   *  Returns the type of the value
   */
  public MoniTool_ValueType ValueType() {
    return MoniTool_ValueType.swigToEnum(OCCwrapJavaJNI.MoniTool_TypedValue_ValueType(swigCPtr, this));
  }

  /**
   *  Returns the Definition
   *  By priority, the enforced one, else an automatic one, computed
   *  from the specification
   */
  public TCollection_AsciiString Definition() {
    return new TCollection_AsciiString(OCCwrapJavaJNI.MoniTool_TypedValue_Definition(swigCPtr, this), true);
  }

  /**
   *  Enforces a Definition
   */
  public void SetDefinition(String deftext) {
    OCCwrapJavaJNI.MoniTool_TypedValue_SetDefinition(swigCPtr, this, deftext);
  }

  /**
   *  Prints definition, specification, and actual status and value
   */
  public void Print( Message_Messenger  S) {
    OCCwrapJavaJNI.MoniTool_TypedValue_Print(swigCPtr, this,  Message_Messenger.getCPtr(S) , S);
  }

  /**
   *  Prints only the Value
   */
  public void PrintValue( Message_Messenger  S) {
    OCCwrapJavaJNI.MoniTool_TypedValue_PrintValue(swigCPtr, this,  Message_Messenger.getCPtr(S) , S);
  }

  /**
   *  Completes the definition of a TypedValue by command <initext>,
   *  once created with its type
   *  Returns True if done, False if could not be interpreted
   *  <initext> may be :
   *  imin ival : minimum value for an integer
   *  imax ival : maximum value for an integer
   *  rmin rval : minimum value for a real
   *  rmax rval : maximum value for a real
   *  unit name : name of unit
   *  ematch i  : enum from integer value i, match required
   *  enum   i  : enum from integer value i, match not required
   *  eval text : add an enumerative value (increments max by 1)
   *  eval ??   : add a non-authorised enum value (to be skipped)
   *  tmax   l  : maximum length for a text
   */
  public long AddDef(String initext) {
    return OCCwrapJavaJNI.MoniTool_TypedValue_AddDef(swigCPtr, this, initext);
  }

  /**
   *  Sets a label, which can then be displayed
   */
  public void SetLabel(String label) {
    OCCwrapJavaJNI.MoniTool_TypedValue_SetLabel(swigCPtr, this, label);
  }

  /**
   *  Returns the label, if set; else returns an empty string
   */
  public String Label() {
    return OCCwrapJavaJNI.MoniTool_TypedValue_Label(swigCPtr, this);
  }

  /**
   *  Sets a maximum length for a text (active only for a free text)
   */
  public void SetMaxLength(int max) {
    OCCwrapJavaJNI.MoniTool_TypedValue_SetMaxLength(swigCPtr, this, max);
  }

  /**
   *  Returns the maximum length, 0 if not set
   */
  public int MaxLength() {
    return OCCwrapJavaJNI.MoniTool_TypedValue_MaxLength(swigCPtr, this);
  }

  /**
   *  Sets an Integer limit (included) to <val>, the upper limit
   *  if <max> is True, the lower limit if <max> is False
   */
  public void SetIntegerLimit(long max, int val) {
    OCCwrapJavaJNI.MoniTool_TypedValue_SetIntegerLimit(swigCPtr, this, max, val);
  }

  /**
   *  Gives an Integer Limit (upper if <max> True, lower if <max>
   *  False). Returns True if this limit is defined, False else
   *  (in that case, gives the natural limit for Integer)
   */
  public long IntegerLimit(long max, int[] val) {
    return OCCwrapJavaJNI.MoniTool_TypedValue_IntegerLimit(swigCPtr, this, max, val);
  }

  /**
   *  Sets a Real limit (included) to <val>, the upper limit
   *  if <max> is True, the lower limit if <max> is False
   */
  public void SetRealLimit(long max, double val) {
    OCCwrapJavaJNI.MoniTool_TypedValue_SetRealLimit(swigCPtr, this, max, val);
  }

  /**
   *  Gives an Real Limit (upper if <max> True, lower if <max>
   *  False). Returns True if this limit is defined, False else
   *  (in that case, gives the natural limit for Real)
   */
  public long RealLimit(long max, double[] val) {
    return OCCwrapJavaJNI.MoniTool_TypedValue_RealLimit(swigCPtr, this, max, val);
  }

  /**
   *  Sets (Clears if <def> empty) a unit definition, as an equation
   *  of dimensions. TypedValue just records this definition, does
   *  not exploit it, to be done as required by user applications
   */
  public void SetUnitDef(String def) {
    OCCwrapJavaJNI.MoniTool_TypedValue_SetUnitDef(swigCPtr, this, def);
  }

  /**
   *  Returns the recorded unit definition, empty if not set
   */
  public String UnitDef() {
    return OCCwrapJavaJNI.MoniTool_TypedValue_UnitDef(swigCPtr, this);
  }

  /**
   *  For an enumeration, precises the starting value (default 0)
   *  and the match condition : if True (D), the string value must
   *  match the definition, else it may take another value : in that
   *  case, the Integer Value will be  Start - 1.
   *  (empty value remains allowed)
   */
  public void StartEnum(int start, long match) {
    OCCwrapJavaJNI.MoniTool_TypedValue_StartEnum__SWIG_0(swigCPtr, this, start, match);
  }

  public void StartEnum(int start) {
    OCCwrapJavaJNI.MoniTool_TypedValue_StartEnum__SWIG_1(swigCPtr, this, start);
  }

  public void StartEnum() {
    OCCwrapJavaJNI.MoniTool_TypedValue_StartEnum__SWIG_2(swigCPtr, this);
  }

  /**
   *  Adds enumerative definitions. For more than 10, several calls
   */
  public void AddEnum(String v1, String v2, String v3, String v4, String v5, String v6, String v7, String v8, String v9, String v10) {
    OCCwrapJavaJNI.MoniTool_TypedValue_AddEnum__SWIG_0(swigCPtr, this, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10);
  }

  public void AddEnum(String v1, String v2, String v3, String v4, String v5, String v6, String v7, String v8, String v9) {
    OCCwrapJavaJNI.MoniTool_TypedValue_AddEnum__SWIG_1(swigCPtr, this, v1, v2, v3, v4, v5, v6, v7, v8, v9);
  }

  public void AddEnum(String v1, String v2, String v3, String v4, String v5, String v6, String v7, String v8) {
    OCCwrapJavaJNI.MoniTool_TypedValue_AddEnum__SWIG_2(swigCPtr, this, v1, v2, v3, v4, v5, v6, v7, v8);
  }

  public void AddEnum(String v1, String v2, String v3, String v4, String v5, String v6, String v7) {
    OCCwrapJavaJNI.MoniTool_TypedValue_AddEnum__SWIG_3(swigCPtr, this, v1, v2, v3, v4, v5, v6, v7);
  }

  public void AddEnum(String v1, String v2, String v3, String v4, String v5, String v6) {
    OCCwrapJavaJNI.MoniTool_TypedValue_AddEnum__SWIG_4(swigCPtr, this, v1, v2, v3, v4, v5, v6);
  }

  public void AddEnum(String v1, String v2, String v3, String v4, String v5) {
    OCCwrapJavaJNI.MoniTool_TypedValue_AddEnum__SWIG_5(swigCPtr, this, v1, v2, v3, v4, v5);
  }

  public void AddEnum(String v1, String v2, String v3, String v4) {
    OCCwrapJavaJNI.MoniTool_TypedValue_AddEnum__SWIG_6(swigCPtr, this, v1, v2, v3, v4);
  }

  public void AddEnum(String v1, String v2, String v3) {
    OCCwrapJavaJNI.MoniTool_TypedValue_AddEnum__SWIG_7(swigCPtr, this, v1, v2, v3);
  }

  public void AddEnum(String v1, String v2) {
    OCCwrapJavaJNI.MoniTool_TypedValue_AddEnum__SWIG_8(swigCPtr, this, v1, v2);
  }

  public void AddEnum(String v1) {
    OCCwrapJavaJNI.MoniTool_TypedValue_AddEnum__SWIG_9(swigCPtr, this, v1);
  }

  public void AddEnum() {
    OCCwrapJavaJNI.MoniTool_TypedValue_AddEnum__SWIG_10(swigCPtr, this);
  }

  /**
   *  Adds an enumeration definition, by its string and numeric
   *  values. If it is the first setting for this value, it is
   *  recorded as main value. Else, it is recognized as alternate
   *  string for this numeric value
   */
  public void AddEnumValue(String val, int num) {
    OCCwrapJavaJNI.MoniTool_TypedValue_AddEnumValue(swigCPtr, this, val, num);
  }

  /**
   *  Gives the Enum definitions : start value, end value, match
   *  status. Returns True for an Enum, False else.
   */
  public long EnumDef(int[] startcase, int[] endcase, long[] match) {
    return OCCwrapJavaJNI.MoniTool_TypedValue_EnumDef(swigCPtr, this, startcase, endcase, match);
  }

  /**
   *  Returns the value of an enumerative definition, from its rank
   *  Empty string if out of range or not an Enum
   */
  public String EnumVal(int num) {
    return OCCwrapJavaJNI.MoniTool_TypedValue_EnumVal(swigCPtr, this, num);
  }

  /**
   *  Returns the case number which cooresponds to a string value
   *  Works with main and additionnal values
   *  Returns (StartEnum - 1) if not OK, -1 if not an Enum
   */
  public int EnumCase(String val) {
    return OCCwrapJavaJNI.MoniTool_TypedValue_EnumCase(swigCPtr, this, val);
  }

  /**
   *  Sets type of which an Object TypedValue must be kind of
   *  Error for a TypedValue not an Object (Entity)
   */
  public void SetObjectType( Standard_Type  typ) {
    OCCwrapJavaJNI.MoniTool_TypedValue_SetObjectType(swigCPtr, this,  Standard_Type.getCPtr(typ) , typ);
  }

  public  Standard_Type  ObjectType() {
    return new Standard_Type ( OCCwrapJavaJNI.MoniTool_TypedValue_ObjectType(swigCPtr, this), true );
  }

  /**
   *  Tells if a TypedValue has an Interpret
   */
  public long HasInterpret() {
    return OCCwrapJavaJNI.MoniTool_TypedValue_HasInterpret(swigCPtr, this);
  }

  /**
   *  Returns name of specific satisfy, empty string if none
   */
  public String SatisfiesName() {
    return OCCwrapJavaJNI.MoniTool_TypedValue_SatisfiesName(swigCPtr, this);
  }

  /**
   *  Returns True if the value is set (not empty/not null object)
   */
  public long IsSetValue() {
    return OCCwrapJavaJNI.MoniTool_TypedValue_IsSetValue(swigCPtr, this);
  }

  /**
   *  Returns the value, as a cstring. Empty if not set.
   */
  public String CStringValue() {
    return OCCwrapJavaJNI.MoniTool_TypedValue_CStringValue(swigCPtr, this);
  }

  public  TCollection_HAsciiString  HStringValue() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.MoniTool_TypedValue_HStringValue(swigCPtr, this), true );
  }

  public  TCollection_HAsciiString  Interpret( TCollection_HAsciiString  hval, long arg1) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.MoniTool_TypedValue_Interpret(swigCPtr, this,  TCollection_HAsciiString.getCPtr(hval) , hval, arg1), true );
  }

  /**
   *  Returns True if a value statifies the specification
   *  (remark : does not apply to Entity : see ObjectType, for this
   *  type, the string is just a comment)
   */
  public long Satisfies( TCollection_HAsciiString  hval) {
    return OCCwrapJavaJNI.MoniTool_TypedValue_Satisfies(swigCPtr, this,  TCollection_HAsciiString.getCPtr(hval) , hval);
  }

  /**
   *  Clears the recorded Value : it is now unset
   */
  public void ClearValue() {
    OCCwrapJavaJNI.MoniTool_TypedValue_ClearValue(swigCPtr, this);
  }

  /**
   *  Changes the value. The new one must satisfy the specification
   *  Returns False (and did not set) if the new value
   *  does not satisfy the specification
   *  Can be redefined to be managed (in a subclass)
   */
  public long SetCStringValue(String val) {
    return OCCwrapJavaJNI.MoniTool_TypedValue_SetCStringValue(swigCPtr, this, val);
  }

  /**
   *  Forces a new Handle for the Value
   *  It can be empty, else (if Type is not free Text), it must
   *  satisfy the specification.
   *  Not only the value is changed, but also the way it is shared
   *  Remark : for Type=Object, this value is not controlled, it can
   *  be set as a comment
   *  Returns False (and did not set) if the new value
   *  does not satisfy the specification
   *  Can be redefined to be managed (in a subclass)
   */
  public long SetHStringValue( TCollection_HAsciiString  hval) {
    return OCCwrapJavaJNI.MoniTool_TypedValue_SetHStringValue(swigCPtr, this,  TCollection_HAsciiString.getCPtr(hval) , hval);
  }

  /**
   *  Returns the value as integer, i.e. :
   *  For type = Integer, the integer itself; 0 if not set
   *  For type = Enum, the designated rank (see Enum definition)
   *  StartEnum - 1 if not set or not in the definition
   *  Else, returns 0
   */
  public int IntegerValue() {
    return OCCwrapJavaJNI.MoniTool_TypedValue_IntegerValue(swigCPtr, this);
  }

  /**
   *  Changes the value as an integer, only for Integer or Enum
   */
  public long SetIntegerValue(int ival) {
    return OCCwrapJavaJNI.MoniTool_TypedValue_SetIntegerValue(swigCPtr, this, ival);
  }

  /**
   *  Returns the value as real,  for a Real type TypedValue
   *  Else, returns 0.
   */
  public double RealValue() {
    return OCCwrapJavaJNI.MoniTool_TypedValue_RealValue(swigCPtr, this);
  }

  /**
   *  Changes the value as a real, only for Real
   */
  public long SetRealValue(double rval) {
    return OCCwrapJavaJNI.MoniTool_TypedValue_SetRealValue(swigCPtr, this, rval);
  }

  public  Standard_Transient  ObjectValue() {
    return new Standard_Transient ( OCCwrapJavaJNI.MoniTool_TypedValue_ObjectValue(swigCPtr, this), true );
  }

  /**
   *  Same as ObjectValue, but avoids DownCast : the receiving
   *  variable is directly loaded. It is assumed that it complies
   *  with the definition of ObjectType ! Otherwise, big trouble
   */
  public void GetObjectValue( Standard_Transient  val) {
    OCCwrapJavaJNI.MoniTool_TypedValue_GetObjectValue(swigCPtr, this,  Standard_Transient.getCPtr(val) , val);
  }

  /**
   *  Changes the value as Transient Object, only for Object/Entity
   *  Returns False if DynamicType does not satisfy ObjectType
   *  Can be redefined to be managed (in a subclass)
   */
  public long SetObjectValue( Standard_Transient  obj) {
    return OCCwrapJavaJNI.MoniTool_TypedValue_SetObjectValue(swigCPtr, this,  Standard_Transient.getCPtr(obj) , obj);
  }

  /**
   *  Returns the type name of the ObjectValue, or an empty string
   *  if not set
   */
  public String ObjectTypeName() {
    return OCCwrapJavaJNI.MoniTool_TypedValue_ObjectTypeName(swigCPtr, this);
  }

  /**
   *  Adds a TypedValue in the library.
   *  It is recorded then will be accessed by its Name
   *  Its Definition may be imposed, else it is computed as usual
   *  By default it will be accessed by its Definition (string)
   *  Returns True if done, False if tv is Null or brings no
   *  Definition or <def> not defined
   * 
   *  If a TypedValue was already recorded under this name, it is
   *  replaced
   */
  public static long AddLib( MoniTool_TypedValue  tv, String def) {
    return OCCwrapJavaJNI.MoniTool_TypedValue_AddLib__SWIG_0( MoniTool_TypedValue.getCPtr(tv) , tv, def);
  }

  public static long AddLib( MoniTool_TypedValue  tv) {
    return OCCwrapJavaJNI.MoniTool_TypedValue_AddLib__SWIG_1( MoniTool_TypedValue.getCPtr(tv) , tv);
  }

  public static  MoniTool_TypedValue  Lib(String def) {
    return new MoniTool_TypedValue ( OCCwrapJavaJNI.MoniTool_TypedValue_Lib(def), true );
  }

  public static  MoniTool_TypedValue  FromLib(String def) {
    return new MoniTool_TypedValue ( OCCwrapJavaJNI.MoniTool_TypedValue_FromLib(def), true );
  }

  public static  MoniTool_TypedValue  StaticValue(String name) {
    return new MoniTool_TypedValue ( OCCwrapJavaJNI.MoniTool_TypedValue_StaticValue(name), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.MoniTool_TypedValue_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.MoniTool_TypedValue_get_type_descriptor(), true );
  }

  public static  MoniTool_TypedValue  DownCast( Standard_Transient  T) {
    return new MoniTool_TypedValue ( OCCwrapJavaJNI.MoniTool_TypedValue_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.MoniTool_TypedValue_TypeOf(), true );
  }

}
