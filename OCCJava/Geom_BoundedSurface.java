package opencascade;

/**
 *  The root class for bounded surfaces in 3D space. A
 *  bounded surface is defined by a rectangle in its 2D parametric space, i.e.
 *  - its u parameter, which ranges between two finite
 *  values u0 and u1, referred to as "First u
 *  parameter" and "Last u parameter" respectively, and
 *  - its v parameter, which ranges between two finite
 *  values v0 and v1, referred to as "First v
 *  parameter" and the "Last v parameter" respectively.
 *  The surface is limited by four curves which are the
 *  boundaries of the surface:
 *  - its u0 and u1 isoparametric curves in the u parametric direction, and
 *  - its v0 and v1 isoparametric curves in the v parametric direction.
 *  A bounded surface is finite.
 *  The common behavior of all bounded surfaces is
 *  described by the Geom_Surface class.
 *  The Geom package provides three concrete
 *  implementations of bounded surfaces:
 *  - Geom_BezierSurface,
 *  - Geom_BSplineSurface, and
 *  - Geom_RectangularTrimmedSurface.
 *  The first two of these implement well known
 *  mathematical definitions of complex surfaces, the third
 *  trims a surface using four isoparametric curves, i.e. it
 *  limits the variation of its parameters to a rectangle in
 *  2D parametric space.
 */
public class Geom_BoundedSurface extends Geom_Surface {
  Geom_BoundedSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_BoundedSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_BoundedSurface_get_type_descriptor(), true );
  }

  public static  Geom_BoundedSurface  DownCast( Standard_Transient  T) {
    return new Geom_BoundedSurface ( OCCwrapJavaJNI.Geom_BoundedSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_BoundedSurface_TypeOf(), true );
  }

}
