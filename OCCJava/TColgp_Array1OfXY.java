package opencascade;

public class TColgp_Array1OfXY {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_Array1OfXY(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_Array1OfXY(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_Array1OfXY obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_Array1OfXY(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_Array1OfXY() {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfXY__SWIG_0(), true);
  }

  public TColgp_Array1OfXY(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfXY__SWIG_1(theLower, theUpper), true);
  }

  public TColgp_Array1OfXY( TColgp_Array1OfXY  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfXY__SWIG_2(TColgp_Array1OfXY.getCPtr(theOther), theOther), true);
  }

  public TColgp_Array1OfXY( gp_XY  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfXY__SWIG_4(gp_XY.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( gp_XY  theValue) {
    OCCwrapJavaJNI.TColgp_Array1OfXY_Init(swigCPtr, this, gp_XY.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_Array1OfXY_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_Array1OfXY_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColgp_Array1OfXY_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColgp_Array1OfXY_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColgp_Array1OfXY_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColgp_Array1OfXY_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TColgp_Array1OfXY_IsAllocated(swigCPtr, this);
  }

  public  TColgp_Array1OfXY  Assign( TColgp_Array1OfXY  theOther) {
    TColgp_Array1OfXY ret = new TColgp_Array1OfXY(OCCwrapJavaJNI.TColgp_Array1OfXY_Assign(swigCPtr, this, TColgp_Array1OfXY.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TColgp_Array1OfXY  Move( TColgp_Array1OfXY  theOther) {
    TColgp_Array1OfXY ret = new TColgp_Array1OfXY(OCCwrapJavaJNI.TColgp_Array1OfXY_Move(swigCPtr, this, TColgp_Array1OfXY.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  gp_XY  First() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_Array1OfXY_First(swigCPtr, this), true);
    return ret;
  }

  public gp_XY ChangeFirst() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_Array1OfXY_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new gp_XY.CRef (ret);
  }

  public  gp_XY  Last() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_Array1OfXY_Last(swigCPtr, this), true);
    return ret;
  }

  public gp_XY ChangeLast() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_Array1OfXY_ChangeLast(swigCPtr, this), false, this);
    return ret; //new gp_XY.CRef (ret);
  }

  public  gp_XY  Value(int theIndex) {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_Array1OfXY_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public gp_XY ChangeValue(int theIndex) {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_Array1OfXY_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_XY.CRef (ret);
  }

  public void SetValue(int theIndex,  gp_XY  theItem) {
    OCCwrapJavaJNI.TColgp_Array1OfXY_SetValue(swigCPtr, this, theIndex, gp_XY.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TColgp_Array1OfXY_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
