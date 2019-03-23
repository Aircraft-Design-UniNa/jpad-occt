package opencascade;

public class TColStd_Array1OfReal {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_Array1OfReal(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_Array1OfReal(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_Array1OfReal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_Array1OfReal(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_Array1OfReal() {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfReal__SWIG_0(), true);
  }

  public TColStd_Array1OfReal(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfReal__SWIG_1(theLower, theUpper), true);
  }

  public TColStd_Array1OfReal( TColStd_Array1OfReal  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfReal__SWIG_2(TColStd_Array1OfReal.getCPtr(theOther), theOther), true);
  }

  public TColStd_Array1OfReal( double  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfReal__SWIG_4( theBegin , theLower, theUpper), true);
  }

  public void Init( double  theValue) {
    OCCwrapJavaJNI.TColStd_Array1OfReal_Init(swigCPtr, this,  theValue );
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_Array1OfReal_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_Array1OfReal_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_Array1OfReal_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_Array1OfReal_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_Array1OfReal_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColStd_Array1OfReal_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TColStd_Array1OfReal_IsAllocated(swigCPtr, this);
  }

  public  TColStd_Array1OfReal  Assign( TColStd_Array1OfReal  theOther) {
    TColStd_Array1OfReal ret = new TColStd_Array1OfReal(OCCwrapJavaJNI.TColStd_Array1OfReal_Assign(swigCPtr, this, TColStd_Array1OfReal.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TColStd_Array1OfReal  Move( TColStd_Array1OfReal  theOther) {
    TColStd_Array1OfReal ret = new TColStd_Array1OfReal(OCCwrapJavaJNI.TColStd_Array1OfReal_Move(swigCPtr, this, TColStd_Array1OfReal.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  double  First() { return OCCwrapJavaJNI.TColStd_Array1OfReal_First(swigCPtr, this); }

  public double[] ChangeFirst() {return OCCwrapJavaJNI.TColStd_Array1OfReal_ChangeFirst(swigCPtr, this);}

  public  double  Last() { return OCCwrapJavaJNI.TColStd_Array1OfReal_Last(swigCPtr, this); }

  public double[] ChangeLast() {return OCCwrapJavaJNI.TColStd_Array1OfReal_ChangeLast(swigCPtr, this);}

  public  double  Value(int theIndex) { return OCCwrapJavaJNI.TColStd_Array1OfReal_Value(swigCPtr, this, theIndex); }

  public double[] ChangeValue(int theIndex) {return OCCwrapJavaJNI.TColStd_Array1OfReal_ChangeValue(swigCPtr, this, theIndex);}

  public void SetValue(int theIndex,  double  theItem) {
    OCCwrapJavaJNI.TColStd_Array1OfReal_SetValue(swigCPtr, this, theIndex,  theItem );
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TColStd_Array1OfReal_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
