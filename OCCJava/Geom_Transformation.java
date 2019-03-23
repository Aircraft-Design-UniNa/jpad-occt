package opencascade;

/**
 *  Describes how to construct the following elementary transformations
 *  - translations,
 *  - rotations,
 *  - symmetries,
 *  - scales.
 *  The Transformation class can also be used to
 *  construct complex transformations by combining these
 *  elementary transformations.
 *  However, these transformations can never change
 *  the type of an object. For example, the projection
 *  transformation can change a circle into an ellipse, and
 *  therefore change the real type of the object. Such a
 *  transformation is forbidden in this environment and
 *  cannot be a Geom_Transformation.
 *  The transformation can be represented as follow :
 * 
 *  V1   V2   V3    T
 *  | a11  a12  a13   a14 |   | x |      | x'|
 *  | a21  a22  a23   a24 |   | y |      | y'|
 *  | a31  a32  a33   a34 |   | z |   =  | z'|
 *  |  0    0    0     1  |   | 1 |      | 1 |
 * 
 *  where {V1, V2, V3} defines the vectorial part of the
 *  transformation and T defines the translation part of
 *  the transformation.
 *  Note: Geom_Transformation transformations
 *  provide the same kind of "geometric" services as
 *  gp_Trsf ones but have more complex data structures.
 *  The geometric objects provided by the Geom
 *  package use gp_Trsf transformations in the syntaxes
 *  Transform and Transformed.
 *  Geom_Transformation transformations are used in
 *  a context where they can be shared by several
 *  objects contained inside a common data structure.
 */
