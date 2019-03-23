package opencascade;

/**
 *  Describes the common behavior for surfaces
 *  constructed by sweeping a curve with another curve.
 *  The Geom package provides two concrete derived
 *  surfaces: surface of revolution (a revolved surface),
 *  and surface of linear extrusion (an extruded surface).
 */
public class Geom_SweptSurface extends Geom_Surface {
  Geom_SweptSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns the reference direction of the swept surface.
   *  For a surface of revolution it is the direction of the
   *  revolution axis, for a surface of linear extrusion it is
   *  the direction of extrusion.
   */
  public  gp_Dir  Direction() {
    gp_Dir ret = new gp_Dir(OCCwrapJavaJNI.Geom_SweptSurface_Direction(swigCPtr, this), true);
    return ret;
  }

  public  Geom_Curve  BasisCurve() {
    return new Geom_Curve ( OCCwrapJavaJNI.Geom_SweptSurface_BasisCurve(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_SweptSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_SweptSurface_get_type_descriptor(), true );
  }

  public static  Geom_SweptSurface  DownCast( Standard_Transient  T) {
    return new Geom_SweptSurface ( OCCwrapJavaJNI.Geom_SweptSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_SweptSurface_TypeOf(), true );
  }

}
