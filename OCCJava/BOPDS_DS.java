package opencascade;

/**
 *  The class BOPDS_DS provides the control
 *  of data structure for the algorithms in the
 *  Boolean Component such as General Fuse, Boolean operations,
 *  Section, Maker Volume, Splitter and Cells Builder.
 * 
 *  The data structure has the  following contents:
 *  1. the arguments of an operation [myArguments];
 *  2  the information about arguments/new shapes
 *  and their sub-shapes (type of the shape,
 *  bounding box, etc) [myLines];
 *  3. each argument shape(and its subshapes)
 *  has/have own range of indices (rank);
 *  4. pave blocks on source edges [myPaveBlocksPool];
 *  5. the state of source faces  [myFaceInfoPool];
 *  6  the collection of same domain shapes [myShapesSD];
 *  7  the collection of interferences  [myInterfTB,
 *  myInterfVV,..myInterfFF]
 */
public class BOPDS_DS {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BOPDS_DS(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BOPDS_DS(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BOPDS_DS obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPDS_DS(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty contructor
   */
  public BOPDS_DS() {
    this(OCCwrapJavaJNI.new_BOPDS_DS__SWIG_0(), true);
  }

  public BOPDS_DS( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BOPDS_DS__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  /**
   *  Clears the contents
   */
  public void Clear() {
    OCCwrapJavaJNI.BOPDS_DS_Clear(swigCPtr, this);
  }

  public  NCollection_BaseAllocator  Allocator() {
    return new NCollection_BaseAllocator ( OCCwrapJavaJNI.BOPDS_DS_Allocator(swigCPtr, this), true );
  }

  /**
   *  Modifier
   *  Sets the arguments [theLS] of an operation
   */
  public void SetArguments( TopTools_ListOfShape  theLS) {
    OCCwrapJavaJNI.BOPDS_DS_SetArguments(swigCPtr, this, TopTools_ListOfShape.getCPtr(theLS), theLS);
  }

  /**
   *  Selector
   *  Returns the arguments of an operation
   */
  public  TopTools_ListOfShape  Arguments() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BOPDS_DS_Arguments(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Initializes the data structure for
   *  the arguments
   */
  public void Init(double theFuzz) {
    OCCwrapJavaJNI.BOPDS_DS_Init__SWIG_0(swigCPtr, this, theFuzz);
  }

  public void Init() {
    OCCwrapJavaJNI.BOPDS_DS_Init__SWIG_1(swigCPtr, this);
  }

  /**
   *  Selector
   *  Returns the total number of shapes stored
   */
  public int NbShapes() {
    return OCCwrapJavaJNI.BOPDS_DS_NbShapes(swigCPtr, this);
  }

  /**
   *  Selector
   *  Returns the total number of source shapes stored
   */
  public int NbSourceShapes() {
    return OCCwrapJavaJNI.BOPDS_DS_NbSourceShapes(swigCPtr, this);
  }

  /**
   *  Selector
   *  Returns the number of index ranges
   */
  public int NbRanges() {
    return OCCwrapJavaJNI.BOPDS_DS_NbRanges(swigCPtr, this);
  }

  /**
   *  Selector
   *  Returns the index range "i"
   */
  public  BOPDS_IndexRange  Range(int theIndex) {
    BOPDS_IndexRange ret = new BOPDS_IndexRange(OCCwrapJavaJNI.BOPDS_DS_Range(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  /**
   *  Selector
   *  Returns the rank of the shape of index "i"
   */
  public int Rank(int theIndex) {
    return OCCwrapJavaJNI.BOPDS_DS_Rank(swigCPtr, this, theIndex);
  }

  /**
   *  Returns true if the shape of index "i" is not
   *  the source shape/sub-shape
   */
  public long IsNewShape(int theIndex) {
    return OCCwrapJavaJNI.BOPDS_DS_IsNewShape(swigCPtr, this, theIndex);
  }

  /**
   *  Modifier
   *  Appends the information about the shape [theSI]
   *  to the data structure
   *  Returns the index of theSI in the data structure
   */
  public int Append( BOPDS_ShapeInfo  theSI) {
    return OCCwrapJavaJNI.BOPDS_DS_Append__SWIG_0(swigCPtr, this, BOPDS_ShapeInfo.getCPtr(theSI), theSI);
  }

  /**
   *  Modifier
   *  Appends the default information about the shape [theS]
   *  to the data structure
   *  Returns the index of theS in the data structure
   */
  public int Append( TopoDS_Shape  theS) {
    return OCCwrapJavaJNI.BOPDS_DS_Append__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(theS), theS);
  }

  /**
   *  Selector
   *  Returns the information about the shape
   *  with index theIndex
   */
  public  BOPDS_ShapeInfo  ShapeInfo(int theIndex) {
    BOPDS_ShapeInfo ret = new BOPDS_ShapeInfo(OCCwrapJavaJNI.BOPDS_DS_ShapeInfo(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  /**
   *  Selector/Modifier
   *  Returns the information about the shape
   *  with index theIndex
   */
  public  BOPDS_ShapeInfo  ChangeShapeInfo(int theIndex) {
    BOPDS_ShapeInfo ret = new BOPDS_ShapeInfo(OCCwrapJavaJNI.BOPDS_DS_ChangeShapeInfo(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  /**
   *  Selector
   *  Returns the shape
   *  with index theIndex
   */
  public  TopoDS_Shape  Shape(int theIndex) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BOPDS_DS_Shape(swigCPtr, this, theIndex), true);
    return ret;
  }

  /**
   *  Selector
   *  Returns the index  of the shape theS
   */
  public int Index( TopoDS_Shape  theS) {
    return OCCwrapJavaJNI.BOPDS_DS_Index(swigCPtr, this, TopoDS_Shape.getCPtr(theS), theS);
  }

  /**
   *  Selector
   *  Returns the information about pave blocks on source edges
   */
  public SWIGTYPE_p_BOPDS_VectorOfListOfPaveBlock PaveBlocksPool() {
    return new SWIGTYPE_p_BOPDS_VectorOfListOfPaveBlock(OCCwrapJavaJNI.BOPDS_DS_PaveBlocksPool(swigCPtr, this), false);
  }

  /**
   *  Selector/Modifier
   *  Returns the information about pave blocks on source edges
   */
  public SWIGTYPE_p_BOPDS_VectorOfListOfPaveBlock ChangePaveBlocksPool() {
    return new SWIGTYPE_p_BOPDS_VectorOfListOfPaveBlock(OCCwrapJavaJNI.BOPDS_DS_ChangePaveBlocksPool(swigCPtr, this), false);
  }

  /**
   *  Query
   *  Returns true if the shape with index theIndex has the
   *  information about pave blocks
   */
  public long HasPaveBlocks(int theIndex) {
    return OCCwrapJavaJNI.BOPDS_DS_HasPaveBlocks(swigCPtr, this, theIndex);
  }

  /**
   *  Selector
   *  Returns the pave blocks for the shape with index theIndex
   */
  public  BOPDS_ListOfPaveBlock  PaveBlocks(int theIndex) {
    BOPDS_ListOfPaveBlock ret = new BOPDS_ListOfPaveBlock(OCCwrapJavaJNI.BOPDS_DS_PaveBlocks(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  /**
   *  Selector/Modifier
   *  Returns the pave blocks for the shape with index theIndex
   */
  public  BOPDS_ListOfPaveBlock  ChangePaveBlocks(int theIndex) {
    BOPDS_ListOfPaveBlock ret = new BOPDS_ListOfPaveBlock(OCCwrapJavaJNI.BOPDS_DS_ChangePaveBlocks(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  /**
   *  Update the pave blocks for the all shapes in data structure
   */
  public void UpdatePaveBlocks() {
    OCCwrapJavaJNI.BOPDS_DS_UpdatePaveBlocks(swigCPtr, this);
  }

  /**
   *  Update the pave block thePB
   */
  public void UpdatePaveBlock( BOPDS_PaveBlock  thePB) {
    OCCwrapJavaJNI.BOPDS_DS_UpdatePaveBlock(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(thePB) , thePB);
  }

  /**
   *  Update the common block theCB
   */
  public void UpdateCommonBlock( BOPDS_CommonBlock  theCB, double theFuzz) {
    OCCwrapJavaJNI.BOPDS_DS_UpdateCommonBlock(swigCPtr, this,  BOPDS_CommonBlock.getCPtr(theCB) , theCB, theFuzz);
  }

  /**
   *  Query
   *  Returns true if the pave block is common block
   */
  public long IsCommonBlock( BOPDS_PaveBlock  thePB) {
    return OCCwrapJavaJNI.BOPDS_DS_IsCommonBlock(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(thePB) , thePB);
  }

  public  BOPDS_CommonBlock  CommonBlock( BOPDS_PaveBlock  thePB) {
    return new BOPDS_CommonBlock ( OCCwrapJavaJNI.BOPDS_DS_CommonBlock(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(thePB) , thePB), true );
  }

  /**
   *  Modifier
   *  Sets the common block <theCB>
   */
  public void SetCommonBlock( BOPDS_PaveBlock  thePB,  BOPDS_CommonBlock  theCB) {
    OCCwrapJavaJNI.BOPDS_DS_SetCommonBlock(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(thePB) , thePB,  BOPDS_CommonBlock.getCPtr(theCB) , theCB);
  }

  public  BOPDS_PaveBlock  RealPaveBlock( BOPDS_PaveBlock  thePB) {
    return new BOPDS_PaveBlock ( OCCwrapJavaJNI.BOPDS_DS_RealPaveBlock(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(thePB) , thePB), true );
  }

  /**
   *  Query
   *  Returns true if common block contains more then one pave block
   */
  public long IsCommonBlockOnEdge( BOPDS_PaveBlock  thePB) {
    return OCCwrapJavaJNI.BOPDS_DS_IsCommonBlockOnEdge(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(thePB) , thePB);
  }

  /**
   *  Selector
   *  Returns the information about state of faces
   */
  public SWIGTYPE_p_BOPDS_VectorOfFaceInfo FaceInfoPool() {
    return new SWIGTYPE_p_BOPDS_VectorOfFaceInfo(OCCwrapJavaJNI.BOPDS_DS_FaceInfoPool(swigCPtr, this), false);
  }

  /**
   *  Query
   *  Returns true if the shape with index theIndex has the
   *  information about state of face
   */
  public long HasFaceInfo(int theIndex) {
    return OCCwrapJavaJNI.BOPDS_DS_HasFaceInfo(swigCPtr, this, theIndex);
  }

  /**
   *  Selector
   *  Returns the state of face with index theIndex
   */
  public  BOPDS_FaceInfo  FaceInfo(int theIndex) {
    BOPDS_FaceInfo ret = new BOPDS_FaceInfo(OCCwrapJavaJNI.BOPDS_DS_FaceInfo(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  /**
   *  Selector/Modifier
   *  Returns the state of face with index theIndex
   */
  public  BOPDS_FaceInfo  ChangeFaceInfo(int theIndex) {
    BOPDS_FaceInfo ret = new BOPDS_FaceInfo(OCCwrapJavaJNI.BOPDS_DS_ChangeFaceInfo(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  /**
   *  Update the state In of face with index theIndex
   */
  public void UpdateFaceInfoIn(int theIndex) {
    OCCwrapJavaJNI.BOPDS_DS_UpdateFaceInfoIn(swigCPtr, this, theIndex);
  }

  /**
   *  Update the state On of face with index theIndex
   */
  public void UpdateFaceInfoOn(int theIndex) {
    OCCwrapJavaJNI.BOPDS_DS_UpdateFaceInfoOn(swigCPtr, this, theIndex);
  }

  /**
   *  Selector
   *  Returns the state On
   *  [theMPB,theMVP] of face with index theIndex
   */
  public void FaceInfoOn(int theIndex,  BOPDS_IndexedMapOfPaveBlock  theMPB, SWIGTYPE_p_TColStd_MapOfInteger theMVP) {
    OCCwrapJavaJNI.BOPDS_DS_FaceInfoOn(swigCPtr, this, theIndex, BOPDS_IndexedMapOfPaveBlock.getCPtr(theMPB), theMPB, SWIGTYPE_p_TColStd_MapOfInteger.getCPtr(theMVP));
  }

  /**
   *  Selector
   *  Returns the state In
   *  [theMPB,theMVP] of face with index theIndex
   */
  public void FaceInfoIn(int theIndex,  BOPDS_IndexedMapOfPaveBlock  theMPB, SWIGTYPE_p_TColStd_MapOfInteger theMVP) {
    OCCwrapJavaJNI.BOPDS_DS_FaceInfoIn(swigCPtr, this, theIndex, BOPDS_IndexedMapOfPaveBlock.getCPtr(theMPB), theMPB, SWIGTYPE_p_TColStd_MapOfInteger.getCPtr(theMVP));
  }

  /**
   *  Selector
   *  Returns the indices of alone vertices
   *  for the face with index theIndex
   */
  public void AloneVertices(int theF,  TColStd_ListOfInteger  theLI) {
    OCCwrapJavaJNI.BOPDS_DS_AloneVertices(swigCPtr, this, theF, TColStd_ListOfInteger.getCPtr(theLI), theLI);
  }

  /**
   *  Refine the state On for the all faces having
   *  state information
   * 
   *  ++
   */
  public void RefineFaceInfoOn() {
    OCCwrapJavaJNI.BOPDS_DS_RefineFaceInfoOn(swigCPtr, this);
  }

  /**
   *  Returns information about ON/IN sub-shapes of the given faces.
   *  @param theMVOnIn  the indices of ON/IN vertices from both faces
   *  @param theMVCommon the indices of common vertices for both faces
   *  @param thePBOnIn  all On/In pave blocks from both faces
   *  @param theCommonPB  the common pave blocks (that are shared by both faces).
   */
  public void SubShapesOnIn(int theNF1, int theNF2, SWIGTYPE_p_TColStd_MapOfInteger theMVOnIn, SWIGTYPE_p_TColStd_MapOfInteger theMVCommon,  BOPDS_IndexedMapOfPaveBlock  thePBOnIn,  BOPDS_MapOfPaveBlock  theCommonPB) {
    OCCwrapJavaJNI.BOPDS_DS_SubShapesOnIn(swigCPtr, this, theNF1, theNF2, SWIGTYPE_p_TColStd_MapOfInteger.getCPtr(theMVOnIn), SWIGTYPE_p_TColStd_MapOfInteger.getCPtr(theMVCommon), BOPDS_IndexedMapOfPaveBlock.getCPtr(thePBOnIn), thePBOnIn, BOPDS_MapOfPaveBlock.getCPtr(theCommonPB), theCommonPB);
  }

  /**
   *  Returns the indices of edges that are  shared
   *  for the faces with indices theF1, theF2
   * 
   *  same domain shapes
   */
  public void SharedEdges(int theF1, int theF2,  TColStd_ListOfInteger  theLI,  NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.BOPDS_DS_SharedEdges(swigCPtr, this, theF1, theF2, TColStd_ListOfInteger.getCPtr(theLI), theLI,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  /**
   *  Modifier
   *  Adds the information about same domain shapes
   *  with indices theIndex, theIndexSD
   */
  public void AddShapeSD(int theIndex, int theIndexSD) {
    OCCwrapJavaJNI.BOPDS_DS_AddShapeSD(swigCPtr, this, theIndex, theIndexSD);
  }

  /**
   *  Query
   *  Returns true if the shape with index theIndex has the
   *  same domain shape. In this case theIndexSD will contain
   *  the index of same domain shape found
   * 
   *  interferences
   */
  public long HasShapeSD(int theIndex, int[] theIndexSD) {
    return OCCwrapJavaJNI.BOPDS_DS_HasShapeSD(swigCPtr, this, theIndex, theIndexSD);
  }

  /**
   *  Returns the number of types of the interferences
   */
  public static int NbInterfTypes() {
    return OCCwrapJavaJNI.BOPDS_DS_NbInterfTypes();
  }

  /**
   *  Modifier
   *  Adds the information about an interference between
   *  shapes with indices theI1, theI2 to the summary
   *  table of interferences
   */
  public void AddInterf(int theI1, int theI2) {
    OCCwrapJavaJNI.BOPDS_DS_AddInterf(swigCPtr, this, theI1, theI2);
  }

  /**
   *  Query
   *  Returns true if the shape with index theI
   *  is interferred
   */
  public long HasInterf(int theI) {
    return OCCwrapJavaJNI.BOPDS_DS_HasInterf__SWIG_0(swigCPtr, this, theI);
  }

  /**
   *  Query
   *  Returns true if the shapes with indices theI1, theI2
   *  are interferred
   */
  public long HasInterf(int theI1, int theI2) {
    return OCCwrapJavaJNI.BOPDS_DS_HasInterf__SWIG_1(swigCPtr, this, theI1, theI2);
  }

  /**
   *  Query
   *  Returns true if the shape with index theI1 is interfered
   *  with
   *  any sub-shape of the shape with index theI2  (theFlag=true)
   *  all sub-shapes of the shape with index theI2 (theFlag=false)
   */
  public long HasInterfShapeSubShapes(int theI1, int theI2, long theFlag) {
    return OCCwrapJavaJNI.BOPDS_DS_HasInterfShapeSubShapes__SWIG_0(swigCPtr, this, theI1, theI2, theFlag);
  }

  public long HasInterfShapeSubShapes(int theI1, int theI2) {
    return OCCwrapJavaJNI.BOPDS_DS_HasInterfShapeSubShapes__SWIG_1(swigCPtr, this, theI1, theI2);
  }

  /**
   *  Query
   *  Returns true if the shapes with indices theI1, theI2
   *  have interferred sub-shapes
   */
  public long HasInterfSubShapes(int theI1, int theI2) {
    return OCCwrapJavaJNI.BOPDS_DS_HasInterfSubShapes(swigCPtr, this, theI1, theI2);
  }

  public void Dump() {
    OCCwrapJavaJNI.BOPDS_DS_Dump(swigCPtr, this);
  }

  public long IsSubShape(int theI1, int theI2) {
    return OCCwrapJavaJNI.BOPDS_DS_IsSubShape(swigCPtr, this, theI1, theI2);
  }

  /**
   *  Fills theLP with sorted paves
   *  of the shape with index theIndex
   */
  public void Paves(int theIndex,  BOPDS_ListOfPave  theLP) {
    OCCwrapJavaJNI.BOPDS_DS_Paves(swigCPtr, this, theIndex, BOPDS_ListOfPave.getCPtr(theLP), theLP);
  }

  /**
   *  Updates tolerance of the sub-shapes of the shape with index <theIndex>.
   */
  public void UpdateEdgeTolerance(int theIndex, double theTolerance, double theFuzz) {
    OCCwrapJavaJNI.BOPDS_DS_UpdateEdgeTolerance__SWIG_0(swigCPtr, this, theIndex, theTolerance, theFuzz);
  }

  public void UpdateEdgeTolerance(int theIndex, double theTolerance) {
    OCCwrapJavaJNI.BOPDS_DS_UpdateEdgeTolerance__SWIG_1(swigCPtr, this, theIndex, theTolerance);
  }

  /**
   *  Update the pave blocks for all shapes in data structure
   */
  public void UpdatePaveBlocksWithSDVertices() {
    OCCwrapJavaJNI.BOPDS_DS_UpdatePaveBlocksWithSDVertices(swigCPtr, this);
  }

  /**
   *  Update the pave block for all shapes in data structure
   */
  public void UpdatePaveBlockWithSDVertices( BOPDS_PaveBlock  thePB) {
    OCCwrapJavaJNI.BOPDS_DS_UpdatePaveBlockWithSDVertices(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(thePB) , thePB);
  }

  /**
   *  Update the pave block of the common block for all shapes in data structure
   */
  public void UpdateCommonBlockWithSDVertices( BOPDS_CommonBlock  theCB) {
    OCCwrapJavaJNI.BOPDS_DS_UpdateCommonBlockWithSDVertices(swigCPtr, this,  BOPDS_CommonBlock.getCPtr(theCB) , theCB);
  }

  public void InitPaveBlocksForVertex(int theNV) {
    OCCwrapJavaJNI.BOPDS_DS_InitPaveBlocksForVertex(swigCPtr, this, theNV);
  }

  /**
   *  Clears information about PaveBlocks for the untouched edges
   */
  public void ReleasePaveBlocks() {
    OCCwrapJavaJNI.BOPDS_DS_ReleasePaveBlocks(swigCPtr, this);
  }

  /**
   *  Checks if the existing shrunk data of the pave block is still valid.
   *  The shrunk data may become invalid if e.g. the vertices of the pave block
   *  have been replaced with the new one with bigger tolerances, or the tolerances
   *  of the existing vertices have been increased.
   */
  public long IsValidShrunkData( BOPDS_PaveBlock  thePB) {
    return OCCwrapJavaJNI.BOPDS_DS_IsValidShrunkData(swigCPtr, this,  BOPDS_PaveBlock.getCPtr(thePB) , thePB);
  }

  /**
   *  Computes bounding box <theBox> for the solid with DS-index <theIndex>.
   *  The flag <theCheckInverted> enables/disables the check of the solid
   *  for inverted status. By default the solids will be checked.
   */
  public void BuildBndBoxSolid(int theIndex, Bnd_Box theBox, long theCheckInverted) {
    OCCwrapJavaJNI.BOPDS_DS_BuildBndBoxSolid__SWIG_0(swigCPtr, this, theIndex, Bnd_Box.getCPtr(theBox), theBox, theCheckInverted);
  }

  public void BuildBndBoxSolid(int theIndex, Bnd_Box theBox) {
    OCCwrapJavaJNI.BOPDS_DS_BuildBndBoxSolid__SWIG_1(swigCPtr, this, theIndex, Bnd_Box.getCPtr(theBox), theBox);
  }

}
