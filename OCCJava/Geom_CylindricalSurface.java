package opencascade;

/**
 *  This class defines the infinite cylindrical surface.
 * 
 *  Every cylindrical surface is set by the following equation:
 *  S(U,V) = Location + R*cos(U)*XAxis + R*sin(U)*YAxis + V*ZAxis,
 *  where R is cylinder radius.
 * 
 *  The local coordinate system of the CylindricalSurface is defined
 *  with an axis placement (see class ElementarySurface).
 * 
 *  The "ZAxis" is the symmetry axis of the CylindricalSurface,
 *  it gives the direction of increasing parametric value V.
 * 
 *  The parametrization range is :
 *  U [0, 2*PI],  V ]- infinite, + infinite[
 * 
 *  The "XAxis" and the "YAxis" define the placement plane of the
 *  surface (Z = 0, and parametric value V = 0)  perpendicular to
 *  the symmetry axis. The "XAxis" defines the origin of the
 *  parameter U = 0.  The trigonometric sense gives the positive
 *  orientation for the parameter U.
 * 
 *  When you create a CylindricalSurface the U and V directions of
 *  parametrization are such that at each point of the surface the
 *  normal is oriented towards the "outside region".
 * 
 *  The methods UReverse VReverse change the orientation of the
 *  surface.
 */
public class Geom_CylindricalSurface extends Geom_ElementarySurface {
  Geom_CylindricalSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  A3 defines the local coordinate system of the cylindrical surface.
   *  The "ZDirection" of A3 defines the direction of the surface's
   *  axis of symmetry.
   *  At the creation the parametrization of the surface is defined
   *  such that the normal Vector (N = D1U ^ D1V) is oriented towards
   *  the "outside region" of the surface.
   *  Warnings :
   *  It is not forbidden to create a cylindrical surface with
   *  Radius = 0.0
   *  Raised if Radius < 0.0
   */
  public Geom_CylindricalSurface( gp_Ax3  A3, double Radius) {
    this(OCCwrapJavaJNI.new_Geom_CylindricalSurface__SWIG_0(gp_Ax3.getCPtr(A3), A3, Radius), true);
  }

  /**
   *  Creates a CylindricalSurface from a non transient Cylinder
   *  from package gp.
   */
  public Geom_CylindricalSurface( gp_Cylinder  C) {
    this(OCCwrapJavaJNI.new_Geom_CylindricalSurface__SWIG_1(gp_Cylinder.getCPtr(C), C), true);
  }

  /**
   *  Set <me> so that <me> has the same geometric properties as C.
   */
  public void SetCylinder( gp_Cylinder  C) {
    OCCwrapJavaJNI.Geom_CylindricalSurface_SetCylinder(swigCPtr, this, gp_Cylinder.getCPtr(C), C);
  }

  /**
   *  Changes the radius of the cylinder.
   *  Raised if R < 0.0
   */
  public void SetRadius(double R) {
    OCCwrapJavaJNI.Geom_CylindricalSurface_SetRadius(swigCPtr, this, R);
  }

  /**
   *  returns a non transient cylinder with the same geometric
   *  properties as <me>.
   */
  public gp_Cylinder Cylinder() {
    return new gp_Cylinder(OCCwrapJavaJNI.Geom_CylindricalSurface_Cylinder(swigCPtr, this), true);
  }

  /**
   *  Returns the coefficients of the implicit equation of the quadric
   *  in the absolute cartesian coordinate system :
   *  These coefficients are normalized.
   *  A1.X**2 + A2.Y**2 + A3.Z**2 + 2.(B1.X.Y + B2.X.Z + B3.Y.Z) +
   *  2.(C1.X + C2.Y + C3.Z) + D = 0.0
   */
  public void Coefficients(double[] A1, double[] A2, double[] A3, double[] B1, double[] B2, double[] B3, double[] C1, double[] C2, double[] C3, double[] D) {
    OCCwrapJavaJNI.Geom_CylindricalSurface_Coefficients(swigCPtr, this, A1, A2, A3, B1, B2, B3, C1, C2, C3, D);
  }

  /**
   *  Returns the radius of this cylinder.
   */
  public double Radius() {
    return OCCwrapJavaJNI.Geom_CylindricalSurface_Radius(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_CylindricalSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_CylindricalSurface_get_type_descriptor(), true );
  }

  public static  Geom_CylindricalSurface  DownCast( Standard_Transient  T) {
    return new Geom_CylindricalSurface ( OCCwrapJavaJNI.Geom_CylindricalSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_CylindricalSurface_TypeOf(), true );
  }

}
