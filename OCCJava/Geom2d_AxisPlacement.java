package opencascade;

/**
 *  Describes an axis in 2D space.
 *  An axis is defined by:
 *  - its origin, also termed the "Location point" of the axis,
 *  - its unit vector, termed the "Direction" of the axis.
 *  Note: Geom2d_AxisPlacement axes provide the
 *  same kind of "geometric" services as gp_Ax2d axes
 *  but have more complex data structures. The
 *  geometric objects provided by the Geom2d package
 *  use gp_Ax2d objects to include axes in their data
 *  structures, or to define an axis of symmetry or axis of rotation.
 *  Geom2d_AxisPlacement axes are used in a context
 *  where they can be shared by several objects
 *  contained inside a common data structure.
 */
public class Geom2d_AxisPlacement extends Geom2d_Geometry {
  Geom2d_AxisPlacement(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructs an axis by conversion of the gp_Ax2d axis A.
   */
  public Geom2d_AxisPlacement( gp_Ax2d  A) {
    this(OCCwrapJavaJNI.new_Geom2d_AxisPlacement__SWIG_0(gp_Ax2d.getCPtr(A), A), true);
  }

  /**
   *  Constructs an axis from a given origin P and unit vector V.
   */
  public Geom2d_AxisPlacement( gp_Pnt2d  P,  gp_Dir2d  V) {
    this(OCCwrapJavaJNI.new_Geom2d_AxisPlacement__SWIG_1(gp_Pnt2d.getCPtr(P), P, gp_Dir2d.getCPtr(V), V), true);
  }

  public void Reverse() {
    OCCwrapJavaJNI.Geom2d_AxisPlacement_Reverse(swigCPtr, this);
  }

  public  Geom2d_AxisPlacement  Reversed() {
    return new Geom2d_AxisPlacement ( OCCwrapJavaJNI.Geom2d_AxisPlacement_Reversed(swigCPtr, this), true );
  }

  /**
   *  Changes the complete definition of the axis placement.
   */
  public void SetAxis( gp_Ax2d  A) {
    OCCwrapJavaJNI.Geom2d_AxisPlacement_SetAxis(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Changes the "Direction" of the axis placement.
   */
  public void SetDirection( gp_Dir2d  V) {
    OCCwrapJavaJNI.Geom2d_AxisPlacement_SetDirection(swigCPtr, this, gp_Dir2d.getCPtr(V), V);
  }

  /**
   *  Changes the "Location" point (origin) of the axis placement.
   */
  public void SetLocation( gp_Pnt2d  P) {
    OCCwrapJavaJNI.Geom2d_AxisPlacement_SetLocation(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Computes the angle between the "Direction" of
   *  two axis placement in radians.
   *  The result is comprised between -Pi and Pi.
   */
  public double Angle( Geom2d_AxisPlacement  Other) {
    return OCCwrapJavaJNI.Geom2d_AxisPlacement_Angle(swigCPtr, this,  Geom2d_AxisPlacement.getCPtr(Other) , Other);
  }

  /**
   *  Converts this axis into a gp_Ax2d axis.
   */
  public gp_Ax2d Ax2d() {
    return new gp_Ax2d(OCCwrapJavaJNI.Geom2d_AxisPlacement_Ax2d(swigCPtr, this), true);
  }

  /**
   *  Returns the "Direction" of <me>.
   *  -C++: return const&
   */
  public gp_Dir2d Direction() {
    return new gp_Dir2d(OCCwrapJavaJNI.Geom2d_AxisPlacement_Direction(swigCPtr, this), true);
  }

  /**
   *  Returns the "Location" point (origin) of the axis placement.
   *  -C++: return const&
   */
  public gp_Pnt2d Location() {
    return new gp_Pnt2d(OCCwrapJavaJNI.Geom2d_AxisPlacement_Location(swigCPtr, this), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom2d_AxisPlacement_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_AxisPlacement_get_type_descriptor(), true );
  }

  public static  Geom2d_AxisPlacement  DownCast( Standard_Transient  T) {
    return new Geom2d_AxisPlacement ( OCCwrapJavaJNI.Geom2d_AxisPlacement_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_AxisPlacement_TypeOf(), true );
  }

}
