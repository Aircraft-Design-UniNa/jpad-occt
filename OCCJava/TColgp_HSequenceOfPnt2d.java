package opencascade;

public class TColgp_HSequenceOfPnt2d extends Standard_Transient {
  TColgp_HSequenceOfPnt2d(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColgp_HSequenceOfPnt2d() {
    this(OCCwrapJavaJNI.new_TColgp_HSequenceOfPnt2d__SWIG_0(), true);
  }

  public TColgp_HSequenceOfPnt2d( TColgp_SequenceOfPnt2d  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_HSequenceOfPnt2d__SWIG_1(TColgp_SequenceOfPnt2d.getCPtr(theOther), theOther), true);
  }

  public  TColgp_SequenceOfPnt2d  Sequence() {
    TColgp_SequenceOfPnt2d ret = new TColgp_SequenceOfPnt2d(OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_Sequence(swigCPtr, this), false, this);
    return ret;
  }

  public void Append( gp_Pnt2d  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_Append__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(theItem), theItem);
  }

  public void Append( TColgp_SequenceOfPnt2d  theSequence) {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_Append__SWIG_1(swigCPtr, this, TColgp_SequenceOfPnt2d.getCPtr(theSequence), theSequence);
  }

  public  TColgp_SequenceOfPnt2d  ChangeSequence() {
    TColgp_SequenceOfPnt2d ret = new TColgp_SequenceOfPnt2d(OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_ChangeSequence(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_Reverse(swigCPtr, this);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_Remove__SWIG_0(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_Remove__SWIG_1(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Prepend( gp_Pnt2d  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_Prepend__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(theItem), theItem);
  }

  public void Prepend( TColgp_SequenceOfPnt2d  theSeq) {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_Prepend__SWIG_1(swigCPtr, this, TColgp_SequenceOfPnt2d.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  gp_Pnt2d  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_InsertBefore(swigCPtr, this, theIndex, gp_Pnt2d.getCPtr(theItem), theItem);
  }

  public void InsertAfter(int theIndex,  gp_Pnt2d  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_InsertAfter(swigCPtr, this, theIndex, gp_Pnt2d.getCPtr(theItem), theItem);
  }

  public  gp_Pnt2d  Value(int theIndex) {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public gp_Pnt2d ChangeValue(int theIndex) {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_Pnt2d.CRef (ret);
  }

  public void SetValue(int theIndex,  gp_Pnt2d  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_SetValue(swigCPtr, this, theIndex, gp_Pnt2d.getCPtr(theItem), theItem);
  }

  public static  TColgp_HSequenceOfPnt2d  DownCast( Standard_Transient  T) {
    return new TColgp_HSequenceOfPnt2d ( OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColgp_HSequenceOfPnt2d_TypeOf(), true );
  }

}
