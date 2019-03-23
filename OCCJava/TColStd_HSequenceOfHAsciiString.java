package opencascade;

public class TColStd_HSequenceOfHAsciiString extends Standard_Transient {
  TColStd_HSequenceOfHAsciiString(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColStd_HSequenceOfHAsciiString() {
    this(OCCwrapJavaJNI.new_TColStd_HSequenceOfHAsciiString__SWIG_0(), true);
  }

  public TColStd_HSequenceOfHAsciiString( TColStd_SequenceOfHAsciiString  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_HSequenceOfHAsciiString__SWIG_1(TColStd_SequenceOfHAsciiString.getCPtr(theOther), theOther), true);
  }

  public  TColStd_SequenceOfHAsciiString  Sequence() {
    TColStd_SequenceOfHAsciiString ret = new TColStd_SequenceOfHAsciiString(OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_Sequence(swigCPtr, this), false, this);
    return ret;
  }

  public void Append( TCollection_HAsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_Append__SWIG_0(swigCPtr, this,  TCollection_HAsciiString.getCPtr(theItem) , theItem);
  }

  public void Append( TColStd_SequenceOfHAsciiString  theSequence) {
    OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_Append__SWIG_1(swigCPtr, this, TColStd_SequenceOfHAsciiString.getCPtr(theSequence), theSequence);
  }

  public  TColStd_SequenceOfHAsciiString  ChangeSequence() {
    TColStd_SequenceOfHAsciiString ret = new TColStd_SequenceOfHAsciiString(OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_ChangeSequence(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_Reverse(swigCPtr, this);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_Remove__SWIG_0(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_Remove__SWIG_1(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Prepend( TCollection_HAsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_Prepend__SWIG_0(swigCPtr, this,  TCollection_HAsciiString.getCPtr(theItem) , theItem);
  }

  public void Prepend( TColStd_SequenceOfHAsciiString  theSeq) {
    OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_Prepend__SWIG_1(swigCPtr, this, TColStd_SequenceOfHAsciiString.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  TCollection_HAsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_InsertBefore(swigCPtr, this, theIndex,  TCollection_HAsciiString.getCPtr(theItem) , theItem);
  }

  public void InsertAfter(int theIndex,  TCollection_HAsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_InsertAfter(swigCPtr, this, theIndex,  TCollection_HAsciiString.getCPtr(theItem) , theItem);
  }

  public  TCollection_HAsciiString  Value(int theIndex) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_Value(swigCPtr, this, theIndex), true );
  }

  public  TCollection_HAsciiString  ChangeValue(int theIndex) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  TCollection_HAsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_SetValue(swigCPtr, this, theIndex,  TCollection_HAsciiString.getCPtr(theItem) , theItem);
  }

  public static  TColStd_HSequenceOfHAsciiString  DownCast( Standard_Transient  T) {
    return new TColStd_HSequenceOfHAsciiString ( OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HSequenceOfHAsciiString_TypeOf(), true );
  }

}
