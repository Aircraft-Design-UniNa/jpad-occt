package opencascade;

public class TColStd_Array1OfInteger {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_Array1OfInteger(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_Array1OfInteger(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_Array1OfInteger obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_Array1OfInteger(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_Array1OfInteger() {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfInteger__SWIG_0(), true);
  }

  public TColStd_Array1OfInteger(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfInteger__SWIG_1(theLower, theUpper), true);
  }

  public TColStd_Array1OfInteger( TColStd_Array1OfInteger  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfInteger__SWIG_2(TColStd_Array1OfInteger.getCPtr(theOther), theOther), true);
  }

  public TColStd_Array1OfInteger( int  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfInteger__SWIG_4( theBegin , theLower, theUpper), true);
  }

  public void Init( int  theValue) {
    OCCwrapJavaJNI.TColStd_Array1OfInteger_Init(swigCPtr, this,  theValue );
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_Array1OfInteger_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_Array1OfInteger_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_Array1OfInteger_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_Array1OfInteger_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_Array1OfInteger_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColStd_Array1OfInteger_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TColStd_Array1OfInteger_IsAllocated(swigCPtr, this);
  }

  public  TColStd_Array1OfInteger  Assign( TColStd_Array1OfInteger  theOther) {
    TColStd_Array1OfInteger ret = new TColStd_Array1OfInteger(OCCwrapJavaJNI.TColStd_Array1OfInteger_Assign(swigCPtr, this, TColStd_Array1OfInteger.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TColStd_Array1OfInteger  Move( TColStd_Array1OfInteger  theOther) {
    TColStd_Array1OfInteger ret = new TColStd_Array1OfInteger(OCCwrapJavaJNI.TColStd_Array1OfInteger_Move(swigCPtr, this, TColStd_Array1OfInteger.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  int  First() { return OCCwrapJavaJNI.TColStd_Array1OfInteger_First(swigCPtr, this); }

  public int[] ChangeFirst() {return OCCwrapJavaJNI.TColStd_Array1OfInteger_ChangeFirst(swigCPtr, this);}

  public  int  Last() { return OCCwrapJavaJNI.TColStd_Array1OfInteger_Last(swigCPtr, this); }

  public int[] ChangeLast() {return OCCwrapJavaJNI.TColStd_Array1OfInteger_ChangeLast(swigCPtr, this);}

  public  int  Value(int theIndex) { return OCCwrapJavaJNI.TColStd_Array1OfInteger_Value(swigCPtr, this, theIndex); }

  public int[] ChangeValue(int theIndex) {return OCCwrapJavaJNI.TColStd_Array1OfInteger_ChangeValue(swigCPtr, this, theIndex);}

  public void SetValue(int theIndex,  int  theItem) {
    OCCwrapJavaJNI.TColStd_Array1OfInteger_SetValue(swigCPtr, this, theIndex,  theItem );
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TColStd_Array1OfInteger_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
