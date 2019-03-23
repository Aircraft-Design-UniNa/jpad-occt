package opencascade;

/**
 *  Implements the torus primitive
 */
public class BRepPrim_Torus extends BRepPrim_Revolution {

  private long swigCPtr;
  BRepPrim_Torus(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepPrim_Torus_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepPrim_Torus(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepPrim_Torus_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepPrim_Torus obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrim_Torus(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  the STEP definition
   *  Position : center and axes
   *  Major, Minor : Radii
   * 
   *  Errors : Major < Resolution
   *  Minor < Resolution
   */
  public BRepPrim_Torus( gp_Ax2  Position, double Major, double Minor) {
    this(OCCwrapJavaJNI.new_BRepPrim_Torus__SWIG_0(gp_Ax2.getCPtr(Position), Position, Major, Minor), true);
  }

  /**
   *  Torus centered at origin
   */
  public BRepPrim_Torus(double Major, double Minor) {
    this(OCCwrapJavaJNI.new_BRepPrim_Torus__SWIG_1(Major, Minor), true);
  }

  /**
   *  Torus at Center
   */
  public BRepPrim_Torus( gp_Pnt  Center, double Major, double Minor) {
    this(OCCwrapJavaJNI.new_BRepPrim_Torus__SWIG_2(gp_Pnt.getCPtr(Center), Center, Major, Minor), true);
  }

}
