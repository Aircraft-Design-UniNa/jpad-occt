package opencascade;

/**
 *  This class implements the real matrix abstract data type.
 *  Matrixes can have an arbitrary range which must be defined
 *  at the declaration and cannot be changed after this declaration
 *  math_Matrix(-3,5,2,4); //a vector with range [-3..5, 2..4]
 *  Matrix values may be initialized and
 *  retrieved using indexes which must lie within the range
 *  of definition of the matrix.
 *  Matrix objects follow "value semantics", that is, they
 *  cannot be shared and are copied through assignment
 *  Matrices are copied through assignement:
 *  math_Matrix M2(1, 9, 1, 3);
 *  ...
 *  M2 = M1;
 *  M1(1) = 2.0;//the matrix M2 will not be modified.
 * 
 *  The exception RangeError is raised when trying to access
 *  outside the range of a matrix :
 *  M1(11, 1)=0.0// --> will raise RangeError.
 * 
 *  The exception DimensionError is raised when the dimensions of
 *  two matrices or vectors are not compatible.
 *  math_Matrix M3(1, 2, 1, 2);
 *  M3 = M1;   // will raise DimensionError
 *  M1.Add(M3) // --> will raise DimensionError.
 *  A Matrix can be constructed with a a pointer to "c array".
 *  It allows to carry the bounds inside the matrix.
 *  Exemple :
 *  Standard_Real tab1[10][20];
 *  Standard_Real tab2[200];
 * 
 *  math_Matrix A (tab1[0][0], 1, 10, 1, 20);
 *  math_Matrix B (tab2[0],    1, 10, 1, 20);
 */
