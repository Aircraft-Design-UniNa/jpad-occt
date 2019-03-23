package opencascade;

public class TColgp_SequenceOfPnt {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_SequenceOfPnt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_SequenceOfPnt(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_SequenceOfPnt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_SequenceOfPnt(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_SequenceOfPnt() {
    this(OCCwrapJavaJNI.new_TColgp_SequenceOfPnt__SWIG_0(), true);
  }

  public TColgp_SequenceOfPnt( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TColgp_SequenceOfPnt__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TColgp_SequenceOfPnt( TColgp_SequenceOfPnt  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_SequenceOfPnt__SWIG_2(TColgp_SequenceOfPnt.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_SequenceOfPnt_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_SequenceOfPnt_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColgp_SequenceOfPnt_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColgp_SequenceOfPnt_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColgp_SequenceOfPnt_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_Clear__SWIG_1(swigCPtr, this);
  }

  public  TColgp_SequenceOfPnt  Assign( TColgp_SequenceOfPnt  theOther) {
    TColgp_SequenceOfPnt ret = new TColgp_SequenceOfPnt(OCCwrapJavaJNI.TColgp_SequenceOfPnt_Assign(swigCPtr, this, TColgp_SequenceOfPnt.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( TColgp_SequenceOfPnt_Iterator  thePosition) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_Remove__SWIG_0(swigCPtr, this,  TColgp_SequenceOfPnt_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( gp_Pnt  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_Append__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(theItem), theItem);
  }

  public void Append( TColgp_SequenceOfPnt  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_Append__SWIG_1(swigCPtr, this, TColgp_SequenceOfPnt.getCPtr(theSeq), theSeq);
  }

  public void Prepend( gp_Pnt  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_Prepend__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(theItem), theItem);
  }

  public void Prepend( TColgp_SequenceOfPnt  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_Prepend__SWIG_1(swigCPtr, this, TColgp_SequenceOfPnt.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  gp_Pnt  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_InsertBefore__SWIG_0(swigCPtr, this, theIndex, gp_Pnt.getCPtr(theItem), theItem);
  }

  public void InsertBefore(int theIndex,  TColgp_SequenceOfPnt  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_InsertBefore__SWIG_1(swigCPtr, this, theIndex, TColgp_SequenceOfPnt.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( TColgp_SequenceOfPnt_Iterator  thePosition,  gp_Pnt  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_InsertAfter__SWIG_0(swigCPtr, this,  TColgp_SequenceOfPnt_Iterator.getCPtr(thePosition) , thePosition, gp_Pnt.getCPtr(theItem), theItem);
  }

  public void InsertAfter(int theIndex,  TColgp_SequenceOfPnt  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_InsertAfter__SWIG_1(swigCPtr, this, theIndex, TColgp_SequenceOfPnt.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  gp_Pnt  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_InsertAfter__SWIG_2(swigCPtr, this, theIndex, gp_Pnt.getCPtr(theItem), theItem);
  }

  public void Split(int theIndex,  TColgp_SequenceOfPnt  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_Split(swigCPtr, this, theIndex, TColgp_SequenceOfPnt.getCPtr(theSeq), theSeq);
  }

  public  gp_Pnt  First() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_SequenceOfPnt_First(swigCPtr, this), true);
    return ret;
  }

  public gp_Pnt ChangeFirst() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_SequenceOfPnt_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new gp_Pnt.CRef (ret);
  }

  public  gp_Pnt  Last() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_SequenceOfPnt_Last(swigCPtr, this), true);
    return ret;
  }

  public gp_Pnt ChangeLast() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_SequenceOfPnt_ChangeLast(swigCPtr, this), false, this);
    return ret; //new gp_Pnt.CRef (ret);
  }

  public  gp_Pnt  Value(int theIndex) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_SequenceOfPnt_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public gp_Pnt ChangeValue(int theIndex) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_SequenceOfPnt_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_Pnt.CRef (ret);
  }

  public void SetValue(int theIndex,  gp_Pnt  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_SetValue(swigCPtr, this, theIndex, gp_Pnt.getCPtr(theItem), theItem);
  }

}
