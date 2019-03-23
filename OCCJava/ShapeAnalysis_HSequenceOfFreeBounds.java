package opencascade;

public class ShapeAnalysis_HSequenceOfFreeBounds extends Standard_Transient {
  ShapeAnalysis_HSequenceOfFreeBounds(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public ShapeAnalysis_HSequenceOfFreeBounds() {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_HSequenceOfFreeBounds__SWIG_0(), true);
  }

  public ShapeAnalysis_HSequenceOfFreeBounds( ShapeAnalysis_SequenceOfFreeBounds  theOther) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_HSequenceOfFreeBounds__SWIG_1(ShapeAnalysis_SequenceOfFreeBounds.getCPtr(theOther), theOther), true);
  }

  public  ShapeAnalysis_SequenceOfFreeBounds  Sequence() {
    ShapeAnalysis_SequenceOfFreeBounds ret = new ShapeAnalysis_SequenceOfFreeBounds(OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_Sequence(swigCPtr, this), false, this);
    return ret;
  }

  public void Append( ShapeAnalysis_FreeBoundData  theItem) {
    OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_Append__SWIG_0(swigCPtr, this,  ShapeAnalysis_FreeBoundData.getCPtr(theItem) , theItem);
  }

  public void Append( ShapeAnalysis_SequenceOfFreeBounds  theSequence) {
    OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_Append__SWIG_1(swigCPtr, this, ShapeAnalysis_SequenceOfFreeBounds.getCPtr(theSequence), theSequence);
  }

  public  ShapeAnalysis_SequenceOfFreeBounds  ChangeSequence() {
    ShapeAnalysis_SequenceOfFreeBounds ret = new ShapeAnalysis_SequenceOfFreeBounds(OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_ChangeSequence(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_Reverse(swigCPtr, this);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_Remove__SWIG_0(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_Remove__SWIG_1(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Prepend( ShapeAnalysis_FreeBoundData  theItem) {
    OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_Prepend__SWIG_0(swigCPtr, this,  ShapeAnalysis_FreeBoundData.getCPtr(theItem) , theItem);
  }

  public void Prepend( ShapeAnalysis_SequenceOfFreeBounds  theSeq) {
    OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_Prepend__SWIG_1(swigCPtr, this, ShapeAnalysis_SequenceOfFreeBounds.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  ShapeAnalysis_FreeBoundData  theItem) {
    OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_InsertBefore(swigCPtr, this, theIndex,  ShapeAnalysis_FreeBoundData.getCPtr(theItem) , theItem);
  }

  public void InsertAfter(int theIndex,  ShapeAnalysis_FreeBoundData  theItem) {
    OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_InsertAfter(swigCPtr, this, theIndex,  ShapeAnalysis_FreeBoundData.getCPtr(theItem) , theItem);
  }

  public  ShapeAnalysis_FreeBoundData  Value(int theIndex) {
    return new ShapeAnalysis_FreeBoundData ( OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_Value(swigCPtr, this, theIndex), true );
  }

  public  ShapeAnalysis_FreeBoundData  ChangeValue(int theIndex) {
    return new ShapeAnalysis_FreeBoundData ( OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  ShapeAnalysis_FreeBoundData  theItem) {
    OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_SetValue(swigCPtr, this, theIndex,  ShapeAnalysis_FreeBoundData.getCPtr(theItem) , theItem);
  }

  public static  ShapeAnalysis_HSequenceOfFreeBounds  DownCast( Standard_Transient  T) {
    return new ShapeAnalysis_HSequenceOfFreeBounds ( OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeAnalysis_HSequenceOfFreeBounds_TypeOf(), true );
  }

}
