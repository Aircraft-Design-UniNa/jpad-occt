package opencascade;

/**
 * 
 *  The class represents the Building part of the Boolean Operations
 *  algorithm.
 *  The arguments of the algorithms are divided in two groups - *Objects*
 *  and *Tools*.
 *  The algorithm builds the splits of the given arguments using the intersection
 *  results and combines the result of Boolean Operation of given type:
 *  - *FUSE* - union of two groups of objects;
 *  - *COMMON* - intersection of two groups of objects;
 *  - *CUT* - subtraction of one group from the other.
 * 
 *  The rules for the arguments and type of the operation are the following:
 *  - For Boolean operation *FUSE* all arguments should have equal dimensions;
 *  - For Boolean operation *CUT* the minimal dimension of *Tools* should not be
 *    less than the maximal dimension of *Objects*;
 *  - For Boolean operation *COMMON* the arguments can have any dimension.
 * 
 *  The class is a General Fuse based algorithm. Thus, all options
 *  of the General Fuse algorithm such as Fuzzy mode, safe processing mode,
 *  parallel processing mode, gluing mode and history support are also
 *  available in this algorithm.
 * 
 *  Additionally to the Warnings of the parent class the algorithm returns
 *  the following warnings:
 *  - *BOPAlgo_AlertEmptyShape* - in case some of the input shapes are empty shapes.
 * 
 *  Additionally to Errors of the parent class the algorithm returns
 *  the following Error statuses:
 *  - *BOPAlgo_AlertBOPIsNotSet* - in case the type of Boolean operation is not set;
 *  - *BOPAlgo_AlertBOPNotAllowed* - in case the operation of given type is not allowed on
 *                      given inputs;
 *  - *BOPAlgo_AlertSolidBuilderFailed* - in case the BuilderSolid algorithm failed to
 *                           produce the Fused solid.
 * 
 */
public class BOPAlgo_BOP extends BOPAlgo_ToolsProvider {

  private long swigCPtr;
  BOPAlgo_BOP(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_BOP_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BOPAlgo_BOP(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_BOP_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BOPAlgo_BOP obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPAlgo_BOP(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Empty constructor
   */
  public BOPAlgo_BOP() {
    this(OCCwrapJavaJNI.new_BOPAlgo_BOP__SWIG_0(), true);
  }

  public BOPAlgo_BOP( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BOPAlgo_BOP__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public void SetOperation(BOPAlgo_Operation theOperation) {
    OCCwrapJavaJNI.BOPAlgo_BOP_SetOperation(swigCPtr, this, theOperation.swigValue());
  }

  public BOPAlgo_Operation Operation() {
    return BOPAlgo_Operation.swigToEnum(OCCwrapJavaJNI.BOPAlgo_BOP_Operation(swigCPtr, this));
  }

}
