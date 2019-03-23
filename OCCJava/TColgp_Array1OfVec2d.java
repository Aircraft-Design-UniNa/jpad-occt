package opencascade;

public class TColgp_Array1OfVec2d {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_Array1OfVec2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_Array1OfVec2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_Array1OfVec2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_Array1OfVec2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_Array1OfVec2d() {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfVec2d__SWIG_0(), true);
  }

  public TColgp_Array1OfVec2d(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfVec2d__SWIG_1(theLower, theUpper), true);
  }

  public TColgp_Array1OfVec2d( TColgp_Array1OfVec2d  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfVec2d__SWIG_2(TColgp_Array1OfVec2d.getCPtr(theOther), theOther), true);
  }

  public TColgp_Array1OfVec2d( gp_Vec2d  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColgp_Array1OfVec2d__SWIG_4(gp_Vec2d.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( gp_Vec2d  theValue) {
    OCCwrapJavaJNI.TColgp_Array1OfVec2d_Init(swigCPtr, this, gp_Vec2d.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_Array1OfVec2d_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_Array1OfVec2d_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColgp_Array1OfVec2d_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColgp_Array1OfVec2d_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColgp_Array1OfVec2d_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColgp_Array1OfVec2d_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TColgp_Array1OfVec2d_IsAllocated(swigCPtr, this);
  }

  public  TColgp_Array1OfVec2d  Assign( TColgp_Array1OfVec2d  theOther) {
    TColgp_Array1OfVec2d ret = new TColgp_Array1OfVec2d(OCCwrapJavaJNI.TColgp_Array1OfVec2d_Assign(swigCPtr, this, TColgp_Array1OfVec2d.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TColgp_Array1OfVec2d  Move( TColgp_Array1OfVec2d  theOther) {
    TColgp_Array1OfVec2d ret = new TColgp_Array1OfVec2d(OCCwrapJavaJNI.TColgp_Array1OfVec2d_Move(swigCPtr, this, TColgp_Array1OfVec2d.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  gp_Vec2d  First() {
    gp_Vec2d ret = new gp_Vec2d(OCCwrapJavaJNI.TColgp_Array1OfVec2d_First(swigCPtr, this), true);
    return ret;
  }

  public gp_Vec2d ChangeFirst() {
    gp_Vec2d ret = new gp_Vec2d(OCCwrapJavaJNI.TColgp_Array1OfVec2d_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new gp_Vec2d.CRef (ret);
  }

  public  gp_Vec2d  Last() {
    gp_Vec2d ret = new gp_Vec2d(OCCwrapJavaJNI.TColgp_Array1OfVec2d_Last(swigCPtr, this), true);
    return ret;
  }

  public gp_Vec2d ChangeLast() {
    gp_Vec2d ret = new gp_Vec2d(OCCwrapJavaJNI.TColgp_Array1OfVec2d_ChangeLast(swigCPtr, this), false, this);
    return ret; //new gp_Vec2d.CRef (ret);
  }

  public  gp_Vec2d  Value(int theIndex) {
    gp_Vec2d ret = new gp_Vec2d(OCCwrapJavaJNI.TColgp_Array1OfVec2d_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public gp_Vec2d ChangeValue(int theIndex) {
    gp_Vec2d ret = new gp_Vec2d(OCCwrapJavaJNI.TColgp_Array1OfVec2d_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_Vec2d.CRef (ret);
  }

  public void SetValue(int theIndex,  gp_Vec2d  theItem) {
    OCCwrapJavaJNI.TColgp_Array1OfVec2d_SetValue(swigCPtr, this, theIndex, gp_Vec2d.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TColgp_Array1OfVec2d_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
