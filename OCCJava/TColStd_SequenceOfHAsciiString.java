package opencascade;

public class TColStd_SequenceOfHAsciiString {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_SequenceOfHAsciiString(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_SequenceOfHAsciiString(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_SequenceOfHAsciiString obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_SequenceOfHAsciiString(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_SequenceOfHAsciiString() {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfHAsciiString__SWIG_0(), true);
  }

  public TColStd_SequenceOfHAsciiString( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfHAsciiString__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TColStd_SequenceOfHAsciiString( TColStd_SequenceOfHAsciiString  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfHAsciiString__SWIG_2(TColStd_SequenceOfHAsciiString.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Clear__SWIG_1(swigCPtr, this);
  }

  public  TColStd_SequenceOfHAsciiString  Assign( TColStd_SequenceOfHAsciiString  theOther) {
    TColStd_SequenceOfHAsciiString ret = new TColStd_SequenceOfHAsciiString(OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Assign(swigCPtr, this, TColStd_SequenceOfHAsciiString.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( TColStd_SequenceOfHAsciiString_Iterator  thePosition) {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Remove__SWIG_0(swigCPtr, this,  TColStd_SequenceOfHAsciiString_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( TCollection_HAsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Append__SWIG_0(swigCPtr, this,  TCollection_HAsciiString.getCPtr(theItem) , theItem);
  }

  public void Append( TColStd_SequenceOfHAsciiString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Append__SWIG_1(swigCPtr, this, TColStd_SequenceOfHAsciiString.getCPtr(theSeq), theSeq);
  }

  public void Prepend( TCollection_HAsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Prepend__SWIG_0(swigCPtr, this,  TCollection_HAsciiString.getCPtr(theItem) , theItem);
  }

  public void Prepend( TColStd_SequenceOfHAsciiString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Prepend__SWIG_1(swigCPtr, this, TColStd_SequenceOfHAsciiString.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  TCollection_HAsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_InsertBefore__SWIG_0(swigCPtr, this, theIndex,  TCollection_HAsciiString.getCPtr(theItem) , theItem);
  }

  public void InsertBefore(int theIndex,  TColStd_SequenceOfHAsciiString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_InsertBefore__SWIG_1(swigCPtr, this, theIndex, TColStd_SequenceOfHAsciiString.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( TColStd_SequenceOfHAsciiString_Iterator  thePosition,  TCollection_HAsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_InsertAfter__SWIG_0(swigCPtr, this,  TColStd_SequenceOfHAsciiString_Iterator.getCPtr(thePosition) , thePosition,  TCollection_HAsciiString.getCPtr(theItem) , theItem);
  }

  public void InsertAfter(int theIndex,  TColStd_SequenceOfHAsciiString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_InsertAfter__SWIG_1(swigCPtr, this, theIndex, TColStd_SequenceOfHAsciiString.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  TCollection_HAsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_InsertAfter__SWIG_2(swigCPtr, this, theIndex,  TCollection_HAsciiString.getCPtr(theItem) , theItem);
  }

  public void Split(int theIndex,  TColStd_SequenceOfHAsciiString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Split(swigCPtr, this, theIndex, TColStd_SequenceOfHAsciiString.getCPtr(theSeq), theSeq);
  }

  public  TCollection_HAsciiString  First() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_First(swigCPtr, this), true );
  }

  public  TCollection_HAsciiString  ChangeFirst() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_ChangeFirst(swigCPtr, this), true );
  }

  public  TCollection_HAsciiString  Last() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Last(swigCPtr, this), true );
  }

  public  TCollection_HAsciiString  ChangeLast() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_ChangeLast(swigCPtr, this), true );
  }

  public  TCollection_HAsciiString  Value(int theIndex) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_Value(swigCPtr, this, theIndex), true );
  }

  public  TCollection_HAsciiString  ChangeValue(int theIndex) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  TCollection_HAsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfHAsciiString_SetValue(swigCPtr, this, theIndex,  TCollection_HAsciiString.getCPtr(theItem) , theItem);
  }

}
