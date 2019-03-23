package opencascade;

/**
 *  Describes a torus.
 *  A torus is defined by its major and minor radii, and
 *  positioned in space with a coordinate system (a
 *  gp_Ax3 object) as follows:
 *  - The origin is the center of the torus.
 *  - The surface is obtained by rotating a circle around
 *  the "main Direction". This circle has a radius equal
 *  to the minor radius, and is located in the plane
 *  defined by the origin, "X Direction" and "main
 *  Direction". It is centered on the "X Axis", on its
 *  positive side, and positioned at a distance from the
 *  origin equal to the major radius. This circle is the
 *  "reference circle" of the torus.
 *  - The plane defined by the origin, the "X Direction"
 *  and the "Y Direction" is called the "reference plane" of the torus.
 *  This coordinate system is the "local coordinate
 *  system" of the torus. The following apply:
 *  - Rotation around its "main Axis", in the trigonometric
 *  sense given by "X Direction" and "Y Direction",
 *  defines the u parametric direction.
 *  - The "X Axis" gives the origin for the u parameter.
 *  - Rotation around an axis parallel to the "Y Axis" and
 *  passing through the center of the "reference circle"
 *  gives the v parameter on the "reference circle".
 *  - The "X Axis" gives the origin of the v parameter on
 *  the "reference circle".
 *  - The v parametric direction is oriented by the
 *  inverse of the "main Direction", i.e. near 0, as v
 *  increases, the Z coordinate decreases. (This
 *  implies that the "Y Direction" orients the reference
 *  circle only when the local coordinate system is direct.)
 *  - The u isoparametric curve is a circle obtained by
 *  rotating the "reference circle" of the torus through
 *  an angle u about the "main Axis".
 *  The parametric equation of the torus is :
 *  P(u, v) = O + (R + r*cos(v)) * (cos(u)*XDir +
 *  sin(u)*YDir ) + r*sin(v)*ZDir, where:
 *  - O, XDir, YDir and ZDir are respectively the
 *  origin, the "X Direction", the "Y Direction" and the "Z
 *  Direction" of the local coordinate system,
 *  - r and R are, respectively, the minor and major radius.
 *  The parametric range of the two parameters is:
 *  - [ 0, 2.*Pi ] for u
 *  - [ 0, 2.*Pi ] for v
 */
public class Geom_ToroidalSurface extends Geom_ElementarySurface {
  Geom_ToroidalSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  A3 is the local coordinate system of the surface.
   *  The orientation of increasing V parametric value is defined
   *  by the rotation around the main axis (ZAxis) in the
   *  trigonometric sense. The parametrization of the surface in the
   *  U direction is defined such as the normal Vector (N = D1U ^ D1V)
   *  is oriented towards the "outside region" of the surface.
   *  Warnings :
   *  It is not forbidden to create a toroidal surface with
   *  MajorRadius = MinorRadius = 0.0
   * 
   *  Raised if MinorRadius < 0.0 or if MajorRadius < 0.0
   */
  public Geom_ToroidalSurface( gp_Ax3  A3, double MajorRadius, double MinorRadius) {
    this(OCCwrapJavaJNI.new_Geom_ToroidalSurface__SWIG_0(gp_Ax3.getCPtr(A3), A3, MajorRadius, MinorRadius), true);
  }

  /**
   *  Creates a ToroidalSurface from a non transient Torus from
   *  package gp.
   */
  public Geom_ToroidalSurface( gp_Torus  T) {
    this(OCCwrapJavaJNI.new_Geom_ToroidalSurface__SWIG_1(gp_Torus.getCPtr(T), T), true);
  }

  /**
   *  Modifies this torus by changing its major radius.
   *  Exceptions
   *  Standard_ConstructionError if:
   *  - MajorRadius is negative, or
   *  - MajorRadius - r is less than or equal to
   *  gp::Resolution(), where r is the minor radius of this torus.
   */
  public void SetMajorRadius(double MajorRadius) {
    OCCwrapJavaJNI.Geom_ToroidalSurface_SetMajorRadius(swigCPtr, this, MajorRadius);
  }

