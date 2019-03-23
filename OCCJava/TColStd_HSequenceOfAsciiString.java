package opencascade;

public class TColStd_HSequenceOfAsciiString extends Standard_Transient {
  TColStd_HSequenceOfAsciiString(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColStd_HSequenceOfAsciiString() {
    this(OCCwrapJavaJNI.new_TColStd_HSequenceOfAsciiString__SWIG_0(), true);
  }

  public TColStd_HSequenceOfAsciiString( TColStd_SequenceOfAsciiString  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_HSequenceOfAsciiString__SWIG_1(TColStd_SequenceOfAsciiString.getCPtr(theOther), theOther), true);
  }

  public  TColStd_SequenceOfAsciiString  Sequence() {
    TColStd_SequenceOfAsciiString ret = new TColStd_SequenceOfAsciiString(OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_Sequence(swigCPtr, this), false, this);
    return ret;
  }

  public void Append( TCollection_AsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_Append__SWIG_0(swigCPtr, this, TCollection_AsciiString.getCPtr(theItem), theItem);
  }

  public void Append( TColStd_SequenceOfAsciiString  theSequence) {
    OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_Append__SWIG_1(swigCPtr, this, TColStd_SequenceOfAsciiString.getCPtr(theSequence), theSequence);
  }

  public  TColStd_SequenceOfAsciiString  ChangeSequence() {
    TColStd_SequenceOfAsciiString ret = new TColStd_SequenceOfAsciiString(OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_ChangeSequence(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_Reverse(swigCPtr, this);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_Remove__SWIG_0(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_Remove__SWIG_1(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Prepend( TCollection_AsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_Prepend__SWIG_0(swigCPtr, this, TCollection_AsciiString.getCPtr(theItem), theItem);
  }

  public void Prepend( TColStd_SequenceOfAsciiString  theSeq) {
    OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_Prepend__SWIG_1(swigCPtr, this, TColStd_SequenceOfAsciiString.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  TCollection_AsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_InsertBefore(swigCPtr, this, theIndex, TCollection_AsciiString.getCPtr(theItem), theItem);
  }

  public void InsertAfter(int theIndex,  TCollection_AsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_InsertAfter(swigCPtr, this, theIndex, TCollection_AsciiString.getCPtr(theItem), theItem);
  }

  public  TCollection_AsciiString  Value(int theIndex) {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public TCollection_AsciiString ChangeValue(int theIndex) {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new TCollection_AsciiString.CRef (ret);
  }

  public void SetValue(int theIndex,  TCollection_AsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_SetValue(swigCPtr, this, theIndex, TCollection_AsciiString.getCPtr(theItem), theItem);
  }

  public static  TColStd_HSequenceOfAsciiString  DownCast( Standard_Transient  T) {
    return new TColStd_HSequenceOfAsciiString ( OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HSequenceOfAsciiString_TypeOf(), true );
  }

}
