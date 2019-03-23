package opencascade;

/**
 *  Defines a vector with magnitude.
 *  A vector with magnitude can have a zero length.
 */
public class Geom2d_VectorWithMagnitude extends Geom2d_Vector {
  Geom2d_VectorWithMagnitude(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a persistent copy of V.
   */
  public Geom2d_VectorWithMagnitude( gp_Vec2d  V) {
    this(OCCwrapJavaJNI.new_Geom2d_VectorWithMagnitude__SWIG_0(gp_Vec2d.getCPtr(V), V), true);
  }

  /**
   *  Creates a vector with two cartesian coordinates.
   */
  public Geom2d_VectorWithMagnitude(double X, double Y) {
    this(OCCwrapJavaJNI.new_Geom2d_VectorWithMagnitude__SWIG_1(X, Y), true);
  }

  /**
   *  Creates a vector from the point P1 to the point P2.
   *  The magnitude of the vector is the distance between P1 and P2
   */
  public Geom2d_VectorWithMagnitude( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    this(OCCwrapJavaJNI.new_Geom2d_VectorWithMagnitude__SWIG_2(gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2), true);
  }

  /**
   *  Set <me> to X, Y coordinates.
   */
  public void SetCoord(double X, double Y) {
    OCCwrapJavaJNI.Geom2d_VectorWithMagnitude_SetCoord(swigCPtr, this, X, Y);
  }

  public void SetVec2d( gp_Vec2d  V) {
    OCCwrapJavaJNI.Geom2d_VectorWithMagnitude_SetVec2d(swigCPtr, this, gp_Vec2d.getCPtr(V), V);
  }

  /**
   *  Changes the X coordinate of <me>.
   */
  public void SetX(double X) {
    OCCwrapJavaJNI.Geom2d_VectorWithMagnitude_SetX(swigCPtr, this, X);
  }

  /**
   *  Changes the Y coordinate of <me>
   */
  public void SetY(double Y) {
    OCCwrapJavaJNI.Geom2d_VectorWithMagnitude_SetY(swigCPtr, this, Y);
  }

  /**
   *  Adds the Vector Other to <me>.
   */
  public void Add( Geom2d_Vector  Other) {
    OCCwrapJavaJNI.Geom2d_VectorWithMagnitude_Add(swigCPtr, this,  Geom2d_Vector.getCPtr(Other) , Other);
  }

  public  Geom2d_VectorWithMagnitude  Added( Geom2d_Vector  Other) {
    return new Geom2d_VectorWithMagnitude ( OCCwrapJavaJNI.Geom2d_VectorWithMagnitude_Added(swigCPtr, this,  Geom2d_Vector.getCPtr(Other) , Other), true );
  }

  /**
   *  Divides <me> by a scalar.
   */
  public void Divide(double Scalar) {
    OCCwrapJavaJNI.Geom2d_VectorWithMagnitude_Divide(swigCPtr, this, Scalar);
  }

  public  Geom2d_VectorWithMagnitude  Divided(double Scalar) {
    return new Geom2d_VectorWithMagnitude ( OCCwrapJavaJNI.Geom2d_VectorWithMagnitude_Divided(swigCPtr, this, Scalar), true );
  }

  public  Geom2d_VectorWithMagnitude  Multiplied(double Scalar) {
    return new Geom2d_VectorWithMagnitude ( OCCwrapJavaJNI.Geom2d_VectorWithMagnitude_Multiplied(swigCPtr, this, Scalar), true );
  }

  /**
   *  Computes the product of the vector <me> by a scalar.
   */
  public void Multiply(double Scalar) {
    OCCwrapJavaJNI.Geom2d_VectorWithMagnitude_Multiply(swigCPtr, this, Scalar);
  }

  /**
   *  Normalizes <me>.
   * 
   *  Raised if the magnitude of the vector is lower or equal to
   *  Resolution from package gp.
   */
  public void Normalize() {
    OCCwrapJavaJNI.Geom2d_VectorWithMagnitude_Normalize(swigCPtr, this);
  }

  public  Geom2d_VectorWithMagnitude  Normalized() {
    return new Geom2d_VectorWithMagnitude ( OCCwrapJavaJNI.Geom2d_VectorWithMagnitude_Normalized(swigCPtr, this), true );
  }

  /**
   *  Subtracts the Vector Other to <me>.
   */
  public void Subtract( Geom2d_Vector  Other) {
    OCCwrapJavaJNI.Geom2d_VectorWithMagnitude_Subtract(swigCPtr, this,  Geom2d_Vector.getCPtr(Other) , Other);
  }

  public  Geom2d_VectorWithMagnitude  Subtracted( Geom2d_Vector  Other) {
    return new Geom2d_VectorWithMagnitude ( OCCwrapJavaJNI.Geom2d_VectorWithMagnitude_Subtracted(swigCPtr, this,  Geom2d_Vector.getCPtr(Other) , Other), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom2d_VectorWithMagnitude_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_VectorWithMagnitude_get_type_descriptor(), true );
  }

  public static  Geom2d_VectorWithMagnitude  DownCast( Standard_Transient  T) {
    return new Geom2d_VectorWithMagnitude ( OCCwrapJavaJNI.Geom2d_VectorWithMagnitude_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_VectorWithMagnitude_TypeOf(), true );
  }

}
