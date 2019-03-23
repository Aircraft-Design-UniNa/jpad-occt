package opencascade;

public class TColgp_Array2OfVec {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_Array2OfVec(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_Array2OfVec(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_Array2OfVec obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_Array2OfVec(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_Array2OfVec(int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array2OfVec__SWIG_0(theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public TColgp_Array2OfVec( TColgp_Array2OfVec  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_Array2OfVec__SWIG_1(TColgp_Array2OfVec.getCPtr(theOther), theOther), true);
  }

  public TColgp_Array2OfVec( gp_Vec  theBegin, int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array2OfVec__SWIG_2(gp_Vec.getCPtr(theBegin), theBegin, theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public void Init( gp_Vec  theValue) {
    OCCwrapJavaJNI.TColgp_Array2OfVec_Init(swigCPtr, this, gp_Vec.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec_UpperCol(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec_IsDeletable(swigCPtr, this);
  }

  public  TColgp_Array2OfVec  Assign( TColgp_Array2OfVec  theOther) {
    TColgp_Array2OfVec ret = new TColgp_Array2OfVec(OCCwrapJavaJNI.TColgp_Array2OfVec_Assign(swigCPtr, this, TColgp_Array2OfVec.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  gp_Vec  Value(int theRow, int theCol) {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.TColgp_Array2OfVec_Value(swigCPtr, this, theRow, theCol), true);
    return ret;
  }

  public gp_Vec ChangeValue(int theRow, int theCol) {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.TColgp_Array2OfVec_ChangeValue(swigCPtr, this, theRow, theCol), false, this);
    return ret; //new gp_Vec.CRef (ret);
  }

  public void SetValue(int theRow, int theCol,  gp_Vec  theItem) {
    OCCwrapJavaJNI.TColgp_Array2OfVec_SetValue(swigCPtr, this, theRow, theCol, gp_Vec.getCPtr(theItem), theItem);
  }

}
