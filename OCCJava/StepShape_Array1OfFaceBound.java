package opencascade;

public class StepShape_Array1OfFaceBound {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepShape_Array1OfFaceBound(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepShape_Array1OfFaceBound(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepShape_Array1OfFaceBound obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepShape_Array1OfFaceBound(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepShape_Array1OfFaceBound() {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfFaceBound__SWIG_0(), true);
  }

  public StepShape_Array1OfFaceBound(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfFaceBound__SWIG_1(theLower, theUpper), true);
  }

  public StepShape_Array1OfFaceBound( StepShape_Array1OfFaceBound  theOther) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfFaceBound__SWIG_2(StepShape_Array1OfFaceBound.getCPtr(theOther), theOther), true);
  }

  public StepShape_Array1OfFaceBound( StepShape_FaceBound  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfFaceBound__SWIG_4( StepShape_FaceBound.getCPtr(theBegin) , theBegin, theLower, theUpper), true);
  }

  public void Init( StepShape_FaceBound  theValue) {
    OCCwrapJavaJNI.StepShape_Array1OfFaceBound_Init(swigCPtr, this,  StepShape_FaceBound.getCPtr(theValue) , theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepShape_Array1OfFaceBound_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepShape_Array1OfFaceBound_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.StepShape_Array1OfFaceBound_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepShape_Array1OfFaceBound_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepShape_Array1OfFaceBound_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.StepShape_Array1OfFaceBound_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.StepShape_Array1OfFaceBound_IsAllocated(swigCPtr, this);
  }

  public  StepShape_Array1OfFaceBound  Assign( StepShape_Array1OfFaceBound  theOther) {
    StepShape_Array1OfFaceBound ret = new StepShape_Array1OfFaceBound(OCCwrapJavaJNI.StepShape_Array1OfFaceBound_Assign(swigCPtr, this, StepShape_Array1OfFaceBound.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepShape_Array1OfFaceBound  Move( StepShape_Array1OfFaceBound  theOther) {
    StepShape_Array1OfFaceBound ret = new StepShape_Array1OfFaceBound(OCCwrapJavaJNI.StepShape_Array1OfFaceBound_Move(swigCPtr, this, StepShape_Array1OfFaceBound.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepShape_FaceBound  First() {
    return new StepShape_FaceBound ( OCCwrapJavaJNI.StepShape_Array1OfFaceBound_First(swigCPtr, this), true );
  }

  public  StepShape_FaceBound  ChangeFirst() {
    return new StepShape_FaceBound ( OCCwrapJavaJNI.StepShape_Array1OfFaceBound_ChangeFirst(swigCPtr, this), true );
  }

  public  StepShape_FaceBound  Last() {
    return new StepShape_FaceBound ( OCCwrapJavaJNI.StepShape_Array1OfFaceBound_Last(swigCPtr, this), true );
  }

  public  StepShape_FaceBound  ChangeLast() {
    return new StepShape_FaceBound ( OCCwrapJavaJNI.StepShape_Array1OfFaceBound_ChangeLast(swigCPtr, this), true );
  }

  public  StepShape_FaceBound  Value(int theIndex) {
    return new StepShape_FaceBound ( OCCwrapJavaJNI.StepShape_Array1OfFaceBound_Value(swigCPtr, this, theIndex), true );
  }

  public  StepShape_FaceBound  ChangeValue(int theIndex) {
    return new StepShape_FaceBound ( OCCwrapJavaJNI.StepShape_Array1OfFaceBound_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepShape_FaceBound  theItem) {
    OCCwrapJavaJNI.StepShape_Array1OfFaceBound_SetValue(swigCPtr, this, theIndex,  StepShape_FaceBound.getCPtr(theItem) , theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.StepShape_Array1OfFaceBound_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
