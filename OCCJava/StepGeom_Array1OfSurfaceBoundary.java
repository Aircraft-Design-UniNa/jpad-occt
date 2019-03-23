package opencascade;

public class StepGeom_Array1OfSurfaceBoundary {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepGeom_Array1OfSurfaceBoundary(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepGeom_Array1OfSurfaceBoundary(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepGeom_Array1OfSurfaceBoundary obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepGeom_Array1OfSurfaceBoundary(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepGeom_Array1OfSurfaceBoundary() {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfSurfaceBoundary__SWIG_0(), true);
  }

  public StepGeom_Array1OfSurfaceBoundary(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfSurfaceBoundary__SWIG_1(theLower, theUpper), true);
  }

  public StepGeom_Array1OfSurfaceBoundary( StepGeom_Array1OfSurfaceBoundary  theOther) {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfSurfaceBoundary__SWIG_2(StepGeom_Array1OfSurfaceBoundary.getCPtr(theOther), theOther), true);
  }

  public StepGeom_Array1OfSurfaceBoundary( StepGeom_SurfaceBoundary  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfSurfaceBoundary__SWIG_4(StepGeom_SurfaceBoundary.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( StepGeom_SurfaceBoundary  theValue) {
    OCCwrapJavaJNI.StepGeom_Array1OfSurfaceBoundary_Init(swigCPtr, this, StepGeom_SurfaceBoundary.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepGeom_Array1OfSurfaceBoundary_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepGeom_Array1OfSurfaceBoundary_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.StepGeom_Array1OfSurfaceBoundary_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepGeom_Array1OfSurfaceBoundary_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepGeom_Array1OfSurfaceBoundary_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.StepGeom_Array1OfSurfaceBoundary_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.StepGeom_Array1OfSurfaceBoundary_IsAllocated(swigCPtr, this);
  }

  public  StepGeom_Array1OfSurfaceBoundary  Assign( StepGeom_Array1OfSurfaceBoundary  theOther) {
    StepGeom_Array1OfSurfaceBoundary ret = new StepGeom_Array1OfSurfaceBoundary(OCCwrapJavaJNI.StepGeom_Array1OfSurfaceBoundary_Assign(swigCPtr, this, StepGeom_Array1OfSurfaceBoundary.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepGeom_Array1OfSurfaceBoundary  Move( StepGeom_Array1OfSurfaceBoundary  theOther) {
    StepGeom_Array1OfSurfaceBoundary ret = new StepGeom_Array1OfSurfaceBoundary(OCCwrapJavaJNI.StepGeom_Array1OfSurfaceBoundary_Move(swigCPtr, this, StepGeom_Array1OfSurfaceBoundary.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepGeom_SurfaceBoundary  First() {
    StepGeom_SurfaceBoundary ret = new StepGeom_SurfaceBoundary(OCCwrapJavaJNI.StepGeom_Array1OfSurfaceBoundary_First(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_SurfaceBoundary  ChangeFirst() {
    StepGeom_SurfaceBoundary ret = new StepGeom_SurfaceBoundary(OCCwrapJavaJNI.StepGeom_Array1OfSurfaceBoundary_ChangeFirst(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_SurfaceBoundary  Last() {
    StepGeom_SurfaceBoundary ret = new StepGeom_SurfaceBoundary(OCCwrapJavaJNI.StepGeom_Array1OfSurfaceBoundary_Last(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_SurfaceBoundary  ChangeLast() {
    StepGeom_SurfaceBoundary ret = new StepGeom_SurfaceBoundary(OCCwrapJavaJNI.StepGeom_Array1OfSurfaceBoundary_ChangeLast(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_SurfaceBoundary  Value(int theIndex) {
    StepGeom_SurfaceBoundary ret = new StepGeom_SurfaceBoundary(OCCwrapJavaJNI.StepGeom_Array1OfSurfaceBoundary_Value(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public  StepGeom_SurfaceBoundary  ChangeValue(int theIndex) {
    StepGeom_SurfaceBoundary ret = new StepGeom_SurfaceBoundary(OCCwrapJavaJNI.StepGeom_Array1OfSurfaceBoundary_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public void SetValue(int theIndex,  StepGeom_SurfaceBoundary  theItem) {
    OCCwrapJavaJNI.StepGeom_Array1OfSurfaceBoundary_SetValue(swigCPtr, this, theIndex, StepGeom_SurfaceBoundary.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.StepGeom_Array1OfSurfaceBoundary_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
