package opencascade;

public class StepShape_Array1OfOrientedClosedShell {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepShape_Array1OfOrientedClosedShell(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepShape_Array1OfOrientedClosedShell(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepShape_Array1OfOrientedClosedShell obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepShape_Array1OfOrientedClosedShell(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepShape_Array1OfOrientedClosedShell() {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfOrientedClosedShell__SWIG_0(), true);
  }

  public StepShape_Array1OfOrientedClosedShell(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfOrientedClosedShell__SWIG_1(theLower, theUpper), true);
  }

  public StepShape_Array1OfOrientedClosedShell( StepShape_Array1OfOrientedClosedShell  theOther) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfOrientedClosedShell__SWIG_2(StepShape_Array1OfOrientedClosedShell.getCPtr(theOther), theOther), true);
  }

  public StepShape_Array1OfOrientedClosedShell( StepShape_OrientedClosedShell  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfOrientedClosedShell__SWIG_4( StepShape_OrientedClosedShell.getCPtr(theBegin) , theBegin, theLower, theUpper), true);
  }

  public void Init( StepShape_OrientedClosedShell  theValue) {
    OCCwrapJavaJNI.StepShape_Array1OfOrientedClosedShell_Init(swigCPtr, this,  StepShape_OrientedClosedShell.getCPtr(theValue) , theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepShape_Array1OfOrientedClosedShell_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepShape_Array1OfOrientedClosedShell_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.StepShape_Array1OfOrientedClosedShell_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepShape_Array1OfOrientedClosedShell_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepShape_Array1OfOrientedClosedShell_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.StepShape_Array1OfOrientedClosedShell_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.StepShape_Array1OfOrientedClosedShell_IsAllocated(swigCPtr, this);
  }

  public  StepShape_Array1OfOrientedClosedShell  Assign( StepShape_Array1OfOrientedClosedShell  theOther) {
    StepShape_Array1OfOrientedClosedShell ret = new StepShape_Array1OfOrientedClosedShell(OCCwrapJavaJNI.StepShape_Array1OfOrientedClosedShell_Assign(swigCPtr, this, StepShape_Array1OfOrientedClosedShell.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepShape_Array1OfOrientedClosedShell  Move( StepShape_Array1OfOrientedClosedShell  theOther) {
    StepShape_Array1OfOrientedClosedShell ret = new StepShape_Array1OfOrientedClosedShell(OCCwrapJavaJNI.StepShape_Array1OfOrientedClosedShell_Move(swigCPtr, this, StepShape_Array1OfOrientedClosedShell.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepShape_OrientedClosedShell  First() {
    return new StepShape_OrientedClosedShell ( OCCwrapJavaJNI.StepShape_Array1OfOrientedClosedShell_First(swigCPtr, this), true );
  }

  public  StepShape_OrientedClosedShell  ChangeFirst() {
    return new StepShape_OrientedClosedShell ( OCCwrapJavaJNI.StepShape_Array1OfOrientedClosedShell_ChangeFirst(swigCPtr, this), true );
  }

  public  StepShape_OrientedClosedShell  Last() {
    return new StepShape_OrientedClosedShell ( OCCwrapJavaJNI.StepShape_Array1OfOrientedClosedShell_Last(swigCPtr, this), true );
  }

  public  StepShape_OrientedClosedShell  ChangeLast() {
    return new StepShape_OrientedClosedShell ( OCCwrapJavaJNI.StepShape_Array1OfOrientedClosedShell_ChangeLast(swigCPtr, this), true );
  }

  public  StepShape_OrientedClosedShell  Value(int theIndex) {
    return new StepShape_OrientedClosedShell ( OCCwrapJavaJNI.StepShape_Array1OfOrientedClosedShell_Value(swigCPtr, this, theIndex), true );
  }

  public  StepShape_OrientedClosedShell  ChangeValue(int theIndex) {
    return new StepShape_OrientedClosedShell ( OCCwrapJavaJNI.StepShape_Array1OfOrientedClosedShell_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepShape_OrientedClosedShell  theItem) {
    OCCwrapJavaJNI.StepShape_Array1OfOrientedClosedShell_SetValue(swigCPtr, this, theIndex,  StepShape_OrientedClosedShell.getCPtr(theItem) , theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.StepShape_Array1OfOrientedClosedShell_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
