package opencascade;

public class TDataXtd_Array1OfTrsf {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDataXtd_Array1OfTrsf(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDataXtd_Array1OfTrsf(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDataXtd_Array1OfTrsf obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDataXtd_Array1OfTrsf(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDataXtd_Array1OfTrsf() {
    this(OCCwrapJavaJNI.new_TDataXtd_Array1OfTrsf__SWIG_0(), true);
  }

  public TDataXtd_Array1OfTrsf(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TDataXtd_Array1OfTrsf__SWIG_1(theLower, theUpper), true);
  }

  public TDataXtd_Array1OfTrsf( TDataXtd_Array1OfTrsf  theOther) {
    this(OCCwrapJavaJNI.new_TDataXtd_Array1OfTrsf__SWIG_2(TDataXtd_Array1OfTrsf.getCPtr(theOther), theOther), true);
  }

  public TDataXtd_Array1OfTrsf( gp_Trsf  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TDataXtd_Array1OfTrsf__SWIG_4(gp_Trsf.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( gp_Trsf  theValue) {
    OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_Init(swigCPtr, this, gp_Trsf.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_IsAllocated(swigCPtr, this);
  }

  public  TDataXtd_Array1OfTrsf  Assign( TDataXtd_Array1OfTrsf  theOther) {
    TDataXtd_Array1OfTrsf ret = new TDataXtd_Array1OfTrsf(OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_Assign(swigCPtr, this, TDataXtd_Array1OfTrsf.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TDataXtd_Array1OfTrsf  Move( TDataXtd_Array1OfTrsf  theOther) {
    TDataXtd_Array1OfTrsf ret = new TDataXtd_Array1OfTrsf(OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_Move(swigCPtr, this, TDataXtd_Array1OfTrsf.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  gp_Trsf  First() {
    gp_Trsf ret = new gp_Trsf(OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_First(swigCPtr, this), true);
    return ret;
  }

  public gp_Trsf ChangeFirst() {
    gp_Trsf ret = new gp_Trsf(OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new gp_Trsf.CRef (ret);
  }

  public  gp_Trsf  Last() {
    gp_Trsf ret = new gp_Trsf(OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_Last(swigCPtr, this), true);
    return ret;
  }

  public gp_Trsf ChangeLast() {
    gp_Trsf ret = new gp_Trsf(OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_ChangeLast(swigCPtr, this), false, this);
    return ret; //new gp_Trsf.CRef (ret);
  }

  public  gp_Trsf  Value(int theIndex) {
    gp_Trsf ret = new gp_Trsf(OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public gp_Trsf ChangeValue(int theIndex) {
    gp_Trsf ret = new gp_Trsf(OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_Trsf.CRef (ret);
  }

  public void SetValue(int theIndex,  gp_Trsf  theItem) {
    OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_SetValue(swigCPtr, this, theIndex, gp_Trsf.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
