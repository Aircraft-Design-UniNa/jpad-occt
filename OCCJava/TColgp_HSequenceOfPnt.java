package opencascade;

public class TColgp_HSequenceOfPnt extends Standard_Transient {
  TColgp_HSequenceOfPnt(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColgp_HSequenceOfPnt() {
    this(OCCwrapJavaJNI.new_TColgp_HSequenceOfPnt__SWIG_0(), true);
  }

  public TColgp_HSequenceOfPnt( TColgp_SequenceOfPnt  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_HSequenceOfPnt__SWIG_1(TColgp_SequenceOfPnt.getCPtr(theOther), theOther), true);
  }

  public  TColgp_SequenceOfPnt  Sequence() {
    TColgp_SequenceOfPnt ret = new TColgp_SequenceOfPnt(OCCwrapJavaJNI.TColgp_HSequenceOfPnt_Sequence(swigCPtr, this), false, this);
    return ret;
  }

  public void Append( gp_Pnt  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt_Append__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(theItem), theItem);
  }

  public void Append( TColgp_SequenceOfPnt  theSequence) {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt_Append__SWIG_1(swigCPtr, this, TColgp_SequenceOfPnt.getCPtr(theSequence), theSequence);
  }

  public  TColgp_SequenceOfPnt  ChangeSequence() {
    TColgp_SequenceOfPnt ret = new TColgp_SequenceOfPnt(OCCwrapJavaJNI.TColgp_HSequenceOfPnt_ChangeSequence(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfPnt_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfPnt_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfPnt_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfPnt_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfPnt_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt_Reverse(swigCPtr, this);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt_Remove__SWIG_0(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt_Remove__SWIG_1(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Prepend( gp_Pnt  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt_Prepend__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(theItem), theItem);
  }

  public void Prepend( TColgp_SequenceOfPnt  theSeq) {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt_Prepend__SWIG_1(swigCPtr, this, TColgp_SequenceOfPnt.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  gp_Pnt  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt_InsertBefore(swigCPtr, this, theIndex, gp_Pnt.getCPtr(theItem), theItem);
  }

  public void InsertAfter(int theIndex,  gp_Pnt  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt_InsertAfter(swigCPtr, this, theIndex, gp_Pnt.getCPtr(theItem), theItem);
  }

  public  gp_Pnt  Value(int theIndex) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_HSequenceOfPnt_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public gp_Pnt ChangeValue(int theIndex) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_HSequenceOfPnt_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_Pnt.CRef (ret);
  }

  public void SetValue(int theIndex,  gp_Pnt  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt_SetValue(swigCPtr, this, theIndex, gp_Pnt.getCPtr(theItem), theItem);
  }

  public static  TColgp_HSequenceOfPnt  DownCast( Standard_Transient  T) {
    return new TColgp_HSequenceOfPnt ( OCCwrapJavaJNI.TColgp_HSequenceOfPnt_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColgp_HSequenceOfPnt_TypeOf(), true );
  }

}
