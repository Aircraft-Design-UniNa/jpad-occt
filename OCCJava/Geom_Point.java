package opencascade;

/**
 *  The abstract class Point describes the common
 *  behavior of geometric points in 3D space.
 *  The Geom package also provides the concrete class
 *  Geom_CartesianPoint.
 */
public class Geom_Point extends Geom_Geometry {
  Geom_Point(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  returns the Coordinates of <me>.
   */
  public void Coord(double[] X, double[] Y, double[] Z) {
    OCCwrapJavaJNI.Geom_Point_Coord(swigCPtr, this, X, Y, Z);
  }

  /**
   *  returns a non transient copy of <me>
   */
  public gp_Pnt Pnt() {
    return new gp_Pnt(OCCwrapJavaJNI.Geom_Point_Pnt(swigCPtr, this), true);
  }

  /**
   *  returns the X coordinate of <me>.
   */
  public double X() {
    return OCCwrapJavaJNI.Geom_Point_X(swigCPtr, this);
  }

  /**
   *  returns  the Y coordinate of <me>.
   */
  public double Y() {
    return OCCwrapJavaJNI.Geom_Point_Y(swigCPtr, this);
  }

  /**
   *  returns the Z coordinate of <me>.
   */
  public double Z() {
    return OCCwrapJavaJNI.Geom_Point_Z(swigCPtr, this);
  }

  /**
   *  Computes the distance between <me> and <Other>.
   */
  public double Distance( Geom_Point  Other) {
    return OCCwrapJavaJNI.Geom_Point_Distance(swigCPtr, this,  Geom_Point.getCPtr(Other) , Other);
  }

  /**
   *  Computes the square distance between <me> and <Other>.
   */
  public double SquareDistance( Geom_Point  Other) {
    return OCCwrapJavaJNI.Geom_Point_SquareDistance(swigCPtr, this,  Geom_Point.getCPtr(Other) , Other);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_Point_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Point_get_type_descriptor(), true );
  }

  public static  Geom_Point  DownCast( Standard_Transient  T) {
    return new Geom_Point ( OCCwrapJavaJNI.Geom_Point_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Point_TypeOf(), true );
  }

}
