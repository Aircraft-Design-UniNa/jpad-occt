package opencascade;

/**
 *  Defines a non-persistent vector in 2D space.
 */
public class gp_Vec2d {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Vec2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Vec2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Vec2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Vec2d ptr) { Ptr = ptr; }
    public gp_Vec2d AsReference () { return Ptr; }
    public gp_Vec2d AsCopy () { return Ptr.MakeCopy(); }
    public gp_Vec2d Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Vec2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a zero vector.
   */
  public gp_Vec2d() {
    this(OCCwrapJavaJNI.new_gp_Vec2d__SWIG_0(), true);
  }

  /**
   *  Creates a unitary vector from a direction V.
   */
  public gp_Vec2d(gp_Dir2d V) {
    this(OCCwrapJavaJNI.new_gp_Vec2d__SWIG_1(gp_Dir2d.getCPtr(V), V), true);
  }

  /**
   *  Creates a vector with a doublet of coordinates.
   */
  public gp_Vec2d( gp_XY  Coord) {
    this(OCCwrapJavaJNI.new_gp_Vec2d__SWIG_2(gp_XY.getCPtr(Coord), Coord), true);
  }

  /**
   *  Creates a point with its two Cartesian coordinates.
   */
  public gp_Vec2d(double Xv, double Yv) {
    this(OCCwrapJavaJNI.new_gp_Vec2d__SWIG_3(Xv, Yv), true);
  }

  /**
   *  Creates a vector from two points. The length of the vector
   *  is the distance between P1 and P2
   */
  public gp_Vec2d( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    this(OCCwrapJavaJNI.new_gp_Vec2d__SWIG_4(gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2), true);
  }

  /**
   *  Changes the coordinate of range Index
   *  Index = 1 => X is modified
   *  Index = 2 => Y is modified
   *  Raises OutOfRange if Index != {1, 2}.
   */
  public void SetCoord(int Index, double Xi) {
    OCCwrapJavaJNI.gp_Vec2d_SetCoord__SWIG_0(swigCPtr, this, Index, Xi);
  }

  /**
   *  For this vector, assigns
   *  the values Xv and Yv to its two coordinates
   */
  public void SetCoord(double Xv, double Yv) {
    OCCwrapJavaJNI.gp_Vec2d_SetCoord__SWIG_1(swigCPtr, this, Xv, Yv);
  }

  /**
   *  Assigns the given value to the X coordinate of this vector.
   */
  public void SetX(double X) {
    OCCwrapJavaJNI.gp_Vec2d_SetX(swigCPtr, this, X);
  }

  /**
   *  Assigns the given value to the Y coordinate of this vector.
   */
  public void SetY(double Y) {
    OCCwrapJavaJNI.gp_Vec2d_SetY(swigCPtr, this, Y);
  }

  /**
   *  Assigns the two coordinates of Coord to this vector.
   */
  public void SetXY( gp_XY  Coord) {
    OCCwrapJavaJNI.gp_Vec2d_SetXY(swigCPtr, this, gp_XY.getCPtr(Coord), Coord);
  }

  /**
   *  Returns the coordinate of range Index :
   *  Index = 1 => X is returned
   *  Index = 2 => Y is returned
   *  Raised if Index != {1, 2}.
   */
  public double Coord(int Index) {
    return OCCwrapJavaJNI.gp_Vec2d_Coord__SWIG_0(swigCPtr, this, Index);
  }

  /**
   *  For this vector, returns  its two coordinates Xv and Yv
   */
  public void Coord(double[] Xv, double[] Yv) {
    OCCwrapJavaJNI.gp_Vec2d_Coord__SWIG_1(swigCPtr, this, Xv, Yv);
  }

  /**
   *  For this vector, returns its X  coordinate.
   */
  public double X() {
    return OCCwrapJavaJNI.gp_Vec2d_X(swigCPtr, this);
  }

  /**
   *  For this vector, returns its Y  coordinate.
   */
  public double Y() {
    return OCCwrapJavaJNI.gp_Vec2d_Y(swigCPtr, this);
  }

  /**
   *  For this vector, returns its two coordinates as a number pair
   */
  public  gp_XY  XY() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.gp_Vec2d_XY(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns True if the two vectors have the same magnitude value
   *  and the same direction. The precision values are LinearTolerance
   *  for the magnitude and AngularTolerance for the direction.
   */
  public long IsEqual( gp_Vec2d  Other, double LinearTolerance, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Vec2d_IsEqual(swigCPtr, this, gp_Vec2d.getCPtr(Other), Other, LinearTolerance, AngularTolerance);
  }

  /**
   *  Returns True if abs(Abs(<me>.Angle(Other)) - PI/2.)
   *  <= AngularTolerance
   *  Raises VectorWithNullMagnitude if <me>.Magnitude() <= Resolution or
   *  Other.Magnitude() <= Resolution from gp.
   */
  public long IsNormal( gp_Vec2d  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Vec2d_IsNormal(swigCPtr, this, gp_Vec2d.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Returns True if PI - Abs(<me>.Angle(Other)) <= AngularTolerance
   *  Raises VectorWithNullMagnitude if <me>.Magnitude() <= Resolution or
   *  Other.Magnitude() <= Resolution from gp.
   */
  public long IsOpposite( gp_Vec2d  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Vec2d_IsOpposite(swigCPtr, this, gp_Vec2d.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Returns true if Abs(Angle(<me>, Other)) <= AngularTolerance or
   *  PI - Abs(Angle(<me>, Other)) <= AngularTolerance
   *  Two vectors with opposite directions are considered as parallel.
   *  Raises VectorWithNullMagnitude if <me>.Magnitude() <= Resolution or
   *  Other.Magnitude() <= Resolution from gp
   */
  public long IsParallel( gp_Vec2d  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Vec2d_IsParallel(swigCPtr, this, gp_Vec2d.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Computes the angular value between <me> and <Other>
   *  returns the angle value between -PI and PI in radian.
   *  The orientation is from <me> to Other. The positive sense is the
   *  trigonometric sense.
   *  Raises VectorWithNullMagnitude if <me>.Magnitude() <= Resolution from gp or
   *  Other.Magnitude() <= Resolution because the angular value is
   *  indefinite if one of the vectors has a null magnitude.
   */
  public double Angle( gp_Vec2d  Other) {
    return OCCwrapJavaJNI.gp_Vec2d_Angle(swigCPtr, this, gp_Vec2d.getCPtr(Other), Other);
  }

  /**
   *  Computes the magnitude of this vector.
   */
  public double Magnitude() {
    return OCCwrapJavaJNI.gp_Vec2d_Magnitude(swigCPtr, this);
  }

  /**
   *  Computes the square magnitude of this vector.
   */
  public double SquareMagnitude() {
    return OCCwrapJavaJNI.gp_Vec2d_SquareMagnitude(swigCPtr, this);
  }

  public void Add( gp_Vec2d  Other) {
    OCCwrapJavaJNI.gp_Vec2d_Add(swigCPtr, this, gp_Vec2d.getCPtr(Other), Other);
  }

  /**
   *  Adds two vectors
   */
  public gp_Vec2d Added( gp_Vec2d  Other) {
    return new gp_Vec2d(OCCwrapJavaJNI.gp_Vec2d_Added(swigCPtr, this, gp_Vec2d.getCPtr(Other), Other), true);
  }

  /**
   *  Computes the crossing product between two vectors
   */
  public double Crossed( gp_Vec2d  Right) {
    return OCCwrapJavaJNI.gp_Vec2d_Crossed(swigCPtr, this, gp_Vec2d.getCPtr(Right), Right);
  }

  /**
   *  Computes the magnitude of the cross product between <me> and
   *  Right. Returns || <me> ^ Right ||
   */
  public double CrossMagnitude( gp_Vec2d  Right) {
    return OCCwrapJavaJNI.gp_Vec2d_CrossMagnitude(swigCPtr, this, gp_Vec2d.getCPtr(Right), Right);
  }

  /**
   *  Computes the square magnitude of the cross product between <me> and
   *  Right. Returns || <me> ^ Right ||**2
   */
  public double CrossSquareMagnitude( gp_Vec2d  Right) {
    return OCCwrapJavaJNI.gp_Vec2d_CrossSquareMagnitude(swigCPtr, this, gp_Vec2d.getCPtr(Right), Right);
  }

  public void Divide(double Scalar) {
    OCCwrapJavaJNI.gp_Vec2d_Divide(swigCPtr, this, Scalar);
  }

  /**
   *  divides a vector by a scalar
   */
  public gp_Vec2d Divided(double Scalar) {
    return new gp_Vec2d(OCCwrapJavaJNI.gp_Vec2d_Divided(swigCPtr, this, Scalar), true);
  }

  /**
   *  Computes the scalar product
   */
  public double Dot( gp_Vec2d  Other) {
    return OCCwrapJavaJNI.gp_Vec2d_Dot(swigCPtr, this, gp_Vec2d.getCPtr(Other), Other);
  }

  public gp_Vec2d GetNormal() {
    return new gp_Vec2d(OCCwrapJavaJNI.gp_Vec2d_GetNormal(swigCPtr, this), true);
  }

  public void Multiply(double Scalar) {
    OCCwrapJavaJNI.gp_Vec2d_Multiply(swigCPtr, this, Scalar);
  }

  /**
   *  Normalizes a vector
   *  Raises an exception if the magnitude of the vector is
   *  lower or equal to Resolution from package gp.
   */
  public gp_Vec2d Multiplied(double Scalar) {
    return new gp_Vec2d(OCCwrapJavaJNI.gp_Vec2d_Multiplied(swigCPtr, this, Scalar), true);
  }

  public void Normalize() {
    OCCwrapJavaJNI.gp_Vec2d_Normalize(swigCPtr, this);
  }

  /**
   *  Normalizes a vector
   *  Raises an exception if the magnitude of the vector is
   *  lower or equal to Resolution from package gp.
   *  Reverses the direction of a vector
   */
  public gp_Vec2d Normalized() {
    return new gp_Vec2d(OCCwrapJavaJNI.gp_Vec2d_Normalized(swigCPtr, this), true);
  }

  public void Reverse() {
    OCCwrapJavaJNI.gp_Vec2d_Reverse(swigCPtr, this);
  }

  /**
   *  Reverses the direction of a vector
   */
  public gp_Vec2d Reversed() {
    return new gp_Vec2d(OCCwrapJavaJNI.gp_Vec2d_Reversed(swigCPtr, this), true);
  }

  /**
   *  Subtracts two vectors
   */
  public void Subtract( gp_Vec2d  Right) {
    OCCwrapJavaJNI.gp_Vec2d_Subtract(swigCPtr, this, gp_Vec2d.getCPtr(Right), Right);
  }

  /**
   *  Subtracts two vectors
   */
  public gp_Vec2d Subtracted( gp_Vec2d  Right) {
    return new gp_Vec2d(OCCwrapJavaJNI.gp_Vec2d_Subtracted(swigCPtr, this, gp_Vec2d.getCPtr(Right), Right), true);
  }

  /**
   *  <me> is set to the following linear form :
   *  A1 * V1 + A2 * V2 + V3
   */
  public void SetLinearForm(double A1,  gp_Vec2d  V1, double A2,  gp_Vec2d  V2,  gp_Vec2d  V3) {
    OCCwrapJavaJNI.gp_Vec2d_SetLinearForm__SWIG_0(swigCPtr, this, A1, gp_Vec2d.getCPtr(V1), V1, A2, gp_Vec2d.getCPtr(V2), V2, gp_Vec2d.getCPtr(V3), V3);
  }

  /**
   *  <me> is set to the following linear form : A1 * V1 + A2 * V2
   */
  public void SetLinearForm(double A1,  gp_Vec2d  V1, double A2,  gp_Vec2d  V2) {
    OCCwrapJavaJNI.gp_Vec2d_SetLinearForm__SWIG_1(swigCPtr, this, A1, gp_Vec2d.getCPtr(V1), V1, A2, gp_Vec2d.getCPtr(V2), V2);
  }

  /**
   *  <me> is set to the following linear form : A1 * V1 + V2
   */
  public void SetLinearForm(double A1,  gp_Vec2d  V1,  gp_Vec2d  V2) {
    OCCwrapJavaJNI.gp_Vec2d_SetLinearForm__SWIG_2(swigCPtr, this, A1, gp_Vec2d.getCPtr(V1), V1, gp_Vec2d.getCPtr(V2), V2);
  }

  /**
   *  <me> is set to the following linear form : Left + Right
   */
  public void SetLinearForm( gp_Vec2d  Left,  gp_Vec2d  Right) {
    OCCwrapJavaJNI.gp_Vec2d_SetLinearForm__SWIG_3(swigCPtr, this, gp_Vec2d.getCPtr(Left), Left, gp_Vec2d.getCPtr(Right), Right);
  }

  /**
   *  Performs the symmetrical transformation of a vector
   *  with respect to the vector V which is the center of
   *  the  symmetry.
   */
  public void Mirror( gp_Vec2d  V) {
    OCCwrapJavaJNI.gp_Vec2d_Mirror__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V);
  }

  /**
   *  Performs the symmetrical transformation of a vector
   *  with respect to the vector V which is the center of
   *  the  symmetry.
   */
  public gp_Vec2d Mirrored( gp_Vec2d  V) {
    return new gp_Vec2d(OCCwrapJavaJNI.gp_Vec2d_Mirrored__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V), true);
  }

  /**
   *  Performs the symmetrical transformation of a vector
   *  with respect to an axis placement which is the axis
   *  of the symmetry.
   */
  public void Mirror(gp_Ax2d A1) {
    OCCwrapJavaJNI.gp_Vec2d_Mirror__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A1), A1);
  }

  /**
   *  Performs the symmetrical transformation of a vector
   *  with respect to an axis placement which is the axis
   *  of the symmetry.
   */
  public gp_Vec2d Mirrored(gp_Ax2d A1) {
    return new gp_Vec2d(OCCwrapJavaJNI.gp_Vec2d_Mirrored__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A1), A1), true);
  }

  public void Rotate(double Ang) {
    OCCwrapJavaJNI.gp_Vec2d_Rotate(swigCPtr, this, Ang);
  }

  /**
   *  Rotates a vector. Ang is the angular value of the
   *  rotation in radians.
   */
  public gp_Vec2d Rotated(double Ang) {
    return new gp_Vec2d(OCCwrapJavaJNI.gp_Vec2d_Rotated(swigCPtr, this, Ang), true);
  }

  public void Scale(double S) {
    OCCwrapJavaJNI.gp_Vec2d_Scale(swigCPtr, this, S);
  }

  /**
   *  Scales a vector. S is the scaling value.
   */
  public gp_Vec2d Scaled(double S) {
    return new gp_Vec2d(OCCwrapJavaJNI.gp_Vec2d_Scaled(swigCPtr, this, S), true);
  }

  public void Transform( gp_Trsf2d  T) {
    OCCwrapJavaJNI.gp_Vec2d_Transform(swigCPtr, this, gp_Trsf2d.getCPtr(T), T);
  }

  /**
   *  Transforms a vector with a Trsf from gp.
   */
  public gp_Vec2d Transformed( gp_Trsf2d  T) {
    return new gp_Vec2d(OCCwrapJavaJNI.gp_Vec2d_Transformed(swigCPtr, this, gp_Trsf2d.getCPtr(T), T), true);
  }

}
