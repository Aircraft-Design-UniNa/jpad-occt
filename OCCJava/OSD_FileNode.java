package opencascade;

/**
 *  A class for 'File' and 'Directory' grouping common
 *  methods (file/directory manipulation tools).
 *  The "file oriented" name means files or directories which are
 *  in fact hard coded as files.
 */
public class OSD_FileNode {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  OSD_FileNode(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  OSD_FileNode(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(OSD_FileNode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Gets file name and path.
   */
  public void Path(OSD_Path Name) {
    OCCwrapJavaJNI.OSD_FileNode_Path(swigCPtr, this, OSD_Path.getCPtr(Name), Name);
  }

  /**
   *  Sets file name and path.
   *  If a name is not found, it raises a program error.
   */
  public void SetPath( OSD_Path  Name) {
    OCCwrapJavaJNI.OSD_FileNode_SetPath(swigCPtr, this, OSD_Path.getCPtr(Name), Name);
  }

  /**
   *  Returns TRUE if <me> exists.
   */
  public long Exists() {
    return OCCwrapJavaJNI.OSD_FileNode_Exists(swigCPtr, this);
  }

  /**
   *  Erases the FileNode from directory
   */
  public void Remove() {
    OCCwrapJavaJNI.OSD_FileNode_Remove(swigCPtr, this);
  }

  /**
   *  Moves <me> into another directory
   */
  public void Move( OSD_Path  NewPath) {
    OCCwrapJavaJNI.OSD_FileNode_Move(swigCPtr, this, OSD_Path.getCPtr(NewPath), NewPath);
  }

  /**
   *  Copies <me> to another FileNode
   */
  public void Copy( OSD_Path  ToPath) {
    OCCwrapJavaJNI.OSD_FileNode_Copy(swigCPtr, this, OSD_Path.getCPtr(ToPath), ToPath);
  }

  /**
   *  Returns access mode of <me>.
   */
  public OSD_Protection Protection() {
    return new OSD_Protection(OCCwrapJavaJNI.OSD_FileNode_Protection(swigCPtr, this), true);
  }

  /**
   *  Changes protection of the FileNode
   */
  public void SetProtection( OSD_Protection  Prot) {
    OCCwrapJavaJNI.OSD_FileNode_SetProtection(swigCPtr, this, OSD_Protection.getCPtr(Prot), Prot);
  }

  /**
   *  Returns last write access.
   *  On UNIX, AccessMoment and CreationMoment return the
   *  same value.
   */
  public Quantity_Date AccessMoment() {
    return new Quantity_Date(OCCwrapJavaJNI.OSD_FileNode_AccessMoment(swigCPtr, this), true);
  }

  /**
   *  Returns creation date.
   *  On UNIX, AccessMoment and CreationMoment return the
   *  same value.
   */
  public Quantity_Date CreationMoment() {
    return new Quantity_Date(OCCwrapJavaJNI.OSD_FileNode_CreationMoment(swigCPtr, this), true);
  }

  /**
   *  Returns TRUE if an error occurs
   */
  public long Failed() {
    return OCCwrapJavaJNI.OSD_FileNode_Failed(swigCPtr, this);
  }

  /**
   *  Resets error counter to zero
   */
  public void Reset() {
    OCCwrapJavaJNI.OSD_FileNode_Reset(swigCPtr, this);
  }

  /**
   *  Raises OSD_Error
   */
  public void Perror() {
    OCCwrapJavaJNI.OSD_FileNode_Perror(swigCPtr, this);
  }

  /**
   *  Returns error number if 'Failed' is TRUE.
   */
  public int Error() {
    return OCCwrapJavaJNI.OSD_FileNode_Error(swigCPtr, this);
  }

}
