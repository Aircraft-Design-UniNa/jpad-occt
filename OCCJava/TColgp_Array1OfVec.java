package opencascade;

public class TColgp_Array1OfVec {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_Array1OfVec(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_Array1OfVec(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_Array1OfVec obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_Array1OfVec(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_Array1OfVec() {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfVec__SWIG_0(), true);
  }

  public TColgp_Array1OfVec(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfVec__SWIG_1(theLower, theUpper), true);
  }

  public TColgp_Array1OfVec( TColgp_Array1OfVec  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfVec__SWIG_2(TColgp_Array1OfVec.getCPtr(theOther), theOther), true);
  }

  public TColgp_Array1OfVec( gp_Vec  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfVec__SWIG_4(gp_Vec.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( gp_Vec  theValue) {
    OCCwrapJavaJNI.TColgp_Array1OfVec_Init(swigCPtr, this, gp_Vec.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_Array1OfVec_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_Array1OfVec_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColgp_Array1OfVec_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColgp_Array1OfVec_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColgp_Array1OfVec_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColgp_Array1OfVec_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TColgp_Array1OfVec_IsAllocated(swigCPtr, this);
  }

  public  TColgp_Array1OfVec  Assign( TColgp_Array1OfVec  theOther) {
    TColgp_Array1OfVec ret = new TColgp_Array1OfVec(OCCwrapJavaJNI.TColgp_Array1OfVec_Assign(swigCPtr, this, TColgp_Array1OfVec.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TColgp_Array1OfVec  Move( TColgp_Array1OfVec  theOther) {
    TColgp_Array1OfVec ret = new TColgp_Array1OfVec(OCCwrapJavaJNI.TColgp_Array1OfVec_Move(swigCPtr, this, TColgp_Array1OfVec.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  gp_Vec  First() {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.TColgp_Array1OfVec_First(swigCPtr, this), true);
    return ret;
  }

  public gp_Vec ChangeFirst() {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.TColgp_Array1OfVec_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new gp_Vec.CRef (ret);
  }

  public  gp_Vec  Last() {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.TColgp_Array1OfVec_Last(swigCPtr, this), true);
    return ret;
  }

  public gp_Vec ChangeLast() {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.TColgp_Array1OfVec_ChangeLast(swigCPtr, this), false, this);
    return ret; //new gp_Vec.CRef (ret);
  }

  public  gp_Vec  Value(int theIndex) {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.TColgp_Array1OfVec_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public gp_Vec ChangeValue(int theIndex) {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.TColgp_Array1OfVec_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_Vec.CRef (ret);
  }

  public void SetValue(int theIndex,  gp_Vec  theItem) {
    OCCwrapJavaJNI.TColgp_Array1OfVec_SetValue(swigCPtr, this, theIndex, gp_Vec.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TColgp_Array1OfVec_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
