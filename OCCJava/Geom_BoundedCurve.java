package opencascade;

/**
 *  The abstract class BoundedCurve describes the
 *  common behavior of bounded curves in 3D space. A
 *  bounded curve is limited by two finite values of the
 *  parameter, termed respectively "first parameter" and
 *  "last parameter". The "first parameter" gives the "start
 *  point" of the bounded curve, and the "last parameter"
 *  gives the "end point" of the bounded curve.
 *  The length of a bounded curve is finite.
 *  The Geom package provides three concrete classes of bounded curves:
 *  - two frequently used mathematical formulations of complex curves:
 *  - Geom_BezierCurve,
 *  - Geom_BSplineCurve, and
 *  - Geom_TrimmedCurve to trim a curve, i.e. to only
 *  take part of the curve limited by two values of the
 *  parameter of the basis curve.
 */
public class Geom_BoundedCurve extends Geom_Curve {
  Geom_BoundedCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns the end point of the curve.
   */
  public gp_Pnt EndPoint() {
    return new gp_Pnt(OCCwrapJavaJNI.Geom_BoundedCurve_EndPoint(swigCPtr, this), true);
  }

  /**
   *  Returns the start point of the curve.
   */
  public gp_Pnt StartPoint() {
    return new gp_Pnt(OCCwrapJavaJNI.Geom_BoundedCurve_StartPoint(swigCPtr, this), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_BoundedCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_BoundedCurve_get_type_descriptor(), true );
  }

  public static  Geom_BoundedCurve  DownCast( Standard_Transient  T) {
    return new Geom_BoundedCurve ( OCCwrapJavaJNI.Geom_BoundedCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_BoundedCurve_TypeOf(), true );
  }

}
