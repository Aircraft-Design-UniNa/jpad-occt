package opencascade;

/**
 *  Implements the sphere primitive
 */
public class BRepPrim_Sphere extends BRepPrim_Revolution {

  private long swigCPtr;
  BRepPrim_Sphere(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepPrim_Sphere_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepPrim_Sphere(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepPrim_Sphere_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepPrim_Sphere obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrim_Sphere(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Creates a Sphere at  origin with  Radius. The axes
   *  of the sphere are the  reference axes. An error is
   *  raised if the radius is < Resolution.
   */
  public BRepPrim_Sphere(double Radius) {
    this(OCCwrapJavaJNI.new_BRepPrim_Sphere__SWIG_0(Radius), true);
  }

  /**
   *  Creates a Sphere with Center and Radius.  Axes are
   *  the   referrence    axes.   This    is the    STEP
   *  constructor.
   */
  public BRepPrim_Sphere( gp_Pnt  Center, double Radius) {
    this(OCCwrapJavaJNI.new_BRepPrim_Sphere__SWIG_1(gp_Pnt.getCPtr(Center), Center, Radius), true);
  }

  /**
   *  Creates a sphere with given axes system.
   */
  public BRepPrim_Sphere( gp_Ax2  Axes, double Radius) {
    this(OCCwrapJavaJNI.new_BRepPrim_Sphere__SWIG_2(gp_Ax2.getCPtr(Axes), Axes, Radius), true);
  }

}
