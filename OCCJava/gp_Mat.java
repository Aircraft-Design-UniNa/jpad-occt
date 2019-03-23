package opencascade;

/**
 *  Describes a three column, three row matrix. This sort of
 *  object is used in various vectorial or matrix computations.
 */
public class gp_Mat {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Mat(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Mat(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Mat obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Mat ptr) { Ptr = ptr; }
    public gp_Mat AsReference () { return Ptr; }
    public gp_Mat AsCopy () { return Ptr.MakeCopy(); }
    public gp_Mat Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Mat(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  creates  a matrix with null coefficients.
   */
  public gp_Mat() {
    this(OCCwrapJavaJNI.new_gp_Mat__SWIG_0(), true);
  }

  public gp_Mat(double a11, double a12, double a13, double a21, double a22, double a23, double a31, double a32, double a33) {
    this(OCCwrapJavaJNI.new_gp_Mat__SWIG_1(a11, a12, a13, a21, a22, a23, a31, a32, a33), true);
  }

  /**
   *  Creates a matrix.
   *  Col1, Col2, Col3 are the 3 columns of the matrix.
   */
  public gp_Mat( gp_XYZ  Col1,  gp_XYZ  Col2,  gp_XYZ  Col3) {
    this(OCCwrapJavaJNI.new_gp_Mat__SWIG_2(gp_XYZ.getCPtr(Col1), Col1, gp_XYZ.getCPtr(Col2), Col2, gp_XYZ.getCPtr(Col3), Col3), true);
  }

  /**
   *  Assigns the three coordinates of Value to the column of index
   *  Col of this matrix.
   *  Raises OutOfRange if Col < 1 or Col > 3.
   */
  public void SetCol(int Col,  gp_XYZ  Value) {
    OCCwrapJavaJNI.gp_Mat_SetCol(swigCPtr, this, Col, gp_XYZ.getCPtr(Value), Value);
  }

  /**
   *  Assigns the number triples Col1, Col2, Col3 to the three
   *  columns of this matrix.
   */
  public void SetCols( gp_XYZ  Col1,  gp_XYZ  Col2,  gp_XYZ  Col3) {
    OCCwrapJavaJNI.gp_Mat_SetCols(swigCPtr, this, gp_XYZ.getCPtr(Col1), Col1, gp_XYZ.getCPtr(Col2), Col2, gp_XYZ.getCPtr(Col3), Col3);
  }

  /**
   *  Modifies the matrix  M so that applying it to any number
   *  triple (X, Y, Z) produces the same result as the cross
   *  product of Ref and the number triple (X, Y, Z):
   *  i.e.: M * {X,Y,Z}t = Ref.Cross({X, Y ,Z})
   *  this matrix is anti symmetric. To apply this matrix to the
   *  triplet  {XYZ} is the same as to do the cross product between the
   *  triplet Ref and the triplet {XYZ}.
   *  Note: this matrix is anti-symmetric.
   */
  public void SetCross( gp_XYZ  Ref) {
    OCCwrapJavaJNI.gp_Mat_SetCross(swigCPtr, this, gp_XYZ.getCPtr(Ref), Ref);
  }

  /**
   *  Modifies the main diagonal of the matrix.
   *  <me>.Value (1, 1) = X1
   *  <me>.Value (2, 2) = X2
   *  <me>.Value (3, 3) = X3
   *  The other coefficients of the matrix are not modified.
   */
  public void SetDiagonal(double X1, double X2, double X3) {
    OCCwrapJavaJNI.gp_Mat_SetDiagonal(swigCPtr, this, X1, X2, X3);
  }

  /**
   *  Modifies this matrix so that applying it to any number
   *  triple (X, Y, Z) produces the same result as the scalar
   *  product of Ref and the number triple (X, Y, Z):
   *  this * (X,Y,Z) = Ref.(X,Y,Z)
   *  Note: this matrix is symmetric.
   */
  public void SetDot( gp_XYZ  Ref) {
    OCCwrapJavaJNI.gp_Mat_SetDot(swigCPtr, this, gp_XYZ.getCPtr(Ref), Ref);
  }

  /**
   *  Modifies this matrix so that it represents the Identity matrix.
   */
  public void SetIdentity() {
    OCCwrapJavaJNI.gp_Mat_SetIdentity(swigCPtr, this);
  }

  /**
   *  Modifies this matrix so that it represents a rotation. Ang is the angular value in
   *  radians and the XYZ axis gives the direction of the
   *  rotation.
   *  Raises ConstructionError if XYZ.Modulus() <= Resolution()
   */
  public void SetRotation( gp_XYZ  Axis, double Ang) {
    OCCwrapJavaJNI.gp_Mat_SetRotation(swigCPtr, this, gp_XYZ.getCPtr(Axis), Axis, Ang);
  }

  /**
   *  Assigns the three coordinates of Value to the row of index
   *  Row of this matrix. Raises OutOfRange if Row < 1 or Row > 3.
   */
  public void SetRow(int Row,  gp_XYZ  Value) {
    OCCwrapJavaJNI.gp_Mat_SetRow(swigCPtr, this, Row, gp_XYZ.getCPtr(Value), Value);
  }

  /**
   *  Assigns the number triples Row1, Row2, Row3 to the three
   *  rows of this matrix.
   */
  public void SetRows( gp_XYZ  Row1,  gp_XYZ  Row2,  gp_XYZ  Row3) {
    OCCwrapJavaJNI.gp_Mat_SetRows(swigCPtr, this, gp_XYZ.getCPtr(Row1), Row1, gp_XYZ.getCPtr(Row2), Row2, gp_XYZ.getCPtr(Row3), Row3);
  }

  /**
   *  Modifies the the matrix so that it represents
   *  a scaling transformation, where S is the scale factor. :
   *  | S    0.0  0.0 |
   *  <me> =  | 0.0   S   0.0 |
   *  | 0.0  0.0   S  |
   */
  public void SetScale(double S) {
    OCCwrapJavaJNI.gp_Mat_SetScale(swigCPtr, this, S);
  }

  /**
   *  Assigns <Value> to the coefficient of row Row, column Col of   this matrix.
   *  Raises OutOfRange if Row < 1 or Row > 3 or Col < 1 or Col > 3
   */
  public void SetValue(int Row, int Col, double Value) {
    OCCwrapJavaJNI.gp_Mat_SetValue(swigCPtr, this, Row, Col, Value);
  }

  /**
   *  Returns the column of Col index.
   *  Raises OutOfRange if Col < 1 or Col > 3
   */
  public gp_XYZ Column(int Col) {
    return new gp_XYZ(OCCwrapJavaJNI.gp_Mat_Column(swigCPtr, this, Col), true);
  }

  /**
   *  Computes the determinant of the matrix.
   */
  public double Determinant() {
    return OCCwrapJavaJNI.gp_Mat_Determinant(swigCPtr, this);
  }

  /**
   *  Returns the main diagonal of the matrix.
   */
  public gp_XYZ Diagonal() {
    return new gp_XYZ(OCCwrapJavaJNI.gp_Mat_Diagonal(swigCPtr, this), true);
  }

  /**
   *  returns the row of Row index.
   *  Raises OutOfRange if Row < 1 or Row > 3
   */
  public gp_XYZ Row(int Row) {
    return new gp_XYZ(OCCwrapJavaJNI.gp_Mat_Row(swigCPtr, this, Row), true);
  }

  /**
   *  Returns the coefficient of range (Row, Col)
   *  Raises OutOfRange if Row < 1 or Row > 3 or Col < 1 or Col > 3
   */
  public  double  Value(int Row, int Col) { return OCCwrapJavaJNI.gp_Mat_Value(swigCPtr, this, Row, Col); }

  public double[] ChangeValue(int Row, int Col) {return OCCwrapJavaJNI.gp_Mat_ChangeValue(swigCPtr, this, Row, Col);}

  /**
   *  The Gauss LU decomposition is used to invert the matrix
   *  (see Math package) so the matrix is considered as singular if
   *  the largest pivot found is lower or equal to Resolution from gp.
   */
  public long IsSingular() {
    return OCCwrapJavaJNI.gp_Mat_IsSingular(swigCPtr, this);
  }

  public void Add( gp_Mat  Other) {
    OCCwrapJavaJNI.gp_Mat_Add(swigCPtr, this, gp_Mat.getCPtr(Other), Other);
  }

  /**
   *  Computes the sum of this matrix and
   *  the matrix Other for each coefficient of the matrix :
   *  <me>.Coef(i,j) + <Other>.Coef(i,j)
   */
  public gp_Mat Added( gp_Mat  Other) {
    return new gp_Mat(OCCwrapJavaJNI.gp_Mat_Added(swigCPtr, this, gp_Mat.getCPtr(Other), Other), true);
  }

  public void Divide(double Scalar) {
    OCCwrapJavaJNI.gp_Mat_Divide(swigCPtr, this, Scalar);
  }

  /**
   *  Divides all the coefficients of the matrix by Scalar
   */
  public gp_Mat Divided(double Scalar) {
    return new gp_Mat(OCCwrapJavaJNI.gp_Mat_Divided(swigCPtr, this, Scalar), true);
  }

  public void Invert() {
    OCCwrapJavaJNI.gp_Mat_Invert(swigCPtr, this);
  }

  /**
   *  Inverses the matrix and raises if the matrix is singular.
   *  -   Invert assigns the result to this matrix, while
   *  -   Inverted creates a new one.
   *  Warning
   *  The Gauss LU decomposition is used to invert the matrix.
   *  Consequently, the matrix is considered as singular if the
   *  largest pivot found is less than or equal to gp::Resolution().
   *  Exceptions
   *  Standard_ConstructionError if this matrix is singular,
   *  and therefore cannot be inverted.
   */
  public gp_Mat Inverted() {
    return new gp_Mat(OCCwrapJavaJNI.gp_Mat_Inverted(swigCPtr, this), true);
  }

  /**
   *  Computes  the product of two matrices <me> * <Other>
   */
  public gp_Mat Multiplied( gp_Mat  Other) {
    return new gp_Mat(OCCwrapJavaJNI.gp_Mat_Multiplied__SWIG_0(swigCPtr, this, gp_Mat.getCPtr(Other), Other), true);
  }

  /**
   *  Computes the product of two matrices <me> = <Other> * <me>.
   */
  public void Multiply( gp_Mat  Other) {
    OCCwrapJavaJNI.gp_Mat_Multiply__SWIG_0(swigCPtr, this, gp_Mat.getCPtr(Other), Other);
  }

  public void PreMultiply( gp_Mat  Other) {
    OCCwrapJavaJNI.gp_Mat_PreMultiply(swigCPtr, this, gp_Mat.getCPtr(Other), Other);
  }

  public gp_Mat Multiplied(double Scalar) {
    return new gp_Mat(OCCwrapJavaJNI.gp_Mat_Multiplied__SWIG_1(swigCPtr, this, Scalar), true);
  }

  public void Multiply(double Scalar) {
    OCCwrapJavaJNI.gp_Mat_Multiply__SWIG_1(swigCPtr, this, Scalar);
  }

  public void Power(int N) {
    OCCwrapJavaJNI.gp_Mat_Power(swigCPtr, this, N);
  }

  /**
   *  Computes <me> = <me> * <me> * .......* <me>,   N time.
   *  if N = 0 <me> = Identity
   *  if N < 0 <me> = <me>.Invert() *...........* <me>.Invert().
   *  If N < 0 an exception will be raised if the matrix is not
   *  inversible
   */
  public gp_Mat Powered(int N) {
    return new gp_Mat(OCCwrapJavaJNI.gp_Mat_Powered(swigCPtr, this, N), true);
  }

  public void Subtract( gp_Mat  Other) {
    OCCwrapJavaJNI.gp_Mat_Subtract(swigCPtr, this, gp_Mat.getCPtr(Other), Other);
  }

  /**
   *  cOmputes for each coefficient of the matrix :
   *  <me>.Coef(i,j) - <Other>.Coef(i,j)
   */
  public gp_Mat Subtracted( gp_Mat  Other) {
    return new gp_Mat(OCCwrapJavaJNI.gp_Mat_Subtracted(swigCPtr, this, gp_Mat.getCPtr(Other), Other), true);
  }

  public void Transpose() {
    OCCwrapJavaJNI.gp_Mat_Transpose(swigCPtr, this);
  }

  /**
   *  Transposes the matrix. A(j, i) -> A (i, j)
   */
  public gp_Mat Transposed() {
    return new gp_Mat(OCCwrapJavaJNI.gp_Mat_Transposed(swigCPtr, this), true);
  }

}
