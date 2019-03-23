package opencascade;

public class IntRes2d_SequenceOfIntersectionPoint {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntRes2d_SequenceOfIntersectionPoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntRes2d_SequenceOfIntersectionPoint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntRes2d_SequenceOfIntersectionPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntRes2d_SequenceOfIntersectionPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntRes2d_SequenceOfIntersectionPoint() {
    this(OCCwrapJavaJNI.new_IntRes2d_SequenceOfIntersectionPoint__SWIG_0(), true);
  }

  public IntRes2d_SequenceOfIntersectionPoint( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_IntRes2d_SequenceOfIntersectionPoint__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public IntRes2d_SequenceOfIntersectionPoint( IntRes2d_SequenceOfIntersectionPoint  theOther) {
    this(OCCwrapJavaJNI.new_IntRes2d_SequenceOfIntersectionPoint__SWIG_2(IntRes2d_SequenceOfIntersectionPoint.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Clear__SWIG_1(swigCPtr, this);
  }

  public  IntRes2d_SequenceOfIntersectionPoint  Assign( IntRes2d_SequenceOfIntersectionPoint  theOther) {
    IntRes2d_SequenceOfIntersectionPoint ret = new IntRes2d_SequenceOfIntersectionPoint(OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Assign(swigCPtr, this, IntRes2d_SequenceOfIntersectionPoint.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( IntRes2d_SequenceOfIntersectionPoint_Iterator  thePosition) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Remove__SWIG_0(swigCPtr, this,  IntRes2d_SequenceOfIntersectionPoint_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( IntRes2d_IntersectionPoint  theItem) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Append__SWIG_0(swigCPtr, this, IntRes2d_IntersectionPoint.getCPtr(theItem), theItem);
  }

  public void Append( IntRes2d_SequenceOfIntersectionPoint  theSeq) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Append__SWIG_1(swigCPtr, this, IntRes2d_SequenceOfIntersectionPoint.getCPtr(theSeq), theSeq);
  }

  public void Prepend( IntRes2d_IntersectionPoint  theItem) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Prepend__SWIG_0(swigCPtr, this, IntRes2d_IntersectionPoint.getCPtr(theItem), theItem);
  }

  public void Prepend( IntRes2d_SequenceOfIntersectionPoint  theSeq) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Prepend__SWIG_1(swigCPtr, this, IntRes2d_SequenceOfIntersectionPoint.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  IntRes2d_IntersectionPoint  theItem) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_InsertBefore__SWIG_0(swigCPtr, this, theIndex, IntRes2d_IntersectionPoint.getCPtr(theItem), theItem);
  }

  public void InsertBefore(int theIndex,  IntRes2d_SequenceOfIntersectionPoint  theSeq) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_InsertBefore__SWIG_1(swigCPtr, this, theIndex, IntRes2d_SequenceOfIntersectionPoint.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( IntRes2d_SequenceOfIntersectionPoint_Iterator  thePosition,  IntRes2d_IntersectionPoint  theItem) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_InsertAfter__SWIG_0(swigCPtr, this,  IntRes2d_SequenceOfIntersectionPoint_Iterator.getCPtr(thePosition) , thePosition, IntRes2d_IntersectionPoint.getCPtr(theItem), theItem);
  }

  public void InsertAfter(int theIndex,  IntRes2d_SequenceOfIntersectionPoint  theSeq) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_InsertAfter__SWIG_1(swigCPtr, this, theIndex, IntRes2d_SequenceOfIntersectionPoint.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  IntRes2d_IntersectionPoint  theItem) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_InsertAfter__SWIG_2(swigCPtr, this, theIndex, IntRes2d_IntersectionPoint.getCPtr(theItem), theItem);
  }

  public void Split(int theIndex,  IntRes2d_SequenceOfIntersectionPoint  theSeq) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Split(swigCPtr, this, theIndex, IntRes2d_SequenceOfIntersectionPoint.getCPtr(theSeq), theSeq);
  }

  public  IntRes2d_IntersectionPoint  First() {
    IntRes2d_IntersectionPoint ret = new IntRes2d_IntersectionPoint(OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_First(swigCPtr, this), true);
    return ret;
  }

  public IntRes2d_IntersectionPoint ChangeFirst() {
    IntRes2d_IntersectionPoint ret = new IntRes2d_IntersectionPoint(OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new IntRes2d_IntersectionPoint.CRef (ret);
  }

  public  IntRes2d_IntersectionPoint  Last() {
    IntRes2d_IntersectionPoint ret = new IntRes2d_IntersectionPoint(OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Last(swigCPtr, this), true);
    return ret;
  }

  public IntRes2d_IntersectionPoint ChangeLast() {
    IntRes2d_IntersectionPoint ret = new IntRes2d_IntersectionPoint(OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_ChangeLast(swigCPtr, this), false, this);
    return ret; //new IntRes2d_IntersectionPoint.CRef (ret);
  }

  public  IntRes2d_IntersectionPoint  Value(int theIndex) {
    IntRes2d_IntersectionPoint ret = new IntRes2d_IntersectionPoint(OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public IntRes2d_IntersectionPoint ChangeValue(int theIndex) {
    IntRes2d_IntersectionPoint ret = new IntRes2d_IntersectionPoint(OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new IntRes2d_IntersectionPoint.CRef (ret);
  }

  public void SetValue(int theIndex,  IntRes2d_IntersectionPoint  theItem) {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionPoint_SetValue(swigCPtr, this, theIndex, IntRes2d_IntersectionPoint.getCPtr(theItem), theItem);
  }

}
