package opencascade;

public class TColgp_Array1OfPnt {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_Array1OfPnt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_Array1OfPnt(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_Array1OfPnt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_Array1OfPnt(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_Array1OfPnt() {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfPnt__SWIG_0(), true);
  }

  public TColgp_Array1OfPnt(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfPnt__SWIG_1(theLower, theUpper), true);
  }

  public TColgp_Array1OfPnt( TColgp_Array1OfPnt  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfPnt__SWIG_2(TColgp_Array1OfPnt.getCPtr(theOther), theOther), true);
  }

  public TColgp_Array1OfPnt( gp_Pnt  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfPnt__SWIG_4(gp_Pnt.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( gp_Pnt  theValue) {
    OCCwrapJavaJNI.TColgp_Array1OfPnt_Init(swigCPtr, this, gp_Pnt.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_Array1OfPnt_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_Array1OfPnt_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColgp_Array1OfPnt_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColgp_Array1OfPnt_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColgp_Array1OfPnt_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColgp_Array1OfPnt_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TColgp_Array1OfPnt_IsAllocated(swigCPtr, this);
  }

  public  TColgp_Array1OfPnt  Assign( TColgp_Array1OfPnt  theOther) {
    TColgp_Array1OfPnt ret = new TColgp_Array1OfPnt(OCCwrapJavaJNI.TColgp_Array1OfPnt_Assign(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TColgp_Array1OfPnt  Move( TColgp_Array1OfPnt  theOther) {
    TColgp_Array1OfPnt ret = new TColgp_Array1OfPnt(OCCwrapJavaJNI.TColgp_Array1OfPnt_Move(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  gp_Pnt  First() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_Array1OfPnt_First(swigCPtr, this), true);
    return ret;
  }

  public gp_Pnt ChangeFirst() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_Array1OfPnt_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new gp_Pnt.CRef (ret);
  }

  public  gp_Pnt  Last() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_Array1OfPnt_Last(swigCPtr, this), true);
    return ret;
  }

  public gp_Pnt ChangeLast() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_Array1OfPnt_ChangeLast(swigCPtr, this), false, this);
    return ret; //new gp_Pnt.CRef (ret);
  }

  public  gp_Pnt  Value(int theIndex) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_Array1OfPnt_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public gp_Pnt ChangeValue(int theIndex) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_Array1OfPnt_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_Pnt.CRef (ret);
  }

  public void SetValue(int theIndex,  gp_Pnt  theItem) {
    OCCwrapJavaJNI.TColgp_Array1OfPnt_SetValue(swigCPtr, this, theIndex, gp_Pnt.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TColgp_Array1OfPnt_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
