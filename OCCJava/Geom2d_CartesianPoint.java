package opencascade;

/**
 *  Describes a point in 2D space. A
 *  Geom2d_CartesianPoint is defined by a gp_Pnt2d
 *  point, with its two Cartesian coordinates X and Y.
 */
public class Geom2d_CartesianPoint extends Geom2d_Point {
  Geom2d_CartesianPoint(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a persistent copy of P.
   */
  public Geom2d_CartesianPoint( gp_Pnt2d  P) {
    this(OCCwrapJavaJNI.new_Geom2d_CartesianPoint__SWIG_0(gp_Pnt2d.getCPtr(P), P), true);
  }

  public Geom2d_CartesianPoint(double X, double Y) {
    this(OCCwrapJavaJNI.new_Geom2d_CartesianPoint__SWIG_1(X, Y), true);
  }

  /**
   *  Set <me> to X, Y coordinates.
   */
  public void SetCoord(double X, double Y) {
    OCCwrapJavaJNI.Geom2d_CartesianPoint_SetCoord(swigCPtr, this, X, Y);
  }

  /**
   *  Set <me> to P.X(), P.Y() coordinates.
   */
  public void SetPnt2d( gp_Pnt2d  P) {
    OCCwrapJavaJNI.Geom2d_CartesianPoint_SetPnt2d(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Changes the X coordinate of me.
   */
  public void SetX(double X) {
    OCCwrapJavaJNI.Geom2d_CartesianPoint_SetX(swigCPtr, this, X);
  }

  /**
   *  Changes the Y coordinate of me.
   */
  public void SetY(double Y) {
    OCCwrapJavaJNI.Geom2d_CartesianPoint_SetY(swigCPtr, this, Y);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom2d_CartesianPoint_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_CartesianPoint_get_type_descriptor(), true );
  }

  public static  Geom2d_CartesianPoint  DownCast( Standard_Transient  T) {
    return new Geom2d_CartesianPoint ( OCCwrapJavaJNI.Geom2d_CartesianPoint_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_CartesianPoint_TypeOf(), true );
  }

}
