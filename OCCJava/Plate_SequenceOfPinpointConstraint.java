package opencascade;

public class Plate_SequenceOfPinpointConstraint {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Plate_SequenceOfPinpointConstraint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Plate_SequenceOfPinpointConstraint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Plate_SequenceOfPinpointConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Plate_SequenceOfPinpointConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plate_SequenceOfPinpointConstraint() {
    this(OCCwrapJavaJNI.new_Plate_SequenceOfPinpointConstraint__SWIG_0(), true);
  }

  public Plate_SequenceOfPinpointConstraint( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_Plate_SequenceOfPinpointConstraint__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public Plate_SequenceOfPinpointConstraint( Plate_SequenceOfPinpointConstraint  theOther) {
    this(OCCwrapJavaJNI.new_Plate_SequenceOfPinpointConstraint__SWIG_2(Plate_SequenceOfPinpointConstraint.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Clear__SWIG_1(swigCPtr, this);
  }

  public  Plate_SequenceOfPinpointConstraint  Assign( Plate_SequenceOfPinpointConstraint  theOther) {
    Plate_SequenceOfPinpointConstraint ret = new Plate_SequenceOfPinpointConstraint(OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Assign(swigCPtr, this, Plate_SequenceOfPinpointConstraint.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( Plate_SequenceOfPinpointConstraint_Iterator  thePosition) {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Remove__SWIG_0(swigCPtr, this,  Plate_SequenceOfPinpointConstraint_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( Plate_PinpointConstraint  theItem) {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Append__SWIG_0(swigCPtr, this, Plate_PinpointConstraint.getCPtr(theItem), theItem);
  }

  public void Append( Plate_SequenceOfPinpointConstraint  theSeq) {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Append__SWIG_1(swigCPtr, this, Plate_SequenceOfPinpointConstraint.getCPtr(theSeq), theSeq);
  }

  public void Prepend( Plate_PinpointConstraint  theItem) {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Prepend__SWIG_0(swigCPtr, this, Plate_PinpointConstraint.getCPtr(theItem), theItem);
  }

  public void Prepend( Plate_SequenceOfPinpointConstraint  theSeq) {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Prepend__SWIG_1(swigCPtr, this, Plate_SequenceOfPinpointConstraint.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  Plate_PinpointConstraint  theItem) {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_InsertBefore__SWIG_0(swigCPtr, this, theIndex, Plate_PinpointConstraint.getCPtr(theItem), theItem);
  }

  public void InsertBefore(int theIndex,  Plate_SequenceOfPinpointConstraint  theSeq) {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_InsertBefore__SWIG_1(swigCPtr, this, theIndex, Plate_SequenceOfPinpointConstraint.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( Plate_SequenceOfPinpointConstraint_Iterator  thePosition,  Plate_PinpointConstraint  theItem) {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_InsertAfter__SWIG_0(swigCPtr, this,  Plate_SequenceOfPinpointConstraint_Iterator.getCPtr(thePosition) , thePosition, Plate_PinpointConstraint.getCPtr(theItem), theItem);
  }

  public void InsertAfter(int theIndex,  Plate_SequenceOfPinpointConstraint  theSeq) {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_InsertAfter__SWIG_1(swigCPtr, this, theIndex, Plate_SequenceOfPinpointConstraint.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  Plate_PinpointConstraint  theItem) {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_InsertAfter__SWIG_2(swigCPtr, this, theIndex, Plate_PinpointConstraint.getCPtr(theItem), theItem);
  }

  public void Split(int theIndex,  Plate_SequenceOfPinpointConstraint  theSeq) {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Split(swigCPtr, this, theIndex, Plate_SequenceOfPinpointConstraint.getCPtr(theSeq), theSeq);
  }

  public  Plate_PinpointConstraint  First() {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_First(swigCPtr, this), true);
    return ret;
  }

  public Plate_PinpointConstraint ChangeFirst() {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new Plate_PinpointConstraint.CRef (ret);
  }

  public  Plate_PinpointConstraint  Last() {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Last(swigCPtr, this), true);
    return ret;
  }

  public Plate_PinpointConstraint ChangeLast() {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_ChangeLast(swigCPtr, this), false, this);
    return ret; //new Plate_PinpointConstraint.CRef (ret);
  }

  public  Plate_PinpointConstraint  Value(int theIndex) {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public Plate_PinpointConstraint ChangeValue(int theIndex) {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new Plate_PinpointConstraint.CRef (ret);
  }

  public void SetValue(int theIndex,  Plate_PinpointConstraint  theItem) {
    OCCwrapJavaJNI.Plate_SequenceOfPinpointConstraint_SetValue(swigCPtr, this, theIndex, Plate_PinpointConstraint.getCPtr(theItem), theItem);
  }

}