  /**
   *  Modifies this torus by changing its minor radius.
   *  Exceptions
   *  Standard_ConstructionError if:
   *  - MinorRadius is negative, or
   *  - R - MinorRadius is less than or equal to
   *  gp::Resolution(), where R is the major radius of this torus.
   */
  public void SetMinorRadius(double MinorRadius) {
    OCCwrapJavaJNI.Geom_ToroidalSurface_SetMinorRadius(swigCPtr, this, MinorRadius);
  }

  /**
   *  Converts the gp_Torus torus T into this torus.
   */
  public void SetTorus( gp_Torus  T) {
    OCCwrapJavaJNI.Geom_ToroidalSurface_SetTorus(swigCPtr, this, gp_Torus.getCPtr(T), T);
  }

  /**
   *  Returns the non transient torus with the same geometric
   *  properties as <me>.
   */
  public gp_Torus Torus() {
    return new gp_Torus(OCCwrapJavaJNI.Geom_ToroidalSurface_Torus(swigCPtr, this), true);
  }

  /**
   *  Computes the aera of the surface.
   */
  public double Area() {
    return OCCwrapJavaJNI.Geom_ToroidalSurface_Area(swigCPtr, this);
  }

  /**
   *  Returns the coefficients of the implicit equation of the surface
   *  in the absolute cartesian coordinate system :
   *  Coef(1) * X**4 + Coef(2) * Y**4 + Coef(3) * Z**4 +
   *  Coef(4) * X**3 * Y + Coef(5) * X**3 * Z + Coef(6) * Y**3 * X +
   *  Coef(7) * Y**3 * Z + Coef(8) * Z**3 * X + Coef(9) * Z**3 * Y +
   *  Coef(10) * X**2 * Y**2 + Coef(11) * X**2 * Z**2 +
   *  Coef(12) * Y**2 * Z**2 + Coef(13) * X**3 + Coef(14) * Y**3 +
   *  Coef(15) * Z**3 + Coef(16) * X**2 * Y + Coef(17) * X**2 * Z +
   *  Coef(18) * Y**2 * X + Coef(19) * Y**2 * Z + Coef(20) * Z**2 * X +
   *  Coef(21) * Z**2 * Y + Coef(22) * X**2 + Coef(23) * Y**2 +
   *  Coef(24) * Z**2 + Coef(25) * X * Y + Coef(26) * X * Z +
   *  Coef(27) * Y * Z + Coef(28) * X + Coef(29) * Y + Coef(30) *  Z +
   *  Coef(31) = 0.0
   *  Raised if the length of Coef is lower than 31.
   */
  public void Coefficients( TColStd_Array1OfReal  Coef) {
    OCCwrapJavaJNI.Geom_ToroidalSurface_Coefficients(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Coef), Coef);
  }

  /**
   *  Returns the major radius, or the minor radius, of this torus.
   */
  public double MajorRadius() {
    return OCCwrapJavaJNI.Geom_ToroidalSurface_MajorRadius(swigCPtr, this);
  }

  /**
   *  Returns the major radius, or the minor radius, of this torus.
   */
  public double MinorRadius() {
    return OCCwrapJavaJNI.Geom_ToroidalSurface_MinorRadius(swigCPtr, this);
  }

  /**
   *  Computes the volume.
   */
  public double Volume() {
    return OCCwrapJavaJNI.Geom_ToroidalSurface_Volume(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_ToroidalSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_ToroidalSurface_get_type_descriptor(), true );
  }

  public static  Geom_ToroidalSurface  DownCast( Standard_Transient  T) {
    return new Geom_ToroidalSurface ( OCCwrapJavaJNI.Geom_ToroidalSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_ToroidalSurface_TypeOf(), true );
  }

}
