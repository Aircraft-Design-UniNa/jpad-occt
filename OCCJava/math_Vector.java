package opencascade;

/**
 *  This class implements the real vector abstract data type.
 *  Vectors can have an arbitrary range which must be defined at
 *  the declaration and cannot be changed after this declaration.
 *  @code
 *     math_Vector V1(-3, 5); // a vector with range [-3..5]
 *  @endcode
 * 
 *  Vector are copied through assignement :
 *  @code
 *     math_Vector V2( 1, 9);
 *     ....
 *     V2 = V1;
 *     V1(1) = 2.0; // the vector V2 will not be modified.
 *  @endcode
 * 
 *  The Exception RangeError is raised when trying to access outside
 *  the range of a vector :
 *  @code
 *     V1(11) = 0.0 // --> will raise RangeError;
 *  @endcode
 * 
 *  The Exception DimensionError is raised when the dimensions of two
 *  vectors are not compatible :
 *  @code
 *     math_Vector V3(1, 2);
 *     V3 = V1;    // --> will raise DimensionError;
 *     V1.Add(V3)  // --> will raise DimensionError;
 *  @endcode
 */
public class math_Vector {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  math_Vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  math_Vector(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(math_Vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_math_Vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Contructs a non-initialized vector in the range [theLower..theUpper]
   *  "theLower" and "theUpper" are the indexes of the lower and upper bounds of the constructed vector.
   */
  public math_Vector(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_math_Vector__SWIG_0(theLower, theUpper), true);
  }

  /**
   *  Contructs a vector in the range [theLower..theUpper]
   *  whose values are all initialized with the value "theInitialValue"
   */
  public math_Vector(int theLower, int theUpper, double theInitialValue) {
    this(OCCwrapJavaJNI.new_math_Vector__SWIG_1(theLower, theUpper, theInitialValue), true);
  }

  /**
   *  Constructs a vector in the range [theLower..theUpper]
   *  with the "c array" theTab.
   */
  public math_Vector( long  theTab, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_math_Vector__SWIG_2( theTab , theLower, theUpper), true);
  }

  /**
   *  Constructor for converting gp_XY to math_Vector
   */
  public math_Vector(gp_XY Other) {
    this(OCCwrapJavaJNI.new_math_Vector__SWIG_3(gp_XY.getCPtr(Other), Other), true);
  }

  /**
   *  Constructor for converting gp_XYZ to math_Vector
   */
  public math_Vector(gp_XYZ Other) {
    this(OCCwrapJavaJNI.new_math_Vector__SWIG_4(gp_XYZ.getCPtr(Other), Other), true);
  }

  /**
   *  Initialize all the elements of a vector with "theInitialValue".
   */
  public void Init(double theInitialValue) {
    OCCwrapJavaJNI.math_Vector_Init(swigCPtr, this, theInitialValue);
  }

  /**
   *  Constructs a copy for initialization.
   *  An exception is raised if the lengths of the vectors are different.
   */
  public math_Vector( math_Vector  theOther) {
    this(OCCwrapJavaJNI.new_math_Vector__SWIG_5(math_Vector.getCPtr(theOther), theOther), true);
  }

  /**
   *  Returns the length of a vector
   */
  public int Length() {
    return OCCwrapJavaJNI.math_Vector_Length(swigCPtr, this);
  }

  /**
   *  Returns the value of the theLower index of a vector.
   */
  public int Lower() {
    return OCCwrapJavaJNI.math_Vector_Lower(swigCPtr, this);
  }

  /**
   *  Returns the value of the theUpper index of a vector.
   */
  public int Upper() {
    return OCCwrapJavaJNI.math_Vector_Upper(swigCPtr, this);
  }

  /**
   *  Returns the value or the square  of the norm of this vector.
   */
  public double Norm() {
    return OCCwrapJavaJNI.math_Vector_Norm(swigCPtr, this);
  }

  /**
   *  Returns the value of the square of the norm of a vector.
   */
  public double Norm2() {
    return OCCwrapJavaJNI.math_Vector_Norm2(swigCPtr, this);
  }

  /**
   *  Returns the value of the "Index" of the maximum element of a vector.
   */
  public int Max() {
    return OCCwrapJavaJNI.math_Vector_Max(swigCPtr, this);
  }

  /**
   *  Returns the value of the "Index" of the minimum element  of a vector.
   */
  public int Min() {
    return OCCwrapJavaJNI.math_Vector_Min(swigCPtr, this);
  }

