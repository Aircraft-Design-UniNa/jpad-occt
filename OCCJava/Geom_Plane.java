package opencascade;

/**
 *  Describes a plane in 3D space.
 *  A plane is positioned in space by a coordinate system
 *  (a gp_Ax3 object) such that the plane is defined by
 *  the origin, "X Direction" and "Y Direction" of this
 *  coordinate system.
 *  This coordinate system is the "local coordinate
 *  system" of the plane. The following apply:
 *  - Its "X Direction" and "Y Direction" are respectively
 *  the u and v parametric directions of the plane.
 *  - Its origin is the origin of the u and v parameters
 *  (also called the "origin" of the plane).
 *  - Its "main Direction" is a vector normal to the plane.
 *  This normal vector gives the orientation of the
 *  plane only if the local coordinate system is "direct".
 *  (The orientation of the plane is always defined by
 *  the "X Direction" and the "Y Direction" of its local
 *  coordinate system.)
 *  The parametric equation of the plane is:
 *  P(u, v) = O + u*XDir + v*YDir
 *  where O, XDir and YDir are respectively the
 *  origin, the "X Direction" and the "Y Direction" of the
 *  local coordinate system of the plane.
 *  The parametric range of the two parameters u and v
 *  is ] -infinity, +infinity [.
 */
public class Geom_Plane extends Geom_ElementarySurface {
  Geom_Plane(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a plane located in 3D space with an axis placement
   *  three axis.  The "ZDirection" of "A3" is the direction normal
   *  to the plane.  The "Location" point of "A3" is the origin of
   *  the plane. The "XDirection" and "YDirection" of "A3" define
   *  the directions of the U isoparametric and V isoparametric
   *  curves.
   */
  public Geom_Plane( gp_Ax3  A3) {
    this(OCCwrapJavaJNI.new_Geom_Plane__SWIG_0(gp_Ax3.getCPtr(A3), A3), true);
  }

  /**
   *  Creates a plane from a non transient plane from package gp.
   */
  public Geom_Plane( gp_Pln  Pl) {
    this(OCCwrapJavaJNI.new_Geom_Plane__SWIG_1(gp_Pln.getCPtr(Pl), Pl), true);
  }

  /**
   *  P is the "Location" point or origin of the plane.
   *  V is the direction normal to the plane.
   */
  public Geom_Plane( gp_Pnt  P,  gp_Dir  V) {
    this(OCCwrapJavaJNI.new_Geom_Plane__SWIG_2(gp_Pnt.getCPtr(P), P, gp_Dir.getCPtr(V), V), true);
  }

  /**
   *  Creates a plane from its cartesian equation :
   *  Ax + By + Cz + D = 0.0
   * 
   *  Raised if Sqrt (A*A + B*B + C*C) <= Resolution from gp
   */
  public Geom_Plane(double A, double B, double C, double D) {
    this(OCCwrapJavaJNI.new_Geom_Plane__SWIG_3(A, B, C, D), true);
  }

  /**
   *  Set <me> so that <me> has the same geometric properties as Pl.
   */
  public void SetPln( gp_Pln  Pl) {
    OCCwrapJavaJNI.Geom_Plane_SetPln(swigCPtr, this, gp_Pln.getCPtr(Pl), Pl);
  }

  /**
   *  Converts this plane into a gp_Pln plane.
   */
  public gp_Pln Pln() {
    return new gp_Pln(OCCwrapJavaJNI.Geom_Plane_Pln(swigCPtr, this), true);
  }

  /**
   *  Computes the normalized coefficients of the plane's
   *  cartesian equation : Ax + By + Cz + D = 0.0
   */
  public void Coefficients(double[] A, double[] B, double[] C, double[] D) {
    OCCwrapJavaJNI.Geom_Plane_Coefficients(swigCPtr, this, A, B, C, D);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_Plane_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Plane_get_type_descriptor(), true );
  }

  public static  Geom_Plane  DownCast( Standard_Transient  T) {
    return new Geom_Plane ( OCCwrapJavaJNI.Geom_Plane_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Plane_TypeOf(), true );
  }

}
