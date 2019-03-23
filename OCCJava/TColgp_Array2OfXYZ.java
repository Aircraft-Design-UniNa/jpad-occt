package opencascade;

public class TColgp_Array2OfXYZ {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_Array2OfXYZ(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_Array2OfXYZ(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_Array2OfXYZ obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_Array2OfXYZ(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_Array2OfXYZ(int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array2OfXYZ__SWIG_0(theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public TColgp_Array2OfXYZ( TColgp_Array2OfXYZ  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_Array2OfXYZ__SWIG_1(TColgp_Array2OfXYZ.getCPtr(theOther), theOther), true);
  }

  public TColgp_Array2OfXYZ( gp_XYZ  theBegin, int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array2OfXYZ__SWIG_2(gp_XYZ.getCPtr(theBegin), theBegin, theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public void Init( gp_XYZ  theValue) {
    OCCwrapJavaJNI.TColgp_Array2OfXYZ_Init(swigCPtr, this, gp_XYZ.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_Array2OfXYZ_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_Array2OfXYZ_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColgp_Array2OfXYZ_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColgp_Array2OfXYZ_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColgp_Array2OfXYZ_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColgp_Array2OfXYZ_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColgp_Array2OfXYZ_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColgp_Array2OfXYZ_UpperCol(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColgp_Array2OfXYZ_IsDeletable(swigCPtr, this);
  }

  public  TColgp_Array2OfXYZ  Assign( TColgp_Array2OfXYZ  theOther) {
    TColgp_Array2OfXYZ ret = new TColgp_Array2OfXYZ(OCCwrapJavaJNI.TColgp_Array2OfXYZ_Assign(swigCPtr, this, TColgp_Array2OfXYZ.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  gp_XYZ  Value(int theRow, int theCol) {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_Array2OfXYZ_Value(swigCPtr, this, theRow, theCol), true);
    return ret;
  }

  public gp_XYZ ChangeValue(int theRow, int theCol) {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_Array2OfXYZ_ChangeValue(swigCPtr, this, theRow, theCol), false, this);
    return ret; //new gp_XYZ.CRef (ret);
  }

  public void SetValue(int theRow, int theCol,  gp_XYZ  theItem) {
    OCCwrapJavaJNI.TColgp_Array2OfXYZ_SetValue(swigCPtr, this, theRow, theCol, gp_XYZ.getCPtr(theItem), theItem);
  }

}
