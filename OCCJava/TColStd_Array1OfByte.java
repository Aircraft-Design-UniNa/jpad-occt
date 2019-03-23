package opencascade;

public class TColStd_Array1OfByte {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_Array1OfByte(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_Array1OfByte(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_Array1OfByte obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_Array1OfByte(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_Array1OfByte() {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfByte__SWIG_0(), true);
  }

  public TColStd_Array1OfByte(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfByte__SWIG_1(theLower, theUpper), true);
  }

  public TColStd_Array1OfByte( TColStd_Array1OfByte  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfByte__SWIG_2(TColStd_Array1OfByte.getCPtr(theOther), theOther), true);
  }

  public TColStd_Array1OfByte( short  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfByte__SWIG_4( theBegin , theLower, theUpper), true);
  }

  public void Init( short  theValue) {
    OCCwrapJavaJNI.TColStd_Array1OfByte_Init(swigCPtr, this,  theValue );
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_Array1OfByte_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_Array1OfByte_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_Array1OfByte_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_Array1OfByte_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_Array1OfByte_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColStd_Array1OfByte_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TColStd_Array1OfByte_IsAllocated(swigCPtr, this);
  }

  public  TColStd_Array1OfByte  Assign( TColStd_Array1OfByte  theOther) {
    TColStd_Array1OfByte ret = new TColStd_Array1OfByte(OCCwrapJavaJNI.TColStd_Array1OfByte_Assign(swigCPtr, this, TColStd_Array1OfByte.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TColStd_Array1OfByte  Move( TColStd_Array1OfByte  theOther) {
    TColStd_Array1OfByte ret = new TColStd_Array1OfByte(OCCwrapJavaJNI.TColStd_Array1OfByte_Move(swigCPtr, this, TColStd_Array1OfByte.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  short  First() { return OCCwrapJavaJNI.TColStd_Array1OfByte_First(swigCPtr, this); }

  public short[] ChangeFirst() {return OCCwrapJavaJNI.TColStd_Array1OfByte_ChangeFirst(swigCPtr, this);}

  public  short  Last() { return OCCwrapJavaJNI.TColStd_Array1OfByte_Last(swigCPtr, this); }

  public short[] ChangeLast() {return OCCwrapJavaJNI.TColStd_Array1OfByte_ChangeLast(swigCPtr, this);}

  public  short  Value(int theIndex) { return OCCwrapJavaJNI.TColStd_Array1OfByte_Value(swigCPtr, this, theIndex); }

  public short[] ChangeValue(int theIndex) {return OCCwrapJavaJNI.TColStd_Array1OfByte_ChangeValue(swigCPtr, this, theIndex);}

  public void SetValue(int theIndex,  short  theItem) {
    OCCwrapJavaJNI.TColStd_Array1OfByte_SetValue(swigCPtr, this, theIndex,  theItem );
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TColStd_Array1OfByte_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
