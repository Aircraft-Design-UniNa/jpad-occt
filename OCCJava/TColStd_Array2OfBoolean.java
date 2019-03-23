package opencascade;

public class TColStd_Array2OfBoolean {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_Array2OfBoolean(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_Array2OfBoolean(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_Array2OfBoolean obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_Array2OfBoolean(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_Array2OfBoolean(int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array2OfBoolean__SWIG_0(theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public TColStd_Array2OfBoolean( TColStd_Array2OfBoolean  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_Array2OfBoolean__SWIG_1(TColStd_Array2OfBoolean.getCPtr(theOther), theOther), true);
  }

  public TColStd_Array2OfBoolean( long  theBegin, int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array2OfBoolean__SWIG_2( theBegin , theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public void Init( long  theValue) {
    OCCwrapJavaJNI.TColStd_Array2OfBoolean_Init(swigCPtr, this,  theValue );
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_Array2OfBoolean_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_Array2OfBoolean_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColStd_Array2OfBoolean_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColStd_Array2OfBoolean_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColStd_Array2OfBoolean_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColStd_Array2OfBoolean_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColStd_Array2OfBoolean_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColStd_Array2OfBoolean_UpperCol(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColStd_Array2OfBoolean_IsDeletable(swigCPtr, this);
  }

  public  TColStd_Array2OfBoolean  Assign( TColStd_Array2OfBoolean  theOther) {
    TColStd_Array2OfBoolean ret = new TColStd_Array2OfBoolean(OCCwrapJavaJNI.TColStd_Array2OfBoolean_Assign(swigCPtr, this, TColStd_Array2OfBoolean.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  long  Value(int theRow, int theCol) { return OCCwrapJavaJNI.TColStd_Array2OfBoolean_Value(swigCPtr, this, theRow, theCol); }

  public long[] ChangeValue(int theRow, int theCol) {return OCCwrapJavaJNI.TColStd_Array2OfBoolean_ChangeValue(swigCPtr, this, theRow, theCol);}

  public void SetValue(int theRow, int theCol,  long  theItem) {
    OCCwrapJavaJNI.TColStd_Array2OfBoolean_SetValue(swigCPtr, this, theRow, theCol,  theItem );
  }

}
