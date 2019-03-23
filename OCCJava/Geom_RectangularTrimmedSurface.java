package opencascade;

/**
 *  Describes a portion of a surface (a patch) limited
 *  by two values of the u parameter in the u
 *  parametric direction, and two values of the v
 *  parameter in the v parametric direction. The
 *  domain of the trimmed surface must be within the
 *  domain of the surface being trimmed.
 *  The trimmed surface is defined by:
 *  - the basis surface, and
 *  - the values (umin, umax) and (vmin, vmax)
 *  which limit it in the u and v parametric directions.
 *  The trimmed surface is built from a copy of the basis
 *  surface. Therefore, when the basis surface is
 *  modified the trimmed surface is not changed.
 *  Consequently, the trimmed surface does not
 *  necessarily have the same orientation as the basis surface.
 *  Warning:  The  case of surface   being trimmed is  periodic and
 *  parametrics values are outside the domain is possible.
 *  But, domain of the  trimmed surface can be translated
 *  by (n X) the period.
 */
public class Geom_RectangularTrimmedSurface extends Geom_BoundedSurface {
  Geom_RectangularTrimmedSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  The U parametric direction of the surface is oriented from U1
   *  to U2. The V parametric direction of the surface is oriented
   *  from V1 to V2.
   *  These two directions define the orientation of the surface
   *  (normal). If the surface is not periodic USense and VSense are
   *  not used for the construction. If the surface S is periodic in
   *  one direction USense and VSense give the available part of the
   *  surface. By default in this case the surface has the same
   *  orientation as the basis surface S.
   *  The returned surface is not closed and not periodic.
   *  ConstructionError   Raised if
   *  S is not periodic in the UDirection and U1 or U2 are out of the
   *  bounds of S.
   *  S is not periodic in the VDirection and V1 or V2 are out of the
   *  bounds of S.
   *  U1 = U2 or V1 = V2
   */
  public Geom_RectangularTrimmedSurface( Geom_Surface  S, double U1, double U2, double V1, double V2, long USense, long VSense) {
    this(OCCwrapJavaJNI.new_Geom_RectangularTrimmedSurface__SWIG_0( Geom_Surface.getCPtr(S) , S, U1, U2, V1, V2, USense, VSense), true);
  }

  /**
   *  The basis surface S is only trim in one parametric direction.
   *  If UTrim = True the surface is trimmed in the U parametric
   *  direction else the surface is trimmed in the V parametric
   *  direction.
   *  In the considered parametric direction the resulting surface is
   *  oriented from Param1 to Param2. If S is periodic Sense gives the
   *  available part of the surface. By default the trimmed surface has
   *  the same orientation as the basis surface S in the considered
   *  parametric direction (Sense = True).
   *  If the basis surface S is closed or periodic in the parametric
   *  direction opposite to the trimming direction the trimmed surface
   *  has the same characteristics as the surface S in this direction.
   *  Warnings :
   *  In this package the entities are not shared.
   *  The RectangularTrimmedSurface is built with a copy of the
   *  surface S. So when S is modified the RectangularTrimmedSurface
   *  is not modified
   *  Raised if
   *  S is not periodic in the considered parametric direction and
   *  Param1 or Param2 are out of the bounds of S.
   *  Param1 = Param2
   */
  public Geom_RectangularTrimmedSurface( Geom_Surface  S, double U1, double U2, double V1, double V2, long USense) {
    this(OCCwrapJavaJNI.new_Geom_RectangularTrimmedSurface__SWIG_1( Geom_Surface.getCPtr(S) , S, U1, U2, V1, V2, USense), true);
  }

  public Geom_RectangularTrimmedSurface( Geom_Surface  S, double U1, double U2, double V1, double V2) {
    this(OCCwrapJavaJNI.new_Geom_RectangularTrimmedSurface__SWIG_2( Geom_Surface.getCPtr(S) , S, U1, U2, V1, V2), true);
  }

  public Geom_RectangularTrimmedSurface( Geom_Surface  S, double Param1, double Param2, long UTrim, long Sense) {
    this(OCCwrapJavaJNI.new_Geom_RectangularTrimmedSurface__SWIG_3( Geom_Surface.getCPtr(S) , S, Param1, Param2, UTrim, Sense), true);
  }

