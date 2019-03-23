package opencascade;

public class ShapeUpgrade_ShapeDivideClosedEdges extends ShapeUpgrade_ShapeDivide {

  private long swigCPtr;
  ShapeUpgrade_ShapeDivideClosedEdges(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideClosedEdges_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  ShapeUpgrade_ShapeDivideClosedEdges(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideClosedEdges_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(ShapeUpgrade_ShapeDivideClosedEdges obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeUpgrade_ShapeDivideClosedEdges(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Initialises tool with shape and default parameter.
   */
  public ShapeUpgrade_ShapeDivideClosedEdges( TopoDS_Shape  S) {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_ShapeDivideClosedEdges(TopoDS_Shape.getCPtr(S), S), true);
  }

  /**
   *  Sets the number of cuts applied to divide closed edges.
   *  The number of resulting faces will be num+1.
   */
  public void SetNbSplitPoints(int num) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideClosedEdges_SetNbSplitPoints(swigCPtr, this, num);
  }

}
