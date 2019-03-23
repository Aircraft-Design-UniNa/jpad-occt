package opencascade;

public class TDocStd_SequenceOfDocument {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDocStd_SequenceOfDocument(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDocStd_SequenceOfDocument(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDocStd_SequenceOfDocument obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDocStd_SequenceOfDocument(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDocStd_SequenceOfDocument() {
    this(OCCwrapJavaJNI.new_TDocStd_SequenceOfDocument__SWIG_0(), true);
  }

  public TDocStd_SequenceOfDocument( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TDocStd_SequenceOfDocument__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TDocStd_SequenceOfDocument( TDocStd_SequenceOfDocument  theOther) {
    this(OCCwrapJavaJNI.new_TDocStd_SequenceOfDocument__SWIG_2(TDocStd_SequenceOfDocument.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TDocStd_SequenceOfDocument_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Clear__SWIG_1(swigCPtr, this);
  }

  public  TDocStd_SequenceOfDocument  Assign( TDocStd_SequenceOfDocument  theOther) {
    TDocStd_SequenceOfDocument ret = new TDocStd_SequenceOfDocument(OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Assign(swigCPtr, this, TDocStd_SequenceOfDocument.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( TDocStd_SequenceOfDocument_Iterator  thePosition) {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Remove__SWIG_0(swigCPtr, this,  TDocStd_SequenceOfDocument_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( TDocStd_Document  theItem) {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Append__SWIG_0(swigCPtr, this,  TDocStd_Document.getCPtr(theItem) , theItem);
  }

  public void Append( TDocStd_SequenceOfDocument  theSeq) {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Append__SWIG_1(swigCPtr, this, TDocStd_SequenceOfDocument.getCPtr(theSeq), theSeq);
  }

  public void Prepend( TDocStd_Document  theItem) {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Prepend__SWIG_0(swigCPtr, this,  TDocStd_Document.getCPtr(theItem) , theItem);
  }

  public void Prepend( TDocStd_SequenceOfDocument  theSeq) {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Prepend__SWIG_1(swigCPtr, this, TDocStd_SequenceOfDocument.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  TDocStd_Document  theItem) {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_InsertBefore__SWIG_0(swigCPtr, this, theIndex,  TDocStd_Document.getCPtr(theItem) , theItem);
  }

  public void InsertBefore(int theIndex,  TDocStd_SequenceOfDocument  theSeq) {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_InsertBefore__SWIG_1(swigCPtr, this, theIndex, TDocStd_SequenceOfDocument.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( TDocStd_SequenceOfDocument_Iterator  thePosition,  TDocStd_Document  theItem) {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_InsertAfter__SWIG_0(swigCPtr, this,  TDocStd_SequenceOfDocument_Iterator.getCPtr(thePosition) , thePosition,  TDocStd_Document.getCPtr(theItem) , theItem);
  }

  public void InsertAfter(int theIndex,  TDocStd_SequenceOfDocument  theSeq) {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_InsertAfter__SWIG_1(swigCPtr, this, theIndex, TDocStd_SequenceOfDocument.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  TDocStd_Document  theItem) {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_InsertAfter__SWIG_2(swigCPtr, this, theIndex,  TDocStd_Document.getCPtr(theItem) , theItem);
  }

  public void Split(int theIndex,  TDocStd_SequenceOfDocument  theSeq) {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Split(swigCPtr, this, theIndex, TDocStd_SequenceOfDocument.getCPtr(theSeq), theSeq);
  }

  public  TDocStd_Document  First() {
    return new TDocStd_Document ( OCCwrapJavaJNI.TDocStd_SequenceOfDocument_First(swigCPtr, this), true );
  }

  public  TDocStd_Document  ChangeFirst() {
    return new TDocStd_Document ( OCCwrapJavaJNI.TDocStd_SequenceOfDocument_ChangeFirst(swigCPtr, this), true );
  }

  public  TDocStd_Document  Last() {
    return new TDocStd_Document ( OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Last(swigCPtr, this), true );
  }

  public  TDocStd_Document  ChangeLast() {
    return new TDocStd_Document ( OCCwrapJavaJNI.TDocStd_SequenceOfDocument_ChangeLast(swigCPtr, this), true );
  }

  public  TDocStd_Document  Value(int theIndex) {
    return new TDocStd_Document ( OCCwrapJavaJNI.TDocStd_SequenceOfDocument_Value(swigCPtr, this, theIndex), true );
  }

  public  TDocStd_Document  ChangeValue(int theIndex) {
    return new TDocStd_Document ( OCCwrapJavaJNI.TDocStd_SequenceOfDocument_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  TDocStd_Document  theItem) {
    OCCwrapJavaJNI.TDocStd_SequenceOfDocument_SetValue(swigCPtr, this, theIndex,  TDocStd_Document.getCPtr(theItem) , theItem);
  }

}
