package opencascade;

public class TColStd_HSequenceOfTransient extends Standard_Transient {
  TColStd_HSequenceOfTransient(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColStd_HSequenceOfTransient() {
    this(OCCwrapJavaJNI.new_TColStd_HSequenceOfTransient__SWIG_0(), true);
  }

  public TColStd_HSequenceOfTransient( TColStd_SequenceOfTransient  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_HSequenceOfTransient__SWIG_1(TColStd_SequenceOfTransient.getCPtr(theOther), theOther), true);
  }

  public  TColStd_SequenceOfTransient  Sequence() {
    TColStd_SequenceOfTransient ret = new TColStd_SequenceOfTransient(OCCwrapJavaJNI.TColStd_HSequenceOfTransient_Sequence(swigCPtr, this), false, this);
    return ret;
  }

  public void Append( Standard_Transient  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfTransient_Append__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(theItem) , theItem);
  }

  public void Append( TColStd_SequenceOfTransient  theSequence) {
    OCCwrapJavaJNI.TColStd_HSequenceOfTransient_Append__SWIG_1(swigCPtr, this, TColStd_SequenceOfTransient.getCPtr(theSequence), theSequence);
  }

  public  TColStd_SequenceOfTransient  ChangeSequence() {
    TColStd_SequenceOfTransient ret = new TColStd_SequenceOfTransient(OCCwrapJavaJNI.TColStd_HSequenceOfTransient_ChangeSequence(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfTransient_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfTransient_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfTransient_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfTransient_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfTransient_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColStd_HSequenceOfTransient_Reverse(swigCPtr, this);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColStd_HSequenceOfTransient_Remove__SWIG_0(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColStd_HSequenceOfTransient_Remove__SWIG_1(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Prepend( Standard_Transient  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfTransient_Prepend__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(theItem) , theItem);
  }

  public void Prepend( TColStd_SequenceOfTransient  theSeq) {
    OCCwrapJavaJNI.TColStd_HSequenceOfTransient_Prepend__SWIG_1(swigCPtr, this, TColStd_SequenceOfTransient.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  Standard_Transient  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfTransient_InsertBefore(swigCPtr, this, theIndex,  Standard_Transient.getCPtr(theItem) , theItem);
  }

  public void InsertAfter(int theIndex,  Standard_Transient  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfTransient_InsertAfter(swigCPtr, this, theIndex,  Standard_Transient.getCPtr(theItem) , theItem);
  }

  public  Standard_Transient  Value(int theIndex) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_HSequenceOfTransient_Value(swigCPtr, this, theIndex), true );
  }

  public  Standard_Transient  ChangeValue(int theIndex) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_HSequenceOfTransient_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  Standard_Transient  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfTransient_SetValue(swigCPtr, this, theIndex,  Standard_Transient.getCPtr(theItem) , theItem);
  }

  public static  TColStd_HSequenceOfTransient  DownCast( Standard_Transient  T) {
    return new TColStd_HSequenceOfTransient ( OCCwrapJavaJNI.TColStd_HSequenceOfTransient_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HSequenceOfTransient_TypeOf(), true );
  }

}
