package opencascade;

public class Standard_GUID {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Standard_GUID(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Standard_GUID(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Standard_GUID obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Standard_GUID ptr) { Ptr = ptr; }
    public Standard_GUID AsReference () { return Ptr; }
    public Standard_GUID AsCopy () { return Ptr.MakeCopy(); }
    public Standard_GUID Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Standard_GUID(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Standard_GUID() {
    this(OCCwrapJavaJNI.new_Standard_GUID__SWIG_0(), true);
  }

  /**
   *  build a GUID from an ascii string with the
   *  following format:
   *  Length : 36 char
   *  "00000000-0000-0000-0000-000000000000"
   */
  public Standard_GUID(String aGuid) {
    this(OCCwrapJavaJNI.new_Standard_GUID__SWIG_1(aGuid), true);
  }

  /**
   *  build a GUID from an unicode string with the
   *  following format:
   * 
   *  "00000000-0000-0000-0000-000000000000"
   */
  public Standard_GUID(SWIGTYPE_p_Standard_ExtString aGuid) {
    this(OCCwrapJavaJNI.new_Standard_GUID__SWIG_2(SWIGTYPE_p_Standard_ExtString.getCPtr(aGuid)), true);
  }

  public Standard_GUID(int a32b, short a16b1, short a16b2, short a16b3, short a8b1, short a8b2, short a8b3, short a8b4, short a8b5, short a8b6) {
    this(OCCwrapJavaJNI.new_Standard_GUID__SWIG_3(a32b, a16b1, a16b2, a16b3, a8b1, a8b2, a8b3, a8b4, a8b5, a8b6), true);
  }

  public Standard_GUID(SWIGTYPE_p_Standard_UUID aGuid) {
    this(OCCwrapJavaJNI.new_Standard_GUID__SWIG_4(SWIGTYPE_p_Standard_UUID.getCPtr(aGuid)), true);
  }

  public Standard_GUID( Standard_GUID  aGuid) {
    this(OCCwrapJavaJNI.new_Standard_GUID__SWIG_5(Standard_GUID.getCPtr(aGuid), aGuid), true);
  }

  public SWIGTYPE_p_Standard_UUID ToUUID() {
    return new SWIGTYPE_p_Standard_UUID(OCCwrapJavaJNI.Standard_GUID_ToUUID(swigCPtr, this), true);
  }

  /**
   *  translate the GUID into ascii string
   *  the aStrGuid is allocated by user.
   *  the guid have the following format:
   * 
   *  "00000000-0000-0000-0000-000000000000"
   */
  public void ToCString(String aStrGuid) {
    OCCwrapJavaJNI.Standard_GUID_ToCString(swigCPtr, this, aStrGuid);
  }

  /**
   *  translate the GUID into unicode string
   *  the aStrGuid is allocated by user.
   *  the guid have the following format:
   * 
   *  "00000000-0000-0000-0000-000000000000"
   */
  public void ToExtString(SWIGTYPE_p_short aStrGuid) {
    OCCwrapJavaJNI.Standard_GUID_ToExtString(swigCPtr, this, SWIGTYPE_p_short.getCPtr(aStrGuid));
  }

  public long IsSame( Standard_GUID  uid) {
    return OCCwrapJavaJNI.Standard_GUID_IsSame(swigCPtr, this, Standard_GUID.getCPtr(uid), uid);
  }

  public long IsNotSame( Standard_GUID  uid) {
    return OCCwrapJavaJNI.Standard_GUID_IsNotSame(swigCPtr, this, Standard_GUID.getCPtr(uid), uid);
  }

  public void Assign( Standard_GUID  uid) {
    OCCwrapJavaJNI.Standard_GUID_Assign__SWIG_0(swigCPtr, this, Standard_GUID.getCPtr(uid), uid);
  }

  public void Assign(SWIGTYPE_p_Standard_UUID uid) {
    OCCwrapJavaJNI.Standard_GUID_Assign__SWIG_1(swigCPtr, this, SWIGTYPE_p_Standard_UUID.getCPtr(uid));
  }

  /**
   *  Check the format of a GUID string.
   *  It checks the size, the position of the '-' and the correct size of fields.
   */
  public static long CheckGUIDFormat(String aGuid) {
    return OCCwrapJavaJNI.Standard_GUID_CheckGUIDFormat(aGuid);
  }

  /**
   *  Hash function for GUID.
   */
  public int Hash(int Upper) {
    return OCCwrapJavaJNI.Standard_GUID_Hash(swigCPtr, this, Upper);
  }

  /**
   *  H method used by collections.
   */
  public static int HashCode( Standard_GUID  aguid, int Upper) {
    return OCCwrapJavaJNI.Standard_GUID_HashCode(Standard_GUID.getCPtr(aguid), aguid, Upper);
  }

  /**
   *  Returns True  when the two GUID are the same.
   */
  public static long IsEqual( Standard_GUID  string1,  Standard_GUID  string2) {
    return OCCwrapJavaJNI.Standard_GUID_IsEqual(Standard_GUID.getCPtr(string1), string1, Standard_GUID.getCPtr(string2), string2);
  }

}
