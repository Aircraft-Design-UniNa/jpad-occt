package opencascade;

/**
 *  Defines a non-persistent transformation in 3D space.
 *  This transformation is a general transformation.
 *  It can be a Trsf from gp, an affinity, or you can define
 *  your own transformation giving the matrix of transformation.
 * 
 *  With a Gtrsf you can transform only a triplet of coordinates
 *  XYZ. It is not possible to transform other geometric objects
 *  because these transformations can change the nature of non-
 *  elementary geometric objects.
 *  The transformation GTrsf can be represented as follow :
 * 
 *  V1   V2   V3    T       XYZ        XYZ
 *  | a11  a12  a13   a14 |   | x |      | x'|
 *  | a21  a22  a23   a24 |   | y |      | y'|
 *  | a31  a32  a33   a34 |   | z |   =  | z'|
 *  |  0    0    0     1  |   | 1 |      | 1 |
 * 
 *  where {V1, V2, V3} define the vectorial part of the
 *  transformation and T defines the translation part of the
 *  transformation.
 *  Warning
 *  A GTrsf transformation is only applicable to
 *  coordinates. Be careful if you apply such a
 *  transformation to all points of a geometric object, as
 *  this can change the nature of the object and thus
 *  render it incoherent!
 *  Typically, a circle is transformed into an ellipse by an
 *  affinity transformation. To avoid modifying the nature of
 *  an object, use a gp_Trsf transformation instead, as
 *  objects of this class respect the nature of geometric objects.
 */
