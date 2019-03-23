package opencascade;

/**
 *  Describes the common behavior of surfaces which
 *  have a simple parametric equation in a local
 *  coordinate system. The Geom package provides
 *  several implementations of concrete elementary surfaces:
 *  - the plane, and
 *  - four simple surfaces of revolution: the cylinder, the
 *  cone, the sphere and the torus.
 *  An elementary surface inherits the common behavior
 *  of Geom_Surface surfaces. Furthermore, it is located
 *  in 3D space by a coordinate system (a gp_Ax3
 *  object) which is also its local coordinate system.
 *  Any elementary surface is oriented, i.e. the normal
 *  vector is always defined, and gives the same
 *  orientation to the surface, at any point on the surface.
 *  In topology this property is referred to as the "outside
 *  region of the surface". This orientation is related to
 *  the two parametric directions of the surface.
 *  Rotation of a surface around the "main Axis" of its
 *  coordinate system, in the trigonometric sense given
 *  by the "X Direction" and the "Y Direction" of the
 *  coordinate system, defines the u parametric direction
 *  of that elementary surface of revolution. This is the
 *  default construction mode.
 *  It is also possible, however, to change the orientation
 *  of a surface by reversing one of the two parametric
 *  directions: use the UReverse or VReverse functions
 *  to change the orientation of the normal at any point on the surface.
 *  Warning
 *  The local coordinate system of an elementary surface
 *  is not necessarily direct:
 *  - if it is direct, the trigonometric sense defined by its
 *  "main Direction" is the same as the trigonometric
 *  sense defined by its two vectors "X Direction" and "Y Direction":
 *  "main Direction" = "X Direction" ^ "Y Direction"
 *  - if it is indirect, the two definitions of trigonometric
 *  sense are opposite:
 *  "main Direction" = - "X Direction" ^ "Y Direction"
 */
public class Geom_ElementarySurface extends Geom_Surface {
  Geom_ElementarySurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Changes the main axis (ZAxis) of the elementary surface.
   * 
   *  Raised if the direction of A1 is parallel to the XAxis of the
   *  coordinate system of the surface.
   */
  public void SetAxis( gp_Ax1  A1) {
    OCCwrapJavaJNI.Geom_ElementarySurface_SetAxis(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Changes the location of the local coordinates system of the
   *  surface.
   */
  public void SetLocation( gp_Pnt  Loc) {
    OCCwrapJavaJNI.Geom_ElementarySurface_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(Loc), Loc);
  }

  /**
   *  Changes the local coordinates system of the surface.
   */
  public void SetPosition( gp_Ax3  A3) {
    OCCwrapJavaJNI.Geom_ElementarySurface_SetPosition(swigCPtr, this, gp_Ax3.getCPtr(A3), A3);
  }

  /**
   *  Returns the main axis of the surface (ZAxis).
   */
  public gp_Ax1 Axis() {
    return new gp_Ax1(OCCwrapJavaJNI.Geom_ElementarySurface_Axis(swigCPtr, this), true);
  }

  /**
   *  Returns the location point of the local coordinate system of the
   *  surface.
   */
  public gp_Pnt Location() {
    return new gp_Pnt(OCCwrapJavaJNI.Geom_ElementarySurface_Location(swigCPtr, this), true);
  }

  /**
   *  Returns the local coordinates system of the surface.
   */
  public  gp_Ax3  Position() {
    gp_Ax3 ret = new gp_Ax3(OCCwrapJavaJNI.Geom_ElementarySurface_Position(swigCPtr, this), true);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_ElementarySurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_ElementarySurface_get_type_descriptor(), true );
  }

  public static  Geom_ElementarySurface  DownCast( Standard_Transient  T) {
    return new Geom_ElementarySurface ( OCCwrapJavaJNI.Geom_ElementarySurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_ElementarySurface_TypeOf(), true );
  }

}
