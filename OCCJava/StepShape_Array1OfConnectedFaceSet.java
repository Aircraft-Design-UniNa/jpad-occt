package opencascade;

public class StepShape_Array1OfConnectedFaceSet {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepShape_Array1OfConnectedFaceSet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepShape_Array1OfConnectedFaceSet(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepShape_Array1OfConnectedFaceSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepShape_Array1OfConnectedFaceSet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepShape_Array1OfConnectedFaceSet() {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfConnectedFaceSet__SWIG_0(), true);
  }

  public StepShape_Array1OfConnectedFaceSet(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfConnectedFaceSet__SWIG_1(theLower, theUpper), true);
  }

  public StepShape_Array1OfConnectedFaceSet( StepShape_Array1OfConnectedFaceSet  theOther) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfConnectedFaceSet__SWIG_2(StepShape_Array1OfConnectedFaceSet.getCPtr(theOther), theOther), true);
  }

  public StepShape_Array1OfConnectedFaceSet( StepShape_ConnectedFaceSet  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfConnectedFaceSet__SWIG_4( StepShape_ConnectedFaceSet.getCPtr(theBegin) , theBegin, theLower, theUpper), true);
  }

  public void Init( StepShape_ConnectedFaceSet  theValue) {
    OCCwrapJavaJNI.StepShape_Array1OfConnectedFaceSet_Init(swigCPtr, this,  StepShape_ConnectedFaceSet.getCPtr(theValue) , theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepShape_Array1OfConnectedFaceSet_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepShape_Array1OfConnectedFaceSet_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.StepShape_Array1OfConnectedFaceSet_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepShape_Array1OfConnectedFaceSet_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepShape_Array1OfConnectedFaceSet_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.StepShape_Array1OfConnectedFaceSet_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.StepShape_Array1OfConnectedFaceSet_IsAllocated(swigCPtr, this);
  }

  public  StepShape_Array1OfConnectedFaceSet  Assign( StepShape_Array1OfConnectedFaceSet  theOther) {
    StepShape_Array1OfConnectedFaceSet ret = new StepShape_Array1OfConnectedFaceSet(OCCwrapJavaJNI.StepShape_Array1OfConnectedFaceSet_Assign(swigCPtr, this, StepShape_Array1OfConnectedFaceSet.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepShape_Array1OfConnectedFaceSet  Move( StepShape_Array1OfConnectedFaceSet  theOther) {
    StepShape_Array1OfConnectedFaceSet ret = new StepShape_Array1OfConnectedFaceSet(OCCwrapJavaJNI.StepShape_Array1OfConnectedFaceSet_Move(swigCPtr, this, StepShape_Array1OfConnectedFaceSet.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepShape_ConnectedFaceSet  First() {
    return new StepShape_ConnectedFaceSet ( OCCwrapJavaJNI.StepShape_Array1OfConnectedFaceSet_First(swigCPtr, this), true );
  }

  public  StepShape_ConnectedFaceSet  ChangeFirst() {
    return new StepShape_ConnectedFaceSet ( OCCwrapJavaJNI.StepShape_Array1OfConnectedFaceSet_ChangeFirst(swigCPtr, this), true );
  }

  public  StepShape_ConnectedFaceSet  Last() {
    return new StepShape_ConnectedFaceSet ( OCCwrapJavaJNI.StepShape_Array1OfConnectedFaceSet_Last(swigCPtr, this), true );
  }

  public  StepShape_ConnectedFaceSet  ChangeLast() {
    return new StepShape_ConnectedFaceSet ( OCCwrapJavaJNI.StepShape_Array1OfConnectedFaceSet_ChangeLast(swigCPtr, this), true );
  }

  public  StepShape_ConnectedFaceSet  Value(int theIndex) {
    return new StepShape_ConnectedFaceSet ( OCCwrapJavaJNI.StepShape_Array1OfConnectedFaceSet_Value(swigCPtr, this, theIndex), true );
  }

  public  StepShape_ConnectedFaceSet  ChangeValue(int theIndex) {
    return new StepShape_ConnectedFaceSet ( OCCwrapJavaJNI.StepShape_Array1OfConnectedFaceSet_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepShape_ConnectedFaceSet  theItem) {
    OCCwrapJavaJNI.StepShape_Array1OfConnectedFaceSet_SetValue(swigCPtr, this, theIndex,  StepShape_ConnectedFaceSet.getCPtr(theItem) , theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.StepShape_Array1OfConnectedFaceSet_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
