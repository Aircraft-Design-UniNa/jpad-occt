package opencascade;

/**
 *  The class BOPDS_FaceInfo is to store
 *  handy information about state of face
 */
public class BOPDS_FaceInfo {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BOPDS_FaceInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BOPDS_FaceInfo(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BOPDS_FaceInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPDS_FaceInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty contructor
   */
  public BOPDS_FaceInfo() {
    this(OCCwrapJavaJNI.new_BOPDS_FaceInfo__SWIG_0(), true);
  }

  public BOPDS_FaceInfo( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BOPDS_FaceInfo__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  /**
   *  Clears the contents
   */
  public void Clear() {
    OCCwrapJavaJNI.BOPDS_FaceInfo_Clear(swigCPtr, this);
  }

  /**
   *  Modifier
   *  Sets the index of the face <theI>
   */
  public void SetIndex(int theI) {
    OCCwrapJavaJNI.BOPDS_FaceInfo_SetIndex(swigCPtr, this, theI);
  }

  /**
   *  Selector
   *  Returns the index of the face
   * 
   *  In
   */
  public int Index() {
    return OCCwrapJavaJNI.BOPDS_FaceInfo_Index(swigCPtr, this);
  }

  /**
   *  Selector
   *  Returns the pave blocks of the face
   *  that  have state In
   */
  public  BOPDS_IndexedMapOfPaveBlock  PaveBlocksIn() {
    BOPDS_IndexedMapOfPaveBlock ret = new BOPDS_IndexedMapOfPaveBlock(OCCwrapJavaJNI.BOPDS_FaceInfo_PaveBlocksIn(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Selector/Modifier
   *  Returns the pave blocks
   *  of the face
   *  that  have state In
   */
  public  BOPDS_IndexedMapOfPaveBlock  ChangePaveBlocksIn() {
    BOPDS_IndexedMapOfPaveBlock ret = new BOPDS_IndexedMapOfPaveBlock(OCCwrapJavaJNI.BOPDS_FaceInfo_ChangePaveBlocksIn(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Selector
   *  Returns the list of indices for vertices
   *  of the face
   *  that have state In
   */
  public SWIGTYPE_p_TColStd_MapOfInteger VerticesIn() {
    return new SWIGTYPE_p_TColStd_MapOfInteger(OCCwrapJavaJNI.BOPDS_FaceInfo_VerticesIn(swigCPtr, this), false);
  }

  /**
   *  Selector/Modifier
   *  Returns the list of indices for vertices
   *  of the face
   *  that have state In
   * 
   *  On
   */
  public SWIGTYPE_p_TColStd_MapOfInteger ChangeVerticesIn() {
    return new SWIGTYPE_p_TColStd_MapOfInteger(OCCwrapJavaJNI.BOPDS_FaceInfo_ChangeVerticesIn(swigCPtr, this), false);
  }

  /**
   *  Selector
   *  Returns the pave blocks of the face
   *  that  have state On
   */
  public  BOPDS_IndexedMapOfPaveBlock  PaveBlocksOn() {
    BOPDS_IndexedMapOfPaveBlock ret = new BOPDS_IndexedMapOfPaveBlock(OCCwrapJavaJNI.BOPDS_FaceInfo_PaveBlocksOn(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Selector/Modifier
   *  Returns the pave blocks
   *  of the face
   *  that  have state On
   */
  public  BOPDS_IndexedMapOfPaveBlock  ChangePaveBlocksOn() {
    BOPDS_IndexedMapOfPaveBlock ret = new BOPDS_IndexedMapOfPaveBlock(OCCwrapJavaJNI.BOPDS_FaceInfo_ChangePaveBlocksOn(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Selector
   *  Returns the list of indices for vertices
   *  of the face
   *  that have state On
   */
  public SWIGTYPE_p_TColStd_MapOfInteger VerticesOn() {
    return new SWIGTYPE_p_TColStd_MapOfInteger(OCCwrapJavaJNI.BOPDS_FaceInfo_VerticesOn(swigCPtr, this), false);
  }

  /**
   *  Selector/Modifier
   *  Returns the list of indices for vertices
   *  of the face
   *  that have state On
   * 
   *  Sections
   */
  public SWIGTYPE_p_TColStd_MapOfInteger ChangeVerticesOn() {
    return new SWIGTYPE_p_TColStd_MapOfInteger(OCCwrapJavaJNI.BOPDS_FaceInfo_ChangeVerticesOn(swigCPtr, this), false);
  }

  /**
   *  Selector
   *  Returns the pave blocks of the face
   *  that are  pave blocks of section edges
   */
  public  BOPDS_IndexedMapOfPaveBlock  PaveBlocksSc() {
    BOPDS_IndexedMapOfPaveBlock ret = new BOPDS_IndexedMapOfPaveBlock(OCCwrapJavaJNI.BOPDS_FaceInfo_PaveBlocksSc(swigCPtr, this), false, this);
    return ret;
  }

  public  BOPDS_IndexedMapOfPaveBlock  ChangePaveBlocksSc() {
    BOPDS_IndexedMapOfPaveBlock ret = new BOPDS_IndexedMapOfPaveBlock(OCCwrapJavaJNI.BOPDS_FaceInfo_ChangePaveBlocksSc(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Selector
   *  Returns the list of indices for section  vertices
   *  of the face
   */
  public SWIGTYPE_p_TColStd_MapOfInteger VerticesSc() {
    return new SWIGTYPE_p_TColStd_MapOfInteger(OCCwrapJavaJNI.BOPDS_FaceInfo_VerticesSc(swigCPtr, this), false);
  }

  /**
   *  Selector/Modifier
   *  Returns the list of indices for section  vertices
   *  of the face
   * 
   *  Others
   */
  public SWIGTYPE_p_TColStd_MapOfInteger ChangeVerticesSc() {
    return new SWIGTYPE_p_TColStd_MapOfInteger(OCCwrapJavaJNI.BOPDS_FaceInfo_ChangeVerticesSc(swigCPtr, this), false);
  }

}
