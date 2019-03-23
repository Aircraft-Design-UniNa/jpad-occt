package opencascade;

/**
 *  The class Transformation allows to create Translation,
 *  Rotation, Symmetry, Scaling and complex transformations
 *  obtained by combination of the previous elementary
 *  transformations.
 *  The Transformation class can also be used to
 *  construct complex transformations by combining
 *  these elementary transformations.
 *  However, these transformations can never change
 *  the type of an object. For example, the projection
 *  transformation can change a circle into an ellipse,
 *  and therefore change the real type of the object.
 *  Such a transformation is forbidden in this
 *  environment and cannot be a Geom2d_Transformation.
 *  The transformation can be represented as follow :
 * 
 *  V1   V2     T
 *  | a11  a12    a14 |   | x |      | x'|
 *  | a21  a22    a24 |   | y |      | y'|
 *  |  0    0      1  |   | 1 |      | 1 |
 * 
 *  where {V1, V2} defines the vectorial part of the
 *  transformation and T defines the translation part of
 *  the transformation.
 *  - Geom2d_Transformation transformations provide
 *  the same kind of "geometric" services as
 *  gp_Trsf2d ones but have more complex data
 *  structures. The geometric objects provided by the
 *  Geom2d package use gp_Trsf2d transformations
 *  in the syntaxes Transform and Transformed.
 *  - Geom2d_Transformation transformations are
 *  used in a context where they can be shared by
 *  several objects contained inside a common data structure.
 */
public class Geom2d_Transformation extends Standard_Transient {
  Geom2d_Transformation(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates an identity transformation.
   */
  public Geom2d_Transformation() {
    this(OCCwrapJavaJNI.new_Geom2d_Transformation__SWIG_0(), true);
  }

  /**
   *  Creates a persistent copy of T.
   */
  public Geom2d_Transformation( gp_Trsf2d  T) {
    this(OCCwrapJavaJNI.new_Geom2d_Transformation__SWIG_1(gp_Trsf2d.getCPtr(T), T), true);
  }

  /**
   *  Makes the transformation into a symmetrical transformation
   *  with respect to a point P.
   *  P is the center of the symmetry.
   */
  public void SetMirror( gp_Pnt2d  P) {
    OCCwrapJavaJNI.Geom2d_Transformation_SetMirror__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Makes the transformation into a symmetrical transformation
   *  with respect to an axis A.
   *  A is the center of the axial symmetry.
   */
  public void SetMirror( gp_Ax2d  A) {
    OCCwrapJavaJNI.Geom2d_Transformation_SetMirror__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Assigns to this transformation the geometric
   *  properties of a rotation at angle Ang (in radians) about point P.
   */
  public void SetRotation( gp_Pnt2d  P, double Ang) {
    OCCwrapJavaJNI.Geom2d_Transformation_SetRotation(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang);
  }

  /**
   *  Makes the transformation into a scale. P is the center of
   *  the scale and S is the scaling value.
   */
  public void SetScale( gp_Pnt2d  P, double S) {
    OCCwrapJavaJNI.Geom2d_Transformation_SetScale(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S);
  }

  /**
   *  Makes a transformation allowing passage from the coordinate
   *  system "FromSystem1" to the coordinate system "ToSystem2".
   */
  public void SetTransformation( gp_Ax2d  FromSystem1,  gp_Ax2d  ToSystem2) {
    OCCwrapJavaJNI.Geom2d_Transformation_SetTransformation__SWIG_0(swigCPtr, this, gp_Ax2d.getCPtr(FromSystem1), FromSystem1, gp_Ax2d.getCPtr(ToSystem2), ToSystem2);
  }

  /**
   *  Makes the transformation allowing passage from the basic
   *  coordinate system
   *  {P(0.,0.,0.), VX (1.,0.,0.), VY (0.,1.,0.)}
   *  to the local coordinate system defined with the Ax2d ToSystem.
   */
  public void SetTransformation( gp_Ax2d  ToSystem) {
    OCCwrapJavaJNI.Geom2d_Transformation_SetTransformation__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(ToSystem), ToSystem);
  }

  /**
   *  Makes the transformation into a translation.
   *  V is the vector of the translation.
   */
  public void SetTranslation( gp_Vec2d  V) {
    OCCwrapJavaJNI.Geom2d_Transformation_SetTranslation__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V);
  }

  /**
   *  Makes the transformation into a translation from the point
   *  P1 to the point P2.
   */
  public void SetTranslation( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    OCCwrapJavaJNI.Geom2d_Transformation_SetTranslation__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2);
  }

  /**
   *  Makes the transformation into a transformation T from
   *  package gp.
   */
  public void SetTrsf2d( gp_Trsf2d  T) {
    OCCwrapJavaJNI.Geom2d_Transformation_SetTrsf2d(swigCPtr, this, gp_Trsf2d.getCPtr(T), T);
  }

