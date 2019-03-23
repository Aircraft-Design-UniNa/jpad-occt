package opencascade;

/**
 *  The abstract class Conic describes the common
 *  behavior of conic curves in 3D space and, in
 *  particular, their general characteristics. The Geom
 *  package provides four concrete classes of conics:
 *  Geom_Circle, Geom_Ellipse, Geom_Hyperbola and Geom_Parabola.
 *  A conic is positioned in space with a right-handed
 *  coordinate system (gp_Ax2 object), where:
 *  - the origin is the center of the conic (or the apex in
 *  the case of a parabola),
 *  - the origin, "X Direction" and "Y Direction" define the
 *  plane of the conic.
 *  This coordinate system is the local coordinate
 *  system of the conic.
 *  The "main Direction" of this coordinate system is the
 *  vector normal to the plane of the conic. The axis, of
 *  which the origin and unit vector are respectively the
 *  origin and "main Direction" of the local coordinate
 *  system, is termed the "Axis" or "main Axis" of the conic.
 *  The "main Direction" of the local coordinate system
 *  gives an explicit orientation to the conic, determining
 *  the direction in which the parameter increases along
 *  the conic. The "X Axis" of the local coordinate system
 *  also defines the origin of the parameter of the conic.
 */
public class Geom_Conic extends Geom_Curve {
  Geom_Conic(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Changes the orientation of the conic's plane. The normal
   *  axis to the plane is A1. The XAxis and the YAxis are recomputed.
   * 
   *  raised if the A1 is parallel to the XAxis of the conic.
   */
  public void SetAxis( gp_Ax1  A1) {
    OCCwrapJavaJNI.Geom_Conic_SetAxis(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  changes the location point of the conic.
   */
  public void SetLocation( gp_Pnt  P) {
    OCCwrapJavaJNI.Geom_Conic_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  changes the local coordinate system of the conic.
   */
  public void SetPosition( gp_Ax2  A2) {
    OCCwrapJavaJNI.Geom_Conic_SetPosition(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Returns the "main Axis" of this conic. This axis is
   *  normal to the plane of the conic.
   */
  public gp_Ax1 Axis() {
    return new gp_Ax1(OCCwrapJavaJNI.Geom_Conic_Axis(swigCPtr, this), true);
  }

  /**
   *  Returns the eccentricity value of the conic e.
   *  e = 0 for a circle
   *  0 < e < 1 for an ellipse  (e = 0 if MajorRadius = MinorRadius)
   *  e > 1 for a hyperbola
   *  e = 1 for a parabola
   *  Exceptions
   *  Standard_DomainError in the case of a hyperbola if
   *  its major radius is null.
   */
  public double Eccentricity() {
    return OCCwrapJavaJNI.Geom_Conic_Eccentricity(swigCPtr, this);
  }

  /**
   *  Returns the location point of the conic.
   *  For the circle, the ellipse and the hyperbola it is the center of
   *  the conic. For the parabola it is the Apex of the parabola.
   */
  public gp_Pnt Location() {
    return new gp_Pnt(OCCwrapJavaJNI.Geom_Conic_Location(swigCPtr, this), true);
  }

  /**
   *  Returns the local coordinates system of the conic.
   *  The main direction of the Axis2Placement is normal to the
   *  plane of the conic. The X direction of the Axis2placement
   *  is in the plane of the conic and corresponds to the origin
   *  for the conic's parametric value u.
   */
  public  gp_Ax2  Position() {
    gp_Ax2 ret = new gp_Ax2(OCCwrapJavaJNI.Geom_Conic_Position(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the XAxis of the conic.
   *  This axis defines the origin of parametrization of the conic.
   *  This axis is perpendicular to the Axis of the conic.
   *  This axis and the Yaxis define the plane of the conic.
   */
  public gp_Ax1 XAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.Geom_Conic_XAxis(swigCPtr, this), true);
  }

  /**
   *  Returns the YAxis of the conic.
   *  The YAxis is perpendicular to the Xaxis.
   *  This axis and the Xaxis define the plane of the conic.
   */
  public gp_Ax1 YAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.Geom_Conic_YAxis(swigCPtr, this), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_Conic_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Conic_get_type_descriptor(), true );
  }

  public static  Geom_Conic  DownCast( Standard_Transient  T) {
    return new Geom_Conic ( OCCwrapJavaJNI.Geom_Conic_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Conic_TypeOf(), true );
  }

}