public class gp_GTrsf {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_GTrsf(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_GTrsf(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_GTrsf obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_GTrsf ptr) { Ptr = ptr; }
    public gp_GTrsf AsReference () { return Ptr; }
    public gp_GTrsf AsCopy () { return Ptr.MakeCopy(); }
    public gp_GTrsf Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_GTrsf(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Returns the Identity transformation.
   */
  public gp_GTrsf() {
    this(OCCwrapJavaJNI.new_gp_GTrsf__SWIG_0(), true);
  }

  /**
   *  Converts the gp_Trsf transformation T into a
   *  general transformation, i.e. Returns a GTrsf with
   *  the same matrix of coefficients as the Trsf T.
   */
  public gp_GTrsf( gp_Trsf  T) {
    this(OCCwrapJavaJNI.new_gp_GTrsf__SWIG_1(gp_Trsf.getCPtr(T), T), true);
  }

  /**
   *  Creates a transformation based on the matrix M and the
   *  vector V where M defines the vectorial part of
   *  the transformation, and V the translation part, or
   */
  public gp_GTrsf( gp_Mat  M,  gp_XYZ  V) {
    this(OCCwrapJavaJNI.new_gp_GTrsf__SWIG_2(gp_Mat.getCPtr(M), M, gp_XYZ.getCPtr(V), V), true);
  }

  /**
   *  Changes this transformation into an affinity of ratio Ratio
   *  with respect to the axis A1.
   *  Note: an affinity is a point-by-point transformation that
   *  transforms any point P into a point P' such that if H is
   *  the orthogonal projection of P on the axis A1 or the
   *  plane A2, the vectors HP and HP' satisfy:
   *  HP' = Ratio * HP.
   */
  public void SetAffinity(gp_Ax1 A1, double Ratio) {
    OCCwrapJavaJNI.gp_GTrsf_SetAffinity__SWIG_0(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ratio);
  }

  /**
   *  Changes this transformation into an affinity of ratio Ratio
   *  with respect to  the plane defined by the origin, the "X Direction" and
   *  the "Y Direction" of coordinate system A2.
   *  Note: an affinity is a point-by-point transformation that
   *  transforms any point P into a point P' such that if H is
   *  the orthogonal projection of P on the axis A1 or the
   *  plane A2, the vectors HP and HP' satisfy:
   *  HP' = Ratio * HP.
   */
  public void SetAffinity(gp_Ax2 A2, double Ratio) {
    OCCwrapJavaJNI.gp_GTrsf_SetAffinity__SWIG_1(swigCPtr, this, gp_Ax2.getCPtr(A2), A2, Ratio);
  }

  /**
   *  Replaces  the coefficient (Row, Col) of the matrix representing
   *  this transformation by Value.  Raises OutOfRange
   *  if  Row < 1 or Row > 3 or Col < 1 or Col > 4
   */
  public void SetValue(int Row, int Col, double Value) {
    OCCwrapJavaJNI.gp_GTrsf_SetValue(swigCPtr, this, Row, Col, Value);
  }

  /**
   *  Replaces the vectorial part of this transformation by Matrix.
   */
  public void SetVectorialPart( gp_Mat  Matrix) {
    OCCwrapJavaJNI.gp_GTrsf_SetVectorialPart(swigCPtr, this, gp_Mat.getCPtr(Matrix), Matrix);
  }

  /**
   *  Replaces the translation part of
   *  this transformation by the coordinates of the number triple Coord.
   */
  public void SetTranslationPart( gp_XYZ  Coord) {
    OCCwrapJavaJNI.gp_GTrsf_SetTranslationPart(swigCPtr, this, gp_XYZ.getCPtr(Coord), Coord);
  }

  /**
   *  Assigns the vectorial and translation parts of T to this transformation.
   */
  public void SetTrsf( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_GTrsf_SetTrsf(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Returns true if the determinant of the vectorial part of
   *  this transformation is negative.
   */
  public long IsNegative() {
    return OCCwrapJavaJNI.gp_GTrsf_IsNegative(swigCPtr, this);
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
    return OCCwrapJavaJNI.gp_GTrsf_IsSingular(swigCPtr, this);
  }

  /**
   *  Returns the nature of the transformation.  It can be an
   *  identity transformation, a rotation, a translation, a mirror
   *  transformation (relative to a point, an axis or a plane), a
   *  scaling transformation, a compound transformation or
   *  some other type of transformation.
   */
  public gp_TrsfForm Form() {
    return gp_TrsfForm.swigToEnum(OCCwrapJavaJNI.gp_GTrsf_Form(swigCPtr, this));
  }

  /**
   *  verify and set the shape of the GTrsf Other or CompoundTrsf
   *  Ex :
   *  myGTrsf.SetValue(row1,col1,val1);
   *  myGTrsf.SetValue(row2,col2,val2);
   *  ...
   *  myGTrsf.SetForm();
   */
  public void SetForm() {
    OCCwrapJavaJNI.gp_GTrsf_SetForm(swigCPtr, this);
  }

  /**
   *  Returns the translation part of the GTrsf.
   */
  public  gp_XYZ  TranslationPart() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.gp_GTrsf_TranslationPart(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Computes the vectorial part of the GTrsf. The returned Matrix
   *  is a  3*3 matrix.
   */
  public  gp_Mat  VectorialPart() {
    gp_Mat ret = new gp_Mat(OCCwrapJavaJNI.gp_GTrsf_VectorialPart(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the coefficients of the global matrix of transformation.
   *  Raises OutOfRange if Row < 1 or Row > 3 or Col < 1 or Col > 4
   */
  public double Value(int Row, int Col) {
    return OCCwrapJavaJNI.gp_GTrsf_Value(swigCPtr, this, Row, Col);
  }

  public void Invert() {
    OCCwrapJavaJNI.gp_GTrsf_Invert(swigCPtr, this);
  }

  /**
   *  Computes the reverse transformation.
   *  Raises an exception if the matrix of the transformation
   *  is not inversible.
   */
  public gp_GTrsf Inverted() {
    return new gp_GTrsf(OCCwrapJavaJNI.gp_GTrsf_Inverted(swigCPtr, this), true);
  }

  /**
   *  Computes the transformation composed from T and <me>.
   *  In a C++ implementation you can also write Tcomposed = <me> * T.
   *  Example :
   *  GTrsf T1, T2, Tcomp; ...............
   *  //composition :
   *  Tcomp = T2.Multiplied(T1);         // or   (Tcomp = T2 * T1)
   *  // transformation of a point
   *  XYZ P(10.,3.,4.);
   *  XYZ P1(P);
   *  Tcomp.Transforms(P1);               //using Tcomp
   *  XYZ P2(P);
   *  T1.Transforms(P2);                  //using T1 then T2
   *  T2.Transforms(P2);                  // P1 = P2 !!!
   */
  public gp_GTrsf Multiplied( gp_GTrsf  T) {
    return new gp_GTrsf(OCCwrapJavaJNI.gp_GTrsf_Multiplied(swigCPtr, this, gp_GTrsf.getCPtr(T), T), true);
  }

  /**
   *  Computes the transformation composed with <me> and T.
   *  <me> = <me> * T
   */
  public void Multiply( gp_GTrsf  T) {
    OCCwrapJavaJNI.gp_GTrsf_Multiply(swigCPtr, this, gp_GTrsf.getCPtr(T), T);
  }

  /**
   *  Computes the product of the transformation T and this
   *  transformation and assigns the result to this transformation.
   *  this = T * this
   */
  public void PreMultiply( gp_GTrsf  T) {
    OCCwrapJavaJNI.gp_GTrsf_PreMultiply(swigCPtr, this, gp_GTrsf.getCPtr(T), T);
  }

  public void Power(int N) {
    OCCwrapJavaJNI.gp_GTrsf_Power(swigCPtr, this, N);
  }

  /**
   *  Computes:
   *  -   the product of this transformation multiplied by itself
   *  N times, if N is positive, or
   *  -   the product of the inverse of this transformation
   *  multiplied by itself |N| times, if N is negative.
   *  If N equals zero, the result is equal to the Identity
   *  transformation.
   *  I.e.:  <me> * <me> * .......* <me>, N time.
   *  if N =0 <me> = Identity
   *  if N < 0 <me> = <me>.Inverse() *...........* <me>.Inverse().
   * 
   *  Raises an exception if N < 0 and if the matrix of the
   *  transformation not inversible.
   */
  public gp_GTrsf Powered(int N) {
    return new gp_GTrsf(OCCwrapJavaJNI.gp_GTrsf_Powered(swigCPtr, this, N), true);
  }

  public void Transforms(gp_XYZ Coord) {
    OCCwrapJavaJNI.gp_GTrsf_Transforms__SWIG_0(swigCPtr, this, gp_XYZ.getCPtr(Coord), Coord);
  }

  /**
   *  Transforms a triplet XYZ with a GTrsf.
   */
  public void Transforms(double[] X, double[] Y, double[] Z) {
    OCCwrapJavaJNI.gp_GTrsf_Transforms__SWIG_1(swigCPtr, this, X, Y, Z);
  }

  public gp_Trsf Trsf() {
    return new gp_Trsf(OCCwrapJavaJNI.gp_GTrsf_Trsf(swigCPtr, this), true);
  }

}
