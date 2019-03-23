package opencascade;

public class Standard_Type extends Standard_Transient {
  Standard_Type(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns the system type name of the class (typeinfo.name)
   */
  public String SystemName() {
    return OCCwrapJavaJNI.Standard_Type_SystemName(swigCPtr, this);
  }

  /**
   *  Returns the given name of the class type (get_type_name)
   */
  public String Name() {
    return OCCwrapJavaJNI.Standard_Type_Name(swigCPtr, this);
  }

  /**
   *  Returns the size of the class instance in bytes
   */
  public long Size() {
    return OCCwrapJavaJNI.Standard_Type_Size(swigCPtr, this);
  }

  public  Standard_Type  Parent() {
    return new Standard_Type ( OCCwrapJavaJNI.Standard_Type_Parent(swigCPtr, this), true );
  }

  /**
   *  Returns True if this type is the same as theOther, or inherits from theOther.
   *  Note that multiple inheritance is not supported.
   */
  public long SubType( Standard_Type  theOther) {
    return OCCwrapJavaJNI.Standard_Type_SubType__SWIG_0(swigCPtr, this,  Standard_Type.getCPtr(theOther) , theOther);
  }

  /**
   *  Returns True if this type is the same as theOther, or inherits from theOther.
   *  Note that multiple inheritance is not supported.
   */
  public long SubType(String theOther) {
    return OCCwrapJavaJNI.Standard_Type_SubType__SWIG_1(swigCPtr, this, theOther);
  }

  /**
   *  Prints type (address of descriptor + name) to a stream
   */
  public void Print(SWIGTYPE_p_Standard_OStream theStream) {
    OCCwrapJavaJNI.Standard_Type_Print(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(theStream));
  }

  public static Standard_Type Register(String theSystemName, String theName, long theSize,  Standard_Type  theParent) {
    long cPtr = OCCwrapJavaJNI.Standard_Type_Register(theSystemName, theName, theSize,  Standard_Type.getCPtr(theParent) , theParent);
    return (cPtr == 0) ? null : new Standard_Type(cPtr, false);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Standard_Type_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Standard_Type_get_type_descriptor(), true );
  }

  public static  Standard_Type  DownCast( Standard_Transient  T) {
    return new Standard_Type ( OCCwrapJavaJNI.Standard_Type_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Standard_Type_TypeOf(), true );
  }

}
