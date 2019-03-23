package opencascade;

/**
 *  This class gives a way to manage meaningfull static variables,
 *  used as "global" parameters in various procedures.
 * 
 *  A Static brings a specification (its type, constraints if any)
 *  and a value. Its basic form is a string, it can be specified
 *  as integer or real or enumerative string, and queried as such.
 *  Its string content, which is a Handle(HAsciiString) can be
 *  shared by other data structures, hence gives a direct on line
 *  access to its value.
 * 
 *  All this description is inherited from TypedValue
 * 
 *  A Static can be given an initial value, it can be filled from,
 *  either a set of Resources (an applicative feature which
 *  accesses and manages parameter files), or environment or
 *  internal definition : these define families of Static.
 *  In addition, it supports a status for reinitialisation : an
 *  initialisation procedure can ask if the value of the Static
 *  has changed from its last call, in this case does something
 *  then marks the Status "uptodate", else it does nothing.
 * 
 *  Statics are named and recorded then accessed in an alphabetic
 *  dictionary
 */
public class Interface_Static extends Interface_TypedValue {
  Interface_Static(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates and records a Static, with a family and a name
   *  family can report to a name of ressource or to a system or
   *  internal definition. The name must be unique.
   * 
   *  type gives the type of the parameter, default is free text
   *  Also available : Integer, Real, Enum, Entity (i.e. Object)
   *  More precise specifications, titles, can be given to the
   *  Static once created
   * 
   *  init gives an initial value. If it is not given, the Static
   *  begin as "not set", its value is empty
   */
  public Interface_Static(String family, String name, Interface_ParamType type, String init) {
    this(OCCwrapJavaJNI.new_Interface_Static__SWIG_0(family, name, type.swigValue(), init), true);
  }

  /**
   *  Creates a new Static with same definition as another one
   *  (value is copied, except for Entity : it remains null)
   */
  public Interface_Static(String family, String name, Interface_ParamType type) {
    this(OCCwrapJavaJNI.new_Interface_Static__SWIG_1(family, name, type.swigValue()), true);
  }

  public Interface_Static(String family, String name) {
    this(OCCwrapJavaJNI.new_Interface_Static__SWIG_2(family, name), true);
  }

  public Interface_Static(String family, String name,  Interface_Static  other) {
    this(OCCwrapJavaJNI.new_Interface_Static__SWIG_3(family, name,  Interface_Static.getCPtr(other) , other), true);
  }

  /**
   *  Writes the properties of a
   *  parameter in the diagnostic file. These include:
   *  - Name
   *  - Family,
   *  - Wildcard (if it has one)
   *  - Current status (empty  string if it was updated or
   *  if it is the original one)
   *  - Value
   */
  public void PrintStatic( Message_Messenger  S) {
    OCCwrapJavaJNI.Interface_Static_PrintStatic(swigCPtr, this,  Message_Messenger.getCPtr(S) , S);
  }

  /**
   *  Returns the family. It can be : a resource name for applis,
   *  an internal name between : $e (environment variables),
   *  $l (other, purely local)
   */
  public String Family() {
    return OCCwrapJavaJNI.Interface_Static_Family(swigCPtr, this);
  }

  /**
   *  Sets a "wild-card" static : its value will be considered
   *  if <me> is not properly set. (reset by set a null one)
   */
  public void SetWild( Interface_Static  wildcard) {
    OCCwrapJavaJNI.Interface_Static_SetWild(swigCPtr, this,  Interface_Static.getCPtr(wildcard) , wildcard);
  }

  public  Interface_Static  Wild() {
    return new Interface_Static ( OCCwrapJavaJNI.Interface_Static_Wild(swigCPtr, this), true );
  }

  /**
   *  Records a Static has "uptodate", i.e. its value has been taken
   *  into account by a reinitialisation procedure
   *  This flag is reset at each successful SetValue
   */
  public void SetUptodate() {
    OCCwrapJavaJNI.Interface_Static_SetUptodate(swigCPtr, this);
  }

  /**
   *  Returns the status "uptodate"
   */
  public long UpdatedStatus() {
    return OCCwrapJavaJNI.Interface_Static_UpdatedStatus(swigCPtr, this);
  }

  public static  Interface_Static  Static(String name) {
    return new Interface_Static ( OCCwrapJavaJNI.Interface_Static_Static(name), true );
  }

  /**
   *  Returns True if a Static named <name> is present, False else
   */
  public static long IsPresent(String name) {
    return OCCwrapJavaJNI.Interface_Static_IsPresent(name);
  }

  /**
   *  Returns a part of the definition of a Static, as a CString
   *  The part is designated by its name, as a CString
   *  If the required value is not a string, it is converted to a
   *  CString then returned
   *  If <name> is not present, or <part> not defined for <name>,
   *  this function returns an empty string
   * 
   *  Allowed parts for CDef :
   *  family : the family
   *  type  : the type ("integer","real","text","enum")
   *  label : the label
   *  satis : satisfy function name if any
   *  rmin : minimum real value
   *  rmax : maximum real value
   *  imin : minimum integer value
   *  imax : maximum integer value
   *  enum nn (nn : value of an integer) : enum value for nn
   *  unit : unit definition for a real
   */
  public static String CDef(String name, String part) {
    return OCCwrapJavaJNI.Interface_Static_CDef(name, part);
  }

  /**
   *  Returns a part of the definition of a Static, as an Integer
   *  The part is designated by its name, as a CString
   *  If the required value is not a string, returns zero
   *  For a Boolean, 0 for false, 1 for true
   *  If <name> is not present, or <part> not defined for <name>,
   *  this function returns zero
   * 
   *  Allowed parts for IDef :
   *  imin, imax : minimum or maximum integer value
   *  estart : starting number for enum
   *  ecount : count of enum values (starting from estart)
   *  ematch : exact match status
   *  eval val : case determined from a string
   */
  public static int IDef(String name, String part) {
    return OCCwrapJavaJNI.Interface_Static_IDef(name, part);
  }

  /**
   *  Returns True if <name> is present AND set
   *  <proper> True (D) : considers this item only
   *  <proper> False    : if not set and attached to a wild-card,
   *  considers this wild-card
   */
  public static long IsSet(String name, long proper) {
    return OCCwrapJavaJNI.Interface_Static_IsSet__SWIG_0(name, proper);
  }

  public static long IsSet(String name) {
    return OCCwrapJavaJNI.Interface_Static_IsSet__SWIG_1(name);
  }

  /**
   *  Returns the value of the
   *  parameter identified by the string name.
   *  If the specified parameter does not exist, an empty
   *  string is returned.
   *  Example
   *  Interface_Static::CVal("write.step.schema");
   *  which could return:
   *  "AP214"
   */
  public static String CVal(String name) {
    return OCCwrapJavaJNI.Interface_Static_CVal(name);
  }

  /**
   *  Returns the integer value of
   *  the translation parameter identified by the string name.
   *  Returns the value 0 if the parameter does not exist.
   *  Example
   *  Interface_Static::IVal("write.step.schema");
   *  which could return: 3
   */
  public static int IVal(String name) {
    return OCCwrapJavaJNI.Interface_Static_IVal(name);
  }

  /**
   *  Returns the value of a static
   *  translation parameter identified by the string name.
   *  Returns the value 0.0 if the parameter does not exist.
   */
  public static double RVal(String name) {
    return OCCwrapJavaJNI.Interface_Static_RVal(name);
  }

  /**
   *  Modifies the value of the
   *  parameter identified by name. The modification is specified
   *  by the string val. false is returned if the parameter does not exist.
   *  Example
   *  Interface_Static::SetCVal
   *  ("write.step.schema","AP203")
   *  This syntax specifies a switch from the default STEP 214 mode to STEP 203 mode.
   */
  public static long SetCVal(String name, String val) {
    return OCCwrapJavaJNI.Interface_Static_SetCVal(name, val);
  }

  /**
   *  Modifies the value of the
   *  parameter identified by name. The modification is specified
   *  by the integer value val. false is returned if the
   *  parameter does not exist.
   *  Example
   *  Interface_Static::SetIVal
   *  ("write.step.schema", 3)
   *  This syntax specifies a switch from the default STEP 214 mode to STEP 203 mode.S
   */
  public static long SetIVal(String name, int val) {
    return OCCwrapJavaJNI.Interface_Static_SetIVal(name, val);
  }

  /**
   *  Modifies the value of a
   *  translation parameter. false is returned if the
   *  parameter does not exist. The modification is specified
   *  by the real number value val.
   */
  public static long SetRVal(String name, double val) {
    return OCCwrapJavaJNI.Interface_Static_SetRVal(name, val);
  }

  /**
   *  Sets a Static to be "uptodate"
   *  Returns False if <name> is not present
   *  This status can be used by a reinitialisation procedure to
   *  rerun if a value has been changed
   */
  public static long Update(String name) {
    return OCCwrapJavaJNI.Interface_Static_Update(name);
  }

  /**
   *  Returns the status "uptodate" from a Static
   *  Returns False if <name> is not present
   */
  public static long IsUpdated(String name) {
    return OCCwrapJavaJNI.Interface_Static_IsUpdated(name);
  }

  public static  TColStd_HSequenceOfHAsciiString  Items(int mode, String criter) {
    return new TColStd_HSequenceOfHAsciiString ( OCCwrapJavaJNI.Interface_Static_Items__SWIG_0(mode, criter), true );
  }

  public static  TColStd_HSequenceOfHAsciiString  Items(int mode) {
    return new TColStd_HSequenceOfHAsciiString ( OCCwrapJavaJNI.Interface_Static_Items__SWIG_1(mode), true );
  }

  public static  TColStd_HSequenceOfHAsciiString  Items() {
    return new TColStd_HSequenceOfHAsciiString ( OCCwrapJavaJNI.Interface_Static_Items__SWIG_2(), true );
  }

  /**
   *  Initializes all standard static parameters, which can be used
   *  by every function. statics specific of a norm or a function
   *  must be defined around it
   */
  public static void Standards() {
    OCCwrapJavaJNI.Interface_Static_Standards();
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Interface_Static_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Interface_Static_get_type_descriptor(), true );
  }

  public static  Interface_Static  DownCast( Standard_Transient  T) {
    return new Interface_Static ( OCCwrapJavaJNI.Interface_Static_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Interface_Static_TypeOf(), true );
  }

}
