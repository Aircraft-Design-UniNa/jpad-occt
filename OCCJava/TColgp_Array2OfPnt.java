package opencascade;

public class TColgp_Array2OfPnt {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_Array2OfPnt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_Array2OfPnt(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_Array2OfPnt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_Array2OfPnt(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_Array2OfPnt(int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array2OfPnt__SWIG_0(theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public TColgp_Array2OfPnt( TColgp_Array2OfPnt  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_Array2OfPnt__SWIG_1(TColgp_Array2OfPnt.getCPtr(theOther), theOther), true);
  }

  public TColgp_Array2OfPnt( gp_Pnt  theBegin, int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array2OfPnt__SWIG_2(gp_Pnt.getCPtr(theBegin), theBegin, theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public void Init( gp_Pnt  theValue) {
    OCCwrapJavaJNI.TColgp_Array2OfPnt_Init(swigCPtr, this, gp_Pnt.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_Array2OfPnt_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_Array2OfPnt_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColgp_Array2OfPnt_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColgp_Array2OfPnt_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColgp_Array2OfPnt_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColgp_Array2OfPnt_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColgp_Array2OfPnt_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColgp_Array2OfPnt_UpperCol(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColgp_Array2OfPnt_IsDeletable(swigCPtr, this);
  }

  public  TColgp_Array2OfPnt  Assign( TColgp_Array2OfPnt  theOther) {
    TColgp_Array2OfPnt ret = new TColgp_Array2OfPnt(OCCwrapJavaJNI.TColgp_Array2OfPnt_Assign(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  gp_Pnt  Value(int theRow, int theCol) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_Array2OfPnt_Value(swigCPtr, this, theRow, theCol), true);
    return ret;
  }

  public gp_Pnt ChangeValue(int theRow, int theCol) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_Array2OfPnt_ChangeValue(swigCPtr, this, theRow, theCol), false, this);
    return ret; //new gp_Pnt.CRef (ret);
  }

  public void SetValue(int theRow, int theCol,  gp_Pnt  theItem) {
    OCCwrapJavaJNI.TColgp_Array2OfPnt_SetValue(swigCPtr, this, theRow, theCol, gp_Pnt.getCPtr(theItem), theItem);
  }

}
