package opencascade;

public class TShort_Array1OfShortReal {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TShort_Array1OfShortReal(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TShort_Array1OfShortReal(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TShort_Array1OfShortReal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TShort_Array1OfShortReal(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TShort_Array1OfShortReal() {
    this(OCCwrapJavaJNI.new_TShort_Array1OfShortReal__SWIG_0(), true);
  }

  public TShort_Array1OfShortReal(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TShort_Array1OfShortReal__SWIG_1(theLower, theUpper), true);
  }

  public TShort_Array1OfShortReal( TShort_Array1OfShortReal  theOther) {
    this(OCCwrapJavaJNI.new_TShort_Array1OfShortReal__SWIG_2(TShort_Array1OfShortReal.getCPtr(theOther), theOther), true);
  }

  public TShort_Array1OfShortReal( float  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TShort_Array1OfShortReal__SWIG_4( theBegin , theLower, theUpper), true);
  }

  public void Init( float  theValue) {
    OCCwrapJavaJNI.TShort_Array1OfShortReal_Init(swigCPtr, this,  theValue );
  }

  public int Size() {
    return OCCwrapJavaJNI.TShort_Array1OfShortReal_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TShort_Array1OfShortReal_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TShort_Array1OfShortReal_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TShort_Array1OfShortReal_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TShort_Array1OfShortReal_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TShort_Array1OfShortReal_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TShort_Array1OfShortReal_IsAllocated(swigCPtr, this);
  }

  public  TShort_Array1OfShortReal  Assign( TShort_Array1OfShortReal  theOther) {
    TShort_Array1OfShortReal ret = new TShort_Array1OfShortReal(OCCwrapJavaJNI.TShort_Array1OfShortReal_Assign(swigCPtr, this, TShort_Array1OfShortReal.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TShort_Array1OfShortReal  Move( TShort_Array1OfShortReal  theOther) {
    TShort_Array1OfShortReal ret = new TShort_Array1OfShortReal(OCCwrapJavaJNI.TShort_Array1OfShortReal_Move(swigCPtr, this, TShort_Array1OfShortReal.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  float  First() { return OCCwrapJavaJNI.TShort_Array1OfShortReal_First(swigCPtr, this); }

  public float[] ChangeFirst() {return OCCwrapJavaJNI.TShort_Array1OfShortReal_ChangeFirst(swigCPtr, this);}

  public  float  Last() { return OCCwrapJavaJNI.TShort_Array1OfShortReal_Last(swigCPtr, this); }

  public float[] ChangeLast() {return OCCwrapJavaJNI.TShort_Array1OfShortReal_ChangeLast(swigCPtr, this);}

  public  float  Value(int theIndex) { return OCCwrapJavaJNI.TShort_Array1OfShortReal_Value(swigCPtr, this, theIndex); }

  public float[] ChangeValue(int theIndex) {return OCCwrapJavaJNI.TShort_Array1OfShortReal_ChangeValue(swigCPtr, this, theIndex);}

  public void SetValue(int theIndex,  float  theItem) {
    OCCwrapJavaJNI.TShort_Array1OfShortReal_SetValue(swigCPtr, this, theIndex,  theItem );
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TShort_Array1OfShortReal_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
