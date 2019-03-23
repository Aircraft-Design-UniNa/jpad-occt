package opencascade;

public class TColStd_Array2OfReal {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_Array2OfReal(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_Array2OfReal(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_Array2OfReal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_Array2OfReal(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_Array2OfReal(int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array2OfReal__SWIG_0(theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public TColStd_Array2OfReal( TColStd_Array2OfReal  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_Array2OfReal__SWIG_1(TColStd_Array2OfReal.getCPtr(theOther), theOther), true);
  }

  public TColStd_Array2OfReal( double  theBegin, int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array2OfReal__SWIG_2( theBegin , theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public void Init( double  theValue) {
    OCCwrapJavaJNI.TColStd_Array2OfReal_Init(swigCPtr, this,  theValue );
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_Array2OfReal_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_Array2OfReal_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColStd_Array2OfReal_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColStd_Array2OfReal_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColStd_Array2OfReal_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColStd_Array2OfReal_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColStd_Array2OfReal_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColStd_Array2OfReal_UpperCol(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColStd_Array2OfReal_IsDeletable(swigCPtr, this);
  }

  public  TColStd_Array2OfReal  Assign( TColStd_Array2OfReal  theOther) {
    TColStd_Array2OfReal ret = new TColStd_Array2OfReal(OCCwrapJavaJNI.TColStd_Array2OfReal_Assign(swigCPtr, this, TColStd_Array2OfReal.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  double  Value(int theRow, int theCol) { return OCCwrapJavaJNI.TColStd_Array2OfReal_Value(swigCPtr, this, theRow, theCol); }

  public double[] ChangeValue(int theRow, int theCol) {return OCCwrapJavaJNI.TColStd_Array2OfReal_ChangeValue(swigCPtr, this, theRow, theCol);}

  public void SetValue(int theRow, int theCol,  double  theItem) {
    OCCwrapJavaJNI.TColStd_Array2OfReal_SetValue(swigCPtr, this, theRow, theCol,  theItem );
  }

}
