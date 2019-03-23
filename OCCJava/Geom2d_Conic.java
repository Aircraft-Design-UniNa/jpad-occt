package opencascade;

/**
 *  The abstract class Conic describes the common
 *  behavior of conic curves in 2D space and, in
 *  particular, their general characteristics. The Geom2d
 *  package provides four specific classes of conics:
 *  Geom2d_Circle, Geom2d_Ellipse,
 *  Geom2d_Hyperbola and Geom2d_Parabola.
 *  A conic is positioned in the plane with a coordinate
 *  system (gp_Ax22d object), where the origin is the
 *  center of the conic (or the apex in case of a parabola).
 *  This coordinate system is the local coordinate
 *  system of the conic. It gives the conic an explicit
 *  orientation, determining the direction in which the
 *  parameter increases along the conic. The "X Axis" of
 *  the local coordinate system also defines the origin of
 *  the parameter of the conic.
 */
public class Geom2d_Conic extends Geom2d_Curve {
  Geom2d_Conic(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Modifies this conic, redefining its local coordinate system
   *  partially, by assigning P as its origin
   */
  public void SetAxis( gp_Ax22d  A) {
    OCCwrapJavaJNI.Geom2d_Conic_SetAxis(swigCPtr, this, gp_Ax22d.getCPtr(A), A);
  }

  public void SetXAxis( gp_Ax2d  A) {
    OCCwrapJavaJNI.Geom2d_Conic_SetXAxis(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Assigns the origin and unit vector of axis A to the
   *  origin of the local coordinate system of this conic and either:
   *  - its "X Direction", or
   *  - its "Y Direction".
   *  The other unit vector of the local coordinate system
   *  of this conic is recomputed normal to A, without
   *  changing the orientation of the local coordinate
   *  system (right-handed or left-handed).
   */
  public void SetYAxis( gp_Ax2d  A) {
    OCCwrapJavaJNI.Geom2d_Conic_SetYAxis(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Modifies this conic, redefining its local coordinate
   *  system fully, by assigning A as this coordinate system.
   */
  public void SetLocation( gp_Pnt2d  P) {
    OCCwrapJavaJNI.Geom2d_Conic_SetLocation(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Returns the "XAxis" of the conic.
   *  This axis defines the origin of parametrization of the conic.
   *  This axis and the "Yaxis" define the local coordinate system
   *  of the conic.
   *  -C++: return const&
   */
  public gp_Ax2d XAxis() {
    return new gp_Ax2d(OCCwrapJavaJNI.Geom2d_Conic_XAxis(swigCPtr, this), true);
  }

  /**
   *  Returns the "YAxis" of the conic.
   *  The "YAxis" is perpendicular to the "Xaxis".
   */
  public gp_Ax2d YAxis() {
    return new gp_Ax2d(OCCwrapJavaJNI.Geom2d_Conic_YAxis(swigCPtr, this), true);
  }

  /**
   *  returns the eccentricity value of the conic e.
   *  e = 0 for a circle
   *  0 < e < 1 for an ellipse  (e = 0 if MajorRadius = MinorRadius)
   *  e > 1 for a hyperbola
   *  e = 1 for a parabola
   */
  public double Eccentricity() {
    return OCCwrapJavaJNI.Geom2d_Conic_Eccentricity(swigCPtr, this);
  }

  /**
   *  Returns the location point of the conic.
   *  For the circle, the ellipse and the hyperbola it is the center of
   *  the conic. For the parabola it is the vertex of the parabola.
   */
  public gp_Pnt2d Location() {
    return new gp_Pnt2d(OCCwrapJavaJNI.Geom2d_Conic_Location(swigCPtr, this), true);
  }

  /**
   *  Returns the local coordinates system of the conic.
   */
  public  gp_Ax22d  Position() {
    gp_Ax22d ret = new gp_Ax22d(OCCwrapJavaJNI.Geom2d_Conic_Position(swigCPtr, this), true);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom2d_Conic_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Conic_get_type_descriptor(), true );
  }

  public static  Geom2d_Conic  DownCast( Standard_Transient  T) {
    return new Geom2d_Conic ( OCCwrapJavaJNI.Geom2d_Conic_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Conic_TypeOf(), true );
  }

}
