package opencascade;

public class TColgp_HSequenceOfXY extends Standard_Transient {
  TColgp_HSequenceOfXY(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColgp_HSequenceOfXY() {
    this(OCCwrapJavaJNI.new_TColgp_HSequenceOfXY__SWIG_0(), true);
  }

  public TColgp_HSequenceOfXY( TColgp_SequenceOfXY  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_HSequenceOfXY__SWIG_1(TColgp_SequenceOfXY.getCPtr(theOther), theOther), true);
  }

  public  TColgp_SequenceOfXY  Sequence() {
    TColgp_SequenceOfXY ret = new TColgp_SequenceOfXY(OCCwrapJavaJNI.TColgp_HSequenceOfXY_Sequence(swigCPtr, this), false, this);
    return ret;
  }

  public void Append( gp_XY  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfXY_Append__SWIG_0(swigCPtr, this, gp_XY.getCPtr(theItem), theItem);
  }

  public void Append( TColgp_SequenceOfXY  theSequence) {
    OCCwrapJavaJNI.TColgp_HSequenceOfXY_Append__SWIG_1(swigCPtr, this, TColgp_SequenceOfXY.getCPtr(theSequence), theSequence);
  }

  public  TColgp_SequenceOfXY  ChangeSequence() {
    TColgp_SequenceOfXY ret = new TColgp_SequenceOfXY(OCCwrapJavaJNI.TColgp_HSequenceOfXY_ChangeSequence(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfXY_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfXY_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfXY_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfXY_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfXY_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColgp_HSequenceOfXY_Reverse(swigCPtr, this);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColgp_HSequenceOfXY_Remove__SWIG_0(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColgp_HSequenceOfXY_Remove__SWIG_1(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Prepend( gp_XY  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfXY_Prepend__SWIG_0(swigCPtr, this, gp_XY.getCPtr(theItem), theItem);
  }

  public void Prepend( TColgp_SequenceOfXY  theSeq) {
    OCCwrapJavaJNI.TColgp_HSequenceOfXY_Prepend__SWIG_1(swigCPtr, this, TColgp_SequenceOfXY.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  gp_XY  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfXY_InsertBefore(swigCPtr, this, theIndex, gp_XY.getCPtr(theItem), theItem);
  }

  public void InsertAfter(int theIndex,  gp_XY  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfXY_InsertAfter(swigCPtr, this, theIndex, gp_XY.getCPtr(theItem), theItem);
  }

  public  gp_XY  Value(int theIndex) {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_HSequenceOfXY_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public gp_XY ChangeValue(int theIndex) {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_HSequenceOfXY_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_XY.CRef (ret);
  }

  public void SetValue(int theIndex,  gp_XY  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfXY_SetValue(swigCPtr, this, theIndex, gp_XY.getCPtr(theItem), theItem);
  }

  public static  TColgp_HSequenceOfXY  DownCast( Standard_Transient  T) {
    return new TColgp_HSequenceOfXY ( OCCwrapJavaJNI.TColgp_HSequenceOfXY_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColgp_HSequenceOfXY_TypeOf(), true );
  }

}
