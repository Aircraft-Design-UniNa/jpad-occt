package opencascade;

/**
 *  Describes a right-handed coordinate system in 3D space.
 *  A coordinate system is defined by:
 *  - its origin, also termed the "Location point" of the coordinate system,
 *  - three orthogonal unit vectors, termed respectively
 *  the "X Direction", "Y Direction" and "Direction" (or
 *  "main Direction") of the coordinate system.
 *  As a Geom_Axis2Placement coordinate system is
 *  right-handed, its "Direction" is always equal to the
 *  cross product of its "X Direction" and "Y Direction".
 *  The "Direction" of a coordinate system is called the
 *  "main Direction" because when this unit vector is
 *  modified, the "X Direction" and "Y Direction" are
 *  recomputed, whereas when the "X Direction" or "Y
 *  Direction" is changed, the "main Direction" is
 *  retained. The "main Direction" is also the "Z Direction".
 *  Note: Geom_Axis2Placement coordinate systems
 *  provide the same kind of "geometric" services as
 *  gp_Ax2 coordinate systems but have more complex
 *  data structures. The geometric objects provided by
 *  the Geom package use gp_Ax2 objects to include
 *  coordinate systems in their data structures, or to
 *  define the geometric transformations, which are applied to them.
 *  Geom_Axis2Placement coordinate systems are
 *  used in a context where they can be shared by
 *  several objects contained inside a common data structure.
 */
public class Geom_Axis2Placement extends Geom_AxisPlacement {
  Geom_Axis2Placement(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a transient copy of A2.
   */
  public Geom_Axis2Placement( gp_Ax2  A2) {
    this(OCCwrapJavaJNI.new_Geom_Axis2Placement__SWIG_0(gp_Ax2.getCPtr(A2), A2), true);
  }

  /**
   *  P is the origin of the axis placement, N is the main
   *  direction of the axis placement and Vx is the "XDirection".
   *  If the two directions N and Vx are not orthogonal the
   *  "XDirection" is computed as follow :
   *  XDirection = N ^ (Vx ^ N).
   *  Raised if N and Vx are parallel.
   */
  public Geom_Axis2Placement( gp_Pnt  P,  gp_Dir  N,  gp_Dir  Vx) {
    this(OCCwrapJavaJNI.new_Geom_Axis2Placement__SWIG_1(gp_Pnt.getCPtr(P), P, gp_Dir.getCPtr(N), N, gp_Dir.getCPtr(Vx), Vx), true);
  }

  /**
   *  Assigns the origin and the three unit vectors of A2 to
   *  this coordinate system.
   */
  public void SetAx2( gp_Ax2  A2) {
    OCCwrapJavaJNI.Geom_Axis2Placement_SetAx2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Changes the "XDirection" of the axis placement, Vx is the
   *  new "XDirection". If Vx is not normal to the main direction
   *  then "XDirection" is computed as follow :
   *  XDirection = Direction ^ ( Vx ^ Direction).
   *  The main direction is not modified.
   *  Raised if Vx and "Direction"  are parallel.
   */
  public void SetXDirection( gp_Dir  Vx) {
    OCCwrapJavaJNI.Geom_Axis2Placement_SetXDirection(swigCPtr, this, gp_Dir.getCPtr(Vx), Vx);
  }

  /**
   *  Changes the "YDirection" of the axis placement, Vy is the
   *  new "YDirection". If Vy is not normal to the main direction
   *  then "YDirection" is computed as follow :
   *  YDirection = Direction ^ ( Vy ^ Direction).
   *  The main direction is not modified. The "XDirection" is
   *  modified.
   *  Raised if Vy and the main direction are parallel.
   */
  public void SetYDirection( gp_Dir  Vy) {
    OCCwrapJavaJNI.Geom_Axis2Placement_SetYDirection(swigCPtr, this, gp_Dir.getCPtr(Vy), Vy);
  }

  /**
   *  Returns a non transient copy of <me>.
   */
  public gp_Ax2 Ax2() {
    return new gp_Ax2(OCCwrapJavaJNI.Geom_Axis2Placement_Ax2(swigCPtr, this), true);
  }

  /**
   *  Returns the "XDirection". This is a unit vector.
   */
  public  gp_Dir  XDirection() {
    gp_Dir ret = new gp_Dir(OCCwrapJavaJNI.Geom_Axis2Placement_XDirection(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the "YDirection". This is a unit vector.
   */
  public  gp_Dir  YDirection() {
    gp_Dir ret = new gp_Dir(OCCwrapJavaJNI.Geom_Axis2Placement_YDirection(swigCPtr, this), true);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_Axis2Placement_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Axis2Placement_get_type_descriptor(), true );
  }

  public static  Geom_Axis2Placement  DownCast( Standard_Transient  T) {
    return new Geom_Axis2Placement ( OCCwrapJavaJNI.Geom_Axis2Placement_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Axis2Placement_TypeOf(), true );
  }

}
