package opencascade;

/**
 *  Describes a two column, two row matrix. This sort of
 *  object is used in various vectorial or matrix computations.
 */
public class gp_Mat2d {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Mat2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Mat2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Mat2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Mat2d ptr) { Ptr = ptr; }
    public gp_Mat2d AsReference () { return Ptr; }
    public gp_Mat2d AsCopy () { return Ptr.MakeCopy(); }
    public gp_Mat2d Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Mat2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates  a matrix with null coefficients.
   */
  public gp_Mat2d() {
    this(OCCwrapJavaJNI.new_gp_Mat2d__SWIG_0(), true);
  }

  /**
   *  Col1, Col2 are the 2 columns of the matrix.
   */
  public gp_Mat2d( gp_XY  Col1,  gp_XY  Col2) {
    this(OCCwrapJavaJNI.new_gp_Mat2d__SWIG_1(gp_XY.getCPtr(Col1), Col1, gp_XY.getCPtr(Col2), Col2), true);
  }

  /**
   *  Assigns the two coordinates of Value to the column of range
   *  Col of this matrix
   *  Raises OutOfRange if Col < 1 or Col > 2.
   */
  public void SetCol(int Col,  gp_XY  Value) {
    OCCwrapJavaJNI.gp_Mat2d_SetCol(swigCPtr, this, Col, gp_XY.getCPtr(Value), Value);
  }

  /**
   *  Assigns the number pairs Col1, Col2 to the two columns of   this matrix
   */
  public void SetCols( gp_XY  Col1,  gp_XY  Col2) {
    OCCwrapJavaJNI.gp_Mat2d_SetCols(swigCPtr, this, gp_XY.getCPtr(Col1), Col1, gp_XY.getCPtr(Col2), Col2);
  }

  /**
   *  Modifies the main diagonal of the matrix.
   *  <me>.Value (1, 1) = X1
   *  <me>.Value (2, 2) = X2
   *  The other coefficients of the matrix are not modified.
   */
  public void SetDiagonal(double X1, double X2) {
    OCCwrapJavaJNI.gp_Mat2d_SetDiagonal(swigCPtr, this, X1, X2);
  }

  /**
   *  Modifies this matrix, so that it represents the Identity matrix.
   */
  public void SetIdentity() {
    OCCwrapJavaJNI.gp_Mat2d_SetIdentity(swigCPtr, this);
  }

  /**
   *  Modifies this matrix, so that it representso a rotation. Ang is the angular
   *  value in radian of the rotation.
   */
  public void SetRotation(double Ang) {
    OCCwrapJavaJNI.gp_Mat2d_SetRotation(swigCPtr, this, Ang);
  }

  /**
   *  Assigns the two coordinates of Value to the row of index Row of this matrix.
   *  Raises OutOfRange if Row < 1 or Row > 2.
   */
  public void SetRow(int Row,  gp_XY  Value) {
    OCCwrapJavaJNI.gp_Mat2d_SetRow(swigCPtr, this, Row, gp_XY.getCPtr(Value), Value);
  }

  /**
   *  Assigns the number pairs Row1, Row2 to the two rows of this matrix.
   */
  public void SetRows( gp_XY  Row1,  gp_XY  Row2) {
    OCCwrapJavaJNI.gp_Mat2d_SetRows(swigCPtr, this, gp_XY.getCPtr(Row1), Row1, gp_XY.getCPtr(Row2), Row2);
  }

  /**
   *  Modifies the matrix such that it
   *  represents a scaling transformation, where S is the scale   factor :
   *  | S    0.0 |
   *  <me> =  | 0.0   S  |
   */
  public void SetScale(double S) {
    OCCwrapJavaJNI.gp_Mat2d_SetScale(swigCPtr, this, S);
  }

  /**
   *  Assigns <Value> to the coefficient of row Row, column Col of this matrix.
   *  Raises OutOfRange if Row < 1 or Row > 2 or Col < 1 or Col > 2
   */
  public void SetValue(int Row, int Col, double Value) {
    OCCwrapJavaJNI.gp_Mat2d_SetValue(swigCPtr, this, Row, Col, Value);
  }

  /**
   *  Returns the column of Col index.
   *  Raises OutOfRange if Col < 1 or Col > 2
   */
  public gp_XY Column(int Col) {
    return new gp_XY(OCCwrapJavaJNI.gp_Mat2d_Column(swigCPtr, this, Col), true);
  }

  /**
   *  Computes the determinant of the matrix.
   */
  public double Determinant() {
    return OCCwrapJavaJNI.gp_Mat2d_Determinant(swigCPtr, this);
  }

  /**
   *  Returns the main diagonal of the matrix.
   */
  public gp_XY Diagonal() {
    return new gp_XY(OCCwrapJavaJNI.gp_Mat2d_Diagonal(swigCPtr, this), true);
  }

  /**
   *  Returns the row of index Row.
   *  Raised if Row < 1 or Row > 2
   */
  public gp_XY Row(int Row) {
    return new gp_XY(OCCwrapJavaJNI.gp_Mat2d_Row(swigCPtr, this, Row), true);
  }

  /**
   *  Returns the coefficient of range (Row, Col)
   *  Raises OutOfRange
   *  if Row < 1 or Row > 2 or Col < 1 or Col > 2
   */
  public  double  Value(int Row, int Col) { return OCCwrapJavaJNI.gp_Mat2d_Value(swigCPtr, this, Row, Col); }

  public double[] ChangeValue(int Row, int Col) {return OCCwrapJavaJNI.gp_Mat2d_ChangeValue(swigCPtr, this, Row, Col);}

  /**
   *  Returns true if this matrix is singular (and therefore, cannot be inverted).
   *  The Gauss LU decomposition is used to invert the matrix
   *  so the matrix is considered as singular if the largest
   *  pivot found is lower or equal to Resolution from gp.
   */
  public long IsSingular() {
    return OCCwrapJavaJNI.gp_Mat2d_IsSingular(swigCPtr, this);
  }

  public void Add( gp_Mat2d  Other) {
    OCCwrapJavaJNI.gp_Mat2d_Add(swigCPtr, this, gp_Mat2d.getCPtr(Other), Other);
  }

  /**
   *  Computes the sum of this matrix and the matrix
   *  Other.for each coefficient of the matrix :
   *  <me>.Coef(i,j) + <Other>.Coef(i,j)
   *  Note:
   *  -   operator += assigns the result to this matrix, while
   *  -   operator + creates a new one.
   */
  public gp_Mat2d Added( gp_Mat2d  Other) {
    return new gp_Mat2d(OCCwrapJavaJNI.gp_Mat2d_Added(swigCPtr, this, gp_Mat2d.getCPtr(Other), Other), true);
  }

  public void Divide(double Scalar) {
    OCCwrapJavaJNI.gp_Mat2d_Divide(swigCPtr, this, Scalar);
  }

  /**
   *  Divides all the coefficients of the matrix by a scalar.
   */
  public gp_Mat2d Divided(double Scalar) {
    return new gp_Mat2d(OCCwrapJavaJNI.gp_Mat2d_Divided(swigCPtr, this, Scalar), true);
  }

  public void Invert() {
    OCCwrapJavaJNI.gp_Mat2d_Invert(swigCPtr, this);
  }

  /**
   *  Inverses the matrix and raises exception if the matrix
   *  is singular.
   */
  public gp_Mat2d Inverted() {
    return new gp_Mat2d(OCCwrapJavaJNI.gp_Mat2d_Inverted(swigCPtr, this), true);
  }

  public gp_Mat2d Multiplied( gp_Mat2d  Other) {
    return new gp_Mat2d(OCCwrapJavaJNI.gp_Mat2d_Multiplied__SWIG_0(swigCPtr, this, gp_Mat2d.getCPtr(Other), Other), true);
  }

  /**
   *  Computes the product of two matrices <me> * <Other>
   */
  public void Multiply( gp_Mat2d  Other) {
    OCCwrapJavaJNI.gp_Mat2d_Multiply__SWIG_0(swigCPtr, this, gp_Mat2d.getCPtr(Other), Other);
  }

  /**
   *  Modifies this matrix by premultiplying it by the matrix Other
   *  <me> = Other * <me>.
   */
  public void PreMultiply( gp_Mat2d  Other) {
    OCCwrapJavaJNI.gp_Mat2d_PreMultiply(swigCPtr, this, gp_Mat2d.getCPtr(Other), Other);
  }

  public gp_Mat2d Multiplied(double Scalar) {
    return new gp_Mat2d(OCCwrapJavaJNI.gp_Mat2d_Multiplied__SWIG_1(swigCPtr, this, Scalar), true);
  }

  /**
   *  Multiplies all the coefficients of the matrix by a scalar.
   */
  public void Multiply(double Scalar) {
    OCCwrapJavaJNI.gp_Mat2d_Multiply__SWIG_1(swigCPtr, this, Scalar);
  }

  public void Power(int N) {
    OCCwrapJavaJNI.gp_Mat2d_Power(swigCPtr, this, N);
  }

  /**
   *  computes <me> = <me> * <me> * .......* <me>, N time.
   *  if N = 0 <me> = Identity
   *  if N < 0 <me> = <me>.Invert() *...........* <me>.Invert().
   *  If N < 0 an exception can be raised if the matrix is not
   *  inversible
   */
  public gp_Mat2d Powered(int N) {
    return new gp_Mat2d(OCCwrapJavaJNI.gp_Mat2d_Powered(swigCPtr, this, N), true);
  }

  public void Subtract( gp_Mat2d  Other) {
    OCCwrapJavaJNI.gp_Mat2d_Subtract(swigCPtr, this, gp_Mat2d.getCPtr(Other), Other);
  }

  /**
   *  Computes for each coefficient of the matrix :
   *  <me>.Coef(i,j) - <Other>.Coef(i,j)
   */
  public gp_Mat2d Subtracted( gp_Mat2d  Other) {
    return new gp_Mat2d(OCCwrapJavaJNI.gp_Mat2d_Subtracted(swigCPtr, this, gp_Mat2d.getCPtr(Other), Other), true);
  }

  public void Transpose() {
    OCCwrapJavaJNI.gp_Mat2d_Transpose(swigCPtr, this);
  }

  /**
   *  Transposes the matrix. A(j, i) -> A (i, j)
   */
  public gp_Mat2d Transposed() {
    return new gp_Mat2d(OCCwrapJavaJNI.gp_Mat2d_Transposed(swigCPtr, this), true);
  }

}
