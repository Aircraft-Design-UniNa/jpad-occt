package opencascade;

/**
 *  Describes an axis in 3D space.
 *  An axis is defined by:
 *  - its origin, also termed the "Location point" of the axis,
 *  - its unit vector, termed the "Direction" of the axis.
 *  Note: Geom_Axis1Placement axes provide the
 *  same kind of "geometric" services as gp_Ax1 axes
 *  but have more complex data structures. The
 *  geometric objects provided by the Geom package
 *  use gp_Ax1 objects to include axes in their data
 *  structures, or to define an axis of symmetry or axis of rotation.
 *  Geom_Axis1Placement axes are used in a context
 *  where they can be shared by several objects
 *  contained inside a common data structure.
 */
public class Geom_Axis1Placement extends Geom_AxisPlacement {
  Geom_Axis1Placement(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a transient copy of A1.
   */
  public Geom_Axis1Placement( gp_Ax1  A1) {
    this(OCCwrapJavaJNI.new_Geom_Axis1Placement__SWIG_0(gp_Ax1.getCPtr(A1), A1), true);
  }

  /**
   *  P is the origin of the axis placement and V is the direction
   *  of the axis placement.
   */
  public Geom_Axis1Placement( gp_Pnt  P,  gp_Dir  V) {
    this(OCCwrapJavaJNI.new_Geom_Axis1Placement__SWIG_1(gp_Pnt.getCPtr(P), P, gp_Dir.getCPtr(V), V), true);
  }

  /**
   *  Returns a non transient copy of <me>.
   */
  public  gp_Ax1  Ax1() {
    gp_Ax1 ret = new gp_Ax1(OCCwrapJavaJNI.Geom_Axis1Placement_Ax1(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Reverses the direction of the axis placement.
   */
  public void Reverse() {
    OCCwrapJavaJNI.Geom_Axis1Placement_Reverse(swigCPtr, this);
  }

  public  Geom_Axis1Placement  Reversed() {
    return new Geom_Axis1Placement ( OCCwrapJavaJNI.Geom_Axis1Placement_Reversed(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_Axis1Placement_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Axis1Placement_get_type_descriptor(), true );
  }

  public static  Geom_Axis1Placement  DownCast( Standard_Transient  T) {
    return new Geom_Axis1Placement ( OCCwrapJavaJNI.Geom_Axis1Placement_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Axis1Placement_TypeOf(), true );
  }

}
