package opencascade;

/**
 *  The class BOPDS_PaveBlock is to store
 *  the information about pave block on an edge.
 *  Two adjacent paves on edge make up pave block.
 */
public class BOPDS_PaveBlock extends Standard_Transient {
  BOPDS_PaveBlock(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty contructor
   */
  public BOPDS_PaveBlock() {
    this(OCCwrapJavaJNI.new_BOPDS_PaveBlock__SWIG_0(), true);
  }

  /**
   *  Contructor
   *  <theAllocator> - the allocator to manage the memory
   */
  public BOPDS_PaveBlock( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BOPDS_PaveBlock__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  /**
   *  Modifier
   *  Sets the first pave <thePave>
   */
  public void SetPave1( BOPDS_Pave  thePave) {
    OCCwrapJavaJNI.BOPDS_PaveBlock_SetPave1(swigCPtr, this, BOPDS_Pave.getCPtr(thePave), thePave);
  }

  /**
   *  Selector
   *  Returns the first pave
   */
  public  BOPDS_Pave  Pave1() {
    BOPDS_Pave ret = new BOPDS_Pave(OCCwrapJavaJNI.BOPDS_PaveBlock_Pave1(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Modifier
   *  Sets the second pave <thePave>
   */
  public void SetPave2( BOPDS_Pave  thePave) {
    OCCwrapJavaJNI.BOPDS_PaveBlock_SetPave2(swigCPtr, this, BOPDS_Pave.getCPtr(thePave), thePave);
  }

  /**
   *  Selector
   *  Returns the second pave
   */
  public  BOPDS_Pave  Pave2() {
    BOPDS_Pave ret = new BOPDS_Pave(OCCwrapJavaJNI.BOPDS_PaveBlock_Pave2(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Modifier
   *  Sets the index of edge of pave block <theEdge>
   */
  public void SetEdge(int theEdge) {
    OCCwrapJavaJNI.BOPDS_PaveBlock_SetEdge(swigCPtr, this, theEdge);
  }

  /**
   *  Selector
   *  Returns the index of edge of pave block
   */
  public int Edge() {
    return OCCwrapJavaJNI.BOPDS_PaveBlock_Edge(swigCPtr, this);
  }

  /**
   *  Query
   *  Returns true if the pave block has edge
   */
  public long HasEdge() {
    return OCCwrapJavaJNI.BOPDS_PaveBlock_HasEdge__SWIG_0(swigCPtr, this);
  }

  /**
   *  Query
   *  Returns true if the pave block has edge
   *  Returns the index of edge <theEdge>
   */
  public long HasEdge(int[] theEdge) {
    return OCCwrapJavaJNI.BOPDS_PaveBlock_HasEdge__SWIG_1(swigCPtr, this, theEdge);
  }

  /**
   *  Modifier
   *  Sets the index of original edge
   *  of the pave block <theEdge>
   */
  public void SetOriginalEdge(int theEdge) {
    OCCwrapJavaJNI.BOPDS_PaveBlock_SetOriginalEdge(swigCPtr, this, theEdge);
  }

  /**
   *  Selector
   *  Returns the index of original edge of pave block
   */
  public int OriginalEdge() {
    return OCCwrapJavaJNI.BOPDS_PaveBlock_OriginalEdge(swigCPtr, this);
  }

  /**
   *  Query
   *  Returns true if the edge is equal to the original edge
   *  of the pave block
   */
  public long IsSplitEdge() {
    return OCCwrapJavaJNI.BOPDS_PaveBlock_IsSplitEdge(swigCPtr, this);
  }

  /**
   *  Selector
   *  Returns the parametric range <theT1,theT2>
   *  of the pave block
   */
  public void Range(double[] theT1, double[] theT2) {
    OCCwrapJavaJNI.BOPDS_PaveBlock_Range(swigCPtr, this, theT1, theT2);
  }

  /**
   *  Query
   *  Returns true if the pave block has pave indices
   *  that equal to the  pave indices of the pave block
   *  <theOther>
   */
  public long HasSameBounds( BOPDS_PaveBlock  theOther) {
    return OCCwrapJavaJNI.BOPDS_PaveBlock_HasSameBounds(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(theOther) , theOther);
  }

  /**
   *  Selector
   *  Returns the pave indices  <theIndex1,theIndex2>
   *  of the pave block
   */
  public void Indices(int[] theIndex1, int[] theIndex2) {
    OCCwrapJavaJNI.BOPDS_PaveBlock_Indices(swigCPtr, this, theIndex1, theIndex2);
  }

  /**
   *  Query
   *  Returns true if the pave block contains extra paves
   */
  public long IsToUpdate() {
    return OCCwrapJavaJNI.BOPDS_PaveBlock_IsToUpdate(swigCPtr, this);
  }

  /**
   *  Modifier
   *  Appends extra paves <thePave>
   */
  public void AppendExtPave( BOPDS_Pave  thePave) {
    OCCwrapJavaJNI.BOPDS_PaveBlock_AppendExtPave(swigCPtr, this, BOPDS_Pave.getCPtr(thePave), thePave);
  }

  /**
   *  Modifier
   *  Appends extra pave <thePave>
   */
  public void AppendExtPave1( BOPDS_Pave  thePave) {
    OCCwrapJavaJNI.BOPDS_PaveBlock_AppendExtPave1(swigCPtr, this, BOPDS_Pave.getCPtr(thePave), thePave);
  }

  /**
   *  Modifier
   *  Removes a pave with the given vertex number from extra paves
   */
  public void RemoveExtPave(int theVertNum) {
    OCCwrapJavaJNI.BOPDS_PaveBlock_RemoveExtPave(swigCPtr, this, theVertNum);
  }

  /**
   *  Selector
   *  Returns the  extra paves
   */
  public  BOPDS_ListOfPave  ExtPaves() {
    BOPDS_ListOfPave ret = new BOPDS_ListOfPave(OCCwrapJavaJNI.BOPDS_PaveBlock_ExtPaves(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Selector / Modifier
   *  Returns the extra paves
   */
  public  BOPDS_ListOfPave  ChangeExtPaves() {
    BOPDS_ListOfPave ret = new BOPDS_ListOfPave(OCCwrapJavaJNI.BOPDS_PaveBlock_ChangeExtPaves(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Modifier
   *  Updates the pave block. The extra paves are used
   *  to create new pave blocks <theLPB>.
   *  <theFlag> - if true, the first pave and the second
   *  pave are used to produce new pave blocks.
   */
  public void Update(BOPDS_ListOfPaveBlock theLPB, long theFlag) {
    OCCwrapJavaJNI.BOPDS_PaveBlock_Update__SWIG_0(swigCPtr, this, BOPDS_ListOfPaveBlock.getCPtr(theLPB), theLPB, theFlag);
  }

  public void Update(BOPDS_ListOfPaveBlock theLPB) {
    OCCwrapJavaJNI.BOPDS_PaveBlock_Update__SWIG_1(swigCPtr, this, BOPDS_ListOfPaveBlock.getCPtr(theLPB), theLPB);
  }

  /**
   *  Query
   *  Returns true if the extra paves contain the pave
   *  with given value of the parameter <thePrm>
   *  <theTol>  - the value of the tolerance to compare
   *  <theInd>  - index of the found pave
   */
  public long ContainsParameter(double thePrm, double theTol, int[] theInd) {
    return OCCwrapJavaJNI.BOPDS_PaveBlock_ContainsParameter(swigCPtr, this, thePrm, theTol, theInd);
  }

  /**
   *  Modifier
   *  Sets the shrunk data for the pave block
   *  <theTS1>,  <theTS2> - shrunk range
   *  <theBox> - the bounding box
   *  <theIsSplittable> - defines whether the edge can be split
   */
  public void SetShrunkData(double theTS1, double theTS2,  Bnd_Box  theBox, long theIsSplittable) {
    OCCwrapJavaJNI.BOPDS_PaveBlock_SetShrunkData(swigCPtr, this, theTS1, theTS2, Bnd_Box.getCPtr(theBox), theBox, theIsSplittable);
  }

  /**
   *  Selector
   *  Returns  the shrunk data for the pave block
   *  <theTS1>,  <theTS2> - shrunk range
   *  <theBox> - the bounding box
   *  <theIsSplittable> - defines whether the edge can be split
   */
  public void ShrunkData(double[] theTS1, double[] theTS2, Bnd_Box theBox, long[] theIsSplittable) {
    OCCwrapJavaJNI.BOPDS_PaveBlock_ShrunkData(swigCPtr, this, theTS1, theTS2, Bnd_Box.getCPtr(theBox), theBox, theIsSplittable);
  }

  /**
   *  Query
   *  Returns true if the pave block contains
   *  the shrunk data
   */
  public long HasShrunkData() {
    return OCCwrapJavaJNI.BOPDS_PaveBlock_HasShrunkData(swigCPtr, this);
  }

  public void Dump() {
    OCCwrapJavaJNI.BOPDS_PaveBlock_Dump(swigCPtr, this);
  }

  /**
   *  Query
   *  Returns FALSE if the pave block has a too short
   *  shrunk range and cannot be split, otherwise returns TRUE
   */
  public long IsSplittable() {
    return OCCwrapJavaJNI.BOPDS_PaveBlock_IsSplittable(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.BOPDS_PaveBlock_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.BOPDS_PaveBlock_get_type_descriptor(), true );
  }

  public static  BOPDS_PaveBlock  DownCast( Standard_Transient  T) {
    return new BOPDS_PaveBlock ( OCCwrapJavaJNI.BOPDS_PaveBlock_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BOPDS_PaveBlock_TypeOf(), true );
  }

}
