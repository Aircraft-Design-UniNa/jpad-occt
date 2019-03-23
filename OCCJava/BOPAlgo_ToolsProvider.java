package opencascade;

/**
 *  Auxiliary class providing API to operate tool arguments.
 */
public class BOPAlgo_ToolsProvider extends BOPAlgo_Builder {

  private long swigCPtr;
  BOPAlgo_ToolsProvider(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_ToolsProvider_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BOPAlgo_ToolsProvider(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_ToolsProvider_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BOPAlgo_ToolsProvider obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPAlgo_ToolsProvider(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Empty constructor
   */
  public BOPAlgo_ToolsProvider() {
    this(OCCwrapJavaJNI.new_BOPAlgo_ToolsProvider__SWIG_0(), true);
  }

  public BOPAlgo_ToolsProvider( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BOPAlgo_ToolsProvider__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  /**
   *  Adds Tool argument of the operation
   */
  public void AddTool( TopoDS_Shape  theShape) {
    OCCwrapJavaJNI.BOPAlgo_ToolsProvider_AddTool(swigCPtr, this, TopoDS_Shape.getCPtr(theShape), theShape);
  }

  /**
   *  Adds the Tool arguments of the operation
   */
  public void SetTools( TopTools_ListOfShape  theShapes) {
    OCCwrapJavaJNI.BOPAlgo_ToolsProvider_SetTools(swigCPtr, this, TopTools_ListOfShape.getCPtr(theShapes), theShapes);
  }

  /**
   *  Returns the Tool arguments of the operation
   */
  public  TopTools_ListOfShape  Tools() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BOPAlgo_ToolsProvider_Tools(swigCPtr, this), false, this);
    return ret;
  }

}
