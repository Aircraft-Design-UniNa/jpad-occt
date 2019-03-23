package opencascade;

public class TColgp_SequenceOfXYZ {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_SequenceOfXYZ(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_SequenceOfXYZ(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_SequenceOfXYZ obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_SequenceOfXYZ(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_SequenceOfXYZ() {
    this(OCCwrapJavaJNI.new_TColgp_SequenceOfXYZ__SWIG_0(), true);
  }

  public TColgp_SequenceOfXYZ( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TColgp_SequenceOfXYZ__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TColgp_SequenceOfXYZ( TColgp_SequenceOfXYZ  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_SequenceOfXYZ__SWIG_2(TColgp_SequenceOfXYZ.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColgp_SequenceOfXYZ_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Clear__SWIG_1(swigCPtr, this);
  }

  public  TColgp_SequenceOfXYZ  Assign( TColgp_SequenceOfXYZ  theOther) {
    TColgp_SequenceOfXYZ ret = new TColgp_SequenceOfXYZ(OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Assign(swigCPtr, this, TColgp_SequenceOfXYZ.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( TColgp_SequenceOfXYZ_Iterator  thePosition) {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Remove__SWIG_0(swigCPtr, this,  TColgp_SequenceOfXYZ_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( gp_XYZ  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Append__SWIG_0(swigCPtr, this, gp_XYZ.getCPtr(theItem), theItem);
  }

  public void Append( TColgp_SequenceOfXYZ  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Append__SWIG_1(swigCPtr, this, TColgp_SequenceOfXYZ.getCPtr(theSeq), theSeq);
  }

  public void Prepend( gp_XYZ  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Prepend__SWIG_0(swigCPtr, this, gp_XYZ.getCPtr(theItem), theItem);
  }

  public void Prepend( TColgp_SequenceOfXYZ  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Prepend__SWIG_1(swigCPtr, this, TColgp_SequenceOfXYZ.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  gp_XYZ  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_InsertBefore__SWIG_0(swigCPtr, this, theIndex, gp_XYZ.getCPtr(theItem), theItem);
  }

  public void InsertBefore(int theIndex,  TColgp_SequenceOfXYZ  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_InsertBefore__SWIG_1(swigCPtr, this, theIndex, TColgp_SequenceOfXYZ.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( TColgp_SequenceOfXYZ_Iterator  thePosition,  gp_XYZ  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_InsertAfter__SWIG_0(swigCPtr, this,  TColgp_SequenceOfXYZ_Iterator.getCPtr(thePosition) , thePosition, gp_XYZ.getCPtr(theItem), theItem);
  }

  public void InsertAfter(int theIndex,  TColgp_SequenceOfXYZ  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_InsertAfter__SWIG_1(swigCPtr, this, theIndex, TColgp_SequenceOfXYZ.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  gp_XYZ  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_InsertAfter__SWIG_2(swigCPtr, this, theIndex, gp_XYZ.getCPtr(theItem), theItem);
  }

  public void Split(int theIndex,  TColgp_SequenceOfXYZ  theSeq) {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Split(swigCPtr, this, theIndex, TColgp_SequenceOfXYZ.getCPtr(theSeq), theSeq);
  }

  public  gp_XYZ  First() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_SequenceOfXYZ_First(swigCPtr, this), true);
    return ret;
  }

  public gp_XYZ ChangeFirst() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_SequenceOfXYZ_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new gp_XYZ.CRef (ret);
  }

  public  gp_XYZ  Last() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Last(swigCPtr, this), true);
    return ret;
  }

  public gp_XYZ ChangeLast() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_SequenceOfXYZ_ChangeLast(swigCPtr, this), false, this);
    return ret; //new gp_XYZ.CRef (ret);
  }

  public  gp_XYZ  Value(int theIndex) {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public gp_XYZ ChangeValue(int theIndex) {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_SequenceOfXYZ_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_XYZ.CRef (ret);
  }

  public void SetValue(int theIndex,  gp_XYZ  theItem) {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_SetValue(swigCPtr, this, theIndex, gp_XYZ.getCPtr(theItem), theItem);
  }

}
