package opencascade;

public class TColStd_SequenceOfReal {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_SequenceOfReal(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_SequenceOfReal(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_SequenceOfReal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_SequenceOfReal(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_SequenceOfReal() {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfReal__SWIG_0(), true);
  }

  public TColStd_SequenceOfReal( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfReal__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TColStd_SequenceOfReal( TColStd_SequenceOfReal  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfReal__SWIG_2(TColStd_SequenceOfReal.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_SequenceOfReal_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_SequenceOfReal_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_SequenceOfReal_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_SequenceOfReal_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_SequenceOfReal_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColStd_SequenceOfReal_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.TColStd_SequenceOfReal_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TColStd_SequenceOfReal_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TColStd_SequenceOfReal_Clear__SWIG_1(swigCPtr, this);
  }

  public  TColStd_SequenceOfReal  Assign( TColStd_SequenceOfReal  theOther) {
    TColStd_SequenceOfReal ret = new TColStd_SequenceOfReal(OCCwrapJavaJNI.TColStd_SequenceOfReal_Assign(swigCPtr, this, TColStd_SequenceOfReal.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( TColStd_SequenceOfReal_Iterator  thePosition) {
    OCCwrapJavaJNI.TColStd_SequenceOfReal_Remove__SWIG_0(swigCPtr, this,  TColStd_SequenceOfReal_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColStd_SequenceOfReal_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColStd_SequenceOfReal_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( double  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfReal_Append__SWIG_0(swigCPtr, this,  theItem );
  }

  public void Append( TColStd_SequenceOfReal  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfReal_Append__SWIG_1(swigCPtr, this, TColStd_SequenceOfReal.getCPtr(theSeq), theSeq);
  }

  public void Prepend( double  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfReal_Prepend__SWIG_0(swigCPtr, this,  theItem );
  }

  public void Prepend( TColStd_SequenceOfReal  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfReal_Prepend__SWIG_1(swigCPtr, this, TColStd_SequenceOfReal.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  double  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfReal_InsertBefore__SWIG_0(swigCPtr, this, theIndex,  theItem );
  }

  public void InsertBefore(int theIndex,  TColStd_SequenceOfReal  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfReal_InsertBefore__SWIG_1(swigCPtr, this, theIndex, TColStd_SequenceOfReal.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( TColStd_SequenceOfReal_Iterator  thePosition,  double  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfReal_InsertAfter__SWIG_0(swigCPtr, this,  TColStd_SequenceOfReal_Iterator.getCPtr(thePosition) , thePosition,  theItem );
  }

  public void InsertAfter(int theIndex,  TColStd_SequenceOfReal  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfReal_InsertAfter__SWIG_1(swigCPtr, this, theIndex, TColStd_SequenceOfReal.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  double  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfReal_InsertAfter__SWIG_2(swigCPtr, this, theIndex,  theItem );
  }

  public void Split(int theIndex,  TColStd_SequenceOfReal  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfReal_Split(swigCPtr, this, theIndex, TColStd_SequenceOfReal.getCPtr(theSeq), theSeq);
  }

  public  double  First() { return OCCwrapJavaJNI.TColStd_SequenceOfReal_First(swigCPtr, this); }

  public double[] ChangeFirst() {return OCCwrapJavaJNI.TColStd_SequenceOfReal_ChangeFirst(swigCPtr, this);}

  public  double  Last() { return OCCwrapJavaJNI.TColStd_SequenceOfReal_Last(swigCPtr, this); }

  public double[] ChangeLast() {return OCCwrapJavaJNI.TColStd_SequenceOfReal_ChangeLast(swigCPtr, this);}

  public  double  Value(int theIndex) { return OCCwrapJavaJNI.TColStd_SequenceOfReal_Value(swigCPtr, this, theIndex); }

  public double[] ChangeValue(int theIndex) {return OCCwrapJavaJNI.TColStd_SequenceOfReal_ChangeValue(swigCPtr, this, theIndex);}

  public void SetValue(int theIndex,  double  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfReal_SetValue(swigCPtr, this, theIndex,  theItem );
  }

}
