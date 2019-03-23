package opencascade;

/**
 *  The abstract class Point describes the common
 *  behavior of geometric points in 2D space.
 *  The Geom2d package also provides the concrete
 *  class Geom2d_CartesianPoint.
 */
public class Geom2d_Point extends Geom2d_Geometry {
  Geom2d_Point(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  returns the Coordinates of <me>.
   */
  public void Coord(double[] X, double[] Y) {
    OCCwrapJavaJNI.Geom2d_Point_Coord(swigCPtr, this, X, Y);
  }

  /**
   *  returns a non persistent copy of <me>
   */
  public gp_Pnt2d Pnt2d() {
    return new gp_Pnt2d(OCCwrapJavaJNI.Geom2d_Point_Pnt2d(swigCPtr, this), true);
  }

  /**
   *  returns the X coordinate of <me>.
   */
  public double X() {
    return OCCwrapJavaJNI.Geom2d_Point_X(swigCPtr, this);
  }

  /**
   *  returns  the Y coordinate of <me>.
   */
  public double Y() {
    return OCCwrapJavaJNI.Geom2d_Point_Y(swigCPtr, this);
  }

  /**
   *  computes the distance between <me> and <Other>.
   */
  public double Distance( Geom2d_Point  Other) {
    return OCCwrapJavaJNI.Geom2d_Point_Distance(swigCPtr, this,  Geom2d_Point.getCPtr(Other) , Other);
  }

  /**
   *  computes the square distance between <me> and <Other>.
   */
  public double SquareDistance( Geom2d_Point  Other) {
    return OCCwrapJavaJNI.Geom2d_Point_SquareDistance(swigCPtr, this,  Geom2d_Point.getCPtr(Other) , Other);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom2d_Point_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Point_get_type_descriptor(), true );
  }

  public static  Geom2d_Point  DownCast( Standard_Transient  T) {
    return new Geom2d_Point ( OCCwrapJavaJNI.Geom2d_Point_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Point_TypeOf(), true );
  }

}
