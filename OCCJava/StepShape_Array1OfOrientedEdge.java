package opencascade;

public class StepShape_Array1OfOrientedEdge {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepShape_Array1OfOrientedEdge(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepShape_Array1OfOrientedEdge(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepShape_Array1OfOrientedEdge obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepShape_Array1OfOrientedEdge(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepShape_Array1OfOrientedEdge() {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfOrientedEdge__SWIG_0(), true);
  }

  public StepShape_Array1OfOrientedEdge(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfOrientedEdge__SWIG_1(theLower, theUpper), true);
  }

  public StepShape_Array1OfOrientedEdge( StepShape_Array1OfOrientedEdge  theOther) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfOrientedEdge__SWIG_2(StepShape_Array1OfOrientedEdge.getCPtr(theOther), theOther), true);
  }

  public StepShape_Array1OfOrientedEdge( StepShape_OrientedEdge  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfOrientedEdge__SWIG_4( StepShape_OrientedEdge.getCPtr(theBegin) , theBegin, theLower, theUpper), true);
  }

  public void Init( StepShape_OrientedEdge  theValue) {
    OCCwrapJavaJNI.StepShape_Array1OfOrientedEdge_Init(swigCPtr, this,  StepShape_OrientedEdge.getCPtr(theValue) , theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepShape_Array1OfOrientedEdge_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepShape_Array1OfOrientedEdge_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.StepShape_Array1OfOrientedEdge_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepShape_Array1OfOrientedEdge_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepShape_Array1OfOrientedEdge_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.StepShape_Array1OfOrientedEdge_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.StepShape_Array1OfOrientedEdge_IsAllocated(swigCPtr, this);
  }

  public  StepShape_Array1OfOrientedEdge  Assign( StepShape_Array1OfOrientedEdge  theOther) {
    StepShape_Array1OfOrientedEdge ret = new StepShape_Array1OfOrientedEdge(OCCwrapJavaJNI.StepShape_Array1OfOrientedEdge_Assign(swigCPtr, this, StepShape_Array1OfOrientedEdge.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepShape_Array1OfOrientedEdge  Move( StepShape_Array1OfOrientedEdge  theOther) {
    StepShape_Array1OfOrientedEdge ret = new StepShape_Array1OfOrientedEdge(OCCwrapJavaJNI.StepShape_Array1OfOrientedEdge_Move(swigCPtr, this, StepShape_Array1OfOrientedEdge.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepShape_OrientedEdge  First() {
    return new StepShape_OrientedEdge ( OCCwrapJavaJNI.StepShape_Array1OfOrientedEdge_First(swigCPtr, this), true );
  }

  public  StepShape_OrientedEdge  ChangeFirst() {
    return new StepShape_OrientedEdge ( OCCwrapJavaJNI.StepShape_Array1OfOrientedEdge_ChangeFirst(swigCPtr, this), true );
  }

  public  StepShape_OrientedEdge  Last() {
    return new StepShape_OrientedEdge ( OCCwrapJavaJNI.StepShape_Array1OfOrientedEdge_Last(swigCPtr, this), true );
  }

  public  StepShape_OrientedEdge  ChangeLast() {
    return new StepShape_OrientedEdge ( OCCwrapJavaJNI.StepShape_Array1OfOrientedEdge_ChangeLast(swigCPtr, this), true );
  }

  public  StepShape_OrientedEdge  Value(int theIndex) {
    return new StepShape_OrientedEdge ( OCCwrapJavaJNI.StepShape_Array1OfOrientedEdge_Value(swigCPtr, this, theIndex), true );
  }

  public  StepShape_OrientedEdge  ChangeValue(int theIndex) {
    return new StepShape_OrientedEdge ( OCCwrapJavaJNI.StepShape_Array1OfOrientedEdge_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepShape_OrientedEdge  theItem) {
    OCCwrapJavaJNI.StepShape_Array1OfOrientedEdge_SetValue(swigCPtr, this, theIndex,  StepShape_OrientedEdge.getCPtr(theItem) , theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.StepShape_Array1OfOrientedEdge_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
