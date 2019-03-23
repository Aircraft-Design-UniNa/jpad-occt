package opencascade;

public class StepGeom_Array1OfTrimmingSelect {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepGeom_Array1OfTrimmingSelect(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepGeom_Array1OfTrimmingSelect(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepGeom_Array1OfTrimmingSelect obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepGeom_Array1OfTrimmingSelect(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepGeom_Array1OfTrimmingSelect() {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfTrimmingSelect__SWIG_0(), true);
  }

  public StepGeom_Array1OfTrimmingSelect(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfTrimmingSelect__SWIG_1(theLower, theUpper), true);
  }

  public StepGeom_Array1OfTrimmingSelect( StepGeom_Array1OfTrimmingSelect  theOther) {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfTrimmingSelect__SWIG_2(StepGeom_Array1OfTrimmingSelect.getCPtr(theOther), theOther), true);
  }

  public StepGeom_Array1OfTrimmingSelect( StepGeom_TrimmingSelect  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfTrimmingSelect__SWIG_4(StepGeom_TrimmingSelect.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( StepGeom_TrimmingSelect  theValue) {
    OCCwrapJavaJNI.StepGeom_Array1OfTrimmingSelect_Init(swigCPtr, this, StepGeom_TrimmingSelect.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepGeom_Array1OfTrimmingSelect_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepGeom_Array1OfTrimmingSelect_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.StepGeom_Array1OfTrimmingSelect_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepGeom_Array1OfTrimmingSelect_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepGeom_Array1OfTrimmingSelect_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.StepGeom_Array1OfTrimmingSelect_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.StepGeom_Array1OfTrimmingSelect_IsAllocated(swigCPtr, this);
  }

  public  StepGeom_Array1OfTrimmingSelect  Assign( StepGeom_Array1OfTrimmingSelect  theOther) {
    StepGeom_Array1OfTrimmingSelect ret = new StepGeom_Array1OfTrimmingSelect(OCCwrapJavaJNI.StepGeom_Array1OfTrimmingSelect_Assign(swigCPtr, this, StepGeom_Array1OfTrimmingSelect.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepGeom_Array1OfTrimmingSelect  Move( StepGeom_Array1OfTrimmingSelect  theOther) {
    StepGeom_Array1OfTrimmingSelect ret = new StepGeom_Array1OfTrimmingSelect(OCCwrapJavaJNI.StepGeom_Array1OfTrimmingSelect_Move(swigCPtr, this, StepGeom_Array1OfTrimmingSelect.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepGeom_TrimmingSelect  First() {
    StepGeom_TrimmingSelect ret = new StepGeom_TrimmingSelect(OCCwrapJavaJNI.StepGeom_Array1OfTrimmingSelect_First(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_TrimmingSelect  ChangeFirst() {
    StepGeom_TrimmingSelect ret = new StepGeom_TrimmingSelect(OCCwrapJavaJNI.StepGeom_Array1OfTrimmingSelect_ChangeFirst(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_TrimmingSelect  Last() {
    StepGeom_TrimmingSelect ret = new StepGeom_TrimmingSelect(OCCwrapJavaJNI.StepGeom_Array1OfTrimmingSelect_Last(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_TrimmingSelect  ChangeLast() {
    StepGeom_TrimmingSelect ret = new StepGeom_TrimmingSelect(OCCwrapJavaJNI.StepGeom_Array1OfTrimmingSelect_ChangeLast(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_TrimmingSelect  Value(int theIndex) {
    StepGeom_TrimmingSelect ret = new StepGeom_TrimmingSelect(OCCwrapJavaJNI.StepGeom_Array1OfTrimmingSelect_Value(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public  StepGeom_TrimmingSelect  ChangeValue(int theIndex) {
    StepGeom_TrimmingSelect ret = new StepGeom_TrimmingSelect(OCCwrapJavaJNI.StepGeom_Array1OfTrimmingSelect_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public void SetValue(int theIndex,  StepGeom_TrimmingSelect  theItem) {
    OCCwrapJavaJNI.StepGeom_Array1OfTrimmingSelect_SetValue(swigCPtr, this, theIndex, StepGeom_TrimmingSelect.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.StepGeom_Array1OfTrimmingSelect_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
