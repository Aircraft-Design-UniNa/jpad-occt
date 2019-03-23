package opencascade;

/**
 *  The abstract class AxisPlacement describes the
 *  common behavior of positioning systems in 3D space,
 *  such as axis or coordinate systems.
 *  The Geom package provides two implementations of
 *  3D positioning systems:
 *  - the axis (Geom_Axis1Placement class), which is defined by:
 *  - its origin, also termed the "Location point" of the  axis,
 *  - its unit vector, termed the "Direction" or "main
 *  Direction" of the axis;
 *  - the right-handed coordinate system
 *  (Geom_Axis2Placement class), which is defined by:
 *  - its origin, also termed the "Location point" of the coordinate system,
 *  - three orthogonal unit vectors, termed
 *  respectively the "X Direction", the "Y Direction"
 *  and the "Direction" of the coordinate system. As
 *  the coordinate system is right-handed, these
 *  unit vectors have the following relation:
 *  "Direction" = "X Direction" ^
 *  "Y Direction". The "Direction" is also
 *  called the "main Direction" because, when the
 *  unit vector is modified, the "X Direction" and "Y
 *  Direction" are recomputed, whereas when the "X
 *  Direction" or "Y Direction" is modified, the "main Direction" does not change.
 *  The axis whose origin is the origin of the positioning
 *  system and whose unit vector is its "main Direction" is
 *  also called the "Axis" or "main Axis" of the positioning system.
 */
public class Geom_AxisPlacement extends Geom_Geometry {
  Geom_AxisPlacement(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Assigns A1 as the "main Axis" of this positioning system. This modifies
   *  - its origin, and
   *  - its "main Direction".
   *  If this positioning system is a
   *  Geom_Axis2Placement, then its "X Direction" and
   *  "Y Direction" are recomputed.
   *  Exceptions
   *  For a Geom_Axis2Placement:
   *  Standard_ConstructionError if A1 and the
   *  previous "X Direction" of the coordinate system are parallel.
   */
  public void SetAxis( gp_Ax1  A1) {
    OCCwrapJavaJNI.Geom_AxisPlacement_SetAxis(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Changes the direction of the axis placement.
   *  If <me> is an axis placement two axis the main "Direction"
   *  is modified and the "XDirection" and "YDirection" are
   *  recomputed.
   *  Raises ConstructionError only for an axis placement two axis if V and the
   *  previous "XDirection" are parallel because it is not possible
   *  to calculate the new "XDirection" and the new "YDirection".
   */
  public void SetDirection( gp_Dir  V) {
    OCCwrapJavaJNI.Geom_AxisPlacement_SetDirection(swigCPtr, this, gp_Dir.getCPtr(V), V);
  }

  /**
   *  Assigns the point P as the origin of this positioning  system.
   */
  public void SetLocation( gp_Pnt  P) {
    OCCwrapJavaJNI.Geom_AxisPlacement_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Computes the angular value, in radians, between the
   *  "main Direction" of this positioning system and that
   *  of positioning system Other. The result is a value between 0 and Pi.
   */
  public double Angle( Geom_AxisPlacement  Other) {
    return OCCwrapJavaJNI.Geom_AxisPlacement_Angle(swigCPtr, this,  Geom_AxisPlacement.getCPtr(Other) , Other);
  }

  /**
   *  Returns the main axis of the axis placement.
   *  For an "Axis2placement" it is the main axis (Location, Direction ).
   *  For an "Axis1Placement" this method returns a copy of <me>.
   */
  public  gp_Ax1  Axis() {
    gp_Ax1 ret = new gp_Ax1(OCCwrapJavaJNI.Geom_AxisPlacement_Axis(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the main "Direction" of an axis placement.
   */
  public gp_Dir Direction() {
    return new gp_Dir(OCCwrapJavaJNI.Geom_AxisPlacement_Direction(swigCPtr, this), true);
  }

  /**
   *  Returns the Location point (origin) of the axis placement.
   */
  public gp_Pnt Location() {
    return new gp_Pnt(OCCwrapJavaJNI.Geom_AxisPlacement_Location(swigCPtr, this), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_AxisPlacement_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_AxisPlacement_get_type_descriptor(), true );
  }

  public static  Geom_AxisPlacement  DownCast( Standard_Transient  T) {
    return new Geom_AxisPlacement ( OCCwrapJavaJNI.Geom_AxisPlacement_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_AxisPlacement_TypeOf(), true );
  }

}
