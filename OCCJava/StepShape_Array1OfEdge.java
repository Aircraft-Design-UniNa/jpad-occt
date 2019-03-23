package opencascade;

public class StepShape_Array1OfEdge {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepShape_Array1OfEdge(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepShape_Array1OfEdge(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepShape_Array1OfEdge obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepShape_Array1OfEdge(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepShape_Array1OfEdge() {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfEdge__SWIG_0(), true);
  }

  public StepShape_Array1OfEdge(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfEdge__SWIG_1(theLower, theUpper), true);
  }

  public StepShape_Array1OfEdge( StepShape_Array1OfEdge  theOther) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfEdge__SWIG_2(StepShape_Array1OfEdge.getCPtr(theOther), theOther), true);
  }

  public StepShape_Array1OfEdge( StepShape_Edge  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfEdge__SWIG_4( StepShape_Edge.getCPtr(theBegin) , theBegin, theLower, theUpper), true);
  }

  public void Init( StepShape_Edge  theValue) {
    OCCwrapJavaJNI.StepShape_Array1OfEdge_Init(swigCPtr, this,  StepShape_Edge.getCPtr(theValue) , theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepShape_Array1OfEdge_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepShape_Array1OfEdge_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.StepShape_Array1OfEdge_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepShape_Array1OfEdge_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepShape_Array1OfEdge_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.StepShape_Array1OfEdge_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.StepShape_Array1OfEdge_IsAllocated(swigCPtr, this);
  }

  public  StepShape_Array1OfEdge  Assign( StepShape_Array1OfEdge  theOther) {
    StepShape_Array1OfEdge ret = new StepShape_Array1OfEdge(OCCwrapJavaJNI.StepShape_Array1OfEdge_Assign(swigCPtr, this, StepShape_Array1OfEdge.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepShape_Array1OfEdge  Move( StepShape_Array1OfEdge  theOther) {
    StepShape_Array1OfEdge ret = new StepShape_Array1OfEdge(OCCwrapJavaJNI.StepShape_Array1OfEdge_Move(swigCPtr, this, StepShape_Array1OfEdge.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepShape_Edge  First() {
    return new StepShape_Edge ( OCCwrapJavaJNI.StepShape_Array1OfEdge_First(swigCPtr, this), true );
  }

  public  StepShape_Edge  ChangeFirst() {
    return new StepShape_Edge ( OCCwrapJavaJNI.StepShape_Array1OfEdge_ChangeFirst(swigCPtr, this), true );
  }

  public  StepShape_Edge  Last() {
    return new StepShape_Edge ( OCCwrapJavaJNI.StepShape_Array1OfEdge_Last(swigCPtr, this), true );
  }

  public  StepShape_Edge  ChangeLast() {
    return new StepShape_Edge ( OCCwrapJavaJNI.StepShape_Array1OfEdge_ChangeLast(swigCPtr, this), true );
  }

  public  StepShape_Edge  Value(int theIndex) {
    return new StepShape_Edge ( OCCwrapJavaJNI.StepShape_Array1OfEdge_Value(swigCPtr, this, theIndex), true );
  }

  public  StepShape_Edge  ChangeValue(int theIndex) {
    return new StepShape_Edge ( OCCwrapJavaJNI.StepShape_Array1OfEdge_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepShape_Edge  theItem) {
    OCCwrapJavaJNI.StepShape_Array1OfEdge_SetValue(swigCPtr, this, theIndex,  StepShape_Edge.getCPtr(theItem) , theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.StepShape_Array1OfEdge_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
