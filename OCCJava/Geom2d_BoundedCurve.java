package opencascade;

/**
 *  The abstract class BoundedCurve describes the
 *  common behavior of bounded curves in 2D space. A
 *  bounded curve is limited by two finite values of the
 *  parameter, termed respectively "first parameter" and
 *  "last parameter". The "first parameter" gives the "start
 *  point" of the bounded curve, and the "last parameter"
 *  gives the "end point" of the bounded curve.
 *  The length of a bounded curve is finite.
 *  The Geom2d package provides three concrete
 *  classes of bounded curves:
 *  - two frequently used mathematical formulations of complex curves:
 *  - Geom2d_BezierCurve,
 *  - Geom2d_BSplineCurve, and
 *  - Geom2d_TrimmedCurve to trim a curve, i.e. to
 *  only take part of the curve limited by two values of
 *  the parameter of the basis curve.
 */
public class Geom2d_BoundedCurve extends Geom2d_Curve {
  Geom2d_BoundedCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns the end point of the curve.
   *  The end point is the value of the curve for the
   *  "LastParameter" of the curve.
   */
  public gp_Pnt2d EndPoint() {
    return new gp_Pnt2d(OCCwrapJavaJNI.Geom2d_BoundedCurve_EndPoint(swigCPtr, this), true);
  }

  /**
   *  Returns the start point of the curve.
   *  The start point is the value of the curve for the
   *  "FirstParameter" of the curve.
   */
  public gp_Pnt2d StartPoint() {
    return new gp_Pnt2d(OCCwrapJavaJNI.Geom2d_BoundedCurve_StartPoint(swigCPtr, this), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom2d_BoundedCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_BoundedCurve_get_type_descriptor(), true );
  }

  public static  Geom2d_BoundedCurve  DownCast( Standard_Transient  T) {
    return new Geom2d_BoundedCurve ( OCCwrapJavaJNI.Geom2d_BoundedCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_BoundedCurve_TypeOf(), true );
  }

}
