package opencascade;

/**
 *  The class Direction specifies a vector that is never null.
 *  It is a unit vector.
 */
public class Geom2d_Direction extends Geom2d_Vector {
  Geom2d_Direction(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a unit vector with it 2 cartesian coordinates.
   * 
   *  Raised if Sqrt( X*X + Y*Y) <= Resolution from gp.
   */
  public Geom2d_Direction(double X, double Y) {
    this(OCCwrapJavaJNI.new_Geom2d_Direction__SWIG_0(X, Y), true);
  }

  /**
   *  Creates a persistent copy of <me>.
   */
  public Geom2d_Direction( gp_Dir2d  V) {
    this(OCCwrapJavaJNI.new_Geom2d_Direction__SWIG_1(gp_Dir2d.getCPtr(V), V), true);
  }

  /**
   *  Assigns the coordinates X and Y to this unit vector,
   *  then normalizes it.
   *  Exceptions
   *  Standard_ConstructionError if Sqrt(X*X +
   *  Y*Y) is less than or equal to gp::Resolution().
   */
  public void SetCoord(double X, double Y) {
    OCCwrapJavaJNI.Geom2d_Direction_SetCoord(swigCPtr, this, X, Y);
  }

  /**
   *  Converts the gp_Dir2d unit vector V into this unit vector.
   */
  public void SetDir2d( gp_Dir2d  V) {
    OCCwrapJavaJNI.Geom2d_Direction_SetDir2d(swigCPtr, this, gp_Dir2d.getCPtr(V), V);
  }

  /**
   *  Assigns a value to the X coordinate of this unit vector, then normalizes it.
   *  Exceptions
   *  Standard_ConstructionError if the value assigned
   *  causes the magnitude of the vector to become less
   *  than or equal to gp::Resolution().
   */
  public void SetX(double X) {
    OCCwrapJavaJNI.Geom2d_Direction_SetX(swigCPtr, this, X);
  }

  /**
   *  Assigns a value to the Y coordinate of this unit vector, then normalizes it.
   *  Exceptions
   *  Standard_ConstructionError if the value assigned
   *  causes the magnitude of the vector to become less
   *  than or equal to gp::Resolution().
   */
  public void SetY(double Y) {
    OCCwrapJavaJNI.Geom2d_Direction_SetY(swigCPtr, this, Y);
  }

  /**
   *  Converts this unit vector into a gp_Dir2d unit vector.
   */
  public gp_Dir2d Dir2d() {
    return new gp_Dir2d(OCCwrapJavaJNI.Geom2d_Direction_Dir2d(swigCPtr, this), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom2d_Direction_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Direction_get_type_descriptor(), true );
  }

  public static  Geom2d_Direction  DownCast( Standard_Transient  T) {
    return new Geom2d_Direction ( OCCwrapJavaJNI.Geom2d_Direction_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Direction_TypeOf(), true );
  }

}
