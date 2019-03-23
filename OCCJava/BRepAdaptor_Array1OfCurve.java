package opencascade;

public class BRepAdaptor_Array1OfCurve {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepAdaptor_Array1OfCurve(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepAdaptor_Array1OfCurve(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepAdaptor_Array1OfCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepAdaptor_Array1OfCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BRepAdaptor_Array1OfCurve() {
    this(OCCwrapJavaJNI.new_BRepAdaptor_Array1OfCurve__SWIG_0(), true);
  }

  public BRepAdaptor_Array1OfCurve(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_Array1OfCurve__SWIG_1(theLower, theUpper), true);
  }

  public BRepAdaptor_Array1OfCurve( BRepAdaptor_Array1OfCurve  theOther) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_Array1OfCurve__SWIG_2(BRepAdaptor_Array1OfCurve.getCPtr(theOther), theOther), true);
  }

  public BRepAdaptor_Array1OfCurve( BRepAdaptor_Curve  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_Array1OfCurve__SWIG_4(BRepAdaptor_Curve.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( BRepAdaptor_Curve  theValue) {
    OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_Init(swigCPtr, this, BRepAdaptor_Curve.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_IsAllocated(swigCPtr, this);
  }

  public  BRepAdaptor_Array1OfCurve  Assign( BRepAdaptor_Array1OfCurve  theOther) {
    BRepAdaptor_Array1OfCurve ret = new BRepAdaptor_Array1OfCurve(OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_Assign(swigCPtr, this, BRepAdaptor_Array1OfCurve.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  BRepAdaptor_Array1OfCurve  Move( BRepAdaptor_Array1OfCurve  theOther) {
    BRepAdaptor_Array1OfCurve ret = new BRepAdaptor_Array1OfCurve(OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_Move(swigCPtr, this, BRepAdaptor_Array1OfCurve.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  BRepAdaptor_Curve  First() {
    BRepAdaptor_Curve ret = new BRepAdaptor_Curve(OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_First(swigCPtr, this), false, this);
    return ret;
  }

  public  BRepAdaptor_Curve  ChangeFirst() {
    BRepAdaptor_Curve ret = new BRepAdaptor_Curve(OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_ChangeFirst(swigCPtr, this), false, this);
    return ret;
  }

  public  BRepAdaptor_Curve  Last() {
    BRepAdaptor_Curve ret = new BRepAdaptor_Curve(OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_Last(swigCPtr, this), false, this);
    return ret;
  }

  public  BRepAdaptor_Curve  ChangeLast() {
    BRepAdaptor_Curve ret = new BRepAdaptor_Curve(OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_ChangeLast(swigCPtr, this), false, this);
    return ret;
  }

  public  BRepAdaptor_Curve  Value(int theIndex) {
    BRepAdaptor_Curve ret = new BRepAdaptor_Curve(OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_Value(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public  BRepAdaptor_Curve  ChangeValue(int theIndex) {
    BRepAdaptor_Curve ret = new BRepAdaptor_Curve(OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public void SetValue(int theIndex,  BRepAdaptor_Curve  theItem) {
    OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_SetValue(swigCPtr, this, theIndex, BRepAdaptor_Curve.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.BRepAdaptor_Array1OfCurve_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
