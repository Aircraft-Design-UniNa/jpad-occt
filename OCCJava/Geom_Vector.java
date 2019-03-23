package opencascade;

/**
 *  The abstract class Vector describes the common
 *  behavior of vectors in 3D space.
 *  The Geom package provides two concrete classes of
 *  vectors: Geom_Direction (unit vector) and Geom_VectorWithMagnitude.
 */
public class Geom_Vector extends Geom_Geometry {
  Geom_Vector(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Reverses the vector <me>.
   */
  public void Reverse() {
    OCCwrapJavaJNI.Geom_Vector_Reverse(swigCPtr, this);
  }

  public  Geom_Vector  Reversed() {
    return new Geom_Vector ( OCCwrapJavaJNI.Geom_Vector_Reversed(swigCPtr, this), true );
  }

  /**
   *  Computes the angular value, in radians, between this
   *  vector and vector Other. The result is a value between 0 and Pi.
   *  Exceptions
   *  gp_VectorWithNullMagnitude if:
   *  - the magnitude of this vector is less than or equal to
   *  gp::Resolution(), or
   *  - the magnitude of vector Other is less than or equal
   *  to gp::Resolution().
   */
  public double Angle( Geom_Vector  Other) {
    return OCCwrapJavaJNI.Geom_Vector_Angle(swigCPtr, this,  Geom_Vector.getCPtr(Other) , Other);
  }

  /**
   *  Computes the angular value, in radians, between this
   *  vector and vector Other. The result is a value
   *  between -Pi and Pi. The vector VRef defines the
   *  positive sense of rotation: the angular value is positive
   *  if the cross product this ^ Other has the same
   *  orientation as VRef (in relation to the plane defined
   *  by this vector and vector Other). Otherwise, it is negative.
   *  Exceptions
   *  Standard_DomainError if this vector, vector Other
   *  and vector VRef are coplanar, except if this vector
   *  and vector Other are parallel.
   *  gp_VectorWithNullMagnitude if the magnitude of
   *  this vector, vector Other or vector VRef is less than
   *  or equal to gp::Resolution().
   */
  public double AngleWithRef( Geom_Vector  Other,  Geom_Vector  VRef) {
    return OCCwrapJavaJNI.Geom_Vector_AngleWithRef(swigCPtr, this,  Geom_Vector.getCPtr(Other) , Other,  Geom_Vector.getCPtr(VRef) , VRef);
  }

  /**
   *  Returns the coordinates X, Y and Z of this vector.
   */
  public void Coord(double[] X, double[] Y, double[] Z) {
    OCCwrapJavaJNI.Geom_Vector_Coord(swigCPtr, this, X, Y, Z);
  }

  /**
   *  Returns the  Magnitude of <me>.
   */
  public double Magnitude() {
    return OCCwrapJavaJNI.Geom_Vector_Magnitude(swigCPtr, this);
  }

  /**
   *  Returns the square magnitude of <me>.
   */
  public double SquareMagnitude() {
    return OCCwrapJavaJNI.Geom_Vector_SquareMagnitude(swigCPtr, this);
  }

  /**
   *  Returns the X coordinate of <me>.
   */
  public double X() {
    return OCCwrapJavaJNI.Geom_Vector_X(swigCPtr, this);
  }

  /**
   *  Returns the Y coordinate of <me>.
   */
  public double Y() {
    return OCCwrapJavaJNI.Geom_Vector_Y(swigCPtr, this);
  }

  /**
   *  Returns the Z coordinate of <me>.
   */
  public double Z() {
    return OCCwrapJavaJNI.Geom_Vector_Z(swigCPtr, this);
  }

  /**
   *  Computes the cross product between <me> and <Other>.
   * 
   *  Raised if <me> is a "Direction" and if <me> and <Other>
   *  are parallel because it is not possible to build a
   *  "Direction" with null length.
   */
  public void Cross( Geom_Vector  Other) {
    OCCwrapJavaJNI.Geom_Vector_Cross(swigCPtr, this,  Geom_Vector.getCPtr(Other) , Other);
  }

  public  Geom_Vector  Crossed( Geom_Vector  Other) {
    return new Geom_Vector ( OCCwrapJavaJNI.Geom_Vector_Crossed(swigCPtr, this,  Geom_Vector.getCPtr(Other) , Other), true );
  }

  /**
   *  Computes the triple vector product  <me> ^(V1 ^ V2).
   * 
   *  Raised if <me> is a "Direction" and if V1 and V2 are parallel
   *  or <me> and (V1 ^ V2) are  parallel
   */
  public void CrossCross( Geom_Vector  V1,  Geom_Vector  V2) {
    OCCwrapJavaJNI.Geom_Vector_CrossCross(swigCPtr, this,  Geom_Vector.getCPtr(V1) , V1,  Geom_Vector.getCPtr(V2) , V2);
  }

  public  Geom_Vector  CrossCrossed( Geom_Vector  V1,  Geom_Vector  V2) {
    return new Geom_Vector ( OCCwrapJavaJNI.Geom_Vector_CrossCrossed(swigCPtr, this,  Geom_Vector.getCPtr(V1) , V1,  Geom_Vector.getCPtr(V2) , V2), true );
  }

  /**
   *  Computes the scalar product of this vector and vector Other.
   */
  public double Dot( Geom_Vector  Other) {
    return OCCwrapJavaJNI.Geom_Vector_Dot(swigCPtr, this,  Geom_Vector.getCPtr(Other) , Other);
  }

  /**
   *  Computes the triple scalar product. Returns me . (V1 ^ V2)
   */
  public double DotCross( Geom_Vector  V1,  Geom_Vector  V2) {
    return OCCwrapJavaJNI.Geom_Vector_DotCross(swigCPtr, this,  Geom_Vector.getCPtr(V1) , V1,  Geom_Vector.getCPtr(V2) , V2);
  }

  /**
   *  Converts this vector into a gp_Vec vector.
   */
  public  gp_Vec  Vec() {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.Geom_Vector_Vec(swigCPtr, this), true);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_Vector_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Vector_get_type_descriptor(), true );
  }

  public static  Geom_Vector  DownCast( Standard_Transient  T) {
    return new Geom_Vector ( OCCwrapJavaJNI.Geom_Vector_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Vector_TypeOf(), true );
  }

}
