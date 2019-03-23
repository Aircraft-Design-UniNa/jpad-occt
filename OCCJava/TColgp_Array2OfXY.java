package opencascade;

public class TColgp_Array2OfXY {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_Array2OfXY(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_Array2OfXY(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_Array2OfXY obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_Array2OfXY(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_Array2OfXY(int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array2OfXY__SWIG_0(theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public TColgp_Array2OfXY( TColgp_Array2OfXY  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_Array2OfXY__SWIG_1(TColgp_Array2OfXY.getCPtr(theOther), theOther), true);
  }

  public TColgp_Array2OfXY( gp_XY  theBegin, int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array2OfXY__SWIG_2(gp_XY.getCPtr(theBegin), theBegin, theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public void Init( gp_XY  theValue) {
    OCCwrapJavaJNI.TColgp_Array2OfXY_Init(swigCPtr, this, gp_XY.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_Array2OfXY_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_Array2OfXY_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColgp_Array2OfXY_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColgp_Array2OfXY_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColgp_Array2OfXY_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColgp_Array2OfXY_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColgp_Array2OfXY_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColgp_Array2OfXY_UpperCol(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColgp_Array2OfXY_IsDeletable(swigCPtr, this);
  }

  public  TColgp_Array2OfXY  Assign( TColgp_Array2OfXY  theOther) {
    TColgp_Array2OfXY ret = new TColgp_Array2OfXY(OCCwrapJavaJNI.TColgp_Array2OfXY_Assign(swigCPtr, this, TColgp_Array2OfXY.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  gp_XY  Value(int theRow, int theCol) {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_Array2OfXY_Value(swigCPtr, this, theRow, theCol), true);
    return ret;
  }

  public gp_XY ChangeValue(int theRow, int theCol) {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_Array2OfXY_ChangeValue(swigCPtr, this, theRow, theCol), false, this);
    return ret; //new gp_XY.CRef (ret);
  }

  public void SetValue(int theRow, int theCol,  gp_XY  theItem) {
    OCCwrapJavaJNI.TColgp_Array2OfXY_SetValue(swigCPtr, this, theRow, theCol, gp_XY.getCPtr(theItem), theItem);
  }

}
