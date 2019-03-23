package opencascade;

/**
 *  Management of system environment variables
 *  An environment variable is composed of a variable name
 *  and its value.
 * 
 *  To be portable among various systems, environment variables
 *  are local to a process.
 */
public class OSD_Environment {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  OSD_Environment(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  OSD_Environment(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(OSD_Environment obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (OSD_Environment ptr) { Ptr = ptr; }
    public OSD_Environment AsReference () { return Ptr; }
    public OSD_Environment AsCopy () { return Ptr.MakeCopy(); }
    public OSD_Environment Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_OSD_Environment(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates the object Environment.
   */
  public OSD_Environment() {
    this(OCCwrapJavaJNI.new_OSD_Environment__SWIG_0(), true);
  }

  /**
   *  Creates an Environment variable initialized with value
   *  set to an empty AsciiString.
   */
  public OSD_Environment( TCollection_AsciiString  Name) {
    this(OCCwrapJavaJNI.new_OSD_Environment__SWIG_1(TCollection_AsciiString.getCPtr(Name), Name), true);
  }

  /**
   *  Creates an Environment variable initialized with Value.
   */
  public OSD_Environment( TCollection_AsciiString  Name,  TCollection_AsciiString  Value) {
    this(OCCwrapJavaJNI.new_OSD_Environment__SWIG_2(TCollection_AsciiString.getCPtr(Name), Name, TCollection_AsciiString.getCPtr(Value), Value), true);
  }

  /**
   *  Changes environment variable value.
   *  Raises ConstructionError either if the string contains
   *  characters not in range of ' '...'~' or if the string
   *  contains the character '$' which is forbiden.
   */
  public void SetValue( TCollection_AsciiString  Value) {
    OCCwrapJavaJNI.OSD_Environment_SetValue(swigCPtr, this, TCollection_AsciiString.getCPtr(Value), Value);
  }

  /**
   *  Gets the value of an environment variable
   */
  public TCollection_AsciiString Value() {
    return new TCollection_AsciiString(OCCwrapJavaJNI.OSD_Environment_Value(swigCPtr, this), true);
  }

  /**
   *  Changes environment variable name.
   *  Raises ConstructionError either if the string contains
   *  characters not in range of ' '...'~' or if the string
   *  contains the character '$' which is forbiden.
   */
  public void SetName( TCollection_AsciiString  name) {
    OCCwrapJavaJNI.OSD_Environment_SetName(swigCPtr, this, TCollection_AsciiString.getCPtr(name), name);
  }

  /**
   *  Gets the name of <me>.
   */
  public TCollection_AsciiString Name() {
    return new TCollection_AsciiString(OCCwrapJavaJNI.OSD_Environment_Name(swigCPtr, this), true);
  }

  /**
   *  Sets the value of an environment variable
   *  into system (physically).
   */
  public void Build() {
    OCCwrapJavaJNI.OSD_Environment_Build(swigCPtr, this);
  }

  /**
   *  Removes (physically) an environment variable
   */
  public void Remove() {
    OCCwrapJavaJNI.OSD_Environment_Remove(swigCPtr, this);
  }

  /**
   *  Returns TRUE if an error occurs
   */
  public long Failed() {
    return OCCwrapJavaJNI.OSD_Environment_Failed(swigCPtr, this);
  }

  /**
   *  Resets error counter to zero
   */
  public void Reset() {
    OCCwrapJavaJNI.OSD_Environment_Reset(swigCPtr, this);
  }

  /**
   *  Raises OSD_Error
   */
  public void Perror() {
    OCCwrapJavaJNI.OSD_Environment_Perror(swigCPtr, this);
  }

  /**
   *  Returns error number if 'Failed' is TRUE.
   */
  public int Error() {
    return OCCwrapJavaJNI.OSD_Environment_Error(swigCPtr, this);
  }

}
