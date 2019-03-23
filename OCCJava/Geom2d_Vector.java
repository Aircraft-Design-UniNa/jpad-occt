package opencascade;

/**
 *  The abstract class Vector describes the common
 *  behavior of vectors in 2D space.
 *  The Geom2d package provides two concrete
 *  classes of vectors: Geom2d_Direction (unit vector)
 *  and Geom2d_VectorWithMagnitude.
 */
public class Geom2d_Vector extends Geom2d_Geometry {
  Geom2d_Vector(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Reverses the vector <me>.
   */
  public void Reverse() {
    OCCwrapJavaJNI.Geom2d_Vector_Reverse(swigCPtr, this);
  }

  public  Geom2d_Vector  Reversed() {
    return new Geom2d_Vector ( OCCwrapJavaJNI.Geom2d_Vector_Reversed(swigCPtr, this), true );
  }

  /**
   *  Computes the angular value, in radians, between this
   *  vector and vector Other. The result is a value
   *  between -Pi and Pi. The orientation is from this
   *  vector to vector Other.
   *  Raises VectorWithNullMagnitude if one of the two vectors is a vector with
   *  null magnitude because the angular value is indefinite.
   */
  public double Angle( Geom2d_Vector  Other) {
    return OCCwrapJavaJNI.Geom2d_Vector_Angle(swigCPtr, this,  Geom2d_Vector.getCPtr(Other) , Other);
  }

  /**
   *  Returns the coordinates of <me>.
   */
  public void Coord(double[] X, double[] Y) {
    OCCwrapJavaJNI.Geom2d_Vector_Coord(swigCPtr, this, X, Y);
  }

  /**
   *  Returns the  Magnitude of <me>.
   */
  public double Magnitude() {
    return OCCwrapJavaJNI.Geom2d_Vector_Magnitude(swigCPtr, this);
  }

  /**
   *  Returns the square magnitude of <me>.
   */
  public double SquareMagnitude() {
    return OCCwrapJavaJNI.Geom2d_Vector_SquareMagnitude(swigCPtr, this);
  }

  /**
   *  Returns the X coordinate of <me>.
   */
  public double X() {
    return OCCwrapJavaJNI.Geom2d_Vector_X(swigCPtr, this);
  }

  /**
   *  Returns the Y coordinate of <me>.
   */
  public double Y() {
    return OCCwrapJavaJNI.Geom2d_Vector_Y(swigCPtr, this);
  }

  /**
   *  Cross product of <me> with the vector <Other>.
   */
  public double Crossed( Geom2d_Vector  Other) {
    return OCCwrapJavaJNI.Geom2d_Vector_Crossed(swigCPtr, this,  Geom2d_Vector.getCPtr(Other) , Other);
  }

  /**
   *  Returns the scalar product of 2 Vectors.
   */
  public double Dot( Geom2d_Vector  Other) {
    return OCCwrapJavaJNI.Geom2d_Vector_Dot(swigCPtr, this,  Geom2d_Vector.getCPtr(Other) , Other);
  }

  /**
   *  Returns a non persistent copy of <me>.
   */
  public gp_Vec2d Vec2d() {
    return new gp_Vec2d(OCCwrapJavaJNI.Geom2d_Vector_Vec2d(swigCPtr, this), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom2d_Vector_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Vector_get_type_descriptor(), true );
  }

  public static  Geom2d_Vector  DownCast( Standard_Transient  T) {
    return new Geom2d_Vector ( OCCwrapJavaJNI.Geom2d_Vector_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Vector_TypeOf(), true );
  }

}
