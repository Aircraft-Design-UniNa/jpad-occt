package opencascade;

public class TColStd_HSequenceOfInteger extends Standard_Transient {
  TColStd_HSequenceOfInteger(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColStd_HSequenceOfInteger() {
    this(OCCwrapJavaJNI.new_TColStd_HSequenceOfInteger__SWIG_0(), true);
  }

  public TColStd_HSequenceOfInteger( TColStd_SequenceOfInteger  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_HSequenceOfInteger__SWIG_1(TColStd_SequenceOfInteger.getCPtr(theOther), theOther), true);
  }

  public  TColStd_SequenceOfInteger  Sequence() {
    TColStd_SequenceOfInteger ret = new TColStd_SequenceOfInteger(OCCwrapJavaJNI.TColStd_HSequenceOfInteger_Sequence(swigCPtr, this), false, this);
    return ret;
  }

  public void Append( int  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfInteger_Append__SWIG_0(swigCPtr, this,  theItem );
  }

  public void Append( TColStd_SequenceOfInteger  theSequence) {
    OCCwrapJavaJNI.TColStd_HSequenceOfInteger_Append__SWIG_1(swigCPtr, this, TColStd_SequenceOfInteger.getCPtr(theSequence), theSequence);
  }

  public  TColStd_SequenceOfInteger  ChangeSequence() {
    TColStd_SequenceOfInteger ret = new TColStd_SequenceOfInteger(OCCwrapJavaJNI.TColStd_HSequenceOfInteger_ChangeSequence(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfInteger_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfInteger_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfInteger_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfInteger_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfInteger_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColStd_HSequenceOfInteger_Reverse(swigCPtr, this);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColStd_HSequenceOfInteger_Remove__SWIG_0(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColStd_HSequenceOfInteger_Remove__SWIG_1(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Prepend( int  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfInteger_Prepend__SWIG_0(swigCPtr, this,  theItem );
  }

  public void Prepend( TColStd_SequenceOfInteger  theSeq) {
    OCCwrapJavaJNI.TColStd_HSequenceOfInteger_Prepend__SWIG_1(swigCPtr, this, TColStd_SequenceOfInteger.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  int  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfInteger_InsertBefore(swigCPtr, this, theIndex,  theItem );
  }

  public void InsertAfter(int theIndex,  int  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfInteger_InsertAfter(swigCPtr, this, theIndex,  theItem );
  }

  public  int  Value(int theIndex) { return OCCwrapJavaJNI.TColStd_HSequenceOfInteger_Value(swigCPtr, this, theIndex); }

  public int[] ChangeValue(int theIndex) {return OCCwrapJavaJNI.TColStd_HSequenceOfInteger_ChangeValue(swigCPtr, this, theIndex);}

  public void SetValue(int theIndex,  int  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfInteger_SetValue(swigCPtr, this, theIndex,  theItem );
  }

  public static  TColStd_HSequenceOfInteger  DownCast( Standard_Transient  T) {
    return new TColStd_HSequenceOfInteger ( OCCwrapJavaJNI.TColStd_HSequenceOfInteger_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HSequenceOfInteger_TypeOf(), true );
  }

}
