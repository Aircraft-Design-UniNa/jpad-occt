package opencascade;

/**
 *  Basic tools to manage files
 *  Warning: 'ProgramError' is raised when somebody wants to use the methods
 *  Read, Write, Seek, Close when File is not open.
 */
public class OSD_File extends OSD_FileNode {
  private long swigCPtr;
  OSD_File(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.OSD_File_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn);
  }

  OSD_File(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.OSD_File_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn, Parent);
  }

  static long getCPtr(OSD_File obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object
  // requiring explicit decision to use it either as a reference or as a copy
  /*public class CRef {
    public CRef (OSD_File ptr) { Ptr = ptr; }
    public OSD_File AsReference () { return Ptr; }
    public OSD_File AsCopy () { return Ptr.MakeCopy(); }
    public OSD_File Ptr;
  }*/ 
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_OSD_File(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Creates File object.
   */
  public OSD_File() {
    this(OCCwrapJavaJNI.new_OSD_File__SWIG_0(), true);
  }

  /**
   *  Instantiates the object file, storing its name
   */
  public OSD_File( OSD_Path  Name) {
    this(OCCwrapJavaJNI.new_OSD_File__SWIG_1(OSD_Path.getCPtr(Name), Name), true);
  }

  /**
   *  CREATES a file if it doesn't already exists or empties
   *  an existing file.
   *  After 'Build', the file is open.
   *  If no name was given, ProgramError is raised.
   */
  public void Build(OSD_OpenMode Mode,  OSD_Protection  Protect) {
    OCCwrapJavaJNI.OSD_File_Build(swigCPtr, this, Mode.swigValue(), OSD_Protection.getCPtr(Protect), Protect);
  }

  /**
   *  Opens a File with specific attributes
   *  This works only on already existing file.
   *  If no name was given, ProgramError is raised.
   */
  public void Open(OSD_OpenMode Mode,  OSD_Protection  Protect) {
    OCCwrapJavaJNI.OSD_File_Open(swigCPtr, this, Mode.swigValue(), OSD_Protection.getCPtr(Protect), Protect);
  }

  /**
   *  Appends data to an existing file.
   *  If file doesn't exist, creates it first.
   *  After 'Append', the file is open.
   *  If no name was given, ProgramError is raised.
   */
  public void Append(OSD_OpenMode Mode,  OSD_Protection  Protect) {
    OCCwrapJavaJNI.OSD_File_Append(swigCPtr, this, Mode.swigValue(), OSD_Protection.getCPtr(Protect), Protect);
  }

  /**
   *  Attempts to read Nbyte bytes from the file associated with
   *  the object file.
   *  Upon successful completion, Read returns the number of
   *  bytes actually read and placed in the Buffer. This number
   *  may be less than Nbyte if the number of bytes left in the file
   *  is less than Nbyte bytes. In this case only number of read
   *  bytes will be placed in the buffer.
   */
  public void Read(TCollection_AsciiString Buffer, int Nbyte) {
    OCCwrapJavaJNI.OSD_File_Read__SWIG_0(swigCPtr, this, TCollection_AsciiString.getCPtr(Buffer), Buffer, Nbyte);
  }

  /**
   *  Reads bytes from the data pointed to by the object file
   *  into the buffer <Buffer>.
   *  Data is read until <NByte-1> bytes have been read,
   *  until	a newline character is read and transferred into
   *  <Buffer>, or until an EOF (End-of-File) condition is
   *  encountered.
   *  Upon successful completion, Read returns the number of
   *  bytes actually read into <NByteRead> and placed into the
   *  Buffer <Buffer>.
   */
  public void ReadLine(TCollection_AsciiString Buffer, int NByte, int[] NbyteRead) {
    OCCwrapJavaJNI.OSD_File_ReadLine__SWIG_0(swigCPtr, this, TCollection_AsciiString.getCPtr(Buffer), Buffer, NByte, NbyteRead);
  }

  /**
   *  Reads bytes from the data pointed to by the object file
   *  into the buffer <Buffer>.
   *  Data is read until <NByte-1> bytes have been read,
   *  until	a newline character is read and transferred into
   *  <Buffer>, or until an EOF (End-of-File) condition is
   *  encountered.
   *  Upon successful completion, Read returns the number of
   *  bytes actually read and placed into the Buffer <Buffer>.
   */
  public int ReadLine(TCollection_AsciiString Buffer, int NByte) {
    return OCCwrapJavaJNI.OSD_File_ReadLine__SWIG_1(swigCPtr, this, TCollection_AsciiString.getCPtr(Buffer), Buffer, NByte);
  }

  /**
   *  Attempts to read Nbyte bytes from the files associated with
   *  the object File.
   *  Upon successful completion, Read returns the number of
   *  bytes actually read and placed in the Buffer. This number
   *  may be less than Nbyte if the number of bytes left in the file
   *  is less than Nbyte bytes. For this reason the output
   *  parameter Readbyte will contain the number of read bytes.
   */
  public void Read( long  Buffer, int Nbyte, int[] Readbyte) {
    OCCwrapJavaJNI.OSD_File_Read__SWIG_1(swigCPtr, this,  Buffer , Nbyte, Readbyte);
  }

  /**
   *  Attempts to write theNbBytes bytes from the AsciiString to the file.
   */
  public void Write( TCollection_AsciiString  theBuffer, int theNbBytes) {
    OCCwrapJavaJNI.OSD_File_Write__SWIG_0(swigCPtr, this, TCollection_AsciiString.getCPtr(theBuffer), theBuffer, theNbBytes);
  }

  public void Write( long  theBuffer, int theNbBytes) {
    OCCwrapJavaJNI.OSD_File_Write__SWIG_1(swigCPtr, this,  theBuffer , theNbBytes);
  }

  /**
   *  Sets the seek pointer associated with the open file
   */
  public void Seek(int Offset, OSD_FromWhere Whence) {
    OCCwrapJavaJNI.OSD_File_Seek(swigCPtr, this, Offset, Whence.swigValue());
  }

  /**
   *  Closes the file (and deletes a descriptor)
   */
  public void Close() {
    OCCwrapJavaJNI.OSD_File_Close(swigCPtr, this);
  }

  /**
   *  Returns TRUE if the seek pointer is at end of file.
   */
  public long IsAtEnd() {
    return OCCwrapJavaJNI.OSD_File_IsAtEnd(swigCPtr, this);
  }

  /**
   *  Returns the kind of file. A file can be a
   *  file, a directory or a link.
   */
  public OSD_KindFile KindOfFile() {
    return OSD_KindFile.swigToEnum(OCCwrapJavaJNI.OSD_File_KindOfFile(swigCPtr, this));
  }

  /**
   *  Makes a temporary File
   *  This temporary file is already open !
   */
  public void BuildTemporary() {
    OCCwrapJavaJNI.OSD_File_BuildTemporary(swigCPtr, this);
  }

  /**
   *  Locks current file
   */
  public void SetLock(OSD_LockType Lock) {
    OCCwrapJavaJNI.OSD_File_SetLock(swigCPtr, this, Lock.swigValue());
  }

  /**
   *  Unlocks current file
   */
  public void UnLock() {
    OCCwrapJavaJNI.OSD_File_UnLock(swigCPtr, this);
  }

  /**
   *  Returns the current lock state
   */
  public OSD_LockType GetLock() {
    return OSD_LockType.swigToEnum(OCCwrapJavaJNI.OSD_File_GetLock(swigCPtr, this));
  }

  /**
   *  Returns TRUE if this file is locked.
   */
  public long IsLocked() {
    return OCCwrapJavaJNI.OSD_File_IsLocked(swigCPtr, this);
  }

  /**
   *  Returns actual number of bytes of <me>.
   */
  public long Size() {
    return OCCwrapJavaJNI.OSD_File_Size(swigCPtr, this);
  }

  /**
   *  Returns TRUE if <me> is open.
   */
  public long IsOpen() {
    return OCCwrapJavaJNI.OSD_File_IsOpen(swigCPtr, this);
  }

  /**
   *  returns TRUE if the file exists and if the user
   *  has the autorization to read it.
   */
  public long IsReadable() {
    return OCCwrapJavaJNI.OSD_File_IsReadable(swigCPtr, this);
  }

  /**
   *  returns TRUE if the file can be read and overwritten.
   */
  public long IsWriteable() {
    return OCCwrapJavaJNI.OSD_File_IsWriteable(swigCPtr, this);
  }

  /**
   *  returns TRUE if the file can be executed.
   */
  public long IsExecutable() {
    return OCCwrapJavaJNI.OSD_File_IsExecutable(swigCPtr, this);
  }

  /**
   *  Enables to emulate unix "tail -f" command.
   *  If a line is available in the file <me> returns it.
   *  Otherwise attemps to read again aNbTries times in the file
   *  waiting aDelay seconds between each read.
   *  If meanwhile the file increases returns the next line, otherwise
   *  returns FALSE.
   */
  public long ReadLastLine(TCollection_AsciiString aLine, int aDelay, int aNbTries) {
    return OCCwrapJavaJNI.OSD_File_ReadLastLine(swigCPtr, this, TCollection_AsciiString.getCPtr(aLine), aLine, aDelay, aNbTries);
  }

  /**
   *  find an editor on the system and edit the given file
   */
  public long Edit() {
    return OCCwrapJavaJNI.OSD_File_Edit(swigCPtr, this);
  }

  /**
   *  Set file pointer position to the beginning of the file
   */
  public void Rewind() {
    OCCwrapJavaJNI.OSD_File_Rewind(swigCPtr, this);
  }

  /**
   *  Redirect a standard handle (fileno(stdout), fileno(stdin) or 
   *  fileno(stderr) to this OSD_File and return the copy of the original
   *  standard handle.
   *  Example:
   *     OSD_File aTmp;
   *     aTmp.BuildTemporary();
   *     int stdfd = _fileno(stdout);
   * 
   *     int oldout = aTmp.Capture(stdfd);
   *     cout << "Some output to the file" << endl;
   *     cout << flush;
   *     fflush(stdout);
   * 
   *     _dup2(oldout, stdfd); // Restore standard output
   *     aTmp.Close();
   */
  public int Capture(int theDescr) {
    return OCCwrapJavaJNI.OSD_File_Capture(swigCPtr, this, theDescr);
  }

}
