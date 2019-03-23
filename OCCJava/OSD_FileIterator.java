package opencascade;

/**
 *  Manages a breadth-only search for files in the specified Path.
 *  There is no specific order of results.
 */
public class OSD_FileIterator {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  OSD_FileIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  OSD_FileIterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(OSD_FileIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (OSD_FileIterator ptr) { Ptr = ptr; }
    public OSD_FileIterator AsReference () { return Ptr; }
    public OSD_FileIterator AsCopy () { return Ptr.MakeCopy(); }
    public OSD_FileIterator Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_OSD_FileIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Instantiates Object as empty Iterator;
   */
  public OSD_FileIterator() {
    this(OCCwrapJavaJNI.new_OSD_FileIterator__SWIG_0(), true);
  }

  /**
   *  Instantiates Object as Iterator;
   *  Wild-card "*" can be used in Mask the same way it
   *  is used by unix shell for file names
   */
  public OSD_FileIterator( OSD_Path  where,  TCollection_AsciiString  Mask) {
    this(OCCwrapJavaJNI.new_OSD_FileIterator__SWIG_1(OSD_Path.getCPtr(where), where, TCollection_AsciiString.getCPtr(Mask), Mask), true);
  }

  public void Destroy() {
    OCCwrapJavaJNI.OSD_FileIterator_Destroy(swigCPtr, this);
  }

  /**
   *  Initializes the current File Iterator
   */
  public void Initialize( OSD_Path  where,  TCollection_AsciiString  Mask) {
    OCCwrapJavaJNI.OSD_FileIterator_Initialize(swigCPtr, this, OSD_Path.getCPtr(where), where, TCollection_AsciiString.getCPtr(Mask), Mask);
  }

  /**
   *  Returns TRUE if there are other items using the 'Tree'
   *  method.
   */
  public long More() {
    return OCCwrapJavaJNI.OSD_FileIterator_More(swigCPtr, this);
  }

  /**
   *  Sets the iterator to the next item.
   *  Returns the item value corresponding to the current
   *  position of the iterator.
   */
  public void Next() {
    OCCwrapJavaJNI.OSD_FileIterator_Next(swigCPtr, this);
  }

  /**
   *  Returns the next file found .
   */
  public OSD_File Values() {
    return new OSD_File(OCCwrapJavaJNI.OSD_FileIterator_Values(swigCPtr, this), true);
  }

  /**
   *  Returns TRUE if an error occurs
   */
  public long Failed() {
    return OCCwrapJavaJNI.OSD_FileIterator_Failed(swigCPtr, this);
  }

  /**
   *  Resets error counter to zero
   */
  public void Reset() {
    OCCwrapJavaJNI.OSD_FileIterator_Reset(swigCPtr, this);
  }

  /**
   *  Raises OSD_Error
   */
  public void Perror() {
    OCCwrapJavaJNI.OSD_FileIterator_Perror(swigCPtr, this);
  }

  /**
   *  Returns error number if 'Failed' is TRUE.
   */
  public int Error() {
    return OCCwrapJavaJNI.OSD_FileIterator_Error(swigCPtr, this);
  }

}
