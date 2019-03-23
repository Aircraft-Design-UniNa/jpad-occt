package opencascade;

/**
 *  The root class for algorithms to build
 *  faces/solids from set of edges/faces
 */
public class BOPAlgo_BuilderArea extends BOPAlgo_Algo {

  private long swigCPtr;
  BOPAlgo_BuilderArea(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_BuilderArea_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BOPAlgo_BuilderArea(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_BuilderArea_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BOPAlgo_BuilderArea obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Sets the context for the algorithms
   */
  public void SetContext( IntTools_Context  theContext) {
    OCCwrapJavaJNI.BOPAlgo_BuilderArea_SetContext(swigCPtr, this,  IntTools_Context.getCPtr(theContext) , theContext);
  }

  /**
   *  Returns the input shapes
   */
  public  TopTools_ListOfShape  Shapes() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BOPAlgo_BuilderArea_Shapes(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Sets the shapes for building areas
   */
  public void SetShapes( TopTools_ListOfShape  theLS) {
    OCCwrapJavaJNI.BOPAlgo_BuilderArea_SetShapes(swigCPtr, this, TopTools_ListOfShape.getCPtr(theLS), theLS);
  }

  /**
   *  Returns the found loops
   */
  public  TopTools_ListOfShape  Loops() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BOPAlgo_BuilderArea_Loops(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the found areas
   */
  public  TopTools_ListOfShape  Areas() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BOPAlgo_BuilderArea_Areas(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Defines the preventing of addition of internal parts into result.
   *  The default value is FALSE, i.e. the internal parts are added into result.
   */
  public void SetAvoidInternalShapes(long theAvoidInternal) {
    OCCwrapJavaJNI.BOPAlgo_BuilderArea_SetAvoidInternalShapes(swigCPtr, this, theAvoidInternal);
  }

  /**
   *  Returns the AvoidInternalShapes flag
   */
  public long IsAvoidInternalShapes() {
    return OCCwrapJavaJNI.BOPAlgo_BuilderArea_IsAvoidInternalShapes(swigCPtr, this);
  }

}
