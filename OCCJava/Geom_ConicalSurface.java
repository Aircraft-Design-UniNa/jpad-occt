package opencascade;

/**
 *  Describes a cone.
 *  A cone is defined by the half-angle at its apex, and
 *  is positioned in space by a coordinate system (a
 *  gp_Ax3 object) and a reference radius as follows:
 *  - The "main Axis" of the coordinate system is the
 *  axis of revolution of the cone.
 *  - The plane defined by the origin, the "X Direction"
 *  and the "Y Direction" of the coordinate system is
 *  the reference plane of the cone. The intersection
 *  of the cone with this reference plane is a circle of
 *  radius equal to the reference radius.
 *  - The apex of the cone is on the negative side of
 *  the "main Axis" of the coordinate system if the
 *  half-angle is positive, and on the positive side if
 *  the half-angle is negative.
 *  This coordinate system is the "local coordinate
 *  system" of the cone. The following apply:
 *  - Rotation around its "main Axis", in the
 *  trigonometric sense given by the "X Direction"
 *  and the "Y Direction", defines the u parametric direction.
 *  - Its "X Axis" gives the origin for the u parameter.
 *  - Its "main Direction" is the v parametric direction of the cone.
 *  - Its origin is the origin of the v parameter.
 *  The parametric range of the two parameters is:
 *  - [ 0, 2.*Pi ] for u, and - ] -infinity, +infinity [ for v
 *  The parametric equation of the cone is:  P(u, v) =
 *  O + (R + v*sin(Ang)) * (cos(u)*XDir + sin(u)*YDir) + v*cos(Ang)*ZDir where:
 *  - O, XDir, YDir and ZDir are respectively
 *  the origin, the "X Direction", the "Y Direction" and
 *  the "Z Direction" of the cone's local coordinate system,
 *  - Ang is the half-angle at the apex of the cone,   and
 *  - R is the reference radius.
 */
public class Geom_ConicalSurface extends Geom_ElementarySurface {
  Geom_ConicalSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  A3 defines the local coordinate system of the conical surface.
   *  Ang is the conical surface semi-angle ]0, PI/2[.
   *  Radius is the radius of the circle Viso in the placement plane
   *  of the conical surface defined with "XAxis" and "YAxis".
   *  The "ZDirection" of A3 defines the direction of the surface's
   *  axis of symmetry.
   *  If the location point of A3 is the apex of the surface
   *  Radius = 0 .
   *  At the creation the parametrization of the surface is defined
   *  such that the normal Vector (N = D1U ^ D1V) is oriented towards
   *  the "outside region" of the surface.
   * 
   *  Raised if Radius < 0.0 or Ang < Resolution from gp or
   *  Ang >= PI/2 - Resolution
   */
  public Geom_ConicalSurface( gp_Ax3  A3, double Ang, double Radius) {
    this(OCCwrapJavaJNI.new_Geom_ConicalSurface__SWIG_0(gp_Ax3.getCPtr(A3), A3, Ang, Radius), true);
  }

  /**
   *  Creates a ConicalSurface from a non transient Cone from
   *  package gp.
   */
  public Geom_ConicalSurface( gp_Cone  C) {
    this(OCCwrapJavaJNI.new_Geom_ConicalSurface__SWIG_1(gp_Cone.getCPtr(C), C), true);
  }

  /**
   *  Set <me> so that <me> has the same geometric properties as C.
   */
  public void SetCone( gp_Cone  C) {
    OCCwrapJavaJNI.Geom_ConicalSurface_SetCone(swigCPtr, this, gp_Cone.getCPtr(C), C);
  }

  /**
   *  Changes the radius of the conical surface in the placement
   *  plane (Z = 0, V = 0).  The local coordinate system is not
   *  modified.
   *  Raised if R < 0.0
   */
  public void SetRadius(double R) {
    OCCwrapJavaJNI.Geom_ConicalSurface_SetRadius(swigCPtr, this, R);
  }

  /**
   *  Changes the semi angle of the conical surface.
   * 
   *  Raised if Ang < Resolution or Ang >= PI/2 - Resolution
   */
  public void SetSemiAngle(double Ang) {
    OCCwrapJavaJNI.Geom_ConicalSurface_SetSemiAngle(swigCPtr, this, Ang);
  }

  /**
   *  returns a non transient cone with the same geometric properties
   *  as <me>.
   */
  public gp_Cone Cone() {
    return new gp_Cone(OCCwrapJavaJNI.Geom_ConicalSurface_Cone(swigCPtr, this), true);
  }

  /**
   *  Computes the apex of this cone. It is on the negative
   *  side of the axis of revolution of this cone if the
   *  half-angle at the apex is positive, and on the positive
   *  side of the "main Axis" if the half-angle is negative.
   */
  public gp_Pnt Apex() {
    return new gp_Pnt(OCCwrapJavaJNI.Geom_ConicalSurface_Apex(swigCPtr, this), true);
  }

  /**
   *  Returns the coefficients of the implicit equation of the
   *  quadric in the absolute cartesian coordinate system :
   *  These coefficients are normalized.
   *  A1.X**2 + A2.Y**2 + A3.Z**2 + 2.(B1.X.Y + B2.X.Z + B3.Y.Z) +
   *  2.(C1.X + C2.Y + C3.Z) + D = 0.0
   */
  public void Coefficients(double[] A1, double[] A2, double[] A3, double[] B1, double[] B2, double[] B3, double[] C1, double[] C2, double[] C3, double[] D) {
    OCCwrapJavaJNI.Geom_ConicalSurface_Coefficients(swigCPtr, this, A1, A2, A3, B1, B2, B3, C1, C2, C3, D);
  }

  /**
   *  Returns the reference radius of this cone.
   *  The reference radius is the radius of the circle formed
   *  by the intersection of this cone and its reference
   *  plane (i.e. the plane defined by the origin, "X
   *  Direction" and "Y Direction" of the local coordinate
   *  system of this cone).
   *  If the apex of this cone is on the origin of the local
   *  coordinate system of this cone, the returned value is 0.
   */
  public double RefRadius() {
    return OCCwrapJavaJNI.Geom_ConicalSurface_RefRadius(swigCPtr, this);
  }

  /**
   *  returns the semi-angle of the conical surface ]0.0, PI/2[.
   */
  public double SemiAngle() {
    return OCCwrapJavaJNI.Geom_ConicalSurface_SemiAngle(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_ConicalSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_ConicalSurface_get_type_descriptor(), true );
  }

  public static  Geom_ConicalSurface  DownCast( Standard_Transient  T) {
    return new Geom_ConicalSurface ( OCCwrapJavaJNI.Geom_ConicalSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_ConicalSurface_TypeOf(), true );
  }

}
