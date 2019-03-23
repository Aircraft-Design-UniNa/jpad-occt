package opencascade;

public class StepGeom_Array1OfCartesianPoint {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepGeom_Array1OfCartesianPoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepGeom_Array1OfCartesianPoint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepGeom_Array1OfCartesianPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepGeom_Array1OfCartesianPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepGeom_Array1OfCartesianPoint() {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfCartesianPoint__SWIG_0(), true);
  }

  public StepGeom_Array1OfCartesianPoint(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfCartesianPoint__SWIG_1(theLower, theUpper), true);
  }

  public StepGeom_Array1OfCartesianPoint( StepGeom_Array1OfCartesianPoint  theOther) {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfCartesianPoint__SWIG_2(StepGeom_Array1OfCartesianPoint.getCPtr(theOther), theOther), true);
  }

  public StepGeom_Array1OfCartesianPoint( StepGeom_CartesianPoint  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepGeom_Array1OfCartesianPoint__SWIG_4( StepGeom_CartesianPoint.getCPtr(theBegin) , theBegin, theLower, theUpper), true);
  }

  public void Init( StepGeom_CartesianPoint  theValue) {
    OCCwrapJavaJNI.StepGeom_Array1OfCartesianPoint_Init(swigCPtr, this,  StepGeom_CartesianPoint.getCPtr(theValue) , theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepGeom_Array1OfCartesianPoint_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepGeom_Array1OfCartesianPoint_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.StepGeom_Array1OfCartesianPoint_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepGeom_Array1OfCartesianPoint_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepGeom_Array1OfCartesianPoint_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.StepGeom_Array1OfCartesianPoint_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.StepGeom_Array1OfCartesianPoint_IsAllocated(swigCPtr, this);
  }

  public  StepGeom_Array1OfCartesianPoint  Assign( StepGeom_Array1OfCartesianPoint  theOther) {
    StepGeom_Array1OfCartesianPoint ret = new StepGeom_Array1OfCartesianPoint(OCCwrapJavaJNI.StepGeom_Array1OfCartesianPoint_Assign(swigCPtr, this, StepGeom_Array1OfCartesianPoint.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepGeom_Array1OfCartesianPoint  Move( StepGeom_Array1OfCartesianPoint  theOther) {
    StepGeom_Array1OfCartesianPoint ret = new StepGeom_Array1OfCartesianPoint(OCCwrapJavaJNI.StepGeom_Array1OfCartesianPoint_Move(swigCPtr, this, StepGeom_Array1OfCartesianPoint.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepGeom_CartesianPoint  First() {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_Array1OfCartesianPoint_First(swigCPtr, this), true );
  }

  public  StepGeom_CartesianPoint  ChangeFirst() {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_Array1OfCartesianPoint_ChangeFirst(swigCPtr, this), true );
  }

  public  StepGeom_CartesianPoint  Last() {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_Array1OfCartesianPoint_Last(swigCPtr, this), true );
  }

  public  StepGeom_CartesianPoint  ChangeLast() {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_Array1OfCartesianPoint_ChangeLast(swigCPtr, this), true );
  }

  public  StepGeom_CartesianPoint  Value(int theIndex) {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_Array1OfCartesianPoint_Value(swigCPtr, this, theIndex), true );
  }

  public  StepGeom_CartesianPoint  ChangeValue(int theIndex) {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_Array1OfCartesianPoint_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepGeom_CartesianPoint  theItem) {
    OCCwrapJavaJNI.StepGeom_Array1OfCartesianPoint_SetValue(swigCPtr, this, theIndex,  StepGeom_CartesianPoint.getCPtr(theItem) , theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.StepGeom_Array1OfCartesianPoint_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
