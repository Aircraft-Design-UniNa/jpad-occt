package opencascade;

public class StepGeom_Array1OfCompositeCurveSegment {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepGeom_Array1OfCompositeCurveSegment(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepGeom_Array1OfCompositeCurveSegment(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepGeom_Array1OfCompositeCurveSegment obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepGeom_Array1OfCompositeCurveSegment(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepGeom_Array1OfCompositeCurveSegment() {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfCompositeCurveSegment__SWIG_0(), true);
  }

  public StepGeom_Array1OfCompositeCurveSegment(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfCompositeCurveSegment__SWIG_1(theLower, theUpper), true);
  }

  public StepGeom_Array1OfCompositeCurveSegment( StepGeom_Array1OfCompositeCurveSegment  theOther) {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfCompositeCurveSegment__SWIG_2(StepGeom_Array1OfCompositeCurveSegment.getCPtr(theOther), theOther), true);
  }

  public StepGeom_Array1OfCompositeCurveSegment( StepGeom_CompositeCurveSegment  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfCompositeCurveSegment__SWIG_4( StepGeom_CompositeCurveSegment.getCPtr(theBegin) , theBegin, theLower, theUpper), true);
  }

  public void Init( StepGeom_CompositeCurveSegment  theValue) {
    OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_Init(swigCPtr, this,  StepGeom_CompositeCurveSegment.getCPtr(theValue) , theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_IsAllocated(swigCPtr, this);
  }

  public  StepGeom_Array1OfCompositeCurveSegment  Assign( StepGeom_Array1OfCompositeCurveSegment  theOther) {
    StepGeom_Array1OfCompositeCurveSegment ret = new StepGeom_Array1OfCompositeCurveSegment(OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_Assign(swigCPtr, this, StepGeom_Array1OfCompositeCurveSegment.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepGeom_Array1OfCompositeCurveSegment  Move( StepGeom_Array1OfCompositeCurveSegment  theOther) {
    StepGeom_Array1OfCompositeCurveSegment ret = new StepGeom_Array1OfCompositeCurveSegment(OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_Move(swigCPtr, this, StepGeom_Array1OfCompositeCurveSegment.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepGeom_CompositeCurveSegment  First() {
    return new StepGeom_CompositeCurveSegment ( OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_First(swigCPtr, this), true );
  }

  public  StepGeom_CompositeCurveSegment  ChangeFirst() {
    return new StepGeom_CompositeCurveSegment ( OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_ChangeFirst(swigCPtr, this), true );
  }

  public  StepGeom_CompositeCurveSegment  Last() {
    return new StepGeom_CompositeCurveSegment ( OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_Last(swigCPtr, this), true );
  }

  public  StepGeom_CompositeCurveSegment  ChangeLast() {
    return new StepGeom_CompositeCurveSegment ( OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_ChangeLast(swigCPtr, this), true );
  }

  public  StepGeom_CompositeCurveSegment  Value(int theIndex) {
    return new StepGeom_CompositeCurveSegment ( OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_Value(swigCPtr, this, theIndex), true );
  }

  public  StepGeom_CompositeCurveSegment  ChangeValue(int theIndex) {
    return new StepGeom_CompositeCurveSegment ( OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepGeom_CompositeCurveSegment  theItem) {
    OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_SetValue(swigCPtr, this, theIndex,  StepGeom_CompositeCurveSegment.getCPtr(theItem) , theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.StepGeom_Array1OfCompositeCurveSegment_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
