package opencascade;

/**
 *  The class BOPDS_ShapeInfo is to store
 *  handy information about shape
 */
public class BOPDS_ShapeInfo {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BOPDS_ShapeInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BOPDS_ShapeInfo(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BOPDS_ShapeInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPDS_ShapeInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty contructor
   */
  public BOPDS_ShapeInfo() {
    this(OCCwrapJavaJNI.new_BOPDS_ShapeInfo__SWIG_0(), true);
  }

  public BOPDS_ShapeInfo( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BOPDS_ShapeInfo__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  /**
   *  Modifier
   *  Sets the shape <theS>
   */
  public void SetShape( TopoDS_Shape  theS) {
    OCCwrapJavaJNI.BOPDS_ShapeInfo_SetShape(swigCPtr, this, TopoDS_Shape.getCPtr(theS), theS);
  }

  /**
   *  Selector
   *  Returns the shape
   */
  public  TopoDS_Shape  Shape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BOPDS_ShapeInfo_Shape(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Modifier
   *  Sets the type of shape theType
   */
  public void SetShapeType(TopAbs_ShapeEnum theType) {
    OCCwrapJavaJNI.BOPDS_ShapeInfo_SetShapeType(swigCPtr, this, theType.swigValue());
  }

  /**
   *  Selector
   *  Returns the type of shape
   */
  public TopAbs_ShapeEnum ShapeType() {
    return TopAbs_ShapeEnum.swigToEnum(OCCwrapJavaJNI.BOPDS_ShapeInfo_ShapeType(swigCPtr, this));
  }

  /**
   *  Modifier
   *  Sets the boundung box of the shape theBox
   */
  public void SetBox( Bnd_Box  theBox) {
    OCCwrapJavaJNI.BOPDS_ShapeInfo_SetBox(swigCPtr, this, Bnd_Box.getCPtr(theBox), theBox);
  }

  /**
   *  Selector
   *  Returns the boundung box of the shape
   */
  public  Bnd_Box  Box() {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.BOPDS_ShapeInfo_Box(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Selector/Modifier
   *  Returns the boundung box of the shape
   */
  public Bnd_Box ChangeBox() {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.BOPDS_ShapeInfo_ChangeBox(swigCPtr, this), false, this);
    return ret; //new Bnd_Box.CRef (ret);
  }

  /**
   *  Selector
   *  Returns the list of indices of sub-shapes
   */
  public  TColStd_ListOfInteger  SubShapes() {
    TColStd_ListOfInteger ret = new TColStd_ListOfInteger(OCCwrapJavaJNI.BOPDS_ShapeInfo_SubShapes(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Selector/ Modifier
   *  Returns the list of indices of sub-shapes
   */
  public  TColStd_ListOfInteger  ChangeSubShapes() {
    TColStd_ListOfInteger ret = new TColStd_ListOfInteger(OCCwrapJavaJNI.BOPDS_ShapeInfo_ChangeSubShapes(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Query
   *  Returns true if the shape has sub-shape with
   *  index theI
   */
  public long HasSubShape(int theI) {
    return OCCwrapJavaJNI.BOPDS_ShapeInfo_HasSubShape(swigCPtr, this, theI);
  }

  public long HasReference() {
    return OCCwrapJavaJNI.BOPDS_ShapeInfo_HasReference(swigCPtr, this);
  }

  /**
   *  Modifier
   *  Sets the index of a reference information
   */
  public void SetReference(int theI) {
    OCCwrapJavaJNI.BOPDS_ShapeInfo_SetReference(swigCPtr, this, theI);
  }

  /**
   *  Selector
   *  Returns the index of a reference information
   */
  public int Reference() {
    return OCCwrapJavaJNI.BOPDS_ShapeInfo_Reference(swigCPtr, this);
  }

  /**
   *  Query
   *  Returns true if the shape has boundary representation
   */
  public long HasBRep() {
    return OCCwrapJavaJNI.BOPDS_ShapeInfo_HasBRep(swigCPtr, this);
  }

  /**
   *  Returns true if the shape can be participant of
   *  an interference
   * 
   *  Flag
   */
  public long IsInterfering() {
    return OCCwrapJavaJNI.BOPDS_ShapeInfo_IsInterfering(swigCPtr, this);
  }

  /**
   *  Query
   *  Returns true if there is flag.
   */
  public long HasFlag() {
    return OCCwrapJavaJNI.BOPDS_ShapeInfo_HasFlag__SWIG_0(swigCPtr, this);
  }

  /**
   *  Query
   *  Returns true if there is flag.
   *  Returns the the  flag theFlag
   */
  public long HasFlag(int[] theFlag) {
    return OCCwrapJavaJNI.BOPDS_ShapeInfo_HasFlag__SWIG_1(swigCPtr, this, theFlag);
  }

  /**
   *  Modifier
   *  Sets the flag
   */
  public void SetFlag(int theI) {
    OCCwrapJavaJNI.BOPDS_ShapeInfo_SetFlag(swigCPtr, this, theI);
  }

  /**
   *  Returns the flag
   */
  public int Flag() {
    return OCCwrapJavaJNI.BOPDS_ShapeInfo_Flag(swigCPtr, this);
  }

  public void Dump() {
    OCCwrapJavaJNI.BOPDS_ShapeInfo_Dump(swigCPtr, this);
  }

}
