package opencascade;

/**
 *  Splits all surfaces of revolution, cylindrical, toroidal,
 *  conical, spherical surfaces in the given shape so that
 *  each resulting segment covers not more than defined number
 *  of degrees (to segments less than 90).
 */
public class ShapeUpgrade_ShapeDivideAngle extends ShapeUpgrade_ShapeDivide {

  private long swigCPtr;
  ShapeUpgrade_ShapeDivideAngle(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideAngle_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  ShapeUpgrade_ShapeDivideAngle(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideAngle_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(ShapeUpgrade_ShapeDivideAngle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeUpgrade_ShapeDivideAngle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Empty constructor.
   */
  public ShapeUpgrade_ShapeDivideAngle(double MaxAngle) {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_ShapeDivideAngle__SWIG_0(MaxAngle), true);
  }

  /**
   *  Initialize by a Shape.
   */
  public ShapeUpgrade_ShapeDivideAngle(double MaxAngle,  TopoDS_Shape  S) {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_ShapeDivideAngle__SWIG_1(MaxAngle, TopoDS_Shape.getCPtr(S), S), true);
  }

  /**
   *  Resets tool for splitting face with given angle
   */
  public void InitTool(double MaxAngle) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideAngle_InitTool(swigCPtr, this, MaxAngle);
  }

  /**
   *  Set maximal angle (calls InitTool)
   */
  public void SetMaxAngle(double MaxAngle) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideAngle_SetMaxAngle(swigCPtr, this, MaxAngle);
  }

  /**
   *  Returns maximal angle
   */
  public double MaxAngle() {
    return OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideAngle_MaxAngle(swigCPtr, this);
  }

}
