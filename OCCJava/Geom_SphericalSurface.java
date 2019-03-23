package opencascade;

/**
 *  Describes a sphere.
 *  A sphere is defined by its radius, and is positioned in
 *  space by a coordinate system (a gp_Ax3 object), the
 *  origin of which is the center of the sphere.
 *  This coordinate system is the "local coordinate
 *  system" of the sphere. The following apply:
 *  - Rotation around its "main Axis", in the trigonometric
 *  sense given by the "X Direction" and the "Y
 *  Direction", defines the u parametric direction.
 *  - Its "X Axis" gives the origin for the u parameter.
 *  - The "reference meridian" of the sphere is a
 *  half-circle, of radius equal to the radius of the
 *  sphere. It is located in the plane defined by the
 *  origin, "X Direction" and "main Direction", centered
 *  on the origin, and positioned on the positive side of the "X Axis".
 *  - Rotation around the "Y Axis" gives the v parameter
 *  on the reference meridian.
 *  - The "X Axis" gives the origin of the v parameter on
 *  the reference meridian.
 *  - The v parametric direction is oriented by the "main
 *  Direction", i.e. when v increases, the Z coordinate
 *  increases. (This implies that the "Y Direction"
 *  orients the reference meridian only when the local
 *  coordinate system is indirect.)
 *  - The u isoparametric curve is a half-circle obtained
 *  by rotating the reference meridian of the sphere
 *  through an angle u around the "main Axis", in the
 *  trigonometric sense defined by the "X Direction"
 *  and the "Y Direction".
 *  The parametric equation of the sphere is:
 *  P(u,v) = O + R*cos(v)*(cos(u)*XDir + sin(u)*YDir)+R*sin(v)*ZDir
 *  where:
 *  - O, XDir, YDir and ZDir are respectively the
 *  origin, the "X Direction", the "Y Direction" and the "Z
 *  Direction" of its local coordinate system, and
 *  - R is the radius of the sphere.
 *  The parametric range of the two parameters is:
 *  - [ 0, 2.*Pi ] for u, and
 *  - [ - Pi/2., + Pi/2. ] for v.
 */
public class Geom_SphericalSurface extends Geom_ElementarySurface {
  Geom_SphericalSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  A3 is the local coordinate system of the surface.
   *  At the creation the parametrization of the surface is defined
   *  such as the normal Vector (N = D1U ^ D1V) is directed away from
   *  the center of the sphere.
   *  The direction of increasing parametric value V is defined by the
   *  rotation around the "YDirection" of A2 in the trigonometric sense
   *  and the orientation of increasing parametric value U is defined
   *  by the rotation around the main direction of A2 in the
   *  trigonometric sense.
   *  Warnings :
   *  It is not forbidden to create a spherical surface with
   *  Radius = 0.0
   *  Raised if Radius < 0.0.
   */
  public Geom_SphericalSurface( gp_Ax3  A3, double Radius) {
    this(OCCwrapJavaJNI.new_Geom_SphericalSurface__SWIG_0(gp_Ax3.getCPtr(A3), A3, Radius), true);
  }

  /**
   *  Creates a SphericalSurface from a non persistent Sphere from
   *  package gp.
   */
  public Geom_SphericalSurface( gp_Sphere  S) {
    this(OCCwrapJavaJNI.new_Geom_SphericalSurface__SWIG_1(gp_Sphere.getCPtr(S), S), true);
  }

  /**
   *  Assigns the value R to the radius of this sphere.
   *  Exceptions Standard_ConstructionError if R is less than 0.0.
   */
  public void SetRadius(double R) {
    OCCwrapJavaJNI.Geom_SphericalSurface_SetRadius(swigCPtr, this, R);
  }

  /**
   *  Converts the gp_Sphere S into this sphere.
   */
  public void SetSphere( gp_Sphere  S) {
    OCCwrapJavaJNI.Geom_SphericalSurface_SetSphere(swigCPtr, this, gp_Sphere.getCPtr(S), S);
  }

  /**
   *  Returns a non persistent sphere with the same geometric
   *  properties as <me>.
   */
  public gp_Sphere Sphere() {
    return new gp_Sphere(OCCwrapJavaJNI.Geom_SphericalSurface_Sphere(swigCPtr, this), true);
  }

  /**
   *  Computes the aera of the spherical surface.
   */
  public double Area() {
    return OCCwrapJavaJNI.Geom_SphericalSurface_Area(swigCPtr, this);
  }

  /**
   *  Returns the coefficients of the implicit equation of the
   *  quadric in the absolute cartesian coordinates system :
   *  These coefficients are normalized.
   *  A1.X**2 + A2.Y**2 + A3.Z**2 + 2.(B1.X.Y + B2.X.Z + B3.Y.Z) +
   *  2.(C1.X + C2.Y + C3.Z) + D = 0.0
   */
  public void Coefficients(double[] A1, double[] A2, double[] A3, double[] B1, double[] B2, double[] B3, double[] C1, double[] C2, double[] C3, double[] D) {
    OCCwrapJavaJNI.Geom_SphericalSurface_Coefficients(swigCPtr, this, A1, A2, A3, B1, B2, B3, C1, C2, C3, D);
  }

  /**
   *  Computes the coefficients of the implicit equation of
   *  this quadric in the absolute Cartesian coordinate system:
   *  A1.X**2 + A2.Y**2 + A3.Z**2 + 2.(B1.X.Y + B2.X.Z + B3.Y.Z) +
   *  2.(C1.X + C2.Y + C3.Z) + D = 0.0
   *  An implicit normalization is applied (i.e. A1 = A2 = 1.
   *  in the local coordinate system of this sphere).
   */
  public double Radius() {
    return OCCwrapJavaJNI.Geom_SphericalSurface_Radius(swigCPtr, this);
  }

  /**
   *  Computes the volume of the spherical surface.
   */
  public double Volume() {
    return OCCwrapJavaJNI.Geom_SphericalSurface_Volume(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_SphericalSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_SphericalSurface_get_type_descriptor(), true );
  }

  public static  Geom_SphericalSurface  DownCast( Standard_Transient  T) {
    return new Geom_SphericalSurface ( OCCwrapJavaJNI.Geom_SphericalSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_SphericalSurface_TypeOf(), true );
  }

}
