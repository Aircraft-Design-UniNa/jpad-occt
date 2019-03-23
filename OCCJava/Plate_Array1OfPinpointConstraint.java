package opencascade;

public class Plate_Array1OfPinpointConstraint {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Plate_Array1OfPinpointConstraint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Plate_Array1OfPinpointConstraint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Plate_Array1OfPinpointConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Plate_Array1OfPinpointConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plate_Array1OfPinpointConstraint() {
    this(OCCwrapJavaJNI.new_Plate_Array1OfPinpointConstraint__SWIG_0(), true);
  }

  public Plate_Array1OfPinpointConstraint(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_Plate_Array1OfPinpointConstraint__SWIG_1(theLower, theUpper), true);
  }

  public Plate_Array1OfPinpointConstraint( Plate_Array1OfPinpointConstraint  theOther) {
    this(OCCwrapJavaJNI.new_Plate_Array1OfPinpointConstraint__SWIG_2(Plate_Array1OfPinpointConstraint.getCPtr(theOther), theOther), true);
  }

  public Plate_Array1OfPinpointConstraint( Plate_PinpointConstraint  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_Plate_Array1OfPinpointConstraint__SWIG_4(Plate_PinpointConstraint.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( Plate_PinpointConstraint  theValue) {
    OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_Init(swigCPtr, this, Plate_PinpointConstraint.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_IsAllocated(swigCPtr, this);
  }

  public  Plate_Array1OfPinpointConstraint  Assign( Plate_Array1OfPinpointConstraint  theOther) {
    Plate_Array1OfPinpointConstraint ret = new Plate_Array1OfPinpointConstraint(OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_Assign(swigCPtr, this, Plate_Array1OfPinpointConstraint.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  Plate_Array1OfPinpointConstraint  Move( Plate_Array1OfPinpointConstraint  theOther) {
    Plate_Array1OfPinpointConstraint ret = new Plate_Array1OfPinpointConstraint(OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_Move(swigCPtr, this, Plate_Array1OfPinpointConstraint.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  Plate_PinpointConstraint  First() {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_First(swigCPtr, this), true);
    return ret;
  }

  public Plate_PinpointConstraint ChangeFirst() {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new Plate_PinpointConstraint.CRef (ret);
  }

  public  Plate_PinpointConstraint  Last() {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_Last(swigCPtr, this), true);
    return ret;
  }

  public Plate_PinpointConstraint ChangeLast() {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_ChangeLast(swigCPtr, this), false, this);
    return ret; //new Plate_PinpointConstraint.CRef (ret);
  }

  public  Plate_PinpointConstraint  Value(int theIndex) {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public Plate_PinpointConstraint ChangeValue(int theIndex) {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new Plate_PinpointConstraint.CRef (ret);
  }

  public void SetValue(int theIndex,  Plate_PinpointConstraint  theItem) {
    OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_SetValue(swigCPtr, this, theIndex, Plate_PinpointConstraint.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.Plate_Array1OfPinpointConstraint_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
