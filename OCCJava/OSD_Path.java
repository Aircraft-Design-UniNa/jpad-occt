package opencascade;

public class OSD_Path {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  OSD_Path(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  OSD_Path(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(OSD_Path obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (OSD_Path ptr) { Ptr = ptr; }
    public OSD_Path AsReference () { return Ptr; }
    public OSD_Path AsCopy () { return Ptr.MakeCopy(); }
    public OSD_Path Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_OSD_Path(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a Path object initialized to an empty string.
   *  i.e. current directory.
   */
  public OSD_Path() {
    this(OCCwrapJavaJNI.new_OSD_Path__SWIG_0(), true);
  }

  /**
   *  Creates a Path object initialized by dependant path.
   *  ex: OSD_Path me ("/usr/bin/myprog.sh",OSD_UnixBSD);
   * 
   *  OSD_Path me ("sys$common:[syslib]cc.exe",OSD_OSF) will
   *  raise a ProgramError due to invalid name for this
   *  type of system.
   *  In order to avoid a 'ProgramError' , use IsValid(...)
   *  to ensure you the validity of <aDependentName>.
   *  Raises ConstructionError when the path is either null
   *  or contains characters not in range of ' '...'~'.
   */
  public OSD_Path( TCollection_AsciiString  aDependentName, OSD_SysType aSysType) {
    this(OCCwrapJavaJNI.new_OSD_Path__SWIG_1(TCollection_AsciiString.getCPtr(aDependentName), aDependentName, aSysType.swigValue()), true);
  }

  /**
   *  Initializes a system independent path.
   *  By default , the Path conversion will be assumed using
   *  currently used system.
   *  A special syntax is used to specify a "aTrek" in an
   *  independent manner :
   *  a "|" represents directory separator
   *  a "^" means directory above (father)
   *  examples:
   *  "|usr|bin" - On UNIX -> "/usr/bin"
   *  - On VMS  -> "[usr.bin]"
   *  - On MSDOS-> "\\usr\bin"
   *  - On MacOs-> ": usr : bin"
   * 
   *  "^|rep"    - On UNIX -> "../rep"
   *  - On VMS  -> "[-.rep]"
   *  - On MSDOS -> "..\rep"
   *  - On MacOS->  ":: rep"
   * 
   *  "subdir|" - On UNIX -> "subdir/"
   *  - On VMS  -> "[.subdir.]"
   */
  public OSD_Path( TCollection_AsciiString  aDependentName) {
    this(OCCwrapJavaJNI.new_OSD_Path__SWIG_2(TCollection_AsciiString.getCPtr(aDependentName), aDependentName), true);
  }

  public OSD_Path( TCollection_AsciiString  aNode,  TCollection_AsciiString  aUsername,  TCollection_AsciiString  aPassword,  TCollection_AsciiString  aDisk,  TCollection_AsciiString  aTrek,  TCollection_AsciiString  aName,  TCollection_AsciiString  anExtension) {
    this(OCCwrapJavaJNI.new_OSD_Path__SWIG_3(TCollection_AsciiString.getCPtr(aNode), aNode, TCollection_AsciiString.getCPtr(aUsername), aUsername, TCollection_AsciiString.getCPtr(aPassword), aPassword, TCollection_AsciiString.getCPtr(aDisk), aDisk, TCollection_AsciiString.getCPtr(aTrek), aTrek, TCollection_AsciiString.getCPtr(aName), aName, TCollection_AsciiString.getCPtr(anExtension), anExtension), true);
  }

  /**
   *  Gets each component of a path.
   */
  public void Values(TCollection_AsciiString aNode, TCollection_AsciiString aUsername, TCollection_AsciiString aPassword, TCollection_AsciiString aDisk, TCollection_AsciiString aTrek, TCollection_AsciiString aName, TCollection_AsciiString anExtension) {
    OCCwrapJavaJNI.OSD_Path_Values(swigCPtr, this, TCollection_AsciiString.getCPtr(aNode), aNode, TCollection_AsciiString.getCPtr(aUsername), aUsername, TCollection_AsciiString.getCPtr(aPassword), aPassword, TCollection_AsciiString.getCPtr(aDisk), aDisk, TCollection_AsciiString.getCPtr(aTrek), aTrek, TCollection_AsciiString.getCPtr(aName), aName, TCollection_AsciiString.getCPtr(anExtension), anExtension);
  }

  /**
   *  Sets each component of a path.
   */
  public void SetValues( TCollection_AsciiString  aNode,  TCollection_AsciiString  aUsername,  TCollection_AsciiString  aPassword,  TCollection_AsciiString  aDisk,  TCollection_AsciiString  aTrek,  TCollection_AsciiString  aName,  TCollection_AsciiString  anExtension) {
    OCCwrapJavaJNI.OSD_Path_SetValues(swigCPtr, this, TCollection_AsciiString.getCPtr(aNode), aNode, TCollection_AsciiString.getCPtr(aUsername), aUsername, TCollection_AsciiString.getCPtr(aPassword), aPassword, TCollection_AsciiString.getCPtr(aDisk), aDisk, TCollection_AsciiString.getCPtr(aTrek), aTrek, TCollection_AsciiString.getCPtr(aName), aName, TCollection_AsciiString.getCPtr(anExtension), anExtension);
  }

  /**
   *  Returns system dependent path
   *  <aType> is one among Unix,VMS ...
   *  This function is not private because you may need to
   *  display system dependent path on a front-end.
   *  It can be useful when communicating with another system.
   *  For instance when you want to communicate between VMS and Unix
   *  to transfer files, or to do a remote procedure call
   *  using files.
   *  example :
   *  OSD_Path myPath ("sparc4", "sga", "secret_passwd",
   *  "$5$dkb100","|users|examples");
   *  Internal ( Dependent_name );
   *  On UNIX  sga"secret_passwd"@sparc4:/users/examples
   *  On VMS   sparc4"sga secret_passwd"::$5$dkb100:[users.examples]
   *  Sets each component of a Path giving its system dependent name.
   */
  public void SystemName(TCollection_AsciiString FullName, OSD_SysType aType) {
    OCCwrapJavaJNI.OSD_Path_SystemName__SWIG_0(swigCPtr, this, TCollection_AsciiString.getCPtr(FullName), FullName, aType.swigValue());
  }

  public void SystemName(TCollection_AsciiString FullName) {
    OCCwrapJavaJNI.OSD_Path_SystemName__SWIG_1(swigCPtr, this, TCollection_AsciiString.getCPtr(FullName), FullName);
  }

  /**
   *  Returns system dependent path resolving logical symbols.
   */
  public void ExpandedName(TCollection_AsciiString aName) {
    OCCwrapJavaJNI.OSD_Path_ExpandedName(swigCPtr, this, TCollection_AsciiString.getCPtr(aName), aName);
  }

  /**
   *  Returns TRUE if <theDependentName> is valid for this SysType.
   */
  public static long IsValid( TCollection_AsciiString  theDependentName, OSD_SysType theSysType) {
    return OCCwrapJavaJNI.OSD_Path_IsValid__SWIG_0(TCollection_AsciiString.getCPtr(theDependentName), theDependentName, theSysType.swigValue());
  }

  public static long IsValid( TCollection_AsciiString  theDependentName) {
    return OCCwrapJavaJNI.OSD_Path_IsValid__SWIG_1(TCollection_AsciiString.getCPtr(theDependentName), theDependentName);
  }

  /**
   *  This removes the last directory name in <aTrek>
   *  and returns result.
   *  ex:  me = "|usr|bin|todo.sh"
   *  me.UpTrek() gives me = "|usr|todo.sh"
   *  if <me> contains "|", me.UpTrek() will give again "|"
   *  without any error.
   */
  public void UpTrek() {
    OCCwrapJavaJNI.OSD_Path_UpTrek(swigCPtr, this);
  }

  /**
   *  This appends a directory name into the Trek.
   *  ex: me = "|usr|todo.sh"
   *  me.DownTrek("bin") gives me = "|usr|bin|todo.sh".
   */
  public void DownTrek( TCollection_AsciiString  aName) {
    OCCwrapJavaJNI.OSD_Path_DownTrek(swigCPtr, this, TCollection_AsciiString.getCPtr(aName), aName);
  }

  /**
   *  Returns number of components in Trek of <me>.
   *  ex: me = "|usr|sys|etc|bin"
   *  me.TrekLength() returns 4.
   */
  public int TrekLength() {
    return OCCwrapJavaJNI.OSD_Path_TrekLength(swigCPtr, this);
  }

  /**
   *  This removes a component of Trek in <me> at position <where>.
   *  The first component of Trek is numbered 1.
   *  ex:   me = "|usr|bin|"
   *  me.RemoveATrek(1) gives me = "|bin|"
   *  To avoid a 'NumericError' because of a bad <where>, use
   *  TrekLength() to know number of components of Trek in <me>.
   */
  public void RemoveATrek(int where) {
    OCCwrapJavaJNI.OSD_Path_RemoveATrek__SWIG_0(swigCPtr, this, where);
  }

  /**
   *  This removes <aName> from <me> in Trek.
   *  No error is raised if <aName> is not in <me>.
   *  ex:  me = "|usr|sys|etc|doc"
   *  me.RemoveATrek("sys") gives me = "|usr|etc|doc".
   */
  public void RemoveATrek( TCollection_AsciiString  aName) {
    OCCwrapJavaJNI.OSD_Path_RemoveATrek__SWIG_1(swigCPtr, this, TCollection_AsciiString.getCPtr(aName), aName);
  }

  /**
   *  Returns component of Trek in <me> at position <where>.
   *  ex:  me = "|usr|bin|sys|"
   *  me.TrekValue(2) returns "bin"
   */
  public TCollection_AsciiString TrekValue(int where) {
    return new TCollection_AsciiString(OCCwrapJavaJNI.OSD_Path_TrekValue(swigCPtr, this, where), true);
  }

  /**
   *  This inserts <aName> at position <where> into Trek of <me>.
   *  ex:  me = "|usr|etc|"
   *  me.InsertATrek("sys",2) gives me = "|usr|sys|etc"
   */
  public void InsertATrek( TCollection_AsciiString  aName, int where) {
    OCCwrapJavaJNI.OSD_Path_InsertATrek(swigCPtr, this, TCollection_AsciiString.getCPtr(aName), aName, where);
  }

  /**
   *  Returns Node of <me>.
   */
  public TCollection_AsciiString Node() {
    return new TCollection_AsciiString(OCCwrapJavaJNI.OSD_Path_Node(swigCPtr, this), true);
  }

  /**
   *  Returns UserName of <me>.
   */
  public TCollection_AsciiString UserName() {
    return new TCollection_AsciiString(OCCwrapJavaJNI.OSD_Path_UserName(swigCPtr, this), true);
  }

  /**
   *  Returns Password of <me>.
   */
  public TCollection_AsciiString Password() {
    return new TCollection_AsciiString(OCCwrapJavaJNI.OSD_Path_Password(swigCPtr, this), true);
  }

  /**
   *  Returns Disk of <me>.
   */
  public TCollection_AsciiString Disk() {
    return new TCollection_AsciiString(OCCwrapJavaJNI.OSD_Path_Disk(swigCPtr, this), true);
  }

  /**
   *  Returns Trek of <me>.
   */
  public TCollection_AsciiString Trek() {
    return new TCollection_AsciiString(OCCwrapJavaJNI.OSD_Path_Trek(swigCPtr, this), true);
  }

  /**
   *  Returns file name of <me>.
   *  If <me> hasn't been initialized, it returns an empty AsciiString.
   */
  public TCollection_AsciiString Name() {
    return new TCollection_AsciiString(OCCwrapJavaJNI.OSD_Path_Name(swigCPtr, this), true);
  }

  /**
   *  Returns my extension name.
   *  This returns an empty string if path contains no file name.
   */
  public TCollection_AsciiString Extension() {
    return new TCollection_AsciiString(OCCwrapJavaJNI.OSD_Path_Extension(swigCPtr, this), true);
  }

  /**
   *  Sets Node of <me>.
   */
  public void SetNode( TCollection_AsciiString  aName) {
    OCCwrapJavaJNI.OSD_Path_SetNode(swigCPtr, this, TCollection_AsciiString.getCPtr(aName), aName);
  }

  /**
   *  Sets UserName of <me>.
   */
  public void SetUserName( TCollection_AsciiString  aName) {
    OCCwrapJavaJNI.OSD_Path_SetUserName(swigCPtr, this, TCollection_AsciiString.getCPtr(aName), aName);
  }

  /**
   *  Sets Password of <me>.
   */
  public void SetPassword( TCollection_AsciiString  aName) {
    OCCwrapJavaJNI.OSD_Path_SetPassword(swigCPtr, this, TCollection_AsciiString.getCPtr(aName), aName);
  }

  /**
   *  Sets Disk of <me>.
   */
  public void SetDisk( TCollection_AsciiString  aName) {
    OCCwrapJavaJNI.OSD_Path_SetDisk(swigCPtr, this, TCollection_AsciiString.getCPtr(aName), aName);
  }

  /**
   *  Sets Trek of <me>.
   */
  public void SetTrek( TCollection_AsciiString  aName) {
    OCCwrapJavaJNI.OSD_Path_SetTrek(swigCPtr, this, TCollection_AsciiString.getCPtr(aName), aName);
  }

  /**
   *  Sets file name of <me>.
   *  If <me> hasn't been initialized, it returns an empty AsciiString.
   */
  public void SetName( TCollection_AsciiString  aName) {
    OCCwrapJavaJNI.OSD_Path_SetName(swigCPtr, this, TCollection_AsciiString.getCPtr(aName), aName);
  }

  /**
   *  Sets my extension name.
   */
  public void SetExtension( TCollection_AsciiString  aName) {
    OCCwrapJavaJNI.OSD_Path_SetExtension(swigCPtr, this, TCollection_AsciiString.getCPtr(aName), aName);
  }

  /**
   *  Returns the relative file path between the absolute directory
   *  path <DirPath>  and the absolute file path <AbsFilePath>.
   *  If <DirPath> starts with "/", pathes are handled as
   *  on Unix, if it starts with a letter followed by ":", as on
   *  WNT. In particular on WNT directory names are not key sensitive.
   *  If handling fails, an empty string is returned.
   */
  public static TCollection_AsciiString RelativePath( TCollection_AsciiString  DirPath,  TCollection_AsciiString  AbsFilePath) {
    return new TCollection_AsciiString(OCCwrapJavaJNI.OSD_Path_RelativePath(TCollection_AsciiString.getCPtr(DirPath), DirPath, TCollection_AsciiString.getCPtr(AbsFilePath), AbsFilePath), true);
  }

  /**
   *  Returns the absolute file path from the absolute directory path
   *  <DirPath> and the relative file path returned by RelativePath().
   *  If the RelFilePath is an absolute path, it is returned and the
   *  directory path is ignored.
   *  If handling fails, an empty string is returned.
   */
  public static TCollection_AsciiString AbsolutePath( TCollection_AsciiString  DirPath,  TCollection_AsciiString  RelFilePath) {
    return new TCollection_AsciiString(OCCwrapJavaJNI.OSD_Path_AbsolutePath(TCollection_AsciiString.getCPtr(DirPath), DirPath, TCollection_AsciiString.getCPtr(RelFilePath), RelFilePath), true);
  }

}
