package opencascade;

public class TopTools_SequenceOfShape {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TopTools_SequenceOfShape(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TopTools_SequenceOfShape(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TopTools_SequenceOfShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopTools_SequenceOfShape(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TopTools_SequenceOfShape() {
    this(OCCwrapJavaJNI.new_TopTools_SequenceOfShape__SWIG_0(), true);
  }

  public TopTools_SequenceOfShape( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TopTools_SequenceOfShape__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TopTools_SequenceOfShape( TopTools_SequenceOfShape  theOther) {
    this(OCCwrapJavaJNI.new_TopTools_SequenceOfShape__SWIG_2(TopTools_SequenceOfShape.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TopTools_SequenceOfShape_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TopTools_SequenceOfShape_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TopTools_SequenceOfShape_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TopTools_SequenceOfShape_Upper(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TopTools_SequenceOfShape_IsEmpty(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TopTools_SequenceOfShape_Reverse(swigCPtr, this);
  }

  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.TopTools_SequenceOfShape_Exchange(swigCPtr, this, I, J);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TopTools_SequenceOfShape_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TopTools_SequenceOfShape_Clear__SWIG_1(swigCPtr, this);
  }

  public  TopTools_SequenceOfShape  Assign( TopTools_SequenceOfShape  theOther) {
    TopTools_SequenceOfShape ret = new TopTools_SequenceOfShape(OCCwrapJavaJNI.TopTools_SequenceOfShape_Assign(swigCPtr, this, TopTools_SequenceOfShape.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Remove( TopTools_SequenceOfShape_Iterator  thePosition) {
    OCCwrapJavaJNI.TopTools_SequenceOfShape_Remove__SWIG_0(swigCPtr, this,  TopTools_SequenceOfShape_Iterator.getCPtr(thePosition) , thePosition);
  }

  public void Remove(int theIndex) {
    OCCwrapJavaJNI.TopTools_SequenceOfShape_Remove__SWIG_1(swigCPtr, this, theIndex);
  }

  public void Remove(int theFromIndex, int theToIndex) {
    OCCwrapJavaJNI.TopTools_SequenceOfShape_Remove__SWIG_2(swigCPtr, this, theFromIndex, theToIndex);
  }

  public void Append( TopoDS_Shape  theItem) {
    OCCwrapJavaJNI.TopTools_SequenceOfShape_Append__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(theItem), theItem);
  }

  public void Append( TopTools_SequenceOfShape  theSeq) {
    OCCwrapJavaJNI.TopTools_SequenceOfShape_Append__SWIG_1(swigCPtr, this, TopTools_SequenceOfShape.getCPtr(theSeq), theSeq);
  }

  public void Prepend( TopoDS_Shape  theItem) {
    OCCwrapJavaJNI.TopTools_SequenceOfShape_Prepend__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(theItem), theItem);
  }

  public void Prepend( TopTools_SequenceOfShape  theSeq) {
    OCCwrapJavaJNI.TopTools_SequenceOfShape_Prepend__SWIG_1(swigCPtr, this, TopTools_SequenceOfShape.getCPtr(theSeq), theSeq);
  }

  public void InsertBefore(int theIndex,  TopoDS_Shape  theItem) {
    OCCwrapJavaJNI.TopTools_SequenceOfShape_InsertBefore__SWIG_0(swigCPtr, this, theIndex, TopoDS_Shape.getCPtr(theItem), theItem);
  }

  public void InsertBefore(int theIndex,  TopTools_SequenceOfShape  theSeq) {
    OCCwrapJavaJNI.TopTools_SequenceOfShape_InsertBefore__SWIG_1(swigCPtr, this, theIndex, TopTools_SequenceOfShape.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter( TopTools_SequenceOfShape_Iterator  thePosition,  TopoDS_Shape  theItem) {
    OCCwrapJavaJNI.TopTools_SequenceOfShape_InsertAfter__SWIG_0(swigCPtr, this,  TopTools_SequenceOfShape_Iterator.getCPtr(thePosition) , thePosition, TopoDS_Shape.getCPtr(theItem), theItem);
  }

  public void InsertAfter(int theIndex,  TopTools_SequenceOfShape  theSeq) {
    OCCwrapJavaJNI.TopTools_SequenceOfShape_InsertAfter__SWIG_1(swigCPtr, this, theIndex, TopTools_SequenceOfShape.getCPtr(theSeq), theSeq);
  }

  public void InsertAfter(int theIndex,  TopoDS_Shape  theItem) {
    OCCwrapJavaJNI.TopTools_SequenceOfShape_InsertAfter__SWIG_2(swigCPtr, this, theIndex, TopoDS_Shape.getCPtr(theItem), theItem);
  }

  public void Split(int theIndex,  TopTools_SequenceOfShape  theSeq) {
    OCCwrapJavaJNI.TopTools_SequenceOfShape_Split(swigCPtr, this, theIndex, TopTools_SequenceOfShape.getCPtr(theSeq), theSeq);
  }

  public  TopoDS_Shape  First() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_SequenceOfShape_First(swigCPtr, this), true);
    return ret;
  }

  public TopoDS_Shape ChangeFirst() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_SequenceOfShape_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

  public  TopoDS_Shape  Last() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_SequenceOfShape_Last(swigCPtr, this), true);
    return ret;
  }

  public TopoDS_Shape ChangeLast() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_SequenceOfShape_ChangeLast(swigCPtr, this), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

  public  TopoDS_Shape  Value(int theIndex) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_SequenceOfShape_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public TopoDS_Shape ChangeValue(int theIndex) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_SequenceOfShape_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

  public void SetValue(int theIndex,  TopoDS_Shape  theItem) {
    OCCwrapJavaJNI.TopTools_SequenceOfShape_SetValue(swigCPtr, this, theIndex, TopoDS_Shape.getCPtr(theItem), theItem);
  }

}