  /**
   *  Checks whether this transformation is an indirect
   *  transformation: returns true if the determinant of the
   *  matrix of the vectorial part of the transformation is less than 0.
   */
  public long IsNegative() {
    return OCCwrapJavaJNI.Geom2d_Transformation_IsNegative(swigCPtr, this);
  }

  /**
   *  Returns the nature of this transformation as a value
   *  of the gp_TrsfForm enumeration.
   *  Returns the nature of the transformation. It can be
   *  Identity, Rotation, Translation, PntMirror, Ax1Mirror,
   *  Scale, CompoundTrsf
   */
  public gp_TrsfForm Form() {
    return gp_TrsfForm.swigToEnum(OCCwrapJavaJNI.Geom2d_Transformation_Form(swigCPtr, this));
  }

  /**
   *  Returns the scale value of the transformation.
   */
  public double ScaleFactor() {
    return OCCwrapJavaJNI.Geom2d_Transformation_ScaleFactor(swigCPtr, this);
  }

  /**
   *  Converts this transformation into a gp_Trsf2d transformation.
   *  Returns a non persistent copy of <me>.
   *  -C++: return const&
   */
  public gp_Trsf2d Trsf2d() {
    return new gp_Trsf2d(OCCwrapJavaJNI.Geom2d_Transformation_Trsf2d(swigCPtr, this), true);
  }

  /**
   *  Returns the coefficients of the global matrix of tranformation.
   *  It is a 2 rows X 3 columns matrix.
   * 
   *  Raised if  Row < 1 or Row > 2  or  Col < 1 or Col > 2
   * 
   *  Computes the reverse transformation.
   */
  public double Value(int Row, int Col) {
    return OCCwrapJavaJNI.Geom2d_Transformation_Value(swigCPtr, this, Row, Col);
  }

  /**
   *  Computes the inverse of this transformation.
   *  and  assigns the result to this transformatio
   * 
   *  Raised if the the transformation is singular. This means that
   *  the ScaleFactor is lower or equal to Resolution from
   *  package gp.
   */
  public void Invert() {
    OCCwrapJavaJNI.Geom2d_Transformation_Invert(swigCPtr, this);
  }

  public  Geom2d_Transformation  Inverted() {
    return new Geom2d_Transformation ( OCCwrapJavaJNI.Geom2d_Transformation_Inverted(swigCPtr, this), true );
  }

  public  Geom2d_Transformation  Multiplied( Geom2d_Transformation  Other) {
    return new Geom2d_Transformation ( OCCwrapJavaJNI.Geom2d_Transformation_Multiplied(swigCPtr, this,  Geom2d_Transformation.getCPtr(Other) , Other), true );
  }

  /**
   *  Computes the transformation composed with Other and <me> .
   *  <me> = <me> * Other.
   * 
   *  Computes the following composition of transformations
   *  if N > 0  <me> * <me> * .......* <me>.
   *  if N = 0  Identity
   *  if N < 0  <me>.Invert() * .........* <me>.Invert()
   */
  public void Multiply( Geom2d_Transformation  Other) {
    OCCwrapJavaJNI.Geom2d_Transformation_Multiply(swigCPtr, this,  Geom2d_Transformation.getCPtr(Other) , Other);
  }

  /**
   *  Raised if N < 0 and if the transformation is not inversible
   */
  public void Power(int N) {
    OCCwrapJavaJNI.Geom2d_Transformation_Power(swigCPtr, this, N);
  }

  public  Geom2d_Transformation  Powered(int N) {
    return new Geom2d_Transformation ( OCCwrapJavaJNI.Geom2d_Transformation_Powered(swigCPtr, this, N), true );
  }

  /**
   *  Computes the matrix of the transformation composed with
   *  <me> and Other.     <me> = Other * <me>
   */
  public void PreMultiply( Geom2d_Transformation  Other) {
    OCCwrapJavaJNI.Geom2d_Transformation_PreMultiply(swigCPtr, this,  Geom2d_Transformation.getCPtr(Other) , Other);
  }

  /**
   *  Applies the transformation <me> to the triplet {X, Y}.
   */
  public void Transforms(double[] X, double[] Y) {
    OCCwrapJavaJNI.Geom2d_Transformation_Transforms(swigCPtr, this, X, Y);
  }

  public  Geom2d_Transformation  Copy() {
    return new Geom2d_Transformation ( OCCwrapJavaJNI.Geom2d_Transformation_Copy(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom2d_Transformation_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Transformation_get_type_descriptor(), true );
  }

  public static  Geom2d_Transformation  DownCast( Standard_Transient  T) {
    return new Geom2d_Transformation ( OCCwrapJavaJNI.Geom2d_Transformation_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Transformation_TypeOf(), true );
  }

}
