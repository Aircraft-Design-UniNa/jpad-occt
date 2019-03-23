package opencascade;

public class TColStd_SequenceOfAsciiString {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_SequenceOfAsciiString(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_SequenceOfAsciiString(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_SequenceOfAsciiString obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_SequenceOfAsciiString(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_SequenceOfAsciiString() {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfAsciiString__SWIG_0(), true);
  }

  public TColStd_SequenceOfAsciiString( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfAsciiString__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TColStd_SequenceOfAsciiString( TColStd_SequenceOfAsciiString  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfAsciiString__SWIG_2(TColStd_SequenceOfAsciiString.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Clear__SWIG_1(swigCPtr, this);
  }

  public  TColStd_SequenceOfAsciiString  Assign( TColStd_SequenceOfAsciiString  theOther) {
    TColStd_SequenceOfAsciiString ret = new TColStd_SequenceOfAsciiString(OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Assign(swigCPtr, this, TColStd_SequenceOfAsciiString.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( TColStd_SequenceOfAsciiString_Iterator  thePosition) {
    OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Remove__SWIG_0(swigCPtr, this,  TColStd_SequenceOfAsciiString_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( TCollection_AsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Append__SWIG_0(swigCPtr, this, TCollection_AsciiString.getCPtr(theItem), theItem);
  }

  public void Append( TColStd_SequenceOfAsciiString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Append__SWIG_1(swigCPtr, this, TColStd_SequenceOfAsciiString.getCPtr(theSeq), theSeq);
  }

  public void Prepend( TCollection_AsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Prepend__SWIG_0(swigCPtr, this, TCollection_AsciiString.getCPtr(theItem), theItem);
  }

  public void Prepend( TColStd_SequenceOfAsciiString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Prepend__SWIG_1(swigCPtr, this, TColStd_SequenceOfAsciiString.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  TCollection_AsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_InsertBefore__SWIG_0(swigCPtr, this, theIndex, TCollection_AsciiString.getCPtr(theItem), theItem);
  }

  public void InsertBefore(int theIndex,  TColStd_SequenceOfAsciiString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_InsertBefore__SWIG_1(swigCPtr, this, theIndex, TColStd_SequenceOfAsciiString.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( TColStd_SequenceOfAsciiString_Iterator  thePosition,  TCollection_AsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_InsertAfter__SWIG_0(swigCPtr, this,  TColStd_SequenceOfAsciiString_Iterator.getCPtr(thePosition) , thePosition, TCollection_AsciiString.getCPtr(theItem), theItem);
  }

  public void InsertAfter(int theIndex,  TColStd_SequenceOfAsciiString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_InsertAfter__SWIG_1(swigCPtr, this, theIndex, TColStd_SequenceOfAsciiString.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  TCollection_AsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_InsertAfter__SWIG_2(swigCPtr, this, theIndex, TCollection_AsciiString.getCPtr(theItem), theItem);
  }

  public void Split(int theIndex,  TColStd_SequenceOfAsciiString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Split(swigCPtr, this, theIndex, TColStd_SequenceOfAsciiString.getCPtr(theSeq), theSeq);
  }

  public  TCollection_AsciiString  First() {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_First(swigCPtr, this), true);
    return ret;
  }

  public TCollection_AsciiString ChangeFirst() {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new TCollection_AsciiString.CRef (ret);
  }

  public  TCollection_AsciiString  Last() {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Last(swigCPtr, this), true);
    return ret;
  }

  public TCollection_AsciiString ChangeLast() {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_ChangeLast(swigCPtr, this), false, this);
    return ret; //new TCollection_AsciiString.CRef (ret);
  }

  public  TCollection_AsciiString  Value(int theIndex) {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public TCollection_AsciiString ChangeValue(int theIndex) {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new TCollection_AsciiString.CRef (ret);
  }

  public void SetValue(int theIndex,  TCollection_AsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfAsciiString_SetValue(swigCPtr, this, theIndex, TCollection_AsciiString.getCPtr(theItem), theItem);
  }

}
