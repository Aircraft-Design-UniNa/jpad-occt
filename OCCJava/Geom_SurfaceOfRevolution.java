package opencascade;

/**
 *  Describes a surface of revolution (revolved surface).
 *  Such a surface is obtained by rotating a curve (called
 *  the "meridian") through a complete revolution about
 *  an axis (referred to as the "axis of revolution"). The
 *  curve and the axis must be in the same plane (the
 *  "reference plane" of the surface).
 *  Rotation around the axis of revolution in the
 *  trigonometric sense defines the u parametric
 *  direction. So the u parameter is an angle, and its
 *  origin is given by the position of the meridian on the surface.
 *  The parametric range for the u parameter is: [ 0, 2.*Pi ]
 *  The v parameter is that of the meridian.
 *  Note: A surface of revolution is built from a copy of the
 *  original meridian. As a result the original meridian is
 *  not modified when the surface is modified.
 *  The form of a surface of revolution is typically a
 *  general revolution surface
 *  (GeomAbs_RevolutionForm). It can be:
 *  - a conical surface, if the meridian is a line or a
 *  trimmed line (GeomAbs_ConicalForm),
 *  - a cylindrical surface, if the meridian is a line or a
 *  trimmed line parallel to the axis of revolution
 *  (GeomAbs_CylindricalForm),
 *  - a planar surface if the meridian is a line or a
 *  trimmed line perpendicular to the axis of revolution
 *  of the surface (GeomAbs_PlanarForm),
 *  - a toroidal surface, if the meridian is a circle or a
 *  trimmed circle (GeomAbs_ToroidalForm), or
 *  - a spherical surface, if the meridian is a circle, the
 *  center of which is located on the axis of the
 *  revolved surface (GeomAbs_SphericalForm).
 *  Warning
 *  Be careful not to construct a surface of revolution
 *  where the curve and the axis or revolution are not
 *  defined in the same plane. If you do not have a
 *  correct configuration, you can correct your initial
 *  curve, using a cylindrical projection in the reference plane.
 */
public class Geom_SurfaceOfRevolution extends Geom_SweptSurface {
  Geom_SurfaceOfRevolution(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  C : is the meridian  or the referenced curve.
   *  A1 is the axis of revolution.
   *  The form of a SurfaceOfRevolution can be :
   *  . a general revolution surface (RevolutionForm),
   *  . a conical surface if the meridian is a line or a trimmed line
   *  (ConicalForm),
   *  . a cylindrical surface if the meridian is a line or a trimmed
   *  line parallel to the revolution axis (CylindricalForm),
   *  . a planar surface if the meridian is a line perpendicular to
   *  the revolution axis of the surface (PlanarForm).
   *  . a spherical surface,
   *  . a toroidal surface,
   *  . a quadric surface.
   *  Warnings :
   *  It is not checked that the curve C is planar and that the
   *  surface axis is in the plane of the curve.
   *  It is not checked that the revolved curve C doesn't
   *  self-intersects.
   */
  public Geom_SurfaceOfRevolution( Geom_Curve  C,  gp_Ax1  A1) {
    this(OCCwrapJavaJNI.new_Geom_SurfaceOfRevolution( Geom_Curve.getCPtr(C) , C, gp_Ax1.getCPtr(A1), A1), true);
  }

  /**
   *  Changes the axis of revolution.
   *  Warnings :
   *  It is not checked that the axis is in the plane of the
   *  revolved curve.
   */
  public void SetAxis( gp_Ax1  A1) {
    OCCwrapJavaJNI.Geom_SurfaceOfRevolution_SetAxis(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Changes the direction of the revolution axis.
   *  Warnings :
   *  It is not checked that the axis is in the plane of the
   *  revolved curve.
   */
  public void SetDirection( gp_Dir  V) {
    OCCwrapJavaJNI.Geom_SurfaceOfRevolution_SetDirection(swigCPtr, this, gp_Dir.getCPtr(V), V);
  }

  /**
   *  Changes the revolved curve of the surface.
   *  Warnings :
   *  It is not checked that the curve C is planar and that the
   *  surface axis is in the plane of the curve.
   *  It is not checked that the revolved curve C doesn't
   *  self-intersects.
   */
  public void SetBasisCurve( Geom_Curve  C) {
    OCCwrapJavaJNI.Geom_SurfaceOfRevolution_SetBasisCurve(swigCPtr, this,  Geom_Curve.getCPtr(C) , C);
  }

  /**
   *  Changes the location point of the revolution axis.
   *  Warnings :
   *  It is not checked that the axis is in the plane of the
   *  revolved curve.
   */
  public void SetLocation( gp_Pnt  P) {
    OCCwrapJavaJNI.Geom_SurfaceOfRevolution_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Returns the revolution axis of the surface.
   */
  public gp_Ax1 Axis() {
    return new gp_Ax1(OCCwrapJavaJNI.Geom_SurfaceOfRevolution_Axis(swigCPtr, this), true);
  }

  /**
   *  Returns the location point of the axis of revolution.
   */
  public  gp_Pnt  Location() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.Geom_SurfaceOfRevolution_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Computes the position of the reference plane of the surface
   *  defined by the basis curve and the symmetry axis.
   *  The location point is the location point of the revolution's
   *  axis, the XDirection of the plane is given by the revolution's
   *  axis and the orientation of the normal to the plane is given
   *  by the sense of revolution.
   * 
   *  Raised if the revolved curve is not planar or if the revolved
   *  curve and the symmetry axis are not in the same plane or if
   *  the maximum of distance between the axis and the revolved
   *  curve is lower or equal to Resolution from gp.
   */
  public gp_Ax2 ReferencePlane() {
    return new gp_Ax2(OCCwrapJavaJNI.Geom_SurfaceOfRevolution_ReferencePlane(swigCPtr, this), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_SurfaceOfRevolution_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_SurfaceOfRevolution_get_type_descriptor(), true );
  }

  public static  Geom_SurfaceOfRevolution  DownCast( Standard_Transient  T) {
    return new Geom_SurfaceOfRevolution ( OCCwrapJavaJNI.Geom_SurfaceOfRevolution_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_SurfaceOfRevolution_TypeOf(), true );
  }

}
