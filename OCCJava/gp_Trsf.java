package opencascade;

/**
 *  Defines a non-persistent transformation in 3D space.
 *  The following transformations are implemented :
 *  . Translation, Rotation, Scale
 *  . Symmetry with respect to a point, a line, a plane.
 *  Complex transformations can be obtained by combining the
 *  previous elementary transformations using the method
 *  Multiply.
 *  The transformations can be represented as follow :
 * 
 *  V1   V2   V3    T       XYZ        XYZ
 *  | a11  a12  a13   a14 |   | x |      | x'|
 *  | a21  a22  a23   a24 |   | y |      | y'|
 *  | a31  a32  a33   a34 |   | z |   =  | z'|
 *  |  0    0    0     1  |   | 1 |      | 1 |
 * 
 *  where {V1, V2, V3} defines the vectorial part of the
 *  transformation and T defines the translation part of the
 *  transformation.
 *  This transformation never change the nature of the objects.
 */
public class gp_Trsf {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Trsf(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Trsf(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Trsf obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Trsf ptr) { Ptr = ptr; }
    public gp_Trsf AsReference () { return Ptr; }
    public gp_Trsf AsCopy () { return Ptr.MakeCopy(); }
    public gp_Trsf Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Trsf(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Returns the identity transformation.
   */
  public gp_Trsf() {
    this(OCCwrapJavaJNI.new_gp_Trsf__SWIG_0(), true);
  }

  /**
   *  Creates  a 3D transformation from the 2D transformation T.
   *  The resulting transformation has a homogeneous
   *  vectorial part, V3, and a translation part, T3, built from T:
   *  a11    a12
   *  0             a13
   *  V3 =    a21    a22    0       T3
   *  =   a23
   *  0    0    1.
   *  0
   *  It also has the same scale factor as T. This
   *  guarantees (by projection) that the transformation
   *  which would be performed by T in a plane (2D space)
   *  is performed by the resulting transformation in the xOy
   *  plane of the 3D space, (i.e. in the plane defined by the
   *  origin (0., 0., 0.) and the vectors DX (1., 0., 0.), and DY
   *  (0., 1., 0.)). The scale factor is applied to the entire space.
   */
  public gp_Trsf(gp_Trsf2d T) {
    this(OCCwrapJavaJNI.new_gp_Trsf__SWIG_1(gp_Trsf2d.getCPtr(T), T), true);
  }

  /**
   *  Makes the transformation into a symmetrical transformation.
   *  P is the center of the symmetry.
   */
  public void SetMirror(gp_Pnt P) {
    OCCwrapJavaJNI.gp_Trsf_SetMirror__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Makes the transformation into a symmetrical transformation.
   *  A1 is the center of the axial symmetry.
   */
  public void SetMirror(gp_Ax1 A1) {
    OCCwrapJavaJNI.gp_Trsf_SetMirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Makes the transformation into a symmetrical transformation.
   *  A2 is the center of the planar symmetry
   *  and defines the plane of symmetry by its origin, "X
   *  Direction" and "Y Direction".
   */
  public void SetMirror(gp_Ax2 A2) {
    OCCwrapJavaJNI.gp_Trsf_SetMirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Changes the transformation into a rotation.
   *  A1 is the rotation axis and Ang is the angular value of the
   *  rotation in radians.
   */
  public void SetRotation(gp_Ax1 A1, double Ang) {
    OCCwrapJavaJNI.gp_Trsf_SetRotation__SWIG_0(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang);
  }

  /**
   *  Changes the transformation into a rotation defined by quaternion.
   *  Note that rotation is performed around origin, i.e.
   *  no translation is involved.
   */
  public void SetRotation(gp_Quaternion R) {
    OCCwrapJavaJNI.gp_Trsf_SetRotation__SWIG_1(swigCPtr, this, gp_Quaternion.getCPtr(R), R);
  }

  /**
   *  Changes the transformation into a scale.
   *  P is the center of the scale and S is the scaling value.
   *  Raises ConstructionError  If <S> is null.
   */
  public void SetScale(gp_Pnt P, double S) {
    OCCwrapJavaJNI.gp_Trsf_SetScale(swigCPtr, this, gp_Pnt.getCPtr(P), P, S);
  }

  /**
   *  Modifies this transformation so that it transforms the
   *  coordinate system defined by FromSystem1 into the
   *  one defined by ToSystem2. After this modification, this
   *  transformation transforms:
   *  -   the origin of FromSystem1 into the origin of ToSystem2,
   *  -   the "X Direction" of FromSystem1 into the "X
   *  Direction" of ToSystem2,
   *  -   the "Y Direction" of FromSystem1 into the "Y
   *  Direction" of ToSystem2, and
   *  -   the "main Direction" of FromSystem1 into the "main
   *  Direction" of ToSystem2.
   *  Warning
   *  When you know the coordinates of a point in one
   *  coordinate system and you want to express these
   *  coordinates in another one, do not use the
   *  transformation resulting from this function. Use the
   *  transformation that results from SetTransformation instead.
   *  SetDisplacement and SetTransformation create
   *  related transformations: the vectorial part of one is the
   *  inverse of the vectorial part of the other.
   */
  public void SetDisplacement(gp_Ax3 FromSystem1, gp_Ax3 ToSystem2) {
    OCCwrapJavaJNI.gp_Trsf_SetDisplacement(swigCPtr, this, gp_Ax3.getCPtr(FromSystem1), FromSystem1, gp_Ax3.getCPtr(ToSystem2), ToSystem2);
  }

  /**
   *  Modifies this transformation so that it transforms the
   *  coordinates of any point, (x, y, z), relative to a source
   *  coordinate system into the coordinates (x', y', z') which
   *  are relative to a target coordinate system, but which
   *  represent the same point
   *  The transformation is from the coordinate
   *  system "FromSystem1" to the coordinate system "ToSystem2".
   *  Example :
   *  In a C++ implementation :
   *  Real x1, y1, z1;  // are the coordinates of a point in the
   *  // local system FromSystem1
   *  Real x2, y2, z2;  // are the coordinates of a point in the
   *  // local system ToSystem2
   *  gp_Pnt P1 (x1, y1, z1)
   *  Trsf T;
   *  T.SetTransformation (FromSystem1, ToSystem2);
   *  gp_Pnt P2 = P1.Transformed (T);
   *  P2.Coord (x2, y2, z2);
   */
  public void SetTransformation(gp_Ax3 FromSystem1, gp_Ax3 ToSystem2) {
    OCCwrapJavaJNI.gp_Trsf_SetTransformation__SWIG_0(swigCPtr, this, gp_Ax3.getCPtr(FromSystem1), FromSystem1, gp_Ax3.getCPtr(ToSystem2), ToSystem2);
  }

  /**
   *  Modifies this transformation so that it transforms the
   *  coordinates of any point, (x, y, z), relative to a source
   *  coordinate system into the coordinates (x', y', z') which
   *  are relative to a target coordinate system, but which
   *  represent the same point
   *  The transformation is from the default coordinate system
   *  {P(0.,0.,0.), VX (1.,0.,0.), VY (0.,1.,0.), VZ (0., 0. ,1.) }
   *  to the local coordinate system defined with the Ax3 ToSystem.
   *  Use in the same way  as the previous method. FromSystem1 is
   *  defaulted to the absolute coordinate system.
   */
  public void SetTransformation(gp_Ax3 ToSystem) {
    OCCwrapJavaJNI.gp_Trsf_SetTransformation__SWIG_1(swigCPtr, this, gp_Ax3.getCPtr(ToSystem), ToSystem);
  }

  /**
   *  Sets transformation by directly specified rotation and translation.
   */
  public void SetTransformation(gp_Quaternion R, gp_Vec T) {
    OCCwrapJavaJNI.gp_Trsf_SetTransformation__SWIG_2(swigCPtr, this, gp_Quaternion.getCPtr(R), R, gp_Vec.getCPtr(T), T);
  }

  /**
   *  Changes the transformation into a translation.
   *  V is the vector of the translation.
   */
  public void SetTranslation(gp_Vec V) {
    OCCwrapJavaJNI.gp_Trsf_SetTranslation__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Makes the transformation into a translation where the translation vector
   *  is the vector (P1, P2) defined from point P1 to point P2.
   */
  public void SetTranslation(gp_Pnt P1, gp_Pnt P2) {
    OCCwrapJavaJNI.gp_Trsf_SetTranslation__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Replaces the translation vector with the vector V.
   */
  public void SetTranslationPart(gp_Vec V) {
    OCCwrapJavaJNI.gp_Trsf_SetTranslationPart(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Modifies the scale factor.
   *  Raises ConstructionError  If S is null.
   */
  public void SetScaleFactor(double S) {
    OCCwrapJavaJNI.gp_Trsf_SetScaleFactor(swigCPtr, this, S);
  }

  public void SetForm(gp_TrsfForm P) {
    OCCwrapJavaJNI.gp_Trsf_SetForm(swigCPtr, this, P.swigValue());
  }

  /**
   *  Sets the coefficients  of the transformation.  The
   *  transformation  of the  point  x,y,z is  the point
   *  x',y',z' with :
   * 
   *  x' = a11 x + a12 y + a13 z + a14
   *  y' = a21 x + a22 y + a23 z + a24
   *  z' = a31 x + a32 y + a33 z + a34
   * 
   *  The method Value(i,j) will return aij.
   *  Raises ConstructionError if the determinant of  the aij is null.
   *  The matrix is orthogonalized before future using.
   */
  public void SetValues(double a11, double a12, double a13, double a14, double a21, double a22, double a23, double a24, double a31, double a32, double a33, double a34) {
    OCCwrapJavaJNI.gp_Trsf_SetValues(swigCPtr, this, a11, a12, a13, a14, a21, a22, a23, a24, a31, a32, a33, a34);
  }

  /**
   *  Returns true if the determinant of the vectorial part of
   *  this transformation is negative.
   */
  public long IsNegative() {
    return OCCwrapJavaJNI.gp_Trsf_IsNegative(swigCPtr, this);
  }

  /**
   *  Returns the nature of the transformation. It can be: an
   *  identity transformation, a rotation, a translation, a mirror
   *  transformation (relative to a point, an axis or a plane), a
   *  scaling transformation, or a compound transformation.
   */
  public gp_TrsfForm Form() {
    return gp_TrsfForm.swigToEnum(OCCwrapJavaJNI.gp_Trsf_Form(swigCPtr, this));
  }

  /**
   *  Returns the scale factor.
   */
  public double ScaleFactor() {
    return OCCwrapJavaJNI.gp_Trsf_ScaleFactor(swigCPtr, this);
  }

  /**
   *  Returns the translation part of the transformation's matrix
   */
  public  gp_XYZ  TranslationPart() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.gp_Trsf_TranslationPart(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the boolean True if there is non-zero rotation.
   *  In the presence of rotation, the output parameters store the axis
   *  and the angle of rotation. The method always returns positive
   *  value "theAngle", i.e., 0. < theAngle <= PI.
   *  Note that this rotation is defined only by the vectorial part of
   *  the transformation; generally you would need to check also the
   *  translational part to obtain the axis (gp_Ax1) of rotation.
   */
  public long GetRotation(gp_XYZ theAxis, double[] theAngle) {
    return OCCwrapJavaJNI.gp_Trsf_GetRotation__SWIG_0(swigCPtr, this, gp_XYZ.getCPtr(theAxis), theAxis, theAngle);
  }

  /**
   *  Returns quaternion representing rotational part of the transformation.
   */
  public gp_Quaternion GetRotation() {
    return new gp_Quaternion(OCCwrapJavaJNI.gp_Trsf_GetRotation__SWIG_1(swigCPtr, this), true);
  }

  /**
   *  Returns the vectorial part of the transformation. It is
   *  a 3*3 matrix which includes the scale factor.
   */
  public gp_Mat VectorialPart() {
    return new gp_Mat(OCCwrapJavaJNI.gp_Trsf_VectorialPart(swigCPtr, this), true);
  }

  /**
   *  Computes the homogeneous vectorial part of the transformation.
   *  It is a 3*3 matrix which doesn't include the scale factor.
   *  In other words, the vectorial part of this transformation is equal
   *  to its homogeneous vectorial part, multiplied by the scale factor.
   *  The coefficients of this matrix must be multiplied by the
   *  scale factor to obtain the coefficients of the transformation.
   */
  public  gp_Mat  HVectorialPart() {
    gp_Mat ret = new gp_Mat(OCCwrapJavaJNI.gp_Trsf_HVectorialPart(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the coefficients of the transformation's matrix.
   *  It is a 3 rows * 4 columns matrix.
   *  This coefficient includes the scale factor.
   *  Raises OutOfRanged if Row < 1 or Row > 3 or Col < 1 or Col > 4
   */
  public double Value(int Row, int Col) {
    return OCCwrapJavaJNI.gp_Trsf_Value(swigCPtr, this, Row, Col);
  }

  public void Invert() {
    OCCwrapJavaJNI.gp_Trsf_Invert(swigCPtr, this);
  }

  /**
   *  Computes the reverse transformation
   *  Raises an exception if the matrix of the transformation
   *  is not inversible, it means that the scale factor is lower
   *  or equal to Resolution from package gp.
   *  Computes the transformation composed with T and  <me>.
   *  In a C++ implementation you can also write Tcomposed = <me> * T.
   *  Example :
   *  Trsf T1, T2, Tcomp; ...............
   *  Tcomp = T2.Multiplied(T1);         // or   (Tcomp = T2 * T1)
   *  Pnt P1(10.,3.,4.);
   *  Pnt P2 = P1.Transformed(Tcomp);    //using Tcomp
   *  Pnt P3 = P1.Transformed(T1);       //using T1 then T2
   *  P3.Transform(T2);                  // P3 = P2 !!!
   */
  public gp_Trsf Inverted() {
    return new gp_Trsf(OCCwrapJavaJNI.gp_Trsf_Inverted(swigCPtr, this), true);
  }

  public gp_Trsf Multiplied( gp_Trsf  T) {
    return new gp_Trsf(OCCwrapJavaJNI.gp_Trsf_Multiplied(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

  /**
   *  Computes the transformation composed with <me> and T.
   *  <me> = <me> * T
   */
  public void Multiply( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_Trsf_Multiply(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Computes the transformation composed with <me> and T.
   *  <me> = T * <me>
   */
  public void PreMultiply( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_Trsf_PreMultiply(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  public void Power(int N) {
    OCCwrapJavaJNI.gp_Trsf_Power(swigCPtr, this, N);
  }

  /**
   *  Computes the following composition of transformations
   *  <me> * <me> * .......* <me>, N time.
   *  if N = 0 <me> = Identity
   *  if N < 0 <me> = <me>.Inverse() *...........* <me>.Inverse().
   * 
   *  Raises if N < 0 and if the matrix of the transformation not
   *  inversible.
   */
  public gp_Trsf Powered(int N) {
    return new gp_Trsf(OCCwrapJavaJNI.gp_Trsf_Powered(swigCPtr, this, N), true);
  }

  public void Transforms(double[] X, double[] Y, double[] Z) {
    OCCwrapJavaJNI.gp_Trsf_Transforms__SWIG_0(swigCPtr, this, X, Y, Z);
  }

  /**
   *  Transformation of a triplet XYZ with a Trsf
   */
  public void Transforms(gp_XYZ Coord) {
    OCCwrapJavaJNI.gp_Trsf_Transforms__SWIG_1(swigCPtr, this, gp_XYZ.getCPtr(Coord), Coord);
  }

}