  /**
   *  Normalizes this vector (the norm of the result
   *  is equal to 1.0) and assigns the result to this vector
   *  Exceptions
   *  Standard_NullValue if this vector is null (i.e. if its norm is
   *  less than or equal to Standard_Real::RealEpsilon().
   */
  public void Normalize() {
    OCCwrapJavaJNI.math_Vector_Normalize(swigCPtr, this);
  }

  /**
   *  Normalizes this vector (the norm of the result
   *  is equal to 1.0) and creates a new vector
   *  Exceptions
   *  Standard_NullValue if this vector is null (i.e. if its norm is
   *  less than or equal to Standard_Real::RealEpsilon().
   */
  public math_Vector Normalized() {
    return new math_Vector(OCCwrapJavaJNI.math_Vector_Normalized(swigCPtr, this), true);
  }

  /**
   *  Inverts this vector and assigns the result to this vector.
   */
  public void Invert() {
    OCCwrapJavaJNI.math_Vector_Invert(swigCPtr, this);
  }

  /**
   *  Inverts this vector and creates a new vector.
   */
  public math_Vector Inverse() {
    return new math_Vector(OCCwrapJavaJNI.math_Vector_Inverse(swigCPtr, this), true);
  }

  /**
   *  sets a vector from "theI1" to "theI2" to the vector "theV";
   *  An exception is raised if "theI1" is less than "LowerIndex" or "theI2" is greater than "UpperIndex" or "theI1" is greater than "theI2".
   *  An exception is raised if "theI2-theI1+1" is different from the "Length" of "theV".
   */
  public void Set(int theI1, int theI2,  math_Vector  theV) {
    OCCwrapJavaJNI.math_Vector_Set(swigCPtr, this, theI1, theI2, math_Vector.getCPtr(theV), theV);
  }

  /**
   * Creates a new vector by inverting the values of this vector
   *  between indexes "theI1" and "theI2".
   *  If the values of this vector were (1., 2., 3., 4.,5., 6.),
   *  by slicing it between indexes 2 and 5 the values
   *  of the resulting vector are (1., 5., 4., 3., 2., 6.)
   */
  public math_Vector Slice(int theI1, int theI2) {
    return new math_Vector(OCCwrapJavaJNI.math_Vector_Slice(swigCPtr, this, theI1, theI2), true);
  }

  /**
   *  returns the product of a vector and a real value.
   */
  public void Multiply(double theRight) {
    OCCwrapJavaJNI.math_Vector_Multiply__SWIG_0(swigCPtr, this, theRight);
  }

  /**
   *  returns the product of a vector and a real value.
   */
  public math_Vector Multiplied(double theRight) {
    return new math_Vector(OCCwrapJavaJNI.math_Vector_Multiplied__SWIG_0(swigCPtr, this, theRight), true);
  }

  /**
   *  returns the product of a vector and a real value.
   */
  public math_Vector TMultiplied(double theRight) {
    return new math_Vector(OCCwrapJavaJNI.math_Vector_TMultiplied(swigCPtr, this, theRight), true);
  }

  /**
   *  divides a vector by the value "theRight".
   *  An exception is raised if "theRight" = 0.
   */
  public void Divide(double theRight) {
    OCCwrapJavaJNI.math_Vector_Divide(swigCPtr, this, theRight);
  }

  /**
   *  divides a vector by the value "theRight".
   *  An exception is raised if "theRight" = 0.
   */
  public math_Vector Divided(double theRight) {
    return new math_Vector(OCCwrapJavaJNI.math_Vector_Divided(swigCPtr, this, theRight), true);
  }

  /**
   *  adds the vector "theRight" to a vector.
   *  An exception is raised if the vectors have not the same length.
   *  Warning
   *  In order to avoid time-consuming copying of vectors, it
   *  is preferable to use operator += or the function Add whenever possible.
   */
  public void Add( math_Vector  theRight) {
    OCCwrapJavaJNI.math_Vector_Add__SWIG_0(swigCPtr, this, math_Vector.getCPtr(theRight), theRight);
  }

  /**
   *  adds the vector theRight to a vector.
   *  An exception is raised if the vectors have not the same length.
   *  An exception is raised if the lengths are not equal.
   */
  public math_Vector Added( math_Vector  theRight) {
    return new math_Vector(OCCwrapJavaJNI.math_Vector_Added(swigCPtr, this, math_Vector.getCPtr(theRight), theRight), true);
  }

  public void Multiply( math_Vector  theLeft, math_Matrix theRight) {
    OCCwrapJavaJNI.math_Vector_Multiply__SWIG_1(swigCPtr, this, math_Vector.getCPtr(theLeft), theLeft, math_Matrix.getCPtr(theRight), theRight);
  }

