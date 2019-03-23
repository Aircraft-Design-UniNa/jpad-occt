package opencascade;

/**
 *  Describes functions to build cylinders or portions of  cylinders.
 *  A MakeCylinder object provides a framework for:
 *  -   defining the construction of a cylinder,
 *  -   implementing the construction algorithm, and
 *  -   consulting the result.
 */
public class BRepPrimAPI_MakeCylinder extends BRepPrimAPI_MakeOneAxis {

  private long swigCPtr;
  BRepPrimAPI_MakeCylinder(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeCylinder_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepPrimAPI_MakeCylinder(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeCylinder_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepPrimAPI_MakeCylinder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrimAPI_MakeCylinder(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Make a cylinder of radius R and length H.
   */
  public BRepPrimAPI_MakeCylinder(double R, double H) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeCylinder__SWIG_0(R, H), true);
  }

  /**
   *  Make a cylinder   of  radius R  and  length H with
   *  angle  H.
   */
  public BRepPrimAPI_MakeCylinder(double R, double H, double Angle) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeCylinder__SWIG_1(R, H, Angle), true);
  }

  /**
   *  Make a cylinder of radius R and length H.
   */
  public BRepPrimAPI_MakeCylinder( gp_Ax2  Axes, double R, double H) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeCylinder__SWIG_2(gp_Ax2.getCPtr(Axes), Axes, R, H), true);
  }

  /**
   *  Make a cylinder   of  radius R  and  length H with
   *  angle  H.
   *  Constructs
   *  -   a cylinder of radius R and height H, or
   *  -   a portion of cylinder of radius R and height H, and of
   *  the angle Angle defining the missing portion of the cylinder.
   *  The cylinder is constructed about the "Z Axis" of either:
   *  -   the global coordinate system, or
   *  -   the local coordinate system Axes.
   *  It is limited in this coordinate system as follows:
   *  -   in the v parametric direction (the Z axis), by the two
   *  parameter values 0 and H,
   *  -   and in the u parametric direction (the rotation angle
   *  around the Z Axis), in the case of a portion of a
   *  cylinder, by the two parameter values 0 and Angle.
   *  Angle is given in radians.
   *  The resulting shape is composed of:
   *  -   a lateral cylindrical face,
   *  -   two planar faces in the planes z = 0 and z = H
   *  (in the case of a complete cylinder, these faces are circles), and
   *  -   in case of a portion of a cylinder, two additional
   *  planar faces to close the shape.(two rectangles in the
   *  planes u = 0 and u = Angle).
   *  Exceptions Standard_DomainError if:
   *  -   R is less than or equal to Precision::Confusion(), or
   *  -   H is less than or equal to Precision::Confusion().
   */
  public BRepPrimAPI_MakeCylinder( gp_Ax2  Axes, double R, double H, double Angle) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeCylinder__SWIG_3(gp_Ax2.getCPtr(Axes), Axes, R, H, Angle), true);
  }

  /**
   *  Returns the algorithm.
   */
  public  BRepPrim_Cylinder  Cylinder() {
    BRepPrim_Cylinder ret = new BRepPrim_Cylinder(OCCwrapJavaJNI.BRepPrimAPI_MakeCylinder_Cylinder(swigCPtr, this), false, this);
    return ret;
  }

}
