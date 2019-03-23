package opencascade;

/**
 *  Represents operation of rotation in 3d space as queternion
 *  and implements operations with rotations basing on
 *  quaternion mathematics.
 * 
 *  In addition, provides methods for conversion to and from other
 *  representatons of rotation (3*3 matrix, vector and
 *  angle, Euler angles)
 */
public class gp_Quaternion {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Quaternion(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Quaternion(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Quaternion obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Quaternion ptr) { Ptr = ptr; }
    public gp_Quaternion AsReference () { return Ptr; }
    public gp_Quaternion AsCopy () { return Ptr.MakeCopy(); }
    public gp_Quaternion Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Quaternion(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an identity quaternion
   */
  public gp_Quaternion() {
    this(OCCwrapJavaJNI.new_gp_Quaternion__SWIG_0(), true);
  }

  /**
   *  Creates quaternion directly from component values
   */
  public gp_Quaternion(double x, double y, double z, double w) {
    this(OCCwrapJavaJNI.new_gp_Quaternion__SWIG_1(x, y, z, w), true);
  }

  /**
   *  Creates copy of another quaternion
   */
  public gp_Quaternion( gp_Quaternion  theToCopy) {
    this(OCCwrapJavaJNI.new_gp_Quaternion__SWIG_2(gp_Quaternion.getCPtr(theToCopy), theToCopy), true);
  }

  /**
   *  Creates quaternion representing shortest-arc rotation
   *  operator producing vector theVecTo from vector theVecFrom.
   */
  public gp_Quaternion( gp_Vec  theVecFrom,  gp_Vec  theVecTo) {
    this(OCCwrapJavaJNI.new_gp_Quaternion__SWIG_3(gp_Vec.getCPtr(theVecFrom), theVecFrom, gp_Vec.getCPtr(theVecTo), theVecTo), true);
  }

  /**
   *  Creates quaternion representing shortest-arc rotation
   *  operator producing vector theVecTo from vector theVecFrom.
   *  Additional vector theHelpCrossVec defines preferred direction for
   *  rotation and is used when theVecTo and theVecFrom are directed
   *  oppositely.
   */
  public gp_Quaternion( gp_Vec  theVecFrom,  gp_Vec  theVecTo,  gp_Vec  theHelpCrossVec) {
    this(OCCwrapJavaJNI.new_gp_Quaternion__SWIG_4(gp_Vec.getCPtr(theVecFrom), theVecFrom, gp_Vec.getCPtr(theVecTo), theVecTo, gp_Vec.getCPtr(theHelpCrossVec), theHelpCrossVec), true);
  }

  /**
   *  Creates quaternion representing rotation on angle
   *  theAngle around vector theAxis
   */
  public gp_Quaternion( gp_Vec  theAxis, double theAngle) {
    this(OCCwrapJavaJNI.new_gp_Quaternion__SWIG_5(gp_Vec.getCPtr(theAxis), theAxis, theAngle), true);
  }

  /**
   *  Creates quaternion from rotation matrix 3*3
   *  (which should be orthonormal skew-symmetric matrix)
   */
  public gp_Quaternion( gp_Mat  theMat) {
    this(OCCwrapJavaJNI.new_gp_Quaternion__SWIG_6(gp_Mat.getCPtr(theMat), theMat), true);
  }

  /**
   *  Simple equal test without precision
   */
  public long IsEqual( gp_Quaternion  theOther) {
    return OCCwrapJavaJNI.gp_Quaternion_IsEqual(swigCPtr, this, gp_Quaternion.getCPtr(theOther), theOther);
  }

  /**
   *  Sets quaternion to shortest-arc rotation producing
   *  vector theVecTo from vector theVecFrom.
   *  If vectors theVecFrom and theVecTo are opposite then rotation
   *  axis is computed as theVecFrom ^ (1,0,0) or theVecFrom ^ (0,0,1).
   */
  public void SetRotation( gp_Vec  theVecFrom,  gp_Vec  theVecTo) {
    OCCwrapJavaJNI.gp_Quaternion_SetRotation__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(theVecFrom), theVecFrom, gp_Vec.getCPtr(theVecTo), theVecTo);
  }

  /**
   *  Sets quaternion to shortest-arc rotation producing
   *  vector theVecTo from vector theVecFrom.
   *  If vectors theVecFrom and theVecTo are opposite then rotation
   *  axis is computed as theVecFrom ^ theHelpCrossVec.
   */
  public void SetRotation( gp_Vec  theVecFrom,  gp_Vec  theVecTo,  gp_Vec  theHelpCrossVec) {
    OCCwrapJavaJNI.gp_Quaternion_SetRotation__SWIG_1(swigCPtr, this, gp_Vec.getCPtr(theVecFrom), theVecFrom, gp_Vec.getCPtr(theVecTo), theVecTo, gp_Vec.getCPtr(theHelpCrossVec), theHelpCrossVec);
  }

  /**
   *  Create a unit quaternion from Axis+Angle representation
   */
  public void SetVectorAndAngle( gp_Vec  theAxis, double theAngle) {
    OCCwrapJavaJNI.gp_Quaternion_SetVectorAndAngle(swigCPtr, this, gp_Vec.getCPtr(theAxis), theAxis, theAngle);
  }

  /**
   *  Convert a quaternion to Axis+Angle representation,
   *  preserve the axis direction and angle from -PI to +PI
   */
  public void GetVectorAndAngle(gp_Vec theAxis, double[] theAngle) {
    OCCwrapJavaJNI.gp_Quaternion_GetVectorAndAngle(swigCPtr, this, gp_Vec.getCPtr(theAxis), theAxis, theAngle);
  }

  /**
   *  Create a unit quaternion by rotation matrix
   *  matrix must contain only rotation (not scale or shear)
   * 
   *  For numerical stability we find first the greatest component of quaternion
   *  and than search others from this one
   */
  public void SetMatrix( gp_Mat  theMat) {
    OCCwrapJavaJNI.gp_Quaternion_SetMatrix(swigCPtr, this, gp_Mat.getCPtr(theMat), theMat);
  }

  /**
   *  Returns rotation operation as 3*3 matrix
   */
  public gp_Mat GetMatrix() {
    return new gp_Mat(OCCwrapJavaJNI.gp_Quaternion_GetMatrix(swigCPtr, this), true);
  }

  /**
   *  Create a unit quaternion representing rotation defined
   *  by generalized Euler angles
   */
  public void SetEulerAngles(gp_EulerSequence theOrder, double theAlpha, double theBeta, double theGamma) {
    OCCwrapJavaJNI.gp_Quaternion_SetEulerAngles(swigCPtr, this, theOrder.swigValue(), theAlpha, theBeta, theGamma);
  }

  /**
   *  Returns Euler angles describing current rotation
   */
  public void GetEulerAngles(gp_EulerSequence theOrder, double[] theAlpha, double[] theBeta, double[] theGamma) {
    OCCwrapJavaJNI.gp_Quaternion_GetEulerAngles(swigCPtr, this, theOrder.swigValue(), theAlpha, theBeta, theGamma);
  }

  public void Set(double x, double y, double z, double w) {
    OCCwrapJavaJNI.gp_Quaternion_Set__SWIG_0(swigCPtr, this, x, y, z, w);
  }

  public void Set( gp_Quaternion  theQuaternion) {
    OCCwrapJavaJNI.gp_Quaternion_Set__SWIG_1(swigCPtr, this, gp_Quaternion.getCPtr(theQuaternion), theQuaternion);
  }

  public double X() {
    return OCCwrapJavaJNI.gp_Quaternion_X(swigCPtr, this);
  }

  public double Y() {
    return OCCwrapJavaJNI.gp_Quaternion_Y(swigCPtr, this);
  }

  public double Z() {
    return OCCwrapJavaJNI.gp_Quaternion_Z(swigCPtr, this);
  }

  public double W() {
    return OCCwrapJavaJNI.gp_Quaternion_W(swigCPtr, this);
  }

  /**
   *  Make identity quaternion (zero-rotation)
   */
  public void SetIdent() {
    OCCwrapJavaJNI.gp_Quaternion_SetIdent(swigCPtr, this);
  }

  /**
   *  Reverse direction of rotation (conjugate quaternion)
   */
  public void Reverse() {
    OCCwrapJavaJNI.gp_Quaternion_Reverse(swigCPtr, this);
  }

  /**
   *  Return rotation with reversed direction (conjugated quaternion)
   */
  public gp_Quaternion Reversed() {
    return new gp_Quaternion(OCCwrapJavaJNI.gp_Quaternion_Reversed(swigCPtr, this), true);
  }

  /**
   *  Inverts quaternion (both rotation direction and norm)
   */
  public void Invert() {
    OCCwrapJavaJNI.gp_Quaternion_Invert(swigCPtr, this);
  }

  /**
   *  Return inversed quaternion q^-1
   */
  public gp_Quaternion Inverted() {
    return new gp_Quaternion(OCCwrapJavaJNI.gp_Quaternion_Inverted(swigCPtr, this), true);
  }

  /**
   *  Returns square norm of quaternion
   */
  public double SquareNorm() {
    return OCCwrapJavaJNI.gp_Quaternion_SquareNorm(swigCPtr, this);
  }

  /**
   *  Returns norm of quaternion
   */
  public double Norm() {
    return OCCwrapJavaJNI.gp_Quaternion_Norm(swigCPtr, this);
  }

  /**
   *  Scale all components by quaternion by theScale; note that
   *  rotation is not changed by this operation (except 0-scaling)
   */
  public void Scale(double theScale) {
    OCCwrapJavaJNI.gp_Quaternion_Scale(swigCPtr, this, theScale);
  }

  /**
   *  Returns scaled quaternion
   */
  public gp_Quaternion Scaled(double theScale) {
    return new gp_Quaternion(OCCwrapJavaJNI.gp_Quaternion_Scaled(swigCPtr, this, theScale), true);
  }

  /**
   *  Stabilize quaternion length within 1 - 1/4.
   *  This operation is a lot faster than normalization
   *  and preserve length goes to 0 or infinity
   */
  public void StabilizeLength() {
    OCCwrapJavaJNI.gp_Quaternion_StabilizeLength(swigCPtr, this);
  }

  /**
   *  Scale quaternion that its norm goes to 1.
   *  The appearing of 0 magnitude or near is a error,
   *  so we can be sure that can divide by magnitude
   */
  public void Normalize() {
    OCCwrapJavaJNI.gp_Quaternion_Normalize(swigCPtr, this);
  }

  /**
   *  Returns quaternion scaled so that its norm goes to 1.
   */
  public gp_Quaternion Normalized() {
    return new gp_Quaternion(OCCwrapJavaJNI.gp_Quaternion_Normalized(swigCPtr, this), true);
  }

  /**
   *  Returns quaternion with all components negated.
   *  Note that this operation does not affect neither
   *  rotation operator defined by quaternion nor its norm.
   */
  public gp_Quaternion Negated() {
    return new gp_Quaternion(OCCwrapJavaJNI.gp_Quaternion_Negated(swigCPtr, this), true);
  }

  /**
   *  Makes sum of quaternion components; result is "rotations mix"
   */
  public gp_Quaternion Added( gp_Quaternion  theOther) {
    return new gp_Quaternion(OCCwrapJavaJNI.gp_Quaternion_Added(swigCPtr, this, gp_Quaternion.getCPtr(theOther), theOther), true);
  }

  /**
   *  Makes difference of quaternion components; result is "rotations mix"
   */
  public gp_Quaternion Subtracted( gp_Quaternion  theOther) {
    return new gp_Quaternion(OCCwrapJavaJNI.gp_Quaternion_Subtracted(swigCPtr, this, gp_Quaternion.getCPtr(theOther), theOther), true);
  }

  /**
   *  Multiply function - work the same as Matrices multiplying.
   *  qq' = (cross(v,v') + wv' + w'v, ww' - dot(v,v'))
   *  Result is rotation combination: q' than q (here q=this, q'=theQ).
   *  Notices than:
   *  qq' != q'q;
   *  qq^-1 = q;
   */
  public gp_Quaternion Multiplied( gp_Quaternion  theOther) {
    return new gp_Quaternion(OCCwrapJavaJNI.gp_Quaternion_Multiplied(swigCPtr, this, gp_Quaternion.getCPtr(theOther), theOther), true);
  }

  /**
   *  Adds componnets of other quaternion; result is "rotations mix"
   */
  public void Add( gp_Quaternion  theOther) {
    OCCwrapJavaJNI.gp_Quaternion_Add(swigCPtr, this, gp_Quaternion.getCPtr(theOther), theOther);
  }

  /**
   *  Subtracts componnets of other quaternion; result is "rotations mix"
   */
  public void Subtract( gp_Quaternion  theOther) {
    OCCwrapJavaJNI.gp_Quaternion_Subtract(swigCPtr, this, gp_Quaternion.getCPtr(theOther), theOther);
  }

  /**
   *  Adds rotation by multiplication
   */
  public void Multiply( gp_Quaternion  theOther) {
    OCCwrapJavaJNI.gp_Quaternion_Multiply__SWIG_0(swigCPtr, this, gp_Quaternion.getCPtr(theOther), theOther);
  }

  /**
   *  Computes inner product / scalar product / Dot
   */
  public double Dot( gp_Quaternion  theOther) {
    return OCCwrapJavaJNI.gp_Quaternion_Dot(swigCPtr, this, gp_Quaternion.getCPtr(theOther), theOther);
  }

  /**
   *  Return rotation angle from -PI to PI
   */
  public double GetRotationAngle() {
    return OCCwrapJavaJNI.gp_Quaternion_GetRotationAngle(swigCPtr, this);
  }

  public gp_Vec Multiply( gp_Vec  theVec) {
    return new gp_Vec(OCCwrapJavaJNI.gp_Quaternion_Multiply__SWIG_1(swigCPtr, this, gp_Vec.getCPtr(theVec), theVec), true);
  }

}
