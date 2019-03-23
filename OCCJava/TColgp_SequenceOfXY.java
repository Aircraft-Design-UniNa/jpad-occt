package opencascade;

public class TColgp_SequenceOfXY {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_SequenceOfXY(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_SequenceOfXY(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_SequenceOfXY obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_SequenceOfXY(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_SequenceOfXY() {
    this(OCCwrapJavaJNI.new_TColgp_SequenceOfXY__SWIG_0(), true);
  }

  public TColgp_SequenceOfXY( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TColgp_SequenceOfXY__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TColgp_SequenceOfXY( TColgp_SequenceOfXY  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_SequenceOfXY__SWIG_2(TColgp_SequenceOfXY.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_SequenceOfXY_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_SequenceOfXY_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColgp_SequenceOfXY_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColgp_SequenceOfXY_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColgp_SequenceOfXY_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_Clear__SWIG_1(swigCPtr, this);
  }

  public  TColgp_SequenceOfXY  Assign( TColgp_SequenceOfXY  theOther) {
    TColgp_SequenceOfXY ret = new TColgp_SequenceOfXY(OCCwrapJavaJNI.TColgp_SequenceOfXY_Assign(swigCPtr, this, TColgp_SequenceOfXY.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( TColgp_SequenceOfXY_Iterator  thePosition) {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_Remove__SWIG_0(swigCPtr, this,  TColgp_SequenceOfXY_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( gp_XY  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_Append__SWIG_0(swigCPtr, this, gp_XY.getCPtr(theItem), theItem);
  }

  public void Append( TColgp_SequenceOfXY  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_Append__SWIG_1(swigCPtr, this, TColgp_SequenceOfXY.getCPtr(theSeq), theSeq);
  }

  public void Prepend( gp_XY  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_Prepend__SWIG_0(swigCPtr, this, gp_XY.getCPtr(theItem), theItem);
  }

  public void Prepend( TColgp_SequenceOfXY  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_Prepend__SWIG_1(swigCPtr, this, TColgp_SequenceOfXY.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  gp_XY  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_InsertBefore__SWIG_0(swigCPtr, this, theIndex, gp_XY.getCPtr(theItem), theItem);
  }

  public void InsertBefore(int theIndex,  TColgp_SequenceOfXY  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_InsertBefore__SWIG_1(swigCPtr, this, theIndex, TColgp_SequenceOfXY.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( TColgp_SequenceOfXY_Iterator  thePosition,  gp_XY  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_InsertAfter__SWIG_0(swigCPtr, this,  TColgp_SequenceOfXY_Iterator.getCPtr(thePosition) , thePosition, gp_XY.getCPtr(theItem), theItem);
  }

  public void InsertAfter(int theIndex,  TColgp_SequenceOfXY  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_InsertAfter__SWIG_1(swigCPtr, this, theIndex, TColgp_SequenceOfXY.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  gp_XY  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_InsertAfter__SWIG_2(swigCPtr, this, theIndex, gp_XY.getCPtr(theItem), theItem);
  }

  public void Split(int theIndex,  TColgp_SequenceOfXY  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_Split(swigCPtr, this, theIndex, TColgp_SequenceOfXY.getCPtr(theSeq), theSeq);
  }

  public  gp_XY  First() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_SequenceOfXY_First(swigCPtr, this), true);
    return ret;
  }

  public gp_XY ChangeFirst() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_SequenceOfXY_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new gp_XY.CRef (ret);
  }

  public  gp_XY  Last() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_SequenceOfXY_Last(swigCPtr, this), true);
    return ret;
  }

  public gp_XY ChangeLast() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_SequenceOfXY_ChangeLast(swigCPtr, this), false, this);
    return ret; //new gp_XY.CRef (ret);
  }

  public  gp_XY  Value(int theIndex) {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_SequenceOfXY_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public gp_XY ChangeValue(int theIndex) {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_SequenceOfXY_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_XY.CRef (ret);
  }

  public void SetValue(int theIndex,  gp_XY  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_SetValue(swigCPtr, this, theIndex, gp_XY.getCPtr(theItem), theItem);
  }

}
