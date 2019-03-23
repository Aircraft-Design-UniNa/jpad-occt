package opencascade;

public class TColStd_SequenceOfHExtendedString {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_SequenceOfHExtendedString(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_SequenceOfHExtendedString(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_SequenceOfHExtendedString obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_SequenceOfHExtendedString(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_SequenceOfHExtendedString() {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfHExtendedString__SWIG_0(), true);
  }

  public TColStd_SequenceOfHExtendedString( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfHExtendedString__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TColStd_SequenceOfHExtendedString( TColStd_SequenceOfHExtendedString  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfHExtendedString__SWIG_2(TColStd_SequenceOfHExtendedString.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Clear__SWIG_1(swigCPtr, this);
  }

  public  TColStd_SequenceOfHExtendedString  Assign( TColStd_SequenceOfHExtendedString  theOther) {
    TColStd_SequenceOfHExtendedString ret = new TColStd_SequenceOfHExtendedString(OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Assign(swigCPtr, this, TColStd_SequenceOfHExtendedString.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( TColStd_SequenceOfHExtendedString_Iterator  thePosition) {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Remove__SWIG_0(swigCPtr, this,  TColStd_SequenceOfHExtendedString_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( TCollection_HExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Append__SWIG_0(swigCPtr, this,  TCollection_HExtendedString.getCPtr(theItem) , theItem);
  }

  public void Append( TColStd_SequenceOfHExtendedString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Append__SWIG_1(swigCPtr, this, TColStd_SequenceOfHExtendedString.getCPtr(theSeq), theSeq);
  }

  public void Prepend( TCollection_HExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Prepend__SWIG_0(swigCPtr, this,  TCollection_HExtendedString.getCPtr(theItem) , theItem);
  }

  public void Prepend( TColStd_SequenceOfHExtendedString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Prepend__SWIG_1(swigCPtr, this, TColStd_SequenceOfHExtendedString.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  TCollection_HExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_InsertBefore__SWIG_0(swigCPtr, this, theIndex,  TCollection_HExtendedString.getCPtr(theItem) , theItem);
  }

  public void InsertBefore(int theIndex,  TColStd_SequenceOfHExtendedString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_InsertBefore__SWIG_1(swigCPtr, this, theIndex, TColStd_SequenceOfHExtendedString.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( TColStd_SequenceOfHExtendedString_Iterator  thePosition,  TCollection_HExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_InsertAfter__SWIG_0(swigCPtr, this,  TColStd_SequenceOfHExtendedString_Iterator.getCPtr(thePosition) , thePosition,  TCollection_HExtendedString.getCPtr(theItem) , theItem);
  }

  public void InsertAfter(int theIndex,  TColStd_SequenceOfHExtendedString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_InsertAfter__SWIG_1(swigCPtr, this, theIndex, TColStd_SequenceOfHExtendedString.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  TCollection_HExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_InsertAfter__SWIG_2(swigCPtr, this, theIndex,  TCollection_HExtendedString.getCPtr(theItem) , theItem);
  }

  public void Split(int theIndex,  TColStd_SequenceOfHExtendedString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Split(swigCPtr, this, theIndex, TColStd_SequenceOfHExtendedString.getCPtr(theSeq), theSeq);
  }

  public  TCollection_HExtendedString  First() {
    return new TCollection_HExtendedString ( OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_First(swigCPtr, this), true );
  }

  public  TCollection_HExtendedString  ChangeFirst() {
    return new TCollection_HExtendedString ( OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_ChangeFirst(swigCPtr, this), true );
  }

  public  TCollection_HExtendedString  Last() {
    return new TCollection_HExtendedString ( OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Last(swigCPtr, this), true );
  }

  public  TCollection_HExtendedString  ChangeLast() {
    return new TCollection_HExtendedString ( OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_ChangeLast(swigCPtr, this), true );
  }

  public  TCollection_HExtendedString  Value(int theIndex) {
    return new TCollection_HExtendedString ( OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_Value(swigCPtr, this, theIndex), true );
  }

  public  TCollection_HExtendedString  ChangeValue(int theIndex) {
    return new TCollection_HExtendedString ( OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  TCollection_HExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfHExtendedString_SetValue(swigCPtr, this, theIndex,  TCollection_HExtendedString.getCPtr(theItem) , theItem);
  }

}
