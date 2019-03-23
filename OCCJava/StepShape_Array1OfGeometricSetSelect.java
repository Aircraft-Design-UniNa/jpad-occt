package opencascade;

public class StepShape_Array1OfGeometricSetSelect {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepShape_Array1OfGeometricSetSelect(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepShape_Array1OfGeometricSetSelect(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepShape_Array1OfGeometricSetSelect obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepShape_Array1OfGeometricSetSelect(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepShape_Array1OfGeometricSetSelect() {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfGeometricSetSelect__SWIG_0(), true);
  }

  public StepShape_Array1OfGeometricSetSelect(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfGeometricSetSelect__SWIG_1(theLower, theUpper), true);
  }

  public StepShape_Array1OfGeometricSetSelect( StepShape_Array1OfGeometricSetSelect  theOther) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfGeometricSetSelect__SWIG_2(StepShape_Array1OfGeometricSetSelect.getCPtr(theOther), theOther), true);
  }

  public StepShape_Array1OfGeometricSetSelect( StepShape_GeometricSetSelect  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfGeometricSetSelect__SWIG_4(StepShape_GeometricSetSelect.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( StepShape_GeometricSetSelect  theValue) {
    OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_Init(swigCPtr, this, StepShape_GeometricSetSelect.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_IsAllocated(swigCPtr, this);
  }

  public  StepShape_Array1OfGeometricSetSelect  Assign( StepShape_Array1OfGeometricSetSelect  theOther) {
    StepShape_Array1OfGeometricSetSelect ret = new StepShape_Array1OfGeometricSetSelect(OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_Assign(swigCPtr, this, StepShape_Array1OfGeometricSetSelect.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepShape_Array1OfGeometricSetSelect  Move( StepShape_Array1OfGeometricSetSelect  theOther) {
    StepShape_Array1OfGeometricSetSelect ret = new StepShape_Array1OfGeometricSetSelect(OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_Move(swigCPtr, this, StepShape_Array1OfGeometricSetSelect.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepShape_GeometricSetSelect  First() {
    StepShape_GeometricSetSelect ret = new StepShape_GeometricSetSelect(OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_First(swigCPtr, this), false, this);
    return ret;
  }

  public  StepShape_GeometricSetSelect  ChangeFirst() {
    StepShape_GeometricSetSelect ret = new StepShape_GeometricSetSelect(OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_ChangeFirst(swigCPtr, this), false, this);
    return ret;
  }

  public  StepShape_GeometricSetSelect  Last() {
    StepShape_GeometricSetSelect ret = new StepShape_GeometricSetSelect(OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_Last(swigCPtr, this), false, this);
    return ret;
  }

  public  StepShape_GeometricSetSelect  ChangeLast() {
    StepShape_GeometricSetSelect ret = new StepShape_GeometricSetSelect(OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_ChangeLast(swigCPtr, this), false, this);
    return ret;
  }

  public  StepShape_GeometricSetSelect  Value(int theIndex) {
    StepShape_GeometricSetSelect ret = new StepShape_GeometricSetSelect(OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_Value(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public  StepShape_GeometricSetSelect  ChangeValue(int theIndex) {
    StepShape_GeometricSetSelect ret = new StepShape_GeometricSetSelect(OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public void SetValue(int theIndex,  StepShape_GeometricSetSelect  theItem) {
    OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_SetValue(swigCPtr, this, theIndex, StepShape_GeometricSetSelect.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.StepShape_Array1OfGeometricSetSelect_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
