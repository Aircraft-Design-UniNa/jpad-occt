package opencascade;

/**
 *  contains information about faulty shapes and faulty types
 *  can't be processed by Boolean Operations
 */
public class BOPAlgo_CheckResult {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BOPAlgo_CheckResult(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BOPAlgo_CheckResult(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BOPAlgo_CheckResult obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPAlgo_CheckResult(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  empty constructor
   */
  public BOPAlgo_CheckResult() {
    this(OCCwrapJavaJNI.new_BOPAlgo_CheckResult(), true);
  }

  /**
   *  sets ancestor shape (object) for faulty sub-shapes
   */
  public void SetShape1( TopoDS_Shape  TheShape) {
    OCCwrapJavaJNI.BOPAlgo_CheckResult_SetShape1(swigCPtr, this, TopoDS_Shape.getCPtr(TheShape), TheShape);
  }

  /**
   *  adds faulty sub-shapes from object to a list
   */
  public void AddFaultyShape1( TopoDS_Shape  TheShape) {
    OCCwrapJavaJNI.BOPAlgo_CheckResult_AddFaultyShape1(swigCPtr, this, TopoDS_Shape.getCPtr(TheShape), TheShape);
  }

  /**
   *  sets ancestor shape (tool) for faulty sub-shapes
   */
  public void SetShape2( TopoDS_Shape  TheShape) {
    OCCwrapJavaJNI.BOPAlgo_CheckResult_SetShape2(swigCPtr, this, TopoDS_Shape.getCPtr(TheShape), TheShape);
  }

  /**
   *  adds faulty sub-shapes from tool to a list
   */
  public void AddFaultyShape2( TopoDS_Shape  TheShape) {
    OCCwrapJavaJNI.BOPAlgo_CheckResult_AddFaultyShape2(swigCPtr, this, TopoDS_Shape.getCPtr(TheShape), TheShape);
  }

  /**
   *  returns ancestor shape (object) for faulties
   */
  public  TopoDS_Shape  GetShape1() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BOPAlgo_CheckResult_GetShape1(swigCPtr, this), true);
    return ret;
  }

  /**
   *  returns ancestor shape (tool) for faulties
   */
  public  TopoDS_Shape  GetShape2() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BOPAlgo_CheckResult_GetShape2(swigCPtr, this), true);
    return ret;
  }

  /**
   *  returns list of faulty shapes for object
   */
  public  TopTools_ListOfShape  GetFaultyShapes1() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BOPAlgo_CheckResult_GetFaultyShapes1(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  returns list of faulty shapes for tool
   */
  public  TopTools_ListOfShape  GetFaultyShapes2() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BOPAlgo_CheckResult_GetFaultyShapes2(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  set status of faulty
   */
  public void SetCheckStatus(BOPAlgo_CheckStatus TheStatus) {
    OCCwrapJavaJNI.BOPAlgo_CheckResult_SetCheckStatus(swigCPtr, this, TheStatus.swigValue());
  }

  /**
   *  gets status of faulty
   */
  public BOPAlgo_CheckStatus GetCheckStatus() {
    return BOPAlgo_CheckStatus.swigToEnum(OCCwrapJavaJNI.BOPAlgo_CheckResult_GetCheckStatus(swigCPtr, this));
  }

  /**
   *  Sets max distance for the first shape
   */
  public void SetMaxDistance1(double theDist) {
    OCCwrapJavaJNI.BOPAlgo_CheckResult_SetMaxDistance1(swigCPtr, this, theDist);
  }

  /**
   *  Sets max distance for the second shape
   */
  public void SetMaxDistance2(double theDist) {
    OCCwrapJavaJNI.BOPAlgo_CheckResult_SetMaxDistance2(swigCPtr, this, theDist);
  }

  /**
   *  Sets the parameter for the first shape
   */
  public void SetMaxParameter1(double thePar) {
    OCCwrapJavaJNI.BOPAlgo_CheckResult_SetMaxParameter1(swigCPtr, this, thePar);
  }

  /**
   *  Sets the parameter for the second shape
   */
  public void SetMaxParameter2(double thePar) {
    OCCwrapJavaJNI.BOPAlgo_CheckResult_SetMaxParameter2(swigCPtr, this, thePar);
  }

  /**
   *  Returns the distance for the first shape
   */
  public double GetMaxDistance1() {
    return OCCwrapJavaJNI.BOPAlgo_CheckResult_GetMaxDistance1(swigCPtr, this);
  }

  /**
   *  Returns the distance for the second shape
   */
  public double GetMaxDistance2() {
    return OCCwrapJavaJNI.BOPAlgo_CheckResult_GetMaxDistance2(swigCPtr, this);
  }

  /**
   *  Returns the parameter for the fircst shape
   */
  public double GetMaxParameter1() {
    return OCCwrapJavaJNI.BOPAlgo_CheckResult_GetMaxParameter1(swigCPtr, this);
  }

  /**
   *  Returns the parameter for the second shape
   */
  public double GetMaxParameter2() {
    return OCCwrapJavaJNI.BOPAlgo_CheckResult_GetMaxParameter2(swigCPtr, this);
  }

}
