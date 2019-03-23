package opencascade;

public class TopTools_HSequenceOfShape extends Standard_Transient {
  TopTools_HSequenceOfShape(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TopTools_HSequenceOfShape() {
    this(OCCwrapJavaJNI.new_TopTools_HSequenceOfShape__SWIG_0(), true);
  }

  public TopTools_HSequenceOfShape( TopTools_SequenceOfShape  theOther) {
    this(OCCwrapJavaJNI.new_TopTools_HSequenceOfShape__SWIG_1(TopTools_SequenceOfShape.getCPtr(theOther), theOther), true);
  }

  public  TopTools_SequenceOfShape  Sequence() {
    TopTools_SequenceOfShape ret = new TopTools_SequenceOfShape(OCCwrapJavaJNI.TopTools_HSequenceOfShape_Sequence(swigCPtr, this), false, this);
    return ret;
  }

  public void Append( TopoDS_Shape  theItem) {
    OCCwrapJavaJNI.TopTools_HSequenceOfShape_Append__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(theItem), theItem);
  }

  public void Append( TopTools_SequenceOfShape  theSequence) {
    OCCwrapJavaJNI.TopTools_HSequenceOfShape_Append__SWIG_1(swigCPtr, this, TopTools_SequenceOfShape.getCPtr(theSequence), theSequence);
  }

  public  TopTools_SequenceOfShape  ChangeSequence() {
    TopTools_SequenceOfShape ret = new TopTools_SequenceOfShape(OCCwrapJavaJNI.TopTools_HSequenceOfShape_ChangeSequence(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TopTools_HSequenceOfShape_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TopTools_HSequenceOfShape_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TopTools_HSequenceOfShape_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TopTools_HSequenceOfShape_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TopTools_HSequenceOfShape_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TopTools_HSequenceOfShape_Reverse(swigCPtr, this);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TopTools_HSequenceOfShape_Remove__SWIG_0(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TopTools_HSequenceOfShape_Remove__SWIG_1(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Prepend( TopoDS_Shape  theItem) {
    OCCwrapJavaJNI.TopTools_HSequenceOfShape_Prepend__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(theItem), theItem);
  }

  public void Prepend( TopTools_SequenceOfShape  theSeq) {
    OCCwrapJavaJNI.TopTools_HSequenceOfShape_Prepend__SWIG_1(swigCPtr, this, TopTools_SequenceOfShape.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  TopoDS_Shape  theItem) {
    OCCwrapJavaJNI.TopTools_HSequenceOfShape_InsertBefore(swigCPtr, this, theIndex, TopoDS_Shape.getCPtr(theItem), theItem);
  }

  public void InsertAfter(int theIndex,  TopoDS_Shape  theItem) {
    OCCwrapJavaJNI.TopTools_HSequenceOfShape_InsertAfter(swigCPtr, this, theIndex, TopoDS_Shape.getCPtr(theItem), theItem);
  }

  public  TopoDS_Shape  Value(int theIndex) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_HSequenceOfShape_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public TopoDS_Shape ChangeValue(int theIndex) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_HSequenceOfShape_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

  public void SetValue(int theIndex,  TopoDS_Shape  theItem) {
    OCCwrapJavaJNI.TopTools_HSequenceOfShape_SetValue(swigCPtr, this, theIndex, TopoDS_Shape.getCPtr(theItem), theItem);
  }

  public static  TopTools_HSequenceOfShape  DownCast( Standard_Transient  T) {
    return new TopTools_HSequenceOfShape ( OCCwrapJavaJNI.TopTools_HSequenceOfShape_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TopTools_HSequenceOfShape_TypeOf(), true );
  }

}
