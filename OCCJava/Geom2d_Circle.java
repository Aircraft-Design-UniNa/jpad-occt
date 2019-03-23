package opencascade;

/**
 *  Describes a circle in the plane (2D space).
 *  A circle is defined by its radius and, as with any conic
 *  curve, is positioned in the plane with a coordinate
 *  system (gp_Ax22d object) where the origin is the
 *  center of the circle.
 *  The coordinate system is the local coordinate
 *  system of the circle.
 *  The orientation (direct or indirect) of the local
 *  coordinate system gives an explicit orientation to the
 *  circle, determining the direction in which the
 *  parameter increases along the circle.
 *  The Geom2d_Circle circle is parameterized by an angle:
 *  P(U) = O + R*Cos(U)*XDir + R*Sin(U)*YDir
 *  where:
 *  - P is the point of parameter U,
 *  - O, XDir and YDir are respectively the origin, "X
 *  Direction" and "Y Direction" of its local coordinate system,
 *  - R is the radius of the circle.
 *  The "X Axis" of the local coordinate system therefore
 *  defines the origin of the parameter of the circle. The
 *  parameter is the angle with this "X Direction".
 *  A circle is a closed and periodic curve. The period is
 *  2.*Pi and the parameter range is [ 0,2.*Pi [.
 *  See Also
 *  GCE2d_MakeCircle which provides functions for
 *  more complex circle constructions
 *  gp_Ax22d and  gp_Circ2d for an equivalent, non-parameterized data structure.
 */
public class Geom2d_Circle extends Geom2d_Conic {
  Geom2d_Circle(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructs a circle by conversion of the gp_Circ2d circle C.
   */
  public Geom2d_Circle( gp_Circ2d  C) {
    this(OCCwrapJavaJNI.new_Geom2d_Circle__SWIG_0(gp_Circ2d.getCPtr(C), C), true);
  }

  /**
   *  Constructs a circle of radius Radius, whose center is the origin of axis
   *  A; A is the "X Axis" of the local coordinate system
   *  of the circle; this coordinate system is direct if
   *  Sense is true (default value) or indirect if Sense is false.
   *  Note: It is possible to create a circle where Radius is equal to 0.0.
   *  Exceptions Standard_ConstructionError if Radius is negative.
   */
  public Geom2d_Circle( gp_Ax2d  A, double Radius, long Sense) {
    this(OCCwrapJavaJNI.new_Geom2d_Circle__SWIG_1(gp_Ax2d.getCPtr(A), A, Radius, Sense), true);
  }

  /**
   *  Constructs a circle
   *  of radius Radius, where the coordinate system A
   *  locates the circle and defines its orientation in the plane such that:
   *  - the center of the circle is the origin of A,
   *  - the orientation (direct or indirect) of A gives the
   *  orientation of the circle.
   */
  public Geom2d_Circle( gp_Ax2d  A, double Radius) {
    this(OCCwrapJavaJNI.new_Geom2d_Circle__SWIG_2(gp_Ax2d.getCPtr(A), A, Radius), true);
  }

  public Geom2d_Circle( gp_Ax22d  A, double Radius) {
    this(OCCwrapJavaJNI.new_Geom2d_Circle__SWIG_3(gp_Ax22d.getCPtr(A), A, Radius), true);
  }

  /**
   *  Converts the gp_Circ2d circle C into this circle.
   */
  public void SetCirc2d( gp_Circ2d  C) {
    OCCwrapJavaJNI.Geom2d_Circle_SetCirc2d(swigCPtr, this, gp_Circ2d.getCPtr(C), C);
  }

  public void SetRadius(double R) {
    OCCwrapJavaJNI.Geom2d_Circle_SetRadius(swigCPtr, this, R);
  }

  /**
   *  Returns the non persistent circle from gp with the same
   *  geometric properties as <me>.
   */
  public gp_Circ2d Circ2d() {
    return new gp_Circ2d(OCCwrapJavaJNI.Geom2d_Circle_Circ2d(swigCPtr, this), true);
  }

  /**
   *  Returns the radius of this circle.
   */
  public double Radius() {
    return OCCwrapJavaJNI.Geom2d_Circle_Radius(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom2d_Circle_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Circle_get_type_descriptor(), true );
  }

  public static  Geom2d_Circle  DownCast( Standard_Transient  T) {
    return new Geom2d_Circle ( OCCwrapJavaJNI.Geom2d_Circle_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Circle_TypeOf(), true );
  }

}
