package opencascade;

/**
 *  The abstract class BooleanOperation is the root
 *  class of Boolean Operations (see Overview).
 *  Boolean Operations algorithm is divided onto two parts:
 *  - The first one is computing interference between arguments;
 *  - The second one is building the result of operation;
 *  The class BooleanOperation provides API level of both parts.
 * 
 *  Additionally to the errors of the parent class the algorithm
 *  returns the following Error statuses:
 *  - 0 - in case of success;
 *  - *BOPAlgo_AlertBOPNotSet* - in case the type of Boolean Operation is not set.
 * 
 */
public class BRepAlgoAPI_BooleanOperation extends BRepAlgoAPI_BuilderAlgo {

  private long swigCPtr;
  BRepAlgoAPI_BooleanOperation(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepAlgoAPI_BooleanOperation_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepAlgoAPI_BooleanOperation(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepAlgoAPI_BooleanOperation_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepAlgoAPI_BooleanOperation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepAlgoAPI_BooleanOperation(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Returns the first argument involved in this Boolean operation.
   *  Obsolete
   */
  public  TopoDS_Shape  Shape1() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepAlgoAPI_BooleanOperation_Shape1(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the second argument involved in this Boolean operation.
   *  Obsolete
   */
  public  TopoDS_Shape  Shape2() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepAlgoAPI_BooleanOperation_Shape2(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Sets the tools
   */
  public void SetTools( TopTools_ListOfShape  theLS) {
    OCCwrapJavaJNI.BRepAlgoAPI_BooleanOperation_SetTools(swigCPtr, this, TopTools_ListOfShape.getCPtr(theLS), theLS);
  }

  /**
   *  Gets the tools
   */
  public  TopTools_ListOfShape  Tools() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BRepAlgoAPI_BooleanOperation_Tools(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Sets the type of Boolean operation
   */
  public void SetOperation(BOPAlgo_Operation anOp) {
    OCCwrapJavaJNI.BRepAlgoAPI_BooleanOperation_SetOperation(swigCPtr, this, anOp.swigValue());
  }

  /**
   *  Returns the type of Boolean Operation
   */
  public BOPAlgo_Operation Operation() {
    return BOPAlgo_Operation.swigToEnum(OCCwrapJavaJNI.BRepAlgoAPI_BooleanOperation_Operation(swigCPtr, this));
  }

  /**
   *  Returns True if there was no errors occured
   *  obsolete
   */
  public long BuilderCanWork() {
    return OCCwrapJavaJNI.BRepAlgoAPI_BooleanOperation_BuilderCanWork(swigCPtr, this);
  }

  /**
   *  Returns the flag of edge refining
   */
  public long FuseEdges() {
    return OCCwrapJavaJNI.BRepAlgoAPI_BooleanOperation_FuseEdges(swigCPtr, this);
  }

  /**
   *  Fuse C1 edges
   */
  public void RefineEdges() {
    OCCwrapJavaJNI.BRepAlgoAPI_BooleanOperation_RefineEdges(swigCPtr, this);
  }

  /**
   *  Returns a list of section edges.
   *  The edges represent the result of intersection between arguments of
   *  Boolean Operation. They are computed during operation execution.
   */
  public  TopTools_ListOfShape  SectionEdges() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BRepAlgoAPI_BooleanOperation_SectionEdges(swigCPtr, this), false, this);
    return ret;
  }

}
