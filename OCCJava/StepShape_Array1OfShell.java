package opencascade;

public class StepShape_Array1OfShell {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepShape_Array1OfShell(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepShape_Array1OfShell(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepShape_Array1OfShell obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepShape_Array1OfShell(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepShape_Array1OfShell() {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfShell__SWIG_0(), true);
  }

  public StepShape_Array1OfShell(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfShell__SWIG_1(theLower, theUpper), true);
  }

  public StepShape_Array1OfShell( StepShape_Array1OfShell  theOther) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfShell__SWIG_2(StepShape_Array1OfShell.getCPtr(theOther), theOther), true);
  }

  public StepShape_Array1OfShell( StepShape_Shell  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_Array1OfShell__SWIG_4(StepShape_Shell.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( StepShape_Shell  theValue) {
    OCCwrapJavaJNI.StepShape_Array1OfShell_Init(swigCPtr, this, StepShape_Shell.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepShape_Array1OfShell_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepShape_Array1OfShell_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.StepShape_Array1OfShell_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepShape_Array1OfShell_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepShape_Array1OfShell_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.StepShape_Array1OfShell_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.StepShape_Array1OfShell_IsAllocated(swigCPtr, this);
  }

  public  StepShape_Array1OfShell  Assign( StepShape_Array1OfShell  theOther) {
    StepShape_Array1OfShell ret = new StepShape_Array1OfShell(OCCwrapJavaJNI.StepShape_Array1OfShell_Assign(swigCPtr, this, StepShape_Array1OfShell.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepShape_Array1OfShell  Move( StepShape_Array1OfShell  theOther) {
    StepShape_Array1OfShell ret = new StepShape_Array1OfShell(OCCwrapJavaJNI.StepShape_Array1OfShell_Move(swigCPtr, this, StepShape_Array1OfShell.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepShape_Shell  First() {
    StepShape_Shell ret = new StepShape_Shell(OCCwrapJavaJNI.StepShape_Array1OfShell_First(swigCPtr, this), false, this);
    return ret;
  }

  public  StepShape_Shell  ChangeFirst() {
    StepShape_Shell ret = new StepShape_Shell(OCCwrapJavaJNI.StepShape_Array1OfShell_ChangeFirst(swigCPtr, this), false, this);
    return ret;
  }

  public  StepShape_Shell  Last() {
    StepShape_Shell ret = new StepShape_Shell(OCCwrapJavaJNI.StepShape_Array1OfShell_Last(swigCPtr, this), false, this);
    return ret;
  }

  public  StepShape_Shell  ChangeLast() {
    StepShape_Shell ret = new StepShape_Shell(OCCwrapJavaJNI.StepShape_Array1OfShell_ChangeLast(swigCPtr, this), false, this);
    return ret;
  }

  public  StepShape_Shell  Value(int theIndex) {
    StepShape_Shell ret = new StepShape_Shell(OCCwrapJavaJNI.StepShape_Array1OfShell_Value(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public  StepShape_Shell  ChangeValue(int theIndex) {
    StepShape_Shell ret = new StepShape_Shell(OCCwrapJavaJNI.StepShape_Array1OfShell_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public void SetValue(int theIndex,  StepShape_Shell  theItem) {
    OCCwrapJavaJNI.StepShape_Array1OfShell_SetValue(swigCPtr, this, theIndex, StepShape_Shell.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.StepShape_Array1OfShell_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
