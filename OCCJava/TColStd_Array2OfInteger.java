package opencascade;

public class TColStd_Array2OfInteger {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_Array2OfInteger(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_Array2OfInteger(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_Array2OfInteger obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_Array2OfInteger(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_Array2OfInteger(int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array2OfInteger__SWIG_0(theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public TColStd_Array2OfInteger( TColStd_Array2OfInteger  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_Array2OfInteger__SWIG_1(TColStd_Array2OfInteger.getCPtr(theOther), theOther), true);
  }

  public TColStd_Array2OfInteger( int  theBegin, int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array2OfInteger__SWIG_2( theBegin , theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public void Init( int  theValue) {
    OCCwrapJavaJNI.TColStd_Array2OfInteger_Init(swigCPtr, this,  theValue );
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_Array2OfInteger_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_Array2OfInteger_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColStd_Array2OfInteger_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColStd_Array2OfInteger_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColStd_Array2OfInteger_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColStd_Array2OfInteger_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColStd_Array2OfInteger_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColStd_Array2OfInteger_UpperCol(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColStd_Array2OfInteger_IsDeletable(swigCPtr, this);
  }

  public  TColStd_Array2OfInteger  Assign( TColStd_Array2OfInteger  theOther) {
    TColStd_Array2OfInteger ret = new TColStd_Array2OfInteger(OCCwrapJavaJNI.TColStd_Array2OfInteger_Assign(swigCPtr, this, TColStd_Array2OfInteger.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  int  Value(int theRow, int theCol) { return OCCwrapJavaJNI.TColStd_Array2OfInteger_Value(swigCPtr, this, theRow, theCol); }

  public int[] ChangeValue(int theRow, int theCol) {return OCCwrapJavaJNI.TColStd_Array2OfInteger_ChangeValue(swigCPtr, this, theRow, theCol);}

  public void SetValue(int theRow, int theCol,  int  theItem) {
    OCCwrapJavaJNI.TColStd_Array2OfInteger_SetValue(swigCPtr, this, theRow, theCol,  theItem );
  }

}