public class Geom_Transformation extends Standard_Transient {
  Geom_Transformation(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_Transformation_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Transformation_get_type_descriptor(), true );
  }

  /**
   *  Creates an identity transformation.
   */
  public Geom_Transformation() {
    this(OCCwrapJavaJNI.new_Geom_Transformation__SWIG_0(), true);
  }

  /**
   *  Creates a transient copy of T.
   */
  public Geom_Transformation( gp_Trsf  T) {
    this(OCCwrapJavaJNI.new_Geom_Transformation__SWIG_1(gp_Trsf.getCPtr(T), T), true);
  }

  /**
   *  Makes the transformation into a symmetrical transformation
   *  with respect to a point P.
   *  P is the center of the symmetry.
   */
  public void SetMirror( gp_Pnt  thePnt) {
    OCCwrapJavaJNI.Geom_Transformation_SetMirror__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(thePnt), thePnt);
  }

  /**
   *  Makes the transformation into a symmetrical transformation
   *  with respect to an axis A1.
   *  A1 is the center of the axial symmetry.
   */
  public void SetMirror( gp_Ax1  theA1) {
    OCCwrapJavaJNI.Geom_Transformation_SetMirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(theA1), theA1);
  }

  /**
   *  Makes the transformation into a symmetrical transformation
   *  with respect to a plane.  The plane of the symmetry is
   *  defined with the axis placement A2. It is the plane
   *  (Location, XDirection, YDirection).
   */
  public void SetMirror( gp_Ax2  theA2) {
    OCCwrapJavaJNI.Geom_Transformation_SetMirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(theA2), theA2);
  }

  /**
   *  Makes the transformation into a rotation.
   *  A1 is the axis rotation and Ang is the angular value
   *  of the rotation in radians.
   */
  public void SetRotation( gp_Ax1  theA1, double theAng) {
    OCCwrapJavaJNI.Geom_Transformation_SetRotation(swigCPtr, this, gp_Ax1.getCPtr(theA1), theA1, theAng);
  }

  /**
   *  Makes the transformation into a scale. P is the center of
   *  the scale and S is the scaling value.
   */
  public void SetScale( gp_Pnt  thePnt, double theScale) {
    OCCwrapJavaJNI.Geom_Transformation_SetScale(swigCPtr, this, gp_Pnt.getCPtr(thePnt), thePnt, theScale);
  }

  /**
   *  Makes a transformation allowing passage from the coordinate
   *  system "FromSystem1" to the coordinate system "ToSystem2".
   *  Example :
   *  In a C++ implementation :
   *  Real x1, y1, z1;  // are the coordinates of a point in the
   *  // local system FromSystem1
   *  Real x2, y2, z2;  // are the coordinates of a point in the
   *  // local system ToSystem2
   *  gp_Pnt P1 (x1, y1, z1)
   *  Geom_Transformation T;
   *  T.SetTransformation (FromSystem1, ToSystem2);
   *  gp_Pnt P2 = P1.Transformed (T);
   *  P2.Coord (x2, y2, z2);
   */
  public void SetTransformation( gp_Ax3  theFromSystem1,  gp_Ax3  theToSystem2) {
    OCCwrapJavaJNI.Geom_Transformation_SetTransformation__SWIG_0(swigCPtr, this, gp_Ax3.getCPtr(theFromSystem1), theFromSystem1, gp_Ax3.getCPtr(theToSystem2), theToSystem2);
  }

  /**
   *  Makes the transformation allowing passage from the basic
   *  coordinate system
   *  {P(0.,0.,0.), VX (1.,0.,0.), VY (0.,1.,0.), VZ (0., 0. ,1.) }
   *  to the local coordinate system defined with the Ax2 ToSystem.
   *  Same utilisation as the previous method. FromSystem1 is
   *  defaulted to the absolute coordinate system.
   */
  public void SetTransformation( gp_Ax3  theToSystem) {
    OCCwrapJavaJNI.Geom_Transformation_SetTransformation__SWIG_1(swigCPtr, this, gp_Ax3.getCPtr(theToSystem), theToSystem);
  }

  /**
   *  Makes the transformation into a translation.
   *  V is the vector of the translation.
   */
  public void SetTranslation( gp_Vec  theVec) {
    OCCwrapJavaJNI.Geom_Transformation_SetTranslation__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(theVec), theVec);
  }

  /**
   *  Makes the transformation into a translation from the point
   *  P1 to the point P2.
   */
  public void SetTranslation( gp_Pnt  P1,  gp_Pnt  P2) {
    OCCwrapJavaJNI.Geom_Transformation_SetTranslation__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Converts the gp_Trsf transformation T into this transformation.
   */
  public void SetTrsf( gp_Trsf  theTrsf) {
    OCCwrapJavaJNI.Geom_Transformation_SetTrsf(swigCPtr, this, gp_Trsf.getCPtr(theTrsf), theTrsf);
  }

  /**
   *  Checks whether this transformation is an indirect
   *  transformation: returns true if the determinant of the
   *  matrix of the vectorial part of the transformation is less than 0.
   */
  public long IsNegative() {
    return OCCwrapJavaJNI.Geom_Transformation_IsNegative(swigCPtr, this);
  }

  /**
   *  Returns the nature of this transformation as a value
   *  of the gp_TrsfForm enumeration.
   */
  public gp_TrsfForm Form() {
    return gp_TrsfForm.swigToEnum(OCCwrapJavaJNI.Geom_Transformation_Form(swigCPtr, this));
  }

  /**
   *  Returns the scale value of the transformation.
   */
  public double ScaleFactor() {
    return OCCwrapJavaJNI.Geom_Transformation_ScaleFactor(swigCPtr, this);
  }

  /**
   *  Returns a non transient copy of <me>.
   */
  public  gp_Trsf  Trsf() {
    gp_Trsf ret = new gp_Trsf(OCCwrapJavaJNI.Geom_Transformation_Trsf(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the coefficients of the global matrix of transformation.
   *  It is a 3 rows X 4 columns matrix.
   * 
   *  Raised if  Row < 1 or Row > 3  or  Col < 1 or Col > 4
   */
  public double Value(int theRow, int theCol) {
    return OCCwrapJavaJNI.Geom_Transformation_Value(swigCPtr, this, theRow, theCol);
  }

  /**
   *  Raised if the the transformation is singular. This means that
   *  the ScaleFactor is lower or equal to Resolution from
   *  package gp.
   */
  public void Invert() {
    OCCwrapJavaJNI.Geom_Transformation_Invert(swigCPtr, this);
  }

  public  Geom_Transformation  Inverted() {
    return new Geom_Transformation ( OCCwrapJavaJNI.Geom_Transformation_Inverted(swigCPtr, this), true );
  }

  public  Geom_Transformation  Multiplied( Geom_Transformation  Other) {
    return new Geom_Transformation ( OCCwrapJavaJNI.Geom_Transformation_Multiplied(swigCPtr, this,  Geom_Transformation.getCPtr(Other) , Other), true );
  }

  /**
   *  Computes the transformation composed with Other and <me> .
   *  <me> = <me> * Other.
   */
  public void Multiply( Geom_Transformation  theOther) {
    OCCwrapJavaJNI.Geom_Transformation_Multiply(swigCPtr, this,  Geom_Transformation.getCPtr(theOther) , theOther);
  }

  /**
   *  Computes the following composition of transformations
   *  if N > 0  <me> * <me> * .......* <me>.
   *  if N = 0  Identity
   *  if N < 0  <me>.Invert() * .........* <me>.Invert()
   * 
   *  Raised if N < 0 and if the transformation is not inversible
   */
  public void Power(int N) {
    OCCwrapJavaJNI.Geom_Transformation_Power(swigCPtr, this, N);
  }

  public  Geom_Transformation  Powered(int N) {
    return new Geom_Transformation ( OCCwrapJavaJNI.Geom_Transformation_Powered(swigCPtr, this, N), true );
  }

  /**
   *  Computes the matrix of the transformation composed with
   *  <me> and Other.     <me> = Other * <me>
   */
  public void PreMultiply( Geom_Transformation  Other) {
    OCCwrapJavaJNI.Geom_Transformation_PreMultiply(swigCPtr, this,  Geom_Transformation.getCPtr(Other) , Other);
  }

  /**
   *  Applies the transformation <me> to the triplet {X, Y, Z}.
   */
  public void Transforms(double[] theX, double[] theY, double[] theZ) {
    OCCwrapJavaJNI.Geom_Transformation_Transforms(swigCPtr, this, theX, theY, theZ);
  }

  public  Geom_Transformation  Copy() {
    return new Geom_Transformation ( OCCwrapJavaJNI.Geom_Transformation_Copy(swigCPtr, this), true );
  }

  public static  Geom_Transformation  DownCast( Standard_Transient  T) {
    return new Geom_Transformation ( OCCwrapJavaJNI.Geom_Transformation_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Transformation_TypeOf(), true );
  }

}
