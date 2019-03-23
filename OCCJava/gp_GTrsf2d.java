package opencascade;

/**
 *  Defines a non persistent transformation in 2D space.
 *  This transformation is a general transformation.
 *  It can be a Trsf2d from package gp, an affinity, or you can
 *  define your own transformation giving the corresponding
 *  matrix of transformation.
 * 
 *  With a GTrsf2d you can transform only a doublet of coordinates
 *  XY. It is not possible to transform other geometric objects
 *  because these transformations can change the nature of non-
 *  elementary geometric objects.
 *  A GTrsf2d is represented with a 2 rows * 3 columns matrix :
 * 
 *  V1   V2   T        XY         XY
 *  | a11  a12  a14 |   | x |      | x'|
 *  | a21  a22  a24 |   | y |      | y'|
 *  |  0    0    1  |   | 1 |      | 1 |
 * 
 *  where {V1, V2} defines the vectorial part of the
 *  transformation and T defines the translation part of
 *  the transformation.
 *  Warning
 *  A GTrsf2d transformation is only applicable on
 *  coordinates. Be careful if you apply such a
 *  transformation to all the points of a geometric object,
 *  as this can change the nature of the object and thus
 *  render it incoherent!
 *  Typically, a circle is transformed into an ellipse by an
 *  affinity transformation. To avoid modifying the nature of
 *  an object, use a gp_Trsf2d transformation instead, as
 *  objects of this class respect the nature of geometric objects.
 */
