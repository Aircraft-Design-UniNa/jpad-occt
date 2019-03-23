package opencascade;

public class TColgp_Array1OfXYZ {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_Array1OfXYZ(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_Array1OfXYZ(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_Array1OfXYZ obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_Array1OfXYZ(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_Array1OfXYZ() {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfXYZ__SWIG_0(), true);
  }

  public TColgp_Array1OfXYZ(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfXYZ__SWIG_1(theLower, theUpper), true);
  }

  public TColgp_Array1OfXYZ( TColgp_Array1OfXYZ  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfXYZ__SWIG_2(TColgp_Array1OfXYZ.getCPtr(theOther), theOther), true);
  }

  public TColgp_Array1OfXYZ( gp_XYZ  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfXYZ__SWIG_4(gp_XYZ.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( gp_XYZ  theValue) {
    OCCwrapJavaJNI.TColgp_Array1OfXYZ_Init(swigCPtr, this, gp_XYZ.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_Array1OfXYZ_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_Array1OfXYZ_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColgp_Array1OfXYZ_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColgp_Array1OfXYZ_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColgp_Array1OfXYZ_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColgp_Array1OfXYZ_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TColgp_Array1OfXYZ_IsAllocated(swigCPtr, this);
  }

  public  TColgp_Array1OfXYZ  Assign( TColgp_Array1OfXYZ  theOther) {
    TColgp_Array1OfXYZ ret = new TColgp_Array1OfXYZ(OCCwrapJavaJNI.TColgp_Array1OfXYZ_Assign(swigCPtr, this, TColgp_Array1OfXYZ.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TColgp_Array1OfXYZ  Move( TColgp_Array1OfXYZ  theOther) {
    TColgp_Array1OfXYZ ret = new TColgp_Array1OfXYZ(OCCwrapJavaJNI.TColgp_Array1OfXYZ_Move(swigCPtr, this, TColgp_Array1OfXYZ.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  gp_XYZ  First() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_Array1OfXYZ_First(swigCPtr, this), true);
    return ret;
  }

  public gp_XYZ ChangeFirst() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_Array1OfXYZ_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new gp_XYZ.CRef (ret);
  }

  public  gp_XYZ  Last() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_Array1OfXYZ_Last(swigCPtr, this), true);
    return ret;
  }

  public gp_XYZ ChangeLast() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_Array1OfXYZ_ChangeLast(swigCPtr, this), false, this);
    return ret; //new gp_XYZ.CRef (ret);
  }

  public  gp_XYZ  Value(int theIndex) {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_Array1OfXYZ_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public gp_XYZ ChangeValue(int theIndex) {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_Array1OfXYZ_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_XYZ.CRef (ret);
  }

  public void SetValue(int theIndex,  gp_XYZ  theItem) {
    OCCwrapJavaJNI.TColgp_Array1OfXYZ_SetValue(swigCPtr, this, theIndex, gp_XYZ.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TColgp_Array1OfXYZ_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
