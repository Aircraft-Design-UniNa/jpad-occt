package opencascade;

/**
 *  A set of system process tools
 */
public class OSD_Process {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  OSD_Process(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  OSD_Process(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(OSD_Process obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (OSD_Process ptr) { Ptr = ptr; }
    public OSD_Process AsReference () { return Ptr; }
    public OSD_Process AsCopy () { return Ptr.MakeCopy(); }
    public OSD_Process Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_OSD_Process(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Initializes the object and prepare for a possible dump
   */
  public OSD_Process() {
    this(OCCwrapJavaJNI.new_OSD_Process(), true);
  }

  /**
   *  Returns the terminal used (vt100, vt200 ,sun-cmd ...)
   */
  public void TerminalType(TCollection_AsciiString Name) {
    OCCwrapJavaJNI.OSD_Process_TerminalType(swigCPtr, this, TCollection_AsciiString.getCPtr(Name), Name);
  }

  /**
   *  Gets system date.
   */
  public Quantity_Date SystemDate() {
    return new Quantity_Date(OCCwrapJavaJNI.OSD_Process_SystemDate(swigCPtr, this), true);
  }

  /**
   *  Returns the user name.
   */
  public TCollection_AsciiString UserName() {
    return new TCollection_AsciiString(OCCwrapJavaJNI.OSD_Process_UserName(swigCPtr, this), true);
  }

  /**
   *  Returns True if the process user is the super-user.
   */
  public long IsSuperUser() {
    return OCCwrapJavaJNI.OSD_Process_IsSuperUser(swigCPtr, this);
  }

  /**
   *  Returns the 'Process Id'
   */
  public int ProcessId() {
    return OCCwrapJavaJNI.OSD_Process_ProcessId(swigCPtr, this);
  }

  /**
   *  Returns the current path where the process is.
   */
  public OSD_Path CurrentDirectory() {
    return new OSD_Path(OCCwrapJavaJNI.OSD_Process_CurrentDirectory(swigCPtr, this), true);
  }

  /**
   *  Changes the current process directory.
   */
  public void SetCurrentDirectory( OSD_Path  where) {
    OCCwrapJavaJNI.OSD_Process_SetCurrentDirectory(swigCPtr, this, OSD_Path.getCPtr(where), where);
  }

  /**
   *  Returns TRUE if an error occurs
   */
  public long Failed() {
    return OCCwrapJavaJNI.OSD_Process_Failed(swigCPtr, this);
  }

  /**
   *  Resets error counter to zero
   */
  public void Reset() {
    OCCwrapJavaJNI.OSD_Process_Reset(swigCPtr, this);
  }

  /**
   *  Raises OSD_Error
   */
  public void Perror() {
    OCCwrapJavaJNI.OSD_Process_Perror(swigCPtr, this);
  }

  /**
   *  Returns error number if 'Failed' is TRUE.
   */
  public int Error() {
    return OCCwrapJavaJNI.OSD_Process_Error(swigCPtr, this);
  }

}