public class math_Matrix {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  math_Matrix(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  math_Matrix(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(math_Matrix obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_math_Matrix(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs a non-initialized  matrix of range [LowerRow..UpperRow,
   *  LowerCol..UpperCol]
   *  For the constructed matrix:
   *  -   LowerRow and UpperRow are the indexes of the
   *  lower and upper bounds of a row, and
   *  -   LowerCol and UpperCol are the indexes of the
   *  lower and upper bounds of a column.
   */
  public math_Matrix(int LowerRow, int UpperRow, int LowerCol, int UpperCol) {
    this(OCCwrapJavaJNI.new_math_Matrix__SWIG_0(LowerRow, UpperRow, LowerCol, UpperCol), true);
  }

  /**
   *  constructs a non-initialized matrix of range [LowerRow..UpperRow,
   *  LowerCol..UpperCol]
   *  whose values are all initialized with the value InitialValue.
   */
  public math_Matrix(int LowerRow, int UpperRow, int LowerCol, int UpperCol, double InitialValue) {
    this(OCCwrapJavaJNI.new_math_Matrix__SWIG_1(LowerRow, UpperRow, LowerCol, UpperCol, InitialValue), true);
  }

  /**
   *  constructs a matrix of range [LowerRow..UpperRow,
   *  LowerCol..UpperCol]
   *  Sharing data with a "C array" pointed by Tab.
   */
  public math_Matrix( long  Tab, int LowerRow, int UpperRow, int LowerCol, int UpperCol) {
    this(OCCwrapJavaJNI.new_math_Matrix__SWIG_2( Tab , LowerRow, UpperRow, LowerCol, UpperCol), true);
  }

  /**
   *  constructs a matrix for copy in initialization.
   *  An exception is raised if the matrixes have not the same dimensions.
   */
  public math_Matrix( math_Matrix  Other) {
    this(OCCwrapJavaJNI.new_math_Matrix__SWIG_3(math_Matrix.getCPtr(Other), Other), true);
  }

  /**
   *  Initialize all the elements of a matrix to InitialValue.
   */
  public void Init(double InitialValue) {
    OCCwrapJavaJNI.math_Matrix_Init(swigCPtr, this, InitialValue);
  }

  /**
   *  Returns the number of rows  of this matrix.
   *  Note that for a matrix A you always have the following relations:
   *  - A.RowNumber() = A.UpperRow() -   A.LowerRow() + 1
   *  - A.ColNumber() = A.UpperCol() -   A.LowerCol() + 1
   *  - the length of a row of A is equal to the number of columns of A,
   *  - the length of a column of A is equal to the number of
   *  rows of A.returns the row range of a matrix.
   */
  public int RowNumber() {
    return OCCwrapJavaJNI.math_Matrix_RowNumber(swigCPtr, this);
  }

  /**
   *  Returns the number of rows  of this matrix.
   *  Note that for a matrix A you always have the following relations:
   *  - A.RowNumber() = A.UpperRow() -   A.LowerRow() + 1
   *  - A.ColNumber() = A.UpperCol() -   A.LowerCol() + 1
   *  - the length of a row of A is equal to the number of columns of A,
   *  - the length of a column of A is equal to the number of
   *  rows of A.returns the row range of a matrix.
   */
  public int ColNumber() {
    return OCCwrapJavaJNI.math_Matrix_ColNumber(swigCPtr, this);
  }

  /**
   *  Returns the value of the Lower index of the row
   *  range of a matrix.
   */
  public int LowerRow() {
    return OCCwrapJavaJNI.math_Matrix_LowerRow(swigCPtr, this);
  }

  /**
   *  Returns the Upper index of the row range
   *  of a matrix.
   */
  public int UpperRow() {
    return OCCwrapJavaJNI.math_Matrix_UpperRow(swigCPtr, this);
  }

  /**
   *  Returns the value of the Lower index of the
   *  column range of a matrix.
   */
  public int LowerCol() {
    return OCCwrapJavaJNI.math_Matrix_LowerCol(swigCPtr, this);
  }

  /**
   *  Returns the value of the upper index of the
   *  column range of a matrix.
   */
  public int UpperCol() {
    return OCCwrapJavaJNI.math_Matrix_UpperCol(swigCPtr, this);
  }

  /**
   *  Computes the determinant of a matrix.
   *  An exception is raised if the matrix is not a square matrix.
   */
  public double Determinant() {
    return OCCwrapJavaJNI.math_Matrix_Determinant(swigCPtr, this);
  }

  /**
   *  Transposes a given matrix.
   *  An exception is raised if the matrix is not a square matrix.
   */
  public void Transpose() {
    OCCwrapJavaJNI.math_Matrix_Transpose(swigCPtr, this);
  }

  /**
   *  Inverts a matrix using Gauss algorithm.
   *  Exception NotSquare is raised if the matrix is not square.
   *  Exception SingularMatrix is raised if the matrix is singular.
   */
  public void Invert() {
    OCCwrapJavaJNI.math_Matrix_Invert(swigCPtr, this);
  }

  /**
   *  Sets this matrix to the product of the matrix Left, and the matrix Right.
   *  Example
   *  math_Matrix A (1, 3, 1, 3);
   *  math_Matrix B (1, 3, 1, 3);
   *  // A = ... , B = ...
   *  math_Matrix C (1, 3, 1, 3);
   *  C.Multiply(A, B);
   *  Exceptions
   *  Standard_DimensionError if matrices are of incompatible dimensions, i.e. if:
   *  -   the number of columns of matrix Left, or the number of
   *  rows of matrix TLeft is not equal to the number of rows
   *  of matrix Right, or
   *  -   the number of rows of matrix Left, or the number of
   *  columns of matrix TLeft is not equal to the number of
   *  rows of this matrix, or
   *  -   the number of columns of matrix Right is not equal to
   *  the number of columns of this matrix.
   */
  public void Multiply(double Right) {
    OCCwrapJavaJNI.math_Matrix_Multiply__SWIG_0(swigCPtr, this, Right);
  }

  /**
   *  multiplies all the elements of a matrix by the
   *  value <Right>.
   */
  public math_Matrix Multiplied(double Right) {
    return new math_Matrix(OCCwrapJavaJNI.math_Matrix_Multiplied__SWIG_0(swigCPtr, this, Right), true);
  }

  /**
   *  Sets this matrix to the product of the
   *  transposed matrix TLeft, and the matrix Right.
   *  Example
   *  math_Matrix A (1, 3, 1, 3);
   *  math_Matrix B (1, 3, 1, 3);
   *  // A = ... , B = ...
   *  math_Matrix C (1, 3, 1, 3);
   *  C.Multiply(A, B);
   *  Exceptions
   *  Standard_DimensionError if matrices are of incompatible dimensions, i.e. if:
   *  -   the number of columns of matrix Left, or the number of
   *  rows of matrix TLeft is not equal to the number of rows
   *  of matrix Right, or
   *  -   the number of rows of matrix Left, or the number of
   *  columns of matrix TLeft is not equal to the number of
   *  rows of this matrix, or
   *  -   the number of columns of matrix Right is not equal to
   *  the number of columns of this matrix.
   */
  public math_Matrix TMultiplied(double Right) {
    return new math_Matrix(OCCwrapJavaJNI.math_Matrix_TMultiplied(swigCPtr, this, Right), true);
  }

  /**
   *  divides all the elements of a matrix by the value <Right>.
   *  An exception is raised if <Right> = 0.
   */
  public void Divide(double Right) {
    OCCwrapJavaJNI.math_Matrix_Divide(swigCPtr, this, Right);
  }

  /**
   *  divides all the elements of a matrix by the value <Right>.
   *  An exception is raised if <Right> = 0.
   */
  public math_Matrix Divided(double Right) {
    return new math_Matrix(OCCwrapJavaJNI.math_Matrix_Divided(swigCPtr, this, Right), true);
  }

  /**
   *  adds the matrix <Right> to a matrix.
   *  An exception is raised if the dimensions are different.
   *  Warning
   *  In order to save time when copying matrices, it is
   *  preferable to use operator += or the function Add
   *  whenever possible.
   */
  public void Add( math_Matrix  Right) {
    OCCwrapJavaJNI.math_Matrix_Add__SWIG_0(swigCPtr, this, math_Matrix.getCPtr(Right), Right);
  }

  /**
   *  adds the matrix <Right> to a matrix.
   *  An exception is raised if the dimensions are different.
   */
  public math_Matrix Added( math_Matrix  Right) {
    return new math_Matrix(OCCwrapJavaJNI.math_Matrix_Added(swigCPtr, this, math_Matrix.getCPtr(Right), Right), true);
  }

  public void Add( math_Matrix  Left,  math_Matrix  Right) {
    OCCwrapJavaJNI.math_Matrix_Add__SWIG_1(swigCPtr, this, math_Matrix.getCPtr(Left), Left, math_Matrix.getCPtr(Right), Right);
  }

  /**
   *  Subtracts the matrix <Right> from <me>.
   *  An exception is raised if the dimensions are different.
   *  Warning
   *  In order to avoid time-consuming copying of matrices, it
   *  is preferable to use operator -= or the function
   *  Subtract whenever possible.
   */
  public void Subtract( math_Matrix  Right) {
    OCCwrapJavaJNI.math_Matrix_Subtract__SWIG_0(swigCPtr, this, math_Matrix.getCPtr(Right), Right);
  }

  /**
   *  Returns the result of the subtraction of <Right> from <me>.
   *  An exception is raised if the dimensions are different.
   */
  public math_Matrix Subtracted( math_Matrix  Right) {
    return new math_Matrix(OCCwrapJavaJNI.math_Matrix_Subtracted(swigCPtr, this, math_Matrix.getCPtr(Right), Right), true);
  }

  /**
   *  Sets the values of this matrix,
   *  -   from index I1 to index I2 on the row dimension, and
   *  -   from index J1 to index J2 on the column dimension,
   *  to those of matrix M.
   *  Exceptions
   *  Standard_DimensionError if:
   *  -   I1 is less than the index of the lower row bound of this matrix, or
   *  -   I2 is greater than the index of the upper row bound of this matrix, or
   *  -   J1 is less than the index of the lower column bound of this matrix, or
   *  -   J2 is greater than the index of the upper column bound of this matrix, or
   *  -   I2 - I1 + 1 is not equal to the number of rows of matrix M, or
   *  -   J2 - J1 + 1 is not equal to the number of columns of matrix M.
   */
  public void Set(int I1, int I2, int J1, int J2,  math_Matrix  M) {
    OCCwrapJavaJNI.math_Matrix_Set(swigCPtr, this, I1, I2, J1, J2, math_Matrix.getCPtr(M), M);
  }

  /**
   *  Sets the row of index Row of a matrix to the vector <V>.
   *  An exception is raised if the dimensions are different.
   *  An exception is raises if <Row> is inferior to the lower
   *  row of the matrix or <Row> is superior to the upper row.
   */
  public void SetRow(int Row,  math_Vector  V) {
    OCCwrapJavaJNI.math_Matrix_SetRow(swigCPtr, this, Row, math_Vector.getCPtr(V), V);
  }

  /**
   *  Sets the column of index Col of a matrix to the vector <V>.
   *  An exception is raised if the dimensions are different.
   *  An exception is raises if <Col> is inferior to the lower
   *  column of the matrix or <Col> is superior to the upper
   *  column.
   */
  public void SetCol(int Col,  math_Vector  V) {
    OCCwrapJavaJNI.math_Matrix_SetCol(swigCPtr, this, Col, math_Vector.getCPtr(V), V);
  }

  /**
   *  Sets the diagonal of a matrix to the value <Value>.
   *  An exception is raised if the matrix is not square.
   */
  public void SetDiag(double Value) {
    OCCwrapJavaJNI.math_Matrix_SetDiag(swigCPtr, this, Value);
  }

  /**
   *  Returns the row of index Row of a matrix.
   */
  public math_Vector Row(int Row) {
    return new math_Vector(OCCwrapJavaJNI.math_Matrix_Row(swigCPtr, this, Row), true);
  }

  /**
   *  Returns the column of index <Col> of a matrix.
   */
  public math_Vector Col(int Col) {
    return new math_Vector(OCCwrapJavaJNI.math_Matrix_Col(swigCPtr, this, Col), true);
  }

  /**
   *  Swaps the rows of index Row1 and Row2.
   *  An exception is raised if <Row1> or <Row2> is out of range.
   */
  public void SwapRow(int Row1, int Row2) {
    OCCwrapJavaJNI.math_Matrix_SwapRow(swigCPtr, this, Row1, Row2);
  }

  /**
   *  Swaps the columns of index <Col1> and <Col2>.
   *  An exception is raised if <Col1> or <Col2> is out of range.
   */
  public void SwapCol(int Col1, int Col2) {
    OCCwrapJavaJNI.math_Matrix_SwapCol(swigCPtr, this, Col1, Col2);
  }

  /**
   *  Teturns the transposed of a matrix.
   *  An exception is raised if the matrix is not a square matrix.
   */
  public math_Matrix Transposed() {
    return new math_Matrix(OCCwrapJavaJNI.math_Matrix_Transposed(swigCPtr, this), true);
  }

  /**
   *  Returns the inverse of a matrix.
   *  Exception NotSquare is raised if the matrix is not square.
   *  Exception SingularMatrix is raised if the matrix is singular.
   */
  public math_Matrix Inverse() {
    return new math_Matrix(OCCwrapJavaJNI.math_Matrix_Inverse(swigCPtr, this), true);
  }

  /**
   *  Returns the product of the transpose of a matrix with
   *  the matrix <Right>.
   *  An exception is raised if the dimensions are different.
   */
  public math_Matrix TMultiply( math_Matrix  Right) {
    return new math_Matrix(OCCwrapJavaJNI.math_Matrix_TMultiply__SWIG_0(swigCPtr, this, math_Matrix.getCPtr(Right), Right), true);
  }

  public void Multiply( math_Vector  Left,  math_Vector  Right) {
    OCCwrapJavaJNI.math_Matrix_Multiply__SWIG_1(swigCPtr, this, math_Vector.getCPtr(Left), Left, math_Vector.getCPtr(Right), Right);
  }

  /**
   *  Computes a matrix as the product of 2 vectors.
   *  An exception is raised if the dimensions are different.
   *  <me> = <Left> * <Right>.
   */
  public void Multiply( math_Matrix  Left,  math_Matrix  Right) {
    OCCwrapJavaJNI.math_Matrix_Multiply__SWIG_2(swigCPtr, this, math_Matrix.getCPtr(Left), Left, math_Matrix.getCPtr(Right), Right);
  }

  /**
   *  Computes a matrix to the product of the transpose of
   *  the matrix <TLeft> with the matrix <Right>.
   *  An exception is raised if the dimensions are different.
   */
  public void TMultiply( math_Matrix  TLeft,  math_Matrix  Right) {
    OCCwrapJavaJNI.math_Matrix_TMultiply__SWIG_1(swigCPtr, this, math_Matrix.getCPtr(TLeft), TLeft, math_Matrix.getCPtr(Right), Right);
  }

  public void Subtract( math_Matrix  Left,  math_Matrix  Right) {
    OCCwrapJavaJNI.math_Matrix_Subtract__SWIG_1(swigCPtr, this, math_Matrix.getCPtr(Left), Left, math_Matrix.getCPtr(Right), Right);
  }

  public double[] Value(int Row, int Col) {return OCCwrapJavaJNI.math_Matrix_Value(swigCPtr, this, Row, Col);}

  /**
   *  Matrixes are copied through assignement.
   *  An exception is raised if the dimensions are differents.
   */
  public  math_Matrix  Initialized( math_Matrix  Other) {
    math_Matrix ret = new math_Matrix(OCCwrapJavaJNI.math_Matrix_Initialized(swigCPtr, this, math_Matrix.getCPtr(Other), Other), false, this);
    return ret;
  }

  /**
   *  Computes a matrix as the product of 2 matrixes.
   *  An exception is raised if the dimensions are different.
   */
  public void Multiply( math_Matrix  Right) {
    OCCwrapJavaJNI.math_Matrix_Multiply__SWIG_3(swigCPtr, this, math_Matrix.getCPtr(Right), Right);
  }

  public math_Matrix Multiplied( math_Matrix  Right) {
    return new math_Matrix(OCCwrapJavaJNI.math_Matrix_Multiplied__SWIG_1(swigCPtr, this, math_Matrix.getCPtr(Right), Right), true);
  }

  /**
   *  Returns the product of 2 matrices.
   *  An exception is raised if the dimensions are different.
   */
  public math_Vector Multiplied( math_Vector  Right) {
    return new math_Vector(OCCwrapJavaJNI.math_Matrix_Multiplied__SWIG_2(swigCPtr, this, math_Vector.getCPtr(Right), Right), true);
  }

  /**
   *  Returns the opposite of a matrix.
   *  An exception is raised if the dimensions are different.
   */
  public math_Matrix Opposite() {
    return new math_Matrix(OCCwrapJavaJNI.math_Matrix_Opposite(swigCPtr, this), true);
  }

  /**
   *  Prints information on the current state of the object.
   *  Is used to redefine the operator <<.
   */
  public void Dump(SWIGTYPE_p_Standard_OStream o) {
    OCCwrapJavaJNI.math_Matrix_Dump(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(o));
  }

}
