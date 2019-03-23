package opencascade;

/**
 *  This class implements the Gauss LU decomposition (Crout algorithm)
 *  with partial pivoting (rows interchange) of a square matrix and
 *  the different possible derived calculation :
 *  - solution of a set of linear equations.
 *  - inverse of a matrix.
 *  - determinant of a matrix.
 */
public class math_Gauss {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  math_Gauss(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  math_Gauss(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(math_Gauss obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_math_Gauss(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Given an input n X n matrix A this constructor performs its LU
   *  decomposition with partial pivoting (interchange of rows).
   *  This LU decomposition is stored internally and may be used to
   *  do subsequent calculation.
   *  If the largest pivot found is less than MinPivot the matrix A is
   *  considered as singular.
   *  Exception NotSquare is raised if A is not a square matrix.
   */
  public math_Gauss( math_Matrix  A, double MinPivot) {
    this(OCCwrapJavaJNI.new_math_Gauss__SWIG_0(math_Matrix.getCPtr(A), A, MinPivot), true);
  }

  public math_Gauss( math_Matrix  A) {
    this(OCCwrapJavaJNI.new_math_Gauss__SWIG_1(math_Matrix.getCPtr(A), A), true);
  }

  /**
   *  Returns true if the computations are successful, otherwise returns false
   */
  public long IsDone() {
    return OCCwrapJavaJNI.math_Gauss_IsDone(swigCPtr, this);
  }

  /**
   *  Given the input Vector B this routine returns the solution X of the set
   *  of linear equations A . X = B.
   *  Exception NotDone is raised if the decomposition of A was not done
   *  successfully.
   *  Exception DimensionError is raised if the range of B is not
   *  equal to the number of rows of A.
   */
  public void Solve( math_Vector  B,  math_Vector  X) {
    OCCwrapJavaJNI.math_Gauss_Solve__SWIG_0(swigCPtr, this, math_Vector.getCPtr(B), B, math_Vector.getCPtr(X), X);
  }

  /**
   *  Given the input Vector B this routine solves the set of linear
   *  equations A . X = B. B is replaced by the vector solution X.
   *  Exception NotDone is raised if the decomposition of A was not done
   *  successfully.
   *  Exception DimensionError is raised if the range of B is not
   *  equal to the number of rows of A.
   */
  public void Solve( math_Vector  B) {
    OCCwrapJavaJNI.math_Gauss_Solve__SWIG_1(swigCPtr, this, math_Vector.getCPtr(B), B);
  }

  /**
   *  This routine returns the value of the determinant of the previously LU
   *  decomposed matrix A.
   *  Exception NotDone may be raised if the decomposition of A was not done
   *  successfully, zero is returned if the matrix A was considered as singular.
   */
  public double Determinant() {
    return OCCwrapJavaJNI.math_Gauss_Determinant(swigCPtr, this);
  }

  /**
   *  This routine outputs Inv the inverse of the previously LU decomposed
   *  matrix A.
   *  Exception DimensionError is raised if the ranges of B are not
   *  equal to the ranges of A.
   */
  public void Invert( math_Matrix  Inv) {
    OCCwrapJavaJNI.math_Gauss_Invert(swigCPtr, this, math_Matrix.getCPtr(Inv), Inv);
  }

  /**
   *  Prints on the stream o information on the current state
   *  of the object.
   *  Is used to redefine the operator <<.
   */
  public void Dump(SWIGTYPE_p_Standard_OStream o) {
    OCCwrapJavaJNI.math_Gauss_Dump(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(o));
  }

}
