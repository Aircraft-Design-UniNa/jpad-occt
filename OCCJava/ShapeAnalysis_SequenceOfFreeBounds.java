package opencascade;

public class ShapeAnalysis_SequenceOfFreeBounds {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeAnalysis_SequenceOfFreeBounds(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeAnalysis_SequenceOfFreeBounds(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeAnalysis_SequenceOfFreeBounds obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeAnalysis_SequenceOfFreeBounds(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ShapeAnalysis_SequenceOfFreeBounds() {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_SequenceOfFreeBounds__SWIG_0(), true);
  }

  public ShapeAnalysis_SequenceOfFreeBounds( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_SequenceOfFreeBounds__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public ShapeAnalysis_SequenceOfFreeBounds( ShapeAnalysis_SequenceOfFreeBounds  theOther) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_SequenceOfFreeBounds__SWIG_2(ShapeAnalysis_SequenceOfFreeBounds.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Clear__SWIG_1(swigCPtr, this);
  }

  public  ShapeAnalysis_SequenceOfFreeBounds  Assign( ShapeAnalysis_SequenceOfFreeBounds  theOther) {
    ShapeAnalysis_SequenceOfFreeBounds ret = new ShapeAnalysis_SequenceOfFreeBounds(OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Assign(swigCPtr, this, ShapeAnalysis_SequenceOfFreeBounds.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( ShapeAnalysis_SequenceOfFreeBounds_Iterator  thePosition) {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Remove__SWIG_0(swigCPtr, this,  ShapeAnalysis_SequenceOfFreeBounds_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( ShapeAnalysis_FreeBoundData  theItem) {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Append__SWIG_0(swigCPtr, this,  ShapeAnalysis_FreeBoundData.getCPtr(theItem) , theItem);
  }

  public void Append( ShapeAnalysis_SequenceOfFreeBounds  theSeq) {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Append__SWIG_1(swigCPtr, this, ShapeAnalysis_SequenceOfFreeBounds.getCPtr(theSeq), theSeq);
  }

  public void Prepend( ShapeAnalysis_FreeBoundData  theItem) {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Prepend__SWIG_0(swigCPtr, this,  ShapeAnalysis_FreeBoundData.getCPtr(theItem) , theItem);
  }

  public void Prepend( ShapeAnalysis_SequenceOfFreeBounds  theSeq) {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Prepend__SWIG_1(swigCPtr, this, ShapeAnalysis_SequenceOfFreeBounds.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  ShapeAnalysis_FreeBoundData  theItem) {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_InsertBefore__SWIG_0(swigCPtr, this, theIndex,  ShapeAnalysis_FreeBoundData.getCPtr(theItem) , theItem);
  }

  public void InsertBefore(int theIndex,  ShapeAnalysis_SequenceOfFreeBounds  theSeq) {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_InsertBefore__SWIG_1(swigCPtr, this, theIndex, ShapeAnalysis_SequenceOfFreeBounds.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( ShapeAnalysis_SequenceOfFreeBounds_Iterator  thePosition,  ShapeAnalysis_FreeBoundData  theItem) {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_InsertAfter__SWIG_0(swigCPtr, this,  ShapeAnalysis_SequenceOfFreeBounds_Iterator.getCPtr(thePosition) , thePosition,  ShapeAnalysis_FreeBoundData.getCPtr(theItem) , theItem);
  }

  public void InsertAfter(int theIndex,  ShapeAnalysis_SequenceOfFreeBounds  theSeq) {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_InsertAfter__SWIG_1(swigCPtr, this, theIndex, ShapeAnalysis_SequenceOfFreeBounds.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  ShapeAnalysis_FreeBoundData  theItem) {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_InsertAfter__SWIG_2(swigCPtr, this, theIndex,  ShapeAnalysis_FreeBoundData.getCPtr(theItem) , theItem);
  }

  public void Split(int theIndex,  ShapeAnalysis_SequenceOfFreeBounds  theSeq) {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Split(swigCPtr, this, theIndex, ShapeAnalysis_SequenceOfFreeBounds.getCPtr(theSeq), theSeq);
  }

  public  ShapeAnalysis_FreeBoundData  First() {
    return new ShapeAnalysis_FreeBoundData ( OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_First(swigCPtr, this), true );
  }

  public  ShapeAnalysis_FreeBoundData  ChangeFirst() {
    return new ShapeAnalysis_FreeBoundData ( OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_ChangeFirst(swigCPtr, this), true );
  }

  public  ShapeAnalysis_FreeBoundData  Last() {
    return new ShapeAnalysis_FreeBoundData ( OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Last(swigCPtr, this), true );
  }

  public  ShapeAnalysis_FreeBoundData  ChangeLast() {
    return new ShapeAnalysis_FreeBoundData ( OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_ChangeLast(swigCPtr, this), true );
  }

  public  ShapeAnalysis_FreeBoundData  Value(int theIndex) {
    return new ShapeAnalysis_FreeBoundData ( OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Value(swigCPtr, this, theIndex), true );
  }

  public  ShapeAnalysis_FreeBoundData  ChangeValue(int theIndex) {
    return new ShapeAnalysis_FreeBoundData ( OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  ShapeAnalysis_FreeBoundData  theItem) {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_SetValue(swigCPtr, this, theIndex,  ShapeAnalysis_FreeBoundData.getCPtr(theItem) , theItem);
  }

}