  public Geom_RectangularTrimmedSurface( Geom_Surface  S, double Param1, double Param2, long UTrim) {
    this(OCCwrapJavaJNI.new_Geom_RectangularTrimmedSurface__SWIG_4( Geom_Surface.getCPtr(S) , S, Param1, Param2, UTrim), true);
  }

  /**
   *  Modifies this patch by changing the trim values
   *  applied to the original surface
   *  The u parametric direction of
   *  this patch is oriented from U1 to U2. The v
   *  parametric direction of this patch is oriented
   *  from V1 to V2. USense and VSense are used
   *  for the construction only if the surface is periodic
   *  in the corresponding parametric direction, and
   *  define the available part of the surface; by default
   *  in this case, this patch has the same orientation
   *  as the basis surface.
   *  Raised if
   *  The BasisSurface is not periodic in the UDirection and U1 or U2
   *  are out of the bounds of the BasisSurface.
   *  The BasisSurface is not periodic in the VDirection and V1 or V2
   *  are out of the bounds of the BasisSurface.
   *  U1 = U2 or V1 = V2
   */
  public void SetTrim(double U1, double U2, double V1, double V2, long USense, long VSense) {
    OCCwrapJavaJNI.Geom_RectangularTrimmedSurface_SetTrim__SWIG_0(swigCPtr, this, U1, U2, V1, V2, USense, VSense);
  }

  /**
   *  Modifies this patch by changing the trim values
   *  applied to the original surface
   *  The basis surface is trimmed only in one parametric direction: if UTrim
   *  is true, the surface is trimmed in the u parametric
   *  direction; if it is false, it is trimmed in the v
   *  parametric direction. In the "trimmed" direction,
   *  this patch is oriented from Param1 to Param2. If
   *  the basis surface is periodic in the "trimmed"
   *  direction, Sense defines its available part. By
   *  default in this case, this patch has the same
   *  orientation as the basis surface in this parametric
   *  direction. If the basis surface is closed or periodic
   *  in the other parametric direction (i.e. not the
   *  "trimmed" direction), this patch has the same
   *  characteristics as the basis surface in that parametric direction.
   *  Raised if
   *  The BasisSurface is not periodic in the considered direction and
   *  Param1 or Param2 are out of the bounds of the BasisSurface.
   *  Param1 = Param2
   */
  public void SetTrim(double U1, double U2, double V1, double V2, long USense) {
    OCCwrapJavaJNI.Geom_RectangularTrimmedSurface_SetTrim__SWIG_1(swigCPtr, this, U1, U2, V1, V2, USense);
  }

  /**
   *  General set trim,  to implement constructors and
   *  others set trim.
   */
  public void SetTrim(double U1, double U2, double V1, double V2) {
    OCCwrapJavaJNI.Geom_RectangularTrimmedSurface_SetTrim__SWIG_2(swigCPtr, this, U1, U2, V1, V2);
  }

  public void SetTrim(double Param1, double Param2, long UTrim, long Sense) {
    OCCwrapJavaJNI.Geom_RectangularTrimmedSurface_SetTrim__SWIG_3(swigCPtr, this, Param1, Param2, UTrim, Sense);
  }

  public void SetTrim(double Param1, double Param2, long UTrim) {
    OCCwrapJavaJNI.Geom_RectangularTrimmedSurface_SetTrim__SWIG_4(swigCPtr, this, Param1, Param2, UTrim);
  }

  public  Geom_Surface  BasisSurface() {
    return new Geom_Surface ( OCCwrapJavaJNI.Geom_RectangularTrimmedSurface_BasisSurface(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_RectangularTrimmedSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_RectangularTrimmedSurface_get_type_descriptor(), true );
  }

  public static  Geom_RectangularTrimmedSurface  DownCast( Standard_Transient  T) {
    return new Geom_RectangularTrimmedSurface ( OCCwrapJavaJNI.Geom_RectangularTrimmedSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_RectangularTrimmedSurface_TypeOf(), true );
  }

}
