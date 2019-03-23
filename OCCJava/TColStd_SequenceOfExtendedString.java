package opencascade;

public class TColStd_SequenceOfExtendedString {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_SequenceOfExtendedString(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_SequenceOfExtendedString(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_SequenceOfExtendedString obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_SequenceOfExtendedString(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_SequenceOfExtendedString() {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfExtendedString__SWIG_0(), true);
  }

  public TColStd_SequenceOfExtendedString( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfExtendedString__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TColStd_SequenceOfExtendedString( TColStd_SequenceOfExtendedString  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfExtendedString__SWIG_2(TColStd_SequenceOfExtendedString.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Clear__SWIG_1(swigCPtr, this);
  }

  public  TColStd_SequenceOfExtendedString  Assign( TColStd_SequenceOfExtendedString  theOther) {
    TColStd_SequenceOfExtendedString ret = new TColStd_SequenceOfExtendedString(OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Assign(swigCPtr, this, TColStd_SequenceOfExtendedString.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( TColStd_SequenceOfExtendedString_Iterator  thePosition) {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Remove__SWIG_0(swigCPtr, this,  TColStd_SequenceOfExtendedString_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( TCollection_ExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Append__SWIG_0(swigCPtr, this, TCollection_ExtendedString.getCPtr(theItem), theItem);
  }

  public void Append( TColStd_SequenceOfExtendedString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Append__SWIG_1(swigCPtr, this, TColStd_SequenceOfExtendedString.getCPtr(theSeq), theSeq);
  }

  public void Prepend( TCollection_ExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Prepend__SWIG_0(swigCPtr, this, TCollection_ExtendedString.getCPtr(theItem), theItem);
  }

  public void Prepend( TColStd_SequenceOfExtendedString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Prepend__SWIG_1(swigCPtr, this, TColStd_SequenceOfExtendedString.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  TCollection_ExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_InsertBefore__SWIG_0(swigCPtr, this, theIndex, TCollection_ExtendedString.getCPtr(theItem), theItem);
  }

  public void InsertBefore(int theIndex,  TColStd_SequenceOfExtendedString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_InsertBefore__SWIG_1(swigCPtr, this, theIndex, TColStd_SequenceOfExtendedString.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( TColStd_SequenceOfExtendedString_Iterator  thePosition,  TCollection_ExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_InsertAfter__SWIG_0(swigCPtr, this,  TColStd_SequenceOfExtendedString_Iterator.getCPtr(thePosition) , thePosition, TCollection_ExtendedString.getCPtr(theItem), theItem);
  }

  public void InsertAfter(int theIndex,  TColStd_SequenceOfExtendedString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_InsertAfter__SWIG_1(swigCPtr, this, theIndex, TColStd_SequenceOfExtendedString.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  TCollection_ExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_InsertAfter__SWIG_2(swigCPtr, this, theIndex, TCollection_ExtendedString.getCPtr(theItem), theItem);
  }

  public void Split(int theIndex,  TColStd_SequenceOfExtendedString  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Split(swigCPtr, this, theIndex, TColStd_SequenceOfExtendedString.getCPtr(theSeq), theSeq);
  }

  public  TCollection_ExtendedString  First() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_First(swigCPtr, this), true);
    return ret;
  }

  public TCollection_ExtendedString ChangeFirst() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new TCollection_ExtendedString.CRef (ret);
  }

  public  TCollection_ExtendedString  Last() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Last(swigCPtr, this), true);
    return ret;
  }

  public TCollection_ExtendedString ChangeLast() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_ChangeLast(swigCPtr, this), false, this);
    return ret; //new TCollection_ExtendedString.CRef (ret);
  }

  public  TCollection_ExtendedString  Value(int theIndex) {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public TCollection_ExtendedString ChangeValue(int theIndex) {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new TCollection_ExtendedString.CRef (ret);
  }

  public void SetValue(int theIndex,  TCollection_ExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfExtendedString_SetValue(swigCPtr, this, theIndex, TCollection_ExtendedString.getCPtr(theItem), theItem);
  }

}
