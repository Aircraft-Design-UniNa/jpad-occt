package opencascade;

public class TColgp_HSequenceOfXYZ extends Standard_Transient {
  TColgp_HSequenceOfXYZ(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColgp_HSequenceOfXYZ() {
    this(OCCwrapJavaJNI.new_TColgp_HSequenceOfXYZ__SWIG_0(), true);
  }

  public TColgp_HSequenceOfXYZ( TColgp_SequenceOfXYZ  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_HSequenceOfXYZ__SWIG_1(TColgp_SequenceOfXYZ.getCPtr(theOther), theOther), true);
  }

  public  TColgp_SequenceOfXYZ  Sequence() {
    TColgp_SequenceOfXYZ ret = new TColgp_SequenceOfXYZ(OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_Sequence(swigCPtr, this), false, this);
    return ret;
  }

  public void Append( gp_XYZ  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_Append__SWIG_0(swigCPtr, this, gp_XYZ.getCPtr(theItem), theItem);
  }

  public void Append( TColgp_SequenceOfXYZ  theSequence) {
    OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_Append__SWIG_1(swigCPtr, this, TColgp_SequenceOfXYZ.getCPtr(theSequence), theSequence);
  }

  public  TColgp_SequenceOfXYZ  ChangeSequence() {
    TColgp_SequenceOfXYZ ret = new TColgp_SequenceOfXYZ(OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_ChangeSequence(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_Reverse(swigCPtr, this);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_Remove__SWIG_0(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_Remove__SWIG_1(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Prepend( gp_XYZ  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_Prepend__SWIG_0(swigCPtr, this, gp_XYZ.getCPtr(theItem), theItem);
  }

  public void Prepend( TColgp_SequenceOfXYZ  theSeq) {
    OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_Prepend__SWIG_1(swigCPtr, this, TColgp_SequenceOfXYZ.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  gp_XYZ  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_InsertBefore(swigCPtr, this, theIndex, gp_XYZ.getCPtr(theItem), theItem);
  }

  public void InsertAfter(int theIndex,  gp_XYZ  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_InsertAfter(swigCPtr, this, theIndex, gp_XYZ.getCPtr(theItem), theItem);
  }

  public  gp_XYZ  Value(int theIndex) {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public gp_XYZ ChangeValue(int theIndex) {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_XYZ.CRef (ret);
  }

  public void SetValue(int theIndex,  gp_XYZ  theItem) {
    OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_SetValue(swigCPtr, this, theIndex, gp_XYZ.getCPtr(theItem), theItem);
  }

  public static  TColgp_HSequenceOfXYZ  DownCast( Standard_Transient  T) {
    return new TColgp_HSequenceOfXYZ ( OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColgp_HSequenceOfXYZ_TypeOf(), true );
  }

}
