package opencascade;

public class TColgp_Array2OfVec2d {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_Array2OfVec2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_Array2OfVec2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_Array2OfVec2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_Array2OfVec2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_Array2OfVec2d(int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array2OfVec2d__SWIG_0(theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public TColgp_Array2OfVec2d( TColgp_Array2OfVec2d  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_Array2OfVec2d__SWIG_1(TColgp_Array2OfVec2d.getCPtr(theOther), theOther), true);
  }

  public TColgp_Array2OfVec2d( gp_Vec2d  theBegin, int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array2OfVec2d__SWIG_2(gp_Vec2d.getCPtr(theBegin), theBegin, theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public void Init( gp_Vec2d  theValue) {
    OCCwrapJavaJNI.TColgp_Array2OfVec2d_Init(swigCPtr, this, gp_Vec2d.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec2d_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec2d_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec2d_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec2d_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec2d_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec2d_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec2d_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec2d_UpperCol(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec2d_IsDeletable(swigCPtr, this);
  }

  public  TColgp_Array2OfVec2d  Assign( TColgp_Array2OfVec2d  theOther) {
    TColgp_Array2OfVec2d ret = new TColgp_Array2OfVec2d(OCCwrapJavaJNI.TColgp_Array2OfVec2d_Assign(swigCPtr, this, TColgp_Array2OfVec2d.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  gp_Vec2d  Value(int theRow, int theCol) {
    gp_Vec2d ret = new gp_Vec2d(OCCwrapJavaJNI.TColgp_Array2OfVec2d_Value(swigCPtr, this, theRow, theCol), true);
    return ret;
  }

  public gp_Vec2d ChangeValue(int theRow, int theCol) {
    gp_Vec2d ret = new gp_Vec2d(OCCwrapJavaJNI.TColgp_Array2OfVec2d_ChangeValue(swigCPtr, this, theRow, theCol), false, this);
    return ret; //new gp_Vec2d.CRef (ret);
  }

  public void SetValue(int theRow, int theCol,  gp_Vec2d  theItem) {
    OCCwrapJavaJNI.TColgp_Array2OfVec2d_SetValue(swigCPtr, this, theRow, theCol, gp_Vec2d.getCPtr(theItem), theItem);
  }

}
