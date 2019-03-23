package opencascade;

/**
 *  Describes a surface of linear extrusion ("extruded
 *  surface"), e.g. a generalized cylinder. Such a surface
 *  is obtained by sweeping a curve (called the "extruded
 *  curve" or "basis") in a given direction (referred to as
 *  the "direction of extrusion" and defined by a unit vector).
 *  The u parameter is along the extruded curve. The v
 *  parameter is along the direction of extrusion.
 *  The parameter range for the u parameter is defined
 *  by the reference curve.
 *  The parameter range for the v parameter is ] -
 *  infinity, + infinity [.
 *  The position of the curve gives the origin of the v parameter.
 *  The surface is "CN" in the v parametric direction.
 *  The form of a surface of linear extrusion is generally a
 *  ruled surface (GeomAbs_RuledForm). It can be:
 *  - a cylindrical surface, if the extruded curve is a circle,
 *  or a trimmed circle, with an axis parallel to the
 *  direction of extrusion (GeomAbs_CylindricalForm), or
 *  - a planar surface, if the extruded curve is a line
 *  (GeomAbs_PlanarForm).
 *  Note: The surface of extrusion is built from a copy of
 *  the original basis curve, so the original curve is not
 *  modified when the surface is modified.
 *  Warning
 *  Degenerate surfaces are not detected. A degenerate
 *  surface is obtained, for example, when the extruded
 *  curve is a line and the direction of extrusion is parallel
 *  to that line.
 */
public class Geom_SurfaceOfLinearExtrusion extends Geom_SweptSurface {
  Geom_SurfaceOfLinearExtrusion(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  V is the direction of extrusion.
   *  C is the extruded curve.
   *  The form of a SurfaceOfLinearExtrusion can be :
   *  . ruled surface (RuledForm),
   *  . a cylindrical surface if the extruded curve is a circle or
   *  a trimmed circle (CylindricalForm),
   *  . a plane surface if the extruded curve is a Line (PlanarForm).
   *  Warnings :
   *  Degenerated surface cases are not detected. For example if the
   *  curve C is a line and V is parallel to the direction of this
   *  line.
   */
  public Geom_SurfaceOfLinearExtrusion( Geom_Curve  C,  gp_Dir  V) {
    this(OCCwrapJavaJNI.new_Geom_SurfaceOfLinearExtrusion( Geom_Curve.getCPtr(C) , C, gp_Dir.getCPtr(V), V), true);
  }

  /**
   *  Assigns V as the "direction of extrusion" for this
   *  surface of linear extrusion.
   */
  public void SetDirection( gp_Dir  V) {
    OCCwrapJavaJNI.Geom_SurfaceOfLinearExtrusion_SetDirection(swigCPtr, this, gp_Dir.getCPtr(V), V);
  }

  /**
   *  Modifies this surface of linear extrusion by redefining
   *  its "basis curve" (the "extruded curve").
   */
  public void SetBasisCurve( Geom_Curve  C) {
    OCCwrapJavaJNI.Geom_SurfaceOfLinearExtrusion_SetBasisCurve(swigCPtr, this,  Geom_Curve.getCPtr(C) , C);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_SurfaceOfLinearExtrusion_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_SurfaceOfLinearExtrusion_get_type_descriptor(), true );
  }

  public static  Geom_SurfaceOfLinearExtrusion  DownCast( Standard_Transient  T) {
    return new Geom_SurfaceOfLinearExtrusion ( OCCwrapJavaJNI.Geom_SurfaceOfLinearExtrusion_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_SurfaceOfLinearExtrusion_TypeOf(), true );
  }

}
