package opencascade;

public class IntRes2d_SequenceOfIntersectionSegment {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntRes2d_SequenceOfIntersectionSegment(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntRes2d_SequenceOfIntersectionSegment(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntRes2d_SequenceOfIntersectionSegment obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntRes2d_SequenceOfIntersectionSegment(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntRes2d_SequenceOfIntersectionSegment() {
    this(OCCwrapJavaJNI.new_IntRes2d_SequenceOfIntersectionSegment__SWIG_0(), true);
  }

  public IntRes2d_SequenceOfIntersectionSegment( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_IntRes2d_SequenceOfIntersectionSegment__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public IntRes2d_SequenceOfIntersectionSegment( IntRes2d_SequenceOfIntersectionSegment  theOther) {
    this(OCCwrapJavaJNI.new_IntRes2d_SequenceOfIntersectionSegment__SWIG_2(IntRes2d_SequenceOfIntersectionSegment.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Clear__SWIG_1(swigCPtr, this);
  }

  public  IntRes2d_SequenceOfIntersectionSegment  Assign( IntRes2d_SequenceOfIntersectionSegment  theOther) {
    IntRes2d_SequenceOfIntersectionSegment ret = new IntRes2d_SequenceOfIntersectionSegment(OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Assign(swigCPtr, this, IntRes2d_SequenceOfIntersectionSegment.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( IntRes2d_SequenceOfIntersectionSegment_Iterator  thePosition) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Remove__SWIG_0(swigCPtr, this,  IntRes2d_SequenceOfIntersectionSegment_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( IntRes2d_IntersectionSegment  theItem) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Append__SWIG_0(swigCPtr, this, IntRes2d_IntersectionSegment.getCPtr(theItem), theItem);
  }

  public void Append( IntRes2d_SequenceOfIntersectionSegment  theSeq) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Append__SWIG_1(swigCPtr, this, IntRes2d_SequenceOfIntersectionSegment.getCPtr(theSeq), theSeq);
  }

  public void Prepend( IntRes2d_IntersectionSegment  theItem) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Prepend__SWIG_0(swigCPtr, this, IntRes2d_IntersectionSegment.getCPtr(theItem), theItem);
  }

  public void Prepend( IntRes2d_SequenceOfIntersectionSegment  theSeq) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Prepend__SWIG_1(swigCPtr, this, IntRes2d_SequenceOfIntersectionSegment.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  IntRes2d_IntersectionSegment  theItem) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_InsertBefore__SWIG_0(swigCPtr, this, theIndex, IntRes2d_IntersectionSegment.getCPtr(theItem), theItem);
  }

  public void InsertBefore(int theIndex,  IntRes2d_SequenceOfIntersectionSegment  theSeq) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_InsertBefore__SWIG_1(swigCPtr, this, theIndex, IntRes2d_SequenceOfIntersectionSegment.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( IntRes2d_SequenceOfIntersectionSegment_Iterator  thePosition,  IntRes2d_IntersectionSegment  theItem) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_InsertAfter__SWIG_0(swigCPtr, this,  IntRes2d_SequenceOfIntersectionSegment_Iterator.getCPtr(thePosition) , thePosition, IntRes2d_IntersectionSegment.getCPtr(theItem), theItem);
  }

  public void InsertAfter(int theIndex,  IntRes2d_SequenceOfIntersectionSegment  theSeq) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_InsertAfter__SWIG_1(swigCPtr, this, theIndex, IntRes2d_SequenceOfIntersectionSegment.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  IntRes2d_IntersectionSegment  theItem) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_InsertAfter__SWIG_2(swigCPtr, this, theIndex, IntRes2d_IntersectionSegment.getCPtr(theItem), theItem);
  }

  public void Split(int theIndex,  IntRes2d_SequenceOfIntersectionSegment  theSeq) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Split(swigCPtr, this, theIndex, IntRes2d_SequenceOfIntersectionSegment.getCPtr(theSeq), theSeq);
  }

  public  IntRes2d_IntersectionSegment  First() {
    IntRes2d_IntersectionSegment ret = new IntRes2d_IntersectionSegment(OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_First(swigCPtr, this), true);
    return ret;
  }

  public IntRes2d_IntersectionSegment ChangeFirst() {
    IntRes2d_IntersectionSegment ret = new IntRes2d_IntersectionSegment(OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new IntRes2d_IntersectionSegment.CRef (ret);
  }

  public  IntRes2d_IntersectionSegment  Last() {
    IntRes2d_IntersectionSegment ret = new IntRes2d_IntersectionSegment(OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Last(swigCPtr, this), true);
    return ret;
  }

  public IntRes2d_IntersectionSegment ChangeLast() {
    IntRes2d_IntersectionSegment ret = new IntRes2d_IntersectionSegment(OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_ChangeLast(swigCPtr, this), false, this);
    return ret; //new IntRes2d_IntersectionSegment.CRef (ret);
  }

  public  IntRes2d_IntersectionSegment  Value(int theIndex) {
    IntRes2d_IntersectionSegment ret = new IntRes2d_IntersectionSegment(OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public IntRes2d_IntersectionSegment ChangeValue(int theIndex) {
    IntRes2d_IntersectionSegment ret = new IntRes2d_IntersectionSegment(OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new IntRes2d_IntersectionSegment.CRef (ret);
  }

  public void SetValue(int theIndex,  IntRes2d_IntersectionSegment  theItem) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_SetValue(swigCPtr, this, theIndex, IntRes2d_IntersectionSegment.getCPtr(theItem), theItem);
  }

}
