package opencascade;

/**
 *  Divides all closed faces in the shape. Class
 *  ShapeUpgrade_ClosedFaceDivide is used as divide tool.
 */
public class ShapeUpgrade_ShapeDivideClosed extends ShapeUpgrade_ShapeDivide {

  private long swigCPtr;
  ShapeUpgrade_ShapeDivideClosed(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideClosed_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  ShapeUpgrade_ShapeDivideClosed(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideClosed_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(ShapeUpgrade_ShapeDivideClosed obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeUpgrade_ShapeDivideClosed(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Initialises tool with shape and default parameter.
   */
  public ShapeUpgrade_ShapeDivideClosed( TopoDS_Shape  S) {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_ShapeDivideClosed(TopoDS_Shape.getCPtr(S), S), true);
  }

  /**
   *  Sets the number of cuts applied to divide closed faces.
   *  The number of resulting faces will be num+1.
   */
  public void SetNbSplitPoints(int num) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideClosed_SetNbSplitPoints(swigCPtr, this, num);
  }

}
