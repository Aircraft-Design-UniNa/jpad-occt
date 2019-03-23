package opencascade;

/**
 *  Describes functions to build tori or portions of tori.
 *  A MakeTorus object provides a framework for:
 *  -   defining the construction of a torus,
 *  -   implementing the construction algorithm, and
 *  -   consulting the result.
 */
public class BRepPrimAPI_MakeTorus extends BRepPrimAPI_MakeOneAxis {

  private long swigCPtr;
  BRepPrimAPI_MakeTorus(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeTorus_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepPrimAPI_MakeTorus(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeTorus_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepPrimAPI_MakeTorus obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrimAPI_MakeTorus(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Make a torus of radii R1 R2.
   */
  public BRepPrimAPI_MakeTorus(double R1, double R2) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeTorus__SWIG_0(R1, R2), true);
  }

  /**
   *  Make a section of a torus of radii R1 R2.
   */
  public BRepPrimAPI_MakeTorus(double R1, double R2, double angle) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeTorus__SWIG_1(R1, R2, angle), true);
  }

  /**
   *  Make  a torus of  radii R2, R2  with angles on the
   *  small circle.
   */
  public BRepPrimAPI_MakeTorus(double R1, double R2, double angle1, double angle2) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeTorus__SWIG_2(R1, R2, angle1, angle2), true);
  }

  /**
   *  Make  a torus of  radii R2, R2  with angles on the
   *  small circle.
   */
  public BRepPrimAPI_MakeTorus(double R1, double R2, double angle1, double angle2, double angle) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeTorus__SWIG_3(R1, R2, angle1, angle2, angle), true);
  }

  /**
   *  Make a torus of radii R1 R2.
   */
  public BRepPrimAPI_MakeTorus( gp_Ax2  Axes, double R1, double R2) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeTorus__SWIG_4(gp_Ax2.getCPtr(Axes), Axes, R1, R2), true);
  }

  /**
   *  Make a section of a torus of radii R1 R2.
   */
  public BRepPrimAPI_MakeTorus( gp_Ax2  Axes, double R1, double R2, double angle) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeTorus__SWIG_5(gp_Ax2.getCPtr(Axes), Axes, R1, R2, angle), true);
  }

  /**
   *  Make a torus of radii R1 R2.
   */
  public BRepPrimAPI_MakeTorus( gp_Ax2  Axes, double R1, double R2, double angle1, double angle2) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeTorus__SWIG_6(gp_Ax2.getCPtr(Axes), Axes, R1, R2, angle1, angle2), true);
  }

  /**
   *  Make a section of a torus of radii R1 R2.
   *  For all algorithms The resulting shape is composed of
   *  -      a lateral toroidal face,
   *  -      two conical faces (defined  by the equation v = angle1 and
   *  v = angle2) if the sphere is truncated in the v parametric
   *  direction (they may be cylindrical faces in some
   *  particular conditions), and in case of a portion
   *  of torus, two planar faces to close the shape.(in the planes
   *  u = 0 and u = angle).
   *  Notes:
   *  -      The u parameter corresponds to a rotation angle around the Z axis.
   *  -      The circle whose radius is equal to the minor radius,
   *  located in the plane defined by the X axis and the Z axis,
   *  centered on the X axis, on its positive side, and positioned
   *  at a distance from the origin equal to the major radius, is
   *  the reference circle of the torus. The rotation around an
   *  axis parallel to the Y axis and passing through the center
   *  of the reference circle gives the v parameter on the
   *  reference circle. The X axis gives the origin of the v
   *  parameter. Near 0, as v increases, the Z coordinate decreases.
   */
  public BRepPrimAPI_MakeTorus( gp_Ax2  Axes, double R1, double R2, double angle1, double angle2, double angle) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeTorus__SWIG_7(gp_Ax2.getCPtr(Axes), Axes, R1, R2, angle1, angle2, angle), true);
  }

  /**
   *  Returns the algorithm.
   */
  public  BRepPrim_Torus  Torus() {
    BRepPrim_Torus ret = new BRepPrim_Torus(OCCwrapJavaJNI.BRepPrimAPI_MakeTorus_Torus(swigCPtr, this), false, this);
    return ret;
  }

}
