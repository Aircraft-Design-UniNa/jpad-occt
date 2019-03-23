package opencascade;

/**
 *  The **Splitter algorithm** is the algorithm for splitting a group of
 *  arbitrary shapes by the other group of arbitrary shapes.
 *  The arguments of the operation are divided on two groups:
 *  *Objects* - shapes that will be split;
 *  *Tools*   - shapes by which the *Objects* will be split.
 *  The result of the operation contains only the split parts
 *  of the shapes from the group of *Objects*.
 *  The split parts of the shapes from the group of *Tools* are excluded
 *  from the result.
 *  The shapes can be split by the other shapes from the same group
 *  (in case these shapes are interfering).
 * 
 *  The class is a General Fuse based algorithm. Thus, all options
 *  of the General Fuse algorithm such as Fuzzy mode, safe processing mode,
 *  parallel processing mode, gluing mode and history support are also
 *  available in this algorithm.
 *  There is no requirement on the existence of the *Tools* shapes.
 *  And if there are no *Tools* shapes, the result of the splitting
 *  operation will be equivalent to the General Fuse result.
 * 
 *  The implementation of the algorithm is minimal - only the methods
 *  CheckData() and Perform() have been overridden.
 *  The method BOPAlgo_Builder::BuildResult(), which adds the split parts of the arguments
 *  into result, does not have to be overridden, because its native implementation
 *  performs the necessary actions for the Splitter algorithm - it adds
 *  the split parts of only Objects into result, avoiding the split parts of Tools.
 */
public class BOPAlgo_Splitter extends BOPAlgo_ToolsProvider {

  private long swigCPtr;
  BOPAlgo_Splitter(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_Splitter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BOPAlgo_Splitter(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_Splitter_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BOPAlgo_Splitter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPAlgo_Splitter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Empty constructor
   */
  public BOPAlgo_Splitter() {
    this(OCCwrapJavaJNI.new_BOPAlgo_Splitter__SWIG_0(), true);
  }

  public BOPAlgo_Splitter( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BOPAlgo_Splitter__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

}
