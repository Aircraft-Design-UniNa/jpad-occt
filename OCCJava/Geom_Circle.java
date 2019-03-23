package opencascade;

/**
 *  Describes a circle in 3D space.
 *  A circle is defined by its radius and, as with any conic
 *  curve, is positioned in space with a right-handed
 *  coordinate system (gp_Ax2 object) where:
 *  - the origin is the center of the circle, and
 *  - the origin, "X Direction" and "Y Direction" define the
 *  plane of the circle.
 *  This coordinate system is the local coordinate
 *  system of the circle.
 *  The "main Direction" of this coordinate system is the
 *  vector normal to the plane of the circle. The axis, of
 *  which the origin and unit vector are respectively the
 *  origin and "main Direction" of the local coordinate
 *  system, is termed the "Axis" or "main Axis" of the circle.
 *  The "main Direction" of the local coordinate system
 *  gives an explicit orientation to the circle (definition of
 *  the trigonometric sense), determining the direction in
 *  which the parameter increases along the circle.
 *  The Geom_Circle circle is parameterized by an angle:
 *  P(U) = O + R*Cos(U)*XDir + R*Sin(U)*YDir, where:
 *  - P is the point of parameter U,
 *  - O, XDir and YDir are respectively the origin, "X
 *  Direction" and "Y Direction" of its local coordinate system,
 *  - R is the radius of the circle.
 *  The "X Axis" of the local coordinate system therefore
 *  defines the origin of the parameter of the circle. The
 *  parameter is the angle with this "X Direction".
 *  A circle is a closed and periodic curve. The period is
 *  2.*Pi and the parameter range is [ 0, 2.*Pi [.
 */
public class Geom_Circle extends Geom_Conic {
  Geom_Circle(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructs a circle by conversion of the gp_Circ circle C.
   */
  public Geom_Circle( gp_Circ  C) {
    this(OCCwrapJavaJNI.new_Geom_Circle__SWIG_0(gp_Circ.getCPtr(C), C), true);
  }

  /**
   *  Constructs a circle of radius Radius, where A2 locates the circle and
   *  defines its orientation in 3D space such that:
   *  - the center of the circle is the origin of A2,
   *  - the origin, "X Direction" and "Y Direction" of A2
   *  define the plane of the circle,
   *  - A2 is the local coordinate system of the circle.
   *  Note: It is possible to create a circle where Radius is equal to 0.0.
   *  raised if Radius < 0.
   */
  public Geom_Circle( gp_Ax2  A2, double Radius) {
    this(OCCwrapJavaJNI.new_Geom_Circle__SWIG_1(gp_Ax2.getCPtr(A2), A2, Radius), true);
  }

  /**
   *  Set <me> so that <me> has the same geometric properties as C.
   */
  public void SetCirc( gp_Circ  C) {
    OCCwrapJavaJNI.Geom_Circle_SetCirc(swigCPtr, this, gp_Circ.getCPtr(C), C);
  }

  /**
   *  Assigns the value R to the radius of this circle.
   *  Note: it is possible to have a circle with a radius equal to 0.0.
   *  Exceptions - Standard_ConstructionError if R is negative.
   */
  public void SetRadius(double R) {
    OCCwrapJavaJNI.Geom_Circle_SetRadius(swigCPtr, this, R);
  }

  /**
   *  returns the non transient circle from gp with the same
   *  geometric properties as <me>.
   */
  public gp_Circ Circ() {
    return new gp_Circ(OCCwrapJavaJNI.Geom_Circle_Circ(swigCPtr, this), true);
  }

  /**
   *  Returns the radius of this circle.
   */
  public double Radius() {
    return OCCwrapJavaJNI.Geom_Circle_Radius(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_Circle_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Circle_get_type_descriptor(), true );
  }

  public static  Geom_Circle  DownCast( Standard_Transient  T) {
    return new Geom_Circle ( OCCwrapJavaJNI.Geom_Circle_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Circle_TypeOf(), true );
  }

}
