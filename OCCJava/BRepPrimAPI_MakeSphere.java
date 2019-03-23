package opencascade;

/**
 *  Describes functions to build spheres or portions of spheres.
 *  A MakeSphere object provides a framework for:
 *  -   defining the construction of a sphere,
 *  -   implementing the construction algorithm, and
 *  -   consulting the result.
 */
public class BRepPrimAPI_MakeSphere extends BRepPrimAPI_MakeOneAxis {

  private long swigCPtr;
  BRepPrimAPI_MakeSphere(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeSphere_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepPrimAPI_MakeSphere(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeSphere_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepPrimAPI_MakeSphere obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrimAPI_MakeSphere(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Make a sphere of radius R.
   */
  public BRepPrimAPI_MakeSphere(double R) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeSphere__SWIG_0(R), true);
  }

  /**
   *  Make a sphere of radius R.
   */
  public BRepPrimAPI_MakeSphere(double R, double angle) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeSphere__SWIG_1(R, angle), true);
  }

  /**
   *  Make a sphere of radius R.
   */
  public BRepPrimAPI_MakeSphere(double R, double angle1, double angle2) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeSphere__SWIG_2(R, angle1, angle2), true);
  }

  /**
   *  Make a sphere of radius R.
   */
  public BRepPrimAPI_MakeSphere(double R, double angle1, double angle2, double angle3) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeSphere__SWIG_3(R, angle1, angle2, angle3), true);
  }

  /**
   *  Make a sphere of radius R.
   */
  public BRepPrimAPI_MakeSphere( gp_Pnt  Center, double R) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeSphere__SWIG_4(gp_Pnt.getCPtr(Center), Center, R), true);
  }

  /**
   *  Make a sphere of radius R.
   */
  public BRepPrimAPI_MakeSphere( gp_Pnt  Center, double R, double angle) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeSphere__SWIG_5(gp_Pnt.getCPtr(Center), Center, R, angle), true);
  }

  /**
   *  Make a sphere of radius R.
   */
  public BRepPrimAPI_MakeSphere( gp_Pnt  Center, double R, double angle1, double angle2) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeSphere__SWIG_6(gp_Pnt.getCPtr(Center), Center, R, angle1, angle2), true);
  }

  /**
   *  Make a sphere of radius R.
   */
  public BRepPrimAPI_MakeSphere( gp_Pnt  Center, double R, double angle1, double angle2, double angle3) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeSphere__SWIG_7(gp_Pnt.getCPtr(Center), Center, R, angle1, angle2, angle3), true);
  }

  /**
   *  Make a sphere of radius R.
   */
  public BRepPrimAPI_MakeSphere( gp_Ax2  Axis, double R) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeSphere__SWIG_8(gp_Ax2.getCPtr(Axis), Axis, R), true);
  }

  /**
   *  Make a sphere of radius R.
   */
  public BRepPrimAPI_MakeSphere( gp_Ax2  Axis, double R, double angle) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeSphere__SWIG_9(gp_Ax2.getCPtr(Axis), Axis, R, angle), true);
  }

  /**
   *  Make a sphere of radius R.
   */
  public BRepPrimAPI_MakeSphere( gp_Ax2  Axis, double R, double angle1, double angle2) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeSphere__SWIG_10(gp_Ax2.getCPtr(Axis), Axis, R, angle1, angle2), true);
  }

  /**
   *  Make a sphere of radius R.
   *  For all algorithms The resulting shape is composed of
   *  -   a lateral spherical face,
   *  -   two planar faces parallel to the plane z = 0 if the
   *  sphere is truncated in the v parametric direction, or
   *  only one planar face if angle1 is equal to -p/2 or if
   *  angle2 is equal to p/2 (these faces are circles in
   *  case of a complete truncated sphere),
   *  -   and in case of a portion of sphere, two planar faces
   *  to shut the shape.(in the planes u = 0 and u = angle).
   */
  public BRepPrimAPI_MakeSphere( gp_Ax2  Axis, double R, double angle1, double angle2, double angle3) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeSphere__SWIG_11(gp_Ax2.getCPtr(Axis), Axis, R, angle1, angle2, angle3), true);
  }

  /**
   *  Returns the algorithm.
   */
  public  BRepPrim_Sphere  Sphere() {
    BRepPrim_Sphere ret = new BRepPrim_Sphere(OCCwrapJavaJNI.BRepPrimAPI_MakeSphere_Sphere(swigCPtr, this), false, this);
    return ret;
  }

}
