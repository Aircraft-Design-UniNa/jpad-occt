package opencascade;

/**
 *  Describes a circle in 3D space.
 *  A circle is defined by its radius and positioned in space
 *  with a coordinate system (a gp_Ax2 object) as follows:
 *  -   the origin of the coordinate system is the center of the circle, and
 *  -   the origin, "X Direction" and "Y Direction" of the
 *  coordinate system define the plane of the circle.
 *  This positioning coordinate system is the "local
 *  coordinate system" of the circle. Its "main Direction"
 *  gives the normal vector to the plane of the circle. The
 *  "main Axis" of the coordinate system is referred to as
 *  the "Axis" of the circle.
 *  Note: when a gp_Circ circle is converted into a
 *  Geom_Circle circle, some implicit properties of the
 *  circle are used explicitly:
 *  -   the "main Direction" of the local coordinate system
 *  gives an implicit orientation to the circle (and defines
 *  its trigonometric sense),
 *  -   this orientation corresponds to the direction in
 *  which parameter values increase,
 *  -   the starting point for parameterization is that of the
 *  "X Axis" of the local coordinate system (i.e. the "X Axis" of the circle).
 *  See Also
 *  gce_MakeCirc which provides functions for more complex circle constructions
 *  Geom_Circle which provides additional functions for
 *  constructing circles and works, in particular, with the
 *  parametric equations of circles
 */
