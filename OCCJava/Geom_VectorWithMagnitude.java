package opencascade;

/**
 *  Defines a vector with magnitude.
 *  A vector with magnitude can have a zero length.
 */
public class Geom_VectorWithMagnitude extends Geom_Vector {
  Geom_VectorWithMagnitude(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a transient copy of V.
   */
  public Geom_VectorWithMagnitude( gp_Vec  V) {
    this(OCCwrapJavaJNI.new_Geom_VectorWithMagnitude__SWIG_0(gp_Vec.getCPtr(V), V), true);
  }

  /**
   *  Creates a vector with three cartesian coordinates.
   */
  public Geom_VectorWithMagnitude(double X, double Y, double Z) {
    this(OCCwrapJavaJNI.new_Geom_VectorWithMagnitude__SWIG_1(X, Y, Z), true);
  }

  /**
   *  Creates a vector from the point P1 to the point P2.
   *  The magnitude of the vector is the distance between P1 and P2
   */
  public Geom_VectorWithMagnitude( gp_Pnt  P1,  gp_Pnt  P2) {
    this(OCCwrapJavaJNI.new_Geom_VectorWithMagnitude__SWIG_2(gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

  /**
   *  Assigns the values X, Y and Z to the coordinates of this vector.
   */
  public void SetCoord(double X, double Y, double Z) {
    OCCwrapJavaJNI.Geom_VectorWithMagnitude_SetCoord(swigCPtr, this, X, Y, Z);
  }

  /**
   *  Converts the gp_Vec vector V into this vector.
   */
  public void SetVec( gp_Vec  V) {
    OCCwrapJavaJNI.Geom_VectorWithMagnitude_SetVec(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Changes the X coordinate of <me>.
   */
  public void SetX(double X) {
    OCCwrapJavaJNI.Geom_VectorWithMagnitude_SetX(swigCPtr, this, X);
  }

  /**
   *  Changes the Y coordinate of <me>
   */
  public void SetY(double Y) {
    OCCwrapJavaJNI.Geom_VectorWithMagnitude_SetY(swigCPtr, this, Y);
  }

  /**
   *  Changes the Z coordinate of <me>.
   */
  public void SetZ(double Z) {
    OCCwrapJavaJNI.Geom_VectorWithMagnitude_SetZ(swigCPtr, this, Z);
  }

  /**
   *  Adds the Vector Other to <me>.
   */
  public void Add( Geom_Vector  Other) {
    OCCwrapJavaJNI.Geom_VectorWithMagnitude_Add(swigCPtr, this,  Geom_Vector.getCPtr(Other) , Other);
  }

  public  Geom_VectorWithMagnitude  Added( Geom_Vector  Other) {
    return new Geom_VectorWithMagnitude ( OCCwrapJavaJNI.Geom_VectorWithMagnitude_Added(swigCPtr, this,  Geom_Vector.getCPtr(Other) , Other), true );
  }

  /**
   *  Divides <me> by a scalar.
   */
  public void Divide(double Scalar) {
    OCCwrapJavaJNI.Geom_VectorWithMagnitude_Divide(swigCPtr, this, Scalar);
  }

  public  Geom_VectorWithMagnitude  Divided(double Scalar) {
    return new Geom_VectorWithMagnitude ( OCCwrapJavaJNI.Geom_VectorWithMagnitude_Divided(swigCPtr, this, Scalar), true );
  }

  public  Geom_VectorWithMagnitude  Multiplied(double Scalar) {
    return new Geom_VectorWithMagnitude ( OCCwrapJavaJNI.Geom_VectorWithMagnitude_Multiplied(swigCPtr, this, Scalar), true );
  }

  /**
   *  Computes the product of the vector <me> by a scalar.
   */
  public void Multiply(double Scalar) {
    OCCwrapJavaJNI.Geom_VectorWithMagnitude_Multiply(swigCPtr, this, Scalar);
  }

  /**
   *  Normalizes <me>.
   * 
   *  Raised if the magnitude of the vector is lower or equal to
   *  Resolution from package gp.
   */
  public void Normalize() {
    OCCwrapJavaJNI.Geom_VectorWithMagnitude_Normalize(swigCPtr, this);
  }

  public  Geom_VectorWithMagnitude  Normalized() {
    return new Geom_VectorWithMagnitude ( OCCwrapJavaJNI.Geom_VectorWithMagnitude_Normalized(swigCPtr, this), true );
  }

  /**
   *  Subtracts the Vector Other to <me>.
   */
  public void Subtract( Geom_Vector  Other) {
    OCCwrapJavaJNI.Geom_VectorWithMagnitude_Subtract(swigCPtr, this,  Geom_Vector.getCPtr(Other) , Other);
  }

  public  Geom_VectorWithMagnitude  Subtracted( Geom_Vector  Other) {
    return new Geom_VectorWithMagnitude ( OCCwrapJavaJNI.Geom_VectorWithMagnitude_Subtracted(swigCPtr, this,  Geom_Vector.getCPtr(Other) , Other), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_VectorWithMagnitude_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_VectorWithMagnitude_get_type_descriptor(), true );
  }

  public static  Geom_VectorWithMagnitude  DownCast( Standard_Transient  T) {
    return new Geom_VectorWithMagnitude ( OCCwrapJavaJNI.Geom_VectorWithMagnitude_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_VectorWithMagnitude_TypeOf(), true );
  }

}
