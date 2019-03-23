package opencascade;

/**
 *  Describes functions to build cones or portions of cones.
 *  A MakeCone object provides a framework for:
 *  -   defining the construction of a cone,
 *  -   implementing the construction algorithm, and
 *  -   consulting the result.
 */
public class BRepPrimAPI_MakeCone extends BRepPrimAPI_MakeOneAxis {

  private long swigCPtr;
  BRepPrimAPI_MakeCone(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeCone_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepPrimAPI_MakeCone(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeCone_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepPrimAPI_MakeCone obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrimAPI_MakeCone(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Make a cone of height H radius R1 in the plane z =
   *  0, R2 in the plane Z = H. R1 and R2 may be null.
   */
  public BRepPrimAPI_MakeCone(double R1, double R2, double H) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeCone__SWIG_0(R1, R2, H), true);
  }

  /**
   *  Make a cone of height H radius R1 in the plane z =
   *  0, R2 in the plane Z = H. R1 and R2 may be null.
   *  Take a section of <angle>
   */
  public BRepPrimAPI_MakeCone(double R1, double R2, double H, double angle) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeCone__SWIG_1(R1, R2, H, angle), true);
  }

  /**
   *  Make a cone of height H radius R1 in the plane z =
   *  0, R2 in the plane Z = H. R1 and R2 may be null.
   */
  public BRepPrimAPI_MakeCone( gp_Ax2  Axes, double R1, double R2, double H) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeCone__SWIG_2(gp_Ax2.getCPtr(Axes), Axes, R1, R2, H), true);
  }

  /**
   *  Make a cone of height H radius R1 in the plane z =
   *  0, R2 in the plane Z = H. R1 and R2 may be null.
   *  Take a section of <angle>
   *  Constructs a cone, or a portion of a cone, of height H,
   *  and radius R1 in the plane z = 0 and R2 in the plane
   *  z = H. The result is a sharp cone if R1 or R2 is equal to 0.
   *  The cone is constructed about the "Z Axis" of either:
   *  -   the global coordinate system, or
   *  -   the local coordinate system Axes.
   *  It is limited in these coordinate systems as follows:
   *  -   in the v parametric direction (the Z coordinate), by
   *  the two parameter values 0 and H,
   *  -   and in the u parametric direction (defined by the
   *  angle of rotation around the Z axis), in the case of a
   *  portion of a cone, by the two parameter values 0 and
   *  angle. Angle is given in radians.
   *  The resulting shape is composed of:
   *  -   a lateral conical face
   *  -   two planar faces in the planes z = 0 and z = H,
   *  or only one planar face in one of these two planes if a
   *  radius value is null (in the case of a complete cone,
   *  these faces are circles), and
   *  -   and in the case of a portion of a cone, two planar
   *  faces to close the shape. (either two parallelograms or
   *  two triangles, in the planes u = 0 and u = angle).
   *  Exceptions
   *  Standard_DomainError if:
   *  -   H is less than or equal to Precision::Confusion(), or
   *  -   the half-angle at the apex of the cone, defined by
   *  R1, R2 and H, is less than Precision::Confusion()/H, or greater than
   *  (Pi/2)-Precision::Confusion()/H.f
   */
  public BRepPrimAPI_MakeCone( gp_Ax2  Axes, double R1, double R2, double H, double angle) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeCone__SWIG_3(gp_Ax2.getCPtr(Axes), Axes, R1, R2, H, angle), true);
  }

  /**
   *  Returns the algorithm.
   */
  public  BRepPrim_Cone  Cone() {
    BRepPrim_Cone ret = new BRepPrim_Cone(OCCwrapJavaJNI.BRepPrimAPI_MakeCone_Cone(swigCPtr, this), false, this);
    return ret;
  }

}
