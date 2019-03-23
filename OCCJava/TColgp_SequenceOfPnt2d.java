package opencascade;

public class TColgp_SequenceOfPnt2d {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_SequenceOfPnt2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_SequenceOfPnt2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_SequenceOfPnt2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_SequenceOfPnt2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_SequenceOfPnt2d() {
    this(OCCwrapJavaJNI.new_TColgp_SequenceOfPnt2d__SWIG_0(), true);
  }

  public TColgp_SequenceOfPnt2d( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TColgp_SequenceOfPnt2d__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TColgp_SequenceOfPnt2d( TColgp_SequenceOfPnt2d  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_SequenceOfPnt2d__SWIG_2(TColgp_SequenceOfPnt2d.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Clear__SWIG_1(swigCPtr, this);
  }

  public  TColgp_SequenceOfPnt2d  Assign( TColgp_SequenceOfPnt2d  theOther) {
    TColgp_SequenceOfPnt2d ret = new TColgp_SequenceOfPnt2d(OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Assign(swigCPtr, this, TColgp_SequenceOfPnt2d.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( TColgp_SequenceOfPnt2d_Iterator  thePosition) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Remove__SWIG_0(swigCPtr, this,  TColgp_SequenceOfPnt2d_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( gp_Pnt2d  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Append__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(theItem), theItem);
  }

  public void Append( TColgp_SequenceOfPnt2d  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Append__SWIG_1(swigCPtr, this, TColgp_SequenceOfPnt2d.getCPtr(theSeq), theSeq);
  }

  public void Prepend( gp_Pnt2d  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Prepend__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(theItem), theItem);
  }

  public void Prepend( TColgp_SequenceOfPnt2d  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Prepend__SWIG_1(swigCPtr, this, TColgp_SequenceOfPnt2d.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  gp_Pnt2d  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_InsertBefore__SWIG_0(swigCPtr, this, theIndex, gp_Pnt2d.getCPtr(theItem), theItem);
  }

  public void InsertBefore(int theIndex,  TColgp_SequenceOfPnt2d  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_InsertBefore__SWIG_1(swigCPtr, this, theIndex, TColgp_SequenceOfPnt2d.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( TColgp_SequenceOfPnt2d_Iterator  thePosition,  gp_Pnt2d  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_InsertAfter__SWIG_0(swigCPtr, this,  TColgp_SequenceOfPnt2d_Iterator.getCPtr(thePosition) , thePosition, gp_Pnt2d.getCPtr(theItem), theItem);
  }

  public void InsertAfter(int theIndex,  TColgp_SequenceOfPnt2d  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_InsertAfter__SWIG_1(swigCPtr, this, theIndex, TColgp_SequenceOfPnt2d.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  gp_Pnt2d  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_InsertAfter__SWIG_2(swigCPtr, this, theIndex, gp_Pnt2d.getCPtr(theItem), theItem);
  }

  public void Split(int theIndex,  TColgp_SequenceOfPnt2d  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Split(swigCPtr, this, theIndex, TColgp_SequenceOfPnt2d.getCPtr(theSeq), theSeq);
  }

  public  gp_Pnt2d  First() {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_First(swigCPtr, this), true);
    return ret;
  }

  public gp_Pnt2d ChangeFirst() {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new gp_Pnt2d.CRef (ret);
  }

  public  gp_Pnt2d  Last() {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Last(swigCPtr, this), true);
    return ret;
  }

  public gp_Pnt2d ChangeLast() {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_ChangeLast(swigCPtr, this), false, this);
    return ret; //new gp_Pnt2d.CRef (ret);
  }

  public  gp_Pnt2d  Value(int theIndex) {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public gp_Pnt2d ChangeValue(int theIndex) {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_Pnt2d.CRef (ret);
  }

  public void SetValue(int theIndex,  gp_Pnt2d  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt2d_SetValue(swigCPtr, this, theIndex, gp_Pnt2d.getCPtr(theItem), theItem);
  }

}
