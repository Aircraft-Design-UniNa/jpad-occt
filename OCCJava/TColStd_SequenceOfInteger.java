package opencascade;

public class TColStd_SequenceOfInteger {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_SequenceOfInteger(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_SequenceOfInteger(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_SequenceOfInteger obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_SequenceOfInteger(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_SequenceOfInteger() {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfInteger__SWIG_0(), true);
  }

  public TColStd_SequenceOfInteger( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfInteger__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TColStd_SequenceOfInteger( TColStd_SequenceOfInteger  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfInteger__SWIG_2(TColStd_SequenceOfInteger.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_SequenceOfInteger_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_SequenceOfInteger_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_SequenceOfInteger_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_SequenceOfInteger_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_SequenceOfInteger_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColStd_SequenceOfInteger_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.TColStd_SequenceOfInteger_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TColStd_SequenceOfInteger_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TColStd_SequenceOfInteger_Clear__SWIG_1(swigCPtr, this);
  }

  public  TColStd_SequenceOfInteger  Assign( TColStd_SequenceOfInteger  theOther) {
    TColStd_SequenceOfInteger ret = new TColStd_SequenceOfInteger(OCCwrapJavaJNI.TColStd_SequenceOfInteger_Assign(swigCPtr, this, TColStd_SequenceOfInteger.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( TColStd_SequenceOfInteger_Iterator  thePosition) {
    OCCwrapJavaJNI.TColStd_SequenceOfInteger_Remove__SWIG_0(swigCPtr, this,  TColStd_SequenceOfInteger_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColStd_SequenceOfInteger_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColStd_SequenceOfInteger_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( int  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfInteger_Append__SWIG_0(swigCPtr, this,  theItem );
  }

  public void Append( TColStd_SequenceOfInteger  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfInteger_Append__SWIG_1(swigCPtr, this, TColStd_SequenceOfInteger.getCPtr(theSeq), theSeq);
  }

  public void Prepend( int  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfInteger_Prepend__SWIG_0(swigCPtr, this,  theItem );
  }

  public void Prepend( TColStd_SequenceOfInteger  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfInteger_Prepend__SWIG_1(swigCPtr, this, TColStd_SequenceOfInteger.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  int  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfInteger_InsertBefore__SWIG_0(swigCPtr, this, theIndex,  theItem );
  }

  public void InsertBefore(int theIndex,  TColStd_SequenceOfInteger  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfInteger_InsertBefore__SWIG_1(swigCPtr, this, theIndex, TColStd_SequenceOfInteger.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( TColStd_SequenceOfInteger_Iterator  thePosition,  int  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfInteger_InsertAfter__SWIG_0(swigCPtr, this,  TColStd_SequenceOfInteger_Iterator.getCPtr(thePosition) , thePosition,  theItem );
  }

  public void InsertAfter(int theIndex,  TColStd_SequenceOfInteger  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfInteger_InsertAfter__SWIG_1(swigCPtr, this, theIndex, TColStd_SequenceOfInteger.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  int  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfInteger_InsertAfter__SWIG_2(swigCPtr, this, theIndex,  theItem );
  }

  public void Split(int theIndex,  TColStd_SequenceOfInteger  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfInteger_Split(swigCPtr, this, theIndex, TColStd_SequenceOfInteger.getCPtr(theSeq), theSeq);
  }

  public  int  First() { return OCCwrapJavaJNI.TColStd_SequenceOfInteger_First(swigCPtr, this); }

  public int[] ChangeFirst() {return OCCwrapJavaJNI.TColStd_SequenceOfInteger_ChangeFirst(swigCPtr, this);}

  public  int  Last() { return OCCwrapJavaJNI.TColStd_SequenceOfInteger_Last(swigCPtr, this); }

  public int[] ChangeLast() {return OCCwrapJavaJNI.TColStd_SequenceOfInteger_ChangeLast(swigCPtr, this);}

  public  int  Value(int theIndex) { return OCCwrapJavaJNI.TColStd_SequenceOfInteger_Value(swigCPtr, this, theIndex); }

  public int[] ChangeValue(int theIndex) {return OCCwrapJavaJNI.TColStd_SequenceOfInteger_ChangeValue(swigCPtr, this, theIndex);}

  public void SetValue(int theIndex,  int  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfInteger_SetValue(swigCPtr, this, theIndex,  theItem );
  }

}
