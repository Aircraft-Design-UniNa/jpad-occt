package opencascade;

public class TColStd_Array1OfExtendedString {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_Array1OfExtendedString(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_Array1OfExtendedString(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_Array1OfExtendedString obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_Array1OfExtendedString(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_Array1OfExtendedString() {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfExtendedString__SWIG_0(), true);
  }

  public TColStd_Array1OfExtendedString(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfExtendedString__SWIG_1(theLower, theUpper), true);
  }

  public TColStd_Array1OfExtendedString( TColStd_Array1OfExtendedString  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfExtendedString__SWIG_2(TColStd_Array1OfExtendedString.getCPtr(theOther), theOther), true);
  }

  public TColStd_Array1OfExtendedString( TCollection_ExtendedString  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfExtendedString__SWIG_4(TCollection_ExtendedString.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( TCollection_ExtendedString  theValue) {
    OCCwrapJavaJNI.TColStd_Array1OfExtendedString_Init(swigCPtr, this, TCollection_ExtendedString.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_Array1OfExtendedString_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_Array1OfExtendedString_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_Array1OfExtendedString_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_Array1OfExtendedString_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_Array1OfExtendedString_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColStd_Array1OfExtendedString_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TColStd_Array1OfExtendedString_IsAllocated(swigCPtr, this);
  }

  public  TColStd_Array1OfExtendedString  Assign( TColStd_Array1OfExtendedString  theOther) {
    TColStd_Array1OfExtendedString ret = new TColStd_Array1OfExtendedString(OCCwrapJavaJNI.TColStd_Array1OfExtendedString_Assign(swigCPtr, this, TColStd_Array1OfExtendedString.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TColStd_Array1OfExtendedString  Move( TColStd_Array1OfExtendedString  theOther) {
    TColStd_Array1OfExtendedString ret = new TColStd_Array1OfExtendedString(OCCwrapJavaJNI.TColStd_Array1OfExtendedString_Move(swigCPtr, this, TColStd_Array1OfExtendedString.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TCollection_ExtendedString  First() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TColStd_Array1OfExtendedString_First(swigCPtr, this), true);
    return ret;
  }

  public TCollection_ExtendedString ChangeFirst() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TColStd_Array1OfExtendedString_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new TCollection_ExtendedString.CRef (ret);
  }

  public  TCollection_ExtendedString  Last() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TColStd_Array1OfExtendedString_Last(swigCPtr, this), true);
    return ret;
  }

  public TCollection_ExtendedString ChangeLast() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TColStd_Array1OfExtendedString_ChangeLast(swigCPtr, this), false, this);
    return ret; //new TCollection_ExtendedString.CRef (ret);
  }

  public  TCollection_ExtendedString  Value(int theIndex) {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TColStd_Array1OfExtendedString_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public TCollection_ExtendedString ChangeValue(int theIndex) {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TColStd_Array1OfExtendedString_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new TCollection_ExtendedString.CRef (ret);
  }

  public void SetValue(int theIndex,  TCollection_ExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_Array1OfExtendedString_SetValue(swigCPtr, this, theIndex, TCollection_ExtendedString.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TColStd_Array1OfExtendedString_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
