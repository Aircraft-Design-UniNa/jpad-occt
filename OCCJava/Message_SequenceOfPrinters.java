package opencascade;

public class Message_SequenceOfPrinters {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Message_SequenceOfPrinters(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Message_SequenceOfPrinters(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Message_SequenceOfPrinters obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Message_SequenceOfPrinters(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Message_SequenceOfPrinters() {
    this(OCCwrapJavaJNI.new_Message_SequenceOfPrinters__SWIG_0(), true);
  }

  public Message_SequenceOfPrinters( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_Message_SequenceOfPrinters__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public Message_SequenceOfPrinters( Message_SequenceOfPrinters  theOther) {
    this(OCCwrapJavaJNI.new_Message_SequenceOfPrinters__SWIG_2(Message_SequenceOfPrinters.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.Message_SequenceOfPrinters_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.Message_SequenceOfPrinters_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.Message_SequenceOfPrinters_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.Message_SequenceOfPrinters_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.Message_SequenceOfPrinters_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_Clear__SWIG_1(swigCPtr, this);
  }

  public  Message_SequenceOfPrinters  Assign( Message_SequenceOfPrinters  theOther) {
    Message_SequenceOfPrinters ret = new Message_SequenceOfPrinters(OCCwrapJavaJNI.Message_SequenceOfPrinters_Assign(swigCPtr, this, Message_SequenceOfPrinters.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( Message_SequenceOfPrinters_Iterator  thePosition) {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_Remove__SWIG_0(swigCPtr, this,  Message_SequenceOfPrinters_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( Message_Printer  theItem) {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_Append__SWIG_0(swigCPtr, this,  Message_Printer.getCPtr(theItem) , theItem);
  }

  public void Append( Message_SequenceOfPrinters  theSeq) {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_Append__SWIG_1(swigCPtr, this, Message_SequenceOfPrinters.getCPtr(theSeq), theSeq);
  }

  public void Prepend( Message_Printer  theItem) {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_Prepend__SWIG_0(swigCPtr, this,  Message_Printer.getCPtr(theItem) , theItem);
  }

  public void Prepend( Message_SequenceOfPrinters  theSeq) {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_Prepend__SWIG_1(swigCPtr, this, Message_SequenceOfPrinters.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  Message_Printer  theItem) {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_InsertBefore__SWIG_0(swigCPtr, this, theIndex,  Message_Printer.getCPtr(theItem) , theItem);
  }

  public void InsertBefore(int theIndex,  Message_SequenceOfPrinters  theSeq) {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_InsertBefore__SWIG_1(swigCPtr, this, theIndex, Message_SequenceOfPrinters.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( Message_SequenceOfPrinters_Iterator  thePosition,  Message_Printer  theItem) {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_InsertAfter__SWIG_0(swigCPtr, this,  Message_SequenceOfPrinters_Iterator.getCPtr(thePosition) , thePosition,  Message_Printer.getCPtr(theItem) , theItem);
  }

  public void InsertAfter(int theIndex,  Message_SequenceOfPrinters  theSeq) {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_InsertAfter__SWIG_1(swigCPtr, this, theIndex, Message_SequenceOfPrinters.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  Message_Printer  theItem) {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_InsertAfter__SWIG_2(swigCPtr, this, theIndex,  Message_Printer.getCPtr(theItem) , theItem);
  }

  public void Split(int theIndex,  Message_SequenceOfPrinters  theSeq) {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_Split(swigCPtr, this, theIndex, Message_SequenceOfPrinters.getCPtr(theSeq), theSeq);
  }

  public  Message_Printer  First() {
    return new Message_Printer ( OCCwrapJavaJNI.Message_SequenceOfPrinters_First(swigCPtr, this), true );
  }

  public  Message_Printer  ChangeFirst() {
    return new Message_Printer ( OCCwrapJavaJNI.Message_SequenceOfPrinters_ChangeFirst(swigCPtr, this), true );
  }

  public  Message_Printer  Last() {
    return new Message_Printer ( OCCwrapJavaJNI.Message_SequenceOfPrinters_Last(swigCPtr, this), true );
  }

  public  Message_Printer  ChangeLast() {
    return new Message_Printer ( OCCwrapJavaJNI.Message_SequenceOfPrinters_ChangeLast(swigCPtr, this), true );
  }

  public  Message_Printer  Value(int theIndex) {
    return new Message_Printer ( OCCwrapJavaJNI.Message_SequenceOfPrinters_Value(swigCPtr, this, theIndex), true );
  }

  public  Message_Printer  ChangeValue(int theIndex) {
    return new Message_Printer ( OCCwrapJavaJNI.Message_SequenceOfPrinters_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  Message_Printer  theItem) {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_SetValue(swigCPtr, this, theIndex,  Message_Printer.getCPtr(theItem) , theItem);
  }

}
