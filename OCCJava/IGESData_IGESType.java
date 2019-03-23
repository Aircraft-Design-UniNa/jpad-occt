package opencascade;

/**
 *  taken from directory part of an entity (from file or model),
 *  gives "type" and "form" data, used to recognize entity's type
 */
public class IGESData_IGESType {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IGESData_IGESType(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IGESData_IGESType(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IGESData_IGESType obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (IGESData_IGESType ptr) { Ptr = ptr; }
    public IGESData_IGESType AsReference () { return Ptr; }
    public IGESData_IGESType AsCopy () { return Ptr.MakeCopy(); }
    public IGESData_IGESType Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IGESData_IGESType(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IGESData_IGESType() {
    this(OCCwrapJavaJNI.new_IGESData_IGESType__SWIG_0(), true);
  }

  public IGESData_IGESType(int atype, int aform) {
    this(OCCwrapJavaJNI.new_IGESData_IGESType__SWIG_1(atype, aform), true);
  }

  /**
   *  returns "type" data
   */
  public int Type() {
    return OCCwrapJavaJNI.IGESData_IGESType_Type(swigCPtr, this);
  }

  /**
   *  returns "form" data
   */
  public int Form() {
    return OCCwrapJavaJNI.IGESData_IGESType_Form(swigCPtr, this);
  }

  /**
   *  compares two IGESTypes, avoiding comparing their fields
   */
  public long IsEqual( IGESData_IGESType  another) {
    return OCCwrapJavaJNI.IGESData_IGESType_IsEqual(swigCPtr, this, IGESData_IGESType.getCPtr(another), another);
  }

  /**
   *  resets fields (usefull when an IGESType is stored as mask)
   */
  public void Nullify() {
    OCCwrapJavaJNI.IGESData_IGESType_Nullify(swigCPtr, this);
  }

}
