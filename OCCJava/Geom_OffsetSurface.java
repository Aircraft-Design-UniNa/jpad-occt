package opencascade;

/**
 *  Describes an offset surface in 3D space.
 *  An offset surface is defined by:
 *  - the basis surface to which it is parallel, and
 *  - the distance between the offset surface and its basis surface.
 *  A point on the offset surface is built by measuring the
 *  offset value along the normal vector at a point on the
 *  basis surface. This normal vector is given by the cross
 *  product D1u^D1v, where D1u and D1v are the
 *  vectors tangential to the basis surface in the u and v
 *  parametric directions at this point. The side of the
 *  basis surface on which the offset is measured
 *  depends on the sign of the offset value.
 *  A Geom_OffsetSurface surface can be
 *  self-intersecting, even if the basis surface does not
 *  self-intersect. The self-intersecting portions are not
 *  deleted at the time of construction.
 *  Warning
 *  There must be only one normal vector defined at any
 *  point on the basis surface. This must be verified by the
 *  user as no check is made at the time of construction
 *  to detect points with multiple possible normal
 *  directions (for example, the top of a conical surface).
 */
public class Geom_OffsetSurface extends Geom_Surface {
  Geom_OffsetSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructs a surface offset from the basis surface
   *  S, where Offset is the distance between the offset
   *  surface and the basis surface at any point.
   *  A point on the offset surface is built by measuring
   *  the offset value along a normal vector at a point on
   *  S. This normal vector is given by the cross product
   *  D1u^D1v, where D1u and D1v are the vectors
   *  tangential to the basis surface in the u and v
   *  parametric directions at this point. The side of S on
   *  which the offset value is measured is indicated by
   *  this normal vector if Offset is positive, or is the
   *  inverse sense if Offset is negative.
   *  If isNotCheckC0 = TRUE checking if basis surface has C0-continuity
   *  is not made.
   *  Warnings :
   *  - The offset surface is built with a copy of the
   *  surface S. Therefore, when S is modified the
   *  offset surface is not modified.
   *  - No check is made at the time of construction to
   *  detect points on S with multiple possible normal directions.
   *  Raised if S is not at least C1.
   *  Warnings :
   *  No check is done to verify that a unique normal direction is
   *  defined at any point of the basis surface S.
   */
  public Geom_OffsetSurface( Geom_Surface  S, double Offset, long isNotCheckC0) {
    this(OCCwrapJavaJNI.new_Geom_OffsetSurface__SWIG_0( Geom_Surface.getCPtr(S) , S, Offset, isNotCheckC0), true);
  }

  public Geom_OffsetSurface( Geom_Surface  S, double Offset) {
    this(OCCwrapJavaJNI.new_Geom_OffsetSurface__SWIG_1( Geom_Surface.getCPtr(S) , S, Offset), true);
  }

  /**
   *  Raised if S is not at least C1.
   *  Warnings :
   *  No check is done to verify that a unique normal direction is
   *  defined at any point of the basis surface S.
   *  If isNotCheckC0 = TRUE checking if basis surface has C0-continuity
   *  is not made.
   *  Exceptions
   *  Standard_ConstructionError if the surface S is not
   *  at least "C1" continuous.
   */
  public void SetBasisSurface( Geom_Surface  S, long isNotCheckC0) {
    OCCwrapJavaJNI.Geom_OffsetSurface_SetBasisSurface__SWIG_0(swigCPtr, this,  Geom_Surface.getCPtr(S) , S, isNotCheckC0);
  }

  public void SetBasisSurface( Geom_Surface  S) {
    OCCwrapJavaJNI.Geom_OffsetSurface_SetBasisSurface__SWIG_1(swigCPtr, this,  Geom_Surface.getCPtr(S) , S);
  }

  /**
   *  Changes this offset surface by assigning D as the offset value.
   */
  public void SetOffsetValue(double D) {
    OCCwrapJavaJNI.Geom_OffsetSurface_SetOffsetValue(swigCPtr, this, D);
  }

  /**
   *  Returns the offset value of this offset surface.
   */
  public double Offset() {
    return OCCwrapJavaJNI.Geom_OffsetSurface_Offset(swigCPtr, this);
  }

  public  Geom_Surface  BasisSurface() {
    return new Geom_Surface ( OCCwrapJavaJNI.Geom_OffsetSurface_BasisSurface(swigCPtr, this), true );
  }

  public SWIGTYPE_p_opencascade__handleT_Geom_OsculatingSurface_t OsculatingSurface() {
    return new SWIGTYPE_p_opencascade__handleT_Geom_OsculatingSurface_t(OCCwrapJavaJNI.Geom_OffsetSurface_OsculatingSurface(swigCPtr, this), false);
  }

  public  Geom_Surface  Surface() {
    return new Geom_Surface ( OCCwrapJavaJNI.Geom_OffsetSurface_Surface(swigCPtr, this), true );
  }

  /**
   *  if Standard_True, L is  the local osculating surface
   *  along U at  the point U,V.   It means that  DL/DU is
   *  collinear to DS/DU .  If IsOpposite == Standard_True
   *  these vectors have opposite direction.
   */
  public long UOsculatingSurface(double U, double V, long[] IsOpposite,  Geom_BSplineSurface  UOsculSurf) {
    return OCCwrapJavaJNI.Geom_OffsetSurface_UOsculatingSurface(swigCPtr, this, U, V, IsOpposite,  Geom_BSplineSurface.getCPtr(UOsculSurf) , UOsculSurf);
  }

  /**
   *  if Standard_True, L is the local osculating surface
   *  along V at the point U,V.
   *  It means that  DL/DV is
   *  collinear to DS/DV .  If IsOpposite == Standard_True
   *  these vectors have opposite direction.
   */
  public long VOsculatingSurface(double U, double V, long[] IsOpposite,  Geom_BSplineSurface  VOsculSurf) {
    return OCCwrapJavaJNI.Geom_OffsetSurface_VOsculatingSurface(swigCPtr, this, U, V, IsOpposite,  Geom_BSplineSurface.getCPtr(VOsculSurf) , VOsculSurf);
  }

  /**
   *  Returns continuity of the basis surface.
   */
  public GeomAbs_Shape GetBasisSurfContinuity() {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.Geom_OffsetSurface_GetBasisSurfContinuity(swigCPtr, this));
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_OffsetSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_OffsetSurface_get_type_descriptor(), true );
  }

  public static  Geom_OffsetSurface  DownCast( Standard_Transient  T) {
    return new Geom_OffsetSurface ( OCCwrapJavaJNI.Geom_OffsetSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_OffsetSurface_TypeOf(), true );
  }

}