  /**
   *  sets a vector to the product of the vector "theLeft"
   *  with the matrix "theRight".
   */
  public void Multiply(math_Matrix theLeft,  math_Vector  theRight) {
    OCCwrapJavaJNI.math_Vector_Multiply__SWIG_2(swigCPtr, this, math_Matrix.getCPtr(theLeft), theLeft, math_Vector.getCPtr(theRight), theRight);
  }

  /**
   *  sets a vector to the product of the transpose
   *  of the matrix "theTLeft" by the vector "theRight".
   */
  public void TMultiply(math_Matrix theTLeft,  math_Vector  theRight) {
    OCCwrapJavaJNI.math_Vector_TMultiply__SWIG_0(swigCPtr, this, math_Matrix.getCPtr(theTLeft), theTLeft, math_Vector.getCPtr(theRight), theRight);
  }

  /**
   *  sets a vector to the product of the vector
   *  "theLeft" by the transpose of the matrix "theTRight".
   */
  public void TMultiply( math_Vector  theLeft, math_Matrix theTRight) {
    OCCwrapJavaJNI.math_Vector_TMultiply__SWIG_1(swigCPtr, this, math_Vector.getCPtr(theLeft), theLeft, math_Matrix.getCPtr(theTRight), theTRight);
  }

  public void Add( math_Vector  theLeft,  math_Vector  theRight) {
    OCCwrapJavaJNI.math_Vector_Add__SWIG_1(swigCPtr, this, math_Vector.getCPtr(theLeft), theLeft, math_Vector.getCPtr(theRight), theRight);
  }

  /**
   *  sets a vector to the Subtraction of the
   *  vector theRight from the vector theLeft.
   *  An exception is raised if the vectors have not the same length.
   *  Warning
   *  In order to avoid time-consuming copying of vectors, it
   *  is preferable to use operator -= or the function
   *  Subtract whenever possible.
   */
  public void Subtract( math_Vector  theLeft,  math_Vector  theRight) {
    OCCwrapJavaJNI.math_Vector_Subtract__SWIG_0(swigCPtr, this, math_Vector.getCPtr(theLeft), theLeft, math_Vector.getCPtr(theRight), theRight);
  }

  public double[] Value(int theNum) {return OCCwrapJavaJNI.math_Vector_Value(swigCPtr, this, theNum);}

  /**
   *  Initialises a vector by copying "theOther".
   *  An exception is raised if the Lengths are differents.
   */
  public  math_Vector  Initialized( math_Vector  theOther) {
    math_Vector ret = new math_Vector(OCCwrapJavaJNI.math_Vector_Initialized(swigCPtr, this, math_Vector.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public double Multiplied( math_Vector  theRight) {
    return OCCwrapJavaJNI.math_Vector_Multiplied__SWIG_1(swigCPtr, this, math_Vector.getCPtr(theRight), theRight);
  }

  public math_Vector Multiplied(math_Matrix theRight) {
    return new math_Vector(OCCwrapJavaJNI.math_Vector_Multiplied__SWIG_2(swigCPtr, this, math_Matrix.getCPtr(theRight), theRight), true);
  }

  /**
   *  returns the opposite of a vector.
   */
  public math_Vector Opposite() {
    return new math_Vector(OCCwrapJavaJNI.math_Vector_Opposite(swigCPtr, this), true);
  }

  /**
   *  returns the subtraction of "theRight" from "me".
   *  An exception is raised if the vectors have not the same length.
   */
  public void Subtract( math_Vector  theRight) {
    OCCwrapJavaJNI.math_Vector_Subtract__SWIG_1(swigCPtr, this, math_Vector.getCPtr(theRight), theRight);
  }

  /**
   *  returns the subtraction of "theRight" from "me".
   *  An exception is raised if the vectors have not the same length.
   */
  public math_Vector Subtracted( math_Vector  theRight) {
    return new math_Vector(OCCwrapJavaJNI.math_Vector_Subtracted(swigCPtr, this, math_Vector.getCPtr(theRight), theRight), true);
  }

  /**
   * sets a vector to the product of the matrix "theLeft"
   *  with the vector "theRight".
   */
  public void Multiply(double theLeft,  math_Vector  theRight) {
    OCCwrapJavaJNI.math_Vector_Multiply__SWIG_3(swigCPtr, this, theLeft, math_Vector.getCPtr(theRight), theRight);
  }

  /**
   *  Prints information on the current state of the object.
   *  Is used to redefine the operator <<.
   */
  public void Dump(SWIGTYPE_p_Standard_OStream theO) {
    OCCwrapJavaJNI.math_Vector_Dump(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(theO));
  }

}
