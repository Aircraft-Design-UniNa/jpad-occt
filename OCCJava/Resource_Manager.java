package opencascade;

/**
 *  Defines a resource structure and its management methods.
 */
public class Resource_Manager extends Standard_Transient {
  Resource_Manager(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Create a Resource manager.
   *  Attempts to find the two following files:
   *  $CSF_`aName`Defaults/aName
   *  $CSF_`aName`UserDefaults/aName
   *  and load them respectively into a reference and a user resource structure.
   * 
   *  If CSF_ResourceVerbose defined, seeked files will be printed.
   * 
   *  FILE SYNTAX
   *  The syntax of a resource file is a sequence of resource
   *  lines terminated by newline characters or end of file.  The
   *  syntax of an individual resource line is:
   */
  public Resource_Manager(String aName, long Verbose) {
    this(OCCwrapJavaJNI.new_Resource_Manager__SWIG_0(aName, Verbose), true);
  }

  public Resource_Manager(String aName) {
    this(OCCwrapJavaJNI.new_Resource_Manager__SWIG_1(aName), true);
  }

  public Resource_Manager(String aName, TCollection_AsciiString aDefaultsDirectory, TCollection_AsciiString anUserDefaultsDirectory, long Verbose) {
    this(OCCwrapJavaJNI.new_Resource_Manager__SWIG_2(aName, TCollection_AsciiString.getCPtr(aDefaultsDirectory), aDefaultsDirectory, TCollection_AsciiString.getCPtr(anUserDefaultsDirectory), anUserDefaultsDirectory, Verbose), true);
  }

  public Resource_Manager(String aName, TCollection_AsciiString aDefaultsDirectory, TCollection_AsciiString anUserDefaultsDirectory) {
    this(OCCwrapJavaJNI.new_Resource_Manager__SWIG_3(aName, TCollection_AsciiString.getCPtr(aDefaultsDirectory), aDefaultsDirectory, TCollection_AsciiString.getCPtr(anUserDefaultsDirectory), anUserDefaultsDirectory), true);
  }

  /**
   *  Save the user resource structure in the specified file.
   *  Creates the file if it does not exist.
   */
  public long Save() {
    return OCCwrapJavaJNI.Resource_Manager_Save(swigCPtr, this);
  }

  /**
   *  returns True if the Resource does exist.
   */
  public long Find(String aResource) {
    return OCCwrapJavaJNI.Resource_Manager_Find(swigCPtr, this, aResource);
  }

  /**
   *  Gets the value of an integer resource according to its
   *  instance and its type.
   */
  public int Integer(String aResourceName) {
    return OCCwrapJavaJNI.Resource_Manager_Integer(swigCPtr, this, aResourceName);
  }

  /**
   *  Gets the value of a real resource according to its instance
   *  and its type.
   */
  public double Real(String aResourceName) {
    return OCCwrapJavaJNI.Resource_Manager_Real(swigCPtr, this, aResourceName);
  }

  /**
   *  Gets the value of a CString resource according to its instance
   *  and its type.
   */
  public String Value(String aResourceName) {
    return OCCwrapJavaJNI.Resource_Manager_Value(swigCPtr, this, aResourceName);
  }

  /**
   *  Gets the value of an ExtString resource according to its instance
   *  and its type.
   */
  public SWIGTYPE_p_Standard_ExtString ExtValue(String aResourceName) {
    return new SWIGTYPE_p_Standard_ExtString(OCCwrapJavaJNI.Resource_Manager_ExtValue(swigCPtr, this, aResourceName), true);
  }

  /**
   *  Sets the new value of an integer resource.
   *  If the resource does not exist, it is created.
   */
  public void SetResource(String aResourceName, int aValue) {
    OCCwrapJavaJNI.Resource_Manager_SetResource__SWIG_0(swigCPtr, this, aResourceName, aValue);
  }

  /**
   *  Sets the new value of a real resource.
   *  If the resource does not exist, it is created.
   */
  public void SetResource(String aResourceName, double aValue) {
    OCCwrapJavaJNI.Resource_Manager_SetResource__SWIG_1(swigCPtr, this, aResourceName, aValue);
  }

  /**
   *  Sets the new value of an CString resource.
   *  If the resource does not exist, it is created.
   */
  public void SetResource(String aResourceName, String aValue) {
    OCCwrapJavaJNI.Resource_Manager_SetResource__SWIG_2(swigCPtr, this, aResourceName, aValue);
  }

  /**
   *  Sets the new value of an ExtString resource.
   *  If the resource does not exist, it is created.
   */
  public void SetResource(String aResourceName, SWIGTYPE_p_Standard_ExtString aValue) {
    OCCwrapJavaJNI.Resource_Manager_SetResource__SWIG_3(swigCPtr, this, aResourceName, SWIGTYPE_p_Standard_ExtString.getCPtr(aValue));
  }

  /**
   *  Gets the resource file full path by its name.
   *  If corresponding environment variable is not set
   *  or file doesn't exist returns empty string.
   */
  public static void GetResourcePath(TCollection_AsciiString aPath, String aName, long isUserDefaults) {
    OCCwrapJavaJNI.Resource_Manager_GetResourcePath(TCollection_AsciiString.getCPtr(aPath), aPath, aName, isUserDefaults);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Resource_Manager_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Resource_Manager_get_type_descriptor(), true );
  }

  public static  Resource_Manager  DownCast( Standard_Transient  T) {
    return new Resource_Manager ( OCCwrapJavaJNI.Resource_Manager_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Resource_Manager_TypeOf(), true );
  }

}
