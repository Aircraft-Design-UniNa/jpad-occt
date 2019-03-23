package opencascade;

/**
 *  The class BOPDS_CommonBlock is to store the information
 *  about pave blocks that have geometrical coincidence
 *  (in terms of a tolerance) with:
 *  a) other pave block(s);
 *  b) face(s).
 *  First pave block in the common block (real pave block)
 *  is always a pave block with the minimal index of the original edge.
 */
public class BOPDS_CommonBlock extends Standard_Transient {
  BOPDS_CommonBlock(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty contructor
   */
  public BOPDS_CommonBlock() {
    this(OCCwrapJavaJNI.new_BOPDS_CommonBlock__SWIG_0(), true);
  }

  /**
   *  Contructor
   *  <theAllocator> - the allocator to manage the memory
   */
  public BOPDS_CommonBlock( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BOPDS_CommonBlock__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  /**
   *  Modifier
   *  Adds the pave block <aPB> to the list of pave blocks
   *  of the common block
   */
  public void AddPaveBlock( BOPDS_PaveBlock  aPB) {
    OCCwrapJavaJNI.BOPDS_CommonBlock_AddPaveBlock(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(aPB) , aPB);
  }

  /**
   *  Modifier
   *  Adds the list of pave blocks <aLPB>
   *  to the list of pave blocks
   *  of the common block
   */
  public void SetPaveBlocks(BOPDS_ListOfPaveBlock aLPB) {
    OCCwrapJavaJNI.BOPDS_CommonBlock_SetPaveBlocks(swigCPtr, this, BOPDS_ListOfPaveBlock.getCPtr(aLPB), aLPB);
  }

  /**
   *  Modifier
   *  Adds the index of the face <aF>
   *  to the list of indices of faces
   *  of the common block
   */
  public void AddFace(int aF) {
    OCCwrapJavaJNI.BOPDS_CommonBlock_AddFace(swigCPtr, this, aF);
  }

  /**
   *  Modifier
   *  Sets the list of indices of faces <aLF>
   *  of the common block
   */
  public void SetFaces( TColStd_ListOfInteger  aLF) {
    OCCwrapJavaJNI.BOPDS_CommonBlock_SetFaces(swigCPtr, this, TColStd_ListOfInteger.getCPtr(aLF), aLF);
  }

  /**
   *  Modifier
   *  Appends the list of indices of faces <aLF>
   *  to the list of indices of faces
   *  of the common block (the input list is emptied)
   */
  public void AppendFaces( TColStd_ListOfInteger  aLF) {
    OCCwrapJavaJNI.BOPDS_CommonBlock_AppendFaces(swigCPtr, this, TColStd_ListOfInteger.getCPtr(aLF), aLF);
  }

  /**
   *  Selector
   *  Returns the list of pave blocks
   *  of the common block
   */
  public BOPDS_ListOfPaveBlock PaveBlocks() {
    return new BOPDS_ListOfPaveBlock(OCCwrapJavaJNI.BOPDS_CommonBlock_PaveBlocks(swigCPtr, this), false);
  }

  /**
   *  Selector
   *  Returns the list of indices of faces
   *  of the common block
   */
  public  TColStd_ListOfInteger  Faces() {
    TColStd_ListOfInteger ret = new TColStd_ListOfInteger(OCCwrapJavaJNI.BOPDS_CommonBlock_Faces(swigCPtr, this), false, this);
    return ret;
  }

  public  BOPDS_PaveBlock  PaveBlock1() {
    return new BOPDS_PaveBlock ( OCCwrapJavaJNI.BOPDS_CommonBlock_PaveBlock1(swigCPtr, this), true );
  }

  public  BOPDS_PaveBlock  PaveBlockOnEdge(int theIndex) {
    return new BOPDS_PaveBlock ( OCCwrapJavaJNI.BOPDS_CommonBlock_PaveBlockOnEdge(swigCPtr, this, theIndex), true );
  }

  /**
   *  Query
   *  Returns true if the common block contains
   *  a pave block that belongs
   *  to the face with index <theIx>
   */
  public long IsPaveBlockOnFace(int theIndex) {
    return OCCwrapJavaJNI.BOPDS_CommonBlock_IsPaveBlockOnFace(swigCPtr, this, theIndex);
  }

  /**
   *  Query
   *  Returns true if the common block contains
   *  a pave block that belongs
   *  to the edge with index <theIx>
   */
  public long IsPaveBlockOnEdge(int theIndex) {
    return OCCwrapJavaJNI.BOPDS_CommonBlock_IsPaveBlockOnEdge(swigCPtr, this, theIndex);
  }

  /**
   *  Query
   *  Returns true if the common block contains
   *  a pave block that is equal  to <thePB>
   */
  public long Contains( BOPDS_PaveBlock  thePB) {
    return OCCwrapJavaJNI.BOPDS_CommonBlock_Contains__SWIG_0(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(thePB) , thePB);
  }

  /**
   *  Query
   *  Returns true if the common block contains
   *  the face with index equal  to <theF>
   */
  public long Contains(int theF) {
    return OCCwrapJavaJNI.BOPDS_CommonBlock_Contains__SWIG_1(swigCPtr, this, theF);
  }

  /**
   *  Modifier
   *  Assign the index <theEdge> as the edge index
   *  to all pave blocks of the common block
   */
  public void SetEdge(int theEdge) {
    OCCwrapJavaJNI.BOPDS_CommonBlock_SetEdge(swigCPtr, this, theEdge);
  }

  /**
   *  Selector
   *  Returns the index of the edge
   *  of  all pave blocks of the common block
   */
  public int Edge() {
    return OCCwrapJavaJNI.BOPDS_CommonBlock_Edge(swigCPtr, this);
  }

  public void Dump() {
    OCCwrapJavaJNI.BOPDS_CommonBlock_Dump(swigCPtr, this);
  }

  /**
   *  Moves the pave blocks in the list to make the given
   *  pave block to be the first.
   *  It will be representative for the whole group.
   */
  public void SetRealPaveBlock( BOPDS_PaveBlock  thePB) {
    OCCwrapJavaJNI.BOPDS_CommonBlock_SetRealPaveBlock(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(thePB) , thePB);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.BOPDS_CommonBlock_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.BOPDS_CommonBlock_get_type_descriptor(), true );
  }

  public static  BOPDS_CommonBlock  DownCast( Standard_Transient  T) {
    return new BOPDS_CommonBlock ( OCCwrapJavaJNI.BOPDS_CommonBlock_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BOPDS_CommonBlock_TypeOf(), true );
  }

}
