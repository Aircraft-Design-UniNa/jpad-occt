package opencascade;

/**
 *  SelectType is the basis used for SELECT_TYPE definitions from
 *  the EXPRESS form. A SELECT_TYPE in EXPRESS is an enumeration
 *  of Types, it corresponds in a way to a Super-Type, but with
 *  no specific Methods, and no exclusivity (a given Type can be
 *  member of several SELECT_TYPES, plus be itself a SUB_TYPE).
 * 
 *  A SelectType can be field of a Transient Entity or only used
 *  to control an input Argument
 * 
 *  This class implies to designate each member Type by a Case
 *  Number which is a positive Integer value (this allows a faster
 *  treatement).
 * 
 *  With this class, a specific SelectType can :
 *  - recognize an Entity as complying or not with its definition,
 *  - storing it, with the garanty that the stored Entity complies
 *  with the definition of the SelectType
 *  - and (if judged useful) give the stored Entity under the good
 *  Type rather than simply "Transient".
 */
public class StepData_SelectType {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepData_SelectType(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepData_SelectType(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepData_SelectType obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepData_SelectType(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Recognizes the Type of an Entity. Returns a positive Number
   *  which identifies the Type in the definition List of the
   *  SelectType. Returns Zero if its Type in not in this List.
   */
  public int CaseNum( Standard_Transient  ent) {
    return OCCwrapJavaJNI.StepData_SelectType_CaseNum(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent);
  }

  /**
   *  Returns True if the Type of an Entity complies with the
   *  definition list of the SelectType.
   *  Also checks for a SelectMember
   *  Default Implementation looks for CaseNum  or CaseMem positive
   */
  public long Matches( Standard_Transient  ent) {
    return OCCwrapJavaJNI.StepData_SelectType_Matches(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent);
  }

  /**
   *  Stores an Entity. This allows to define a specific SelectType
   *  class with one read method per member Type, which returns the
   *  Value casted with the good Type.
   */
  public void SetValue( Standard_Transient  ent) {
    OCCwrapJavaJNI.StepData_SelectType_SetValue(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent);
  }

  /**
   *  Nullifies the Stored Entity
   */
  public void Nullify() {
    OCCwrapJavaJNI.StepData_SelectType_Nullify(swigCPtr, this);
  }

  public  Standard_Transient  Value() {
    return new Standard_Transient ( OCCwrapJavaJNI.StepData_SelectType_Value(swigCPtr, this), true );
  }

  /**
   *  Returns True if there is no Stored Entity (i.e. it is Null)
   */
  public long IsNull() {
    return OCCwrapJavaJNI.StepData_SelectType_IsNull(swigCPtr, this);
  }

  public  Standard_Type  Type() {
    return new Standard_Type ( OCCwrapJavaJNI.StepData_SelectType_Type(swigCPtr, this), true );
  }

  /**
   *  Recognizes the Type of the stored Entity, or zero if it is
   *  Null or SelectMember. Calls the first method CaseNum on Value
   */
  public int CaseNumber() {
    return OCCwrapJavaJNI.StepData_SelectType_CaseNumber(swigCPtr, this);
  }

  public  StepData_SelectMember  NewMember() {
    return new StepData_SelectMember ( OCCwrapJavaJNI.StepData_SelectType_NewMember(swigCPtr, this), true );
  }

  /**
   *  Recognize a SelectMember (kind, name). Returns a positive
   *  value which identifies the case in the List of immediate cases
   *  (distinct from the List of Entity Types). Zero if not
   *  recognizes
   *  Default returns 0, saying that no immediate value is allowed
   */
  public int CaseMem( StepData_SelectMember  ent) {
    return OCCwrapJavaJNI.StepData_SelectType_CaseMem(swigCPtr, this,  StepData_SelectMember.getCPtr(ent) , ent);
  }

  /**
   *  Returns the Type of the stored SelectMember, or zero if it is
   *  Null or Entity. Calls the method CaseMem on Value
   */
  public int CaseMember() {
    return OCCwrapJavaJNI.StepData_SelectType_CaseMember(swigCPtr, this);
  }

  public  StepData_SelectMember  Member() {
    return new StepData_SelectMember ( OCCwrapJavaJNI.StepData_SelectType_Member(swigCPtr, this), true );
  }

  /**
   *  Returns the type name of SelectMember. If no SelectMember or
   *  with no type name, returns an empty string
   *  To change it, pass through the SelectMember itself
   */
  public String SelectName() {
    return OCCwrapJavaJNI.StepData_SelectType_SelectName(swigCPtr, this);
  }

  /**
   *  This internal method gives access to a value implemented by an
   *  Integer (to read it)
   */
  public int Int() {
    return OCCwrapJavaJNI.StepData_SelectType_Int(swigCPtr, this);
  }

  /**
   *  This internal method gives access to a value implemented by an
   *  Integer (to set it) : a SelectMember MUST ALREADY BE THERE !
   */
  public void SetInt(int val) {
    OCCwrapJavaJNI.StepData_SelectType_SetInt(swigCPtr, this, val);
  }

  /**
   *  Gets the value as an Integer
   */
  public int Integer() {
    return OCCwrapJavaJNI.StepData_SelectType_Integer(swigCPtr, this);
  }

  /**
   *  Sets a new Integer value, with an optional type name
   *  Warning : If a SelectMember is already set, works on it : value and
   *  name must then be accepted by this SelectMember
   */
  public void SetInteger(int val, String name) {
    OCCwrapJavaJNI.StepData_SelectType_SetInteger__SWIG_0(swigCPtr, this, val, name);
  }

  public void SetInteger(int val) {
    OCCwrapJavaJNI.StepData_SelectType_SetInteger__SWIG_1(swigCPtr, this, val);
  }

  public long Boolean() {
    return OCCwrapJavaJNI.StepData_SelectType_Boolean(swigCPtr, this);
  }

  public void SetBoolean(long val, String name) {
    OCCwrapJavaJNI.StepData_SelectType_SetBoolean__SWIG_0(swigCPtr, this, val, name);
  }

  public void SetBoolean(long val) {
    OCCwrapJavaJNI.StepData_SelectType_SetBoolean__SWIG_1(swigCPtr, this, val);
  }

  public StepData_Logical Logical() {
    return StepData_Logical.swigToEnum(OCCwrapJavaJNI.StepData_SelectType_Logical(swigCPtr, this));
  }

  public void SetLogical(StepData_Logical val, String name) {
    OCCwrapJavaJNI.StepData_SelectType_SetLogical__SWIG_0(swigCPtr, this, val.swigValue(), name);
  }

  public void SetLogical(StepData_Logical val) {
    OCCwrapJavaJNI.StepData_SelectType_SetLogical__SWIG_1(swigCPtr, this, val.swigValue());
  }

  public double Real() {
    return OCCwrapJavaJNI.StepData_SelectType_Real(swigCPtr, this);
  }

  public void SetReal(double val, String name) {
    OCCwrapJavaJNI.StepData_SelectType_SetReal__SWIG_0(swigCPtr, this, val, name);
  }

  public void SetReal(double val) {
    OCCwrapJavaJNI.StepData_SelectType_SetReal__SWIG_1(swigCPtr, this, val);
  }

}
