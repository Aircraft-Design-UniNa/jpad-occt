package opencascade;

/**
 *  Management of directories (a set of directory oriented tools)
 */
public class OSD_Directory extends OSD_FileNode {
  private long swigCPtr;
  OSD_Directory(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.OSD_Directory_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn);
  }

  OSD_Directory(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.OSD_Directory_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn, Parent);
  }

  static long getCPtr(OSD_Directory obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object
  // requiring explicit decision to use it either as a reference or as a copy
  /*public class CRef {
    public CRef (OSD_Directory ptr) { Ptr = ptr; }
    public OSD_Directory AsReference () { return Ptr; }
    public OSD_Directory AsCopy () { return Ptr.MakeCopy(); }
    public OSD_Directory Ptr;
  }*/ 
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_OSD_Directory(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Creates a temporary Directory in current directory.
   *  This directory is automatically removed when object dies.
   */
  public static OSD_Directory BuildTemporary() {
    return new OSD_Directory(OCCwrapJavaJNI.OSD_Directory_BuildTemporary(), true);
  }

  /**
   *  Creates Directory object.
   *  It is initiliazed to an empty name.
   */
  public OSD_Directory() {
    this(OCCwrapJavaJNI.new_OSD_Directory__SWIG_0(), true);
  }

  /**
   *  Creates Directory object initialized with theName.
   */
  public OSD_Directory( OSD_Path  theName) {
    this(OCCwrapJavaJNI.new_OSD_Directory__SWIG_1(OSD_Path.getCPtr(theName), theName), true);
  }

  /**
   *  Creates (physically) a directory.
   *  When a directory of the same name already exists, no error is
   *  returned, and only <Protect> is applied to the existing directory.
   * 
   *  If Build is used and <me> is instantiated without a name,
   *  OSDError is raised.
   */
  public void Build( OSD_Protection  Protect) {
    OCCwrapJavaJNI.OSD_Directory_Build(swigCPtr, this, OSD_Protection.getCPtr(Protect), Protect);
  }

}
