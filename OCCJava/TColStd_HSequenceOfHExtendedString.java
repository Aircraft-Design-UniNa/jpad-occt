package opencascade;

public class TColStd_HSequenceOfHExtendedString extends Standard_Transient {
  TColStd_HSequenceOfHExtendedString(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColStd_HSequenceOfHExtendedString() {
    this(OCCwrapJavaJNI.new_TColStd_HSequenceOfHExtendedString__SWIG_0(), true);
  }

  public TColStd_HSequenceOfHExtendedString( TColStd_SequenceOfHExtendedString  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_HSequenceOfHExtendedString__SWIG_1(TColStd_SequenceOfHExtendedString.getCPtr(theOther), theOther), true);
  }

  public  TColStd_SequenceOfHExtendedString  Sequence() {
    TColStd_SequenceOfHExtendedString ret = new TColStd_SequenceOfHExtendedString(OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_Sequence(swigCPtr, this), false, this);
    return ret;
  }

  public void Append( TCollection_HExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_Append__SWIG_0(swigCPtr, this,  TCollection_HExtendedString.getCPtr(theItem) , theItem);
  }

  public void Append( TColStd_SequenceOfHExtendedString  theSequence) {
    OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_Append__SWIG_1(swigCPtr, this, TColStd_SequenceOfHExtendedString.getCPtr(theSequence), theSequence);
  }

  public  TColStd_SequenceOfHExtendedString  ChangeSequence() {
    TColStd_SequenceOfHExtendedString ret = new TColStd_SequenceOfHExtendedString(OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_ChangeSequence(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_Reverse(swigCPtr, this);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_Remove__SWIG_0(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_Remove__SWIG_1(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Prepend( TCollection_HExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_Prepend__SWIG_0(swigCPtr, this,  TCollection_HExtendedString.getCPtr(theItem) , theItem);
  }

  public void Prepend( TColStd_SequenceOfHExtendedString  theSeq) {
    OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_Prepend__SWIG_1(swigCPtr, this, TColStd_SequenceOfHExtendedString.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  TCollection_HExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_InsertBefore(swigCPtr, this, theIndex,  TCollection_HExtendedString.getCPtr(theItem) , theItem);
  }

  public void InsertAfter(int theIndex,  TCollection_HExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_InsertAfter(swigCPtr, this, theIndex,  TCollection_HExtendedString.getCPtr(theItem) , theItem);
  }

  public  TCollection_HExtendedString  Value(int theIndex) {
    return new TCollection_HExtendedString ( OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_Value(swigCPtr, this, theIndex), true );
  }

  public  TCollection_HExtendedString  ChangeValue(int theIndex) {
    return new TCollection_HExtendedString ( OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  TCollection_HExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_SetValue(swigCPtr, this, theIndex,  TCollection_HExtendedString.getCPtr(theItem) , theItem);
  }

  public static  TColStd_HSequenceOfHExtendedString  DownCast( Standard_Transient  T) {
    return new TColStd_HSequenceOfHExtendedString ( OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HSequenceOfHExtendedString_TypeOf(), true );
  }

}