public class gp_Circ {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Circ(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Circ(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Circ obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Circ ptr) { Ptr = ptr; }
    public gp_Circ AsReference () { return Ptr; }
    public gp_Circ AsCopy () { return Ptr.MakeCopy(); }
    public gp_Circ Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Circ(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an indefinite circle.
   */
  public gp_Circ() {
    this(OCCwrapJavaJNI.new_gp_Circ__SWIG_0(), true);
  }

  /**
   *  A2 locates the circle and gives its orientation in 3D space.
   *  Warnings :
   *  It is not forbidden to create a circle with Radius = 0.0  Raises ConstructionError if Radius < 0.0
   */
  public gp_Circ( gp_Ax2  A2, double Radius) {
    this(OCCwrapJavaJNI.new_gp_Circ__SWIG_1(gp_Ax2.getCPtr(A2), A2, Radius), true);
  }

  /**
   *  Changes the main axis of the circle. It is the axis
   *  perpendicular to the plane of the circle.
   *  Raises ConstructionError if the direction of A1
   *  is parallel to the "XAxis" of the circle.
   */
  public void SetAxis( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Circ_SetAxis(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Changes the "Location" point (center) of the circle.
   */
  public void SetLocation( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Circ_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Changes the position of the circle.
   */
  public void SetPosition( gp_Ax2  A2) {
    OCCwrapJavaJNI.gp_Circ_SetPosition(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Modifies the radius of this circle.
   *  Warning. This class does not prevent the creation of a circle where Radius is null.
   *  Exceptions
   *  Standard_ConstructionError if Radius is negative.
   */
  public void SetRadius(double Radius) {
    OCCwrapJavaJNI.gp_Circ_SetRadius(swigCPtr, this, Radius);
  }

  /**
   *  Computes the area of the circle.
   */
  public double Area() {
    return OCCwrapJavaJNI.gp_Circ_Area(swigCPtr, this);
  }

  /**
   *  Returns the main axis of the circle.
   *  It is the axis perpendicular to the plane of the circle,
   *  passing through the "Location" point (center) of the circle.
   */
  public  gp_Ax1  Axis() {
    gp_Ax1 ret = new gp_Ax1(OCCwrapJavaJNI.gp_Circ_Axis(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Computes the circumference of the circle.
   */
  public double Length() {
    return OCCwrapJavaJNI.gp_Circ_Length(swigCPtr, this);
  }

  /**
   *  Returns the center of the circle. It is the
   *  "Location" point of the local coordinate system
   *  of the circle
   */
  public  gp_Pnt  Location() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.gp_Circ_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the position of the circle.
   *  It is the local coordinate system of the circle.
   */
  public  gp_Ax2  Position() {
    gp_Ax2 ret = new gp_Ax2(OCCwrapJavaJNI.gp_Circ_Position(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the radius of this circle.
   */
  public double Radius() {
    return OCCwrapJavaJNI.gp_Circ_Radius(swigCPtr, this);
  }

  /**
   *  Returns the "XAxis" of the circle.
   *  This axis is perpendicular to the axis of the conic.
   *  This axis and the "Yaxis" define the plane of the conic.
   */
  public gp_Ax1 XAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Circ_XAxis(swigCPtr, this), true);
  }

  /**
   *  Returns the "YAxis" of the circle.
   *  This axis and the "Xaxis" define the plane of the conic.
   *  The "YAxis" is perpendicular to the "Xaxis".
   */
  public gp_Ax1 YAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Circ_YAxis(swigCPtr, this), true);
  }

  /**
   *  Computes the minimum of distance between the point P and
   *  any point on the circumference of the circle.
   */
  public double Distance( gp_Pnt  P) {
    return OCCwrapJavaJNI.gp_Circ_Distance(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Computes the square distance between <me> and the point P.
   */
  public double SquareDistance( gp_Pnt  P) {
    return OCCwrapJavaJNI.gp_Circ_SquareDistance(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Returns True if the point P is on the circumference.
   *  The distance between <me> and <P> must be lower or
   *  equal to LinearTolerance.
   */
  public long Contains( gp_Pnt  P, double LinearTolerance) {
    return OCCwrapJavaJNI.gp_Circ_Contains(swigCPtr, this, gp_Pnt.getCPtr(P), P, LinearTolerance);
  }

  public void Mirror( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Circ_Mirror__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of a circle
   *  with respect to the point P which is the center of the
   *  symmetry.
   */
  public gp_Circ Mirrored( gp_Pnt  P) {
    return new gp_Circ(OCCwrapJavaJNI.gp_Circ_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P), true);
  }

  public void Mirror( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Circ_Mirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Performs the symmetrical transformation of a circle with
   *  respect to an axis placement which is the axis of the
   *  symmetry.
   */
  public gp_Circ Mirrored( gp_Ax1  A1) {
    return new gp_Circ(OCCwrapJavaJNI.gp_Circ_Mirrored__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1), true);
  }

  public void Mirror( gp_Ax2  A2) {
    OCCwrapJavaJNI.gp_Circ_Mirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Performs the symmetrical transformation of a circle with respect
   *  to a plane. The axis placement A2 locates the plane of the
   *  of the symmetry : (Location, XDirection, YDirection).
   */
  public gp_Circ Mirrored( gp_Ax2  A2) {
    return new gp_Circ(OCCwrapJavaJNI.gp_Circ_Mirrored__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2), true);
  }

  public void Rotate( gp_Ax1  A1, double Ang) {
    OCCwrapJavaJNI.gp_Circ_Rotate(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang);
  }

  /**
   *  Rotates a circle. A1 is the axis of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public gp_Circ Rotated( gp_Ax1  A1, double Ang) {
    return new gp_Circ(OCCwrapJavaJNI.gp_Circ_Rotated(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang), true);
  }

  public void Scale( gp_Pnt  P, double S) {
    OCCwrapJavaJNI.gp_Circ_Scale(swigCPtr, this, gp_Pnt.getCPtr(P), P, S);
  }

  /**
   *  Scales a circle. S is the scaling value.
   *  Warnings :
   *  If S is negative the radius stay positive but
   *  the "XAxis" and the "YAxis" are  reversed as for
   *  an ellipse.
   */
  public gp_Circ Scaled( gp_Pnt  P, double S) {
    return new gp_Circ(OCCwrapJavaJNI.gp_Circ_Scaled(swigCPtr, this, gp_Pnt.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_Circ_Transform(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Transforms a circle with the transformation T from class Trsf.
   */
  public gp_Circ Transformed( gp_Trsf  T) {
    return new gp_Circ(OCCwrapJavaJNI.gp_Circ_Transformed(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec  V) {
    OCCwrapJavaJNI.gp_Circ_Translate__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Translates a circle in the direction of the vector V.
   *  The magnitude of the translation is the vector's magnitude.
   */
  public gp_Circ Translated( gp_Vec  V) {
    return new gp_Circ(OCCwrapJavaJNI.gp_Circ_Translated__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt  P1,  gp_Pnt  P2) {
    OCCwrapJavaJNI.gp_Circ_Translate__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Translates a circle from the point P1 to the point P2.
   */
  public gp_Circ Translated( gp_Pnt  P1,  gp_Pnt  P2) {
    return new gp_Circ(OCCwrapJavaJNI.gp_Circ_Translated__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

}
