package opencascade;

public class StepShape_Array1OfConnectedEdgeSet {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepShape_Array1OfConnectedEdgeSet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepShape_Array1OfConnectedEdgeSet(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepShape_Array1OfConnectedEdgeSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepShape_Array1OfConnectedEdgeSet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepShape_Array1OfConnectedEdgeSet() {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfConnectedEdgeSet__SWIG_0(), true);
  }

  public StepShape_Array1OfConnectedEdgeSet(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfConnectedEdgeSet__SWIG_1(theLower, theUpper), true);
  }

  public StepShape_Array1OfConnectedEdgeSet( StepShape_Array1OfConnectedEdgeSet  theOther) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfConnectedEdgeSet__SWIG_2(StepShape_Array1OfConnectedEdgeSet.getCPtr(theOther), theOther), true);
  }

  public StepShape_Array1OfConnectedEdgeSet( StepShape_ConnectedEdgeSet  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfConnectedEdgeSet__SWIG_4( StepShape_ConnectedEdgeSet.getCPtr(theBegin) , theBegin, theLower, theUpper), true);
  }

  public void Init( StepShape_ConnectedEdgeSet  theValue) {
    OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_Init(swigCPtr, this,  StepShape_ConnectedEdgeSet.getCPtr(theValue) , theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_IsAllocated(swigCPtr, this);
  }

  public  StepShape_Array1OfConnectedEdgeSet  Assign( StepShape_Array1OfConnectedEdgeSet  theOther) {
    StepShape_Array1OfConnectedEdgeSet ret = new StepShape_Array1OfConnectedEdgeSet(OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_Assign(swigCPtr, this, StepShape_Array1OfConnectedEdgeSet.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepShape_Array1OfConnectedEdgeSet  Move( StepShape_Array1OfConnectedEdgeSet  theOther) {
    StepShape_Array1OfConnectedEdgeSet ret = new StepShape_Array1OfConnectedEdgeSet(OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_Move(swigCPtr, this, StepShape_Array1OfConnectedEdgeSet.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepShape_ConnectedEdgeSet  First() {
    return new StepShape_ConnectedEdgeSet ( OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_First(swigCPtr, this), true );
  }

  public  StepShape_ConnectedEdgeSet  ChangeFirst() {
    return new StepShape_ConnectedEdgeSet ( OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_ChangeFirst(swigCPtr, this), true );
  }

  public  StepShape_ConnectedEdgeSet  Last() {
    return new StepShape_ConnectedEdgeSet ( OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_Last(swigCPtr, this), true );
  }

  public  StepShape_ConnectedEdgeSet  ChangeLast() {
    return new StepShape_ConnectedEdgeSet ( OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_ChangeLast(swigCPtr, this), true );
  }

  public  StepShape_ConnectedEdgeSet  Value(int theIndex) {
    return new StepShape_ConnectedEdgeSet ( OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_Value(swigCPtr, this, theIndex), true );
  }

  public  StepShape_ConnectedEdgeSet  ChangeValue(int theIndex) {
    return new StepShape_ConnectedEdgeSet ( OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepShape_ConnectedEdgeSet  theItem) {
    OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_SetValue(swigCPtr, this, theIndex,  StepShape_ConnectedEdgeSet.getCPtr(theItem) , theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.StepShape_Array1OfConnectedEdgeSet_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
