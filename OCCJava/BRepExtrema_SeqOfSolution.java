package opencascade;

public class BRepExtrema_SeqOfSolution {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepExtrema_SeqOfSolution(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepExtrema_SeqOfSolution(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepExtrema_SeqOfSolution obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepExtrema_SeqOfSolution(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BRepExtrema_SeqOfSolution() {
    this(OCCwrapJavaJNI.new_BRepExtrema_SeqOfSolution__SWIG_0(), true);
  }

  public BRepExtrema_SeqOfSolution( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BRepExtrema_SeqOfSolution__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public BRepExtrema_SeqOfSolution( BRepExtrema_SeqOfSolution  theOther) {
    this(OCCwrapJavaJNI.new_BRepExtrema_SeqOfSolution__SWIG_2(BRepExtrema_SeqOfSolution.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Clear__SWIG_1(swigCPtr, this);
  }

  public  BRepExtrema_SeqOfSolution  Assign( BRepExtrema_SeqOfSolution  theOther) {
    BRepExtrema_SeqOfSolution ret = new BRepExtrema_SeqOfSolution(OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Assign(swigCPtr, this, BRepExtrema_SeqOfSolution.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( BRepExtrema_SeqOfSolution_Iterator  thePosition) {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Remove__SWIG_0(swigCPtr, this,  BRepExtrema_SeqOfSolution_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( BRepExtrema_SolutionElem  theItem) {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Append__SWIG_0(swigCPtr, this, BRepExtrema_SolutionElem.getCPtr(theItem), theItem);
  }

  public void Append( BRepExtrema_SeqOfSolution  theSeq) {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Append__SWIG_1(swigCPtr, this, BRepExtrema_SeqOfSolution.getCPtr(theSeq), theSeq);
  }

  public void Prepend( BRepExtrema_SolutionElem  theItem) {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Prepend__SWIG_0(swigCPtr, this, BRepExtrema_SolutionElem.getCPtr(theItem), theItem);
  }

  public void Prepend( BRepExtrema_SeqOfSolution  theSeq) {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Prepend__SWIG_1(swigCPtr, this, BRepExtrema_SeqOfSolution.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  BRepExtrema_SolutionElem  theItem) {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_InsertBefore__SWIG_0(swigCPtr, this, theIndex, BRepExtrema_SolutionElem.getCPtr(theItem), theItem);
  }

  public void InsertBefore(int theIndex,  BRepExtrema_SeqOfSolution  theSeq) {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_InsertBefore__SWIG_1(swigCPtr, this, theIndex, BRepExtrema_SeqOfSolution.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( BRepExtrema_SeqOfSolution_Iterator  thePosition,  BRepExtrema_SolutionElem  theItem) {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_InsertAfter__SWIG_0(swigCPtr, this,  BRepExtrema_SeqOfSolution_Iterator.getCPtr(thePosition) , thePosition, BRepExtrema_SolutionElem.getCPtr(theItem), theItem);
  }

  public void InsertAfter(int theIndex,  BRepExtrema_SeqOfSolution  theSeq) {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_InsertAfter__SWIG_1(swigCPtr, this, theIndex, BRepExtrema_SeqOfSolution.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  BRepExtrema_SolutionElem  theItem) {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_InsertAfter__SWIG_2(swigCPtr, this, theIndex, BRepExtrema_SolutionElem.getCPtr(theItem), theItem);
  }

  public void Split(int theIndex,  BRepExtrema_SeqOfSolution  theSeq) {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Split(swigCPtr, this, theIndex, BRepExtrema_SeqOfSolution.getCPtr(theSeq), theSeq);
  }

  public  BRepExtrema_SolutionElem  First() {
    BRepExtrema_SolutionElem ret = new BRepExtrema_SolutionElem(OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_First(swigCPtr, this), false, this);
    return ret;
  }

  public  BRepExtrema_SolutionElem  ChangeFirst() {
    BRepExtrema_SolutionElem ret = new BRepExtrema_SolutionElem(OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_ChangeFirst(swigCPtr, this), false, this);
    return ret;
  }

  public  BRepExtrema_SolutionElem  Last() {
    BRepExtrema_SolutionElem ret = new BRepExtrema_SolutionElem(OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Last(swigCPtr, this), false, this);
    return ret;
  }

  public  BRepExtrema_SolutionElem  ChangeLast() {
    BRepExtrema_SolutionElem ret = new BRepExtrema_SolutionElem(OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_ChangeLast(swigCPtr, this), false, this);
    return ret;
  }

  public  BRepExtrema_SolutionElem  Value(int theIndex) {
    BRepExtrema_SolutionElem ret = new BRepExtrema_SolutionElem(OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Value(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public  BRepExtrema_SolutionElem  ChangeValue(int theIndex) {
    BRepExtrema_SolutionElem ret = new BRepExtrema_SolutionElem(OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public void SetValue(int theIndex,  BRepExtrema_SolutionElem  theItem) {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_SetValue(swigCPtr, this, theIndex, BRepExtrema_SolutionElem.getCPtr(theItem), theItem);
  }

}
