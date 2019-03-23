package opencascade;

public class TColStd_Array1OfBoolean {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_Array1OfBoolean(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_Array1OfBoolean(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_Array1OfBoolean obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_Array1OfBoolean(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_Array1OfBoolean() {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfBoolean__SWIG_0(), true);
  }

  public TColStd_Array1OfBoolean(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfBoolean__SWIG_1(theLower, theUpper), true);
  }

  public TColStd_Array1OfBoolean( TColStd_Array1OfBoolean  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfBoolean__SWIG_2(TColStd_Array1OfBoolean.getCPtr(theOther), theOther), true);
  }

  public TColStd_Array1OfBoolean( long  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfBoolean__SWIG_4( theBegin , theLower, theUpper), true);
  }

  public void Init( long  theValue) {
    OCCwrapJavaJNI.TColStd_Array1OfBoolean_Init(swigCPtr, this,  theValue );
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_Array1OfBoolean_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_Array1OfBoolean_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_Array1OfBoolean_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_Array1OfBoolean_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_Array1OfBoolean_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColStd_Array1OfBoolean_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TColStd_Array1OfBoolean_IsAllocated(swigCPtr, this);
  }

  public  TColStd_Array1OfBoolean  Assign( TColStd_Array1OfBoolean  theOther) {
    TColStd_Array1OfBoolean ret = new TColStd_Array1OfBoolean(OCCwrapJavaJNI.TColStd_Array1OfBoolean_Assign(swigCPtr, this, TColStd_Array1OfBoolean.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TColStd_Array1OfBoolean  Move( TColStd_Array1OfBoolean  theOther) {
    TColStd_Array1OfBoolean ret = new TColStd_Array1OfBoolean(OCCwrapJavaJNI.TColStd_Array1OfBoolean_Move(swigCPtr, this, TColStd_Array1OfBoolean.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  long  First() { return OCCwrapJavaJNI.TColStd_Array1OfBoolean_First(swigCPtr, this); }

  public long[] ChangeFirst() {return OCCwrapJavaJNI.TColStd_Array1OfBoolean_ChangeFirst(swigCPtr, this);}

  public  long  Last() { return OCCwrapJavaJNI.TColStd_Array1OfBoolean_Last(swigCPtr, this); }

  public long[] ChangeLast() {return OCCwrapJavaJNI.TColStd_Array1OfBoolean_ChangeLast(swigCPtr, this);}

  public  long  Value(int theIndex) { return OCCwrapJavaJNI.TColStd_Array1OfBoolean_Value(swigCPtr, this, theIndex); }

  public long[] ChangeValue(int theIndex) {return OCCwrapJavaJNI.TColStd_Array1OfBoolean_ChangeValue(swigCPtr, this, theIndex);}

  public void SetValue(int theIndex,  long  theItem) {
    OCCwrapJavaJNI.TColStd_Array1OfBoolean_SetValue(swigCPtr, this, theIndex,  theItem );
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TColStd_Array1OfBoolean_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
