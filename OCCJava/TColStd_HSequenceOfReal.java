package opencascade;

public class TColStd_HSequenceOfReal extends Standard_Transient {
  TColStd_HSequenceOfReal(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColStd_HSequenceOfReal() {
    this(OCCwrapJavaJNI.new_TColStd_HSequenceOfReal__SWIG_0(), true);
  }

  public TColStd_HSequenceOfReal( TColStd_SequenceOfReal  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_HSequenceOfReal__SWIG_1(TColStd_SequenceOfReal.getCPtr(theOther), theOther), true);
  }

  public  TColStd_SequenceOfReal  Sequence() {
    TColStd_SequenceOfReal ret = new TColStd_SequenceOfReal(OCCwrapJavaJNI.TColStd_HSequenceOfReal_Sequence(swigCPtr, this), false, this);
    return ret;
  }

  public void Append( double  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfReal_Append__SWIG_0(swigCPtr, this,  theItem );
  }

  public void Append( TColStd_SequenceOfReal  theSequence) {
    OCCwrapJavaJNI.TColStd_HSequenceOfReal_Append__SWIG_1(swigCPtr, this, TColStd_SequenceOfReal.getCPtr(theSequence), theSequence);
  }

  public  TColStd_SequenceOfReal  ChangeSequence() {
    TColStd_SequenceOfReal ret = new TColStd_SequenceOfReal(OCCwrapJavaJNI.TColStd_HSequenceOfReal_ChangeSequence(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfReal_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfReal_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfReal_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfReal_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_HSequenceOfReal_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColStd_HSequenceOfReal_Reverse(swigCPtr, this);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColStd_HSequenceOfReal_Remove__SWIG_0(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColStd_HSequenceOfReal_Remove__SWIG_1(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Prepend( double  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfReal_Prepend__SWIG_0(swigCPtr, this,  theItem );
  }

  public void Prepend( TColStd_SequenceOfReal  theSeq) {
    OCCwrapJavaJNI.TColStd_HSequenceOfReal_Prepend__SWIG_1(swigCPtr, this, TColStd_SequenceOfReal.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  double  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfReal_InsertBefore(swigCPtr, this, theIndex,  theItem );
  }

  public void InsertAfter(int theIndex,  double  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfReal_InsertAfter(swigCPtr, this, theIndex,  theItem );
  }

  public  double  Value(int theIndex) { return OCCwrapJavaJNI.TColStd_HSequenceOfReal_Value(swigCPtr, this, theIndex); }

  public double[] ChangeValue(int theIndex) {return OCCwrapJavaJNI.TColStd_HSequenceOfReal_ChangeValue(swigCPtr, this, theIndex);}

  public void SetValue(int theIndex,  double  theItem) {
    OCCwrapJavaJNI.TColStd_HSequenceOfReal_SetValue(swigCPtr, this, theIndex,  theItem );
  }

  public static  TColStd_HSequenceOfReal  DownCast( Standard_Transient  T) {
    return new TColStd_HSequenceOfReal ( OCCwrapJavaJNI.TColStd_HSequenceOfReal_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HSequenceOfReal_TypeOf(), true );
  }

}
