package opencascade;

public class AppDef_Array1OfMultiPointConstraint {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  AppDef_Array1OfMultiPointConstraint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  AppDef_Array1OfMultiPointConstraint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(AppDef_Array1OfMultiPointConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_AppDef_Array1OfMultiPointConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AppDef_Array1OfMultiPointConstraint() {
    this(OCCwrapJavaJNI.new_AppDef_Array1OfMultiPointConstraint__SWIG_0(), true);
  }

  public AppDef_Array1OfMultiPointConstraint(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_AppDef_Array1OfMultiPointConstraint__SWIG_1(theLower, theUpper), true);
  }

  public AppDef_Array1OfMultiPointConstraint( AppDef_Array1OfMultiPointConstraint  theOther) {
    this(OCCwrapJavaJNI.new_AppDef_Array1OfMultiPointConstraint__SWIG_2(AppDef_Array1OfMultiPointConstraint.getCPtr(theOther), theOther), true);
  }

  public AppDef_Array1OfMultiPointConstraint( AppDef_MultiPointConstraint  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_AppDef_Array1OfMultiPointConstraint__SWIG_4(AppDef_MultiPointConstraint.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( AppDef_MultiPointConstraint  theValue) {
    OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_Init(swigCPtr, this, AppDef_MultiPointConstraint.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_IsAllocated(swigCPtr, this);
  }

  public  AppDef_Array1OfMultiPointConstraint  Assign( AppDef_Array1OfMultiPointConstraint  theOther) {
    AppDef_Array1OfMultiPointConstraint ret = new AppDef_Array1OfMultiPointConstraint(OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_Assign(swigCPtr, this, AppDef_Array1OfMultiPointConstraint.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  AppDef_Array1OfMultiPointConstraint  Move( AppDef_Array1OfMultiPointConstraint  theOther) {
    AppDef_Array1OfMultiPointConstraint ret = new AppDef_Array1OfMultiPointConstraint(OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_Move(swigCPtr, this, AppDef_Array1OfMultiPointConstraint.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  AppDef_MultiPointConstraint  First() {
    AppDef_MultiPointConstraint ret = new AppDef_MultiPointConstraint(OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_First(swigCPtr, this), false, this);
    return ret;
  }

  public  AppDef_MultiPointConstraint  ChangeFirst() {
    AppDef_MultiPointConstraint ret = new AppDef_MultiPointConstraint(OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_ChangeFirst(swigCPtr, this), false, this);
    return ret;
  }

  public  AppDef_MultiPointConstraint  Last() {
    AppDef_MultiPointConstraint ret = new AppDef_MultiPointConstraint(OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_Last(swigCPtr, this), false, this);
    return ret;
  }

  public  AppDef_MultiPointConstraint  ChangeLast() {
    AppDef_MultiPointConstraint ret = new AppDef_MultiPointConstraint(OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_ChangeLast(swigCPtr, this), false, this);
    return ret;
  }

  public  AppDef_MultiPointConstraint  Value(int theIndex) {
    AppDef_MultiPointConstraint ret = new AppDef_MultiPointConstraint(OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_Value(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public  AppDef_MultiPointConstraint  ChangeValue(int theIndex) {
    AppDef_MultiPointConstraint ret = new AppDef_MultiPointConstraint(OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public void SetValue(int theIndex,  AppDef_MultiPointConstraint  theItem) {
    OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_SetValue(swigCPtr, this, theIndex, AppDef_MultiPointConstraint.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.AppDef_Array1OfMultiPointConstraint_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
