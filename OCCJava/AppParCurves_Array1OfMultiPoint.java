package opencascade;

public class AppParCurves_Array1OfMultiPoint {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  AppParCurves_Array1OfMultiPoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  AppParCurves_Array1OfMultiPoint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(AppParCurves_Array1OfMultiPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_AppParCurves_Array1OfMultiPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AppParCurves_Array1OfMultiPoint() {
    this(OCCwrapJavaJNI.new_AppParCurves_Array1OfMultiPoint__SWIG_0(), true);
  }

  public AppParCurves_Array1OfMultiPoint(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_AppParCurves_Array1OfMultiPoint__SWIG_1(theLower, theUpper), true);
  }

  public AppParCurves_Array1OfMultiPoint( AppParCurves_Array1OfMultiPoint  theOther) {
    this(OCCwrapJavaJNI.new_AppParCurves_Array1OfMultiPoint__SWIG_2(AppParCurves_Array1OfMultiPoint.getCPtr(theOther), theOther), true);
  }

  public AppParCurves_Array1OfMultiPoint( AppParCurves_MultiPoint  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_AppParCurves_Array1OfMultiPoint__SWIG_4(AppParCurves_MultiPoint.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( AppParCurves_MultiPoint  theValue) {
    OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_Init(swigCPtr, this, AppParCurves_MultiPoint.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_IsAllocated(swigCPtr, this);
  }

  public  AppParCurves_Array1OfMultiPoint  Assign( AppParCurves_Array1OfMultiPoint  theOther) {
    AppParCurves_Array1OfMultiPoint ret = new AppParCurves_Array1OfMultiPoint(OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_Assign(swigCPtr, this, AppParCurves_Array1OfMultiPoint.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  AppParCurves_Array1OfMultiPoint  Move( AppParCurves_Array1OfMultiPoint  theOther) {
    AppParCurves_Array1OfMultiPoint ret = new AppParCurves_Array1OfMultiPoint(OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_Move(swigCPtr, this, AppParCurves_Array1OfMultiPoint.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  AppParCurves_MultiPoint  First() {
    AppParCurves_MultiPoint ret = new AppParCurves_MultiPoint(OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_First(swigCPtr, this), false, this);
    return ret;
  }

  public  AppParCurves_MultiPoint  ChangeFirst() {
    AppParCurves_MultiPoint ret = new AppParCurves_MultiPoint(OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_ChangeFirst(swigCPtr, this), false, this);
    return ret;
  }

  public  AppParCurves_MultiPoint  Last() {
    AppParCurves_MultiPoint ret = new AppParCurves_MultiPoint(OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_Last(swigCPtr, this), false, this);
    return ret;
  }

  public  AppParCurves_MultiPoint  ChangeLast() {
    AppParCurves_MultiPoint ret = new AppParCurves_MultiPoint(OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_ChangeLast(swigCPtr, this), false, this);
    return ret;
  }

  public  AppParCurves_MultiPoint  Value(int theIndex) {
    AppParCurves_MultiPoint ret = new AppParCurves_MultiPoint(OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_Value(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public  AppParCurves_MultiPoint  ChangeValue(int theIndex) {
    AppParCurves_MultiPoint ret = new AppParCurves_MultiPoint(OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public void SetValue(int theIndex,  AppParCurves_MultiPoint  theItem) {
    OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_SetValue(swigCPtr, this, theIndex, AppParCurves_MultiPoint.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.AppParCurves_Array1OfMultiPoint_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
