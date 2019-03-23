package opencascade;

public class Standard_Transient {protected long swigCPtr;
  protected boolean swigCMemOwn;

  Standard_Transient(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  static long getCPtr(Standard_Transient obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Define destructor (i.e. finalizer) for Standard_Transient explicitly by Java 
  // code since its automatic generation is avoided (see WRAP_AS_HANDLE macro) 
  protected void finalize() {
    delete();
  }

  // Unused method added to avoid generation of Dispose() methods in descendants
  public synchronized void disposeUnused () {} 
  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Standard_Transient(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor
   */
  public Standard_Transient() {
    this(OCCwrapJavaJNI.new_Standard_Transient__SWIG_0(), true);
  }

  /**
   *  Copy constructor -- does nothing
   */
  public Standard_Transient(Standard_Transient arg0) {
    this(OCCwrapJavaJNI.new_Standard_Transient__SWIG_1(Standard_Transient.getCPtr(arg0), arg0), true);
  }

  /**
   *  Memory deallocator for transient classes
   */
  public void Delete() {
    OCCwrapJavaJNI.Standard_Transient_Delete(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Standard_Transient_get_type_name();
  }

  /**
   *  Returns type descriptor of Standard_Transient class
   */
  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Standard_Transient_get_type_descriptor(), true );
  }

  /**
   *  Returns a type descriptor about this object.
   */
  public  Standard_Type  DynamicType() {
    return new Standard_Type ( OCCwrapJavaJNI.Standard_Transient_DynamicType(swigCPtr, this), true );
  }

  /**
   *  Returns a true value if this is an instance of Type.
   */
  public long IsInstance( Standard_Type  theType) {
    return OCCwrapJavaJNI.Standard_Transient_IsInstance__SWIG_0(swigCPtr, this,  Standard_Type.getCPtr(theType) , theType);
  }

  /**
   *  Returns a true value if this is an instance of TypeName.
   */
  public long IsInstance(String theTypeName) {
    return OCCwrapJavaJNI.Standard_Transient_IsInstance__SWIG_1(swigCPtr, this, theTypeName);
  }

  /**
   *  Returns true if this is an instance of Type or an
   *  instance of any class that inherits from Type.
   *  Note that multiple inheritance is not supported by OCCT RTTI mechanism.
   */
  public long IsKind( Standard_Type  theType) {
    return OCCwrapJavaJNI.Standard_Transient_IsKind__SWIG_0(swigCPtr, this,  Standard_Type.getCPtr(theType) , theType);
  }

  /**
   *  Returns true if this is an instance of TypeName or an
   *  instance of any class that inherits from TypeName.
   *  Note that multiple inheritance is not supported by OCCT RTTI mechanism.
   */
  public long IsKind(String theTypeName) {
    return OCCwrapJavaJNI.Standard_Transient_IsKind__SWIG_1(swigCPtr, this, theTypeName);
  }

  /**
   *  Returns non-const pointer to this object (like const_cast).
   *  For protection against creating handle to objects allocated in stack
   *  or call from constructor, it will raise exception Standard_ProgramError
   *  if reference counter is zero.
   */
  public Standard_Transient This() {
    long cPtr = OCCwrapJavaJNI.Standard_Transient_This(swigCPtr, this);
    return (cPtr == 0) ? null : new Standard_Transient(cPtr, false);
  }

  /**
   *  Get the reference counter of this object
   */
  public int GetRefCount() {
    return OCCwrapJavaJNI.Standard_Transient_GetRefCount(swigCPtr, this);
  }

  /**
   *  Increments the reference counter of this object
   */
  public void IncrementRefCounter() {
    OCCwrapJavaJNI.Standard_Transient_IncrementRefCounter(swigCPtr, this);
  }

  /**
   *  Decrements the reference counter of this object;
   *  returns the decremented value
   */
  public int DecrementRefCounter() {
    return OCCwrapJavaJNI.Standard_Transient_DecrementRefCounter(swigCPtr, this);
  }

  public boolean IsNull() {
    return OCCwrapJavaJNI.Standard_Transient_IsNull(swigCPtr, this);
  }

  public static  Standard_Transient  DownCast( Standard_Transient  T) {
    return new Standard_Transient ( OCCwrapJavaJNI.Standard_Transient_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Standard_Transient_TypeOf(), true );
  }

}
