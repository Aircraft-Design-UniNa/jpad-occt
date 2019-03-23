package opencascade;

/**
 *  Manages a breadth-only search for sub-directories in the specified
 *  Path.
 *  There is no specific order of results.
 */
public class OSD_DirectoryIterator {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  OSD_DirectoryIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  OSD_DirectoryIterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(OSD_DirectoryIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (OSD_DirectoryIterator ptr) { Ptr = ptr; }
    public OSD_DirectoryIterator AsReference () { return Ptr; }
    public OSD_DirectoryIterator AsCopy () { return Ptr.MakeCopy(); }
    public OSD_DirectoryIterator Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_OSD_DirectoryIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Instantiates Object as empty Iterator;
   */
  public OSD_DirectoryIterator() {
    this(OCCwrapJavaJNI.new_OSD_DirectoryIterator__SWIG_0(), true);
  }

  /**
   *  Instantiates Object as Iterator.
   *  Wild-card "*" can be used in Mask the same way it
   *  is used by unix shell for file names
   */
  public OSD_DirectoryIterator( OSD_Path  where,  TCollection_AsciiString  Mask) {
    this(OCCwrapJavaJNI.new_OSD_DirectoryIterator__SWIG_1(OSD_Path.getCPtr(where), where, TCollection_AsciiString.getCPtr(Mask), Mask), true);
  }

  public void Destroy() {
    OCCwrapJavaJNI.OSD_DirectoryIterator_Destroy(swigCPtr, this);
  }

  /**
   *  Initializes the current File Directory
   */
  public void Initialize( OSD_Path  where,  TCollection_AsciiString  Mask) {
    OCCwrapJavaJNI.OSD_DirectoryIterator_Initialize(swigCPtr, this, OSD_Path.getCPtr(where), where, TCollection_AsciiString.getCPtr(Mask), Mask);
  }

  /**
   *  Returns TRUE if other items are found while
   *  using the 'Tree' method.
   */
  public long More() {
    return OCCwrapJavaJNI.OSD_DirectoryIterator_More(swigCPtr, this);
  }

  /**
   *  Sets the iterator to the next item.
   *  Returns the item value corresponding to the current
   *  position of the iterator.
   */
  public void Next() {
    OCCwrapJavaJNI.OSD_DirectoryIterator_Next(swigCPtr, this);
  }

  /**
   *  Returns the next item found .
   */
  public OSD_Directory Values() {
    return new OSD_Directory(OCCwrapJavaJNI.OSD_DirectoryIterator_Values(swigCPtr, this), true);
  }

  /**
   *  Returns TRUE if an error occurs
   */
  public long Failed() {
    return OCCwrapJavaJNI.OSD_DirectoryIterator_Failed(swigCPtr, this);
  }

  /**
   *  Resets error counter to zero
   */
  public void Reset() {
    OCCwrapJavaJNI.OSD_DirectoryIterator_Reset(swigCPtr, this);
  }

  /**
   *  Raises OSD_Error
   */
  public void Perror() {
    OCCwrapJavaJNI.OSD_DirectoryIterator_Perror(swigCPtr, this);
  }

  /**
   *  Returns error number if 'Failed' is TRUE.
   */
  public int Error() {
    return OCCwrapJavaJNI.OSD_DirectoryIterator_Error(swigCPtr, this);
  }

}
