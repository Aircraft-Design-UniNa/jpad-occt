package opencascade;

public class StepGeom_Array1OfPcurveOrSurface {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepGeom_Array1OfPcurveOrSurface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepGeom_Array1OfPcurveOrSurface(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepGeom_Array1OfPcurveOrSurface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepGeom_Array1OfPcurveOrSurface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepGeom_Array1OfPcurveOrSurface() {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfPcurveOrSurface__SWIG_0(), true);
  }

  public StepGeom_Array1OfPcurveOrSurface(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfPcurveOrSurface__SWIG_1(theLower, theUpper), true);
  }

  public StepGeom_Array1OfPcurveOrSurface( StepGeom_Array1OfPcurveOrSurface  theOther) {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfPcurveOrSurface__SWIG_2(StepGeom_Array1OfPcurveOrSurface.getCPtr(theOther), theOther), true);
  }

  public StepGeom_Array1OfPcurveOrSurface( StepGeom_PcurveOrSurface  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfPcurveOrSurface__SWIG_4(StepGeom_PcurveOrSurface.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( StepGeom_PcurveOrSurface  theValue) {
    OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_Init(swigCPtr, this, StepGeom_PcurveOrSurface.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_IsAllocated(swigCPtr, this);
  }

  public  StepGeom_Array1OfPcurveOrSurface  Assign( StepGeom_Array1OfPcurveOrSurface  theOther) {
    StepGeom_Array1OfPcurveOrSurface ret = new StepGeom_Array1OfPcurveOrSurface(OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_Assign(swigCPtr, this, StepGeom_Array1OfPcurveOrSurface.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepGeom_Array1OfPcurveOrSurface  Move( StepGeom_Array1OfPcurveOrSurface  theOther) {
    StepGeom_Array1OfPcurveOrSurface ret = new StepGeom_Array1OfPcurveOrSurface(OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_Move(swigCPtr, this, StepGeom_Array1OfPcurveOrSurface.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepGeom_PcurveOrSurface  First() {
    StepGeom_PcurveOrSurface ret = new StepGeom_PcurveOrSurface(OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_First(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_PcurveOrSurface  ChangeFirst() {
    StepGeom_PcurveOrSurface ret = new StepGeom_PcurveOrSurface(OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_ChangeFirst(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_PcurveOrSurface  Last() {
    StepGeom_PcurveOrSurface ret = new StepGeom_PcurveOrSurface(OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_Last(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_PcurveOrSurface  ChangeLast() {
    StepGeom_PcurveOrSurface ret = new StepGeom_PcurveOrSurface(OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_ChangeLast(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_PcurveOrSurface  Value(int theIndex) {
    StepGeom_PcurveOrSurface ret = new StepGeom_PcurveOrSurface(OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_Value(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public  StepGeom_PcurveOrSurface  ChangeValue(int theIndex) {
    StepGeom_PcurveOrSurface ret = new StepGeom_PcurveOrSurface(OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public void SetValue(int theIndex,  StepGeom_PcurveOrSurface  theItem) {
    OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_SetValue(swigCPtr, this, theIndex, StepGeom_PcurveOrSurface.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.StepGeom_Array1OfPcurveOrSurface_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
