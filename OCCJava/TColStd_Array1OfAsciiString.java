package opencascade;

public class TColStd_Array1OfAsciiString {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_Array1OfAsciiString(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_Array1OfAsciiString(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_Array1OfAsciiString obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_Array1OfAsciiString(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_Array1OfAsciiString() {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfAsciiString__SWIG_0(), true);
  }

  public TColStd_Array1OfAsciiString(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfAsciiString__SWIG_1(theLower, theUpper), true);
  }

  public TColStd_Array1OfAsciiString( TColStd_Array1OfAsciiString  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfAsciiString__SWIG_2(TColStd_Array1OfAsciiString.getCPtr(theOther), theOther), true);
  }

  public TColStd_Array1OfAsciiString( TCollection_AsciiString  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfAsciiString__SWIG_4(TCollection_AsciiString.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( TCollection_AsciiString  theValue) {
    OCCwrapJavaJNI.TColStd_Array1OfAsciiString_Init(swigCPtr, this, TCollection_AsciiString.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_Array1OfAsciiString_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_Array1OfAsciiString_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_Array1OfAsciiString_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_Array1OfAsciiString_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_Array1OfAsciiString_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColStd_Array1OfAsciiString_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TColStd_Array1OfAsciiString_IsAllocated(swigCPtr, this);
  }

  public  TColStd_Array1OfAsciiString  Assign( TColStd_Array1OfAsciiString  theOther) {
    TColStd_Array1OfAsciiString ret = new TColStd_Array1OfAsciiString(OCCwrapJavaJNI.TColStd_Array1OfAsciiString_Assign(swigCPtr, this, TColStd_Array1OfAsciiString.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TColStd_Array1OfAsciiString  Move( TColStd_Array1OfAsciiString  theOther) {
    TColStd_Array1OfAsciiString ret = new TColStd_Array1OfAsciiString(OCCwrapJavaJNI.TColStd_Array1OfAsciiString_Move(swigCPtr, this, TColStd_Array1OfAsciiString.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TCollection_AsciiString  First() {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TColStd_Array1OfAsciiString_First(swigCPtr, this), true);
    return ret;
  }

  public TCollection_AsciiString ChangeFirst() {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TColStd_Array1OfAsciiString_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new TCollection_AsciiString.CRef (ret);
  }

  public  TCollection_AsciiString  Last() {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TColStd_Array1OfAsciiString_Last(swigCPtr, this), true);
    return ret;
  }

  public TCollection_AsciiString ChangeLast() {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TColStd_Array1OfAsciiString_ChangeLast(swigCPtr, this), false, this);
    return ret; //new TCollection_AsciiString.CRef (ret);
  }

  public  TCollection_AsciiString  Value(int theIndex) {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TColStd_Array1OfAsciiString_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public TCollection_AsciiString ChangeValue(int theIndex) {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TColStd_Array1OfAsciiString_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new TCollection_AsciiString.CRef (ret);
  }

  public void SetValue(int theIndex,  TCollection_AsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_Array1OfAsciiString_SetValue(swigCPtr, this, theIndex, TCollection_AsciiString.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TColStd_Array1OfAsciiString_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
