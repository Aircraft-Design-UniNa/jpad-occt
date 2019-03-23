package opencascade;

/**
 *  Disk management (a set of disk oriented tools)
 */
public class OSD_Disk {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  OSD_Disk(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  OSD_Disk(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(OSD_Disk obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (OSD_Disk ptr) { Ptr = ptr; }
    public OSD_Disk AsReference () { return Ptr; }
    public OSD_Disk AsCopy () { return Ptr.MakeCopy(); }
    public OSD_Disk Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_OSD_Disk(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a disk object.
   *  This is used only when a class contains a Disk field.
   *  By default, its name is initialized to current working disk.
   */
  public OSD_Disk() {
    this(OCCwrapJavaJNI.new_OSD_Disk__SWIG_0(), true);
  }

  /**
   *  Initializes the object Disk with the disk name
   *  associated to the OSD_Path.
   */
  public OSD_Disk( OSD_Path  Name) {
    this(OCCwrapJavaJNI.new_OSD_Disk__SWIG_1(OSD_Path.getCPtr(Name), Name), true);
  }

  /**
   *  Initializes the object Disk with <PathName>.
   *  <PathName> specifies any file within the mounted
   *  file system.
   *  Example : OSD_Disk myDisk ("/tmp")
   *  Initializes a disk object with the mounted
   *  file associated to /tmp.
   */
  public OSD_Disk(String PathName) {
    this(OCCwrapJavaJNI.new_OSD_Disk__SWIG_2(PathName), true);
  }

  /**
   *  Returns disk name of <me>.
   */
  public OSD_Path Name() {
    return new OSD_Path(OCCwrapJavaJNI.OSD_Disk_Name(swigCPtr, this), true);
  }

  /**
   *  Instantiates <me> with <Name>.
   */
  public void SetName( OSD_Path  Name) {
    OCCwrapJavaJNI.OSD_Disk_SetName(swigCPtr, this, OSD_Path.getCPtr(Name), Name);
  }

  /**
   *  Returns total disk capacity in 512 bytes blocks.
   */
  public int DiskSize() {
    return OCCwrapJavaJNI.OSD_Disk_DiskSize(swigCPtr, this);
  }

  /**
   *  Returns free available 512 bytes blocks on disk.
   */
  public int DiskFree() {
    return OCCwrapJavaJNI.OSD_Disk_DiskFree(swigCPtr, this);
  }

  /**
   *  Returns TRUE if an error occurs
   */
  public long Failed() {
    return OCCwrapJavaJNI.OSD_Disk_Failed(swigCPtr, this);
  }

  /**
   *  Resets error counter to zero
   */
  public void Reset() {
    OCCwrapJavaJNI.OSD_Disk_Reset(swigCPtr, this);
  }

  /**
   *  Raises OSD_Error
   */
  public void Perror() {
    OCCwrapJavaJNI.OSD_Disk_Perror(swigCPtr, this);
  }

  /**
   *  Returns error number if 'Failed' is TRUE.
   */
  public int Error() {
    return OCCwrapJavaJNI.OSD_Disk_Error(swigCPtr, this);
  }

}
