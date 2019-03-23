package opencascade;

/**
 *  Defines a non-persistent vector in 3D space.
 */
public class gp_Vec {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Vec(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Vec(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Vec obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Vec ptr) { Ptr = ptr; }
    public gp_Vec AsReference () { return Ptr; }
    public gp_Vec AsCopy () { return Ptr.MakeCopy(); }
    public gp_Vec Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Vec(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a zero vector.
   */
  public gp_Vec() {
    this(OCCwrapJavaJNI.new_gp_Vec__SWIG_0(), true);
  }

  /**
   *  Creates a unitary vector from a direction V.
   */
  public gp_Vec(gp_Dir V) {
    this(OCCwrapJavaJNI.new_gp_Vec__SWIG_1(gp_Dir.getCPtr(V), V), true);
  }

  /**
   *  Creates a vector with a triplet of coordinates.
   */
  public gp_Vec( gp_XYZ  Coord) {
    this(OCCwrapJavaJNI.new_gp_Vec__SWIG_2(gp_XYZ.getCPtr(Coord), Coord), true);
  }

  /**
   *  Creates a point with its three cartesian coordinates.
   */
  public gp_Vec(double Xv, double Yv, double Zv) {
    this(OCCwrapJavaJNI.new_gp_Vec__SWIG_3(Xv, Yv, Zv), true);
  }

  /**
   *  Creates a vector from two points. The length of the vector
   *  is the distance between P1 and P2
   */
  public gp_Vec( gp_Pnt  P1,  gp_Pnt  P2) {
    this(OCCwrapJavaJNI.new_gp_Vec__SWIG_4(gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

  /**
   *  Changes the coordinate of range Index
   *  Index = 1 => X is modified
   *  Index = 2 => Y is modified
   *  Index = 3 => Z is modified
   *  Raised if Index != {1, 2, 3}.
   */
  public void SetCoord(int Index, double Xi) {
    OCCwrapJavaJNI.gp_Vec_SetCoord__SWIG_0(swigCPtr, this, Index, Xi);
  }

  /**
   *  For this vector, assigns
   *  -   the values Xv, Yv and Zv to its three coordinates.
   */
  public void SetCoord(double Xv, double Yv, double Zv) {
    OCCwrapJavaJNI.gp_Vec_SetCoord__SWIG_1(swigCPtr, this, Xv, Yv, Zv);
  }

  /**
   *  Assigns the given value to the X coordinate of this vector.
   */
  public void SetX(double X) {
    OCCwrapJavaJNI.gp_Vec_SetX(swigCPtr, this, X);
  }

  /**
   *  Assigns the given value to the X coordinate of this vector.
   */
  public void SetY(double Y) {
    OCCwrapJavaJNI.gp_Vec_SetY(swigCPtr, this, Y);
  }

  /**
   *  Assigns the given value to the X coordinate of this vector.
   */
  public void SetZ(double Z) {
    OCCwrapJavaJNI.gp_Vec_SetZ(swigCPtr, this, Z);
  }

  /**
   *  Assigns the three coordinates of Coord to this vector.
   */
  public void SetXYZ( gp_XYZ  Coord) {
    OCCwrapJavaJNI.gp_Vec_SetXYZ(swigCPtr, this, gp_XYZ.getCPtr(Coord), Coord);
  }

  /**
   *  Returns the coordinate of range Index :
   *  Index = 1 => X is returned
   *  Index = 2 => Y is returned
   *  Index = 3 => Z is returned
   *  Raised if Index != {1, 2, 3}.
   */
  public double Coord(int Index) {
    return OCCwrapJavaJNI.gp_Vec_Coord__SWIG_0(swigCPtr, this, Index);
  }

  /**
   *  For this vector returns its three coordinates Xv, Yv, and Zvinline
   */
  public void Coord(double[] Xv, double[] Yv, double[] Zv) {
    OCCwrapJavaJNI.gp_Vec_Coord__SWIG_1(swigCPtr, this, Xv, Yv, Zv);
  }

  /**
   *  For this vector, returns its X coordinate.
   */
  public double X() {
    return OCCwrapJavaJNI.gp_Vec_X(swigCPtr, this);
  }

  /**
   *  For this vector, returns its Y coordinate.
   */
  public double Y() {
    return OCCwrapJavaJNI.gp_Vec_Y(swigCPtr, this);
  }

  /**
   *  For this vector, returns its Z  coordinate.
   */
  public double Z() {
    return OCCwrapJavaJNI.gp_Vec_Z(swigCPtr, this);
  }

  /**
   *  For this vector, returns
   *  -   its three coordinates as a number triple
   */
  public  gp_XYZ  XYZ() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.gp_Vec_XYZ(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns True if the two vectors have the same magnitude value
   *  and the same direction. The precision values are LinearTolerance
   *  for the magnitude and AngularTolerance for the direction.
   */
  public long IsEqual( gp_Vec  Other, double LinearTolerance, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Vec_IsEqual(swigCPtr, this, gp_Vec.getCPtr(Other), Other, LinearTolerance, AngularTolerance);
  }

  /**
   *  Returns True if abs(<me>.Angle(Other) - PI/2.) <= AngularTolerance
   *  Raises VectorWithNullMagnitude if <me>.Magnitude() <= Resolution or
   *  Other.Magnitude() <= Resolution from gp
   */
  public long IsNormal( gp_Vec  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Vec_IsNormal(swigCPtr, this, gp_Vec.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Returns True if PI - <me>.Angle(Other) <= AngularTolerance
   *  Raises VectorWithNullMagnitude if <me>.Magnitude() <= Resolution or
   *  Other.Magnitude() <= Resolution from gp
   */
  public long IsOpposite( gp_Vec  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Vec_IsOpposite(swigCPtr, this, gp_Vec.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Returns True if Angle(<me>, Other) <= AngularTolerance or
   *  PI - Angle(<me>, Other) <= AngularTolerance
   *  This definition means that two parallel vectors cannot define
   *  a plane but two vectors with opposite directions are considered
   *  as parallel. Raises VectorWithNullMagnitude if <me>.Magnitude() <= Resolution or
   *  Other.Magnitude() <= Resolution from gp
   */
  public long IsParallel( gp_Vec  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Vec_IsParallel(swigCPtr, this, gp_Vec.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Computes the angular value between <me> and <Other>
   *  Returns the angle value between 0 and PI in radian.
   *  Raises VectorWithNullMagnitude if <me>.Magnitude() <= Resolution from gp or
   *  Other.Magnitude() <= Resolution because the angular value is
   *  indefinite if one of the vectors has a null magnitude.
   */
  public double Angle( gp_Vec  Other) {
    return OCCwrapJavaJNI.gp_Vec_Angle(swigCPtr, this, gp_Vec.getCPtr(Other), Other);
  }

  /**
   *  Computes the angle, in radians, between this vector and
   *  vector Other. The result is a value between -Pi and Pi.
   *  For this, VRef defines the positive sense of rotation: the
   *  angular value is positive, if the cross product this ^ Other
   *  has the same orientation as VRef relative to the plane
   *  defined by the vectors this and Other. Otherwise, the
   *  angular value is negative.
   *  Exceptions
   *  gp_VectorWithNullMagnitude if the magnitude of this
   *  vector, the vector Other, or the vector VRef is less than or
   *  equal to gp::Resolution().
   *  Standard_DomainError if this vector, the vector Other,
   *  and the vector VRef are coplanar, unless this vector and
   *  the vector Other are parallel.
   */
  public double AngleWithRef( gp_Vec  Other,  gp_Vec  VRef) {
    return OCCwrapJavaJNI.gp_Vec_AngleWithRef(swigCPtr, this, gp_Vec.getCPtr(Other), Other, gp_Vec.getCPtr(VRef), VRef);
  }

  /**
   *  Computes the magnitude of this vector.
   */
  public double Magnitude() {
    return OCCwrapJavaJNI.gp_Vec_Magnitude(swigCPtr, this);
  }

  /**
   *  Computes the square magnitude of this vector.
   */
  public double SquareMagnitude() {
    return OCCwrapJavaJNI.gp_Vec_SquareMagnitude(swigCPtr, this);
  }

  /**
   *  Adds two vectors
   */
  public void Add( gp_Vec  Other) {
    OCCwrapJavaJNI.gp_Vec_Add(swigCPtr, this, gp_Vec.getCPtr(Other), Other);
  }

  /**
   *  Adds two vectors
   */
  public gp_Vec Added( gp_Vec  Other) {
    return new gp_Vec(OCCwrapJavaJNI.gp_Vec_Added(swigCPtr, this, gp_Vec.getCPtr(Other), Other), true);
  }

  /**
   *  Subtracts two vectors
   */
  public void Subtract( gp_Vec  Right) {
    OCCwrapJavaJNI.gp_Vec_Subtract(swigCPtr, this, gp_Vec.getCPtr(Right), Right);
  }

  /**
   *  Subtracts two vectors
   */
  public gp_Vec Subtracted( gp_Vec  Right) {
    return new gp_Vec(OCCwrapJavaJNI.gp_Vec_Subtracted(swigCPtr, this, gp_Vec.getCPtr(Right), Right), true);
  }

  /**
   *  Multiplies a vector by a scalar
   */
  public void Multiply(double Scalar) {
    OCCwrapJavaJNI.gp_Vec_Multiply(swigCPtr, this, Scalar);
  }

  /**
   *  Multiplies a vector by a scalar
   */
  public gp_Vec Multiplied(double Scalar) {
    return new gp_Vec(OCCwrapJavaJNI.gp_Vec_Multiplied(swigCPtr, this, Scalar), true);
  }

  /**
   *  Divides a vector by a scalar
   */
  public void Divide(double Scalar) {
    OCCwrapJavaJNI.gp_Vec_Divide(swigCPtr, this, Scalar);
  }

  /**
   *  Divides a vector by a scalar
   */
  public gp_Vec Divided(double Scalar) {
    return new gp_Vec(OCCwrapJavaJNI.gp_Vec_Divided(swigCPtr, this, Scalar), true);
  }

  /**
   *  computes the cross product between two vectors
   */
  public void Cross( gp_Vec  Right) {
    OCCwrapJavaJNI.gp_Vec_Cross(swigCPtr, this, gp_Vec.getCPtr(Right), Right);
  }

  /**
   *  computes the cross product between two vectors
   */
  public gp_Vec Crossed( gp_Vec  Right) {
    return new gp_Vec(OCCwrapJavaJNI.gp_Vec_Crossed(swigCPtr, this, gp_Vec.getCPtr(Right), Right), true);
  }

  /**
   *  Computes the magnitude of the cross
   *  product between <me> and Right.
   *  Returns || <me> ^ Right ||
   */
  public double CrossMagnitude( gp_Vec  Right) {
    return OCCwrapJavaJNI.gp_Vec_CrossMagnitude(swigCPtr, this, gp_Vec.getCPtr(Right), Right);
  }

  /**
   *  Computes the square magnitude of
   *  the cross product between <me> and Right.
   *  Returns || <me> ^ Right ||**2
   */
  public double CrossSquareMagnitude( gp_Vec  Right) {
    return OCCwrapJavaJNI.gp_Vec_CrossSquareMagnitude(swigCPtr, this, gp_Vec.getCPtr(Right), Right);
  }

  /**
   *  Computes the triple vector product.
   *  <me> ^= (V1 ^ V2)
   */
  public void CrossCross( gp_Vec  V1,  gp_Vec  V2) {
    OCCwrapJavaJNI.gp_Vec_CrossCross(swigCPtr, this, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2);
  }

  /**
   *  Computes the triple vector product.
   *  <me> ^ (V1 ^ V2)
   */
  public gp_Vec CrossCrossed( gp_Vec  V1,  gp_Vec  V2) {
    return new gp_Vec(OCCwrapJavaJNI.gp_Vec_CrossCrossed(swigCPtr, this, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2), true);
  }

  /**
   *  computes the scalar product
   */
  public double Dot( gp_Vec  Other) {
    return OCCwrapJavaJNI.gp_Vec_Dot(swigCPtr, this, gp_Vec.getCPtr(Other), Other);
  }

  /**
   *  Computes the triple scalar product <me> * (V1 ^ V2).
   */
  public double DotCross( gp_Vec  V1,  gp_Vec  V2) {
    return OCCwrapJavaJNI.gp_Vec_DotCross(swigCPtr, this, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2);
  }

  /**
   *  normalizes a vector
   *  Raises an exception if the magnitude of the vector is
   *  lower or equal to Resolution from gp.
   */
  public void Normalize() {
    OCCwrapJavaJNI.gp_Vec_Normalize(swigCPtr, this);
  }

  /**
   *  normalizes a vector
   *  Raises an exception if the magnitude of the vector is
   *  lower or equal to Resolution from gp.
   */
  public gp_Vec Normalized() {
    return new gp_Vec(OCCwrapJavaJNI.gp_Vec_Normalized(swigCPtr, this), true);
  }

  /**
   *  Reverses the direction of a vector
   */
  public void Reverse() {
    OCCwrapJavaJNI.gp_Vec_Reverse(swigCPtr, this);
  }

  /**
   *  Reverses the direction of a vector
   */
  public gp_Vec Reversed() {
    return new gp_Vec(OCCwrapJavaJNI.gp_Vec_Reversed(swigCPtr, this), true);
  }

  /**
   *  <me> is set to the following linear form :
   *  A1 * V1 + A2 * V2 + A3 * V3 + V4
   */
  public void SetLinearForm(double A1,  gp_Vec  V1, double A2,  gp_Vec  V2, double A3,  gp_Vec  V3,  gp_Vec  V4) {
    OCCwrapJavaJNI.gp_Vec_SetLinearForm__SWIG_0(swigCPtr, this, A1, gp_Vec.getCPtr(V1), V1, A2, gp_Vec.getCPtr(V2), V2, A3, gp_Vec.getCPtr(V3), V3, gp_Vec.getCPtr(V4), V4);
  }

  /**
   *  <me> is set to the following linear form :
   *  A1 * V1 + A2 * V2 + A3 * V3
   */
  public void SetLinearForm(double A1,  gp_Vec  V1, double A2,  gp_Vec  V2, double A3,  gp_Vec  V3) {
    OCCwrapJavaJNI.gp_Vec_SetLinearForm__SWIG_1(swigCPtr, this, A1, gp_Vec.getCPtr(V1), V1, A2, gp_Vec.getCPtr(V2), V2, A3, gp_Vec.getCPtr(V3), V3);
  }

  /**
   *  <me> is set to the following linear form :
   *  A1 * V1 + A2 * V2 + V3
   */
  public void SetLinearForm(double A1,  gp_Vec  V1, double A2,  gp_Vec  V2,  gp_Vec  V3) {
    OCCwrapJavaJNI.gp_Vec_SetLinearForm__SWIG_2(swigCPtr, this, A1, gp_Vec.getCPtr(V1), V1, A2, gp_Vec.getCPtr(V2), V2, gp_Vec.getCPtr(V3), V3);
  }

  /**
   *  <me> is set to the following linear form :
   *  A1 * V1 + A2 * V2
   */
  public void SetLinearForm(double A1,  gp_Vec  V1, double A2,  gp_Vec  V2) {
    OCCwrapJavaJNI.gp_Vec_SetLinearForm__SWIG_3(swigCPtr, this, A1, gp_Vec.getCPtr(V1), V1, A2, gp_Vec.getCPtr(V2), V2);
  }

  /**
   *  <me> is set to the following linear form : A1 * V1 + V2
   */
  public void SetLinearForm(double A1,  gp_Vec  V1,  gp_Vec  V2) {
    OCCwrapJavaJNI.gp_Vec_SetLinearForm__SWIG_4(swigCPtr, this, A1, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2);
  }

  /**
   *  <me> is set to the following linear form : V1 + V2
   */
  public void SetLinearForm( gp_Vec  V1,  gp_Vec  V2) {
    OCCwrapJavaJNI.gp_Vec_SetLinearForm__SWIG_5(swigCPtr, this, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2);
  }

  public void Mirror( gp_Vec  V) {
    OCCwrapJavaJNI.gp_Vec_Mirror__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Performs the symmetrical transformation of a vector
   *  with respect to the vector V which is the center of
   *  the  symmetry.
   */
  public gp_Vec Mirrored( gp_Vec  V) {
    return new gp_Vec(OCCwrapJavaJNI.gp_Vec_Mirrored__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V), true);
  }

  public void Mirror(gp_Ax1 A1) {
    OCCwrapJavaJNI.gp_Vec_Mirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Performs the symmetrical transformation of a vector
   *  with respect to an axis placement which is the axis
   *  of the symmetry.
   */
  public gp_Vec Mirrored(gp_Ax1 A1) {
    return new gp_Vec(OCCwrapJavaJNI.gp_Vec_Mirrored__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1), true);
  }

  public void Mirror(gp_Ax2 A2) {
    OCCwrapJavaJNI.gp_Vec_Mirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Performs the symmetrical transformation of a vector
   *  with respect to a plane. The axis placement A2 locates
   *  the plane of the symmetry : (Location, XDirection, YDirection).
   */
  public gp_Vec Mirrored(gp_Ax2 A2) {
    return new gp_Vec(OCCwrapJavaJNI.gp_Vec_Mirrored__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2), true);
  }

  public void Rotate(gp_Ax1 A1, double Ang) {
    OCCwrapJavaJNI.gp_Vec_Rotate(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang);
  }

  /**
   *  Rotates a vector. A1 is the axis of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public gp_Vec Rotated(gp_Ax1 A1, double Ang) {
    return new gp_Vec(OCCwrapJavaJNI.gp_Vec_Rotated(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang), true);
  }

  public void Scale(double S) {
    OCCwrapJavaJNI.gp_Vec_Scale(swigCPtr, this, S);
  }

  /**
   *  Scales a vector. S is the scaling value.
   */
  public gp_Vec Scaled(double S) {
    return new gp_Vec(OCCwrapJavaJNI.gp_Vec_Scaled(swigCPtr, this, S), true);
  }

  /**
   *  Transforms a vector with the transformation T.
   */
  public void Transform( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_Vec_Transform(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Transforms a vector with the transformation T.
   */
  public gp_Vec Transformed( gp_Trsf  T) {
    return new gp_Vec(OCCwrapJavaJNI.gp_Vec_Transformed(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

}
