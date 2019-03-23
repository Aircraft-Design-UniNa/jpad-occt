package opencascade;

/**
 *  Defines a non-persistent transformation in 2D space.
 *  The following transformations are implemented :
 *  . Translation, Rotation, Scale
 *  . Symmetry with respect to a point and a line.
 *  Complex transformations can be obtained by combining the
 *  previous elementary transformations using the method Multiply.
 *  The transformations can be represented as follow :
 * 
 *  V1   V2   T       XY        XY
 *  | a11  a12  a13 |   | x |     | x'|
 *  | a21  a22  a23 |   | y |     | y'|
 *  |  0    0    1  |   | 1 |     | 1 |
 * 
 *  where {V1, V2} defines the vectorial part of the transformation
 *  and T defines the translation part of the transformation.
 *  This transformation never change the nature of the objects.
 */
public class gp_Trsf2d {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Trsf2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Trsf2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Trsf2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Trsf2d ptr) { Ptr = ptr; }
    public gp_Trsf2d AsReference () { return Ptr; }
    public gp_Trsf2d AsCopy () { return Ptr.MakeCopy(); }
    public gp_Trsf2d Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Trsf2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Returns identity transformation.
   */
  public gp_Trsf2d() {
    this(OCCwrapJavaJNI.new_gp_Trsf2d__SWIG_0(), true);
  }

  /**
   *  Creates a 2d transformation in the XY plane from a
   *  3d transformation .
   */
  public gp_Trsf2d( gp_Trsf  T) {
    this(OCCwrapJavaJNI.new_gp_Trsf2d__SWIG_1(gp_Trsf.getCPtr(T), T), true);
  }

  /**
   *  Changes the transformation into a symmetrical transformation.
   *  P is the center of the symmetry.
   */
  public void SetMirror(gp_Pnt2d P) {
    OCCwrapJavaJNI.gp_Trsf2d_SetMirror__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Changes the transformation into a symmetrical transformation.
   *  A is the center of the axial symmetry.
   */
  public void SetMirror(gp_Ax2d A) {
    OCCwrapJavaJNI.gp_Trsf2d_SetMirror__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Changes the transformation into a rotation.
   *  P is the rotation's center and Ang is the angular value of the
   *  rotation in radian.
   */
  public void SetRotation(gp_Pnt2d P, double Ang) {
    OCCwrapJavaJNI.gp_Trsf2d_SetRotation(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang);
  }

  /**
   *  Changes the transformation into a scale.
   *  P is the center of the scale and S is the scaling value.
   */
  public void SetScale(gp_Pnt2d P, double S) {
    OCCwrapJavaJNI.gp_Trsf2d_SetScale(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S);
  }

  /**
   *  Changes a transformation allowing passage from the coordinate
   *  system "FromSystem1" to the coordinate system "ToSystem2".
   */
  public void SetTransformation(gp_Ax2d FromSystem1, gp_Ax2d ToSystem2) {
    OCCwrapJavaJNI.gp_Trsf2d_SetTransformation__SWIG_0(swigCPtr, this, gp_Ax2d.getCPtr(FromSystem1), FromSystem1, gp_Ax2d.getCPtr(ToSystem2), ToSystem2);
  }

  /**
   *  Changes the transformation allowing passage from the basic
   *  coordinate system
   *  {P(0.,0.,0.), VX (1.,0.,0.), VY (0.,1.,0.)}
   *  to the local coordinate system defined with the Ax2d ToSystem.
   */
  public void SetTransformation(gp_Ax2d ToSystem) {
    OCCwrapJavaJNI.gp_Trsf2d_SetTransformation__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(ToSystem), ToSystem);
  }

  /**
   *  Changes the transformation into a translation.
   *  V is the vector of the translation.
   */
  public void SetTranslation(gp_Vec2d V) {
    OCCwrapJavaJNI.gp_Trsf2d_SetTranslation__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V);
  }

  /**
   *  Makes the transformation into a translation from
   *  the point P1 to the point P2.
   */
  public void SetTranslation(gp_Pnt2d P1, gp_Pnt2d P2) {
    OCCwrapJavaJNI.gp_Trsf2d_SetTranslation__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2);
  }

  /**
   *  Replaces the translation vector with V.
   */
  public void SetTranslationPart(gp_Vec2d V) {
    OCCwrapJavaJNI.gp_Trsf2d_SetTranslationPart(swigCPtr, this, gp_Vec2d.getCPtr(V), V);
  }

  /**
   *  Modifies the scale factor.
   */
  public void SetScaleFactor(double S) {
    OCCwrapJavaJNI.gp_Trsf2d_SetScaleFactor(swigCPtr, this, S);
  }

  /**
   *  Returns true if the determinant of the vectorial part of
   *  this transformation is negative..
   */
  public long IsNegative() {
    return OCCwrapJavaJNI.gp_Trsf2d_IsNegative(swigCPtr, this);
  }

  /**
   *  Returns the nature of the transformation. It can be  an
   *  identity transformation, a rotation, a translation, a mirror
   *  (relative to a point or an axis), a scaling transformation,
   *  or a compound transformation.
   */
  public gp_TrsfForm Form() {
    return gp_TrsfForm.swigToEnum(OCCwrapJavaJNI.gp_Trsf2d_Form(swigCPtr, this));
  }

  /**
   *  Returns the scale factor.
   */
  public double ScaleFactor() {
    return OCCwrapJavaJNI.gp_Trsf2d_ScaleFactor(swigCPtr, this);
  }

  /**
   *  Returns the translation part of the transformation's matrix
   */
  public  gp_XY  TranslationPart() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.gp_Trsf2d_TranslationPart(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the vectorial part of the transformation. It is a
   *  2*2 matrix which includes the scale factor.
   */
  public gp_Mat2d VectorialPart() {
    return new gp_Mat2d(OCCwrapJavaJNI.gp_Trsf2d_VectorialPart(swigCPtr, this), true);
  }

  /**
   *  Returns the homogeneous vectorial part of the transformation.
   *  It is a 2*2 matrix which doesn't include the scale factor.
   *  The coefficients of this matrix must be multiplied by the
   *  scale factor to obtain the coefficients of the transformation.
   */
  public  gp_Mat2d  HVectorialPart() {
    gp_Mat2d ret = new gp_Mat2d(OCCwrapJavaJNI.gp_Trsf2d_HVectorialPart(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the angle corresponding to the rotational component
   *  of the transformation matrix (operation opposite to SetRotation()).
   */
  public double RotationPart() {
    return OCCwrapJavaJNI.gp_Trsf2d_RotationPart(swigCPtr, this);
  }

  /**
   *  Returns the coefficients of the transformation's matrix.
   *  It is a 2 rows * 3 columns matrix.
   *  Raises OutOfRange if Row < 1 or Row > 2 or Col < 1 or Col > 3
   */
  public double Value(int Row, int Col) {
    return OCCwrapJavaJNI.gp_Trsf2d_Value(swigCPtr, this, Row, Col);
  }

  public void Invert() {
    OCCwrapJavaJNI.gp_Trsf2d_Invert(swigCPtr, this);
  }

  /**
   *  Computes the reverse transformation.
   *  Raises an exception if the matrix of the transformation
   *  is not inversible, it means that the scale factor is lower
   *  or equal to Resolution from package gp.
   */
  public gp_Trsf2d Inverted() {
    return new gp_Trsf2d(OCCwrapJavaJNI.gp_Trsf2d_Inverted(swigCPtr, this), true);
  }

  public gp_Trsf2d Multiplied( gp_Trsf2d  T) {
    return new gp_Trsf2d(OCCwrapJavaJNI.gp_Trsf2d_Multiplied(swigCPtr, this, gp_Trsf2d.getCPtr(T), T), true);
  }

  /**
   *  Computes the transformation composed from <me> and T.
   *  <me> = <me> * T
   */
  public void Multiply( gp_Trsf2d  T) {
    OCCwrapJavaJNI.gp_Trsf2d_Multiply(swigCPtr, this, gp_Trsf2d.getCPtr(T), T);
  }

  /**
   *  Computes the transformation composed from <me> and T.
   *  <me> = T * <me>
   */
  public void PreMultiply( gp_Trsf2d  T) {
    OCCwrapJavaJNI.gp_Trsf2d_PreMultiply(swigCPtr, this, gp_Trsf2d.getCPtr(T), T);
  }

  public void Power(int N) {
    OCCwrapJavaJNI.gp_Trsf2d_Power(swigCPtr, this, N);
  }

  /**
   *  Computes the following composition of transformations
   *  <me> * <me> * .......* <me>,  N time.
   *  if N = 0 <me> = Identity
   *  if N < 0 <me> = <me>.Inverse() *...........* <me>.Inverse().
   * 
   *  Raises if N < 0 and if the matrix of the transformation not
   *  inversible.
   */
  public gp_Trsf2d Powered(int N) {
    return new gp_Trsf2d(OCCwrapJavaJNI.gp_Trsf2d_Powered(swigCPtr, this, N), true);
  }

  public void Transforms(double[] X, double[] Y) {
    OCCwrapJavaJNI.gp_Trsf2d_Transforms__SWIG_0(swigCPtr, this, X, Y);
  }

  /**
   *  Transforms  a doublet XY with a Trsf2d
   */
  public void Transforms(gp_XY Coord) {
    OCCwrapJavaJNI.gp_Trsf2d_Transforms__SWIG_1(swigCPtr, this, gp_XY.getCPtr(Coord), Coord);
  }

  /**
   *  Sets the coefficients  of the transformation. The
   *  transformation  of the  point  x,y is  the point
   *  x',y' with :
   * 
   *  x' = a11 x + a12 y + a13
   *  y' = a21 x + a22 y + a23
   * 
   *  The method Value(i,j) will return aij.
   *  Raises ConstructionError if the determinant of the aij is null.
   *  If the matrix as not a uniform scale it will be orthogonalized before future using.
   */
  public void SetValues(double a11, double a12, double a13, double a21, double a22, double a23) {
    OCCwrapJavaJNI.gp_Trsf2d_SetValues(swigCPtr, this, a11, a12, a13, a21, a22, a23);
  }

}
