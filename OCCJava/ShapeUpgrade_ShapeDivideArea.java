package opencascade;

/**
 *  Divides faces from sprcified shape  by max area criterium.
 */
public class ShapeUpgrade_ShapeDivideArea extends ShapeUpgrade_ShapeDivide {

  private long swigCPtr;
  ShapeUpgrade_ShapeDivideArea(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideArea_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  ShapeUpgrade_ShapeDivideArea(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideArea_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(ShapeUpgrade_ShapeDivideArea obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeUpgrade_ShapeDivideArea(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ShapeUpgrade_ShapeDivideArea() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_ShapeDivideArea__SWIG_0(), true);
  }

  /**
   *  Initialize by a Shape.
   */
  public ShapeUpgrade_ShapeDivideArea( TopoDS_Shape  S) {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_ShapeDivideArea__SWIG_1(TopoDS_Shape.getCPtr(S), S), true);
  }

  public double[] MaxArea() {return OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideArea_MaxArea(swigCPtr, this);}

}
