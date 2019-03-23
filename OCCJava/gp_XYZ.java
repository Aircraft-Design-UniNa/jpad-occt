package opencascade;

/**
 *  This class describes a cartesian coordinate entity in
 *  3D space {X,Y,Z}. This entity is used for algebraic
 *  calculation. This entity can be transformed
 *  with a "Trsf" or a  "GTrsf" from package "gp".
 *  It is used in vectorial computations or for holding this type
 *  of information in data structures.
 */
public class gp_XYZ {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_XYZ(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_XYZ(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_XYZ obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_XYZ ptr) { Ptr = ptr; }
    public gp_XYZ AsReference () { return Ptr; }
    public gp_XYZ AsCopy () { return Ptr.MakeCopy(); }
    public gp_XYZ Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_XYZ(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an XYZ object with zero co-ordinates (0,0,0)
   */
  public gp_XYZ() {
    this(OCCwrapJavaJNI.new_gp_XYZ__SWIG_0(), true);
  }

  /**
   *  creates an XYZ with given coordinates
   */
  public gp_XYZ(double X, double Y, double Z) {
    this(OCCwrapJavaJNI.new_gp_XYZ__SWIG_1(X, Y, Z), true);
  }

  /**
   *  For this XYZ object, assigns
   *  the values X, Y and Z to its three coordinates
   */
  public void SetCoord(double X, double Y, double Z) {
    OCCwrapJavaJNI.gp_XYZ_SetCoord__SWIG_0(swigCPtr, this, X, Y, Z);
  }

  /**
   *  modifies the coordinate of range Index
   *  Index = 1 => X is modified
   *  Index = 2 => Y is modified
   *  Index = 3 => Z is modified
   *  Raises OutOfRange if Index != {1, 2, 3}.
   */
  public void SetCoord(int Index, double Xi) {
    OCCwrapJavaJNI.gp_XYZ_SetCoord__SWIG_1(swigCPtr, this, Index, Xi);
  }

  /**
   *  Assigns the given value to the X coordinate
   */
  public void SetX(double X) {
    OCCwrapJavaJNI.gp_XYZ_SetX(swigCPtr, this, X);
  }

  /**
   *  Assigns the given value to the Y coordinate
   */
  public void SetY(double Y) {
    OCCwrapJavaJNI.gp_XYZ_SetY(swigCPtr, this, Y);
  }

  /**
   *  Assigns the given value to the Z coordinate
   */
  public void SetZ(double Z) {
    OCCwrapJavaJNI.gp_XYZ_SetZ(swigCPtr, this, Z);
  }

  /**
   *  returns the coordinate of range Index :
   *  Index = 1 => X is returned
   *  Index = 2 => Y is returned
   *  Index = 3 => Z is returned
   * 
   *  Raises OutOfRange if Index != {1, 2, 3}.
   */
  public double Coord(int Index) {
    return OCCwrapJavaJNI.gp_XYZ_Coord__SWIG_0(swigCPtr, this, Index);
  }

  public double[] ChangeCoord(int theIndex) {return OCCwrapJavaJNI.gp_XYZ_ChangeCoord(swigCPtr, this, theIndex);}

  public void Coord(double[] X, double[] Y, double[] Z) {
    OCCwrapJavaJNI.gp_XYZ_Coord__SWIG_1(swigCPtr, this, X, Y, Z);
  }

  /**
   *  Returns the X coordinate
   */
  public double X() {
    return OCCwrapJavaJNI.gp_XYZ_X(swigCPtr, this);
  }

  /**
   *  Returns the Y coordinate
   */
  public double Y() {
    return OCCwrapJavaJNI.gp_XYZ_Y(swigCPtr, this);
  }

  /**
   *  Returns the Z coordinate
   */
  public double Z() {
    return OCCwrapJavaJNI.gp_XYZ_Z(swigCPtr, this);
  }

  /**
   *  computes Sqrt (X*X + Y*Y + Z*Z) where X, Y and Z are the three coordinates of this XYZ object.
   */
  public double Modulus() {
    return OCCwrapJavaJNI.gp_XYZ_Modulus(swigCPtr, this);
  }

  /**
   *  Computes X*X + Y*Y + Z*Z where X, Y and Z are the three coordinates of this XYZ object.
   */
  public double SquareModulus() {
    return OCCwrapJavaJNI.gp_XYZ_SquareModulus(swigCPtr, this);
  }

  /**
   *  Returns True if he coordinates of this XYZ object are
   *  equal to the respective coordinates Other,
   *  within the specified tolerance Tolerance. I.e.:
   *  abs(<me>.X() - Other.X()) <= Tolerance and
   *  abs(<me>.Y() - Other.Y()) <= Tolerance and
   *  abs(<me>.Z() - Other.Z()) <= Tolerance.
   */
  public long IsEqual( gp_XYZ  Other, double Tolerance) {
    return OCCwrapJavaJNI.gp_XYZ_IsEqual(swigCPtr, this, gp_XYZ.getCPtr(Other), Other, Tolerance);
  }

  /**
   *  <me>.X() = <me>.X() + Other.X()
   *  <me>.Y() = <me>.Y() + Other.Y()
   *  <me>.Z() = <me>.Z() + Other.Z()
   */
  public void Add( gp_XYZ  Other) {
    OCCwrapJavaJNI.gp_XYZ_Add(swigCPtr, this, gp_XYZ.getCPtr(Other), Other);
  }

  /**
   *  new.X() = <me>.X() + Other.X()
   *  new.Y() = <me>.Y() + Other.Y()
   *  new.Z() = <me>.Z() + Other.Z()
   */
  public gp_XYZ Added( gp_XYZ  Other) {
    return new gp_XYZ(OCCwrapJavaJNI.gp_XYZ_Added(swigCPtr, this, gp_XYZ.getCPtr(Other), Other), true);
  }

  /**
   *  <me>.X() = <me>.Y() * Other.Z() - <me>.Z() * Other.Y()
   *  <me>.Y() = <me>.Z() * Other.X() - <me>.X() * Other.Z()
   *  <me>.Z() = <me>.X() * Other.Y() - <me>.Y() * Other.X()
   */
  public void Cross( gp_XYZ  Right) {
    OCCwrapJavaJNI.gp_XYZ_Cross(swigCPtr, this, gp_XYZ.getCPtr(Right), Right);
  }

  /**
   *  new.X() = <me>.Y() * Other.Z() - <me>.Z() * Other.Y()
   *  new.Y() = <me>.Z() * Other.X() - <me>.X() * Other.Z()
   *  new.Z() = <me>.X() * Other.Y() - <me>.Y() * Other.X()
   */
  public gp_XYZ Crossed( gp_XYZ  Right) {
    return new gp_XYZ(OCCwrapJavaJNI.gp_XYZ_Crossed(swigCPtr, this, gp_XYZ.getCPtr(Right), Right), true);
  }

  /**
   *  Computes the magnitude of the cross product between <me> and
   *  Right. Returns || <me> ^ Right ||
   */
  public double CrossMagnitude( gp_XYZ  Right) {
    return OCCwrapJavaJNI.gp_XYZ_CrossMagnitude(swigCPtr, this, gp_XYZ.getCPtr(Right), Right);
  }

  /**
   *  Computes the square magnitude of the cross product between <me> and
   *  Right. Returns || <me> ^ Right ||**2
   */
  public double CrossSquareMagnitude( gp_XYZ  Right) {
    return OCCwrapJavaJNI.gp_XYZ_CrossSquareMagnitude(swigCPtr, this, gp_XYZ.getCPtr(Right), Right);
  }

  /**
   *  Triple vector product
   *  Computes <me> = <me>.Cross(Coord1.Cross(Coord2))
   */
  public void CrossCross( gp_XYZ  Coord1,  gp_XYZ  Coord2) {
    OCCwrapJavaJNI.gp_XYZ_CrossCross(swigCPtr, this, gp_XYZ.getCPtr(Coord1), Coord1, gp_XYZ.getCPtr(Coord2), Coord2);
  }

  /**
   *  Triple vector product
   *  computes New = <me>.Cross(Coord1.Cross(Coord2))
   */
  public gp_XYZ CrossCrossed( gp_XYZ  Coord1,  gp_XYZ  Coord2) {
    return new gp_XYZ(OCCwrapJavaJNI.gp_XYZ_CrossCrossed(swigCPtr, this, gp_XYZ.getCPtr(Coord1), Coord1, gp_XYZ.getCPtr(Coord2), Coord2), true);
  }

  /**
   *  divides <me> by a real.
   */
  public void Divide(double Scalar) {
    OCCwrapJavaJNI.gp_XYZ_Divide(swigCPtr, this, Scalar);
  }

  /**
   *  divides <me> by a real.
   */
  public gp_XYZ Divided(double Scalar) {
    return new gp_XYZ(OCCwrapJavaJNI.gp_XYZ_Divided(swigCPtr, this, Scalar), true);
  }

  /**
   *  computes the scalar product between <me> and Other
   */
  public double Dot( gp_XYZ  Other) {
    return OCCwrapJavaJNI.gp_XYZ_Dot(swigCPtr, this, gp_XYZ.getCPtr(Other), Other);
  }

  /**
   *  computes the triple scalar product
   */
  public double DotCross( gp_XYZ  Coord1,  gp_XYZ  Coord2) {
    return OCCwrapJavaJNI.gp_XYZ_DotCross(swigCPtr, this, gp_XYZ.getCPtr(Coord1), Coord1, gp_XYZ.getCPtr(Coord2), Coord2);
  }

  /**
   *  <me>.X() = <me>.X() * Scalar;
   *  <me>.Y() = <me>.Y() * Scalar;
   *  <me>.Z() = <me>.Z() * Scalar;
   */
  public void Multiply(double Scalar) {
    OCCwrapJavaJNI.gp_XYZ_Multiply__SWIG_0(swigCPtr, this, Scalar);
  }

  public void Multiply( gp_XYZ  Other) {
    OCCwrapJavaJNI.gp_XYZ_Multiply__SWIG_1(swigCPtr, this, gp_XYZ.getCPtr(Other), Other);
  }

  /**
   *  <me>.X() = <me>.X() * Other.X();
   *  <me>.Y() = <me>.Y() * Other.Y();
   *  <me>.Z() = <me>.Z() * Other.Z();
   */
  public void Multiply(gp_Mat Matrix) {
    OCCwrapJavaJNI.gp_XYZ_Multiply__SWIG_2(swigCPtr, this, gp_Mat.getCPtr(Matrix), Matrix);
  }

  /**
   *  New.X() = <me>.X() * Scalar;
   *  New.Y() = <me>.Y() * Scalar;
   *  New.Z() = <me>.Z() * Scalar;
   */
  public gp_XYZ Multiplied(double Scalar) {
    return new gp_XYZ(OCCwrapJavaJNI.gp_XYZ_Multiplied__SWIG_0(swigCPtr, this, Scalar), true);
  }

  public gp_XYZ Multiplied( gp_XYZ  Other) {
    return new gp_XYZ(OCCwrapJavaJNI.gp_XYZ_Multiplied__SWIG_1(swigCPtr, this, gp_XYZ.getCPtr(Other), Other), true);
  }

  /**
   *  new.X() = <me>.X() * Other.X();
   *  new.Y() = <me>.Y() * Other.Y();
   *  new.Z() = <me>.Z() * Other.Z();
   */
  public gp_XYZ Multiplied(gp_Mat Matrix) {
    return new gp_XYZ(OCCwrapJavaJNI.gp_XYZ_Multiplied__SWIG_2(swigCPtr, this, gp_Mat.getCPtr(Matrix), Matrix), true);
  }

  /**
   *  <me>.X() = <me>.X()/ <me>.Modulus()
   *  <me>.Y() = <me>.Y()/ <me>.Modulus()
   *  <me>.Z() = <me>.Z()/ <me>.Modulus()
   *  Raised if <me>.Modulus() <= Resolution from gp
   */
  public void Normalize() {
    OCCwrapJavaJNI.gp_XYZ_Normalize(swigCPtr, this);
  }

  /**
   *  New.X() = <me>.X()/ <me>.Modulus()
   *  New.Y() = <me>.Y()/ <me>.Modulus()
   *  New.Z() = <me>.Z()/ <me>.Modulus()
   *  Raised if <me>.Modulus() <= Resolution from gp
   */
  public gp_XYZ Normalized() {
    return new gp_XYZ(OCCwrapJavaJNI.gp_XYZ_Normalized(swigCPtr, this), true);
  }

  /**
   *  <me>.X() = -<me>.X()
   *  <me>.Y() = -<me>.Y()
   *  <me>.Z() = -<me>.Z()
   */
  public void Reverse() {
    OCCwrapJavaJNI.gp_XYZ_Reverse(swigCPtr, this);
  }

  /**
   *  New.X() = -<me>.X()
   *  New.Y() = -<me>.Y()
   *  New.Z() = -<me>.Z()
   */
  public gp_XYZ Reversed() {
    return new gp_XYZ(OCCwrapJavaJNI.gp_XYZ_Reversed(swigCPtr, this), true);
  }

  /**
   *  <me>.X() = <me>.X() - Other.X()
   *  <me>.Y() = <me>.Y() - Other.Y()
   *  <me>.Z() = <me>.Z() - Other.Z()
   */
  public void Subtract( gp_XYZ  Right) {
    OCCwrapJavaJNI.gp_XYZ_Subtract(swigCPtr, this, gp_XYZ.getCPtr(Right), Right);
  }

  /**
   *  new.X() = <me>.X() - Other.X()
   *  new.Y() = <me>.Y() - Other.Y()
   *  new.Z() = <me>.Z() - Other.Z()
   */
  public gp_XYZ Subtracted( gp_XYZ  Right) {
    return new gp_XYZ(OCCwrapJavaJNI.gp_XYZ_Subtracted(swigCPtr, this, gp_XYZ.getCPtr(Right), Right), true);
  }

  /**
   *  <me> is set to the following linear form :
   *  A1 * XYZ1 + A2 * XYZ2 + A3 * XYZ3 + XYZ4
   */
  public void SetLinearForm(double A1,  gp_XYZ  XYZ1, double A2,  gp_XYZ  XYZ2, double A3,  gp_XYZ  XYZ3,  gp_XYZ  XYZ4) {
    OCCwrapJavaJNI.gp_XYZ_SetLinearForm__SWIG_0(swigCPtr, this, A1, gp_XYZ.getCPtr(XYZ1), XYZ1, A2, gp_XYZ.getCPtr(XYZ2), XYZ2, A3, gp_XYZ.getCPtr(XYZ3), XYZ3, gp_XYZ.getCPtr(XYZ4), XYZ4);
  }

  /**
   *  <me> is set to the following linear form :
   *  A1 * XYZ1 + A2 * XYZ2 + A3 * XYZ3
   */
  public void SetLinearForm(double A1,  gp_XYZ  XYZ1, double A2,  gp_XYZ  XYZ2, double A3,  gp_XYZ  XYZ3) {
    OCCwrapJavaJNI.gp_XYZ_SetLinearForm__SWIG_1(swigCPtr, this, A1, gp_XYZ.getCPtr(XYZ1), XYZ1, A2, gp_XYZ.getCPtr(XYZ2), XYZ2, A3, gp_XYZ.getCPtr(XYZ3), XYZ3);
  }

  /**
   *  <me> is set to the following linear form :
   *  A1 * XYZ1 + A2 * XYZ2 + XYZ3
   */
  public void SetLinearForm(double A1,  gp_XYZ  XYZ1, double A2,  gp_XYZ  XYZ2,  gp_XYZ  XYZ3) {
    OCCwrapJavaJNI.gp_XYZ_SetLinearForm__SWIG_2(swigCPtr, this, A1, gp_XYZ.getCPtr(XYZ1), XYZ1, A2, gp_XYZ.getCPtr(XYZ2), XYZ2, gp_XYZ.getCPtr(XYZ3), XYZ3);
  }

  /**
   *  <me> is set to the following linear form :
   *  A1 * XYZ1 + A2 * XYZ2
   */
  public void SetLinearForm(double A1,  gp_XYZ  XYZ1, double A2,  gp_XYZ  XYZ2) {
    OCCwrapJavaJNI.gp_XYZ_SetLinearForm__SWIG_3(swigCPtr, this, A1, gp_XYZ.getCPtr(XYZ1), XYZ1, A2, gp_XYZ.getCPtr(XYZ2), XYZ2);
  }

  /**
   *  <me> is set to the following linear form :
   *  A1 * XYZ1 + XYZ2
   */
  public void SetLinearForm(double A1,  gp_XYZ  XYZ1,  gp_XYZ  XYZ2) {
    OCCwrapJavaJNI.gp_XYZ_SetLinearForm__SWIG_4(swigCPtr, this, A1, gp_XYZ.getCPtr(XYZ1), XYZ1, gp_XYZ.getCPtr(XYZ2), XYZ2);
  }

  /**
   *  <me> is set to the following linear form :
   *  XYZ1 + XYZ2
   */
  public void SetLinearForm( gp_XYZ  XYZ1,  gp_XYZ  XYZ2) {
    OCCwrapJavaJNI.gp_XYZ_SetLinearForm__SWIG_5(swigCPtr, this, gp_XYZ.getCPtr(XYZ1), XYZ1, gp_XYZ.getCPtr(XYZ2), XYZ2);
  }

}