public class gp_GTrsf2d {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_GTrsf2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_GTrsf2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_GTrsf2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_GTrsf2d ptr) { Ptr = ptr; }
    public gp_GTrsf2d AsReference () { return Ptr; }
    public gp_GTrsf2d AsCopy () { return Ptr.MakeCopy(); }
    public gp_GTrsf2d Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_GTrsf2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  returns identity transformation.
   */
  public gp_GTrsf2d() {
    this(OCCwrapJavaJNI.new_gp_GTrsf2d__SWIG_0(), true);
  }

  /**
   *  Converts the gp_Trsf2d transformation T into a
   *  general transformation.
   */
  public gp_GTrsf2d( gp_Trsf2d  T) {
    this(OCCwrapJavaJNI.new_gp_GTrsf2d__SWIG_1(gp_Trsf2d.getCPtr(T), T), true);
  }

  /**
   *  Creates   a transformation based on the matrix M and the
   *  vector V where M defines the vectorial part of the
   *  transformation, and V the translation part.
   */
  public gp_GTrsf2d( gp_Mat2d  M,  gp_XY  V) {
    this(OCCwrapJavaJNI.new_gp_GTrsf2d__SWIG_2(gp_Mat2d.getCPtr(M), M, gp_XY.getCPtr(V), V), true);
  }

  /**
   *  Changes this transformation into an affinity of ratio Ratio
   *  with respect to the axis A.
   *  Note: An affinity is a point-by-point transformation that
   *  transforms any point P into a point P' such that if H is
   *  the orthogonal projection of P on the axis A, the vectors
   *  HP and HP' satisfy: HP' = Ratio * HP.
   */
  public void SetAffinity(gp_Ax2d A, double Ratio) {
    OCCwrapJavaJNI.gp_GTrsf2d_SetAffinity(swigCPtr, this, gp_Ax2d.getCPtr(A), A, Ratio);
  }

  /**
   *  Replaces   the coefficient (Row, Col) of the matrix representing
   *  this transformation by Value,
   *  Raises OutOfRange if Row < 1 or Row > 2 or Col < 1 or Col > 3
   */
  public void SetValue(int Row, int Col, double Value) {
    OCCwrapJavaJNI.gp_GTrsf2d_SetValue(swigCPtr, this, Row, Col, Value);
  }

  /**
   *  Replacesthe translation part of this
   *  transformation by the coordinates of the number pair Coord.
   */
  public void SetTranslationPart( gp_XY  Coord) {
    OCCwrapJavaJNI.gp_GTrsf2d_SetTranslationPart(swigCPtr, this, gp_XY.getCPtr(Coord), Coord);
  }

  /**
   *  Assigns the vectorial and translation parts of T to this transformation.
   */
  public void SetTrsf2d( gp_Trsf2d  T) {
    OCCwrapJavaJNI.gp_GTrsf2d_SetTrsf2d(swigCPtr, this, gp_Trsf2d.getCPtr(T), T);
  }

  /**
   *  Replaces the vectorial part of this transformation by Matrix.
   */
  public void SetVectorialPart( gp_Mat2d  Matrix) {
    OCCwrapJavaJNI.gp_GTrsf2d_SetVectorialPart(swigCPtr, this, gp_Mat2d.getCPtr(Matrix), Matrix);
  }

  /**
   *  Returns true if the determinant of the vectorial part of
   *  this transformation is negative.
   */
  public long IsNegative() {
    return OCCwrapJavaJNI.gp_GTrsf2d_IsNegative(swigCPtr, this);
  }

  /**
   *  Returns true if this transformation is singular (and
   *  therefore, cannot be inverted).
   *  Note: The Gauss LU decomposition is used to invert the
   *  transformation matrix. Consequently, the transformation
   *  is considered as singular if the largest pivot found is less
   *  than or equal to gp::Resolution().
   *  Warning
   *  If this transformation is singular, it cannot be inverted.
   */
  public long IsSingular() {
    return OCCwrapJavaJNI.gp_GTrsf2d_IsSingular(swigCPtr, this);
  }

  /**
   *  Returns the nature of the transformation.  It can be
   *  an identity transformation, a rotation, a translation, a mirror
   *  transformation (relative to a point or axis), a scaling
   *  transformation, a compound transformation or some
   *  other type of transformation.
   */
  public gp_TrsfForm Form() {
    return gp_TrsfForm.swigToEnum(OCCwrapJavaJNI.gp_GTrsf2d_Form(swigCPtr, this));
  }

  /**
   *  Returns the translation part of the GTrsf2d.
   */
  public  gp_XY  TranslationPart() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.gp_GTrsf2d_TranslationPart(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Computes the vectorial part of the GTrsf2d. The returned
   *  Matrix is a 2*2 matrix.
   */
  public  gp_Mat2d  VectorialPart() {
    gp_Mat2d ret = new gp_Mat2d(OCCwrapJavaJNI.gp_GTrsf2d_VectorialPart(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the coefficients of the global matrix of transformation.
   *  Raised OutOfRange if Row < 1 or Row > 2 or Col < 1 or Col > 3
   */
  public double Value(int Row, int Col) {
    return OCCwrapJavaJNI.gp_GTrsf2d_Value(swigCPtr, this, Row, Col);
  }

  public void Invert() {
    OCCwrapJavaJNI.gp_GTrsf2d_Invert(swigCPtr, this);
  }

  /**
   *  Computes the reverse transformation.
   *  Raised an exception if the matrix of the transformation
   *  is not inversible.
   */
  public gp_GTrsf2d Inverted() {
    return new gp_GTrsf2d(OCCwrapJavaJNI.gp_GTrsf2d_Inverted(swigCPtr, this), true);
  }

  /**
   *  Computes the transformation composed with T and <me>.
   *  In a C++ implementation you can also write Tcomposed = <me> * T.
   *  Example :
   *  GTrsf2d T1, T2, Tcomp; ...............
   *  //composition :
   *  Tcomp = T2.Multiplied(T1);         // or   (Tcomp = T2 * T1)
   *  // transformation of a point
   *  XY P(10.,3.);
   *  XY P1(P);
   *  Tcomp.Transforms(P1);               //using Tcomp
   *  XY P2(P);
   *  T1.Transforms(P2);                  //using T1 then T2
   *  T2.Transforms(P2);                  // P1 = P2 !!!
   */
  public gp_GTrsf2d Multiplied( gp_GTrsf2d  T) {
    return new gp_GTrsf2d(OCCwrapJavaJNI.gp_GTrsf2d_Multiplied(swigCPtr, this, gp_GTrsf2d.getCPtr(T), T), true);
  }

  public void Multiply( gp_GTrsf2d  T) {
    OCCwrapJavaJNI.gp_GTrsf2d_Multiply(swigCPtr, this, gp_GTrsf2d.getCPtr(T), T);
  }

  /**
   *  Computes the product of the transformation T and this
   *  transformation, and assigns the result to this transformation:
   *  this = T * this
   */
  public void PreMultiply( gp_GTrsf2d  T) {
    OCCwrapJavaJNI.gp_GTrsf2d_PreMultiply(swigCPtr, this, gp_GTrsf2d.getCPtr(T), T);
  }

  public void Power(int N) {
    OCCwrapJavaJNI.gp_GTrsf2d_Power(swigCPtr, this, N);
  }

  /**
   *  Computes the following composition of transformations
   *  <me> * <me> * .......* <me>, N time.
   *  if N = 0 <me> = Identity
   *  if N < 0 <me> = <me>.Inverse() *...........* <me>.Inverse().
   * 
   *  Raises an exception if N < 0 and if the matrix of the
   *  transformation is not inversible.
   */
  public gp_GTrsf2d Powered(int N) {
    return new gp_GTrsf2d(OCCwrapJavaJNI.gp_GTrsf2d_Powered(swigCPtr, this, N), true);
  }

  public void Transforms(gp_XY Coord) {
    OCCwrapJavaJNI.gp_GTrsf2d_Transforms__SWIG_0(swigCPtr, this, gp_XY.getCPtr(Coord), Coord);
  }

  public gp_XY Transformed( gp_XY  Coord) {
    return new gp_XY(OCCwrapJavaJNI.gp_GTrsf2d_Transformed(swigCPtr, this, gp_XY.getCPtr(Coord), Coord), true);
  }

  /**
   *  Applies this transformation to the coordinates:
   *  -   of the number pair Coord, or
   *  -   X and Y.
   * 
   *  Note:
   *  -   Transforms modifies X, Y, or the coordinate pair Coord, while
   *  -   Transformed creates a new coordinate pair.
   */
  public void Transforms(double[] X, double[] Y) {
    OCCwrapJavaJNI.gp_GTrsf2d_Transforms__SWIG_1(swigCPtr, this, X, Y);
  }

  /**
   *  Converts this transformation into a gp_Trsf2d transformation.
   *  Exceptions
   *  Standard_ConstructionError if this transformation
   *  cannot be converted, i.e. if its form is gp_Other.
   */
  public gp_Trsf2d Trsf2d() {
    return new gp_Trsf2d(OCCwrapJavaJNI.gp_GTrsf2d_Trsf2d(swigCPtr, this), true);
  }

}
