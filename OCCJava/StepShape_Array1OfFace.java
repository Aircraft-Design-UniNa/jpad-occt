package opencascade;

public class StepShape_Array1OfFace {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepShape_Array1OfFace(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepShape_Array1OfFace(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepShape_Array1OfFace obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepShape_Array1OfFace(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepShape_Array1OfFace() {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfFace__SWIG_0(), true);
  }

  public StepShape_Array1OfFace(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfFace__SWIG_1(theLower, theUpper), true);
  }

  public StepShape_Array1OfFace( StepShape_Array1OfFace  theOther) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfFace__SWIG_2(StepShape_Array1OfFace.getCPtr(theOther), theOther), true);
  }

  public StepShape_Array1OfFace( StepShape_Face  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfFace__SWIG_4( StepShape_Face.getCPtr(theBegin) , theBegin, theLower, theUpper), true);
  }

  public void Init( StepShape_Face  theValue) {
    OCCwrapJavaJNI.StepShape_Array1OfFace_Init(swigCPtr, this,  StepShape_Face.getCPtr(theValue) , theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepShape_Array1OfFace_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepShape_Array1OfFace_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.StepShape_Array1OfFace_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepShape_Array1OfFace_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepShape_Array1OfFace_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.StepShape_Array1OfFace_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.StepShape_Array1OfFace_IsAllocated(swigCPtr, this);
  }

  public  StepShape_Array1OfFace  Assign( StepShape_Array1OfFace  theOther) {
    StepShape_Array1OfFace ret = new StepShape_Array1OfFace(OCCwrapJavaJNI.StepShape_Array1OfFace_Assign(swigCPtr, this, StepShape_Array1OfFace.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepShape_Array1OfFace  Move( StepShape_Array1OfFace  theOther) {
    StepShape_Array1OfFace ret = new StepShape_Array1OfFace(OCCwrapJavaJNI.StepShape_Array1OfFace_Move(swigCPtr, this, StepShape_Array1OfFace.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepShape_Face  First() {
    return new StepShape_Face ( OCCwrapJavaJNI.StepShape_Array1OfFace_First(swigCPtr, this), true );
  }

  public  StepShape_Face  ChangeFirst() {
    return new StepShape_Face ( OCCwrapJavaJNI.StepShape_Array1OfFace_ChangeFirst(swigCPtr, this), true );
  }

  public  StepShape_Face  Last() {
    return new StepShape_Face ( OCCwrapJavaJNI.StepShape_Array1OfFace_Last(swigCPtr, this), true );
  }

  public  StepShape_Face  ChangeLast() {
    return new StepShape_Face ( OCCwrapJavaJNI.StepShape_Array1OfFace_ChangeLast(swigCPtr, this), true );
  }

  public  StepShape_Face  Value(int theIndex) {
    return new StepShape_Face ( OCCwrapJavaJNI.StepShape_Array1OfFace_Value(swigCPtr, this, theIndex), true );
  }

  public  StepShape_Face  ChangeValue(int theIndex) {
    return new StepShape_Face ( OCCwrapJavaJNI.StepShape_Array1OfFace_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepShape_Face  theItem) {
    OCCwrapJavaJNI.StepShape_Array1OfFace_SetValue(swigCPtr, this, theIndex,  StepShape_Face.getCPtr(theItem) , theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.StepShape_Array1OfFace_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
