package opencascade;

public class TColStd_Array1OfListOfInteger {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_Array1OfListOfInteger(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_Array1OfListOfInteger(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_Array1OfListOfInteger obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_Array1OfListOfInteger(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_Array1OfListOfInteger() {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfListOfInteger__SWIG_0(), true);
  }

  public TColStd_Array1OfListOfInteger(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfListOfInteger__SWIG_1(theLower, theUpper), true);
  }

  public TColStd_Array1OfListOfInteger( TColStd_Array1OfListOfInteger  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfListOfInteger__SWIG_2(TColStd_Array1OfListOfInteger.getCPtr(theOther), theOther), true);
  }

  public TColStd_Array1OfListOfInteger( TColStd_ListOfInteger  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfListOfInteger__SWIG_4(TColStd_ListOfInteger.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( TColStd_ListOfInteger  theValue) {
    OCCwrapJavaJNI.TColStd_Array1OfListOfInteger_Init(swigCPtr, this, TColStd_ListOfInteger.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_Array1OfListOfInteger_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_Array1OfListOfInteger_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_Array1OfListOfInteger_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_Array1OfListOfInteger_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_Array1OfListOfInteger_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColStd_Array1OfListOfInteger_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TColStd_Array1OfListOfInteger_IsAllocated(swigCPtr, this);
  }

  public  TColStd_Array1OfListOfInteger  Assign( TColStd_Array1OfListOfInteger  theOther) {
    TColStd_Array1OfListOfInteger ret = new TColStd_Array1OfListOfInteger(OCCwrapJavaJNI.TColStd_Array1OfListOfInteger_Assign(swigCPtr, this, TColStd_Array1OfListOfInteger.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TColStd_Array1OfListOfInteger  Move( TColStd_Array1OfListOfInteger  theOther) {
    TColStd_Array1OfListOfInteger ret = new TColStd_Array1OfListOfInteger(OCCwrapJavaJNI.TColStd_Array1OfListOfInteger_Move(swigCPtr, this, TColStd_Array1OfListOfInteger.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TColStd_ListOfInteger  First() {
    TColStd_ListOfInteger ret = new TColStd_ListOfInteger(OCCwrapJavaJNI.TColStd_Array1OfListOfInteger_First(swigCPtr, this), false, this);
    return ret;
  }

  public  TColStd_ListOfInteger  ChangeFirst() {
    TColStd_ListOfInteger ret = new TColStd_ListOfInteger(OCCwrapJavaJNI.TColStd_Array1OfListOfInteger_ChangeFirst(swigCPtr, this), false, this);
    return ret;
  }

  public  TColStd_ListOfInteger  Last() {
    TColStd_ListOfInteger ret = new TColStd_ListOfInteger(OCCwrapJavaJNI.TColStd_Array1OfListOfInteger_Last(swigCPtr, this), false, this);
    return ret;
  }

  public  TColStd_ListOfInteger  ChangeLast() {
    TColStd_ListOfInteger ret = new TColStd_ListOfInteger(OCCwrapJavaJNI.TColStd_Array1OfListOfInteger_ChangeLast(swigCPtr, this), false, this);
    return ret;
  }

  public  TColStd_ListOfInteger  Value(int theIndex) {
    TColStd_ListOfInteger ret = new TColStd_ListOfInteger(OCCwrapJavaJNI.TColStd_Array1OfListOfInteger_Value(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public  TColStd_ListOfInteger  ChangeValue(int theIndex) {
    TColStd_ListOfInteger ret = new TColStd_ListOfInteger(OCCwrapJavaJNI.TColStd_Array1OfListOfInteger_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public void SetValue(int theIndex,  TColStd_ListOfInteger  theItem) {
    OCCwrapJavaJNI.TColStd_Array1OfListOfInteger_SetValue(swigCPtr, this, theIndex, TColStd_ListOfInteger.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TColStd_Array1OfListOfInteger_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
