package opencascade;

public class TColStd_SequenceOfTransient {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_SequenceOfTransient(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_SequenceOfTransient(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_SequenceOfTransient obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_SequenceOfTransient(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_SequenceOfTransient() {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfTransient__SWIG_0(), true);
  }

  public TColStd_SequenceOfTransient( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfTransient__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TColStd_SequenceOfTransient( TColStd_SequenceOfTransient  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_SequenceOfTransient__SWIG_2(TColStd_SequenceOfTransient.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_SequenceOfTransient_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_SequenceOfTransient_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_SequenceOfTransient_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_SequenceOfTransient_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_SequenceOfTransient_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColStd_SequenceOfTransient_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.TColStd_SequenceOfTransient_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TColStd_SequenceOfTransient_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TColStd_SequenceOfTransient_Clear__SWIG_1(swigCPtr, this);
  }

  public  TColStd_SequenceOfTransient  Assign( TColStd_SequenceOfTransient  theOther) {
    TColStd_SequenceOfTransient ret = new TColStd_SequenceOfTransient(OCCwrapJavaJNI.TColStd_SequenceOfTransient_Assign(swigCPtr, this, TColStd_SequenceOfTransient.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( TColStd_SequenceOfTransient_Iterator  thePosition) {
    OCCwrapJavaJNI.TColStd_SequenceOfTransient_Remove__SWIG_0(swigCPtr, this,  TColStd_SequenceOfTransient_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColStd_SequenceOfTransient_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColStd_SequenceOfTransient_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( Standard_Transient  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfTransient_Append__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(theItem) , theItem);
  }

  public void Append( TColStd_SequenceOfTransient  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfTransient_Append__SWIG_1(swigCPtr, this, TColStd_SequenceOfTransient.getCPtr(theSeq), theSeq);
  }

  public void Prepend( Standard_Transient  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfTransient_Prepend__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(theItem) , theItem);
  }

  public void Prepend( TColStd_SequenceOfTransient  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfTransient_Prepend__SWIG_1(swigCPtr, this, TColStd_SequenceOfTransient.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  Standard_Transient  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfTransient_InsertBefore__SWIG_0(swigCPtr, this, theIndex,  Standard_Transient.getCPtr(theItem) , theItem);
  }

  public void InsertBefore(int theIndex,  TColStd_SequenceOfTransient  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfTransient_InsertBefore__SWIG_1(swigCPtr, this, theIndex, TColStd_SequenceOfTransient.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( TColStd_SequenceOfTransient_Iterator  thePosition,  Standard_Transient  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfTransient_InsertAfter__SWIG_0(swigCPtr, this,  TColStd_SequenceOfTransient_Iterator.getCPtr(thePosition) , thePosition,  Standard_Transient.getCPtr(theItem) , theItem);
  }

  public void InsertAfter(int theIndex,  TColStd_SequenceOfTransient  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfTransient_InsertAfter__SWIG_1(swigCPtr, this, theIndex, TColStd_SequenceOfTransient.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  Standard_Transient  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfTransient_InsertAfter__SWIG_2(swigCPtr, this, theIndex,  Standard_Transient.getCPtr(theItem) , theItem);
  }

  public void Split(int theIndex,  TColStd_SequenceOfTransient  theSeq) {
    OCCwrapJavaJNI.TColStd_SequenceOfTransient_Split(swigCPtr, this, theIndex, TColStd_SequenceOfTransient.getCPtr(theSeq), theSeq);
  }

  public  Standard_Transient  First() {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_SequenceOfTransient_First(swigCPtr, this), true );
  }

  public  Standard_Transient  ChangeFirst() {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_SequenceOfTransient_ChangeFirst(swigCPtr, this), true );
  }

  public  Standard_Transient  Last() {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_SequenceOfTransient_Last(swigCPtr, this), true );
  }

  public  Standard_Transient  ChangeLast() {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_SequenceOfTransient_ChangeLast(swigCPtr, this), true );
  }

  public  Standard_Transient  Value(int theIndex) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_SequenceOfTransient_Value(swigCPtr, this, theIndex), true );
  }

  public  Standard_Transient  ChangeValue(int theIndex) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_SequenceOfTransient_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  Standard_Transient  theItem) {
    OCCwrapJavaJNI.TColStd_SequenceOfTransient_SetValue(swigCPtr, this, theIndex,  Standard_Transient.getCPtr(theItem) , theItem);
  }

}
