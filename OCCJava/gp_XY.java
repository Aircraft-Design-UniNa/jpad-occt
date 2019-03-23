package opencascade;

/**
 *  This class describes a cartesian coordinate entity in 2D
 *  space {X,Y}. This class is non persistent. This entity used
 *  for algebraic calculation. An XY can be transformed with a
 *  Trsf2d or a  GTrsf2d from package gp.
 *  It is used in vectorial computations or for holding this type
 *  of information in data structures.
 */
public class gp_XY {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_XY(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_XY(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_XY obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_XY ptr) { Ptr = ptr; }
    public gp_XY AsReference () { return Ptr; }
    public gp_XY AsCopy () { return Ptr.MakeCopy(); }
    public gp_XY Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_XY(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates XY object with zero coordinates (0,0).
   */
  public gp_XY() {
    this(OCCwrapJavaJNI.new_gp_XY__SWIG_0(), true);
  }

  /**
   *  a number pair defined by the XY coordinates
   */
  public gp_XY(double X, double Y) {
    this(OCCwrapJavaJNI.new_gp_XY__SWIG_1(X, Y), true);
  }

  /**
   *  modifies the coordinate of range Index
   *  Index = 1 => X is modified
   *  Index = 2 => Y is modified
   *  Raises OutOfRange if Index != {1, 2}.
   */
  public void SetCoord(int Index, double Xi) {
    OCCwrapJavaJNI.gp_XY_SetCoord__SWIG_0(swigCPtr, this, Index, Xi);
  }

  /**
   *  For this number pair, assigns
   *  the values X and Y to its coordinates
   */
  public void SetCoord(double X, double Y) {
    OCCwrapJavaJNI.gp_XY_SetCoord__SWIG_1(swigCPtr, this, X, Y);
  }

  /**
   *  Assigns the given value to the X coordinate of this number pair.
   */
  public void SetX(double X) {
    OCCwrapJavaJNI.gp_XY_SetX(swigCPtr, this, X);
  }

  /**
   *  Assigns the given value to the Y  coordinate of this number pair.
   */
  public void SetY(double Y) {
    OCCwrapJavaJNI.gp_XY_SetY(swigCPtr, this, Y);
  }

  /**
   *  returns the coordinate of range Index :
   *  Index = 1 => X is returned
   *  Index = 2 => Y is returned
   *  Raises OutOfRange if Index != {1, 2}.
   */
  public double Coord(int Index) {
    return OCCwrapJavaJNI.gp_XY_Coord__SWIG_0(swigCPtr, this, Index);
  }

  public double[] ChangeCoord(int theIndex) {return OCCwrapJavaJNI.gp_XY_ChangeCoord(swigCPtr, this, theIndex);}

  /**
   *  For this number pair, returns its coordinates X and Y.
   */
  public void Coord(double[] X, double[] Y) {
    OCCwrapJavaJNI.gp_XY_Coord__SWIG_1(swigCPtr, this, X, Y);
  }

  /**
   *  Returns the X coordinate of this number pair.
   */
  public double X() {
    return OCCwrapJavaJNI.gp_XY_X(swigCPtr, this);
  }

  /**
   *  Returns the Y coordinate of this number pair.
   */
  public double Y() {
    return OCCwrapJavaJNI.gp_XY_Y(swigCPtr, this);
  }

  /**
   *  Computes Sqrt (X*X + Y*Y) where X and Y are the two coordinates of this number pair.
   */
  public double Modulus() {
    return OCCwrapJavaJNI.gp_XY_Modulus(swigCPtr, this);
  }

  /**
   *  Computes X*X + Y*Y where X and Y are the two coordinates of this number pair.
   */
  public double SquareModulus() {
    return OCCwrapJavaJNI.gp_XY_SquareModulus(swigCPtr, this);
  }

  /**
   *  Returns true if the coordinates of this number pair are
   *  equal to the respective coordinates of the number pair
   *  Other, within the specified tolerance Tolerance. I.e.:
   *  abs(<me>.X() - Other.X()) <= Tolerance and
   *  abs(<me>.Y() - Other.Y()) <= Tolerance and
   *  computations
   */
  public long IsEqual( gp_XY  Other, double Tolerance) {
    return OCCwrapJavaJNI.gp_XY_IsEqual(swigCPtr, this, gp_XY.getCPtr(Other), Other, Tolerance);
  }

  /**
   *  Computes the sum of this number pair and number pair Other
   *  <me>.X() = <me>.X() + Other.X()
   *  <me>.Y() = <me>.Y() + Other.Y()
   */
  public void Add( gp_XY  Other) {
    OCCwrapJavaJNI.gp_XY_Add(swigCPtr, this, gp_XY.getCPtr(Other), Other);
  }

  /**
   *  Computes the sum of this number pair and number pair Other
   *  new.X() = <me>.X() + Other.X()
   *  new.Y() = <me>.Y() + Other.Y()
   */
  public gp_XY Added( gp_XY  Other) {
    return new gp_XY(OCCwrapJavaJNI.gp_XY_Added(swigCPtr, this, gp_XY.getCPtr(Other), Other), true);
  }

  /**
   *  Real D = <me>.X() * Other.Y() - <me>.Y() * Other.X()
   */
  public double Crossed( gp_XY  Right) {
    return OCCwrapJavaJNI.gp_XY_Crossed(swigCPtr, this, gp_XY.getCPtr(Right), Right);
  }

  /**
   *  computes the magnitude of the cross product between <me> and
   *  Right. Returns || <me> ^ Right ||
   */
  public double CrossMagnitude( gp_XY  Right) {
    return OCCwrapJavaJNI.gp_XY_CrossMagnitude(swigCPtr, this, gp_XY.getCPtr(Right), Right);
  }

  /**
   *  computes the square magnitude of the cross product between <me> and
   *  Right. Returns || <me> ^ Right ||**2
   */
  public double CrossSquareMagnitude( gp_XY  Right) {
    return OCCwrapJavaJNI.gp_XY_CrossSquareMagnitude(swigCPtr, this, gp_XY.getCPtr(Right), Right);
  }

  /**
   *  divides <me> by a real.
   */
  public void Divide(double Scalar) {
    OCCwrapJavaJNI.gp_XY_Divide(swigCPtr, this, Scalar);
  }

  /**
   *  Divides <me> by a real.
   */
  public gp_XY Divided(double Scalar) {
    return new gp_XY(OCCwrapJavaJNI.gp_XY_Divided(swigCPtr, this, Scalar), true);
  }

  /**
   *  Computes the scalar product between <me> and Other
   */
  public double Dot( gp_XY  Other) {
    return OCCwrapJavaJNI.gp_XY_Dot(swigCPtr, this, gp_XY.getCPtr(Other), Other);
  }

  /**
   *  <me>.X() = <me>.X() * Scalar;
   *  <me>.Y() = <me>.Y() * Scalar;
   */
  public void Multiply(double Scalar) {
    OCCwrapJavaJNI.gp_XY_Multiply__SWIG_0(swigCPtr, this, Scalar);
  }

  public void Multiply( gp_XY  Other) {
    OCCwrapJavaJNI.gp_XY_Multiply__SWIG_1(swigCPtr, this, gp_XY.getCPtr(Other), Other);
  }

  /**
   *  <me>.X() = <me>.X() * Other.X();
   *  <me>.Y() = <me>.Y() * Other.Y();
   */
  public void Multiply(gp_Mat2d Matrix) {
    OCCwrapJavaJNI.gp_XY_Multiply__SWIG_2(swigCPtr, this, gp_Mat2d.getCPtr(Matrix), Matrix);
  }

  /**
   *  New.X() = <me>.X() * Scalar;
   *  New.Y() = <me>.Y() * Scalar;
   */
  public gp_XY Multiplied(double Scalar) {
    return new gp_XY(OCCwrapJavaJNI.gp_XY_Multiplied__SWIG_0(swigCPtr, this, Scalar), true);
  }

  public gp_XY Multiplied( gp_XY  Other) {
    return new gp_XY(OCCwrapJavaJNI.gp_XY_Multiplied__SWIG_1(swigCPtr, this, gp_XY.getCPtr(Other), Other), true);
  }

  /**
   *  new.X() = <me>.X() * Other.X();
   *  new.Y() = <me>.Y() * Other.Y();
   */
  public gp_XY Multiplied(gp_Mat2d Matrix) {
    return new gp_XY(OCCwrapJavaJNI.gp_XY_Multiplied__SWIG_2(swigCPtr, this, gp_Mat2d.getCPtr(Matrix), Matrix), true);
  }

  /**
   *  <me>.X() = <me>.X()/ <me>.Modulus()
   *  <me>.Y() = <me>.Y()/ <me>.Modulus()
   *  Raises ConstructionError if <me>.Modulus() <= Resolution from gp
   */
  public void Normalize() {
    OCCwrapJavaJNI.gp_XY_Normalize(swigCPtr, this);
  }

  /**
   *  New.X() = <me>.X()/ <me>.Modulus()
   *  New.Y() = <me>.Y()/ <me>.Modulus()
   *  Raises ConstructionError if <me>.Modulus() <= Resolution from gp
   */
  public gp_XY Normalized() {
    return new gp_XY(OCCwrapJavaJNI.gp_XY_Normalized(swigCPtr, this), true);
  }

  /**
   *  <me>.X() = -<me>.X()
   *  <me>.Y() = -<me>.Y()
   */
  public void Reverse() {
    OCCwrapJavaJNI.gp_XY_Reverse(swigCPtr, this);
  }

  /**
   *  New.X() = -<me>.X()
   *  New.Y() = -<me>.Y()
   */
  public gp_XY Reversed() {
    return new gp_XY(OCCwrapJavaJNI.gp_XY_Reversed(swigCPtr, this), true);
  }

  /**
   *  Computes  the following linear combination and
   *  assigns the result to this number pair:
   *  A1 * XY1 + A2 * XY2
   */
  public void SetLinearForm(double A1,  gp_XY  XY1, double A2,  gp_XY  XY2) {
    OCCwrapJavaJNI.gp_XY_SetLinearForm__SWIG_0(swigCPtr, this, A1, gp_XY.getCPtr(XY1), XY1, A2, gp_XY.getCPtr(XY2), XY2);
  }

  /**
   *  --  Computes  the following linear combination and
   *  assigns the result to this number pair:
   *  A1 * XY1 + A2 * XY2 + XY3
   */
  public void SetLinearForm(double A1,  gp_XY  XY1, double A2,  gp_XY  XY2,  gp_XY  XY3) {
    OCCwrapJavaJNI.gp_XY_SetLinearForm__SWIG_1(swigCPtr, this, A1, gp_XY.getCPtr(XY1), XY1, A2, gp_XY.getCPtr(XY2), XY2, gp_XY.getCPtr(XY3), XY3);
  }

  /**
   *  Computes  the following linear combination and
   *  assigns the result to this number pair:
   *  A1 * XY1 + XY2
   */
  public void SetLinearForm(double A1,  gp_XY  XY1,  gp_XY  XY2) {
    OCCwrapJavaJNI.gp_XY_SetLinearForm__SWIG_2(swigCPtr, this, A1, gp_XY.getCPtr(XY1), XY1, gp_XY.getCPtr(XY2), XY2);
  }

  /**
   *  Computes  the following linear combination and
   *  assigns the result to this number pair:
   *  XY1 + XY2
   */
  public void SetLinearForm( gp_XY  XY1,  gp_XY  XY2) {
    OCCwrapJavaJNI.gp_XY_SetLinearForm__SWIG_3(swigCPtr, this, gp_XY.getCPtr(XY1), XY1, gp_XY.getCPtr(XY2), XY2);
  }

  /**
   *  <me>.X() = <me>.X() - Other.X()
   *  <me>.Y() = <me>.Y() - Other.Y()
   */
  public void Subtract( gp_XY  Right) {
    OCCwrapJavaJNI.gp_XY_Subtract(swigCPtr, this, gp_XY.getCPtr(Right), Right);
  }

  /**
   *  new.X() = <me>.X() - Other.X()
   *  new.Y() = <me>.Y() - Other.Y()
   */
  public gp_XY Subtracted( gp_XY  Right) {
    return new gp_XY(OCCwrapJavaJNI.gp_XY_Subtracted(swigCPtr, this, gp_XY.getCPtr(Right), Right), true);
  }

}
