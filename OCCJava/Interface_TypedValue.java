package opencascade;

/**
 *  Now strictly equivalent to TypedValue from MoniTool,
 *  except for ParamType which remains for compatibility reasons
 * 
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
public class Interface_TypedValue extends MoniTool_TypedValue {
  Interface_TypedValue(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
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
  public Interface_TypedValue(String name, Interface_ParamType type, String init) {
    this(OCCwrapJavaJNI.new_Interface_TypedValue__SWIG_0(name, type.swigValue(), init), true);
  }

  public Interface_TypedValue(String name, Interface_ParamType type) {
    this(OCCwrapJavaJNI.new_Interface_TypedValue__SWIG_1(name, type.swigValue()), true);
  }

  public Interface_TypedValue(String name) {
    this(OCCwrapJavaJNI.new_Interface_TypedValue__SWIG_2(name), true);
  }

  /**
   *  Returns the type
   *  I.E. calls ValueType then makes correspondance between
   *  ParamType from Interface (which remains for compatibility
   *  reasons) and ValueType from MoniTool
   */
  public Interface_ParamType Type() {
    return Interface_ParamType.swigToEnum(OCCwrapJavaJNI.Interface_TypedValue_Type(swigCPtr, this));
  }

  /**
   *  Correspondance ParamType from Interface  to
   *  ValueType from MoniTool
   */
  public static MoniTool_ValueType ParamTypeToValueType(Interface_ParamType typ) {
    return MoniTool_ValueType.swigToEnum(OCCwrapJavaJNI.Interface_TypedValue_ParamTypeToValueType(typ.swigValue()));
  }

  /**
   *  Correspondance ParamType from Interface  to
   *  ValueType from MoniTool
   */
  public static Interface_ParamType ValueTypeToParamType(MoniTool_ValueType typ) {
    return Interface_ParamType.swigToEnum(OCCwrapJavaJNI.Interface_TypedValue_ValueTypeToParamType(typ.swigValue()));
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Interface_TypedValue_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Interface_TypedValue_get_type_descriptor(), true );
  }

  public static  Interface_TypedValue  DownCast( Standard_Transient  T) {
    return new Interface_TypedValue ( OCCwrapJavaJNI.Interface_TypedValue_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Interface_TypedValue_TypeOf(), true );
  }

}
