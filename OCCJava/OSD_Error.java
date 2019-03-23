package opencascade;

/**
 *  Accurate management of OSD specific errors.
 */
public class OSD_Error {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  OSD_Error(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  OSD_Error(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(OSD_Error obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (OSD_Error ptr) { Ptr = ptr; }
    public OSD_Error AsReference () { return Ptr; }
    public OSD_Error AsCopy () { return Ptr.MakeCopy(); }
    public OSD_Error Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_OSD_Error(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Initializes Error to be without any Error.
   *  This is only used by OSD, not by programmer.
   */
  public OSD_Error() {
    this(OCCwrapJavaJNI.new_OSD_Error(), true);
  }

  /**
   *  Raises OSD_Error with accurate error message.
   */
  public void Perror() {
    OCCwrapJavaJNI.OSD_Error_Perror(swigCPtr, this);
  }

  /**
   *  Instantiates error
   *  This is only used by OSD methods to instantiates an error code.
   *  No description is done for the programmer.
   */
  public void SetValue(int Errcode, int From,  TCollection_AsciiString  Message) {
    OCCwrapJavaJNI.OSD_Error_SetValue(swigCPtr, this, Errcode, From, TCollection_AsciiString.getCPtr(Message), Message);
  }

  /**
   *  Returns an accurate error code.
   *  To test these values, you must include "OSD_ErrorList.hxx"
   */
  public int Error() {
    return OCCwrapJavaJNI.OSD_Error_Error(swigCPtr, this);
  }

  /**
   *  Returns TRUE if an error occurs
   *  This is a way to test if a system call succeeded or not.
   */
  public long Failed() {
    return OCCwrapJavaJNI.OSD_Error_Failed(swigCPtr, this);
  }

  /**
   *  Resets error counter to zero
   *  This allows the user to ignore an error (WARNING).
   */
  public void Reset() {
    OCCwrapJavaJNI.OSD_Error_Reset(swigCPtr, this);
  }

}
