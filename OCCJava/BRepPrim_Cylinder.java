package opencascade;

/**
 *  Cylinder primitive.
 */
public class BRepPrim_Cylinder extends BRepPrim_Revolution {

  private long swigCPtr;
  BRepPrim_Cylinder(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepPrim_Cylinder_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepPrim_Cylinder(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepPrim_Cylinder_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepPrim_Cylinder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrim_Cylinder(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  the STEP definition
   *  Position : center of a Face and Axis
   *  Radius : radius of cylinder
   *  Height : distance between faces
   *  on positive side
   * 
   *  Errors : Height < Resolution
   *  Radius < Resolution
   */
  public BRepPrim_Cylinder( gp_Ax2  Position, double Radius, double Height) {
    this(OCCwrapJavaJNI.new_BRepPrim_Cylinder__SWIG_0(gp_Ax2.getCPtr(Position), Position, Radius, Height), true);
  }

  /**
   *  infinite Cylinder at origin on Z negative
   */
  public BRepPrim_Cylinder(double Radius) {
    this(OCCwrapJavaJNI.new_BRepPrim_Cylinder__SWIG_1(Radius), true);
  }

  /**
   *  infinite Cylinder at Center on Z negative
   */
  public BRepPrim_Cylinder( gp_Pnt  Center, double Radius) {
    this(OCCwrapJavaJNI.new_BRepPrim_Cylinder__SWIG_2(gp_Pnt.getCPtr(Center), Center, Radius), true);
  }

  /**
   *  infinite Cylinder at Axes on Z negative
   */
  public BRepPrim_Cylinder( gp_Ax2  Axes, double Radius) {
    this(OCCwrapJavaJNI.new_BRepPrim_Cylinder__SWIG_3(gp_Ax2.getCPtr(Axes), Axes, Radius), true);
  }

  /**
   *  create a Cylinder  at origin on Z  axis, of
   *  height H and radius R
   *  Error  : Radius  < Resolution
   *  H < Resolution
   *  H negative
   */
  public BRepPrim_Cylinder(double R, double H) {
    this(OCCwrapJavaJNI.new_BRepPrim_Cylinder__SWIG_4(R, H), true);
  }

  /**
   *  same as above but at a given point
   */
  public BRepPrim_Cylinder( gp_Pnt  Center, double R, double H) {
    this(OCCwrapJavaJNI.new_BRepPrim_Cylinder__SWIG_5(gp_Pnt.getCPtr(Center), Center, R, H), true);
  }

}
