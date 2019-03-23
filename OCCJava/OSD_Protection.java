package opencascade;

/**
 *  This  class provides data to manage file protection
 *  Example:These rights are treated in a system dependent manner :
 *  On UNIX you have User,Group and Other rights
 *  On VMS  you have Owner,Group,World and System rights
 *  An automatic conversion is done between OSD and UNIX/VMS.
 * 
 *  OSD	VMS	UNIX
 *  User     Owner   User
 *  Group    Group   Group
 *  World    World   Other
 *  System   System  (combined with Other)
 * 
 *  When you use System protection on UNIX you must know that
 *  Other rights and System rights are inclusively "ORed".
 *  So Other with only READ access and System with WRITE access
 *  will produce on UNIX Other with READ and WRITE access.
 * 
 *  This choice comes from the fact that ROOT can't be considered
 *  as member of the group nor as user. So it is considered as Other.
 */
public class OSD_Protection {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  OSD_Protection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  OSD_Protection(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(OSD_Protection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (OSD_Protection ptr) { Ptr = ptr; }
    public OSD_Protection AsReference () { return Ptr; }
    public OSD_Protection AsCopy () { return Ptr.MakeCopy(); }
    public OSD_Protection Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_OSD_Protection(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Initializes global access rights as follows
   * 
   *  User   : Read Write
   *  System : Read Write
   *  Group  : Read
   *  World  : Read
   */
  public OSD_Protection() {
    this(OCCwrapJavaJNI.new_OSD_Protection__SWIG_0(), true);
  }

  /**
   *  Sets values of fields
   */
  public OSD_Protection(OSD_SingleProtection System, OSD_SingleProtection User, OSD_SingleProtection Group, OSD_SingleProtection World) {
    this(OCCwrapJavaJNI.new_OSD_Protection__SWIG_1(System.swigValue(), User.swigValue(), Group.swigValue(), World.swigValue()), true);
  }

  /**
   *  Retrieves values of fields
   */
  public void Values(int[] System, int[] User, int[] Group, int[] World) {
    OCCwrapJavaJNI.OSD_Protection_Values(swigCPtr, this, System, User, Group, World);
  }

  /**
   *  Sets values of fields
   */
  public void SetValues(OSD_SingleProtection System, OSD_SingleProtection User, OSD_SingleProtection Group, OSD_SingleProtection World) {
    OCCwrapJavaJNI.OSD_Protection_SetValues(swigCPtr, this, System.swigValue(), User.swigValue(), Group.swigValue(), World.swigValue());
  }

  /**
   *  Sets protection of 'System'
   */
  public void SetSystem(OSD_SingleProtection priv) {
    OCCwrapJavaJNI.OSD_Protection_SetSystem(swigCPtr, this, priv.swigValue());
  }

  /**
   *  Sets protection of 'User'
   */
  public void SetUser(OSD_SingleProtection priv) {
    OCCwrapJavaJNI.OSD_Protection_SetUser(swigCPtr, this, priv.swigValue());
  }

  /**
   *  Sets protection of 'Group'
   */
  public void SetGroup(OSD_SingleProtection priv) {
    OCCwrapJavaJNI.OSD_Protection_SetGroup(swigCPtr, this, priv.swigValue());
  }

  /**
   *  Sets protection of 'World'
   */
  public void SetWorld(OSD_SingleProtection priv) {
    OCCwrapJavaJNI.OSD_Protection_SetWorld(swigCPtr, this, priv.swigValue());
  }

  /**
   *  Gets protection of 'System'
   */
  public OSD_SingleProtection System() {
    return OSD_SingleProtection.swigToEnum(OCCwrapJavaJNI.OSD_Protection_System(swigCPtr, this));
  }

  /**
   *  Gets protection of 'User'
   */
  public OSD_SingleProtection User() {
    return OSD_SingleProtection.swigToEnum(OCCwrapJavaJNI.OSD_Protection_User(swigCPtr, this));
  }

  /**
   *  Gets protection of 'Group'
   */
  public OSD_SingleProtection Group() {
    return OSD_SingleProtection.swigToEnum(OCCwrapJavaJNI.OSD_Protection_Group(swigCPtr, this));
  }

  /**
   *  Gets protection of 'World'
   */
  public OSD_SingleProtection World() {
    return OSD_SingleProtection.swigToEnum(OCCwrapJavaJNI.OSD_Protection_World(swigCPtr, this));
  }

  /**
   *  Add a right to a single protection.
   *  ex: aProt = RWD
   *  me.Add(aProt,X)  ->  aProt = RWXD
   */
  public void Add(int[] aProt, OSD_SingleProtection aRight) {
    OCCwrapJavaJNI.OSD_Protection_Add(swigCPtr, this, aProt, aRight.swigValue());
  }

  /**
   *  Subtract a right to a single protection.
   *  ex: aProt = RWD
   *  me.Sub(aProt,RW) ->  aProt = D
   *  But me.Sub(aProt,RWX) is also valid and gives same result.
   */
  public void Sub(int[] aProt, OSD_SingleProtection aRight) {
    OCCwrapJavaJNI.OSD_Protection_Sub(swigCPtr, this, aProt, aRight.swigValue());
  }

}
